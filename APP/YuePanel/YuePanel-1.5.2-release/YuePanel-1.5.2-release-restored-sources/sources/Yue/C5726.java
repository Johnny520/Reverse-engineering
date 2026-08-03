package Yue;

import Yue.C6898;
import Yue.InterfaceC7144;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5726 implements InterfaceC7462 {

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final String f14163 = "ListPopupWindow";

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final boolean f14164 = false;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int f14165 = 250;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static Method f14166 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static Method f14167 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static Method f14168 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final int f14169 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final int f14170 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final int f14171 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final int f14172 = -2;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final int f14173 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final int f14174 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int f14175 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Context f14176;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public ListAdapter f14177;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C4546 f14178;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f14179;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f14180;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f14181;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f14182;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f14183;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f14184;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f14185;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f14186;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int f14187;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public boolean f14188;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public boolean f14189;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public int f14190;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public View f14191;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public int f14192;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public DataSetObserver f14193;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public View f14194;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public Drawable f14195;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public AdapterView.OnItemClickListener f14196;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public AdapterView.OnItemSelectedListener f14197;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final RunnableC5734 f14198;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final ViewOnTouchListenerC5733 f14199;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public final C5732 f14200;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final RunnableC5730 f14201;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public Runnable f14202;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final Handler f14203;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final Rect f14204;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public Rect f14205;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean f14206;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public PopupWindow f14207;

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ$ۥ */
    public class C0854 extends AbstractViewOnTouchListenerC5066 {
        public C0854(View view) {
            super(view);
        }

        /* JADX DEBUG: Method merged with bridge method: ۥ۟()LYue/ۥۢ۟۠ۤ; */
        @Override // Yue.AbstractViewOnTouchListenerC5066
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5726 mo399() {
            return C5726.this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ$ۥ۟ */
    public class RunnableC0855 implements Runnable {
        public RunnableC0855() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewM17747 = C5726.this.m17747();
            if (viewM17747 == null || viewM17747.getWindowToken() == null) {
                return;
            }
            C5726.this.show();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ$ۥ۟۟, reason: contains not printable characters */
    public class C5727 implements AdapterView.OnItemSelectedListener {
        public C5727() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C4546 c4546;
            if (i == -1 || (c4546 = C5726.this.f14178) == null) {
                return;
            }
            c4546.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(24)
    public static class C5728 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static int m2409(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(29)
    public static class C5729 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m2410(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m2411(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class RunnableC5730 implements Runnable {
        public RunnableC5730() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C5726.this.m17744();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class C5731 extends DataSetObserver {
        public C5731() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C5726.this.mo2407()) {
                C5726.this.show();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C5726.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C5732 implements AbsListView.OnScrollListener {
        public C5732() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i != 1 || C5726.this.m17761() || C5726.this.f14207.getContentView() == null) {
                return;
            }
            C5726 c5726 = C5726.this;
            c5726.f14203.removeCallbacks(c5726.f14198);
            C5726.this.f14198.run();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ$ۥۣ۟۟۟, reason: contains not printable characters */
    public class ViewOnTouchListenerC5733 implements View.OnTouchListener {
        public ViewOnTouchListenerC5733() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = C5726.this.f14207) != null && popupWindow.isShowing() && x >= 0 && x < C5726.this.f14207.getWidth() && y >= 0 && y < C5726.this.f14207.getHeight()) {
                C5726 c5726 = C5726.this;
                c5726.f14203.postDelayed(c5726.f14198, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C5726 c57262 = C5726.this;
            c57262.f14203.removeCallbacks(c57262.f14198);
            return false;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۧۢۤ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public class RunnableC5734 implements Runnable {
        public RunnableC5734() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4546 c4546 = C5726.this.f14178;
            if (c4546 == null || !c4546.isAttachedToWindow() || C5726.this.f14178.getCount() <= C5726.this.f14178.getChildCount()) {
                return;
            }
            int childCount = C5726.this.f14178.getChildCount();
            C5726 c5726 = C5726.this;
            if (childCount <= c5726.f14190) {
                c5726.f14207.setInputMethodMode(2);
                C5726.this.show();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f14166 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(f14163, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f14168 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(f14163, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5726(@InterfaceC6391 Context context) {
        this(context, null, C6898.C1110.f18505);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static boolean m17737(int i) {
        return i == 66 || i == 23;
    }

    @Override // Yue.InterfaceC7462
    public void dismiss() {
        this.f14207.dismiss();
        m17768();
        this.f14207.setContentView(null);
        this.f14178 = null;
        this.f14203.removeCallbacks(this.f14198);
    }

    public void setBackgroundDrawable(@InterfaceC6490 Drawable drawable) {
        this.f14207.setBackgroundDrawable(drawable);
    }

    @Override // Yue.InterfaceC7462
    public void show() {
        int iM17743 = m17743();
        boolean zM17761 = m17761();
        C6711.m21390(this.f14207, this.f14183);
        if (this.f14207.isShowing()) {
            if (m17747().isAttachedToWindow()) {
                int width = this.f14180;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = m17747().getWidth();
                }
                int i = this.f14179;
                if (i == -1) {
                    if (!zM17761) {
                        iM17743 = -1;
                    }
                    if (zM17761) {
                        this.f14207.setWidth(this.f14180 == -1 ? -1 : 0);
                        this.f14207.setHeight(0);
                    } else {
                        this.f14207.setWidth(this.f14180 == -1 ? -1 : 0);
                        this.f14207.setHeight(-1);
                    }
                } else if (i != -2) {
                    iM17743 = i;
                }
                this.f14207.setOutsideTouchable((this.f14189 || this.f14188) ? false : true);
                this.f14207.update(m17747(), this.f14181, this.f14182, width < 0 ? -1 : width, iM17743 < 0 ? -1 : iM17743);
                return;
            }
            return;
        }
        int width2 = this.f14180;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = m17747().getWidth();
        }
        int i2 = this.f14179;
        if (i2 == -1) {
            iM17743 = -1;
        } else if (i2 != -2) {
            iM17743 = i2;
        }
        this.f14207.setWidth(width2);
        this.f14207.setHeight(iM17743);
        m17785(true);
        this.f14207.setOutsideTouchable((this.f14189 || this.f14188) ? false : true);
        this.f14207.setTouchInterceptor(this.f14199);
        if (this.f14186) {
            C6711.m21389(this.f14207, this.f14185);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f14168;
            if (method != null) {
                try {
                    method.invoke(this.f14207, this.f14205);
                } catch (Exception e) {
                    Log.e(f14163, "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            C5729.m2410(this.f14207, this.f14205);
        }
        C6711.m21391(this.f14207, m17747(), this.f14181, this.f14182, this.f14187);
        this.f14178.setSelection(-1);
        if (!this.f14206 || this.f14178.isInTouchMode()) {
            m17744();
        }
        if (this.f14206) {
            return;
        }
        this.f14203.post(this.f14201);
    }

    @Override // Yue.InterfaceC7462
    /* JADX INFO: renamed from: ۥ */
    public boolean mo2407() {
        return this.f14207.isShowing();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public int m2408() {
        return this.f14181;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m17738(int i) {
        this.f14181 = i;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Drawable m17739() {
        return this.f14207.getBackground();
    }

    @Override // Yue.InterfaceC7462
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public ListView mo17740() {
        return this.f14178;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m17741(int i) {
        this.f14182 = i;
        this.f14184 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m17742() {
        if (this.f14184) {
            return this.f14182;
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo6805(@InterfaceC6490 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f14193;
        if (dataSetObserver == null) {
            this.f14193 = new C5731();
        } else {
            ListAdapter listAdapter2 = this.f14177;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f14177 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f14193);
        }
        C4546 c4546 = this.f14178;
        if (c4546 != null) {
            c4546.setAdapter(this.f14177);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final int m17743() {
        int measuredHeight;
        int i;
        int iMakeMeasureSpec;
        View view;
        int i2;
        if (this.f14178 == null) {
            Context context = this.f14176;
            this.f14202 = new RunnableC0855();
            C4546 c4546Mo17746 = mo17746(context, !this.f14206);
            this.f14178 = c4546Mo17746;
            Drawable drawable = this.f14195;
            if (drawable != null) {
                c4546Mo17746.setSelector(drawable);
            }
            this.f14178.setAdapter(this.f14177);
            this.f14178.setOnItemClickListener(this.f14196);
            this.f14178.setFocusable(true);
            this.f14178.setFocusableInTouchMode(true);
            this.f14178.setOnItemSelectedListener(new C5727());
            this.f14178.setOnScrollListener(this.f14200);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f14197;
            if (onItemSelectedListener != null) {
                this.f14178.setOnItemSelectedListener(onItemSelectedListener);
            }
            C4546 c4546 = this.f14178;
            View view2 = this.f14191;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i3 = this.f14192;
                if (i3 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(c4546, layoutParams);
                } else if (i3 != 1) {
                    Log.e(f14163, "Invalid hint position " + this.f14192);
                } else {
                    linearLayout.addView(c4546, layoutParams);
                    linearLayout.addView(view2);
                }
                int i4 = this.f14180;
                if (i4 >= 0) {
                    i2 = Integer.MIN_VALUE;
                } else {
                    i4 = 0;
                    i2 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i4, i2), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = c4546;
            }
            this.f14207.setContentView(view);
        } else {
            View view3 = this.f14191;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f14207.getBackground();
        if (background != null) {
            background.getPadding(this.f14204);
            Rect rect = this.f14204;
            int i5 = rect.top;
            i = rect.bottom + i5;
            if (!this.f14184) {
                this.f14182 = -i5;
            }
        } else {
            this.f14204.setEmpty();
            i = 0;
        }
        int iM17752 = m17752(m17747(), this.f14182, this.f14207.getInputMethodMode() == 2);
        if (this.f14188 || this.f14179 == -1) {
            return iM17752 + i;
        }
        int i6 = this.f14180;
        if (i6 == -2) {
            int i7 = this.f14176.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f14204;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i6 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else {
            int i8 = this.f14176.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f14204;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect3.left + rect3.right), 1073741824);
        }
        int iMo13368 = this.f14178.mo13368(iMakeMeasureSpec, 0, -1, iM17752 - measuredHeight, -1);
        if (iMo13368 > 0) {
            measuredHeight += i + this.f14178.getPaddingTop() + this.f14178.getPaddingBottom();
        }
        return iMo13368 + measuredHeight;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m17744() {
        C4546 c4546 = this.f14178;
        if (c4546 != null) {
            c4546.setListSelectionHidden(true);
            c4546.requestLayout();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public View.OnTouchListener m17745(View view) {
        return new C0854(view);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C4546 mo17746(Context context, boolean z) {
        return new C4546(context, z);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public View m17747() {
        return this.f14194;
    }

    @InterfaceC7651
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m17748() {
        return this.f14207.getAnimationStyle();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Rect m17749() {
        if (this.f14205 != null) {
            return new Rect(this.f14205);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int m17750() {
        return this.f14179;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int m17751() {
        return this.f14207.getInputMethodMode();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final int m17752(View view, int i, boolean z) {
        return C5728.m2409(this.f14207, view, i, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int m17753() {
        return this.f14192;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Object m17754() {
        if (mo2407()) {
            return this.f14178.getSelectedItem();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public long m17755() {
        if (mo2407()) {
            return this.f14178.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int m17756() {
        if (mo2407()) {
            return this.f14178.getSelectedItemPosition();
        }
        return -1;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public View m17757() {
        if (mo2407()) {
            return this.f14178.getSelectedView();
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public int m17758() {
        return this.f14207.getSoftInputMode();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int m17759() {
        return this.f14180;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean m17760() {
        return this.f14188;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean m17761() {
        return this.f14207.getInputMethodMode() == 2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean m17762() {
        return this.f14206;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean m17763(int i, @InterfaceC6391 KeyEvent keyEvent) {
        int iMo13367;
        int count;
        if (mo2407() && i != 62 && (this.f14178.getSelectedItemPosition() >= 0 || !m17737(i))) {
            int selectedItemPosition = this.f14178.getSelectedItemPosition();
            boolean z = !this.f14207.isAboveAnchor();
            ListAdapter listAdapter = this.f14177;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                iMo13367 = zAreAllItemsEnabled ? 0 : this.f14178.mo13367(0, true);
                count = zAreAllItemsEnabled ? listAdapter.getCount() - 1 : this.f14178.mo13367(listAdapter.getCount() - 1, false);
            } else {
                iMo13367 = Integer.MAX_VALUE;
                count = Integer.MIN_VALUE;
            }
            if ((z && i == 19 && selectedItemPosition <= iMo13367) || (!z && i == 20 && selectedItemPosition >= count)) {
                m17744();
                this.f14207.setInputMethodMode(1);
                show();
                return true;
            }
            this.f14178.setListSelectionHidden(false);
            if (this.f14178.onKeyDown(i, keyEvent)) {
                this.f14207.setInputMethodMode(2);
                this.f14178.requestFocusFromTouch();
                show();
                if (i == 19 || i == 20 || i == 23 || i == 66) {
                    return true;
                }
            } else if (z && i == 20) {
                if (selectedItemPosition == count) {
                    return true;
                }
            } else if (!z && i == 19 && selectedItemPosition == iMo13367) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean m17764(int i, @InterfaceC6391 KeyEvent keyEvent) {
        if (i != 4 || !mo2407()) {
            return false;
        }
        View view = this.f14194;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean m17765(int i, @InterfaceC6391 KeyEvent keyEvent) {
        if (!mo2407() || this.f14178.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.f14178.onKeyUp(i, keyEvent);
        if (zOnKeyUp && m17737(i)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public boolean m17766(int i) {
        if (!mo2407()) {
            return false;
        }
        if (this.f14196 == null) {
            return true;
        }
        C4546 c4546 = this.f14178;
        this.f14196.onItemClick(c4546, c4546.getChildAt(i - c4546.getFirstVisiblePosition()), i, c4546.getAdapter().getItemId(i));
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m17767() {
        this.f14203.post(this.f14202);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m17768() {
        View view = this.f14191;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f14191);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m17769(@InterfaceC6490 View view) {
        this.f14194 = view;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void m17770(@InterfaceC7651 int i) {
        this.f14207.setAnimationStyle(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m17771(int i) {
        Drawable background = this.f14207.getBackground();
        if (background == null) {
            m17790(i);
            return;
        }
        background.getPadding(this.f14204);
        Rect rect = this.f14204;
        this.f14180 = rect.left + rect.right + i;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m17772(boolean z) {
        this.f14188 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m17773(int i) {
        this.f14187 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m17774(@InterfaceC6490 Rect rect) {
        this.f14205 = rect != null ? new Rect(rect) : null;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m17775(boolean z) {
        this.f14189 = z;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m17776(int i) {
        if (i < 0 && -2 != i && -1 != i) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f14179 = i;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m17777(int i) {
        this.f14207.setInputMethodMode(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m17778(int i) {
        this.f14190 = i;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public void m17779(Drawable drawable) {
        this.f14195 = drawable;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m17780(boolean z) {
        this.f14206 = z;
        this.f14207.setFocusable(z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m17781(@InterfaceC6490 PopupWindow.OnDismissListener onDismissListener) {
        this.f14207.setOnDismissListener(onDismissListener);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public void m17782(@InterfaceC6490 AdapterView.OnItemClickListener onItemClickListener) {
        this.f14196 = onItemClickListener;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void m17783(@InterfaceC6490 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f14197 = onItemSelectedListener;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m17784(boolean z) {
        this.f14186 = true;
        this.f14185 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final void m17785(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            C5729.m2411(this.f14207, z);
            return;
        }
        Method method = f14166;
        if (method != null) {
            try {
                method.invoke(this.f14207, Boolean.valueOf(z));
            } catch (Exception unused) {
                Log.i(f14163, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public void m17786(int i) {
        this.f14192 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public void m17787(@InterfaceC6490 View view) {
        boolean zMo2407 = mo2407();
        if (zMo2407) {
            m17768();
        }
        this.f14191 = view;
        if (zMo2407) {
            show();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void m17788(int i) {
        C4546 c4546 = this.f14178;
        if (!mo2407() || c4546 == null) {
            return;
        }
        c4546.setListSelectionHidden(false);
        c4546.setSelection(i);
        if (c4546.getChoiceMode() != 0) {
            c4546.setItemChecked(i, true);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public void m17789(int i) {
        this.f14207.setSoftInputMode(i);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m17790(int i) {
        this.f14180 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public void m17791(int i) {
        this.f14183 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C5726(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, C6898.C1110.f18505);
    }

    public C5726(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i) {
        this(context, attributeSet, i, 0);
    }

    public C5726(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, @InterfaceC3451 int i, @InterfaceC7651 int i2) {
        this.f14179 = -2;
        this.f14180 = -2;
        this.f14183 = 1002;
        this.f14187 = 0;
        this.f14188 = false;
        this.f14189 = false;
        this.f14190 = Integer.MAX_VALUE;
        this.f14192 = 0;
        this.f14198 = new RunnableC5734();
        this.f14199 = new ViewOnTouchListenerC5733();
        this.f14200 = new C5732();
        this.f14201 = new RunnableC5730();
        this.f14204 = new Rect();
        this.f14176 = context;
        this.f14203 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6898.C6909.f19625, i, i2);
        this.f14181 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6898.C6909.f19626, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6898.C6909.f19627, 0);
        this.f14182 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f14184 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C3317 c3317 = new C3317(context, attributeSet, i, i2);
        this.f14207 = c3317;
        c3317.setInputMethodMode(1);
    }
}
