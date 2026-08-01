package com.materialkolor.dynamiccolor;

import androidx.compose.foundation.text.C0995;
import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.util.C4211;
import p034.AbstractC6347;
import p053.AbstractC6561;
import p263.AbstractC8256;
import p263.C8255;
import p265.C8260;
import p266.C8263;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C3817 {
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean m8173(C8260 c8260) {
        Variant variant = c8260.f22867;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public C3806 mo8141() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "tertiary_fixed_dim";
        c3805.f11979 = new C3800(20);
        c3805.f11978 = new C3800(21);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$tertiaryFixedDim$3(this);
        c3805.f11981 = new C3800(22);
        c3805.f11983 = new C3801(this, 3);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public C3806 mo8142() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "tertiary_fixed";
        int i = 4;
        c3805.f11979 = new C3799(i);
        c3805.f11978 = new C3799(6);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$tertiaryFixed$3(this);
        c3805.f11981 = new C3799(7);
        c3805.f11983 = new C3801(this, i);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public C3806 mo8143() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "tertiary_container";
        c3805.f11979 = new C3798(22);
        c3805.f11978 = new C3798(this);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$tertiaryContainer$3(this);
        c3805.f11981 = new C3798(24);
        c3805.f11983 = new C3801(this, 7);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public C3806 mo8144() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "tertiary";
        c3805.f11979 = new C3816(20);
        c3805.f11978 = new C3816(21);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$tertiary$3(this);
        c3805.f11981 = new C3816(22);
        c3805.f11983 = new C3801(this, 11);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public C8263 mo8151(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8255.f22856;
        switch (AbstractC3820.f12013[variant.ordinal()]) {
            case 1:
            case 2:
                return AbstractC6561.m12048(d, c8255.f22855 / 8.0d);
            case 3:
                return AbstractC6561.m12048(d, 10.0d);
            case 4:
                return AbstractC6561.m12048(d, 0.0d);
            case 5:
                return AbstractC6561.m12048(d, 2.0d);
            case 6:
                return AbstractC6561.m12048(d, 0.0d);
            case 7:
                return AbstractC6561.m12048(d, 6.0d);
            case 8:
                double d2 = (d + 15.0d) % 360.0d;
                if (d2 < 0.0d) {
                    d2 += 360.0d;
                }
                return AbstractC6561.m12048(d2, 8.0d);
            case 9:
                return AbstractC6561.m12048(d, 10.0d);
            default:
                C4211.m8611();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public C8255 mo8152(C8260 c8260, C3806 c3806) {
        double dMo8170 = mo8170(c8260, c3806);
        C8263 c8263 = (C8263) c3806.f11989.invoke(c8260);
        return AbstractC8256.m13823(c8263.f22878, c8263.f22877, dMo8170);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public C8263 mo8153(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        switch (AbstractC3820.f12013[variant.ordinal()]) {
            default:
                C4211.m8611();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public C3806 mo8154() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "error_container";
        c3805.f11979 = new C3816(23);
        c3805.f11978 = new C3816(24);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$errorContainer$3(this);
        c3805.f11981 = new C3816(25);
        c3805.f11983 = new C3801(this, 12);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C3806 mo8155() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "error";
        c3805.f11979 = new C3816(6);
        c3805.f11978 = new C3816(7);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$error$3(this);
        c3805.f11981 = new C3816(9);
        c3805.f11983 = new C3801(this, 10);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C3806 mo8156() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "background";
        c3805.f11979 = new C3800(24);
        c3805.f11978 = new C3799(5);
        c3805.f11977 = true;
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public C3806 mo8157() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "secondary_container";
        c3805.f11979 = new C3800(13);
        c3805.f11978 = new C3800(this);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$secondaryContainer$3(this);
        c3805.f11981 = new C3800(16);
        c3805.f11983 = new C3801(this, 2);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public C3806 mo8158() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "secondary";
        c3805.f11979 = new C3797(27);
        c3805.f11978 = new C3797(29);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$secondary$3(this);
        c3805.f11981 = new C3816(0);
        c3805.f11983 = new C3801(this, 9);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public C3806 mo8159() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "surface_bright";
        c3805.f11979 = new C3797(9);
        c3805.f11978 = new C3797(10);
        c3805.f11977 = true;
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public C3806 mo8160() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "surface_dim";
        c3805.f11979 = new C3797(28);
        c3805.f11978 = new C3816(8);
        c3805.f11977 = true;
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public C3806 mo8161() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "secondary_fixed";
        c3805.f11979 = new C3815(11);
        c3805.f11978 = new C3815(12);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$secondaryFixed$3(this);
        int i = 13;
        c3805.f11981 = new C3815(i);
        c3805.f11983 = new C3801(this, i);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public C3806 mo8162() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "secondary_fixed_dim";
        c3805.f11979 = new C0995(25);
        c3805.f11978 = new C0995(26);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$secondaryFixedDim$3(this);
        c3805.f11981 = new C0995(27);
        c3805.f11983 = new C3801(this, 1);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public C3806 mo8163() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "inverse_surface";
        c3805.f11979 = new C3797(22);
        c3805.f11978 = new C3797(23);
        c3805.f11977 = true;
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public C3806 mo8164() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "primary_fixed";
        c3805.f11979 = new C3799(16);
        c3805.f11978 = new C3799(17);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$primaryFixed$3(this);
        c3805.f11981 = new C3799(18);
        c3805.f11983 = new C3801(this, 6);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public C3806 mo8165() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "primary_fixed_dim";
        c3805.f11979 = new C0995(21);
        c3805.f11978 = new C0995(22);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$primaryFixedDim$3(this);
        c3805.f11981 = new C0995(23);
        c3805.f11983 = new C3801(this, 0);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public C3806 mo8166() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "primary";
        c3805.f11979 = new C3799(8);
        c3805.f11978 = new C3799(9);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$primary$3(this);
        c3805.f11981 = new C3799(10);
        c3805.f11983 = new C3801(this, 5);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public C3806 mo8167() {
        C3805 c3805 = new C3805();
        c3805.f11980 = "primary_container";
        c3805.f11979 = new C3797(24);
        c3805.f11978 = new C3797(this);
        c3805.f11977 = true;
        c3805.f11975 = new ColorSpec2021$primaryContainer$3(this);
        c3805.f11981 = new C3797(26);
        c3805.f11983 = new C3801(this, 8);
        return c3805.m8134();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public C8263 mo8168(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8255.f22856;
        switch (AbstractC3820.f12013[variant.ordinal()]) {
            case 1:
            case 2:
                return AbstractC6561.m12048(d, c8255.f22855);
            case 3:
                double d2 = (d - 50.0d) % 360.0d;
                if (d2 < 0.0d) {
                    d2 += 360.0d;
                }
                return AbstractC6561.m12048(d2, 48.0d);
            case 4:
                return AbstractC6561.m12048(d, 0.0d);
            case 5:
                return AbstractC6561.m12048(d, 12.0d);
            case 6:
                return AbstractC6561.m12048(d, 48.0d);
            case 7:
                return AbstractC6561.m12048(d, 36.0d);
            case 8:
                double d3 = (d + 240.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC6561.m12048(d3, 40.0d);
            case 9:
                return AbstractC6561.m12048(d, 200.0d);
            default:
                C4211.m8611();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public C8263 mo8169(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8255.f22855;
        double d2 = c8255.f22856;
        switch (AbstractC3820.f12013[variant.ordinal()]) {
            case 1:
                return AbstractC6561.m12048(d2, (d / 8.0d) + 4.0d);
            case 2:
                return AbstractC6561.m12048(d2, (d / 8.0d) + 4.0d);
            case 3:
                return AbstractC6561.m12048(d2, 16.0d);
            case 4:
                return AbstractC6561.m12048(d2, 0.0d);
            case 5:
                return AbstractC6561.m12048(d2, 2.0d);
            case 6:
                return AbstractC6561.m12048(d2, 0.0d);
            case 7:
                return AbstractC6561.m12048(d2, 8.0d);
            case 8:
                double d3 = (d2 + 15.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC6561.m12048(d3, 12.0d);
            case 9:
                return AbstractC6561.m12048(d2, 12.0d);
            default:
                C4211.m8611();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public double mo8170(p265.C8260 r31, com.materialkolor.dynamiccolor.C3806 r32) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.materialkolor.dynamiccolor.C3817.mo8170(飘花落叶言楪哲兰苏世子.飘花落叶言子楪世哲苏兰, com.materialkolor.dynamiccolor.飘花落叶言子楪兰哲苏世):double");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3806 m8174(C8260 c8260) {
        return c8260.f22866 ? mo8159() : mo8160();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public C8263 mo8171(Variant variant, C8255 c8255, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c8255.f22856;
        switch (AbstractC3820.f12013[variant.ordinal()]) {
            case 1:
            case 2:
                double d2 = c8255.f22855;
                return AbstractC6561.m12048(d, Math.max(d2 - 32.0d, d2 * 0.5d));
            case 3:
                double d3 = (d - 50.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC6561.m12048(d3, 36.0d);
            case 4:
                return AbstractC6561.m12048(d, 0.0d);
            case 5:
                return AbstractC6561.m12048(d, 8.0d);
            case 6:
                return AbstractC6561.m12048(d, 16.0d);
            case 7:
                return AbstractC6561.m12048(d, 16.0d);
            case 8:
                return AbstractC6561.m12048(AbstractC6347.m11895(c8255, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d}), 24.0d);
            case 9:
                return AbstractC6561.m12048(AbstractC6347.m11895(c8255, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d}), 24.0d);
            default:
                C4211.m8611();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p266.C8263 mo8172(com.materialkolor.scheme.Variant r22, p263.C8255 r23, boolean r24, com.materialkolor.scheme.DynamicScheme$Platform r25) {
        /*
            Method dump skipped, instruction units count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.materialkolor.dynamiccolor.C3817.mo8172(com.materialkolor.scheme.Variant, 飘花落叶言楪哲兰世苏子.飘花落叶言子楪世苏兰哲, boolean, com.materialkolor.scheme.DynamicScheme$Platform):飘花落叶言楪哲兰苏子世.飘花落叶言子楪世苏兰哲");
    }
}
