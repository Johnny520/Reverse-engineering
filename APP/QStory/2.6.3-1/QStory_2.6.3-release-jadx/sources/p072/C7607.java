package p072;

import kotlin.jvm.internal.AbstractC5227;
import p103.AbstractC7973;
import p105.InterfaceC8010;

/* JADX INFO: renamed from: 飘花落叶言世子楪兰苏哲.飘花落叶言楪兰苏子哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C7607 {
    public static final C7606 Companion = new C7606();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Boolean f18559;

    public /* synthetic */ C7607(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.f18559 = bool;
        } else {
            AbstractC7973.m12979(i, 1, C7585.f18534.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7607) && AbstractC5227.m9466(this.f18559, ((C7607) obj).f18559);
    }

    public final int hashCode() {
        Boolean bool = this.f18559;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Prompts(listChanged=" + this.f18559 + ')';
    }

    public C7607() {
        this.f18559 = null;
    }
}
