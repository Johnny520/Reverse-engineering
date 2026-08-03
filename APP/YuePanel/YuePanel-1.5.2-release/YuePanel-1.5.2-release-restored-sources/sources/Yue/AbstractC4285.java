package Yue;

import java.io.IOException;
import java.io.PrintWriter;

/* JADX INFO: renamed from: Yue.ۥ۟ۨۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4285 implements InterfaceC4290 {

    /* JADX INFO: renamed from: ۥ */
    public C4274 f791;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC4285() {
        this.f791 = C4274.f8798;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4285)) {
            return false;
        }
        AbstractC4285 abstractC4285 = (AbstractC4285) obj;
        C4274 c4274 = this.f791;
        if (c4274 == null) {
            if (abstractC4285.f791 != null) {
                return false;
            }
        } else if (!c4274.equals(abstractC4285.f791)) {
            return false;
        }
        return true;
    }

    @Override // Yue.InterfaceC4290
    /* JADX INFO: renamed from: ۥ */
    public abstract void mo1236(PrintWriter printWriter) throws IOException;

    /* JADX INFO: renamed from: ۥ۟ */
    public C4274 m1245() {
        return this.f791;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m12380(C4274 c4274) {
        this.f791 = c4274;
    }

    public AbstractC4285(C4274 c4274) {
        this.f791 = c4274;
    }
}
