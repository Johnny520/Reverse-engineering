package p000;

import android.widget.ListView;

/* JADX INFO: renamed from: qr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0643qr {
    /* JADX INFO: renamed from: a */
    public static boolean m2157a(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    /* JADX INFO: renamed from: b */
    public static void m2158b(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
