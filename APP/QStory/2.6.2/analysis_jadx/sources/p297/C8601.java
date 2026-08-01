package p297;

import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8601 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C8601[] f24036;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C8601[] f24037;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8601 f24040;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C8601 f24041;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C8601[] f24042;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C8601[] f24043;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C8601 f24044;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C8601[] f24045;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C8601 f24046;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C8601 f24047;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8601 f24048;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8601 f24049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C8601 f24050;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C8601 f24051;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C8601 f24055;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24060;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24061;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8601 f24039 = new C8601(0, "VZCBSIFJD", 0, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8601 f24038 = new C8601(1, "VZCBSIFJD", 1, 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8601 f24053 = new C8601(2, "VZCBSIFJD", 2, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8601 f24052 = new C8601(3, "VZCBSIFJD", 3, 4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8601 f24056 = new C8601(4, "VZCBSIFJD", 4, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C8601 f24057 = new C8601(5, "VZCBSIFJD", 5, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C8601 f24054 = new C8601(6, "VZCBSIFJD", 6, 7);

    static {
        C8601 c8601 = new C8601(7, "VZCBSIFJD", 7, 8);
        f24055 = c8601;
        f24047 = new C8601(8, "VZCBSIFJD", 8, 9);
        C8601 c86012 = new C8601(10, "Ljava/lang/Class;", 1, 16);
        f24046 = c86012;
        C8601 c86013 = new C8601(10, "Ljava/lang/reflect/Type;", 1, 23);
        f24050 = c86013;
        C8601 c86014 = new C8601(10, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, 1, 17);
        f24051 = c86014;
        C8601 c86015 = new C8601(10, "Ljava/lang/String;", 1, 17);
        f24048 = c86015;
        C8601 c86016 = new C8601(10, "Ljava/util/List;", 1, 15);
        f24049 = c86016;
        C8601 c86017 = new C8601(10, "Lcom/alibaba/fastjson2/JSONReader;", 1, 33);
        f24041 = c86017;
        C8601 c86018 = new C8601(10, "Lcom/alibaba/fastjson2/JSONWriter;", 1, 33);
        f24040 = c86018;
        C8601 c86019 = new C8601(10, "Ljava/util/function/Supplier;", 1, 28);
        f24044 = c86019;
        f24045 = new C8601[]{c86012, c86015, c86015, c8601, c86016};
        f24042 = new C8601[]{c86018, c86014, c86014, c86013, c8601};
        f24043 = new C8601[]{c86012, c86019, c86017};
        f24037 = new C8601[]{c8601};
        f24036 = new C8601[]{c86017, c86013, c86014, c8601};
    }

    public C8601(int i, String str, int i2, int i3) {
        this.f24061 = i;
        this.f24060 = str;
        this.f24059 = i2;
        this.f24058 = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C8601 m14200(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C8601(11, str, i, i2);
        }
        if (cCharAt == 'F') {
            return f24054;
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return f24056;
            }
            if (cCharAt == 'V') {
                return f24039;
            }
            if (cCharAt == 'I') {
                return f24057;
            }
            if (cCharAt == 'J') {
                return f24055;
            }
            if (cCharAt == 'Z') {
                return f24038;
            }
            if (cCharAt == '[') {
                return new C8601(9, str, i, i2);
            }
            switch (cCharAt) {
                case 'B':
                    return f24052;
                case 'C':
                    return f24053;
                case 'D':
                    return f24047;
                default:
                    C5919.m11245();
                    return null;
            }
        }
        int i3 = i2 - i;
        if (i3 != 24) {
            if (i3 != 29) {
                if (i3 != 34) {
                    switch (i3) {
                        case 16:
                            if (str.regionMatches(i, "Ljava/util/List;", 0, i3)) {
                                return f24049;
                            }
                            break;
                        case 17:
                            if (str.regionMatches(i, "Ljava/lang/Class;", 0, i3)) {
                                return f24046;
                            }
                            break;
                        case 18:
                            if (str.regionMatches(i, "Ljava/lang/String;", 0, i3)) {
                                return f24048;
                            }
                            if (str.regionMatches(i, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, 0, i3)) {
                                return f24051;
                            }
                            break;
                    }
                } else {
                    if (str.regionMatches(i, "Lcom/alibaba/fastjson2/JSONWriter;", 0, i3)) {
                        return f24040;
                    }
                    if (str.regionMatches(i, "Lcom/alibaba/fastjson2/JSONReader;", 0, i3)) {
                        return f24041;
                    }
                }
            } else if (str.regionMatches(i, "Ljava/util/function/Supplier;", 0, i3)) {
                return f24044;
            }
        } else if (str.regionMatches(i, "Ljava/lang/reflect/Type;", 0, i3)) {
            return f24050;
        }
        return new C8601(10, str, i + 1, i2 - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m14201(String str) {
        str.getClass();
        switch (str) {
            case "(Ljava/lang/Enum;)V":
            case "(Ljava/lang/String;)V":
            case "(I)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;)V":
            case "(Ljava/lang/Object;)V":
                return 8;
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLcom/alibaba/fastjson2/schema/JSONSchema;Ljava/util/function/Supplier;Ljava/util/function/Function;[Lcom/alibaba/fastjson2/reader/FieldReader;)V":
                return 40;
            case "(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;":
            case "(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;":
            case "(C)Z":
            case "(Lcom/alibaba/fastjson2/JSONWriter;)Z":
            case "(I)Ljava/lang/Object;":
            case "(Ljava/lang/Object;)Z":
            case "(I)Ljava/lang/Integer;":
                return 9;
            case "(Ljava/lang/Object;JLjava/lang/Object;)V":
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/util/List;ILjava/lang/String;)V":
                return 20;
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;":
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Ljava/lang/Object;":
                return 21;
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;":
                return 25;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V":
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V":
                return 28;
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;Ljava/lang/String;)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;ZLjava/util/List;)V":
            case "(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;J)V":
                return 16;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;":
            case "(J)Z":
            case "(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;":
            case "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z":
            case "(J)Lcom/alibaba/fastjson2/reader/FieldReader;":
            case "(J)Ljava/lang/Object;":
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;":
                return 13;
            case "(Ljava/util/List;Ljava/lang/reflect/Type;)V":
            case "(J)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Enum;)V":
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;I)V":
                return 12;
            case "()Ljava/lang/Class;":
            case "()I":
            case "()Z":
            case "()Ljava/lang/String;":
                return 5;
            case "()J":
                return 6;
            case "()V":
                return 4;
            default:
                char cCharAt = str.charAt(1);
                int i = 1;
                int i2 = 1;
                while (cCharAt != ')') {
                    if (cCharAt == 'J' || cCharAt == 'D') {
                        i++;
                        i2 += 2;
                    } else {
                        while (str.charAt(i) == '[') {
                            i++;
                        }
                        int iMax = i + 1;
                        if (str.charAt(i) == 'L') {
                            iMax = Math.max(iMax, str.indexOf(59, iMax) + 1);
                        }
                        i2++;
                        i = iMax;
                    }
                    cCharAt = str.charAt(i);
                }
                char cCharAt2 = str.charAt(i + 1);
                if (cCharAt2 == 'V') {
                    return i2 << 2;
                }
                return (i2 << 2) | ((cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C8601[] m14202(String str) {
        int i;
        str.getClass();
        i = 0;
        switch (str) {
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;":
                return f24036;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V":
                return f24042;
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V":
                return f24045;
            case "()V":
                return new C8601[0];
            case "(J)Lcom/alibaba/fastjson2/reader/FieldReader;":
            case "(J)Ljava/lang/Object;":
                return f24037;
            case "(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V":
                return f24043;
            default:
                int i2 = 0;
                int iMax = 1;
                while (str.charAt(iMax) != ')') {
                    while (str.charAt(iMax) == '[') {
                        iMax++;
                    }
                    int i3 = iMax + 1;
                    iMax = str.charAt(iMax) == 'L' ? Math.max(i3, str.indexOf(59, i3) + 1) : i3;
                    i2++;
                }
                C8601[] c8601Arr = new C8601[i2];
                int i4 = 1;
                while (str.charAt(i4) != ')') {
                    int i5 = i4;
                    while (str.charAt(i5) == '[') {
                        i5++;
                    }
                    int iMax2 = i5 + 1;
                    if (str.charAt(i5) == 'L') {
                        iMax2 = Math.max(iMax2, str.indexOf(59, iMax2) + 1);
                    }
                    c8601Arr[i] = m14200(i4, iMax2, str);
                    i++;
                    i4 = iMax2;
                }
                return c8601Arr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m14203() {
        String str = this.f24060;
        int i = this.f24059;
        int i2 = this.f24058;
        int i3 = this.f24061;
        if (i3 != 10) {
            if (i3 == 12) {
                return "L" + str.substring(i, i2) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER;
            }
            str.getClass();
            if (str.equals("VZCBSIFJD")) {
                if (i == 7 && i2 == 8) {
                    return "J";
                }
            } else if (str.equals("(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V") && i == 47 && i2 == 90) {
                return "[Lcom/alibaba/fastjson2/reader/FieldReader;";
            }
            return str.substring(i, i2);
        }
        str.getClass();
        switch (str) {
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;":
                if (i == 2 && i2 == 34) {
                    return "Lcom/alibaba/fastjson2/JSONReader;";
                }
                if (i == 36 && i2 == 58) {
                    return "Ljava/lang/reflect/Type;";
                }
                if (i == 60 && i2 == 76) {
                    return TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR;
                }
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V":
                if (i == 2 && i2 == 34) {
                    return "Lcom/alibaba/fastjson2/JSONWriter;";
                }
                if (i == 36 && i2 == 52) {
                    return TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR;
                }
                if (i == 54 && i2 == 70) {
                    return TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR;
                }
                if (i == 72 && i2 == 94) {
                    return "Ljava/lang/reflect/Type;";
                }
                break;
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V":
                if (i == 2 && i2 == 17) {
                    return "Ljava/lang/Class;";
                }
                if (i == 19 && i2 == 35) {
                    return "Ljava/lang/String;";
                }
                if (i == 37 && i2 == 53) {
                    return "Ljava/lang/String;";
                }
                if (i == 56 && i2 == 70) {
                    return "Ljava/util/List;";
                }
                break;
            case "(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V":
                if (i == 2 && i2 == 17) {
                    return "Ljava/lang/Class;";
                }
                if (i == 19 && i2 == 46) {
                    return "Ljava/util/function/Supplier;";
                }
                break;
        }
        return (i == 1 && i2 + 1 == str.length()) ? str : str.substring(i - 1, i2 + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String m14204() {
        int i = this.f24061;
        int i2 = this.f24058;
        int i3 = this.f24059;
        String str = this.f24060;
        switch (i) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                int i4 = 1;
                int i5 = 1;
                while (str.charAt(i3 + i5) == '[') {
                    i5++;
                }
                StringBuilder sb = new StringBuilder(m14200(i5 + i3, i2, str).m14204());
                while (str.charAt(i3 + i4) == '[') {
                    i4++;
                }
                while (i4 > 0) {
                    sb.append("[]");
                    i4--;
                }
                return sb.toString();
            case 10:
            case 12:
                return str.substring(i3, i2).replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            case 11:
            default:
                C5553.m10813();
                return null;
        }
    }
}
