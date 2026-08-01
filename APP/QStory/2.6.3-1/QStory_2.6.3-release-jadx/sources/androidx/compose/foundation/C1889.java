package androidx.compose.foundation;

import android.content.Context;
import androidx.activity.AbstractC0900;
import androidx.compose.foundation.layout.InterfaceC1505;
import androidx.compose.p001ui.graphics.C2434;
import kotlin.jvm.internal.AbstractC5227;
import p221.InterfaceC8725;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1889 implements InterfaceC1923 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC1505 f3443;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f3444;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC8725 f3445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f3446;

    public C1889(Context context, InterfaceC8725 interfaceC8725, long j, InterfaceC1505 interfaceC1505) {
        this.f3446 = context;
        this.f3445 = interfaceC8725;
        this.f3444 = j;
        this.f3443 = interfaceC1505;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1889.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C1889 c1889 = (C1889) obj;
        return AbstractC5227.m9466(this.f3446, c1889.f3446) && AbstractC5227.m9466(this.f3445, c1889.f3445) && C2434.m3509(this.f3444, c1889.f3444) && AbstractC5227.m9466(this.f3443, c1889.f3443);
    }

    public final int hashCode() {
        int iHashCode = (this.f3445.hashCode() + (this.f3446.hashCode() * 31)) * 31;
        int i = C2434.f5044;
        return this.f3443.hashCode() + AbstractC0900.m702(iHashCode, 31, this.f3444);
    }

    @Override // androidx.compose.foundation.InterfaceC1923
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1922 mo2512() {
        return new C1890(this.f3446, this.f3445, this.f3444, this.f3443);
    }
}
