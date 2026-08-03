package p000;

import java.io.File;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: th */
/* JADX INFO: loaded from: classes.dex */
public final class C2546th extends AbstractC2417qh {

    /* JADX INFO: renamed from: b */
    public boolean f8864b;

    /* JADX INFO: renamed from: c */
    public File[] f8865c;

    /* JADX INFO: renamed from: d */
    public int f8866d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2589uh f8867e;

    public C2546th(C2589uh r1, File r2) {
        this.f8867e = r1;
        super(r2);
    }

    @Override // p000.AbstractC2632vh
    /* JADX INFO: renamed from: a */
    public final File mo4952a() {
        boolean r0 = this.f8864b;
        File r1 = this.f9142a;
        if (r0 == true) goto L6;
        this.f8864b = true;
        return r1;
    L6:
        File[] r02 = this.f8865c;
        if (r02 != null) goto L9;
    L12:
        if (r02 != null) goto L23;
        File[] r03 = r1.listFiles();
        this.f8865c = r03;
        if (r03 != null) goto L18;
        Function2 r04 = this.f8867e.f8963d.f8786c;
        if (r04 == null) goto L18;
        r04.mo446d(r1, new C0516M(r1, 0));
    L18:
        File[] r05 = this.f8865c;
        if (r05 != null) goto L21;
    L22:
        return null;
    L21:
        if (r05.length == 0) goto L22;
    L23:
        File[] r06 = this.f8865c;
        int r12 = this.f8866d;
        this.f8866d = r12 + 1;
        return r06[r12];
    L9:
        if (this.f8866d < r02.length) goto L12;
        return null;
    }
}
