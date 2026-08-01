package p344xb;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: xb.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9482e implements Externalizable {

    /* JADX INFO: renamed from: s */
    public static final a f32215s = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: q */
    public long f32216q;

    /* JADX INFO: renamed from: r */
    public long f32217r;

    public C9482e(long j10, long j11) {
        this.f32216q = j10;
        this.f32217r = j11;
    }

    private final Object readResolve() {
        return C9479b.f32211s.m36927b(this.f32216q, this.f32217r);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.f32216q = objectInput.readLong();
        this.f32217r = objectInput.readLong();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeLong(this.f32216q);
        objectOutput.writeLong(this.f32217r);
    }

    /* JADX INFO: renamed from: xb.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
