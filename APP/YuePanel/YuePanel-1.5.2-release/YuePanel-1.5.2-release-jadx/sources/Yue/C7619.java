package Yue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nIndent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,123:1\n113#1,2:125\n115#1,4:140\n120#1,2:153\n113#1,2:162\n115#1,4:177\n120#1,2:184\n1#2:124\n1#2:150\n1#2:181\n1#2:205\n1569#3,11:127\n1864#3,2:138\n1866#3:151\n1580#3:152\n766#3:155\n857#3,2:156\n1549#3:158\n1620#3,3:159\n1569#3,11:164\n1864#3,2:175\n1866#3:182\n1580#3:183\n1569#3,11:192\n1864#3,2:203\n1866#3:206\n1580#3:207\n151#4,6:144\n151#4,6:186\n*S KotlinDebug\n*F\n+ 1 Indent.kt\nkotlin/text/StringsKt__IndentKt\n*L\n38#1:125,2\n38#1:140,4\n38#1:153,2\n78#1:162,2\n78#1:177,4\n78#1:184,2\n38#1:150\n78#1:181\n114#1:205\n38#1:127,11\n38#1:138,2\n38#1:151\n38#1:152\n74#1:155\n74#1:156,2\n75#1:158\n75#1:159,3\n78#1:164,11\n78#1:175,2\n78#1:182\n78#1:183\n114#1:192,11\n114#1:203,2\n114#1:206\n114#1:207\n39#1:144,6\n101#1:186,6\n*E\n"})
public class C7619 extends C7618 {

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۡۨ$ۥ */
    public static final class C1308 extends AbstractC5673 implements InterfaceC5124<String, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1308 f23022 = new C1308();

        public C1308() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final String invoke(@InterfaceC6399 String str) {
            C5499.m17103(str, "line");
            return str;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۡۨ$ۥ۟ */
    public static final class C1309 extends AbstractC5673 implements InterfaceC5124<String, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ String f23023;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1309(String str) {
            super(1);
            this.f23023 = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final String invoke(@InterfaceC6399 String str) {
            C5499.m17103(str, "line");
            return this.f23023 + str;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۡۨ$ۥ۟۟, reason: contains not printable characters */
    public static final class C7620 extends AbstractC5673 implements InterfaceC5124<String, String> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ String f23024;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7620(String str) {
            super(1);
            this.f23024 = str;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final String invoke(@InterfaceC6399 String str) {
            C5499.m17103(str, "it");
            if (C7627.m23982(str)) {
                return str.length() < this.f23024.length() ? this.f23024 : str;
            }
            return this.f23024 + str;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final InterfaceC5124<String, String> m23837(String str) {
        return str.length() == 0 ? C1308.f23022 : new C1309(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m23838(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (!C3791.m10465(str.charAt(i))) {
                break;
            }
            i++;
        }
        return i == -1 ? str.length() : i;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥۡۨۢۦ.ۥ۟۟ۨۤ(Yue.ۥۡۨۢ, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, java.lang.CharSequence, Yue.ۥۣ۠ۡ۟, int, java.lang.Object):java.lang.String */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final String m23839(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "indent");
        return C7342.m22979(C7342.m22985(C7628.m24076(str), new C7620(str2)), "\n", null, null, 0, null, null, 62, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ String m23840(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "    ";
        }
        return m23839(str, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final String m23841(List<String> list, int i, InterfaceC5124<? super String, String> interfaceC5124, InterfaceC5124<? super String, String> interfaceC51242) {
        String strInvoke;
        int iM10737 = C3880.m10737(list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C3880.m10753();
            }
            String str = (String) obj;
            if ((i2 == 0 || i2 == iM10737) && C7627.m23982(str)) {
                str = null;
            } else {
                String strInvoke2 = interfaceC51242.invoke(str);
                if (strInvoke2 != null && (strInvoke = interfaceC5124.invoke(strInvoke2)) != null) {
                    str = strInvoke;
                }
            }
            if (str != null) {
                arrayList.add(str);
            }
            i2 = i3;
        }
        String string = ((StringBuilder) C3888.m10920(arrayList, new StringBuilder(i), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        C5499.m17102(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String m23842(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
        String strInvoke;
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "newIndent");
        List<String> listM24077 = C7628.m24077(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM24077) {
            if (!C7627.m23982((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C3881.m10756(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m23838((String) it.next())));
        }
        Integer num = (Integer) C3888.m10970(arrayList2);
        int i = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listM24077.size());
        InterfaceC5124<String, String> interfaceC5124M23837 = m23837(str2);
        int iM10737 = C3880.m10737(listM24077);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM24077) {
            int i2 = i + 1;
            if (i < 0) {
                C3880.m10753();
            }
            String str3 = (String) obj2;
            if ((i == 0 || i == iM10737) && C7627.m23982(str3)) {
                str3 = null;
            } else {
                String strM24226 = C7633.m24226(str3, iIntValue);
                if (strM24226 != null && (strInvoke = interfaceC5124M23837.invoke(strM24226)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList3.add(str3);
            }
            i = i2;
        }
        String string = ((StringBuilder) C3888.m10920(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        C5499.m17102(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static /* synthetic */ String m23843(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        return m23842(str, str2);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final String m23844(@InterfaceC6399 String str, @InterfaceC6399 String str2, @InterfaceC6399 String str3) {
        int i;
        String strInvoke;
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "newIndent");
        C5499.m17103(str3, "marginPrefix");
        if (!(!C7627.m23982(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        List<String> listM24077 = C7628.m24077(str);
        int length = str.length() + (str2.length() * listM24077.size());
        InterfaceC5124<String, String> interfaceC5124M23837 = m23837(str2);
        int iM10737 = C3880.m10737(listM24077);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : listM24077) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C3880.m10753();
            }
            String str4 = (String) obj;
            String strSubstring = null;
            if ((i2 == 0 || i2 == iM10737) && C7627.m23982(str4)) {
                str4 = null;
            } else {
                int length2 = str4.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        i = -1;
                        break;
                    }
                    if (!C3791.m10465(str4.charAt(i4))) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
                if (i != -1) {
                    int i5 = i;
                    if (C7627.m24007(str4, str3, i, false, 4, null)) {
                        int length3 = i5 + str3.length();
                        C5499.m17101(str4, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str4.substring(length3);
                        C5499.m17102(strSubstring, "this as java.lang.String).substring(startIndex)");
                    }
                }
                if (strSubstring != null && (strInvoke = interfaceC5124M23837.invoke(strSubstring)) != null) {
                    str4 = strInvoke;
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i2 = i3;
        }
        String string = ((StringBuilder) C3888.m10920(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
        C5499.m17102(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ String m23845(String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "";
        }
        if ((i & 2) != 0) {
            str3 = "|";
        }
        return m23844(str, str2, str3);
    }

    @InterfaceC5498
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static String m23846(@InterfaceC6399 String str) {
        C5499.m17103(str, "<this>");
        return m23842(str, "");
    }

    @InterfaceC5498
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final String m23847(@InterfaceC6399 String str, @InterfaceC6399 String str2) {
        C5499.m17103(str, "<this>");
        C5499.m17103(str2, "marginPrefix");
        return m23844(str, "", str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ String m23848(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m23847(str, str2);
    }
}
