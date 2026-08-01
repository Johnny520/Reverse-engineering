package p234q0;

import okhttp3.internal.url._UrlKt;
import p121i3.C3179i;
import p203o0.C5618b;
import p265s1.AbstractC7105l3;
import p265s1.AbstractC7110m3;
import p265s1.C7100k3;
import p265s1.C7128q1;
import p350y1.AbstractC9527o;
import p350y1.C9516d;
import p350y1.C9518f;

/* JADX INFO: renamed from: q0.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6152o {

    /* JADX INFO: renamed from: a */
    public static C9516d f19195a;

    /* JADX INFO: renamed from: a */
    public static final C9516d m24305a(C5618b c5618b) {
        C9516d c9516d = f19195a;
        if (c9516d != null) {
            c9516d.getClass();
            return c9516d;
        }
        C9516d.a aVar = new C9516d.a("Rounded.Bedtime", C3179i.m12003k(24.0f), C3179i.m12003k(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int iM37279a = AbstractC9527o.m37279a();
        C7100k3 c7100k3 = new C7100k3(C7128q1.f23644b.m28140a(), null);
        int iM27996a = AbstractC7105l3.f23607a.m27996a();
        int iM28009a = AbstractC7110m3.f23617a.m28009a();
        C9518f c9518f = new C9518f();
        c9518f.m37154j(11.65f, 3.46f);
        c9518f.m37148d(0.27f, -0.71f, -0.36f, -1.45f, -1.12f, -1.34f);
        c9518f.m37148d(-5.52f, 0.8f, -9.47f, 6.07f, -8.34f, 11.88f);
        c9518f.m37148d(0.78f, 4.02f, 4.09f, 7.21f, 8.14f, 7.87f);
        c9518f.m37148d(3.74f, 0.61f, 7.16f, -0.87f, 9.32f, -3.44f);
        c9518f.m37148d(0.48f, -0.57f, 0.19f, -1.48f, -0.55f, -1.62f);
        c9518f.m37147c(13.08f, 15.66f, 9.42f, 9.27f, 11.65f, 3.46f);
        c9518f.m37146b();
        C9516d c9516dM37124f = aVar.m37122c(c9518f.m37149e(), (14336 & 2) != 0 ? AbstractC9527o.m37279a() : iM37279a, (14336 & 4) != 0 ? _UrlKt.FRAGMENT_ENCODE_SET : _UrlKt.FRAGMENT_ENCODE_SET, (14336 & 8) != 0 ? null : c7100k3, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & 256) != 0 ? AbstractC9527o.m37280b() : iM27996a, (14336 & 512) != 0 ? AbstractC9527o.m37281c() : iM28009a, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & 2048) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).m37124f();
        f19195a = c9516dM37124f;
        c9516dM37124f.getClass();
        return c9516dM37124f;
    }
}
