package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import androidx.activity.AbstractC0053;
import io.ktor.client.plugins.AbstractC3932;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4651;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import net.bytebuddy.pool.TypePool;
import p065.C6867;
import p079.AbstractC6988;
import p103.AbstractC7274;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4418 extends AbstractC7274 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Ref$ObjectRef f13013;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ String f13014;

    public C4418(String str, Ref$ObjectRef ref$ObjectRef) {
        this.f13014 = str;
        this.f13013 = ref$ObjectRef;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r3v8, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$JDKMemberStatus] */
    @Override // p103.AbstractC7274
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean mo8965(Object obj) {
        AbstractC6988 abstractC6988 = (AbstractC6988) obj;
        abstractC6988.getClass();
        String str = C4409.f12983;
        C4687 c4687M8955 = C4409.m8955(AbstractC4772.m9515(abstractC6988).f13692);
        String strM163 = AbstractC0053.m163(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, c4687M8955 != null ? C6867.m12060(c4687M8955) : AbstractC3932.m8304(abstractC6988, C4651.f13589), this.f13014);
        boolean zContains = C4413.f13002.contains(strM163);
        Ref$ObjectRef ref$ObjectRef = this.f13013;
        if (zContains) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.HIDDEN;
        } else if (C4413.f13000.contains(strM163)) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.VISIBLE;
        } else if (C4413.f13001.contains(strM163)) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.DEPRECATED_LIST_METHODS;
        } else if (C4413.f13003.contains(strM163)) {
            ref$ObjectRef.element = JvmBuiltInsCustomizer$JDKMemberStatus.DROP;
        }
        return ref$ObjectRef.element == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.AbstractC7274
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object mo8966() {
        JvmBuiltInsCustomizer$JDKMemberStatus jvmBuiltInsCustomizer$JDKMemberStatus = (JvmBuiltInsCustomizer$JDKMemberStatus) this.f13013.element;
        return jvmBuiltInsCustomizer$JDKMemberStatus == null ? JvmBuiltInsCustomizer$JDKMemberStatus.NOT_CONSIDERED : jvmBuiltInsCustomizer$JDKMemberStatus;
    }
}
