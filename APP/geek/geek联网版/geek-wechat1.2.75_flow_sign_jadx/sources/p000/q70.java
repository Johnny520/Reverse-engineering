package p000;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class q70 implements InterfaceC0372jf {

    /* JADX INFO: renamed from: a */
    public Toolbar f3849a;

    /* JADX INFO: renamed from: b */
    public int f3850b;

    /* JADX INFO: renamed from: c */
    public View f3851c;

    /* JADX INFO: renamed from: d */
    public Drawable f3852d;

    /* JADX INFO: renamed from: e */
    public Drawable f3853e;

    /* JADX INFO: renamed from: f */
    public Drawable f3854f;

    /* JADX INFO: renamed from: g */
    public boolean f3855g;

    /* JADX INFO: renamed from: h */
    public CharSequence f3856h;

    /* JADX INFO: renamed from: i */
    public CharSequence f3857i;

    /* JADX INFO: renamed from: j */
    public CharSequence f3858j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f3859k;

    /* JADX INFO: renamed from: l */
    public boolean f3860l;

    /* JADX INFO: renamed from: m */
    public C0358j1 f3861m;

    /* JADX INFO: renamed from: n */
    public int f3862n;

    /* JADX INFO: renamed from: o */
    public Drawable f3863o;

    /* JADX INFO: renamed from: a */
    public final void m2129a(int i) {
        View view;
        Toolbar toolbar = this.f3849a;
        int i2 = this.f3850b ^ i;
        this.f3850b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2130b();
                }
                if ((this.f3850b & 4) != 0) {
                    Drawable drawable = this.f3854f;
                    if (drawable == null) {
                        drawable = this.f3863o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m2131c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f3856h);
                    toolbar.setSubtitle(this.f3857i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f3851c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2130b() {
        Toolbar toolbar = this.f3849a;
        if ((this.f3850b & 4) != 0) {
            if (TextUtils.isEmpty(this.f3858j)) {
                toolbar.setNavigationContentDescription(this.f3862n);
            } else {
                toolbar.setNavigationContentDescription(this.f3858j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2131c() {
        Drawable drawable;
        int i = this.f3850b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f3853e) == null) {
            drawable = this.f3852d;
        }
        this.f3849a.setLogo(drawable);
    }
}
