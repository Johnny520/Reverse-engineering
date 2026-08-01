package io.ktor.client.plugins.internal;

import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/ktor/client/plugins/internal/SaveBodyAbandonedReadException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "ktor-client-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SaveBodyAbandonedReadException extends RuntimeException {
    public SaveBodyAbandonedReadException() {
        super("Save body abandoned");
    }
}
