package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ia0 {
    public static final ArrayList d = null;
    public WeakHashMap a;
    public SparseArray b;
    public WeakReference c;

    static {
        d = new ArrayList();
    }

    public final View a(View r4) {
        WeakHashMap r0 = this.a;
        if (r0 != null) goto L5;
        return null;
    L5:
        if (r0.containsKey(r4) == true) goto L8;
        return null;
    L8:
        if ((r4 instanceof ViewGroup) == false) goto L15;
        ViewGroup r02 = (ViewGroup) r4;
        int r1 = r02.getChildCount() - 1;
    L10:
        if (r1 < 0) goto L15;
        View r2 = a(r02.getChildAt(r1));
        if (r2 != null) goto L13;
        r1 = r1 - 1;
        goto L10
    L13:
        return r2;
    L15:
        ArrayList r42 = (ArrayList) r4.getTag(R.id.tag_unhandled_key_listeners);
        if (r42 == null) goto L26;
        int r03 = r42.size() - 1;
        if (r03 < 0) goto L28;
        r42.get(r03).getClass();
        throw new ClassCastException();
    L28:
        return null;
    L26:
        return null;
    }
}
