package p274t;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: t.y2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7927y2 {

    /* JADX INFO: renamed from: a */
    public float f26422a;

    /* JADX INFO: renamed from: b */
    public boolean f26423b;

    /* JADX INFO: renamed from: c */
    public AbstractC7835g0 f26424c;

    public /* synthetic */ C7927y2(float f10, boolean z10, AbstractC7835g0 abstractC7835g0, AbstractC7875o0 abstractC7875o0, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? true : z10, (i10 & 4) != 0 ? null : abstractC7835g0, (i10 & 8) != 0 ? null : abstractC7875o0);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC7835g0 m30612a() {
        return this.f26424c;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m30613b() {
        return this.f26423b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC7875o0 m30614c() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final float m30615d() {
        return this.f26422a;
    }

    /* JADX INFO: renamed from: e */
    public final void m30616e(AbstractC7835g0 abstractC7835g0) {
        this.f26424c = abstractC7835g0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7927y2)) {
            return false;
        }
        C7927y2 c7927y2 = (C7927y2) obj;
        return Float.compare(this.f26422a, c7927y2.f26422a) == 0 && this.f26423b == c7927y2.f26423b && AbstractC1061t.m3842c(this.f26424c, c7927y2.f26424c) && AbstractC1061t.m3842c(null, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m30617f(boolean z10) {
        this.f26423b = z10;
    }

    /* JADX INFO: renamed from: g */
    public final void m30618g(float f10) {
        this.f26422a = f10;
    }

    public int hashCode() {
        int iHashCode = ((Float.hashCode(this.f26422a) * 31) + Boolean.hashCode(this.f26423b)) * 31;
        AbstractC7835g0 abstractC7835g0 = this.f26424c;
        return (iHashCode + (abstractC7835g0 == null ? 0 : abstractC7835g0.hashCode())) * 31;
    }

    public String toString() {
        return "RowColumnParentData(weight=" + this.f26422a + ", fill=" + this.f26423b + ", crossAxisAlignment=" + this.f26424c + ", flowLayoutData=null)";
    }

    public C7927y2(float f10, boolean z10, AbstractC7835g0 abstractC7835g0, AbstractC7875o0 abstractC7875o0) {
        this.f26422a = f10;
        this.f26423b = z10;
        this.f26424c = abstractC7835g0;
    }
}
