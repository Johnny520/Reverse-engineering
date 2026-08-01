package io.ktor.client.plugins;

import io.ktor.client.engine.AbstractC3879;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4385;
import kotlinx.coroutines.InterfaceC5434;
import net.bytebuddy.description.method.MethodDescription;
import p236.C8101;
import p241.C8139;
import p241.C8140;
import p251.AbstractC8175;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "", "url", "", "timeoutMillis", "", "cause", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)V", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;)V", "createCopy", "()Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/lang/String;", "Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpRequestTimeoutException extends IOException implements InterfaceC5434 {
    private final Long timeoutMillis;
    private final String url;

    public HttpRequestTimeoutException(C8140 c8140) throws IOException {
        c8140.getClass();
        C8101 c8101 = c8140.f22460;
        c8101.m13574();
        StringBuilder sb = new StringBuilder(256);
        AbstractC8175.m13631(c8101, sb);
        String string = sb.toString();
        Map map = (Map) c8140.f22455.m8587(AbstractC3879.f12093);
        C3927 c3927 = (C3927) (map != null ? map.get(C3926.f12138) : null);
        this(string, c3927 != null ? c3927.f12141 : null, null, 4, null);
    }

    @Override // kotlinx.coroutines.InterfaceC5434
    public HttpRequestTimeoutException createCopy() {
        return new HttpRequestTimeoutException(this.url, this.timeoutMillis, getCause());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(C8139 c8139) {
        c8139.getClass();
        String str = c8139.f22454.f22324;
        C3927 c3927 = (C3927) c8139.m13592();
        this(str, c3927 != null ? c3927.f12141 : null, null, 4, null);
    }

    public /* synthetic */ HttpRequestTimeoutException(String str, Long l, Throwable th, int i, AbstractC4385 abstractC4385) {
        this(str, l, (i & 4) != 0 ? null : th);
    }

    public HttpRequestTimeoutException(String str, Long l, Throwable th) {
        str.getClass();
        StringBuilder sb = new StringBuilder("Request timeout has expired [url=");
        sb.append(str);
        sb.append(", request_timeout=");
        sb.append(l == null ? "unknown" : l);
        sb.append(" ms]");
        super(sb.toString(), th);
        this.url = str;
        this.timeoutMillis = l;
    }
}
