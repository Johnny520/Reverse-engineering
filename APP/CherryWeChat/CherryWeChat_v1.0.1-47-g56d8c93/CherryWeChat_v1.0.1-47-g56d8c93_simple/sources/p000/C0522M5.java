package p000;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import io.github.cherrywechat.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: M5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0522M5 implements InterfaceC1444gA {

    /* JADX INFO: renamed from: a */
    public final ImageView f1703a;

    /* JADX INFO: renamed from: b */
    public final C0445KE f1704b;

    /* JADX INFO: renamed from: c */
    public Animatable f1705c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1706d;

    public C0522M5(ImageView r1, int r2) {
        this.f1706d = r2;
        AbstractC0714Qj.m1488j("Argument must not be null", r1);
        this.f1703a = r1;
        this.f1704b = new C0445KE(r1);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: a */
    public final InterfaceC1026Xv mo391a() {
        Object r0 = this.f1703a.getTag(R.id.glide_custom_view_target_tag);
        if (r0 != null) goto L5;
        return null;
    L5:
        if ((r0 instanceof InterfaceC1026Xv) == false) goto L9;
        return (InterfaceC1026Xv) r0;
    L9:
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: b */
    public final void mo392b() {
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: c */
    public final void mo393c(Drawable r2) {
        m1007l(null);
        this.f1705c = null;
        this.f1703a.setImageDrawable(r2);
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: d */
    public final void mo394d() {
        Animatable r0 = this.f1705c;
        if (r0 == null) goto L6;
        r0.stop();
        return;
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: e */
    public final void mo395e(C2563ty r2) {
        this.f1704b.f1462b.remove(r2);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: f */
    public final void mo396f(C2563ty r8) {
        C0445KE r0 = this.f1704b;
        ArrayList r1 = r0.f1462b;
        View r2 = r0.f1461a;
        int r4 = r2.getPaddingRight() + r2.getPaddingLeft();
        ViewGroup.LayoutParams r3 = r2.getLayoutParams();
        int r5 = 0;
        if (r3 == null) goto L5;
        int r32 = r3.width;
    L6:
        int r33 = r0.m894a(r2.getWidth(), r32, r4);
        int r6 = r2.getPaddingBottom() + r2.getPaddingTop();
        ViewGroup.LayoutParams r42 = r2.getLayoutParams();
        if (r42 == null) goto L9;
        r5 = r42.height;
    L9:
        int r43 = r0.m894a(r2.getHeight(), r5, r6);
        if (r33 > 0) goto L12;
        if (r33 == Integer.MIN_VALUE) goto L12;
    L16:
        if (r1.contains(r8) == true) goto L19;
        r1.add(r8);
    L19:
        if (r0.f1463c != null) goto L24;
        ViewTreeObserver r82 = r2.getViewTreeObserver();
        ViewTreeObserverOnPreDrawListenerC0877Ub r12 = new ViewTreeObserverOnPreDrawListenerC0877Ub(r0);
        r0.f1463c = r12;
        r82.addOnPreDrawListener(r12);
        return;
    L24:
        return;
    L12:
        if (r43 > 0) goto L22;
        if (r43 != Integer.MIN_VALUE) goto L16;
    L22:
        r8.m5050l(r33, r43);
        return;
    L5:
        r32 = 0;
        goto L6
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: g */
    public final void mo397g(InterfaceC1026Xv r3) {
        this.f1703a.setTag(R.id.glide_custom_view_target_tag, r3);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: h */
    public final void mo398h(Drawable r2) {
        m1007l(null);
        this.f1705c = null;
        this.f1703a.setImageDrawable(r2);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: i */
    public final void mo399i(Drawable r4) {
        C0445KE r0 = this.f1704b;
        ViewTreeObserver r1 = r0.f1461a.getViewTreeObserver();
        if (r1.isAlive() == false) goto L5;
        r1.removeOnPreDrawListener(r0.f1463c);
    L5:
        r0.f1463c = null;
        r0.f1462b.clear();
        Animatable r02 = this.f1705c;
        if (r02 == null) goto L8;
        r02.stop();
    L8:
        m1007l(null);
        this.f1705c = null;
        this.f1703a.setImageDrawable(r4);
    }

    @Override // p000.InterfaceC1444gA
    /* JADX INFO: renamed from: j */
    public final void mo400j(Object r2) {
        m1007l(r2);
        if ((r2 instanceof Animatable) == false) goto L6;
        Animatable r22 = (Animatable) r2;
        this.f1705c = r22;
        r22.start();
        return;
    L6:
        this.f1705c = null;
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: k */
    public final void mo401k() {
        Animatable r0 = this.f1705c;
        if (r0 == null) goto L6;
        r0.start();
        return;
    }

    /* JADX INFO: renamed from: l */
    public final void m1007l(Object r2) {
        switch(this.f1706d) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ImageView r0 = this.f1703a;
        r0.setImageDrawable((Drawable) r2);
        return;
    L6:
        ImageView r02 = this.f1703a;
        r02.setImageBitmap((Bitmap) r2);
    }

    public final String toString() {
        return "Target for: " + this.f1703a;
    }
}
