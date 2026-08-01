package androidx.compose.p001ui.window;

import android.R;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.AbstractC0881;
import androidx.activity.C0869;
import androidx.activity.C0870;
import androidx.activity.DialogC0890;
import androidx.compose.p001ui.graphics.layer.C2356;
import androidx.compose.p001ui.unit.LayoutDirection;
import androidx.core.view.AbstractC3100;
import androidx.lifecycle.AbstractC3268;
import com.bumptech.glide.AbstractC3889;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.util.C5043;
import java.util.UUID;
import kotlin.C6008;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p221.InterfaceC8725;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC2938 extends DialogC0890 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC7372 f6580;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2936 f6581;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f6582;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2940 f6583;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final View f6584;

    public DialogC2938(InterfaceC7372 interfaceC7372, C2940 c2940, View view, LayoutDirection layoutDirection, InterfaceC8725 interfaceC8725, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), c2940.f6587 ? C0328R.style.DialogWindowTheme : C0328R.style.FloatingDialogWindowTheme), 0);
        this.f6580 = interfaceC7372;
        this.f6583 = c2940;
        this.f6584 = view;
        Window window = getWindow();
        if (window == null) {
            C6755.m11870("Dialog has no window");
            throw null;
        }
        C2940 c29402 = this.f6583;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = c29402.f6592;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        AbstractC3100.m4790(window, this.f6583.f6587);
        window.setGravity(17);
        if (!this.f6583.f6587) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                C2942.f6594.m4410(attributes2);
            }
            if (i >= 30) {
                C2946 c2946 = C2946.f6597;
                c2946.m4415(attributes2, 0);
                c2946.m4414(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        C2936 c2936 = new C2936(getContext(), window);
        setTitle(this.f6583.f6586);
        c2936.setTag(C0328R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c2936.setClipChildren(false);
        c2936.setElevation(interfaceC8725.mo1904(8.0f));
        c2936.setOutlineProvider(new C2356(2));
        this.f6581 = c2936;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m4408(viewGroup);
        }
        setContentView(c2936);
        c2936.setTag(C0328R.id.view_tree_lifecycle_owner, AbstractC3268.m5089(view));
        c2936.setTag(C0328R.id.view_tree_view_model_store_owner, AbstractC3268.m5088(view));
        c2936.setTag(C0328R.id.view_tree_saved_state_registry_owner, AbstractC3889.m7318(view));
        m4409(this.f6580, this.f6583, layoutDirection);
        C0870 onBackPressedDispatcher = getOnBackPressedDispatcher();
        InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.compose.ui.window.DialogWrapper$2
            {
                super(1);
            }

            public final void invoke(AbstractC0881 abstractC0881) {
                DialogC2938 dialogC2938 = this.this$0;
                if (dialogC2938.f6583.f6591) {
                    dialogC2938.f6580.invoke();
                }
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC0881) obj);
                return C6008.f15084;
            }
        };
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m588(new C0869(interfaceC7387), this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m4408(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C2936) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m4408(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f6583.f6591 || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f6580.invoke();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        int iM12617;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f6583.f6590) {
            C2936 c2936 = this.f6581;
            c2936.getClass();
            if (Math.abs(motionEvent.getX()) <= Float.MAX_VALUE && Math.abs(motionEvent.getY()) <= Float.MAX_VALUE && (childAt = c2936.getChildAt(0)) != null) {
                int left = childAt.getLeft() + c2936.getLeft();
                int width = childAt.getWidth() + left;
                int top2 = childAt.getTop() + c2936.getTop();
                int height = childAt.getHeight() + top2;
                int iM126172 = AbstractC7390.m12617(motionEvent.getX());
                if (left <= iM126172 && iM126172 <= width && top2 <= (iM12617 = AbstractC7390.m12617(motionEvent.getY())) && iM12617 <= height) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                        this.f6582 = false;
                        return zOnTouchEvent;
                    }
                }
            }
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f6582 = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.f6582 = false;
                    return zOnTouchEvent;
                }
            } else if (this.f6582) {
                this.f6580.invoke();
                this.f6582 = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m4409(InterfaceC7372 interfaceC7372, C2940 c2940, LayoutDirection layoutDirection) {
        int i;
        this.f6580 = interfaceC7372;
        this.f6583 = c2940;
        SecureFlagPolicy secureFlagPolicy = c2940.f6589;
        boolean zM4394 = AbstractC2924.m4394(this.f6584);
        int i2 = AbstractC2922.f6535[secureFlagPolicy.ordinal()];
        if (i2 == 1) {
            zM4394 = false;
        } else if (i2 == 2) {
            zM4394 = true;
        } else if (i2 != 3) {
            C5043.m9170();
            return;
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zM4394 ? 8192 : -8193, 8192);
        int i3 = AbstractC2941.f6593[layoutDirection.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else {
            if (i3 != 2) {
                C5043.m9170();
                return;
            }
            i = 1;
        }
        C2936 c2936 = this.f6581;
        c2936.setLayoutDirection(i);
        boolean z = c2940.f6587;
        boolean z2 = c2940.f6588;
        Window window2 = c2936.f6578;
        boolean z3 = (c2936.f6574 && z2 == c2936.f6576 && z == c2936.f6575) ? false : true;
        c2936.f6576 = z2;
        c2936.f6575 = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i4 = z2 ? -2 : -1;
            if (i4 != attributes.width || !c2936.f6574) {
                window2.setLayout(i4, -2);
                c2936.f6574 = true;
            }
        }
        setCanceledOnTouchOutside(c2940.f6590);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
