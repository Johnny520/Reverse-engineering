package p000a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.C0983R;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C1038a;

/* JADX INFO: renamed from: a.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0773q extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final a f3046a;

    /* JADX INFO: renamed from: b */
    public final Context f3047b;

    /* JADX INFO: renamed from: c */
    public ActionMenuView f3048c;

    /* JADX INFO: renamed from: d */
    public C1038a f3049d;

    /* JADX INFO: renamed from: e */
    public int f3050e;

    /* JADX INFO: renamed from: f */
    public C0181Jg f3051f;

    /* JADX INFO: renamed from: g */
    public boolean f3052g;

    /* JADX INFO: renamed from: h */
    public boolean f3053h;

    /* JADX INFO: renamed from: a.q$a */
    public class a implements InterfaceC0217Lg {

        /* JADX INFO: renamed from: a */
        public boolean f3054a = false;

        /* JADX INFO: renamed from: b */
        public int f3055b;

        public a() {
        }

        @Override // p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: a */
        public final void mo553a() {
            if (this.f3054a) {
                return;
            }
            AbstractC0773q abstractC0773q = AbstractC0773q.this;
            abstractC0773q.f3051f = null;
            AbstractC0773q.super.setVisibility(this.f3055b);
        }

        @Override // p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: b */
        public final void mo595b() {
            this.f3054a = true;
        }

        @Override // p000a.InterfaceC0217Lg
        /* JADX INFO: renamed from: c */
        public final void mo554c() {
            AbstractC0773q.super.setVisibility(0);
            this.f3054a = false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0773q(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: c */
    public static int m1816c(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* JADX INFO: renamed from: d */
    public static int m1817d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: e */
    public final C0181Jg m1818e(long j, int i) {
        C0181Jg c0181Jg = this.f3051f;
        if (c0181Jg != null) {
            c0181Jg.m489b();
        }
        a aVar = this.f3046a;
        if (i != 0) {
            C0181Jg c0181JgM1994a = C0866ug.m1994a(this);
            c0181JgM1994a.m488a(0.0f);
            c0181JgM1994a.m490c(j);
            AbstractC0773q.this.f3051f = c0181JgM1994a;
            aVar.f3055b = i;
            c0181JgM1994a.m491d(aVar);
            return c0181JgM1994a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0181Jg c0181JgM1994a2 = C0866ug.m1994a(this);
        c0181JgM1994a2.m488a(1.0f);
        c0181JgM1994a2.m490c(j);
        AbstractC0773q.this.f3051f = c0181JgM1994a2;
        aVar.f3055b = i;
        c0181JgM1994a2.m491d(aVar);
        return c0181JgM1994a2;
    }

    public int getAnimatedVisibility() {
        return this.f3051f != null ? this.f3046a.f3055b : getVisibility();
    }

    public int getContentHeight() {
        return this.f3050e;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C0983R.styleable.ActionBar, C0983R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C0983R.styleable.ActionBar_height, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1038a c1038a = this.f3049d;
        if (c1038a != null) {
            Configuration configuration2 = c1038a.f3725b.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c1038a.f4092p = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            C0998f c0998f = c1038a.f3726c;
            if (c0998f != null) {
                c0998f.m2331p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3053h = false;
        }
        if (!this.f3053h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f3053h = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f3053h = false;
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3052g = false;
        }
        if (!this.f3052g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f3052g = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f3052g = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.f3050e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C0181Jg c0181Jg = this.f3051f;
            if (c0181Jg != null) {
                c0181Jg.m489b();
            }
            super.setVisibility(i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC0773q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3046a = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0983R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f3047b = context;
        } else {
            this.f3047b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
