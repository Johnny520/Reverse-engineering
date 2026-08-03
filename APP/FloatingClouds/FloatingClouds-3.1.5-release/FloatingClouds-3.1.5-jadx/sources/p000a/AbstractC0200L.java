package p000a;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import p000a.LayoutInflaterFactory2C0291Q0;

/* JADX INFO: renamed from: a.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0200L {

    /* JADX INFO: renamed from: a.L$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m570a();
    }

    /* JADX INFO: renamed from: a */
    public boolean mo555a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo556b();

    /* JADX INFO: renamed from: c */
    public abstract void mo557c(boolean z);

    /* JADX INFO: renamed from: d */
    public abstract int mo558d();

    /* JADX INFO: renamed from: e */
    public abstract Context mo559e();

    /* JADX INFO: renamed from: f */
    public boolean mo560f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract void mo561g();

    /* JADX INFO: renamed from: h */
    public void mo562h() {
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo563i(int i, KeyEvent keyEvent);

    /* JADX INFO: renamed from: j */
    public boolean mo564j(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo565k() {
        return false;
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo566l(boolean z);

    /* JADX INFO: renamed from: m */
    public abstract void mo567m(boolean z);

    /* JADX INFO: renamed from: n */
    public abstract void mo568n(CharSequence charSequence);

    /* JADX INFO: renamed from: o */
    public AbstractC0272P mo569o(LayoutInflaterFactory2C0291Q0.d dVar) {
        return null;
    }

    /* JADX INFO: renamed from: a.L$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a */
        public int f674a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f674a = 0;
            this.f674a = aVar.f674a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f674a = 0;
        }
    }
}
