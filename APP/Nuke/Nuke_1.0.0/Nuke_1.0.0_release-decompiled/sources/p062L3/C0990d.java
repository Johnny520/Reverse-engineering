package p062L3;

/* JADX INFO: renamed from: L3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0990d {
    public static final C0989c Companion = new C0989c();

    /* JADX INFO: renamed from: a */
    public final long f3060a;

    public C0990d(long j5) {
        this.f3060a = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0990d) && this.f3060a == ((C0990d) obj).f3060a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f3060a);
    }

    public final String toString() {
        return "ChatAvatarRotatorConf(duration=" + this.f3060a + ")";
    }

    public /* synthetic */ C0990d(long j5, int i5) {
        if ((i5 & 1) == 0) {
            this.f3060a = 1000L;
        } else {
            this.f3060a = j5;
        }
    }

    public /* synthetic */ C0990d() {
        this(1000L);
    }
}
