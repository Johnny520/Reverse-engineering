package io.ktor.server.plugins;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5217;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m151d2 = {"Lio/ktor/server/plugins/NotFoundException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "ktor-server-core"}, m152k = 1, m153mv = {2, 0, 0}, m155xi = 48)
public final class NotFoundException extends Exception {
    public /* synthetic */ NotFoundException(String str, int i, AbstractC5217 abstractC5217) {
        this((i & 1) != 0 ? "Resource not found" : str);
    }

    public NotFoundException(String str) {
        super(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotFoundException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
