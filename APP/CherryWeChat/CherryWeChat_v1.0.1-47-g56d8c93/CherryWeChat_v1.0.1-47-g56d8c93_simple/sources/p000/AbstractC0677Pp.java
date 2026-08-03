package p000;

import io.github.cherrywechat.lua.loader.ScriptState;

/* JADX INFO: renamed from: Pp */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0677Pp {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f2153a = null;

    static {
        int[] r0 = new int[ScriptState.values().length];
        r0[ScriptState.LOADED.ordinal()] = 1;     // Catch: NoSuchFieldError -> L10
    L15:
        r0[ScriptState.RUNNING.ordinal()] = 2;     // Catch: NoSuchFieldError -> L11
    L23:
        r0[ScriptState.COMPLETED.ordinal()] = 3;     // Catch: NoSuchFieldError -> L12
    L17:
        r0[ScriptState.ERROR.ordinal()] = 4;     // Catch: NoSuchFieldError -> L13
    L19:
        r0[ScriptState.UNLOADED.ordinal()] = 5;     // Catch: NoSuchFieldError -> L14
    L8:
        f2153a = r0;
    }
}
