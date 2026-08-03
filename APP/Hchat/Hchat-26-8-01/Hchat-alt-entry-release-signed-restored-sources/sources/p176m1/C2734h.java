package p176m1;

import android.graphics.Path;
import be.AbstractC0283h;
import gg.AbstractC1416l;
import java.util.List;
import p071f1.AbstractC1013l;
import p071f1.AbstractC1027s;
import p071f1.C1009j;
import p071f1.C1011k;
import p101h1.C1570g;
import p101h1.InterfaceC1567d;
import p276sf.EnumC3957d;
import tf.C4173t;

/* JADX INFO: renamed from: m1.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2734h extends AbstractC2725c0 {

    /* JADX INFO: renamed from: b */
    public AbstractC1027s f8889b;

    /* JADX INFO: renamed from: c */
    public float f8890c = 1.0f;

    /* JADX INFO: renamed from: d */
    public List f8891d;

    /* JADX INFO: renamed from: e */
    public float f8892e;

    /* JADX INFO: renamed from: f */
    public float f8893f;

    /* JADX INFO: renamed from: g */
    public AbstractC1027s f8894g;

    /* JADX INFO: renamed from: h */
    public int f8895h;

    /* JADX INFO: renamed from: i */
    public int f8896i;

    /* JADX INFO: renamed from: j */
    public float f8897j;

    /* JADX INFO: renamed from: k */
    public float f8898k;

    /* JADX INFO: renamed from: l */
    public float f8899l;

    /* JADX INFO: renamed from: m */
    public float f8900m;

    /* JADX INFO: renamed from: n */
    public boolean f8901n;

    /* JADX INFO: renamed from: o */
    public boolean f8902o;

    /* JADX INFO: renamed from: p */
    public boolean f8903p;

    /* JADX INFO: renamed from: q */
    public C1570g f8904q;

    /* JADX INFO: renamed from: r */
    public final C1009j f8905r;

    /* JADX INFO: renamed from: s */
    public C1009j f8906s;

    /* JADX INFO: renamed from: t */
    public C1009j f8907t;

    /* JADX INFO: renamed from: u */
    public final Object f8908u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2734h() {
        int i9 = AbstractC2735h0.f8909a;
        this.f8891d = C4173t.f13710g;
        this.f8892e = 1.0f;
        this.f8895h = 0;
        this.f8896i = 0;
        this.f8897j = 4.0f;
        this.f8899l = 1.0f;
        this.f8901n = true;
        this.f8902o = true;
        C1009j c1009jM2609a = AbstractC1013l.m2609a();
        this.f8905r = c1009jM2609a;
        this.f8906s = c1009jM2609a;
        this.f8908u = AbstractC0283h.m1127G(EnumC3957d.f12959h, C2732g.f8876h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p176m1.AbstractC2725c0
    /* JADX INFO: renamed from: a */
    public final void mo6141a(InterfaceC1567d interfaceC1567d) {
        InterfaceC1567d interfaceC1567d2;
        C1570g c1570g;
        if (this.f8901n) {
            AbstractC2722b.m6140d(this.f8891d, this.f8905r);
            m6151e();
        } else if (this.f8903p) {
            m6151e();
        }
        this.f8901n = false;
        this.f8903p = false;
        AbstractC1027s abstractC1027s = this.f8889b;
        if (abstractC1027s != null) {
            interfaceC1567d2 = interfaceC1567d;
            InterfaceC1567d.m4089s0(interfaceC1567d2, this.f8906s, abstractC1027s, this.f8890c, null, 56);
        } else {
            interfaceC1567d2 = interfaceC1567d;
        }
        AbstractC1027s abstractC1027s2 = this.f8894g;
        if (abstractC1027s2 != null) {
            C1570g c1570g2 = this.f8904q;
            if (this.f8902o || c1570g2 == null) {
                C1570g c1570g3 = new C1570g(this.f8893f, this.f8897j, this.f8895h, this.f8896i, 16);
                this.f8904q = c1570g3;
                this.f8902o = false;
                c1570g = c1570g3;
            } else {
                c1570g = c1570g2;
            }
            InterfaceC1567d.m4089s0(interfaceC1567d2, this.f8906s, abstractC1027s2, this.f8892e, c1570g, 48);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, sf.c] */
    /* JADX INFO: renamed from: e */
    public final void m6151e() {
        float f3 = this.f8898k;
        C1009j c1009j = this.f8905r;
        if (f3 == 0.0f && this.f8899l == 1.0f) {
            this.f8906s = c1009j;
            return;
        }
        if (AbstractC1416l.m3825a(this.f8906s, c1009j)) {
            this.f8906s = AbstractC1013l.m2609a();
        } else {
            Path.FillType fillType = this.f8906s.f3191a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z9 = fillType == fillType2;
            this.f8906s.f3191a.rewind();
            Path path = this.f8906s.f3191a;
            if (!z9) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f8908u;
        ((C1011k) r02.getValue()).f3196a.setPath(c1009j != null ? c1009j.f3191a : null, false);
        float length = ((C1011k) r02.getValue()).f3196a.getLength();
        float f10 = this.f8898k;
        float f11 = this.f8900m;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f8899l + f11) % 1.0f) * length;
        if (f12 <= f13) {
            ((C1011k) r02.getValue()).m2608a(f12, f13, this.f8906s);
            return;
        }
        C1009j c1009jM2609a = this.f8907t;
        if (c1009jM2609a == null) {
            c1009jM2609a = AbstractC1013l.m2609a();
            this.f8907t = c1009jM2609a;
        }
        c1009jM2609a.m2606h();
        ((C1011k) r02.getValue()).m2608a(f12, length, c1009jM2609a);
        C1009j.m2599a(this.f8906s, c1009jM2609a);
        c1009jM2609a.m2606h();
        ((C1011k) r02.getValue()).m2608a(0.0f, f13, c1009jM2609a);
        C1009j.m2599a(this.f8906s, c1009jM2609a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f8905r.toString();
    }
}
