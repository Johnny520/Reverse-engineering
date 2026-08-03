package p023b8;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import p077f8.AbstractC1089i;
import p379z7.C6112h;

/* JADX INFO: renamed from: b8.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0212j {

    /* JADX INFO: renamed from: g */
    public AbstractC0212j f518g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public int mo881a() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public AbstractC0212j mo873c() {
        return this.f518g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final AbstractC0212j m889d() {
        AbstractC0212j abstractC0212jMo873c = mo873c();
        return abstractC0212jMo873c != null ? abstractC0212jMo873c.m889d() : this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public int mo888g() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m890i(boolean z9) {
        StringWriter stringWriter = new StringWriter();
        try {
            mo874k(stringWriter, z9);
            stringWriter.flush();
            stringWriter.close();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Iterator iterator() {
        return C6112h.f24664g;
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo874k(StringWriter stringWriter, boolean z9);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder();
        AbstractC1089i.m2762d(sb2, sb3, this);
        return sb3.toString();
    }
}
