package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.AbstractC0203e;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexformat.writer.data.InterfaceC0197e;
import fun.box001.internal.dexmaker.AbstractC0007d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: g.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0091b extends AbstractC0087J {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f332f;

    /* JADX INFO: renamed from: g */
    private final TreeMap f333g;

    /* JADX INFO: renamed from: h */
    private Object f334h;

    public C0091b(C0100k r3, int r4) {
        this.f332f = r4;
        if (r4 == 1) goto L6;
        super("call_site_ids", r3, 4);
        this.f333g = new TreeMap();
        this.f334h = new TreeMap();
        return;
    L6:
        super("class_defs", r3, 4);
        this.f333g = new TreeMap();
        this.f334h = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private int m260q(C0195c r5, int r6, int r7) {
        C0094e r0 = (C0094e) this.f333g.get(r5);
        if (r0 != null) goto L5;
    L18:
        return r6;
    L5:
        if (r0.m318f() == true) goto L18;
        if (r7 < 0) goto L17;
        int r72 = r7 - 1;
        C0191u r52 = r0.m278l();
        if (r52 == null) goto L11;
        r6 = m260q(r52.m451g(), r6, r72);
    L11:
        InterfaceC0197e r53 = r0.m277k();
        int r1 = ((AbstractC0203e) r53).m504B();
        int r2 = 0;
    L12:
        if (r2 >= r1) goto L14;
        r6 = m260q(r53.mo403b(r2), r6, r72);
        r2 = r2 + 1;
        goto L12
    L14:
        r0.m320h(r6);
        ((ArrayList) this.f334h).add(r0);
        return r6 + 1;
    L17:
        throw new RuntimeException("class circularity with " + r5);
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: f */
    public final Collection mo225f() {
        TreeMap r0 = this.f333g;
        switch(this.f332f) {
            case 0: goto L6;
            default: goto L7;
        };
    L7:
        ArrayList r1 = (ArrayList) this.f334h;
        if (r1 == null) goto L11;
        return r1;
    L11:
        return r0.values();
    L6:
        return r0.values();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0087J
    /* JADX INFO: renamed from: o */
    protected final void mo255o() {
        TreeMap r0 = this.f333g;
        switch(this.f332f) {
            case 0: goto L5;
            default: goto L10;
        };
    L5:
        Iterator r02 = r0.values().iterator();
        if (r02.hasNext() == true) goto L8;
        return;
    L8:
        AbstractC0007d.m47a(r02.next());
        throw null;
    L10:
        int r1 = r0.size();
        this.f334h = new ArrayList(r1);
        Iterator r03 = r0.keySet().iterator();
        int r2 = 0;
    L12:
        if (r03.hasNext() == false) goto L14;
        r2 = m260q((C0195c) r03.next(), r2, r1 - r2);
        goto L12
    }

    /* JADX INFO: renamed from: p */
    public final void m261p(C0094e r4) {
        C0195c r0 = r4.m279m().m451g();     // Catch: NullPointerException -> L9
        m251k();
        TreeMap r1 = this.f333g;
        if (r1.get(r0) != null) goto L8;
        r1.put(r0, r4);
        return;
    L8:
        throw new IllegalArgumentException("already added: " + r0);
    L10:
        throw new NullPointerException("clazz == null");
    }

    /* JADX INFO: renamed from: r */
    public final void m262r(C0202d r6) {
        m250j();
        int r0 = this.f333g.size();
        if (r0 != 0) goto L5;
        int r1 = 0;
    L7:
        if (r6.m486d() == false) goto L9;
        r6.m484b(4, "class_defs_size: ".concat(RuntimeDexGenerator.m13s(r0)));
        r6.m484b(4, "class_defs_off:  ".concat(RuntimeDexGenerator.m13s(r1)));
    L9:
        r6.m497q(r0);
        r6.m497q(r1);
        return;
    L5:
        r1 = m247e();
        goto L7
    }
}
