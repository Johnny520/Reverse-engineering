package kotlin.reflect.jvm.internal;

import kotlin.reflect.C5917;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5911 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f14974;

    public C5911(boolean z) {
        this.f14974 = z;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        C5917 c5917 = (C5917) obj;
        c5917.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14974 ? "(raw) " : "");
        sb.append(c5917);
        return sb.toString();
    }
}
