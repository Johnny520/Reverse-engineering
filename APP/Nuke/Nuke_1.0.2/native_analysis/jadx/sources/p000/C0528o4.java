package p000;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: o4 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0528o4 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f7464h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f7465i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f7466j;

    public /* synthetic */ C0528o4(int i, Collection collection) {
        this.f7464h = 2;
        this.f7466j = i;
        this.f7465i = collection;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f7464h;
        a83 a83Var = a83.f116a;
        Object obj2 = this.f7465i;
        int i2 = this.f7466j;
        switch (i) {
            case 0:
                rz1.m4639g((rz1) obj, (sz1) obj2, 0, -i2);
                return a83Var;
            case 1:
                rz1.m4639g((rz1) obj, (sz1) obj2, -i2, 0);
                return a83Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ C0528o4(sz1 sz1Var, int i, int i2) {
        this.f7464h = i2;
        this.f7465i = sz1Var;
        this.f7466j = i;
    }
}
