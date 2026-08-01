package kotlinx.serialization;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0013\b@\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\bV\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, m151d2 = {"Lkotlinx/serialization/UnknownFieldException;", "Lkotlinx/serialization/SerializationException;", "message", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "index", "", "(I)V", "kotlinx-serialization-core"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        this(AbstractC7012.m12147(i, "An unknown field for index "));
    }

    public UnknownFieldException(String str) {
        super(str);
    }
}
