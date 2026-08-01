package p000;

import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: e */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0190e extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Class f208a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class[] f209b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f210c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190e(Class cls, Class[] clsArr, Object obj) {
        super(80);
        this.f208a = cls;
        this.f209b = clsArr;
        this.f210c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        AbstractC0238h.m465b(this.f208a, this.f209b);
        methodHookParam.setResult(this.f210c);
    }
}
