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
    public final AtomicInteger f1394b;

    public C0495t(Object r3) {
        this.f1394b = new AtomicInteger(0);
        this.f1393a = r3;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r2) {
        ((TextWatcher) this.f1393a).afterTextChanged(r2);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r2, int r3, int r4, int r5) {
        ((TextWatcher) this.f1393a).beforeTextChanged(r2, r3, r4, r5);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable r2, Object r3, int r4, int r5) {
        if (this.f1394b.get() > 0) goto L5;
    L7:
        ((SpanWatcher) this.f1393a).onSpanAdded(r2, r3, r4, r5);
        return;
    L5:
        if ((r3 instanceof C0498w) == false) goto L7;
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable r9, Object r10, int r11, int r12, int r13, int r14) {
        if (this.f1394b.get() <= 0) goto L8;
        if ((r10 instanceof C0498w) == false) goto L8;
        return;
    L8:
        if (Build.VERSION.SDK_INT < 28) goto L10;
    L14:
        int r4 = r11;
        int r6 = r13;
    L15:
        ((SpanWatcher) this.f1393a).onSpanChanged(r9, r10, r4, r12, r6, r14);
        return;
    L10:
        if (r11 <= r12) goto L12;
        r11 = 0;
    L12:
        if (r13 <= r14) goto L14;
        r4 = r11;
        r6 = 0;
        goto L15
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable r2, Object r3, int r4, int r5) {
        if (this.f1394b.get() > 0) goto L5;
    L7:
        ((SpanWatcher) this.f1393a).onSpanRemoved(r2, r3, r4, r5);
        return;
    L5:
        if ((r3 instanceof C0498w) == false) goto L7;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r2, int r3, int r4, int r5) {
        ((TextWatcher) this.f1393a).onTextChanged(r2, r3, r4, r5);
    }
}
