package p385zf;

import java.io.Serializable;
import java.util.RandomAccess;
import tf.AbstractC4159f;
import tf.AbstractC4165l;
import tf.C4153c;

/* JADX INFO: renamed from: zf.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6143b extends AbstractC4159f implements InterfaceC6142a, RandomAccess, Serializable {

    /* JADX INFO: renamed from: g */
    public final Enum[] f24739g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6143b(Enum[] enumArr) {
        this.f24739g = enumArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r32 = (Enum) obj;
        return ((Enum) AbstractC4165l.m8366C0(r32.ordinal(), this.f24739g)) == r32;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        C4153c c4153c = AbstractC4159f.Companion;
        Enum[] enumArr = this.f24739g;
        int length = enumArr.length;
        c4153c.getClass();
        C4153c.m8345a(i9, length);
        return enumArr[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public final int getSize() {
        return this.f24739g.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) AbstractC4165l.m8366C0(iOrdinal, this.f24739g)) == r42) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r42 = (Enum) obj;
        int iOrdinal = r42.ordinal();
        if (((Enum) AbstractC4165l.m8366C0(iOrdinal, this.f24739g)) == r42) {
            return iOrdinal;
        }
        return -1;
    }
}
