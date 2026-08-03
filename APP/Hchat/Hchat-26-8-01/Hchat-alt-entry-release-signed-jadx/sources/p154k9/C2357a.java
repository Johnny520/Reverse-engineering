package p154k9;

import android.app.Activity;
import p020b5.C0184c;
import p242q8.InterfaceC3461p;

/* JADX INFO: renamed from: k9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2357a implements InterfaceC3461p {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p242q8.InterfaceC3461p
    /* JADX INFO: renamed from: a */
    public final void mo5670a(C0184c c0184c) {
        C2374r c2374r = C2374r.f7799a;
        Activity activity = (Activity) c0184c.f470b;
        String str = (String) c0184c.f469a;
        if ("resume".equals(str)) {
            activity.getClass();
            C2374r.m5687p(new C2372p(activity, 0));
        } else if ("destroy".equals(str)) {
            activity.getClass();
            C2374r.m5687p(new C2372p(activity, 1));
        }
    }
}
