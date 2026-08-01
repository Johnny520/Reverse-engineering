package p000;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class na0 {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f3255d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public WeakHashMap f3256a;

    /* JADX INFO: renamed from: b */
    public SparseArray f3257b;

    /* JADX INFO: renamed from: c */
    public WeakReference f3258c;

    /* JADX INFO: renamed from: a */
    public final View m1937a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f3256a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewM1937a = m1937a(viewGroup.getChildAt(childCount));
                if (viewM1937a != null) {
                    return viewM1937a;
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
