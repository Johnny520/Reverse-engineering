package defpackage;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p10 implements t10 {
    public final a3 a;
    public boolean b;
    public Bundle c;
    public final o50 d;

    public p10(a3 r2, ComponentActivity r3) {
        ip.o("savedStateRegistry", r2);
        this.a = r2;
        this.d = new o50(new sw(3, r3));
    }

    @Override // defpackage.t10
    public final Bundle a() {
        Bundle r0 = new Bundle();
        Bundle r1 = this.c;
        if (r1 == null) goto L5;
        r0.putAll(r1);
    L5:
        Iterator r12 = ((q10) this.d.a()).c.entrySet().iterator();
        if (r12.hasNext() == true) goto L9;
        this.b = false;
        return r0;
    L9:
        Map.Entry r02 = (Map.Entry) r12.next();
        String r13 = (String) r02.getKey();
        r02.getValue().getClass();
        throw new ClassCastException();
    }
}
