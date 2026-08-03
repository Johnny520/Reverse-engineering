package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: g.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0088K extends AbstractC0080C {

    /* JADX INFO: renamed from: e */
    private final EnumC0109t f328e;

    /* JADX INFO: renamed from: f */
    private final List f329f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C0088K(EnumC0109t enumC0109t, ArrayList arrayList) {
        int iM256m = m256m(arrayList);
        AbstractC0080C abstractC0080C = (AbstractC0080C) arrayList.get(0);
        super(iM256m, (abstractC0080C.mo232c() * arrayList.size()) + m256m(arrayList));
        if (enumC0109t == null) {
            throw new NullPointerException("itemType == null");
        }
        this.f329f = arrayList;
        this.f328e = enumC0109t;
    }

    /* JADX INFO: renamed from: m */
    private static int m256m(ArrayList arrayList) {
        try {
            return Math.max(4, ((AbstractC0080C) arrayList.get(0)).m236g());
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("items.size() == 0");
        } catch (NullPointerException unused2) {
            throw new NullPointerException("items == null");
        }
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k c0100k) {
        Iterator it = this.f329f.iterator();
        while (it.hasNext()) {
            ((AbstractC0080C) it.next()).mo242a(c0100k);
        }
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return this.f328e;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E abstractC0082E, int i2) {
        int iM236g = m236g() + i2;
        int i3 = -1;
        boolean z = true;
        int iM236g2 = -1;
        for (AbstractC0080C abstractC0080C : this.f329f) {
            int iMo232c = abstractC0080C.mo232c();
            if (z) {
                z = false;
                iM236g2 = abstractC0080C.m236g();
                i3 = iMo232c;
            } else {
                if (iMo232c != i3) {
                    throw new UnsupportedOperationException("item size mismatch");
                }
                if (abstractC0080C.m236g() != iM236g2) {
                    throw new UnsupportedOperationException("item alignment mismatch");
                }
            }
            iM236g = abstractC0080C.m238i(abstractC0082E, iM236g) + iMo232c;
        }
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k c0100k, C0202d c0202d) {
        List list = this.f329f;
        int size = list.size();
        if (c0202d.m486d()) {
            c0202d.m484b(0, m237h() + " " + mo243b().mo107a());
            c0202d.m484b(4, "  size: ".concat(RuntimeDexGenerator.m13s(size)));
        }
        c0202d.m497q(size);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((AbstractC0080C) it.next()).mo233d(c0100k, c0202d);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C0088K.class.getName());
        sb.append(this.f329f);
        return sb.toString();
    }
}
