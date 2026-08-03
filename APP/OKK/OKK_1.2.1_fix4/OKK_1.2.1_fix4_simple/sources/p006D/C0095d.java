package p006D;

import android.R;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputContentInfo;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.emoji2.text.C0497v;
import androidx.emoji2.text.InterfaceC0484i;
import androidx.emoji2.text.InterfaceC0490o;
import androidx.emoji2.text.RunnableC0486k;
import androidx.emoji2.text.ThreadFactoryC0476a;
import androidx.fragment.app.AbstractC0507g;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000A.C0002c;
import p001A0.AbstractC0040p;
import p008E.InterfaceC0166t;
import p025N.C0256g;
import p034S.InterfaceC0326f;
import p037U.AbstractC0358S;
import p055f.C0774e;
import p055f.InterfaceC0777h;
import p055f.InterfaceC0784o;
import p055f.MenuC0779j;
import p055f.MenuItemC0780k;
import p055f.RunnableC0773d;
import p055f.SubMenuC0789t;
import p055f.ViewOnKeyListenerC0775f;
import p057g.C0859F0;
import p057g.C0906i;
import p057g.InterfaceC0862H;
import p057g.InterfaceC0912l;
import p057g.InterfaceC0921p0;
import p057g.RunnableC0857E0;
import p070m0.InterfaceC0991a;
import p078r.C1061d;

