package p000;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: xE */
/* JADX INFO: loaded from: classes.dex */
public final class C2709xE {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f9284a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m5282a() {
        for (AbstractC2580uE abstractC2580uE : this.f9284a.values()) {
            abstractC2580uE.f8940c = true;
            HashMap map = abstractC2580uE.f8938a;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = abstractC2580uE.f8938a.values().iterator();
                        while (it.hasNext()) {
                            AbstractC2580uE.m5082a(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC2580uE.f8939b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = abstractC2580uE.f8939b.iterator();
                        while (it2.hasNext()) {
                            AbstractC2580uE.m5082a((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
                abstractC2580uE.f8939b.clear();
            }
            abstractC2580uE.mo297b();
        }
        this.f9284a.clear();
    }
}
