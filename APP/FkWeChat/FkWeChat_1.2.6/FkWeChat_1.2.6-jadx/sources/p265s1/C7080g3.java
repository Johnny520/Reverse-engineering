package p265s1;

import p024b9.AbstractC1043k;
import p250r1.C6455e;

/* JADX INFO: renamed from: s1.g3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7080g3 {

    /* JADX INFO: renamed from: d */
    public static final a f23551d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final C7080g3 f23552e = new C7080g3(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a */
    public final long f23553a;

    /* JADX INFO: renamed from: b */
    public final long f23554b;

    /* JADX INFO: renamed from: c */
    public final float f23555c;

    public /* synthetic */ C7080g3(long j10, long j11, float f10, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? AbstractC7138s1.m28200d(4278190080L) : j10, (i10 & 2) != 0 ? C6455e.f20314b.m25569c() : j11, (i10 & 4) != 0 ? 0.0f : f10, null);
    }

    /* JADX INFO: renamed from: b */
    public final float m27889b() {
        return this.f23555c;
    }

    /* JADX INFO: renamed from: c */
    public final long m27890c() {
        return this.f23553a;
    }

    /* JADX INFO: renamed from: d */
    public final long m27891d() {
        return this.f23554b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7080g3)) {
            return false;
        }
        C7080g3 c7080g3 = (C7080g3) obj;
        return C7128q1.m28131q(this.f23553a, c7080g3.f23553a) && C6455e.m25556j(this.f23554b, c7080g3.f23554b) && this.f23555c == c7080g3.f23555c;
    }

    public int hashCode() {
        return (((C7128q1.m28137w(this.f23553a) * 31) + C6455e.m25561o(this.f23554b)) * 31) + Float.hashCode(this.f23555c);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) C7128q1.m28138x(this.f23553a)) + ", offset=" + ((Object) C6455e.m25565s(this.f23554b)) + ", blurRadius=" + this.f23555c + ')';
    }

    /* JADX INFO: renamed from: s1.g3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C7080g3 m27892a() {
            return C7080g3.f23552e;
        }

        public a() {
        }
    }

    public C7080g3(long j10, long j11, float f10) {
        this.f23553a = j10;
        this.f23554b = j11;
        this.f23555c = f10;
    }

    public /* synthetic */ C7080g3(long j10, long j11, float f10, AbstractC1043k abstractC1043k) {
        this(j10, j11, f10);
    }
}
