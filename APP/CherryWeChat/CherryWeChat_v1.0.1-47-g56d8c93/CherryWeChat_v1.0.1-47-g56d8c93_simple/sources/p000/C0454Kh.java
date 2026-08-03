package p000;

import io.sentry.InterfaceC1876g0;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: Kh */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0454Kh implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1488a;

    public /* synthetic */ C0454Kh(int r1) {
        this.f1488a = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r5, Object r6) {
        switch(this.f1488a) {
            case 0: goto L14;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        InterfaceC1876g0 r52 = (InterfaceC1876g0) r5;
        InterfaceC1876g0 r62 = (InterfaceC1876g0) r6;
        if (r52 != r62) goto L9;
        return 0;
    L9:
        int r0 = r52.mo3635u().mo3669a(r62.mo3635u());
        if (r0 == 0) goto L13;
        return r0;
    L13:
        return r52.mo3627m().f5739b.toString().compareTo(r62.mo3627m().f5739b.toString());
    L14:
        byte[] r53 = (byte[]) r5;
        byte[] r63 = (byte[]) r6;
        if (r53.length != r63.length) goto L30;
        int r1 = 0;
    L19:
        if (r1 >= r53.length) goto L25;
        byte r2 = r53[r1];
        byte r3 = r63[r1];
        if (r2 != r3) goto L31;
        r1 = r1 + 1;
        goto L19
    L31:
        return r2 - r3;
    L25:
        return 0;
    L30:
        return r53.length - r63.length;
    L5:
        return Long.compare(((File) r5).lastModified(), ((File) r6).lastModified());
    }
}
