package yyds;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛸᛴ */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0025 implements Iterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C2722 f8808;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Object f8809;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f8810 = -2;

    public C0025(C2722 c2722) {
        this.f8808 = c2722;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f8810 < 0) {
            m3486();
        }
        return this.f8810 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f8810 < 0) {
            m3486();
        }
        if (this.f8810 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f8809;
        this.f8810 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m3486() {
        int i = this.f8810;
        C2722 c2722 = this.f8808;
        Object objMo731 = i == -2 ? ((C1223) c2722.f13374).mo731() : c2722.f13373.mo371(this.f8809);
        this.f8809 = objMo731;
        this.f8810 = objMo731 == null ? 0 : 1;
    }
}
