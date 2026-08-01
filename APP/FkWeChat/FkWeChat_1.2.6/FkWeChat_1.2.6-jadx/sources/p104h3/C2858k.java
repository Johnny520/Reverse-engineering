package p104h3;

import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p152k3.AbstractC3949c;

/* JADX INFO: renamed from: h3.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2858k {

    /* JADX INFO: renamed from: b */
    public static final a f7480b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final C2858k f7481c = new C2858k(0);

    /* JADX INFO: renamed from: d */
    public static final C2858k f7482d = new C2858k(1);

    /* JADX INFO: renamed from: e */
    public static final C2858k f7483e = new C2858k(2);

    /* JADX INFO: renamed from: a */
    public final int f7484a;

    public C2858k(int i10) {
        this.f7484a = i10;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10235d(C2858k c2858k) {
        int i10 = this.f7484a;
        return (c2858k.f7484a | i10) == i10;
    }

    /* JADX INFO: renamed from: e */
    public final int m10236e() {
        return this.f7484a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2858k) && this.f7484a == ((C2858k) obj).f7484a;
    }

    public int hashCode() {
        return this.f7484a;
    }

    public String toString() {
        if (this.f7484a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f7484a & f7482d.f7484a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f7484a & f7483e.f7484a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + AbstractC3949c.m15656d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }

    /* JADX INFO: renamed from: h3.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2858k m10237a(List list) {
            Integer numValueOf = 0;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                numValueOf = Integer.valueOf(numValueOf.intValue() | ((C2858k) list.get(i10)).m10236e());
            }
            return new C2858k(numValueOf.intValue());
        }

        /* JADX INFO: renamed from: b */
        public final C2858k m10238b() {
            return C2858k.f7483e;
        }

        /* JADX INFO: renamed from: c */
        public final C2858k m10239c() {
            return C2858k.f7481c;
        }

        /* JADX INFO: renamed from: d */
        public final C2858k m10240d() {
            return C2858k.f7482d;
        }

        public a() {
        }
    }
}
