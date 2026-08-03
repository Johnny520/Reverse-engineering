package com.google.android.material.datepicker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0504d;
import com.abc.core.runtime.AbstractC0805P;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.C1031R;

/* JADX INFO: renamed from: com.google.android.material.datepicker.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0717b<S> extends DialogInterfaceOnCancelListenerC0504d {

    /* JADX INFO: renamed from: o */
    public final LinkedHashSet f2389o;

    /* JADX INFO: renamed from: p */
    public final LinkedHashSet f2390p;

    public C0717b() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2389o = new LinkedHashSet();
        this.f2390p = new LinkedHashSet();
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1876j(Context r2, int r3) {
        TypedArray r22 = r2.obtainStyledAttributes(AbstractC0805P.m2040T(r2, C1031R.attr.materialCalendarStyle, C0716a.class.getCanonicalName()).data, new int[]{r3});
        boolean r32 = r22.getBoolean(0, false);
        r22.recycle();
        return r32;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0504d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface r3) {
        Iterator r02 = this.f2389o.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((DialogInterface.OnCancelListener) r02.next()).onCancel(r3);
        goto L4
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0504d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface r3) {
        Iterator r02 = this.f2390p.iterator();
    L4:
        if (r02.hasNext() == false) goto L6;
        ((DialogInterface.OnDismissListener) r02.next()).onDismiss(r3);
        goto L4
    L6:
        super.onDismiss(r3);
    }
}
