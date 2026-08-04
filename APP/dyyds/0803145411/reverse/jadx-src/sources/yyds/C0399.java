package yyds;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: yyds.ᛲᛷᛷᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0399 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final ExecutorC0183 f2100 = new ExecutorC0183();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public List f2101;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0052 f2102;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final C2133 f2103;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public int f2104;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final CopyOnWriteArrayList f2107 = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public List f2106 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final ExecutorC0183 f2105 = f2100;

    public C0399(C0052 c0052, C2133 c2133) {
        this.f2102 = c0052;
        this.f2103 = c2133;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m1155(Runnable runnable) {
        Iterator it = this.f2107.iterator();
        while (it.hasNext()) {
            AbstractC0387 abstractC0387 = ((C2806) it.next()).f13685;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1156(List list, RunnableC1880 runnableC1880) {
        int i = this.f2104 + 1;
        this.f2104 = i;
        List list2 = this.f2101;
        if (list == list2) {
            if (runnableC1880 != null) {
                runnableC1880.run();
                return;
            }
            return;
        }
        C0052 c0052 = this.f2102;
        if (list == null) {
            int size = list2.size();
            this.f2101 = null;
            this.f2106 = Collections.EMPTY_LIST;
            c0052.m383(0, size);
            m1155(runnableC1880);
            return;
        }
        if (list2 != null) {
            ((Executor) this.f2103.f10555).execute(new RunnableC0908(this, list2, list, i, runnableC1880));
            return;
        }
        this.f2101 = list;
        this.f2106 = Collections.unmodifiableList(list);
        c0052.m392(0, list.size());
        m1155(runnableC1880);
    }
}
