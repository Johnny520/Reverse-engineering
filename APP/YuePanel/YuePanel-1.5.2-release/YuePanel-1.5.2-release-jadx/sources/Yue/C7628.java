package Yue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n79#1,22:1487\n113#1,5:1509\n130#1,5:1514\n79#1,22:1519\n107#1:1541\n79#1,22:1542\n113#1,5:1564\n124#1:1569\n113#1,5:1570\n130#1,5:1575\n141#1:1580\n130#1,5:1581\n79#1,22:1586\n113#1,5:1608\n130#1,5:1613\n12554#2,2:1618\n12554#2,2:1620\n288#3,2:1622\n288#3,2:1624\n1549#3:1627\n1620#3,3:1628\n1549#3:1631\n1620#3,3:1632\n1#4:1626\n*S KotlinDebug\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt\n*L\n107#1:1487,22\n124#1:1509,5\n141#1:1514,5\n146#1:1519,22\n151#1:1541\n151#1:1542,22\n156#1:1564,5\n161#1:1569\n161#1:1570,5\n166#1:1575,5\n171#1:1580\n171#1:1581,5\n176#1:1586,22\n187#1:1608,5\n198#1:1613,5\n940#1:1618,2\n964#1:1620,2\n1003#1:1622,2\n1009#1:1624,2\n1309#1:1627\n1309#1:1628,3\n1334#1:1631\n1334#1:1632,3\n*E\n"})
public class C7628 extends C7627 {

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ$ۥ */
    public static final class C1310 extends AbstractC3781 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f23025;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ CharSequence f23026;

        public C1310(CharSequence charSequence) {
            this.f23026 = charSequence;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f23025 < this.f23026.length();
        }

