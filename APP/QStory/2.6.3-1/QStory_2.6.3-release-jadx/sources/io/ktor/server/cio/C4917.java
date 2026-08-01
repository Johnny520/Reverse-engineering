package io.ktor.server.cio;

import androidx.appcompat.app.C0923;
import io.ktor.http.cio.AbstractC4789;
import io.ktor.http.cio.C4799;
import io.ktor.http.content.AbstractC4819;
import io.ktor.server.engine.AbstractC4940;
import io.ktor.server.websocket.C5008;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5062;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.C6248;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.InterfaceC6273;
import kotlinx.coroutines.InterfaceC6284;
import kotlinx.p010io.C6309;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8945;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.cio.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4917 extends AbstractC4940 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f12753 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public C6249 f12754;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public C5081 f12755;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final C8945 f12756;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public C8926 f12757;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final InterfaceC6273 f12758;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final InterfaceC5192 f12759;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final C0923 f12760;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final InterfaceC5079 f12761;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final InterfaceC5084 f12762;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4917(C4915 c4915, InterfaceC5079 interfaceC5079, InterfaceC5084 interfaceC5084, InterfaceC5192 interfaceC5192, InterfaceC5192 interfaceC51922, InterfaceC6273 interfaceC6273) {
        super(c4915);
        interfaceC5079.getClass();
        interfaceC5084.getClass();
        interfaceC5192.getClass();
        interfaceC51922.getClass();
        this.f12761 = interfaceC5079;
        this.f12762 = interfaceC5084;
        this.f12759 = interfaceC5192;
        this.f12758 = interfaceC6273;
        this.f12757 = C8926.f22696;
        this.f12756 = new C8945(2);
        this.f12760 = new C0923(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (kotlinx.coroutines.AbstractC6231.m11029(r8, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4940
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9042(byte[] bArr, ContinuationImpl continuationImpl) {
        CIOApplicationResponse$respondFromBytes$1 cIOApplicationResponse$respondFromBytes$1;
        if (continuationImpl instanceof CIOApplicationResponse$respondFromBytes$1) {
            cIOApplicationResponse$respondFromBytes$1 = (CIOApplicationResponse$respondFromBytes$1) continuationImpl;
            int i = cIOApplicationResponse$respondFromBytes$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOApplicationResponse$respondFromBytes$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOApplicationResponse$respondFromBytes$1 = new CIOApplicationResponse$respondFromBytes$1(this, continuationImpl);
            }
        }
        Object obj = cIOApplicationResponse$respondFromBytes$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOApplicationResponse$respondFromBytes$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            cIOApplicationResponse$respondFromBytes$1.L$0 = this;
            cIOApplicationResponse$respondFromBytes$1.L$1 = bArr;
            cIOApplicationResponse$respondFromBytes$1.label = 1;
            if (m9045(true, cIOApplicationResponse$respondFromBytes$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        bArr = (byte[]) cIOApplicationResponse$respondFromBytes$1.L$1;
        this = (C4917) cIOApplicationResponse$respondFromBytes$1.L$0;
        AbstractC6017.m10769(obj);
        InterfaceC5079 interfaceC5079M9044 = this.m9044();
        C6248 c6248 = AbstractC6227.f15374;
        CIOApplicationResponse$respondFromBytes$2 cIOApplicationResponse$respondFromBytes$2 = new CIOApplicationResponse$respondFromBytes$2(interfaceC5079M9044, bArr, null);
        cIOApplicationResponse$respondFromBytes$1.L$0 = null;
        cIOApplicationResponse$respondFromBytes$1.L$1 = null;
        cIOApplicationResponse$respondFromBytes$1.label = 2;
    }

    @Override // io.ktor.server.response.InterfaceC4968
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final C0923 mo943() {
        return this.f12760;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00aa, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r11).m9263(r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r12).m9263(r0) != r1) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[PHI: r10
  0x009e: PHI (r10v5 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰) = (r10v4 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰), (r10v15 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰) binds: [B:35:0x009b, B:20:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4940
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9043(C5008 c5008, ContinuationImpl continuationImpl) throws Throwable {
        CIOApplicationResponse$respondUpgrade$1 cIOApplicationResponse$respondUpgrade$1;
        C4917 c4917;
        Throwable th;
        if (continuationImpl instanceof CIOApplicationResponse$respondUpgrade$1) {
            cIOApplicationResponse$respondUpgrade$1 = (CIOApplicationResponse$respondUpgrade$1) continuationImpl;
            int i = cIOApplicationResponse$respondUpgrade$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOApplicationResponse$respondUpgrade$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOApplicationResponse$respondUpgrade$1 = new CIOApplicationResponse$respondUpgrade$1(this, continuationImpl);
            }
        }
        Object objM9100 = cIOApplicationResponse$respondUpgrade$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOApplicationResponse$respondUpgrade$1.label;
        try {
        } catch (Throwable th2) {
            c4917 = this;
            th = th2;
            InterfaceC5079 interfaceC5079 = c4917.f12761;
            cIOApplicationResponse$respondUpgrade$1.L$0 = c4917;
            cIOApplicationResponse$respondUpgrade$1.L$1 = th;
            cIOApplicationResponse$respondUpgrade$1.label = 5;
        }
        if (i2 == 0) {
            AbstractC6017.m10769(objM9100);
            cIOApplicationResponse$respondUpgrade$1.L$0 = this;
            cIOApplicationResponse$respondUpgrade$1.L$1 = c5008;
            cIOApplicationResponse$respondUpgrade$1.label = 1;
            if (m9045(false, cIOApplicationResponse$respondUpgrade$1) != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            c5008 = (C5008) cIOApplicationResponse$respondUpgrade$1.L$1;
            this = (C4917) cIOApplicationResponse$respondUpgrade$1.L$0;
            AbstractC6017.m10769(objM9100);
        } else {
            if (i2 == 2) {
                this = (C4917) cIOApplicationResponse$respondUpgrade$1.L$0;
                AbstractC6017.m10769(objM9100);
                cIOApplicationResponse$respondUpgrade$1.L$0 = this;
                cIOApplicationResponse$respondUpgrade$1.label = 3;
                if (((InterfaceC6284) objM9100).mo11123(cIOApplicationResponse$respondUpgrade$1) != obj) {
                    InterfaceC5079 interfaceC50792 = this.f12761;
                    cIOApplicationResponse$respondUpgrade$1.L$0 = this;
                    cIOApplicationResponse$respondUpgrade$1.label = 4;
                }
                return obj;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    this = (C4917) cIOApplicationResponse$respondUpgrade$1.L$0;
                    AbstractC6017.m10769(objM9100);
                    AbstractC5076.m9226(this.f12762);
                    return C6008.f15084;
                }
                if (i2 != 5) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) cIOApplicationResponse$respondUpgrade$1.L$1;
                c4917 = (C4917) cIOApplicationResponse$respondUpgrade$1.L$0;
                AbstractC6017.m10769(objM9100);
                AbstractC5076.m9226(c4917.f12762);
                throw th;
            }
            this = (C4917) cIOApplicationResponse$respondUpgrade$1.L$0;
            AbstractC6017.m10769(objM9100);
            InterfaceC5079 interfaceC507922 = this.f12761;
            cIOApplicationResponse$respondUpgrade$1.L$0 = this;
            cIOApplicationResponse$respondUpgrade$1.label = 4;
        }
        InterfaceC5084 interfaceC5084 = this.f12762;
        InterfaceC5079 interfaceC50793 = this.f12761;
        InterfaceC5192 interfaceC5192 = this.f12759;
        cIOApplicationResponse$respondUpgrade$1.L$0 = this;
        cIOApplicationResponse$respondUpgrade$1.L$1 = null;
        cIOApplicationResponse$respondUpgrade$1.label = 2;
        objM9100 = c5008.m9100(interfaceC5084, interfaceC50793, interfaceC5192, cIOApplicationResponse$respondUpgrade$1);
        if (objM9100 != obj) {
            cIOApplicationResponse$respondUpgrade$1.L$0 = this;
            cIOApplicationResponse$respondUpgrade$1.label = 3;
            if (((InterfaceC6284) objM9100).mo11123(cIOApplicationResponse$respondUpgrade$1) != obj) {
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final InterfaceC5079 m9044() {
        String[] strArr = AbstractC8944.f22758;
        boolean zM9466 = AbstractC5227.m9466(this.f12760.m821("Transfer-Encoding"), "chunked");
        InterfaceC5079 interfaceC5079 = this.f12761;
        if (!zM9466) {
            return interfaceC5079;
        }
        C5062 c5062M8902 = AbstractC4789.m8902(interfaceC5079, AbstractC6227.f15374);
        C5081 c5081 = c5062M8902.f13078;
        this.f12755 = c5081;
        this.f12754 = c5062M8902.f13077;
        return c5081;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r11).m9259(r1) == r2) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9045(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        CIOApplicationResponse$sendResponseMessage$1 cIOApplicationResponse$sendResponseMessage$1;
        C4917 c4917;
        C4799 c4799;
        C8945 c8945 = this.f12756;
        if (continuationImpl instanceof CIOApplicationResponse$sendResponseMessage$1) {
            cIOApplicationResponse$sendResponseMessage$1 = (CIOApplicationResponse$sendResponseMessage$1) continuationImpl;
            int i = cIOApplicationResponse$sendResponseMessage$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOApplicationResponse$sendResponseMessage$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOApplicationResponse$sendResponseMessage$1 = new CIOApplicationResponse$sendResponseMessage$1(this, continuationImpl);
            }
        }
        Object obj = cIOApplicationResponse$sendResponseMessage$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOApplicationResponse$sendResponseMessage$1.label;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                C4799 c47992 = new C4799();
                try {
                    C8926 c8926 = this.f12757;
                    c47992.m8917(c8926.f22704, c8926.f22703, "HTTP/1.1");
                    try {
                        for (String str : ((Map) c8945.f4240).keySet()) {
                            List listM2976 = c8945.m2976(str);
                            listM2976.getClass();
                            Iterator it = listM2976.iterator();
                            while (it.hasNext()) {
                                c47992.m8918(str, (String) it.next());
                            }
                        }
                        c47992.m8919();
                        InterfaceC5079 interfaceC5079 = this.f12761;
                        C6309 c6309 = c47992.f12550;
                        cIOApplicationResponse$sendResponseMessage$1.L$0 = this;
                        cIOApplicationResponse$sendResponseMessage$1.L$1 = c47992;
                        cIOApplicationResponse$sendResponseMessage$1.Z$0 = z;
                        cIOApplicationResponse$sendResponseMessage$1.label = 1;
                        if (AbstractC5078.m9246(interfaceC5079, c6309, cIOApplicationResponse$sendResponseMessage$1) != coroutineSingletons) {
                            c4917 = this;
                            c4799 = c47992;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th) {
                        th = th;
                        this = c47992;
                        this.getClass();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c4799 = (C4799) cIOApplicationResponse$sendResponseMessage$1.L$0;
                    AbstractC6017.m10769(obj);
                    c4799.getClass();
                    return C6008.f15084;
                }
                z = cIOApplicationResponse$sendResponseMessage$1.Z$0;
                c4799 = (C4799) cIOApplicationResponse$sendResponseMessage$1.L$1;
                C4917 c49172 = (C4917) cIOApplicationResponse$sendResponseMessage$1.L$0;
                AbstractC6017.m10769(obj);
                c4917 = c49172;
            }
            if (!z) {
                InterfaceC5079 interfaceC50792 = c4917.f12761;
                cIOApplicationResponse$sendResponseMessage$1.L$0 = c4799;
                cIOApplicationResponse$sendResponseMessage$1.L$1 = null;
                cIOApplicationResponse$sendResponseMessage$1.label = 2;
            }
            c4799.getClass();
            return C6008.f15084;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4940
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9046(ContinuationImpl continuationImpl) {
        CIOApplicationResponse$responseChannel$1 cIOApplicationResponse$responseChannel$1;
        if (continuationImpl instanceof CIOApplicationResponse$responseChannel$1) {
            cIOApplicationResponse$responseChannel$1 = (CIOApplicationResponse$responseChannel$1) continuationImpl;
            int i = cIOApplicationResponse$responseChannel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOApplicationResponse$responseChannel$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOApplicationResponse$responseChannel$1 = new CIOApplicationResponse$responseChannel$1(this, continuationImpl);
            }
        }
        Object obj = cIOApplicationResponse$responseChannel$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOApplicationResponse$responseChannel$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            cIOApplicationResponse$responseChannel$1.L$0 = this;
            cIOApplicationResponse$responseChannel$1.label = 1;
            if (m9045(false, cIOApplicationResponse$responseChannel$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (C4917) cIOApplicationResponse$responseChannel$1.L$0;
            AbstractC6017.m10769(obj);
        }
        return this.m9044();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r6).m9263(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4940
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9047(ContinuationImpl continuationImpl) {
        CIOApplicationResponse$respondNoContent$1 cIOApplicationResponse$respondNoContent$1;
        if (continuationImpl instanceof CIOApplicationResponse$respondNoContent$1) {
            cIOApplicationResponse$respondNoContent$1 = (CIOApplicationResponse$respondNoContent$1) continuationImpl;
            int i = cIOApplicationResponse$respondNoContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOApplicationResponse$respondNoContent$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOApplicationResponse$respondNoContent$1 = new CIOApplicationResponse$respondNoContent$1(this, continuationImpl);
            }
        }
        Object obj = cIOApplicationResponse$respondNoContent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOApplicationResponse$respondNoContent$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            cIOApplicationResponse$respondNoContent$1.L$0 = this;
            cIOApplicationResponse$respondNoContent$1.label = 1;
            if (m9045(true, cIOApplicationResponse$respondNoContent$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = (C4917) cIOApplicationResponse$respondNoContent$1.L$0;
        AbstractC6017.m10769(obj);
        InterfaceC5079 interfaceC5079 = this.f12761;
        cIOApplicationResponse$respondNoContent$1.L$0 = null;
        cIOApplicationResponse$respondNoContent$1.label = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[PHI: r8
  0x0082: PHI (r8v3 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰) = 
  (r8v2 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰)
  (r8v2 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰)
  (r8v9 'this' io.ktor.server.cio.飘花落叶言子楪苏世哲兰)
 binds: [B:31:0x0075, B:33:0x007f, B:17:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // io.ktor.server.engine.AbstractC4940
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo9048(AbstractC4819 abstractC4819, ContinuationImpl continuationImpl) {
        CIOApplicationResponse$respondOutgoingContent$1 cIOApplicationResponse$respondOutgoingContent$1;
        C6249 c6249;
        if (continuationImpl instanceof CIOApplicationResponse$respondOutgoingContent$1) {
            cIOApplicationResponse$respondOutgoingContent$1 = (CIOApplicationResponse$respondOutgoingContent$1) continuationImpl;
            int i = cIOApplicationResponse$respondOutgoingContent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cIOApplicationResponse$respondOutgoingContent$1.label = i - Integer.MIN_VALUE;
            } else {
                cIOApplicationResponse$respondOutgoingContent$1 = new CIOApplicationResponse$respondOutgoingContent$1(this, continuationImpl);
            }
        }
        Object obj = cIOApplicationResponse$respondOutgoingContent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cIOApplicationResponse$respondOutgoingContent$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            boolean z = abstractC4819 instanceof C5008;
            InterfaceC6273 interfaceC6273 = this.f12758;
            if (z) {
                if (interfaceC6273 == null) {
                    C6755.m11870("Unable to perform upgrade as it is not requested by the client: request should have Upgrade and Connection headers filled properly");
                    return null;
                }
                ((C6270) interfaceC6273).m11147(Boolean.TRUE);
            } else if (interfaceC6273 != null) {
                ((C6270) interfaceC6273).m11147(Boolean.FALSE);
            }
            cIOApplicationResponse$respondOutgoingContent$1.L$0 = this;
            cIOApplicationResponse$respondOutgoingContent$1.label = 1;
            if (AbstractC4940.m9070(this, abstractC4819, cIOApplicationResponse$respondOutgoingContent$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = (C4917) cIOApplicationResponse$respondOutgoingContent$1.L$0;
            AbstractC6017.m10769(obj);
            c6249 = this.f12754;
            if (c6249 != null) {
                cIOApplicationResponse$respondOutgoingContent$1.L$0 = null;
                cIOApplicationResponse$respondOutgoingContent$1.label = 3;
                if (c6249.mo11123(cIOApplicationResponse$respondOutgoingContent$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return c6008;
        }
        this = (C4917) cIOApplicationResponse$respondOutgoingContent$1.L$0;
        AbstractC6017.m10769(obj);
        C5081 c5081 = this.f12755;
        if (c5081 != null) {
            cIOApplicationResponse$respondOutgoingContent$1.L$0 = this;
            cIOApplicationResponse$respondOutgoingContent$1.label = 2;
            if (c5081.m9263(cIOApplicationResponse$respondOutgoingContent$1) != coroutineSingletons) {
                c6249 = this.f12754;
                if (c6249 != null) {
                }
                return c6008;
            }
        }
        return coroutineSingletons;
    }
}
