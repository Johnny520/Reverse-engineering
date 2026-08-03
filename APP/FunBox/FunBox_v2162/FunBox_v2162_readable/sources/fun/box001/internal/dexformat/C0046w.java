package fun.box001.internal.dexformat;

import fun.box001.internal.collections.C0016a;
import java.util.ArrayList;

/* JADX INFO: renamed from: e.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0046w {

    /* JADX INFO: renamed from: a */
    private final C0047x f269a;

    /* JADX INFO: renamed from: b */
    private ArrayList f270b;

    public C0046w(C0016a c0016a, int i2, int i3, int i4, int i5) {
        this.f269a = new C0047x(c0016a, i2, i4, i5);
        this.f270b = new ArrayList(i3);
    }

    /* JADX INFO: renamed from: a */
    public final void m195a(AbstractC0033j abstractC0033j) {
        this.f269a.m204a(abstractC0033j);
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0033j m196b(int i2) {
        C0047x c0047x = this.f269a;
        if (i2 >= c0047x.m212m() || i2 < 0) {
            return null;
        }
        return c0047x.m207g(i2);
    }

    /* JADX INFO: renamed from: c */
    public final C0047x m197c() {
        ArrayList arrayList = this.f270b;
        if (arrayList == null) {
            throw new UnsupportedOperationException("already processed");
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            C0047x c0047x = this.f269a;
            if (i2 >= size) {
                this.f270b = null;
                return c0047x;
            }
            c0047x.m204a((AbstractC0033j) this.f270b.get(i2));
            i2++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m198d(C0029f c0029f) {
        this.f269a.m211l(c0029f);
    }

    /* JADX INFO: renamed from: e */
    public final int m199e() {
        return this.f269a.m212m();
    }
}
