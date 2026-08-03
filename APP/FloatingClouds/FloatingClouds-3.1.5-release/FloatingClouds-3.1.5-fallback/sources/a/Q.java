package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.appcompat.view.menu.h.a f214a;

    public boolean a() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    public abstract android.view.View c();

    public android.view.View d(androidx.appcompat.view.menu.h r1) {
            r0 = this;
            android.view.View r1 = r0.c()
            return r1
    }

    public boolean e() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void f(androidx.appcompat.view.menu.m r1) {
            r0 = this;
            return
    }

    public boolean g() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void h(androidx.appcompat.view.menu.h.a r3) {
            r2 = this;
            androidx.appcompat.view.menu.h$a r0 = r2.f214a
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this "
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " instance while it is still in use somewhere else?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ActionProvider(support)"
            android.util.Log.w(r1, r0)
        L24:
            r2.f214a = r3
            return
    }
}
