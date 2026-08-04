package yyds;

import android.app.Activity;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲁᛷᲁᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2282 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C1155 f11222;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C1633 f11223;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ Iterator f11224;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ C0805 f11225;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Activity f11226;

    public RunnableC2282(C1633 c1633, Iterator it, Activity activity, C1155 c1155, C0805 c0805) {
        this.f11223 = c1633;
        this.f11224 = it;
        this.f11226 = activity;
        this.f11222 = c1155;
        this.f11225 = c0805;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        Activity activity;
        loop0: do {
            list = null;
            while (true) {
                Iterator it = this.f11224;
                boolean zHasNext = it.hasNext();
                activity = this.f11226;
                if (!zHasNext) {
                    break loop0;
                }
                list = (List) it.next();
                if (list != null && !list.isEmpty()) {
                    break;
                }
            }
        } while (AbstractC1917.m3701(activity, list));
        if (list == null || list.isEmpty()) {
            AbstractC1143.f5238.postDelayed(new RunnableC0309(14, this.f11223), 100L);
            return;
        }
        ((AbstractC0333) list.get(0)).getClass();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((AbstractC0333) it2.next()).getClass();
        }
        C1633.m3330(activity, list, this.f11222, this.f11225, this);
    }
}
