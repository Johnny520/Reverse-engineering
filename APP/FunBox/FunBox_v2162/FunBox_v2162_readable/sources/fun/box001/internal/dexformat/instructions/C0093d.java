package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0184n;
import fun.box001.internal.dexformat.writer.code.C0172b;
import fun.box001.internal.dexformat.writer.code.C0173c;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexmaker.AbstractC0007d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: g.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0093d extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final C0191u f340e;

    /* JADX INFO: renamed from: f */
    private final ArrayList f341f;

    /* JADX INFO: renamed from: g */
    private final HashMap f342g;

    /* JADX INFO: renamed from: h */
    private final ArrayList f343h;

    /* JADX INFO: renamed from: i */
    private final ArrayList f344i;

    /* JADX INFO: renamed from: j */
    private final ArrayList f345j;

    /* JADX INFO: renamed from: k */
    private C0173c f346k;

    /* JADX INFO: renamed from: l */
    private byte[] f347l;

    public C0093d(C0191u c0191u) {
        super(1, -1);
        if (c0191u == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.f340e = c0191u;
        this.f341f = new ArrayList(20);
        this.f342g = new HashMap(40);
        this.f343h = new ArrayList(20);
        this.f344i = new ArrayList(20);
        this.f345j = new ArrayList(20);
        this.f346k = null;
    }

    /* JADX INFO: renamed from: o */
    private static void m268o(C0100k c0100k, C0202d c0202d, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c0202d.m486d()) {
            c0202d.m484b(0, "  " + str + ":");
        }
        int iMo312b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iMo312b = ((AbstractC0102m) arrayList.get(i2)).mo312b(c0100k, c0202d, iMo312b, i2);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m269p(C0100k c0100k, C0202d c0202d) {
        boolean zM486d = c0202d.m486d();
        if (zM486d) {
            c0202d.m484b(0, m237h() + " class data for " + this.f340e.mo107a());
        }
        ArrayList arrayList = this.f341f;
        m270q(c0202d, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f343h;
        m270q(c0202d, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f344i;
        m270q(c0202d, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f345j;
        m270q(c0202d, "virtual_methods", arrayList4.size());
        m268o(c0100k, c0202d, "static_fields", arrayList);
        m268o(c0100k, c0202d, "instance_fields", arrayList2);
        m268o(c0100k, c0202d, "direct_methods", arrayList3);
        m268o(c0100k, c0202d, "virtual_methods", arrayList4);
        if (zM486d) {
            c0202d.m488f();
        }
    }

    /* JADX INFO: renamed from: q */
    private static void m270q(C0202d c0202d, String str, int i2) {
        if (c0202d.m486d()) {
            c0202d.m485c(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i2)));
        }
        c0202d.m500t(i2);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        ArrayList arrayList = this.f341f;
        if (!arrayList.isEmpty()) {
            m273r();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                AbstractC0007d.m47a(it.next());
                throw null;
            }
        }
        ArrayList arrayList2 = this.f343h;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                AbstractC0007d.m47a(it2.next());
                throw null;
            }
        }
        ArrayList arrayList3 = this.f344i;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                ((C0103n) it3.next()).m314f(c0100k);
            }
        }
        ArrayList arrayList4 = this.f345j;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            ((C0103n) it4.next()).m314f(c0100k);
        }
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return EnumC0109t.f416l;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E abstractC0082E, int i2) {
        C0202d c0202d = new C0202d();
        m269p(abstractC0082E.m246d(), c0202d);
        byte[] bArrM493m = c0202d.m493m();
        this.f347l = bArrM493m;
        m240k(bArrM493m.length);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    public final void mo241l(C0100k c0100k, C0202d c0202d) {
        if (c0202d.m486d()) {
            m269p(c0100k, c0202d);
        } else {
            c0202d.m495o(this.f347l);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m271m(C0103n c0103n) {
        this.f344i.add(c0103n);
    }

    /* JADX INFO: renamed from: n */
    public final void m272n(C0103n c0103n) {
        this.f345j.add(c0103n);
    }

    /* JADX INFO: renamed from: r */
    public final C0173c m273r() {
        HashMap map;
        C0173c c0173c;
        if (this.f346k == null) {
            ArrayList arrayList = this.f341f;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.f342g;
                    c0173c = null;
                    if (size <= 0) {
                        break;
                    }
                    int i2 = size - 1;
                    AbstractC0007d.m47a(arrayList.get(i2));
                    AbstractC0171a abstractC0171a = (AbstractC0171a) map.get(null);
                    if (abstractC0171a instanceof AbstractC0184n) {
                        if (((AbstractC0184n) abstractC0171a).mo439i() != 0) {
                            break;
                        }
                        size = i2;
                    } else {
                        if (abstractC0171a != null) {
                            break;
                        }
                        size = i2;
                    }
                }
                if (size != 0) {
                    C0172b c0172b = new C0172b(size);
                    for (int i3 = 0; i3 < size; i3++) {
                        AbstractC0007d.m47a(arrayList.get(i3));
                        AbstractC0171a abstractC0171a2 = (AbstractC0171a) map.get(null);
                        abstractC0171a2.getClass();
                        c0172b.m522y(i3, abstractC0171a2);
                    }
                    c0172b.m536g();
                    c0173c = new C0173c(c0172b);
                }
                this.f346k = c0173c;
            }
        }
        return this.f346k;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m274s() {
        return this.f341f.isEmpty() && this.f343h.isEmpty() && this.f344i.isEmpty() && this.f345j.isEmpty();
    }
}
