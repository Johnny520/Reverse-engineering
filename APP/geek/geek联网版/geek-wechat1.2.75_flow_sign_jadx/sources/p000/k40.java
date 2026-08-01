package p000;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k40 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class f2778a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2779b;

    public k40(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f2779b = new ArrayList();
        AbstractC0498mu.m1887d("watcherClass cannot be null", cls);
        this.f2778a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m1644a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2779b;
            if (i >= arrayList.size()) {
                return;
            }
            ((j40) arrayList.get(i)).f2659b.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m1645b() {
        m1648e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2779b;
            if (i >= arrayList.size()) {
                return;
            }
            ((j40) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final j40 m1646c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2779b;
            if (i >= arrayList.size()) {
                return null;
            }
            j40 j40Var = (j40) arrayList.get(i);
            if (j40Var.f2658a == obj) {
                return j40Var;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1647d(Object obj) {
        if (obj != null) {
            return this.f2778a == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m1648e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2779b;
            if (i >= arrayList.size()) {
                return;
            }
            ((j40) arrayList.get(i)).f2659b.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        j40 j40VarM1646c;
        if (m1647d(obj) && (j40VarM1646c = m1646c(obj)) != null) {
            obj = j40VarM1646c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        j40 j40VarM1646c;
        if (m1647d(obj) && (j40VarM1646c = m1646c(obj)) != null) {
            obj = j40VarM1646c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        j40 j40VarM1646c;
        if (m1647d(obj) && (j40VarM1646c = m1646c(obj)) != null) {
            obj = j40VarM1646c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f2778a != cls) {
            return super.getSpans(i, i2, cls);
        }
        j40[] j40VarArr = (j40[]) super.getSpans(i, i2, j40.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, j40VarArr.length);
        for (int i3 = 0; i3 < j40VarArr.length; i3++) {
            objArr[i3] = j40VarArr[i3].f2658a;
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
        if (cls == null || this.f2778a == cls) {
            cls = j40.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        j40 j40VarM1646c;
        if (m1647d(obj)) {
            j40VarM1646c = m1646c(obj);
            if (j40VarM1646c != null) {
                obj = j40VarM1646c;
            }
        } else {
            j40VarM1646c = null;
        }
        super.removeSpan(obj);
        if (j40VarM1646c != null) {
            this.f2779b.remove(j40VarM1646c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m1647d(obj)) {
            j40 j40Var = new j40(obj);
            this.f2779b.add(j40Var);
            obj = j40Var;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new k40(this.f2778a, this, i, i2);
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
        m1644a();
        super.replace(i, i2, charSequence);
        m1648e();
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

    public k40(Class cls, k40 k40Var, int i, int i2) {
        super(k40Var, i, i2);
        this.f2779b = new ArrayList();
        AbstractC0498mu.m1887d("watcherClass cannot be null", cls);
        this.f2778a = cls;
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
        m1644a();
        super.replace(i, i2, charSequence, i3, i4);
        m1648e();
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
