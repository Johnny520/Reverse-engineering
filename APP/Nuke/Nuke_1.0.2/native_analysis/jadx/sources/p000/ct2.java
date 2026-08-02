package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ct2 implements Runnable {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1732h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ View f1733i;

    public /* synthetic */ ct2(View view, int i) {
        this.f1732h = i;
        this.f1733i = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ListView listView;
        Object x92Var;
        int positionForView;
        Object x92Var2;
        Object item;
        int i = this.f1732h;
        View view = this.f1733i;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            default:
                view.setTranslationX(0.0f);
                bx2.f1067d.getClass();
                String str2 = bx2.f1071h;
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
                    hi0 hi0VarM3241r = op0.m3602y(item).m3241r();
                    hi0VarM3241r.m6411b();
                    hi0VarM3241r.f13871b = "field_username";
                    Object objM3867g0 = ((pi0) AbstractC0142du.m1159o0(hi0VarM3241r.m2194c())).m3867g0();
                    x92Var2 = objM3867g0 instanceof String ? (String) objM3867g0 : null;
                    Throwable thM6237a = y92.m6237a(x92Var2);
                    if (thM6237a != null) {
                        hg3.m2166d(str2, "Unable to resolve swiped conversation: ".concat(fg1.m1624Q(thM6237a)));
                    }
                    str = (String) (x92Var2 instanceof x92 ? null : x92Var2);
                }
                if (str == null) {
                    return;
                }
                try {
                    v00.f11581d.getClass();
                    Method method = (Method) v00.f11585h.getValue();
                    qg1.f8960d.getClass();
                    method.invoke(qg1.m4186j(), str);
                    x92Var = a83.f116a;
                    break;
                } catch (Throwable th2) {
                    x92Var = new x92(th2);
                }
                Throwable thM6237a2 = y92.m6237a(x92Var);
                if (thM6237a2 != null) {
                    hg3.m2166d(str2, "Unable to delete conversation " + str + ": " + fg1.m1624Q(thM6237a2));
                    return;
                }
                return;
        }
    }
}
