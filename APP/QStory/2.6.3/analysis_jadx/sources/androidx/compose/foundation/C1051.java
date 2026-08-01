package androidx.compose.foundation;

import android.content.Context;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.layout.InterfaceC0664;
import androidx.compose.ui.graphics.C1599;
import kotlin.jvm.internal.AbstractC4395;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1051 implements InterfaceC1085 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC0664 f3098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f3099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7896 f3100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f3101;

    public C1051(Context context, InterfaceC7896 interfaceC7896, long j, InterfaceC0664 interfaceC0664) {
        this.f3101 = context;
        this.f3100 = interfaceC7896;
        this.f3099 = j;
        this.f3098 = interfaceC0664;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C1051.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C1051 c1051 = (C1051) obj;
        return AbstractC4395.m8907(this.f3101, c1051.f3101) && AbstractC4395.m8907(this.f3100, c1051.f3100) && C1599.m2949(this.f3099, c1051.f3099) && AbstractC4395.m8907(this.f3098, c1051.f3098);
    }

    public final int hashCode() {
        int iHashCode = (this.f3100.hashCode() + (this.f3101.hashCode() * 31)) * 31;
        int i = C1599.f4699;
        return this.f3098.hashCode() + AbstractC0053.m142(iHashCode, 31, this.f3099);
    }

    @Override // androidx.compose.foundation.InterfaceC1085
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1084 mo1952() {
        return new C1052(this.f3101, this.f3100, this.f3099, this.f3098);
    }
}
