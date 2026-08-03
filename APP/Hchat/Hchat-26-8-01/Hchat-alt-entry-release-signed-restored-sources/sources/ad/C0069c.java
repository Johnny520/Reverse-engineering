package ad;

import java.util.EnumSet;
import java.util.Set;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nf.InterfaceC2999a;
import p262rf.C3801a;
import p262rf.C3803c;
import p262rf.InterfaceC3802b;
import p382zc.EnumC6135a;

/* JADX INFO: renamed from: ad.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0069c implements InterfaceC3802b {

    /* JADX INFO: renamed from: c */
    public static final InterfaceC2844b f224c = AbstractC2846d.m6274b(C0069c.class);

    /* JADX INFO: renamed from: a */
    public final Set f225a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3802b f226b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0069c(EnumSet enumSet) {
        this.f225a = enumSet;
        this.f226b = enumSet.contains(EnumC6135a.f24718i) ? new C3803c() : C3801a.f12486a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p262rf.InterfaceC3802b
    /* JADX INFO: renamed from: a */
    public final boolean mo437a(InterfaceC2999a interfaceC2999a) {
        return this.f226b.mo437a(interfaceC2999a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p262rf.InterfaceC3802b
    /* JADX INFO: renamed from: b */
    public final int mo438b() {
        return this.f226b.mo438b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p262rf.InterfaceC3802b
    /* JADX INFO: renamed from: c */
    public final boolean mo439c(String str) {
        return this.f226b.mo439c(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p262rf.InterfaceC3802b
    /* JADX INFO: renamed from: d */
    public final boolean mo440d() {
        return this.f226b.mo440d();
    }
}
