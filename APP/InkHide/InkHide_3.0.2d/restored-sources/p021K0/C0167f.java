package p021K0;

import java.io.File;
import java.util.ArrayDeque;
import p009E0.C0102b;
import p011F0.AbstractC0114b;
import p011F0.EnumC0136x;

/* JADX INFO: renamed from: K0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0167f extends AbstractC0114b {

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f485c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0169h f486d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0167f(C0169h c0169h) {
        this.f486d = c0169h;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f485c = arrayDeque;
        boolean zIsDirectory = ((File) c0169h.f489b).isDirectory();
        File file = (File) c0169h.f489b;
        if (zIsDirectory) {
            arrayDeque.push(m342b(file));
        } else if (file.isFile()) {
            arrayDeque.push(new C0165d(file));
        } else {
            this.f410a = EnumC0136x.f431c;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p011F0.AbstractC0114b
    /* JADX INFO: renamed from: a */
    public final void mo249a() {
        File file;
        File fileMo341a;
        while (true) {
            ArrayDeque arrayDeque = this.f485c;
            AbstractC0168g abstractC0168g = (AbstractC0168g) arrayDeque.peek();
            if (abstractC0168g == null) {
                file = null;
                break;
            }
            fileMo341a = abstractC0168g.mo341a();
            if (fileMo341a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo341a.equals(abstractC0168g.f487a) || !fileMo341a.isDirectory()) {
                    break;
                }
                int size = arrayDeque.size();
                this.f486d.getClass();
                if (size >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(m342b(fileMo341a));
                }
            }
        }
        file = fileMo341a;
        if (file == null) {
            this.f410a = EnumC0136x.f431c;
        } else {
            this.f411b = file;
            this.f410a = EnumC0136x.f429a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC0163b m342b(File file) {
        int iOrdinal = ((EnumC0170i) this.f486d.f490c).ordinal();
        if (iOrdinal == 0) {
            return new C0166e(this, file);
        }
        if (iOrdinal == 1) {
            return new C0164c(this, file);
        }
        throw new C0102b();
    }
}
