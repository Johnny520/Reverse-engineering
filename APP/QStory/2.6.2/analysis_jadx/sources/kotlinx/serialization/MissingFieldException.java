package kotlinx.serialization;

import java.util.List;
import kotlin.InterfaceC5168;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p253.AbstractC8189;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B5\bB\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nB\u001f\bV\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000bB\u0019\bV\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\rB+\bW\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000eB\u0011\bQ\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003H\u0080\u0080\u0004¢\u0006\u0002\b\u0016R\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "message", "", "cause", "", "missingFields", "", "serialName", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/Throwable;Ljava/util/List;Ljava/lang/String;)V", "(Ljava/util/List;Ljava/lang/String;)V", "missingField", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/String;)V", "getMissingFields", "()Ljava/util/List;", "getSerialName", "()Ljava/lang/String;", "withNewMessageInternal", "newMessage", "withNewMessageInternal$kotlinx_serialization_core", "kotlinx-serialization-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MissingFieldException extends SerializationException {
    private final List<String> missingFields;
    private final String serialName;

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(List<String> list, String str) {
        String str2;
        list.getClass();
        str.getClass();
        if (list.size() == 1) {
            str2 = "Field '" + list.get(0) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(str2, null, list, str);
    }

    public final List<String> getMissingFields() {
        return this.missingFields;
    }

    public final String getSerialName() {
        return this.serialName;
    }

    public final MissingFieldException withNewMessageInternal$kotlinx_serialization_core(String newMessage) {
        newMessage.getClass();
        return new MissingFieldException(newMessage, this, this.missingFields, this.serialName);
    }

    private MissingFieldException(String str, Throwable th, List<String> list, String str2) {
        super(str, th);
        this.missingFields = list;
        this.serialName = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(String str, String str2) {
        this("Field '" + str + "' is required for type with serial name '" + str2 + "', but it was missing", null, AbstractC8189.m13660(str), str2);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5168
    public MissingFieldException(List<String> list, String str, Throwable th) {
        this(str, th, list, null);
        list.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC5168
    public /* synthetic */ MissingFieldException(String str) {
        this("Field '" + str + "' is required, but it was missing", null, AbstractC8189.m13660(str), null);
        str.getClass();
    }
}
