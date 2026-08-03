package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;

/* JADX INFO: renamed from: ea */
/* JADX INFO: loaded from: classes.dex */
public final class C1363ea implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageView f4871b;

    public /* synthetic */ C1363ea(ImageView r1, int r2) {
        this.f4870a = r2;
        this.f4871b = r1;
    }

    /* JADX INFO: renamed from: a */
    private final void m2643a(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: b */
    private final void m2644b(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: c */
    private final void m2645c(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: d */
    private final void m2646d(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: e */
    private final void m2647e(int r1, int r2, int r3, CharSequence r4) {
    }

    /* JADX INFO: renamed from: f */
    private final void m2648f(int r1, int r2, int r3, CharSequence r4) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r2) {
        switch(this.f4870a) {
            case 0: goto L20;
            case 1: goto L12;
            default: goto L4;
        };
    L4:
        if (r2 != null) goto L6;
    L9:
        int r22 = 8;
    L10:
        this.f4871b.setVisibility(r22);
        return;
    L6:
        if (r2.length() == 0) goto L9;
        r22 = 0;
        goto L10
    L12:
        if (r2 != null) goto L14;
    L17:
        int r23 = 8;
    L18:
        this.f4871b.setVisibility(r23);
        return;
    L14:
        if (r2.length() == 0) goto L17;
        r23 = 0;
        goto L18
    L20:
        if (r2 != null) goto L22;
    L25:
        int r24 = 8;
    L26:
        this.f4871b.setVisibility(r24);
        return;
    L22:
        if (r2.length() == 0) goto L25;
        r24 = 0;
        goto L26
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
        int r12 = this.f4870a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
        int r12 = this.f4870a;
    }
}
