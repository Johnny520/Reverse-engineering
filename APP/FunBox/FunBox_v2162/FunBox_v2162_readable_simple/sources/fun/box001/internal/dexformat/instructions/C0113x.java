package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.C0002c;
import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.C0190t;
import fun.box001.internal.dexformat.writer.code.C0191u;
import fun.box001.internal.dexformat.writer.data.C0193a;
import fun.box001.internal.dexformat.writer.data.C0195c;
import fun.box001.internal.dexmaker.AbstractC0007d;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: renamed from: g.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0113x extends AbstractC0087J {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f431f;

    /* JADX INFO: renamed from: g */
    private final Object f432g;

    public C0113x(C0100k r3, int r4) {
        this.f431f = r4;
        if (r4 != 1) goto L5;
        super("proto_ids", r3, 4);
        this.f432g = new TreeMap();
        return;
    L5:
        if (r4 != 2) goto L7;
        super("string_ids", r3, 4);
        this.f432g = new TreeMap();
        return;
    L7:
        if (r4 == 3) goto L13;
        if (r4 == 4) goto L11;
        super("method_handles", r3, 8);
        this.f432g = new TreeMap();
        return;
    L11:
        super(null, r3, 4);
        C0105p r32 = new C0105p();
        r32.m320h(0);
        this.f432g = Collections.singletonList(r32);
        return;
    L13:
        super("type_ids", r3, 4);
        this.f432g = new TreeMap();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: f */
    public final Collection mo225f() {
        int r0 = this.f431f;
        Object r1 = this.f432g;
        switch(r0) {
            case 0: goto L12;
            case 1: goto L10;
            case 2: goto L8;
            case 3: goto L6;
            default: goto L14;
        };
    L6:
        return ((TreeMap) r1).values();
    L8:
        return ((TreeMap) r1).values();
    L10:
        return ((TreeMap) r1).values();
    L12:
        return ((TreeMap) r1).values();
    L14:
        return (List) r1;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0087J
    /* JADX INFO: renamed from: o */
    protected final void mo255o() {
        int r0 = this.f431f;
        Object r1 = this.f432g;
        int r2 = 0;
        switch(r0) {
            case 0: goto L20;
            case 1: goto L15;
            case 2: goto L10;
            case 3: goto L5;
            default: goto L4;
        };
    L4:
        return;
    L5:
        Iterator r02 = mo225f().iterator();
    L7:
        if (r02.hasNext() == false) goto L9;
        ((C0085H) r02.next()).m320h(r2);
        r2 = r2 + 1;
        goto L7
    L9:
        return;
    L10:
        Iterator r03 = ((TreeMap) r1).values().iterator();
    L12:
        if (r03.hasNext() == false) goto L14;
        ((C0084G) r03.next()).m320h(r2);
        r2 = r2 + 1;
        goto L12
    L14:
        return;
    L15:
        Iterator r04 = mo225f().iterator();
    L17:
        if (r04.hasNext() == false) goto L19;
        ((C0081D) r04.next()).m320h(r2);
        r2 = r2 + 1;
        goto L17
    L19:
        return;
    L20:
        Iterator r05 = ((TreeMap) r1).values().iterator();
        if (r05.hasNext() == true) goto L23;
        return;
    L23:
        AbstractC0007d.m47a(r05.next());
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC0107r m327p(AbstractC0171a r5) {
        int r0 = this.f431f;
        Object r2 = this.f432g;
        switch(r0) {
            case 0: goto L18;
            case 1: goto L13;
            case 2: goto L5;
            default: goto L26;
        };
    L5:
        if (r5 == null) goto L12;
        m250j();
        AbstractC0107r r52 = (AbstractC0107r) ((TreeMap) r2).get((C0190t) r5);
        if (r52 == null) goto L10;
        return r52;
    L10:
        throw new IllegalArgumentException("not found");
    L12:
        throw new NullPointerException("cst == null");
    L13:
        if (r5 == null) goto L17;
        throw new IllegalArgumentException("cst not instance of CstProtoRef");
    L17:
        throw new NullPointerException("cst == null");
    L18:
        if (r5 == null) goto L25;
        m250j();
        AbstractC0007d.m47a(r5);
        AbstractC0107r r53 = (AbstractC0107r) ((TreeMap) r2).get(null);
        if (r53 == null) goto L23;
        return r53;
    L23:
        throw new IllegalArgumentException("not found");
    L25:
        throw new NullPointerException("cst == null");
    L26:
        if (r5 == null) goto L33;
        m250j();
        AbstractC0107r r02 = (AbstractC0107r) ((TreeMap) r2).get(((C0191u) r5).m451g());
        if (r02 == null) goto L31;
        return r02;
    L31:
        throw new IllegalArgumentException("not found: " + r5);
    L33:
        throw new NullPointerException("cst == null");
    }

    /* JADX INFO: renamed from: q */
    public final int m328q(C0190t r2) {
        if (r2 == null) goto L10;
        m250j();
        C0084G r22 = (C0084G) ((TreeMap) this.f432g).get(r2);
        if (r22 == null) goto L8;
        return r22.m317e();
    L8:
        throw new IllegalArgumentException("not found");
    L10:
        throw new NullPointerException("string == null");
    }

    /* JADX INFO: renamed from: r */
    public final int m329r(C0191u r2) {
        if (r2 == null) goto L6;
        return m331t(r2.m451g());
    L6:
        throw new NullPointerException("type == null");
    }

    /* JADX INFO: renamed from: s */
    public final int m330s(C0193a r2) {
        if (r2 == null) goto L10;
        m250j();
        C0081D r22 = (C0081D) ((TreeMap) this.f432g).get(r2);
        if (r22 == null) goto L8;
        return r22.m317e();
    L8:
        throw new IllegalArgumentException("not found");
    L10:
        throw new NullPointerException("prototype == null");
    }

    /* JADX INFO: renamed from: t */
    public final int m331t(C0195c r4) {
        if (r4 == null) goto L10;
        m250j();
        C0085H r0 = (C0085H) ((TreeMap) this.f432g).get(r4);
        if (r0 == null) goto L8;
        return r0.m317e();
    L8:
        throw new IllegalArgumentException("not found: " + r4);
    L10:
        throw new NullPointerException("type == null");
    }

    /* JADX INFO: renamed from: u */
    public final void m332u(C0190t r3) {
        C0084G r0 = new C0084G(r3);
        monitor-enter(this);
        m251k();     // Catch: Throwable -> L11
        C0190t r32 = r0.m253i();     // Catch: Throwable -> L11
        if (((C0084G) ((TreeMap) this.f432g).get(r32)) == null) goto L8;
    L6:
        monitor-exit(this);
        return;
    L8:
        ((TreeMap) this.f432g).put(r32, r0);     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: v */
    public final synchronized void m333v(C0191u r3) {
        monitor-enter(this);
        if (r3 == null) goto L10;
        m251k();     // Catch: Throwable -> L11
        C0195c r0 = r3.m451g();     // Catch: Throwable -> L11
        if (((C0085H) ((TreeMap) this.f432g).get(r0)) != null) goto L7;
        C0085H r1 = new C0085H(r3);     // Catch: Throwable -> L11
        ((TreeMap) this.f432g).put(r0, r1);     // Catch: Throwable -> L11
    L7:
        monitor-exit(this);
        return;
    L10:
        throw new NullPointerException("type == null");     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: w */
    public final synchronized void m334w(C0193a r3) {
        monitor-enter(this);
        if (r3 == null) goto L10;
        m251k();     // Catch: Throwable -> L11
        if (((C0081D) ((TreeMap) this.f432g).get(r3)) != null) goto L7;
        C0081D r0 = new C0081D(r3);     // Catch: Throwable -> L11
        ((TreeMap) this.f432g).put(r3, r0);     // Catch: Throwable -> L11
    L7:
        monitor-exit(this);
        return;
    L10:
        throw new NullPointerException("prototype == null");     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: x */
    public final synchronized void m335x(C0195c r3) {
        monitor-enter(this);
        if (r3 == null) goto L10;
        m251k();     // Catch: Throwable -> L11
        if (((C0085H) ((TreeMap) this.f432g).get(r3)) != null) goto L7;
        C0085H r0 = new C0085H(new C0191u(r3));     // Catch: Throwable -> L11
        ((TreeMap) this.f432g).put(r3, r0);     // Catch: Throwable -> L11
    L7:
        monitor-exit(this);
        return;
    L10:
        throw new NullPointerException("type == null");     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: y */
    public final void m336y(C0202d r6) {
        int r0 = this.f431f;
        int r3 = 0;
        Object r4 = this.f432g;
        switch(r0) {
            case 1: goto L14;
            case 2: goto L5;
            default: goto L26;
        };
    L5:
        m250j();
        int r02 = ((TreeMap) r4).size();
        if (r02 == 0) goto L10;
        r3 = m247e();
    L10:
        if (r6.m486d() == false) goto L12;
        r6.m484b(4, "string_ids_size: ".concat(RuntimeDexGenerator.m13s(r02)));
        r6.m484b(4, "string_ids_off:  ".concat(RuntimeDexGenerator.m13s(r3)));
    L12:
        r6.m497q(r02);
        r6.m497q(r3);
        return;
    L14:
        m250j();
        int r03 = ((TreeMap) r4).size();
        if (r03 == 0) goto L18;
        r3 = m247e();
    L18:
        if (r03 > 65536) goto L25;
        if (r6.m486d() == false) goto L22;
        r6.m484b(4, "proto_ids_size:  ".concat(RuntimeDexGenerator.m13s(r03)));
        r6.m484b(4, "proto_ids_off:   ".concat(RuntimeDexGenerator.m13s(r3)));
    L22:
        r6.m497q(r03);
        r6.m497q(r3);
        return;
    L25:
        throw new UnsupportedOperationException("too many proto ids");
    L26:
        m250j();
        int r04 = ((TreeMap) r4).size();
        if (r04 == 0) goto L30;
        r3 = m247e();
    L30:
        if (r04 > 65536) goto L37;
        if (r6.m486d() == false) goto L34;
        r6.m484b(4, "type_ids_size:   ".concat(RuntimeDexGenerator.m13s(r04)));
        r6.m484b(4, "type_ids_off:    ".concat(RuntimeDexGenerator.m13s(r3)));
    L34:
        r6.m497q(r04);
        r6.m497q(r3);
        return;
    L37:
        throw new C0002c(String.format("Too many type identifiers to fit in one dex file: %1$d; max is %2$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.", new Object[]{Integer.valueOf(mo225f().size()), 65536}));
    }
}
