package bsh;

import p153k4.AbstractC3955e;

/* JADX INFO: renamed from: bsh.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1184h extends C1227o0 {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: A */
    public Class f3587A;

    /* JADX INFO: renamed from: B */
    public String f3588B;

    /* JADX INFO: renamed from: C */
    public AutoCloseable f3589C;

    /* JADX INFO: renamed from: D */
    public C1291y4 f3590D;

    public C1184h(int i10) {
        super(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ String mo4038a() {
        return super.mo4038a();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ void add(InterfaceC1188h3 interfaceC1188h3) {
        super.add(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ void mo4040e() {
        super.mo4040e();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 next() {
        return super.next();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 previous() {
        return super.previous();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    public /* bridge */ /* synthetic */ int getLineNumber() {
        return super.getLineNumber();
    }

    public String getName() {
        return this.f3588B;
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    public /* bridge */ /* synthetic */ String getText() {
        return super.getText();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ void set(InterfaceC1188h3 interfaceC1188h3) {
        super.set(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ boolean hasNext() {
        return super.hasNext();
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ boolean hasPrevious() {
        return super.hasPrevious();
    }

    @Override // bsh.AbstractC1195i4
    /* JADX INFO: renamed from: i */
    public /* bridge */ /* synthetic */ String mo4044i(String str) {
        return super.mo4044i(str);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ void mo4045j(InterfaceC1188h3 interfaceC1188h3, int i10) {
        super.mo4045j(interfaceC1188h3, i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: m */
    public /* bridge */ /* synthetic */ void mo4046m(InterfaceC1188h3 interfaceC1188h3) {
        super.mo4046m(interfaceC1188h3);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: n */
    public /* bridge */ /* synthetic */ void mo4047n(String str) {
        super.mo4047n(str);
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ int nextIndex() {
        return super.nextIndex();
    }

    @Override // bsh.C1227o0, bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: p */
    public Object mo4048p(C1174f1 c1174f1, RunnableC1205k2 runnableC1205k2) throws C1163d2 {
        m4412z();
        this.f3587A = m4991k(c1174f1, runnableC1205k2);
        if (!AutoCloseable.class.isAssignableFrom(m4411y())) {
            throw new C1169e2("The resource type " + this.f3587A.getName() + " does not implement java.lang.AutoCloseable.", this, c1174f1);
        }
        this.f3588B = m4992l()[0].f3772y;
        super.mo4048p(c1174f1, runnableC1205k2);
        try {
            this.f3590D = c1174f1.m4319h().m4354P(getName(), true);
            return Primitive.VOID;
        } catch (C1279w4 e10) {
            throw e10.mo5168b("Unable to evaluate the try-with-resource " + getName() + ". With message:" + e10.getMessage(), this, c1174f1);
        }
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator
    public /* bridge */ /* synthetic */ int previousIndex() {
        return super.previousIndex();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ InterfaceC1188h3[] mo4049q() {
        return super.mo4049q();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: r */
    public /* bridge */ /* synthetic */ int mo4050r() {
        return super.mo4050r();
    }

    @Override // bsh.AbstractC1195i4, java.util.ListIterator, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: s */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 mo4051s(int i10) {
        return super.mo4051s(i10);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: t */
    public /* bridge */ /* synthetic */ void mo4052t() {
        super.mo4052t();
    }

    @Override // bsh.C1227o0, bsh.AbstractC1195i4
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: u */
    public /* bridge */ /* synthetic */ void mo4053u(String str) {
        super.mo4053u(str);
    }

    @Override // bsh.AbstractC1195i4, bsh.InterfaceC1188h3
    /* JADX INFO: renamed from: w */
    public /* bridge */ /* synthetic */ InterfaceC1188h3 mo4054w() {
        return super.mo4054w();
    }

    /* JADX INFO: renamed from: x */
    public void m4410x() throws Exception {
        C1291y4 c1291y4 = this.f3590D;
        if (c1291y4 != null) {
            this.f3589C = (AutoCloseable) c1291y4.m5225g();
        }
        AutoCloseable autoCloseable = this.f3589C;
        if (autoCloseable != null) {
            AbstractC3955e.m15664a(autoCloseable);
        }
    }

    /* JADX INFO: renamed from: y */
    public Class m4411y() {
        return this.f3587A;
    }

    /* JADX INFO: renamed from: z */
    public final void m4412z() {
        if (mo4050r() == 1) {
            InterfaceC1188h3 c1221n0 = new C1221n0(11);
            InterfaceC1188h3 interfaceC1188h3Mo4051s = mo4051s(0);
            while (interfaceC1188h3Mo4051s.mo4050r() > 0) {
                interfaceC1188h3Mo4051s = interfaceC1188h3Mo4051s.mo4051s(0);
                if (interfaceC1188h3Mo4051s instanceof C1138c) {
                    break;
                }
            }
            C1138c c1138c = new C1138c(14);
            c1138c.mo4046m(c1221n0);
            c1138c.f3466y = ((C1138c) interfaceC1188h3Mo4051s).f3466y;
            c1221n0.mo4045j(c1138c, 0);
            c1221n0.mo4046m(this);
            this.f3618u = new InterfaceC1188h3[]{c1221n0, this.f3618u[0]};
        }
    }
}
