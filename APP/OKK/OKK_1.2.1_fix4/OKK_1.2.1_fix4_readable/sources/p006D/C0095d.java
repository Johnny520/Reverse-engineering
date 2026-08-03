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

    public /* synthetic */ C0095d(int i2, Object obj) {
        this.f250a = i2;
        this.f251b = obj;
    }

    /* JADX INFO: renamed from: x */
    public static int m337x(int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            i4++;
            if (i4 == i3) {
                i5++;
                i4 = 0;
            } else if (i4 > i3) {
                i5++;
                i4 = 1;
            }
        }
        return i4 + 1 > i3 ? i5 + 1 : i5;
    }

    /* JADX INFO: renamed from: A */
    public void mo338A() {
        View viewFindViewById;
        View view = (View) this.f251b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC0129u(viewFindViewById, 0));
    }

    @Override // p055f.InterfaceC0784o
    /* JADX INFO: renamed from: a */
    public void mo339a(MenuC0779j menuC0779j, boolean z2) {
        if (menuC0779j instanceof SubMenuC0789t) {
            ((SubMenuC0789t) menuC0779j).f2867v.mo2004j().m1997c(false);
        }
        InterfaceC0784o interfaceC0784o = ((C0906i) this.f251b).f3207e;
        if (interfaceC0784o != null) {
            interfaceC0784o.mo339a(menuC0779j, z2);
        }
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: b */
    public void mo340b(Bundle bundle) {
        ((ContentInfo.Builder) this.f251b).setExtras(bundle);
    }

    @Override // androidx.emoji2.text.InterfaceC0490o
    /* JADX INFO: renamed from: c */
    public boolean mo2c(CharSequence charSequence, int i2, int i3, C0497v c0497v) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i3), (String) this.f251b)) {
            return true;
        }
        c0497v.f1400c = (c0497v.f1400c & 3) | 4;
        return false;
    }

    @Override // p057g.InterfaceC0862H
    /* JADX INFO: renamed from: d */
    public void mo341d(int i2) {
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: e */
    public void mo342e(Uri uri) {
        ((ContentInfo.Builder) this.f251b).setLinkUri(uri);
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: f */
    public int mo343f() {
        return ((ContentInfo) this.f251b).getSource();
    }

    @Override // androidx.emoji2.text.InterfaceC0490o
    /* JADX INFO: renamed from: g */
    public Object mo6g() {
        return this;
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: h */
    public ClipData mo344h() {
        return ((ContentInfo) this.f251b).getClip();
    }

    @Override // p006D.InterfaceC0121q
    /* JADX INFO: renamed from: i */
    public C0122q0 mo8i(View view, C0122q0 c0122q0) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f251b;
        if (!Objects.equals(coordinatorLayout.f1291n, c0122q0)) {
            coordinatorLayout.f1291n = c0122q0;
            boolean z2 = c0122q0.m430a() > 0;
            coordinatorLayout.f1292o = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            C0118o0 c0118o0 = c0122q0.f309a;
            if (!c0118o0.mo392m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    Field field = AbstractC0080Q.f219a;
                    if (childAt.getFitsSystemWindows() && ((C1061d) childAt.getLayoutParams()).f4064a != null && c0118o0.mo392m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0122q0;
    }

    @Override // p008E.InterfaceC0166t
    /* JADX INFO: renamed from: j */
    public boolean mo18j(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f251b;
        if (!swipeDismissBehavior.mo1831r(view)) {
            return false;
        }
        Field field = AbstractC0080Q.f219a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i2 = swipeDismissBehavior.f2276d;
        view.offsetLeftAndRight((!(i2 == 0 && z2) && (i2 != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p055f.InterfaceC0784o
    /* JADX INFO: renamed from: k */
    public boolean mo345k(MenuC0779j menuC0779j) {
        C0906i c0906i = (C0906i) this.f251b;
        if (menuC0779j == c0906i.f3205c) {
            return false;
        }
        ((SubMenuC0789t) menuC0779j).f2868w.getClass();
        c0906i.getClass();
        InterfaceC0784o interfaceC0784o = c0906i.f3207e;
        if (interfaceC0784o != null) {
            return interfaceC0784o.mo345k(menuC0779j);
        }
        return false;
    }

    @Override // p055f.InterfaceC0777h
    /* JADX INFO: renamed from: l */
    public void mo346l(MenuC0779j menuC0779j) {
        InterfaceC0777h interfaceC0777h = ((ActionMenuView) this.f251b).f1146u;
        if (interfaceC0777h != null) {
            interfaceC0777h.mo346l(menuC0779j);
        }
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: m */
    public C0103h mo347m() {
        return new C0103h(new C0095d(((ContentInfo.Builder) this.f251b).build()));
    }

    @Override // p034S.InterfaceC0326f
    /* JADX INFO: renamed from: n */
    public void mo348n(int i2, Serializable serializable) {
        if (i2 == 6 || i2 == 7 || i2 == 8) {
        }
        ((ProfileInstallReceiver) this.f251b).setResultCode(i2);
    }

    @Override // p057g.InterfaceC0921p0
    /* JADX INFO: renamed from: o */
    public void mo349o(MenuC0779j menuC0779j, MenuItemC0780k menuItemC0780k) {
        ((ViewOnKeyListenerC0775f) this.f251b).f2758g.removeCallbacksAndMessages(menuC0779j);
    }

    @Override // androidx.emoji2.text.InterfaceC0484i
    /* JADX INFO: renamed from: p */
    public void mo350p(AbstractC0358S abstractC0358S) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0476a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0486k(this, abstractC0358S, threadPoolExecutor, 0));
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: q */
    public int mo351q() {
        return ((ContentInfo) this.f251b).getFlags();
    }

    @Override // p057g.InterfaceC0862H
    /* JADX INFO: renamed from: r */
    public void mo352r(int i2, float f2) {
    }

    @Override // p057g.InterfaceC0921p0
    /* JADX INFO: renamed from: s */
    public void mo353s(MenuC0779j menuC0779j, MenuItemC0780k menuItemC0780k) {
        ViewOnKeyListenerC0775f viewOnKeyListenerC0775f = (ViewOnKeyListenerC0775f) this.f251b;
        viewOnKeyListenerC0775f.f2758g.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC0775f.f2760i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (menuC0779j == ((C0774e) arrayList.get(i2)).f2750b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return;
        }
        int i3 = i2 + 1;
        viewOnKeyListenerC0775f.f2758g.postAtTime(new RunnableC0773d(this, i3 < arrayList.size() ? (C0774e) arrayList.get(i3) : null, menuItemC0780k, menuC0779j), menuC0779j, SystemClock.uptimeMillis() + 200);
    }

    @Override // p006D.InterfaceC0101g
    /* JADX INFO: renamed from: t */
    public ContentInfo mo354t() {
        return (ContentInfo) this.f251b;
    }

    public String toString() {
        switch (this.f250a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f251b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // p055f.InterfaceC0777h
    /* JADX INFO: renamed from: u */
    public boolean mo355u(MenuItem menuItem) {
        InterfaceC0912l interfaceC0912l = ((ActionMenuView) this.f251b).f1151z;
        if (interfaceC0912l == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((C0859F0) interfaceC0912l).f3090a.f1217G.f251b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        ((AbstractC0507g) it.next()).getClass();
        throw null;
    }

    @Override // p057g.InterfaceC0862H
    /* JADX INFO: renamed from: v */
    public void mo356v(int i2) {
    }

    @Override // p006D.InterfaceC0097e
    /* JADX INFO: renamed from: w */
    public void mo357w(int i2) {
        ((ContentInfo.Builder) this.f251b).setFlags(i2);
    }

    /* JADX INFO: renamed from: y */
    public void m358y() {
        ((SparseIntArray) this.f251b).clear();
    }

    /* JADX INFO: renamed from: z */
    public void m359z() {
        ((InputContentInfo) this.f251b).requestPermission();
    }

    public C0095d(View view) {
        this.f250a = 4;
        if (Build.VERSION.SDK_INT < 30) {
            this.f251b = new C0095d(3, view);
            return;
        }
        C0131w c0131w = new C0131w(3, view);
        c0131w.f320c = view;
        this.f251b = c0131w;
    }

    public C0095d(WindowInsetsController windowInsetsController) {
        this.f250a = 4;
        C0131w c0131w = new C0131w(3, null);
        c0131w.f321d = windowInsetsController;
        this.f251b = c0131w;
    }

    public C0095d(RunnableC0857E0 runnableC0857E0) {
        this.f250a = 2;
        this.f251b = new CopyOnWriteArrayList();
        new HashMap();
    }

    public C0095d(TextView textView) {
        this.f250a = 9;
        AbstractC0040p.m106i(textView, "textView cannot be null");
        this.f251b = new C0256g(textView);
    }

    public C0095d(EditText editText) {
        this.f250a = 8;
        AbstractC0040p.m106i(editText, "editText cannot be null");
        this.f251b = new C0002c(editText, 2);
    }

    public C0095d(Object obj) {
        this.f250a = 5;
        this.f251b = (InputContentInfo) obj;
    }

    public C0095d(Context context) {
        this.f250a = 12;
        this.f251b = context.getApplicationContext();
    }

    public C0095d(ContentInfo contentInfo) {
        this.f250a = 1;
        contentInfo.getClass();
        this.f251b = AbstractC0093c.m330g(contentInfo);
    }

    public C0095d(ClipData clipData, int i2) {
        this.f250a = 0;
        this.f251b = AbstractC0093c.m328e(clipData, i2);
    }

    public C0095d(int i2) {
        this.f250a = i2;
        switch (i2) {
            case 24:
                break;
            default:
                this.f251b = new SparseIntArray();
                new SparseIntArray();
                break;
        }
    }
}
