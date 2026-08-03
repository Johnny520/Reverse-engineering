package Yue;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* JADX INFO: renamed from: Yue.ۥۡۢۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C6492 {
    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ */
    public static final BigDecimal m2990(BigDecimal bigDecimal) {
        C5499.m17103(bigDecimal, "<this>");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(BigDecimal.ONE);
        C5499.m17102(bigDecimalSubtract, "this.subtract(BigDecimal.ONE)");
        return bigDecimalSubtract;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ */
    public static final BigDecimal m2991(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C5499.m17103(bigDecimal, "<this>");
        C5499.m17103(bigDecimal2, "other");
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        C5499.m17102(bigDecimalDivide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return bigDecimalDivide;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final BigDecimal m20482(BigDecimal bigDecimal) {
        C5499.m17103(bigDecimal, "<this>");
        BigDecimal bigDecimalAdd = bigDecimal.add(BigDecimal.ONE);
        C5499.m17102(bigDecimalAdd, "this.add(BigDecimal.ONE)");
        return bigDecimalAdd;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final BigDecimal m20483(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C5499.m17103(bigDecimal, "<this>");
        C5499.m17103(bigDecimal2, "other");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        C5499.m17102(bigDecimalSubtract, "this.subtract(other)");
        return bigDecimalSubtract;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final BigDecimal m20484(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C5499.m17103(bigDecimal, "<this>");
        C5499.m17103(bigDecimal2, "other");
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        C5499.m17102(bigDecimalAdd, "this.add(other)");
        return bigDecimalAdd;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final BigDecimal m20485(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C5499.m17103(bigDecimal, "<this>");
        C5499.m17103(bigDecimal2, "other");
        BigDecimal bigDecimalRemainder = bigDecimal.remainder(bigDecimal2);
        C5499.m17102(bigDecimalRemainder, "this.remainder(other)");
        return bigDecimalRemainder;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final BigDecimal m20486(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        C5499.m17103(bigDecimal, "<this>");
        C5499.m17103(bigDecimal2, "other");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal2);
        C5499.m17102(bigDecimalMultiply, "this.multiply(other)");
        return bigDecimalMultiply;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final BigDecimal m20487(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final BigDecimal m20488(double d, MathContext mathContext) {
        C5499.m17103(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d), mathContext);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final BigDecimal m20489(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final BigDecimal m20490(float f, MathContext mathContext) {
        C5499.m17103(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final BigDecimal m20491(int i) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        C5499.m17102(bigDecimalValueOf, "valueOf(this.toLong())");
        return bigDecimalValueOf;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final BigDecimal m20492(int i, MathContext mathContext) {
        C5499.m17103(mathContext, "mathContext");
        return new BigDecimal(i, mathContext);
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final BigDecimal m20493(long j) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        C5499.m17102(bigDecimalValueOf, "valueOf(this)");
        return bigDecimalValueOf;
    }

    @InterfaceC5438
    @InterfaceC7470(version = "1.2")
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final BigDecimal m20494(long j, MathContext mathContext) {
        C5499.m17103(mathContext, "mathContext");
        return new BigDecimal(j, mathContext);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final BigDecimal m20495(BigDecimal bigDecimal) {
        C5499.m17103(bigDecimal, "<this>");
        BigDecimal bigDecimalNegate = bigDecimal.negate();
        C5499.m17102(bigDecimalNegate, "this.negate()");
        return bigDecimalNegate;
    }
}
