package p065eb;

import java.io.File;
import p136j8.InterfaceC2106q;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: eb.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0863d1 implements InterfaceC2106q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0860c1 f2655a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0901w0 f2656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0901w0 f2657c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0863d1(C0860c1 c0860c1, C0901w0 c0901w0, C0901w0 c0901w02) {
        this.f2655a = c0860c1;
        this.f2656b = c0901w0;
        this.f2657c = c0901w02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2106q
    /* JADX INFO: renamed from: c */
    public final void mo808c(String str) {
        if (AbstractC3149m.m6721t0(str)) {
            str = "Video download failed";
        }
        this.f2656b.invoke(new Exception(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2106q
    public final void onSuccess(File file) {
        long j3 = this.f2655a.f2638d;
        if (j3 <= 0 || file.length() >= j3) {
            this.f2657c.invoke(file);
            return;
        }
        file.delete();
        this.f2656b.invoke(new Exception("Video download is incomplete"));
    }
}
