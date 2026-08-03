package io.github.cherrywechat.lua.loader;

import p000.AbstractC0295Gu;
import p000.C2322og;
import p000.InterfaceC2279ng;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptState {
    private static final /* synthetic */ InterfaceC2279ng $ENTRIES;
    private static final /* synthetic */ ScriptState[] $VALUES;
    public static final ScriptState LOADED = new ScriptState(AbstractC0295Gu.m625r(-352183023302709L), 0);
    public static final ScriptState RUNNING = new ScriptState(AbstractC0295Gu.m625r(-352213088073781L), 1);
    public static final ScriptState COMPLETED = new ScriptState(AbstractC0295Gu.m625r(-352247447812149L), 2);
    public static final ScriptState ERROR = new ScriptState(AbstractC0295Gu.m625r(-352290397485109L), 3);
    public static final ScriptState UNLOADED = new ScriptState(AbstractC0295Gu.m625r(-352316167288885L), 4);

    private static final /* synthetic */ ScriptState[] $values() {
        return new ScriptState[]{LOADED, RUNNING, COMPLETED, ERROR, UNLOADED};
    }

    static {
        ScriptState[] scriptStateArr$values = $values();
        $VALUES = scriptStateArr$values;
        $ENTRIES = new C2322og(scriptStateArr$values);
    }

    private ScriptState(String str, int i) {
    }

    public static InterfaceC2279ng getEntries() {
        return $ENTRIES;
    }

    public static ScriptState valueOf(String str) {
        return (ScriptState) Enum.valueOf(ScriptState.class, str);
    }

    public static ScriptState[] values() {
        return (ScriptState[]) $VALUES.clone();
    }
}
