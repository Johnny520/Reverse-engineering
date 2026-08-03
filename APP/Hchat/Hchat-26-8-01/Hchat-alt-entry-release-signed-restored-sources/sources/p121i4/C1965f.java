package p121i4;

import p136j8.C2104o;
import p311v4.C4453d0;

/* JADX INFO: renamed from: i4.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1965f {

    /* JADX INFO: renamed from: a */
    public final int f6674a;

    /* JADX INFO: renamed from: b */
    public final int f6675b;

    /* JADX INFO: renamed from: c */
    public final int f6676c;

    /* JADX INFO: renamed from: d */
    public final C4453d0 f6677d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1965f(int i9, int i10, int i11, C4453d0 c4453d0) {
        if (i9 < 0) {
            C2104o.m5294t("startPc < 0");
            throw null;
        }
        if (i10 < i9) {
            C2104o.m5294t("endPc < startPc");
            throw null;
        }
        if (i11 < 0) {
            C2104o.m5294t("handlerPc < 0");
            throw null;
        }
        this.f6674a = i9;
        this.f6675b = i10;
        this.f6676c = i11;
        this.f6677d = c4453d0;
    }
}
