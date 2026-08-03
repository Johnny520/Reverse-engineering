package io.github.cherrywechat.lua.loader;

import p000.AbstractC0295Gu;
import p000.C2322og;
import p000.InterfaceC2279ng;

/* JADX INFO: loaded from: classes.dex */
public enum ScriptState extends Enum<ScriptState> {
    private static final /* synthetic */ InterfaceC2279ng $ENTRIES = null;
    private static final /* synthetic */ ScriptState[] $VALUES = null;
    public static final ScriptState COMPLETED = null;
    public static final ScriptState ERROR = null;
    public static final ScriptState LOADED = null;
    public static final ScriptState RUNNING = null;
    public static final ScriptState UNLOADED = null;

    private static final /* synthetic */ ScriptState[] $values() {
        return new ScriptState[]{LOADED, RUNNING, COMPLETED, ERROR, UNLOADED};
    }

    static {
        LOADED = new ScriptState(AbstractC0295Gu.m625r(-352183023302709L), 0);
        RUNNING = new ScriptState(AbstractC0295Gu.m625r(-352213088073781L), 1);
        COMPLETED = new ScriptState(AbstractC0295Gu.m625r(-352247447812149L), 2);
        ERROR = new ScriptState(AbstractC0295Gu.m625r(-352290397485109L), 3);
        UNLOADED = new ScriptState(AbstractC0295Gu.m625r(-352316167288885L), 4);
        ScriptState[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = new C2322og(r0);
    }

    ScriptState(String r1, int r2) {
    }

    public static InterfaceC2279ng getEntries() {
        return $ENTRIES;
    }

    public static ScriptState valueOf(String r1) {
        return (ScriptState) Enum.valueOf(ScriptState.class, r1);
    }

    public static ScriptState[] values() {
        return (ScriptState[]) $VALUES.clone();
    }
}
