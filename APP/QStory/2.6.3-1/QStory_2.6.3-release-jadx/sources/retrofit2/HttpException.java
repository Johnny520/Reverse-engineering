package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import p023.C6960;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient C6585<?> response;

    public HttpException(C6585<?> c6585) {
        super(getMessage(c6585));
        C6960 c6960 = c6585.f16102;
        this.code = c6960.f17111;
        this.message = c6960.f17117;
        this.response = c6585;
    }

    private static String getMessage(C6585<?> c6585) {
        Objects.requireNonNull(c6585, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        C6960 c6960 = c6585.f16102;
        sb.append(c6960.f17111);
        sb.append(" ");
        sb.append(c6960.f17117);
        return sb.toString();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public C6585<?> response() {
        return this.response;
    }
}
