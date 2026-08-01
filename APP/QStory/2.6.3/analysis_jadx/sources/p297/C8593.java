package p297;

import lin.xposed.hook.javaplugin.C5554;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8593 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C8593[] f24027;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C8593[] f24028;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C8593 f24031;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C8593 f24032;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C8593[] f24033;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C8593[] f24034;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C8593 f24035;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C8593[] f24036;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C8593 f24037;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C8593 f24038;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C8593 f24039;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8593 f24040;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C8593 f24041;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C8593 f24042;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C8593 f24046;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24051;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24052;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8593 f24030 = new C8593(0, "VZCBSIFJD", 0, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8593 f24029 = new C8593(1, "VZCBSIFJD", 1, 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8593 f24044 = new C8593(2, "VZCBSIFJD", 2, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8593 f24043 = new C8593(3, "VZCBSIFJD", 3, 4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8593 f24047 = new C8593(4, "VZCBSIFJD", 4, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C8593 f24048 = new C8593(5, "VZCBSIFJD", 5, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C8593 f24045 = new C8593(6, "VZCBSIFJD", 6, 7);

    static {
        C8593 c8593 = new C8593(7, "VZCBSIFJD", 7, 8);
        f24046 = c8593;
        f24038 = new C8593(8, "VZCBSIFJD", 8, 9);
        C8593 c85932 = new C8593(10, "Ljava/lang/Class;", 1, 16);
        f24037 = c85932;
        C8593 c85933 = new C8593(10, "Ljava/lang/reflect/Type;", 1, 23);
        f24041 = c85933;
        C8593 c85934 = new C8593(10, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, 1, 17);
        f24042 = c85934;
        C8593 c85935 = new C8593(10, "Ljava/lang/String;", 1, 17);
        f24039 = c85935;
        C8593 c85936 = new C8593(10, "Ljava/util/List;", 1, 15);
        f24040 = c85936;
        C8593 c85937 = new C8593(10, "Lcom/alibaba/fastjson2/JSONReader;", 1, 33);
        f24032 = c85937;
        C8593 c85938 = new C8593(10, "Lcom/alibaba/fastjson2/JSONWriter;", 1, 33);
        f24031 = c85938;
        C8593 c85939 = new C8593(10, "Ljava/util/function/Supplier;", 1, 28);
        f24035 = c85939;
        f24036 = new C8593[]{c85932, c85935, c85935, c8593, c85936};
        f24033 = new C8593[]{c85938, c85934, c85934, c85933, c8593};
        f24034 = new C8593[]{c85932, c85939, c85937};
        f24028 = new C8593[]{c8593};
        f24027 = new C8593[]{c85937, c85933, c85934, c8593};
    }

    public C8593(int i, String str, int i2, int i3) {
        this.f24052 = i;
        this.f24051 = str;
        this.f24050 = i2;
        this.f24049 = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C8593 m14219(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C8593(11, str, i, i2);
        }
        if (cCharAt == 'F') {
            return f24045;
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return f24047;
            }
            if (cCharAt == 'V') {
                return f24030;
            }
            if (cCharAt == 'I') {
                return f24048;
            }
            if (cCharAt == 'J') {
                return f24046;
            }
            if (cCharAt == 'Z') {
                return f24029;
            }
            if (cCharAt == '[') {
                return new C8593(9, str, i, i2);
            }
            switch (cCharAt) {
                case 'B':
                    return f24043;
                case 'C':
                    return f24044;
                case 'D':
                    return f24038;
                default:
                    C5925.m11306();
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
                                return f24040;
                            }
                            break;
                        case 17:
                            if (str.regionMatches(i, "Ljava/lang/Class;", 0, i3)) {
                                return f24037;
                            }
                            break;
                        case 18:
                            if (str.regionMatches(i, "Ljava/lang/String;", 0, i3)) {
                                return f24039;
                            }
                            if (str.regionMatches(i, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, 0, i3)) {
                                return f24042;
                            }
                            break;
                    }
                } else {
                    if (str.regionMatches(i, "Lcom/alibaba/fastjson2/JSONWriter;", 0, i3)) {
                        return f24031;
                    }
                    if (str.regionMatches(i, "Lcom/alibaba/fastjson2/JSONReader;", 0, i3)) {
                        return f24032;
                    }
                }
            } else if (str.regionMatches(i, "Ljava/util/function/Supplier;", 0, i3)) {
                return f24035;
            }
        } else if (str.regionMatches(i, "Ljava/lang/reflect/Type;", 0, i3)) {
            return f24041;
        }
        return new C8593(10, str, i + 1, i2 - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m14220(String str) {
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
    public static C8593[] m14221(String str) {
        int i;
        str.getClass();
        i = 0;
        switch (str) {
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;":
                return f24027;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V":
                return f24033;
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V":
                return f24036;
            case "()V":
                return new C8593[0];
            case "(J)Lcom/alibaba/fastjson2/reader/FieldReader;":
            case "(J)Ljava/lang/Object;":
                return f24028;
            case "(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V":
                return f24034;
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
                C8593[] c8593Arr = new C8593[i2];
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
                    c8593Arr[i] = m14219(i4, iMax2, str);
                    i++;
                    i4 = iMax2;
                }
                return c8593Arr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m14222() {
        String str = this.f24051;
        int i = this.f24050;
        int i2 = this.f24049;
        int i3 = this.f24052;
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
    public final String m14223() {
        int i = this.f24052;
        int i2 = this.f24049;
        int i3 = this.f24050;
        String str = this.f24051;
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
                StringBuilder sb = new StringBuilder(m14219(i5 + i3, i2, str).m14223());
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
                C5554.m10870();
                return null;
        }
    }
}
