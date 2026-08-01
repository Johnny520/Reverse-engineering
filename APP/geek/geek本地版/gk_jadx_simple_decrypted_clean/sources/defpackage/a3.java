package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class a3 {
    public Parcelable a;
    public Object b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final Object f;

    public /* synthetic */ a3(TextView r2) {
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.f = r2;
    }

    public void a() {
        CompoundButton r0 = (CompoundButton) this.f;
        Drawable r1 = xb.a(r0);
        if (r1 != null) goto L5;
        return;
    L5:
        if (this.c == false) goto L7;
    L8:
        Drawable r12 = r1.mutate();
        if (this.c == false) goto L12;
        ch.h(r12, (ColorStateList) this.a);
    L12:
        if (this.d == false) goto L15;
        ch.i(r12, (PorterDuff.Mode) this.b);
    L15:
        if (r12.isStateful() == false) goto L17;
        r12.setState(r0.getDrawableState());
    L17:
        r0.setButtonDrawable(r12);
        return;
    L7:
        if (this.d == true) goto L8;
    }

    public void b() {
        z2 r0 = (z2) this.f;
        Drawable r1 = r0.getCheckMarkDrawable();
        if (r1 != null) goto L5;
        return;
    L5:
        if (this.c == false) goto L7;
    L8:
        Drawable r12 = r1.mutate();
        if (this.c == false) goto L12;
        ch.h(r12, (ColorStateList) this.a);
    L12:
        if (this.d == false) goto L15;
        ch.i(r12, (PorterDuff.Mode) this.b);
    L15:
        if (r12.isStateful() == false) goto L17;
        r12.setState(r0.getDrawableState());
    L17:
        r0.setCheckMarkDrawable(r12);
        return;
    L7:
        if (this.d == true) goto L8;
    }

    public Bundle c(String r4) {
        if (this.d == false) goto L18;
        Bundle r0 = (Bundle) this.a;
        if (r0 == null) goto L16;
        Bundle r02 = r0.getBundle(r4);
        Bundle r2 = (Bundle) this.a;
        if (r2 == null) goto L9;
        r2.remove(r4);
    L9:
        Bundle r42 = (Bundle) this.a;
        if (r42 != null) goto L12;
    L14:
        this.a = null;
        return r02;
    L12:
        if (r42.isEmpty() == true) goto L14;
        return r02;
    L16:
        return null;
    L18:
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void d(AttributeSet r9, int r10) {
        CompoundButton r1 = (CompoundButton) this.f;
        Context r0 = r1.getContext();
        int[] r3 = xy.m;
        r5 r7 = r5.y(r0, r9, r3, r10);
        TypedArray r02 = (TypedArray) r7.b;
        ja0.k(r1, r1.getContext(), r3, r9, (TypedArray) r7.b, r10);
    L9:
        th = move-exception;
        r7.z();
        throw th;
    L4:
        if (r02.hasValue(1) == false) goto L12;
        int r92 = r02.getResourceId(1, 0);     // Catch: Throwable -> L9
        if (r92 == 0) goto L12;
        r1.setButtonDrawable(ff.r(r1.getContext(), r92));     // Catch: Throwable -> L9 Resources.NotFoundException -> L26
    L17:
        if (r02.hasValue(2) == false) goto L20;
        wb.c(r1, r7.l(2));     // Catch: Throwable -> L9
    L20:
        if (r02.hasValue(3) == false) goto L22;
        wb.d(r1, eh.b(r02.getInt(3, -1), null));     // Catch: Throwable -> L9
    L22:
        r7.z();
        return;
    L12:
        if (r02.hasValue(0) == false) goto L17;
        int r93 = r02.getResourceId(0, 0);     // Catch: Throwable -> L9
        if (r93 == 0) goto L17;
        r1.setButtonDrawable(ff.r(r1.getContext(), r93));     // Catch: Throwable -> L9
        goto L17
    }

    public void e(String r3, t10 r4) {
        o10 r0 = (o10) this.f;
        l10 r1 = r0.a(r3);
        if (r1 == null) goto L5;
        Object r32 = r1.b;
    L11:
        if (((t10) r32) != null) goto L14;
        return;
    L14:
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    L5:
        l10 r12 = new l10(r3, r4);
        r0.d++;
        l10 r33 = r0.b;
        if (r33 != null) goto L8;
        r0.a = r12;
        r0.b = r12;
    L9:
        r32 = null;
        goto L11
    L8:
        r33.c = r12;
        r12.d = r33;
        r0.b = r12;
        goto L9
    }

    public a3() {
        this.f = new o10();
        this.e = true;
    }
}
