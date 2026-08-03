package p065eb;

import java.io.File;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p116i.C1739c;
import p136j8.C2105p;
import p218og.AbstractC3156t;
import p265s.C3857t;
import p276sf.C3967n;
import p293u2.C4240j;
import p293u2.C4242l;
import p308v1.AbstractC4374a1;
import p308v1.AbstractC4377b1;
import p308v1.InterfaceC4428t;
import p315v8.C4537q;

/* JADX INFO: renamed from: eb.s0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0893s0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2772g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f2773h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2774i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0893s0(long j3, Object obj, int i9) {
        this.f2772g = i9;
        this.f2773h = j3;
        this.f2774i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String strM8958g;
        int i9 = this.f2772g;
        C3967n c3967n = C3967n.f12976a;
        long j3 = this.f2773h;
        Object obj2 = this.f2774i;
        switch (i9) {
            case 0:
                return Boolean.valueOf(ScriptWaBridge.sendFavorite$lambda$0((String) obj2, j3, (C2105p) obj));
            case 1:
                C3857t c3857t = (C3857t) obj2;
                long jM8529c = C4240j.m8529c(((C4240j) ((C1739c) obj).m4360d()).f13912a, j3);
                int i10 = C3857t.f12631r;
                c3857t.m8032e(jM8529c);
                c3857t.f12634c.invoke();
                return c3967n;
            case 2:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) obj2;
                InterfaceC4428t interfaceC4428t = (InterfaceC4428t) obj;
                interfaceC4428t.getClass();
                long jMo8858F = interfaceC4428t.mo8858F();
                if (!C4242l.m8534a(j3, jMo8858F)) {
                    interfaceC1231l.invoke(new C4242l(jMo8858F));
                }
                return c3967n;
            case 3:
                C4537q c4537q = (C4537q) obj2;
                File file = (File) obj;
                boolean z9 = false;
                if (file.isFile()) {
                    String name = file.getName();
                    name.getClass();
                    if (!AbstractC3156t.m6740d0(name, "image_", false)) {
                        String name2 = file.getName();
                        name2.getClass();
                        if (AbstractC3156t.m6740d0(name2, "video_", false)) {
                            if (file.lastModified() <= j3 && (strM8958g = c4537q.m8958g(file)) != null && (!c4537q.f14975f.contains(strM8958g))) {
                                z9 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z9);
            default:
                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                abstractC4374a1.getClass();
                AbstractC4374a1.m8810C(abstractC4374a1, (AbstractC4377b1) obj2, j3);
                return c3967n;
        }
    }

    public /* synthetic */ C0893s0(Object obj, long j3, int i9) {
        this.f2772g = i9;
        this.f2774i = obj;
        this.f2773h = j3;
    }
}
