package p299;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import lin.xposed.hook.javaplugin.C6385;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import p313.C9416;
import p313.C9418;
import p313.C9419;
import p313.C9422;
import p313.C9423;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9209 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public short f23521;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public int[] f23522;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int[] f23523;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f23524;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int[] f23525;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23526;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f23527;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public short f23528;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int[] f23529;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object f23530;

    public /* synthetic */ C9209(Object obj, int i) {
        this.f23526 = i;
        this.f23530 = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m14470(C9423 c9423, String str, int i) {
        int iM14785;
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return 4194306;
        }
        String strM721 = "com/alibaba/fastjson2/reader/FieldReader";
        if (cCharAt != 'L') {
            if (cCharAt != 'S') {
                if (cCharAt == 'V') {
                    return 0;
                }
                if (cCharAt != 'I') {
                    if (cCharAt == 'J') {
                        return 4194308;
                    }
                    if (cCharAt != 'Z') {
                        if (cCharAt == '[') {
                            int i2 = i + 1;
                            while (str.charAt(i2) == '[') {
                                i2++;
                            }
                            char cCharAt2 = str.charAt(i2);
                            if (cCharAt2 == 'F') {
                                iM14785 = 4194306;
                            } else if (cCharAt2 != 'L') {
                                if (cCharAt2 == 'S') {
                                    iM14785 = 4194316;
                                } else if (cCharAt2 == 'Z') {
                                    iM14785 = 4194313;
                                } else if (cCharAt2 == 'I') {
                                    iM14785 = 4194305;
                                } else if (cCharAt2 != 'J') {
                                    switch (cCharAt2) {
                                        case 'B':
                                            iM14785 = 4194314;
                                            break;
                                        case 'C':
                                            iM14785 = 4194315;
                                            break;
                                        case 'D':
                                            iM14785 = 4194307;
                                            break;
                                        default:
                                            C6755.m11865();
                                            return 0;
                                    }
                                } else {
                                    iM14785 = 4194308;
                                }
                            } else if (i != 0) {
                                strM721 = null;
                                if (strM721 == null) {
                                    strM721 = AbstractC0900.m721(1, i2 + 1, str);
                                }
                                iM14785 = c9423.m14785(strM721) | 8388608;
                            } else {
                                if (!str.equals("[Lcom/alibaba/fastjson2/writer/FieldWriter;")) {
                                    if (str.equals("[Lcom/alibaba/fastjson2/reader/FieldReader;")) {
                                        strM721 = "Lcom/alibaba/fastjson2/reader/FieldReader";
                                    }
                                }
                                if (strM721 == null) {
                                }
                                iM14785 = c9423.m14785(strM721) | 8388608;
                            }
                            return ((i2 - i) << 26) | iM14785;
                        }
                        switch (cCharAt) {
                            case 'B':
                            case 'C':
                                break;
                            case 'D':
                                return 4194307;
                            default:
                                C6755.m11865();
                                return 0;
                        }
                    }
                }
            }
            return 4194305;
        }
        char c = 3;
        byte b = -1;
        String strM7212 = TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME;
        if (i == 0) {
            switch (str.hashCode()) {
                case -1603319396:
                    if (str.equals("Lcom/alibaba/fastjson2/writer/FieldWriter;")) {
                        b = 0;
                    }
                    break;
                case -484446980:
                    if (str.equals("Lcom/alibaba/fastjson2/reader/FieldReader;")) {
                        b = 1;
                    }
                    break;
                case -26611358:
                    if (str.equals("Lcom/alibaba/fastjson2/JSONReader;")) {
                        b = 2;
                    }
                    break;
                case 8167489:
                    if (str.equals("Lsun/misc/Unsafe;")) {
                        b = c;
                    }
                    break;
                case 126245681:
                    if (str.equals("Ljava/util/List;")) {
                        c = 4;
                        b = c;
                    }
                    break;
                case 296832740:
                    if (str.equals("Ljava/util/function/Supplier;")) {
                        c = 5;
                        b = c;
                    }
                    break;
                case 495983538:
                    if (str.equals("Lcom/alibaba/fastjson2/JSONWriter;")) {
                        c = 6;
                        b = c;
                    }
                    break;
                case 961047515:
                    if (str.equals("Lcom/alibaba/fastjson2/reader/ObjectReader;")) {
                        c = 7;
                        b = c;
                    }
                    break;
                case 1379658506:
                    if (str.equals("Ljava/lang/String;")) {
                        c = '\b';
                        b = c;
                    }
                    break;
                case 1518216451:
                    if (str.equals("Ljava/lang/Class;")) {
                        c = '\t';
                        b = c;
                    }
                    break;
                case 1601768860:
                    if (str.equals(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR)) {
                        c = '\n';
                        b = c;
                    }
                    break;
                case 2052705071:
                    if (str.equals("Ljava/lang/reflect/Type;")) {
                        c = 11;
                        b = c;
                    }
                    break;
            }
            switch (b) {
                case 0:
                    strM721 = "com/alibaba/fastjson2/writer/FieldWriter";
                    break;
                case 1:
                    break;
                case 2:
                    strM721 = "com/alibaba/fastjson2/JSONReader";
                    break;
                case 3:
                    strM721 = "sun/misc/Unsafe";
                    break;
                case 4:
                    strM721 = "java/util/List";
                    break;
                case 5:
                    strM721 = "java/util/function/Supplier";
                    break;
                case 6:
                    strM721 = "com/alibaba/fastjson2/JSONWriter";
                    break;
                case 7:
                    strM721 = "com/alibaba/fastjson2/reader/ObjectReader";
                    break;
                case 8:
                    strM721 = "java/lang/String";
                    break;
                case 9:
                    strM721 = TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME;
                    break;
                case 10:
                    strM721 = TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME;
                    break;
                case 11:
                    strM721 = "java/lang/reflect/Type";
                    break;
                default:
                    strM721 = null;
                    break;
            }
            strM7212 = strM721;
        } else if (i == 2) {
            strM7212 = !str.equals("()Ljava/lang/Class;") ? !str.equals("()Ljava/lang/String;") ? null : "java/lang/String" : TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME;
        } else if (i == 3) {
            switch (str) {
                case "(I)Ljava/lang/Integer;":
                    strM721 = "java/lang/Integer";
                    break;
            }
            strM7212 = strM721;
        } else if (i != 36) {
            if (i != 54) {
                switch (str) {
                    case "(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;":
                        if (i != 79) {
                        }
                        break;
                    case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;":
                        if (i == 60) {
                            strM7212 = "com/alibaba/fastjson2/writer/ObjectWriter";
                            break;
                        }
                        break;
                    case "(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;":
                        if (i == 62) {
                        }
                        break;
                    case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;":
                        if (i == 53) {
                        }
                        break;
                }
            } else if (!str.equals("(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;")) {
                if (!str.equals("(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Ljava/lang/Object;")) {
                }
            }
        } else if (!str.equals("(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;")) {
            if (str.equals("(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;")) {
                strM7212 = "com/alibaba/fastjson2/reader/ObjectReader";
            }
        }
        if (strM7212 == null) {
            strM7212 = AbstractC0900.m721(1, i + 1, str);
        }
        return c9423.m14785(strM7212) | 8388608;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m14471(C9213 c9213, String str, int i) {
        int iM14510;
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return 16777218;
        }
        if (cCharAt == 'L') {
            return c9213.m14510(str.substring(i + 1, str.length() - 1)) | 33554432;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 16777220;
                }
                if (cCharAt != 'Z') {
                    if (cCharAt == '[') {
                        int i2 = i + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char cCharAt2 = str.charAt(i2);
                        if (cCharAt2 == 'F') {
                            iM14510 = 16777218;
                        } else if (cCharAt2 == 'L') {
                            iM14510 = c9213.m14510(str.substring(i2 + 1, str.length() - 1)) | 33554432;
                        } else if (cCharAt2 == 'S') {
                            iM14510 = 16777228;
                        } else if (cCharAt2 == 'Z') {
                            iM14510 = 16777225;
                        } else if (cCharAt2 == 'I') {
                            iM14510 = 16777217;
                        } else if (cCharAt2 != 'J') {
                            switch (cCharAt2) {
                                case 'B':
                                    iM14510 = 16777226;
                                    break;
                                case 'C':
                                    iM14510 = 16777227;
                                    break;
                                case 'D':
                                    iM14510 = 16777219;
                                    break;
                                default:
                                    C6755.m11865();
                                    return 0;
                            }
                        } else {
                            iM14510 = 16777220;
                        }
                        return ((i2 - i) << 28) | iM14510;
                    }
                    switch (cCharAt) {
                        case 'B':
                        case 'C':
                            break;
                        case 'D':
                            return 16777219;
                        default:
                            C6755.m11865();
                            return 0;
                    }
                }
            }
        }
        return 16777217;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m14472(C9213 c9213, int i, int[] iArr, int i2) {
        int iMin;
        int iM14510;
        int i3;
        int i4 = i;
        int i5 = iArr[i2];
        if (i5 != i4) {
            if ((268435455 & i4) != 16777221) {
                if (i5 != 0) {
                    iArr[i2] = i4;
                    return true;
                }
                int i6 = i5 & (-268435456);
                int i7 = 16777216;
                if (i6 != 0 || (i5 & 251658240) == 33554432) {
                    if (i4 != 16777221) {
                        int i8 = i4 & (-16777216);
                        int i9 = (-16777216) & i5;
                        String strReplace = TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME;
                        if (i8 != i9) {
                            int i10 = i4 & (-268435456);
                            if (i10 != 0 || (i4 & 251658240) == 33554432) {
                                if (i10 != 0 && (i4 & 251658240) != 33554432) {
                                    i10 -= 268435456;
                                }
                                if (i6 != 0 && (i5 & 251658240) != 33554432) {
                                    i6 -= 268435456;
                                }
                                iMin = Math.min(i10, i6) | 33554432;
                                iM14510 = c9213.m14510(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                                i7 = iMin | iM14510;
                            }
                        } else if ((i5 & 251658240) == 33554432) {
                            int i11 = (i4 & (-268435456)) | 33554432;
                            int i12 = i4 & 1048575;
                            int i13 = 1048575 & i5;
                            long j = ((long) i12) | (((long) i13) << 32);
                            int i14 = (i12 + i13 + 130) & Integer.MAX_VALUE;
                            C9206 c9206M14511 = c9213.m14511(i14);
                            while (true) {
                                if (c9206M14511 == null) {
                                    C9206[] c9206Arr = c9213.f23566;
                                    String str = c9206Arr[i12].f23474;
                                    String str2 = c9206Arr[i13].f23474;
                                    ClassLoader classLoader = C9210.class.getClassLoader();
                                    try {
                                        Class<?> cls = Class.forName(str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH), false, classLoader);
                                        try {
                                            Class<?> cls2 = Class.forName(str2.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH), false, classLoader);
                                            if (cls.isAssignableFrom(cls2)) {
                                                strReplace = str;
                                            } else if (cls2.isAssignableFrom(cls)) {
                                                strReplace = str2;
                                            } else if (!cls.isInterface() && !cls2.isInterface()) {
                                                do {
                                                    cls = cls.getSuperclass();
                                                } while (!cls.isAssignableFrom(cls2));
                                                strReplace = cls.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                                            }
                                            int iM145102 = c9213.m14510(strReplace);
                                            C9206 c9206 = new C9206(c9213.f23567, 130, j, i14);
                                            c9213.m14512(c9206);
                                            c9206.f23480 = iM145102;
                                            i3 = iM145102;
                                        } catch (Exception e) {
                                            throw new TypeNotPresentException(str2, e);
                                        }
                                    } catch (Exception e2) {
                                        throw new TypeNotPresentException(str, e2);
                                    }
                                } else {
                                    if (c9206M14511.f23477 == 130 && c9206M14511.f23479 == i14 && c9206M14511.f23473 == j) {
                                        i3 = c9206M14511.f23480;
                                        break;
                                    }
                                    c9206M14511 = (C9206) c9206M14511.f23481;
                                }
                            }
                            i7 = i11 | i3;
                        } else {
                            iMin = ((i4 & (-268435456)) - 268435456) | 33554432;
                            iM14510 = c9213.m14510(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                            i7 = iMin | iM14510;
                        }
                    }
                } else if (i5 == 16777221) {
                    if ((i4 & (-268435456)) == 0 && (i4 & 251658240) != 33554432) {
                        i4 = 16777216;
                    }
                    i7 = i4;
                }
                if (i7 != i5) {
                    iArr[i2] = i7;
                    return true;
                }
            } else if (i5 != 16777221) {
                i4 = 16777221;
                if (i5 != 0) {
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001f  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m14473(C9423 c9423, int i, int[] iArr, int i2) {
        int iMin;
        int iM14785;
        long j;
        long j2;
        int i3;
        int i4 = i;
        int i5 = iArr[i2];
        if (i5 != i4) {
            if ((67108863 & i4) != 4194309) {
                if (i5 != 0) {
                    iArr[i2] = i4;
                    return true;
                }
                int i6 = i5 & (-67108864);
                int i7 = 4194304;
                if (i6 == 0 && (i5 & 62914560) != 8388608) {
                    if (i5 != 4194309 || ((i4 & (-67108864)) == 0 && (i4 & 62914560) != 8388608)) {
                        i4 = 4194304;
                    }
                    i7 = i4;
                } else if (i4 != 4194309) {
                    int i8 = i4 & (-4194304);
                    int i9 = (-4194304) & i5;
                    String strReplace = TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME;
                    if (i8 != i9) {
                        int i10 = i4 & (-67108864);
                        if (i10 != 0 || (i4 & 62914560) == 8388608) {
                            if (i10 != 0 && (i4 & 62914560) != 8388608) {
                                i10 -= 67108864;
                            }
                            if (i6 != 0 && (i5 & 62914560) != 8388608) {
                                i6 -= 67108864;
                            }
                            iMin = Math.min(i10, i6) | 8388608;
                            iM14785 = c9423.m14785(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                            i7 = iMin | iM14785;
                        }
                    } else if ((i5 & 62914560) == 8388608) {
                        int i11 = (i4 & (-67108864)) | 8388608;
                        int i12 = i4 & 1048575;
                        int i13 = 1048575 & i5;
                        c9423.getClass();
                        if (i12 < i13) {
                            j = i12;
                            j2 = i13;
                        } else {
                            j = i13;
                            j2 = i12;
                        }
                        long j3 = j | (j2 << 32);
                        int i14 = (i12 + 130 + i13) & Integer.MAX_VALUE;
                        C9206[] c9206Arr = c9423.f24400;
                        C9206 c9206 = c9206Arr[i14 % c9206Arr.length];
                        while (true) {
                            if (c9206 == null) {
                                C9206[] c9206Arr2 = c9423.f24404;
                                String str = c9206Arr2[i12].f23474;
                                String str2 = c9206Arr2[i13].f23474;
                                C9419 c9419 = c9423.f24403;
                                Class<? super Object> clsM14774 = c9419.m14774(str);
                                if (clsM14774 == null) {
                                    C1123.m1410("class not found ".concat(str));
                                    return false;
                                }
                                Class<?> clsM147742 = c9419.m14774(str2);
                                if (clsM147742 != null) {
                                    if (clsM14774.isAssignableFrom(clsM147742)) {
                                        strReplace = str;
                                    } else if (clsM147742.isAssignableFrom(clsM14774)) {
                                        strReplace = str2;
                                    } else if (!clsM14774.isInterface() && !clsM147742.isInterface()) {
                                        do {
                                            clsM14774 = clsM14774.getSuperclass();
                                        } while (!clsM14774.isAssignableFrom(clsM147742));
                                        strReplace = clsM14774.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                                    }
                                }
                                int iM147852 = c9423.m14785(strReplace);
                                C9206 c92062 = new C9206(c9423.f24405, 130, null, null, null, j3, i14, 1);
                                c9423.m14783(c92062);
                                c92062.f23480 = iM147852;
                                i3 = iM147852;
                            } else {
                                if (c9206.f23477 == 130 && c9206.f23479 == i14 && c9206.f23473 == j3) {
                                    i3 = c9206.f23480;
                                    break;
                                }
                                c9206 = (C9206) c9206.f23481;
                            }
                        }
                        i7 = i11 | i3;
                    } else {
                        iMin = ((i4 & (-67108864)) - 67108864) | 8388608;
                        iM14785 = c9423.m14785(TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
                        i7 = iMin | iM14785;
                    }
                }
                if (i7 != i5) {
                    iArr[i2] = i7;
                    return true;
                }
            } else if (i5 != 4194309) {
                i4 = 4194309;
                if (i5 != 0) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m14474(int i, int i2, C9206 c9206, C9423 c9423) {
        int iM14784;
        switch (i) {
            case 0:
            case 116:
            case 117:
            case 118:
            case 119:
            case 145:
            case 146:
            case 147:
            case 167:
            case 177:
                break;
            case 1:
                m14484(4194309);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
            case 21:
                m14484(4194305);
                break;
            case 9:
            case 10:
            case 22:
                m14484(4194308);
                m14484(4194304);
                break;
            case 11:
            case 12:
            case 13:
            case 23:
                m14484(4194306);
                break;
            case 14:
            case 15:
            case 24:
                m14484(4194307);
                m14484(4194304);
                break;
            case 18:
                int i3 = c9206.f23477;
                switch (i3) {
                    case 3:
                        m14484(4194305);
                        break;
                    case 4:
                        m14484(4194306);
                        break;
                    case 5:
                        m14484(4194308);
                        m14484(4194304);
                        break;
                    case 6:
                        m14484(4194307);
                        m14484(4194304);
                        break;
                    case 7:
                        m14484(c9423.m14785(TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME) | 8388608);
                        break;
                    case 8:
                        m14484(c9423.m14785("java/lang/String") | 8388608);
                        break;
                    default:
                        switch (i3) {
                            case 15:
                                m14484(c9423.m14785("java/lang/invoke/MethodHandle") | 8388608);
                                break;
                            case 16:
                                m14484(c9423.m14785("java/lang/invoke/MethodType") | 8388608);
                                break;
                            case 17:
                                m14482(c9423, c9206.f23474);
                                break;
                            default:
                                C6385.m11429();
                                break;
                        }
                        break;
                }
                break;
            case 19:
            case 20:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 48:
            case 49:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 80:
            case 81:
            case 82:
            case 86:
            case 90:
            case 91:
            case 93:
            case 94:
            case 98:
            case 99:
            case 102:
            case 103:
            case 106:
            case 107:
            case 110:
            case 111:
            case 114:
            case 115:
            case 137:
            case 138:
            case 141:
            case 144:
            case 168:
            case 169:
            case 186:
            case 188:
            case 196:
            case 197:
            default:
                C6755.m11865();
                break;
            case 25:
                m14484(m14488(i2));
                break;
            case 46:
            case 51:
            case 52:
            case 53:
            case 96:
            case 100:
            case 104:
            case 108:
            case 112:
            case 120:
            case 122:
            case 124:
            case 126:
            case 128:
            case 130:
            case 136:
            case 142:
            case 149:
            case 150:
                m14479(2);
                m14484(4194305);
                break;
            case 47:
            case 143:
                m14479(2);
                m14484(4194308);
                m14484(4194304);
                break;
            case 50:
                m14479(1);
                int iM14480 = m14480();
                if (iM14480 != 4194309) {
                    iM14480 -= 67108864;
                }
                m14484(iM14480);
                break;
            case 54:
            case 56:
            case 58:
                m14478(i2, m14480());
                if (i2 > 0) {
                    int i4 = i2 - 1;
                    int iM14488 = m14488(i4);
                    if (iM14488 == 4194308 || iM14488 == 4194307) {
                        m14478(i4, 4194304);
                    } else {
                        int i5 = iM14488 & 62914560;
                        if (i5 == 16777216 || i5 == 20971520) {
                            m14478(i4, iM14488 | 1048576);
                        }
                    }
                }
                break;
            case 55:
            case 57:
                m14479(1);
                m14478(i2, m14480());
                m14478(i2 + 1, 4194304);
                if (i2 > 0) {
                    int i6 = i2 - 1;
                    int iM144882 = m14488(i6);
                    if (iM144882 == 4194308 || iM144882 == 4194307) {
                        m14478(i6, 4194304);
                    } else {
                        int i7 = iM144882 & 62914560;
                        if (i7 == 16777216 || i7 == 20971520) {
                            m14478(i6, iM144882 | 1048576);
                        }
                    }
                }
                break;
            case 79:
            case 83:
            case 84:
            case 85:
                m14479(3);
                break;
            case 87:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 170:
            case 171:
            case 172:
            case 174:
            case 176:
            case 191:
            case 194:
            case 195:
            case 198:
            case 199:
                m14479(1);
                break;
            case 88:
            case 159:
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 173:
            case 175:
                m14479(2);
                break;
            case 89:
                int iM144802 = m14480();
                m14484(iM144802);
                m14484(iM144802);
                break;
            case 92:
                int iM144803 = m14480();
                int iM144804 = m14480();
                m14484(iM144804);
                m14484(iM144803);
                m14484(iM144804);
                m14484(iM144803);
                break;
            case 95:
                int iM144805 = m14480();
                int iM144806 = m14480();
                m14484(iM144805);
                m14484(iM144806);
                break;
            case 97:
            case 101:
            case 105:
            case 109:
            case 113:
            case 127:
            case 129:
            case 131:
                m14479(4);
                m14484(4194308);
                m14484(4194304);
                break;
            case 121:
            case 123:
            case 125:
                m14479(3);
                m14484(4194308);
                m14484(4194304);
                break;
            case 132:
                m14478(i2, 4194305);
                break;
            case 133:
            case 140:
                m14479(1);
                m14484(4194308);
                m14484(4194304);
                break;
            case 134:
                m14479(1);
                m14484(4194306);
                break;
            case 135:
                m14479(1);
                m14484(4194307);
                m14484(4194304);
                break;
            case 139:
            case 190:
            case 193:
                m14479(1);
                m14484(4194305);
                break;
            case 148:
            case 151:
            case 152:
                m14479(4);
                m14484(4194305);
                break;
            case 178:
                m14482(c9423, c9206.f23474);
                break;
            case 179:
                m14483(c9206.f23474);
                break;
            case 180:
                m14479(1);
                m14482(c9423, c9206.f23474);
                break;
            case 181:
                m14483(c9206.f23474);
                m14480();
                break;
            case 182:
            case 183:
            case 184:
            case 185:
                m14483(c9206.f23474);
                if (i != 184) {
                    int iM144807 = m14480();
                    if (i == 183 && c9206.f23475.charAt(0) == '<') {
                        if (this.f23529 == null) {
                            this.f23529 = new int[2];
                        }
                        int length = this.f23529.length;
                        int i8 = this.f23527;
                        if (i8 >= length) {
                            int[] iArr = new int[Math.max(i8 + 1, length * 2)];
                            System.arraycopy(this.f23529, 0, iArr, 0, length);
                            this.f23529 = iArr;
                        }
                        int[] iArr2 = this.f23529;
                        int i9 = this.f23527;
                        this.f23527 = i9 + 1;
                        iArr2[i9] = iM144807;
                    }
                }
                m14482(c9423, c9206.f23474);
                break;
            case 187:
                String str = c9206.f23474;
                c9423.getClass();
                int iHashCode = (str.hashCode() + 129 + i2) & Integer.MAX_VALUE;
                C9206[] c9206Arr = c9423.f24400;
                C9206 c92062 = c9206Arr[iHashCode % c9206Arr.length];
                while (true) {
                    if (c92062 == null) {
                        iM14784 = c9423.m14784(new C9206(c9423.f24405, 129, null, null, str, i2, iHashCode, 1));
                    } else if (c92062.f23477 == 129 && c92062.f23479 == iHashCode && c92062.f23473 == i2 && c92062.f23474.equals(str)) {
                        iM14784 = c92062.f23478;
                    } else {
                        c92062 = (C9206) c92062.f23481;
                    }
                }
                m14484(iM14784 | 12582912);
                break;
            case 189:
                String str2 = c9206.f23474;
                m14480();
                if (str2.charAt(0) != '[') {
                    m14484(c9423.m14785(str2) | 75497472);
                } else {
                    m14482(c9423, "[".concat(str2));
                }
                break;
            case 192:
                String str3 = c9206.f23474;
                m14480();
                if (str3.charAt(0) != '[') {
                    m14484(c9423.m14785(str3) | 8388608);
                } else {
                    m14482(c9423, str3);
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0371  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m14475(int i, int i2, C9206 c9206, C9213 c9213) {
        int iM14509;
        switch (i) {
            case 0:
                break;
            case 1:
                m14484(16777221);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 16:
            case 17:
                m14484(16777217);
                break;
            case 9:
            case 10:
                m14484(16777220);
                m14484(16777216);
                break;
            case 11:
            case 12:
            case 13:
                m14484(16777218);
                break;
            case 14:
            case 15:
                m14484(16777219);
                m14484(16777216);
                break;
            case 18:
                int i3 = c9206.f23477;
                switch (i3) {
                    case 3:
                        m14484(16777217);
                        break;
                    case 4:
                        m14484(16777218);
                        break;
                    case 5:
                        m14484(16777220);
                        m14484(16777216);
                        break;
                    case 6:
                        m14484(16777219);
                        m14484(16777216);
                        break;
                    case 7:
                        m14484(c9213.m14510(TypeProxy.SilentConstruction.Appender.JAVA_LANG_CLASS_INTERNAL_NAME) | 33554432);
                        break;
                    case 8:
                        m14484(c9213.m14510("java/lang/String") | 33554432);
                        break;
                    default:
                        switch (i3) {
                            case 15:
                                m14484(c9213.m14510("java/lang/invoke/MethodHandle") | 33554432);
                                break;
                            case 16:
                                m14484(c9213.m14510("java/lang/invoke/MethodType") | 33554432);
                                break;
                            case 17:
                                m14481(c9213, c9206.f23474);
                                break;
                            default:
                                C6385.m11429();
                                break;
                        }
                        break;
                }
                break;
            default:
                switch (i) {
                    case 21:
                        break;
                    case 22:
                        break;
                    case 23:
                        break;
                    case 24:
                        break;
                    case 25:
                        m14484(m14488(i2));
                        break;
                    default:
                        switch (i) {
                            case 46:
                            case 51:
                            case 52:
                            case 53:
                                m14479(2);
                                m14484(16777217);
                                break;
                            case 47:
                                m14479(2);
                                m14484(16777220);
                                m14484(16777216);
                                break;
                            case 48:
                                m14479(2);
                                m14484(16777218);
                                break;
                            case 49:
                                m14479(2);
                                m14484(16777219);
                                m14484(16777216);
                                break;
                            case 50:
                                m14479(1);
                                int iM14480 = m14480();
                                if (iM14480 != 16777221) {
                                    iM14480 -= 268435456;
                                }
                                m14484(iM14480);
                                break;
                            case 54:
                            case 56:
                            case 58:
                                m14478(i2, m14480());
                                if (i2 > 0) {
                                    int i4 = i2 - 1;
                                    int iM14488 = m14488(i4);
                                    if (iM14488 == 16777220 || iM14488 == 16777219) {
                                        m14478(i4, 16777216);
                                    } else {
                                        int i5 = iM14488 & 251658240;
                                        if (i5 == 67108864 || i5 == 83886080) {
                                            m14478(i4, iM14488 | 1048576);
                                        }
                                    }
                                }
                                break;
                            case 55:
                            case 57:
                                m14479(1);
                                m14478(i2, m14480());
                                m14478(i2 + 1, 16777216);
                                if (i2 > 0) {
                                    int i6 = i2 - 1;
                                    int iM144882 = m14488(i6);
                                    if (iM144882 == 16777220 || iM144882 == 16777219) {
                                        m14478(i6, 16777216);
                                    } else {
                                        int i7 = iM144882 & 251658240;
                                        if (i7 == 67108864 || i7 == 83886080) {
                                            m14478(i6, iM144882 | 1048576);
                                        }
                                    }
                                }
                                break;
                            default:
                                switch (i) {
                                    case 79:
                                    case 81:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                        m14479(3);
                                        break;
                                    case 80:
                                    case 82:
                                        m14479(4);
                                        break;
                                    case 87:
                                    case 153:
                                    case 154:
                                    case 155:
                                    case 156:
                                    case 157:
                                    case 158:
                                    case 170:
                                    case 171:
                                    case 172:
                                    case 174:
                                    case 176:
                                    case 191:
                                    case 194:
                                    case 195:
                                        break;
                                    case 88:
                                    case 159:
                                    case 160:
                                    case 161:
                                    case 162:
                                    case 163:
                                    case 164:
                                    case 165:
                                    case 166:
                                    case 173:
                                    case 175:
                                        m14479(2);
                                        break;
                                    case 89:
                                        int iM144802 = m14480();
                                        m14484(iM144802);
                                        m14484(iM144802);
                                        break;
                                    case 90:
                                        int iM144803 = m14480();
                                        int iM144804 = m14480();
                                        m14484(iM144803);
                                        m14484(iM144804);
                                        m14484(iM144803);
                                        break;
                                    case 91:
                                        int iM144805 = m14480();
                                        int iM144806 = m14480();
                                        int iM144807 = m14480();
                                        m14484(iM144805);
                                        m14484(iM144807);
                                        m14484(iM144806);
                                        m14484(iM144805);
                                        break;
                                    case 92:
                                        int iM144808 = m14480();
                                        int iM144809 = m14480();
                                        m14484(iM144809);
                                        m14484(iM144808);
                                        m14484(iM144809);
                                        m14484(iM144808);
                                        break;
                                    case 93:
                                        int iM1448010 = m14480();
                                        int iM1448011 = m14480();
                                        int iM1448012 = m14480();
                                        m14484(iM1448011);
                                        m14484(iM1448010);
                                        m14484(iM1448012);
                                        m14484(iM1448011);
                                        m14484(iM1448010);
                                        break;
                                    case 94:
                                        int iM1448013 = m14480();
                                        int iM1448014 = m14480();
                                        int iM1448015 = m14480();
                                        int iM1448016 = m14480();
                                        m14484(iM1448014);
                                        m14484(iM1448013);
                                        m14484(iM1448016);
                                        m14484(iM1448015);
                                        m14484(iM1448014);
                                        m14484(iM1448013);
                                        break;
                                    case 95:
                                        int iM1448017 = m14480();
                                        int iM1448018 = m14480();
                                        m14484(iM1448017);
                                        m14484(iM1448018);
                                        break;
                                    case 96:
                                    case 100:
                                    case 104:
                                    case 108:
                                    case 112:
                                    case 120:
                                    case 122:
                                    case 124:
                                    case 126:
                                    case 128:
                                    case 130:
                                    case 136:
                                    case 142:
                                    case 149:
                                    case 150:
                                        break;
                                    case 97:
                                    case 101:
                                    case 105:
                                    case 109:
                                    case 113:
                                    case 127:
                                    case 129:
                                    case 131:
                                        m14479(4);
                                        m14484(16777220);
                                        m14484(16777216);
                                        break;
                                    case 98:
                                    case 102:
                                    case 106:
                                    case 110:
                                    case 114:
                                    case 137:
                                    case 144:
                                        break;
                                    case 99:
                                    case 103:
                                    case 107:
                                    case 111:
                                    case 115:
                                        m14479(4);
                                        m14484(16777219);
                                        m14484(16777216);
                                        break;
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 145:
                                    case 146:
                                    case 147:
                                    case 167:
                                    case 177:
                                        break;
                                    case 121:
                                    case 123:
                                    case 125:
                                        m14479(3);
                                        m14484(16777220);
                                        m14484(16777216);
                                        break;
                                    case 132:
                                        m14478(i2, 16777217);
                                        break;
                                    case 133:
                                    case 140:
                                        m14479(1);
                                        m14484(16777220);
                                        m14484(16777216);
                                        break;
                                    case 134:
                                        m14479(1);
                                        m14484(16777218);
                                        break;
                                    case 135:
                                    case 141:
                                        m14479(1);
                                        m14484(16777219);
                                        m14484(16777216);
                                        break;
                                    case 138:
                                        break;
                                    case 139:
                                    case 190:
                                    case 193:
                                        m14479(1);
                                        m14484(16777217);
                                        break;
                                    case 143:
                                        break;
                                    case 148:
                                    case 151:
                                    case 152:
                                        m14479(4);
                                        m14484(16777217);
                                        break;
                                    case 168:
                                    case 169:
                                        C6755.m11869("JSR/RET are not supported with computeFrames option");
                                        break;
                                    case 178:
                                        m14481(c9213, c9206.f23474);
                                        break;
                                    case 179:
                                        m14483(c9206.f23474);
                                        break;
                                    case 180:
                                        m14479(1);
                                        m14481(c9213, c9206.f23474);
                                        break;
                                    case 181:
                                        m14483(c9206.f23474);
                                        m14480();
                                        break;
                                    case 182:
                                    case 183:
                                    case 184:
                                    case 185:
                                        m14483(c9206.f23474);
                                        if (i != 184) {
                                            int iM1448019 = m14480();
                                            if (i == 183 && c9206.f23475.charAt(0) == '<') {
                                                if (this.f23529 == null) {
                                                    this.f23529 = new int[2];
                                                }
                                                int length = this.f23529.length;
                                                int i8 = this.f23527;
                                                if (i8 >= length) {
                                                    int[] iArr = new int[Math.max(i8 + 1, length * 2)];
                                                    System.arraycopy(this.f23529, 0, iArr, 0, length);
                                                    this.f23529 = iArr;
                                                }
                                                int[] iArr2 = this.f23529;
                                                int i9 = this.f23527;
                                                this.f23527 = i9 + 1;
                                                iArr2[i9] = iM1448019;
                                            }
                                        }
                                        m14481(c9213, c9206.f23474);
                                        break;
                                    case 186:
                                        m14483(c9206.f23474);
                                        m14481(c9213, c9206.f23474);
                                        break;
                                    case 187:
                                        String str = c9206.f23474;
                                        c9213.getClass();
                                        int iHashCode = (str.hashCode() + 129 + i2) & Integer.MAX_VALUE;
                                        C9206 c9206M14511 = c9213.m14511(iHashCode);
                                        while (true) {
                                            if (c9206M14511 == null) {
                                                iM14509 = c9213.m14509(new C9206(c9213.f23567, iHashCode, i2, str));
                                            } else if (c9206M14511.f23477 == 129 && c9206M14511.f23479 == iHashCode && c9206M14511.f23473 == i2 && c9206M14511.f23474.equals(str)) {
                                                iM14509 = c9206M14511.f23478;
                                            } else {
                                                c9206M14511 = (C9206) c9206M14511.f23481;
                                            }
                                        }
                                        m14484(iM14509 | 50331648);
                                        break;
                                    case 188:
                                        m14480();
                                        switch (i2) {
                                            case 4:
                                                m14484(285212681);
                                                break;
                                            case 5:
                                                m14484(285212683);
                                                break;
                                            case 6:
                                                m14484(285212674);
                                                break;
                                            case 7:
                                                m14484(285212675);
                                                break;
                                            case 8:
                                                m14484(285212682);
                                                break;
                                            case 9:
                                                m14484(285212684);
                                                break;
                                            case 10:
                                                m14484(285212673);
                                                break;
                                            case 11:
                                                m14484(285212676);
                                                break;
                                            default:
                                                C6755.m11865();
                                                break;
                                        }
                                        break;
                                    case 189:
                                        String str2 = c9206.f23474;
                                        m14480();
                                        if (str2.charAt(0) != '[') {
                                            m14484(c9213.m14510(str2) | 301989888);
                                        } else {
                                            m14481(c9213, "[".concat(str2));
                                        }
                                        break;
                                    case 192:
                                        String str3 = c9206.f23474;
                                        m14480();
                                        if (str3.charAt(0) != '[') {
                                            m14484(c9213.m14510(str3) | 33554432);
                                        } else {
                                            m14481(c9213, str3);
                                        }
                                        break;
                                    default:
                                        switch (i) {
                                            case 197:
                                                m14479(i2);
                                                m14481(c9213, c9206.f23474);
                                                break;
                                            case 198:
                                            case 199:
                                                break;
                                            default:
                                                C6755.m11865();
                                                break;
                                        }
                                        break;
                                }
                                m14479(1);
                                break;
                        }
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m14476(C9416 c9416) {
        int[] iArr = this.f23525;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != 4194308 && i6 != 4194307) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 4194304) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.f23524;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 4194308 || i9 == 4194307) ? 2 : 1;
            i8++;
        }
        c9416.m14718(((C9418) this.f23530).f24303, i3, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 4194308 || i13 == 4194307) ? 2 : 1;
            c9416.f24283[i10] = i13;
            i3 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 <= 0) {
                c9416.m14722();
                return;
            }
            int i15 = iArr2[i];
            i += (i15 == 4194308 || i15 == 4194307) ? 2 : 1;
            c9416.f24283[i10] = i15;
            i8 = i14;
            i10++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m14477(C9207 c9207) {
        int[] iArr = this.f23525;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 2;
            if (i2 >= iArr.length) {
                break;
            }
            int i6 = iArr[i2];
            if (i6 != 16777220 && i6 != 16777219) {
                i5 = 1;
            }
            i2 += i5;
            if (i6 == 16777216) {
                i4++;
            } else {
                i3 += i4 + 1;
                i4 = 0;
            }
        }
        int[] iArr2 = this.f23524;
        int i7 = 0;
        int i8 = 0;
        while (i7 < iArr2.length) {
            int i9 = iArr2[i7];
            i7 += (i9 == 16777220 || i9 == 16777219) ? 2 : 1;
            i8++;
        }
        c9207.m14450(((C9208) this.f23530).f23514, i3, i8);
        int i10 = 3;
        int i11 = 0;
        while (true) {
            int i12 = i3 - 1;
            if (i3 <= 0) {
                break;
            }
            int i13 = iArr[i11];
            i11 += (i13 == 16777220 || i13 == 16777219) ? 2 : 1;
            c9207.f23493[i10] = i13;
            i3 = i12;
            i10++;
        }
        while (true) {
            int i14 = i8 - 1;
            if (i8 <= 0) {
                c9207.m14451();
                return;
            }
            int i15 = iArr2[i];
            i += (i15 == 16777220 || i15 == 16777219) ? 2 : 1;
            c9207.f23493[i10] = i15;
            i8 = i14;
            i10++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void m14478(int i, int i2) {
        switch (this.f23526) {
            case 0:
                if (this.f23523 == null) {
                    this.f23523 = new int[10];
                }
                int length = this.f23523.length;
                if (i >= length) {
                    int[] iArr = new int[Math.max(i + 1, length * 2)];
                    System.arraycopy(this.f23523, 0, iArr, 0, length);
                    this.f23523 = iArr;
                }
                this.f23523[i] = i2;
                break;
            default:
                if (this.f23523 == null) {
                    this.f23523 = new int[10];
                }
                int length2 = this.f23523.length;
                if (i >= length2) {
                    int[] iArr2 = new int[Math.max(i + 1, length2 * 2)];
                    System.arraycopy(this.f23523, 0, iArr2, 0, length2);
                    this.f23523 = iArr2;
                }
                this.f23523[i] = i2;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void m14479(int i) {
        switch (this.f23526) {
            case 0:
                short s = this.f23528;
                if (s < i) {
                    this.f23521 = (short) (this.f23521 - (i - s));
                    this.f23528 = (short) 0;
                } else {
                    this.f23528 = (short) (s - i);
                }
                break;
            default:
                short s2 = this.f23528;
                if (s2 < i) {
                    this.f23521 = (short) (this.f23521 - (i - s2));
                    this.f23528 = (short) 0;
                } else {
                    this.f23528 = (short) (s2 - i);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final int m14480() {
        switch (this.f23526) {
            case 0:
                short s = this.f23528;
                if (s <= 0) {
                    short s2 = (short) (this.f23521 - 1);
                    this.f23521 = s2;
                    return (-s2) | 83886080;
                }
                int[] iArr = this.f23522;
                short s3 = (short) (s - 1);
                this.f23528 = s3;
                return iArr[s3];
            default:
                short s4 = this.f23528;
                if (s4 <= 0) {
                    short s5 = (short) (this.f23521 - 1);
                    this.f23521 = s5;
                    return (-s5) | 20971520;
                }
                int[] iArr2 = this.f23522;
                short s6 = (short) (s4 - 1);
                this.f23528 = s6;
                return iArr2[s6];
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public void m14481(C9213 c9213, String str) {
        int iM14471 = m14471(c9213, str, str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0);
        if (iM14471 != 0) {
            m14484(iM14471);
            if (iM14471 == 16777220 || iM14471 == 16777219) {
                m14484(16777216);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public void m14482(C9423 c9423, String str) {
        int i;
        str.getClass();
        i = 20;
        switch (str) {
            case "(Ljava/lang/Enum;)V":
                i = 18;
                break;
            case "(Ljava/lang/String;)V":
            case "(Ljava/lang/Object;)V":
            case "(Ljava/lang/Object;)Z":
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V":
                i = 97;
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/writer/ObjectWriter;":
                i = 60;
                break;
            case "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;JLjava/util/List;)V":
                i = 72;
                break;
            case "()Ljava/lang/Class;":
            case "()I":
            case "()J":
            case "()V":
            case "()Z":
                i = 2;
                break;
            case "(I)V":
            case "(J)V":
            case "(J)Z":
            case "(I)Ljava/lang/Object;":
            case "(I)Ljava/lang/Integer;":
                i = 3;
                break;
            case "(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;":
                i = 62;
                break;
            case "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z":
                i = 44;
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;)Z":
                i = 36;
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;ZLjava/util/List;)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;":
                i = 53;
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Enum;)V":
                i = 52;
                break;
            case "(Lcom/alibaba/fastjson2/JSONWriter;I)V":
            case "(Lcom/alibaba/fastjson2/JSONWriter;J)V":
                i = 37;
                break;
            default:
                if (str.charAt(0) != '(') {
                    i = 0;
                    break;
                } else {
                    int iMax = 1;
                    while (str.charAt(iMax) != ')') {
                        while (str.charAt(iMax) == '[') {
                            iMax++;
                        }
                        int i2 = iMax + 1;
                        iMax = str.charAt(iMax) == 'L' ? Math.max(i2, str.indexOf(59, i2) + 1) : i2;
                    }
                    i = iMax + 1;
                    break;
                }
                break;
        }
        int iM14470 = m14470(c9423, str, i);
        if (iM14470 != 0) {
            m14484(iM14470);
            if (iM14470 == 4194308 || iM14470 == 4194307) {
                m14484(4194304);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m14483(String str) {
        switch (this.f23526) {
            case 0:
                char cCharAt = str.charAt(0);
                if (cCharAt == '(') {
                    m14479((C9212.m14501(str) >> 2) - 1);
                } else if (cCharAt == 'J' || cCharAt == 'D') {
                    m14479(2);
                } else {
                    m14479(1);
                }
                break;
            default:
                char cCharAt2 = str.charAt(0);
                if (cCharAt2 == '(') {
                    m14479((C9422.m14779(str) >> 2) - 1);
                } else if (cCharAt2 == 'J' || cCharAt2 == 'D') {
                    m14479(2);
                } else {
                    m14479(1);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final void m14484(int i) {
        switch (this.f23526) {
            case 0:
                if (this.f23522 == null) {
                    this.f23522 = new int[10];
                }
                int length = this.f23522.length;
                short s = this.f23528;
                if (s >= length) {
                    int[] iArr = new int[Math.max(s + 1, length * 2)];
                    System.arraycopy(this.f23522, 0, iArr, 0, length);
                    this.f23522 = iArr;
                }
                int[] iArr2 = this.f23522;
                short s2 = this.f23528;
                short s3 = (short) (s2 + 1);
                this.f23528 = s3;
                iArr2[s2] = i;
                short s4 = (short) (this.f23521 + s3);
                C9208 c9208 = (C9208) this.f23530;
                if (s4 > c9208.f23510) {
                    c9208.f23510 = s4;
                }
                break;
            default:
                if (this.f23522 == null) {
                    this.f23522 = new int[10];
                }
                int length2 = this.f23522.length;
                short s5 = this.f23528;
                if (s5 >= length2) {
                    int[] iArr3 = new int[Math.max(s5 + 1, length2 * 2)];
                    System.arraycopy(this.f23522, 0, iArr3, 0, length2);
                    this.f23522 = iArr3;
                }
                int[] iArr4 = this.f23522;
                short s6 = this.f23528;
                short s7 = (short) (s6 + 1);
                this.f23528 = s7;
                iArr4[s6] = i;
                short s8 = (short) (this.f23521 + s7);
                C9418 c9418 = (C9418) this.f23530;
                if (s8 > c9418.f24301) {
                    c9418.f24301 = s8;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[LOOP:0: B:7:0x000d->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m14485(C9213 c9213, int i) {
        int i2;
        if (i == 16777222 || ((-16777216) & i) == 50331648) {
            for (int i3 = 0; i3 < this.f23527; i3++) {
                int i4 = this.f23529[i3];
                int i5 = (-268435456) & i4;
                int i6 = 251658240 & i4;
                int i7 = i4 & 1048575;
                if (i6 == 67108864) {
                    i2 = this.f23525[i7];
                } else {
                    if (i6 == 83886080) {
                        int[] iArr = this.f23524;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i != i4) {
                        return 33554432 | (i == 16777222 ? c9213.m14510(c9213.f23564) : c9213.m14510(c9213.f23566[i & 1048575].f23474));
                    }
                }
                i4 = i2 + i5;
                if (i != i4) {
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int m14486(int i, int i2) {
        int i3 = (-67108864) & i;
        int i4 = 62914560 & i;
        if (i4 == 16777216) {
            int i5 = i3 + this.f23525[i & 1048575];
            if ((i & 1048576) == 0 || !(i5 == 4194308 || i5 == 4194307)) {
                return i5;
            }
            return 4194304;
        }
        if (i4 != 20971520) {
            return i;
        }
        int i6 = i3 + this.f23524[i2 - (i & 1048575)];
        if ((i & 1048576) == 0 || !(i6 == 4194308 || i6 == 4194307)) {
            return i6;
        }
        return 4194304;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[LOOP:0: B:7:0x000d->B:23:0x004f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int m14487(C9423 c9423, int i) {
        int i2;
        if (i == 4194310 || ((-4194304) & i) == 12582912) {
            for (int i3 = 0; i3 < this.f23527; i3++) {
                int i4 = this.f23529[i3];
                int i5 = (-67108864) & i4;
                int i6 = 62914560 & i4;
                int i7 = i4 & 1048575;
                if (i6 == 16777216) {
                    i2 = this.f23525[i7];
                } else {
                    if (i6 == 20971520) {
                        int[] iArr = this.f23524;
                        i2 = iArr[iArr.length - i7];
                    }
                    if (i != i4) {
                        return 8388608 | (i == 4194310 ? c9423.m14785(c9423.f24402) : c9423.m14785(c9423.f24404[i & 1048575].f23474));
                    }
                }
                i4 = i2 + i5;
                if (i != i4) {
                }
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final int m14488(int i) {
        switch (this.f23526) {
            case 0:
                int[] iArr = this.f23523;
                if (iArr == null || i >= iArr.length) {
                    return i | 67108864;
                }
                int i2 = iArr[i];
                if (i2 != 0) {
                    return i2;
                }
                int i3 = i | 67108864;
                iArr[i] = i3;
                return i3;
            default:
                int[] iArr2 = this.f23523;
                if (iArr2 == null || i >= iArr2.length) {
                    return i | 16777216;
                }
                int i4 = iArr2[i];
                if (i4 != 0) {
                    return i4;
                }
                int i5 = i | 16777216;
                iArr2[i] = i5;
                return i5;
        }
    }
}
