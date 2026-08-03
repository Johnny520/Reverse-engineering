package p000;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import io.github.cherrywechat.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: P */
/* JADX INFO: loaded from: classes.dex */
public class C0645P {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f2081c = null;

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f2082a;

    /* JADX INFO: renamed from: b */
    public final C0602O f2083b;

    static {
        f2081c = new View.AccessibilityDelegate();
    }

    public C0645P() {
        this(f2081c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo316a(View r2, AccessibilityEvent r3) {
        return this.f2082a.dispatchPopulateAccessibilityEvent(r2, r3);
    }

    /* JADX INFO: renamed from: b */
    public C0132D2 mo317b(View r3) {
        AccessibilityNodeProvider r32 = this.f2082a.getAccessibilityNodeProvider(r3);
        if (r32 != null) goto L5;
        return null;
    L5:
        return new C0132D2(2, r32);
    }

    /* JADX INFO: renamed from: c */
    public void mo318c(View r2, AccessibilityEvent r3) {
        this.f2082a.onInitializeAccessibilityEvent(r2, r3);
    }

    /* JADX INFO: renamed from: d */
    public void mo319d(View r2, C1118a0 r3) {
        this.f2082a.onInitializeAccessibilityNodeInfo(r2, r3.f3530a);
    }

    /* JADX INFO: renamed from: e */
    public void mo320e(View r2, AccessibilityEvent r3) {
        this.f2082a.onPopulateAccessibilityEvent(r2, r3);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo321f(ViewGroup r2, View r3, AccessibilityEvent r4) {
        return this.f2082a.onRequestSendAccessibilityEvent(r2, r3, r4);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo322g(View r7, int r8, Bundle r9) {
        List r0 = (List) r7.getTag(R.id.tag_accessibility_actions);
        if (r0 != null) goto L5;
        r0 = Collections.EMPTY_LIST;
    L5:
        boolean r1 = false;
        int r2 = 0;
    L6:
        ClickableSpan[] r4 = null;
        if (r2 >= r0.size()) goto L21;
        C0902V r3 = (C0902V) r0.get(r2);
        if (r3.m1752a() == r8) goto L10;
        r2 = r2 + 1;
        goto L6
    L10:
        Class r02 = r3.f2812c;
        InterfaceC2123k0 r22 = r3.f2813d;
        if (r22 == null) goto L21;
        if (r02 != null) goto L48;
    L19:
        boolean r03 = r22.perform(r7, null);
    L22:
        if (r03 == true) goto L24;
        r03 = this.f2082a.performAccessibilityAction(r7, r8, r9);
    L24:
        if (r03 == false) goto L26;
        return r03;
    L26:
        if (r8 != R.id.accessibility_action_clickable_span) goto L55;
        if (r9 == null) goto L56;
        int r82 = r9.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray r92 = (SparseArray) r7.getTag(R.id.tag_accessibility_clickable_spans);
        if (r92 == null) goto L46;
        WeakReference r83 = (WeakReference) r92.get(r82);
        if (r83 == null) goto L46;
        ClickableSpan r84 = (ClickableSpan) r83.get();
        if (r84 == null) goto L46;
        CharSequence r93 = r7.createAccessibilityNodeInfo().getText();
        if ((r93 instanceof Spanned) == false) goto L37;
        r4 = (ClickableSpan[]) ((Spanned) r93).getSpans(0, r93.length(), ClickableSpan.class);
    L37:
        int r94 = 0;
    L38:
        if (r4 == null) goto L46;
        if (r94 >= r4.length) goto L46;
        if (r84.equals(r4[r94]) == true) goto L43;
        r94 = r94 + 1;
        goto L38
    L43:
        r84.onClick(r7);
        r1 = true;
    L46:
        return r1;
    L56:
        return r03;
    L55:
        return r03;
    L48:
        if (r02.getDeclaredConstructor(null).newInstance(null) != null) goto L18;
        throw null;     // Catch: Exception -> L47
    L18:
        throw new ClassCastException();     // Catch: Exception -> L47
    L21:
        r03 = false;
        goto L22
    }

    /* JADX INFO: renamed from: h */
    public void mo323h(View r2, int r3) {
        this.f2082a.sendAccessibilityEvent(r2, r3);
    }

    /* JADX INFO: renamed from: i */
    public void mo324i(View r2, AccessibilityEvent r3) {
        this.f2082a.sendAccessibilityEventUnchecked(r2, r3);
    }

    public C0645P(View.AccessibilityDelegate r1) {
        this.f2082a = r1;
        this.f2083b = new C0602O(this);
    }
}
