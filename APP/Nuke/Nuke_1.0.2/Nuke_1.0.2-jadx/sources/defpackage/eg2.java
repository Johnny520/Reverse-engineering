package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eg2 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof eg2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(true) + hk1.d(vi0.d(16777216, vi0.d(2097152, Integer.hashCode(AIChatConfig.DefaultMaxTokens) * 31, 31), 29791), 31, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptEngineOptions(maxFileCount=512, maxFileBytes=2097152, maxTotalScriptBytes=16777216, memoryLimitBytes=null, maxStackSizeBytes=null, callActivateOnStart=true, callDeactivateOnStop=true)";
    }
}
