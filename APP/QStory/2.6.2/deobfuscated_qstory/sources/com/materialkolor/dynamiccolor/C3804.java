package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1021;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p052.InterfaceC6557;
import p144.C7546;
import p265.C8259;
import p266.C8262;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3804 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC6557 f11970;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC6557 f11971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC6557 f11973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC6557 f11974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f11975;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC6557 f11976;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC6557 f11977;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC6557 f11978;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC6557 f11979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3804 m8146(final ColorSpec$SpecVersion colorSpec$SpecVersion, final C3805 c3805) {
        colorSpec$SpecVersion.getClass();
        String str = this.f11975;
        String str2 = c3805.f11985;
        if (!AbstractC4394.m8917(str, str2)) {
            C7546.m12744(AbstractC6136.m11551("Attempting to extend color ", this.f11975, " with color ", str2, " of different name for spec version "), colorSpec$SpecVersion, ".");
            return null;
        }
        boolean z = this.f11972;
        boolean z2 = c3805.f11982;
        String str3 = this.f11975;
        if (z != z2) {
            String str4 = z ? "background" : "foreground";
            String str5 = z2 ? "background" : "foreground";
            StringBuilder sbM11551 = AbstractC6136.m11551("Attempting to extend color ", str3, " as a ", str4, " with color ");
            AbstractC6136.m11530(sbM11551, str2, " as a ", str5, " for spec version ");
            C7546.m12744(sbM11551, colorSpec$SpecVersion, ".");
            return null;
        }
        C3804 c3804 = new C3804();
        str3.getClass();
        c3804.f11975 = str3;
        c3804.f11972 = this.f11972;
        final int i = 0;
        c3804.f11974 = new InterfaceC6557() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                C8262 c8262;
                int i2 = i;
                C3804 c38042 = this;
                C3805 c38052 = c3805;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i2) {
                    case 0:
                        InterfaceC6557 interfaceC6557 = c38052.f11984;
                        C8259 c8259 = (C8259) obj;
                        c8259.getClass();
                        InterfaceC6557 interfaceC65572 = c8259.f22872 == colorSpec$SpecVersion2 ? interfaceC6557 : c38042.f11974;
                        return (interfaceC65572 == null || (c8262 = (C8262) interfaceC65572.invoke(c8259)) == null) ? (C8262) interfaceC6557.invoke(c8259) : c8262;
                    case 1:
                        InterfaceC6557 interfaceC65573 = c38052.f11983;
                        C8259 c82592 = (C8259) obj;
                        c82592.getClass();
                        InterfaceC6557 interfaceC65574 = c82592.f22872 == colorSpec$SpecVersion2 ? interfaceC65573 : c38042.f11973;
                        return Double.valueOf(((Number) (interfaceC65574 != null ? interfaceC65574.invoke(c82592) : interfaceC65573.invoke(c82592))).doubleValue());
                    case 2:
                        C8259 c82593 = (C8259) obj;
                        c82593.getClass();
                        InterfaceC6557 interfaceC65575 = c82593.f22872 == colorSpec$SpecVersion2 ? c38052.f11981 : c38042.f11971;
                        return interfaceC65575 != null ? (Double) interfaceC65575.invoke(c82593) : Double.valueOf(1.0d);
                    case 3:
                        C8259 c82594 = (C8259) obj;
                        c82594.getClass();
                        InterfaceC6557 interfaceC65576 = c82594.f22872 == colorSpec$SpecVersion2 ? c38052.f11980 : c38042.f11970;
                        if (interfaceC65576 != null) {
                            return (C3805) interfaceC65576.invoke(c82594);
                        }
                        return null;
                    case 4:
                        C8259 c82595 = (C8259) obj;
                        c82595.getClass();
                        InterfaceC6557 interfaceC65577 = c82595.f22872 == colorSpec$SpecVersion2 ? c38052.f11987 : c38042.f11977;
                        if (interfaceC65577 != null) {
                            return (C3805) interfaceC65577.invoke(c82595);
                        }
                        return null;
                    case 5:
                        C8259 c82596 = (C8259) obj;
                        c82596.getClass();
                        InterfaceC6557 interfaceC65578 = c82596.f22872 == colorSpec$SpecVersion2 ? c38052.f11986 : c38042.f11976;
                        if (interfaceC65578 != null) {
                            return (C3802) interfaceC65578.invoke(c82596);
                        }
                        return null;
                    case 6:
                        C8259 c82597 = (C8259) obj;
                        c82597.getClass();
                        InterfaceC6557 interfaceC65579 = c82597.f22872 == colorSpec$SpecVersion2 ? c38052.f11989 : c38042.f11978;
                        if (interfaceC65579 != null) {
                            return (C3794) interfaceC65579.invoke(c82597);
                        }
                        return null;
                    default:
                        C8259 c82598 = (C8259) obj;
                        c82598.getClass();
                        InterfaceC6557 interfaceC655710 = c82598.f22872 == colorSpec$SpecVersion2 ? c38052.f11990 : c38042.f11979;
                        if (interfaceC655710 != null) {
                            return (Double) interfaceC655710.invoke(c82598);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        c3804.f11973 = new InterfaceC6557() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                C8262 c8262;
                int i22 = i2;
                C3804 c38042 = this;
                C3805 c38052 = c3805;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6557 interfaceC6557 = c38052.f11984;
                        C8259 c8259 = (C8259) obj;
                        c8259.getClass();
                        InterfaceC6557 interfaceC65572 = c8259.f22872 == colorSpec$SpecVersion2 ? interfaceC6557 : c38042.f11974;
                        return (interfaceC65572 == null || (c8262 = (C8262) interfaceC65572.invoke(c8259)) == null) ? (C8262) interfaceC6557.invoke(c8259) : c8262;
                    case 1:
                        InterfaceC6557 interfaceC65573 = c38052.f11983;
                        C8259 c82592 = (C8259) obj;
                        c82592.getClass();
                        InterfaceC6557 interfaceC65574 = c82592.f22872 == colorSpec$SpecVersion2 ? interfaceC65573 : c38042.f11973;
                        return Double.valueOf(((Number) (interfaceC65574 != null ? interfaceC65574.invoke(c82592) : interfaceC65573.invoke(c82592))).doubleValue());
                    case 2:
                        C8259 c82593 = (C8259) obj;
                        c82593.getClass();
                        InterfaceC6557 interfaceC65575 = c82593.f22872 == colorSpec$SpecVersion2 ? c38052.f11981 : c38042.f11971;
                        return interfaceC65575 != null ? (Double) interfaceC65575.invoke(c82593) : Double.valueOf(1.0d);
                    case 3:
                        C8259 c82594 = (C8259) obj;
                        c82594.getClass();
                        InterfaceC6557 interfaceC65576 = c82594.f22872 == colorSpec$SpecVersion2 ? c38052.f11980 : c38042.f11970;
                        if (interfaceC65576 != null) {
                            return (C3805) interfaceC65576.invoke(c82594);
                        }
                        return null;
                    case 4:
                        C8259 c82595 = (C8259) obj;
                        c82595.getClass();
                        InterfaceC6557 interfaceC65577 = c82595.f22872 == colorSpec$SpecVersion2 ? c38052.f11987 : c38042.f11977;
                        if (interfaceC65577 != null) {
                            return (C3805) interfaceC65577.invoke(c82595);
                        }
                        return null;
                    case 5:
                        C8259 c82596 = (C8259) obj;
                        c82596.getClass();
                        InterfaceC6557 interfaceC65578 = c82596.f22872 == colorSpec$SpecVersion2 ? c38052.f11986 : c38042.f11976;
                        if (interfaceC65578 != null) {
                            return (C3802) interfaceC65578.invoke(c82596);
                        }
                        return null;
                    case 6:
                        C8259 c82597 = (C8259) obj;
                        c82597.getClass();
                        InterfaceC6557 interfaceC65579 = c82597.f22872 == colorSpec$SpecVersion2 ? c38052.f11989 : c38042.f11978;
                        if (interfaceC65579 != null) {
                            return (C3794) interfaceC65579.invoke(c82597);
                        }
                        return null;
                    default:
                        C8259 c82598 = (C8259) obj;
                        c82598.getClass();
                        InterfaceC6557 interfaceC655710 = c82598.f22872 == colorSpec$SpecVersion2 ? c38052.f11990 : c38042.f11979;
                        if (interfaceC655710 != null) {
                            return (Double) interfaceC655710.invoke(c82598);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        c3804.f11971 = new InterfaceC6557() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                C8262 c8262;
                int i22 = i3;
                C3804 c38042 = this;
                C3805 c38052 = c3805;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6557 interfaceC6557 = c38052.f11984;
                        C8259 c8259 = (C8259) obj;
                        c8259.getClass();
                        InterfaceC6557 interfaceC65572 = c8259.f22872 == colorSpec$SpecVersion2 ? interfaceC6557 : c38042.f11974;
                        return (interfaceC65572 == null || (c8262 = (C8262) interfaceC65572.invoke(c8259)) == null) ? (C8262) interfaceC6557.invoke(c8259) : c8262;
                    case 1:
                        InterfaceC6557 interfaceC65573 = c38052.f11983;
                        C8259 c82592 = (C8259) obj;
                        c82592.getClass();
                        InterfaceC6557 interfaceC65574 = c82592.f22872 == colorSpec$SpecVersion2 ? interfaceC65573 : c38042.f11973;
                        return Double.valueOf(((Number) (interfaceC65574 != null ? interfaceC65574.invoke(c82592) : interfaceC65573.invoke(c82592))).doubleValue());
                    case 2:
                        C8259 c82593 = (C8259) obj;
                        c82593.getClass();
                        InterfaceC6557 interfaceC65575 = c82593.f22872 == colorSpec$SpecVersion2 ? c38052.f11981 : c38042.f11971;
                        return interfaceC65575 != null ? (Double) interfaceC65575.invoke(c82593) : Double.valueOf(1.0d);
                    case 3:
                        C8259 c82594 = (C8259) obj;
                        c82594.getClass();
                        InterfaceC6557 interfaceC65576 = c82594.f22872 == colorSpec$SpecVersion2 ? c38052.f11980 : c38042.f11970;
                        if (interfaceC65576 != null) {
                            return (C3805) interfaceC65576.invoke(c82594);
                        }
                        return null;
                    case 4:
                        C8259 c82595 = (C8259) obj;
                        c82595.getClass();
                        InterfaceC6557 interfaceC65577 = c82595.f22872 == colorSpec$SpecVersion2 ? c38052.f11987 : c38042.f11977;
                        if (interfaceC65577 != null) {
                            return (C3805) interfaceC65577.invoke(c82595);
                        }
                        return null;
                    case 5:
                        C8259 c82596 = (C8259) obj;
                        c82596.getClass();
                        InterfaceC6557 interfaceC65578 = c82596.f22872 == colorSpec$SpecVersion2 ? c38052.f11986 : c38042.f11976;
                        if (interfaceC65578 != null) {
                            return (C3802) interfaceC65578.invoke(c82596);
                        }
                        return null;
                    case 6:
                        C8259 c82597 = (C8259) obj;
                        c82597.getClass();
                        InterfaceC6557 interfaceC65579 = c82597.f22872 == colorSpec$SpecVersion2 ? c38052.f11989 : c38042.f11978;
                        if (interfaceC65579 != null) {
                            return (C3794) interfaceC65579.invoke(c82597);
                        }
                        return null;
                    default:
                        C8259 c82598 = (C8259) obj;
                        c82598.getClass();
                        InterfaceC6557 interfaceC655710 = c82598.f22872 == colorSpec$SpecVersion2 ? c38052.f11990 : c38042.f11979;
                        if (interfaceC655710 != null) {
                            return (Double) interfaceC655710.invoke(c82598);
                        }
                        return null;
                }
            }
        };
        final int i4 = 3;
        c3804.f11970 = new InterfaceC6557() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                C8262 c8262;
                int i22 = i4;
                C3804 c38042 = this;
                C3805 c38052 = c3805;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6557 interfaceC6557 = c38052.f11984;
                        C8259 c8259 = (C8259) obj;
                        c8259.getClass();
                        InterfaceC6557 interfaceC65572 = c8259.f22872 == colorSpec$SpecVersion2 ? interfaceC6557 : c38042.f11974;
                        return (interfaceC65572 == null || (c8262 = (C8262) interfaceC65572.invoke(c8259)) == null) ? (C8262) interfaceC6557.invoke(c8259) : c8262;
                    case 1:
                        InterfaceC6557 interfaceC65573 = c38052.f11983;
                        C8259 c82592 = (C8259) obj;
                        c82592.getClass();
                        InterfaceC6557 interfaceC65574 = c82592.f22872 == colorSpec$SpecVersion2 ? interfaceC65573 : c38042.f11973;
                        return Double.valueOf(((Number) (interfaceC65574 != null ? interfaceC65574.invoke(c82592) : interfaceC65573.invoke(c82592))).doubleValue());
                    case 2:
                        C8259 c82593 = (C8259) obj;
                        c82593.getClass();
                        InterfaceC6557 interfaceC65575 = c82593.f22872 == colorSpec$SpecVersion2 ? c38052.f11981 : c38042.f11971;
                        return interfaceC65575 != null ? (Double) interfaceC65575.invoke(c82593) : Double.valueOf(1.0d);
                    case 3:
                        C8259 c82594 = (C8259) obj;
                        c82594.getClass();
                        InterfaceC6557 interfaceC65576 = c82594.f22872 == colorSpec$SpecVersion2 ? c38052.f11980 : c38042.f11970;
                        if (interfaceC65576 != null) {
                            return (C3805) interfaceC65576.invoke(c82594);
                        }
                        return null;
                    case 4:
                        C8259 c82595 = (C8259) obj;
                        c82595.getClass();
                        InterfaceC6557 interfaceC65577 = c82595.f22872 == colorSpec$SpecVersion2 ? c38052.f11987 : c38042.f11977;
                        if (interfaceC65577 != null) {
                            return (C3805) interfaceC65577.invoke(c82595);
                        }
                        return null;
                    case 5:
                        C8259 c82596 = (C8259) obj;
                        c82596.getClass();
                        InterfaceC6557 interfaceC65578 = c82596.f22872 == colorSpec$SpecVersion2 ? c38052.f11986 : c38042.f11976;
                        if (interfaceC65578 != null) {
                            return (C3802) interfaceC65578.invoke(c82596);
                        }
                        return null;
                    case 6:
                        C8259 c82597 = (C8259) obj;
                        c82597.getClass();
                        InterfaceC6557 interfaceC65579 = c82597.f22872 == colorSpec$SpecVersion2 ? c38052.f11989 : c38042.f11978;
                        if (interfaceC65579 != null) {
                            return (C3794) interfaceC65579.invoke(c82597);
                        }
                        return null;
                    default:
                        C8259 c82598 = (C8259) obj;
                        c82598.getClass();
                        InterfaceC6557 interfaceC655710 = c82598.f22872 == colorSpec$SpecVersion2 ? c38052.f11990 : c38042.f11979;
                        if (interfaceC655710 != null) {
                            return (Double) interfaceC655710.invoke(c82598);
                        }
                        return null;
                }
            }
        };
        final int i5 = 4;
        c3804.f11977 = new InterfaceC6557() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                C8262 c8262;
                int i22 = i5;
                C3804 c38042 = this;
                C3805 c38052 = c3805;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6557 interfaceC6557 = c38052.f11984;
                        C8259 c8259 = (C8259) obj;
                        c8259.getClass();
                        InterfaceC6557 interfaceC65572 = c8259.f22872 == colorSpec$SpecVersion2 ? interfaceC6557 : c38042.f11974;
                        return (interfaceC65572 == null || (c8262 = (C8262) interfaceC65572.invoke(c8259)) == null) ? (C8262) interfaceC6557.invoke(c8259) : c8262;
                    case 1:
                        InterfaceC6557 interfaceC65573 = c38052.f11983;
                        C8259 c82592 = (C8259) obj;
                        c82592.getClass();
                        InterfaceC6557 interfaceC65574 = c82592.f22872 == colorSpec$SpecVersion2 ? interfaceC65573 : c38042.f11973;
                        return Double.valueOf(((Number) (interfaceC65574 != null ? interfaceC65574.invoke(c82592) : interfaceC65573.invoke(c82592))).doubleValue());
                    case 2:
                        C8259 c82593 = (C8259) obj;
                        c82593.getClass();
                        InterfaceC6557 interfaceC65575 = c82593.f22872 == colorSpec$SpecVersion2 ? c38052.f11981 : c38042.f11971;
                        return interfaceC65575 != null ? (Double) interfaceC65575.invoke(c82593) : Double.valueOf(1.0d);
                    case 3:
                        C8259 c82594 = (C8259) obj;
                        c82594.getClass();
                        InterfaceC6557 interfaceC65576 = c82594.f22872 == colorSpec$SpecVersion2 ? c38052.f11980 : c38042.f11970;
                        if (interfaceC65576 != null) {
                            return (C3805) interfaceC65576.invoke(c82594);
                        }
                        return null;
                    case 4:
                        C8259 c82595 = (C8259) obj;
                        c82595.getClass();
                        InterfaceC6557 interfaceC65577 = c82595.f22872 == colorSpec$SpecVersion2 ? c38052.f11987 : c38042.f11977;
                        if (interfaceC65577 != null) {
                            return (C3805) interfaceC65577.invoke(c82595);
                        }
                        return null;
                    case 5:
                        C8259 c82596 = (C8259) obj;
                        c82596.getClass();
                        InterfaceC6557 interfaceC65578 = c82596.f22872 == colorSpec$SpecVersion2 ? c38052.f11986 : c38042.f11976;
                        if (interfaceC65578 != null) {
                            return (C3802) interfaceC65578.invoke(c82596);
                        }
                        return null;
                    case 6:
                        C8259 c82597 = (C8259) obj;
                        c82597.getClass();
                        InterfaceC6557 interfaceC65579 = c82597.f22872 == colorSpec$SpecVersion2 ? c38052.f11989 : c38042.f11978;
                        if (interfaceC65579 != null) {
                            return (C3794) interfaceC65579.invoke(c82597);
                        }
                        return null;
                    default:
                        C8259 c82598 = (C8259) obj;
                        c82598.getClass();
                        InterfaceC6557 interfaceC655710 = c82598.f22872 == colorSpec$SpecVersion2 ? c38052.f11990 : c38042.f11979;
                        if (interfaceC655710 != null) {
                            return (Double) interfaceC655710.invoke(c82598);
                        }
                        return null;
                }
            }
        };
        final int i6 = 5;
        c3804.f11976 = new InterfaceC6557() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                C8262 c8262;
                int i22 = i6;
                C3804 c38042 = this;
                C3805 c38052 = c3805;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6557 interfaceC6557 = c38052.f11984;
                        C8259 c8259 = (C8259) obj;
                        c8259.getClass();
                        InterfaceC6557 interfaceC65572 = c8259.f22872 == colorSpec$SpecVersion2 ? interfaceC6557 : c38042.f11974;
                        return (interfaceC65572 == null || (c8262 = (C8262) interfaceC65572.invoke(c8259)) == null) ? (C8262) interfaceC6557.invoke(c8259) : c8262;
                    case 1:
                        InterfaceC6557 interfaceC65573 = c38052.f11983;
                        C8259 c82592 = (C8259) obj;
                        c82592.getClass();
                        InterfaceC6557 interfaceC65574 = c82592.f22872 == colorSpec$SpecVersion2 ? interfaceC65573 : c38042.f11973;
                        return Double.valueOf(((Number) (interfaceC65574 != null ? interfaceC65574.invoke(c82592) : interfaceC65573.invoke(c82592))).doubleValue());
                    case 2:
                        C8259 c82593 = (C8259) obj;
                        c82593.getClass();
                        InterfaceC6557 interfaceC65575 = c82593.f22872 == colorSpec$SpecVersion2 ? c38052.f11981 : c38042.f11971;
                        return interfaceC65575 != null ? (Double) interfaceC65575.invoke(c82593) : Double.valueOf(1.0d);
                    case 3:
                        C8259 c82594 = (C8259) obj;
                        c82594.getClass();
                        InterfaceC6557 interfaceC65576 = c82594.f22872 == colorSpec$SpecVersion2 ? c38052.f11980 : c38042.f11970;
                        if (interfaceC65576 != null) {
                            return (C3805) interfaceC65576.invoke(c82594);
                        }
                        return null;
                    case 4:
                        C8259 c82595 = (C8259) obj;
                        c82595.getClass();
                        InterfaceC6557 interfaceC65577 = c82595.f22872 == colorSpec$SpecVersion2 ? c38052.f11987 : c38042.f11977;
                        if (interfaceC65577 != null) {
                            return (C3805) interfaceC65577.invoke(c82595);
                        }
                        return null;
                    case 5:
                        C8259 c82596 = (C8259) obj;
                        c82596.getClass();
                        InterfaceC6557 interfaceC65578 = c82596.f22872 == colorSpec$SpecVersion2 ? c38052.f11986 : c38042.f11976;
                        if (interfaceC65578 != null) {
                            return (C3802) interfaceC65578.invoke(c82596);
                        }
                        return null;
                    case 6:
                        C8259 c82597 = (C8259) obj;
                        c82597.getClass();
                        InterfaceC6557 interfaceC65579 = c82597.f22872 == colorSpec$SpecVersion2 ? c38052.f11989 : c38042.f11978;
                        if (interfaceC65579 != null) {
                            return (C3794) interfaceC65579.invoke(c82597);
                        }
                        return null;
                    default:
                        C8259 c82598 = (C8259) obj;
                        c82598.getClass();
                        InterfaceC6557 interfaceC655710 = c82598.f22872 == colorSpec$SpecVersion2 ? c38052.f11990 : c38042.f11979;
                        if (interfaceC655710 != null) {
                            return (Double) interfaceC655710.invoke(c82598);
                        }
                        return null;
                }
            }
        };
        final int i7 = 6;
        c3804.f11978 = new InterfaceC6557() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                C8262 c8262;
                int i22 = i7;
                C3804 c38042 = this;
                C3805 c38052 = c3805;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6557 interfaceC6557 = c38052.f11984;
                        C8259 c8259 = (C8259) obj;
                        c8259.getClass();
                        InterfaceC6557 interfaceC65572 = c8259.f22872 == colorSpec$SpecVersion2 ? interfaceC6557 : c38042.f11974;
                        return (interfaceC65572 == null || (c8262 = (C8262) interfaceC65572.invoke(c8259)) == null) ? (C8262) interfaceC6557.invoke(c8259) : c8262;
                    case 1:
                        InterfaceC6557 interfaceC65573 = c38052.f11983;
                        C8259 c82592 = (C8259) obj;
                        c82592.getClass();
                        InterfaceC6557 interfaceC65574 = c82592.f22872 == colorSpec$SpecVersion2 ? interfaceC65573 : c38042.f11973;
                        return Double.valueOf(((Number) (interfaceC65574 != null ? interfaceC65574.invoke(c82592) : interfaceC65573.invoke(c82592))).doubleValue());
                    case 2:
                        C8259 c82593 = (C8259) obj;
                        c82593.getClass();
                        InterfaceC6557 interfaceC65575 = c82593.f22872 == colorSpec$SpecVersion2 ? c38052.f11981 : c38042.f11971;
                        return interfaceC65575 != null ? (Double) interfaceC65575.invoke(c82593) : Double.valueOf(1.0d);
                    case 3:
                        C8259 c82594 = (C8259) obj;
                        c82594.getClass();
                        InterfaceC6557 interfaceC65576 = c82594.f22872 == colorSpec$SpecVersion2 ? c38052.f11980 : c38042.f11970;
                        if (interfaceC65576 != null) {
                            return (C3805) interfaceC65576.invoke(c82594);
                        }
                        return null;
                    case 4:
                        C8259 c82595 = (C8259) obj;
                        c82595.getClass();
                        InterfaceC6557 interfaceC65577 = c82595.f22872 == colorSpec$SpecVersion2 ? c38052.f11987 : c38042.f11977;
                        if (interfaceC65577 != null) {
                            return (C3805) interfaceC65577.invoke(c82595);
                        }
                        return null;
                    case 5:
                        C8259 c82596 = (C8259) obj;
                        c82596.getClass();
                        InterfaceC6557 interfaceC65578 = c82596.f22872 == colorSpec$SpecVersion2 ? c38052.f11986 : c38042.f11976;
                        if (interfaceC65578 != null) {
                            return (C3802) interfaceC65578.invoke(c82596);
                        }
                        return null;
                    case 6:
                        C8259 c82597 = (C8259) obj;
                        c82597.getClass();
                        InterfaceC6557 interfaceC65579 = c82597.f22872 == colorSpec$SpecVersion2 ? c38052.f11989 : c38042.f11978;
                        if (interfaceC65579 != null) {
                            return (C3794) interfaceC65579.invoke(c82597);
                        }
                        return null;
                    default:
                        C8259 c82598 = (C8259) obj;
                        c82598.getClass();
                        InterfaceC6557 interfaceC655710 = c82598.f22872 == colorSpec$SpecVersion2 ? c38052.f11990 : c38042.f11979;
                        if (interfaceC655710 != null) {
                            return (Double) interfaceC655710.invoke(c82598);
                        }
                        return null;
                }
            }
        };
        final int i8 = 7;
        c3804.f11979 = new InterfaceC6557() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6557
            public final Object invoke(Object obj) {
                C8262 c8262;
                int i22 = i8;
                C3804 c38042 = this;
                C3805 c38052 = c3805;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6557 interfaceC6557 = c38052.f11984;
                        C8259 c8259 = (C8259) obj;
                        c8259.getClass();
                        InterfaceC6557 interfaceC65572 = c8259.f22872 == colorSpec$SpecVersion2 ? interfaceC6557 : c38042.f11974;
                        return (interfaceC65572 == null || (c8262 = (C8262) interfaceC65572.invoke(c8259)) == null) ? (C8262) interfaceC6557.invoke(c8259) : c8262;
                    case 1:
                        InterfaceC6557 interfaceC65573 = c38052.f11983;
                        C8259 c82592 = (C8259) obj;
                        c82592.getClass();
                        InterfaceC6557 interfaceC65574 = c82592.f22872 == colorSpec$SpecVersion2 ? interfaceC65573 : c38042.f11973;
                        return Double.valueOf(((Number) (interfaceC65574 != null ? interfaceC65574.invoke(c82592) : interfaceC65573.invoke(c82592))).doubleValue());
                    case 2:
                        C8259 c82593 = (C8259) obj;
                        c82593.getClass();
                        InterfaceC6557 interfaceC65575 = c82593.f22872 == colorSpec$SpecVersion2 ? c38052.f11981 : c38042.f11971;
                        return interfaceC65575 != null ? (Double) interfaceC65575.invoke(c82593) : Double.valueOf(1.0d);
                    case 3:
                        C8259 c82594 = (C8259) obj;
                        c82594.getClass();
                        InterfaceC6557 interfaceC65576 = c82594.f22872 == colorSpec$SpecVersion2 ? c38052.f11980 : c38042.f11970;
                        if (interfaceC65576 != null) {
                            return (C3805) interfaceC65576.invoke(c82594);
                        }
                        return null;
                    case 4:
                        C8259 c82595 = (C8259) obj;
                        c82595.getClass();
                        InterfaceC6557 interfaceC65577 = c82595.f22872 == colorSpec$SpecVersion2 ? c38052.f11987 : c38042.f11977;
                        if (interfaceC65577 != null) {
                            return (C3805) interfaceC65577.invoke(c82595);
                        }
                        return null;
                    case 5:
                        C8259 c82596 = (C8259) obj;
                        c82596.getClass();
                        InterfaceC6557 interfaceC65578 = c82596.f22872 == colorSpec$SpecVersion2 ? c38052.f11986 : c38042.f11976;
                        if (interfaceC65578 != null) {
                            return (C3802) interfaceC65578.invoke(c82596);
                        }
                        return null;
                    case 6:
                        C8259 c82597 = (C8259) obj;
                        c82597.getClass();
                        InterfaceC6557 interfaceC65579 = c82597.f22872 == colorSpec$SpecVersion2 ? c38052.f11989 : c38042.f11978;
                        if (interfaceC65579 != null) {
                            return (C3794) interfaceC65579.invoke(c82597);
                        }
                        return null;
                    default:
                        C8259 c82598 = (C8259) obj;
                        c82598.getClass();
                        InterfaceC6557 interfaceC655710 = c82598.f22872 == colorSpec$SpecVersion2 ? c38052.f11990 : c38042.f11979;
                        if (interfaceC655710 != null) {
                            return (Double) interfaceC655710.invoke(c82598);
                        }
                        return null;
                }
            }
        };
        return c3804;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3805 m8147() {
        InterfaceC6557 interfaceC6557 = this.f11970;
        if (interfaceC6557 == null && this.f11977 != null) {
            C5919.m11253(AbstractC0053.m156("Color ", this.f11975, " has secondBackground defined, but background is not defined."));
            return null;
        }
        if (interfaceC6557 == null && this.f11976 != null) {
            C5919.m11253(AbstractC0053.m156("Color ", this.f11975, " has contrastCurve defined, but background is not defined."));
            return null;
        }
        if (interfaceC6557 != null && this.f11976 == null) {
            C5919.m11253(AbstractC0053.m156("Color ", this.f11975, " has background defined, but contrastCurve is not defined."));
            return null;
        }
        InterfaceC6557 c3806 = this.f11973;
        if (c3806 == null) {
            c3806 = interfaceC6557 == null ? new C3806(0) : new C1021(interfaceC6557, 2);
        }
        String str = this.f11975;
        str.getClass();
        InterfaceC6557 interfaceC65572 = this.f11974;
        interfaceC65572.getClass();
        return new C3805(str, interfaceC65572, c3806, this.f11972, this.f11971, this.f11970, this.f11977, this.f11976, this.f11978, this.f11979);
    }
}
