package com.materialkolor.dynamiccolor;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.C1859;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p068.InterfaceC7387;
import p160.C8376;
import p281.C9089;
import p282.C9092;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.materialkolor.dynamiccolor.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4637 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC7387 f12320;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC7387 f12321;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f12322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC7387 f12323;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public InterfaceC7387 f12324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public String f12325;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public InterfaceC7387 f12326;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public InterfaceC7387 f12327;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public InterfaceC7387 f12328;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC7387 f12329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4637 m8692(final ColorSpec$SpecVersion colorSpec$SpecVersion, final C4638 c4638) {
        colorSpec$SpecVersion.getClass();
        String str = this.f12325;
        String str2 = c4638.f12335;
        if (!AbstractC5227.m9466(str, str2)) {
            C8376.m13332(AbstractC7012.m12141("Attempting to extend color ", this.f12325, " with color ", str2, " of different name for spec version "), colorSpec$SpecVersion, ".");
            return null;
        }
        boolean z = this.f12322;
        boolean z2 = c4638.f12332;
        String str3 = this.f12325;
        if (z != z2) {
            String str4 = z ? "background" : "foreground";
            String str5 = z2 ? "background" : "foreground";
            StringBuilder sbM12141 = AbstractC7012.m12141("Attempting to extend color ", str3, " as a ", str4, " with color ");
            AbstractC7012.m12136(sbM12141, str2, " as a ", str5, " for spec version ");
            C8376.m13332(sbM12141, colorSpec$SpecVersion, ".");
            return null;
        }
        C4637 c4637 = new C4637();
        str3.getClass();
        c4637.f12325 = str3;
        c4637.f12322 = this.f12322;
        final int i = 0;
        c4637.f12324 = new InterfaceC7387() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                C9092 c9092;
                int i2 = i;
                C4637 c46372 = this;
                C4638 c46382 = c4638;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i2) {
                    case 0:
                        InterfaceC7387 interfaceC7387 = c46382.f12334;
                        C9089 c9089 = (C9089) obj;
                        c9089.getClass();
                        InterfaceC7387 interfaceC73872 = c9089.f23216 == colorSpec$SpecVersion2 ? interfaceC7387 : c46372.f12324;
                        return (interfaceC73872 == null || (c9092 = (C9092) interfaceC73872.invoke(c9089)) == null) ? (C9092) interfaceC7387.invoke(c9089) : c9092;
                    case 1:
                        InterfaceC7387 interfaceC73873 = c46382.f12333;
                        C9089 c90892 = (C9089) obj;
                        c90892.getClass();
                        InterfaceC7387 interfaceC73874 = c90892.f23216 == colorSpec$SpecVersion2 ? interfaceC73873 : c46372.f12323;
                        return Double.valueOf(((Number) (interfaceC73874 != null ? interfaceC73874.invoke(c90892) : interfaceC73873.invoke(c90892))).doubleValue());
                    case 2:
                        C9089 c90893 = (C9089) obj;
                        c90893.getClass();
                        InterfaceC7387 interfaceC73875 = c90893.f23216 == colorSpec$SpecVersion2 ? c46382.f12331 : c46372.f12321;
                        return interfaceC73875 != null ? (Double) interfaceC73875.invoke(c90893) : Double.valueOf(1.0d);
                    case 3:
                        C9089 c90894 = (C9089) obj;
                        c90894.getClass();
                        InterfaceC7387 interfaceC73876 = c90894.f23216 == colorSpec$SpecVersion2 ? c46382.f12330 : c46372.f12320;
                        if (interfaceC73876 != null) {
                            return (C4638) interfaceC73876.invoke(c90894);
                        }
                        return null;
                    case 4:
                        C9089 c90895 = (C9089) obj;
                        c90895.getClass();
                        InterfaceC7387 interfaceC73877 = c90895.f23216 == colorSpec$SpecVersion2 ? c46382.f12337 : c46372.f12327;
                        if (interfaceC73877 != null) {
                            return (C4638) interfaceC73877.invoke(c90895);
                        }
                        return null;
                    case 5:
                        C9089 c90896 = (C9089) obj;
                        c90896.getClass();
                        InterfaceC7387 interfaceC73878 = c90896.f23216 == colorSpec$SpecVersion2 ? c46382.f12336 : c46372.f12326;
                        if (interfaceC73878 != null) {
                            return (C4635) interfaceC73878.invoke(c90896);
                        }
                        return null;
                    case 6:
                        C9089 c90897 = (C9089) obj;
                        c90897.getClass();
                        InterfaceC7387 interfaceC73879 = c90897.f23216 == colorSpec$SpecVersion2 ? c46382.f12339 : c46372.f12328;
                        if (interfaceC73879 != null) {
                            return (C4627) interfaceC73879.invoke(c90897);
                        }
                        return null;
                    default:
                        C9089 c90898 = (C9089) obj;
                        c90898.getClass();
                        InterfaceC7387 interfaceC738710 = c90898.f23216 == colorSpec$SpecVersion2 ? c46382.f12340 : c46372.f12329;
                        if (interfaceC738710 != null) {
                            return (Double) interfaceC738710.invoke(c90898);
                        }
                        return null;
                }
            }
        };
        final int i2 = 1;
        c4637.f12323 = new InterfaceC7387() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                C9092 c9092;
                int i22 = i2;
                C4637 c46372 = this;
                C4638 c46382 = c4638;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC7387 interfaceC7387 = c46382.f12334;
                        C9089 c9089 = (C9089) obj;
                        c9089.getClass();
                        InterfaceC7387 interfaceC73872 = c9089.f23216 == colorSpec$SpecVersion2 ? interfaceC7387 : c46372.f12324;
                        return (interfaceC73872 == null || (c9092 = (C9092) interfaceC73872.invoke(c9089)) == null) ? (C9092) interfaceC7387.invoke(c9089) : c9092;
                    case 1:
                        InterfaceC7387 interfaceC73873 = c46382.f12333;
                        C9089 c90892 = (C9089) obj;
                        c90892.getClass();
                        InterfaceC7387 interfaceC73874 = c90892.f23216 == colorSpec$SpecVersion2 ? interfaceC73873 : c46372.f12323;
                        return Double.valueOf(((Number) (interfaceC73874 != null ? interfaceC73874.invoke(c90892) : interfaceC73873.invoke(c90892))).doubleValue());
                    case 2:
                        C9089 c90893 = (C9089) obj;
                        c90893.getClass();
                        InterfaceC7387 interfaceC73875 = c90893.f23216 == colorSpec$SpecVersion2 ? c46382.f12331 : c46372.f12321;
                        return interfaceC73875 != null ? (Double) interfaceC73875.invoke(c90893) : Double.valueOf(1.0d);
                    case 3:
                        C9089 c90894 = (C9089) obj;
                        c90894.getClass();
                        InterfaceC7387 interfaceC73876 = c90894.f23216 == colorSpec$SpecVersion2 ? c46382.f12330 : c46372.f12320;
                        if (interfaceC73876 != null) {
                            return (C4638) interfaceC73876.invoke(c90894);
                        }
                        return null;
                    case 4:
                        C9089 c90895 = (C9089) obj;
                        c90895.getClass();
                        InterfaceC7387 interfaceC73877 = c90895.f23216 == colorSpec$SpecVersion2 ? c46382.f12337 : c46372.f12327;
                        if (interfaceC73877 != null) {
                            return (C4638) interfaceC73877.invoke(c90895);
                        }
                        return null;
                    case 5:
                        C9089 c90896 = (C9089) obj;
                        c90896.getClass();
                        InterfaceC7387 interfaceC73878 = c90896.f23216 == colorSpec$SpecVersion2 ? c46382.f12336 : c46372.f12326;
                        if (interfaceC73878 != null) {
                            return (C4635) interfaceC73878.invoke(c90896);
                        }
                        return null;
                    case 6:
                        C9089 c90897 = (C9089) obj;
                        c90897.getClass();
                        InterfaceC7387 interfaceC73879 = c90897.f23216 == colorSpec$SpecVersion2 ? c46382.f12339 : c46372.f12328;
                        if (interfaceC73879 != null) {
                            return (C4627) interfaceC73879.invoke(c90897);
                        }
                        return null;
                    default:
                        C9089 c90898 = (C9089) obj;
                        c90898.getClass();
                        InterfaceC7387 interfaceC738710 = c90898.f23216 == colorSpec$SpecVersion2 ? c46382.f12340 : c46372.f12329;
                        if (interfaceC738710 != null) {
                            return (Double) interfaceC738710.invoke(c90898);
                        }
                        return null;
                }
            }
        };
        final int i3 = 2;
        c4637.f12321 = new InterfaceC7387() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                C9092 c9092;
                int i22 = i3;
                C4637 c46372 = this;
                C4638 c46382 = c4638;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC7387 interfaceC7387 = c46382.f12334;
                        C9089 c9089 = (C9089) obj;
                        c9089.getClass();
                        InterfaceC7387 interfaceC73872 = c9089.f23216 == colorSpec$SpecVersion2 ? interfaceC7387 : c46372.f12324;
                        return (interfaceC73872 == null || (c9092 = (C9092) interfaceC73872.invoke(c9089)) == null) ? (C9092) interfaceC7387.invoke(c9089) : c9092;
                    case 1:
                        InterfaceC7387 interfaceC73873 = c46382.f12333;
                        C9089 c90892 = (C9089) obj;
                        c90892.getClass();
                        InterfaceC7387 interfaceC73874 = c90892.f23216 == colorSpec$SpecVersion2 ? interfaceC73873 : c46372.f12323;
                        return Double.valueOf(((Number) (interfaceC73874 != null ? interfaceC73874.invoke(c90892) : interfaceC73873.invoke(c90892))).doubleValue());
                    case 2:
                        C9089 c90893 = (C9089) obj;
                        c90893.getClass();
                        InterfaceC7387 interfaceC73875 = c90893.f23216 == colorSpec$SpecVersion2 ? c46382.f12331 : c46372.f12321;
                        return interfaceC73875 != null ? (Double) interfaceC73875.invoke(c90893) : Double.valueOf(1.0d);
                    case 3:
                        C9089 c90894 = (C9089) obj;
                        c90894.getClass();
                        InterfaceC7387 interfaceC73876 = c90894.f23216 == colorSpec$SpecVersion2 ? c46382.f12330 : c46372.f12320;
                        if (interfaceC73876 != null) {
                            return (C4638) interfaceC73876.invoke(c90894);
                        }
                        return null;
                    case 4:
                        C9089 c90895 = (C9089) obj;
                        c90895.getClass();
                        InterfaceC7387 interfaceC73877 = c90895.f23216 == colorSpec$SpecVersion2 ? c46382.f12337 : c46372.f12327;
                        if (interfaceC73877 != null) {
                            return (C4638) interfaceC73877.invoke(c90895);
                        }
                        return null;
                    case 5:
                        C9089 c90896 = (C9089) obj;
                        c90896.getClass();
                        InterfaceC7387 interfaceC73878 = c90896.f23216 == colorSpec$SpecVersion2 ? c46382.f12336 : c46372.f12326;
                        if (interfaceC73878 != null) {
                            return (C4635) interfaceC73878.invoke(c90896);
                        }
                        return null;
                    case 6:
                        C9089 c90897 = (C9089) obj;
                        c90897.getClass();
                        InterfaceC7387 interfaceC73879 = c90897.f23216 == colorSpec$SpecVersion2 ? c46382.f12339 : c46372.f12328;
                        if (interfaceC73879 != null) {
                            return (C4627) interfaceC73879.invoke(c90897);
                        }
                        return null;
                    default:
                        C9089 c90898 = (C9089) obj;
                        c90898.getClass();
                        InterfaceC7387 interfaceC738710 = c90898.f23216 == colorSpec$SpecVersion2 ? c46382.f12340 : c46372.f12329;
                        if (interfaceC738710 != null) {
                            return (Double) interfaceC738710.invoke(c90898);
                        }
                        return null;
                }
            }
        };
        final int i4 = 3;
        c4637.f12320 = new InterfaceC7387() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                C9092 c9092;
                int i22 = i4;
                C4637 c46372 = this;
                C4638 c46382 = c4638;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC7387 interfaceC7387 = c46382.f12334;
                        C9089 c9089 = (C9089) obj;
                        c9089.getClass();
                        InterfaceC7387 interfaceC73872 = c9089.f23216 == colorSpec$SpecVersion2 ? interfaceC7387 : c46372.f12324;
                        return (interfaceC73872 == null || (c9092 = (C9092) interfaceC73872.invoke(c9089)) == null) ? (C9092) interfaceC7387.invoke(c9089) : c9092;
                    case 1:
                        InterfaceC7387 interfaceC73873 = c46382.f12333;
                        C9089 c90892 = (C9089) obj;
                        c90892.getClass();
                        InterfaceC7387 interfaceC73874 = c90892.f23216 == colorSpec$SpecVersion2 ? interfaceC73873 : c46372.f12323;
                        return Double.valueOf(((Number) (interfaceC73874 != null ? interfaceC73874.invoke(c90892) : interfaceC73873.invoke(c90892))).doubleValue());
                    case 2:
                        C9089 c90893 = (C9089) obj;
                        c90893.getClass();
                        InterfaceC7387 interfaceC73875 = c90893.f23216 == colorSpec$SpecVersion2 ? c46382.f12331 : c46372.f12321;
                        return interfaceC73875 != null ? (Double) interfaceC73875.invoke(c90893) : Double.valueOf(1.0d);
                    case 3:
                        C9089 c90894 = (C9089) obj;
                        c90894.getClass();
                        InterfaceC7387 interfaceC73876 = c90894.f23216 == colorSpec$SpecVersion2 ? c46382.f12330 : c46372.f12320;
                        if (interfaceC73876 != null) {
                            return (C4638) interfaceC73876.invoke(c90894);
                        }
                        return null;
                    case 4:
                        C9089 c90895 = (C9089) obj;
                        c90895.getClass();
                        InterfaceC7387 interfaceC73877 = c90895.f23216 == colorSpec$SpecVersion2 ? c46382.f12337 : c46372.f12327;
                        if (interfaceC73877 != null) {
                            return (C4638) interfaceC73877.invoke(c90895);
                        }
                        return null;
                    case 5:
                        C9089 c90896 = (C9089) obj;
                        c90896.getClass();
                        InterfaceC7387 interfaceC73878 = c90896.f23216 == colorSpec$SpecVersion2 ? c46382.f12336 : c46372.f12326;
                        if (interfaceC73878 != null) {
                            return (C4635) interfaceC73878.invoke(c90896);
                        }
                        return null;
                    case 6:
                        C9089 c90897 = (C9089) obj;
                        c90897.getClass();
                        InterfaceC7387 interfaceC73879 = c90897.f23216 == colorSpec$SpecVersion2 ? c46382.f12339 : c46372.f12328;
                        if (interfaceC73879 != null) {
                            return (C4627) interfaceC73879.invoke(c90897);
                        }
                        return null;
                    default:
                        C9089 c90898 = (C9089) obj;
                        c90898.getClass();
                        InterfaceC7387 interfaceC738710 = c90898.f23216 == colorSpec$SpecVersion2 ? c46382.f12340 : c46372.f12329;
                        if (interfaceC738710 != null) {
                            return (Double) interfaceC738710.invoke(c90898);
                        }
                        return null;
                }
            }
        };
        final int i5 = 4;
        c4637.f12327 = new InterfaceC7387() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                C9092 c9092;
                int i22 = i5;
                C4637 c46372 = this;
                C4638 c46382 = c4638;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC7387 interfaceC7387 = c46382.f12334;
                        C9089 c9089 = (C9089) obj;
                        c9089.getClass();
                        InterfaceC7387 interfaceC73872 = c9089.f23216 == colorSpec$SpecVersion2 ? interfaceC7387 : c46372.f12324;
                        return (interfaceC73872 == null || (c9092 = (C9092) interfaceC73872.invoke(c9089)) == null) ? (C9092) interfaceC7387.invoke(c9089) : c9092;
                    case 1:
                        InterfaceC7387 interfaceC73873 = c46382.f12333;
                        C9089 c90892 = (C9089) obj;
                        c90892.getClass();
                        InterfaceC7387 interfaceC73874 = c90892.f23216 == colorSpec$SpecVersion2 ? interfaceC73873 : c46372.f12323;
                        return Double.valueOf(((Number) (interfaceC73874 != null ? interfaceC73874.invoke(c90892) : interfaceC73873.invoke(c90892))).doubleValue());
                    case 2:
                        C9089 c90893 = (C9089) obj;
                        c90893.getClass();
                        InterfaceC7387 interfaceC73875 = c90893.f23216 == colorSpec$SpecVersion2 ? c46382.f12331 : c46372.f12321;
                        return interfaceC73875 != null ? (Double) interfaceC73875.invoke(c90893) : Double.valueOf(1.0d);
                    case 3:
                        C9089 c90894 = (C9089) obj;
                        c90894.getClass();
                        InterfaceC7387 interfaceC73876 = c90894.f23216 == colorSpec$SpecVersion2 ? c46382.f12330 : c46372.f12320;
                        if (interfaceC73876 != null) {
                            return (C4638) interfaceC73876.invoke(c90894);
                        }
                        return null;
                    case 4:
                        C9089 c90895 = (C9089) obj;
                        c90895.getClass();
                        InterfaceC7387 interfaceC73877 = c90895.f23216 == colorSpec$SpecVersion2 ? c46382.f12337 : c46372.f12327;
                        if (interfaceC73877 != null) {
                            return (C4638) interfaceC73877.invoke(c90895);
                        }
                        return null;
                    case 5:
                        C9089 c90896 = (C9089) obj;
                        c90896.getClass();
                        InterfaceC7387 interfaceC73878 = c90896.f23216 == colorSpec$SpecVersion2 ? c46382.f12336 : c46372.f12326;
                        if (interfaceC73878 != null) {
                            return (C4635) interfaceC73878.invoke(c90896);
                        }
                        return null;
                    case 6:
                        C9089 c90897 = (C9089) obj;
                        c90897.getClass();
                        InterfaceC7387 interfaceC73879 = c90897.f23216 == colorSpec$SpecVersion2 ? c46382.f12339 : c46372.f12328;
                        if (interfaceC73879 != null) {
                            return (C4627) interfaceC73879.invoke(c90897);
                        }
                        return null;
                    default:
                        C9089 c90898 = (C9089) obj;
                        c90898.getClass();
                        InterfaceC7387 interfaceC738710 = c90898.f23216 == colorSpec$SpecVersion2 ? c46382.f12340 : c46372.f12329;
                        if (interfaceC738710 != null) {
                            return (Double) interfaceC738710.invoke(c90898);
                        }
                        return null;
                }
            }
        };
        final int i6 = 5;
        c4637.f12326 = new InterfaceC7387() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                C9092 c9092;
                int i22 = i6;
                C4637 c46372 = this;
                C4638 c46382 = c4638;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC7387 interfaceC7387 = c46382.f12334;
                        C9089 c9089 = (C9089) obj;
                        c9089.getClass();
                        InterfaceC7387 interfaceC73872 = c9089.f23216 == colorSpec$SpecVersion2 ? interfaceC7387 : c46372.f12324;
                        return (interfaceC73872 == null || (c9092 = (C9092) interfaceC73872.invoke(c9089)) == null) ? (C9092) interfaceC7387.invoke(c9089) : c9092;
                    case 1:
                        InterfaceC7387 interfaceC73873 = c46382.f12333;
                        C9089 c90892 = (C9089) obj;
                        c90892.getClass();
                        InterfaceC7387 interfaceC73874 = c90892.f23216 == colorSpec$SpecVersion2 ? interfaceC73873 : c46372.f12323;
                        return Double.valueOf(((Number) (interfaceC73874 != null ? interfaceC73874.invoke(c90892) : interfaceC73873.invoke(c90892))).doubleValue());
                    case 2:
                        C9089 c90893 = (C9089) obj;
                        c90893.getClass();
                        InterfaceC7387 interfaceC73875 = c90893.f23216 == colorSpec$SpecVersion2 ? c46382.f12331 : c46372.f12321;
                        return interfaceC73875 != null ? (Double) interfaceC73875.invoke(c90893) : Double.valueOf(1.0d);
                    case 3:
                        C9089 c90894 = (C9089) obj;
                        c90894.getClass();
                        InterfaceC7387 interfaceC73876 = c90894.f23216 == colorSpec$SpecVersion2 ? c46382.f12330 : c46372.f12320;
                        if (interfaceC73876 != null) {
                            return (C4638) interfaceC73876.invoke(c90894);
                        }
                        return null;
                    case 4:
                        C9089 c90895 = (C9089) obj;
                        c90895.getClass();
                        InterfaceC7387 interfaceC73877 = c90895.f23216 == colorSpec$SpecVersion2 ? c46382.f12337 : c46372.f12327;
                        if (interfaceC73877 != null) {
                            return (C4638) interfaceC73877.invoke(c90895);
                        }
                        return null;
                    case 5:
                        C9089 c90896 = (C9089) obj;
                        c90896.getClass();
                        InterfaceC7387 interfaceC73878 = c90896.f23216 == colorSpec$SpecVersion2 ? c46382.f12336 : c46372.f12326;
                        if (interfaceC73878 != null) {
                            return (C4635) interfaceC73878.invoke(c90896);
                        }
                        return null;
                    case 6:
                        C9089 c90897 = (C9089) obj;
                        c90897.getClass();
                        InterfaceC7387 interfaceC73879 = c90897.f23216 == colorSpec$SpecVersion2 ? c46382.f12339 : c46372.f12328;
                        if (interfaceC73879 != null) {
                            return (C4627) interfaceC73879.invoke(c90897);
                        }
                        return null;
                    default:
                        C9089 c90898 = (C9089) obj;
                        c90898.getClass();
                        InterfaceC7387 interfaceC738710 = c90898.f23216 == colorSpec$SpecVersion2 ? c46382.f12340 : c46372.f12329;
                        if (interfaceC738710 != null) {
                            return (Double) interfaceC738710.invoke(c90898);
                        }
                        return null;
                }
            }
        };
        final int i7 = 6;
        c4637.f12328 = new InterfaceC7387() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                C9092 c9092;
                int i22 = i7;
                C4637 c46372 = this;
                C4638 c46382 = c4638;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC7387 interfaceC7387 = c46382.f12334;
                        C9089 c9089 = (C9089) obj;
                        c9089.getClass();
                        InterfaceC7387 interfaceC73872 = c9089.f23216 == colorSpec$SpecVersion2 ? interfaceC7387 : c46372.f12324;
                        return (interfaceC73872 == null || (c9092 = (C9092) interfaceC73872.invoke(c9089)) == null) ? (C9092) interfaceC7387.invoke(c9089) : c9092;
                    case 1:
                        InterfaceC7387 interfaceC73873 = c46382.f12333;
                        C9089 c90892 = (C9089) obj;
                        c90892.getClass();
                        InterfaceC7387 interfaceC73874 = c90892.f23216 == colorSpec$SpecVersion2 ? interfaceC73873 : c46372.f12323;
                        return Double.valueOf(((Number) (interfaceC73874 != null ? interfaceC73874.invoke(c90892) : interfaceC73873.invoke(c90892))).doubleValue());
                    case 2:
                        C9089 c90893 = (C9089) obj;
                        c90893.getClass();
                        InterfaceC7387 interfaceC73875 = c90893.f23216 == colorSpec$SpecVersion2 ? c46382.f12331 : c46372.f12321;
                        return interfaceC73875 != null ? (Double) interfaceC73875.invoke(c90893) : Double.valueOf(1.0d);
                    case 3:
                        C9089 c90894 = (C9089) obj;
                        c90894.getClass();
                        InterfaceC7387 interfaceC73876 = c90894.f23216 == colorSpec$SpecVersion2 ? c46382.f12330 : c46372.f12320;
                        if (interfaceC73876 != null) {
                            return (C4638) interfaceC73876.invoke(c90894);
                        }
                        return null;
                    case 4:
                        C9089 c90895 = (C9089) obj;
                        c90895.getClass();
                        InterfaceC7387 interfaceC73877 = c90895.f23216 == colorSpec$SpecVersion2 ? c46382.f12337 : c46372.f12327;
                        if (interfaceC73877 != null) {
                            return (C4638) interfaceC73877.invoke(c90895);
                        }
                        return null;
                    case 5:
                        C9089 c90896 = (C9089) obj;
                        c90896.getClass();
                        InterfaceC7387 interfaceC73878 = c90896.f23216 == colorSpec$SpecVersion2 ? c46382.f12336 : c46372.f12326;
                        if (interfaceC73878 != null) {
                            return (C4635) interfaceC73878.invoke(c90896);
                        }
                        return null;
                    case 6:
                        C9089 c90897 = (C9089) obj;
                        c90897.getClass();
                        InterfaceC7387 interfaceC73879 = c90897.f23216 == colorSpec$SpecVersion2 ? c46382.f12339 : c46372.f12328;
                        if (interfaceC73879 != null) {
                            return (C4627) interfaceC73879.invoke(c90897);
                        }
                        return null;
                    default:
                        C9089 c90898 = (C9089) obj;
                        c90898.getClass();
                        InterfaceC7387 interfaceC738710 = c90898.f23216 == colorSpec$SpecVersion2 ? c46382.f12340 : c46372.f12329;
                        if (interfaceC738710 != null) {
                            return (Double) interfaceC738710.invoke(c90898);
                        }
                        return null;
                }
            }
        };
        final int i8 = 7;
        c4637.f12329 = new InterfaceC7387() { // from class: com.materialkolor.dynamiccolor.飘花落叶言子楪兰苏哲世
            @Override // p068.InterfaceC7387
            public final Object invoke(Object obj) {
                C9092 c9092;
                int i22 = i8;
                C4637 c46372 = this;
                C4638 c46382 = c4638;
                ColorSpec$SpecVersion colorSpec$SpecVersion2 = colorSpec$SpecVersion;
                switch (i22) {
                    case 0:
                        InterfaceC7387 interfaceC7387 = c46382.f12334;
                        C9089 c9089 = (C9089) obj;
                        c9089.getClass();
                        InterfaceC7387 interfaceC73872 = c9089.f23216 == colorSpec$SpecVersion2 ? interfaceC7387 : c46372.f12324;
                        return (interfaceC73872 == null || (c9092 = (C9092) interfaceC73872.invoke(c9089)) == null) ? (C9092) interfaceC7387.invoke(c9089) : c9092;
                    case 1:
                        InterfaceC7387 interfaceC73873 = c46382.f12333;
                        C9089 c90892 = (C9089) obj;
                        c90892.getClass();
                        InterfaceC7387 interfaceC73874 = c90892.f23216 == colorSpec$SpecVersion2 ? interfaceC73873 : c46372.f12323;
                        return Double.valueOf(((Number) (interfaceC73874 != null ? interfaceC73874.invoke(c90892) : interfaceC73873.invoke(c90892))).doubleValue());
                    case 2:
                        C9089 c90893 = (C9089) obj;
                        c90893.getClass();
                        InterfaceC7387 interfaceC73875 = c90893.f23216 == colorSpec$SpecVersion2 ? c46382.f12331 : c46372.f12321;
                        return interfaceC73875 != null ? (Double) interfaceC73875.invoke(c90893) : Double.valueOf(1.0d);
                    case 3:
                        C9089 c90894 = (C9089) obj;
                        c90894.getClass();
                        InterfaceC7387 interfaceC73876 = c90894.f23216 == colorSpec$SpecVersion2 ? c46382.f12330 : c46372.f12320;
                        if (interfaceC73876 != null) {
                            return (C4638) interfaceC73876.invoke(c90894);
                        }
                        return null;
                    case 4:
                        C9089 c90895 = (C9089) obj;
                        c90895.getClass();
                        InterfaceC7387 interfaceC73877 = c90895.f23216 == colorSpec$SpecVersion2 ? c46382.f12337 : c46372.f12327;
                        if (interfaceC73877 != null) {
                            return (C4638) interfaceC73877.invoke(c90895);
                        }
                        return null;
                    case 5:
                        C9089 c90896 = (C9089) obj;
                        c90896.getClass();
                        InterfaceC7387 interfaceC73878 = c90896.f23216 == colorSpec$SpecVersion2 ? c46382.f12336 : c46372.f12326;
                        if (interfaceC73878 != null) {
                            return (C4635) interfaceC73878.invoke(c90896);
                        }
                        return null;
                    case 6:
                        C9089 c90897 = (C9089) obj;
                        c90897.getClass();
                        InterfaceC7387 interfaceC73879 = c90897.f23216 == colorSpec$SpecVersion2 ? c46382.f12339 : c46372.f12328;
                        if (interfaceC73879 != null) {
                            return (C4627) interfaceC73879.invoke(c90897);
                        }
                        return null;
                    default:
                        C9089 c90898 = (C9089) obj;
                        c90898.getClass();
                        InterfaceC7387 interfaceC738710 = c90898.f23216 == colorSpec$SpecVersion2 ? c46382.f12340 : c46372.f12329;
                        if (interfaceC738710 != null) {
                            return (Double) interfaceC738710.invoke(c90898);
                        }
                        return null;
                }
            }
        };
        return c4637;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4638 m8693() {
        InterfaceC7387 interfaceC7387 = this.f12320;
        if (interfaceC7387 == null && this.f12327 != null) {
            C6755.m11873(AbstractC0900.m718("Color ", this.f12325, " has secondBackground defined, but background is not defined."));
            return null;
        }
        if (interfaceC7387 == null && this.f12326 != null) {
            C6755.m11873(AbstractC0900.m718("Color ", this.f12325, " has contrastCurve defined, but background is not defined."));
            return null;
        }
        if (interfaceC7387 != null && this.f12326 == null) {
            C6755.m11873(AbstractC0900.m718("Color ", this.f12325, " has background defined, but contrastCurve is not defined."));
            return null;
        }
        InterfaceC7387 c4639 = this.f12323;
        if (c4639 == null) {
            c4639 = interfaceC7387 == null ? new C4639(0) : new C1859(interfaceC7387, 2);
        }
        String str = this.f12325;
        str.getClass();
        InterfaceC7387 interfaceC73872 = this.f12324;
        interfaceC73872.getClass();
        return new C4638(str, interfaceC73872, c4639, this.f12322, this.f12321, this.f12320, this.f12327, this.f12326, this.f12328, this.f12329);
    }
}
