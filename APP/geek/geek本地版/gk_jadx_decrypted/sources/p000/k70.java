package p000;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes.dex */
public final class k70 implements InterfaceC0296hf {

    /* JADX INFO: renamed from: a */
    public Toolbar f2717a;

    /* JADX INFO: renamed from: b */
    public int f2718b;

    /* JADX INFO: renamed from: c */
    public View f2719c;

    /* JADX INFO: renamed from: d */
    public Drawable f2720d;

    /* JADX INFO: renamed from: e */
    public Drawable f2721e;

    /* JADX INFO: renamed from: f */
    public Drawable f2722f;

    /* JADX INFO: renamed from: g */
    public boolean f2723g;

    /* JADX INFO: renamed from: h */
    public CharSequence f2724h;

    /* JADX INFO: renamed from: i */
    public CharSequence f2725i;

    /* JADX INFO: renamed from: j */
    public CharSequence f2726j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f2727k;

    /* JADX INFO: renamed from: l */
    public boolean f2728l;

    /* JADX INFO: renamed from: m */
    public C0358j1 f2729m;

    /* JADX INFO: renamed from: n */
    public int f2730n;

    /* JADX INFO: renamed from: o */
    public Drawable f2731o;

    /* JADX INFO: renamed from: a */
    public final void m1640a(int i) {
        View view;
        Toolbar toolbar = this.f2717a;
        int i2 = this.f2718b ^ i;
        this.f2718b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m1641b();
                }
                if ((this.f2718b & 4) != 0) {
                    Drawable drawable = this.f2722f;
                    if (drawable == null) {
                        drawable = this.f2731o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m1642c();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f2724h);
                    toolbar.setSubtitle(this.f2725i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f2719c) == null) {
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
    public final void m1641b() {
        Toolbar toolbar = this.f2717a;
        if ((this.f2718b & 4) != 0) {
            if (TextUtils.isEmpty(this.f2726j)) {
                toolbar.setNavigationContentDescription(this.f2730n);
            } else {
                toolbar.setNavigationContentDescription(this.f2726j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1642c() {
        Drawable drawable;
        int i = this.f2718b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f2721e) == null) {
            drawable = this.f2720d;
        }
        this.f2717a.setLogo(drawable);
    }
}
