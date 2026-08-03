package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;
import fun.box001.internal.dexformat.writer.code.AbstractC0174d;
import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: g.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0115z extends AbstractC0112w {

    /* JADX INFO: renamed from: f */
    private final TreeMap f433f;

    public C0115z(C0100k r2) {
        super("method_ids", r2);
        this.f433f = new TreeMap();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: f */
    public final Collection mo225f() {
        return this.f433f.values();
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC0107r m337p(AbstractC0171a r2) {
        if (r2 == null) goto L9;
        m250j();
        AbstractC0107r r22 = (AbstractC0107r) this.f433f.get((AbstractC0174d) r2);
        if (r22 == null) goto L7;
        return r22;
    L7:
        throw new IllegalArgumentException("not found");
    L9:
        throw new NullPointerException("cst == null");
    }

    /* JADX INFO: renamed from: q */
    public final int m338q(AbstractC0174d r2) {
        if (r2 == null) goto L10;
        m250j();
        C0114y r22 = (C0114y) this.f433f.get(r2);
        if (r22 == null) goto L8;
        return r22.m317e();
    L8:
        throw new IllegalArgumentException("not found");
    L10:
        throw new NullPointerException("ref == null");
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m339r(AbstractC0174d r3) {
        monitor-enter(this);
        if (r3 == null) goto L10;
        m251k();     // Catch: Throwable -> L11
        if (((C0114y) this.f433f.get(r3)) != null) goto L7;
        C0114y r0 = new C0114y(r3);     // Catch: Throwable -> L11
        this.f433f.put(r3, r0);     // Catch: Throwable -> L11
    L7:
        monitor-exit(this);
        return;
    L10:
        throw new NullPointerException("method == null");     // Catch: Throwable -> L11
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: s */
    public final void m340s(C0202d r6) {
        m250j();
        int r0 = this.f433f.size();
        if (r0 != 0) goto L5;
        int r1 = 0;
    L7:
        if (r6.m486d() == false) goto L9;
        r6.m484b(4, "method_ids_size: ".concat(RuntimeDexGenerator.m13s(r0)));
        r6.m484b(4, "method_ids_off:  ".concat(RuntimeDexGenerator.m13s(r1)));
    L9:
        r6.m497q(r0);
        r6.m497q(r1);
        return;
    L5:
        r1 = m247e();
        goto L7
    }
}
