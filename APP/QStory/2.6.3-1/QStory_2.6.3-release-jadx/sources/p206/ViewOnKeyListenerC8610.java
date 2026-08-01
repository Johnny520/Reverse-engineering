package p206;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
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
import androidx.appcompat.widget.AbstractC1016;
import androidx.appcompat.widget.AbstractC1017;
import androidx.appcompat.widget.C0981;
import androidx.appcompat.widget.C1015;
import androidx.appcompat.widget.C1024;
import androidx.appcompat.widget.ViewTreeObserverOnGlobalLayoutListenerC0968;
import androidx.compose.p001ui.graphics.ViewOnAttachStateChangeListenerC2427;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.chat.C6686;

/* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnKeyListenerC8610 extends AbstractC8623 implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public PopupWindow.OnDismissListener f21484;

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    public boolean f21485;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean f21486;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public ViewTreeObserver f21488;

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public InterfaceC8618 f21489;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public View f21490;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public int f21496;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public int f21497;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public boolean f21498;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public boolean f21499;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f21500;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public View f21501;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f21502;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f21503;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final boolean f21506;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final Handler f21507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Context f21508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f21509;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final ArrayList f21504 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final ArrayList f21505 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC0968 f21495 = new ViewTreeObserverOnGlobalLayoutListenerC0968(this, 2);

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final ViewOnAttachStateChangeListenerC2427 f21494 = new ViewOnAttachStateChangeListenerC2427(this, 3);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final C6686 f21493 = new C6686(this, 21);

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public int f21492 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public int f21491 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f21487 = false;

    public ViewOnKeyListenerC8610(Context context, View view, int i, int i2, boolean z) {
        this.f21508 = context;
        this.f21490 = view;
        this.f21503 = i;
        this.f21502 = i2;
        this.f21506 = z;
        this.f21500 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f21509 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0328R.dimen.abc_config_prefDialogWidth));
        this.f21507 = new Handler();
    }

    @Override // p206.InterfaceC8606
    public final void dismiss() {
        ArrayList arrayList = this.f21505;
        int size = arrayList.size();
        if (size > 0) {
            C8611[] c8611Arr = (C8611[]) arrayList.toArray(new C8611[size]);
            for (int i = size - 1; i >= 0; i--) {
                C8611 c8611 = c8611Arr[i];
                if (c8611.f21512.f1054.isShowing()) {
                    c8611.f21512.dismiss();
                }
            }
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C8611 c8611;
        ArrayList arrayList = this.f21505;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c8611 = null;
                break;
            }
            c8611 = (C8611) arrayList.get(i);
            if (!c8611.f21512.f1054.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c8611 != null) {
            c8611.f21511.m13713(false);
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

    @Override // p206.AbstractC8623
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f21484 = onDismissListener;
    }

    @Override // p206.InterfaceC8606
    public final void show() {
        if (mo1206()) {
            return;
        }
        ArrayList arrayList = this.f21504;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m13701((MenuC8631) it.next());
        }
        arrayList.clear();
        View view = this.f21490;
        this.f21501 = view;
        if (view != null) {
            boolean z = this.f21488 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f21488 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f21495);
            }
            this.f21501.addOnAttachStateChangeListener(this.f21494);
        }
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final boolean mo1169() {
        return false;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final boolean mo1172(SubMenuC8604 subMenuC8604) {
        for (C8611 c8611 : this.f21505) {
            if (subMenuC8604 == c8611.f21511) {
                c8611.f21512.f1078.requestFocus();
                return true;
            }
        }
        if (!subMenuC8604.hasVisibleItems()) {
            return false;
        }
        mo13698(subMenuC8604);
        InterfaceC8618 interfaceC8618 = this.f21489;
        if (interfaceC8618 != null) {
            interfaceC8618.mo757(subMenuC8604);
        }
        return true;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1173(MenuC8631 menuC8631, boolean z) {
        ArrayList arrayList = this.f21505;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC8631 == ((C8611) arrayList.get(i)).f21511) {
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
            ((C8611) arrayList.get(i2)).f21511.m13713(false);
        }
        C8611 c8611 = (C8611) arrayList.remove(i);
        MenuC8631 menuC86312 = c8611.f21511;
        C1015 c1015 = c8611.f21512;
        C0981 c0981 = c1015.f1054;
        menuC86312.m13722(this);
        if (this.f21485) {
            AbstractC1016.m1187(c0981, null);
            c0981.setAnimationStyle(0);
        }
        c1015.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f21500 = ((C8611) arrayList.get(size2 - 1)).f21510;
        } else {
            this.f21500 = this.f21490.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((C8611) arrayList.get(0)).f21511.m13713(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC8618 interfaceC8618 = this.f21489;
        if (interfaceC8618 != null) {
            interfaceC8618.mo750(menuC8631, true);
        }
        ViewTreeObserver viewTreeObserver = this.f21488;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f21488.removeGlobalOnLayoutListener(this.f21495);
            }
            this.f21488 = null;
        }
        this.f21501.removeOnAttachStateChangeListener(this.f21494);
        this.f21484.onDismiss();
    }

    @Override // p206.InterfaceC8606
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo1206() {
        ArrayList arrayList = this.f21505;
        return arrayList.size() > 0 && ((C8611) arrayList.get(0)).f21512.f1054.isShowing();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x018c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13701(MenuC8631 menuC8631) {
        boolean z;
        char c;
        View childAt;
        C8611 c8611;
        int i;
        int i2;
        MenuItem item;
        C8627 c8627;
        int headersCount;
        int firstVisiblePosition;
        Context context = this.f21508;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        C8627 c86272 = new C8627(menuC8631, layoutInflaterFrom, this.f21506, C0328R.layout.abc_cascading_menu_item_layout);
        if (!mo1206() && this.f21487) {
            c86272.f21555 = true;
        } else if (mo1206()) {
            int size = menuC8631.f21610.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                MenuItem item2 = menuC8631.getItem(i3);
                if (item2.isVisible() && item2.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            c86272.f21555 = z;
        }
        int iM13706 = AbstractC8623.m13706(c86272, context, this.f21509);
        C1015 c1015 = new C1015(context, null, this.f21503, this.f21502);
        c1015.f1023 = this.f21493;
        c1015.setOnItemClickListener(this);
        c1015.setOnDismissListener(this);
        c1015.f1059 = this.f21490;
        c1015.f1062 = this.f21491;
        c1015.f1057 = true;
        C0981 c0981 = c1015.f1054;
        c0981.setFocusable(true);
        c0981.setInputMethodMode(2);
        c1015.mo1074(c86272);
        c1015.m1207(iM13706);
        c1015.f1062 = this.f21491;
        ArrayList arrayList = this.f21505;
        if (arrayList.size() > 0) {
            c8611 = (C8611) AbstractC7012.m12145(1, arrayList);
            MenuC8631 menuC86312 = c8611.f21511;
            int size2 = menuC86312.f21610.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    item = null;
                    break;
                }
                item = menuC86312.getItem(i4);
                if (item.hasSubMenu() && menuC8631 == item.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (item == null) {
                childAt = null;
                c = 0;
            } else {
                C1024 c1024 = c8611.f21512.f1078;
                ListAdapter adapter = c1024.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c8627 = (C8627) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c8627 = (C8627) adapter;
                    headersCount = 0;
                }
                int count = c8627.getCount();
                int i5 = 0;
                c = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (item == c8627.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                childAt = (i5 != -1 && (firstVisiblePosition = (i5 + headersCount) - c1024.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1024.getChildCount()) ? c1024.getChildAt(firstVisiblePosition) : null;
            }
        } else {
            c = 0;
            childAt = null;
            c8611 = null;
        }
        if (childAt != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = C1015.f1022;
                if (method != null) {
                    try {
                        Object[] objArr = new Object[1];
                        objArr[c] = Boolean.FALSE;
                        method.invoke(c0981, objArr);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                AbstractC1017.m1189(c0981, c);
            }
            AbstractC1016.m1188(c0981, null);
            C1024 c10242 = ((C8611) arrayList.get(arrayList.size() - 1)).f21512.f1078;
            int[] iArr = new int[2];
            c10242.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            this.f21501.getWindowVisibleDisplayFrame(rect);
            if (this.f21500 == 1) {
                i = (c10242.getWidth() + iArr[0]) + iM13706 > rect.right ? 0 : 1;
                boolean z2 = i != 1;
                this.f21500 = i;
                c1015.f1059 = childAt;
                if ((this.f21491 & 5) == 5) {
                    i2 = 0;
                    iM13706 = z2 ? childAt.getWidth() : 0 - iM13706;
                } else if (z2) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    iM13706 = 0 - childAt.getWidth();
                }
                c1015.f1075 = iM13706;
                c1015.f1063 = true;
                c1015.f1064 = true;
                c1015.m1208(i2);
            } else {
                if (iArr[0] - iM13706 >= 0) {
                    i = 0;
                }
                if (i != 1) {
                }
                this.f21500 = i;
                c1015.f1059 = childAt;
                if ((this.f21491 & 5) == 5) {
                }
                c1015.f1075 = iM13706;
                c1015.f1063 = true;
                c1015.f1064 = true;
                c1015.m1208(i2);
            }
        } else {
            if (this.f21499) {
                c1015.f1075 = this.f21497;
            }
            if (this.f21498) {
                c1015.m1208(this.f21496);
            }
            Rect rect2 = this.f21547;
            c1015.f1058 = rect2 != null ? new Rect(rect2) : null;
        }
        arrayList.add(new C8611(c1015, menuC8631, this.f21500));
        c1015.show();
        C1024 c10243 = c1015.f1078;
        c10243.setOnKeyListener(this);
        if (c8611 == null && this.f21486 && menuC8631.f21596 != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C0328R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c10243, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC8631.f21596);
            c10243.addHeaderView(frameLayout, null, false);
            c1015.show();
        }
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo13692(boolean z) {
        this.f21487 = z;
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo13693(View view) {
        if (this.f21490 != view) {
            this.f21490 = view;
            this.f21491 = Gravity.getAbsoluteGravity(this.f21492, view.getLayoutDirection());
        }
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo13694(boolean z) {
        this.f21486 = z;
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo13695(int i) {
        this.f21498 = true;
        this.f21496 = i;
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo13696(int i) {
        if (this.f21492 != i) {
            this.f21492 = i;
            this.f21491 = Gravity.getAbsoluteGravity(i, this.f21490.getLayoutDirection());
        }
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final void mo13697(int i) {
        this.f21499 = true;
        this.f21497 = i;
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1174() {
        Iterator it = this.f21505.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C8611) it.next()).f21512.f1078.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C8627) adapter).notifyDataSetChanged();
        }
    }

    @Override // p206.InterfaceC8619
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo1261(InterfaceC8618 interfaceC8618) {
        this.f21489 = interfaceC8618;
    }

    @Override // p206.AbstractC8623
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo13698(MenuC8631 menuC8631) {
        menuC8631.m13714(this, this.f21508);
        if (mo1206()) {
            m13701(menuC8631);
        } else {
            this.f21504.add(menuC8631);
        }
    }

    @Override // p206.InterfaceC8606
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final C1024 mo1211() {
        ArrayList arrayList = this.f21505;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C8611) AbstractC7012.m12145(1, arrayList)).f21512.f1078;
    }
}
