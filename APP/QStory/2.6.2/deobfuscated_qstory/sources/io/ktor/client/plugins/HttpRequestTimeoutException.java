package io.ktor.client.plugins;

import io.ktor.client.engine.AbstractC3878;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4384;
import kotlinx.coroutines.InterfaceC5433;
import net.bytebuddy.description.method.MethodDescription;
import p175.AbstractC7738;
import p236.C8100;
import p241.C8138;
import p241.C8139;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "", "url", "", "timeoutMillis", "", "cause", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)V", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;)V", "createCopy", "()Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/lang/String;", "Ljava/lang/Long;", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HttpRequestTimeoutException extends IOException implements InterfaceC5433 {
    private final Long timeoutMillis;
    private final String url;

    public HttpRequestTimeoutException(C8139 c8139) throws IOException {
        c8139.getClass();
        C8100 c8100 = c8139.f22462;
        c8100.m13545();
        StringBuilder sb = new StringBuilder(256);
        AbstractC7738.m13043(c8100, sb);
        String string = sb.toString();
        Map map = (Map) c8139.f22457.m8597(AbstractC3878.f12088);
        C3926 c3926 = (C3926) (map != null ? map.get(C3925.f12133) : null);
        this(string, c3926 != null ? c3926.f12136 : null, null, 4, null);
    }

    @Override // kotlinx.coroutines.InterfaceC5433
    public HttpRequestTimeoutException createCopy() {
        return new HttpRequestTimeoutException(this.url, this.timeoutMillis, getCause());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(C8138 c8138) {
        c8138.getClass();
        String str = c8138.f22456.f22326;
        C3926 c3926 = (C3926) c8138.m13563();
        this(str, c3926 != null ? c3926.f12136 : null, null, 4, null);
    }

    public /* synthetic */ HttpRequestTimeoutException(String str, Long l, Throwable th, int i, AbstractC4384 abstractC4384) {
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
