package p282t7;

import java.util.List;
import java.util.Map;
import java.util.Set;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p185m8.AbstractC5065a1;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: t7.b0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8177b0 implements InterfaceC8197u {

    /* JADX INFO: renamed from: c */
    public final boolean f27478c;

    /* JADX INFO: renamed from: d */
    public final String f27479d;

    /* JADX INFO: renamed from: e */
    public final List f27480e;

    /* JADX INFO: renamed from: t7.b0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Map.Entry, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final String f27481q;

        /* JADX INFO: renamed from: r */
        public final List f27482r;

        public a(AbstractC8177b0 abstractC8177b0) {
            this.f27481q = abstractC8177b0.m31838f();
            this.f27482r = abstractC8177b0.m31839g();
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            return this.f27481q;
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List getValue() {
            return this.f27482r;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC1061t.m3842c(entry.getKey(), getKey()) && AbstractC1061t.m3842c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return getKey() + '=' + getValue();
        }
    }

    public AbstractC8177b0(boolean z10, String str, List list) {
        str.getClass();
        list.getClass();
        this.f27478c = z10;
        this.f27479d = str;
        this.f27480e = list;
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: a */
    public Set mo7356a() {
        return AbstractC5065a1.m20479d(new a(this));
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: b */
    public boolean mo7357b() {
        return this.f27478c;
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: c */
    public void mo7358c(InterfaceC0188p interfaceC0188p) {
        interfaceC0188p.getClass();
        interfaceC0188p.invoke(this.f27479d, this.f27480e);
    }

    @Override // p282t7.InterfaceC8197u
    /* JADX INFO: renamed from: d */
    public List mo7359d(String str) {
        str.getClass();
        if (AbstractC8611a0.m33061F(this.f27479d, str, mo7357b())) {
            return this.f27480e;
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC8197u)) {
            return false;
        }
        InterfaceC8197u interfaceC8197u = (InterfaceC8197u) obj;
        if (mo7357b() != interfaceC8197u.mo7357b()) {
            return false;
        }
        return AbstractC8175a0.m31828c(mo7356a(), interfaceC8197u.mo7356a());
    }

    /* JADX INFO: renamed from: f */
    public final String m31838f() {
        return this.f27479d;
    }

    /* JADX INFO: renamed from: g */
    public final List m31839g() {
        return this.f27480e;
    }

    public int hashCode() {
        return AbstractC8175a0.m31829d(mo7356a(), Boolean.hashCode(mo7357b()) * 31);
    }

    @Override // p282t7.InterfaceC8197u
    public boolean isEmpty() {
        return false;
    }

    @Override // p282t7.InterfaceC8197u
    public Set names() {
        return AbstractC5065a1.m20479d(this.f27479d);
    }
}