        @Override // Yue.AbstractC3781
        /* JADX INFO: renamed from: ۥ۟ */
        public char mo467() {
            CharSequence charSequence = this.f23026;
            int i = this.f23025;
            this.f23025 = i + 1;
            return charSequence.charAt(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ$ۥ۟ */
    @InterfaceC7507({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    public static final class C1311 extends AbstractC5673 implements InterfaceC5138<CharSequence, Integer, C6599<? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ char[] f23027;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ boolean f23028;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1311(char[] cArr, boolean z) {
            super(2);
            this.f23027 = cArr;
            this.f23028 = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ C6599<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m24192(charSequence, num.intValue());
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C6599<Integer, Integer> m24192(@InterfaceC6399 CharSequence charSequence, int i) {
            C5499.m17103(charSequence, "$this$$receiver");
            int iM24059 = C7628.m24059(charSequence, this.f23027, i, this.f23028);
            if (iM24059 < 0) {
                return null;
            }
            return C8003.m4014(Integer.valueOf(iM24059), 1);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.kt\nkotlin/text/StringsKt__StringsKt$rangesDelimitedBy$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1486:1\n1#2:1487\n*E\n"})
    public static final class C7629 extends AbstractC5673 implements InterfaceC5138<CharSequence, Integer, C6599<? extends Integer, ? extends Integer>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ List<String> f23029;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ boolean f23030;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7629(List<String> list, boolean z) {
            super(2);
            this.f23029 = list;
            this.f23030 = z;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ C6599<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return m24193(charSequence, num.intValue());
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C6599<Integer, Integer> m24193(@InterfaceC6399 CharSequence charSequence, int i) {
            C5499.m17103(charSequence, "$this$$receiver");
            C6599 c6599M24043 = C7628.m24043(charSequence, this.f23029, i, this.f23030, false);
            if (c6599M24043 != null) {
                return C8003.m4014(c6599M24043.m20938(), Integer.valueOf(((String) c6599M24043.m20939()).length()));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C7630 extends AbstractC5673 implements InterfaceC5124<C5458, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ CharSequence f23031;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7630(CharSequence charSequence) {
            super(1);
            this.f23031 = charSequence;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final String invoke(@InterfaceC6399 C5458 c5458) {
            C5499.m17103(c5458, "it");
            return C7628.m24153(this.f23031, c5458);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۢۥ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C7631 extends AbstractC5673 implements InterfaceC5124<C5458, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ CharSequence f23032;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7631(CharSequence charSequence) {
            super(1);
            this.f23032 = charSequence;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final String invoke(@InterfaceC6399 C5458 c5458) {
            C5499.m17103(c5458, "it");
            return C7628.m24153(this.f23032, c5458);
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۦ۠, reason: contains not printable characters */
    public static final String m24027(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "other");
        int iMin = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < iMin && C3792.m10483(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (m24049(charSequence, i2) || m24049(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۡ, reason: contains not printable characters */
    public static /* synthetic */ String m24028(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24027(charSequence, charSequence2, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۦۢ, reason: contains not printable characters */
    public static final String m24029(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "other");
        int length = charSequence.length();
        int iMin = Math.min(length, charSequence2.length());
        int i = 0;
        while (i < iMin && C3792.m10483(charSequence.charAt((length - i) - 1), charSequence2.charAt((r1 - i) - 1), z)) {
            i++;
        }
        if (m24049(charSequence, (length - i) - 1) || m24049(charSequence2, (r1 - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length - i, length).toString();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۣ, reason: contains not printable characters */
    public static /* synthetic */ String m24030(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24029(charSequence, charSequence2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۤ, reason: contains not printable characters */
    public static final boolean m24031(@InterfaceC6399 CharSequence charSequence, char c, boolean z) {
        C5499.m17103(charSequence, "<this>");
        return m24056(charSequence, c, 0, z, 2, null) >= 0;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟۠ۦۥ, reason: contains not printable characters */
    public static final boolean m24032(CharSequence charSequence, C7075 c7075) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c7075, "regex");
        return c7075.m3359(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۦ, reason: contains not printable characters */
    public static final boolean m24033(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m24057(charSequence, (String) charSequence2, 0, z, 2, null) < 0) {
                return false;
            }
        } else if (m24055(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) < 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۧ, reason: contains not printable characters */
    public static /* synthetic */ boolean m24034(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24031(charSequence, c, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۨ, reason: contains not printable characters */
    public static /* synthetic */ boolean m24035(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24033(charSequence, charSequence2, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public static final boolean m24036(@InterfaceC6489 CharSequence charSequence, @InterfaceC6489 CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C7627.m23974((String) charSequence, (String) charSequence2, true);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C3792.m10483(charSequence.charAt(i), charSequence2.charAt(i), true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ۟, reason: contains not printable characters */
    public static final boolean m24037(@InterfaceC6489 CharSequence charSequence, @InterfaceC6489 CharSequence charSequence2) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C5499.m17094(charSequence, charSequence2);
        }
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ۠, reason: contains not printable characters */
    public static final boolean m24038(@InterfaceC6399 CharSequence charSequence, char c, boolean z) {
        C5499.m17103(charSequence, "<this>");
        return charSequence.length() > 0 && C3792.m10483(charSequence.charAt(m24048(charSequence)), c, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۡ, reason: contains not printable characters */
    public static final boolean m24039(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "suffix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? C7627.m23973((String) charSequence, (String) charSequence2, false, 2, null) : m24092(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۢ, reason: contains not printable characters */
    public static /* synthetic */ boolean m24040(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24038(charSequence, c, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public static /* synthetic */ boolean m24041(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24039(charSequence, charSequence2, z);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۧۤ, reason: contains not printable characters */
    public static final C6599<Integer, String> m24042(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Collection<String> collection, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(collection, "strings");
        return m24043(charSequence, collection, i, z, false);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۥ, reason: contains not printable characters */
    public static final C6599<Integer, String> m24043(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object next;
        Object next2;
        if (!z && collection.size() == 1) {
            String str = (String) C3888.m11020(collection);
            int iM24057 = !z2 ? m24057(charSequence, str, i, false, 4, null) : m24071(charSequence, str, i, false, 4, null);
            if (iM24057 < 0) {
                return null;
            }
            return C8003.m4014(Integer.valueOf(iM24057), str);
        }
        C5456 c5458 = !z2 ? new C5458(C7007.m21661(i, 0), charSequence.length()) : C7007.m21703(C7007.m21668(i, m24048(charSequence)), 0);
        if (charSequence instanceof String) {
            int iM16964 = c5458.m16964();
            int iM16965 = c5458.m16965();
            int iM16966 = c5458.m16966();
            if ((iM16966 > 0 && iM16964 <= iM16965) || (iM16966 < 0 && iM16965 <= iM16964)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        if (C7627.m23991(str2, 0, (String) charSequence, iM16964, str2.length(), z)) {
                            break;
                        }
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (iM16964 == iM16965) {
                            break;
                        }
                        iM16964 += iM16966;
                    } else {
                        return C8003.m4014(Integer.valueOf(iM16964), str3);
                    }
                }
            }
        } else {
            int iM169642 = c5458.m16964();
            int iM169652 = c5458.m16965();
            int iM169662 = c5458.m16966();
            if ((iM169662 > 0 && iM169642 <= iM169652) || (iM169662 < 0 && iM169652 <= iM169642)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        if (m24092(str4, 0, charSequence, iM169642, str4.length(), z)) {
                            break;
                        }
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (iM169642 == iM169652) {
                            break;
                        }
                        iM169642 += iM169662;
                    } else {
                        return C8003.m4014(Integer.valueOf(iM169642), str5);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۦ, reason: contains not printable characters */
    public static /* synthetic */ C6599 m24044(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24042(charSequence, collection, i, z);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۠ۧۧ, reason: contains not printable characters */
    public static final C6599<Integer, String> m24045(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Collection<String> collection, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(collection, "strings");
        return m24043(charSequence, collection, i, z, true);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۨ, reason: contains not printable characters */
    public static /* synthetic */ C6599 m24046(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m24048(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24045(charSequence, collection, i, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۠ۨ, reason: contains not printable characters */
    public static final C5458 m24047(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return new C5458(0, charSequence.length() - 1);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ۟, reason: contains not printable characters */
    public static int m24048(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨ۠, reason: contains not printable characters */
    public static final boolean m24049(@InterfaceC6399 CharSequence charSequence, int i) {
        C5499.m17103(charSequence, "<this>");
        return new C5458(0, charSequence.length() + (-2)).m16971(i) && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: C extends java.lang.CharSequence & R */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۠ۨۡ, reason: contains not printable characters */
    public static final <C extends CharSequence & R, R> R m24050(C c, InterfaceC5122<? extends R> interfaceC5122) {
        C5499.m17103(interfaceC5122, "defaultValue");
        return C7627.m23982(c) ? interfaceC5122.invoke() : c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: C extends java.lang.CharSequence & R */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC5438
    @InterfaceC7470(version = "1.3")
    /* JADX INFO: renamed from: ۥ۟۠ۨۢ, reason: contains not printable characters */
    public static final <C extends CharSequence & R, R> R m24051(C c, InterfaceC5122<? extends R> interfaceC5122) {
        C5499.m17103(interfaceC5122, "defaultValue");
        return c.length() == 0 ? interfaceC5122.invoke() : c;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public static final int m24052(@InterfaceC6399 CharSequence charSequence, char c, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? m24059(charSequence, new char[]{c}, i, z) : ((String) charSequence).indexOf(c, i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۤ, reason: contains not printable characters */
    public static final int m24053(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 String str, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(str, "string");
        return (z || !(charSequence instanceof String)) ? m24055(charSequence, str, i, charSequence.length(), z, false, 16, null) : ((String) charSequence).indexOf(str, i);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۥ, reason: contains not printable characters */
    public static final int m24054(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C5456 c5458 = !z2 ? new C5458(C7007.m21661(i, 0), C7007.m21668(i2, charSequence.length())) : C7007.m21703(C7007.m21668(i, m24048(charSequence)), C7007.m21661(i2, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iM16964 = c5458.m16964();
            int iM16965 = c5458.m16965();
            int iM16966 = c5458.m16966();
            if ((iM16966 <= 0 || iM16964 > iM16965) && (iM16966 >= 0 || iM16965 > iM16964)) {
                return -1;
            }
            while (!C7627.m23991((String) charSequence2, 0, (String) charSequence, iM16964, charSequence2.length(), z)) {
                if (iM16964 == iM16965) {
                    return -1;
                }
                iM16964 += iM16966;
            }
            return iM16964;
        }
        int iM169642 = c5458.m16964();
        int iM169652 = c5458.m16965();
        int iM169662 = c5458.m16966();
        if ((iM169662 <= 0 || iM169642 > iM169652) && (iM169662 >= 0 || iM169652 > iM169642)) {
            return -1;
        }
        while (!m24092(charSequence2, 0, charSequence, iM169642, charSequence2.length(), z)) {
            if (iM169642 == iM169652) {
                return -1;
            }
            iM169642 += iM169662;
        }
        return iM169642;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۦ, reason: contains not printable characters */
    public static /* synthetic */ int m24055(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            z2 = false;
        }
        return m24054(charSequence, charSequence2, i, i2, z, z2);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۧ, reason: contains not printable characters */
    public static /* synthetic */ int m24056(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24052(charSequence, c, i, z);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۨۨ, reason: contains not printable characters */
    public static /* synthetic */ int m24057(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24053(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final int m24058(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Collection<String> collection, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(collection, "strings");
        C6599<Integer, String> c6599M24043 = m24043(charSequence, collection, i, z, false);
        if (c6599M24043 != null) {
            return c6599M24043.m20938().intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟, reason: contains not printable characters */
    public static final int m24059(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 char[] cArr, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(C3411.m8628(cArr), i);
        }
        AbstractC5455 abstractC5455M16967 = new C5458(C7007.m21661(i, 0), m24048(charSequence)).iterator();
        while (abstractC5455M16967.hasNext()) {
            int iMo471 = abstractC5455M16967.mo471();
            char cCharAt = charSequence.charAt(iMo471);
            for (char c : cArr) {
                if (C3792.m10483(c, cCharAt, z)) {
                    return iMo471;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟۟, reason: contains not printable characters */
    public static /* synthetic */ int m24060(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24058(charSequence, collection, i, z);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟۠, reason: contains not printable characters */
    public static /* synthetic */ int m24061(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24059(charSequence, cArr, i, z);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۡ, reason: contains not printable characters */
    public static final boolean m24062(CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return charSequence.length() == 0;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۢ, reason: contains not printable characters */
    public static final boolean m24063(CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return !C7627.m23982(charSequence);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static final boolean m24064(CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return charSequence.length() > 0;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۤ, reason: contains not printable characters */
    public static final boolean m24065(CharSequence charSequence) {
        return charSequence == null || C7627.m23982(charSequence);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۥ, reason: contains not printable characters */
    public static final boolean m24066(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۟ۦ, reason: contains not printable characters */
    public static final AbstractC3781 m24067(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return new C1310(charSequence);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۧ, reason: contains not printable characters */
    public static final int m24068(@InterfaceC6399 CharSequence charSequence, char c, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        return (z || !(charSequence instanceof String)) ? m24073(charSequence, new char[]{c}, i, z) : ((String) charSequence).lastIndexOf(c, i);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۟ۨ, reason: contains not printable characters */
    public static final int m24069(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 String str, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(str, "string");
        return (z || !(charSequence instanceof String)) ? m24054(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ int m24070(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m24048(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24068(charSequence, c, i, z);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠۟, reason: contains not printable characters */
    public static /* synthetic */ int m24071(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m24048(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24069(charSequence, str, i, z);
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠۠, reason: contains not printable characters */
    public static final int m24072(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 Collection<String> collection, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(collection, "strings");
        C6599<Integer, String> c6599M24043 = m24043(charSequence, collection, i, z, true);
        if (c6599M24043 != null) {
            return c6599M24043.m20938().intValue();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۡ, reason: contains not printable characters */
    public static final int m24073(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 char[] cArr, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(C3411.m8628(cArr), i);
        }
        for (int iM21668 = C7007.m21668(i, m24048(charSequence)); -1 < iM21668; iM21668--) {
            char cCharAt = charSequence.charAt(iM21668);
            for (char c : cArr) {
                if (C3792.m10483(c, cCharAt, z)) {
                    return iM21668;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟ۡ۠ۢ, reason: contains not printable characters */
    public static /* synthetic */ int m24074(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m24048(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24072(charSequence, collection, i, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static /* synthetic */ int m24075(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m24048(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24073(charSequence, cArr, i, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۤ, reason: contains not printable characters */
    public static final InterfaceC7326<String> m24076(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return m24143(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۥ, reason: contains not printable characters */
    public static final List<String> m24077(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        return C7342.m23081(m24076(charSequence));
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۦ, reason: contains not printable characters */
    public static final boolean m24078(CharSequence charSequence, C7075 c7075) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c7075, "regex");
        return c7075.m22055(charSequence);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۧ, reason: contains not printable characters */
    public static final String m24079(String str) {
        return str == null ? "" : str;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡ۠ۨ, reason: contains not printable characters */
    public static final CharSequence m24080(@InterfaceC6399 CharSequence charSequence, int i, char c) {
        C5499.m17103(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(charSequence);
        AbstractC5455 abstractC5455M16967 = new C5458(1, i - charSequence.length()).iterator();
        while (abstractC5455M16967.hasNext()) {
            abstractC5455M16967.mo471();
            sb.append(c);
        }
        return sb;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۡ, reason: contains not printable characters */
    public static final String m24081(@InterfaceC6399 String str, int i, char c) {
        C5499.m17103(str, "<this>");
        return m24080(str, i, c).toString();
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡ۟, reason: contains not printable characters */
    public static /* synthetic */ CharSequence m24082(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m24080(charSequence, i, c);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡ۠, reason: contains not printable characters */
    public static /* synthetic */ String m24083(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m24081(str, i, c);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۡۡ, reason: contains not printable characters */
    public static final CharSequence m24084(@InterfaceC6399 CharSequence charSequence, int i, char c) {
        C5499.m17103(charSequence, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException("Desired length " + i + " is less than zero.");
        }
        if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i);
        AbstractC5455 abstractC5455M16967 = new C5458(1, i - charSequence.length()).iterator();
        while (abstractC5455M16967.hasNext()) {
            abstractC5455M16967.mo471();
            sb.append(c);
        }
        sb.append(charSequence);
        return sb;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۡۢ, reason: contains not printable characters */
    public static String m24085(@InterfaceC6399 String str, int i, char c) {
        C5499.m17103(str, "<this>");
        return m24084(str, i, c).toString();
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static /* synthetic */ CharSequence m24086(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m24084(charSequence, i, c);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۤ, reason: contains not printable characters */
    public static /* synthetic */ String m24087(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m24085(str, i, c);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۥ, reason: contains not printable characters */
    public static final InterfaceC7326<C5458> m24088(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m24130(i2);
        return new C4368(charSequence, i, i2, new C1311(cArr, z));
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۦ, reason: contains not printable characters */
    public static final InterfaceC7326<C5458> m24089(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m24130(i2);
        return new C4368(charSequence, i, i2, new C7629(C3404.m7069(strArr), z));
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۧ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m24090(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m24088(charSequence, cArr, i, z, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۡۨ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m24091(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m24089(charSequence, strArr, i, z, i2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۢ, reason: contains not printable characters */
    public static final boolean m24092(@InterfaceC6399 CharSequence charSequence, int i, @InterfaceC6399 CharSequence charSequence2, int i2, int i3, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C3792.m10483(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۢ۟, reason: contains not printable characters */
    public static final CharSequence m24093(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "prefix");
        return m24149(charSequence, charSequence2, false, 2, null) ? charSequence.subSequence(charSequence2.length(), charSequence.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۢ۠, reason: contains not printable characters */
    public static String m24094(@InterfaceC6399 String str, @InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(str, "<this>");
        C5499.m17103(charSequence, "prefix");
        if (!m24149(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length());
        C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۢۡ, reason: contains not printable characters */
    public static final CharSequence m24095(@InterfaceC6399 CharSequence charSequence, int i, int i2) {
        C5499.m17103(charSequence, "<this>");
        if (i2 < i) {
            throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
        }
        if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(charSequence.length() - (i2 - i));
        sb.append(charSequence, 0, i);
        C5499.m17102(sb, "this.append(value, startIndex, endIndex)");
        sb.append(charSequence, i2, charSequence.length());
        C5499.m17102(sb, "this.append(value, startIndex, endIndex)");
        return sb;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۢۢ, reason: contains not printable characters */
    public static final CharSequence m24096(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C5458 c5458) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c5458, "range");
        return m24095(charSequence, c5458.mo830().intValue(), c5458.mo10384().intValue() + 1);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static final String m24097(String str, int i, int i2) {
        C5499.m17103(str, "<this>");
        return m24095(str, i, i2).toString();
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۢۤ, reason: contains not printable characters */
    public static final String m24098(String str, C5458 c5458) {
        C5499.m17103(str, "<this>");
        C5499.m17103(c5458, "range");
        return m24096(str, c5458).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۢۥ, reason: contains not printable characters */
    public static final CharSequence m24099(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "suffix");
        return m24041(charSequence, charSequence2, false, 2, null) ? charSequence.subSequence(0, charSequence.length() - charSequence2.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۢۦ, reason: contains not printable characters */
    public static String m24100(@InterfaceC6399 String str, @InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(str, "<this>");
        C5499.m17103(charSequence, "suffix");
        if (!m24041(str, charSequence, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - charSequence.length());
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۢۧ, reason: contains not printable characters */
    public static final CharSequence m24101(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "delimiter");
        return m24102(charSequence, charSequence2, charSequence2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۢۨ, reason: contains not printable characters */
    public static final CharSequence m24102(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, @InterfaceC6399 CharSequence charSequence3) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "prefix");
        C5499.m17103(charSequence3, "suffix");
        return (charSequence.length() >= charSequence2.length() + charSequence3.length() && m24149(charSequence, charSequence2, false, 2, null) && m24041(charSequence, charSequence3, false, 2, null)) ? charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length()) : charSequence.subSequence(0, charSequence.length());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡ, reason: contains not printable characters */
    public static String m24103(@InterfaceC6399 String str, @InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(str, "<this>");
        C5499.m17103(charSequence, "delimiter");
        return m24104(str, charSequence, charSequence);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡ۟, reason: contains not printable characters */
    public static final String m24104(@InterfaceC6399 String str, @InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2) {
        C5499.m17103(str, "<this>");
        C5499.m17103(charSequence, "prefix");
        C5499.m17103(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !m24149(str, charSequence, false, 2, null) || !m24041(str, charSequence2, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡ۠, reason: contains not printable characters */
    public static final String m24105(CharSequence charSequence, C7075 c7075, InterfaceC5124<? super InterfaceC5957, ? extends CharSequence> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c7075, "regex");
        C5499.m17103(interfaceC5124, "transform");
        return c7075.m22057(charSequence, interfaceC5124);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۡ, reason: contains not printable characters */
    public static final String m24106(CharSequence charSequence, C7075 c7075, String str) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c7075, "regex");
        C5499.m17103(str, "replacement");
        return c7075.m22058(charSequence, str);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۢ, reason: contains not printable characters */
    public static final String m24107(@InterfaceC6399 String str, char c, @InterfaceC6399 String str2, @InterfaceC6399 String str3) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "replacement");
        C5499.m17103(str3, "missingDelimiterValue");
        int iM24056 = m24056(str, c, 0, false, 6, null);
        return iM24056 == -1 ? str3 : m24126(str, iM24056 + 1, str.length(), str2).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣۣ۟ۡ, reason: contains not printable characters */
    public static final String m24108(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3, @InterfaceC6399 String str4) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "delimiter");
        C5499.m17103(str3, "replacement");
        C5499.m17103(str4, "missingDelimiterValue");
        int iM24057 = m24057(str, str2, 0, false, 6, null);
        return iM24057 == -1 ? str4 : m24126(str, iM24057 + str2.length(), str.length(), str3).toString();
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ String m24109(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m24107(str, c, str2, str3);
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ String m24110(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m24108(str, str2, str3, str4);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۦ, reason: contains not printable characters */
    public static final String m24111(@InterfaceC6399 String str, char c, @InterfaceC6399 String str2, @InterfaceC6399 String str3) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "replacement");
        C5499.m17103(str3, "missingDelimiterValue");
        int iM24070 = m24070(str, c, 0, false, 6, null);
        return iM24070 == -1 ? str3 : m24126(str, iM24070 + 1, str.length(), str2).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۧ, reason: contains not printable characters */
    public static final String m24112(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3, @InterfaceC6399 String str4) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "delimiter");
        C5499.m17103(str3, "replacement");
        C5499.m17103(str4, "missingDelimiterValue");
        int iM24071 = m24071(str, str2, 0, false, 6, null);
        return iM24071 == -1 ? str4 : m24126(str, iM24071 + str2.length(), str.length(), str3).toString();
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ String m24113(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m24111(str, c, str2, str3);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ String m24114(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m24112(str, str2, str3, str4);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤ۟, reason: contains not printable characters */
    public static final String m24115(@InterfaceC6399 String str, char c, @InterfaceC6399 String str2, @InterfaceC6399 String str3) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "replacement");
        C5499.m17103(str3, "missingDelimiterValue");
        int iM24056 = m24056(str, c, 0, false, 6, null);
        return iM24056 == -1 ? str3 : m24126(str, 0, iM24056, str2).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤ۠, reason: contains not printable characters */
    public static final String m24116(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3, @InterfaceC6399 String str4) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "delimiter");
        C5499.m17103(str3, "replacement");
        C5499.m17103(str4, "missingDelimiterValue");
        int iM24057 = m24057(str, str2, 0, false, 6, null);
        return iM24057 == -1 ? str4 : m24126(str, 0, iM24057, str3).toString();
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤۡ, reason: contains not printable characters */
    public static /* synthetic */ String m24117(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m24115(str, c, str2, str3);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤۢ, reason: contains not printable characters */
    public static /* synthetic */ String m24118(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m24116(str, str2, str3, str4);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۡۤ, reason: contains not printable characters */
    public static final String m24119(@InterfaceC6399 String str, char c, @InterfaceC6399 String str2, @InterfaceC6399 String str3) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "replacement");
        C5499.m17103(str3, "missingDelimiterValue");
        int iM24070 = m24070(str, c, 0, false, 6, null);
        return iM24070 == -1 ? str3 : m24126(str, 0, iM24070, str2).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۤۤ, reason: contains not printable characters */
    public static final String m24120(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3, @InterfaceC6399 String str4) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "delimiter");
        C5499.m17103(str3, "replacement");
        C5499.m17103(str4, "missingDelimiterValue");
        int iM24071 = m24071(str, str2, 0, false, 6, null);
        return iM24071 == -1 ? str4 : m24126(str, 0, iM24071, str3).toString();
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤۥ, reason: contains not printable characters */
    public static /* synthetic */ String m24121(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m24119(str, c, str2, str3);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۤۦ, reason: contains not printable characters */
    public static /* synthetic */ String m24122(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m24120(str, str2, str3, str4);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۤۧ, reason: contains not printable characters */
    public static final String m24123(CharSequence charSequence, C7075 c7075, String str) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c7075, "regex");
        C5499.m17103(str, "replacement");
        return c7075.m22059(charSequence, str);
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "replaceFirstCharWithChar")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    /* JADX INFO: renamed from: ۥ۟ۡۤۨ, reason: contains not printable characters */
    public static final String m24124(String str, InterfaceC5124<? super Character, Character> interfaceC5124) {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        if (str.length() <= 0) {
            return str;
        }
        char cCharValue = interfaceC5124.invoke(Character.valueOf(str.charAt(0))).charValue();
        String strSubstring = str.substring(1);
        C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
        return cCharValue + strSubstring;
    }

    @InterfaceC6587
    @InterfaceC7470(version = "1.5")
    @InterfaceC5572(name = "replaceFirstCharWithCharSequence")
    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    /* JADX INFO: renamed from: ۥ۟ۡۥ, reason: contains not printable characters */
    public static final String m24125(String str, InterfaceC5124<? super Character, ? extends CharSequence> interfaceC5124) {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "transform");
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) interfaceC5124.invoke(Character.valueOf(str.charAt(0))));
        String strSubstring = str.substring(1);
        C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥ۟, reason: contains not printable characters */
    public static final CharSequence m24126(@InterfaceC6399 CharSequence charSequence, int i, int i2, @InterfaceC6399 CharSequence charSequence2) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            C5499.m17102(sb, "this.append(value, startIndex, endIndex)");
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            C5499.m17102(sb, "this.append(value, startIndex, endIndex)");
            return sb;
        }
        throw new IndexOutOfBoundsException("End index (" + i2 + ") is less than start index (" + i + ").");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥ۠, reason: contains not printable characters */
    public static final CharSequence m24127(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C5458 c5458, @InterfaceC6399 CharSequence charSequence2) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c5458, "range");
        C5499.m17103(charSequence2, "replacement");
        return m24126(charSequence, c5458.mo830().intValue(), c5458.mo10384().intValue() + 1, charSequence2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۥۡ, reason: contains not printable characters */
    public static final String m24128(String str, int i, int i2, CharSequence charSequence) {
        C5499.m17103(str, "<this>");
        C5499.m17103(charSequence, "replacement");
        return m24126(str, i, i2, charSequence).toString();
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۥۢ, reason: contains not printable characters */
    public static final String m24129(String str, C5458 c5458, CharSequence charSequence) {
        C5499.m17103(str, "<this>");
        C5499.m17103(c5458, "range");
        C5499.m17103(charSequence, "replacement");
        return m24127(str, c5458, charSequence).toString();
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥۣ, reason: contains not printable characters */
    public static final void m24130(int i) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۡۥۤ, reason: contains not printable characters */
    public static final List<String> m24131(CharSequence charSequence, C7075 c7075, int i) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c7075, "regex");
        return c7075.m22060(charSequence, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥۥ, reason: contains not printable characters */
    public static final List<String> m24132(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 char[] cArr, boolean z, int i) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(cArr, "delimiters");
        if (cArr.length == 1) {
            return m24134(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable iterableM22910 = C7342.m22910(m24090(charSequence, cArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(C3881.m10756(iterableM22910, 10));
        Iterator it = iterableM22910.iterator();
        while (it.hasNext()) {
            arrayList.add(m24153(charSequence, (C5458) it.next()));
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۥۦ, reason: contains not printable characters */
    public static final List<String> m24133(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 String[] strArr, boolean z, int i) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(strArr, "delimiters");
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                return m24134(charSequence, str, z, i);
            }
        }
        Iterable iterableM22910 = C7342.m22910(m24091(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(C3881.m10756(iterableM22910, 10));
        Iterator it = iterableM22910.iterator();
        while (it.hasNext()) {
            arrayList.add(m24153(charSequence, (C5458) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥۧ, reason: contains not printable characters */
    public static final List<String> m24134(CharSequence charSequence, String str, boolean z, int i) {
        m24130(i);
        int length = 0;
        int iM24053 = m24053(charSequence, str, 0, z);
        if (iM24053 == -1 || i == 1) {
            return C3879.m10715(charSequence.toString());
        }
        boolean z2 = i > 0;
        ArrayList arrayList = new ArrayList(z2 ? C7007.m21668(i, 10) : 10);
        do {
            arrayList.add(charSequence.subSequence(length, iM24053).toString());
            length = str.length() + iM24053;
            if (z2 && arrayList.size() == i - 1) {
                break;
            }
            iM24053 = m24053(charSequence, str, length, z);
        } while (iM24053 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۥۨ, reason: contains not printable characters */
    public static /* synthetic */ List m24135(CharSequence charSequence, C7075 c7075, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c7075, "regex");
        return c7075.m22060(charSequence, i);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ List m24136(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m24132(charSequence, cArr, z, i);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦ۟, reason: contains not printable characters */
    public static /* synthetic */ List m24137(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m24133(charSequence, strArr, z, i);
    }

    @InterfaceC5438
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.6")
    /* JADX INFO: renamed from: ۥ۟ۡۦ۠, reason: contains not printable characters */
    public static final InterfaceC7326<String> m24138(CharSequence charSequence, C7075 c7075, int i) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c7075, "regex");
        return c7075.m22061(charSequence, i);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۦۡ, reason: contains not printable characters */
    public static final InterfaceC7326<String> m24139(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 char[] cArr, boolean z, int i) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(cArr, "delimiters");
        return C7342.m22985(m24090(charSequence, cArr, 0, z, i, 2, null), new C7631(charSequence));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۦۢ, reason: contains not printable characters */
    public static final InterfaceC7326<String> m24140(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 String[] strArr, boolean z, int i) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(strArr, "delimiters");
        return C7342.m22985(m24091(charSequence, strArr, 0, z, i, 2, null), new C7630(charSequence));
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۣ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m24141(CharSequence charSequence, C7075 c7075, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c7075, "regex");
        return c7075.m22061(charSequence, i);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۤ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m24142(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m24139(charSequence, cArr, z, i);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۥ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC7326 m24143(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m24140(charSequence, strArr, z, i);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۦ, reason: contains not printable characters */
    public static final boolean m24144(@InterfaceC6399 CharSequence charSequence, char c, boolean z) {
        C5499.m17103(charSequence, "<this>");
        return charSequence.length() > 0 && C3792.m10483(charSequence.charAt(0), c, z);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۧ, reason: contains not printable characters */
    public static final boolean m24145(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, int i, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? C7627.m24007((String) charSequence, (String) charSequence2, i, false, 4, null) : m24092(charSequence, i, charSequence2, 0, charSequence2.length(), z);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۦۨ, reason: contains not printable characters */
    public static final boolean m24146(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 CharSequence charSequence2, boolean z) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(charSequence2, "prefix");
        return (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) ? C7627.m24008((String) charSequence, (String) charSequence2, false, 2, null) : m24092(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ, reason: contains not printable characters */
    public static /* synthetic */ boolean m24147(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24144(charSequence, c, z);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ۟, reason: contains not printable characters */
    public static /* synthetic */ boolean m24148(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m24145(charSequence, charSequence2, i, z);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧ۠, reason: contains not printable characters */
    public static /* synthetic */ boolean m24149(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m24146(charSequence, charSequence2, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۧۡ, reason: contains not printable characters */
    public static final CharSequence m24150(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C5458 c5458) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c5458, "range");
        return charSequence.subSequence(c5458.mo830().intValue(), c5458.mo10384().intValue() + 1);
    }

    @InterfaceC5438
    @InterfaceC4372(message = "Use parameters named startIndex and endIndex.", replaceWith = @InterfaceC7097(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    /* JADX INFO: renamed from: ۥ۟ۡۧۢ, reason: contains not printable characters */
    public static final CharSequence m24151(String str, int i, int i2) {
        C5499.m17103(str, "<this>");
        return str.subSequence(i, i2);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥۣ۟ۡۧ, reason: contains not printable characters */
    public static final String m24152(CharSequence charSequence, int i, int i2) {
        C5499.m17103(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۧۤ, reason: contains not printable characters */
    public static final String m24153(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 C5458 c5458) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(c5458, "range");
        return charSequence.subSequence(c5458.mo830().intValue(), c5458.mo10384().intValue() + 1).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۧۥ, reason: contains not printable characters */
    public static final String m24154(@InterfaceC6399 String str, @InterfaceC6399 C5458 c5458) {
        C5499.m17103(str, "<this>");
        C5499.m17103(c5458, "range");
        String strSubstring = str.substring(c5458.mo830().intValue(), c5458.mo10384().intValue() + 1);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۧۦ, reason: contains not printable characters */
    public static /* synthetic */ String m24155(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        C5499.m17103(charSequence, "<this>");
        return charSequence.subSequence(i, i2).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۧۧ, reason: contains not printable characters */
    public static final String m24156(@InterfaceC6399 String str, char c, @InterfaceC6399 String str2) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "missingDelimiterValue");
        int iM24056 = m24056(str, c, 0, false, 6, null);
        if (iM24056 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM24056 + 1, str.length());
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۧۨ, reason: contains not printable characters */
    public static final String m24157(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "delimiter");
        C5499.m17103(str3, "missingDelimiterValue");
        int iM24057 = m24057(str, str2, 0, false, 6, null);
        if (iM24057 == -1) {
            return str3;
        }
        String strSubstring = str.substring(iM24057 + str2.length(), str.length());
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ String m24158(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m24156(str, c, str2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨ۟, reason: contains not printable characters */
    public static /* synthetic */ String m24159(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m24157(str, str2, str3);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۨ۠, reason: contains not printable characters */
    public static String m24160(@InterfaceC6399 String str, char c, @InterfaceC6399 String str2) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "missingDelimiterValue");
        int iM24070 = m24070(str, c, 0, false, 6, null);
        if (iM24070 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iM24070 + 1, str.length());
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۨۡ, reason: contains not printable characters */
    public static final String m24161(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "delimiter");
        C5499.m17103(str3, "missingDelimiterValue");
        int iM24071 = m24071(str, str2, 0, false, 6, null);
        if (iM24071 == -1) {
            return str3;
        }
        String strSubstring = str.substring(iM24071 + str2.length(), str.length());
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨۢ, reason: contains not printable characters */
    public static /* synthetic */ String m24162(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m24160(str, c, str2);
    }

    /* JADX INFO: renamed from: ۥۣ۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ String m24163(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m24161(str, str2, str3);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۨۤ, reason: contains not printable characters */
    public static final String m24164(@InterfaceC6399 String str, char c, @InterfaceC6399 String str2) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "missingDelimiterValue");
        int iM24056 = m24056(str, c, 0, false, 6, null);
        if (iM24056 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iM24056);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۨۥ, reason: contains not printable characters */
    public static final String m24165(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "delimiter");
        C5499.m17103(str3, "missingDelimiterValue");
        int iM24057 = m24057(str, str2, 0, false, 6, null);
        if (iM24057 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iM24057);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨۦ, reason: contains not printable characters */
    public static /* synthetic */ String m24166(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m24164(str, c, str2);
    }

    /* JADX INFO: renamed from: ۥ۟ۡۨۧ, reason: contains not printable characters */
    public static /* synthetic */ String m24167(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m24165(str, str2, str3);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۡۨۨ, reason: contains not printable characters */
    public static final String m24168(@InterfaceC6399 String str, char c, @InterfaceC6399 String str2) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "missingDelimiterValue");
        int iM24070 = m24070(str, c, 0, false, 6, null);
        if (iM24070 == -1) {
            return str2;
        }
        String strSubstring = str.substring(0, iM24070);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static final String m24169(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "delimiter");
        C5499.m17103(str3, "missingDelimiterValue");
        int iM24071 = m24071(str, str2, 0, false, 6, null);
        if (iM24071 == -1) {
            return str3;
        }
        String strSubstring = str.substring(0, iM24071);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* JADX INFO: renamed from: ۥ۟ۢ۟, reason: contains not printable characters */
    public static /* synthetic */ String m24170(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m24168(str, c, str2);
    }

    /* JADX INFO: renamed from: ۥ۟ۢ۟۟, reason: contains not printable characters */
    public static /* synthetic */ String m24171(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m24169(str, str2, str3);
    }

    @InterfaceC7470(version = "1.5")
    /* JADX INFO: renamed from: ۥ۟ۢ۟۠, reason: contains not printable characters */
    public static final boolean m24172(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        if (C5499.m17094(str, "true")) {
            return true;
        }
        if (C5499.m17094(str, "false")) {
            return false;
        }
        throw new IllegalArgumentException("The string doesn't represent a boolean value: " + str);
    }

    @InterfaceC7470(version = "1.5")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۡ, reason: contains not printable characters */
    public static final Boolean m24173(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        if (C5499.m17094(str, "true")) {
            return Boolean.TRUE;
        }
        if (C5499.m17094(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۢ, reason: contains not printable characters */
    public static CharSequence m24174(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM10465 = C3791.m10465(charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM10465) {
                    break;
                }
                length--;
            } else if (zM10465) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢ۟, reason: contains not printable characters */
    public static final CharSequence m24175(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zBooleanValue = interfaceC5124.invoke(Character.valueOf(charSequence.charAt(!z ? i : length))).booleanValue();
            if (z) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۤ, reason: contains not printable characters */
    public static final CharSequence m24176(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 char... cArr) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(cArr, "chars");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM7555 = C3411.m7555(cArr, charSequence.charAt(!z ? i : length));
            if (z) {
                if (!zM7555) {
                    break;
                }
                length--;
            } else if (zM7555) {
                i++;
            } else {
                z = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۥ, reason: contains not printable characters */
    public static final String m24177(String str) {
        C5499.m17103(str, "<this>");
        return m24174(str).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۦ, reason: contains not printable characters */
    public static final String m24178(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zBooleanValue = interfaceC5124.invoke(Character.valueOf(str.charAt(!z ? i : length))).booleanValue();
            if (z) {
                if (!zBooleanValue) {
                    break;
                }
                length--;
            } else if (zBooleanValue) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۧ, reason: contains not printable characters */
    public static final String m24179(@InterfaceC6399 String str, @InterfaceC6399 char... cArr) {
        C5499.m17103(str, "<this>");
        C5499.m17103(cArr, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean zM7555 = C3411.m7555(cArr, str.charAt(!z ? i : length));
            if (z) {
                if (!zM7555) {
                    break;
                }
                length--;
            } else if (zM7555) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۟ۨ, reason: contains not printable characters */
    public static final CharSequence m24180(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C3791.m10465(charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠, reason: contains not printable characters */
    public static final CharSequence m24181(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length() - 1;
        if (length < 0) {
            return "";
        }
        while (true) {
            int i = length - 1;
            if (!interfaceC5124.invoke(Character.valueOf(charSequence.charAt(length))).booleanValue()) {
                return charSequence.subSequence(0, length + 1);
            }
            if (i < 0) {
                return "";
            }
            length = i;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠۟, reason: contains not printable characters */
    public static final CharSequence m24182(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 char... cArr) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(cArr, "chars");
        int length = charSequence.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C3411.m7555(cArr, charSequence.charAt(length))) {
                    return charSequence.subSequence(0, length + 1);
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
        }
        return "";
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢ۠۠, reason: contains not printable characters */
    public static final String m24183(String str) {
        C5499.m17103(str, "<this>");
        return m24180(str).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۡ, reason: contains not printable characters */
    public static final String m24184(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        CharSequence charSequenceSubSequence;
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!interfaceC5124.invoke(Character.valueOf(str.charAt(length))).booleanValue()) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۢ, reason: contains not printable characters */
    public static final String m24185(@InterfaceC6399 String str, @InterfaceC6399 char... cArr) {
        CharSequence charSequenceSubSequence;
        C5499.m17103(str, "<this>");
        C5499.m17103(cArr, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (!C3411.m7555(cArr, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟ۢ۠, reason: contains not printable characters */
    public static final CharSequence m24186(@InterfaceC6399 CharSequence charSequence) {
        C5499.m17103(charSequence, "<this>");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C3791.m10465(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۤ, reason: contains not printable characters */
    public static final CharSequence m24187(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!interfaceC5124.invoke(Character.valueOf(charSequence.charAt(i))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۥ, reason: contains not printable characters */
    public static final CharSequence m24188(@InterfaceC6399 CharSequence charSequence, @InterfaceC6399 char... cArr) {
        C5499.m17103(charSequence, "<this>");
        C5499.m17103(cArr, "chars");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C3411.m7555(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @InterfaceC5438
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۦ, reason: contains not printable characters */
    public static final String m24189(String str) {
        C5499.m17103(str, "<this>");
        return m24186(str).toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۧ, reason: contains not printable characters */
    public static final String m24190(@InterfaceC6399 String str, @InterfaceC6399 InterfaceC5124<? super Character, Boolean> interfaceC5124) {
        CharSequence charSequenceSubSequence;
        C5499.m17103(str, "<this>");
        C5499.m17103(interfaceC5124, "predicate");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!interfaceC5124.invoke(Character.valueOf(str.charAt(i))).booleanValue()) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ۢ۠ۨ, reason: contains not printable characters */
    public static final String m24191(@InterfaceC6399 String str, @InterfaceC6399 char... cArr) {
        CharSequence charSequenceSubSequence;
        C5499.m17103(str, "<this>");
        C5499.m17103(cArr, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!C3411.m7555(cArr, str.charAt(i))) {
                charSequenceSubSequence = str.subSequence(i, str.length());
                break;
            }
            i++;
        }
        return charSequenceSubSequence.toString();
    }
}
