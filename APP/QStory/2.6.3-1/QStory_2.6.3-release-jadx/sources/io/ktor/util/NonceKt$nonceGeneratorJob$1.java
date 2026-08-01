package io.ktor.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6022;
import kotlinx.coroutines.channels.InterfaceC6039;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p414.AbstractC9968;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.NonceKt$nonceGeneratorJob$1", m556f = "Nonce.kt", m557l = {76}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class NonceKt$nonceGeneratorJob$1 extends SuspendLambda implements InterfaceC7383 {
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    public NonceKt$nonceGeneratorJob$1(InterfaceC5189<? super NonceKt$nonceGeneratorJob$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new NonceKt$nonceGeneratorJob$1(interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((NonceKt$nonceGeneratorJob$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Path cross not found for [B:84:0x0059, B:19:0x0062], limit reached: 93 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00da A[Catch: all -> 0x003e, LOOP:1: B:37:0x00d8->B:38:0x00da, LOOP_END, TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fd A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b A[ADDED_TO_REGION, Catch: all -> 0x003e, EDGE_INSN: B:57:0x013b->B:58:0x0153 BREAK  A[LOOP:2: B:48:0x011b->B:56:0x0129], TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0155 A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0179 A[Catch: all -> 0x003e, TryCatch #3 {all -> 0x003e, blocks: (B:6:0x002e, B:62:0x0177, B:59:0x0155, B:63:0x0179, B:65:0x0189, B:36:0x00d0, B:38:0x00da, B:39:0x00e3, B:41:0x00ef, B:43:0x0100, B:47:0x0113, B:50:0x011f, B:56:0x0129, B:57:0x013b, B:42:0x00fd), top: B:82:0x002e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0174 -> B:62:0x0177). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws NoSuchAlgorithmException {
        ArrayList arrayList;
        SecureRandom secureRandom;
        SecureRandom secureRandom2;
        byte[] bArr;
        byte[] bArr2;
        long j;
        InterfaceC6039 interfaceC6039;
        SecureRandom secureRandom3;
        int length;
        int i;
        long jCurrentTimeMillis;
        String strM9196;
        int length2;
        ArrayList arrayList2;
        int i2;
        List list;
        int size;
        ArrayList arrayList3;
        int i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        int i5 = 1;
        if (i4 == 0) {
            AbstractC6017.m10769(obj);
            C6022 c6022 = AbstractC5051.f13054;
            arrayList = new ArrayList();
            String property = System.getProperty("io.ktor.random.secure.random.provider");
            if (property != null) {
                try {
                    secureRandom = SecureRandom.getInstance(property);
                } catch (NoSuchAlgorithmException unused) {
                    secureRandom = null;
                }
                if (secureRandom == null) {
                }
                secureRandom2 = SecureRandom.getInstance("SHA1PRNG");
                bArr = new byte[128];
                bArr2 = new byte[512];
                secureRandom2.setSeed(secureRandom.generateSeed(128));
                j = 0;
                interfaceC6039 = c6022;
                secureRandom.nextBytes(bArr);
                secureRandom2.nextBytes(bArr2);
                length = bArr.length;
                while (i < length) {
                }
                jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - j > 30000) {
                }
                strM9196 = AbstractC5049.m9196(bArr2);
                length2 = strM9196.length();
                arrayList2 = new ArrayList((length2 / 16) + (length2 % 16 == 0 ? 0 : i5));
                i2 = 0;
                while (true) {
                    if (i2 < 0) {
                        List listM9342 = AbstractC5176.m9342(AbstractC5176.m9352(arrayList, arrayList2));
                        Collections.shuffle(listM9342, secureRandom2);
                        list = listM9342;
                        size = ((ArrayList) listM9342).size() / 2;
                        arrayList3 = arrayList;
                        i3 = 0;
                        break;
                    }
                    int i6 = i2 + 16;
                    CharSequence charSequenceSubSequence = strM9196.subSequence(i2, (i6 >= 0 || i6 > length2) ? length2 : i6);
                    charSequenceSubSequence.getClass();
                    arrayList2.add(charSequenceSubSequence.toString());
                    i2 = i6;
                }
                if (i3 < size) {
                }
            }
            Iterator it = AbstractC5051.f13055.iterator();
            while (true) {
                if (it.hasNext()) {
                    String str = (String) it.next();
                    if (str != null) {
                        try {
                            secureRandom3 = SecureRandom.getInstance(str);
                        } catch (NoSuchAlgorithmException unused2) {
                            secureRandom3 = null;
                        }
                    } else {
                        secureRandom3 = new SecureRandom();
                    }
                    if (secureRandom3 != null) {
                        secureRandom = secureRandom3;
                        break;
                    }
                } else {
                    AbstractC9968.m15262("io.ktor.util.random").warn("None of the " + AbstractC5176.m9369(AbstractC5051.f13055, ", ", null, null, null, 62) + " found, fallback to default");
                    try {
                        secureRandom = new SecureRandom();
                    } catch (NoSuchAlgorithmException unused3) {
                        secureRandom = null;
                    }
                    if (secureRandom == null) {
                        C6755.m11870("No SecureRandom implementation found");
                        return null;
                    }
                }
            }
            secureRandom2 = SecureRandom.getInstance("SHA1PRNG");
            bArr = new byte[128];
            bArr2 = new byte[512];
            secureRandom2.setSeed(secureRandom.generateSeed(128));
            j = 0;
            interfaceC6039 = c6022;
            secureRandom.nextBytes(bArr);
            secureRandom2.nextBytes(bArr2);
            length = bArr.length;
            while (i < length) {
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - j > 30000) {
            }
            strM9196 = AbstractC5049.m9196(bArr2);
            length2 = strM9196.length();
            arrayList2 = new ArrayList((length2 / 16) + (length2 % 16 == 0 ? 0 : i5));
            i2 = 0;
            while (true) {
                if (i2 < 0) {
                }
                CharSequence charSequenceSubSequence2 = strM9196.subSequence(i2, (i6 >= 0 || i6 > length2) ? length2 : i6);
                charSequenceSubSequence2.getClass();
                arrayList2.add(charSequenceSubSequence2.toString());
                i2 = i6;
            }
            if (i3 < size) {
            }
        } else {
            if (i4 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            size = this.I$1;
            i3 = this.I$0;
            long j2 = this.J$0;
            list = (List) this.L$6;
            byte[] bArr3 = (byte[]) this.L$5;
            byte[] bArr4 = (byte[]) this.L$4;
            SecureRandom secureRandom4 = (SecureRandom) this.L$3;
            SecureRandom secureRandom5 = (SecureRandom) this.L$2;
            ArrayList arrayList4 = (ArrayList) this.L$1;
            interfaceC6039 = (InterfaceC6039) this.L$0;
            try {
                AbstractC6017.m10769(obj);
                bArr2 = bArr3;
                bArr = bArr4;
                arrayList3 = arrayList4;
                int i7 = 1;
                secureRandom2 = secureRandom4;
                secureRandom = secureRandom5;
                j = j2;
                i3 += i7;
                if (i3 < size) {
                    Object obj2 = list.get(i3);
                    this.L$0 = interfaceC6039;
                    this.L$1 = arrayList3;
                    this.L$2 = secureRandom;
                    this.L$3 = secureRandom2;
                    this.L$4 = bArr;
                    this.L$5 = bArr2;
                    this.L$6 = list;
                    this.J$0 = j;
                    this.I$0 = i3;
                    this.I$1 = size;
                    i7 = 1;
                    this.label = 1;
                    if (interfaceC6039.mo8992(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i3 += i7;
                    if (i3 < size) {
                        arrayList3.clear();
                        int size2 = list.size();
                        for (int size3 = list.size() / 2; size3 < size2; size3++) {
                            arrayList3.add(list.get(size3));
                        }
                        arrayList = arrayList3;
                        i5 = 1;
                        secureRandom.nextBytes(bArr);
                        secureRandom2.nextBytes(bArr2);
                        length = bArr.length;
                        for (i = 0; i < length; i++) {
                            bArr2[i * 4] = bArr[i];
                        }
                        jCurrentTimeMillis = System.currentTimeMillis();
                        if (jCurrentTimeMillis - j > 30000) {
                            secureRandom2.setSeed(j - jCurrentTimeMillis);
                            secureRandom2.setSeed(secureRandom.generateSeed(bArr.length));
                            j = jCurrentTimeMillis;
                        } else {
                            secureRandom2.setSeed(bArr);
                        }
                        strM9196 = AbstractC5049.m9196(bArr2);
                        length2 = strM9196.length();
                        arrayList2 = new ArrayList((length2 / 16) + (length2 % 16 == 0 ? 0 : i5));
                        i2 = 0;
                        while (true) {
                            if (i2 < 0 || i2 >= length2) {
                                List listM93422 = AbstractC5176.m9342(AbstractC5176.m9352(arrayList, arrayList2));
                                Collections.shuffle(listM93422, secureRandom2);
                                list = listM93422;
                                size = ((ArrayList) listM93422).size() / 2;
                                arrayList3 = arrayList;
                                i3 = 0;
                                break;
                            }
                            int i62 = i2 + 16;
                            CharSequence charSequenceSubSequence22 = strM9196.subSequence(i2, (i62 >= 0 || i62 > length2) ? length2 : i62);
                            charSequenceSubSequence22.getClass();
                            arrayList2.add(charSequenceSubSequence22.toString());
                            i2 = i62;
                        }
                        if (i3 < size) {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC6039.mo8994(th);
                    interfaceC6039.mo8994(null);
                    return C6008.f15084;
                } catch (Throwable th2) {
                    interfaceC6039.mo8994(null);
                    throw th2;
                }
            }
        }
    }
}
