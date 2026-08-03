package p257r7;

import p298u7.AbstractC4280c;

/* JADX INFO: renamed from: r7.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3732v extends C3722l {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractC3729s m7749a() {
        AbstractC4280c abstractC4280c = (AbstractC4280c) ((C3733w) this.f12092g).m5554v(AbstractC4280c.class);
        if (abstractC4280c != null) {
            return abstractC4280c.m8600V(get());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.C3722l
    public final String toString() {
        AbstractC3729s abstractC3729sM7749a = m7749a();
        String str = abstractC3729sM7749a != null ? abstractC3729sM7749a.f12101m : null;
        if (str != null) {
            return str;
        }
        return "NULL{" + get() + "}";
    }
}
