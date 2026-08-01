package kotlin.reflect.jvm.internal;

import kotlin.reflect.C5084;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5078 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f14629;

    public C5078(boolean z) {
        this.f14629 = z;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        C5084 c5084 = (C5084) obj;
        c5084.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14629 ? "(raw) " : "");
        sb.append(c5084);
        return sb.toString();
    }
}
