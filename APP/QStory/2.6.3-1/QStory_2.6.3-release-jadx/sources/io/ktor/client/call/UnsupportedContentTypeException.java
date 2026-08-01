package io.ktor.client.call;

import androidx.profileinstaller.AbstractC3275;
import io.ktor.http.content.AbstractC4819;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5228;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m151d2 = {"Lio/ktor/client/call/UnsupportedContentTypeException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;", "content", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lio/ktor/http/content/飘花落叶言子楪哲世苏兰;)V", "ktor-client-core"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class UnsupportedContentTypeException extends IllegalStateException {
    public UnsupportedContentTypeException(AbstractC4819 abstractC4819) {
        abstractC4819.getClass();
        StringBuilder sb = new StringBuilder("Failed to write body: ");
        super(AbstractC3275.m5135(AbstractC5228.f13320, abstractC4819.getClass(), sb));
    }
}
