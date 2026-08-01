package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.lifecycle.P */
/* JADX INFO: loaded from: classes.dex */
public final class C0464P {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f1501a = new LinkedHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m919a() {
        for (AbstractC0460L abstractC0460L : this.f1501a.values()) {
            abstractC0460L.f1493c = true;
            HashMap map = abstractC0460L.f1491a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = abstractC0460L.f1491a.values().iterator();
                        while (it.hasNext()) {
                            AbstractC0460L.m917a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC0460L.f1492b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = abstractC0460L.f1492b.iterator();
                        while (it2.hasNext()) {
                            AbstractC0460L.m917a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            abstractC0460L.mo339b();
        }
        this.f1501a.clear();
    }
}
