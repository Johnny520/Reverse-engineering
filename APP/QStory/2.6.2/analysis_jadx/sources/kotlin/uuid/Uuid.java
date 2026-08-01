package kotlin.uuid;

import com.bumptech.glide.AbstractC3065;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.C5178;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4384;
import kotlin.text.AbstractC5131;
import net.bytebuddy.description.method.MethodDescription;
import p052.InterfaceC6553;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u00015B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\nH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\f\u0010\rJ@\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00028\u00000\nH\u0087\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\u00162\n\u0010\u0015\u001a\u00060\u0013j\u0002`\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010#\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010 J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b&\u0010'J\u0018\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020\u0000H\u0097\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,R \u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R \u0010\u0006\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010-\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010/\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00066"}, d2 = {"Lkotlin/uuid/Uuid;", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "mostSignificantBits", "leastSignificantBits", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJ)V", "T", "Lkotlin/Function2;", "action", "toLongs", "(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)Ljava/lang/Object;", "Lkotlin/飘花落叶言子楪哲兰世苏;", "toULongs", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/ReadObjectParameterType;", "input", "Lkotlin/飘花落叶言子楪兰苏哲世;", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "toString", "()Ljava/lang/String;", "toHexDashString", "toHexString", "", "toByteArray", "()[B", "Lkotlin/飘花落叶言子楪哲世兰苏;", "toUByteArray-TcUX1vc", "toUByteArray", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "compareTo", "(Lkotlin/uuid/Uuid;)I", "hashCode", "()I", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "Companion", "kotlin/uuid/飘花落叶言子楪世苏哲兰", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class Uuid implements Comparable<Uuid>, Serializable {
    public static final C5165 Companion = new C5165();
    private static final Uuid NIL = new Uuid(0, 0);
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    private Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    private final void readObject(ObjectInputStream input) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final <T> T toLongs(InterfaceC6553 action) {
        action.getClass();
        return (T) action.invoke(Long.valueOf(getMostSignificantBits()), Long.valueOf(getLeastSignificantBits()));
    }

    private final <T> T toULongs(InterfaceC6553 action) {
        action.getClass();
        return (T) action.invoke(new C5178(getMostSignificantBits()), new C5178(getLeastSignificantBits()));
    }

    private final Object writeReplace() {
        return new UuidSerialized(getMostSignificantBits(), getLeastSignificantBits());
    }

    @Override // java.lang.Comparable
    public int compareTo(Uuid other) {
        other.getClass();
        long j = this.mostSignificantBits;
        long j2 = other.mostSignificantBits;
        return j != j2 ? Long.compareUnsigned(j, j2) : Long.compareUnsigned(this.leastSignificantBits, other.leastSignificantBits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) other;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        long j = this.mostSignificantBits;
        int i = 0;
        int i2 = 7;
        int i3 = 7;
        while (-1 < i3) {
            bArr[i] = (byte) (j >> (i3 << 3));
            i3--;
            i++;
        }
        long j2 = this.leastSignificantBits;
        int i4 = 8;
        while (-1 < i2) {
            bArr[i4] = (byte) (j2 >> (i2 << 3));
            i2--;
            i4++;
        }
        return bArr;
    }

    public final String toHexDashString() {
        byte[] bArr = new byte[36];
        AbstractC3065.m6824(0, 0, 4, this.mostSignificantBits, bArr);
        bArr[8] = 45;
        AbstractC3065.m6824(9, 4, 6, this.mostSignificantBits, bArr);
        bArr[13] = 45;
        AbstractC3065.m6824(14, 6, 8, this.mostSignificantBits, bArr);
        bArr[18] = 45;
        AbstractC3065.m6824(19, 0, 2, this.leastSignificantBits, bArr);
        bArr[23] = 45;
        AbstractC3065.m6824(24, 2, 8, this.leastSignificantBits, bArr);
        return new String(bArr, AbstractC5131.f14688);
    }

    public final String toHexString() {
        byte[] bArr = new byte[32];
        AbstractC3065.m6824(0, 0, 8, this.mostSignificantBits, bArr);
        AbstractC3065.m6824(16, 0, 8, this.leastSignificantBits, bArr);
        return new String(bArr, AbstractC5131.f14688);
    }

    public String toString() {
        return toHexDashString();
    }

    /* JADX INFO: renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m10204toUByteArrayTcUX1vc() {
        byte[] byteArray = toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    public /* synthetic */ Uuid(long j, long j2, AbstractC4384 abstractC4384) {
        this(j, j2);
    }

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }
}
