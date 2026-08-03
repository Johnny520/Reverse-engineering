package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.writer.code.C0191u;

/* JADX INFO: renamed from: g.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0106q extends AbstractC0107r {

    /* JADX INFO: renamed from: b */
    private final C0191u f406b;

    public AbstractC0106q(C0191u c0191u) {
        if (c0191u == null) {
            throw new NullPointerException("type == null");
        }
        this.f406b = c0191u;
    }

    @Override // fun.box001.internal.dexformat.instructions.AbstractC0108s
    /* JADX INFO: renamed from: a */
    public void mo242a(C0100k c0100k) {
        c0100k.m307q().m333v(this.f406b);
    }

    /* JADX INFO: renamed from: i */
    public final C0191u m316i() {
        return this.f406b;
    }
}
