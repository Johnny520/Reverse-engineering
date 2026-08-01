package p198n8;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5107t0;

/* JADX INFO: renamed from: n8.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5517j implements Externalizable {

    /* JADX INFO: renamed from: r */
    public static final a f17241r = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: q */
    public Map f17242q;

    public C5517j(Map map) {
        map.getClass();
        this.f17242q = map;
    }

    private final Object readResolve() {
        return this.f17242q;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        objectInput.getClass();
        byte b10 = objectInput.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10));
        }
        int i10 = objectInput.readInt();
        if (i10 < 0) {
            C5516i.m22486a("Illegal size value: ", i10);
            return;
        }
        Map mapM20762d = AbstractC5107t0.m20762d(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapM20762d.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f17242q = AbstractC5107t0.m20760b(mapM20762d);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f17242q.size());
        for (Map.Entry entry : this.f17242q.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: n8.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
