package io.ktor.server.engine;

import androidx.profileinstaller.AbstractC2442;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC5433;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\f"}, d2 = {"io/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooLong", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooLong;", "", "expected", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(J)V", "createCopy", "()Lio/ktor/server/engine/BaseApplicationResponse$BodyLengthIsTooLong;", "J", "ktor-server-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BaseApplicationResponse$BodyLengthIsTooLong extends IllegalStateException implements InterfaceC5433 {
    private final long expected;

    public BaseApplicationResponse$BodyLengthIsTooLong(long j) {
        super(AbstractC2442.m4572(j, "Body.size is too long. Expected "));
        this.expected = j;
    }

    @Override // kotlinx.coroutines.InterfaceC5433
    public BaseApplicationResponse$BodyLengthIsTooLong createCopy() {
        BaseApplicationResponse$BodyLengthIsTooLong baseApplicationResponse$BodyLengthIsTooLong = new BaseApplicationResponse$BodyLengthIsTooLong(this.expected);
        baseApplicationResponse$BodyLengthIsTooLong.initCause(this);
        return baseApplicationResponse$BodyLengthIsTooLong;
    }
}
