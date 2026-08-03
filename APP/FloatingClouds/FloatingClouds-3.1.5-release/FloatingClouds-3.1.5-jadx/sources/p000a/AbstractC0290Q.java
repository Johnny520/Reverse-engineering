package p000a;

import android.util.Log;
import android.view.View;
import androidx.appcompat.view.menu.C1000h;
import androidx.appcompat.view.menu.SubMenuC1005m;

/* JADX INFO: renamed from: a.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0290Q {

    /* JADX INFO: renamed from: a */
    public C1000h.a f987a;

    /* JADX INFO: renamed from: a */
    public boolean mo786a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo787b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public abstract View mo788c();

    /* JADX INFO: renamed from: d */
    public View mo789d(C1000h c1000h) {
        return mo788c();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo790e() {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void mo791f(SubMenuC1005m subMenuC1005m) {
    }

    /* JADX INFO: renamed from: g */
    public boolean mo792g() {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void mo793h(C1000h.a aVar) {
        if (this.f987a != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f987a = aVar;
    }
}
