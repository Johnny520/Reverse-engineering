package p143c3;

import java.util.Iterator;
import p061L2.C0962b;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: c3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1900b implements InterfaceC1905g, InterfaceC1901c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1905g f6466a;

    /* JADX INFO: renamed from: b */
    public final int f6467b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1900b(InterfaceC1905g interfaceC1905g, int i5) {
        AbstractC1665j.m2985e(interfaceC1905g, "sequence");
        this.f6466a = interfaceC1905g;
        this.f6467b = i5;
        if (i5 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i5 + '.').toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p143c3.InterfaceC1901c
    /* JADX INFO: renamed from: a */
    public final InterfaceC1905g mo3388a(int i5) {
        int i6 = this.f6467b + i5;
        return i6 < 0 ? new C1900b(this, i5) : new C1900b(this.f6466a, i6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p143c3.InterfaceC1905g
    public final Iterator iterator() {
        return new C0962b(this);
    }
}
