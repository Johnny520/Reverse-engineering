package p142j9;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: j9.n3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3719n3 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f10270a;

    /* JADX INFO: renamed from: b */
    public final int f10271b;

    /* JADX INFO: renamed from: c */
    public ClassLoader f10272c;

    public C3719n3(ClassLoader classLoader) {
        classLoader.getClass();
        this.f10270a = new WeakReference(classLoader);
        this.f10271b = System.identityHashCode(classLoader);
        this.f10272c = classLoader;
    }

    /* JADX INFO: renamed from: a */
    public final void m13841a(ClassLoader classLoader) {
        this.f10272c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3719n3) && this.f10270a.get() == ((C3719n3) obj).f10270a.get();
    }

    public int hashCode() {
        return this.f10271b;
    }

    public String toString() {
        String string;
        ClassLoader classLoader = (ClassLoader) this.f10270a.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
