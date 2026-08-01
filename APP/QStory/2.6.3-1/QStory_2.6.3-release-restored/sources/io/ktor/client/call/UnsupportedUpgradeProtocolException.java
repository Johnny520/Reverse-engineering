package io.ktor.client.call;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p252.C8922;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m151d2 = {"Lio/ktor/client/call/UnsupportedUpgradeProtocolException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;", "url", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(L飘花落叶言楪兰世哲子苏/飘花落叶言子世哲苏楪兰;)V", "ktor-client-core"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class UnsupportedUpgradeProtocolException extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnsupportedUpgradeProtocolException(C8922 c8922) {
        super("Unsupported upgrade protocol exception: " + c8922);
        c8922.getClass();
    }
}
