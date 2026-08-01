package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import p015.C6204;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient C5754<?> response;

    public HttpException(C5754<?> c5754) {
        super(getMessage(c5754));
        C6204 c6204 = c5754.f15757;
        this.code = c6204.f17005;
        this.message = c6204.f17011;
        this.response = c5754;
    }

    private static String getMessage(C5754<?> c5754) {
        Objects.requireNonNull(c5754, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        C6204 c6204 = c5754.f15757;
        sb.append(c6204.f17005);
        sb.append(" ");
        sb.append(c6204.f17011);
        return sb.toString();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public C5754<?> response() {
        return this.response;
    }
}
