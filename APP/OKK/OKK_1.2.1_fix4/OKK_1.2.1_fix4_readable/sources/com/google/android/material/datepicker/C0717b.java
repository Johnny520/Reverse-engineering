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
    public static boolean m1876j(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(AbstractC0805P.m2040T(context, C1031R.attr.materialCalendarStyle, C0716a.class.getCanonicalName()).data, new int[]{i2});
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0504d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2389o.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0504d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2390p.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
