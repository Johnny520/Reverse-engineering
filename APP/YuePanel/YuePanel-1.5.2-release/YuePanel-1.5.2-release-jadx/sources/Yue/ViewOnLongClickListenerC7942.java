package Yue;

import Yue.InterfaceC7144;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: Yue.ۥۢۡۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class ViewOnLongClickListenerC7942 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f23638 = "TooltipCompatHandler";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final long f23639 = 2500;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final long f23640 = 15000;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final long f23641 = 3000;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static ViewOnLongClickListenerC7942 f23642;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static ViewOnLongClickListenerC7942 f23643;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final View f23644;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final CharSequence f23645;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int f23646;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final Runnable f23647 = new Runnable() { // from class: Yue.ۥۣۢۡۨ
        @Override // java.lang.Runnable
        public final void run() {
            this.f23636.m25045();
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final Runnable f23648 = new Runnable() { // from class: Yue.ۥۢۡۨۤ
        @Override // java.lang.Runnable
        public final void run() {
            this.f23637.m25044();
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f23649;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f23650;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C7943 f23651;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public boolean f23652;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean f23653;

    public ViewOnLongClickListenerC7942(View view, CharSequence charSequence) {
        this.f23644 = view;
        this.f23645 = charSequence;
        this.f23646 = C8299.m27596(ViewConfiguration.get(view.getContext()));
        m25043();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static void m25041(ViewOnLongClickListenerC7942 viewOnLongClickListenerC7942) {
        ViewOnLongClickListenerC7942 viewOnLongClickListenerC79422 = f23642;
        if (viewOnLongClickListenerC79422 != null) {
            viewOnLongClickListenerC79422.m3956();
        }
        f23642 = viewOnLongClickListenerC7942;
        if (viewOnLongClickListenerC7942 != null) {
            viewOnLongClickListenerC7942.m25046();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static void m25042(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC7942 viewOnLongClickListenerC7942 = f23642;
        if (viewOnLongClickListenerC7942 != null && viewOnLongClickListenerC7942.f23644 == view) {
            m25041(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC7942(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC7942 viewOnLongClickListenerC79422 = f23643;
        if (viewOnLongClickListenerC79422 != null && viewOnLongClickListenerC79422.f23644 == view) {
            viewOnLongClickListenerC79422.m25044();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f23651 != null && this.f23652) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f23644.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m25043();
                m25044();
            }
        } else if (this.f23644.isEnabled() && this.f23651 == null && m25048(motionEvent)) {
            m25041(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f23649 = view.getWidth() / 2;
        this.f23650 = view.getHeight() / 2;
        m25047(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m25044();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3956() {
        this.f23644.removeCallbacks(this.f23647);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m25043() {
        this.f23653 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m25044() {
        if (f23643 == this) {
            f23643 = null;
            C7943 c7943 = this.f23651;
            if (c7943 != null) {
                c7943.m25049();
                this.f23651 = null;
                m25043();
                this.f23644.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f23638, "sActiveHandler.mPopup == null");
            }
        }
        if (f23642 == this) {
            m25041(null);
        }
        this.f23644.removeCallbacks(this.f23648);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final /* synthetic */ void m25045() {
        m25047(false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m25046() {
        this.f23644.postDelayed(this.f23647, ViewConfiguration.getLongPressTimeout());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m25047(boolean z) {
        long longPressTimeout;
        long j;
        long j2;
        if (this.f23644.isAttachedToWindow()) {
            m25041(null);
            ViewOnLongClickListenerC7942 viewOnLongClickListenerC7942 = f23643;
            if (viewOnLongClickListenerC7942 != null) {
                viewOnLongClickListenerC7942.m25044();
            }
            f23643 = this;
            this.f23652 = z;
            C7943 c7943 = new C7943(this.f23644.getContext());
            this.f23651 = c7943;
            c7943.m25051(this.f23644, this.f23649, this.f23650, this.f23652, this.f23645);
            this.f23644.addOnAttachStateChangeListener(this);
            if (this.f23652) {
                j2 = f23639;
            } else {
                if ((C8273.m27385(this.f23644) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = f23641;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j = f23640;
                }
                j2 = j - longPressTimeout;
            }
            this.f23644.removeCallbacks(this.f23648);
            this.f23644.postDelayed(this.f23648, j2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m25048(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (!this.f23653 && Math.abs(x - this.f23649) <= this.f23646 && Math.abs(y - this.f23650) <= this.f23646) {
            return false;
        }
        this.f23649 = x;
        this.f23650 = y;
        this.f23653 = false;
        return true;
    }
}
