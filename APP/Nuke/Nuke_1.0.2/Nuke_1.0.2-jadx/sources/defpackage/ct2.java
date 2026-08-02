package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct2 implements Runnable {
    public final /* synthetic */ int h;
    public final /* synthetic */ View i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ ct2(View view, int i) {
        this.h = i;
        this.i = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ListView listView;
        Object x92Var;
        int positionForView;
        Object x92Var2;
        Object item;
        int i = this.h;
        View view = this.i;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                view.setTranslationX(0.0f);
                bx2.d.getClass();
                String str2 = bx2.h;
                ViewParent parent = view.getParent();
                while (true) {
                    str = null;
                    str = null;
                    if (parent == null) {
                        listView = null;
                    } else if (parent instanceof ListView) {
                        listView = (ListView) parent;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (listView != null && (positionForView = listView.getPositionForView(view)) >= 0) {
                    try {
                        ListAdapter adapter = listView.getAdapter();
                        item = adapter != null ? adapter.getItem(positionForView) : null;
                    } catch (Throwable th) {
                        x92Var2 = new x92(th);
                    }
                    if (item == null) {
                        throw new IllegalArgumentException(("Conversation adapter returned null at position " + positionForView).toString());
                    }
                    hi0 hi0VarR = op0.y(item).r();
                    hi0VarR.b();
                    hi0VarR.b = "field_username";
                    Object objG0 = ((pi0) du.o0(hi0VarR.c())).g0();
                    x92Var2 = objG0 instanceof String ? (String) objG0 : null;
                    Throwable thA = y92.a(x92Var2);
                    if (thA != null) {
                        hg3.d(str2, "Unable to resolve swiped conversation: ".concat(fg1.Q(thA)));
                    }
                    str = (String) (x92Var2 instanceof x92 ? null : x92Var2);
                }
                if (str == null) {
                    return;
                }
                try {
                    v00.d.getClass();
                    Method method = (Method) v00.h.getValue();
                    qg1.d.getClass();
                    method.invoke(qg1.j(), str);
                    x92Var = a83.a;
                    break;
                } catch (Throwable th2) {
                    x92Var = new x92(th2);
                }
                Throwable thA2 = y92.a(x92Var);
                if (thA2 != null) {
                    hg3.d(str2, "Unable to delete conversation " + str + ": " + fg1.Q(thA2));
                    return;
                }
                return;
        }
    }
}
