package p314vb;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: vb.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8915v implements Externalizable {

    /* JADX INFO: renamed from: s */
    public static final a f29519s = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: q */
    public long f29520q;

    /* JADX INFO: renamed from: r */
    public int f29521r;

    public C8915v(long j10, int i10) {
        this.f29520q = j10;
        this.f29521r = i10;
    }

    private final Object readResolve() {
        return C8904k.f29505s.m34179b(this.f29520q, this.f29521r);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        objectInput.getClass();
        this.f29520q = objectInput.readLong();
        this.f29521r = objectInput.readInt();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeLong(this.f29520q);
        objectOutput.writeInt(this.f29521r);
    }

    /* JADX INFO: renamed from: vb.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
