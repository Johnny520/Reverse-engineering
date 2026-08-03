package p000a;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: a.Fg */
/* JADX INFO: loaded from: classes.dex */
public final class C0109Fg {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f369a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m292a() {
        for (AbstractC0073Dg abstractC0073Dg : this.f369a.values()) {
            abstractC0073Dg.f245c = true;
            HashMap map = abstractC0073Dg.f243a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = abstractC0073Dg.f243a.values().iterator();
                        while (it.hasNext()) {
                            AbstractC0073Dg.m173a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC0073Dg.f244b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = abstractC0073Dg.f244b.iterator();
                        while (it2.hasNext()) {
                            AbstractC0073Dg.m173a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            abstractC0073Dg.mo174b();
        }
        this.f369a.clear();
    }
}
