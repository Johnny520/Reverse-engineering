package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: androidx.emoji2.text.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0406u extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a */
    public final Class f1215a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f1216b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0406u(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f1216b = new ArrayList();
        AbstractC0503h.m979g(cls, "watcherClass cannot be null");
        this.f1215a = cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m778a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1216b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0405t) arrayList.get(i2)).f1214c.incrementAndGet();
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m779b() {
        m782e();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1216b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0405t) arrayList.get(i2)).onTextChanged(this, 0, length(), length());
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0405t m780c(Object obj) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1216b;
            if (i2 >= arrayList.size()) {
                return null;
            }
            C0405t c0405t = (C0405t) arrayList.get(i2);
            if (c0405t.f1213b == obj) {
                return c0405t;
            }
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m781d(Object obj) {
        if (obj != null) {
            return this.f1215a == obj.getClass();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m782e() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1216b;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((C0405t) arrayList.get(i2)).f1214c.decrementAndGet();
            i2++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0405t c0405tM780c;
        if (m781d(obj) && (c0405tM780c = m780c(obj)) != null) {
            obj = c0405tM780c;
        }
        return super.getSpanEnd(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0405t c0405tM780c;
        if (m781d(obj) && (c0405tM780c = m780c(obj)) != null) {
            obj = c0405tM780c;
        }
        return super.getSpanFlags(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0405t c0405tM780c;
        if (m781d(obj) && (c0405tM780c = m780c(obj)) != null) {
            obj = c0405tM780c;
        }
        return super.getSpanStart(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        if (this.f1215a != cls) {
            return super.getSpans(i2, i3, cls);
        }
        C0405t[] c0405tArr = (C0405t[]) super.getSpans(i2, i3, C0405t.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0405tArr.length);
        for (int i4 = 0; i4 < c0405tArr.length; i4++) {
            objArr[i4] = c0405tArr[i4].f1213b;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        if (cls == null || this.f1215a == cls) {
            cls = C0405t.class;
        }
        return super.nextSpanTransition(i2, i3, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0405t c0405tM780c;
        if (m781d(obj)) {
            c0405tM780c = m780c(obj);
            if (c0405tM780c != null) {
                obj = c0405tM780c;
            }
        } else {
            c0405tM780c = null;
        }
        super.removeSpan(obj);
        if (c0405tM780c != null) {
            this.f1216b.remove(c0405tM780c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i2, int i3, CharSequence charSequence) {
        replace(i2, i3, charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        if (m781d(obj)) {
            C0405t c0405t = new C0405t(obj);
            this.f1216b.add(c0405t);
            obj = c0405t;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return new C0406u(this.f1215a, this, i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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
        m778a();
        super.replace(i2, i3, charSequence);
        m782e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    public C0406u(Class cls, C0406u c0406u, int i2, int i3) {
        super(c0406u, i2, i3);
        this.f1216b = new ArrayList();
        AbstractC0503h.m979g(cls, "watcherClass cannot be null");
        this.f1215a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c2) {
        super.append(c2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        m778a();
        super.replace(i2, i3, charSequence, i4, i5);
        m782e();
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
