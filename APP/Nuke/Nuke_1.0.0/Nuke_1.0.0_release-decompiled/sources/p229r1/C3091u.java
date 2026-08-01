package p229r1;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me.dartcv.nuke.R;

/* JADX INFO: renamed from: r1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C3091u {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f9807d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public WeakHashMap f9808a;

    /* JADX INFO: renamed from: b */
    public SparseArray f9809b;

    /* JADX INFO: renamed from: c */
    public WeakReference f9810c;

    /* JADX INFO: renamed from: a */
    public final View m5406a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f9808a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewM5406a = m5406a(viewGroup.getChildAt(childCount));
                if (viewM5406a != null) {
                    return viewM5406a;
                }
            }
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null || arrayList.size() - 1 < 0) {
            return null;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }
}
