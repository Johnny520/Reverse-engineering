package p000a;

import java.util.ArrayList;
import p000a.C0314R6;

/* JADX INFO: renamed from: a.Q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0297Q6 implements InterfaceC0294Q3<C0314R6.a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f1090a;

    /* JADX DEBUG: Incorrect args count in method signature: ()V */
    public C0297Q6(String str) {
        this.f1090a = str;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // p000a.InterfaceC0294Q3
    /* JADX INFO: renamed from: a */
    public final void mo747a(C0314R6.a aVar) {
        C0314R6.a aVar2 = aVar;
        synchronized (C0314R6.f1125c) {
            try {
                C0598ge<String, ArrayList<InterfaceC0294Q3<C0314R6.a>>> c0598ge = C0314R6.f1126d;
                ArrayList<InterfaceC0294Q3<C0314R6.a>> orDefault = c0598ge.getOrDefault(this.f1090a, null);
                if (orDefault == null) {
                    return;
                }
                c0598ge.remove(this.f1090a);
                for (int i = 0; i < orDefault.size(); i++) {
                    orDefault.get(i).mo747a(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
