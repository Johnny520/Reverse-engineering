package Yue;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4273 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public String f777;

    /* JADX INFO: renamed from: ۥ۟ */
    public Object f778;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C4278 f8796;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String f8797;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4273() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4273)) {
            return false;
        }
        C4273 c4273 = (C4273) obj;
        String str = this.f777;
        if (str == null) {
            if (c4273.f777 != null) {
                return false;
            }
        } else if (!str.equals(c4273.f777)) {
            return false;
        }
        Object obj2 = this.f778;
        if (obj2 == null) {
            if (c4273.f778 != null) {
                return false;
            }
        } else if (!obj2.equals(c4273.f778)) {
            return false;
        }
        C4278 c4278 = this.f8796;
        if (c4278 == null) {
            if (c4273.f8796 != null) {
                return false;
            }
        } else if (!c4278.equals(c4273.f8796)) {
            return false;
        }
        String str2 = this.f8797;
        if (str2 == null) {
            if (c4273.f8797 != null) {
                return false;
            }
        } else if (!str2.equals(c4273.f8797)) {
            return false;
        }
        return true;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f777);
        stringBuffer.append(" ");
        printWriter.print(stringBuffer.toString());
        Object obj = this.f778;
        if (obj instanceof String) {
            printWriter.print(obj);
        } else if (obj instanceof C4282) {
            ((C4282) obj).mo1236(printWriter);
        } else if (obj instanceof C4289) {
            ((C4289) obj).mo1236(printWriter);
        }
        C4278 c4278 = this.f8796;
        if (c4278 != null) {
            c4278.mo1236(printWriter);
        }
        if (this.f8797 != null) {
            printWriter.print(" \"");
            printWriter.print(this.f8797);
            printWriter.print("\"");
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public C4278 m1239() {
        return this.f8796;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m12333() {
        return this.f8797;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m12334() {
        return this.f777;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Object m12335() {
        return this.f778;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m12336(C4278 c4278) {
        this.f8796 = c4278;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m12337(String str) {
        this.f8797 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m12338(String str) {
        this.f777 = str;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m12339(Object obj) {
        if (!(obj instanceof String) && !(obj instanceof C4282) && !(obj instanceof C4289)) {
            throw new IllegalArgumentException("Must be String, DTDEnumeration or DTDNotationList");
        }
        this.f778 = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4273(String str) {
        this.f777 = str;
    }
}
