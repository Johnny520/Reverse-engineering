package p121i4;

import bsh.C0353j;
import p136j8.C2104o;
import p311v4.C4451c0;

/* JADX INFO: renamed from: i4.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1976q {

    /* JADX INFO: renamed from: a */
    public final int f6699a;

    /* JADX INFO: renamed from: b */
    public final int f6700b;

    /* JADX INFO: renamed from: c */
    public final C4451c0 f6701c;

    /* JADX INFO: renamed from: d */
    public final C4451c0 f6702d;

    /* JADX INFO: renamed from: e */
    public final C4451c0 f6703e;

    /* JADX INFO: renamed from: f */
    public final int f6704f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1976q(int i9, int i10, C4451c0 c4451c0, C4451c0 c4451c02, C4451c0 c4451c03, int i11) {
        if (i9 < 0) {
            C2104o.m5294t("startPc < 0");
            throw null;
        }
        if (i10 < 0) {
            C2104o.m5294t("length < 0");
            throw null;
        }
        if (c4451c0 == null) {
            C0353j.m1305c("name == null");
            throw null;
        }
        if (c4451c02 == null && c4451c03 == null) {
            C0353j.m1305c("(descriptor == null) && (signature == null)");
            throw null;
        }
        if (i11 < 0) {
            C2104o.m5294t("index < 0");
            throw null;
        }
        this.f6699a = i9;
        this.f6700b = i10;
        this.f6701c = c4451c0;
        this.f6702d = c4451c02;
        this.f6703e = c4451c03;
        this.f6704f = i11;
    }
}
