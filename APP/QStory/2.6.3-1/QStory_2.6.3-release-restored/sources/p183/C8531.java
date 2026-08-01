package p183;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p050.AbstractC7173;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8531 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final ArrayList f21239;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Class f21240;

    public C8531(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f21239 = new ArrayList();
        AbstractC7173.m12429(cls, "watcherClass cannot be null");
        this.f21240 = cls;
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
        C8530 c8530M13558;
        if (m13557(obj) && (c8530M13558 = m13558(obj)) != null) {
            obj = c8530M13558;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C8530 c8530M13558;
        if (m13557(obj) && (c8530M13558 = m13558(obj)) != null) {
            obj = c8530M13558;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C8530 c8530M13558;
        if (m13557(obj) && (c8530M13558 = m13558(obj)) != null) {
            obj = c8530M13558;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.f21240 != cls) {
            return super.getSpans(i, i2, cls);
        }
        C8530[] c8530Arr = (C8530[]) super.getSpans(i, i2, C8530.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c8530Arr.length);
        for (int i3 = 0; i3 < c8530Arr.length; i3++) {
            objArr[i3] = c8530Arr[i3].f21238;
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
        if (cls == null || this.f21240 == cls) {
            cls = C8530.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C8530 c8530M13558;
        if (m13557(obj)) {
            c8530M13558 = m13558(obj);
            if (c8530M13558 != null) {
                obj = c8530M13558;
            }
        } else {
            c8530M13558 = null;
        }
        super.removeSpan(obj);
        if (c8530M13558 != null) {
            this.f21239.remove(c8530M13558);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m13560();
        super.replace(i, i2, charSequence);
        m13556();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (m13557(obj)) {
            C8530 c8530 = new C8530(obj);
            this.f21239.add(c8530);
            obj = c8530;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C8531(this.f21240, this, i, i2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m13556() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f21239;
            if (i >= arrayList.size()) {
                return;
            }
            ((C8530) arrayList.get(i)).f21237.decrementAndGet();
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m13557(Object obj) {
        if (obj != null) {
            return this.f21240 == obj.getClass();
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8530 m13558(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f21239;
            if (i >= arrayList.size()) {
                return null;
            }
            C8530 c8530 = (C8530) arrayList.get(i);
            if (c8530.f21238 == obj) {
                return c8530;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13559() {
        m13556();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f21239;
            if (i >= arrayList.size()) {
                return;
            }
            ((C8530) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13560() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f21239;
            if (i >= arrayList.size()) {
                return;
            }
            ((C8530) arrayList.get(i)).f21237.incrementAndGet();
            i++;
        }
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
        m13560();
        super.replace(i, i2, charSequence, i3, i4);
        m13556();
        return this;
    }

    public C8531(Class cls, C8531 c8531, int i, int i2) {
        super(c8531, i, i2);
        this.f21239 = new ArrayList();
        AbstractC7173.m12429(cls, "watcherClass cannot be null");
        this.f21240 = cls;
    }
}
