package p215oc;

import java.io.InputStream;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: oc.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5715j {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC5718m m23132a(InputStream inputStream) {
        inputStream.getClass();
        return new C5714i(inputStream);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m23133b(AssertionError assertionError) {
        assertionError.getClass();
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? AbstractC8621f0.m33126a0(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }
}
