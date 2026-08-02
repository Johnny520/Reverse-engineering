package p000;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yz0 implements j40 {

    /* JADX INFO: renamed from: a */
    public final td1 f13681a;

    public yz0(td1 td1Var) {
        this.f13681a = td1Var;
    }

    @Override // p000.j40
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        return InputStream.class;
    }

    @Override // p000.j40
    /* JADX INFO: renamed from: b */
    public final k40 mo2223b(Object obj) {
        return new C0485n4((InputStream) obj, this.f13681a);
    }
}
