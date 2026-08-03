package io.sentry.android.replay;

import android.graphics.Bitmap;
import io.sentry.C2046v2;
import io.sentry.C2054w1;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1929n;
import io.sentry.android.replay.capture.C1779q;
import io.sentry.transport.C2021p;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.functions.Function2;
import p000.AbstractC0073Bn;
import p000.AbstractC0585Nj;
import p000.C0382Iv;
import p000.C0829TC;

/* JADX INFO: renamed from: io.sentry.android.replay.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1793n extends AbstractC0073Bn implements Function2 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bitmap f6513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0382Iv f6514c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReplayIntegration f6515d;

    public C1793n(Bitmap r1, C0382Iv r2, ReplayIntegration r3) {
        this.f6513b = r1;
        this.f6514c = r2;
        this.f6515d = r3;
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object r8, Object r9) {
        C1789j r82 = (C1789j) r8;
        long r0 = ((Number) r9).longValue();
        String r92 = (String) this.f6514c.f1315a;
        if (r82.m3972f() == null) goto L18;
        Bitmap r2 = this.f6513b;
        if (r2.isRecycled() == true) goto L18;
        File r3 = r82.m3972f();
        if (r3 == null) goto L10;
        r3.mkdirs();
    L10:
        File r32 = new File(r82.m3972f(), r0 + ".jpg");
        r32.createNewFile();
        FileOutputStream r4 = new FileOutputStream(r32);
        r2.compress(Bitmap.CompressFormat.JPEG, r82.f6498a.getSessionReplay().f7309e.screenshotQuality, r4);     // Catch: Throwable -> L13
        r4.flush();     // Catch: Throwable -> L13
        r4.close();
        r82.f6505h.add(new C1790k(r32, r0, r92));
    L13:
        th = move-exception;
        throw th;     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        AbstractC0585Nj.m1138f(r4, th);
        throw th;
    L18:
        ReplayIntegration r83 = this.f6515d;
        if ((r83.f6393l instanceof C1779q) == false) goto L40;
        C2046v2 r93 = r83.f6384c;
        if (r93 != null) goto L24;
        r93 = null;
    L24:
        if (r93.getConnectionStatusProvider().mo3684g() == EnumC1606M.DISCONNECTED) goto L38;
        C2054w1 r94 = r83.f6385d;
        if (r94 == null) goto L32;
        C2021p r95 = r94.mo3709c();
        if (r95 == null) goto L32;
        if (r95.m4170f(EnumC1929n.All) == true) goto L38;
    L32:
        C2054w1 r96 = r83.f6385d;
        if (r96 == null) goto L40;
        C2021p r97 = r96.mo3709c();
        if (r97 == null) goto L40;
        if (r97.m4170f(EnumC1929n.Replay) != true) goto L40;
    L38:
        r83.m3949v();
    L40:
        return C0829TC.f2620a;
    }
}
