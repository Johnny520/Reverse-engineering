package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class C7508 extends SpannableStringBuilder {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6391
    public final Class<?> f22734;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6391
    public final List<C1282> f22735;

    /* JADX INFO: renamed from: Yue.ۥۣۢ۟ۨ$ۥ */
    public static class C1282 implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final Object f22736;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final AtomicInteger f22737 = new AtomicInteger(0);

        public C1282(Object obj) {
            this.f22736 = obj;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f22736).afterTextChanged(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f22736).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.f22737.get() <= 0 || !m3703(obj)) {
                ((SpanWatcher) this.f22736).onSpanAdded(spannable, obj, i, i2);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x001e A[PHI: r11
  0x001e: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0013, B:12:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // android.text.SpanWatcher
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.f22737.get() <= 0 || !m3703(obj)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    i5 = i;
                    i6 = i3;
                } else {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                    }
                }
                ((SpanWatcher) this.f22736).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.f22737.get() <= 0 || !m3703(obj)) {
                ((SpanWatcher) this.f22736).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.f22736).onTextChanged(charSequence, i, i2, i3);
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m3702() {
            this.f22737.incrementAndGet();
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final boolean m3703(Object obj) {
            return obj instanceof AbstractC4622;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m23474() {
            this.f22737.decrementAndGet();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public C7508(@InterfaceC6391 Class<?> cls) {
        this.f22735 = new ArrayList();
        C6740.m21416(cls, "watcherClass cannot be null");
        this.f22734 = cls;
    }

    @InterfaceC6391
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static C7508 m23467(@InterfaceC6391 Class<?> cls, @InterfaceC6391 CharSequence charSequence) {
        return new C7508(cls, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(@InterfaceC6490 Object obj) {
        C1282 c1282M23470;
        if (m23472(obj) && (c1282M23470 = m23470(obj)) != null) {
            obj = c1282M23470;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(@InterfaceC6490 Object obj) {
        C1282 c1282M23470;
        if (m23472(obj) && (c1282M23470 = m23470(obj)) != null) {
            obj = c1282M23470;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(@InterfaceC6490 Object obj) {
        C1282 c1282M23470;
        if (m23472(obj) && (c1282M23470 = m23470(obj)) != null) {
            obj = c1282M23470;
        }
        return super.getSpanStart(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: T[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i, int i2, @InterfaceC6391 Class<T> cls) {
        if (!m23471(cls)) {
            return (T[]) super.getSpans(i, i2, cls);
        }
        C1282[] c1282Arr = (C1282[]) super.getSpans(i, i2, C1282.class);
        T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, c1282Arr.length));
        for (int i3 = 0; i3 < c1282Arr.length; i3++) {
            tArr[i3] = c1282Arr[i3].f22736;
        }
        return tArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i, int i2, @InterfaceC6490 Class cls) {
        if (cls == null || m23471(cls)) {
            cls = C1282.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(@InterfaceC6490 Object obj) {
        C1282 c1282M23470;
        if (m23472(obj)) {
            c1282M23470 = m23470(obj);
            if (c1282M23470 != null) {
                obj = c1282M23470;
            }
        } else {
            c1282M23470 = null;
        }
        super.removeSpan(obj);
        if (c1282M23470 != null) {
            this.f22735.remove(c1282M23470);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(@InterfaceC6490 Object obj, int i, int i2, int i3) {
        if (m23472(obj)) {
            C1282 c1282 = new C1282(obj);
            this.f22735.add(c1282);
            obj = c1282;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i, int i2) {
        return new C7508(this.f22734, this, i, i2);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ */
    public void m3700() {
        m3701();
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3701() {
        for (int i = 0; i < this.f22735.size(); i++) {
            this.f22735.get(i).m3702();
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m23468() {
        m23473();
        m23469();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m23469() {
        for (int i = 0; i < this.f22735.size(); i++) {
            this.f22735.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C1282 m23470(Object obj) {
        for (int i = 0; i < this.f22735.size(); i++) {
            C1282 c1282 = this.f22735.get(i);
            if (c1282.f22736 == obj) {
                return c1282;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final boolean m23471(@InterfaceC6391 Class<?> cls) {
        return this.f22734 == cls;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final boolean m23472(@InterfaceC6490 Object obj) {
        return obj != null && m23471(obj.getClass());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m23473() {
        for (int i = 0; i < this.f22735.size(); i++) {
            this.f22735.get(i).m23474();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: delete(II)Landroid/text/Editable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: insert(ILjava/lang/CharSequence;)Landroid/text/Editable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: replace(IILjava/lang/CharSequence;)Landroid/text/Editable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        m3701();
        super.replace(i, i2, charSequence);
        m23473();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: insert(ILjava/lang/CharSequence;II)Landroid/text/Editable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public C7508(@InterfaceC6391 Class<?> cls, @InterfaceC6391 CharSequence charSequence) {
        super(charSequence);
        this.f22735 = new ArrayList();
        C6740.m21416(cls, "watcherClass cannot be null");
        this.f22734 = cls;
    }

    /* JADX DEBUG: Method merged with bridge method: replace(IILjava/lang/CharSequence;II)Landroid/text/Editable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m3701();
        super.replace(i, i2, charSequence, i3, i4);
        m23473();
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;)Landroid/text/Editable; */
    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;)Ljava/lang/Appendable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @InterfaceC6391
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: append(C)Landroid/text/Editable; */
    /* JADX DEBUG: Method merged with bridge method: append(C)Ljava/lang/Appendable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @InterfaceC6391
    public SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    public C7508(@InterfaceC6391 Class<?> cls, @InterfaceC6391 CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.f22735 = new ArrayList();
        C6740.m21416(cls, "watcherClass cannot be null");
        this.f22734 = cls;
    }

    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;II)Landroid/text/Editable; */
    /* JADX DEBUG: Method merged with bridge method: append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable; */
    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    @InterfaceC6391
    public SpannableStringBuilder append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
