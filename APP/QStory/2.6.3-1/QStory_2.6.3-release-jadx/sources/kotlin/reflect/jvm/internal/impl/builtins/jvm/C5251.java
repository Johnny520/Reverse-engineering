package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.AbstractC3738;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5484;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import net.bytebuddy.pool.TypePool;
import p081.C7697;
import p095.AbstractC7818;
import p119.AbstractC8104;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5251 extends AbstractC8104 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f13362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f13363;

    public C5251(String str, Ref$ObjectRef ref$ObjectRef) {
        this.f13363 = str;
        this.f13362 = ref$ObjectRef;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    @Override // p119.AbstractC8104
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo9514(Object obj) {
        AbstractC7818 abstractC7818 = (AbstractC7818) obj;
        abstractC7818.getClass();
        String str = C5242.f13332;
        C5520 c5520M9504 = C5242.m9504(AbstractC5605.m10064(abstractC7818).f14041);
        String strM724 = AbstractC0900.m724(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, c5520M9504 != null ? C7697.m12647(c5520M9504) : AbstractC3738.m6867(abstractC7818, C5484.f13938), this.f13363);
        boolean zContains = C5246.f13351.contains(strM724);
        Ref$ObjectRef ref$ObjectRef = this.f13362;
        if (zContains) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.HIDDEN;
        } else if (C5246.f13349.contains(strM724)) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.VISIBLE;
        } else if (C5246.f13350.contains(strM724)) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.DEPRECATED_LIST_METHODS;
        } else if (C5246.f13352.contains(strM724)) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.DROP;
        }
        return ref$ObjectRef.element == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p119.AbstractC8104
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object mo9515() {
        JvmBuiltInsCustomizer$JDKMemberStatus jvmBuiltInsCustomizer$JDKMemberStatus = (JvmBuiltInsCustomizer$JDKMemberStatus) this.f13362.element;
        return jvmBuiltInsCustomizer$JDKMemberStatus == null ? JvmBuiltInsCustomizer$JDKMemberStatus.NOT_CONSIDERED : jvmBuiltInsCustomizer$JDKMemberStatus;
    }
}