/* JADX INFO: renamed from: D.d */
/* JADX INFO: loaded from: classes.dex */
public class C0095d implements InterfaceC0097e, InterfaceC0101g, InterfaceC0326f, InterfaceC0484i, InterfaceC0490o, InterfaceC0921p0, InterfaceC0784o, InterfaceC0777h, InterfaceC0862H, InterfaceC0166t, InterfaceC0991a, InterfaceC0121q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f250a;

    /* JADX INFO: renamed from: b */
    public Object f251b;

    public /* synthetic */ C0095d(int r1, Object r2) {
        this.f250a = r1;
        this.f251b = r2;
    }

    /* JADX INFO: renamed from: x */
    public static int m337x(int r5, int r6) {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
    L4:
        if (r1 >= r5) goto L12;
        r2 = r2 + 1;
        if (r2 != r6) goto L8;
        r3 = r3 + 1;
        r2 = 0;
    L10:
        r1 = r1 + 1;
        goto L4
    L8:
        if (r2 <= r6) goto L10;
        r3 = r3 + 1;
        r2 = 1;
        goto L10
    L12:
        if ((r2 + 1) > r6) goto L14;
        return r3;
    L14:
        return r3 + 1;
    }

    /* JADX INFO: renamed from: A */
    public void mo338A() {
        View r02 = (View) this.f251b;
        if (r02 != null) goto L6;
        return;
    L6:
        if (r02.isInEditMode() == false) goto L8;
    L11:
        r02.requestFocus();
        View r1 = r02;
    L12:
        if (r1 != null) goto L14;
        r1 = r02.getRootView().findViewById(R.id.content);
    L14:
        if (r1 != null) goto L16;
        return;
    L16:
        if (r1.hasWindowFocus() == false) goto L20;
        r1.post(new RunnableC0129u(r1, 0));
        return;
    L20:
        return;
    L8:
        if (r02.onCheckIsTextEditor() == true) goto L11;
        r1 = r02.getRootView().findFocus();
        goto L12
    }

    @Override // p055f.InterfaceC0784o
    /* JADX INFO: renamed from: a */
    public void mo339a(MenuC0779j r3, boolean r4) {
        if ((r3 instanceof SubMenuC0789t) == false) goto L5;
        ((SubMenuC0789t) r3).f2867v.mo2004j().m1997c(false);
    L5:
        InterfaceC0784o r02 = ((C0906i) this.f251b).f3207e;
        if (r02 == null) goto L9;
        r02.mo339a(r3, r4);
        return;
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: b */
    public void mo340b(Bundle r2) {
        AbstractC0093c.m334k((ContentInfo.Builder) this.f251b, r2);
    }

    @Override // androidx.emoji2.text.InterfaceC0490o
    /* JADX INFO: renamed from: c */
    public boolean mo2c(CharSequence r1, int r2, int r3, C0497v r4) {
        if (TextUtils.equals(r1.subSequence(r2, r3), (String) this.f251b) == false) goto L6;
        r4.f1400c = (r4.f1400c & 3) | 4;
        return false;
    L6:
        return true;
    }

    @Override // p057g.InterfaceC0862H
    /* JADX INFO: renamed from: d */
    public void mo341d(int r1) {
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: e */
    public void mo342e(Uri r2) {
        AbstractC0093c.m333j((ContentInfo.Builder) this.f251b, r2);
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: f */
    public int mo343f() {
        return AbstractC0093c.m335l((ContentInfo) this.f251b);
    }

    @Override // androidx.emoji2.text.InterfaceC0490o
    /* JADX INFO: renamed from: g */
    public Object mo6g() {
        return this;
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: h */
    public ClipData mo344h() {
        return AbstractC0093c.m327d((ContentInfo) this.f251b);
    }

    @Override // p006D.InterfaceC0121q
    /* JADX INFO: renamed from: i */
    public C0122q0 mo8i(View r7, C0122q0 r8) {
        CoordinatorLayout r02 = (CoordinatorLayout) this.f251b;
        if (Objects.equals(r02.f1291n, r8) == true) goto L28;
        r02.f1291n = r8;
        int r2 = 0;
        if (r8.m430a() <= 0) goto L7;
        boolean r1 = true;
    L8:
        r02.f1292o = r1;
        if (r1 == false) goto L11;
    L13:
        boolean r12 = false;
    L14:
        r02.setWillNotDraw(r12);
        C0118o0 r13 = r8.f309a;
        if (r13.mo392m() == true) goto L27;
        int r3 = r02.getChildCount();
    L18:
        if (r2 >= r3) goto L27;
        View r4 = r02.getChildAt(r2);
        Field r5 = AbstractC0080Q.f219a;
        if (r4.getFitsSystemWindows() == false) goto L26;
        if (((C1061d) r4.getLayoutParams()).f4064a == null) goto L26;
        if (r13.mo392m() == true) goto L27;
    L26:
        r2 = r2 + 1;
    L27:
        r02.requestLayout();
        goto L28
    L11:
        if (r02.getBackground() != null) goto L13;
        r12 = true;
        goto L14
    L7:
        r1 = false;
    L28:
        return r8;
    }

    @Override // p008E.InterfaceC0166t
    /* JADX INFO: renamed from: j */
    public boolean mo18j(View r5) {
        SwipeDismissBehavior r02 = (SwipeDismissBehavior) this.f251b;
        boolean r2 = false;
        if (r02.mo1831r(r5) == false) goto L16;
        Field r1 = AbstractC0080Q.f219a;
        if (r5.getLayoutDirection() != 1) goto L7;
        r2 = true;
    L7:
        int r03 = r02.f2276d;
        if (r03 != 0) goto L10;
        if (r2 == false) goto L10;
    L12:
        int r04 = -r5.getWidth();
    L14:
        r5.offsetLeftAndRight(r04);
        r5.setAlpha(0.0f);
        return true;
    L10:
        if (r03 != 1) goto L13;
        if (r2 == false) goto L12;
    L13:
        r04 = r5.getWidth();
        goto L14
    L16:
        return false;
    }

    @Override // p055f.InterfaceC0784o
    /* JADX INFO: renamed from: k */
    public boolean mo345k(MenuC0779j r4) {
        C0906i r02 = (C0906i) this.f251b;
        if (r4 != r02.f3205c) goto L5;
        return false;
    L5:
        ((SubMenuC0789t) r4).f2868w.getClass();
        r02.getClass();
        InterfaceC0784o r03 = r02.f3207e;
        if (r03 != null) goto L8;
        return false;
    L8:
        return r03.mo345k(r4);
    }

    @Override // p055f.InterfaceC0777h
    /* JADX INFO: renamed from: l */
    public void mo346l(MenuC0779j r2) {
        InterfaceC0777h r02 = ((ActionMenuView) this.f251b).f1146u;
        if (r02 == null) goto L6;
        r02.mo346l(r2);
        return;
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: m */
    public C0103h mo347m() {
        return new C0103h(new C0095d(AbstractC0093c.m329f((ContentInfo.Builder) this.f251b)));
    }

    @Override // p034S.InterfaceC0326f
    /* JADX INFO: renamed from: n */
    public void mo348n(int r2, Serializable r3) {
        if (r2 != 6) goto L5;
    L9:
        Throwable r32 = (Throwable) r3;
    L10:
        ((ProfileInstallReceiver) this.f251b).setResultCode(r2);
        return;
    L5:
        if (r2 == 7) goto L9;
        if (r2 == 8) goto L9;
        goto L9
    }

    @Override // p057g.InterfaceC0921p0
    /* JADX INFO: renamed from: o */
    public void mo349o(MenuC0779j r1, MenuItemC0780k r2) {
        ((ViewOnKeyListenerC0775f) this.f251b).f2758g.removeCallbacksAndMessages(r1);
    }

    @Override // androidx.emoji2.text.InterfaceC0484i
    /* JADX INFO: renamed from: p */
    public void mo350p(AbstractC0358S r10) {
        ThreadFactoryC0476a r7 = new ThreadFactoryC0476a("EmojiCompatInitializer");
        ThreadPoolExecutor r8 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), r7);
        r8.allowCoreThreadTimeOut(true);
        r8.execute(new RunnableC0486k(this, r10, r8, 0));
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: q */
    public int mo351q() {
        return AbstractC0093c.m325b((ContentInfo) this.f251b);
    }

    @Override // p057g.InterfaceC0862H
    /* JADX INFO: renamed from: r */
    public void mo352r(int r1, float r2) {
    }

    @Override // p057g.InterfaceC0921p0
    /* JADX INFO: renamed from: s */
    public void mo353s(MenuC0779j r8, MenuItemC0780k r9) {
        ViewOnKeyListenerC0775f r02 = (ViewOnKeyListenerC0775f) this.f251b;
        C0774e r2 = null;
        r02.f2758g.removeCallbacksAndMessages(null);
        ArrayList r1 = r02.f2760i;
        int r3 = r1.size();
        int r4 = 0;
    L4:
        if (r4 >= r3) goto L9;
        if (r8 == ((C0774e) r1.get(r4)).f2750b) goto L10;
        r4 = r4 + 1;
    L10:
        if (r4 != (-1)) goto L12;
        return;
    L12:
        int r42 = r4 + 1;
        if (r42 >= r1.size()) goto L15;
        r2 = (C0774e) r1.get(r42);
    L15:
        r02.f2758g.postAtTime(new RunnableC0773d(this, r2, r9, r8), r8, SystemClock.uptimeMillis() + 200);
        return;
    L9:
        r4 = -1;
        goto L10
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: t */
    public ContentInfo mo354t() {
        return (ContentInfo) this.f251b;
    }

    public String toString() {
        switch(this.f250a) {
            case 1: goto L7;
            default: goto L5;
        };
    L5:
        return super.toString();
    L7:
        return "ContentInfoCompat{" + ((ContentInfo) this.f251b) + "}";
    }

    @Override // p055f.InterfaceC0777h
    /* JADX INFO: renamed from: u */
    public boolean mo355u(MenuItem r2) {
        InterfaceC0912l r22 = ((ActionMenuView) this.f251b).f1151z;
        if (r22 == null) goto L9;
        Iterator r23 = ((CopyOnWriteArrayList) ((C0859F0) r22).f3090a.f1217G.f251b).iterator();
        if (r23.hasNext() == false) goto L11;
        ((AbstractC0507g) r23.next()).getClass();
        throw null;
    L11:
        return false;
    L9:
        return false;
    }

    @Override // p057g.InterfaceC0862H
    /* JADX INFO: renamed from: v */
    public void mo356v(int r1) {
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: w */
    public void mo357w(int r2) {
        AbstractC0093c.m332i((ContentInfo.Builder) this.f251b, r2);
    }

    /* JADX INFO: renamed from: y */
    public void m358y() {
        ((SparseIntArray) this.f251b).clear();
    }

    /* JADX INFO: renamed from: z */
    public void m359z() {
        ((InputContentInfo) this.f251b).requestPermission();
    }

    public C0095d(View r3) {
        this.f250a = 4;
        if (Build.VERSION.SDK_INT < 30) goto L5;
        C0131w r02 = new C0131w(3, r3);
        r02.f320c = r3;
        this.f251b = r02;
        return;
    L5:
        this.f251b = new C0095d(3, r3);
    }

    public C0095d(WindowInsetsController r4) {
        this.f250a = 4;
        int r2 = 3;
        C0131w r02 = new C0131w(r2, null);
        r02.f321d = r4;
        this.f251b = r02;
    }

    public C0095d(RunnableC0857E0 r1) {
        this.f250a = 2;
        this.f251b = new CopyOnWriteArrayList();
        new HashMap();
    }

    public C0095d(TextView r2) {
        this.f250a = 9;
        AbstractC0040p.m106i(r2, "textView cannot be null");
        this.f251b = new C0256g(r2);
    }

    public C0095d(EditText r3) {
        this.f250a = 8;
        AbstractC0040p.m106i(r3, "editText cannot be null");
        this.f251b = new C0002c(r3, 2);
    }

    public C0095d(Object r2) {
        this.f250a = 5;
        this.f251b = (InputContentInfo) r2;
    }

    public C0095d(Context r2) {
        this.f250a = 12;
        this.f251b = r2.getApplicationContext();
    }

    public C0095d(ContentInfo r2) {
        this.f250a = 1;
        r2.getClass();
        this.f251b = AbstractC0093c.m330g(r2);
    }

    public C0095d(ClipData r2, int r3) {
        this.f250a = 0;
        this.f251b = AbstractC0093c.m328e(r2, r3);
    }

    public C0095d(int r1) {
        this.f250a = r1;
        switch(r1) {
            case 24: goto L7;
            default: goto L4;
        };
    L4:
        this.f251b = new SparseIntArray();
        new SparseIntArray();
        return;
    }
}
