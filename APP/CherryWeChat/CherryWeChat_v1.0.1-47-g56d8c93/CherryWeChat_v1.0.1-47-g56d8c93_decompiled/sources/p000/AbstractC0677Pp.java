package p000;

import io.github.cherrywechat.lua.loader.ScriptState;

/* JADX INFO: renamed from: Pp */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0677Pp {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f2153a;

    static {
        int[] iArr = new int[ScriptState.values().length];
        try {
            iArr[ScriptState.LOADED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScriptState.RUNNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScriptState.COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScriptState.ERROR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScriptState.UNLOADED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f2153a = iArr;
    }
}
