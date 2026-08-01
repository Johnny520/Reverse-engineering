package p350y1;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: y1.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9520h {

    /* JADX INFO: renamed from: a */
    public final boolean f32405a;

    /* JADX INFO: renamed from: b */
    public final boolean f32406b;

    /* JADX INFO: renamed from: y1.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32407c;

        /* JADX INFO: renamed from: d */
        public final float f32408d;

        /* JADX INFO: renamed from: e */
        public final float f32409e;

        /* JADX INFO: renamed from: f */
        public final boolean f32410f;

        /* JADX INFO: renamed from: g */
        public final boolean f32411g;

        /* JADX INFO: renamed from: h */
        public final float f32412h;

        /* JADX INFO: renamed from: i */
        public final float f32413i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f32407c = f10;
            this.f32408d = f11;
            this.f32409e = f12;
            this.f32410f = z10;
            this.f32411g = z11;
            this.f32412h = f13;
            this.f32413i = f14;
        }

        /* JADX INFO: renamed from: c */
        public final float m37183c() {
            return this.f32412h;
        }

        /* JADX INFO: renamed from: d */
        public final float m37184d() {
            return this.f32413i;
        }

        /* JADX INFO: renamed from: e */
        public final float m37185e() {
            return this.f32407c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f32407c, aVar.f32407c) == 0 && Float.compare(this.f32408d, aVar.f32408d) == 0 && Float.compare(this.f32409e, aVar.f32409e) == 0 && this.f32410f == aVar.f32410f && this.f32411g == aVar.f32411g && Float.compare(this.f32412h, aVar.f32412h) == 0 && Float.compare(this.f32413i, aVar.f32413i) == 0;
        }

        /* JADX INFO: renamed from: f */
        public final float m37186f() {
            return this.f32409e;
        }

        /* JADX INFO: renamed from: g */
        public final float m37187g() {
            return this.f32408d;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m37188h() {
            return this.f32410f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f32407c) * 31) + Float.hashCode(this.f32408d)) * 31) + Float.hashCode(this.f32409e)) * 31) + Boolean.hashCode(this.f32410f)) * 31) + Boolean.hashCode(this.f32411g)) * 31) + Float.hashCode(this.f32412h)) * 31) + Float.hashCode(this.f32413i);
        }

        /* JADX INFO: renamed from: i */
        public final boolean m37189i() {
            return this.f32411g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f32407c + ", verticalEllipseRadius=" + this.f32408d + ", theta=" + this.f32409e + ", isMoreThanHalf=" + this.f32410f + ", isPositiveArc=" + this.f32411g + ", arcStartX=" + this.f32412h + ", arcStartY=" + this.f32413i + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public static final b f32414c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    /* JADX INFO: renamed from: y1.h$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32415c;

        /* JADX INFO: renamed from: d */
        public final float f32416d;

        /* JADX INFO: renamed from: e */
        public final float f32417e;

        /* JADX INFO: renamed from: f */
        public final float f32418f;

        /* JADX INFO: renamed from: g */
        public final float f32419g;

        /* JADX INFO: renamed from: h */
        public final float f32420h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f32415c = f10;
            this.f32416d = f11;
            this.f32417e = f12;
            this.f32418f = f13;
            this.f32419g = f14;
            this.f32420h = f15;
        }

        /* JADX INFO: renamed from: c */
        public final float m37190c() {
            return this.f32415c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37191d() {
            return this.f32417e;
        }

        /* JADX INFO: renamed from: e */
        public final float m37192e() {
            return this.f32419g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f32415c, cVar.f32415c) == 0 && Float.compare(this.f32416d, cVar.f32416d) == 0 && Float.compare(this.f32417e, cVar.f32417e) == 0 && Float.compare(this.f32418f, cVar.f32418f) == 0 && Float.compare(this.f32419g, cVar.f32419g) == 0 && Float.compare(this.f32420h, cVar.f32420h) == 0;
        }

        /* JADX INFO: renamed from: f */
        public final float m37193f() {
            return this.f32416d;
        }

        /* JADX INFO: renamed from: g */
        public final float m37194g() {
            return this.f32418f;
        }

        /* JADX INFO: renamed from: h */
        public final float m37195h() {
            return this.f32420h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f32415c) * 31) + Float.hashCode(this.f32416d)) * 31) + Float.hashCode(this.f32417e)) * 31) + Float.hashCode(this.f32418f)) * 31) + Float.hashCode(this.f32419g)) * 31) + Float.hashCode(this.f32420h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f32415c + ", y1=" + this.f32416d + ", x2=" + this.f32417e + ", y2=" + this.f32418f + ", x3=" + this.f32419g + ", y3=" + this.f32420h + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32421c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f32421c = f10;
        }

        /* JADX INFO: renamed from: c */
        public final float m37196c() {
            return this.f32421c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f32421c, ((d) obj).f32421c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f32421c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f32421c + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32422c;

        /* JADX INFO: renamed from: d */
        public final float f32423d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f32422c = f10;
            this.f32423d = f11;
        }

        /* JADX INFO: renamed from: c */
        public final float m37197c() {
            return this.f32422c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37198d() {
            return this.f32423d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f32422c, eVar.f32422c) == 0 && Float.compare(this.f32423d, eVar.f32423d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32422c) * 31) + Float.hashCode(this.f32423d);
        }

        public String toString() {
            return "LineTo(x=" + this.f32422c + ", y=" + this.f32423d + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32424c;

        /* JADX INFO: renamed from: d */
        public final float f32425d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f32424c = f10;
            this.f32425d = f11;
        }

        /* JADX INFO: renamed from: c */
        public final float m37199c() {
            return this.f32424c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37200d() {
            return this.f32425d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f32424c, fVar.f32424c) == 0 && Float.compare(this.f32425d, fVar.f32425d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32424c) * 31) + Float.hashCode(this.f32425d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f32424c + ", y=" + this.f32425d + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class g extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32426c;

        /* JADX INFO: renamed from: d */
        public final float f32427d;

        /* JADX INFO: renamed from: e */
        public final float f32428e;

        /* JADX INFO: renamed from: f */
        public final float f32429f;

        public g(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f32426c = f10;
            this.f32427d = f11;
            this.f32428e = f12;
            this.f32429f = f13;
        }

        /* JADX INFO: renamed from: c */
        public final float m37201c() {
            return this.f32426c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37202d() {
            return this.f32428e;
        }

        /* JADX INFO: renamed from: e */
        public final float m37203e() {
            return this.f32427d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f32426c, gVar.f32426c) == 0 && Float.compare(this.f32427d, gVar.f32427d) == 0 && Float.compare(this.f32428e, gVar.f32428e) == 0 && Float.compare(this.f32429f, gVar.f32429f) == 0;
        }

        /* JADX INFO: renamed from: f */
        public final float m37204f() {
            return this.f32429f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f32426c) * 31) + Float.hashCode(this.f32427d)) * 31) + Float.hashCode(this.f32428e)) * 31) + Float.hashCode(this.f32429f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f32426c + ", y1=" + this.f32427d + ", x2=" + this.f32428e + ", y2=" + this.f32429f + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$h */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class h extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32430c;

        /* JADX INFO: renamed from: d */
        public final float f32431d;

        /* JADX INFO: renamed from: e */
        public final float f32432e;

        /* JADX INFO: renamed from: f */
        public final float f32433f;

        public h(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f32430c = f10;
            this.f32431d = f11;
            this.f32432e = f12;
            this.f32433f = f13;
        }

        /* JADX INFO: renamed from: c */
        public final float m37205c() {
            return this.f32430c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37206d() {
            return this.f32432e;
        }

        /* JADX INFO: renamed from: e */
        public final float m37207e() {
            return this.f32431d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Float.compare(this.f32430c, hVar.f32430c) == 0 && Float.compare(this.f32431d, hVar.f32431d) == 0 && Float.compare(this.f32432e, hVar.f32432e) == 0 && Float.compare(this.f32433f, hVar.f32433f) == 0;
        }

        /* JADX INFO: renamed from: f */
        public final float m37208f() {
            return this.f32433f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f32430c) * 31) + Float.hashCode(this.f32431d)) * 31) + Float.hashCode(this.f32432e)) * 31) + Float.hashCode(this.f32433f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f32430c + ", y1=" + this.f32431d + ", x2=" + this.f32432e + ", y2=" + this.f32433f + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$i */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class i extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32434c;

        /* JADX INFO: renamed from: d */
        public final float f32435d;

        public i(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f32434c = f10;
            this.f32435d = f11;
        }

        /* JADX INFO: renamed from: c */
        public final float m37209c() {
            return this.f32434c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37210d() {
            return this.f32435d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f32434c, iVar.f32434c) == 0 && Float.compare(this.f32435d, iVar.f32435d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32434c) * 31) + Float.hashCode(this.f32435d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f32434c + ", y=" + this.f32435d + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$j */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class j extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32436c;

        /* JADX INFO: renamed from: d */
        public final float f32437d;

        /* JADX INFO: renamed from: e */
        public final float f32438e;

        /* JADX INFO: renamed from: f */
        public final boolean f32439f;

        /* JADX INFO: renamed from: g */
        public final boolean f32440g;

        /* JADX INFO: renamed from: h */
        public final float f32441h;

        /* JADX INFO: renamed from: i */
        public final float f32442i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f32436c = f10;
            this.f32437d = f11;
            this.f32438e = f12;
            this.f32439f = z10;
            this.f32440g = z11;
            this.f32441h = f13;
            this.f32442i = f14;
        }

        /* JADX INFO: renamed from: c */
        public final float m37211c() {
            return this.f32441h;
        }

        /* JADX INFO: renamed from: d */
        public final float m37212d() {
            return this.f32442i;
        }

        /* JADX INFO: renamed from: e */
        public final float m37213e() {
            return this.f32436c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f32436c, jVar.f32436c) == 0 && Float.compare(this.f32437d, jVar.f32437d) == 0 && Float.compare(this.f32438e, jVar.f32438e) == 0 && this.f32439f == jVar.f32439f && this.f32440g == jVar.f32440g && Float.compare(this.f32441h, jVar.f32441h) == 0 && Float.compare(this.f32442i, jVar.f32442i) == 0;
        }

        /* JADX INFO: renamed from: f */
        public final float m37214f() {
            return this.f32438e;
        }

        /* JADX INFO: renamed from: g */
        public final float m37215g() {
            return this.f32437d;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m37216h() {
            return this.f32439f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f32436c) * 31) + Float.hashCode(this.f32437d)) * 31) + Float.hashCode(this.f32438e)) * 31) + Boolean.hashCode(this.f32439f)) * 31) + Boolean.hashCode(this.f32440g)) * 31) + Float.hashCode(this.f32441h)) * 31) + Float.hashCode(this.f32442i);
        }

        /* JADX INFO: renamed from: i */
        public final boolean m37217i() {
            return this.f32440g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f32436c + ", verticalEllipseRadius=" + this.f32437d + ", theta=" + this.f32438e + ", isMoreThanHalf=" + this.f32439f + ", isPositiveArc=" + this.f32440g + ", arcStartDx=" + this.f32441h + ", arcStartDy=" + this.f32442i + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$k */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class k extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32443c;

        /* JADX INFO: renamed from: d */
        public final float f32444d;

        /* JADX INFO: renamed from: e */
        public final float f32445e;

        /* JADX INFO: renamed from: f */
        public final float f32446f;

        /* JADX INFO: renamed from: g */
        public final float f32447g;

        /* JADX INFO: renamed from: h */
        public final float f32448h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f32443c = f10;
            this.f32444d = f11;
            this.f32445e = f12;
            this.f32446f = f13;
            this.f32447g = f14;
            this.f32448h = f15;
        }

        /* JADX INFO: renamed from: c */
        public final float m37218c() {
            return this.f32443c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37219d() {
            return this.f32445e;
        }

        /* JADX INFO: renamed from: e */
        public final float m37220e() {
            return this.f32447g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f32443c, kVar.f32443c) == 0 && Float.compare(this.f32444d, kVar.f32444d) == 0 && Float.compare(this.f32445e, kVar.f32445e) == 0 && Float.compare(this.f32446f, kVar.f32446f) == 0 && Float.compare(this.f32447g, kVar.f32447g) == 0 && Float.compare(this.f32448h, kVar.f32448h) == 0;
        }

        /* JADX INFO: renamed from: f */
        public final float m37221f() {
            return this.f32444d;
        }

        /* JADX INFO: renamed from: g */
        public final float m37222g() {
            return this.f32446f;
        }

        /* JADX INFO: renamed from: h */
        public final float m37223h() {
            return this.f32448h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f32443c) * 31) + Float.hashCode(this.f32444d)) * 31) + Float.hashCode(this.f32445e)) * 31) + Float.hashCode(this.f32446f)) * 31) + Float.hashCode(this.f32447g)) * 31) + Float.hashCode(this.f32448h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f32443c + ", dy1=" + this.f32444d + ", dx2=" + this.f32445e + ", dy2=" + this.f32446f + ", dx3=" + this.f32447g + ", dy3=" + this.f32448h + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$l */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class l extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32449c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f32449c = f10;
        }

        /* JADX INFO: renamed from: c */
        public final float m37224c() {
            return this.f32449c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f32449c, ((l) obj).f32449c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f32449c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f32449c + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$m */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class m extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32450c;

        /* JADX INFO: renamed from: d */
        public final float f32451d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f32450c = f10;
            this.f32451d = f11;
        }

        /* JADX INFO: renamed from: c */
        public final float m37225c() {
            return this.f32450c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37226d() {
            return this.f32451d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f32450c, mVar.f32450c) == 0 && Float.compare(this.f32451d, mVar.f32451d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32450c) * 31) + Float.hashCode(this.f32451d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f32450c + ", dy=" + this.f32451d + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$n */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class n extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32452c;

        /* JADX INFO: renamed from: d */
        public final float f32453d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f32452c = f10;
            this.f32453d = f11;
        }

        /* JADX INFO: renamed from: c */
        public final float m37227c() {
            return this.f32452c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37228d() {
            return this.f32453d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f32452c, nVar.f32452c) == 0 && Float.compare(this.f32453d, nVar.f32453d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32452c) * 31) + Float.hashCode(this.f32453d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f32452c + ", dy=" + this.f32453d + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$o */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class o extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32454c;

        /* JADX INFO: renamed from: d */
        public final float f32455d;

        /* JADX INFO: renamed from: e */
        public final float f32456e;

        /* JADX INFO: renamed from: f */
        public final float f32457f;

        public o(float f10, float f11, float f12, float f13) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f32454c = f10;
            this.f32455d = f11;
            this.f32456e = f12;
            this.f32457f = f13;
        }

        /* JADX INFO: renamed from: c */
        public final float m37229c() {
            return this.f32454c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37230d() {
            return this.f32456e;
        }

        /* JADX INFO: renamed from: e */
        public final float m37231e() {
            return this.f32455d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f32454c, oVar.f32454c) == 0 && Float.compare(this.f32455d, oVar.f32455d) == 0 && Float.compare(this.f32456e, oVar.f32456e) == 0 && Float.compare(this.f32457f, oVar.f32457f) == 0;
        }

        /* JADX INFO: renamed from: f */
        public final float m37232f() {
            return this.f32457f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f32454c) * 31) + Float.hashCode(this.f32455d)) * 31) + Float.hashCode(this.f32456e)) * 31) + Float.hashCode(this.f32457f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f32454c + ", dy1=" + this.f32455d + ", dx2=" + this.f32456e + ", dy2=" + this.f32457f + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$p */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class p extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32458c;

        /* JADX INFO: renamed from: d */
        public final float f32459d;

        /* JADX INFO: renamed from: e */
        public final float f32460e;

        /* JADX INFO: renamed from: f */
        public final float f32461f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f32458c = f10;
            this.f32459d = f11;
            this.f32460e = f12;
            this.f32461f = f13;
        }

        /* JADX INFO: renamed from: c */
        public final float m37233c() {
            return this.f32458c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37234d() {
            return this.f32460e;
        }

        /* JADX INFO: renamed from: e */
        public final float m37235e() {
            return this.f32459d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f32458c, pVar.f32458c) == 0 && Float.compare(this.f32459d, pVar.f32459d) == 0 && Float.compare(this.f32460e, pVar.f32460e) == 0 && Float.compare(this.f32461f, pVar.f32461f) == 0;
        }

        /* JADX INFO: renamed from: f */
        public final float m37236f() {
            return this.f32461f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f32458c) * 31) + Float.hashCode(this.f32459d)) * 31) + Float.hashCode(this.f32460e)) * 31) + Float.hashCode(this.f32461f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f32458c + ", dy1=" + this.f32459d + ", dx2=" + this.f32460e + ", dy2=" + this.f32461f + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$q */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class q extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32462c;

        /* JADX INFO: renamed from: d */
        public final float f32463d;

        public q(float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f32462c = f10;
            this.f32463d = f11;
        }

        /* JADX INFO: renamed from: c */
        public final float m37237c() {
            return this.f32462c;
        }

        /* JADX INFO: renamed from: d */
        public final float m37238d() {
            return this.f32463d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f32462c, qVar.f32462c) == 0 && Float.compare(this.f32463d, qVar.f32463d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f32462c) * 31) + Float.hashCode(this.f32463d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f32462c + ", dy=" + this.f32463d + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$r */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class r extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32464c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f32464c = f10;
        }

        /* JADX INFO: renamed from: c */
        public final float m37239c() {
            return this.f32464c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f32464c, ((r) obj).f32464c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f32464c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f32464c + ')';
        }
    }

    /* JADX INFO: renamed from: y1.h$s */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class s extends AbstractC9520h {

        /* JADX INFO: renamed from: c */
        public final float f32465c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f32465c = f10;
        }

        /* JADX INFO: renamed from: c */
        public final float m37240c() {
            return this.f32465c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f32465c, ((s) obj).f32465c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f32465c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f32465c + ')';
        }
    }

    public /* synthetic */ AbstractC9520h(boolean z10, boolean z11, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m37181a() {
        return this.f32405a;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37182b() {
        return this.f32406b;
    }

    public AbstractC9520h(boolean z10, boolean z11) {
        this.f32405a = z10;
        this.f32406b = z11;
    }

    public /* synthetic */ AbstractC9520h(boolean z10, boolean z11, AbstractC1043k abstractC1043k) {
        this(z10, z11);
    }
}
