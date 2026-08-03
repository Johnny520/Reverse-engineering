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
import java.io.IOException;
import kotlin.jvm.functions.Function2;
import p000.AbstractC0073Bn;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1793n(Bitmap bitmap, C0382Iv c0382Iv, ReplayIntegration replayIntegration) {
        super(2);
        this.f6513b = bitmap;
        this.f6514c = c0382Iv;
        this.f6515d = replayIntegration;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) throws IOException {
        C2054w1 c2054w1;
        C2054w1 c2054w12;
        C2021p c2021pMo3709c;
        C2021p c2021pMo3709c2;
        C1789j c1789j = (C1789j) obj;
        long jLongValue = ((Number) obj2).longValue();
        String str = (String) this.f6514c.f1315a;
        if (c1789j.m3972f() != null) {
            Bitmap bitmap = this.f6513b;
            if (!bitmap.isRecycled()) {
                File fileM3972f = c1789j.m3972f();
                if (fileM3972f != null) {
                    fileM3972f.mkdirs();
                }
                File file = new File(c1789j.m3972f(), jLongValue + ".jpg");
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    bitmap.compress(Bitmap.CompressFormat.JPEG, c1789j.f6498a.getSessionReplay().f7309e.screenshotQuality, fileOutputStream);
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    c1789j.f6505h.add(new C1790k(file, jLongValue, str));
                } finally {
                }
            }
        }
        ReplayIntegration replayIntegration = this.f6515d;
        if (replayIntegration.f6393l instanceof C1779q) {
            C2046v2 c2046v2 = replayIntegration.f6384c;
            if (c2046v2 == null) {
                c2046v2 = null;
            }
            if (c2046v2.getConnectionStatusProvider().mo3684g() == EnumC1606M.DISCONNECTED || (((c2054w1 = replayIntegration.f6385d) != null && (c2021pMo3709c2 = c2054w1.mo3709c()) != null && c2021pMo3709c2.m4170f(EnumC1929n.All)) || ((c2054w12 = replayIntegration.f6385d) != null && (c2021pMo3709c = c2054w12.mo3709c()) != null && c2021pMo3709c.m4170f(EnumC1929n.Replay)))) {
                replayIntegration.m3949v();
            }
        }
        return C0829TC.f2620a;
    }
}
