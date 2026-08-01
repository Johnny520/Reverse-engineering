package androidx.compose.ui.window;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.AbstractC0034;
import androidx.activity.C0022;
import androidx.activity.C0023;
import androidx.activity.DialogC0043;
import androidx.compose.ui.graphics.layer.C1521;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.AbstractC2267;
import androidx.lifecycle.AbstractC2435;
import com.bumptech.glide.AbstractC3057;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.util.C4211;
import java.util.UUID;
import kotlin.C5176;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p205.InterfaceC7896;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC2105 extends DialogC0043 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public InterfaceC6543 f6235;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C2103 f6236;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f6237;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public C2107 f6238;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final View f6239;

    public DialogC2105(InterfaceC6543 interfaceC6543, C2107 c2107, View view, LayoutDirection layoutDirection, InterfaceC7896 interfaceC7896, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), c2107.f6242 ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f6235 = interfaceC6543;
        this.f6238 = c2107;
        this.f6239 = view;
        Window window = getWindow();
        if (window == null) {
            C5925.m11311("Dialog has no window");
            throw null;
        }
        C2107 c21072 = this.f6238;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = c21072.f6247;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC2267.m4230(window, this.f6238.f6242);
        window.setGravity(17);
        if (!this.f6238.f6242) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                C2109.f6249.m3850(attributes2);
            }
            if (i >= 30) {
                C2113 c2113 = C2113.f6252;
                c2113.m3855(attributes2, 0);
                c2113.m3854(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        C2103 c2103 = new C2103(getContext(), window);
        setTitle(this.f6238.f6241);
        c2103.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c2103.setClipChildren(false);
        c2103.setElevation(interfaceC7896.mo1344(8.0f));
        c2103.setOutlineProvider(new C1521(2));
        this.f6236 = c2103;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            m3848(viewGroup);
        }
        setContentView(c2103);
        c2103.setTag(R.id.view_tree_lifecycle_owner, AbstractC2435.m4529(view));
        c2103.setTag(R.id.view_tree_view_model_store_owner, AbstractC2435.m4528(view));
        c2103.setTag(R.id.view_tree_saved_state_registry_owner, AbstractC3057.m6758(view));
        m3849(this.f6235, this.f6238, layoutDirection);
        C0023 onBackPressedDispatcher = getOnBackPressedDispatcher();
        InterfaceC6558 interfaceC6558 = new InterfaceC6558() { // from class: androidx.compose.ui.window.DialogWrapper$2
            {
                super(1);
            }

            public final void invoke(AbstractC0034 abstractC0034) {
                DialogC2105 dialogC2105 = this.this$0;
                if (dialogC2105.f6238.f6246) {
                    dialogC2105.f6235.invoke();
                }
            }

            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((AbstractC0034) obj);
                return C5176.f14739;
            }
        };
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.m28(new C0022(interfaceC6558), this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final void m3848(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C2103) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                m3848(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.f6238.f6246 || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f6235.invoke();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            androidx.compose.ui.window.飘花落叶言子楪哲苏世兰 r1 = r9.f6238
            boolean r1 = r1.f6245
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L86
            androidx.compose.ui.window.飘花落叶言子楪哲世兰苏 r1 = r9.f6236
            r1.getClass()
            float r5 = r10.getX()
            float r5 = java.lang.Math.abs(r5)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            float r5 = r10.getY()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L34
            goto L69
        L34:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = p053.AbstractC6561.m12058(r5)
            if (r7 > r5) goto L69
            if (r5 > r6) goto L69
            float r5 = r10.getY()
            int r5 = p053.AbstractC6561.m12058(r5)
            if (r8 > r5) goto L69
            if (r5 > r1) goto L69
            goto L86
        L69:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L83
            if (r10 == r4) goto L77
            if (r10 == r2) goto L74
            goto L90
        L74:
            r9.f6237 = r3
            return r0
        L77:
            boolean r10 = r9.f6237
            if (r10 == 0) goto L90
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r10 = r9.f6235
            r10.invoke()
            r9.f6237 = r3
            return r4
        L83:
            r9.f6237 = r4
            return r4
        L86:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L91
            if (r10 == r4) goto L91
            if (r10 == r2) goto L91
        L90:
            return r0
        L91:
            r9.f6237 = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.DialogC2105.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m3849(InterfaceC6543 interfaceC6543, C2107 c2107, LayoutDirection layoutDirection) {
        int i;
        this.f6235 = interfaceC6543;
        this.f6238 = c2107;
        SecureFlagPolicy secureFlagPolicy = c2107.f6244;
        boolean zM3834 = AbstractC2091.m3834(this.f6239);
        int i2 = AbstractC2089.f6190[secureFlagPolicy.ordinal()];
        if (i2 == 1) {
            zM3834 = false;
        } else if (i2 == 2) {
            zM3834 = true;
        } else if (i2 != 3) {
            C4211.m8611();
            return;
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zM3834 ? 8192 : -8193, 8192);
        int i3 = AbstractC2108.f6248[layoutDirection.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else {
            if (i3 != 2) {
                C4211.m8611();
                return;
            }
            i = 1;
        }
        C2103 c2103 = this.f6236;
        c2103.setLayoutDirection(i);
        boolean z = c2107.f6242;
        boolean z2 = c2107.f6243;
        Window window2 = c2103.f6233;
        boolean z3 = (c2103.f6229 && z2 == c2103.f6231 && z == c2103.f6230) ? false : true;
        c2103.f6231 = z2;
        c2103.f6230 = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i4 = z2 ? -2 : -1;
            if (i4 != attributes.width || !c2103.f6229) {
                window2.setLayout(i4, -2);
                c2103.f6229 = true;
            }
        }
        setCanceledOnTouchOutside(c2107.f6245);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
