package p001;

import de.robv.android.xposed.XC_MethodHook;
import java.util.List;

/* JADX INFO: renamed from: ۟.d5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0182d5 extends AbstractC0335o4 implements InterfaceC0222g3<XC_MethodHook.MethodHookParam, Object> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0210f5 f754;

    public C0182d5(C0210f5 c0210f5) {
        this.f754 = c0210f5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Object mo984(XC_MethodHook.MethodHookParam methodHookParam) {
        XC_MethodHook.MethodHookParam methodHookParam2 = methodHookParam;
        C0237h4.m1090(C0341oa.m915(new byte[]{-105, 109}, new byte[]{-2, 25, 37, -12, -36, -24}), methodHookParam2);
        if (C0210f5.f782) {
            List listM1062 = C0210f5.m1062(this.f754);
            if (listM1062.size() == 2) {
                return listM1062.get(0);
            }
        }
        return C0373r3.m1213(methodHookParam2);
    }
}
