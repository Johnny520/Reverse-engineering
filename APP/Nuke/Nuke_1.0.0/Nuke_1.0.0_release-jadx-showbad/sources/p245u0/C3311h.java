package p245u0;

import android.graphics.Path;
import java.util.List;
import p049I2.AbstractC0797o;
import p056K2.EnumC0880f;
import p061L2.C0981u;
import p117X2.AbstractC1665j;
import p211o0.AbstractC2752k;
import p211o0.AbstractC2758q;
import p211o0.C2750i;
import p211o0.C2751j;
import p222q0.C2906g;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: u0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3311h extends AbstractC3296C {

    /* JADX INFO: renamed from: b */
    public AbstractC2758q f10290b;

    /* JADX INFO: renamed from: c */
    public float f10291c = 1.0f;

    /* JADX INFO: renamed from: d */
    public List f10292d;

    /* JADX INFO: renamed from: e */
    public float f10293e;

    /* JADX INFO: renamed from: f */
    public float f10294f;

    /* JADX INFO: renamed from: g */
    public AbstractC2758q f10295g;

    /* JADX INFO: renamed from: h */
    public int f10296h;

    /* JADX INFO: renamed from: i */
    public int f10297i;

    /* JADX INFO: renamed from: j */
    public float f10298j;

    /* JADX INFO: renamed from: k */
    public float f10299k;

    /* JADX INFO: renamed from: l */
    public float f10300l;

    /* JADX INFO: renamed from: m */
    public float f10301m;

    /* JADX INFO: renamed from: n */
    public boolean f10302n;

    /* JADX INFO: renamed from: o */
    public boolean f10303o;

    /* JADX INFO: renamed from: p */
    public boolean f10304p;

    /* JADX INFO: renamed from: q */
    public C2906g f10305q;

    /* JADX INFO: renamed from: r */
    public final C2750i f10306r;

    /* JADX INFO: renamed from: s */
    public C2750i f10307s;

    /* JADX INFO: renamed from: t */
    public C2750i f10308t;

    /* JADX INFO: renamed from: u */
    public final Object f10309u;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3311h() {
        int i5 = AbstractC3300G.f10208a;
        this.f10292d = C0981u.f3047d;
        this.f10293e = 1.0f;
        this.f10296h = 0;
        this.f10297i = 0;
        this.f10298j = 4.0f;
        this.f10300l = 1.0f;
        this.f10302n = true;
        this.f10303o = true;
        C2750i c2750iM4885a = AbstractC2752k.m4885a();
        this.f10306r = c2750iM4885a;
        this.f10307s = c2750iM4885a;
        this.f10309u = AbstractC0797o.m1395t(EnumC0880f.f2767e, C3310g.f10287f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p245u0.AbstractC3296C
    /* JADX INFO: renamed from: a */
    public final void mo5565a(InterfaceC2903d interfaceC2903d) {
        InterfaceC2903d interfaceC2903d2;
        C2906g c2906g;
        if (this.f10302n) {
            AbstractC3305b.m5574e(this.f10292d, this.f10306r);
            m5580e();
        } else if (this.f10304p) {
            m5580e();
        }
        this.f10302n = false;
        this.f10304p = false;
        AbstractC2758q abstractC2758q = this.f10290b;
        if (abstractC2758q != null) {
            interfaceC2903d2 = interfaceC2903d;
            InterfaceC2903d.m5103g(interfaceC2903d2, this.f10307s, abstractC2758q, this.f10291c, null, 56);
        } else {
            interfaceC2903d2 = interfaceC2903d;
        }
        AbstractC2758q abstractC2758q2 = this.f10295g;
        if (abstractC2758q2 != null) {
            C2906g c2906g2 = this.f10305q;
            if (this.f10303o || c2906g2 == null) {
                C2906g c2906g3 = new C2906g(this.f10294f, this.f10298j, this.f10296h, this.f10297i, 16);
                this.f10305q = c2906g3;
                this.f10303o = false;
                c2906g = c2906g3;
            } else {
                c2906g = c2906g2;
            }
            InterfaceC2903d.m5103g(interfaceC2903d2, this.f10307s, abstractC2758q2, this.f10293e, c2906g, 48);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v10, types: [K2.e, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public final void m5580e() {
        float f2 = this.f10299k;
        C2750i c2750i = this.f10306r;
        if (f2 == 0.0f && this.f10300l == 1.0f) {
            this.f10307s = c2750i;
            return;
        }
        if (AbstractC1665j.m2981a(this.f10307s, c2750i)) {
            this.f10307s = AbstractC2752k.m4885a();
        } else {
            Path.FillType fillType = this.f10307s.f8742a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z5 = fillType == fillType2;
            this.f10307s.f8742a.rewind();
            Path path = this.f10307s.f8742a;
            if (!z5) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f10309u;
        ((C2751j) r02.getValue()).f8745a.setPath(c2750i != null ? c2750i.f8742a : null, false);
        float length = ((C2751j) r02.getValue()).f8745a.getLength();
        float f5 = this.f10299k;
        float f6 = this.f10301m;
        float f7 = ((f5 + f6) % 1.0f) * length;
        float f8 = ((this.f10300l + f6) % 1.0f) * length;
        if (f7 <= f8) {
            ((C2751j) r02.getValue()).m4884a(f7, f8, this.f10307s);
            return;
        }
        C2750i c2750iM4885a = this.f10308t;
        if (c2750iM4885a == null) {
            c2750iM4885a = AbstractC2752k.m4885a();
            this.f10308t = c2750iM4885a;
        }
        c2750iM4885a.m4883g();
        ((C2751j) r02.getValue()).m4884a(f7, length, c2750iM4885a);
        C2750i.m4877a(this.f10307s, c2750iM4885a);
        c2750iM4885a.m4883g();
        ((C2751j) r02.getValue()).m4884a(0.0f, f8, c2750iM4885a);
        C2750i.m4877a(this.f10307s, c2750iM4885a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f10306r.toString();
    }
}
