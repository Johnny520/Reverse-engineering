package p095g7;

import p047d7.AbstractC0727j;
import p047d7.C0719b;
import p047d7.C0722e;
import p047d7.C0723f;
import p152k7.AbstractC2331a;

/* JADX INFO: renamed from: g7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1359c extends AbstractC0727j {

    /* JADX INFO: renamed from: n */
    public final C0723f f4504n;

    /* JADX INFO: renamed from: o */
    public final C0722e f4505o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1359c() {
        super(3, false);
        C0723f c0723f = new C0723f();
        this.f4504n = c0723f;
        C0722e c0722e = new C0722e(0, false);
        this.f4505o = c0722e;
        AbstractC2331a c0719b = new C0719b(null, 0);
        m6539P(c0723f);
        m6539P(c0722e);
        m6539P(c0719b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p047d7.AbstractC0727j
    public final String toString() {
        return super.toString() + ", sig=" + this.f4504n + ", certs=" + this.f4505o;
    }
}
