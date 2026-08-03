package com.abc.core.features;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.util.HashSet;
import p006D.AbstractC0080Q;
import p009E0.C0178i;
import p017J.AbstractC0217f;
import p018J0.C0234d;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p048b.AbstractC0550a;
import p057g.AbstractC0886W;
import p057g.C0853C0;
import p057g.C0926s;

/* JADX INFO: renamed from: c0.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0691r1 {

    /* JADX INFO: renamed from: a */
    public int f2183a;

    /* JADX INFO: renamed from: b */
    public final Object f2184b;

    /* JADX INFO: renamed from: c */
    public Object f2185c;

    public C0691r1(ImageView imageView) {
        this.f2183a = 0;
        this.f2184b = imageView;
    }

    /* JADX INFO: renamed from: a */
    public void m1786a() {
        C0853C0 c0853c0;
        ImageView imageView = (ImageView) this.f2184b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0886W.m2219a(drawable);
        }
        if (drawable == null || (c0853c0 = (C0853C0) this.f2185c) == null) {
            return;
        }
        C0926s.m2260c(drawable, c0853c0, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public void m1787b(AttributeSet attributeSet, int i2) {
        int resourceId;
        ImageView imageView = (ImageView) this.f2184b;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0550a.f1620e;
        C0234d c0234dM638s = C0234d.m638s(context, attributeSet, iArr, i2, 0);
        AbstractC0080Q.m290i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c0234dM638s.f475c, i2);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c0234dM638s.f475c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0358S.m916w(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC0886W.m2219a(drawable);
            }
            if (typedArray.hasValue(2)) {
                AbstractC0217f.m604c(imageView, c0234dM638s.m645h(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0217f.m605d(imageView, AbstractC0886W.m2221c(typedArray.getInt(3, -1), null));
            }
            c0234dM638s.m657u();
        } catch (Throwable th) {
            c0234dM638s.m657u();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m1788c(String str) {
        try {
            AbstractC0307g.m703e(str, "id");
            if (str.length() == 0) {
                return true;
            }
            if (((HashSet) this.f2184b).contains(str)) {
                return false;
            }
            C0178i c0178i = (C0178i) this.f2185c;
            if (c0178i.f396c >= this.f2183a) {
                ((HashSet) this.f2184b).remove((String) c0178i.removeFirst());
            }
            ((C0178i) this.f2185c).addLast(str);
            ((HashSet) this.f2184b).add(str);
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public C0691r1() {
        this.f2183a = 100;
        this.f2184b = new HashSet();
        this.f2185c = new C0178i();
    }
}
