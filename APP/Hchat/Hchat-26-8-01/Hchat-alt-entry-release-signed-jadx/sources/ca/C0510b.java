package ca;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: ca.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0510b {

    /* JADX INFO: renamed from: a */
    public final Method f1560a;

    /* JADX INFO: renamed from: b */
    public final Method f1561b;

    /* JADX INFO: renamed from: c */
    public final Method f1562c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0510b(Method method, Method method2, Method method3) {
        this.f1560a = method;
        this.f1561b = method2;
        this.f1562c = method3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0510b)) {
            return false;
        }
        C0510b c0510b = (C0510b) obj;
        return this.f1560a.equals(c0510b.f1560a) && this.f1561b.equals(c0510b.f1561b) && this.f1562c.equals(c0510b.f1562c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f1562c.hashCode() + ((this.f1561b.hashCode() + (this.f1560a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ChatLivePhotoMethods(storageGetter=" + this.f1560a + ", recordQuery=" + this.f1561b + ", mediaFactory=" + this.f1562c + ")";
    }
}
