package p000;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: o9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0363o9 extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f650a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0363o9(int i) {
        super(60);
        this.f650a = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr = methodHookParam.args;
        if (objArr == null) {
            return;
        }
        int i = this.f650a;
        if (i >= 0 && i < objArr.length && (objArr[i] instanceof Boolean)) {
            objArr[i] = Boolean.FALSE;
            return;
        }
        int i2 = 0;
        while (true) {
            Object[] objArr2 = methodHookParam.args;
            if (i2 >= objArr2.length) {
                return;
            }
            if (objArr2[i2] instanceof Boolean) {
                objArr2[i2] = Boolean.FALSE;
            }
            i2++;
        }
    }
}
