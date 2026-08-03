package p026N0;

import java.io.File;
import java.util.ArrayDeque;
import p007D0.C0137c;
import p009E0.AbstractC0171b;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: N0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0266g extends AbstractC0171b {

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f558c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0268i f559d;

    public C0266g(C0268i c0268i) {
        this.f559d = c0268i;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f558c = arrayDeque;
        if (((File) c0268i.f562b).isDirectory()) {
            arrayDeque.push(m689b((File) c0268i.f562b));
        } else {
            if (!((File) c0268i.f562b).isFile()) {
                this.f382a = 2;
                return;
            }
            File file = (File) c0268i.f562b;
            AbstractC0307g.m703e(file, "rootFile");
            arrayDeque.push(new C0264e(file));
        }
    }

    @Override // p009E0.AbstractC0171b
    /* JADX INFO: renamed from: a */
    public final void mo515a() {
        File file;
        File fileMo688a;
        while (true) {
            ArrayDeque arrayDeque = this.f558c;
            AbstractC0267h abstractC0267h = (AbstractC0267h) arrayDeque.peek();
            if (abstractC0267h == null) {
                file = null;
                break;
            }
            fileMo688a = abstractC0267h.mo688a();
            if (fileMo688a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo688a.equals(abstractC0267h.f560a) || !fileMo688a.isDirectory()) {
                    break;
                }
                int size = arrayDeque.size();
                this.f559d.getClass();
                if (size >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(m689b(fileMo688a));
                }
            }
        }
        file = fileMo688a;
        if (file == null) {
            this.f382a = 2;
        } else {
            this.f383b = file;
            this.f382a = 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0262c m689b(File file) {
        int iOrdinal = ((EnumC0269j) this.f559d.f563c).ordinal();
        if (iOrdinal == 0) {
            return new C0265f(this, file);
        }
        if (iOrdinal == 1) {
            return new C0263d(this, file);
        }
        throw new C0137c();
    }
}
