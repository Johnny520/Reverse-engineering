package yyds;

import android.content.res.TypedArray;
import com.tencent.mmkv.MMKV;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2104 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int[] f10432 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static StringBuilder m3998(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static Integer m3999(Integer num, MMKV mmkv, String str) {
        return Integer.valueOf(mmkv.getInt(str, num.intValue()));
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static String m4000(Object[] objArr, int i, String str, long j) {
        String str2 = String.format(str, Arrays.copyOf(objArr, i));
        AbstractC2328.m4341(j);
        return str2;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static Long m4001(Long l, MMKV mmkv, String str) {
        return Long.valueOf(mmkv.getLong(str, l.longValue()));
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static MMKV m4002(long j, long j2) {
        AbstractC2328.m4341(j);
        MMKV mmkvM3912 = AbstractC0027.m3912();
        AbstractC2328.m4341(j2);
        return mmkvM3912;
    }

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public static /* synthetic */ int[] m4003(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f10432, 0, iArr, 0, i);
        return iArr;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static String m4004(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public static /* synthetic */ void m4005(InterfaceC1212 interfaceC1212) throws Exception {
        boolean zIsTerminated;
        if (interfaceC1212 instanceof AutoCloseable) {
            interfaceC1212.close();
            return;
        }
        if (!(interfaceC1212 instanceof ExecutorService)) {
            if (interfaceC1212 instanceof TypedArray) {
                ((TypedArray) interfaceC1212).recycle();
                return;
            } else {
                C1693.m3437();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) interfaceC1212;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static C0213 m4006(long j) {
        C0213 c0213 = new C0213();
        AbstractC2328.m4341(j);
        return c0213;
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static void m4007(StringBuilder sb, int i, long j) {
        sb.append(i);
        sb.append(AbstractC2328.m4341(j));
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static String m4008(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt)) {
                i++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public static /* synthetic */ String m4009(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static void m4010(String str, String str2, LinkedHashSet linkedHashSet) {
        linkedHashSet.add(new Pair(str, str2));
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static Float m4011(Float f, MMKV mmkv, String str) {
        return Float.valueOf(mmkv.getFloat(str, f.floatValue()));
    }

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public static /* synthetic */ int m4012(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public static /* synthetic */ String m4013(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static String m4014(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static String m4015(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static String m4016(Class cls, StringBuilder sb) {
        sb.append(AbstractC1700.m3448(cls));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public static void m4017(StringBuilder sb, boolean z, long j) {
        sb.append(z);
        sb.append(AbstractC2328.m4341(j));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static int m4018(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static InterfaceC1863 m4019(long j, long j2) {
        String strM4341 = AbstractC2328.m4341(j);
        AbstractC2328.m4341(j2);
        return C1586.m3253(strM4341);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static Boolean m4020(Boolean bool, MMKV mmkv, String str) {
        return Boolean.valueOf(mmkv.getBoolean(str, bool.booleanValue()));
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static int m4021(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }
}
