package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: p5 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0585p5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final View f3665a;

    /* JADX INFO: renamed from: b */
    public final String f3666b;

    /* JADX INFO: renamed from: c */
    public Method f3667c;

    /* JADX INFO: renamed from: d */
    public Context f3668d;

    public ViewOnClickListenerC0585p5(View view, String str) {
        this.f3665a = view;
        this.f3666b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f3667c == null) {
            View view2 = this.f3665a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f3666b;
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
                        this.f3667c = method;
                        this.f3668d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f3667c.invoke(this.f3668d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
