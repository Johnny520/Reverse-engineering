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

    public C0104o(C0100k c0100k) {
        super("field_ids", c0100k);
        this.f405f = new TreeMap();
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0082E
    /* JADX INFO: renamed from: f */
    public final Collection mo225f() {
        return this.f405f.values();
    }

    /* JADX INFO: renamed from: p */
    public final void m315p(C0202d c0202d) {
        m250j();
        int size = this.f405f.size();
        int iM247e = size == 0 ? 0 : m247e();
        if (c0202d.m486d()) {
            c0202d.m484b(4, "field_ids_size:  ".concat(RuntimeDexGenerator.m13s(size)));
            c0202d.m484b(4, "field_ids_off:   ".concat(RuntimeDexGenerator.m13s(iM247e)));
        }
        c0202d.m497q(size);
        c0202d.m497q(iM247e);
    }
}
