package p050c0;

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

    public C0691r1(ImageView r2) {
        this.f2183a = 0;
        this.f2184b = r2;
    }

    /* JADX INFO: renamed from: a */
    public void m1786a() {
        ImageView r02 = (ImageView) this.f2184b;
        Drawable r1 = r02.getDrawable();
        if (r1 == null) goto L5;
        AbstractC0886W.m2219a(r1);
    L5:
        if (r1 == null) goto L10;
        C0853C0 r2 = (C0853C0) this.f2185c;
        if (r2 == null) goto L11;
        C0926s.m2260c(r1, r2, r02.getDrawableState());
        return;
    L11:
        return;
    }

    /* JADX INFO: renamed from: b */
    public void m1787b(AttributeSet r9, int r10) {
        ImageView r02 = (ImageView) this.f2184b;
        Context r1 = r02.getContext();
        int[] r3 = AbstractC0550a.f1620e;
        C0234d r7 = C0234d.m638s(r1, r9, r3, r10, 0);
        AbstractC0080Q.m290i(r02, r02.getContext(), r3, r9, (TypedArray) r7.f475c, r10);
        Drawable r92 = r02.getDrawable();     // Catch: Throwable -> L12
        TypedArray r12 = (TypedArray) r7.f475c;
        if (r92 == null) goto L7;
    L14:
        if (r92 == null) goto L17;
        AbstractC0886W.m2219a(r92);     // Catch: Throwable -> L12
    L17:
        if (r12.hasValue(2) == false) goto L20;
        AbstractC0217f.m604c(r02, r7.m645h(2));     // Catch: Throwable -> L12
    L20:
        if (r12.hasValue(3) == false) goto L22;
        AbstractC0217f.m605d(r02, AbstractC0886W.m2221c(r12.getInt(3, -1), null));     // Catch: Throwable -> L12
    L22:
        r7.m657u();
        return;
    L7:
        int r2 = r12.getResourceId(1, -1);     // Catch: Throwable -> L12
        if (r2 == (-1)) goto L14;
        r92 = AbstractC0358S.m916w(r02.getContext(), r2);     // Catch: Throwable -> L12
        if (r92 == null) goto L14;
        r02.setImageDrawable(r92);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        r7.m657u();
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public synchronized boolean m1788c(String r5) {
        monitor-enter(this);
        AbstractC0307g.m703e(r5, "id");     // Catch: Throwable -> L16
        if (r5.length() != 0) goto L9;
        monitor-exit(this);
        return true;
    L9:
        if (((HashSet) this.f2184b).contains(r5) == false) goto L13;
        monitor-exit(this);
        return false;
    L13:
        C0178i r02 = (C0178i) this.f2185c;     // Catch: Throwable -> L16
        if (r02.f396c < this.f2183a) goto L18;
        String r03 = (String) r02.removeFirst();     // Catch: Throwable -> L16
        ((HashSet) this.f2184b).remove(r03);     // Catch: Throwable -> L16
    L18:
        ((C0178i) this.f2185c).addLast(r5);     // Catch: Throwable -> L16
        ((HashSet) this.f2184b).add(r5);     // Catch: Throwable -> L16
        monitor-exit(this);
        return true;
    L16:
        th = move-exception;
        throw th;
    }

    public C0691r1() {
        this.f2183a = 100;
        this.f2184b = new HashSet();
        this.f2185c = new C0178i();
    }
}
