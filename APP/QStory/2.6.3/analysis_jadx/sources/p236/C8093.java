package p236;

import androidx.activity.compose.C0004;
import java.util.ArrayList;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.text.AbstractC5144;
import p009.AbstractC6183;
import p052.InterfaceC6543;
import p089.C7185;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8093 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f22324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f22325;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f22326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22329;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC5184 f22330;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC5184 f22331;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8091 f22332;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f22333;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC5184 f22334;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC5184 f22335;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8091 f22336;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC5184 f22337;

    public C8093(C8091 c8091, String str, int i, ArrayList arrayList, InterfaceC8095 interfaceC8095, String str2, String str3, String str4, boolean z, String str5) {
        str.getClass();
        interfaceC8095.getClass();
        str2.getClass();
        this.f22329 = str;
        this.f22328 = i;
        this.f22327 = str3;
        this.f22326 = str4;
        this.f22325 = z;
        this.f22324 = str5;
        if (i < 0 || i >= 65536) {
            C5925.m11314(AbstractC6183.m11588(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
            throw null;
        }
        this.f22333 = arrayList;
        final int i2 = 1;
        AbstractC5187.m10214(new C7185(i2, arrayList));
        this.f22332 = c8091;
        this.f22336 = c8091 == null ? C8091.f22320 : c8091;
        this.f22337 = AbstractC5187.m10214(new C0004(arrayList, 19, this));
        final int i3 = 0;
        this.f22334 = AbstractC5187.m10214(new InterfaceC6543(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8093 f22317;

            {
                this.f22317 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i4 = i3;
                C8093 c8093 = this.f22317;
                switch (i4) {
                    case 0:
                        String str6 = c8093.f22324;
                        int iM10171 = AbstractC5144.m10171(str6, '?', 0, 6) + 1;
                        if (iM10171 == 0) {
                            return "";
                        }
                        int iM101712 = AbstractC5144.m10171(str6, '#', iM10171, 4);
                        return iM101712 == -1 ? str6.substring(iM10171) : str6.substring(iM10171, iM101712);
                    case 1:
                        String str7 = c8093.f22324;
                        int iM101713 = AbstractC5144.m10171(str7, '/', c8093.f22336.f22322.length() + 3, 4);
                        if (iM101713 == -1) {
                            return "";
                        }
                        int iM101714 = AbstractC5144.m10171(str7, '#', iM101713, 4);
                        return iM101714 == -1 ? str7.substring(iM101713) : str7.substring(iM101713, iM101714);
                    case 2:
                        String str8 = c8093.f22324;
                        String str9 = c8093.f22327;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8093.f22336.f22322.length() + 3;
                        return str8.substring(length, AbstractC5144.m10173(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8093.f22324;
                        String str11 = c8093.f22326;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5144.m10171(str10, ':', c8093.f22336.f22322.length() + 3, 4) + 1, AbstractC5144.m10171(str10, '@', 0, 6));
                    default:
                        String str12 = c8093.f22324;
                        int iM101715 = AbstractC5144.m10171(str12, '#', 0, 6) + 1;
                        return iM101715 == 0 ? "" : str12.substring(iM101715);
                }
            }
        });
        AbstractC5187.m10214(new InterfaceC6543(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8093 f22317;

            {
                this.f22317 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i4 = i2;
                C8093 c8093 = this.f22317;
                switch (i4) {
                    case 0:
                        String str6 = c8093.f22324;
                        int iM10171 = AbstractC5144.m10171(str6, '?', 0, 6) + 1;
                        if (iM10171 == 0) {
                            return "";
                        }
                        int iM101712 = AbstractC5144.m10171(str6, '#', iM10171, 4);
                        return iM101712 == -1 ? str6.substring(iM10171) : str6.substring(iM10171, iM101712);
                    case 1:
                        String str7 = c8093.f22324;
                        int iM101713 = AbstractC5144.m10171(str7, '/', c8093.f22336.f22322.length() + 3, 4);
                        if (iM101713 == -1) {
                            return "";
                        }
                        int iM101714 = AbstractC5144.m10171(str7, '#', iM101713, 4);
                        return iM101714 == -1 ? str7.substring(iM101713) : str7.substring(iM101713, iM101714);
                    case 2:
                        String str8 = c8093.f22324;
                        String str9 = c8093.f22327;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8093.f22336.f22322.length() + 3;
                        return str8.substring(length, AbstractC5144.m10173(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8093.f22324;
                        String str11 = c8093.f22326;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5144.m10171(str10, ':', c8093.f22336.f22322.length() + 3, 4) + 1, AbstractC5144.m10171(str10, '@', 0, 6));
                    default:
                        String str12 = c8093.f22324;
                        int iM101715 = AbstractC5144.m10171(str12, '#', 0, 6) + 1;
                        return iM101715 == 0 ? "" : str12.substring(iM101715);
                }
            }
        });
        final int i4 = 2;
        this.f22335 = AbstractC5187.m10214(new InterfaceC6543(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8093 f22317;

            {
                this.f22317 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i42 = i4;
                C8093 c8093 = this.f22317;
                switch (i42) {
                    case 0:
                        String str6 = c8093.f22324;
                        int iM10171 = AbstractC5144.m10171(str6, '?', 0, 6) + 1;
                        if (iM10171 == 0) {
                            return "";
                        }
                        int iM101712 = AbstractC5144.m10171(str6, '#', iM10171, 4);
                        return iM101712 == -1 ? str6.substring(iM10171) : str6.substring(iM10171, iM101712);
                    case 1:
                        String str7 = c8093.f22324;
                        int iM101713 = AbstractC5144.m10171(str7, '/', c8093.f22336.f22322.length() + 3, 4);
                        if (iM101713 == -1) {
                            return "";
                        }
                        int iM101714 = AbstractC5144.m10171(str7, '#', iM101713, 4);
                        return iM101714 == -1 ? str7.substring(iM101713) : str7.substring(iM101713, iM101714);
                    case 2:
                        String str8 = c8093.f22324;
                        String str9 = c8093.f22327;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8093.f22336.f22322.length() + 3;
                        return str8.substring(length, AbstractC5144.m10173(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8093.f22324;
                        String str11 = c8093.f22326;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5144.m10171(str10, ':', c8093.f22336.f22322.length() + 3, 4) + 1, AbstractC5144.m10171(str10, '@', 0, 6));
                    default:
                        String str12 = c8093.f22324;
                        int iM101715 = AbstractC5144.m10171(str12, '#', 0, 6) + 1;
                        return iM101715 == 0 ? "" : str12.substring(iM101715);
                }
            }
        });
        final int i5 = 3;
        this.f22331 = AbstractC5187.m10214(new InterfaceC6543(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8093 f22317;

            {
                this.f22317 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i42 = i5;
                C8093 c8093 = this.f22317;
                switch (i42) {
                    case 0:
                        String str6 = c8093.f22324;
                        int iM10171 = AbstractC5144.m10171(str6, '?', 0, 6) + 1;
                        if (iM10171 == 0) {
                            return "";
                        }
                        int iM101712 = AbstractC5144.m10171(str6, '#', iM10171, 4);
                        return iM101712 == -1 ? str6.substring(iM10171) : str6.substring(iM10171, iM101712);
                    case 1:
                        String str7 = c8093.f22324;
                        int iM101713 = AbstractC5144.m10171(str7, '/', c8093.f22336.f22322.length() + 3, 4);
                        if (iM101713 == -1) {
                            return "";
                        }
                        int iM101714 = AbstractC5144.m10171(str7, '#', iM101713, 4);
                        return iM101714 == -1 ? str7.substring(iM101713) : str7.substring(iM101713, iM101714);
                    case 2:
                        String str8 = c8093.f22324;
                        String str9 = c8093.f22327;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8093.f22336.f22322.length() + 3;
                        return str8.substring(length, AbstractC5144.m10173(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8093.f22324;
                        String str11 = c8093.f22326;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5144.m10171(str10, ':', c8093.f22336.f22322.length() + 3, 4) + 1, AbstractC5144.m10171(str10, '@', 0, 6));
                    default:
                        String str12 = c8093.f22324;
                        int iM101715 = AbstractC5144.m10171(str12, '#', 0, 6) + 1;
                        return iM101715 == 0 ? "" : str12.substring(iM101715);
                }
            }
        });
        final int i6 = 4;
        this.f22330 = AbstractC5187.m10214(new InterfaceC6543(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8093 f22317;

            {
                this.f22317 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                int i42 = i6;
                C8093 c8093 = this.f22317;
                switch (i42) {
                    case 0:
                        String str6 = c8093.f22324;
                        int iM10171 = AbstractC5144.m10171(str6, '?', 0, 6) + 1;
                        if (iM10171 == 0) {
                            return "";
                        }
                        int iM101712 = AbstractC5144.m10171(str6, '#', iM10171, 4);
                        return iM101712 == -1 ? str6.substring(iM10171) : str6.substring(iM10171, iM101712);
                    case 1:
                        String str7 = c8093.f22324;
                        int iM101713 = AbstractC5144.m10171(str7, '/', c8093.f22336.f22322.length() + 3, 4);
                        if (iM101713 == -1) {
                            return "";
                        }
                        int iM101714 = AbstractC5144.m10171(str7, '#', iM101713, 4);
                        return iM101714 == -1 ? str7.substring(iM101713) : str7.substring(iM101713, iM101714);
                    case 2:
                        String str8 = c8093.f22324;
                        String str9 = c8093.f22327;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8093.f22336.f22322.length() + 3;
                        return str8.substring(length, AbstractC5144.m10173(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8093.f22324;
                        String str11 = c8093.f22326;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5144.m10171(str10, ':', c8093.f22336.f22322.length() + 3, 4) + 1, AbstractC5144.m10171(str10, '@', 0, 6));
                    default:
                        String str12 = c8093.f22324;
                        int iM101715 = AbstractC5144.m10171(str12, '#', 0, 6) + 1;
                        return iM101715 == 0 ? "" : str12.substring(iM101715);
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8093.class != obj.getClass()) {
            return false;
        }
        return this.f22324.equals(((C8093) obj).f22324);
    }

    public final int hashCode() {
        return this.f22324.hashCode();
    }

    public final String toString() {
        return this.f22324;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m13567() {
        int i = this.f22328;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.f22336.f22321;
    }
}
