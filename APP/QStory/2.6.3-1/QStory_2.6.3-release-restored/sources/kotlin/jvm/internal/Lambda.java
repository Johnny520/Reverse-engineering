package kotlin.jvm.internal;

import java.io.Serializable;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m151d2 = {"Lkotlin/jvm/internal/Lambda;", "R", "Lkotlin/jvm/internal/飘花落叶言子楪世兰苏哲;", "Ljava/io/Serializable;", "", "arity", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(I)V", "", "toString", "()Ljava/lang/String;", "I", "getArity", "()I", "kotlin-stdlib"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 48)
public abstract class Lambda<R> implements InterfaceC5215, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override // kotlin.jvm.internal.InterfaceC5215
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strMo9484 = AbstractC5228.f13320.mo9484(this);
        strMo9484.getClass();
        return strMo9484;
    }
}
