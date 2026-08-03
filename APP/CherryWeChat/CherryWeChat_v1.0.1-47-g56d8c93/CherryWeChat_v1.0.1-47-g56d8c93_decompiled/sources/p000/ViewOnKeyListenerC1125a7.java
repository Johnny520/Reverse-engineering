package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: a7 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC1125a7 extends AbstractC2642vr implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: b */
    public final Context f3542b;

    /* JADX INFO: renamed from: c */
    public final int f3543c;

    /* JADX INFO: renamed from: d */
    public final int f3544d;

    /* JADX INFO: renamed from: e */
    public final boolean f3545e;

    /* JADX INFO: renamed from: f */
    public final Handler f3546f;

    /* JADX INFO: renamed from: n */
    public View f3554n;

    /* JADX INFO: renamed from: o */
    public View f3555o;

    /* JADX INFO: renamed from: p */
    public int f3556p;

    /* JADX INFO: renamed from: q */
    public boolean f3557q;

    /* JADX INFO: renamed from: r */
    public boolean f3558r;

    /* JADX INFO: renamed from: s */
    public int f3559s;

    /* JADX INFO: renamed from: t */
    public int f3560t;

    /* JADX INFO: renamed from: v */
    public boolean f3562v;

    /* JADX INFO: renamed from: w */
    public InterfaceC0120Cr f3563w;

    /* JADX INFO: renamed from: x */
    public ViewTreeObserver f3564x;

    /* JADX INFO: renamed from: y */
    public PopupWindow.OnDismissListener f3565y;

    /* JADX INFO: renamed from: z */
    public boolean f3566z;

    /* JADX INFO: renamed from: g */
    public final ArrayList f3547g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f3548h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final ViewTreeObserverOnGlobalLayoutListenerC0949W3 f3549i = new ViewTreeObserverOnGlobalLayoutListenerC0949W3(2, this);

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0995X6 f3550j = new ViewOnAttachStateChangeListenerC0995X6(0, this);

    /* JADX INFO: renamed from: k */
    public final C0132D2 f3551k = new C0132D2(7, this);

    /* JADX INFO: renamed from: l */
    public int f3552l = 0;

    /* JADX INFO: renamed from: m */
    public int f3553m = 0;

    /* JADX INFO: renamed from: u */
    public boolean f3561u = false;

    public ViewOnKeyListenerC1125a7(Context context, View view, int i, boolean z) {
        this.f3542b = context;
        this.f3554n = view;
        this.f3544d = i;
        this.f3545e = z;
        this.f3556p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f3543c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f3546f = new Handler();
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: a */
    public final boolean mo575a() {
        ArrayList arrayList = this.f3548h;
        return arrayList.size() > 0 && ((C1081Z6) arrayList.get(0)).f3447a.f962z.isShowing();
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: b */
    public final void mo213b(MenuC2204lr menuC2204lr, boolean z) {
        ArrayList arrayList = this.f3548h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC2204lr == ((C1081Z6) arrayList.get(i)).f3448b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C1081Z6) arrayList.get(i2)).f3448b.m4430c(false);
        }
        C1081Z6 c1081z6 = (C1081Z6) arrayList.remove(i);
        MenuC2204lr menuC2204lr2 = c1081z6.f3448b;
        C0077Br c0077Br = c1081z6.f3447a;
        C0606O3 c0606o3 = c0077Br.f962z;
        menuC2204lr2.m4437r(this);
        if (this.f3566z) {
            AbstractC2771yr.m5342b(c0606o3, null);
            c0606o3.setAnimationStyle(0);
        }
        c0077Br.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f3556p = ((C1081Z6) arrayList.get(size2 - 1)).f3449c;
        } else {
            this.f3556p = this.f3554n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C1081Z6) arrayList.get(0)).f3448b.m4430c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC0120Cr interfaceC0120Cr = this.f3563w;
        if (interfaceC0120Cr != null) {
            interfaceC0120Cr.mo193b(menuC2204lr, true);
        }
        ViewTreeObserver viewTreeObserver = this.f3564x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f3564x.removeGlobalOnLayoutListener(this.f3549i);
            }
            this.f3564x = null;
        }
        this.f3555o.removeOnAttachStateChangeListener(this.f3550j);
        this.f3565y.onDismiss();
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: c */
    public final void mo577c() {
        if (mo575a()) {
            return;
        }
        ArrayList arrayList = this.f3547g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2049u((MenuC2204lr) it.next());
        }
        arrayList.clear();
        View view = this.f3554n;
        this.f3555o = view;
        if (view != null) {
            boolean z = this.f3564x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f3564x = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f3549i);
            }
            this.f3555o.addOnAttachStateChangeListener(this.f3550j);
        }
    }

    @Override // p000.InterfaceC2168ky
    public final void dismiss() {
        ArrayList arrayList = this.f3548h;
        int size = arrayList.size();
        if (size > 0) {
            C1081Z6[] c1081z6Arr = (C1081Z6[]) arrayList.toArray(new C1081Z6[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1081Z6 c1081z6 = c1081z6Arr[i];
                if (c1081z6.f3447a.f962z.isShowing()) {
                    c1081z6.f3447a.dismiss();
                }
            }
        }
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: e */
    public final void mo216e(InterfaceC0120Cr interfaceC0120Cr) {
        this.f3563w = interfaceC0120Cr;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: g */
    public final void mo218g() {
        Iterator it = this.f3548h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1081Z6) it.next()).f3447a.f939c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C2070ir) adapter).notifyDataSetChanged();
        }
    }

    @Override // p000.InterfaceC2168ky
    /* JADX INFO: renamed from: h */
    public final C0365Ie mo580h() {
        ArrayList arrayList = this.f3548h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1081Z6) arrayList.get(arrayList.size() - 1)).f3447a.f939c;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: j */
    public final boolean mo221j(SubMenuC0214Ez subMenuC0214Ez) {
        for (C1081Z6 c1081z6 : this.f3548h) {
            if (subMenuC0214Ez == c1081z6.f3448b) {
                c1081z6.f3447a.f939c.requestFocus();
                return true;
            }
        }
        if (!subMenuC0214Ez.hasVisibleItems()) {
            return false;
        }
        mo1945l(subMenuC0214Ez);
        InterfaceC0120Cr interfaceC0120Cr = this.f3563w;
        if (interfaceC0120Cr != null) {
            interfaceC0120Cr.mo194s(subMenuC0214Ez);
        }
        return true;
    }

    @Override // p000.InterfaceC0163Dr
    /* JADX INFO: renamed from: k */
    public final boolean mo222k() {
        return false;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: l */
    public final void mo1945l(MenuC2204lr menuC2204lr) {
        menuC2204lr.m4429b(this, this.f3542b);
        if (mo575a()) {
            m2049u(menuC2204lr);
        } else {
            this.f3547g.add(menuC2204lr);
        }
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: n */
    public final void mo1946n(View view) {
        if (this.f3554n != view) {
            this.f3554n = view;
            this.f3553m = Gravity.getAbsoluteGravity(this.f3552l, view.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: o */
    public final void mo1947o(boolean z) {
        this.f3561u = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1081Z6 c1081z6;
        ArrayList arrayList = this.f3548h;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1081z6 = null;
                break;
            }
            c1081z6 = (C1081Z6) arrayList.get(i);
            if (!c1081z6.f3447a.f962z.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c1081z6 != null) {
            c1081z6.f3448b.m4430c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: p */
    public final void mo1948p(int i) {
        if (this.f3552l != i) {
            this.f3552l = i;
            this.f3553m = Gravity.getAbsoluteGravity(i, this.f3554n.getLayoutDirection());
        }
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: q */
    public final void mo1949q(int i) {
        this.f3557q = true;
        this.f3559s = i;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: r */
    public final void mo1950r(PopupWindow.OnDismissListener onDismissListener) {
        this.f3565y = onDismissListener;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: s */
    public final void mo1951s(boolean z) {
        this.f3562v = z;
    }

    @Override // p000.AbstractC2642vr
    /* JADX INFO: renamed from: t */
    public final void mo1952t(int i) {
        this.f3558r = true;
        this.f3560t = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2049u(MenuC2204lr menuC2204lr) {
        boolean z;
        int i;
        C1081Z6 c1081z6;
        View childAt;
        int i2;
        int i3;
        MenuItem item;
        C2070ir c2070ir;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f3542b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C2070ir c2070ir2 = new C2070ir(menuC2204lr, layoutInflaterFrom, this.f3545e, R.layout.abc_cascading_menu_item_layout);
        if (!mo575a() && this.f3561u) {
            c2070ir2.f7326c = true;
        } else if (mo575a()) {
            int size = menuC2204lr.f7665f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = menuC2204lr.getItem(i4);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i4++;
            }
            c2070ir2.f7326c = z;
        }
        int iM5176m = AbstractC2642vr.m5176m(c2070ir2, context, this.f3543c);
        C0077Br c0077Br = new C0077Br(context, null, this.f3544d, 0);
        c0077Br.f186C = this.f3551k;
        c0077Br.f952p = this;
        c0077Br.f962z.setOnDismissListener(this);
        c0077Br.f951o = this.f3554n;
        c0077Br.f948l = this.f3553m;
        c0077Br.f961y = true;
        c0077Br.f962z.setFocusable(true);
        c0077Br.f962z.setInputMethodMode(2);
        c0077Br.mo584p(c2070ir2);
        c0077Br.m585r(iM5176m);
        c0077Br.f948l = this.f3553m;
        ArrayList arrayList = this.f3548h;
        if (arrayList.size() > 0) {
            c1081z6 = (C1081Z6) arrayList.get(arrayList.size() - 1);
            MenuC2204lr menuC2204lr2 = c1081z6.f3448b;
            int size2 = menuC2204lr2.f7665f.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    item = null;
                    break;
                }
                item = menuC2204lr2.getItem(i5);
                if (item.hasSubMenu() && menuC2204lr == item.getSubMenu()) {
                    break;
                } else {
                    i5++;
                }
            }
            if (item == null) {
                i = 1;
                childAt = null;
            } else {
                C0365Ie c0365Ie = c1081z6.f3447a.f939c;
                ListAdapter adapter = c0365Ie.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c2070ir = (C2070ir) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c2070ir = (C2070ir) adapter;
                    headersCount = 0;
                }
                int count = c2070ir.getCount();
                i = 1;
                int i6 = 0;
                while (true) {
                    if (i6 >= count) {
                        i6 = -1;
                        break;
                    } else if (item == c2070ir.getItem(i6)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 != -1 && (firstVisiblePosition = (i6 + headersCount) - c0365Ie.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c0365Ie.getChildCount()) {
                    childAt = c0365Ie.getChildAt(firstVisiblePosition);
                }
            }
            if (childAt == null) {
                int i7 = Build.VERSION.SDK_INT;
                C0606O3 c0606o3 = c0077Br.f962z;
                if (i7 <= 28) {
                    Method method = C0077Br.f185D;
                    if (method != null) {
                        try {
                            method.invoke(c0606o3, Boolean.FALSE);
                        } catch (Exception unused) {
                        }
                    }
                } else {
                    AbstractC2814zr.m5448a(c0606o3, false);
                }
                AbstractC2771yr.m5341a(c0077Br.f962z, null);
                C0365Ie c0365Ie2 = ((C1081Z6) arrayList.get(arrayList.size() - 1)).f3447a.f939c;
                int[] iArr = new int[2];
                c0365Ie2.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f3555o.getWindowVisibleDisplayFrame(rect);
                if (this.f3556p == i) {
                    if (c0365Ie2.getWidth() + iArr[0] + iM5176m > rect.right) {
                        i3 = 0;
                        i2 = 1;
                    } else {
                        i2 = 1;
                        i3 = 1;
                    }
                } else if (iArr[0] - iM5176m < 0) {
                }
                boolean z2 = i3 == i2;
                this.f3556p = i3;
                c0077Br.f951o = childAt;
                if ((this.f3553m & 5) != 5) {
                    iM5176m = z2 ? childAt.getWidth() : 0 - iM5176m;
                } else if (!z2) {
                    iM5176m = 0 - childAt.getWidth();
                }
                c0077Br.f942f = iM5176m;
                c0077Br.f947k = true;
                c0077Br.f946j = true;
                c0077Br.m581j(0);
            } else {
                if (this.f3557q) {
                    c0077Br.f942f = this.f3559s;
                }
                if (this.f3558r) {
                    c0077Br.m581j(this.f3560t);
                }
                Rect rect2 = this.f9155a;
                c0077Br.f960x = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C1081Z6(c0077Br, menuC2204lr, this.f3556p));
            c0077Br.mo577c();
            C0365Ie c0365Ie3 = c0077Br.f939c;
            c0365Ie3.setOnKeyListener(this);
            if (c1081z6 == null || !this.f3562v || menuC2204lr.f7672m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0365Ie3, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC2204lr.f7672m);
            c0365Ie3.addHeaderView(frameLayout, null, false);
            c0077Br.mo577c();
            return;
        }
        i = 1;
        c1081z6 = null;
        childAt = null;
        if (childAt == null) {
        }
        arrayList.add(new C1081Z6(c0077Br, menuC2204lr, this.f3556p));
        c0077Br.mo577c();
        C0365Ie c0365Ie32 = c0077Br.f939c;
        c0365Ie32.setOnKeyListener(this);
        if (c1081z6 == null) {
        }
    }
}
