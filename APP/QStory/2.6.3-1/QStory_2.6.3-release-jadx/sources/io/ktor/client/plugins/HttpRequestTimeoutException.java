package io.ktor.client.plugins;

import io.ktor.client.engine.AbstractC4711;
import java.io.IOException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5217;
import kotlinx.coroutines.InterfaceC6266;
import net.bytebuddy.description.method.MethodDescription;
import p252.C8930;
import p257.C8968;
import p257.C8969;
import p267.AbstractC9004;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014¨\u0006\u0015"}, m151d2 = {"Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/io/IOException;", "Lkotlinx/io/IOException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "", "url", "", "timeoutMillis", "", "cause", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Throwable;)V", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)V", "L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世哲苏兰;)V", "createCopy", "()Lio/ktor/client/plugins/HttpRequestTimeoutException;", "Ljava/lang/String;", "Ljava/lang/Long;", "ktor-client-core"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class HttpRequestTimeoutException extends IOException implements InterfaceC6266 {
    private final Long timeoutMillis;
    private final String url;

    public HttpRequestTimeoutException(C8969 c8969) throws IOException {
        c8969.getClass();
        C8930 c8930 = c8969.f22805;
        c8930.m14133();
        StringBuilder sb = new StringBuilder(256);
        AbstractC9004.m14190(c8930, sb);
        String string = sb.toString();
        Map map = (Map) c8969.f22800.m9146(AbstractC4711.f12438);
        C4759 c4759 = (C4759) (map != null ? map.get(C4758.f12483) : null);
        this(string, c4759 != null ? c4759.f12486 : null, null, 4, null);
    }

    @Override // kotlinx.coroutines.InterfaceC6266
    public HttpRequestTimeoutException createCopy() {
        return new HttpRequestTimeoutException(this.url, this.timeoutMillis, getCause());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpRequestTimeoutException(C8968 c8968) {
        c8968.getClass();
        String str = c8968.f22799.f22669;
        C4759 c4759 = (C4759) c8968.m14151();
        this(str, c4759 != null ? c4759.f12486 : null, null, 4, null);
    }

    public /* synthetic */ HttpRequestTimeoutException(String str, Long l, Throwable th, int i, AbstractC5217 abstractC5217) {
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
