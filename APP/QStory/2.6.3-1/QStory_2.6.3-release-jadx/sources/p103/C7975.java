package p103;

import androidx.activity.compose.C0851;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlinx.serialization.SerializationException;
import p025.AbstractC7012;
import p072.InterfaceC7411;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8018;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7975 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6016 f19452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f19453;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f19454;

    public C7975(String str, Object obj) {
        obj.getClass();
        this.f19454 = obj;
        this.f19453 = EmptyList.INSTANCE;
        this.f19452 = AbstractC6019.m10774(LazyThreadSafetyMode.PUBLICATION, new C0851(str, 17, this));
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        InterfaceC8020 descriptor = getDescriptor();
        InterfaceC8018 interfaceC8018Mo11235 = interfaceC8016.mo11235(descriptor);
        interfaceC8018Mo11235.getClass();
        int iMo11277 = interfaceC8018Mo11235.mo11277(getDescriptor());
        if (iMo11277 != -1) {
            throw new SerializationException(AbstractC7012.m12147(iMo11277, "Unexpected index "));
        }
        interfaceC8018Mo11235.mo11237(descriptor);
        return this.f19454;
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return (InterfaceC8020) this.f19452.getValue();
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        obj.getClass();
        interfaceC8015.mo11269(getDescriptor()).mo11270(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7975(String str, InterfaceC7411 interfaceC7411, Annotation[] annotationArr) {
        this(str, interfaceC7411);
        interfaceC7411.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.f19453 = listAsList;
    }
}
