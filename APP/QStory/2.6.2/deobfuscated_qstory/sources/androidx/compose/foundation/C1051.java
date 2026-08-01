package androidx.compose.foundation;

import android.content.Context;
import androidx.activity.AbstractC0053;
import androidx.compose.foundation.layout.InterfaceC0664;
import androidx.compose.ui.graphics.C1599;
import kotlin.jvm.internal.AbstractC4394;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1051 implements InterfaceC1085 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final InterfaceC0664 f3097;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f3098;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7895 f3099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Context f3100;

    public C1051(Context context, InterfaceC7895 interfaceC7895, long j, InterfaceC0664 interfaceC0664) {
        this.f3100 = context;
        this.f3099 = interfaceC7895;
        this.f3098 = j;
        this.f3097 = interfaceC0664;
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
        return AbstractC4394.m8917(this.f3100, c1051.f3100) && AbstractC4394.m8917(this.f3099, c1051.f3099) && C1599.m2939(this.f3098, c1051.f3098) && AbstractC4394.m8917(this.f3097, c1051.f3097);
    }

    public final int hashCode() {
        int iHashCode = (this.f3099.hashCode() + (this.f3100.hashCode() * 31)) * 31;
        int i = C1599.f4698;
        return this.f3097.hashCode() + AbstractC0053.m141(iHashCode, 31, this.f3098);
    }

    @Override // androidx.compose.foundation.InterfaceC1085
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC1084 mo1942() {
        return new C1052(this.f3100, this.f3099, this.f3098, this.f3097);
    }
}
