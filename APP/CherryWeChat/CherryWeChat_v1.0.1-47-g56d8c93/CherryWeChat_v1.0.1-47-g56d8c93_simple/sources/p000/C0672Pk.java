package p000;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/* JADX INFO: renamed from: Pk */
/* JADX INFO: loaded from: classes.dex */
public final class C0672Pk implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextView f2144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextView f2145b;

    public C0672Pk(TextView r1, TextView r2) {
        this.f2144a = r1;
        this.f2145b = r2;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r4) {
        if (r4 == null) goto L9;
        int r0 = r4.length();
        TextView r1 = this.f2144a;
        if (r0 != 0) goto L7;
        Handler r42 = AbstractC1208bA.f4138a;
        AbstractC1208bA.m2329b(new RunnableC2260n3(9, this.f2145b, r1), 200);
        return;
    L7:
        r1.setVisibility(0);
        r1.setText(r4);
        return;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r1, int r2, int r3, int r4) {
    }
}
