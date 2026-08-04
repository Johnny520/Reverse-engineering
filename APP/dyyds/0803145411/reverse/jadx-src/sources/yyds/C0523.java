package yyds;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: yyds.ᛳᛱᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0523 extends AbstractC1865 implements Iterator, InterfaceC0527 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2519;

    public C0523(C0728 c0728, int i) {
        this.f2519 = i;
        this.f9366 = c0728;
        this.f9367 = -1;
        this.f9364 = c0728.f3405;
        m3644();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2519) {
            case 0:
                m3647();
                int i = this.f9365;
                C0728 c0728 = (C0728) this.f9366;
                if (i >= c0728.f3397) {
                    throw new NoSuchElementException();
                }
                this.f9365 = i + 1;
                this.f9367 = i;
                C2303 c2303 = new C2303(c0728, i);
                m3644();
                return c2303;
            case 1:
                m3647();
                int i2 = this.f9365;
                C0728 c07282 = (C0728) this.f9366;
                if (i2 >= c07282.f3397) {
                    throw new NoSuchElementException();
                }
                this.f9365 = i2 + 1;
                this.f9367 = i2;
                Object obj = c07282.f3406[i2];
                m3644();
                return obj;
            default:
                m3647();
                int i3 = this.f9365;
                C0728 c07283 = (C0728) this.f9366;
                if (i3 >= c07283.f3397) {
                    throw new NoSuchElementException();
                }
                this.f9365 = i3 + 1;
                this.f9367 = i3;
                Object obj2 = c07283.f3408[i3];
                m3644();
                return obj2;
        }
    }
}
