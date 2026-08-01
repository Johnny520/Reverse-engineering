package androidx.compose.runtime;

import androidx.activity.compose.C0849;
import androidx.collection.AbstractC1132;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.internal.C2086;
import androidx.compose.runtime.snapshots.AbstractC2121;
import java.util.Set;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5220;
import kotlinx.coroutines.channels.InterfaceC6032;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2216 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ Object f4331;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f4332;

    public /* synthetic */ C2216(Object obj, int i) {
        this.f4332 = i;
        this.f4331 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    @Override // p068.InterfaceC7383
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        InterfaceC6032 interfaceC6032;
        InterfaceC6032 interfaceC60322;
        long j3 = -9187201950435737472L;
        switch (this.f4332) {
            case 0:
                return Recomposer$recompositionRunner$2.invokeSuspend$lambda$0((C2218) this.f4331, (Set) obj, (AbstractC2121) obj2);
            case 1:
                C2086 c2086 = (C2086) this.f4331;
                ((Integer) obj).getClass();
                if (obj2 instanceof InterfaceC2205) {
                    InterfaceC2205 interfaceC2205 = (InterfaceC2205) obj2;
                    C1082 c1082 = (C1082) c2086.f3978;
                    if (c1082 == null) {
                        C1082 c10822 = AbstractC1132.f1342;
                        c1082 = new C1082();
                        c2086.f3978 = c1082;
                    }
                    c1082.m1305(interfaceC2205);
                    ((C2059) c2086.f3973).m2607(interfaceC2205);
                }
                if (obj2 instanceof C2155) {
                    c2086.m2738((C2155) obj2);
                }
                if (obj2 instanceof C2224) {
                    ((C2224) obj2).m3088();
                }
                return C6008.f15084;
            case 2:
                InterfaceC2208 interfaceC2208 = (InterfaceC2208) obj;
                int iIntValue = ((Integer) obj2).intValue();
                C2159 c2159 = (C2159) interfaceC2208;
                if (c2159.m2903(iIntValue & 1, (iIntValue & 3) != 2)) {
                    throw null;
                }
                c2159.m2899();
                return C6008.f15084;
            case 3:
                C2228 c2228 = (C2228) this.f4331;
                Set set = (Set) obj;
                synchronized (c2228.f4240) {
                    try {
                        C1083 c1083 = c2228.f4400;
                        C0849 c0849 = new C0849(set, 16, c2228);
                        AbstractC5220.m9447(1, c0849);
                        Object[] objArr = c1083.f1225;
                        long[] jArr = c1083.f1226;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j4 = jArr[i];
                                if ((((~j4) << 7) & j4 & j3) != j3) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    int i3 = 0;
                                    while (i3 < i2) {
                                        if ((j4 & 255) < 128) {
                                            j2 = j3;
                                            c0849.invoke(objArr[(i << 3) + i3]);
                                        } else {
                                            j2 = j3;
                                        }
                                        j4 >>= 8;
                                        i3++;
                                        j3 = j2;
                                    }
                                    j = j3;
                                    if (i2 == 8) {
                                    }
                                } else {
                                    j = j3;
                                }
                                if (i != length) {
                                    i++;
                                    j3 = j;
                                }
                            }
                        } else {
                            j = -9187201950435737472L;
                        }
                        C1082 c10823 = c2228.f4398;
                        Object[] objArr2 = c10823.f1345;
                        long[] jArr2 = c10823.f1346;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j5 = jArr2[i4];
                                if ((((~j5) << 7) & j5 & j) != j) {
                                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((j5 & 255) < 128) {
                                            ((InterfaceC6032) objArr2[(i4 << 3) + i6]).mo8995(C6008.f15084);
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i5 == 8) {
                                        if (i4 != length2) {
                                            i4++;
                                        }
                                    }
                                }
                            }
                        }
                        c2228.f4398.m1300();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return C6008.f15084;
            default:
                C2165 c2165 = (C2165) this.f4331;
                Set set2 = (Set) obj;
                synchronized (c2165.f4240) {
                    try {
                        C1082 c10824 = c2165.f4233;
                        if (c10824 == null) {
                            if (AbstractC5176.m9365(set2, c2165.f4237)) {
                                interfaceC60322 = c2165.f4235;
                            }
                            interfaceC6032 = null;
                        } else {
                            Object[] objArr3 = c10824.f1345;
                            long[] jArr3 = c10824.f1346;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                int i7 = 0;
                                while (true) {
                                    long j6 = jArr3[i7];
                                    interfaceC6032 = null;
                                    if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i8 = 8 - ((~(i7 - length3)) >>> 31);
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            if ((j6 & 255) >= 128 || !set2.contains(objArr3[(i7 << 3) + i9])) {
                                                j6 >>= 8;
                                            } else {
                                                interfaceC60322 = c2165.f4235;
                                            }
                                        }
                                        if (i8 == 8) {
                                            if (i7 != length3) {
                                                i7++;
                                            }
                                        }
                                    }
                                }
                            } else {
                                interfaceC6032 = null;
                            }
                        }
                        interfaceC60322 = interfaceC6032;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (interfaceC60322 != null) {
                    interfaceC60322.mo8995(C6008.f15084);
                }
                return C6008.f15084;
        }
    }
}
