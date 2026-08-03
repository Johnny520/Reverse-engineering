package Yue;

import java.io.FileReader;
import java.io.PrintStream;

/* JADX INFO: renamed from: Yue.ۥۣۢ۠ۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7664 extends C7017 {

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int f23060;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean f23061;

    public C7664(InterfaceC8561 interfaceC8561) throws C8559 {
        super(interfaceC8561);
        this.f23060 = 0;
        this.f23061 = true;
        if (!interfaceC8561.mo18328()) {
            throw new C8559("Unable to instantiate a subReader because the underlying reader was not on a start element.");
        }
        this.f23061 = true;
        this.f23060++;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static void m24388(String[] strArr) throws Exception {
        C5901 c5901 = new C5901();
        c5901.m18425(new FileReader(strArr[0]));
        c5901.m18393();
        c5901.next();
        while (c5901.m18393()) {
            PrintStream printStream = System.out;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("SE->");
            stringBuffer.append(c5901.getName());
            printStream.println(stringBuffer.toString());
            m24390(c5901.m18429(), 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static void m24389(InterfaceC8561 interfaceC8561, int i) throws C8559 {
        PrintStream printStream = System.out;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(i);
        stringBuffer.append("]Sub: ");
        stringBuffer.append(C4606.m1561(interfaceC8561.mo18329()));
        printStream.print(stringBuffer.toString());
        if (interfaceC8561.mo18334()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("->");
            stringBuffer2.append(interfaceC8561.mo18348());
            printStream.println(stringBuffer2.toString());
            return;
        }
        if (!interfaceC8561.mo18341()) {
            printStream.println();
            return;
        }
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3.append("->[");
        stringBuffer3.append(interfaceC8561.getText());
        stringBuffer3.append("]");
        printStream.println(stringBuffer3.toString());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static void m24390(InterfaceC8561 interfaceC8561, int i) throws Exception {
        while (interfaceC8561.hasNext()) {
            m24389(interfaceC8561, i);
            interfaceC8561.next();
        }
    }

    @Override // Yue.C7017, Yue.InterfaceC8561
    public boolean hasNext() throws C8559 {
        if (this.f23061) {
            return super.hasNext();
        }
        return false;
    }

    @Override // Yue.C7017, Yue.InterfaceC8561
    public int next() throws C8559 {
        if (this.f23060 <= 0) {
            this.f23061 = false;
        }
        int next = super.next();
        if (mo18328()) {
            this.f23060++;
        }
        if (mo18326()) {
            this.f23060--;
        }
        return next;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public boolean m24391() throws C8559 {
        if (mo18326()) {
            return true;
        }
        while (hasNext()) {
            if (mo18326()) {
                return true;
            }
            next();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public boolean m24392(String str) throws C8559 {
        if (str == null) {
            return false;
        }
        while (m24391()) {
            if (str.equals(mo18348())) {
                return true;
            }
            if (!hasNext()) {
                return false;
            }
            next();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public boolean m24393(String str, String str2) throws C8559 {
        if (str != null && str2 != null) {
            while (m24392(str)) {
                if (str2.equals(mo18325())) {
                    return true;
                }
                if (!hasNext()) {
                    return false;
                }
                next();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public boolean m24394() throws C8559 {
        if (mo18328()) {
            return true;
        }
        while (hasNext()) {
            if (mo18328()) {
                return true;
            }
            next();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public boolean m24395(String str) throws C8559 {
        if (str == null) {
            return false;
        }
        while (m24394()) {
            if (str.equals(mo18348())) {
                return true;
            }
            if (!hasNext()) {
                return false;
            }
            next();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public boolean m24396(String str, String str2) throws C8559 {
        if (str != null && str2 != null) {
            while (m24395(str)) {
                if (str2.equals(mo18325())) {
                    return true;
                }
                if (!hasNext()) {
                    return false;
                }
                next();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public int m24397() throws C8559 {
        next();
        while (hasNext() && !mo18328() && !mo18326()) {
            next();
        }
        return super.mo18329();
    }
}
