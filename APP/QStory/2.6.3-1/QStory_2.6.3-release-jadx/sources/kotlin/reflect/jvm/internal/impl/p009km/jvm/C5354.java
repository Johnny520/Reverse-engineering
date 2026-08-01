package kotlin.reflect.jvm.internal.impl.p009km.jvm;

import androidx.profileinstaller.C3277;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import kotlin.reflect.jvm.internal.impl.p009km.internal.AbstractC5340;
import p023.C6986;
import p083.C7714;
import p083.C7722;
import p086.C7735;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5354 extends AbstractC5894 {
    public C5354(Metadata metadata) {
        String[] strArrM150d1 = metadata.m150d1();
        strArrM150d1 = strArrM150d1.length == 0 ? null : strArrM150d1;
        if (strArrM150d1 != null) {
            Pair pairM12732 = C7722.m12732(strArrM150d1, metadata.m151d2());
            C7714 c7714 = (C7714) pairM12732.component1();
            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) pairM12732.component2();
            boolean z = new C5349(metadata.m153mv()).compareTo(new C5349(1, 4, 0)) < 0;
            protoBuf$Function.getClass();
            c7714.getClass();
            ProtoBuf$TypeTable typeTable = protoBuf$Function.getTypeTable();
            typeTable.getClass();
            AbstractC5340.m9661(protoBuf$Function, new C3277(c7714, new C6986(typeTable), C7735.f18766, z, (List) null, 48));
        }
        new C5349(metadata.m153mv());
        metadata.m155xi();
    }
}
