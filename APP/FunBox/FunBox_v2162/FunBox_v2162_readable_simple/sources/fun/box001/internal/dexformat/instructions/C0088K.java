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

    public C0088K(EnumC0109t r4, ArrayList r5) {
        int r0 = m256m(r5);
        AbstractC0080C r1 = (AbstractC0080C) r5.get(0);
        int r2 = r5.size();
        super(r0, (r1.mo232c() * r2) + m256m(r5));
        if (r4 == null) goto L7;
        this.f329f = r5;
        this.f328e = r4;
        return;
    L7:
        throw new NullPointerException("itemType == null");
    }

    /* JADX INFO: renamed from: m */
    private static int m256m(ArrayList r1) {
        return Math.max(4, ((AbstractC0080C) r1.get(0)).m236g());
    L8:
        throw new IllegalArgumentException("items.size() == 0");
    L6:
        throw new NullPointerException("items == null");
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public final void mo242a(C0100k r3) {
        Iterator r0 = this.f329f.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((AbstractC0080C) r0.next()).mo242a(r3);
        goto L4
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: b */
    public final EnumC0109t mo243b() {
        return this.f328e;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: j */
    protected final void mo239j(AbstractC0082E r8, int r9) {
        int r0 = m236g() + r9;
        Iterator r92 = this.f329f.iterator();
        int r1 = -1;
        boolean r3 = true;
        int r2 = -1;
    L4:
        if (r92.hasNext() == false) goto L16;
        AbstractC0080C r4 = (AbstractC0080C) r92.next();
        int r5 = r4.mo232c();
        if (r3 == false) goto L8;
        r3 = false;
        r2 = r4.m236g();
        r1 = r5;
    L11:
        r0 = r4.m238i(r8, r0) + r5;
        goto L4
    L8:
        if (r5 != r1) goto L15;
        if (r4.m236g() == r2) goto L11;
        throw new UnsupportedOperationException("item alignment mismatch");
    L15:
        throw new UnsupportedOperationException("item size mismatch");
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0080C
    /* JADX INFO: renamed from: l */
    protected final void mo241l(C0100k r5, C0202d r6) {
        List r0 = this.f329f;
        int r1 = r0.size();
        if (r6.m486d() == false) goto L5;
        r6.m484b(0, m237h() + " " + mo243b().mo107a());
        r6.m484b(4, "  size: ".concat(RuntimeDexGenerator.m13s(r1)));
    L5:
        r6.m497q(r1);
        Iterator r02 = r0.iterator();
    L7:
        if (r02.hasNext() == false) goto L9;
        ((AbstractC0080C) r02.next()).mo233d(r5, r6);
        goto L7
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder(100);
        r0.append(C0088K.class.getName());
        r0.append(this.f329f);
        return r0.toString();
    }
}
