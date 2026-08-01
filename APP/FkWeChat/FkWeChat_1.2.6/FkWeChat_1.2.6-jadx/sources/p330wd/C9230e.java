package p330wd;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
import okhttp3.internal.url._UrlKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import p024b9.AbstractC1043k;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8644z;
import p299ub.C8632n;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: wd.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9230e {

    /* JADX INFO: renamed from: c */
    public static final a f31498c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f31499d = 8;

    /* JADX INFO: renamed from: e */
    public static final C8632n f31500e = new C8632n("&(?!amp;|lt;|gt;|quot;|apos;|#[0-9]+;)");

    /* JADX INFO: renamed from: f */
    public static final C8632n f31501f = new C8632n("[\\x00-\\x08\\x0b\\x0c\\x0e-\\x1f]");

    /* JADX INFO: renamed from: a */
    public final HashMap f31502a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final String f31503b;

    public C9230e(String str) {
        String string = (str == null || (string = AbstractC8621f0.m33161r1(str).toString()) == null) ? _UrlKt.FRAGMENT_ENCODE_SET : string;
        this.f31503b = string;
        if (string.length() > 0) {
            m35946r();
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m35929a(String str) {
        int iM33166u0;
        int iM33152n0 = AbstractC8621f0.m33152n0(str, "<msg", 0, false, 6, null);
        if (iM33152n0 == -1) {
            iM33152n0 = AbstractC8621f0.m33152n0(str, "<appmsg", 0, false, 6, null);
        }
        return (iM33152n0 == -1 || (iM33166u0 = AbstractC8621f0.m33166u0(str, ">", 0, false, 6, null)) <= iM33152n0) ? str : str.substring(iM33152n0, iM33166u0 + 1);
    }

    /* JADX INFO: renamed from: b */
    public final String m35930b(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            String str2 = str;
            int iM33152n0 = AbstractC8621f0.m33152n0(str2, "<![CDATA[", i10, false, 4, null);
            if (iM33152n0 == -1) {
                sb2.append(m35931c(str2.substring(i10)));
                return sb2.toString();
            }
            sb2.append(m35931c(str2.substring(i10, iM33152n0)));
            int iM33152n02 = AbstractC8621f0.m33152n0(str2, "]]>", iM33152n0, false, 4, null);
            if (iM33152n02 == -1) {
                sb2.append(str2.substring(iM33152n0));
                return sb2.toString();
            }
            i10 = iM33152n02 + 3;
            sb2.append((CharSequence) str2, iM33152n0, i10);
            str = str2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m35931c(String str) {
        return f31501f.m33219k(f31500e.m33219k(str, "&amp;"), _UrlKt.FRAGMENT_ENCODE_SET);
    }

    /* JADX INFO: renamed from: d */
    public final String m35932d(String str) {
        if (str == null || str.length() == 0) {
            return _UrlKt.FRAGMENT_ENCODE_SET;
        }
        String str2 = (String) this.f31502a.get(str);
        if (str2 != null) {
            return m35947s(str2);
        }
        for (Map.Entry entry : this.f31502a.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (!AbstractC8611a0.m33060E(str3, "/" + str, false, 2, null)) {
                if (AbstractC8611a0.m33060E(str3, "@" + str, false, 2, null)) {
                }
            }
            String strM35947s = m35947s(str4);
            this.f31502a.put(str, strM35947s);
            return strM35947s;
        }
        return _UrlKt.FRAGMENT_ENCODE_SET;
    }

    /* JADX INFO: renamed from: e */
    public final String m35933e() {
        return m35932d("aeskey");
    }

    /* JADX INFO: renamed from: f */
    public final String m35934f() {
        return m35932d("appid");
    }

    /* JADX INFO: renamed from: g */
    public final String m35935g() {
        String strM35932d = m35932d("cdnbigimgurl");
        if (strM35932d.length() == 0) {
            strM35932d = m35932d("cdnmidimgurl");
        }
        if (strM35932d.length() == 0) {
            strM35932d = m35932d("cdnvideourl");
        }
        if (strM35932d.length() == 0) {
            strM35932d = m35932d("cdnvoiceurl");
        }
        if (strM35932d.length() == 0) {
            strM35932d = m35932d("cdnattachurl");
        }
        return strM35932d.length() == 0 ? m35932d("attachid") : strM35932d;
    }

    /* JADX INFO: renamed from: h */
    public final int m35936h(String str, int i10) {
        Integer numM33252s;
        str.getClass();
        String strM35932d = m35932d(str);
        return (strM35932d.length() == 0 || (numM33252s = AbstractC8644z.m33252s(strM35932d)) == null) ? i10 : numM33252s.intValue();
    }

    /* JADX INFO: renamed from: i */
    public final int m35937i() {
        return m35936h("invalidtime", 0);
    }

    /* JADX INFO: renamed from: j */
    public final long m35938j() {
        long jM35939k = m35939k("length", 0L);
        if (jM35939k == 0) {
            jM35939k = m35939k("totallen", 0L);
        }
        return jM35939k == 0 ? m35939k("hdlength", 0L) : jM35939k;
    }

    /* JADX INFO: renamed from: k */
    public final long m35939k(String str, long j10) {
        Long lM33254u;
        str.getClass();
        String strM35932d = m35932d(str);
        return (strM35932d.length() == 0 || (lM33254u = AbstractC8644z.m33254u(strM35932d)) == null) ? j10 : lM33254u.longValue();
    }

    /* JADX INFO: renamed from: l */
    public final String m35940l() {
        return m35932d("md5");
    }

    /* JADX INFO: renamed from: m */
    public final String m35941m() {
        return m35932d("nativeurl");
    }

    /* JADX INFO: renamed from: n */
    public final String m35942n(Stack stack) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = stack.iterator();
        it.getClass();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb2.append("/");
            sb2.append(str);
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: o */
    public final String m35943o() {
        return m35932d("title");
    }

    /* JADX INFO: renamed from: p */
    public final String m35944p() {
        return m35932d("transcationid");
    }

    /* JADX INFO: renamed from: q */
    public final String m35945q() {
        return m35932d("transferid");
    }

    /* JADX INFO: renamed from: r */
    public final void m35946r() {
        String text;
        try {
            String strM35930b = m35930b("<root>" + m35929a(this.f31503b) + "</root>");
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            xmlPullParserFactoryNewInstance.setNamespaceAware(false);
            XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(strM35930b));
            int eventType = xmlPullParserNewPullParser.getEventType();
            Stack stack = new Stack();
            int i10 = 0;
            while (eventType != 1) {
                int i11 = i10 + 1;
                if (i10 >= 5000) {
                    return;
                }
                if (eventType == 2) {
                    String name = xmlPullParserNewPullParser.getName();
                    stack.push(name);
                    int attributeCount = xmlPullParserNewPullParser.getAttributeCount();
                    for (int i12 = 0; i12 < attributeCount; i12++) {
                        this.f31502a.put(name + "@" + xmlPullParserNewPullParser.getAttributeName(i12), xmlPullParserNewPullParser.getAttributeValue(i12));
                    }
                } else if (eventType != 3) {
                    if ((eventType == 4 || eventType == 5) && (text = xmlPullParserNewPullParser.getText()) != null && !stack.isEmpty()) {
                        String string = AbstractC8621f0.m33161r1(text).toString();
                        if (string.length() > 0) {
                            this.f31502a.put((String) stack.peek(), string);
                            this.f31502a.put(m35942n(stack), string);
                        }
                    }
                } else if (!stack.isEmpty()) {
                    stack.pop();
                }
                eventType = xmlPullParserNewPullParser.next();
                i10 = i11;
            }
        } catch (Throwable th) {
            AbstractC8924d.m34264d("XmlMsgParser", "XmlPullParser exception", th);
        }
    }

    /* JADX INFO: renamed from: s */
    public final String m35947s(String str) {
        return str.length() == 0 ? str : AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(AbstractC8611a0.m33069N(str, "&lt;", "<", false, 4, null), "&gt;", ">", false, 4, null), "&quot;", "\"", false, 4, null), "&apos;", "'", false, 4, null), "&amp;", "&", false, 4, null);
    }

    /* JADX INFO: renamed from: wd.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
