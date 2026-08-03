package Yue;

import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* JADX INFO: renamed from: Yue.ۥۢۦۣۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8560 implements InterfaceC8561 {

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public C4726 f25407;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C4725 f25408;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C6350 f25409 = new C6350();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8560() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static void m28466(String[] strArr) throws Exception {
        C8560 c8560 = new C8560(new FileReader(strArr[0]));
        InterfaceC8563 interfaceC8563Mo28457 = AbstractC8554.m28453().mo28457(System.out);
        C7018 c7018 = new C7018(interfaceC8563Mo28457);
        while (c8560.hasNext()) {
            c7018.mo21812(c8560);
            c8560.next();
        }
        interfaceC8563Mo28457.flush();
    }

    @Override // Yue.InterfaceC8561
    public void close() throws C8559 {
    }

    @Override // Yue.InterfaceC8561
    public C6848 getName() {
        return new C6848(mo18325(), mo18348(), getPrefix());
    }

    @Override // Yue.InterfaceC8561
    public String getPrefix() {
        return this.f25407.m14209();
    }

    @Override // Yue.InterfaceC8561
    public Object getProperty(String str) throws IllegalArgumentException {
        return null;
    }

    @Override // Yue.InterfaceC8561
    public String getText() {
        return this.f25407.m14203();
    }

    @Override // Yue.InterfaceC8561
    public String getVersion() {
        return "1.0";
    }

    @Override // Yue.InterfaceC8561
    public boolean hasNext() throws C8559 {
        try {
            C4726 c4726 = this.f25407;
            if (c4726 != null) {
                if (c4726.m14210() != 8) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            throw new C8559(e);
        }
    }

    @Override // Yue.InterfaceC8561
    public int next() throws C8559 {
        try {
            if (!this.f25408.m14177()) {
                this.f25407 = null;
                return -1;
            }
            this.f25407 = this.f25408.m14187();
            if (mo18328()) {
                this.f25409.m19850();
                for (int i = 0; i < mo18345(); i++) {
                    this.f25409.m2812(mo18337(i), mo18350(i));
                }
            } else if (mo18326() && this.f25409.m19848() > 0) {
                this.f25409.m19846();
            }
            return this.f25407.m14210();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
            throw new C8559(e.getMessage(), e);
        }
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟ */
    public InterfaceC6349 mo2574() {
        return this.f25409;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ */
    public String mo18318(String str) {
        return this.f25409.mo19843(str);
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public int mo18319() throws C8559 {
        while (next() != 8) {
            if (mo18322() && !mo18324()) {
                throw new C8559("Unexpected text");
            }
            if (mo18328() || mo18326()) {
                return mo18329();
            }
        }
        throw new C8559("Unexpected end of Document");
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public String mo18320() throws C8559 {
        StringBuffer stringBuffer = new StringBuffer();
        if (mo18329() != 1) {
            throw new C8559("Precondition for readText is getEventType() == START_ELEMENT");
        }
        while (next() != 8) {
            if (mo18328()) {
                throw new C8559("Unexpected Element start");
            }
            if (mo18322()) {
                stringBuffer.append(getText());
            }
            if (mo18326()) {
                return stringBuffer.toString();
            }
        }
        throw new C8559("Unexpected end of Document");
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public boolean mo18321() {
        return false;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public boolean mo18322() {
        return (mo18329() & 4) != 0;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public String mo18323() {
        return null;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public boolean mo18324() {
        return false;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public String mo18325() {
        return this.f25407.m14207();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo18326() {
        return (mo18329() & 2) != 0;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo18327() {
        return true;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public boolean mo18328() {
        return (mo18329() & 1) != 0;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public int mo18329() {
        C4726 c4726 = this.f25407;
        if (c4726 == null) {
            return 8;
        }
        return c4726.m14210();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public InterfaceC5801 mo18330() {
        return null;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public String mo18331(int i) {
        InterfaceC3453 interfaceC3453M28468 = m28468(i);
        if (interfaceC3453M28468 == null) {
            return null;
        }
        return interfaceC3453M28468.getValue();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public char[] mo18332() {
        return this.f25407.m14203().toCharArray();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public String mo18333(String str, String str2) {
        int i;
        while (i < mo18351()) {
            InterfaceC3453 interfaceC3453M28468 = m28468(i);
            i = (str2.equals(interfaceC3453M28468.getName().m3294()) && (str == null || str.equals(interfaceC3453M28468.getName().m3295()))) ? 0 : i + 1;
            return interfaceC3453M28468.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m28467() {
        return this.f25408.m1640();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public boolean mo18334() {
        return (mo18329() & 11) != 0;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public String mo18335() {
        return this.f25407.m14203();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public int mo18336() {
        return this.f25407.m14203().length();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public String mo18337(int i) {
        InterfaceC3453 interfaceC3453M28469 = m28469(i);
        if (interfaceC3453M28469 == null) {
            return null;
        }
        return interfaceC3453M28469.getName().m3294();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public C6848 mo18338(int i) {
        return new C6848(mo18339(i), mo18344(i), mo18343(i));
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public String mo18339(int i) {
        InterfaceC3453 interfaceC3453M28468 = m28468(i);
        if (interfaceC3453M28468 == null) {
            return null;
        }
        return interfaceC3453M28468.getName().m3295();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public int mo18340(int i, char[] cArr, int i2, int i3) throws C8559 {
        throw new UnsupportedOperationException();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public boolean mo18341() {
        return (mo18329() & 15) != 0;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public boolean mo18342(int i) {
        return false;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public String mo18343(int i) {
        InterfaceC3453 interfaceC3453M28468 = m28468(i);
        if (interfaceC3453M28468 == null) {
            return null;
        }
        return interfaceC3453M28468.getName().m21588();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public String mo18344(int i) {
        InterfaceC3453 interfaceC3453M28468 = m28468(i);
        if (interfaceC3453M28468 == null) {
            return null;
        }
        return interfaceC3453M28468.getName().m3294();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public int mo18345() {
        if (mo18328()) {
            return this.f25407.m14208().size();
        }
        return 0;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public String mo18346() {
        return this.f25407.m14204();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public void mo18347(int i, String str, String str2) throws C8559 {
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public String mo18348() {
        return this.f25407.m14205();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final InterfaceC3453 m28468(int i) {
        return (InterfaceC3453) this.f25407.m14202().get(i);
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public int mo18349() {
        return 0;
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public String mo18350(int i) {
        InterfaceC3453 interfaceC3453M28469 = m28469(i);
        if (interfaceC3453M28469 == null) {
            return null;
        }
        return interfaceC3453M28469.getValue();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public int mo18351() {
        if (mo18328()) {
            return this.f25407.m14202().size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public final InterfaceC3453 m28469(int i) {
        return (InterfaceC3453) this.f25407.m14208().get(i);
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۤ */
    public String mo18352() {
        return this.f25407.m14203();
    }

    @Override // Yue.InterfaceC8561
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public String mo18353(int i) {
        return "CDATA";
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public Reader m28470() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public InterfaceC8561 m28471() throws C8559 {
        return null;
    }

    public C8560(InputStream inputStream) {
        try {
            this.f25408 = new C4725(new InputStreamReader(inputStream));
            next();
            if (mo18329() == 7) {
                this.f25408 = new C4725(new InputStreamReader(inputStream, mo18323()));
            }
        } catch (Exception e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unable to instantiate the XMLStreamPlayer");
            stringBuffer.append(e.getMessage());
            throw new IllegalArgumentException(stringBuffer.toString());
        }
    }

    public C8560(Reader reader) {
        try {
            this.f25408 = new C4725(reader);
            next();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
