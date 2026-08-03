package p057g;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: g.M0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0873M0 implements InterfaceC0882S {

    /* JADX INFO: renamed from: a */
    public Toolbar f3122a;

    /* JADX INFO: renamed from: b */
    public int f3123b;

    /* JADX INFO: renamed from: c */
    public View f3124c;

    /* JADX INFO: renamed from: d */
    public Drawable f3125d;

    /* JADX INFO: renamed from: e */
    public Drawable f3126e;

    /* JADX INFO: renamed from: f */
    public Drawable f3127f;

    /* JADX INFO: renamed from: g */
    public boolean f3128g;

    /* JADX INFO: renamed from: h */
    public CharSequence f3129h;

    /* JADX INFO: renamed from: i */
    public CharSequence f3130i;

    /* JADX INFO: renamed from: j */
    public CharSequence f3131j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f3132k;

    /* JADX INFO: renamed from: l */
    public int f3133l;

    /* JADX INFO: renamed from: m */
    public Drawable f3134m;

    /* JADX INFO: renamed from: a */
    public final void m2195a(int i2) {
        View view;
        int i3 = this.f3123b ^ i2;
        this.f3123b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    m2196b();
                }
                int i4 = this.f3123b & 4;
                Toolbar toolbar = this.f3122a;
                if (i4 != 0) {
                    Drawable drawable = this.f3127f;
                    if (drawable == null) {
                        drawable = this.f3134m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                m2197c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f3122a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f3129h);
                    toolbar2.setSubtitle(this.f3130i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f3124c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2196b() {
        if ((this.f3123b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f3131j);
            Toolbar toolbar = this.f3122a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f3133l);
            } else {
                toolbar.setNavigationContentDescription(this.f3131j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2197c() {
        Drawable drawable;
        int i2 = this.f3123b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f3126e) == null) {
            drawable = this.f3125d;
        }
        this.f3122a.setLogo(drawable);
    }
}
