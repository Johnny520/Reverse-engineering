package com.p001mr.elaris.xposedcompat;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class XC_MethodReplacement extends XC_MethodHook {
    public static final XC_MethodReplacement DO_NOTHING = new XC_MethodReplacement() { // from class: com.mr.elaris.xposedcompat.XC_MethodReplacement.1
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // com.p001mr.elaris.xposedcompat.XC_MethodReplacement
        public Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            return null;
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public XC_MethodReplacement() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static XC_MethodReplacement returnConstant(Object obj) {
        return returnConstant(50, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        methodHookParam.setResult(replaceHookedMethod(methodHookParam));
    }

    public abstract Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam);

    public XC_MethodReplacement(int i) {
        super(i);
    }

    public static XC_MethodReplacement returnConstant(int i, final Object obj) {
        return new XC_MethodReplacement(i) { // from class: com.mr.elaris.xposedcompat.XC_MethodReplacement.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // com.p001mr.elaris.xposedcompat.XC_MethodReplacement
            public Object replaceHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
                return obj;
            }
        };
    }

    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
    }
}
