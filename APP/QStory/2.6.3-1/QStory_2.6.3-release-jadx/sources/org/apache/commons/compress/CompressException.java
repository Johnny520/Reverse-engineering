package org.apache.commons.compress;

import androidx.window.area.AbstractC3400;
import java.io.IOException;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class CompressException extends IOException {
    private static final long serialVersionUID = 1;

    public CompressException() {
    }

    public static <T, E extends Throwable> T requireNonNull(Class<? super E> cls, T t, Supplier<String> supplier) {
        if (t == null) {
            try {
                cls.getConstructor(String.class).newInstance(AbstractC3400.m5648(supplier));
                return t;
            } catch (ReflectiveOperationException | SecurityException e) {
                new CompressException((String) AbstractC3400.m5648(supplier), e);
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
