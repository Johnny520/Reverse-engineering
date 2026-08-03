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
    public final void m2195a(int r5) {
        int r02 = this.f3123b ^ r5;
        this.f3123b = r5;
        if (r02 != 0) goto L5;
        return;
    L5:
        if ((r02 & 4) == 0) goto L18;
        if ((r5 & 4) == 0) goto L9;
        m2196b();
    L9:
        int r1 = this.f3123b & 4;
        Toolbar r3 = this.f3122a;
        if (r1 == 0) goto L16;
        Drawable r12 = this.f3127f;
        if (r12 != null) goto L15;
        r12 = this.f3134m;
    L15:
        r3.setNavigationIcon(r12);
        goto L18
    L16:
        r3.setNavigationIcon(null);
    L18:
        if ((r02 & 3) == 0) goto L20;
        m2197c();
    L20:
        int r13 = r02 & 8;
        Toolbar r32 = this.f3122a;
        if (r13 == 0) goto L27;
        if ((r5 & 8) == 0) goto L25;
        r32.setTitle(this.f3129h);
        r32.setSubtitle(this.f3130i);
        goto L27
    L25:
        r32.setTitle(null);
        r32.setSubtitle(null);
    L27:
        if ((r02 & 16) == 0) goto L36;
        View r03 = this.f3124c;
        if (r03 != null) goto L31;
        return;
    L31:
        if ((r5 & 16) == 0) goto L33;
        r32.addView(r03);
        return;
    L33:
        r32.removeView(r03);
        return;
    }

    /* JADX INFO: renamed from: b */
    public final void m2196b() {
        if ((this.f3123b & 4) == 0) goto L9;
        boolean r02 = TextUtils.isEmpty(this.f3131j);
        Toolbar r1 = this.f3122a;
        if (r02 == false) goto L7;
        r1.setNavigationContentDescription(this.f3133l);
        return;
    L7:
        r1.setNavigationContentDescription(this.f3131j);
        return;
    }

    /* JADX INFO: renamed from: c */
    public final void m2197c() {
        int r02 = this.f3123b;
        if ((r02 & 2) != 0) goto L5;
        Drawable r03 = null;
    L12:
        this.f3122a.setLogo(r03);
        return;
    L5:
        if ((r02 & 1) == 0) goto L10;
        r03 = this.f3126e;
        if (r03 != null) goto L12;
        r03 = this.f3125d;
        goto L12
    L10:
        r03 = this.f3125d;
        goto L12
    }
}
