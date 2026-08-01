package p358y9;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.C4701j;

/* JADX INFO: renamed from: y9.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9614c0 {

    /* JADX INFO: renamed from: d */
    public static final a f32734d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final C9614c0 f32735e = new C9614c0(EnumC9638o0.f32829u, null, null, 6, null);

    /* JADX INFO: renamed from: a */
    public final EnumC9638o0 f32736a;

    /* JADX INFO: renamed from: b */
    public final C4701j f32737b;

    /* JADX INFO: renamed from: c */
    public final EnumC9638o0 f32738c;

    public /* synthetic */ C9614c0(EnumC9638o0 enumC9638o0, C4701j c4701j, EnumC9638o0 enumC9638o02, int i10, AbstractC1043k abstractC1043k) {
        this(enumC9638o0, (i10 & 2) != 0 ? new C4701j(1, 0) : c4701j, (i10 & 4) != 0 ? enumC9638o0 : enumC9638o02);
    }

    /* JADX INFO: renamed from: b */
    public final EnumC9638o0 m37612b() {
        return this.f32738c;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC9638o0 m37613c() {
        return this.f32736a;
    }

    /* JADX INFO: renamed from: d */
    public final C4701j m37614d() {
        return this.f32737b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9614c0)) {
            return false;
        }
        C9614c0 c9614c0 = (C9614c0) obj;
        return this.f32736a == c9614c0.f32736a && AbstractC1061t.m3842c(this.f32737b, c9614c0.f32737b) && this.f32738c == c9614c0.f32738c;
    }

    public int hashCode() {
        int iHashCode = this.f32736a.hashCode() * 31;
        C4701j c4701j = this.f32737b;
        return ((iHashCode + (c4701j == null ? 0 : c4701j.hashCode())) * 31) + this.f32738c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f32736a + ", sinceVersion=" + this.f32737b + ", reportLevelAfter=" + this.f32738c + ')';
    }

    /* JADX INFO: renamed from: y9.c0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C9614c0 m37615a() {
            return C9614c0.f32735e;
        }

        public a() {
        }
    }

    public C9614c0(EnumC9638o0 enumC9638o0, C4701j c4701j, EnumC9638o0 enumC9638o02) {
        enumC9638o0.getClass();
        enumC9638o02.getClass();
        this.f32736a = enumC9638o0;
        this.f32737b = c4701j;
        this.f32738c = enumC9638o02;
    }
}
