package org.apache.commons.compress;

import com.bumptech.glide.AbstractC3054;
import java.io.IOException;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class CompressException extends IOException {
    private static final long serialVersionUID = 1;

    public CompressException() {
    }

    public static <T, E extends Throwable> T requireNonNull(Class<? super E> cls, T t, Supplier<String> supplier) {
        if (t == null) {
            try {
                cls.getConstructor(String.class).newInstance(AbstractC3054.m6608(supplier));
                return t;
            } catch (ReflectiveOperationException | SecurityException e) {
                new CompressException((String) AbstractC3054.m6608(supplier), e);
            }
        }
        return t;
    }

    public CompressException(String str) {
        super(str);
    }

    public CompressException(String str, Throwable th) {
        super(str, th);
    }

    public CompressException(Throwable th) {
        super(th);
    }
}
