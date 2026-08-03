package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: Jy */
/* JADX INFO: loaded from: classes.dex */
public final class C0428Jy extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class f1409a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1410b;

    public C0428Jy(Class r1, CharSequence r2) {
        super(r2);
        this.f1410b = new ArrayList();
        AbstractC1293cr.m2548g("watcherClass cannot be null", r1);
        this.f1409a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m883a() {
        int r0 = 0;
    L3:
        ArrayList r1 = this.f1410b;
        if (r0 >= r1.size()) goto L6;
        ((C0385Iy) r1.get(r0)).f1321b.incrementAndGet();
        r0 = r0 + 1;
        goto L3
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence r1) {
        super.append(r1);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m884b() {
        m887e();
        int r1 = 0;
    L3:
        ArrayList r2 = this.f1410b;
        if (r1 >= r2.size()) goto L6;
        ((C0385Iy) r2.get(r1)).onTextChanged(this, 0, length(), length());
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: c */
    public final C0385Iy m885c(Object r4) {
        int r0 = 0;
    L3:
        ArrayList r1 = this.f1410b;
        if (r0 >= r1.size()) goto L9;
        C0385Iy r12 = (C0385Iy) r1.get(r0);
        if (r12.f1320a == r4) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r12;
    L9:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m886d(Object r2) {
        if (r2 == null) goto L7;
        Class<?> r22 = r2.getClass();
        if (this.f1409a != r22) goto L9;
        return true;
    L9:
        return false;
    L7:
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int r1, int r2) {
        super.delete(r1, r2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m887e() {
        int r0 = 0;
    L3:
        ArrayList r1 = this.f1410b;
        if (r0 >= r1.size()) goto L6;
        ((C0385Iy) r1.get(r0)).f1321b.decrementAndGet();
        r0 = r0 + 1;
        goto L3
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object r2) {
        if (m886d(r2) == false) goto L8;
        C0385Iy r0 = m885c(r2);
        if (r0 == null) goto L8;
        r2 = r0;
    L8:
        return super.getSpanEnd(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object r2) {
        if (m886d(r2) == false) goto L8;
        C0385Iy r0 = m885c(r2);
        if (r0 == null) goto L8;
        r2 = r0;
    L8:
        return super.getSpanFlags(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object r2) {
        if (m886d(r2) == false) goto L8;
        C0385Iy r0 = m885c(r2);
        if (r0 == null) goto L8;
        r2 = r0;
    L8:
        return super.getSpanStart(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int r2, int r3, Class r4) {
        if (this.f1409a != r4) goto L10;
        C0385Iy[] r22 = (C0385Iy[]) super.getSpans(r2, r3, C0385Iy.class);
        Object[] r32 = (Object[]) Array.newInstance(r4, r22.length);
        int r42 = 0;
    L6:
        if (r42 >= r22.length) goto L8;
        r32[r42] = r22[r42].f1320a;
        r42 = r42 + 1;
        goto L6
    L8:
        return r32;
    L10:
        return super.getSpans(r2, r3, r4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int r1, CharSequence r2) {
        super.insert(r1, r2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int r2, int r3, Class r4) {
        if (r4 != null) goto L4;
    L5:
        r4 = C0385Iy.class;
    L7:
        return super.nextSpanTransition(r2, r3, r4);
    L4:
        if (this.f1409a != r4) goto L7;
        goto L5
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object r2) {
        if (m886d(r2) == false) goto L7;
        C0385Iy r0 = m885c(r2);
        if (r0 == null) goto L8;
        r2 = r0;
    L8:
        super.removeSpan(r2);
        if (r0 == null) goto L12;
        this.f1410b.remove(r0);
        return;
    L12:
        return;
    L7:
        r0 = null;
        goto L8
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int r1, int r2, CharSequence r3) {
        replace(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object r2, int r3, int r4, int r5) {
        if (m886d(r2) == false) goto L5;
        C0385Iy r0 = new C0385Iy(r2);
        this.f1410b.add(r0);
        r2 = r0;
    L5:
        super.setSpan(r2, r3, r4, r5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int r3, int r4) {
        return new C0428Jy(this.f1409a, this, r3, r4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int r1, int r2) {
        super.delete(r1, r2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int r1, CharSequence r2) {
        super.insert(r1, r2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int r1, int r2, CharSequence r3, int r4, int r5) {
        replace(r1, r2, r3, r4, r5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int r1, CharSequence r2, int r3, int r4) {
        super.insert(r1, r2, r3, r4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int r1, int r2, CharSequence r3) {
        m883a();
        super.replace(r1, r2, r3);
        m887e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int r1, CharSequence r2, int r3, int r4) {
        super.insert(r1, r2, r3, r4);
        return this;
    }

    public C0428Jy(Class r1, C0428Jy r2, int r3, int r4) {
        super(r2, r3, r4);
        this.f1410b = new ArrayList();
        AbstractC1293cr.m2548g("watcherClass cannot be null", r1);
        this.f1409a = r1;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char r1) {
        super.append(r1);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int r1, int r2, CharSequence r3, int r4, int r5) {
        m883a();
        super.replace(r1, r2, r3, r4, r5);
        m887e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence r1, int r2, int r3) {
        super.append(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence r1, int r2, int r3) {
        super.append(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence r1, int r2, int r3) {
        super.append(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence r1, Object r2, int r3) {
        super.append(r1, r2, r3);
        return this;
    }
}
