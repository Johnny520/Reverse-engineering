package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.ljx.wechatmod.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v extends View.AccessibilityDelegate {
    public final x a;

    public v(x r1) {
        this.a = r1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View r2, AccessibilityEvent r3) {
        return this.a.a(r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View r2) {
        l0 r22 = this.a.b(r2);
        if (r22 != null) goto L5;
        return null;
    L5:
        return (AccessibilityNodeProvider) r22.b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View r2, AccessibilityEvent r3) {
        this.a.c(r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View r12, AccessibilityNodeInfo r13) {
        j0 r0 = new j0(r13);
        WeakHashMap r1 = ja0.a;
        Object r2 = null;
        if (Build.VERSION.SDK_INT < 28) goto L5;
        Object r14 = Boolean.valueOf(ca0.d(r12));
    L9:
        Boolean r15 = (Boolean) r14;
        int r5 = 0;
        boolean r6 = true;
        if (r15 != null) goto L12;
    L14:
        boolean r16 = 0;
    L15:
        int r7 = Build.VERSION.SDK_INT;
        if (r7 < 28) goto L18;
        c0.p(r13, r16);
    L22:
        if (Build.VERSION.SDK_INT < 28) goto L24;
        Object r17 = Boolean.valueOf(ca0.c(r12));
    L28:
        Boolean r18 = (Boolean) r17;
        if (r18 != null) goto L31;
    L33:
        r6 = false;
    L34:
        if (r7 < 28) goto L36;
        c0.y(r13, r6);
    L43:
        CharSequence r19 = ja0.d(r12);
        if (r7 < 28) goto L46;
        c0.o(r13, r19);
    L48:
        if (r7 < 30) goto L50;
        r2 = ea0.a(r12);
    L53:
        CharSequence r22 = (CharSequence) r2;
        if (r7 < 30) goto L56;
        d0.t(r13, r22);
    L57:
        this.a.d(r12, r0);
        r13.getText();
        List r122 = (List) r12.getTag(R.id.tag_accessibility_actions);
        if (r122 != null) goto L61;
        r122 = Collections.EMPTY_LIST;
    L61:
        if (r5 >= r122.size()) goto L63;
        r0.b((h0) r122.get(r5));
        r5 = r5 + 1;
        goto L61
    L63:
        return;
    L56:
        r13.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", r22);
        goto L57
    L50:
        Object r3 = r12.getTag(R.id.tag_state_description);
        if (CharSequence.class.isInstance(r3) == false) goto L53;
        r2 = r3;
        goto L53
    L46:
        r13.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", r19);
        goto L48
    L36:
        Bundle r110 = r13.getExtras();
        if (r110 == null) goto L43;
        int r4 = r110.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3);
        if (r6 == false) goto L41;
        int r62 = 2;
    L42:
        r110.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", r4 | r62);
        goto L43
    L41:
        r62 = 0;
        goto L42
    L31:
        if (r18.booleanValue() == false) goto L33;
    L24:
        r17 = r12.getTag(R.id.tag_accessibility_heading);
        if (Boolean.class.isInstance(r17) == true) goto L28;
        r17 = null;
        goto L28
    L18:
        Bundle r9 = r13.getExtras();
        if (r9 == null) goto L22;
        r9.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", r16 | (r9.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
        goto L22
    L12:
        if (r15.booleanValue() == false) goto L14;
        r16 = 1;
        goto L15
    L5:
        r14 = r12.getTag(R.id.tag_screen_reader_focusable);
        if (Boolean.class.isInstance(r14) == true) goto L9;
        r14 = null;
        goto L9
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View r2, AccessibilityEvent r3) {
        this.a.e(r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup r2, View r3, AccessibilityEvent r4) {
        return this.a.f(r2, r3, r4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View r2, int r3, Bundle r4) {
        return this.a.g(r2, r3, r4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View r2, int r3) {
        this.a.h(r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View r2, AccessibilityEvent r3) {
        this.a.i(r2, r3);
    }
}
