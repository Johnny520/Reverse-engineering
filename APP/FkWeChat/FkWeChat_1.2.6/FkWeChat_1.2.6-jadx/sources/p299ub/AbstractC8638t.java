package p299ub;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p376zd.C9987e;

/* JADX INFO: renamed from: ub.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8638t extends AbstractC8635q {
    /* JADX INFO: renamed from: d */
    public static final InterfaceC0184l m33237d(final String str) {
        return str.length() == 0 ? new InterfaceC0184l() { // from class: ub.r
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC8638t.m33238e((String) obj);
            }
        } : new InterfaceC0184l() { // from class: ub.s
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC8638t.m33239f(str, (String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: e */
    public static final String m33238e(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: renamed from: f */
    public static final String m33239f(String str, String str2) {
        str2.getClass();
        return str + str2;
    }

    /* JADX INFO: renamed from: g */
    public static final int m33240g(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!AbstractC8610a.m33055c(str.charAt(i10))) {
                break;
            }
            i10++;
        }
        return i10 == -1 ? str.length() : i10;
    }

    /* JADX INFO: renamed from: h */
    public static final String m33241h(String str, String str2) {
        String str3;
        str.getClass();
        str2.getClass();
        List listM33170y0 = AbstractC8621f0.m33170y0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM33170y0) {
            if (!AbstractC8621f0.m33156p0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5116y.m20814z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(m33240g((String) it.next())));
        }
        Integer num = (Integer) AbstractC5081g0.m20592z0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listM33170y0.size());
        InterfaceC0184l interfaceC0184lM33237d = m33237d(str2);
        int iM20802q = AbstractC5114x.m20802q(listM33170y0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listM33170y0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC5114x.m20810y();
            }
            String str4 = (String) obj2;
            if ((i10 == 0 || i10 == iM20802q) && AbstractC8621f0.m33156p0(str4)) {
                str4 = null;
            } else {
                String strM33176v1 = AbstractC8625h0.m33176v1(str4, iIntValue);
                if (strM33176v1 != null && (str3 = (String) interfaceC0184lM33237d.mo27m(strM33176v1)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i10 = i11;
        }
        return ((StringBuilder) AbstractC5081g0.m20583q0(arrayList3, new StringBuilder(length), "\n", null, null, 0, null, null, Opcodes.IUSHR, null)).toString();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m33242i(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = _UrlKt.FRAGMENT_ENCODE_SET;
        }
        return m33241h(str, str2);
    }

    /* JADX INFO: renamed from: j */
    public static final String m33243j(String str, String str2, String str3) {
        String str4;
        String str5;
        str.getClass();
        str2.getClass();
        str3.getClass();
        if (AbstractC8621f0.m33156p0(str3)) {
            C9987e.m38645a("marginPrefix must be non-blank string.");
            return null;
        }
        List listM33170y0 = AbstractC8621f0.m33170y0(str);
        int length = str.length() + (str2.length() * listM33170y0.size());
        InterfaceC0184l interfaceC0184lM33237d = m33237d(str2);
        int iM20802q = AbstractC5114x.m20802q(listM33170y0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listM33170y0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC5114x.m20810y();
            }
            String str6 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iM20802q) && AbstractC8621f0.m33156p0(str6)) {
                str4 = str3;
                str6 = null;
            } else {
                int length2 = str6.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!AbstractC8610a.m33055c(str6.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str4 = str3;
                } else {
                    int i13 = i12;
                    str4 = str3;
                    if (AbstractC8611a0.m33074S(str6, str4, i13, false, 4, null)) {
                        int length3 = str4.length() + i13;
                        str6.getClass();
                        strSubstring = str6.substring(length3);
                    }
                }
                if (strSubstring != null && (str5 = (String) interfaceC0184lM33237d.mo27m(strSubstring)) != null) {
                    str6 = str5;
                }
            }
            if (str6 != null) {
                arrayList.add(str6);
            }
            i10 = i11;
            str3 = str4;
        }
        return ((StringBuilder) AbstractC5081g0.m20583q0(arrayList, new StringBuilder(length), "\n", null, null, 0, null, null, Opcodes.IUSHR, null)).toString();
    }

    /* JADX INFO: renamed from: k */
    public static String m33244k(String str) {
        str.getClass();
        return m33241h(str, _UrlKt.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: renamed from: l */
    public static final String m33245l(String str, String str2) {
        str.getClass();
        str2.getClass();
        return m33243j(str, _UrlKt.FRAGMENT_ENCODE_SET, str2);
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ String m33246m(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return m33245l(str, str2);
    }
}
