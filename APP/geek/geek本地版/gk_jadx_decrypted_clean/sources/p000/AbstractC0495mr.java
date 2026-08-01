package p000;

import android.widget.ListView;

/* JADX INFO: renamed from: mr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0495mr {
    /* JADX INFO: renamed from: a */
    public static boolean m1854a(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m1855b(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
