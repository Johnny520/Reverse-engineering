package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: a5 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0006a5 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f56d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f57e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0006a5(int i, ArrayList arrayList) {
        super(1);
        this.f56d = i;
        this.f57e = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f56d;
        na1 na1Var = na1.f4229a;
        ArrayList arrayList = this.f57e;
        switch (i) {
            case 0:
                wq0 wq0Var = (wq0) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    wq0.m5017k(wq0Var, (xq0) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                wq0 wq0Var2 = (wq0) obj;
                int size2 = arrayList.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    wq0.m5015i(wq0Var2, (xq0) arrayList.get(i3), 0, 0);
                }
                break;
            default:
                wq0 wq0Var3 = (wq0) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    wq0.m5018l(wq0Var3, (xq0) arrayList.get(i4), 0, 0);
                }
                break;
        }
        return na1Var;
    }
}
