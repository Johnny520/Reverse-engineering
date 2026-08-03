package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: androidx.emoji2.text.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0495t implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: a */
    public final Object f1393a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f1394b = new AtomicInteger(0);

    public C0495t(Object obj) {
        this.f1393a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1393a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        ((TextWatcher) this.f1393a).beforeTextChanged(charSequence, i2, i3, i4);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
        if (this.f1394b.get() <= 0 || !(obj instanceof C0498w)) {
            ((SpanWatcher) this.f1393a).onSpanAdded(spannable, obj, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[PHI: r11
  0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (this.f1394b.get() <= 0 || !(obj instanceof C0498w)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i6 = i2;
                i7 = i4;
            } else {
                if (i2 > i3) {
                    i2 = 0;
                }
                if (i4 > i5) {
                    i6 = i2;
                    i7 = 0;
                }
            }
            ((SpanWatcher) this.f1393a).onSpanChanged(spannable, obj, i6, i3, i7, i5);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
        if (this.f1394b.get() <= 0 || !(obj instanceof C0498w)) {
            ((SpanWatcher) this.f1393a).onSpanRemoved(spannable, obj, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        ((TextWatcher) this.f1393a).onTextChanged(charSequence, i2, i3, i4);
    }
}
