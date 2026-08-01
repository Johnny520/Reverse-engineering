package io.ktor.util.converters;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4385;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/util/converters/DataConversionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;)V", "ktor-utils"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DataConversionException extends Exception {
    public /* synthetic */ DataConversionException(String str, int i, AbstractC4385 abstractC4385) {
        this((i & 1) != 0 ? "Invalid data format" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataConversionException(String str) {
        super(str);
        str.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DataConversionException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
