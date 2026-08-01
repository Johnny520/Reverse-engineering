package kotlin.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lkotlin/time/InstantSerialized;", "Ljava/io/Externalizable;", "", "epochSeconds", "", "nanosecondsOfSecond", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JI)V", "()V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", "output", "Lkotlin/飘花落叶言子楪兰苏哲世;", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "input", "readExternal", "(Ljava/io/ObjectInput;)V", "J", "getEpochSeconds", "()J", "setEpochSeconds", "(J)V", "I", "getNanosecondsOfSecond", "()I", "setNanosecondsOfSecond", "(I)V", "Companion", "kotlin/time/飘花落叶言子楪苏兰世哲", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class InstantSerialized implements Externalizable {
    public static final C5161 Companion = new C5161();
    private static final long serialVersionUID = 0;
    private long epochSeconds;
    private int nanosecondsOfSecond;

    public InstantSerialized(long j, int i) {
        this.epochSeconds = j;
        this.nanosecondsOfSecond = i;
    }

    private final Object readResolve() {
        C5153 c5153 = Instant.Companion;
        long j = this.epochSeconds;
        int i = this.nanosecondsOfSecond;
        c5153.getClass();
        return C5153.m10186(i, j);
    }

    public final long getEpochSeconds() {
        return this.epochSeconds;
    }

    public final int getNanosecondsOfSecond() {
        return this.nanosecondsOfSecond;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        input.getClass();
        this.epochSeconds = input.readLong();
        this.nanosecondsOfSecond = input.readInt();
    }

    public final void setEpochSeconds(long j) {
        this.epochSeconds = j;
    }

    public final void setNanosecondsOfSecond(int i) {
        this.nanosecondsOfSecond = i;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        output.getClass();
        output.writeLong(this.epochSeconds);
        output.writeInt(this.nanosecondsOfSecond);
    }

    public InstantSerialized() {
        this(0L, 0);
    }
}
