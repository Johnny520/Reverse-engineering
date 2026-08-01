package p313;

import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9422 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public static final C9422[] f24372;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public static final C9422[] f24373;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C9422 f24376;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C9422 f24377;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C9422[] f24378;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public static final C9422[] f24379;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C9422 f24380;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C9422[] f24381;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C9422 f24382;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C9422 f24383;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C9422 f24384;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C9422 f24385;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final C9422 f24386;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final C9422 f24387;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C9422 f24391;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f24394;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f24395;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f24396;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f24397;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C9422 f24375 = new C9422(0, "VZCBSIFJD", 0, 1);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C9422 f24374 = new C9422(1, "VZCBSIFJD", 1, 2);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C9422 f24389 = new C9422(2, "VZCBSIFJD", 2, 3);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C9422 f24388 = new C9422(3, "VZCBSIFJD", 3, 4);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C9422 f24392 = new C9422(4, "VZCBSIFJD", 4, 5);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C9422 f24393 = new C9422(5, "VZCBSIFJD", 5, 6);

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C9422 f24390 = new C9422(6, "VZCBSIFJD", 6, 7);

    static {
        C9422 c9422 = new C9422(7, "VZCBSIFJD", 7, 8);
        f24391 = c9422;
        f24383 = new C9422(8, "VZCBSIFJD", 8, 9);
        C9422 c94222 = new C9422(10, "Ljava/lang/Class;", 1, 16);
        f24382 = c94222;
        C9422 c94223 = new C9422(10, "Ljava/lang/reflect/Type;", 1, 23);
        f24386 = c94223;
        C9422 c94224 = new C9422(10, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, 1, 17);
        f24387 = c94224;
        C9422 c94225 = new C9422(10, "Ljava/lang/String;", 1, 17);
        f24384 = c94225;
        C9422 c94226 = new C9422(10, "Ljava/util/List;", 1, 15);
        f24385 = c94226;
        C9422 c94227 = new C9422(10, "Lcom/alibaba/fastjson2/JSONReader;", 1, 33);
        f24377 = c94227;
        C9422 c94228 = new C9422(10, "Lcom/alibaba/fastjson2/JSONWriter;", 1, 33);
        f24376 = c94228;
        C9422 c94229 = new C9422(10, "Ljava/util/function/Supplier;", 1, 28);
        f24380 = c94229;
        f24381 = new C9422[]{c94222, c94225, c94225, c9422, c94226};
        f24378 = new C9422[]{c94228, c94224, c94224, c94223, c9422};
        f24379 = new C9422[]{c94222, c94229, c94227};
        f24373 = new C9422[]{c9422};
        f24372 = new C9422[]{c94227, c94223, c94224, c9422};
    }

    public C9422(int i, String str, int i2, int i3) {
        this.f24397 = i;
        this.f24396 = str;
        this.f24395 = i2;
        this.f24394 = i3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static C9422 m14778(int i, int i2, String str) {
        char cCharAt = str.charAt(i);
        if (cCharAt == '(') {
            return new C9422(11, str, i, i2);
        }
        if (cCharAt == 'F') {
            return f24390;
        }
        if (cCharAt != 'L') {
            if (cCharAt == 'S') {
                return f24392;
            }
            if (cCharAt == 'V') {
                return f24375;
            }
            if (cCharAt == 'I') {
                return f24393;
            }
            if (cCharAt == 'J') {
                return f24391;
            }
            if (cCharAt == 'Z') {
                return f24374;
            }
            if (cCharAt == '[') {
                return new C9422(9, str, i, i2);
            }
            switch (cCharAt) {
                case 'B':
                    return f24388;
                case 'C':
                    return f24389;
                case 'D':
                    return f24383;
                default:
                    C6755.m11865();
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
                                return f24385;
                            }
                            break;
                        case 17:
                            if (str.regionMatches(i, "Ljava/lang/Class;", 0, i3)) {
                                return f24382;
                            }
                            break;
                        case 18:
                            if (str.regionMatches(i, "Ljava/lang/String;", 0, i3)) {
                                return f24384;
                            }
                            if (str.regionMatches(i, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR, 0, i3)) {
                                return f24387;
                            }
                            break;
                    }
                } else {
                    if (str.regionMatches(i, "Lcom/alibaba/fastjson2/JSONWriter;", 0, i3)) {
                        return f24376;
                    }
                    if (str.regionMatches(i, "Lcom/alibaba/fastjson2/JSONReader;", 0, i3)) {
                        return f24377;
                    }
                }
            } else if (str.regionMatches(i, "Ljava/util/function/Supplier;", 0, i3)) {
                return f24380;
            }
        } else if (str.regionMatches(i, "Ljava/lang/reflect/Type;", 0, i3)) {
            return f24386;
        }
        return new C9422(10, str, i + 1, i2 - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m14779(String str) {
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
    public static C9422[] m14780(String str) {
        int i;
        str.getClass();
        i = 0;
        switch (str) {
            case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;":
                return f24372;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V":
                return f24378;
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V":
                return f24381;
            case "()V":
                return new C9422[0];
            case "(J)Lcom/alibaba/fastjson2/reader/FieldReader;":
            case "(J)Ljava/lang/Object;":
                return f24373;
            case "(Ljava/lang/Class;Ljava/util/function/Supplier;[Lcom/alibaba/fastjson2/reader/FieldReader;)V":
                return f24379;
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
                C9422[] c9422Arr = new C9422[i2];
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
                    c9422Arr[i] = m14778(i4, iMax2, str);
                    i++;
                    i4 = iMax2;
                }
                return c9422Arr;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m14781() {
        String str = this.f24396;
        int i = this.f24395;
        int i2 = this.f24394;
        int i3 = this.f24397;
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
    public final String m14782() {
        int i = this.f24397;
        int i2 = this.f24394;
        int i3 = this.f24395;
        String str = this.f24396;
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
                StringBuilder sb = new StringBuilder(m14778(i5 + i3, i2, str).m14782());
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
                C6385.m11429();
                return null;
        }
    }
}
