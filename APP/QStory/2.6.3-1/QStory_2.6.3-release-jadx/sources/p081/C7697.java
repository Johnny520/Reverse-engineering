package p081;

import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言世楪兰哲子苏.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7697 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f18655;

    public C7697(String str) {
        if (str != null) {
            this.f18655 = str;
        } else {
            m12650(7);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static String m12647(C5520 c5520) {
        C5519 c5519 = c5520.f14044;
        String strReplace = c5520.f14043.f14041.f14038.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '$');
        if (!c5519.f14041.m9873()) {
            strReplace = c5519.f14041.f14038.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + strReplace;
        }
        if (strReplace != null) {
            return strReplace;
        }
        m12650(3);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7697 m12648(String str) {
        if (str != null) {
            return new C7697(str);
        }
        m12650(0);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7697 m12649(C5519 c5519) {
        if (c5519 != null) {
            return new C7697(c5519.f14041.f14038.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        }
        m12650(4);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void m12650(int i) {
        String str;
        int i2;
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    i2 = 2;
                    break;
                default:
                    i2 = 3;
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            case 7:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i != 5) {
            switch (i) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 5) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7697.class != obj.getClass()) {
            return false;
        }
        return this.f18655.equals(((C7697) obj).f18655);
    }

    public final int hashCode() {
        return this.f18655.hashCode();
    }

    public final String toString() {
        return this.f18655;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m12651() {
        String str = this.f18655;
        if (str != null) {
            return str;
        }
        m12650(10);
        throw null;
    }
}
