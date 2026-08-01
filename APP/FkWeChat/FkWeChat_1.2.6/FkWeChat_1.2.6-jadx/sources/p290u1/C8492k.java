package p290u1;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p265s1.AbstractC7105l3;
import p265s1.AbstractC7110m3;
import p265s1.InterfaceC7149u2;

/* JADX INFO: renamed from: u1.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8492k extends AbstractC8488g {

    /* JADX INFO: renamed from: e */
    public static final a f28346e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f28347f = 8;

    /* JADX INFO: renamed from: g */
    public static final int f28348g = AbstractC7105l3.f23607a.m27996a();

    /* JADX INFO: renamed from: h */
    public static final int f28349h = AbstractC7110m3.f23617a.m28010b();

    /* JADX INFO: renamed from: a */
    public final float f28350a;

    /* JADX INFO: renamed from: b */
    public final float f28351b;

    /* JADX INFO: renamed from: c */
    public final int f28352c;

    /* JADX INFO: renamed from: d */
    public final int f28353d;

    public /* synthetic */ C8492k(float f10, float f11, int i10, int i11, InterfaceC7149u2 interfaceC7149u2, int i12, AbstractC1043k abstractC1043k) {
        this((i12 & 1) != 0 ? 0.0f : f10, (i12 & 2) != 0 ? 4.0f : f11, (i12 & 4) != 0 ? f28348g : i10, (i12 & 8) != 0 ? f28349h : i11, (i12 & 16) != 0 ? null : interfaceC7149u2, null);
    }

    /* JADX INFO: renamed from: b */
    public final int m32666b() {
        return this.f28352c;
    }

    /* JADX INFO: renamed from: c */
    public final int m32667c() {
        return this.f28353d;
    }

    /* JADX INFO: renamed from: d */
    public final float m32668d() {
        return this.f28351b;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC7149u2 m32669e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8492k)) {
            return false;
        }
        C8492k c8492k = (C8492k) obj;
        return this.f28350a == c8492k.f28350a && this.f28351b == c8492k.f28351b && AbstractC7105l3.m27993e(this.f28352c, c8492k.f28352c) && AbstractC7110m3.m28006e(this.f28353d, c8492k.f28353d) && AbstractC1061t.m3842c(null, null);
    }

    /* JADX INFO: renamed from: f */
    public final float m32670f() {
        return this.f28350a;
    }

    public int hashCode() {
        return ((((((Float.hashCode(this.f28350a) * 31) + Float.hashCode(this.f28351b)) * 31) + AbstractC7105l3.m27994f(this.f28352c)) * 31) + AbstractC7110m3.m28007f(this.f28353d)) * 31;
    }

    public String toString() {
        return "Stroke(width=" + this.f28350a + ", miter=" + this.f28351b + ", cap=" + ((Object) AbstractC7105l3.m27995g(this.f28352c)) + ", join=" + ((Object) AbstractC7110m3.m28008g(this.f28353d)) + ", pathEffect=null)";
    }

    /* JADX INFO: renamed from: u1.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m32671a() {
            return C8492k.f28348g;
        }

        public a() {
        }
    }

    public C8492k(float f10, float f11, int i10, int i11, InterfaceC7149u2 interfaceC7149u2) {
        super(null);
        this.f28350a = f10;
        this.f28351b = f11;
        this.f28352c = i10;
        this.f28353d = i11;
    }

    public /* synthetic */ C8492k(float f10, float f11, int i10, int i11, InterfaceC7149u2 interfaceC7149u2, AbstractC1043k abstractC1043k) {
        this(f10, f11, i10, i11, interfaceC7149u2);
    }
}
