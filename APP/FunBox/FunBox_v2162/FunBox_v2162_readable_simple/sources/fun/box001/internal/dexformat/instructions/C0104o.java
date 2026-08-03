package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.output.C0202d;
import java.util.Collection;
import java.util.TreeMap;

/* JADX INFO: renamed from: g.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0104o extends AbstractC0112w {

    /* JADX INFO: renamed from: f */
    private final TreeMap f405f;

    public C0104o(C0100k r2) {
        super("field_ids", r2);
        this.f405f = new TreeMap();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: f */
    public final Collection mo225f() {
        return this.f405f.values();
    }

    /* JADX INFO: renamed from: p */
    public final void m315p(C0202d r6) {
        m250j();
        int r0 = this.f405f.size();
        if (r0 != 0) goto L5;
        int r1 = 0;
    L7:
        if (r6.m486d() == false) goto L9;
        r6.m484b(4, "field_ids_size:  ".concat(RuntimeDexGenerator.m13s(r0)));
        r6.m484b(4, "field_ids_off:   ".concat(RuntimeDexGenerator.m13s(r1)));
    L9:
        r6.m497q(r0);
        r6.m497q(r1);
        return;
    L5:
        r1 = m247e();
        goto L7
    }
}
