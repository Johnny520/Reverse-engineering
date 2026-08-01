package p028c1;

import java.util.Iterator;
import p024b9.AbstractC1064u0;
import p036c9.InterfaceC1400a;
import p117i.C3039b;

/* JADX INFO: renamed from: c1.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1307e extends C1306d implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: t */
    public final C1305c f3920t;

    /* JADX INFO: renamed from: u */
    public Object f3921u;

    /* JADX INFO: renamed from: v */
    public boolean f3922v;

    /* JADX INFO: renamed from: w */
    public int f3923w;

    public C1307e(C1305c c1305c) {
        super(c1305c.m5260c(), c1305c.m5261e());
        this.f3920t = c1305c;
        this.f3923w = c1305c.m5261e().m3339l();
    }

    /* JADX INFO: renamed from: v */
    private final void m5265v() {
        if (this.f3920t.m5261e().m3339l() == this.f3923w) {
            return;
        }
        C3039b.m11232a();
    }

    /* JADX INFO: renamed from: x */
    private final void m5266x() {
        if (!this.f3922v) {
            throw new IllegalStateException();
        }
    }

    @Override // p028c1.C1306d, java.util.Iterator
    public Object next() {
        m5265v();
        Object next = super.next();
        this.f3921u = next;
        this.f3922v = true;
        return next;
    }

    @Override // p028c1.C1306d, java.util.Iterator
    public void remove() {
        m5266x();
        AbstractC1064u0.m3853a(this.f3920t).remove(this.f3921u);
        this.f3921u = null;
        this.f3922v = false;
        this.f3923w = this.f3920t.m5261e().m3339l();
        m5264o(m5263l() - 1);
    }
}
