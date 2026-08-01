package kotlinx.serialization.json;

import kotlin.InterfaceC5169;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B?\bA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u00020\u0003X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u00020\u0006X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/json/JsonDecodingException;", "Lkotlinx/serialization/json/JsonException;", "fullMessage", "", "shortMessage", "offset", "", "path", "input", "hint", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getShortMessage", "()Ljava/lang/String;", "getOffset", "()I", "getPath", "getInput", "getHint", "kotlinx-serialization-json"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JsonDecodingException extends JsonException {
    private final String hint;
    private final String input;
    private final int offset;
    private final String path;
    private final String shortMessage;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC5169
    public JsonDecodingException(String str, String str2, int i, String str3, String str4, String str5) {
        super(str, null);
        str.getClass();
        str2.getClass();
        this.shortMessage = str2;
        this.offset = i;
        this.path = str3;
        this.input = str4;
        this.hint = str5;
    }

    @Override // kotlinx.serialization.json.JsonException
    public String getHint() {
        return this.hint;
    }

    public final String getInput() {
        return this.input;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final String getPath() {
        return this.path;
    }

    @Override // kotlinx.serialization.json.JsonException
    public String getShortMessage() {
        return this.shortMessage;
    }
}
