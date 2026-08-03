package p000a;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.C0983R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.u1 */
/* JADX INFO: loaded from: classes.dex */
public class C0851u1 {

    /* JADX INFO: renamed from: b */
    public static final Class<?>[] f3339b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f3340c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f3341d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f3342e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f3343f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f3344g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final C0598ge<String, Constructor<? extends View>> f3345h = new C0598ge<>();

    /* JADX INFO: renamed from: a */
    public final Object[] f3346a = new Object[2];

    /* JADX INFO: renamed from: a.u1$a */
    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final View f3347a;

        /* JADX INFO: renamed from: b */
        public final String f3348b;

        /* JADX INFO: renamed from: c */
        public Method f3349c;

        /* JADX INFO: renamed from: d */
        public Context f3350d;

        public a(View view, String str) {
            this.f3347a = view;
            this.f3348b = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String str;
            Method method;
            if (this.f3349c == null) {
                View view2 = this.f3347a;
                Context context = view2.getContext();
                while (true) {
                    String str2 = this.f3348b;
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
                            this.f3349c = method;
                            this.f3350d = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
                }
            }
            try {
                this.f3349c.invoke(this.f3350d, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public C0093F0 mo1971a(Context context, AttributeSet attributeSet) {
        return new C0093F0(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    public C0129H0 mo1972b(Context context, AttributeSet attributeSet) {
        return new C0129H0(context, attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public C0165J0 mo1973c(Context context, AttributeSet attributeSet) {
        return new C0165J0(context, attributeSet);
    }

    /* JADX INFO: renamed from: d */
    public C0623i1 mo1974d(Context context, AttributeSet attributeSet) {
        return new C0623i1(context, attributeSet, C0983R.attr.radioButtonStyle);
    }

    /* JADX INFO: renamed from: e */
    public C0794r1 mo1975e(Context context, AttributeSet attributeSet) {
        return new C0794r1(context, attributeSet);
    }

    /* JADX INFO: renamed from: f */
    public final View m1976f(Context context, String str, String str2) {
        String strConcat;
        C0598ge<String, Constructor<? extends View>> c0598ge = f3345h;
        Constructor<? extends View> orDefault = c0598ge.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            orDefault = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f3339b);
            c0598ge.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f3346a);
    }
}
