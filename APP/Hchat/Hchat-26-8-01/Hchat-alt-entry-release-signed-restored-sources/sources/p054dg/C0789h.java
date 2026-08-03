package p054dg;

import java.io.File;
import java.util.ArrayDeque;
import okio.C3193a;
import tf.AbstractC4151b;

/* JADX INFO: renamed from: dg.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0789h extends AbstractC4151b {

    /* JADX INFO: renamed from: i */
    public final ArrayDeque f2368i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0791j f2369j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0789h(C0791j c0791j) {
        this.f2369j = c0791j;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f2368i = arrayDeque;
        File file = (File) c0791j.f2373c;
        if (file.isDirectory()) {
            arrayDeque.push(m2019c(file));
        } else if (!file.isFile()) {
            this.f13681g = 2;
        } else {
            file.getClass();
            arrayDeque.push(new C0787f(file));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4151b
    /* JADX INFO: renamed from: a */
    public final void mo2018a() {
        File file;
        File fileMo2017a;
        while (true) {
            ArrayDeque arrayDeque = this.f2368i;
            AbstractC0790i abstractC0790i = (AbstractC0790i) arrayDeque.peek();
            if (abstractC0790i == null) {
                file = null;
                break;
            }
            fileMo2017a = abstractC0790i.mo2017a();
            if (fileMo2017a == null) {
                arrayDeque.pop();
            } else if (fileMo2017a.equals(abstractC0790i.f2370a) || !fileMo2017a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(m2019c(fileMo2017a));
            }
        }
        file = fileMo2017a;
        if (file == null) {
            this.f13681g = 2;
        } else {
            this.f13682h = file;
            this.f13681g = 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final AbstractC0785d m2019c(File file) {
        int iOrdinal = ((EnumC0792k) this.f2369j.f2374d).ordinal();
        if (iOrdinal == 0) {
            return new C0788g(this, file);
        }
        if (iOrdinal == 1) {
            return new C0786e(this, file);
        }
        C3193a.m6822k();
        return null;
    }
}
