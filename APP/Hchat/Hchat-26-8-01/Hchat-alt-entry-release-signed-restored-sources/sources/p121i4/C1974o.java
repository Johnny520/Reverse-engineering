package p121i4;

import p136j8.C2104o;

/* JADX INFO: renamed from: i4.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1974o {

    /* JADX INFO: renamed from: a */
    public final int f6696a;

    /* JADX INFO: renamed from: b */
    public final int f6697b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1974o(int i9, int i10) {
        if (i9 < 0) {
            C2104o.m5294t("startPc < 0");
            throw null;
        }
        if (i10 < 0) {
            C2104o.m5294t("lineNumber < 0");
            throw null;
        }
        this.f6696a = i9;
        this.f6697b = i10;
    }
}
