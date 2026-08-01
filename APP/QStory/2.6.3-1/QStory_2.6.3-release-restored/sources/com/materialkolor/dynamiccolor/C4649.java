package com.materialkolor.dynamiccolor;

import androidx.compose.foundation.text.C1833;
import androidx.window.area.AbstractC3400;
import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import p034.AbstractC7082;
import p050.AbstractC7173;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p264.C8987;
import p279.AbstractC9085;
import p279.C9084;
import p281.C9089;
import p282.C9092;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C4649 {
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static boolean m8732(C9089 c9089) {
        Variant variant = c9089.f23212;
        return variant == Variant.FIDELITY || variant == Variant.CONTENT;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public C4638 mo8700() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "tertiary_fixed_dim";
        c4637.f12324 = new C4632(20);
        c4637.f12323 = new C4632(21);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$tertiaryFixedDim$3(this);
        c4637.f12326 = new C4632(22);
        c4637.f12328 = new C4633(this, 3);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public C4638 mo8701() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "tertiary_fixed";
        int i = 4;
        c4637.f12324 = new C4631(i);
        c4637.f12323 = new C4631(6);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$tertiaryFixed$3(this);
        c4637.f12326 = new C4631(7);
        c4637.f12328 = new C4633(this, i);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public C4638 mo8702() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "tertiary_container";
        c4637.f12324 = new C4630(22);
        c4637.f12323 = new C4630(this);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$tertiaryContainer$3(this);
        c4637.f12326 = new C4630(24);
        c4637.f12328 = new C4633(this, 7);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public C4638 mo8703() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "tertiary";
        c4637.f12324 = new C4648(20);
        c4637.f12323 = new C4648(21);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$tertiary$3(this);
        c4637.f12326 = new C4648(22);
        c4637.f12328 = new C4633(this, 11);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public C9092 mo8710(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c9084.f23201;
        switch (AbstractC4652.f12358[variant.ordinal()]) {
            case 1:
            case 2:
                return AbstractC7390.m12607(d, c9084.f23200 / 8.0d);
            case 3:
                return AbstractC7390.m12607(d, 10.0d);
            case 4:
                return AbstractC7390.m12607(d, 0.0d);
            case 5:
                return AbstractC7390.m12607(d, 2.0d);
            case 6:
                return AbstractC7390.m12607(d, 0.0d);
            case 7:
                return AbstractC7390.m12607(d, 6.0d);
            case 8:
                double d2 = (d + 15.0d) % 360.0d;
                if (d2 < 0.0d) {
                    d2 += 360.0d;
                }
                return AbstractC7390.m12607(d2, 8.0d);
            case 9:
                return AbstractC7390.m12607(d, 10.0d);
            default:
                C5043.m9170();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public C9084 mo8711(C9089 c9089, C4638 c4638) {
        double dMo8729 = mo8729(c9089, c4638);
        C9092 c9092 = (C9092) c4638.f12334.invoke(c9089);
        return AbstractC9085.m14382(c9092.f23223, c9092.f23222, dMo8729);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public C9092 mo8712(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        switch (AbstractC4652.f12358[variant.ordinal()]) {
            default:
                C5043.m9170();
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
    public C4638 mo8713() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "error_container";
        c4637.f12324 = new C4648(23);
        c4637.f12323 = new C4648(24);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$errorContainer$3(this);
        c4637.f12326 = new C4648(25);
        c4637.f12328 = new C4633(this, 12);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public C4638 mo8714() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "error";
        c4637.f12324 = new C4648(6);
        c4637.f12323 = new C4648(7);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$error$3(this);
        c4637.f12326 = new C4648(9);
        c4637.f12328 = new C4633(this, 10);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public C4638 mo8715() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "background";
        c4637.f12324 = new C4632(24);
        c4637.f12323 = new C4631(5);
        c4637.f12322 = true;
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public C4638 mo8716() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "secondary_container";
        c4637.f12324 = new C4632(13);
        c4637.f12323 = new C4632(this);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$secondaryContainer$3(this);
        c4637.f12326 = new C4632(16);
        c4637.f12328 = new C4633(this, 2);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public C4638 mo8717() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "secondary";
        c4637.f12324 = new C4629(27);
        c4637.f12323 = new C4629(29);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$secondary$3(this);
        c4637.f12326 = new C4648(0);
        c4637.f12328 = new C4633(this, 9);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public C4638 mo8718() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "surface_bright";
        c4637.f12324 = new C4629(9);
        c4637.f12323 = new C4629(10);
        c4637.f12322 = true;
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public C4638 mo8719() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "surface_dim";
        c4637.f12324 = new C4629(28);
        c4637.f12323 = new C4648(8);
        c4637.f12322 = true;
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public C4638 mo8720() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "secondary_fixed";
        c4637.f12324 = new C4647(11);
        c4637.f12323 = new C4647(12);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$secondaryFixed$3(this);
        int i = 13;
        c4637.f12326 = new C4647(i);
        c4637.f12328 = new C4633(this, i);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public C4638 mo8721() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "secondary_fixed_dim";
        c4637.f12324 = new C1833(25);
        c4637.f12323 = new C1833(26);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$secondaryFixedDim$3(this);
        c4637.f12326 = new C1833(27);
        c4637.f12328 = new C4633(this, 1);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public C4638 mo8722() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "inverse_surface";
        c4637.f12324 = new C4629(22);
        c4637.f12323 = new C4629(23);
        c4637.f12322 = true;
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public C4638 mo8723() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "primary_fixed";
        c4637.f12324 = new C4631(16);
        c4637.f12323 = new C4631(17);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$primaryFixed$3(this);
        c4637.f12326 = new C4631(18);
        c4637.f12328 = new C4633(this, 6);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public C4638 mo8724() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "primary_fixed_dim";
        c4637.f12324 = new C1833(21);
        c4637.f12323 = new C1833(22);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$primaryFixedDim$3(this);
        c4637.f12326 = new C1833(23);
        c4637.f12328 = new C4633(this, 0);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public C4638 mo8725() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "primary";
        c4637.f12324 = new C4631(8);
        c4637.f12323 = new C4631(9);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$primary$3(this);
        c4637.f12326 = new C4631(10);
        c4637.f12328 = new C4633(this, 5);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public C4638 mo8726() {
        C4637 c4637 = new C4637();
        c4637.f12325 = "primary_container";
        c4637.f12324 = new C4629(24);
        c4637.f12323 = new C4629(this);
        c4637.f12322 = true;
        c4637.f12320 = new ColorSpec2021$primaryContainer$3(this);
        c4637.f12326 = new C4629(26);
        c4637.f12328 = new C4633(this, 8);
        return c4637.m8693();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public C9092 mo8727(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c9084.f23201;
        switch (AbstractC4652.f12358[variant.ordinal()]) {
            case 1:
            case 2:
                return AbstractC7390.m12607(d, c9084.f23200);
            case 3:
                double d2 = (d - 50.0d) % 360.0d;
                if (d2 < 0.0d) {
                    d2 += 360.0d;
                }
                return AbstractC7390.m12607(d2, 48.0d);
            case 4:
                return AbstractC7390.m12607(d, 0.0d);
            case 5:
                return AbstractC7390.m12607(d, 12.0d);
            case 6:
                return AbstractC7390.m12607(d, 48.0d);
            case 7:
                return AbstractC7390.m12607(d, 36.0d);
            case 8:
                double d3 = (d + 240.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC7390.m12607(d3, 40.0d);
            case 9:
                return AbstractC7390.m12607(d, 200.0d);
            default:
                C5043.m9170();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public C9092 mo8728(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c9084.f23200;
        double d2 = c9084.f23201;
        switch (AbstractC4652.f12358[variant.ordinal()]) {
            case 1:
                return AbstractC7390.m12607(d2, (d / 8.0d) + 4.0d);
            case 2:
                return AbstractC7390.m12607(d2, (d / 8.0d) + 4.0d);
            case 3:
                return AbstractC7390.m12607(d2, 16.0d);
            case 4:
                return AbstractC7390.m12607(d2, 0.0d);
            case 5:
                return AbstractC7390.m12607(d2, 2.0d);
            case 6:
                return AbstractC7390.m12607(d2, 0.0d);
            case 7:
                return AbstractC7390.m12607(d2, 8.0d);
            case 8:
                double d3 = (d2 + 15.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC7390.m12607(d3, 12.0d);
            case 9:
                return AbstractC7390.m12607(d2, 12.0d);
            default:
                C5043.m9170();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double mo8729(C9089 c9089, C4638 c4638) {
        C4638 c46382;
        boolean z;
        c9089.getClass();
        boolean z2 = c9089.f23211;
        InterfaceC7387 interfaceC7387 = c4638.f12336;
        InterfaceC7387 interfaceC73872 = c4638.f12330;
        InterfaceC7387 interfaceC73873 = c4638.f12339;
        Double dValueOf = null;
        C4627 c4627 = interfaceC73873 == null ? null : (C4627) interfaceC73873.invoke(c9089);
        if (c4627 == null) {
            double dDoubleValue = ((Number) c4638.f12333.invoke(c9089)).doubleValue();
            if (interfaceC73872 == null || interfaceC7387 == null) {
                return dDoubleValue;
            }
            C4638 c46383 = (C4638) interfaceC73872.invoke(c9089);
            double dM8695 = c46383 != null ? c46383.m8695(c9089) : 0.0d;
            C4635 c4635 = (C4635) interfaceC7387.invoke(c9089);
            double dM8690 = c4635 != null ? c4635.m8690() : 0.0d;
            if (AbstractC7173.m12439(dM8695, dDoubleValue) < dM8690) {
                dDoubleValue = AbstractC4636.m8691(dM8695, dM8690);
            }
            if (c4638.f12332 && 50.0d <= dDoubleValue && dDoubleValue < 60.0d) {
                dDoubleValue = AbstractC7173.m12439(49.0d, dM8695) >= dM8690 ? 49.0d : 60.0d;
            }
            InterfaceC7387 interfaceC73874 = c4638.f12337;
            if (interfaceC73874 != null && (c46382 = (C4638) interfaceC73874.invoke(c9089)) != null) {
                dValueOf = Double.valueOf(c46382.m8695(c9089));
            }
            if (dValueOf != null) {
                C4638 c46384 = (C4638) interfaceC73872.invoke(c9089);
                double dM86952 = c46384 != null ? c46384.m8695(c9089) : 0.0d;
                double dMax = Math.max(dM86952, dValueOf.doubleValue());
                double dMin = Math.min(dM86952, dValueOf.doubleValue());
                if (AbstractC7173.m12439(dMax, dDoubleValue) < dM8690 || AbstractC7173.m12439(dMin, dDoubleValue) < dM8690) {
                    double dM12443 = AbstractC7173.m12443(dMax, dM8690);
                    double dM12441 = AbstractC7173.m12441(dMin, dM8690);
                    ArrayList arrayList = new ArrayList();
                    if (dM12443 != -1.0d) {
                        arrayList.add(Double.valueOf(dM12443));
                    }
                    if (dM12441 != -1.0d) {
                        arrayList.add(Double.valueOf(dM12441));
                    }
                    if (Math.rint(dM86952) < 60.0d || Math.rint(dValueOf.doubleValue()) < 60.0d) {
                        if (dM12443 == -1.0d) {
                            return 100.0d;
                        }
                        return dM12443;
                    }
                    if (arrayList.size() == 1) {
                        return ((Number) AbstractC5176.m9379(arrayList)).doubleValue();
                    }
                    if (dM12441 == -1.0d) {
                        return 0.0d;
                    }
                    return dM12441;
                }
            }
            return dDoubleValue;
        }
        C4638 c46385 = c4627.f12306;
        C4638 c46386 = c4627.f12305;
        double d = c4627.f12304;
        TonePolarity tonePolarity = c4627.f12303;
        boolean z3 = c4627.f12302;
        boolean z4 = tonePolarity == TonePolarity.NEARER || (tonePolarity == TonePolarity.LIGHTER && !z2) || (tonePolarity == TonePolarity.DARKER && !z2);
        C4638 c46387 = z4 ? c46385 : c46386;
        if (z4) {
            c46385 = c46386;
        }
        String str = c4638.f12335;
        String str2 = c46387.f12335;
        InterfaceC7387 interfaceC73875 = c46387.f12336;
        boolean zM9466 = AbstractC5227.m9466(str, str2);
        double d2 = z2 ? 1 : -1;
        double dDoubleValue2 = ((Number) c46387.f12333.invoke(c9089)).doubleValue();
        InterfaceC7387 interfaceC73876 = c46385.f12333;
        InterfaceC7387 interfaceC73877 = c46385.f12336;
        double dDoubleValue3 = ((Number) interfaceC73876.invoke(c9089)).doubleValue();
        if (interfaceC73872 == null || interfaceC73875 == null || interfaceC73877 == null) {
            z = z3;
        } else {
            C4638 c46388 = (C4638) interfaceC73872.invoke(c9089);
            C4635 c46352 = (C4635) interfaceC73875.invoke(c9089);
            C4635 c46353 = (C4635) interfaceC73877.invoke(c9089);
            if (c46388 != null && c46352 != null && c46353 != null) {
                double dM86902 = c46352.m8690();
                z = z3;
                double dM86903 = c46353.m8690();
                double dM86953 = c46388.m8695(c9089);
                if (AbstractC7173.m12439(dM86953, dDoubleValue2) < dM86902) {
                    dDoubleValue2 = AbstractC4636.m8691(dM86953, dM86902);
                }
                if (AbstractC7173.m12439(dM86953, dDoubleValue3) < dM86903) {
                    dDoubleValue3 = AbstractC4636.m8691(dM86953, dM86903);
                }
            }
        }
        if ((dDoubleValue3 - dDoubleValue2) * d2 < d) {
            double d3 = d * d2;
            double dM5632 = AbstractC3400.m5632(dDoubleValue2 + d3, 0.0d, 100.0d);
            if ((dM5632 - dDoubleValue2) * d2 < d) {
                dDoubleValue2 = AbstractC3400.m5632(dM5632 - d3, 0.0d, 100.0d);
            }
            dDoubleValue3 = dM5632;
        }
        if (50.0d > dDoubleValue2 || dDoubleValue2 >= 60.0d) {
            if (50.0d <= dDoubleValue3 && dDoubleValue3 < 60.0d) {
                if (!z) {
                    dDoubleValue3 = d2 <= 0.0d ? 49.0d : 60.0d;
                } else if (d2 > 0.0d) {
                    dDoubleValue3 = Math.max(dDoubleValue3, (d * d2) + 60.0d);
                    dDoubleValue2 = 60.0d;
                } else {
                    dDoubleValue3 = Math.min(dDoubleValue3, (d * d2) + 49.0d);
                    dDoubleValue2 = 49.0d;
                }
            }
        } else if (d2 > 0.0d) {
            dDoubleValue3 = Math.max(dDoubleValue3, (d * d2) + 60.0d);
            dDoubleValue2 = 60.0d;
        } else {
            dDoubleValue3 = Math.min(dDoubleValue3, (d * d2) + 49.0d);
            dDoubleValue2 = 49.0d;
        }
        return zM9466 ? dDoubleValue2 : dDoubleValue3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C4638 m8733(C9089 c9089) {
        return c9089.f23211 ? mo8718() : mo8719();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public C9092 mo8730(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        variant.getClass();
        double d = c9084.f23201;
        switch (AbstractC4652.f12358[variant.ordinal()]) {
            case 1:
            case 2:
                double d2 = c9084.f23200;
                return AbstractC7390.m12607(d, Math.max(d2 - 32.0d, d2 * 0.5d));
            case 3:
                double d3 = (d - 50.0d) % 360.0d;
                if (d3 < 0.0d) {
                    d3 += 360.0d;
                }
                return AbstractC7390.m12607(d3, 36.0d);
            case 4:
                return AbstractC7390.m12607(d, 0.0d);
            case 5:
                return AbstractC7390.m12607(d, 8.0d);
            case 6:
                return AbstractC7390.m12607(d, 16.0d);
            case 7:
                return AbstractC7390.m12607(d, 16.0d);
            case 8:
                return AbstractC7390.m12607(AbstractC7176.m12454(c9084, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{45.0d, 95.0d, 45.0d, 20.0d, 45.0d, 90.0d, 45.0d, 45.0d, 45.0d}), 24.0d);
            case 9:
                return AbstractC7390.m12607(AbstractC7176.m12454(c9084, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{18.0d, 15.0d, 10.0d, 12.0d, 15.0d, 18.0d, 15.0d, 12.0d, 12.0d}), 24.0d);
            default:
                C5043.m9170();
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0150  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C9092 mo8731(Variant variant, C9084 c9084, boolean z, DynamicScheme$Platform dynamicScheme$Platform) {
        double dAbs;
        variant.getClass();
        double d = c9084.f23201;
        double d2 = 0.0d;
        switch (AbstractC4652.f12358[variant.ordinal()]) {
            case 1:
                C8987 c8987 = new C8987(c9084);
                int iRint = (int) Math.rint(d);
                C9084 c90842 = (C9084) ((ArrayList) c8987.m14173()).get(iRint);
                double dM14171 = c8987.m14171(c90842);
                ArrayList arrayList = new ArrayList();
                arrayList.add(c90842);
                int i = 0;
                double dAbs2 = 0.0d;
                while (i < 360) {
                    int i2 = (iRint + i) % 360;
                    if (i2 < 0) {
                        i2 += 360;
                    }
                    double dM141712 = c8987.m14171((C9084) ((ArrayList) c8987.m14173()).get(i2));
                    dAbs2 += Math.abs(dM141712 - dM14171);
                    i++;
                    dM14171 = dM141712;
                }
                double d3 = dAbs2 / 6.0d;
                double dM141713 = c8987.m14171(c90842);
                int i3 = 1;
                double dAbs3 = 0.0d;
                while (true) {
                    if (arrayList.size() < 6) {
                        int i4 = (iRint + i3) % 360;
                        if (i4 < 0) {
                            i4 += 360;
                        }
                        C9084 c90843 = (C9084) ((ArrayList) c8987.m14173()).get(i4);
                        double dM141714 = c8987.m14171(c90843);
                        dAbs3 += Math.abs(dM141714 - dM141713);
                        boolean z2 = dAbs3 >= ((double) arrayList.size()) * d3;
                        int i5 = 1;
                        while (z2 && arrayList.size() < 6) {
                            arrayList.add(c90843);
                            z2 = dAbs3 >= ((double) (arrayList.size() + i5)) * d3;
                            i5++;
                        }
                        i3++;
                        if (i3 > 360) {
                            while (arrayList.size() < 6) {
                                arrayList.add(c90843);
                            }
                        } else {
                            dM141713 = dM141714;
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c9084);
                int iFloor = (int) Math.floor(1.0d);
                int i6 = iFloor + 1;
                for (int i7 = 1; i7 < i6; i7++) {
                    int size = 0 - i7;
                    while (size < 0) {
                        size += arrayList.size();
                    }
                    if (size >= arrayList.size()) {
                        size %= arrayList.size();
                    }
                    arrayList2.add(0, arrayList.get(size));
                }
                int i8 = 3 - iFloor;
                for (int i9 = 1; i9 < i8; i9++) {
                    int size2 = i9;
                    while (size2 < 0) {
                        size2 += arrayList.size();
                    }
                    if (size2 >= arrayList.size()) {
                        size2 %= arrayList.size();
                    }
                    arrayList2.add(arrayList.get(size2));
                }
                C9084 c9084M12315 = AbstractC7082.m12315((C9084) arrayList2.get(2));
                return new C9092(c9084M12315.f23201, c9084M12315.f23200, c9084M12315);
            case 2:
                C8987 c89872 = new C8987(c9084);
                C9084 c90844 = c89872.f22841;
                if (c90844 == null) {
                    double d4 = c89872.m14174().f23201;
                    Object obj = ((HashMap) c89872.m14170()).get(c89872.m14174());
                    obj.getClass();
                    double dDoubleValue = ((Number) obj).doubleValue();
                    double d5 = c89872.m14169().f23201;
                    Object obj2 = ((HashMap) c89872.m14170()).get(c89872.m14169());
                    obj2.getClass();
                    double dDoubleValue2 = ((Number) obj2).doubleValue() - dDoubleValue;
                    boolean z3 = d4 >= d5 ? d4 <= d || d <= d5 : d4 <= d && d <= d5;
                    double d6 = z3 ? d5 : d4;
                    if (!z3) {
                        d4 = d5;
                    }
                    C9084 c90845 = (C9084) ((ArrayList) c89872.m14173()).get((int) Math.rint(d));
                    double dM141715 = 1.0d - c89872.m14171(c9084);
                    double d7 = 1000.0d;
                    c90844 = c90845;
                    double d8 = 0.0d;
                    while (d8 <= 360.0d) {
                        double d9 = ((1.0d * d8) + d6) % 360.0d;
                        if (d9 < d2) {
                            d9 += 360.0d;
                        }
                        if (d6 < d4) {
                            if (d6 > d9 || d9 > d4) {
                                d8 += 1.0d;
                            } else {
                                C9084 c90846 = (C9084) ((ArrayList) c89872.m14173()).get((int) Math.rint(d9));
                                Object obj3 = ((HashMap) c89872.m14170()).get(c90846);
                                obj3.getClass();
                                dAbs = Math.abs(dM141715 - ((((Number) obj3).doubleValue() - dDoubleValue) / dDoubleValue2));
                                if (dAbs < d7) {
                                    c90844 = c90846;
                                    d7 = dAbs;
                                }
                                d8 += 1.0d;
                                d2 = 0.0d;
                            }
                        } else if (d6 <= d9 || d9 <= d4) {
                            C9084 c908462 = (C9084) ((ArrayList) c89872.m14173()).get((int) Math.rint(d9));
                            Object obj32 = ((HashMap) c89872.m14170()).get(c908462);
                            obj32.getClass();
                            dAbs = Math.abs(dM141715 - ((((Number) obj32).doubleValue() - dDoubleValue) / dDoubleValue2));
                            if (dAbs < d7) {
                            }
                            d8 += 1.0d;
                            d2 = 0.0d;
                        } else {
                            d8 += 1.0d;
                        }
                    }
                    c89872.f22841 = c90844;
                    c90844.getClass();
                }
                C9084 c9084M123152 = AbstractC7082.m12315(c90844);
                return new C9092(c9084M123152.f23201, c9084M123152.f23200, c9084M123152);
            case 3:
                return AbstractC7390.m12607(d, 36.0d);
            case 4:
                return AbstractC7390.m12607(d, 0.0d);
            case 5:
                return AbstractC7390.m12607(d, 16.0d);
            case 6:
            case 7:
                double d10 = (d + 60.0d) % 360.0d;
                if (d10 < 0.0d) {
                    d10 += 360.0d;
                }
                return AbstractC7390.m12607(d10, 24.0d);
            case 8:
                return AbstractC7390.m12607(AbstractC7176.m12454(c9084, new double[]{0.0d, 21.0d, 51.0d, 121.0d, 151.0d, 191.0d, 271.0d, 321.0d, 360.0d}, new double[]{120.0d, 120.0d, 20.0d, 45.0d, 20.0d, 15.0d, 20.0d, 120.0d, 120.0d}), 32.0d);
            case 9:
                return AbstractC7390.m12607(AbstractC7176.m12454(c9084, new double[]{0.0d, 41.0d, 61.0d, 101.0d, 131.0d, 181.0d, 251.0d, 301.0d, 360.0d}, new double[]{35.0d, 30.0d, 20.0d, 25.0d, 30.0d, 35.0d, 30.0d, 25.0d, 25.0d}), 32.0d);
            default:
                C5043.m9170();
                return null;
        }
    }
}
