package p073k;

import java.util.Map;

/* JADX INFO: renamed from: k.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0737c implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Object f2494a;

    /* JADX INFO: renamed from: b */
    public final Object f2495b;

    /* JADX INFO: renamed from: c */
    public C0737c f2496c;

    /* JADX INFO: renamed from: d */
    public C0737c f2497d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0737c(Object obj, Object obj2) {
        this.f2494a = obj;
        this.f2495b = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0737c)) {
            return false;
        }
        C0737c c0737c = (C0737c) obj;
        return this.f2494a.equals(c0737c.f2494a) && this.f2495b.equals(c0737c.f2495b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f2494a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f2495b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f2494a.hashCode() ^ this.f2495b.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return this.f2494a + "=" + this.f2495b;
    }
}
