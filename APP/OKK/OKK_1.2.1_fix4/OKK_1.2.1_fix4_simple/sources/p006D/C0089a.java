package p006D;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p002B.AbstractC0053c;
import p008E.AbstractC0152f;
import p008E.C0151e;
import p008E.C0156j;
import p008E.C0158l;

/* JADX INFO: renamed from: D.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0089a extends View.AccessibilityDelegate {

    /* JADX INFO: renamed from: a */
    public final C0091b f237a;

    public C0089a(C0091b r1) {
        this.f237a = r1;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View r2, AccessibilityEvent r3) {
        return this.f237a.mo313a(r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View r2) {
        C0158l r22 = this.f237a.mo314b(r2);
        if (r22 != null) goto L7;
        return null;
    L7:
        return (AccessibilityNodeProvider) r22.f362a;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View r2, AccessibilityEvent r3) {
        this.f237a.mo315c(r2, r3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View r12, AccessibilityNodeInfo r13) {
        C0156j r1 = new C0156j(r13);
        Field r2 = AbstractC0080Q.f219a;
        int r22 = Build.VERSION.SDK_INT;
        Object r5 = null;
        if (r22 < 28) goto L5;
        Object r6 = Boolean.valueOf(AbstractC0074K.m260d(r12));
    L9:
        Boolean r62 = (Boolean) r6;
        int r7 = 0;
        if (r62 != null) goto L12;
    L14:
        boolean r63 = 0;
    L16:
        if (r22 < 28) goto L18;
        AbstractC0053c.m188s(r13, r63);
    L22:
        if (Build.VERSION.SDK_INT < 28) goto L24;
        Object r3 = Boolean.valueOf(AbstractC0074K.m259c(r12));
    L28:
        Boolean r32 = (Boolean) r3;
        if (r32 != null) goto L31;
    L33:
        boolean r33 = false;
    L34:
        if (r22 < 28) goto L36;
        AbstractC0053c.m193x(r13, r33);
    L43:
        CharSequence r34 = AbstractC0080Q.m283b(r12);
        if (r22 < 28) goto L46;
        AbstractC0053c.m187r(r13, r34);
    L48:
        if (Build.VERSION.SDK_INT < 30) goto L50;
        r5 = AbstractC0076M.m274b(r12);
    L53:
        CharSequence r52 = (CharSequence) r5;
        if (r22 < 30) goto L56;
        AbstractC0152f.m480c(r13, r52);
    L57:
        this.f237a.mo55d(r12, r1);
        r13.getText();
        List r122 = (List) r12.getTag(C1031R.id.tag_accessibility_actions);
        if (r122 != null) goto L61;
        r122 = Collections.emptyList();
    L61:
        if (r7 >= r122.size()) goto L63;
        r1.m506b((C0151e) r122.get(r7));
        r7 = r7 + 1;
        goto L61
    L63:
        return;
    L56:
        r13.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", r52);
        goto L57
    L50:
        Object r35 = r12.getTag(C1031R.id.tag_state_description);
        if (CharSequence.class.isInstance(r35) == false) goto L53;
        r5 = r35;
        goto L53
    L46:
        r13.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", r34);
        goto L48
    L36:
        Bundle r64 = r13.getExtras();
        if (r64 == null) goto L43;
        int r9 = r64.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3);
        if (r33 == false) goto L41;
        int r36 = 2;
    L42:
        r64.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", r36 | r9);
        goto L43
    L41:
        r36 = 0;
        goto L42
    L31:
        if (r32.booleanValue() == false) goto L33;
        r33 = true;
        goto L34
    L24:
        Object r65 = r12.getTag(C1031R.id.tag_accessibility_heading);
        if (Boolean.class.isInstance(r65) == false) goto L27;
        r3 = r65;
        goto L28
    L27:
        r3 = null;
        goto L28
    L18:
        Bundle r92 = r13.getExtras();
        if (r92 == null) goto L22;
        r92.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", r63 | (r92.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
        goto L22
    L12:
        if (r62.booleanValue() == false) goto L14;
        r63 = 1;
        goto L16
    L5:
        r6 = r12.getTag(C1031R.id.tag_screen_reader_focusable);
        if (Boolean.class.isInstance(r6) == true) goto L9;
        r6 = null;
        goto L9
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View r2, AccessibilityEvent r3) {
        this.f237a.mo56e(r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup r2, View r3, AccessibilityEvent r4) {
        return this.f237a.mo316f(r2, r3, r4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View r2, int r3, Bundle r4) {
        return this.f237a.mo317g(r2, r3, r4);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View r2, int r3) {
        this.f237a.mo318h(r2, r3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View r2, AccessibilityEvent r3) {
        this.f237a.mo319i(r2, r3);
    }
}
