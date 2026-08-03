package Yue;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

/* JADX INFO: renamed from: Yue.ۥ۟ۨ۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C4279 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public String f785;

    /* JADX INFO: renamed from: ۥ۟ */
    public Hashtable f786 = new Hashtable();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public AbstractC4285 f8806;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4279() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4279)) {
            return false;
        }
        C4279 c4279 = (C4279) obj;
        String str = this.f785;
        if (str == null) {
            if (c4279.f785 != null) {
                return false;
            }
        } else if (!str.equals(c4279.f785)) {
            return false;
        }
        Hashtable hashtable = this.f786;
        if (hashtable == null) {
            if (c4279.f786 != null) {
                return false;
            }
        } else if (!hashtable.equals(c4279.f786)) {
            return false;
        }
        AbstractC4285 abstractC4285 = this.f8806;
        if (abstractC4285 == null) {
            if (c4279.f8806 != null) {
                return false;
            }
        } else if (!abstractC4285.equals(c4279.f8806)) {
            return false;
        }
        return true;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public void mo1236(PrintWriter printWriter) throws IOException {
        printWriter.print("<!ELEMENT ");
        printWriter.print(this.f785);
        printWriter.print(" ");
        AbstractC4285 abstractC4285 = this.f8806;
        if (abstractC4285 != null) {
            abstractC4285.mo1236(printWriter);
        } else {
            printWriter.print("ANY");
        }
        printWriter.println(">");
        printWriter.println();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public C4273 m1241(String str) {
        return (C4273) this.f786.get(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public AbstractC4285 m12349() {
        return this.f8806;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public String m12350() {
        return this.f785;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m12351(String str, C4273 c4273) {
        this.f786.put(str, c4273);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m12352(AbstractC4285 abstractC4285) {
        this.f8806 = abstractC4285;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m12353(String str) {
        this.f785 = str;
    }

    public C4279(String str) {
        this.f785 = str;
    }
}
