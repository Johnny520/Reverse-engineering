package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5217;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\b@\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u00020\u0003X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m151d2 = {"Lkotlinx/serialization/json/JsonEncodingException;", "Lkotlinx/serialization/json/JsonException;", "shortMessage", "", "classSerialName", "hint", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getShortMessage", "()Ljava/lang/String;", "getClassSerialName", "getHint", "kotlinx-serialization-json"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public final class JsonEncodingException extends JsonException {
    private final String classSerialName;
    private final String hint;
    private final String shortMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(String str, String str2, String str3) {
        super(str.concat((str3 == null || AbstractC5976.m10731(str3)) ? "" : "\n".concat(str3)), null);
        str.getClass();
        this.shortMessage = str;
        this.classSerialName = str2;
        this.hint = str3;
    }

    public final String getClassSerialName() {
        return this.classSerialName;
    }

    @Override // kotlinx.serialization.json.JsonException
    public String getHint() {
        return this.hint;
    }

    @Override // kotlinx.serialization.json.JsonException
    public String getShortMessage() {
        return this.shortMessage;
    }

    public /* synthetic */ JsonEncodingException(String str, String str2, String str3, int i, AbstractC5217 abstractC5217) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
