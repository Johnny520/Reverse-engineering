package p004C;

import p031Q0.AbstractC0307g;
import p069m.C0983c;

/* JADX INFO: renamed from: C.b */
/* JADX INFO: loaded from: classes.dex */
public class C0061b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205a;

    /* JADX INFO: renamed from: b */
    public final Object[] f206b;

    /* JADX INFO: renamed from: c */
    public int f207c;

    public C0061b(int r2) {
        this.f205a = 0;
        if (r2 <= 0) goto L7;
        this.f206b = new Object[r2];
        return;
    L7:
        throw new IllegalArgumentException("The max pool size must be > 0".toString());
    }

    /* JADX INFO: renamed from: a */
    public Object mo198a() {
        switch(this.f205a) {
            case 0: goto L8;
            default: goto L4;
        };
    L4:
        int r02 = this.f207c;
        if (r02 <= 0) goto L12;
        int r2 = r02 - 1;
        Object[] r3 = this.f206b;
        Object r4 = r3[r2];
        r3[r2] = null;
        this.f207c = r02 - 1;
        return r4;
    L12:
        return null;
    L8:
        int r03 = this.f207c;
        if (r03 <= 0) goto L13;
        int r04 = r03 - 1;
        Object[] r22 = this.f206b;
        Object r32 = r22[r04];
        AbstractC0307g.m701c(r32, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        r22[r04] = null;
        this.f207c--;
        return r32;
    L13:
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m199b(C0983c r4) {
        int r02 = this.f207c;
        Object[] r1 = this.f206b;
        if (r02 >= r1.length) goto L6;
        r1[r02] = r4;
        this.f207c = r02 + 1;
        return;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo200c(Object r7) {
        AbstractC0307g.m703e(r7, "instance");
        int r02 = this.f207c;
        int r2 = 0;
    L3:
        Object[] r3 = this.f206b;
        if (r2 >= r02) goto L9;
        if (r3[r2] == r7) goto L7;
        r2 = r2 + 1;
        goto L3
    L7:
        boolean r03 = true;
    L11:
        if ((!r03) == false) goto L18;
        int r04 = this.f207c;
        if (r04 >= r3.length) goto L16;
        r3[r04] = r7;
        this.f207c = r04 + 1;
        return true;
    L16:
        return false;
    L18:
        throw new IllegalStateException("Already in the pool!".toString());
    L9:
        r03 = false;
        goto L11
    }

    public C0061b() {
        this.f205a = 1;
        this.f206b = new Object[256];
    }
}
