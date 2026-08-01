package p080f9;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: f9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2356c extends AbstractC2354a implements InterfaceC2360g {

    /* JADX INFO: renamed from: u */
    public static final a f6483u = new a(null);

    /* JADX INFO: renamed from: v */
    public static final C2356c f6484v = new C2356c(1, 0);

    public C2356c(char c10, char c11) {
        super(c10, c11, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2356c)) {
            return false;
        }
        if (isEmpty() && ((C2356c) obj).isEmpty()) {
            return true;
        }
        C2356c c2356c = (C2356c) obj;
        return m8548o() == c2356c.m8548o() && m8549p() == c2356c.m8549p();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m8548o() * 31) + m8549p();
    }

    public boolean isEmpty() {
        return AbstractC1061t.m3843d(m8548o(), m8549p()) > 0;
    }

    public String toString() {
        return m8548o() + ".." + m8549p();
    }

    /* JADX INFO: renamed from: f9.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
