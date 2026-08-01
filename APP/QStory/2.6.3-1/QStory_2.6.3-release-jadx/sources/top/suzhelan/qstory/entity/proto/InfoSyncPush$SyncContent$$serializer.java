package top.suzhelan.qstory.entity.proto;

import java.util.List;
import kotlin.InterfaceC6001;
import kotlin.InterfaceC6016;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p103.AbstractC7966;
import p103.AbstractC7973;
import p103.C7958;
import p103.InterfaceC7908;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p106.InterfaceC8017;
import p106.InterfaceC8018;
import p107.InterfaceC8020;
import p160.C8376;
import p303.AbstractC9234;
import top.suzhelan.qstory.entity.proto.InfoSyncPush;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m151d2 = {"top/suzhelan/qstory/entity/proto/InfoSyncPush.SyncContent.$serializer", "L飘花落叶言世苏兰哲子楪/飘花落叶言子世楪哲兰苏;", "Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;", "encoder", "value", "Lkotlin/飘花落叶言子楪兰苏哲世;", "serialize", "(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲兰苏;Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;)V", "L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;", "decoder", "deserialize", "(L飘花落叶言世苏兰楪哲子/飘花落叶言子楪世哲苏兰;)Ltop/suzhelan/qstory/entity/proto/InfoSyncPush$SyncContent;", "", "L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "childSerializers", "()[L飘花落叶言世苏兰子楪哲/飘花落叶言子楪世苏哲兰;", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "descriptor", "L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "getDescriptor", "()L飘花落叶言世苏兰楪子哲/飘花落叶言子楪世兰苏哲;", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
@InterfaceC6001
public final /* synthetic */ class InfoSyncPush$SyncContent$$serializer implements InterfaceC7908 {
    public static final int $stable;
    public static final InfoSyncPush$SyncContent$$serializer INSTANCE;
    private static final InterfaceC8020 descriptor;

    static {
        InfoSyncPush$SyncContent$$serializer infoSyncPush$SyncContent$$serializer = new InfoSyncPush$SyncContent$$serializer();
        INSTANCE = infoSyncPush$SyncContent$$serializer;
        C7958 c7958 = new C7958(AbstractC9234.m14531(1510), infoSyncPush$SyncContent$$serializer, 1);
        c7958.m12968(AbstractC9234.m14531(1369), true);
        c7958.m12967(new C0799x7faa26be(3));
        descriptor = c7958;
        $stable = 8;
    }

    private InfoSyncPush$SyncContent$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p103.InterfaceC7908
    public final InterfaceC8013[] childSerializers() {
        return new InterfaceC8013[]{InfoSyncPush.SyncContent.$childSerializers[0].getValue()};
    }

    @Override // p105.InterfaceC8013
    public final InfoSyncPush.SyncContent deserialize(InterfaceC8016 decoder) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        decoder.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8018 interfaceC8018Mo11235 = decoder.mo11235(interfaceC8020);
        InterfaceC6016[] interfaceC6016Arr = InfoSyncPush.SyncContent.$childSerializers;
        interfaceC8018Mo11235.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        while (z) {
            int iMo11277 = interfaceC8018Mo11235.mo11277(interfaceC8020);
            if (iMo11277 == -1) {
                z = false;
            } else {
                if (iMo11277 != 0) {
                    C8376.m13326(iMo11277);
                    return null;
                }
                list = (List) interfaceC8018Mo11235.mo11233(interfaceC8020, 0, (InterfaceC8013) interfaceC6016Arr[0].getValue(), list);
                i = 1;
            }
        }
        interfaceC8018Mo11235.mo11237(interfaceC8020);
        return new InfoSyncPush.SyncContent(i, list, (AbstractC7966) null);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return descriptor;
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 encoder, InfoSyncPush.SyncContent value) {
        AbstractC9234.m14532("喵喵喵呜喵呜呜喵~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜呜~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        encoder.getClass();
        AbstractC9234.m14532("喵喵喵喵喵呜喵呜~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵喵喵");
        value.getClass();
        InterfaceC8020 interfaceC8020 = descriptor;
        InterfaceC8017 interfaceC8017Mo11269 = encoder.mo11269(interfaceC8020);
        InfoSyncPush.SyncContent.write$Self$app_publishRelease(value, interfaceC8017Mo11269, interfaceC8020);
        interfaceC8017Mo11269.mo11270(interfaceC8020);
    }

    @Override // p103.InterfaceC7908
    public /* bridge */ InterfaceC8013[] typeParametersSerializers() {
        return AbstractC7973.f19448;
    }
}
