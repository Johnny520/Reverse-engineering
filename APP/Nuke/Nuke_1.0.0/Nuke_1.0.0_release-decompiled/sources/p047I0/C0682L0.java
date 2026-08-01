package p047I0;

import java.util.ArrayList;
import java.util.List;
import p041H0.InterfaceC0616r0;
import p077P0.C1122i;

/* JADX INFO: renamed from: I0.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0682L0 implements InterfaceC0616r0 {

    /* JADX INFO: renamed from: d */
    public final int f2163d;

    /* JADX INFO: renamed from: e */
    public final List f2164e;

    /* JADX INFO: renamed from: f */
    public Float f2165f = null;

    /* JADX INFO: renamed from: g */
    public Float f2166g = null;

    /* JADX INFO: renamed from: h */
    public C1122i f2167h = null;

    /* JADX INFO: renamed from: i */
    public C1122i f2168i = null;

    public C0682L0(int i5, ArrayList arrayList) {
        this.f2163d = i5;
        this.f2164e = arrayList;
    }

    @Override // p041H0.InterfaceC0616r0
    /* JADX INFO: renamed from: H */
    public final boolean mo800H() {
        return this.f2164e.contains(this);
    }
}
