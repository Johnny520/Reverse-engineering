package p213oa;

import p254r5.C6494d0;
import p376zd.C9987e;

/* JADX INFO: renamed from: oa.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5695f implements Comparable {

    /* JADX INFO: renamed from: q */
    public final String f17910q;

    /* JADX INFO: renamed from: r */
    public final boolean f17911r;

    public C5695f(String str, boolean z10) {
        if (str == null) {
            m23025a(0);
        }
        this.f17910q = str;
        this.f17911r = z10;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m23025a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: i */
    public static C5695f m23026i(String str) {
        if (str == null) {
            m23025a(9);
        }
        return str.startsWith("<") ? m23029m(str) : m23027j(str);
    }

    /* JADX INFO: renamed from: j */
    public static C5695f m23027j(String str) {
        if (str == null) {
            m23025a(5);
        }
        return new C5695f(str, false);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m23028l(String str) {
        if (str == null) {
            m23025a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public static C5695f m23029m(String str) {
        if (str == null) {
            m23025a(8);
        }
        if (str.startsWith("<")) {
            return new C5695f(str, true);
        }
        C9987e.m38645a("special name must start with '<': ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public String m23030c() {
        String str = this.f17910q;
        if (str == null) {
            m23025a(1);
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5695f)) {
            return false;
        }
        C5695f c5695f = (C5695f) obj;
        return this.f17911r == c5695f.f17911r && this.f17910q.equals(c5695f.f17910q);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5695f c5695f) {
        return this.f17910q.compareTo(c5695f.f17910q);
    }

    /* JADX INFO: renamed from: h */
    public String m23032h() {
        if (this.f17911r) {
            C6494d0.m25749a("not identifier: ", this);
            return null;
        }
        String strM23030c = m23030c();
        if (strM23030c == null) {
            m23025a(2);
        }
        return strM23030c;
    }

    public int hashCode() {
        return (this.f17910q.hashCode() * 31) + (this.f17911r ? 1 : 0);
    }

    /* JADX INFO: renamed from: k */
    public boolean m23033k() {
        return this.f17911r;
    }

    public String toString() {
        return this.f17910q;
    }
}
