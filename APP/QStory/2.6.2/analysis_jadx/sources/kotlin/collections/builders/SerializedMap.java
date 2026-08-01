package kotlin.collections.builders;

import io.ktor.util.C4210;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC4338;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0003\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0016"}, d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "", "map", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/Map;)V", "()V", "", "readResolve", "()Ljava/lang/Object;", "Ljava/io/ObjectOutput;", "output", "Lkotlin/飘花落叶言子楪兰苏哲世;", "writeExternal", "(Ljava/io/ObjectOutput;)V", "Ljava/io/ObjectInput;", "input", "readExternal", "(Ljava/io/ObjectInput;)V", "Ljava/util/Map;", "Companion", "kotlin/collections/builders/飘花落叶言子楪苏兰哲世", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class SerializedMap implements Externalizable {
    public static final C4322 Companion = new C4322();
    private static final long serialVersionUID = 0;
    private Map<?, ?> map;

    public SerializedMap(Map<?, ?> map) {
        map.getClass();
        this.map = map;
    }

    private final Object readResolve() {
        return this.map;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        input.getClass();
        byte b = input.readByte();
        if (b != 0) {
            throw new InvalidObjectException(AbstractC6136.m11556(b, "Unsupported flags value: "));
        }
        int i = input.readInt();
        if (i < 0) {
            C4210.m8608(i, "Illegal size value: ");
            return;
        }
        MapBuilder mapBuilder = new MapBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            mapBuilder.put(input.readObject(), input.readObject());
        }
        this.map = mapBuilder.build();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        output.getClass();
        output.writeByte(0);
        output.writeInt(this.map.size());
        for (Map.Entry<?, ?> entry : this.map.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }

    public SerializedMap() {
        this(AbstractC4338.m8781());
    }
}
