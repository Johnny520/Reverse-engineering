package androidx.emoji2.text;

import java.util.ArrayList;
import p006D.AbstractC0079h;
import p012G.C0140d;
import p014H.C0142a;

/* JADX INFO: renamed from: androidx.emoji2.text.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0391f extends AbstractC0079h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0392g f1167d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0391f(C0392g c0392g) {
        this.f1167d = c0392g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: F */
    public final void mo200F(Throwable th) {
        this.f1167d.f1168a.m764d(th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p006D.AbstractC0079h
    /* JADX INFO: renamed from: I */
    public final void mo203I(C0404s c0404s) {
        C0392g c0392g = this.f1167d;
        c0392g.f1170c = c0404s;
        C0404s c0404s2 = c0392g.f1170c;
        new C0140d(18);
        C0390e c0390e = c0392g.f1168a.f1182h;
        C0142a c0142a = new C0142a();
        c0142a.f443b = c0404s2;
        c0142a.f444c = c0390e;
        c0392g.f1169b = c0142a;
        C0396k c0396k = c0392g.f1168a;
        c0396k.getClass();
        ArrayList arrayList = new ArrayList();
        c0396k.f1175a.writeLock().lock();
        try {
            c0396k.f1177c = 1;
            arrayList.addAll(c0396k.f1176b);
            c0396k.f1176b.clear();
            c0396k.f1175a.writeLock().unlock();
            c0396k.f1178d.post(new RunnableC0394i(arrayList, c0396k.f1177c, null));
        } catch (Throwable th) {
            c0396k.f1175a.writeLock().unlock();
            throw th;
        }
    }
}
