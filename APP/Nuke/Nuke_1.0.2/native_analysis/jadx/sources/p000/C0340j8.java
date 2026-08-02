package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: j8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0340j8 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f4910i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ArrayList f4911j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0340j8(int i, ArrayList arrayList) {
        super(1);
        this.f4910i = i;
        this.f4911j = arrayList;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f4910i;
        a83 a83Var = a83.f116a;
        ArrayList arrayList = this.f4911j;
        switch (i) {
            case 0:
                rz1 rz1Var = (rz1) obj;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    rz1.m4641i(rz1Var, (sz1) arrayList.get(i2), 0, 0);
                }
                break;
            case 1:
                rz1 rz1Var2 = (rz1) obj;
                int size2 = arrayList.size() - 1;
                if (size2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        rz1.m4641i(rz1Var2, (sz1) arrayList.get(i3), 0, 0);
                        if (i3 != size2) {
                            i3++;
                        }
                    }
                }
                break;
            case 2:
                rz1 rz1Var3 = (rz1) obj;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    rz1.m4639g(rz1Var3, (sz1) arrayList.get(i4), 0, 0);
                }
                break;
            default:
                rz1 rz1Var4 = (rz1) obj;
                int size4 = arrayList.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    rz1.m4642j(rz1Var4, (sz1) arrayList.get(i5), 0, 0);
                }
                break;
        }
        return a83Var;
    }
}
