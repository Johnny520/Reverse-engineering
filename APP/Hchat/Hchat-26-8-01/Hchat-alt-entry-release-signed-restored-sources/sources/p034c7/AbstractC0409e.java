package p034c7;

import java.io.InputStream;
import p007a7.AbstractC0018a;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: c7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0409e {

    /* JADX INFO: renamed from: a */
    public final String f1108a;

    /* JADX INFO: renamed from: b */
    public String f1109b;

    /* JADX INFO: renamed from: c */
    public int f1110c = 8;

    /* JADX INFO: renamed from: d */
    public int f1111d = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC5999a.m10754q("AndroidManifest.xml");
        AbstractC5999a.m10754q("resources.arsc");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0409e(String str) {
        this.f1108a = str;
        this.f1109b = AbstractC0018a.m230R(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1368a() {
        String str = this.f1109b;
        return str != null ? str : this.f1108a;
    }

    /* JADX INFO: renamed from: b */
    public abstract InputStream mo1367b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC0409e) {
            return this.f1108a.equals(((AbstractC0409e) obj).f1108a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1108a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return getClass().getSimpleName() + ": " + this.f1108a;
    }
}
