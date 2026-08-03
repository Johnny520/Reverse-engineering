package p006g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import p001b.C0003a;
import p004e.AbstractC0040q;
import p013n.C0202d;

/* JADX INFO: renamed from: g.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0079B extends AbstractC0082E {

    /* JADX INFO: renamed from: j */
    private static final Comparator f307j = new C0078A();

    /* JADX INFO: renamed from: f */
    private final ArrayList f308f;

    /* JADX INFO: renamed from: g */
    private final HashMap f309g;

    /* JADX INFO: renamed from: h */
    private final int f310h;

    /* JADX INFO: renamed from: i */
    private int f311i;

    public C0079B(String str, C0100k c0100k, int i2, int i3) {
        super(str, c0100k, i2);
        this.f308f = new ArrayList(100);
        this.f309g = new HashMap(100);
        this.f310h = i3;
        this.f311i = -1;
    }

    @Override // p006g.AbstractC0082E
    /* JADX INFO: renamed from: a */
    public final int mo224a(AbstractC0108s abstractC0108s) {
        return ((AbstractC0080C) abstractC0108s).m235f();
    }

    @Override // p006g.AbstractC0082E
    /* JADX INFO: renamed from: f */
    public final Collection mo225f() {
        return this.f308f;
    }

    @Override // p006g.AbstractC0082E
    /* JADX INFO: renamed from: h */
    protected final void mo226h() {
        C0100k c0100kM246d = m246d();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f308f;
            int size = arrayList.size();
            if (i2 >= size) {
                return;
            }
            while (i2 < size) {
                ((AbstractC0080C) arrayList.get(i2)).mo242a(c0100kM246d);
                i2++;
            }
        }
    }

    @Override // p006g.AbstractC0082E
    /* JADX INFO: renamed from: l */
    public final int mo227l() {
        m250j();
        return this.f311i;
    }

    @Override // p006g.AbstractC0082E
    /* JADX INFO: renamed from: n */
    protected final void mo228n(C0202d c0202d) {
        boolean zM486d = c0202d.m486d();
        C0100k c0100kM246d = m246d();
        boolean z = true;
        int iMo232c = 0;
        for (AbstractC0080C abstractC0080C : this.f308f) {
            if (zM486d) {
                if (z) {
                    z = false;
                } else {
                    c0202d.m484b(0, "\n");
                }
            }
            int iM236g = abstractC0080C.m236g() - 1;
            int i2 = (~iM236g) & (iMo232c + iM236g);
            if (iMo232c != i2) {
                c0202d.m501u(i2 - iMo232c);
                iMo232c = i2;
            }
            abstractC0080C.mo233d(c0100kM246d, c0202d);
            iMo232c += abstractC0080C.mo232c();
        }
        if (iMo232c != this.f311i) {
            throw new RuntimeException("output size mismatch");
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m229o(AbstractC0080C abstractC0080C) {
        m251k();
        try {
            if (abstractC0080C.m236g() > m245c()) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f308f.add(abstractC0080C);
        } catch (NullPointerException unused) {
            throw new NullPointerException("item == null");
        }
    }

    /* JADX INFO: renamed from: p */
    public final synchronized AbstractC0080C m230p(AbstractC0080C abstractC0080C) {
        m251k();
        AbstractC0080C abstractC0080C2 = (AbstractC0080C) this.f309g.get(abstractC0080C);
        if (abstractC0080C2 != null) {
            return abstractC0080C2;
        }
        m229o(abstractC0080C);
        this.f309g.put(abstractC0080C, abstractC0080C);
        return abstractC0080C;
    }

    /* JADX INFO: renamed from: q */
    public final void m231q() {
        m250j();
        int iM183b = AbstractC0040q.m183b(this.f310h);
        ArrayList arrayList = this.f308f;
        if (iM183b == 1) {
            Collections.sort(arrayList, f307j);
        } else if (iM183b == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iMo232c = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0080C abstractC0080C = (AbstractC0080C) arrayList.get(i2);
            try {
                int iM238i = abstractC0080C.m238i(this, iMo232c);
                if (iM238i < iMo232c) {
                    throw new RuntimeException("bogus place() result for " + abstractC0080C);
                }
                iMo232c = abstractC0080C.mo232c() + iM238i;
            } catch (RuntimeException e2) {
                throw C0003a.m22b("...while placing " + abstractC0080C, e2);
            }
        }
        this.f311i = iMo232c;
    }
}
