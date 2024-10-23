package com.etarruella.config;

public enum MapConfig {
    GAME_DURATION("game-duration", Integer.class),
    FRIENDLY_FIRE("friendly-fire", Boolean.class),
    XP_PER_KILL("xp-per-kill", Integer.class),
    SPAWN_TIMEOUT("spawn-timeout", Integer.class),
    MAX_POINTS("max-points", Integer.class),
    MAX_BUILD_ENABLED("max-build.enabled", Boolean.class),
    MAX_BUILD_HEIGHT("max-build.height", Integer.class),
    DEATHMATCH_TYPE("deathmatch-type", String.class); // TODO: change to DeathmatchType enum


    private final String key;
    private final Class<?> type;

    MapConfig(String key, Class<?> type) {
        this.key = key;
        this.type = type;
    }

    public Class<?> getType() {
        return type;
    }

    @Override
    public String toString() {
        return key;
    }
}