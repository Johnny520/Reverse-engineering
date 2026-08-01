package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class m5 {
    public m5() {
    }

    public abstract void a(StaticLayout.Builder r1, TextView r2);

    public boolean b(TextView r3) {
        return ((Boolean) n5.e(r3, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
