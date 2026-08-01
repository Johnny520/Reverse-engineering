package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import p007.C6131;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient C5755<?> response;

    public HttpException(C5755<?> c5755) {
        super(getMessage(c5755));
        C6131 c6131 = c5755.f15757;
        this.code = c6131.f16766;
        this.message = c6131.f16772;
        this.response = c5755;
    }

    private static String getMessage(C5755<?> c5755) {
        Objects.requireNonNull(c5755, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        C6131 c6131 = c5755.f15757;
        sb.append(c6131.f16766);
        sb.append(" ");
        sb.append(c6131.f16772);
        return sb.toString();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public C5755<?> response() {
        return this.response;
    }
}
