package yyds;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛳᛲᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0533 implements Iterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1406 f2562;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f2563;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f2564;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int f2565 = -1;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C2807 f2566;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public int f2567;

    public C0533(C1406 c1406) {
        this.f2562 = c1406;
        int iM1487 = AbstractC0598.m1487(0, 0, c1406.f6657.length());
        this.f2567 = iM1487;
        this.f2563 = iM1487;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f2565 == -1) {
            m1371();
        }
        return this.f2565 == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f2565 == -1) {
            m1371();
        }
        if (this.f2565 == 0) {
            throw new NoSuchElementException();
        }
        C2807 c2807 = this.f2566;
        this.f2566 = null;
        this.f2565 = -1;
        return c2807;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1371() {
        Pair pair;
        C1406 c1406 = this.f2562;
        CharSequence charSequence = c1406.f6657;
        int i = this.f2563;
        if (i < 0) {
            this.f2565 = 0;
            this.f2566 = null;
            return;
        }
        int i2 = c1406.f6658;
        if (i2 > 0) {
            int i3 = this.f2564 + 1;
            this.f2564 = i3;
            if (i3 >= i2) {
                this.f2566 = new C2807(this.f2567, AbstractC0473.m1300(charSequence), 1);
                this.f2563 = -1;
            } else if (i <= charSequence.length() && (pair = (Pair) c1406.f6659.mo511(charSequence, Integer.valueOf(this.f2563))) != null) {
                int iIntValue = ((Number) pair.component1()).intValue();
                int iIntValue2 = ((Number) pair.component2()).intValue();
                this.f2566 = AbstractC0598.m1485(this.f2567, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.f2567 = i4;
                this.f2563 = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.f2566 = new C2807(this.f2567, AbstractC0473.m1300(charSequence), 1);
                this.f2563 = -1;
            }
        }
        this.f2565 = 1;
    }
}
