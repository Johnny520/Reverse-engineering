package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p001A0.AbstractC0040p;

/* JADX INFO: renamed from: androidx.emoji2.text.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0496u extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class f1395a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1396b;

    public C0496u(Class r1, CharSequence r2) {
        super(r2);
        this.f1396b = new ArrayList();
        AbstractC0040p.m106i(r1, "watcherClass cannot be null");
        this.f1395a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m1213a() {
        int r02 = 0;
    L3:
        ArrayList r1 = this.f1396b;
        if (r02 >= r1.size()) goto L6;
        ((C0495t) r1.get(r02)).f1394b.incrementAndGet();
        r02 = r02 + 1;
        goto L3
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence r1) {
        super.append(r1);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m1214b() {
        m1217e();
        int r1 = 0;
    L3:
        ArrayList r2 = this.f1396b;
        if (r1 >= r2.size()) goto L6;
        ((C0495t) r2.get(r1)).onTextChanged(this, 0, length(), length());
        r1 = r1 + 1;
        goto L3
    }

    /* JADX INFO: renamed from: c */
    public final C0495t m1215c(Object r4) {
        int r02 = 0;
    L3:
        ArrayList r1 = this.f1396b;
        if (r02 >= r1.size()) goto L9;
        C0495t r12 = (C0495t) r1.get(r02);
        if (r12.f1393a == r4) goto L7;
        r02 = r02 + 1;
        goto L3
    L7:
        return r12;
    L9:
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1216d(Object r2) {
        if (r2 == null) goto L6;
        Class<?> r22 = r2.getClass();
        if (this.f1395a != r22) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int r1, int r2) {
        super.delete(r1, r2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m1217e() {
        int r02 = 0;
    L3:
        ArrayList r1 = this.f1396b;
        if (r02 >= r1.size()) goto L6;
        ((C0495t) r1.get(r02)).f1394b.decrementAndGet();
        r02 = r02 + 1;
        goto L3
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object r2) {
        if (m1216d(r2) == false) goto L8;
        C0495t r02 = m1215c(r2);
        if (r02 == null) goto L8;
        r2 = r02;
    L8:
        return super.getSpanEnd(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object r2) {
        if (m1216d(r2) == false) goto L8;
        C0495t r02 = m1215c(r2);
        if (r02 == null) goto L8;
        r2 = r02;
    L8:
        return super.getSpanFlags(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object r2) {
        if (m1216d(r2) == false) goto L8;
        C0495t r02 = m1215c(r2);
        if (r02 == null) goto L8;
        r2 = r02;
    L8:
        return super.getSpanStart(r2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int r2, int r3, Class r4) {
        if (this.f1395a != r4) goto L10;
        C0495t[] r22 = (C0495t[]) super.getSpans(r2, r3, C0495t.class);
        Object[] r32 = (Object[]) Array.newInstance(r4, r22.length);
        int r42 = 0;
    L6:
        if (r42 >= r22.length) goto L8;
        r32[r42] = r22[r42].f1393a;
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
        r4 = C0495t.class;
    L7:
        return super.nextSpanTransition(r2, r3, r4);
    L4:
        if (this.f1395a != r4) goto L7;
        goto L5
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object r2) {
        if (m1216d(r2) == false) goto L7;
        C0495t r02 = m1215c(r2);
        if (r02 == null) goto L8;
        r2 = r02;
    L8:
        super.removeSpan(r2);
        if (r02 == null) goto L12;
        this.f1396b.remove(r02);
        return;
    L12:
        return;
    L7:
        r02 = null;
        goto L8
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int r1, int r2, CharSequence r3) {
        replace(r1, r2, r3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object r2, int r3, int r4, int r5) {
        if (m1216d(r2) == false) goto L5;
        C0495t r02 = new C0495t(r2);
        this.f1396b.add(r02);
        r2 = r02;
    L5:
        super.setSpan(r2, r3, r4, r5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int r3, int r4) {
        return new C0496u(this.f1395a, this, r3, r4);
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
        m1213a();
        super.replace(r1, r2, r3);
        m1217e();
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

    public C0496u(Class r1, CharSequence r2, int r3, int r4) {
        super(r2, r3, r4);
        this.f1396b = new ArrayList();
        AbstractC0040p.m106i(r1, "watcherClass cannot be null");
        this.f1395a = r1;
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
        m1213a();
        super.replace(r1, r2, r3, r4, r5);
        m1217e();
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
