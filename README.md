# Rules

![GUI](https://proxy.spigotmc.org/56b7029e7c8c9c6a3444b12439c4636c98c744f0?url=https%3A%2F%2Fi.imgur.com%2FLGRJ9N5.png)

**Before playing on server you must agree with rules.**

- Menu opens for each player which joined the server

- Player cannot close menu

- Player cannot interact with world, use commands, etc. until he argee.

## Pastebin

This is useful if you have multiple servers. There is no need to change the rules on all servers, just change them on pastebin and they will updated in the plugin.

## Authme support

If you use Authme, menu will be opened after login/register.

## Preview

![Preview](https://proxy.spigotmc.org/96bb3f2b2c7f7f45020a1f5810c75992202620e9?url=https%3A%2F%2Fi.imgur.com%2FPsDY9nq.gif)

## Commands and permissions

`/rules` - Open rules menu (just rules, without buttons)  
Permission: `rules.rules`  
`/rules <player>` - Open menu for player  
Permission: `rules.rules.others`  
`/rules -reload` - reload plugin with loading texts from pastebin  
`/rules -rl` - just reload plugin  
`/rules -clear` - clear list of players, that argee with rules  
Permission: `rules.options`

## Configuration

See [here](https://github.com/R-Josef/Rules/blob/master/resources/config.yml).

## API

`RulesAPI.isConfirmed(String player)` - check if player has accepted rules  
`RulesConfirmedEvent` - called when player accept rules


