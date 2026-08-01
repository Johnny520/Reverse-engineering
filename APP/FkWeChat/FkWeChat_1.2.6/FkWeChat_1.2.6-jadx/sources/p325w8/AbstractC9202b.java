package p325w8;

import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import p172l8.AbstractC4693f;

/* JADX INFO: renamed from: w8.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9202b {
    /* JADX INFO: renamed from: a */
    public static final void m35830a(Closeable closeable, Throwable th) throws IllegalAccessException, IOException, InvocationTargetException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC4693f.m18753a(th, th2);
            }
        }
    }
}
