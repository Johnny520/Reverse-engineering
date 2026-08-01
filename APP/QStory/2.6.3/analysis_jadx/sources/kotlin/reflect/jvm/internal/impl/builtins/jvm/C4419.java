package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.AbstractC2905;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4652;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import net.bytebuddy.pool.TypePool;
import p065.C6868;
import p079.AbstractC6989;
import p103.AbstractC7275;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4419 extends AbstractC7275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f13017;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f13018;

    public C4419(String str, Ref$ObjectRef ref$ObjectRef) {
        this.f13018 = str;
        this.f13017 = ref$ObjectRef;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    @Override // p103.AbstractC7275
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo8955(Object obj) {
        AbstractC6989 abstractC6989 = (AbstractC6989) obj;
        abstractC6989.getClass();
        String str = C4410.f12987;
        C4688 c4688M8945 = C4410.m8945(AbstractC4773.m9505(abstractC6989).f13696);
        String strM164 = AbstractC0053.m164(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, c4688M8945 != null ? C6868.m12088(c4688M8945) : AbstractC2905.m6307(abstractC6989, C4652.f13593), this.f13018);
        boolean zContains = C4414.f13006.contains(strM164);
        Ref$ObjectRef ref$ObjectRef = this.f13017;
        if (zContains) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.HIDDEN;
        } else if (C4414.f13004.contains(strM164)) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.VISIBLE;
        } else if (C4414.f13005.contains(strM164)) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.DEPRECATED_LIST_METHODS;
        } else if (C4414.f13007.contains(strM164)) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.DROP;
        }
        return ref$ObjectRef.element == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.AbstractC7275
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object mo8956() {
        JvmBuiltInsCustomizer$JDKMemberStatus jvmBuiltInsCustomizer$JDKMemberStatus = (JvmBuiltInsCustomizer$JDKMemberStatus) this.f13017.element;
        return jvmBuiltInsCustomizer$JDKMemberStatus == null ? JvmBuiltInsCustomizer$JDKMemberStatus.NOT_CONSIDERED : jvmBuiltInsCustomizer$JDKMemberStatus;
    }
}
