package p050c0;

import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: c0.t1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0697t1 extends AbstractC0358S {

    /* JADX INFO: renamed from: z */
    public final String f2198z;

    public C0697t1(String str) {
        AbstractC0307g.m703e(str, "content");
        this.f2198z = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0697t1) && AbstractC0307g.m699a(this.f2198z, ((C0697t1) obj).f2198z);
    }

    public final int hashCode() {
        return this.f2198z.hashCode();
    }

    public final String toString() {
        return "KeepRevokeNotice(content=" + this.f2198z + ")";
    }
}
