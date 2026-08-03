package Yue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.URL;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4281 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public String f787;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f788;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String f8807;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public AbstractC4284 f8808;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String f8809;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Object f8810;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4281() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4281)) {
            return false;
        }
        C4281 c4281 = (C4281) obj;
        String str = this.f787;
        if (str == null) {
            if (c4281.f787 != null) {
                return false;
            }
        } else if (!str.equals(c4281.f787)) {
            return false;
        }
        if (this.f788 != c4281.f788) {
            return false;
        }
        String str2 = this.f8807;
        if (str2 == null) {
            if (c4281.f8807 != null) {
                return false;
            }
        } else if (!str2.equals(c4281.f8807)) {
            return false;
        }
        AbstractC4284 abstractC4284 = this.f8808;
        if (abstractC4284 == null) {
            if (c4281.f8808 != null) {
                return false;
            }
        } else if (!abstractC4284.equals(c4281.f8808)) {
            return false;
        }
        String str3 = this.f8809;
        if (str3 == null) {
            if (c4281.f8809 != null) {
                return false;
            }
        } else if (!str3.equals(c4281.f8809)) {
            return false;
        }
        return true;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print("<!ENTITY ");
        if (this.f788) {
            printWriter.print(" % ");
        }
        printWriter.print(this.f787);
        String str = this.f8807;
        if (str != null) {
            char c = C8039.f3212;
            if (str.indexOf(34) >= 0) {
                c = '\'';
            }
            printWriter.print(c);
            printWriter.print(this.f8807);
            printWriter.print(c);
        } else {
            this.f8808.mo1236(printWriter);
            if (this.f8809 != null) {
                printWriter.print(" NDATA ");
                printWriter.print(this.f8809);
            }
        }
        printWriter.println(">");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public AbstractC4284 m1242() {
        return this.f8808;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public String m12354() {
        return this.f8808.f790;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m12355() {
        return this.f787;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public String m12356() {
        return this.f8809;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Reader m12357() throws IOException {
        AbstractC4284 abstractC4284 = this.f8808;
        if (abstractC4284 == null) {
            return null;
        }
        return m12358(abstractC4284.f790);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Reader m12358(String str) {
        try {
            try {
                Object obj = this.f8810;
                if (obj != null) {
                    if (obj instanceof File) {
                        return new BufferedReader(new FileReader(new File((File) obj, str)));
                    }
                    if (obj instanceof URL) {
                        return new BufferedReader(new InputStreamReader(new URL((URL) this.f8810, str).openStream()));
                    }
                }
                return new BufferedReader(new FileReader(str));
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception unused2) {
            return new BufferedReader(new InputStreamReader(new URL(str).openStream()));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public String m12359() {
        return this.f8807;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m12360() {
        return this.f788;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m12361(AbstractC4284 abstractC4284) {
        this.f8808 = abstractC4284;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m12362(boolean z) {
        this.f788 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m12363(String str) {
        this.f787 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m12364(String str) {
        this.f8809 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m12365(String str) {
        this.f8807 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4281(String str) {
        this.f787 = str;
    }

    public C4281(String str, Object obj) {
        this.f787 = str;
        this.f8810 = obj;
    }
}
