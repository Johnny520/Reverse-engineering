package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d40 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class f1365a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1366b;

    public d40(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1366b = new ArrayList();
        AbstractC0979zt.m2825f("watcherClass cannot be null", cls);
        this.f1365a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m905a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1366b;
            if (i >= arrayList.size()) {
                return;
            }
            ((c40) arrayList.get(i)).f888b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m906b() {
        m909e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1366b;
            if (i >= arrayList.size()) {
                return;
            }
            ((c40) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final c40 m907c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1366b;
            if (i >= arrayList.size()) {
                return null;
            }
            c40 c40Var = (c40) arrayList.get(i);
            if (c40Var.f887a == obj) {
                return c40Var;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m908d(Object obj) {
        if (obj != null) {
            return this.f1365a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m909e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1366b;
            if (i >= arrayList.size()) {
                return;
            }
            ((c40) arrayList.get(i)).f888b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        c40 c40VarM907c;
        if (m908d(obj) && (c40VarM907c = m907c(obj)) != null) {
            obj = c40VarM907c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        c40 c40VarM907c;
        if (m908d(obj) && (c40VarM907c = m907c(obj)) != null) {
            obj = c40VarM907c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        c40 c40VarM907c;
        if (m908d(obj) && (c40VarM907c = m907c(obj)) != null) {
            obj = c40VarM907c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f1365a != cls) {
            return super.getSpans(i, i2, cls);
        }
        c40[] c40VarArr = (c40[]) super.getSpans(i, i2, c40.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c40VarArr.length);
        for (int i3 = 0; i3 < c40VarArr.length; i3++) {
            objArr[i3] = c40VarArr[i3].f887a;
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
        if (cls == null || this.f1365a == cls) {
            cls = c40.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        c40 c40VarM907c;
        if (m908d(obj)) {
            c40VarM907c = m907c(obj);
            if (c40VarM907c != null) {
                obj = c40VarM907c;
            }
        } else {
            c40VarM907c = null;
        }
        super.removeSpan(obj);
        if (c40VarM907c != null) {
            this.f1366b.remove(c40VarM907c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m908d(obj)) {
            c40 c40Var = new c40(obj);
            this.f1366b.add(c40Var);
            obj = c40Var;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new d40(this.f1365a, this, i, i2);
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
        m905a();
        super.replace(i, i2, charSequence);
        m909e();
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

    public d40(Class cls, d40 d40Var, int i, int i2) {
        super(d40Var, i, i2);
        this.f1366b = new ArrayList();
        AbstractC0979zt.m2825f("watcherClass cannot be null", cls);
        this.f1365a = cls;
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
        m905a();
        super.replace(i, i2, charSequence, i3, i4);
        m909e();
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
