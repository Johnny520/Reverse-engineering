package p069i;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: i.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0697m1 implements InterfaceC0702o0 {

    /* JADX INFO: renamed from: a */
    public Toolbar f2351a;

    /* JADX INFO: renamed from: b */
    public int f2352b;

    /* JADX INFO: renamed from: c */
    public View f2353c;

    /* JADX INFO: renamed from: d */
    public Drawable f2354d;

    /* JADX INFO: renamed from: e */
    public Drawable f2355e;

    /* JADX INFO: renamed from: f */
    public Drawable f2356f;

    /* JADX INFO: renamed from: g */
    public boolean f2357g;

    /* JADX INFO: renamed from: h */
    public CharSequence f2358h;

    /* JADX INFO: renamed from: i */
    public CharSequence f2359i;

    /* JADX INFO: renamed from: j */
    public CharSequence f2360j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f2361k;

    /* JADX INFO: renamed from: l */
    public boolean f2362l;

    /* JADX INFO: renamed from: m */
    public C0689k f2363m;

    /* JADX INFO: renamed from: n */
    public int f2364n;

    /* JADX INFO: renamed from: o */
    public Drawable f2365o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1323a(int i2) {
        View view;
        int i3 = this.f2352b ^ i2;
        this.f2352b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    m1324b();
                }
                int i4 = this.f2352b & 4;
                Toolbar toolbar = this.f2351a;
                if (i4 != 0) {
                    Drawable drawable = this.f2356f;
                    if (drawable == null) {
                        drawable = this.f2365o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                m1325c();
            }
            int i5 = i3 & 8;
            Toolbar toolbar2 = this.f2351a;
            if (i5 != 0) {
                if ((i2 & 8) != 0) {
                    toolbar2.setTitle(this.f2358h);
                    toolbar2.setSubtitle(this.f2359i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) == 0 || (view = this.f2353c) == null) {
                return;
            }
            if ((i2 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1324b() {
        if ((this.f2352b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f2360j);
            Toolbar toolbar = this.f2351a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f2364n);
            } else {
                toolbar.setNavigationContentDescription(this.f2360j);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1325c() {
        Drawable drawable;
        int i2 = this.f2352b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f2355e) == null) {
            drawable = this.f2354d;
        }
        this.f2351a.setLogo(drawable);
    }
}
