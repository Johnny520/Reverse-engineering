package p099y;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.p055lu.wxmask272.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p090t0.AbstractC1008c;

/* JADX INFO: renamed from: y.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1047K {

    /* JADX INFO: renamed from: d */
    public static final ArrayList f3658d = new ArrayList();

    /* JADX INFO: renamed from: a */
    public WeakHashMap f3659a;

    /* JADX INFO: renamed from: b */
    public SparseArray f3660b;

    /* JADX INFO: renamed from: c */
    public WeakReference f3661c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m2280b(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((AbstractC1008c) ((InterfaceC1046J) arrayList.get(size))).m2208f(view, keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final View m2281a(View view, KeyEvent keyEvent) {
        WeakHashMap weakHashMap = this.f3659a;
        if (weakHashMap == null || !weakHashMap.containsKey(view)) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View viewM2281a = m2281a(viewGroup.getChildAt(childCount), keyEvent);
                if (viewM2281a != null) {
                    return viewM2281a;
                }
            }
        }
        if (m2280b(view, keyEvent)) {
            return view;
        }
        return null;
    }
}
