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

    public C0428Jy(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1410b = new ArrayList();
        AbstractC1293cr.m2548g("watcherClass cannot be null", cls);
        this.f1409a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m883a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1410b;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0385Iy) arrayList.get(i)).f1321b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m884b() {
        m887e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1410b;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0385Iy) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0385Iy m885c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1410b;
            if (i >= arrayList.size()) {
                return null;
            }
            C0385Iy c0385Iy = (C0385Iy) arrayList.get(i);
            if (c0385Iy.f1320a == obj) {
                return c0385Iy;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m886d(Object obj) {
        if (obj != null) {
            return this.f1409a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m887e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1410b;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0385Iy) arrayList.get(i)).f1321b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0385Iy c0385IyM885c;
        if (m886d(obj) && (c0385IyM885c = m885c(obj)) != null) {
            obj = c0385IyM885c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0385Iy c0385IyM885c;
        if (m886d(obj) && (c0385IyM885c = m885c(obj)) != null) {
            obj = c0385IyM885c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0385Iy c0385IyM885c;
        if (m886d(obj) && (c0385IyM885c = m885c(obj)) != null) {
            obj = c0385IyM885c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f1409a != cls) {
            return super.getSpans(i, i2, cls);
        }
        C0385Iy[] c0385IyArr = (C0385Iy[]) super.getSpans(i, i2, C0385Iy.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0385IyArr.length);
        for (int i3 = 0; i3 < c0385IyArr.length; i3++) {
            objArr[i3] = c0385IyArr[i3].f1320a;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.f1409a == cls) {
            cls = C0385Iy.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0385Iy c0385IyM885c;
        if (m886d(obj)) {
            c0385IyM885c = m885c(obj);
            if (c0385IyM885c != null) {
                obj = c0385IyM885c;
            }
        } else {
            c0385IyM885c = null;
        }
        super.removeSpan(obj);
        if (c0385IyM885c != null) {
            this.f1410b.remove(c0385IyM885c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m886d(obj)) {
            C0385Iy c0385Iy = new C0385Iy(obj);
            this.f1410b.add(c0385Iy);
            obj = c0385Iy;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C0428Jy(this.f1409a, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m883a();
        super.replace(i, i2, charSequence);
        m887e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public C0428Jy(Class cls, C0428Jy c0428Jy, int i, int i2) {
        super(c0428Jy, i, i2);
        this.f1410b = new ArrayList();
        AbstractC1293cr.m2548g("watcherClass cannot be null", cls);
        this.f1409a = cls;
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
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m883a();
        super.replace(i, i2, charSequence, i3, i4);
        m887e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
