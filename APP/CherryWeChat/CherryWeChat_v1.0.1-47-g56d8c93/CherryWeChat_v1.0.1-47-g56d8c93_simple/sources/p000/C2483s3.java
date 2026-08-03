package p000;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import io.github.cherrywechat.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: s3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2483s3 implements InterfaceC1470gt, InterfaceC2626vb, InterfaceC0120Cr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LayoutInflaterFactory2C0176E3 f8734b;

    public /* synthetic */ C2483s3(LayoutInflaterFactory2C0176E3 r1, int r2) {
        this.f8733a = r2;
        this.f8734b = r1;
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: b */
    public void mo193b(MenuC2204lr r10, boolean r11) {
        switch(this.f8733a) {
            case 2: goto L27;
            default: goto L4;
        };
    L4:
        MenuC2204lr r0 = r10.mo430k();
        int r1 = 0;
        if (r0 == r10) goto L7;
        boolean r3 = true;
    L8:
        if (r3 == false) goto L10;
        r10 = r0;
    L10:
        LayoutInflaterFactory2C0176E3 r4 = this.f8734b;
        C0133D3[] r5 = r4.f471L;
        if (r5 == null) goto L13;
        int r6 = r5.length;
    L14:
        if (r1 >= r6) goto L21;
        C0133D3 r7 = r5[r1];
        if (r7 == null) goto L20;
        if (r7.f336h != r10) goto L20;
    L22:
        if (r7 == null) goto L34;
        if (r3 == false) goto L25;
        r4.m352q(r7.f329a, r7, r0);
        r4.m354s(r7, true);
        return;
    L25:
        r4.m354s(r7, r11);
        return;
    L34:
        return;
    L20:
        r1 = r1 + 1;
        goto L14
    L21:
        r7 = null;
        goto L22
    L13:
        r6 = 0;
        goto L14
    L7:
        r3 = false;
        goto L8
    L27:
        this.f8734b.m353r(r10);
    }

    @Override // p000.InterfaceC1470gt
    public C0489LF onApplyWindowInsets(View r17, C0489LF r18) {
        int r0 = r18.m943d();
        LayoutInflaterFactory2C0176E3 r2 = this.f8734b;
        Context r3 = r2.f494k;
        int r4 = r18.m943d();
        ActionBarContextView r5 = r2.f505v;
        int r6 = 8;
        if (r5 != null) goto L5;
    L75:
        boolean r32 = false;
    L76:
        View r22 = r2.f462C;
        if (r22 == null) goto L81;
        if (r32 == false) goto L80;
        r6 = 0;
    L80:
        r22.setVisibility(r6);
    L81:
        if (r0 == r4) goto L84;
        C0489LF r02 = r18.m944f(r18.m941b(), r4, r18.m942c(), r18.m940a());
    L86:
        return AbstractC2185lE.m4394g(r17, r02);
    L84:
        r02 = r18;
        goto L86
    L5:
        if ((r5.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) == false) goto L75;
        ViewGroup.MarginLayoutParams r52 = (ViewGroup.MarginLayoutParams) r2.f505v.getLayoutParams();
        boolean r9 = true;
        if (r2.f505v.isShown() == false) goto L70;
        if (r2.f488c0 != null) goto L11;
        r2.f488c0 = new Rect();
        r2.f489d0 = new Rect();
    L11:
        Rect r8 = r2.f488c0;
        Rect r10 = r2.f489d0;
        r8.set(r18.m941b(), r18.m943d(), r18.m942c(), r18.m940a());
        ViewGroup r11 = r2.f460A;
        if (Build.VERSION.SDK_INT < 29) goto L15;
        AbstractC0531ME.m1026a(r11, r8, r10);
    L23:
        int r102 = r8.top;
        int r112 = r8.left;
        int r82 = r8.right;
        ViewGroup r12 = r2.f460A;
        WeakHashMap r13 = AbstractC2185lE.f7617a;
        C0489LF r122 = AbstractC1404fE.m2675a(r12);
        if (r122 != null) goto L26;
        int r132 = 0;
    L27:
        if (r122 != null) goto L29;
        int r123 = 0;
    L31:
        if (r52.topMargin == r102) goto L33;
    L38:
        r52.topMargin = r102;
        r52.leftMargin = r112;
        r52.rightMargin = r82;
        boolean r83 = true;
    L39:
        if (r102 > 0) goto L41;
    L43:
        View r103 = r2.f462C;
        if (r103 == null) goto L52;
        ViewGroup.MarginLayoutParams r104 = (ViewGroup.MarginLayoutParams) r103.getLayoutParams();
        int r113 = r104.height;
        int r14 = r52.topMargin;
        if (r113 == r14) goto L48;
    L51:
        r104.height = r14;
        r104.leftMargin = r132;
        r104.rightMargin = r123;
        r2.f462C.setLayoutParams(r104);
        goto L52
    L48:
        if (r104.leftMargin != r132) goto L51;
        if (r104.rightMargin != r123) goto L51;
    L52:
        View r105 = r2.f462C;
        if (r105 != null) goto L56;
        r9 = false;
    L56:
        if (r9 == false) goto L65;
        if (r105.getVisibility() == 0) goto L65;
        View r106 = r2.f462C;
        if ((r106.getWindowSystemUiVisibility() & 8192) == 0) goto L62;
        int r33 = r3.getColor(R.color.abc_decor_view_status_guard_light);
    L63:
        r106.setBackgroundColor(r33);
        goto L65
    L62:
        r33 = r3.getColor(R.color.abc_decor_view_status_guard);
    L65:
        if (r2.f467H == true) goto L68;
        if (r9 == false) goto L68;
        r4 = 0;
    L68:
        r32 = r9;
        r9 = r83;
    L73:
        if (r9 == false) goto L76;
        r2.f505v.setLayoutParams(r52);
        goto L76
    L41:
        if (r2.f462C != null) goto L43;
        View r107 = new View(r3);
        r2.f462C = r107;
        r107.setVisibility(8);
        FrameLayout.LayoutParams r108 = new FrameLayout.LayoutParams(-1, r52.topMargin, 51);
        r108.leftMargin = r132;
        r108.rightMargin = r123;
        r2.f460A.addView(r2.f462C, -1, r108);
        goto L52
    L33:
        if (r52.leftMargin != r112) goto L38;
        if (r52.rightMargin != r82) goto L38;
        r83 = false;
        goto L39
    L29:
        r123 = r122.m942c();
        goto L31
    L26:
        r132 = r122.m941b();
        goto L27
    L15:
        if (AbstractC0585Nj.f1903h == true) goto L20;
        AbstractC0585Nj.f1903h = true;
        Method r124 = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});     // Catch: NoSuchMethodException -> L88
        AbstractC0585Nj.f1904i = r124;     // Catch: NoSuchMethodException -> L88
        if (r124.isAccessible() == true) goto L20;
        AbstractC0585Nj.f1904i.setAccessible(true);     // Catch: NoSuchMethodException -> L88
    L20:
        Method r125 = AbstractC0585Nj.f1904i;
        if (r125 == null) goto L23;
        r125.invoke(r11, new Object[]{r8, r10});     // Catch: Exception -> L87
        goto L23
    L70:
        if (r52.topMargin == 0) goto L72;
        r52.topMargin = 0;
        r32 = false;
        goto L73
    L72:
        r32 = false;
        r9 = false;
        goto L73
    }

    @Override // p000.InterfaceC0120Cr
    /* JADX INFO: renamed from: s */
    public boolean mo194s(MenuC2204lr r3) {
        switch(this.f8733a) {
            case 2: goto L15;
            default: goto L5;
        };
    L15:
        Window.Callback r0 = this.f8734b.f495l.getCallback();
        if (r0 == null) goto L24;
        r0.onMenuOpened(108, r3);
        return true;
    L24:
        return true;
    L5:
        if (r3 != r3.mo430k()) goto L20;
        LayoutInflaterFactory2C0176E3 r02 = this.f8734b;
        if (r02.f465F == false) goto L21;
        Window.Callback r1 = r02.f495l.getCallback();
        if (r1 != null) goto L11;
        return true;
    L11:
        if (r02.f476Q == true) goto L23;
        r1.onMenuOpened(108, r3);
        return true;
    L23:
        return true;
    L21:
        return true;
    L20:
        return true;
    }
}
