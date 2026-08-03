package p023b8;

import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: b8.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0209g implements Comparable {

    /* JADX INFO: renamed from: g */
    public final int f514g;

    /* JADX INFO: renamed from: h */
    public final char f515h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC0204b f516i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0209g(int i9, char c10, InterfaceC0204b interfaceC0204b) {
        this.f514g = i9;
        this.f515h = c10;
        this.f516i = interfaceC0204b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0209g c0209g = (C0209g) obj;
        if (c0209g == this) {
            return 0;
        }
        int i9 = c0209g.f514g;
        int i10 = this.f514g;
        int iM10739b = AbstractC5999a.m10739b(i10, i9);
        if (i10 != 2 && i9 != 2) {
            int iM10739b2 = AbstractC5999a.m10739b(this.f516i.mo868b(), c0209g.f516i.mo868b());
            if (i10 == 0) {
                if (i9 == 3) {
                    return 1;
                }
                return iM10739b2;
            }
            if (i9 == 0) {
                if (i10 == 3) {
                    return 1;
                }
                return iM10739b2;
            }
            if (iM10739b2 != 0) {
                return (iM10739b == 0 && i10 == 3) ? -iM10739b2 : iM10739b2;
            }
        }
        return iM10739b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        int i9 = this.f514g;
        if (i9 == 2) {
            return String.valueOf(this.f515h);
        }
        InterfaceC0204b interfaceC0204b = this.f516i;
        if (i9 == 1) {
            return "<" + interfaceC0204b.getTagName() + ">";
        }
        if (i9 == 0) {
            return "<" + interfaceC0204b.getTagName() + "/>";
        }
        return "</" + interfaceC0204b.getTagName() + ">";
    }
}
