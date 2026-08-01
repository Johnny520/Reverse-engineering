package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class t20 implements Iterable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0297hg f4391a;

    public t20(C0297hg c0297hg) {
        this.f4391a = c0297hg;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0260gg(this.f4391a);
    }
}
