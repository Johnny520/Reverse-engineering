package a;

/* JADX INFO: loaded from: classes.dex */
public final class Se implements java.lang.Iterable<android.content.Intent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList<android.content.Intent> f265a;
    public final a.E0 b;

    public interface a {
        android.content.Intent getSupportParentActivityIntent();
    }

    public Se(a.E0 r2) {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f265a = r0
            r1.b = r2
            return
    }

    @Override // java.lang.Iterable
    @java.lang.Deprecated
    public final java.util.Iterator<android.content.Intent> iterator() {
            r1 = this;
            java.util.ArrayList<android.content.Intent> r0 = r1.f265a
            java.util.Iterator r0 = r0.iterator()
            return r0
    }
}
