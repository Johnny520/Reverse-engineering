package kotlin.reflect.jvm.internal.impl.name;

import net.bytebuddy.description.method.MethodDescription;
import p144.C7547;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4691 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f13704;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String f13705;

    public C4691(String str, boolean z) {
        if (str == null) {
            m9332(0);
            throw null;
        }
        this.f13705 = str;
        this.f13704 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m9329(String str) {
        if (str == null) {
            m9332(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C4691 m9330(String str) {
        if (str != null) {
            return new C4691(str, false);
        }
        m9332(5);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C4691 m9331(String str) {
        if (str != null) {
            return str.startsWith("<") ? m9333(str) : m9330(str);
        }
        m9332(9);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static /* synthetic */ void m9332(int i) {
        String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 3 || i == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i) {
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
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static C4691 m9333(String str) {
        if (str == null) {
            m9332(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new C4691(str, true);
        }
        C5925.m11310("special name must start with '<': ".concat(str));
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f13705.compareTo(((C4691) obj).f13705);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4691)) {
            return false;
        }
        C4691 c4691 = (C4691) obj;
        return this.f13704 == c4691.f13704 && this.f13705.equals(c4691.f13705);
    }

    public final int hashCode() {
        return (this.f13705.hashCode() * 31) + (this.f13704 ? 1 : 0);
    }

    public final String toString() {
        return this.f13705;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m9334() {
        if (this.f13704) {
            C7547.m12774(this, "not identifier: ");
            return null;
        }
        String strM9335 = m9335();
        if (strM9335 != null) {
            return strM9335;
        }
        m9332(2);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m9335() {
        String str = this.f13705;
        if (str != null) {
            return str;
        }
        m9332(1);
        throw null;
    }
}
