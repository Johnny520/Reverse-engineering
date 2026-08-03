package Yue;

import java.io.PrintStream;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۡۢ۠ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6350 implements InterfaceC6349 {

    /* JADX INFO: renamed from: ۥ */
    public C7696 f2027;

    /* JADX INFO: renamed from: ۥ۟ */
    public C7696 f2028;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public InterfaceC6349 f16120;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6350() {
        this.f2027 = new C7696();
        this.f2028 = new C7696();
        m19849();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m19845(String[] strArr) throws Exception {
        C6350 c6350 = new C6350();
        c6350.m19850();
        c6350.m2812(C6608.f2171, "uri");
        c6350.m2812("b", "uri");
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a=");
        stringBuffer.append(c6350.mo19843(C6608.f2171));
        printStream.println(stringBuffer.toString());
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("uri=");
        stringBuffer2.append(c6350.getPrefix("uri"));
        printStream.println(stringBuffer2.toString());
        Iterator itMo19844 = c6350.mo19844("uri");
        while (itMo19844.hasNext()) {
            PrintStream printStream2 = System.out;
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("1 uri->");
            stringBuffer3.append(itMo19844.next());
            printStream2.println(stringBuffer3.toString());
        }
        c6350.m19850();
        c6350.m2812(C6608.f2171, "uri2");
        Iterator itMo198442 = c6350.mo19844("uri");
        while (itMo198442.hasNext()) {
            PrintStream printStream3 = System.out;
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("2 uri->");
            stringBuffer4.append(itMo198442.next());
            printStream3.println(stringBuffer4.toString());
        }
        c6350.m19846();
        c6350.m19846();
    }

    @Override // Yue.InterfaceC6349
    public String getPrefix(String str) {
        InterfaceC6349 interfaceC6349;
        String strM24481 = this.f2028.m24481(str);
        return (strM24481 != null || (interfaceC6349 = this.f16120) == null) ? strM24481 : interfaceC6349.getPrefix(str);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m2811(String str) {
        m2812("", str);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m2812(String str, String str2) {
        this.f2027.m24485(str, str2);
        this.f2028.m24485(str2, str);
    }

    @Override // Yue.InterfaceC6349
    /* JADX INFO: renamed from: ۥ۟۟ */
    public String mo19843(String str) {
        InterfaceC6349 interfaceC6349;
        String strM24481 = this.f2027.m24481(str);
        return (strM24481 != null || (interfaceC6349 = this.f16120) == null) ? strM24481 : interfaceC6349.mo19843(str);
    }

    @Override // Yue.InterfaceC6349
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public Iterator mo19844(String str) {
        return this.f2028.m24482(str).iterator();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m19846() {
        this.f2027.m3797();
        this.f2028.m3797();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public String m19847() {
        return mo19843("");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m19848() {
        return this.f2027.m24483();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m19849() {
        m2812(C8542.f3549, "http://www.w3.org/XML/1998/namespace");
        m2812("xmlns", "http://www.w3.org/XML/1998/namespace");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m19850() {
        this.f2027.m24484();
        this.f2028.m24484();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m19851() {
        m2812("", null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m19852(String str, String str2) {
        this.f2027.m24485(str, null);
        this.f2027.m24485(str2, null);
    }

    public C6350(InterfaceC6349 interfaceC6349) {
        this.f2027 = new C7696();
        this.f2028 = new C7696();
        this.f16120 = null;
        m19849();
    }
}
