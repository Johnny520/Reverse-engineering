package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import io.github.cherrywechat.R;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: x2 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceC2697x2 extends DialogC0876Ua implements DialogInterface, InterfaceC1437g3 {

    /* JADX INFO: renamed from: d */
    public LayoutInflaterFactory2C0176E3 f9272d;

    /* JADX INFO: renamed from: e */
    public final C0219F3 f9273e;

    /* JADX INFO: renamed from: f */
    public final C2611v2 f9274f;

    public DialogInterfaceC2697x2(ContextThemeWrapper r5, int r6) {
        int r62 = m5271e(r5, r6);
        if (r62 != 0) goto L5;
        TypedValue r2 = new TypedValue();
        r5.getTheme().resolveAttribute(R.attr.dialogTheme, r2, true);
        int r22 = r2.resourceId;
    L6:
        super(r5, r22);
        this.f9273e = new C0219F3(this);
        AbstractC2397q3 r23 = m5272c();
        if (r62 != 0) goto L9;
        TypedValue r63 = new TypedValue();
        r5.getTheme().resolveAttribute(R.attr.dialogTheme, r63, true);
        r62 = r63.resourceId;
    L9:
        ((LayoutInflaterFactory2C0176E3) r23).f479T = r62;
        r23.mo342c();
        this.f9274f = new C2611v2(getContext(), this, getWindow());
        return;
    L5:
        r22 = r62;
        goto L6
    }

    /* JADX INFO: renamed from: e */
    public static int m5271e(Context r2, int r3) {
        if (((r3 >>> 24) & 255) < 1) goto L5;
        return r3;
    L5:
        TypedValue r32 = new TypedValue();
        r2.getTheme().resolveAttribute(R.attr.alertDialogTheme, r32, true);
        return r32.resourceId;
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void addContentView(View r4, ViewGroup.LayoutParams r5) {
        m1718b();
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) m5272c();
        r0.m357w();
        ((ViewGroup) r0.f460A.findViewById(android.R.id.content)).addView(r4, r5);
        r0.f496m.m5304a(r0.f495l.getCallback());
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC2397q3 m5272c() {
        if (this.f9272d != null) goto L6;
        ExecutorC2303o3 r0 = AbstractC2397q3.f8398a;
        this.f9272d = new LayoutInflaterFactory2C0176E3(getContext(), getWindow(), this, this);
    L6:
        return this.f9272d;
    }

    /* JADX INFO: renamed from: d */
    public final void m5273d(Bundle r4) {
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) m5272c();
        LayoutInflater r1 = LayoutInflater.from(r0.f494k);
        if (r1.getFactory() != null) goto L5;
        r1.setFactory2(r0);
    L6:
        super.onCreate(r4);
        m5272c().mo342c();
        return;
    L5:
        r1.getFactory2();
        goto L6
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m5272c().mo343e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r2) {
        getWindow().getDecorView();
        C0219F3 r0 = this.f9273e;
        if (r0 != null) goto L7;
        return false;
    L7:
        return r0.f645a.m5275g(r2);
    }

    /* JADX INFO: renamed from: f */
    public final void m5274f(CharSequence r2) {
        super.setTitle(r2);
        m5272c().mo348k(r2);
    }

    @Override // android.app.Dialog
    public final View findViewById(int r2) {
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) m5272c();
        r0.m357w();
        return r0.f495l.findViewById(r2);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m5275g(KeyEvent r1) {
        return super.dispatchKeyEvent(r1);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        m5272c().mo341a();
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void onCreate(Bundle r18) {
        m5273d(r18);
        C2611v2 r1 = this.f9274f;
        r1.f9034b.setContentView(r1.f9057y);
        Context r2 = r1.f9033a;
        Window r3 = r1.f9035c;
        View r4 = r3.findViewById(R.id.parentPanel);
        View r6 = r4.findViewById(R.id.topPanel);
        View r8 = r4.findViewById(R.id.contentPanel);
        View r10 = r4.findViewById(R.id.buttonPanel);
        ViewGroup r42 = (ViewGroup) r4.findViewById(R.id.customPanel);
        View r11 = r1.f9038f;
        if (r11 != null) goto L6;
        r11 = null;
    L6:
        int r14 = 0;
        if (r11 == null) goto L9;
        boolean r15 = true;
    L10:
        if (r15 == true) goto L12;
    L13:
        r3.setFlags(131072, 131072);
    L15:
        if (r15 == false) goto L22;
        FrameLayout r152 = (FrameLayout) r3.findViewById(R.id.custom);
        r152.addView(r11, new ViewGroup.LayoutParams(-1, -1));
        if (r1.f9039g == false) goto L20;
        r152.setPadding(0, 0, 0, 0);
    L20:
        if (r1.f9037e == null) goto L23;
        ((LinearLayout.LayoutParams) ((C1421fo) r42.getLayoutParams())).weight = 0.0f;
    L23:
        View r5 = r42.findViewById(R.id.topPanel);
        View r7 = r42.findViewById(R.id.contentPanel);
        View r9 = r42.findViewById(R.id.buttonPanel);
        ViewGroup r52 = C2611v2.m5120b(r5, r6);
        ViewGroup r62 = C2611v2.m5120b(r7, r8);
        ViewGroup r72 = C2611v2.m5120b(r9, r10);
        NestedScrollView r82 = (NestedScrollView) r3.findViewById(R.id.scrollView);
        r1.f9049q = r82;
        r82.setFocusable(false);
        r1.f9049q.setNestedScrollingEnabled(false);
        TextView r83 = (TextView) r62.findViewById(android.R.id.message);
        r1.f9053u = r83;
        if (r83 == null) goto L30;
        r83.setVisibility(8);
        r1.f9049q.removeView(r1.f9053u);
        if (r1.f9037e == null) goto L29;
        ViewGroup r84 = (ViewGroup) r1.f9049q.getParent();
        int r92 = r84.indexOfChild(r1.f9049q);
        r84.removeViewAt(r92);
        r84.addView(r1.f9037e, r92, new ViewGroup.LayoutParams(-1, -1));
        goto L30
    L29:
        r62.setVisibility(8);
    L30:
        Button r85 = (Button) r72.findViewById(android.R.id.button1);
        r1.f9040h = r85;
        ViewOnClickListenerC2343p0 r93 = r1.f9032E;
        r85.setOnClickListener(r93);
        if (TextUtils.isEmpty(r1.f9041i) == false) goto L33;
        r1.f9040h.setVisibility(8);
        int r86 = 0;
    L34:
        Button r102 = (Button) r72.findViewById(android.R.id.button2);
        r1.f9043k = r102;
        r102.setOnClickListener(r93);
        if (TextUtils.isEmpty(r1.f9044l) == false) goto L37;
        r1.f9043k.setVisibility(8);
    L38:
        Button r103 = (Button) r72.findViewById(android.R.id.button3);
        r1.f9046n = r103;
        r103.setOnClickListener(r93);
        if (TextUtils.isEmpty(r1.f9047o) == false) goto L41;
        r1.f9046n.setVisibility(8);
    L42:
        TypedValue r94 = new TypedValue();
        r2.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, r94, true);
        if (r94.data != 0) goto L45;
    L52:
        if (r86 != 0) goto L56;
        r72.setVisibility(8);
    L56:
        if (r1.f9054v == null) goto L58;
        r52.addView(r1.f9054v, 0, new ViewGroup.LayoutParams(-1, -2));
        r3.findViewById(R.id.title_template).setVisibility(8);
    L68:
        if (r42.getVisibility() == 8) goto L70;
        boolean r112 = true;
    L71:
        if (r52 != null) goto L73;
    L75:
        int r22 = 0;
    L77:
        if (r72.getVisibility() == 8) goto L79;
        boolean r43 = true;
    L80:
        if (r43 == true) goto L84;
        View r73 = r62.findViewById(R.id.textSpacerNoButtons);
        if (r73 == null) goto L84;
        r73.setVisibility(0);
    L84:
        if (r22 == 0) goto L94;
        NestedScrollView r74 = r1.f9049q;
        if (r74 == null) goto L89;
        r74.setClipToPadding(true);
    L89:
        if (r1.f9037e == null) goto L91;
        View r12 = r52.findViewById(R.id.titleDividerNoCustom);
    L92:
        if (r12 == null) goto L97;
        r12.setVisibility(0);
    L97:
        AlertController$RecycleListView r53 = r1.f9037e;
        if (r53 == null) goto L110;
        if (r43 == false) goto L101;
        if (r22 != 0) goto L110;
    L101:
        int r75 = r53.getPaddingLeft();
        if (r22 == 0) goto L104;
        int r87 = r53.getPaddingTop();
    L105:
        int r104 = r53.getPaddingRight();
        if (r43 == false) goto L108;
        int r122 = r53.getPaddingBottom();
    L109:
        r53.setPadding(r75, r87, r104, r122);
        goto L110
    L108:
        r122 = r53.f3685b;
        goto L109
    L104:
        r87 = r53.f3684a;
    L110:
        if (r112 == true) goto L123;
        View r54 = r1.f9037e;
        if (r54 != null) goto L115;
        r54 = r1.f9049q;
    L115:
        if (r54 == null) goto L123;
        if (r43 == false) goto L118;
        r14 = 2;
    L118:
        View r44 = r3.findViewById(R.id.scrollIndicatorUp);
        View r32 = r3.findViewById(R.id.scrollIndicatorDown);
        WeakHashMap r76 = AbstractC2185lE.f7617a;
        AbstractC1404fE.m2676b(r54, r22 | r14, 3);
        if (r44 == null) goto L121;
        r62.removeView(r44);
    L121:
        if (r32 == null) goto L123;
        r62.removeView(r32);
    L123:
        AlertController$RecycleListView r23 = r1.f9037e;
        if (r23 == null) goto L131;
        ListAdapter r33 = r1.f9055w;
        if (r33 == null) goto L132;
        r23.setAdapter(r33);
        int r13 = r1.f9056x;
        if (r13 <= (-1)) goto L133;
        r23.setItemChecked(r13, true);
        r23.setSelection(r13);
        return;
    L133:
        return;
    L132:
        return;
    L131:
        return;
    L91:
        r12 = null;
        goto L92
    L94:
        View r55 = r62.findViewById(R.id.textSpacerNoTitle);
        if (r55 == null) goto L97;
        r55.setVisibility(0);
        goto L97
    L79:
        r43 = false;
        goto L80
    L73:
        if (r52.getVisibility() == 8) goto L75;
        r22 = 1;
        goto L77
    L70:
        r112 = false;
        goto L71
    L58:
        r1.f9051s = (ImageView) r3.findViewById(android.R.id.icon);
        if (TextUtils.isEmpty(r1.f9036d) == false) goto L61;
    L66:
        r3.findViewById(R.id.title_template).setVisibility(8);
        r1.f9051s.setVisibility(8);
        r52.setVisibility(8);
        goto L68
    L61:
        if (r1.f9030C == false) goto L66;
        TextView r24 = (TextView) r3.findViewById(R.id.alertTitle);
        r1.f9052t = r24;
        r24.setText(r1.f9036d);
        Drawable r25 = r1.f9050r;
        if (r25 == null) goto L65;
        r1.f9051s.setImageDrawable(r25);
        goto L68
    L65:
        r1.f9052t.setPadding(r1.f9051s.getPaddingLeft(), r1.f9051s.getPaddingTop(), r1.f9051s.getPaddingRight(), r1.f9051s.getPaddingBottom());
        r1.f9051s.setVisibility(8);
        goto L68
    L45:
        if (r86 != 1) goto L47;
        Button r105 = r1.f9040h;
        LinearLayout.LayoutParams r153 = (LinearLayout.LayoutParams) r105.getLayoutParams();
        r153.gravity = 1;
        r153.weight = 0.5f;
        r105.setLayoutParams(r153);
        goto L52
    L47:
        if (r86 != 2) goto L50;
        Button r106 = r1.f9043k;
        LinearLayout.LayoutParams r154 = (LinearLayout.LayoutParams) r106.getLayoutParams();
        r154.gravity = 1;
        r154.weight = 0.5f;
        r106.setLayoutParams(r154);
        goto L52
    L50:
        if (r86 != 4) goto L52;
        Button r107 = r1.f9046n;
        LinearLayout.LayoutParams r155 = (LinearLayout.LayoutParams) r107.getLayoutParams();
        r155.gravity = 1;
        r155.weight = 0.5f;
        r107.setLayoutParams(r155);
        goto L52
    L41:
        r1.f9046n.setText(r1.f9047o);
        r1.f9046n.setVisibility(0);
        r86 = r86 | 4;
        goto L42
    L37:
        r1.f9043k.setText(r1.f9044l);
        r1.f9043k.setVisibility(0);
        r86 = r86 | 2;
        goto L38
    L33:
        r1.f9040h.setText(r1.f9041i);
        r1.f9040h.setVisibility(0);
        r86 = 1;
        goto L34
    L22:
        r42.setVisibility(8);
        goto L23
    L12:
        if (C2611v2.m5119a(r11) == true) goto L15;
    L9:
        r15 = false;
        goto L10
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r2, KeyEvent r3) {
        NestedScrollView r0 = this.f9274f.f9049q;
        if (r0 == null) goto L9;
        if (r0.m2149j(r3) == false) goto L9;
        return true;
    L9:
        return super.onKeyDown(r2, r3);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, KeyEvent r3) {
        NestedScrollView r0 = this.f9274f.f9049q;
        if (r0 == null) goto L9;
        if (r0.m2149j(r3) == false) goto L9;
        return true;
    L9:
        return super.onKeyUp(r2, r3);
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0176E3 r0 = (LayoutInflaterFactory2C0176E3) m5272c();
        r0.m332A();
        AbstractC2257n0 r02 = r0.f498o;
        if (r02 == null) goto L6;
        r02.mo4510n(false);
        return;
    }

    @Override // p000.InterfaceC1437g3
    public final void onSupportActionModeFinished(AbstractC0345I0 r1) {
    }

    @Override // p000.InterfaceC1437g3
    public final void onSupportActionModeStarted(AbstractC0345I0 r1) {
    }

    @Override // p000.InterfaceC1437g3
    public final AbstractC0345I0 onWindowStartingSupportActionMode(InterfaceC0302H0 r1) {
        return null;
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void setContentView(int r2) {
        m1718b();
        m5272c().mo345h(r2);
    }

    @Override // android.app.Dialog
    public final void setTitle(int r3) {
        super.setTitle(r3);
        m5272c().mo348k(getContext().getString(r3));
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void setContentView(View r2) {
        m1718b();
        m5272c().mo346i(r2);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence r2) {
        m5274f(r2);
        C2611v2 r0 = this.f9274f;
        r0.f9036d = r2;
        TextView r02 = r0.f9052t;
        if (r02 == null) goto L6;
        r02.setText(r2);
        return;
    }

    @Override // p000.DialogC0876Ua, android.app.Dialog
    public final void setContentView(View r2, ViewGroup.LayoutParams r3) {
        m1718b();
        m5272c().mo347j(r2, r3);
    }
}
