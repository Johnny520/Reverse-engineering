package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.ljx.wechatmod.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class x {
    public static final View.AccessibilityDelegate c = null;
    public final View.AccessibilityDelegate a;
    public final v b;

    static {
        c = new View.AccessibilityDelegate();
    }

    public x() {
        this(c);
    }

    public boolean a(View r2, AccessibilityEvent r3) {
        return this.a.dispatchPopulateAccessibilityEvent(r2, r3);
    }

    public l0 b(View r3) {
        AccessibilityNodeProvider r32 = w.a(this.a, r3);
        if (r32 != null) goto L5;
        return null;
    L5:
        return new l0(0, r32);
    }

    public void c(View r2, AccessibilityEvent r3) {
        this.a.onInitializeAccessibilityEvent(r2, r3);
    }

    public void d(View r2, j0 r3) {
        this.a.onInitializeAccessibilityNodeInfo(r2, r3.a);
    }

    public void e(View r2, AccessibilityEvent r3) {
        this.a.onPopulateAccessibilityEvent(r2, r3);
    }

    public boolean f(ViewGroup r2, View r3, AccessibilityEvent r4) {
        return this.a.onRequestSendAccessibilityEvent(r2, r3, r4);
    }

    public boolean g(View r7, int r8, Bundle r9) {
        List r0 = (List) r7.getTag(R.id.tag_accessibility_actions);
        if (r0 != null) goto L5;
        r0 = Collections.EMPTY_LIST;
    L5:
        boolean r1 = false;
        int r2 = 0;
    L6:
        ClickableSpan[] r4 = null;
        if (r2 >= r0.size()) goto L24;
        h0 r3 = (h0) r0.get(r2);
        if (r3.a() == r8) goto L10;
        r2 = r2 + 1;
        goto L6
    L10:
        Class r02 = r3.c;
        v0 r22 = r3.d;
        if (r22 == null) goto L24;
        if (r02 != null) goto L50;
    L22:
        boolean r03 = r22.c(r7);
    L25:
        if (r03 == true) goto L27;
        r03 = w.b(this.a, r7, r8, r9);
    L27:
        if (r03 == false) goto L29;
        return r03;
    L29:
        if (r8 != R.id.accessibility_action_clickable_span) goto L57;
        if (r9 == null) goto L58;
        int r82 = r9.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray r92 = (SparseArray) r7.getTag(R.id.tag_accessibility_clickable_spans);
        if (r92 == null) goto L49;
        WeakReference r83 = (WeakReference) r92.get(r82);
        if (r83 == null) goto L49;
        ClickableSpan r84 = (ClickableSpan) r83.get();
        if (r84 == null) goto L49;
        CharSequence r93 = r7.createAccessibilityNodeInfo().getText();
        if ((r93 instanceof Spanned) == false) goto L40;
        r4 = (ClickableSpan[]) ((Spanned) r93).getSpans(0, r93.length(), ClickableSpan.class);
    L40:
        int r94 = 0;
    L41:
        if (r4 == null) goto L49;
        if (r94 >= r4.length) goto L49;
        if (r84.equals(r4[r94]) == true) goto L46;
        r94 = r94 + 1;
        goto L41
    L46:
        r84.onClick(r7);
        r1 = true;
    L49:
        return r1;
    L58:
        return r03;
    L57:
        return r03;
    L50:
    L17:
        e = move-exception;
        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(r02.getName()), e);
        goto L22
    L15:
        if (r02.getDeclaredConstructor(null).newInstance(null) != null) goto L20;
        throw null;     // Catch: Exception -> L17
    L20:
        throw new ClassCastException();     // Catch: Exception -> L17
    L24:
        r03 = false;
        goto L25
    }

    public void h(View r2, int r3) {
        this.a.sendAccessibilityEvent(r2, r3);
    }

    public void i(View r2, AccessibilityEvent r3) {
        this.a.sendAccessibilityEventUnchecked(r2, r3);
    }

    public x(View.AccessibilityDelegate r1) {
        this.a = r1;
        this.b = new v(this);
    }
}
