package p336x3;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p055e.AbstractC1960a;

/* JADX INFO: renamed from: x3.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C9386f {

    /* JADX INFO: renamed from: a */
    public final Runnable f31965a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArrayList f31966b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    public final Map f31967c = new HashMap();

    public C9386f(Runnable runnable) {
        this.f31965a = runnable;
    }

    /* JADX INFO: renamed from: a */
    public void m36522a(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f31966b.iterator();
        if (it.hasNext()) {
            AbstractC1960a.m7104a(it.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m36523b(Menu menu) {
        Iterator it = this.f31966b.iterator();
        if (it.hasNext()) {
            AbstractC1960a.m7104a(it.next());
            throw null;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m36524c(MenuItem menuItem) {
        Iterator it = this.f31966b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        AbstractC1960a.m7104a(it.next());
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public void m36525d(Menu menu) {
        Iterator it = this.f31966b.iterator();
        if (it.hasNext()) {
            AbstractC1960a.m7104a(it.next());
            throw null;
        }
    }
}
