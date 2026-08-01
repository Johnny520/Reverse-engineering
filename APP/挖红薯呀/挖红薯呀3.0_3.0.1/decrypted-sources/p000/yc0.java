package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yc0 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7609d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f7610e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ yc0(int i, ArrayList arrayList) {
        this.f7609d = i;
        this.f7610e = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f7609d;
        ArrayList arrayList = this.f7610e;
        switch (i) {
            case 0:
                return zc0.m5534d0(arrayList, (x80) obj);
            default:
                wq0 wq0Var = (wq0) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ae0 ae0Var = (ae0) arrayList.get(i2);
                    List list = ae0Var.f134b;
                    boolean z = ae0Var.f139g;
                    if (ae0Var.f143k == Integer.MIN_VALUE) {
                        z10.m5361a("position() should be called first");
                    }
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        xq0 xq0Var = (xq0) list.get(i3);
                        int[] iArr = ae0Var.f141i;
                        int i4 = i3 * 2;
                        long jM4835c = w20.m4835c((((long) iArr[i4]) << 32) | (((long) iArr[i4 + 1]) & 4294967295L), ae0Var.f135c);
                        if (z) {
                            int i5 = yq0.f7688b;
                            C0601p3 c0601p3 = C0601p3.f4706D;
                            wq0Var.getClass();
                            wq0.m5014a(wq0Var, xq0Var);
                            xq0Var.mo47X(w20.m4835c(jM4835c, xq0Var.f7404h), 0.0f, c0601p3);
                        } else {
                            wq0.m5019n(wq0Var, xq0Var, jM4835c);
                        }
                    }
                }
                return na1.f4229a;
        }
    }
}
