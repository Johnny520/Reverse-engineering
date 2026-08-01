package p185m8;

import java.util.Iterator;
import p010a9.InterfaceC0173a;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5097o0 implements Iterable, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final InterfaceC0173a f15412q;

    public C5097o0(InterfaceC0173a interfaceC0173a) {
        interfaceC0173a.getClass();
        this.f15412q = interfaceC0173a;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C5099p0((Iterator) this.f15412q.invoke());
    }
}
