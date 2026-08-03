package p001;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۟.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0135a0 {

    /* JADX INFO: renamed from: ۥ */
    public final Integer f672;

    /* JADX INFO: renamed from: ۥ۟ */
    public final List<String> f673;

    public C0135a0(Integer num, ArrayList arrayList) {
        this.f672 = num;
        this.f673 = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0135a0)) {
            return false;
        }
        C0135a0 c0135a0 = (C0135a0) obj;
        return C0237h4.m864(this.f672, c0135a0.f672) && C0237h4.m864(this.f673, c0135a0.f673);
    }

    public final int hashCode() {
        Integer num = this.f672;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<String> list = this.f673;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return super.toString();
    }
}
