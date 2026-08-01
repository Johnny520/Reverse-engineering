package p000;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ra0 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f4257a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m2285a() {
        for (pa0 pa0Var : this.f4257a.values()) {
            HashMap map = pa0Var.f3689a;
            if (map != null) {
                synchronized (map) {
                    try {
                        for (Object obj : pa0Var.f3689a.values()) {
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
            LinkedHashSet linkedHashSet = pa0Var.f3690b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : pa0Var.f3690b) {
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
            pa0Var.mo113a();
        }
        this.f4257a.clear();
    }
}
