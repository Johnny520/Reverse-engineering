package p006D;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import org.luckypray.dexkit.C1031R;
import p008E.C0151e;
import p008E.C0156j;
import p008E.C0158l;
import p008E.InterfaceC0166t;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: D.b */
/* JADX INFO: loaded from: classes.dex */
public class C0091b {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f242c = null;

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f243a;

    /* JADX INFO: renamed from: b */
    public final C0089a f244b;

    static {
        f242c = new View.AccessibilityDelegate();
    }

    public C0091b() {
        this(f242c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo313a(View r2, AccessibilityEvent r3) {
        return this.f243a.dispatchPopulateAccessibilityEvent(r2, r3);
    }

    /* JADX INFO: renamed from: b */
    public C0158l mo314b(View r2) {
        AccessibilityNodeProvider r22 = this.f243a.getAccessibilityNodeProvider(r2);
        if (r22 != null) goto L5;
        return null;
    L5:
        return new C0158l(r22);
    }

    /* JADX INFO: renamed from: c */
    public void mo315c(View r2, AccessibilityEvent r3) {
        this.f243a.onInitializeAccessibilityEvent(r2, r3);
    }

    /* JADX INFO: renamed from: d */
    public void mo55d(View r2, C0156j r3) {
        AccessibilityNodeInfo r32 = r3.f357a;
        this.f243a.onInitializeAccessibilityNodeInfo(r2, r32);
    }

    /* JADX INFO: renamed from: e */
    public void mo56e(View r2, AccessibilityEvent r3) {
        this.f243a.onPopulateAccessibilityEvent(r2, r3);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo316f(ViewGroup r2, View r3, AccessibilityEvent r4) {
        return this.f243a.onRequestSendAccessibilityEvent(r2, r3, r4);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo317g(View r7, int r8, Bundle r9) {
        List r02 = (List) r7.getTag(C1031R.id.tag_accessibility_actions);
        if (r02 != null) goto L5;
        r02 = Collections.emptyList();
    L5:
        boolean r1 = false;
        int r2 = 0;
    L6:
        ClickableSpan[] r4 = null;
        if (r2 >= r02.size()) goto L19;
        C0151e r3 = (C0151e) r02.get(r2);
        if (r3.m477a() == r8) goto L10;
        r2 = r2 + 1;
        goto L6
    L10:
        InterfaceC0166t r03 = r3.f355d;
        if (r03 == null) goto L19;
        Class r22 = r3.f354c;
        if (r22 != null) goto L46;
    L17:
        boolean r04 = r03.mo18j(r7);
    L20:
        if (r04 == true) goto L22;
        r04 = this.f243a.performAccessibilityAction(r7, r8, r9);
    L22:
        if (r04 == false) goto L24;
        return r04;
    L24:
        if (r8 != C1031R.id.accessibility_action_clickable_span) goto L54;
        if (r9 == null) goto L55;
        int r82 = r9.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray r92 = (SparseArray) r7.getTag(C1031R.id.tag_accessibility_clickable_spans);
        if (r92 == null) goto L44;
        WeakReference r83 = (WeakReference) r92.get(r82);
        if (r83 == null) goto L44;
        ClickableSpan r84 = (ClickableSpan) r83.get();
        if (r84 == null) goto L44;
        CharSequence r93 = r7.createAccessibilityNodeInfo().getText();
        if ((r93 instanceof Spanned) == false) goto L35;
        r4 = (ClickableSpan[]) ((Spanned) r93).getSpans(0, r93.length(), ClickableSpan.class);
    L35:
        int r94 = 0;
    L36:
        if (r4 == null) goto L44;
        if (r94 >= r4.length) goto L44;
        if (r84.equals(r4[r94]) == true) goto L41;
        r94 = r94 + 1;
        goto L36
    L41:
        r84.onClick(r7);
        r1 = true;
    L44:
        return r1;
    L55:
        return r04;
    L54:
        return r04;
    L46:
        AbstractC0324d.m726i(r22.getDeclaredConstructor(null).newInstance(null));     // Catch: Exception -> L45
        throw null;     // Catch: Exception -> L45
    L19:
        r04 = false;
        goto L20
    }

    /* JADX INFO: renamed from: h */
    public void mo318h(View r2, int r3) {
        this.f243a.sendAccessibilityEvent(r2, r3);
    }

    /* JADX INFO: renamed from: i */
    public void mo319i(View r2, AccessibilityEvent r3) {
        this.f243a.sendAccessibilityEventUnchecked(r2, r3);
    }

    public C0091b(View.AccessibilityDelegate r1) {
        this.f243a = r1;
        this.f244b = new C0089a(this);
    }
}
