package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: St */
/* JADX INFO: loaded from: classes.dex */
public class C0809St implements InterfaceC0126Cx, InterfaceC0050B6 {

    /* JADX INFO: renamed from: a */
    public final String f2553a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2677wj f2554b;

    /* JADX INFO: renamed from: c */
    public final int f2555c;

    /* JADX INFO: renamed from: d */
    public int f2556d = -1;

    /* JADX INFO: renamed from: e */
    public final String[] f2557e;

    /* JADX INFO: renamed from: f */
    public final List[] f2558f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f2559g;

    /* JADX INFO: renamed from: h */
    public Object f2560h;

    /* JADX INFO: renamed from: i */
    public final Object f2561i;

    /* JADX INFO: renamed from: j */
    public final Object f2562j;

    /* JADX INFO: renamed from: k */
    public final Object f2563k;

    public C0809St(String str, InterfaceC2677wj interfaceC2677wj, int i) {
        this.f2553a = str;
        this.f2554b = interfaceC2677wj;
        this.f2555c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.f2557e = strArr;
        int i3 = this.f2555c;
        this.f2558f = new List[i3];
        this.f2559g = new boolean[i3];
        this.f2560h = C0495Lf.f1620a;
        final int i4 = 0;
        this.f2561i = AbstractC0148Dc.m280n(2, new InterfaceC0884Ui(this) { // from class: Rt

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0809St f2437b;

            {
                this.f2437b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [Dn, java.lang.Object] */
            @Override // p000.InterfaceC0884Ui
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                InterfaceC0717Qm[] interfaceC0717QmArrChildSerializers;
                ArrayList arrayList;
                InterfaceC0717Qm[] interfaceC0717QmArrTypeParametersSerializers;
                switch (i4) {
                    case 0:
                        InterfaceC2677wj interfaceC2677wj2 = this.f2437b.f2554b;
                        return (interfaceC2677wj2 == null || (interfaceC0717QmArrChildSerializers = interfaceC2677wj2.childSerializers()) == null) ? AbstractC0295Gu.f1004i : interfaceC0717QmArrChildSerializers;
                    case 1:
                        InterfaceC2677wj interfaceC2677wj3 = this.f2437b.f2554b;
                        if (interfaceC2677wj3 == null || (interfaceC0717QmArrTypeParametersSerializers = interfaceC2677wj3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC0717QmArrTypeParametersSerializers.length);
                            for (InterfaceC0717Qm interfaceC0717Qm : interfaceC0717QmArrTypeParametersSerializers) {
                                arrayList.add(interfaceC0717Qm.getDescriptor());
                            }
                        }
                        return AbstractC1293cr.m2551l(arrayList);
                    default:
                        C0809St c0809St = this.f2437b;
                        return Integer.valueOf(AbstractC0585Nj.m1126E(c0809St, (InterfaceC0126Cx[]) c0809St.f2562j.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.f2562j = AbstractC0148Dc.m280n(2, new InterfaceC0884Ui(this) { // from class: Rt

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0809St f2437b;

            {
                this.f2437b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [Dn, java.lang.Object] */
            @Override // p000.InterfaceC0884Ui
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                InterfaceC0717Qm[] interfaceC0717QmArrChildSerializers;
                ArrayList arrayList;
                InterfaceC0717Qm[] interfaceC0717QmArrTypeParametersSerializers;
                switch (i5) {
                    case 0:
                        InterfaceC2677wj interfaceC2677wj2 = this.f2437b.f2554b;
                        return (interfaceC2677wj2 == null || (interfaceC0717QmArrChildSerializers = interfaceC2677wj2.childSerializers()) == null) ? AbstractC0295Gu.f1004i : interfaceC0717QmArrChildSerializers;
                    case 1:
                        InterfaceC2677wj interfaceC2677wj3 = this.f2437b.f2554b;
                        if (interfaceC2677wj3 == null || (interfaceC0717QmArrTypeParametersSerializers = interfaceC2677wj3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC0717QmArrTypeParametersSerializers.length);
                            for (InterfaceC0717Qm interfaceC0717Qm : interfaceC0717QmArrTypeParametersSerializers) {
                                arrayList.add(interfaceC0717Qm.getDescriptor());
                            }
                        }
                        return AbstractC1293cr.m2551l(arrayList);
                    default:
                        C0809St c0809St = this.f2437b;
                        return Integer.valueOf(AbstractC0585Nj.m1126E(c0809St, (InterfaceC0126Cx[]) c0809St.f2562j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.f2563k = AbstractC0148Dc.m280n(2, new InterfaceC0884Ui(this) { // from class: Rt

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0809St f2437b;

            {
                this.f2437b = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [Dn, java.lang.Object] */
            @Override // p000.InterfaceC0884Ui
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                InterfaceC0717Qm[] interfaceC0717QmArrChildSerializers;
                ArrayList arrayList;
                InterfaceC0717Qm[] interfaceC0717QmArrTypeParametersSerializers;
                switch (i6) {
                    case 0:
                        InterfaceC2677wj interfaceC2677wj2 = this.f2437b.f2554b;
                        return (interfaceC2677wj2 == null || (interfaceC0717QmArrChildSerializers = interfaceC2677wj2.childSerializers()) == null) ? AbstractC0295Gu.f1004i : interfaceC0717QmArrChildSerializers;
                    case 1:
                        InterfaceC2677wj interfaceC2677wj3 = this.f2437b.f2554b;
                        if (interfaceC2677wj3 == null || (interfaceC0717QmArrTypeParametersSerializers = interfaceC2677wj3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC0717QmArrTypeParametersSerializers.length);
                            for (InterfaceC0717Qm interfaceC0717Qm : interfaceC0717QmArrTypeParametersSerializers) {
                                arrayList.add(interfaceC0717Qm.getDescriptor());
                            }
                        }
                        return AbstractC1293cr.m2551l(arrayList);
                    default:
                        C0809St c0809St = this.f2437b;
                        return Integer.valueOf(AbstractC0585Nj.m1126E(c0809St, (InterfaceC0126Cx[]) c0809St.f2562j.getValue()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: a */
    public final int mo202a(String str) {
        Integer num = (Integer) this.f2560h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: b */
    public final String mo203b() {
        return this.f2553a;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: c */
    public final AbstractC1406fG mo204c() {
        return C0128Cz.f298g;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: d */
    public final int mo205d() {
        return this.f2555c;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: e */
    public final String mo206e(int i) {
        return this.f2557e[i];
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [Dn, java.lang.Object] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0809St) {
            InterfaceC0126Cx interfaceC0126Cx = (InterfaceC0126Cx) obj;
            if (this.f2553a.equals(interfaceC0126Cx.mo203b()) && Arrays.equals((InterfaceC0126Cx[]) this.f2562j.getValue(), (InterfaceC0126Cx[]) ((C0809St) obj).f2562j.getValue())) {
                int iMo205d = interfaceC0126Cx.mo205d();
                int i = this.f2555c;
                if (i == iMo205d) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (AbstractC0585Nj.m1134a(mo210j(i2).mo203b(), interfaceC0126Cx.mo210j(i2).mo203b()) && AbstractC0585Nj.m1134a(mo210j(i2).mo204c(), interfaceC0126Cx.mo210j(i2).mo204c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: f */
    public boolean mo207f() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // p000.InterfaceC0050B6
    /* JADX INFO: renamed from: g */
    public final Set mo89g() {
        return this.f2560h.keySet();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: h */
    public final boolean mo208h() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Dn, java.lang.Object] */
    public int hashCode() {
        return ((Number) this.f2563k.getValue()).intValue();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: i */
    public final List mo209i(int i) {
        List list = this.f2558f[i];
        return list == null ? C0452Kf.f1484a : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Dn, java.lang.Object] */
    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: j */
    public final InterfaceC0126Cx mo210j(int i) {
        return ((InterfaceC0717Qm[]) this.f2561i.getValue())[i].getDescriptor();
    }

    @Override // p000.InterfaceC0126Cx
    /* JADX INFO: renamed from: k */
    public final boolean mo211k(int i) {
        return this.f2559g[i];
    }

    /* JADX INFO: renamed from: l */
    public final void m1614l(String str) {
        int i = this.f2556d + 1;
        this.f2556d = i;
        String[] strArr = this.f2557e;
        strArr[i] = str;
        this.f2559g[i] = true;
        this.f2558f[i] = null;
        if (i == this.f2555c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f2560h = map;
        }
    }

    public final String toString() {
        return AbstractC2453ra.m4901k0(AbstractC0828TB.m1632J(0, this.f2555c), ", ", this.f2553a.concat("("), ")", new C2479s(4, this), 24);
    }
}
