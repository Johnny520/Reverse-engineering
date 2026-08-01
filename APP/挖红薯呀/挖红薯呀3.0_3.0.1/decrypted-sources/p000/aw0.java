package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class aw0 extends y50 {

    /* JADX INFO: renamed from: c */
    public static final aw0 f282c = new aw0("Undefined intrinsics block and it is required", 0);

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f283b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aw0(String str, int i) {
        super(str);
        this.f283b = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.xd0
    /* JADX INFO: renamed from: g */
    public final yd0 mo213g(zd0 zd0Var, List list, long j) {
        switch (this.f283b) {
            case 0:
                int size = list.size();
                C0330is c0330is = C0330is.f2614d;
                if (size == 0) {
                    return zd0Var.mo1279Q(C0617pj.m3139j(j), C0617pj.m3138i(j), c0330is, C0601p3.f4707E);
                }
                if (size == 1) {
                    xq0 xq0VarMo184e = ((sd0) list.get(0)).mo184e(j);
                    return zd0Var.mo1279Q(AbstractC0654qj.m3259f(xq0VarMo184e.f7400d, j), AbstractC0654qj.m3258e(xq0VarMo184e.f7401e, j), c0330is, new C0306i3(xq0VarMo184e, 5));
                }
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i = 0; i < size2; i++) {
                    xq0 xq0VarMo184e2 = ((sd0) list.get(i)).mo184e(j);
                    iMax = Math.max(xq0VarMo184e2.f7400d, iMax);
                    iMax2 = Math.max(xq0VarMo184e2.f7401e, iMax2);
                    arrayList.add(xq0VarMo184e2);
                }
                return zd0Var.mo1279Q(AbstractC0654qj.m3259f(iMax, j), AbstractC0654qj.m3258e(iMax2, j), c0330is, new C0006a5(2, arrayList));
            default:
                throw new IllegalStateException("Undefined measure and it is required");
        }
    }
}
