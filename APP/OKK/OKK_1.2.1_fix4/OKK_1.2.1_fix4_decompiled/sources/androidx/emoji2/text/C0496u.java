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

    public C0496u(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1396b = new ArrayList();
        AbstractC0040p.m106i(cls, "watcherClass cannot be null");
        this.f1395a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m1213a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1396b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0495t) arrayList.get(i2)).f1394b.incrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m1214b() {
        m1217e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1396b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0495t) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0495t m1215c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1396b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C0495t c0495t = (C0495t) arrayList.get(i2);
            if (c0495t.f1393a == obj) {
                return c0495t;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1216d(Object obj) {
        if (obj != null) {
            if (this.f1395a == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m1217e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1396b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0495t) arrayList.get(i2)).f1394b.decrementAndGet();
            i2++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0495t c0495tM1215c;
        if (m1216d(obj) && (c0495tM1215c = m1215c(obj)) != null) {
            obj = c0495tM1215c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0495t c0495tM1215c;
        if (m1216d(obj) && (c0495tM1215c = m1215c(obj)) != null) {
            obj = c0495tM1215c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0495t c0495tM1215c;
        if (m1216d(obj) && (c0495tM1215c = m1215c(obj)) != null) {
            obj = c0495tM1215c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        if (this.f1395a != cls) {
            return super.getSpans(i2, i3, cls);
        }
        C0495t[] c0495tArr = (C0495t[]) super.getSpans(i2, i3, C0495t.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0495tArr.length);
        for (int i4 = 0; i4 < c0495tArr.length; i4++) {
            objArr[i4] = c0495tArr[i4].f1393a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        if (cls == null || this.f1395a == cls) {
            cls = C0495t.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0495t c0495tM1215c;
        if (m1216d(obj)) {
            c0495tM1215c = m1215c(obj);
            if (c0495tM1215c != null) {
                obj = c0495tM1215c;
            }
        } else {
            c0495tM1215c = null;
        }
        super.removeSpan(obj);
        if (c0495tM1215c != null) {
            this.f1396b.remove(c0495tM1215c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence) {
        replace(i2, i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (m1216d(obj)) {
            C0495t c0495t = new C0495t(obj);
            this.f1396b.add(c0495t);
            obj = c0495t;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new C0496u(this.f1395a, this, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        replace(i2, i3, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence) {
        m1213a();
        super.replace(i2, i3, charSequence);
        m1217e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public C0496u(Class cls, CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        this.f1396b = new ArrayList();
        AbstractC0040p.m106i(cls, "watcherClass cannot be null");
        this.f1395a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        m1213a();
        super.replace(i2, i3, charSequence, i4, i5);
        m1217e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }
}
