package p000;

import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: rh */
/* JADX INFO: loaded from: classes.dex */
public final class C2460rh extends AbstractC2417qh {

    /* JADX INFO: renamed from: b */
    public boolean f8668b;

    /* JADX INFO: renamed from: c */
    public File[] f8669c;

    /* JADX INFO: renamed from: d */
    public int f8670d;

    /* JADX INFO: renamed from: e */
    public boolean f8671e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2589uh f8672f;

    public C2460rh(C2589uh r1, File r2) {
        this.f8672f = r1;
        super(r2);
    }

    @Override // p000.AbstractC2632vh
    /* JADX INFO: renamed from: a */
    public final File mo4952a() {
        boolean r0 = this.f8671e;
        File r2 = this.f9142a;
        if (r0 == false) goto L5;
    L12:
        File[] r02 = this.f8669c;
        if (r02 == null) goto L19;
        int r3 = this.f8670d;
        if (r3 >= r02.length) goto L19;
        this.f8670d = r3 + 1;
        return r02[r3];
    L19:
        if (this.f8668b == true) goto L22;
        this.f8668b = true;
        return r2;
    L22:
        return null;
    L5:
        if (this.f8669c != null) goto L12;
        File[] r03 = r2.listFiles();
        this.f8669c = r03;
        if (r03 != null) goto L12;
        Function2 r04 = this.f8672f.f8963d.f8786c;
        if (r04 == null) goto L11;
        r04.mo446d(r2, new C0516M(r2, 0));
    L11:
        this.f8671e = true;
        goto L12
    }
}
