package p132a3;

import com.bumptech.glide.AbstractC1926h;
import java.util.Iterator;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: a3.b */
/* JADX INFO: loaded from: classes.dex */
public class C1802b implements Iterable, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final int f6140d;

    /* JADX INFO: renamed from: e */
    public final int f6141e;

    /* JADX INFO: renamed from: f */
    public final int f6142f;

    public C1802b(int i5, int i6, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i7 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f6140d = i5;
        this.f6141e = AbstractC1926h.m3576s(i5, i6, i7);
        this.f6142f = i7;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1802b)) {
            return false;
        }
        if (isEmpty() && ((C1802b) obj).isEmpty()) {
            return true;
        }
        C1802b c1802b = (C1802b) obj;
        return this.f6140d == c1802b.f6140d && this.f6141e == c1802b.f6141e && this.f6142f == c1802b.f6142f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6140d * 31) + this.f6141e) * 31) + this.f6142f;
    }

    public boolean isEmpty() {
        int i5 = this.f6142f;
        int i6 = this.f6141e;
        int i7 = this.f6140d;
        return i5 > 0 ? i7 > i6 : i7 < i6;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1803c(this.f6140d, this.f6141e, this.f6142f);
    }

    public String toString() {
        StringBuilder sb;
        int i5 = this.f6141e;
        int i6 = this.f6140d;
        int i7 = this.f6142f;
        if (i7 > 0) {
            sb = new StringBuilder();
            sb.append(i6);
            sb.append("..");
            sb.append(i5);
            sb.append(" step ");
            sb.append(i7);
        } else {
            sb = new StringBuilder();
            sb.append(i6);
            sb.append(" downTo ");
            sb.append(i5);
            sb.append(" step ");
            sb.append(-i7);
        }
        return sb.toString();
    }
}
