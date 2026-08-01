package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: p5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0584p5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final View f3592a;

    /* JADX INFO: renamed from: b */
    public final String f3593b;

    /* JADX INFO: renamed from: c */
    public Method f3594c;

    /* JADX INFO: renamed from: d */
    public Context f3595d;

    public ViewOnClickListenerC0584p5(View view, String str) {
        this.f3592a = view;
        this.f3593b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f3594c == null) {
            View view2 = this.f3592a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f3593b;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f3594c = method;
                        this.f3595d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f3594c.invoke(this.f3595d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
