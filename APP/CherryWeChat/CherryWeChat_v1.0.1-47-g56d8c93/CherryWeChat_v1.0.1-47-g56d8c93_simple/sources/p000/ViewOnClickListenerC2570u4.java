package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: u4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC2570u4 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final View f8914a;

    /* JADX INFO: renamed from: b */
    public final String f8915b;

    /* JADX INFO: renamed from: c */
    public Method f8916c;

    /* JADX INFO: renamed from: d */
    public Context f8917d;

    public ViewOnClickListenerC2570u4(View r1, String r2) {
        this.f8914a = r1;
        this.f8915b = r2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r6) {
        if (this.f8916c != null) goto L36;
        View r0 = this.f8914a;
        Context r1 = r0.getContext();
    L5:
        String r2 = this.f8915b;
        if (r1 == null) goto L17;
        if (r1.isRestricted() == true) goto L14;
        Method r22 = r1.getClass().getMethod(r2, new Class[]{View.class});     // Catch: NoSuchMethodException -> L33
        if (r22 == null) goto L14;
        this.f8916c = r22;     // Catch: NoSuchMethodException -> L33
        this.f8917d = r1;     // Catch: NoSuchMethodException -> L33
    L14:
        if ((r1 instanceof ContextWrapper) == true) goto L15;
        r1 = null;
        goto L5
    L15:
        r1 = ((ContextWrapper) r1).getBaseContext();
        goto L5
    L17:
        int r62 = r0.getId();
        if (r62 != (-1)) goto L20;
        String r63 = "";
    L22:
        throw new IllegalStateException("Could not find method " + r2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + r0.getClass() + r63);
    L20:
        r63 = " with id '" + r0.getContext().getResources().getResourceEntryName(r62) + "'";
    L36:
        this.f8916c.invoke(this.f8917d, new Object[]{r6});     // Catch: InvocationTargetException -> L25 IllegalAccessException -> L27
        return;
    L27:
        e = move-exception;
        throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
    L25:
        e = move-exception;
        throw new IllegalStateException("Could not execute method for android:onClick", e);
    }
}
