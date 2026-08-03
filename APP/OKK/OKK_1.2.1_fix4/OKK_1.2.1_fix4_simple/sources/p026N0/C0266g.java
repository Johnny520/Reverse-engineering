package p026N0;

import java.io.File;
import java.util.ArrayDeque;
import p007D0.C0137c;
import p009E0.AbstractC0171b;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: N0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0266g extends AbstractC0171b {

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f558c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0268i f559d;

    public C0266g(C0268i r4) {
        this.f559d = r4;
        ArrayDeque r02 = new ArrayDeque();
        this.f558c = r02;
        if (((File) r4.f562b).isDirectory() == false) goto L6;
        r02.push(m689b((File) r4.f562b));
        return;
    L6:
        if (((File) r4.f562b).isFile() == false) goto L8;
        File r42 = (File) r4.f562b;
        AbstractC0307g.m703e(r42, "rootFile");
        r02.push(new C0264e(r42));
        return;
    L8:
        this.f382a = 2;
    }

    @Override // p009E0.AbstractC0171b
    /* JADX INFO: renamed from: a */
    public final void mo515a() {
    L2:
        ArrayDeque r02 = this.f558c;
        AbstractC0267h r1 = (AbstractC0267h) r02.peek();
        if (r1 == null) goto L4;
        File r2 = r1.mo688a();
        if (r2 == null) goto L7;
        if (r2.equals(r1.f560a) == true) goto L16;
        if (r2.isDirectory() == false) goto L16;
        int r12 = r02.size();
        this.f559d.getClass();
        if (r12 >= Integer.MAX_VALUE) goto L16;
        r02.push(m689b(r2));
    L16:
        File r03 = r2;
    L17:
        if (r03 == null) goto L19;
        this.f383b = r03;
        this.f382a = 1;
        return;
    L19:
        this.f382a = 2;
        return;
    L7:
        r02.pop();
        goto L2
    L4:
        r03 = null;
        goto L17
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0262c m689b(File r3) {
        int r02 = ((EnumC0269j) this.f559d.f563c).ordinal();
        if (r02 == 0) goto L10;
        if (r02 != 1) goto L8;
        return new C0263d(this, r3);
    L8:
        throw new C0137c();
    L10:
        return new C0265f(this, r3);
    }
}
