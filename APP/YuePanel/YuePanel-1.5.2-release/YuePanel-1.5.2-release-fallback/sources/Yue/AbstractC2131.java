package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(19)
public abstract class AbstractC2131 extends android.text.style.ReplacementSpan {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.graphics.Paint.FontMetricsInt f6708;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC4410
    public final Yue.C6495 f6709;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public short f6710;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public short f6711;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float f6712;

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public AbstractC2131(@Yue.InterfaceC4410 Yue.C6495 r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Paint$FontMetricsInt r0 = new android.graphics.Paint$FontMetricsInt
            r0.<init>()
            r1.f6708 = r0
            r0 = -1
            r1.f6710 = r0
            r1.f6711 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.f6712 = r0
            java.lang.String r0 = "rasterizer cannot be null"
            Yue.C4868.m19182(r2, r0)
            r1.f6709 = r2
            return
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@Yue.InterfaceC4410 android.graphics.Paint r1, @android.annotation.SuppressLint({"UnknownNullness"}) java.lang.CharSequence r2, int r3, int r4, @Yue.InterfaceC4544 android.graphics.Paint.FontMetricsInt r5) {
            r0 = this;
            android.graphics.Paint$FontMetricsInt r2 = r0.f6708
            r1.getFontMetricsInt(r2)
            android.graphics.Paint$FontMetricsInt r1 = r0.f6708
            int r2 = r1.descent
            int r1 = r1.ascent
            int r2 = r2 - r1
            int r1 = java.lang.Math.abs(r2)
            float r1 = (float) r1
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r2
            Yue.ۥۢۢۤۥ r2 = r0.f6709
            int r2 = r2.m23988()
            float r2 = (float) r2
            float r1 = r1 / r2
            r0.f6712 = r1
            Yue.ۥۢۢۤۥ r1 = r0.f6709
            int r1 = r1.m23988()
            float r1 = (float) r1
            float r2 = r0.f6712
            float r1 = r1 * r2
            int r1 = (int) r1
            short r1 = (short) r1
            r0.f6711 = r1
            Yue.ۥۢۢۤۥ r1 = r0.f6709
            int r1 = r1.m23993()
            float r1 = (float) r1
            float r2 = r0.f6712
            float r1 = r1 * r2
            int r1 = (int) r1
            short r1 = (short) r1
            r0.f6710 = r1
            if (r5 == 0) goto L4e
            android.graphics.Paint$FontMetricsInt r2 = r0.f6708
            int r3 = r2.ascent
            r5.ascent = r3
            int r3 = r2.descent
            r5.descent = r3
            int r3 = r2.top
            r5.top = r3
            int r2 = r2.bottom
            r5.bottom = r2
        L4e:
            return r1
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20025})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final int m10019() {
            r1 = this;
            short r0 = r1.f6711
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20025})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final int m10020() {
            r1 = this;
            Yue.ۥۢۢۤۥ r0 = r1.m10022()
            int r0 = r0.m23989()
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final float m10021() {
            r1 = this;
            float r0 = r1.f6712
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Yue.C6495 m10022() {
            r1 = this;
            Yue.ۥۢۢۤۥ r0 = r1.f6709
            return r0
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final int m10023() {
            r1 = this;
            short r0 = r1.f6710
            return r0
    }
}
