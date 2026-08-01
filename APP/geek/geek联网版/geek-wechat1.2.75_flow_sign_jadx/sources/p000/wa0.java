package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class wa0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f5077a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m2603a() {
        for (ua0 ua0Var : this.f5077a.values()) {
            HashMap map = ua0Var.f4673a;
            if (map != null) {
                synchronized (map) {
                    try {
                        for (Object obj : ua0Var.f4673a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = ua0Var.f4674b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : ua0Var.f4674b) {
                            if (closeable != null) {
                                try {
                                    closeable.close();
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            ua0Var.mo651a();
        }
        this.f5077a.clear();
    }
}
