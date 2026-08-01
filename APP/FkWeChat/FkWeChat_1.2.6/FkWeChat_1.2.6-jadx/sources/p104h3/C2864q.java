package p104h3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: h3.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2864q {

    /* JADX INFO: renamed from: c */
    public static final a f7498c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final C2864q f7499d = new C2864q(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f7500a;

    /* JADX INFO: renamed from: b */
    public final float f7501b;

    public C2864q(float f10, float f11) {
        this.f7500a = f10;
        this.f7501b = f11;
    }

    /* JADX INFO: renamed from: b */
    public final float m10271b() {
        return this.f7500a;
    }

    /* JADX INFO: renamed from: c */
    public final float m10272c() {
        return this.f7501b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2864q)) {
            return false;
        }
        C2864q c2864q = (C2864q) obj;
        return this.f7500a == c2864q.f7500a && this.f7501b == c2864q.f7501b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f7500a) * 31) + Float.hashCode(this.f7501b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f7500a + ", skewX=" + this.f7501b + ')';
    }

    /* JADX INFO: renamed from: h3.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2864q m10273a() {
            return C2864q.f7499d;
        }

        public a() {
        }
    }
}
