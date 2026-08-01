package p236;

import androidx.activity.compose.C0004;
import java.util.ArrayList;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.text.AbstractC5143;
import p007.AbstractC6136;
import p052.InterfaceC6542;
import p089.C7184;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8092 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f22326;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f22327;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f22328;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22329;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22330;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC5183 f22332;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC5183 f22333;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8090 f22334;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f22335;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC5183 f22336;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC5183 f22337;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8090 f22338;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC5183 f22339;

    public C8092(C8090 c8090, String str, int i, ArrayList arrayList, InterfaceC8094 interfaceC8094, String str2, String str3, String str4, boolean z, String str5) {
        str.getClass();
        interfaceC8094.getClass();
        str2.getClass();
        this.f22331 = str;
        this.f22330 = i;
        this.f22329 = str3;
        this.f22328 = str4;
        this.f22327 = z;
        this.f22326 = str5;
        if (i < 0 || i >= 65536) {
            C5919.m11253(AbstractC6136.m11556(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
            throw null;
        }
        this.f22335 = arrayList;
        final int i2 = 1;
        AbstractC5186.m10210(new C7184(i2, arrayList));
        this.f22334 = c8090;
        this.f22338 = c8090 == null ? C8090.f22322 : c8090;
        this.f22339 = AbstractC5186.m10210(new C0004(arrayList, 19, this));
        final int i3 = 0;
        this.f22336 = AbstractC5186.m10210(new InterfaceC6542(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8092 f22319;

            {
                this.f22319 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i4 = i3;
                C8092 c8092 = this.f22319;
                switch (i4) {
                    case 0:
                        String str6 = c8092.f22326;
                        int iM10151 = AbstractC5143.m10151(str6, '?', 0, 6) + 1;
                        if (iM10151 == 0) {
                            return "";
                        }
                        int iM101512 = AbstractC5143.m10151(str6, '#', iM10151, 4);
                        return iM101512 == -1 ? str6.substring(iM10151) : str6.substring(iM10151, iM101512);
                    case 1:
                        String str7 = c8092.f22326;
                        int iM101513 = AbstractC5143.m10151(str7, '/', c8092.f22338.f22324.length() + 3, 4);
                        if (iM101513 == -1) {
                            return "";
                        }
                        int iM101514 = AbstractC5143.m10151(str7, '#', iM101513, 4);
                        return iM101514 == -1 ? str7.substring(iM101513) : str7.substring(iM101513, iM101514);
                    case 2:
                        String str8 = c8092.f22326;
                        String str9 = c8092.f22329;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8092.f22338.f22324.length() + 3;
                        return str8.substring(length, AbstractC5143.m10168(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8092.f22326;
                        String str11 = c8092.f22328;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5143.m10151(str10, ':', c8092.f22338.f22324.length() + 3, 4) + 1, AbstractC5143.m10151(str10, '@', 0, 6));
                    default:
                        String str12 = c8092.f22326;
                        int iM101515 = AbstractC5143.m10151(str12, '#', 0, 6) + 1;
                        return iM101515 == 0 ? "" : str12.substring(iM101515);
                }
            }
        });
        AbstractC5186.m10210(new InterfaceC6542(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8092 f22319;

            {
                this.f22319 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i4 = i2;
                C8092 c8092 = this.f22319;
                switch (i4) {
                    case 0:
                        String str6 = c8092.f22326;
                        int iM10151 = AbstractC5143.m10151(str6, '?', 0, 6) + 1;
                        if (iM10151 == 0) {
                            return "";
                        }
                        int iM101512 = AbstractC5143.m10151(str6, '#', iM10151, 4);
                        return iM101512 == -1 ? str6.substring(iM10151) : str6.substring(iM10151, iM101512);
                    case 1:
                        String str7 = c8092.f22326;
                        int iM101513 = AbstractC5143.m10151(str7, '/', c8092.f22338.f22324.length() + 3, 4);
                        if (iM101513 == -1) {
                            return "";
                        }
                        int iM101514 = AbstractC5143.m10151(str7, '#', iM101513, 4);
                        return iM101514 == -1 ? str7.substring(iM101513) : str7.substring(iM101513, iM101514);
                    case 2:
                        String str8 = c8092.f22326;
                        String str9 = c8092.f22329;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8092.f22338.f22324.length() + 3;
                        return str8.substring(length, AbstractC5143.m10168(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8092.f22326;
                        String str11 = c8092.f22328;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5143.m10151(str10, ':', c8092.f22338.f22324.length() + 3, 4) + 1, AbstractC5143.m10151(str10, '@', 0, 6));
                    default:
                        String str12 = c8092.f22326;
                        int iM101515 = AbstractC5143.m10151(str12, '#', 0, 6) + 1;
                        return iM101515 == 0 ? "" : str12.substring(iM101515);
                }
            }
        });
        final int i4 = 2;
        this.f22337 = AbstractC5186.m10210(new InterfaceC6542(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8092 f22319;

            {
                this.f22319 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i42 = i4;
                C8092 c8092 = this.f22319;
                switch (i42) {
                    case 0:
                        String str6 = c8092.f22326;
                        int iM10151 = AbstractC5143.m10151(str6, '?', 0, 6) + 1;
                        if (iM10151 == 0) {
                            return "";
                        }
                        int iM101512 = AbstractC5143.m10151(str6, '#', iM10151, 4);
                        return iM101512 == -1 ? str6.substring(iM10151) : str6.substring(iM10151, iM101512);
                    case 1:
                        String str7 = c8092.f22326;
                        int iM101513 = AbstractC5143.m10151(str7, '/', c8092.f22338.f22324.length() + 3, 4);
                        if (iM101513 == -1) {
                            return "";
                        }
                        int iM101514 = AbstractC5143.m10151(str7, '#', iM101513, 4);
                        return iM101514 == -1 ? str7.substring(iM101513) : str7.substring(iM101513, iM101514);
                    case 2:
                        String str8 = c8092.f22326;
                        String str9 = c8092.f22329;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8092.f22338.f22324.length() + 3;
                        return str8.substring(length, AbstractC5143.m10168(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8092.f22326;
                        String str11 = c8092.f22328;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5143.m10151(str10, ':', c8092.f22338.f22324.length() + 3, 4) + 1, AbstractC5143.m10151(str10, '@', 0, 6));
                    default:
                        String str12 = c8092.f22326;
                        int iM101515 = AbstractC5143.m10151(str12, '#', 0, 6) + 1;
                        return iM101515 == 0 ? "" : str12.substring(iM101515);
                }
            }
        });
        final int i5 = 3;
        this.f22333 = AbstractC5186.m10210(new InterfaceC6542(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8092 f22319;

            {
                this.f22319 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i42 = i5;
                C8092 c8092 = this.f22319;
                switch (i42) {
                    case 0:
                        String str6 = c8092.f22326;
                        int iM10151 = AbstractC5143.m10151(str6, '?', 0, 6) + 1;
                        if (iM10151 == 0) {
                            return "";
                        }
                        int iM101512 = AbstractC5143.m10151(str6, '#', iM10151, 4);
                        return iM101512 == -1 ? str6.substring(iM10151) : str6.substring(iM10151, iM101512);
                    case 1:
                        String str7 = c8092.f22326;
                        int iM101513 = AbstractC5143.m10151(str7, '/', c8092.f22338.f22324.length() + 3, 4);
                        if (iM101513 == -1) {
                            return "";
                        }
                        int iM101514 = AbstractC5143.m10151(str7, '#', iM101513, 4);
                        return iM101514 == -1 ? str7.substring(iM101513) : str7.substring(iM101513, iM101514);
                    case 2:
                        String str8 = c8092.f22326;
                        String str9 = c8092.f22329;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8092.f22338.f22324.length() + 3;
                        return str8.substring(length, AbstractC5143.m10168(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8092.f22326;
                        String str11 = c8092.f22328;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5143.m10151(str10, ':', c8092.f22338.f22324.length() + 3, 4) + 1, AbstractC5143.m10151(str10, '@', 0, 6));
                    default:
                        String str12 = c8092.f22326;
                        int iM101515 = AbstractC5143.m10151(str12, '#', 0, 6) + 1;
                        return iM101515 == 0 ? "" : str12.substring(iM101515);
                }
            }
        });
        final int i6 = 4;
        this.f22332 = AbstractC5186.m10210(new InterfaceC6542(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8092 f22319;

            {
                this.f22319 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                int i42 = i6;
                C8092 c8092 = this.f22319;
                switch (i42) {
                    case 0:
                        String str6 = c8092.f22326;
                        int iM10151 = AbstractC5143.m10151(str6, '?', 0, 6) + 1;
                        if (iM10151 == 0) {
                            return "";
                        }
                        int iM101512 = AbstractC5143.m10151(str6, '#', iM10151, 4);
                        return iM101512 == -1 ? str6.substring(iM10151) : str6.substring(iM10151, iM101512);
                    case 1:
                        String str7 = c8092.f22326;
                        int iM101513 = AbstractC5143.m10151(str7, '/', c8092.f22338.f22324.length() + 3, 4);
                        if (iM101513 == -1) {
                            return "";
                        }
                        int iM101514 = AbstractC5143.m10151(str7, '#', iM101513, 4);
                        return iM101514 == -1 ? str7.substring(iM101513) : str7.substring(iM101513, iM101514);
                    case 2:
                        String str8 = c8092.f22326;
                        String str9 = c8092.f22329;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8092.f22338.f22324.length() + 3;
                        return str8.substring(length, AbstractC5143.m10168(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8092.f22326;
                        String str11 = c8092.f22328;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5143.m10151(str10, ':', c8092.f22338.f22324.length() + 3, 4) + 1, AbstractC5143.m10151(str10, '@', 0, 6));
                    default:
                        String str12 = c8092.f22326;
                        int iM101515 = AbstractC5143.m10151(str12, '#', 0, 6) + 1;
                        return iM101515 == 0 ? "" : str12.substring(iM101515);
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8092.class != obj.getClass()) {
            return false;
        }
        return this.f22326.equals(((C8092) obj).f22326);
    }

    public final int hashCode() {
        return this.f22326.hashCode();
    }

    public final String toString() {
        return this.f22326;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m13538() {
        int i = this.f22330;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.f22338.f22323;
    }
}
