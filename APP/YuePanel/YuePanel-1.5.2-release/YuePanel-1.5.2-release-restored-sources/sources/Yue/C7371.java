package Yue;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۣۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/SerializedCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
public final class C7371 implements Externalizable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1242 f22230 = new C1242(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final long f22231 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f22232 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f22233 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public Collection<?> f22234;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int f22235;

    /* JADX INFO: renamed from: Yue.ۥۣۡۨ$ۥ */
    public static final class C1242 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۡۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1242(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1242() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7371(@InterfaceC6399 Collection<?> collection, int i) {
        C5499.m17103(collection, "collection");
        this.f22234 = collection;
        this.f22235 = i;
    }

    @Override // java.io.Externalizable
    public void readExternal(@InterfaceC6399 ObjectInput objectInput) throws IOException {
        Collection<?> collectionM917;
        C5499.m17103(objectInput, "input");
        byte b = objectInput.readByte();
        int i = b & 1;
        if ((b & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b) + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
        int i2 = objectInput.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i2 + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
        int i3 = 0;
        if (i == 0) {
            List listM10714 = C3879.m10714(i2);
            while (i3 < i2) {
                listM10714.add(objectInput.readObject());
                i3++;
            }
            collectionM917 = C3879.m917(listM10714);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            }
            Set setM23119 = C7386.m23119(i2);
            while (i3 < i2) {
                setM23119.add(objectInput.readObject());
                i3++;
            }
            collectionM917 = C7386.m3593(setM23119);
        }
        this.f22234 = collectionM917;
    }

    @Override // java.io.Externalizable
    public void writeExternal(@InterfaceC6399 ObjectOutput objectOutput) throws IOException {
        C5499.m17103(objectOutput, "output");
        objectOutput.writeByte(this.f22235);
        objectOutput.writeInt(this.f22234.size());
        Iterator<?> it = this.f22234.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final Object m3579() {
        return this.f22234;
    }

    public C7371() {
        this(C3880.m10735(), 0);
    }
}
