package p104h4;

import p121i4.C1959b;
import p121i4.C1961c;

/* JADX INFO: renamed from: h4.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1588b extends AbstractC1605s {

    /* JADX INFO: renamed from: b */
    public final C1961c f5254b;

    /* JADX INFO: renamed from: c */
    public final int f5255c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1588b(C1961c c1961c) {
        super("BootstrapMethods");
        this.f5254b = c1961c;
        int length = (c1961c.f24601h.length * 4) + 8;
        for (int i9 = 0; i9 < c1961c.f24601h.length; i9++) {
            length += ((C1959b) c1961c.m10840l(i9)).f6660a.f24601h.length * 2;
        }
        this.f5255c = length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p104h4.AbstractC1605s
    /* JADX INFO: renamed from: a */
    public final int mo4124a() {
        return this.f5255c;
    }
}
