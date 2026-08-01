package p265s1;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p276t1.AbstractC8027c;
import p276t1.C8034f0;
import p276t1.C8036g0;
import p276t1.C8043k;

/* JADX INFO: renamed from: s1.w1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7157w1 {

    /* JADX INFO: renamed from: a */
    public static final C7157w1 f23687a = new C7157w1();

    /* JADX INFO: renamed from: a */
    public static double m28246a(InterfaceC0184l interfaceC0184l, double d10) {
        return ((Number) interfaceC0184l.mo27m(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: renamed from: b */
    public static double m28247b(InterfaceC0184l interfaceC0184l, double d10) {
        return ((Number) interfaceC0184l.mo27m(Double.valueOf(d10))).doubleValue();
    }

    /* JADX INFO: renamed from: c */
    public static final ColorSpace m28248c(AbstractC8027c abstractC8027c) {
        ColorSpace colorSpaceM28334a;
        C8043k c8043k = C8043k.f26795a;
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30939A())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30946g())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30947h())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30948i())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30949j())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30952m())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30953n())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30954o())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30956q())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30957r())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30958s())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30959t())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30960u())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30961v())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30964y())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (AbstractC1061t.m3842c(abstractC8027c, c8043k.m30965z())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34 && (colorSpaceM28334a = C7169z1.m28334a(abstractC8027c)) != null) {
            return colorSpaceM28334a;
        }
        if (!(abstractC8027c instanceof C8034f0)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        C8034f0 c8034f0 = (C8034f0) abstractC8027c;
        float[] fArrM30932c = c8034f0.m30884B().m30932c();
        C8036g0 c8036g0M30893z = c8034f0.m30893z();
        ColorSpace.Rgb.TransferParameters transferParameters = c8036g0M30893z != null ? new ColorSpace.Rgb.TransferParameters(c8036g0M30893z.m30919a(), c8036g0M30893z.m30920b(), c8036g0M30893z.m30921c(), c8036g0M30893z.m30922d(), c8036g0M30893z.m30923e(), c8036g0M30893z.m30924f(), c8036g0M30893z.m30925g()) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(abstractC8027c.m30853f(), c8034f0.m30892y(), fArrM30932c, transferParameters);
        }
        String strM30853f = abstractC8027c.m30853f();
        float[] fArrM30892y = c8034f0.m30892y();
        final InterfaceC0184l interfaceC0184lM30889v = c8034f0.m30889v();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: s1.u1
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                return C7157w1.m28246a(interfaceC0184lM30889v, d10);
            }
        };
        final InterfaceC0184l interfaceC0184lM30885r = c8034f0.m30885r();
        return new ColorSpace.Rgb(strM30853f, fArrM30892y, fArrM30932c, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: s1.v1
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d10) {
                return C7157w1.m28247b(interfaceC0184lM30885r, d10);
            }
        }, c8034f0.mo30851d(0), c8034f0.mo30850c(0));
    }
}
