package p314v7;

import p152k7.AbstractC2331a;
import p166l7.InterfaceC2519g;
import p257r7.AbstractC3729s;
import p298u7.AbstractC4280c;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: v7.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4494f extends AbstractC4501i0 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: k7.a */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: k7.a */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: k7.a */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        AbstractC3729s abstractC3729sM8600V;
        AbstractC4280c abstractC4280cMo5916a;
        if (this.f7659i) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        byte[] bArr = this.f12076k;
        int length = bArr.length;
        int iM5541w = bArr.length < 2 ? 0 : AbstractC2331a.m5541w(bArr, 0) & 65535;
        if (length != 16) {
            sb2.append("size=");
            sb2.append(length);
        }
        if (length != iM5541w) {
            sb2.append(", readSize=");
            sb2.append(iM5541w);
        }
        if (AbstractC2331a.m5538q(this.f12076k, 2, 0)) {
            sb2.append(" complex");
        }
        if (AbstractC2331a.m5538q(this.f12076k, 2, 1)) {
            sb2.append(", public");
        }
        if (AbstractC2331a.m5538q(this.f12076k, 2, 2)) {
            sb2.append(", weak");
        }
        int iM8934N = m8934N();
        if (iM8934N < 0) {
            abstractC3729sM8600V = null;
        } else {
            AbstractC2331a abstractC2331a = this.f7658h;
            while (true) {
                if (abstractC2331a == 0) {
                    abstractC4280cMo5916a = null;
                    break;
                }
                if (abstractC2331a instanceof InterfaceC2519g) {
                    abstractC4280cMo5916a = ((InterfaceC2519g) abstractC2331a).mo5916a();
                    break;
                }
                abstractC2331a = abstractC2331a.f7658h;
            }
            if (abstractC4280cMo5916a != null) {
                abstractC3729sM8600V = abstractC4280cMo5916a.m8600V(iM8934N);
            }
        }
        String str = abstractC3729sM8600V != null ? abstractC3729sM8600V.f12101m : null;
        if (str != null) {
            sb2.append(", name=");
            sb2.append(str);
        } else {
            sb2.append(", key=");
            sb2.append(m8934N());
        }
        if (AbstractC2331a.m5539s(this.f12076k, 8) != 0) {
            sb2.append(", parentId=");
            sb2.append(AbstractC5999a.m10748k(AbstractC2331a.m5539s(this.f12076k, 8), 8));
        }
        sb2.append(", count=");
        sb2.append(AbstractC2331a.m5539s(this.f12076k, 12));
        return sb2.toString();
    }
}
