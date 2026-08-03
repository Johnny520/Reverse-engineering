package p379z7;

import bsh.C0353j;
import java.util.Iterator;

/* JADX INFO: renamed from: z7.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6116l implements Iterator {

    /* JADX INFO: renamed from: g */
    public final InterfaceC6123s f24672g;

    /* JADX INFO: renamed from: h */
    public int f24673h;

    /* JADX INFO: renamed from: i */
    public Object f24674i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6116l(InterfaceC6123s interfaceC6123s) {
        this.f24672g = interfaceC6123s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m10879a() {
        if (this.f24674i == null) {
            while (true) {
                int i9 = this.f24673h;
                InterfaceC6123s interfaceC6123s = this.f24672g;
                if (i9 >= interfaceC6123s.size()) {
                    break;
                }
                Object obj = interfaceC6123s.get(this.f24673h);
                this.f24673h++;
                if (obj != null) {
                    this.f24674i = obj;
                    break;
                }
            }
        }
        return this.f24674i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return m10879a() != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        Object objM10879a = m10879a();
        if (objM10879a != null) {
            this.f24674i = null;
            return objM10879a;
        }
        C0353j.m1307e();
        return null;
    }
}
