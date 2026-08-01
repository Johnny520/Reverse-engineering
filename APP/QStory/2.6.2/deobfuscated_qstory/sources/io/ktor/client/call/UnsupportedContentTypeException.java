package io.ktor.client.call;

import androidx.profileinstaller.AbstractC2442;
import io.ktor.http.content.AbstractC3986;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/client/call/UnsupportedContentTypeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UnsupportedContentTypeException extends IllegalStateException {
    public UnsupportedContentTypeException(AbstractC3986 abstractC3986) {
        abstractC3986.getClass();
        StringBuilder sb = new StringBuilder("Failed to write body: ");
        super(AbstractC2442.m4555(AbstractC4395.f12971, abstractC3986.getClass(), sb));
    }
}
