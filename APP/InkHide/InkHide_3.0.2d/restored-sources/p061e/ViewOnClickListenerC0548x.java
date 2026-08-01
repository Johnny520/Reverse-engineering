package p061e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: e.x */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0548x implements View.OnClickListener {

    /* JADX INFO: renamed from: b */
    public final View f1847b;

    /* JADX INFO: renamed from: c */
    public final String f1848c;

    /* JADX INFO: renamed from: d */
    public Method f1849d;

    /* JADX INFO: renamed from: e */
    public Context f1850e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ViewOnClickListenerC0548x(View view, String str) {
        this.f1847b = view;
        this.f1848c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f1849d == null) {
            View view2 = this.f1847b;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f1848c;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbM357m = AbstractC0174d.m357m("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbM357m.append(view2.getClass());
                    sbM357m.append(str);
                    throw new IllegalStateException(sbM357m.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f1849d = method;
                        this.f1850e = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f1849d.invoke(this.f1850e, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
