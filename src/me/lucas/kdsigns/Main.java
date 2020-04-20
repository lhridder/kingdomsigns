package me.lucas.kdsigns;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
  implements Listener
{
  @EventHandler
  public void onEnable()
  {
    Bukkit.getServer().getPluginManager().registerEvents(this, this);
  }

  @EventHandler
  public void onSignChange(SignChangeEvent e) {
    if (e.getPlayer().hasPermission("KDsigns.place")) {
      if ((e.getLine(0).equalsIgnoreCase("[Kingdom]")) && 
        (e.getLine(1).equalsIgnoreCase("[Join]")) && 
        (e.getLine(2).equalsIgnoreCase("Thardod"))) {
        e.setLine(0, "§4§l[Kingdom]");
        e.setLine(1, "§1§l[Join]");
        e.setLine(2, "§6§lThardod");
        e.getPlayer().sendMessage(ChatColor.GREEN + "Sign aangemaakt!");
      }

      if ((e.getLine(0).equalsIgnoreCase("[Kingdom]")) && 
        (e.getLine(1).equalsIgnoreCase("[Join]")) && 
        (e.getLine(2).equalsIgnoreCase("Amperos"))) {
        e.setLine(0, "§4§l[Kingdom]");
        e.setLine(1, "§1§l[Join]");
        e.setLine(2, "§6§lAmperos");
        e.getPlayer().sendMessage(ChatColor.GREEN + "Sign aangemaakt!");
      }

      if ((e.getLine(0).equalsIgnoreCase("[Kingdom]")) && 
        (e.getLine(1).equalsIgnoreCase("[Join]")) && 
        (e.getLine(2).equalsIgnoreCase("Edelwyr"))) {
        e.setLine(0, "§4§l[Kingdom]");
        e.setLine(1, "§1§l[Join]");
        e.setLine(2, "§6§lEdelwyr");
        e.getPlayer().sendMessage(ChatColor.GREEN + "Sign aangemaakt!");
      }

      if ((e.getLine(0).equalsIgnoreCase("[Kingdom]")) && 
        (e.getLine(1).equalsIgnoreCase("[Join]")) && 
        (e.getLine(2).equalsIgnoreCase("Oberia"))) {
        e.setLine(0, "§4§l[Kingdom]");
        e.setLine(1, "§1§l[Join]");
        e.setLine(2, "§6§lOberia");
        e.getPlayer().sendMessage(ChatColor.GREEN + "Sign aangemaakt!");
      }

      if ((e.getLine(0).equalsIgnoreCase("[Kingdom]")) && 
        (e.getLine(1).equalsIgnoreCase("[Join]")) && 
        (e.getLine(2).equalsIgnoreCase("Elivia"))) {
        e.setLine(0, "§4§l[Kingdom]");
        e.setLine(1, "§1§l[Join]");
        e.setLine(2, "§6§lElivia");
        e.getPlayer().sendMessage(ChatColor.GREEN + "Sign aangemaakt!");
      }

      if ((e.getLine(0).equalsIgnoreCase("[Kingdom]")) && 
        (e.getLine(1).equalsIgnoreCase("[Join]")) && 
        (e.getLine(2).equalsIgnoreCase("Yemen"))) {
        e.setLine(0, "§4§l[Kingdom]");
        e.setLine(1, "§1§l[Join]");
        e.setLine(2, "§6§lYemen");
        e.getPlayer().sendMessage(ChatColor.GREEN + "Sign aangemaakt!");
      }

      if ((e.getLine(0).equalsIgnoreCase("[Kingdom]")) && 
        (e.getLine(1).equalsIgnoreCase("[Join]")) && 
        (e.getLine(2).equalsIgnoreCase("Asirenia"))) {
        e.setLine(0, "§4§l[Kingdom]");
        e.setLine(1, "§1§l[Join]");
        e.setLine(2, "§6§lAsirenia");
        e.getPlayer().sendMessage(ChatColor.GREEN + "Sign aangemaakt!");
      }

      if ((e.getLine(0).equalsIgnoreCase("[Kingdom]")) && 
        (e.getLine(1).equalsIgnoreCase("[Leave]"))) {
        e.setLine(0, "§4§l[Kingdom]");
        e.setLine(1, "§1§l[Leave]");
        e.getPlayer().sendMessage(ChatColor.GREEN + "Sign aangemaakt!");
      }
    }
    else {
      e.getPlayer().sendMessage(ChatColor.DARK_RED + "Je mag dit niet doen!");
    }
  }

  @EventHandler
  public void onPlayerInteract(PlayerInteractEvent e) {
    if (e.getAction() != Action.RIGHT_CLICK_BLOCK) return;
    if ((e.getClickedBlock().getState() instanceof Sign)) {
      Sign s = (Sign)e.getClickedBlock().getState();
      if (s.getLine(2).equalsIgnoreCase("§6§lThardod")) {
        e.getPlayer().sendMessage(ChatColor.GOLD + "Je bent Thardod gejoind!");
        e.getPlayer().performCommand("k join Thardod");
      }
      if (s.getLine(2).equalsIgnoreCase("§6§lAmperos")) {
        e.getPlayer().sendMessage(ChatColor.GOLD + "Je bent Amperos gejoind!");
        e.getPlayer().performCommand("k join Amperos");
      }
      if (s.getLine(2).equalsIgnoreCase("§6§lEdelwyr")) {
        e.getPlayer().sendMessage(ChatColor.GOLD + "Je bent Edelwyr gejoind!");
        e.getPlayer().performCommand("k join Edelwyr");
      }
      if (s.getLine(2).equalsIgnoreCase("§6§lOberia")) {
        e.getPlayer().sendMessage(ChatColor.GOLD + "Je bent Oberia gejoind!");
        e.getPlayer().performCommand("k join Oberia");
      }
      if (s.getLine(2).equalsIgnoreCase("§6§lElivia")) {
        e.getPlayer().sendMessage(ChatColor.GOLD + "Je bent Elivia gejoind!");
        e.getPlayer().performCommand("k join Elivia");
      }
      if (s.getLine(2).equalsIgnoreCase("§6§lYemen")) {
        e.getPlayer().sendMessage(ChatColor.GOLD + "Je bent Yemen gejoind!");
        e.getPlayer().performCommand("k join Yemen");
      }
      if (s.getLine(2).equalsIgnoreCase("§6§lAsirenia")) {
        e.getPlayer().sendMessage(ChatColor.GOLD + "Je bent Asirenia gejoind!");
        e.getPlayer().performCommand("k join Asirenia");
      }
      if (s.getLine(1).equalsIgnoreCase("§1§l[Leave]")) {
        e.getPlayer().sendMessage(ChatColor.GOLD + "Je bent je huidige kingdom geleaved!");
        e.getPlayer().performCommand("k leave");
      }
    }
  }
}