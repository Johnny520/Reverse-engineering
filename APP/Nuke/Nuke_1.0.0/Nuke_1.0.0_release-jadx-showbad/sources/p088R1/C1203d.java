package p088R1;

import com.bumptech.glide.load.data.InterfaceC1933c;
import java.io.File;
import java.util.List;
import p078P1.InterfaceC1144f;
import p107V1.C1517p;
import p107V1.InterfaceC1518q;

/* JADX INFO: renamed from: R1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1203d implements InterfaceC1206g, InterfaceC1933c {

    /* JADX INFO: renamed from: d */
    public final List f3949d;

    /* JADX INFO: renamed from: e */
    public final C1207h f3950e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1205f f3951f;

    /* JADX INFO: renamed from: g */
    public int f3952g = -1;

    /* JADX INFO: renamed from: h */
    public InterfaceC1144f f3953h;

    /* JADX INFO: renamed from: i */
    public List f3954i;

    /* JADX INFO: renamed from: j */
    public int f3955j;

    /* JADX INFO: renamed from: k */
    public volatile C1517p f3956k;

    /* JADX INFO: renamed from: l */
    public File f3957l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1203d(List list, C1207h c1207h, InterfaceC1205f interfaceC1205f) {
        this.f3949d = list;
        this.f3950e = c1207h;
        this.f3951f = interfaceC1205f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1206g
    /* JADX INFO: renamed from: b */
    public final boolean mo2257b() {
        while (true) {
            List list = this.f3954i;
            boolean z5 = false;
            if (list != null && this.f3955j < list.size()) {
                this.f3956k = null;
                while (!z5 && this.f3955j < this.f3954i.size()) {
                    List list2 = this.f3954i;
                    int i5 = this.f3955j;
                    this.f3955j = i5 + 1;
                    InterfaceC1518q interfaceC1518q = (InterfaceC1518q) list2.get(i5);
                    File file = this.f3957l;
                    C1207h c1207h = this.f3950e;
                    this.f3956k = interfaceC1518q.mo2774b(file, c1207h.f3964e, c1207h.f3965f, c1207h.f3968i);
                    if (this.f3956k != null && this.f3950e.m2268c(this.f3956k.f5271c.mo2222a()) != null) {
                        this.f3956k.f5271c.mo2225d(this.f3950e.f3974o, this);
                        z5 = true;
                    }
                }
                return z5;
            }
            int i6 = this.f3952g + 1;
            this.f3952g = i6;
            if (i6 >= this.f3949d.size()) {
                return false;
            }
            InterfaceC1144f interfaceC1144f = (InterfaceC1144f) this.f3949d.get(this.f3952g);
            C1207h c1207h2 = this.f3950e;
            File fileMo152c = c1207h2.f3967h.m2288a().mo152c(new C1204e(interfaceC1144f, c1207h2.f3973n));
            this.f3957l = fileMo152c;
            if (fileMo152c != null) {
                this.f3953h = interfaceC1144f;
                this.f3954i = this.f3950e.f3962c.m3586a().m3592f(fileMo152c);
                this.f3955j = 0;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p088R1.InterfaceC1206g
    public final void cancel() {
        C1517p c1517p = this.f3956k;
        if (c1517p != null) {
            c1517p.f5271c.cancel();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1933c
    /* JADX INFO: renamed from: e */
    public final void mo36e(Exception exc) {
        this.f3951f.mo2263a(this.f3953h, exc, this.f3956k.f5271c, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1933c
    /* JADX INFO: renamed from: l */
    public final void mo43l(Object obj) {
        this.f3951f.mo2264c(this.f3953h, obj, this.f3956k.f5271c, 3, this.f3953h);
    }
}
