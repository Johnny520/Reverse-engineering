package Yue;

import Yue.C6898;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C1628;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2966 extends ViewGroup {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f4281 = 200;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C0006 f4282;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Context f4283;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public ActionMenuView f4284;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C1628 f4285;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f4286;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C8357 f4287;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean f4288;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f4289;

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۢ$ۥ */
    public class RunnableC0005 implements Runnable {
        public RunnableC0005() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC2966.this.mo5709();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟۟۠ۢ$ۥ۟ */
    public class C0006 implements InterfaceC8359 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f17 = false;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f18;

        public C0006() {
        }

        @Override // Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ */
        public void mo33(View view) {
            this.f17 = true;
        }

        @Override // Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo34(View view) {
            if (this.f17) {
                return;
            }
            AbstractC2966 abstractC2966 = AbstractC2966.this;
            abstractC2966.f4287 = null;
            AbstractC2966.super.setVisibility(this.f18);
        }

        @Override // Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo5710(View view) {
            AbstractC2966.super.setVisibility(0);
            this.f17 = false;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public C0006 m5711(C8357 c8357, int i) {
            AbstractC2966.this.f4287 = c8357;
            this.f18 = i;
            return this;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2966(@InterfaceC6391 Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m5697(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int getAnimatedVisibility() {
        return this.f4287 != null ? this.f4282.f18 : getVisibility();
    }

    public int getContentHeight() {
        return this.f4286;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C6898.C6909.f2460, C6898.C1110.f18355, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(C6898.C6909.f19379, 0));
        typedArrayObtainStyledAttributes.recycle();
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            c1628.m29200(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4289 = false;
        }
        if (!this.f4289) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f4289 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4289 = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4288 = false;
        }
        if (!this.f4288) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f4288 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4288 = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f4286 = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C8357 c8357 = this.f4287;
            if (c8357 != null) {
                c8357.m27857();
            }
            super.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo5698(int i) {
        mo5708(i, 200L).m27877();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo5699() {
        return mo5704() && getVisibility() == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo5700() {
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            c1628.m29192();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean mo5701() {
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            return c1628.m29195();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean mo5702() {
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            return c1628.m29197();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean mo5703() {
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            return c1628.m29198();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean mo5704() {
        C1628 c1628 = this.f4285;
        return c1628 != null && c1628.m29199();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m5705(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m5706(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void mo5707() {
        post(new RunnableC0005());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C8357 mo5708(int i, long j) {
        C8357 c8357 = this.f4287;
        if (c8357 != null) {
            c8357.m27857();
        }
        if (i != 0) {
            C8357 c8357M4324 = C8273.m27308(this).m4324(0.0f);
            c8357M4324.m27871(j);
            c8357M4324.m27873(this.f4282.m5711(c8357M4324, i));
            return c8357M4324;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C8357 c8357M43242 = C8273.m27308(this).m4324(1.0f);
        c8357M43242.m27871(j);
        c8357M43242.m27873(this.f4282.m5711(c8357M43242, i));
        return c8357M43242;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean mo5709() {
        C1628 c1628 = this.f4285;
        if (c1628 != null) {
            return c1628.m29207();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AbstractC2966(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbstractC2966(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4282 = new C0006();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C6898.C1110.f18352, typedValue, true) && typedValue.resourceId != 0) {
            this.f4283 = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f4283 = context;
        }
    }
}
