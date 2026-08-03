package p166l7;

import java.io.IOException;
import java.util.Iterator;
import okhttp3.HttpUrl;
import p135j7.C2085a;
import p136j8.C2104o;
import p209o7.C3068b;
import p209o7.C3069c;
import p229p7.C3331a;
import p229p7.C3332b;
import p229p7.C3333c;
import p229p7.C3334d;
import p229p7.C3335e;
import p241q7.C3445b;

/* JADX INFO: renamed from: l7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2515c extends AbstractC2513a implements Iterable {

    /* JADX INFO: renamed from: q */
    public static final C2104o f8140q = new C2104o();

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f8141o;

    /* JADX INFO: renamed from: p */
    public final C3068b f8142p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2515c(int i9) {
        this.f8141o = i9;
        switch (i9) {
            case 1:
                C3333c c3333c = new C3333c();
                super(c3333c, 1);
                C2085a c2085a = new C2085a(c3333c.f10726r, 0);
                this.f8142p = c2085a;
                m6539P(c2085a);
                break;
            case 2:
                super(new C3334d(), 2);
                C3068b c3068b = new C3068b(null);
                this.f8142p = c3068b;
                m6539P(c3068b);
                break;
            default:
                C3335e c3335e = new C3335e();
                super(c3335e, 1);
                C3069c c3069c = new C3069c(f8140q, c3335e.f10730s);
                this.f8142p = c3069c;
                m6539P(c3069c);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a, p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) throws IOException {
        switch (this.f8141o) {
            case 2:
                c3445b.getClass();
                C3332b c3332bM7054T = C3332b.m7054T(c3445b);
                mo5905Q(c3332bM7054T);
                int i9 = c3332bM7054T.f10723o.f12083n;
                C3445b c3445bM7226a = c3445b.m7226a(i9);
                this.f8138m.m5545G(c3445bM7226a);
                for (C3332b c3332bM7054T2 = C3332b.m7054T(c3445bM7226a); c3332bM7054T2 != null && c3332bM7054T2.m7051Q() == 17; c3332bM7054T2 = C3332b.m7054T(c3445bM7226a)) {
                    C2515c c2515c = new C2515c(0);
                    this.f8142p.mo6519M(c2515c);
                    c2515c.m5545G(c3445bM7226a);
                }
                c3445b.m7228c(i9);
                c3445bM7226a.close();
                break;
            default:
                super.mo1893B(c3445b);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public final void mo5907S() {
        switch (this.f8141o) {
            case 1:
                ((C3333c) this.f8138m).f10726r.mo633k(((C2085a) this.f8142p).f9926k.size());
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f8141o) {
            case 0:
                return ((C3069c) this.f8142p).f9926k.iterator();
            case 1:
                return ((C2085a) this.f8142p).m5558j0(true);
            default:
                return this.f8142p.f9926k.iterator();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    public String toString() {
        String string;
        int i9 = this.f8141o;
        C3068b c3068b = this.f8142p;
        C3331a c3331a = this.f8138m;
        switch (i9) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C2515c.class.getSimpleName());
                sb2.append(": flags=");
                int i10 = ((C3335e) c3331a).f10729r.f12083n;
                C2520h[] c2520hArr = null;
                if (i10 == 0) {
                    C2520h[] c2520hArr2 = C2520h.f8148c;
                } else {
                    C2520h[] c2520hArr3 = C2520h.f8148c;
                    C2520h[] c2520hArr4 = new C2520h[9];
                    int i11 = 0;
                    for (int i12 = 0; i12 < 9; i12++) {
                        C2520h c2520h = c2520hArr3[i12];
                        int i13 = c2520h.f8149a;
                        if ((i13 & i10) == i13) {
                            c2520hArr4[i12] = c2520h;
                            i11++;
                        }
                    }
                    if (i11 != 0) {
                        if (i11 == 9) {
                            c2520hArr = c2520hArr4;
                        } else {
                            c2520hArr = new C2520h[i11];
                            int i14 = 0;
                            for (int i15 = 0; i15 < 9; i15++) {
                                C2520h c2520h2 = c2520hArr4[i15];
                                if (c2520h2 != null) {
                                    c2520hArr[i14] = c2520h2;
                                    i14++;
                                }
                            }
                        }
                    }
                }
                C2520h[] c2520hArr5 = C2520h.f8148c;
                if (c2520hArr == null || c2520hArr.length == 0) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    boolean z9 = false;
                    for (C2520h c2520h3 : c2520hArr) {
                        if (c2520h3 != null) {
                            if (z9) {
                                sb3.append('|');
                            }
                            sb3.append(c2520h3.f8150b);
                            z9 = true;
                        }
                    }
                    string = sb3.toString();
                }
                sb2.append(string);
                sb2.append("', count=");
                sb2.append(((C3069c) c3068b).f9926k.size());
                return sb2.toString();
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb4 = new StringBuilder("name='");
                C3334d c3334d = (C3334d) c3331a;
                sb4.append(c3334d.f10727r.f12101m);
                sb4.append("', actor='");
                sb4.append(c3334d.f10728s.f12101m);
                sb4.append("', policies=");
                sb4.append(c3068b.f9926k.size());
                return sb4.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: y */
    public boolean mo5555y() {
        switch (this.f8141o) {
            case 0:
                return ((C3069c) this.f8142p).f9926k.size() == 0;
            case 1:
                return !iterator().hasNext();
            default:
                return super.mo5555y();
        }
    }

    /* JADX INFO: renamed from: U */
    private final void m5910U() {
    }

    /* JADX INFO: renamed from: V */
    private final void m5911V() {
    }
}
