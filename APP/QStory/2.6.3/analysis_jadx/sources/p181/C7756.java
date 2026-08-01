package p181;

import kotlin.jvm.internal.AbstractC4395;

/* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7756 extends AbstractC7760 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7756)) {
            return false;
        }
        C7756 c7756 = (C7756) obj;
        return AbstractC4395.m8907(this.f21049, c7756.f21049) && AbstractC4395.m8907(this.f21048, c7756.f21048) && AbstractC4395.m8907(this.f21047, c7756.f21047) && AbstractC4395.m8907(this.f21046, c7756.f21046);
    }

    public final int hashCode() {
        return this.f21046.hashCode() + ((this.f21047.hashCode() + ((this.f21048.hashCode() + (this.f21049.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f21049 + ", topEnd = " + this.f21048 + ", bottomEnd = " + this.f21047 + ", bottomStart = " + this.f21046 + ')';
    }
}
