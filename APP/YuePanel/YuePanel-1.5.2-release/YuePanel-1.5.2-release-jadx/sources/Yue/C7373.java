package Yue;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: Yue.ۥۣۡۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7373 implements Externalizable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1243 f22236 = new C1243(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long f22237 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public Map<?, ?> f22238;

    /* JADX INFO: renamed from: Yue.ۥۣۡۨ۠$ۥ */
    public static final class C1243 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۡۨ۠.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1243(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1243() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C7373(@InterfaceC6399 Map<?, ?> map) {
        C5499.m17103(map, "map");
        this.f22238 = map;
    }

    @Override // java.io.Externalizable
    public void readExternal(@InterfaceC6399 ObjectInput objectInput) throws IOException {
        C5499.m17103(objectInput, "input");
        byte b = objectInput.readByte();
        if (b != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b));
        }
        int i = objectInput.readInt();
        if (i < 0) {
            throw new InvalidObjectException("Illegal size value: " + i + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
        }
        Map mapM18566 = C5942.m18566(i);
        for (int i2 = 0; i2 < i; i2++) {
            mapM18566.put(objectInput.readObject(), objectInput.readObject());
        }
        this.f22238 = C5942.m18562(mapM18566);
    }

    @Override // java.io.Externalizable
    public void writeExternal(@InterfaceC6399 ObjectOutput objectOutput) throws IOException {
        C5499.m17103(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.f22238.size());
        for (Map.Entry<?, ?> entry : this.f22238.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final Object m3581() {
        return this.f22238;
    }

    public C7373() {
        this(C5943.m18584());
    }
}
