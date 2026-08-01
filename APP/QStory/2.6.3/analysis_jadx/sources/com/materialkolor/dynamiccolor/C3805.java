package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.C1021;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p052.InterfaceC6558;
import p144.C7547;
import p265.C8260;
import p266.C8263;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC6558 f11975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC6558 f11976;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f11977;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC6558 f11978;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC6558 f11979;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f11980;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC6558 f11981;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC6558 f11982;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC6558 f11983;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC6558 f11984;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C3805 m8133(final ColorSpec$SpecVersion colorSpec$SpecVersion, final C3806 c3806) {
        colorSpec$SpecVersion.getClass();
        String str = this.f11980;
        String str2 = c3806.f11990;
        if (!AbstractC4395.m8907(str, str2)) {
            C7547.m12773(AbstractC6183.m11582("Attempting to extend color ", this.f11980, " with color ", str2, " of different name for spec version "), colorSpec$SpecVersion, ".");
            return null;
        }
        boolean z = this.f11977;
        boolean z2 = c3806.f11987;
        String str3 = this.f11980;
        if (z != z2) {
            String str4 = z ? "background" : "foreground";
            String str5 = z2 ? "background" : "foreground";
            StringBuilder sbM11582 = AbstractC6183.m11582("Attempting to extend color ", str3, " as a ", str4, " with color ");
            AbstractC6183.m11577(sbM11582, str2, " as a ", str5, " for spec version ");
            C7547.m12773(sbM11582, colorSpec$SpecVersion, ".");
            return null;
        }
        C3805 c3805 = new C3805();
        str3.getClass();
        c3805.f11980 = str3;
        c3805.f11977 = this.f11977;
        final int i = 0;
        c3805.f11979 = new InterfaceC6558() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                C8263 c8263;
                int i2 = i;
                C3805 c38052 = this;
                C3806 c38062 = c3806;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i2) {
                    case 0:
                        InterfaceC6558 interfaceC6558 = c38062.f11989;
                        C8260 c8260 = (C8260) obj;
                        c8260.getClass();
                        InterfaceC6558 interfaceC65582 = c8260.f22871 == colorSpec$SpecVersion2 ? interfaceC6558 : c38052.f11979;
                        return (interfaceC65582 == null || (c8263 = (C8263) interfaceC65582.invoke(c8260)) == null) ? (C8263) interfaceC6558.invoke(c8260) : c8263;
                    case 1:
                        InterfaceC6558 interfaceC65583 = c38062.f11988;
                        C8260 c82602 = (C8260) obj;
                        c82602.getClass();
                        InterfaceC6558 interfaceC65584 = c82602.f22871 == colorSpec$SpecVersion2 ? interfaceC65583 : c38052.f11978;
                        return Double.valueOf(((Number) (interfaceC65584 != null ? interfaceC65584.invoke(c82602) : interfaceC65583.invoke(c82602))).doubleValue());
                    case 2:
                        C8260 c82603 = (C8260) obj;
                        c82603.getClass();
                        InterfaceC6558 interfaceC65585 = c82603.f22871 == colorSpec$SpecVersion2 ? c38062.f11986 : c38052.f11976;
                        return interfaceC65585 != null ? (Double) interfaceC65585.invoke(c82603) : Double.valueOf(1.0d);
                    case 3:
                        C8260 c82604 = (C8260) obj;
                        c82604.getClass();
                        InterfaceC6558 interfaceC65586 = c82604.f22871 == colorSpec$SpecVersion2 ? c38062.f11985 : c38052.f11975;
                        if (interfaceC65586 != null) {
                            return (C3806) interfaceC65586.invoke(c82604);
                        }
                        return null;
                    case 4:
                        C8260 c82605 = (C8260) obj;
                        c82605.getClass();
                        InterfaceC6558 interfaceC65587 = c82605.f22871 == colorSpec$SpecVersion2 ? c38062.f11992 : c38052.f11982;
                        if (interfaceC65587 != null) {
                            return (C3806) interfaceC65587.invoke(c82605);
                        }
                        return null;
                    case 5:
                        C8260 c82606 = (C8260) obj;
                        c82606.getClass();
                        InterfaceC6558 interfaceC65588 = c82606.f22871 == colorSpec$SpecVersion2 ? c38062.f11991 : c38052.f11981;
                        if (interfaceC65588 != null) {
                            return (C3803) interfaceC65588.invoke(c82606);
                        }
                        return null;
                    case 6:
                        C8260 c82607 = (C8260) obj;
                        c82607.getClass();
                        InterfaceC6558 interfaceC65589 = c82607.f22871 == colorSpec$SpecVersion2 ? c38062.f11994 : c38052.f11983;
                        if (interfaceC65589 != null) {
                            return (C3795) interfaceC65589.invoke(c82607);
                        }
                        return null;
                    default:
                        C8260 c82608 = (C8260) obj;
                        c82608.getClass();
                        InterfaceC6558 interfaceC655810 = c82608.f22871 == colorSpec$SpecVersion2 ? c38062.f11995 : c38052.f11984;
                        if (interfaceC655810 != null) {
                            return (Double) interfaceC655810.invoke(c82608);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        c3805.f11978 = new InterfaceC6558() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                C8263 c8263;
                int i22 = i2;
                C3805 c38052 = this;
                C3806 c38062 = c3806;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6558 interfaceC6558 = c38062.f11989;
                        C8260 c8260 = (C8260) obj;
                        c8260.getClass();
                        InterfaceC6558 interfaceC65582 = c8260.f22871 == colorSpec$SpecVersion2 ? interfaceC6558 : c38052.f11979;
                        return (interfaceC65582 == null || (c8263 = (C8263) interfaceC65582.invoke(c8260)) == null) ? (C8263) interfaceC6558.invoke(c8260) : c8263;
                    case 1:
                        InterfaceC6558 interfaceC65583 = c38062.f11988;
                        C8260 c82602 = (C8260) obj;
                        c82602.getClass();
                        InterfaceC6558 interfaceC65584 = c82602.f22871 == colorSpec$SpecVersion2 ? interfaceC65583 : c38052.f11978;
                        return Double.valueOf(((Number) (interfaceC65584 != null ? interfaceC65584.invoke(c82602) : interfaceC65583.invoke(c82602))).doubleValue());
                    case 2:
                        C8260 c82603 = (C8260) obj;
                        c82603.getClass();
                        InterfaceC6558 interfaceC65585 = c82603.f22871 == colorSpec$SpecVersion2 ? c38062.f11986 : c38052.f11976;
                        return interfaceC65585 != null ? (Double) interfaceC65585.invoke(c82603) : Double.valueOf(1.0d);
                    case 3:
                        C8260 c82604 = (C8260) obj;
                        c82604.getClass();
                        InterfaceC6558 interfaceC65586 = c82604.f22871 == colorSpec$SpecVersion2 ? c38062.f11985 : c38052.f11975;
                        if (interfaceC65586 != null) {
                            return (C3806) interfaceC65586.invoke(c82604);
                        }
                        return null;
                    case 4:
                        C8260 c82605 = (C8260) obj;
                        c82605.getClass();
                        InterfaceC6558 interfaceC65587 = c82605.f22871 == colorSpec$SpecVersion2 ? c38062.f11992 : c38052.f11982;
                        if (interfaceC65587 != null) {
                            return (C3806) interfaceC65587.invoke(c82605);
                        }
                        return null;
                    case 5:
                        C8260 c82606 = (C8260) obj;
                        c82606.getClass();
                        InterfaceC6558 interfaceC65588 = c82606.f22871 == colorSpec$SpecVersion2 ? c38062.f11991 : c38052.f11981;
                        if (interfaceC65588 != null) {
                            return (C3803) interfaceC65588.invoke(c82606);
                        }
                        return null;
                    case 6:
                        C8260 c82607 = (C8260) obj;
                        c82607.getClass();
                        InterfaceC6558 interfaceC65589 = c82607.f22871 == colorSpec$SpecVersion2 ? c38062.f11994 : c38052.f11983;
                        if (interfaceC65589 != null) {
                            return (C3795) interfaceC65589.invoke(c82607);
                        }
                        return null;
                    default:
                        C8260 c82608 = (C8260) obj;
                        c82608.getClass();
                        InterfaceC6558 interfaceC655810 = c82608.f22871 == colorSpec$SpecVersion2 ? c38062.f11995 : c38052.f11984;
                        if (interfaceC655810 != null) {
                            return (Double) interfaceC655810.invoke(c82608);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        c3805.f11976 = new InterfaceC6558() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                C8263 c8263;
                int i22 = i3;
                C3805 c38052 = this;
                C3806 c38062 = c3806;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6558 interfaceC6558 = c38062.f11989;
                        C8260 c8260 = (C8260) obj;
                        c8260.getClass();
                        InterfaceC6558 interfaceC65582 = c8260.f22871 == colorSpec$SpecVersion2 ? interfaceC6558 : c38052.f11979;
                        return (interfaceC65582 == null || (c8263 = (C8263) interfaceC65582.invoke(c8260)) == null) ? (C8263) interfaceC6558.invoke(c8260) : c8263;
                    case 1:
                        InterfaceC6558 interfaceC65583 = c38062.f11988;
                        C8260 c82602 = (C8260) obj;
                        c82602.getClass();
                        InterfaceC6558 interfaceC65584 = c82602.f22871 == colorSpec$SpecVersion2 ? interfaceC65583 : c38052.f11978;
                        return Double.valueOf(((Number) (interfaceC65584 != null ? interfaceC65584.invoke(c82602) : interfaceC65583.invoke(c82602))).doubleValue());
                    case 2:
                        C8260 c82603 = (C8260) obj;
                        c82603.getClass();
                        InterfaceC6558 interfaceC65585 = c82603.f22871 == colorSpec$SpecVersion2 ? c38062.f11986 : c38052.f11976;
                        return interfaceC65585 != null ? (Double) interfaceC65585.invoke(c82603) : Double.valueOf(1.0d);
                    case 3:
                        C8260 c82604 = (C8260) obj;
                        c82604.getClass();
                        InterfaceC6558 interfaceC65586 = c82604.f22871 == colorSpec$SpecVersion2 ? c38062.f11985 : c38052.f11975;
                        if (interfaceC65586 != null) {
                            return (C3806) interfaceC65586.invoke(c82604);
                        }
                        return null;
                    case 4:
                        C8260 c82605 = (C8260) obj;
                        c82605.getClass();
                        InterfaceC6558 interfaceC65587 = c82605.f22871 == colorSpec$SpecVersion2 ? c38062.f11992 : c38052.f11982;
                        if (interfaceC65587 != null) {
                            return (C3806) interfaceC65587.invoke(c82605);
                        }
                        return null;
                    case 5:
                        C8260 c82606 = (C8260) obj;
                        c82606.getClass();
                        InterfaceC6558 interfaceC65588 = c82606.f22871 == colorSpec$SpecVersion2 ? c38062.f11991 : c38052.f11981;
                        if (interfaceC65588 != null) {
                            return (C3803) interfaceC65588.invoke(c82606);
                        }
                        return null;
                    case 6:
                        C8260 c82607 = (C8260) obj;
                        c82607.getClass();
                        InterfaceC6558 interfaceC65589 = c82607.f22871 == colorSpec$SpecVersion2 ? c38062.f11994 : c38052.f11983;
                        if (interfaceC65589 != null) {
                            return (C3795) interfaceC65589.invoke(c82607);
                        }
                        return null;
                    default:
                        C8260 c82608 = (C8260) obj;
                        c82608.getClass();
                        InterfaceC6558 interfaceC655810 = c82608.f22871 == colorSpec$SpecVersion2 ? c38062.f11995 : c38052.f11984;
                        if (interfaceC655810 != null) {
                            return (Double) interfaceC655810.invoke(c82608);
                        }
                        return null;
                }
            }
        };
        final int i4 = 3;
        c3805.f11975 = new InterfaceC6558() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                C8263 c8263;
                int i22 = i4;
                C3805 c38052 = this;
                C3806 c38062 = c3806;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6558 interfaceC6558 = c38062.f11989;
                        C8260 c8260 = (C8260) obj;
                        c8260.getClass();
                        InterfaceC6558 interfaceC65582 = c8260.f22871 == colorSpec$SpecVersion2 ? interfaceC6558 : c38052.f11979;
                        return (interfaceC65582 == null || (c8263 = (C8263) interfaceC65582.invoke(c8260)) == null) ? (C8263) interfaceC6558.invoke(c8260) : c8263;
                    case 1:
                        InterfaceC6558 interfaceC65583 = c38062.f11988;
                        C8260 c82602 = (C8260) obj;
                        c82602.getClass();
                        InterfaceC6558 interfaceC65584 = c82602.f22871 == colorSpec$SpecVersion2 ? interfaceC65583 : c38052.f11978;
                        return Double.valueOf(((Number) (interfaceC65584 != null ? interfaceC65584.invoke(c82602) : interfaceC65583.invoke(c82602))).doubleValue());
                    case 2:
                        C8260 c82603 = (C8260) obj;
                        c82603.getClass();
                        InterfaceC6558 interfaceC65585 = c82603.f22871 == colorSpec$SpecVersion2 ? c38062.f11986 : c38052.f11976;
                        return interfaceC65585 != null ? (Double) interfaceC65585.invoke(c82603) : Double.valueOf(1.0d);
                    case 3:
                        C8260 c82604 = (C8260) obj;
                        c82604.getClass();
                        InterfaceC6558 interfaceC65586 = c82604.f22871 == colorSpec$SpecVersion2 ? c38062.f11985 : c38052.f11975;
                        if (interfaceC65586 != null) {
                            return (C3806) interfaceC65586.invoke(c82604);
                        }
                        return null;
                    case 4:
                        C8260 c82605 = (C8260) obj;
                        c82605.getClass();
                        InterfaceC6558 interfaceC65587 = c82605.f22871 == colorSpec$SpecVersion2 ? c38062.f11992 : c38052.f11982;
                        if (interfaceC65587 != null) {
                            return (C3806) interfaceC65587.invoke(c82605);
                        }
                        return null;
                    case 5:
                        C8260 c82606 = (C8260) obj;
                        c82606.getClass();
                        InterfaceC6558 interfaceC65588 = c82606.f22871 == colorSpec$SpecVersion2 ? c38062.f11991 : c38052.f11981;
                        if (interfaceC65588 != null) {
                            return (C3803) interfaceC65588.invoke(c82606);
                        }
                        return null;
                    case 6:
                        C8260 c82607 = (C8260) obj;
                        c82607.getClass();
                        InterfaceC6558 interfaceC65589 = c82607.f22871 == colorSpec$SpecVersion2 ? c38062.f11994 : c38052.f11983;
                        if (interfaceC65589 != null) {
                            return (C3795) interfaceC65589.invoke(c82607);
                        }
                        return null;
                    default:
                        C8260 c82608 = (C8260) obj;
                        c82608.getClass();
                        InterfaceC6558 interfaceC655810 = c82608.f22871 == colorSpec$SpecVersion2 ? c38062.f11995 : c38052.f11984;
                        if (interfaceC655810 != null) {
                            return (Double) interfaceC655810.invoke(c82608);
                        }
                        return null;
                }
            }
        };
        final int i5 = 4;
        c3805.f11982 = new InterfaceC6558() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                C8263 c8263;
                int i22 = i5;
                C3805 c38052 = this;
                C3806 c38062 = c3806;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6558 interfaceC6558 = c38062.f11989;
                        C8260 c8260 = (C8260) obj;
                        c8260.getClass();
                        InterfaceC6558 interfaceC65582 = c8260.f22871 == colorSpec$SpecVersion2 ? interfaceC6558 : c38052.f11979;
                        return (interfaceC65582 == null || (c8263 = (C8263) interfaceC65582.invoke(c8260)) == null) ? (C8263) interfaceC6558.invoke(c8260) : c8263;
                    case 1:
                        InterfaceC6558 interfaceC65583 = c38062.f11988;
                        C8260 c82602 = (C8260) obj;
                        c82602.getClass();
                        InterfaceC6558 interfaceC65584 = c82602.f22871 == colorSpec$SpecVersion2 ? interfaceC65583 : c38052.f11978;
                        return Double.valueOf(((Number) (interfaceC65584 != null ? interfaceC65584.invoke(c82602) : interfaceC65583.invoke(c82602))).doubleValue());
                    case 2:
                        C8260 c82603 = (C8260) obj;
                        c82603.getClass();
                        InterfaceC6558 interfaceC65585 = c82603.f22871 == colorSpec$SpecVersion2 ? c38062.f11986 : c38052.f11976;
                        return interfaceC65585 != null ? (Double) interfaceC65585.invoke(c82603) : Double.valueOf(1.0d);
                    case 3:
                        C8260 c82604 = (C8260) obj;
                        c82604.getClass();
                        InterfaceC6558 interfaceC65586 = c82604.f22871 == colorSpec$SpecVersion2 ? c38062.f11985 : c38052.f11975;
                        if (interfaceC65586 != null) {
                            return (C3806) interfaceC65586.invoke(c82604);
                        }
                        return null;
                    case 4:
                        C8260 c82605 = (C8260) obj;
                        c82605.getClass();
                        InterfaceC6558 interfaceC65587 = c82605.f22871 == colorSpec$SpecVersion2 ? c38062.f11992 : c38052.f11982;
                        if (interfaceC65587 != null) {
                            return (C3806) interfaceC65587.invoke(c82605);
                        }
                        return null;
                    case 5:
                        C8260 c82606 = (C8260) obj;
                        c82606.getClass();
                        InterfaceC6558 interfaceC65588 = c82606.f22871 == colorSpec$SpecVersion2 ? c38062.f11991 : c38052.f11981;
                        if (interfaceC65588 != null) {
                            return (C3803) interfaceC65588.invoke(c82606);
                        }
                        return null;
                    case 6:
                        C8260 c82607 = (C8260) obj;
                        c82607.getClass();
                        InterfaceC6558 interfaceC65589 = c82607.f22871 == colorSpec$SpecVersion2 ? c38062.f11994 : c38052.f11983;
                        if (interfaceC65589 != null) {
                            return (C3795) interfaceC65589.invoke(c82607);
                        }
                        return null;
                    default:
                        C8260 c82608 = (C8260) obj;
                        c82608.getClass();
                        InterfaceC6558 interfaceC655810 = c82608.f22871 == colorSpec$SpecVersion2 ? c38062.f11995 : c38052.f11984;
                        if (interfaceC655810 != null) {
                            return (Double) interfaceC655810.invoke(c82608);
                        }
                        return null;
                }
            }
        };
        final int i6 = 5;
        c3805.f11981 = new InterfaceC6558() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                C8263 c8263;
                int i22 = i6;
                C3805 c38052 = this;
                C3806 c38062 = c3806;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6558 interfaceC6558 = c38062.f11989;
                        C8260 c8260 = (C8260) obj;
                        c8260.getClass();
                        InterfaceC6558 interfaceC65582 = c8260.f22871 == colorSpec$SpecVersion2 ? interfaceC6558 : c38052.f11979;
                        return (interfaceC65582 == null || (c8263 = (C8263) interfaceC65582.invoke(c8260)) == null) ? (C8263) interfaceC6558.invoke(c8260) : c8263;
                    case 1:
                        InterfaceC6558 interfaceC65583 = c38062.f11988;
                        C8260 c82602 = (C8260) obj;
                        c82602.getClass();
                        InterfaceC6558 interfaceC65584 = c82602.f22871 == colorSpec$SpecVersion2 ? interfaceC65583 : c38052.f11978;
                        return Double.valueOf(((Number) (interfaceC65584 != null ? interfaceC65584.invoke(c82602) : interfaceC65583.invoke(c82602))).doubleValue());
                    case 2:
                        C8260 c82603 = (C8260) obj;
                        c82603.getClass();
                        InterfaceC6558 interfaceC65585 = c82603.f22871 == colorSpec$SpecVersion2 ? c38062.f11986 : c38052.f11976;
                        return interfaceC65585 != null ? (Double) interfaceC65585.invoke(c82603) : Double.valueOf(1.0d);
                    case 3:
                        C8260 c82604 = (C8260) obj;
                        c82604.getClass();
                        InterfaceC6558 interfaceC65586 = c82604.f22871 == colorSpec$SpecVersion2 ? c38062.f11985 : c38052.f11975;
                        if (interfaceC65586 != null) {
                            return (C3806) interfaceC65586.invoke(c82604);
                        }
                        return null;
                    case 4:
                        C8260 c82605 = (C8260) obj;
                        c82605.getClass();
                        InterfaceC6558 interfaceC65587 = c82605.f22871 == colorSpec$SpecVersion2 ? c38062.f11992 : c38052.f11982;
                        if (interfaceC65587 != null) {
                            return (C3806) interfaceC65587.invoke(c82605);
                        }
                        return null;
                    case 5:
                        C8260 c82606 = (C8260) obj;
                        c82606.getClass();
                        InterfaceC6558 interfaceC65588 = c82606.f22871 == colorSpec$SpecVersion2 ? c38062.f11991 : c38052.f11981;
                        if (interfaceC65588 != null) {
                            return (C3803) interfaceC65588.invoke(c82606);
                        }
                        return null;
                    case 6:
                        C8260 c82607 = (C8260) obj;
                        c82607.getClass();
                        InterfaceC6558 interfaceC65589 = c82607.f22871 == colorSpec$SpecVersion2 ? c38062.f11994 : c38052.f11983;
                        if (interfaceC65589 != null) {
                            return (C3795) interfaceC65589.invoke(c82607);
                        }
                        return null;
                    default:
                        C8260 c82608 = (C8260) obj;
                        c82608.getClass();
                        InterfaceC6558 interfaceC655810 = c82608.f22871 == colorSpec$SpecVersion2 ? c38062.f11995 : c38052.f11984;
                        if (interfaceC655810 != null) {
                            return (Double) interfaceC655810.invoke(c82608);
                        }
                        return null;
                }
            }
        };
        final int i7 = 6;
        c3805.f11983 = new InterfaceC6558() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                C8263 c8263;
                int i22 = i7;
                C3805 c38052 = this;
                C3806 c38062 = c3806;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6558 interfaceC6558 = c38062.f11989;
                        C8260 c8260 = (C8260) obj;
                        c8260.getClass();
                        InterfaceC6558 interfaceC65582 = c8260.f22871 == colorSpec$SpecVersion2 ? interfaceC6558 : c38052.f11979;
                        return (interfaceC65582 == null || (c8263 = (C8263) interfaceC65582.invoke(c8260)) == null) ? (C8263) interfaceC6558.invoke(c8260) : c8263;
                    case 1:
                        InterfaceC6558 interfaceC65583 = c38062.f11988;
                        C8260 c82602 = (C8260) obj;
                        c82602.getClass();
                        InterfaceC6558 interfaceC65584 = c82602.f22871 == colorSpec$SpecVersion2 ? interfaceC65583 : c38052.f11978;
                        return Double.valueOf(((Number) (interfaceC65584 != null ? interfaceC65584.invoke(c82602) : interfaceC65583.invoke(c82602))).doubleValue());
                    case 2:
                        C8260 c82603 = (C8260) obj;
                        c82603.getClass();
                        InterfaceC6558 interfaceC65585 = c82603.f22871 == colorSpec$SpecVersion2 ? c38062.f11986 : c38052.f11976;
                        return interfaceC65585 != null ? (Double) interfaceC65585.invoke(c82603) : Double.valueOf(1.0d);
                    case 3:
                        C8260 c82604 = (C8260) obj;
                        c82604.getClass();
                        InterfaceC6558 interfaceC65586 = c82604.f22871 == colorSpec$SpecVersion2 ? c38062.f11985 : c38052.f11975;
                        if (interfaceC65586 != null) {
                            return (C3806) interfaceC65586.invoke(c82604);
                        }
                        return null;
                    case 4:
                        C8260 c82605 = (C8260) obj;
                        c82605.getClass();
                        InterfaceC6558 interfaceC65587 = c82605.f22871 == colorSpec$SpecVersion2 ? c38062.f11992 : c38052.f11982;
                        if (interfaceC65587 != null) {
                            return (C3806) interfaceC65587.invoke(c82605);
                        }
                        return null;
                    case 5:
                        C8260 c82606 = (C8260) obj;
                        c82606.getClass();
                        InterfaceC6558 interfaceC65588 = c82606.f22871 == colorSpec$SpecVersion2 ? c38062.f11991 : c38052.f11981;
                        if (interfaceC65588 != null) {
                            return (C3803) interfaceC65588.invoke(c82606);
                        }
                        return null;
                    case 6:
                        C8260 c82607 = (C8260) obj;
                        c82607.getClass();
                        InterfaceC6558 interfaceC65589 = c82607.f22871 == colorSpec$SpecVersion2 ? c38062.f11994 : c38052.f11983;
                        if (interfaceC65589 != null) {
                            return (C3795) interfaceC65589.invoke(c82607);
                        }
                        return null;
                    default:
                        C8260 c82608 = (C8260) obj;
                        c82608.getClass();
                        InterfaceC6558 interfaceC655810 = c82608.f22871 == colorSpec$SpecVersion2 ? c38062.f11995 : c38052.f11984;
                        if (interfaceC655810 != null) {
                            return (Double) interfaceC655810.invoke(c82608);
                        }
                        return null;
                }
            }
        };
        final int i8 = 7;
        c3805.f11984 = new InterfaceC6558() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p052.InterfaceC6558
            public final Object invoke(Object obj) {
                C8263 c8263;
                int i22 = i8;
                C3805 c38052 = this;
                C3806 c38062 = c3806;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC6558 interfaceC6558 = c38062.f11989;
                        C8260 c8260 = (C8260) obj;
                        c8260.getClass();
                        InterfaceC6558 interfaceC65582 = c8260.f22871 == colorSpec$SpecVersion2 ? interfaceC6558 : c38052.f11979;
                        return (interfaceC65582 == null || (c8263 = (C8263) interfaceC65582.invoke(c8260)) == null) ? (C8263) interfaceC6558.invoke(c8260) : c8263;
                    case 1:
                        InterfaceC6558 interfaceC65583 = c38062.f11988;
                        C8260 c82602 = (C8260) obj;
                        c82602.getClass();
                        InterfaceC6558 interfaceC65584 = c82602.f22871 == colorSpec$SpecVersion2 ? interfaceC65583 : c38052.f11978;
                        return Double.valueOf(((Number) (interfaceC65584 != null ? interfaceC65584.invoke(c82602) : interfaceC65583.invoke(c82602))).doubleValue());
                    case 2:
                        C8260 c82603 = (C8260) obj;
                        c82603.getClass();
                        InterfaceC6558 interfaceC65585 = c82603.f22871 == colorSpec$SpecVersion2 ? c38062.f11986 : c38052.f11976;
                        return interfaceC65585 != null ? (Double) interfaceC65585.invoke(c82603) : Double.valueOf(1.0d);
                    case 3:
                        C8260 c82604 = (C8260) obj;
                        c82604.getClass();
                        InterfaceC6558 interfaceC65586 = c82604.f22871 == colorSpec$SpecVersion2 ? c38062.f11985 : c38052.f11975;
                        if (interfaceC65586 != null) {
                            return (C3806) interfaceC65586.invoke(c82604);
                        }
                        return null;
                    case 4:
                        C8260 c82605 = (C8260) obj;
                        c82605.getClass();
                        InterfaceC6558 interfaceC65587 = c82605.f22871 == colorSpec$SpecVersion2 ? c38062.f11992 : c38052.f11982;
                        if (interfaceC65587 != null) {
                            return (C3806) interfaceC65587.invoke(c82605);
                        }
                        return null;
                    case 5:
                        C8260 c82606 = (C8260) obj;
                        c82606.getClass();
                        InterfaceC6558 interfaceC65588 = c82606.f22871 == colorSpec$SpecVersion2 ? c38062.f11991 : c38052.f11981;
                        if (interfaceC65588 != null) {
                            return (C3803) interfaceC65588.invoke(c82606);
                        }
                        return null;
                    case 6:
                        C8260 c82607 = (C8260) obj;
                        c82607.getClass();
                        InterfaceC6558 interfaceC65589 = c82607.f22871 == colorSpec$SpecVersion2 ? c38062.f11994 : c38052.f11983;
                        if (interfaceC65589 != null) {
                            return (C3795) interfaceC65589.invoke(c82607);
                        }
                        return null;
                    default:
                        C8260 c82608 = (C8260) obj;
                        c82608.getClass();
                        InterfaceC6558 interfaceC655810 = c82608.f22871 == colorSpec$SpecVersion2 ? c38062.f11995 : c38052.f11984;
                        if (interfaceC655810 != null) {
                            return (Double) interfaceC655810.invoke(c82608);
                        }
                        return null;
                }
            }
        };
        return c3805;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C3806 m8134() {
        InterfaceC6558 interfaceC6558 = this.f11975;
        if (interfaceC6558 == null && this.f11982 != null) {
            C5925.m11314(AbstractC0053.m158("Color ", this.f11980, " has secondBackground defined, but background is not defined."));
            return null;
        }
        if (interfaceC6558 == null && this.f11981 != null) {
            C5925.m11314(AbstractC0053.m158("Color ", this.f11980, " has contrastCurve defined, but background is not defined."));
            return null;
        }
        if (interfaceC6558 != null && this.f11981 == null) {
            C5925.m11314(AbstractC0053.m158("Color ", this.f11980, " has background defined, but contrastCurve is not defined."));
            return null;
        }
        InterfaceC6558 c3807 = this.f11978;
        if (c3807 == null) {
            c3807 = interfaceC6558 == null ? new C3807(0) : new C1021(interfaceC6558, 2);
        }
        String str = this.f11980;
        str.getClass();
        InterfaceC6558 interfaceC65582 = this.f11979;
        interfaceC65582.getClass();
        return new C3806(str, interfaceC65582, c3807, this.f11977, this.f11976, this.f11975, this.f11982, this.f11981, this.f11983, this.f11984);
    }
}
