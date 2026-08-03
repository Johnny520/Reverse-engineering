package p364y8;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: y8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6003c implements Runnable {

    /* JADX INFO: renamed from: g */
    public int f24369g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C6004d f24370h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Activity f24371i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f24372j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC6003c(C6004d c6004d, Activity activity, int i9) {
        this.f24370h = c6004d;
        this.f24371i = activity;
        this.f24372j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        View viewFindViewById;
        C6004d c6004d = this.f24370h;
        Handler handler = c6004d.f24377c;
        WeakHashMap weakHashMap = c6004d.f24379e;
        WeakHashMap weakHashMap2 = c6004d.f24380f;
        WeakHashMap weakHashMap3 = c6004d.f24378d;
        boolean z9 = false;
        boolean z10 = c6004d.f24376b.getBoolean("auto_view_original_enable", false);
        Activity activity = this.f24371i;
        if (!z10 || activity.isFinishing() || activity.isDestroyed()) {
            Runnable runnable = (Runnable) weakHashMap3.remove(activity);
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            }
            weakHashMap.remove(activity);
            weakHashMap2.remove(activity);
            return;
        }
        Integer num = (Integer) weakHashMap.get(activity);
        if (num != null) {
            int iIntValue = num.intValue();
            int i9 = this.f24372j;
            if (iIntValue == i9 && ((set = (Set) weakHashMap2.get(activity)) == null || !set.contains(Integer.valueOf(i9)))) {
                List list = C6004d.f24373j;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int identifier = activity.getResources().getIdentifier((String) it.next(), "id", activity.getPackageName());
                        if ((identifier != 0 && (viewFindViewById = activity.findViewById(identifier)) != null && viewFindViewById.isShown() && viewFindViewById.isEnabled() && viewFindViewById.hasOnClickListeners() && viewFindViewById.getWidth() > 0 && viewFindViewById.getHeight() > 0 && viewFindViewById.getAlpha() > 0.0f) ? viewFindViewById.performClick() : false) {
                            z9 = true;
                            break;
                        }
                    }
                }
                if (z9) {
                    Object linkedHashSet = weakHashMap2.get(activity);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        weakHashMap2.put(activity, linkedHashSet);
                    }
                    ((Set) linkedHashSet).add(Integer.valueOf(i9));
                    weakHashMap3.remove(activity);
                    return;
                }
                int i10 = this.f24369g;
                long[] jArr = C6004d.f24374k;
                if (i10 >= jArr.length) {
                    weakHashMap3.remove(activity);
                    return;
                } else {
                    this.f24369g = i10 + 1;
                    handler.postDelayed(this, jArr[i10]);
                    return;
                }
            }
        }
        weakHashMap3.remove(activity);
    }
}
