package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m20 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0260gg f3126a;

    public m20(C0260gg c0260gg) {
        this.f3126a = c0260gg;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0223fg(this.f3126a);
    }
}
