package p116hf;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p086ff.InterfaceC2440h;
import p376zd.C9987e;

/* JADX INFO: renamed from: hf.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3020c implements InterfaceC2440h {
    private static final long serialVersionUID = -2849567615646933777L;

    /* JADX INFO: renamed from: q */
    public final String f8018q;

    /* JADX INFO: renamed from: r */
    public final List f8019r = new CopyOnWriteArrayList();

    public C3020c(String str) {
        if (str != null) {
            this.f8018q = str;
        } else {
            C9987e.m38645a("A marker name cannot be null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m11176a() {
        return this.f8019r.size() > 0;
    }

    /* JADX INFO: renamed from: b */
    public Iterator m11177b() {
        return this.f8019r.iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof InterfaceC2440h)) {
            return this.f8018q.equals(((InterfaceC2440h) obj).getName());
        }
        return false;
    }

    @Override // p086ff.InterfaceC2440h
    public String getName() {
        return this.f8018q;
    }

    public int hashCode() {
        return this.f8018q.hashCode();
    }

    public String toString() {
        if (!m11176a()) {
            return getName();
        }
        Iterator itM11177b = m11177b();
        StringBuilder sb2 = new StringBuilder(getName());
        sb2.append(" [ ");
        while (itM11177b.hasNext()) {
            sb2.append(((InterfaceC2440h) itM11177b.next()).getName());
            if (itM11177b.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(" ]");
        return sb2.toString();
    }
}
