package p105;

import androidx.compose.foundation.C1868;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlinx.serialization.SerializationException;
import lin.xposed.hook.javaplugin.C6385;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世苏兰子楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8011 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f19512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final EmptyList f19513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC5925 f19514;

    public C8011(InterfaceC5925 interfaceC5925) {
        interfaceC5925.getClass();
        this.f19514 = interfaceC5925;
        this.f19513 = EmptyList.INSTANCE;
        this.f19512 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C1868(this, 28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.String] */
    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 descriptor = getDescriptor();
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        interfaceC8018Mo11235.getClass();
        Object objMo11233 = null;
        while (true) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(getDescriptor());
            if (iMo11277 == -1) {
                if (objMo11233 != null) {
                    interfaceC8018Mo11235.mo11237(descriptor);
                    return objMo11233;
                }
                C6385.m11431((String) ref$ObjectRef.element, "Polymorphic value has not been read for class ");
                return null;
            }
            if (iMo11277 != 0) {
                T t = ref$ObjectRef.element;
                if (iMo11277 != 1) {
                    StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) t;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb.append(str);
                    sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb.append(iMo11277);
                    throw new SerializationException(sb.toString());
                }
                if (t == 0) {
                    C6755.m11869("Cannot read polymorphic value before its type token");
                    return null;
                }
                ref$ObjectRef.element = t;
                objMo11233 = interfaceC8018Mo11235.mo11233(getDescriptor(), iMo11277, AbstractC5894.m10604(this, interfaceC8018Mo11235, (String) t), null);
            } else {
                ref$ObjectRef.element = interfaceC8018Mo11235.mo11245(getDescriptor(), iMo11277);
            }
        }
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return (InterfaceC8020) this.f19512.getValue();
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        obj.getClass();
        InterfaceC8013 interfaceC8013M10603 = AbstractC5894.m10603(this, interfaceC8015, obj);
        InterfaceC8020 descriptor = getDescriptor();
        InterfaceC8017 interfaceC8017Mo11269 = interfaceC8015.mo11269(descriptor);
        interfaceC8017Mo11269.mo11294(getDescriptor(), 0, interfaceC8013M10603.getDescriptor().mo12941());
        interfaceC8017Mo11269.mo11278(getDescriptor(), 1, interfaceC8013M10603, obj);
        interfaceC8017Mo11269.mo11270(descriptor);
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f19514 + ')';
    }
}
