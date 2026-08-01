package p061L2;

import com.bumptech.glide.AbstractC1926h;
import java.util.Iterator;
import java.util.NoSuchElementException;
import me.dartcv.nuke.BuildConfig;
import p056K2.C0882h;
import p095T.AbstractC1327N;
import p095T.AbstractC1385s;
import p095T.C1318I0;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1766a;
import p132a3.C1804d;
import p143c3.C1904f;
import p149d3.AbstractC1976d;

/* JADX INFO: renamed from: L2.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0958A implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3012d;

    /* JADX INFO: renamed from: e */
    public int f3013e;

    /* JADX INFO: renamed from: f */
    public int f3014f;

    /* JADX INFO: renamed from: g */
    public int f3015g;

    /* JADX INFO: renamed from: h */
    public Object f3016h;

    /* JADX INFO: renamed from: i */
    public final Object f3017i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0958A(C0959B c0959b) {
        this.f3012d = 0;
        this.f3017i = c0959b;
        this.f3014f = c0959b.f3021g;
        this.f3015g = c0959b.f3020f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m1972a() {
        C0882h c0882h;
        C1904f c1904f = (C1904f) this.f3017i;
        CharSequence charSequence = (CharSequence) c1904f.f6474b;
        int i5 = this.f3015g;
        if (i5 < 0) {
            this.f3013e = 0;
            this.f3016h = null;
            return;
        }
        if (i5 <= charSequence.length() && (c0882h = (C0882h) ((InterfaceC1603e) c1904f.f6475c).mo0g(charSequence, Integer.valueOf(this.f3015g))) != null) {
            int iIntValue = ((Number) c0882h.f2769d).intValue();
            int iIntValue2 = ((Number) c0882h.f2770e).intValue();
            this.f3016h = AbstractC1926h.m3557J(this.f3014f, iIntValue);
            int i6 = iIntValue + iIntValue2;
            this.f3014f = i6;
            this.f3015g = i6 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f3016h = new C1804d(this.f3014f, AbstractC1976d.m3632Z(charSequence), 1);
            this.f3015g = -1;
        }
        this.f3013e = 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public boolean m1973b() {
        this.f3013e = 3;
        int i5 = this.f3014f;
        if (i5 == 0) {
            this.f3013e = 2;
        } else {
            C0959B c0959b = (C0959B) this.f3017i;
            Object[] objArr = c0959b.f3018d;
            int i6 = this.f3015g;
            this.f3016h = objArr[i6];
            this.f3013e = 1;
            this.f3015g = (i6 + 1) % c0959b.f3019e;
            this.f3014f = i5 - 1;
        }
        return this.f3013e == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3012d) {
            case 0:
                int i5 = this.f3013e;
                if (i5 == 0) {
                    return m1973b();
                }
                if (i5 == 1) {
                    return true;
                }
                if (i5 == 2) {
                    return false;
                }
                throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
            case BuildConfig.VERSION_CODE /* 1 */:
                throw null;
            default:
                if (this.f3013e == -1) {
                    m1972a();
                }
                return this.f3013e == 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f3012d) {
            case 0:
                int i5 = this.f3013e;
                if (i5 == 1) {
                    this.f3013e = 0;
                    return this.f3016h;
                }
                if (i5 == 2 || !m1973b()) {
                    throw new NoSuchElementException();
                }
                this.f3013e = 0;
                return this.f3016h;
            case BuildConfig.VERSION_CODE /* 1 */:
                throw null;
            default:
                if (this.f3013e == -1) {
                    m1972a();
                }
                if (this.f3013e == 0) {
                    throw new NoSuchElementException();
                }
                C1804d c1804d = (C1804d) this.f3016h;
                AbstractC1665j.m2983c(c1804d, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f3016h = null;
                this.f3013e = -1;
                return c1804d;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3012d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case BuildConfig.VERSION_CODE /* 1 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0958A(C1904f c1904f) {
        this.f3012d = 2;
        this.f3017i = c1904f;
        this.f3013e = -1;
        int iM3568k = AbstractC1926h.m3568k(0, 0, ((CharSequence) c1904f.f6474b).length());
        this.f3014f = iM3568k;
        this.f3015g = iM3568k;
    }

    public C0958A(C1318I0 c1318i0, int i5, AbstractC1327N abstractC1327N, AbstractC1385s abstractC1385s) {
        this.f3012d = 1;
        this.f3016h = c1318i0;
        this.f3013e = i5;
        this.f3017i = abstractC1385s;
        this.f3014f = c1318i0.f4712k;
    }
}
