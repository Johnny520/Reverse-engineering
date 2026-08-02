package p000;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class va3 {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f11868d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public WeakHashMap f11869a;

    /* JADX INFO: renamed from: b */
    public SparseArray f11870b;

    /* JADX INFO: renamed from: c */
    public WeakReference f11871c;

    /* JADX INFO: renamed from: a */
    public final View m5662a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f11869a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View viewM5662a = m5662a(viewGroup.getChildAt(childCount));
                    if (viewM5662a != null) {
                        return viewM5662a;
                    }
                }
            }
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null && arrayList.size() - 1 >= 0) {
                arrayList.get(size).getClass();
                c80.m664g();
            }
        }
        return null;
    }
}
