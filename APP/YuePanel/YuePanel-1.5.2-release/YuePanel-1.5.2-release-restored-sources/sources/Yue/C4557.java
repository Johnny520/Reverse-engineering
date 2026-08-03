package Yue;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class C4557 {

    /* JADX INFO: renamed from: ۥ */
    public static final boolean f967 = false;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final ThreadLocal<DecimalFormat>[] f968;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        f968 = threadLocalArr;
    }

    /* JADX INFO: renamed from: ۥ */
    public static final DecimalFormat m1504(int i) {
        DecimalFormat decimalFormat = new DecimalFormat("0");
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m1505(double d, int i) {
        DecimalFormat decimalFormatM1504;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f968;
        if (i < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i];
            DecimalFormat decimalFormatM15042 = threadLocal.get();
            if (decimalFormatM15042 == null) {
                decimalFormatM15042 = m1504(i);
                threadLocal.set(decimalFormatM15042);
            } else {
                C5499.m17102(decimalFormatM15042, "get() ?: default().also(this::set)");
            }
            decimalFormatM1504 = decimalFormatM15042;
        } else {
            decimalFormatM1504 = m1504(i);
        }
        String str = decimalFormatM1504.format(d);
        C5499.m17102(str, "format.format(value)");
        return str;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String m13531(double d, int i) {
        DecimalFormat decimalFormatM1504 = m1504(0);
        decimalFormatM1504.setMaximumFractionDigits(i);
        String str = decimalFormatM1504.format(d);
        C5499.m17102(str, "createFormatForDecimals(… }\n        .format(value)");
        return str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m13532() {
        return f967;
    }
}
