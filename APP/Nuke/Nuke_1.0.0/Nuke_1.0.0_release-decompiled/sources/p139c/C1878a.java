package p139c;

import com.bumptech.glide.AbstractC1926h;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1878a extends AbstractC1926h {

    /* JADX INFO: renamed from: b */
    public final Object f6395b;

    /* JADX INFO: renamed from: c */
    public final long f6396c;

    public C1878a(long j5, Object obj) {
        this.f6395b = obj;
        this.f6396c = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1878a)) {
            return false;
        }
        C1878a c1878a = (C1878a) obj;
        return AbstractC1665j.m2981a(this.f6395b, c1878a.f6395b) && this.f6396c == c1878a.f6396c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6396c) + (this.f6395b.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.f6395b + ", compositeKey=" + this.f6396c + ')';
    }
}
