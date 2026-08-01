package io.ktor.server.engine;

import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC5434;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"io/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;", "", "expected", "actual", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJ)V", "createCopy", "()Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooSmall;", "J", "ktor-server-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BaseApplicationResponse$BodyLengthIsTooSmall extends IllegalStateException implements InterfaceC5434 {
    private final long actual;
    private final long expected;

    public BaseApplicationResponse$BodyLengthIsTooSmall(long j, long j2) {
        super("Body.size is too small. Body: " + j2 + ", Content-Length: " + j);
        this.expected = j;
        this.actual = j2;
    }

    @Override // kotlinx.coroutines.InterfaceC5434
    public BaseApplicationResponse$BodyLengthIsTooSmall createCopy() {
        BaseApplicationResponse$BodyLengthIsTooSmall baseApplicationResponse$BodyLengthIsTooSmall = new BaseApplicationResponse$BodyLengthIsTooSmall(this.expected, this.actual);
        baseApplicationResponse$BodyLengthIsTooSmall.initCause(this);
        return baseApplicationResponse$BodyLengthIsTooSmall;
    }
}
