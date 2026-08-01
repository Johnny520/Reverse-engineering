package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sn implements android.view.animation.Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float r13) {
            r12 = this;
            r10 = 4613937818241073152(0x4008000000000000, double:3.0)
            r4 = 0
            java.lang.String r0 = "ۢۧ۟"
            int r0 = androidx.constraintlayout.helper.widget.C0017.m70(r0)
            r2 = r4
            r6 = r4
            r8 = r4
        Ld:
            switch(r0) {
                case 56356: goto L11;
                case 1746781: goto L5a;
                case 1748734: goto L2e;
                case 1749818: goto L46;
                case 1755619: goto L72;
                default: goto L10;
            }
        L10:
            goto Ld
        L11:
            double r0 = r6 + r10
            r6 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r6 = r2 / r6
            double r0 = r0 - r6
            double r0 = r0 - r10
            r6 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r0 = r0 * r6
            double r0 = r0 / r2
            double r0 = java.lang.Math.sin(r0)
            double r0 = r0 * r8
            double r0 = r4 - r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r2
            double r0 = r4 - r0
            float r0 = (float) r0
            return r0
        L2e:
            int r0 = androidx.savedstate.C0034.m137()
            if (r0 > 0) goto L3f
            r0 = 28
            androidx.core.widget.C0025.f25 = r0
            java.lang.String r0 = "ۥۣۢ"
        L3a:
            int r0 = androidx.versionedparcelable.C0040.m160(r0)
            goto Ld
        L3f:
            java.lang.String r0 = "ۢۧ۟"
            int r0 = androidx.recyclerview.widget.C0033.m132(r0)
            goto Ld
        L46:
            double r6 = (double) r13
            int r0 = androidx.recyclerview.widget.C0033.f33
            int r1 = androidx.viewpager2.adapter.C0043.f43
            int r1 = r1 % (-6160)
            int r0 = r0 - r1
            if (r0 < 0) goto L53
            r0 = 6
            androidx.appcompat.widget.C0015.f15 = r0
        L53:
            java.lang.String r0 = "ۣۨۨ"
            int r0 = android.app.C0002.m8(r0)
            goto Ld
        L5a:
            r0 = 1049582633(0x3e8f5c29, float:0.28)
            double r2 = (double) r0
            int r0 = androidx.constraintlayout.widget.C0019.m77()
            if (r0 > 0) goto L6f
            r0 = 55
            android.support.v4.graphics.drawable.C0006.f6 = r0
            java.lang.String r0 = "۟ۢ۠"
            int r0 = androidx.legacy.content.C0028.m114(r0)
            goto Ld
        L6f:
            java.lang.String r0 = "ۡۥ"
            goto L3a
        L72:
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            r8 = -4601552919265804288(0xc024000000000000, double:-10.0)
            double r8 = r8 * r6
            double r8 = java.lang.Math.pow(r0, r8)
            int r0 = androidx.activity.C0011.f11
            if (r0 < 0) goto L86
            java.lang.String r0 = "ۢۧ۟"
        L81:
            int r0 = com.ljx.wechatmod.auth.C0065.m263(r0)
            goto Ld
        L86:
            java.lang.String r0 = "۟ۢ۠"
            goto L81
    }
}
