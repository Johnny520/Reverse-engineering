package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class l5 extends k5 {
    public l5() {
    }

    @Override // defpackage.k5, defpackage.m5
    public void a(StaticLayout.Builder r1, TextView r2) {
        r1.setTextDirection(f0.f(r2));
    }

    @Override // defpackage.m5
    public boolean b(TextView r1) {
        return f0.u(r1);
    }
}
