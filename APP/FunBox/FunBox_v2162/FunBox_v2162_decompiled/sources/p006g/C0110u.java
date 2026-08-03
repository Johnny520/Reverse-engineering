package p006g;

import java.util.ArrayList;
import p000a.AbstractC0001b;
import p013n.C0202d;

/* JADX INFO: renamed from: g.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0110u extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final EnumC0109t f426e;

    /* JADX INFO: renamed from: f */
    private final AbstractC0082E f427f;

    /* JADX INFO: renamed from: g */
    private final AbstractC0108s f428g;

    /* JADX INFO: renamed from: h */
    private final int f429h;

    private C0110u(EnumC0109t enumC0109t, AbstractC0082E abstractC0082E, AbstractC0108s abstractC0108s, AbstractC0108s abstractC0108s2, int i2) {
        super(4, 12);
        if (enumC0109t == null) {
            throw new NullPointerException("type == null");
        }
        if (abstractC0108s == null) {
            throw new NullPointerException("firstItem == null");
        }
        if (abstractC0108s2 == null) {
            throw new NullPointerException("lastItem == null");
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("itemCount <= 0");
        }
        this.f426e = enumC0109t;
        this.f427f = abstractC0082E;
        this.f428g = abstractC0108s;
        this.f429h = i2;
    }

    /* JADX INFO: renamed from: m */
    public static void m323m(AbstractC0082E[] abstractC0082EArr, C0079B c0079b) {
        C0110u c0110u;
        if (abstractC0082EArr == null) {
            throw new NullPointerException("sections == null");
        }
        if (((ArrayList) c0079b.mo225f()).size() != 0) {
            throw new IllegalArgumentException("mapSection.items().size() != 0");
        }
        ArrayList arrayList = new ArrayList(50);
        for (AbstractC0082E abstractC0082E : abstractC0082EArr) {
            EnumC0109t enumC0109t = null;
            AbstractC0108s abstractC0108s = null;
            AbstractC0108s abstractC0108s2 = null;
            int i2 = 0;
            for (AbstractC0108s abstractC0108s3 : abstractC0082E.mo225f()) {
                EnumC0109t enumC0109tMo243b = abstractC0108s3.mo243b();
                if (enumC0109tMo243b != enumC0109t) {
                    if (i2 != 0) {
                        arrayList.add(new C0110u(enumC0109t, abstractC0082E, abstractC0108s, abstractC0108s2, i2));
                    }
                    abstractC0108s = abstractC0108s3;
                    enumC0109t = enumC0109tMo243b;
                    i2 = 0;
                }
                i2++;
                abstractC0108s2 = abstractC0108s3;
            }
            if (i2 != 0) {
                c0110u = new C0110u(enumC0109t, abstractC0082E, abstractC0108s, abstractC0108s2, i2);
            } else if (abstractC0082E == c0079b) {
                c0110u = new C0110u(c0079b);
            }
            arrayList.add(c0110u);
        }
        c0079b.m229o(new C0088K(EnumC0109t.f414j, arrayList));
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
    }

    @Override // p006g.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f422r;
    }

    @Override // p006g.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k c0100k, C0202d c0202d) {
        EnumC0109t enumC0109t = this.f426e;
        int iM321b = enumC0109t.m321b();
        AbstractC0082E abstractC0082E = this.f427f;
        AbstractC0108s abstractC0108s = this.f428g;
        int iM247e = abstractC0108s == null ? abstractC0082E.m247e() : abstractC0082E.mo224a(abstractC0108s);
        boolean zM486d = c0202d.m486d();
        int i2 = this.f429h;
        if (zM486d) {
            c0202d.m484b(0, m237h() + ' ' + enumC0109t.m322e() + " map");
            StringBuilder sb = new StringBuilder("  type:   ");
            sb.append(AbstractC0001b.m11q(iM321b));
            sb.append(" // ");
            sb.append(enumC0109t.toString());
            c0202d.m484b(2, sb.toString());
            c0202d.m484b(2, "  unused: 0");
            c0202d.m484b(4, "  size:   ".concat(AbstractC0001b.m13s(i2)));
            c0202d.m484b(4, "  offset: ".concat(AbstractC0001b.m13s(iM247e)));
        }
        c0202d.m498r(iM321b);
        c0202d.m498r(0);
        c0202d.m497q(i2);
        c0202d.m497q(iM247e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C0110u.class.getName());
        sb.append('{');
        sb.append(this.f427f.toString());
        sb.append(' ');
        sb.append(this.f426e.mo107a());
        sb.append('}');
        return sb.toString();
    }

    private C0110u(AbstractC0082E abstractC0082E) {
        super(4, 12);
        if (abstractC0082E == null) {
            throw new NullPointerException("section == null");
        }
        this.f426e = EnumC0109t.f414j;
        this.f427f = abstractC0082E;
        this.f428g = null;
        this.f429h = 1;
    }
}
