package p198n8;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5065a1;
import p185m8.AbstractC5112w;

/* JADX INFO: renamed from: n8.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5515h implements Externalizable {

    /* JADX INFO: renamed from: s */
    public static final a f17238s = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: q */
    public Collection f17239q;

    /* JADX INFO: renamed from: r */
    public final int f17240r;

    public C5515h(Collection collection, int i10) {
        collection.getClass();
        this.f17239q = collection;
        this.f17240r = i10;
    }

    private final Object readResolve() {
        return this.f17239q;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        Set setM20785a;
        objectInput.getClass();
        byte b10 = objectInput.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            C5516i.m22486a("Unsupported flags value: ", b10);
            return;
        }
        int i11 = objectInput.readInt();
        if (i11 < 0) {
            C5516i.m22486a("Illegal size value: ", i11);
            return;
        }
        int i12 = 0;
        if (i10 == 0) {
            List listM20788d = AbstractC5112w.m20788d(i11);
            while (i12 < i11) {
                listM20788d.add(objectInput.readObject());
                i12++;
            }
            setM20785a = AbstractC5112w.m20785a(listM20788d);
        } else {
            if (i10 != 1) {
                C5516i.m22486a("Unsupported collection type tag: ", i10);
                return;
            }
            Set setM20478c = AbstractC5065a1.m20478c(i11);
            while (i12 < i11) {
                setM20478c.add(objectInput.readObject());
                i12++;
            }
            setM20785a = AbstractC5065a1.m20476a(setM20478c);
        }
        this.f17239q = setM20785a;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.getClass();
        objectOutput.writeByte(this.f17240r);
        objectOutput.writeInt(this.f17239q.size());
        Iterator it = this.f17239q.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    /* JADX INFO: renamed from: n8.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
