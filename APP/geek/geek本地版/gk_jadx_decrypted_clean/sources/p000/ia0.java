package p000;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ia0 {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f2401d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public WeakHashMap f2402a;

    /* JADX INFO: renamed from: b */
    public SparseArray f2403b;

    /* JADX INFO: renamed from: c */
    public WeakReference f2404c;

    /* JADX INFO: renamed from: a */
    public final View m1424a(View view) {
        int size;
        WeakHashMap weakHashMap = this.f2402a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewM1424a = m1424a(viewGroup.getChildAt(childCount));
                if (viewM1424a != null) {
                    return viewM1424a;
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
