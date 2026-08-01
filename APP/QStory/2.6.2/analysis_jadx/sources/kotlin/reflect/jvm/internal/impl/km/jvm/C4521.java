package kotlin.reflect.jvm.internal.impl.km.jvm;

import androidx.profileinstaller.C2444;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4507;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import p015.C6230;
import p067.C6884;
import p067.C6892;
import p070.C6905;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4521 extends AbstractC7738 {
    public C4521(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        strArrD1 = strArrD1.length == 0 ? null : strArrD1;
        if (strArrD1 != null) {
            Pair pairM12145 = C6892.m12145(strArrD1, metadata.d2());
            C6884 c6884 = (C6884) pairM12145.component1();
            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) pairM12145.component2();
            boolean z = new C4516(metadata.mv()).compareTo(new C4516(1, 4, 0)) < 0;
            protoBuf$Function.getClass();
            c6884.getClass();
            ProtoBuf$TypeTable typeTable = protoBuf$Function.getTypeTable();
            typeTable.getClass();
            AbstractC4507.m9112(protoBuf$Function, new C2444(c6884, new C6230(typeTable), C6905.f18426, z, (List) null, 48));
        }
        new C4516(metadata.mv());
        metadata.xi();
    }
}
