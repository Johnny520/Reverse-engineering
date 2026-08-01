package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C1038;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.AbstractC6003;
import kotlin.AbstractC6004;
import kotlin.AbstractC6017;
import kotlin.C6002;
import kotlin.C6008;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7380;
import p104.AbstractC7977;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import p104.C7990;
import p104.C7992;
import p104.C8006;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6326 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f15528;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f15529;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1038 f15530;

    public C6326(C8006 c8006, C1038 c1038) {
        this.f15530 = c1038;
        this.f15529 = c8006.f19500;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009f -> B:27:0x00a3). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m11260(C6326 c6326, AbstractC6003 abstractC6003, BaseContinuationImpl baseContinuationImpl) {
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$2;
        LinkedHashMap linkedHashMap;
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$22;
        int i;
        byte b;
        AbstractC6003 abstractC60032;
        C1038 c1038;
        C6326 c63262 = c6326;
        C1038 c10382 = c63262.f15530;
        if (baseContinuationImpl instanceof JsonTreeReader$readObject$2) {
            jsonTreeReader$readObject$2 = (JsonTreeReader$readObject$2) baseContinuationImpl;
            int i2 = jsonTreeReader$readObject$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jsonTreeReader$readObject$2.label = i2 - Integer.MIN_VALUE;
            } else {
                jsonTreeReader$readObject$2 = new JsonTreeReader$readObject$2(c63262, baseContinuationImpl);
            }
        }
        Object obj = jsonTreeReader$readObject$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = jsonTreeReader$readObject$2.label;
        if (i3 == 0) {
            AbstractC6017.m10769(obj);
            byte bM1250 = c10382.m1250((byte) 6);
            if (c10382.m1233() == 4) {
                C1038.m1212(c63262.f15530, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            linkedHashMap = new LinkedHashMap();
            jsonTreeReader$readObject$22 = jsonTreeReader$readObject$2;
            i = 0;
            b = bM1250;
            abstractC60032 = abstractC6003;
            c1038 = c63262.f15530;
            if (c1038.m1237()) {
            }
            C1038 c10383 = c63262.f15530;
            if (b == 6) {
            }
            return new C7981(linkedHashMap);
        }
        if (i3 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i4 = jsonTreeReader$readObject$2.I$0;
        String str = (String) jsonTreeReader$readObject$2.L$3;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) jsonTreeReader$readObject$2.L$2;
        C6326 c63263 = (C6326) jsonTreeReader$readObject$2.L$1;
        AbstractC6003 abstractC60033 = (AbstractC6003) jsonTreeReader$readObject$2.L$0;
        AbstractC6017.m10769(obj);
        JsonTreeReader$readObject$2 jsonTreeReader$readObject$23 = jsonTreeReader$readObject$2;
        int i5 = i4;
        c63262 = c63263;
        linkedHashMap = linkedHashMap2;
        jsonTreeReader$readObject$22 = jsonTreeReader$readObject$23;
        linkedHashMap.put(str, (AbstractC8005) obj);
        byte bM1251 = c63262.f15530.m1251();
        if (bM1251 == 4) {
            if (bM1251 != 7) {
                C1038.m1212(c63262.f15530, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            b = bM1251;
            C1038 c103832 = c63262.f15530;
            if (b == 6) {
                c103832.m1250((byte) 7);
            } else if (b == 4) {
                AbstractC6339.m11306(c103832, "object");
                throw null;
            }
            return new C7981(linkedHashMap);
        }
        i = i5;
        b = bM1251;
        abstractC60032 = abstractC60033;
        c1038 = c63262.f15530;
        if (c1038.m1237()) {
            String strM1246 = c63262.f15529 ? c1038.m1246() : c1038.m1253();
            c1038.m1250((byte) 5);
            jsonTreeReader$readObject$22.L$0 = abstractC60032;
            jsonTreeReader$readObject$22.L$1 = c63262;
            jsonTreeReader$readObject$22.L$2 = linkedHashMap;
            jsonTreeReader$readObject$22.L$3 = strM1246;
            jsonTreeReader$readObject$22.I$0 = i;
            jsonTreeReader$readObject$22.B$0 = b;
            jsonTreeReader$readObject$22.I$1 = 0;
            jsonTreeReader$readObject$22.label = 1;
            C6002 c6002 = (C6002) abstractC60032;
            c6002.getClass();
            c6002.f15077 = jsonTreeReader$readObject$22;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (coroutineSingletons2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            abstractC60033 = abstractC60032;
            obj = coroutineSingletons2;
            i5 = i;
            str = strM1246;
            linkedHashMap.put(str, (AbstractC8005) obj);
            byte bM12512 = c63262.f15530.m1251();
            if (bM12512 == 4) {
            }
        }
        C1038 c1038322 = c63262.f15530;
        if (b == 6) {
        }
        return new C7981(linkedHashMap);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC7977 m11261(boolean z) {
        boolean z2 = this.f15529;
        C1038 c1038 = this.f15530;
        String strM1246 = (z2 || !z) ? c1038.m1246() : c1038.m1253();
        return (z || !AbstractC5227.m9466(strM1246, "null")) ? new C7990(strM1246, z, null) : C7992.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7986 m11262() {
        C1038 c1038 = this.f15530;
        byte bM1251 = c1038.m1251();
        if (c1038.m1233() == 4) {
            C1038.m1212(c1038, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c1038.m1237()) {
            arrayList.add(m11263());
            bM1251 = c1038.m1251();
            if (bM1251 != 4) {
                boolean z = bM1251 == 9;
                int i = c1038.f1095;
                if (!z) {
                    C1038.m1212(c1038, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bM1251 == 8) {
            c1038.m1250((byte) 9);
        } else if (bM1251 == 4) {
            AbstractC6339.m11306(c1038, "array");
            throw null;
        }
        return new C7986(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC8005 m11263() {
        AbstractC8005 c7981;
        Object obj;
        C1038 c1038 = this.f15530;
        byte bM1233 = c1038.m1233();
        if (bM1233 == 1) {
            return m11261(true);
        }
        if (bM1233 == 0) {
            return m11261(false);
        }
        if (bM1233 != 6) {
            if (bM1233 == 8) {
                return m11262();
            }
            C1038.m1212(c1038, "Cannot read Json element because of unexpected ".concat(AbstractC6339.m11304(bM1233)), 0, null, 6);
            throw null;
        }
        int i = this.f15528 + 1;
        this.f15528 = i;
        if (i == 200) {
            JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this, null);
            Object obj2 = AbstractC6004.f15080;
            C6002 c6002 = new C6002();
            c6002.f15079 = jsonTreeReader$readDeepRecursive$1;
            c6002.f15077 = c6002;
            Object obj3 = AbstractC6004.f15080;
            c6002.f15078 = obj3;
            while (true) {
                obj = c6002.f15078;
                InterfaceC5189 interfaceC5189 = c6002.f15077;
                if (interfaceC5189 == null) {
                    break;
                }
                if (Result.m9306equalsimpl0(obj3, obj)) {
                    try {
                        InterfaceC7380 interfaceC7380 = c6002.f15079;
                        C6008 c6008 = C6008.f15084;
                        AbstractC5220.m9447(3, interfaceC7380);
                        Object objInvoke = interfaceC7380.invoke(c6002, c6008, interfaceC5189);
                        if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            interfaceC5189.resumeWith(Result.m9304constructorimpl(objInvoke));
                        }
                    } catch (Throwable th) {
                        interfaceC5189.resumeWith(Result.m9304constructorimpl(new Result.Failure(th)));
                    }
                } else {
                    c6002.f15078 = obj3;
                    interfaceC5189.resumeWith(obj);
                }
            }
            AbstractC6017.m10769(obj);
            c7981 = (AbstractC8005) obj;
        } else {
            byte bM1250 = c1038.m1250((byte) 6);
            if (c1038.m1233() == 4) {
                C1038.m1212(c1038, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!c1038.m1237()) {
                    break;
                }
                String strM1246 = this.f15529 ? c1038.m1246() : c1038.m1253();
                c1038.m1250((byte) 5);
                linkedHashMap.put(strM1246, m11263());
                bM1250 = c1038.m1251();
                if (bM1250 != 4) {
                    if (bM1250 != 7) {
                        C1038.m1212(c1038, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bM1250 == 6) {
                c1038.m1250((byte) 7);
            } else if (bM1250 == 4) {
                AbstractC6339.m11306(c1038, "object");
                throw null;
            }
            c7981 = new C7981(linkedHashMap);
        }
        this.f15528--;
        return c7981;
    }
}
