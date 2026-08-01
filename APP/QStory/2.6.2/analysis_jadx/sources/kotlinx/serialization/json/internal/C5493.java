package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C0191;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.AbstractC5171;
import kotlin.AbstractC5184;
import kotlin.C5169;
import kotlin.C5175;
import kotlin.Result;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6550;
import p088.AbstractC7147;
import p088.AbstractC7175;
import p088.C7151;
import p088.C7156;
import p088.C7160;
import p088.C7162;
import p088.C7176;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5493 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f15183;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f15184;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0191 f15185;

    public C5493(C7176 c7176, C0191 c0191) {
        this.f15185 = c0191;
        this.f15184 = c7176.f19160;
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
    public static final java.lang.Object m10666(kotlinx.serialization.json.internal.C5493 r17, kotlin.AbstractC5170 r18, kotlin.coroutines.jvm.internal.BaseContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5493.m10666(kotlinx.serialization.json.internal.飘花落叶言子楪兰世苏哲, kotlin.飘花落叶言子楪世苏兰哲, kotlin.coroutines.jvm.internal.BaseContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC7147 m10667(boolean z) {
        boolean z2 = this.f15184;
        C0191 c0191 = this.f15185;
        String strM685 = (z2 || !z) ? c0191.m685() : c0191.m692();
        return (z || !AbstractC4394.m8917(strM685, "null")) ? new C7160(strM685, z, null) : C7162.INSTANCE;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C7156 m10668() {
        C0191 c0191 = this.f15185;
        byte bM690 = c0191.m690();
        if (c0191.m672() == 4) {
            C0191.m651(c0191, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (c0191.m676()) {
            arrayList.add(m10669());
            bM690 = c0191.m690();
            if (bM690 != 4) {
                boolean z = bM690 == 9;
                int i = c0191.f750;
                if (!z) {
                    C0191.m651(c0191, "Expected end of the array or comma", i, null, 4);
                    throw null;
                }
            }
        }
        if (bM690 == 8) {
            c0191.m689((byte) 9);
        } else if (bM690 == 4) {
            AbstractC5506.m10690(c0191, "array");
            throw null;
        }
        return new C7156(arrayList);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC7175 m10669() {
        AbstractC7175 c7151;
        Object obj;
        C0191 c0191 = this.f15185;
        byte bM672 = c0191.m672();
        if (bM672 == 1) {
            return m10667(true);
        }
        if (bM672 == 0) {
            return m10667(false);
        }
        if (bM672 != 6) {
            if (bM672 == 8) {
                return m10668();
            }
            C0191.m651(c0191, "Cannot read Json element because of unexpected ".concat(AbstractC5506.m10688(bM672)), 0, null, 6);
            throw null;
        }
        int i = this.f15183 + 1;
        this.f15183 = i;
        if (i == 200) {
            JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this, null);
            Object obj2 = AbstractC5171.f14735;
            C5169 c5169 = new C5169();
            c5169.f14734 = jsonTreeReader$readDeepRecursive$1;
            c5169.f14732 = c5169;
            Object obj3 = AbstractC5171.f14735;
            c5169.f14733 = obj3;
            while (true) {
                obj = c5169.f14733;
                InterfaceC4356 interfaceC4356 = c5169.f14732;
                if (interfaceC4356 == null) {
                    break;
                }
                if (Result.m8757equalsimpl0(obj3, obj)) {
                    try {
                        InterfaceC6550 interfaceC6550 = c5169.f14734;
                        C5175 c5175 = C5175.f14739;
                        AbstractC4387.m8898(3, interfaceC6550);
                        Object objInvoke = interfaceC6550.invoke(c5169, c5175, interfaceC4356);
                        if (objInvoke != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            interfaceC4356.resumeWith(Result.m8755constructorimpl(objInvoke));
                        }
                    } catch (Throwable th) {
                        interfaceC4356.resumeWith(Result.m8755constructorimpl(new Result.Failure(th)));
                    }
                } else {
                    c5169.f14733 = obj3;
                    interfaceC4356.resumeWith(obj);
                }
            }
            AbstractC5184.m10206(obj);
            c7151 = (AbstractC7175) obj;
        } else {
            byte bM689 = c0191.m689((byte) 6);
            if (c0191.m672() == 4) {
                C0191.m651(c0191, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!c0191.m676()) {
                    break;
                }
                String strM685 = this.f15184 ? c0191.m685() : c0191.m692();
                c0191.m689((byte) 5);
                linkedHashMap.put(strM685, m10669());
                bM689 = c0191.m690();
                if (bM689 != 4) {
                    if (bM689 != 7) {
                        C0191.m651(c0191, "Expected end of the object or comma", 0, null, 6);
                        throw null;
                    }
                }
            }
            if (bM689 == 6) {
                c0191.m689((byte) 7);
            } else if (bM689 == 4) {
                AbstractC5506.m10690(c0191, "object");
                throw null;
            }
            c7151 = new C7151(linkedHashMap);
        }
        this.f15183--;
        return c7151;
    }
}
