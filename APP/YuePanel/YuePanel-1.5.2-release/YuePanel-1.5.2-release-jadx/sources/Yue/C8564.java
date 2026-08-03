package Yue;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.HashSet;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۢۦۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8564 extends C7018 implements InterfaceC8563 {

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final String f25410 = "";

    /* JADX INFO: renamed from: ۥ۟ */
    public Writer f3557;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C4095 f25413;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public CharsetEncoder f25414;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public HashSet f25419;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f25420;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f25411 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f25412 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C7562 f25415 = new C7562();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C7562 f25416 = new C7562();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C7562 f25417 = new C7562();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C6350 f25418 = new C6350();

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f25421 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public HashSet f25422 = new HashSet();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8564() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static void m28506(String[] strArr) throws Exception {
        AbstractC8554 abstractC8554M28453 = AbstractC8554.m28453();
        abstractC8554M28453.mo28463(AbstractC8554.f3553, new Boolean(true));
        InterfaceC8563 interfaceC8563Mo28459 = abstractC8554M28453.mo28459(new OutputStreamWriter(new FileOutputStream("tmp"), "us-ascii"));
        interfaceC8563Mo28459.mo28483();
        interfaceC8563Mo28459.mo4536("c", "http://c");
        interfaceC8563Mo28459.mo28491("http://d");
        interfaceC8563Mo28459.mo28497("http://c", C6608.f2171);
        interfaceC8563Mo28459.mo28504("b", "blah");
        interfaceC8563Mo28459.mo28493("http://c", "d");
        interfaceC8563Mo28459.mo28493("http://d", "e");
        interfaceC8563Mo28459.mo28493("http://e", "f");
        interfaceC8563Mo28459.mo28493("http://f", "g");
        interfaceC8563Mo28459.mo28478("http://c", "chris", "fry");
        interfaceC8563Mo28459.mo28502("foo bar foo");
        interfaceC8563Mo28459.mo28502("bad char coming[");
        interfaceC8563Mo28459.mo28502("$");
        interfaceC8563Mo28459.mo28502("]");
        interfaceC8563Mo28459.mo28498();
        interfaceC8563Mo28459.flush();
    }

    @Override // Yue.InterfaceC8563
    public void close() throws C8559 {
        flush();
    }

    @Override // Yue.InterfaceC8563
    public void flush() throws C8559 {
        try {
            this.f3557.flush();
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    @Override // Yue.InterfaceC8563
    public String getPrefix(String str) throws C8559 {
        return this.f25418.getPrefix(str);
    }

    @Override // Yue.InterfaceC8563
    public Object getProperty(String str) throws IllegalArgumentException {
        return this.f25413.m11569(str);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ */
    public void mo4536(String str, String str2) throws C8559 {
        m28513(str2);
        this.f25418.m2812(str, str2);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC6349 mo4537() {
        return this.f25418;
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo28491(String str) throws C8559 {
        m28513(str);
        this.f25418.m2811(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo28473(String str) throws C8559 {
        m28522("<?xml version='");
        m28522(str);
        m28522("'?>");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo28474(String str) throws C8559 {
        if (!m28512()) {
            throw new C8559("A start element must be written before the default namespace");
        }
        if (m28514("")) {
            m28522(" xmlns");
            m28522("=\"");
            m28522(str);
            m28522("\"");
            mo4536("", str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo28475(String str) throws C8559 {
        m28522(str);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo28492(InterfaceC6349 interfaceC6349) throws C8559 {
        if (interfaceC6349 == null) {
            throw new NullPointerException("The namespace  context may not be null.");
        }
        this.f25418 = new C6350(interfaceC6349);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo28493(String str, String str2) throws C8559 {
        m28515();
        m28516(str);
        this.f25412 = true;
        m28522("<");
        mo28489("", str, str2);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo28494(String str, String str2, String str3, String str4) throws C8559 {
        if (!m28512()) {
            throw new C8559("A start element must be written before an attribute");
        }
        m28516(str2);
        this.f25418.m2812(str, str2);
        m28522(" ");
        mo28489(str, str2, str3);
        m28522("=\"");
        mo28488(str4.toCharArray(), 0, str4.length(), true);
        m28522("\"");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo28476(String str, String str2) throws C8559 {
        m28508();
        m28522("<?");
        if (str != null) {
            m28522(str);
        }
        if (str2 != null) {
            m28521(' ');
            m28522(str2);
        }
        m28522("?>");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo28477(String str, String str2) throws C8559 {
        if (!m28512()) {
            throw new C8559("A start element must be written before a namespace");
        }
        if (str == null || "".equals(str) || "xmlns".equals(str)) {
            mo28474(str2);
            return;
        }
        if (m28514(str)) {
            m28522(" xmlns:");
            m28522(str);
            m28522("=\"");
            m28522(str2);
            m28522("\"");
            mo4536(str, str2);
        }
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo28495(String str, String str2, String str3) throws C8559 {
        m28515();
        m28516(str3);
        this.f25412 = true;
        m28522("<");
        m28522(str);
        m28522(":");
        m28522(str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo28478(String str, String str2, String str3) throws C8559 {
        if (!m28512()) {
            throw new C8559("A start element must be written before an attribute");
        }
        m28516(str);
        m28522(" ");
        mo28489("", str, str2);
        m28522("=\"");
        mo28488(str3.toCharArray(), 0, str3.length(), true);
        m28522("\"");
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo28496(String str, String str2, String str3) throws C8559 {
        if (str3 == null) {
            throw new IllegalArgumentException("The namespace URI may not be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("The local name may not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("The prefix may not be null");
        }
        this.f25418.m19850();
        m28516(str3);
        this.f25418.m2812(str, str3);
        m28526(str3, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo28479(String str) throws C8559 {
        m28508();
        m28522("&");
        m28522(str);
        m28522(";");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo28480(String str) throws C8559 {
        m28508();
        m28522("<![CDATA[");
        if (str != null) {
            m28522(str);
        }
        m28522("]]>");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo28481(String str, String str2) throws C8559 {
        m28522("<?xml version='");
        m28522(str2);
        m28522("' encoding='");
        m28522(str);
        m28522("'?>");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo28482(String str) throws C8559 {
        m28508();
        m28522("<!--");
        if (str != null) {
            m28522(str);
        }
        m28522("-->");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public void mo28483() throws C8559 {
        m28522("<?xml version='1.0' encoding='utf-8'?>");
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo28497(String str, String str2) throws C8559 {
        this.f25418.m19850();
        m28526(str, str2);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public void mo28498() throws C8559 {
        if (m28512()) {
            m28508();
        }
        String str = (String) this.f25416.pop();
        String str2 = (String) this.f25415.pop();
        this.f25417.pop();
        mo28486();
        mo28489(str, "", str2);
        mo28484();
        this.f25418.m19846();
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo28499() throws C8559 {
        while (!this.f25415.isEmpty()) {
            mo28498();
        }
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public void mo28500(String str) throws C8559 {
        this.f25418.m19850();
        mo28497("", str);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo28501(String str) throws C8559 {
        m28508();
        mo28476(str, null);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public void mo28502(String str) throws C8559 {
        m28508();
        mo28488(str.toCharArray(), 0, str.length(), false);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo28503(String str) throws C8559 {
        mo28493("", str);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public void mo28504(String str, String str2) throws C8559 {
        mo28478("", str, str2);
    }

    @Override // Yue.InterfaceC8563
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public void mo28505(char[] cArr, int i, int i2) throws C8559 {
        m28508();
        mo28488(cArr, i, i2, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final void m28507() {
        this.f25422.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public void mo28484() throws C8559 {
        m28522(">");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m28508() throws C8559 {
        if (this.f25411) {
            mo28485();
            this.f25411 = false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public void mo28485() throws C8559 {
        m28509();
        m28507();
        if (!this.f25412) {
            m28522(">");
        } else {
            m28522("/>");
            this.f25412 = false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m28509() throws C8559 {
        HashSet<String> hashSet;
        if (!this.f25420 || (hashSet = this.f25419) == null) {
            return;
        }
        for (String str : hashSet) {
            String prefix = this.f25418.getPrefix(str);
            if (prefix == null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to default prefix with uri:");
                stringBuffer.append(str);
                throw new C8559(stringBuffer.toString());
            }
            mo28477(prefix, str);
        }
        this.f25419.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final String m28510(String str) {
        String prefix = this.f25418.getPrefix(str);
        return prefix == null ? "" : prefix;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public String m28511(String str) {
        String strMo19843 = this.f25418.mo19843(str);
        return strMo19843 == null ? "" : strMo19843;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public boolean m28512() {
        return this.f25411;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final boolean m28513(String str) {
        if (this.f25419 == null) {
            this.f25419 = new HashSet();
        }
        boolean zContains = this.f25419.contains(str);
        this.f25419.add(str);
        return zContains;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final boolean m28514(String str) {
        boolean z = !this.f25422.contains(str);
        if (z) {
            this.f25422.add(str);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public void mo28486() throws C8559 {
        m28522("</");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final void m28515() throws C8559 {
        if (this.f25411) {
            mo28485();
        } else {
            this.f25411 = true;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
    public void mo28487() throws C8559 {
        m28522("<");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m28516(String str) throws C8559 {
        if (this.f25420 && !"".equals(str) && getPrefix(str) == null) {
            this.f25421++;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("ns");
            stringBuffer.append(this.f25421);
            mo4536(stringBuffer.toString(), str);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final void m28517(String str) {
        HashSet hashSet;
        if (!this.f25420 || (hashSet = this.f25419) == null) {
            return;
        }
        hashSet.remove(str);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m28518(C4095 c4095) {
        this.f25413 = c4095;
        this.f25420 = c4095.m11575();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m28519(Writer writer) {
        this.f3557 = writer;
        m21811(this);
        if (writer instanceof OutputStreamWriter) {
            this.f25414 = Charset.forName(((OutputStreamWriter) writer).getEncoding()).newEncoder();
        } else {
            this.f25414 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006d  */
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m28520(char[] cArr, int i, int i2, boolean z) throws C8559 {
        CharsetEncoder charsetEncoder;
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i3 + i];
            if (c != '\"') {
                if (c == '&') {
                    m28522("&amp;");
                } else if (c == '<') {
                    m28522("&lt;");
                } else if (c == '>') {
                    m28522("&gt;");
                } else if (c < ' ') {
                    if (z || !(c == '\t' || c == '\n')) {
                        m28522("&#");
                        m28522(Integer.toString(c));
                        m28521(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                    } else {
                        m28521(c);
                    }
                } else if (c > 127 && (charsetEncoder = this.f25414) != null && !charsetEncoder.canEncode(c)) {
                    m28522("&#");
                    m28522(Integer.toString(c));
                    m28521(TypePool.Default.LazyTypeDescription.GenericTypeToken.INDEXED_TYPE_DELIMITER);
                }
            } else if (z) {
                m28522("&quot;");
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m28521(char c) throws C8559 {
        try {
            this.f3557.write(c);
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m28522(String str) throws C8559 {
        try {
            this.f3557.write(str);
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m28523(char[] cArr) throws C8559 {
        try {
            this.f3557.write(cArr);
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m28524(char[] cArr, int i, int i2) throws C8559 {
        try {
            this.f3557.write(cArr, i, i2);
        } catch (IOException e) {
            throw new C8559(e);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public void mo28488(char[] cArr, int i, int i2, boolean z) throws C8559 {
        CharsetEncoder charsetEncoder;
        if (i2 == 0) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            char c = cArr[i3 + i];
            if (c == '\"') {
                if (z) {
                    break;
                } else {
                    i3++;
                }
            } else if (c != '&' && c != '<' && c != '>') {
                if (c >= ' ') {
                    if (c > 127 && (charsetEncoder = this.f25414) != null && !charsetEncoder.canEncode(c)) {
                        break;
                    } else {
                        i3++;
                    }
                } else if (z || !(c == '\t' || c == '\n')) {
                    break;
                } else {
                    i3++;
                }
            } else {
                break;
            }
        }
        if (i3 < i2) {
            m28520(cArr, i, i2, z);
        } else {
            m28524(cArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    public String mo28489(String str, String str2, String str3) throws C8559 {
        if (!"".equals(str2)) {
            str = m28510(str2);
        }
        if (!"".equals(str)) {
            m28522(str);
            m28522(":");
        }
        m28522(str3);
        return str;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void m28525(String str) throws C8559 {
        m28508();
        m28522(str);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m28526(String str, String str2) throws C8559 {
        if (str == null) {
            throw new IllegalArgumentException("The namespace URI may not be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("The local name  may not be null");
        }
        m28515();
        mo28487();
        m28516(str);
        this.f25416.push(mo28489("", str, str2));
        this.f25415.push(str2);
        this.f25417.push(str);
    }

    public C8564(Writer writer) {
        this.f3557 = writer;
        m28519(writer);
    }
}
