package kotlin.reflect.jvm.internal.impl.km.jvm;

import androidx.profileinstaller.C2444;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.AbstractC5062;
import kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4508;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import p007.C6157;
import p067.C6885;
import p067.C6893;
import p070.C6906;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4522 extends AbstractC5062 {
    public C4522(Metadata metadata) {
        String[] strArrD1 = metadata.d1();
        strArrD1 = strArrD1.length == 0 ? null : strArrD1;
        if (strArrD1 != null) {
            Pair pairM12173 = C6893.m12173(strArrD1, metadata.d2());
            C6885 c6885 = (C6885) pairM12173.component1();
            ProtoBuf$Function protoBuf$Function = (ProtoBuf$Function) pairM12173.component2();
            boolean z = new C4517(metadata.mv()).compareTo(new C4517(1, 4, 0)) < 0;
            protoBuf$Function.getClass();
            c6885.getClass();
            ProtoBuf$TypeTable typeTable = protoBuf$Function.getTypeTable();
            typeTable.getClass();
            AbstractC4508.m9102(protoBuf$Function, new C2444(c6885, new C6157(typeTable), C6906.f18421, z, (List) null, 48));
        }
        new C4517(metadata.mv());
        metadata.xi();
    }
}
