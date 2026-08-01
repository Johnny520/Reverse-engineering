package io.ktor.server.application;

import androidx.activity.AbstractC0900;
import io.ktor.util.C5041;
import kotlin.Metadata;
import kotlinx.coroutines.InterfaceC6266;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m151d2 = {"Lio/ktor/server/application/MissingApplicationPluginException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lkotlinx/coroutines/飘花落叶言子楪兰苏世哲;", "Lio/ktor/util/飘花落叶言子楪世苏哲兰;", "key", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lio/ktor/util/飘花落叶言子楪世苏哲兰;)V", "createCopy", "()Lio/ktor/server/application/MissingApplicationPluginException;", "Lio/ktor/util/飘花落叶言子楪世苏哲兰;", "getKey", "()Lio/ktor/util/飘花落叶言子楪世苏哲兰;", "", "getMessage", "()Ljava/lang/String;", "message", "ktor-server-core"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class MissingApplicationPluginException extends IllegalStateException implements InterfaceC6266 {
    private final C5041 key;

    public MissingApplicationPluginException(C5041 c5041) {
        c5041.getClass();
        this.key = c5041;
    }

    @Override // kotlinx.coroutines.InterfaceC6266
    public MissingApplicationPluginException createCopy() {
        MissingApplicationPluginException missingApplicationPluginException = new MissingApplicationPluginException(this.key);
        missingApplicationPluginException.initCause(this);
        return missingApplicationPluginException;
    }

    public final C5041 getKey() {
        return this.key;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return AbstractC0900.m711(new StringBuilder("Application plugin "), this.key.f13044, " is not installed");
    }
}
