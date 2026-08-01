package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C0191;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.AbstractC5172;
import kotlin.AbstractC5185;
import kotlin.C5170;
import kotlin.C5176;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6551;
import p088.AbstractC7148;
import p088.AbstractC7176;
import p088.C7152;
import p088.C7157;
import p088.C7161;
import p088.C7163;
import p088.C7177;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5494 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f15183;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f15184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0191 f15185;

    public C5494(C7177 c7177, C0191 c0191) {
        this.f15185 = c0191;
        this.f15184 = c7177.f19155;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m10701(kotlinx.serialization.json.internal.C5494 r17, kotlin.AbstractC5171 r18, kotlin.coroutines.jvm.internal.BaseContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5494.m10701(kotlinx.serialization.json.internal.飘花落叶言子楪兰世苏哲, kotlin.飘花落叶言子楪世苏兰哲, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC7148 m10702(boolean z) {
        boolean z2 = this.f15184;
        C0191 c0191 = this.f15185;
        String strM686 = (z2 || !z) ? c0191.m686() : c0191.m693();
        return (z || !AbstractC4395.m8907(strM686, "null")) ? new C7161(strM686, z, null) : C7163.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7157 m10703() {
        C0191 c0191 = this.f15185;
        byte bM691 = c0191.m691();
        if (c0191.m673() == 4) {
            C0191.m652(c0191, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c0191.m677()) {
            arrayList.add(m10704());
            bM691 = c0191.m691();
            if (bM691 != 4) {
                boolean z = bM691 == 9;
                int i = c0191.f750;
                if (!z) {
                    C0191.m652(c0191, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bM691 == 8) {
            c0191.m690((byte) 9);
        } else if (bM691 == 4) {
            AbstractC5507.m10747(c0191, "array");
            throw null;
        }
        return new C7157(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7176 m10704() {
        AbstractC7176 c7152;
        Object obj;
        C0191 c0191 = this.f15185;
        byte bM673 = c0191.m673();
        if (bM673 == 1) {
            return m10702(true);
        }
        if (bM673 == 0) {
            return m10702(false);
        }
        if (bM673 != 6) {
            if (bM673 == 8) {
                return m10703();
            }
            C0191.m652(c0191, "Cannot read Json element because of unexpected ".concat(AbstractC5507.m10745(bM673)), 0, null, 6);
            throw null;
        }
        int i = this.f15183 + 1;
        this.f15183 = i;
        if (i == 200) {
            JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this, null);
            Object obj2 = AbstractC5172.f14735;
            C5170 c5170 = new C5170();
            c5170.f14734 = jsonTreeReader$readDeepRecursive$1;
            c5170.f14732 = c5170;
            Object obj3 = AbstractC5172.f14735;
            c5170.f14733 = obj3;
            while (true) {
                obj = c5170.f14733;
                InterfaceC4357 interfaceC4357 = c5170.f14732;
                if (interfaceC4357 == null) {
                    break;
                }
                if (Result.m8747equalsimpl0(obj3, obj)) {
                    try {
                        InterfaceC6551 interfaceC6551 = c5170.f14734;
                        C5176 c5176 = C5176.f14739;
                        AbstractC4388.m8888(3, interfaceC6551);
                        Object objInvoke = interfaceC6551.invoke(c5170, c5176, interfaceC4357);
                        if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            interfaceC4357.resumeWith(Result.m8745constructorimpl(objInvoke));
                        }
                    } catch (Throwable th) {
                        interfaceC4357.resumeWith(Result.m8745constructorimpl(new Result.Failure(th)));
                    }
                } else {
                    c5170.f14733 = obj3;
                    interfaceC4357.resumeWith(obj);
                }
            }
            AbstractC5185.m10210(obj);
            c7152 = (AbstractC7176) obj;
        } else {
            byte bM690 = c0191.m690((byte) 6);
            if (c0191.m673() == 4) {
                C0191.m652(c0191, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!c0191.m677()) {
                    break;
                }
                String strM686 = this.f15184 ? c0191.m686() : c0191.m693();
                c0191.m690((byte) 5);
                linkedHashMap.put(strM686, m10704());
                bM690 = c0191.m691();
                if (bM690 != 4) {
                    if (bM690 != 7) {
                        C0191.m652(c0191, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bM690 == 6) {
                c0191.m690((byte) 7);
            } else if (bM690 == 4) {
                AbstractC5507.m10747(c0191, "object");
                throw null;
            }
            c7152 = new C7152(linkedHashMap);
        }
        this.f15183--;
        return c7152;
    }
}
