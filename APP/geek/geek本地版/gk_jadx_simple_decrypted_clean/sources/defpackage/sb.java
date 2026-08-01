package defpackage;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class sb {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public ArrayList d;
    public final transient HashMap e;
    public final HashMap f;
    public final Bundle g;

    public sb() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new Bundle();
    }

    public final boolean a(int r4, int r5, Intent r6) {
        String r42 = (String) this.a.get(Integer.valueOf(r4));
        if (r42 != null) goto L6;
        return false;
    L6:
        w1 r0 = (w1) this.e.get(r42);
        if (r0 == null) goto L11;
        rl r1 = r0.a;
        if (this.d.contains(r42) == false) goto L11;
        r1.a(r0.b.D(r5, r6));
        this.d.remove(r42);
        return true;
    L11:
        this.f.remove(r42);
        u1 r02 = new u1(r5, r6);
        this.g.putParcelable(r42, r02);
        return true;
    }

    public final d4 b(String r7, ff r8, rl r9) {
        HashMap r0 = this.b;
        if (((Integer) r0.get(r7)) != null) goto L10;
        m r1 = az.a;
        int r12 = az.a.d().nextInt(2147418112);
    L6:
        int r13 = r12 + 65536;
        Integer r4 = Integer.valueOf(r13);
        HashMap r5 = this.a;
        if (r5.containsKey(r4) == false) goto L9;
        m r14 = az.a;
        r12 = az.a.d().nextInt(2147418112);
        goto L6
    L9:
        r5.put(Integer.valueOf(r13), r7);
        r0.put(r7, Integer.valueOf(r13));
    L10:
        w1 r02 = new w1(r9, r8);
        this.e.put(r7, r02);
        HashMap r03 = this.f;
        if (r03.containsKey(r7) == false) goto L13;
        Object r15 = r03.get(r7);
        r03.remove(r7);
        r9.a(r15);
    L13:
        Bundle r04 = this.g;
        u1 r16 = (u1) r04.getParcelable(r7);
        if (r16 == null) goto L17;
        r04.remove(r7);
        r9.a(r8.D(r16.a, r16.b));
    L17:
        return new d4(this, 1, r7);
    }
}
