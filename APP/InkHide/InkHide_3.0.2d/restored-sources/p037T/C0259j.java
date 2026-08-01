package p037T;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p051b0.C0493b;
import p051b0.C0494c;

/* JADX INFO: renamed from: T.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0259j extends AbstractC0274y {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC0274y f610b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0259j(AbstractC0274y abstractC0274y, int i2) {
        this.f609a = i2;
        this.f610b = abstractC0274y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: a */
    public final Object mo476a(C0493b c0493b) {
        switch (this.f609a) {
            case 0:
                return new AtomicLong(((Number) this.f610b.mo476a(c0493b)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                c0493b.mo571a();
                while (c0493b.mo577k()) {
                    arrayList.add(Long.valueOf(((Number) this.f610b.mo476a(c0493b)).longValue()));
                }
                c0493b.mo573e();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                if (c0493b.mo585x() != 9) {
                    return this.f610b.mo476a(c0493b);
                }
                c0493b.mo583t();
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0274y
    /* JADX INFO: renamed from: b */
    public final void mo477b(C0494c c0494c, Object obj) throws IOException {
        switch (this.f609a) {
            case 0:
                this.f610b.mo477b(c0494c, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                c0494c.mo586b();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    this.f610b.mo477b(c0494c, Long.valueOf(atomicLongArray.get(i2)));
                }
                c0494c.mo588e();
                break;
            default:
                if (obj == null) {
                    c0494c.mo591i();
                } else {
                    this.f610b.mo477b(c0494c, obj);
                }
                break;
        }
    }
}
