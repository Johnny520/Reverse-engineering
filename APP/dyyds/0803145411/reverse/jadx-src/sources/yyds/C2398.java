package yyds;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: renamed from: yyds.ᲇᛲᛴᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2398 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Class f11818;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final ArrayList f11819;

    public C2398(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f11819 = new ArrayList();
        AbstractC2217.m4200(cls, "watcherClass cannot be null");
        this.f11818 = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0646 c0646M4434;
        if (m4435(obj) && (c0646M4434 = m4434(obj)) != null) {
            obj = c0646M4434;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0646 c0646M4434;
        if (m4435(obj) && (c0646M4434 = m4434(obj)) != null) {
            obj = c0646M4434;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0646 c0646M4434;
        if (m4435(obj) && (c0646M4434 = m4434(obj)) != null) {
            obj = c0646M4434;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f11818 != cls) {
            return super.getSpans(i, i2, cls);
        }
        C0646[] c0646Arr = (C0646[]) super.getSpans(i, i2, C0646.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0646Arr.length);
        for (int i3 = 0; i3 < c0646Arr.length; i3++) {
            objArr[i3] = c0646Arr[i3].f3122;
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
        if (cls == null || this.f11818 == cls) {
            cls = C0646.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0646 c0646M4434;
        if (m4435(obj)) {
            c0646M4434 = m4434(obj);
            if (c0646M4434 != null) {
                obj = c0646M4434;
            }
        } else {
            c0646M4434 = null;
        }
        super.removeSpan(obj);
        if (c0646M4434 != null) {
            this.f11819.remove(c0646M4434);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m4432();
        super.replace(i, i2, charSequence);
        m4431();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m4435(obj)) {
            C0646 c0646 = new C0646(obj);
            this.f11819.add(c0646);
            obj = c0646;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C2398(this.f11818, this, i, i2);
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m4431() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11819;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0646) arrayList.get(i)).f3123.decrementAndGet();
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m4432() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11819;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0646) arrayList.get(i)).f3123.incrementAndGet();
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m4433() {
        m4431();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11819;
            if (i >= arrayList.size()) {
                return;
            }
            ((C0646) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C0646 m4434(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f11819;
            if (i >= arrayList.size()) {
                return null;
            }
            C0646 c0646 = (C0646) arrayList.get(i);
            if (c0646.f3122 == obj) {
                return c0646;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean m4435(Object obj) {
        if (obj != null) {
            return this.f11818 == obj.getClass();
        }
        return false;
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

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m4432();
        super.replace(i, i2, charSequence, i3, i4);
        m4431();
        return this;
    }

    public C2398(Class cls, C2398 c2398, int i, int i2) {
        super(c2398, i, i2);
        this.f11819 = new ArrayList();
        AbstractC2217.m4200(cls, "watcherClass cannot be null");
        this.f11818 = cls;
    }
}
