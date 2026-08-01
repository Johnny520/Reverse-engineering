package kotlin.reflect.jvm.internal;

import kotlin.reflect.C5085;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5079 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f14629;

    public C5079(boolean z) {
        this.f14629 = z;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        C5085 c5085 = (C5085) obj;
        c5085.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f14629 ? "(raw) " : "");
        sb.append(c5085);
        return sb.toString();
    }
}
