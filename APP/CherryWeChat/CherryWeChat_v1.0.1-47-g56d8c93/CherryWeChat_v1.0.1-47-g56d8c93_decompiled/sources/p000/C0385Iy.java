package p000;

import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: Iy */
/* JADX INFO: loaded from: classes.dex */
public final class C0385Iy implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: a */
    public final Object f1320a;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f1321b = new AtomicInteger(0);

    public C0385Iy(Object obj) {
        this.f1320a = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f1320a).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f1320a).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.f1321b.get() <= 0 || !(obj instanceof C1086ZB)) {
            ((SpanWatcher) this.f1320a).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        if (this.f1321b.get() <= 0 || !(obj instanceof C1086ZB)) {
            ((SpanWatcher) this.f1320a).onSpanChanged(spannable, obj, i, i2, i3, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.f1321b.get() <= 0 || !(obj instanceof C1086ZB)) {
            ((SpanWatcher) this.f1320a).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.f1320a).onTextChanged(charSequence, i, i2, i3);
    }
}
