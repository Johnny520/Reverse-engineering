package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.a;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g2 extends Dialog implements DialogInterface, x2, oq, u10 {
    public a a;
    public final gm b;
    public final androidx.activity.a c;
    public r3 d;
    public final s3 e;
    public final e2 f;

    /* JADX WARN: Type inference failed for: r2v4, types: [s3] */
    public g2(ContextThemeWrapper r6, int r7) {
        int r72 = h(r6, r7);
        if (r72 != 0) goto L5;
        TypedValue r2 = new TypedValue();
        r6.getTheme().resolveAttribute(R.attr.dialogTheme, r2, true);
        int r22 = r2.resourceId;
    L6:
        super(r6, r22);
        this.b = new gm(this);
        this.c = new androidx.activity.a(new p1(5, this));
        this.e = new s3(this);
        e3 r23 = c();
        if (r72 != 0) goto L9;
        TypedValue r73 = new TypedValue();
        r6.getTheme().resolveAttribute(R.attr.dialogTheme, r73, true);
        r72 = r73.resourceId;
    L9:
        ((r3) r23).T = r72;
        r23.d();
        this.f = new e2(getContext(), this, getWindow());
        return;
    L5:
        r22 = r72;
        goto L6
    }

    public static void a(g2 r0) {
        super.onBackPressed();
    }

    public static int h(Context r2, int r3) {
        if (((r3 >>> 24) & 255) < 1) goto L5;
        return r3;
    L5:
        TypedValue r32 = new TypedValue();
        r2.getTheme().resolveAttribute(R.attr.alertDialogTheme, r32, true);
        return r32.resourceId;
    }

    @Override // android.app.Dialog
    public final void addContentView(View r4, ViewGroup.LayoutParams r5) {
        r3 r0 = (r3) c();
        r0.w();
        ((ViewGroup) r0.A.findViewById(android.R.id.content)).addView(r4, r5);
        r0.m.a(r0.l.getCallback());
    }

    @Override // defpackage.u10
    public final a3 b() {
        return (a3) this.b.c;
    }

    public final e3 c() {
        if (this.d != null) goto L6;
        u5 r0 = e3.a;
        this.d = new r3(getContext(), getWindow(), this, this);
    L6:
        return this.d;
    }

    public final void d(Bundle r3) {
        super.onCreate(r3);
        if (Build.VERSION.SDK_INT < 33) goto L5;
        OnBackInvokedDispatcher r0 = e0.c(this);
        ip.n("onBackInvokedDispatcher", r0);
        androidx.activity.a r1 = this.c;
        r1.getClass();
        r1.e = r0;
        r1.c(r1.g);
    L5:
        this.b.b(r3);
        a r32 = this.a;
        if (r32 != null) goto L8;
        r32 = new a(this);
        this.a = r32;
    L8:
        r32.d(iq.ON_CREATE);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent r3) {
        View r0 = getWindow().getDecorView();
        return ip.s(this.e, r0, this, r3);
    }

    @Override // defpackage.oq
    public final a e() {
        a r0 = this.a;
        if (r0 != null) goto L6;
        a r02 = new a(this);
        this.a = r02;
        return r02;
    L6:
        return r0;
    }

    public final void f(Bundle r2) {
        c().a();
        d(r2);
        c().d();
    }

    @Override // android.app.Dialog
    public final View findViewById(int r2) {
        r3 r0 = (r3) c();
        r0.w();
        return r0.l.findViewById(r2);
    }

    public final void g() {
        a r0 = this.a;
        if (r0 != null) goto L5;
        r0 = new a(this);
        this.a = r0;
    L5:
        r0.d(iq.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    public final void i(CharSequence r2) {
        super.setTitle(r2);
        c().l(r2);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().b();
    }

    public final boolean j(KeyEvent r1) {
        return super.dispatchKeyEvent(r1);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.c.b();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle r18) {
        f(r18);
        e2 r1 = this.f;
        r1.b.setContentView(r1.q);
        Context r2 = r1.a;
        Window r3 = r1.c;
        View r4 = r3.findViewById(R.id.parentPanel);
        View r6 = r4.findViewById(R.id.topPanel);
        View r8 = r4.findViewById(R.id.contentPanel);
        View r10 = r4.findViewById(R.id.buttonPanel);
        ViewGroup r42 = (ViewGroup) r4.findViewById(R.id.customPanel);
        r3.setFlags(131072, 131072);
        r42.setVisibility(8);
        View r5 = r42.findViewById(R.id.topPanel);
        View r7 = r42.findViewById(R.id.contentPanel);
        View r9 = r42.findViewById(R.id.buttonPanel);
        ViewGroup r52 = e2.a(r5, r6);
        ViewGroup r62 = e2.a(r7, r8);
        ViewGroup r72 = e2.a(r9, r10);
        NestedScrollView r82 = (NestedScrollView) r3.findViewById(R.id.scrollView);
        r1.i = r82;
        int r92 = 0;
        r82.setFocusable(false);
        r1.i.setNestedScrollingEnabled(false);
        TextView r83 = (TextView) r62.findViewById(android.R.id.message);
        r1.m = r83;
        if (r83 == null) goto L9;
        r83.setVisibility(8);
        r1.i.removeView(r1.m);
        if (r1.e == null) goto L8;
        ViewGroup r84 = (ViewGroup) r1.i.getParent();
        int r12 = r84.indexOfChild(r1.i);
        r84.removeViewAt(r12);
        r84.addView(r1.e, r12, new ViewGroup.LayoutParams(-1, -1));
        goto L9
    L8:
        r62.setVisibility(8);
    L9:
        Button r85 = (Button) r72.findViewById(android.R.id.button1);
        r1.f = r85;
        x0 r122 = r1.w;
        r85.setOnClickListener(r122);
        if (TextUtils.isEmpty(null) == false) goto L12;
        r1.f.setVisibility(8);
        int r13 = 0;
    L13:
        Button r15 = (Button) r72.findViewById(android.R.id.button2);
        r1.g = r15;
        r15.setOnClickListener(r122);
        if (TextUtils.isEmpty(null) == false) goto L16;
        r1.g.setVisibility(8);
    L17:
        Button r152 = (Button) r72.findViewById(android.R.id.button3);
        r1.h = r152;
        r152.setOnClickListener(r122);
        if (TextUtils.isEmpty(null) == false) goto L20;
        r1.h.setVisibility(8);
    L21:
        TypedValue r123 = new TypedValue();
        r2.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, r123, true);
        if (r123.data != 0) goto L24;
    L31:
        if (r13 != 0) goto L35;
        r72.setVisibility(8);
    L35:
        if (r1.n == null) goto L37;
        r52.addView(r1.n, 0, new ViewGroup.LayoutParams(-1, -2));
        r3.findViewById(R.id.title_template).setVisibility(8);
    L47:
        if (r42.getVisibility() == 8) goto L49;
        boolean r22 = true;
    L50:
        if (r52 != null) goto L52;
    L54:
        int r43 = 0;
    L56:
        if (r72.getVisibility() == 8) goto L58;
        boolean r73 = true;
    L59:
        if (r73 == true) goto L63;
        View r86 = r62.findViewById(R.id.textSpacerNoButtons);
        if (r86 == null) goto L63;
        r86.setVisibility(0);
    L63:
        if (r43 == 0) goto L73;
        NestedScrollView r87 = r1.i;
        if (r87 == null) goto L68;
        r87.setClipToPadding(true);
    L68:
        if (r1.e == null) goto L70;
        View r88 = r52.findViewById(R.id.titleDividerNoCustom);
    L71:
        if (r88 == null) goto L76;
        r88.setVisibility(0);
    L76:
        AlertController$RecycleListView r53 = r1.e;
        if (r53 == null) goto L89;
        if (r73 == false) goto L80;
        if (r43 != 0) goto L89;
    L80:
        int r89 = r53.getPaddingLeft();
        if (r43 == 0) goto L83;
        int r11 = r53.getPaddingTop();
    L84:
        int r124 = r53.getPaddingRight();
        if (r73 == false) goto L87;
        int r132 = r53.getPaddingBottom();
    L88:
        r53.setPadding(r89, r11, r124, r132);
        goto L89
    L87:
        r132 = r53.b;
        goto L88
    L83:
        r11 = r53.a;
    L89:
        if (r22 == true) goto L102;
        View r23 = r1.e;
        if (r23 != null) goto L94;
        r23 = r1.i;
    L94:
        if (r23 == null) goto L102;
        if (r73 == false) goto L97;
        r92 = 2;
    L97:
        View r54 = r3.findViewById(R.id.scrollIndicatorUp);
        View r32 = r3.findViewById(R.id.scrollIndicatorDown);
        WeakHashMap r74 = ja0.a;
        z90.d(r23, r43 | r92, 3);
        if (r54 == null) goto L100;
        r62.removeView(r54);
    L100:
        if (r32 == null) goto L102;
        r62.removeView(r32);
    L102:
        AlertController$RecycleListView r24 = r1.e;
        if (r24 == null) goto L110;
        ListAdapter r33 = r1.o;
        if (r33 == null) goto L111;
        r24.setAdapter(r33);
        int r14 = r1.p;
        if (r14 <= (-1)) goto L112;
        r24.setItemChecked(r14, true);
        r24.setSelection(r14);
        return;
    L112:
        return;
    L111:
        return;
    L110:
        return;
    L70:
        r88 = null;
        goto L71
    L73:
        View r55 = r62.findViewById(R.id.textSpacerNoTitle);
        if (r55 == null) goto L76;
        r55.setVisibility(0);
        goto L76
    L58:
        r73 = false;
        goto L59
    L52:
        if (r52.getVisibility() == 8) goto L54;
        r43 = 1;
        goto L56
    L49:
        r22 = false;
        goto L50
    L37:
        r1.k = (ImageView) r3.findViewById(android.R.id.icon);
        if (TextUtils.isEmpty(r1.d) == false) goto L40;
    L45:
        r3.findViewById(R.id.title_template).setVisibility(8);
        r1.k.setVisibility(8);
        r52.setVisibility(8);
        goto L47
    L40:
        if (r1.u == false) goto L45;
        TextView r25 = (TextView) r3.findViewById(R.id.alertTitle);
        r1.l = r25;
        r25.setText(r1.d);
        Drawable r26 = r1.j;
        if (r26 == null) goto L44;
        r1.k.setImageDrawable(r26);
        goto L47
    L44:
        r1.l.setPadding(r1.k.getPaddingLeft(), r1.k.getPaddingTop(), r1.k.getPaddingRight(), r1.k.getPaddingBottom());
        r1.k.setVisibility(8);
        goto L47
    L24:
        if (r13 != 1) goto L26;
        Button r153 = r1.f;
        LinearLayout.LayoutParams r810 = (LinearLayout.LayoutParams) r153.getLayoutParams();
        r810.gravity = 1;
        r810.weight = 0.5f;
        r153.setLayoutParams(r810);
        goto L31
    L26:
        if (r13 != 2) goto L29;
        Button r811 = r1.g;
        LinearLayout.LayoutParams r154 = (LinearLayout.LayoutParams) r811.getLayoutParams();
        r154.gravity = 1;
        r154.weight = 0.5f;
        r811.setLayoutParams(r154);
        goto L31
    L29:
        if (r13 != 4) goto L31;
        Button r812 = r1.h;
        LinearLayout.LayoutParams r155 = (LinearLayout.LayoutParams) r812.getLayoutParams();
        r155.gravity = 1;
        r155.weight = 0.5f;
        r812.setLayoutParams(r155);
        goto L31
    L20:
        r1.h.setText(null);
        r1.h.setVisibility(0);
        r13 = r13 | 4;
        goto L21
    L16:
        r1.g.setText(null);
        r1.g.setVisibility(0);
        r13 = r13 | 2;
        goto L17
    L12:
        r1.f.setText(null);
        r1.f.setVisibility(0);
        r13 = 1;
        goto L13
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int r2, KeyEvent r3) {
        NestedScrollView r0 = this.f.i;
        if (r0 == null) goto L9;
        if (r0.j(r3) == false) goto L9;
        return true;
    L9:
        return super.onKeyDown(r2, r3);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int r2, KeyEvent r3) {
        NestedScrollView r0 = this.f.i;
        if (r0 == null) goto L9;
        if (r0.j(r3) == false) goto L9;
        return true;
    L9:
        return super.onKeyUp(r2, r3);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle r0 = super.onSaveInstanceState();
        ip.n("super.onSaveInstanceState()", r0);
        this.b.c(r0);
        return r0;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        a r0 = this.a;
        if (r0 != null) goto L5;
        r0 = new a(this);
        this.a = r0;
    L5:
        r0.d(iq.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        g();
        r3 r0 = (r3) c();
        r0.A();
        yb0 r02 = r0.o;
        if (r02 == null) goto L8;
        r02.P = false;
        xa0 r03 = r02.O;
        if (r03 == null) goto L9;
        r03.a();
        return;
    L9:
        return;
    }

    @Override // android.app.Dialog
    public final void setContentView(int r2) {
        c().h(r2);
    }

    @Override // android.app.Dialog
    public final void setTitle(int r3) {
        super.setTitle(r3);
        c().l(getContext().getString(r3));
    }

    @Override // android.app.Dialog
    public final void setContentView(View r2) {
        c().i(r2);
    }

    @Override // android.app.Dialog
    public final void setContentView(View r2, ViewGroup.LayoutParams r3) {
        c().j(r2, r3);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence r2) {
        i(r2);
        e2 r0 = this.f;
        r0.d = r2;
        TextView r02 = r0.l;
        if (r02 == null) goto L6;
        r02.setText(r2);
        return;
    }
}
