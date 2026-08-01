package p252;

import androidx.activity.compose.C0851;
import java.util.ArrayList;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.text.AbstractC5976;
import p025.AbstractC7012;
import p068.InterfaceC7372;
import p105.C8014;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f22669;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f22670;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f22671;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f22672;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f22673;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22674;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final InterfaceC6016 f22675;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f22676;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8920 f22677;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final ArrayList f22678;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC6016 f22679;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final InterfaceC6016 f22680;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final C8920 f22681;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6016 f22682;

    public C8922(C8920 c8920, String str, int i, ArrayList arrayList, InterfaceC8924 interfaceC8924, String str2, String str3, String str4, boolean z, String str5) {
        str.getClass();
        interfaceC8924.getClass();
        str2.getClass();
        this.f22674 = str;
        this.f22673 = i;
        this.f22672 = str3;
        this.f22671 = str4;
        this.f22670 = z;
        this.f22669 = str5;
        if (i < 0 || i >= 65536) {
            C6755.m11873(AbstractC7012.m12147(i, "Port must be between 0 and 65535, or 0 if not set. Provided: "));
            throw null;
        }
        this.f22678 = arrayList;
        final int i2 = 1;
        AbstractC6019.m10773(new C8014(i2, arrayList));
        this.f22677 = c8920;
        this.f22681 = c8920 == null ? C8920.f22665 : c8920;
        this.f22682 = AbstractC6019.m10773(new C0851(arrayList, 19, this));
        final int i3 = 0;
        this.f22679 = AbstractC6019.m10773(new InterfaceC7372(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8922 f22662;

            {
                this.f22662 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i4 = i3;
                C8922 c8922 = this.f22662;
                switch (i4) {
                    case 0:
                        String str6 = c8922.f22669;
                        int iM10730 = AbstractC5976.m10730(str6, '?', 0, 6) + 1;
                        if (iM10730 == 0) {
                            return "";
                        }
                        int iM107302 = AbstractC5976.m10730(str6, '#', iM10730, 4);
                        return iM107302 == -1 ? str6.substring(iM10730) : str6.substring(iM10730, iM107302);
                    case 1:
                        String str7 = c8922.f22669;
                        int iM107303 = AbstractC5976.m10730(str7, '/', c8922.f22681.f22667.length() + 3, 4);
                        if (iM107303 == -1) {
                            return "";
                        }
                        int iM107304 = AbstractC5976.m10730(str7, '#', iM107303, 4);
                        return iM107304 == -1 ? str7.substring(iM107303) : str7.substring(iM107303, iM107304);
                    case 2:
                        String str8 = c8922.f22669;
                        String str9 = c8922.f22672;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8922.f22681.f22667.length() + 3;
                        return str8.substring(length, AbstractC5976.m10732(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8922.f22669;
                        String str11 = c8922.f22671;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5976.m10730(str10, ':', c8922.f22681.f22667.length() + 3, 4) + 1, AbstractC5976.m10730(str10, '@', 0, 6));
                    default:
                        String str12 = c8922.f22669;
                        int iM107305 = AbstractC5976.m10730(str12, '#', 0, 6) + 1;
                        return iM107305 == 0 ? "" : str12.substring(iM107305);
                }
            }
        });
        AbstractC6019.m10773(new InterfaceC7372(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8922 f22662;

            {
                this.f22662 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i4 = i2;
                C8922 c8922 = this.f22662;
                switch (i4) {
                    case 0:
                        String str6 = c8922.f22669;
                        int iM10730 = AbstractC5976.m10730(str6, '?', 0, 6) + 1;
                        if (iM10730 == 0) {
                            return "";
                        }
                        int iM107302 = AbstractC5976.m10730(str6, '#', iM10730, 4);
                        return iM107302 == -1 ? str6.substring(iM10730) : str6.substring(iM10730, iM107302);
                    case 1:
                        String str7 = c8922.f22669;
                        int iM107303 = AbstractC5976.m10730(str7, '/', c8922.f22681.f22667.length() + 3, 4);
                        if (iM107303 == -1) {
                            return "";
                        }
                        int iM107304 = AbstractC5976.m10730(str7, '#', iM107303, 4);
                        return iM107304 == -1 ? str7.substring(iM107303) : str7.substring(iM107303, iM107304);
                    case 2:
                        String str8 = c8922.f22669;
                        String str9 = c8922.f22672;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8922.f22681.f22667.length() + 3;
                        return str8.substring(length, AbstractC5976.m10732(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8922.f22669;
                        String str11 = c8922.f22671;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5976.m10730(str10, ':', c8922.f22681.f22667.length() + 3, 4) + 1, AbstractC5976.m10730(str10, '@', 0, 6));
                    default:
                        String str12 = c8922.f22669;
                        int iM107305 = AbstractC5976.m10730(str12, '#', 0, 6) + 1;
                        return iM107305 == 0 ? "" : str12.substring(iM107305);
                }
            }
        });
        final int i4 = 2;
        this.f22680 = AbstractC6019.m10773(new InterfaceC7372(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8922 f22662;

            {
                this.f22662 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i42 = i4;
                C8922 c8922 = this.f22662;
                switch (i42) {
                    case 0:
                        String str6 = c8922.f22669;
                        int iM10730 = AbstractC5976.m10730(str6, '?', 0, 6) + 1;
                        if (iM10730 == 0) {
                            return "";
                        }
                        int iM107302 = AbstractC5976.m10730(str6, '#', iM10730, 4);
                        return iM107302 == -1 ? str6.substring(iM10730) : str6.substring(iM10730, iM107302);
                    case 1:
                        String str7 = c8922.f22669;
                        int iM107303 = AbstractC5976.m10730(str7, '/', c8922.f22681.f22667.length() + 3, 4);
                        if (iM107303 == -1) {
                            return "";
                        }
                        int iM107304 = AbstractC5976.m10730(str7, '#', iM107303, 4);
                        return iM107304 == -1 ? str7.substring(iM107303) : str7.substring(iM107303, iM107304);
                    case 2:
                        String str8 = c8922.f22669;
                        String str9 = c8922.f22672;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8922.f22681.f22667.length() + 3;
                        return str8.substring(length, AbstractC5976.m10732(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8922.f22669;
                        String str11 = c8922.f22671;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5976.m10730(str10, ':', c8922.f22681.f22667.length() + 3, 4) + 1, AbstractC5976.m10730(str10, '@', 0, 6));
                    default:
                        String str12 = c8922.f22669;
                        int iM107305 = AbstractC5976.m10730(str12, '#', 0, 6) + 1;
                        return iM107305 == 0 ? "" : str12.substring(iM107305);
                }
            }
        });
        final int i5 = 3;
        this.f22676 = AbstractC6019.m10773(new InterfaceC7372(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8922 f22662;

            {
                this.f22662 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i42 = i5;
                C8922 c8922 = this.f22662;
                switch (i42) {
                    case 0:
                        String str6 = c8922.f22669;
                        int iM10730 = AbstractC5976.m10730(str6, '?', 0, 6) + 1;
                        if (iM10730 == 0) {
                            return "";
                        }
                        int iM107302 = AbstractC5976.m10730(str6, '#', iM10730, 4);
                        return iM107302 == -1 ? str6.substring(iM10730) : str6.substring(iM10730, iM107302);
                    case 1:
                        String str7 = c8922.f22669;
                        int iM107303 = AbstractC5976.m10730(str7, '/', c8922.f22681.f22667.length() + 3, 4);
                        if (iM107303 == -1) {
                            return "";
                        }
                        int iM107304 = AbstractC5976.m10730(str7, '#', iM107303, 4);
                        return iM107304 == -1 ? str7.substring(iM107303) : str7.substring(iM107303, iM107304);
                    case 2:
                        String str8 = c8922.f22669;
                        String str9 = c8922.f22672;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8922.f22681.f22667.length() + 3;
                        return str8.substring(length, AbstractC5976.m10732(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8922.f22669;
                        String str11 = c8922.f22671;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5976.m10730(str10, ':', c8922.f22681.f22667.length() + 3, 4) + 1, AbstractC5976.m10730(str10, '@', 0, 6));
                    default:
                        String str12 = c8922.f22669;
                        int iM107305 = AbstractC5976.m10730(str12, '#', 0, 6) + 1;
                        return iM107305 == 0 ? "" : str12.substring(iM107305);
                }
            }
        });
        final int i6 = 4;
        this.f22675 = AbstractC6019.m10773(new InterfaceC7372(this) { // from class: 飘花落叶言楪兰世哲子苏.飘花落叶言子世哲楪兰苏

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C8922 f22662;

            {
                this.f22662 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                int i42 = i6;
                C8922 c8922 = this.f22662;
                switch (i42) {
                    case 0:
                        String str6 = c8922.f22669;
                        int iM10730 = AbstractC5976.m10730(str6, '?', 0, 6) + 1;
                        if (iM10730 == 0) {
                            return "";
                        }
                        int iM107302 = AbstractC5976.m10730(str6, '#', iM10730, 4);
                        return iM107302 == -1 ? str6.substring(iM10730) : str6.substring(iM10730, iM107302);
                    case 1:
                        String str7 = c8922.f22669;
                        int iM107303 = AbstractC5976.m10730(str7, '/', c8922.f22681.f22667.length() + 3, 4);
                        if (iM107303 == -1) {
                            return "";
                        }
                        int iM107304 = AbstractC5976.m10730(str7, '#', iM107303, 4);
                        return iM107304 == -1 ? str7.substring(iM107303) : str7.substring(iM107303, iM107304);
                    case 2:
                        String str8 = c8922.f22669;
                        String str9 = c8922.f22672;
                        if (str9 == null) {
                            return null;
                        }
                        if (str9.length() == 0) {
                            return "";
                        }
                        int length = c8922.f22681.f22667.length() + 3;
                        return str8.substring(length, AbstractC5976.m10732(str8, new char[]{':', '@'}, length, false));
                    case 3:
                        String str10 = c8922.f22669;
                        String str11 = c8922.f22671;
                        if (str11 == null) {
                            return null;
                        }
                        return str11.length() == 0 ? "" : str10.substring(AbstractC5976.m10730(str10, ':', c8922.f22681.f22667.length() + 3, 4) + 1, AbstractC5976.m10730(str10, '@', 0, 6));
                    default:
                        String str12 = c8922.f22669;
                        int iM107305 = AbstractC5976.m10730(str12, '#', 0, 6) + 1;
                        return iM107305 == 0 ? "" : str12.substring(iM107305);
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8922.class != obj.getClass()) {
            return false;
        }
        return this.f22669.equals(((C8922) obj).f22669);
    }

    public final int hashCode() {
        return this.f22669.hashCode();
    }

    public final String toString() {
        return this.f22669;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m14126() {
        int i = this.f22673;
        Integer numValueOf = Integer.valueOf(i);
        if (i == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.f22681.f22666;
    }
}
