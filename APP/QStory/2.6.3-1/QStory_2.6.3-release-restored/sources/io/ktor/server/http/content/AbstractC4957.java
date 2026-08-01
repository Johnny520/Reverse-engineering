package io.ktor.server.http.content;

import androidx.compose.foundation.C1905;
import com.alibaba.fastjson2.AbstractC3738;
import com.bumptech.glide.AbstractC3888;
import com.materialkolor.dynamiccolor.C4639;
import io.ktor.client.plugins.C4751;
import io.ktor.http.content.AbstractC4826;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.response.InterfaceC4968;
import io.ktor.util.C5036;
import io.ktor.util.C5041;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Pair;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.C5178;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.AbstractC5922;
import kotlin.reflect.C5917;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5947;
import kotlin.sequences.C5948;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p075.C7686;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8952;
import p252.C8954;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4957 {
    static {
        AbstractC5228.f13320.mo9476(List.class);
        try {
            C5917 c5917 = C5917.f14981;
            AbstractC5228.m9470(List.class, AbstractC5922.m10659(AbstractC5228.m9471(CompressedFileType.class)));
        } catch (Throwable unused) {
        }
        if (AbstractC5976.m10731("StaticContentCompressed")) {
            C6755.m11869("Name can't be blank");
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static /* synthetic */ Object m9080(InterfaceC4889 interfaceC4889, String str, String str2, List list, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, ContinuationImpl continuationImpl, int i) {
        if ((i & 8) != 0) {
            interfaceC7387 = new C4639(16);
        }
        return m9081(interfaceC4889, str, str2, list, interfaceC7387, (i & 16) != 0 ? new C4639(17) : interfaceC73872, (i & 32) != 0 ? new PreCompressedKt$respondStaticResource$4(null) : interfaceC7380, new C4639(18), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x020f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0210 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9081(InterfaceC4889 interfaceC4889, String str, String str2, List list, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, InterfaceC7387 interfaceC73873, ContinuationImpl continuationImpl) throws IOException {
        PreCompressedKt$respondStaticResource$1 preCompressedKt$respondStaticResource$1;
        C4950 c4950;
        Pair pairM9079;
        C4751 c4751;
        InterfaceC5919 interfaceC5919M9471;
        C7686 c7686;
        Object second;
        InterfaceC5919 interfaceC5919M94712;
        C7686 c76862;
        InterfaceC4889 interfaceC48892 = interfaceC4889;
        if (continuationImpl instanceof PreCompressedKt$respondStaticResource$1) {
            preCompressedKt$respondStaticResource$1 = (PreCompressedKt$respondStaticResource$1) continuationImpl;
            int i = preCompressedKt$respondStaticResource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preCompressedKt$respondStaticResource$1.label = i - Integer.MIN_VALUE;
            } else {
                preCompressedKt$respondStaticResource$1 = new PreCompressedKt$respondStaticResource$1(continuationImpl);
            }
        }
        Object obj = preCompressedKt$respondStaticResource$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = preCompressedKt$respondStaticResource$1.label;
        C6008 c6008 = C6008.f15084;
        InterfaceC5919 interfaceC5919M94713 = null;
        switch (i2) {
            case 0:
                AbstractC6017.m10769(obj);
                interfaceC48892.getAttributes().m9145(AbstractC4954.f12858, str);
                List listM6870 = AbstractC3738.m6870(interfaceC48892.mo9018());
                listM6870.getClass();
                interfaceC7387.getClass();
                ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM6870, 10));
                Iterator it = listM6870.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C8952) it.next()).f22767);
                }
                Set setM9347 = AbstractC5176.m9347(arrayList);
                if (list != null) {
                    C5948 c5948 = new C5948(AbstractC5954.m10671(new C5947(new C5178(list, 1), true, new C1905(setM9347, 17)), new C4956(str, interfaceC48892, str2, interfaceC7387)));
                    c4950 = (C4950) (!c5948.hasNext() ? null : c5948.next());
                } else {
                    c4950 = null;
                }
                if (c4950 != null) {
                    Object obj3 = c4950.f12852;
                    if (!((Boolean) interfaceC73873.invoke(obj3)).booleanValue()) {
                        C5041 c5041 = AbstractC4951.f12853;
                        interfaceC48892.getAttributes().m9145(AbstractC4951.f12853, Boolean.TRUE);
                        String strM9369 = AbstractC5176.m9369((Iterable) interfaceC73872.invoke(obj3), ", ", null, null, null, 62);
                        if (strM9369.length() > 0) {
                            InterfaceC4968 interfaceC4968Mo9020 = interfaceC48892.mo9020();
                            String[] strArr = AbstractC8944.f22758;
                            AbstractC3888.m7249(interfaceC4968Mo9020, "Cache-Control", strM9369);
                        }
                        preCompressedKt$respondStaticResource$1.L$0 = interfaceC48892;
                        preCompressedKt$respondStaticResource$1.L$1 = c4950;
                        preCompressedKt$respondStaticResource$1.label = 2;
                        if (interfaceC7380.invoke(obj3, interfaceC48892, preCompressedKt$respondStaticResource$1) != obj2) {
                            c4751 = new C4751(c4950.f12851, c4950.f12850.getEncoding());
                            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C4751.class);
                            try {
                                interfaceC5919M9471 = AbstractC5228.m9471(C4751.class);
                            } catch (Throwable unused) {
                                interfaceC5919M9471 = null;
                            }
                            c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
                            preCompressedKt$respondStaticResource$1.L$0 = null;
                            preCompressedKt$respondStaticResource$1.L$1 = null;
                            preCompressedKt$respondStaticResource$1.label = 3;
                            if (interfaceC48892.mo9021(c4751, c7686, preCompressedKt$respondStaticResource$1) == obj2) {
                            }
                        }
                        break;
                    } else {
                        C8926 c8926 = C8926.f22699;
                        InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(C8926.class);
                        try {
                            interfaceC5919M94713 = AbstractC5228.m9471(C8926.class);
                            break;
                        } catch (Throwable unused2) {
                        }
                        C7686 c76863 = new C7686(interfaceC5925Mo94762, interfaceC5919M94713);
                        preCompressedKt$respondStaticResource$1.label = 1;
                        if (interfaceC48892.mo9021(c8926, c76863, preCompressedKt$respondStaticResource$1) != obj2) {
                            return c6008;
                        }
                    }
                    return obj2;
                }
                pairM9079 = AbstractC4955.m9079(interfaceC48892.mo9019(), str, str2, interfaceC7387);
                if (pairM9079 != null) {
                    if (!((Boolean) interfaceC73873.invoke(pairM9079.getFirst())).booleanValue()) {
                        String strM93692 = AbstractC5176.m9369((Iterable) interfaceC73872.invoke(pairM9079.getFirst()), ", ", null, null, null, 62);
                        if (strM93692.length() > 0) {
                            InterfaceC4968 interfaceC4968Mo90202 = interfaceC48892.mo9020();
                            String[] strArr2 = AbstractC8944.f22758;
                            AbstractC3888.m7249(interfaceC4968Mo90202, "Cache-Control", strM93692);
                        }
                        Object first = pairM9079.getFirst();
                        preCompressedKt$respondStaticResource$1.L$0 = interfaceC48892;
                        preCompressedKt$respondStaticResource$1.L$1 = pairM9079;
                        preCompressedKt$respondStaticResource$1.label = 5;
                        if (interfaceC7380.invoke(first, interfaceC48892, preCompressedKt$respondStaticResource$1) != obj2) {
                            second = pairM9079.getSecond();
                            InterfaceC5925 interfaceC5925Mo94763 = AbstractC5228.f13320.mo9476(AbstractC4826.class);
                            try {
                                interfaceC5919M94712 = AbstractC5228.m9471(AbstractC4826.class);
                            } catch (Throwable unused3) {
                                interfaceC5919M94712 = null;
                            }
                            c76862 = new C7686(interfaceC5925Mo94763, interfaceC5919M94712);
                            preCompressedKt$respondStaticResource$1.L$0 = null;
                            preCompressedKt$respondStaticResource$1.L$1 = null;
                            preCompressedKt$respondStaticResource$1.label = 6;
                            if (interfaceC48892.mo9021(second, c76862, preCompressedKt$respondStaticResource$1) != obj2) {
                            }
                        }
                        break;
                    } else {
                        C8926 c89262 = C8926.f22699;
                        InterfaceC5925 interfaceC5925Mo94764 = AbstractC5228.f13320.mo9476(C8926.class);
                        try {
                            interfaceC5919M94713 = AbstractC5228.m9471(C8926.class);
                            break;
                        } catch (Throwable unused4) {
                        }
                        C7686 c76864 = new C7686(interfaceC5925Mo94764, interfaceC5919M94713);
                        preCompressedKt$respondStaticResource$1.label = 4;
                        if (interfaceC48892.mo9021(c89262, c76864, preCompressedKt$respondStaticResource$1) == obj2) {
                        }
                    }
                    return obj2;
                }
                return c6008;
            case 1:
                AbstractC6017.m10769(obj);
                return c6008;
            case 2:
                C4950 c49502 = (C4950) preCompressedKt$respondStaticResource$1.L$1;
                InterfaceC4889 interfaceC48893 = (InterfaceC4889) preCompressedKt$respondStaticResource$1.L$0;
                AbstractC6017.m10769(obj);
                c4950 = c49502;
                interfaceC48892 = interfaceC48893;
                c4751 = new C4751(c4950.f12851, c4950.f12850.getEncoding());
                InterfaceC5925 interfaceC5925Mo94765 = AbstractC5228.f13320.mo9476(C4751.class);
                interfaceC5919M9471 = AbstractC5228.m9471(C4751.class);
                c7686 = new C7686(interfaceC5925Mo94765, interfaceC5919M9471);
                preCompressedKt$respondStaticResource$1.L$0 = null;
                preCompressedKt$respondStaticResource$1.L$1 = null;
                preCompressedKt$respondStaticResource$1.label = 3;
                if (interfaceC48892.mo9021(c4751, c7686, preCompressedKt$respondStaticResource$1) == obj2) {
                    return obj2;
                }
                break;
            case 3:
                AbstractC6017.m10769(obj);
                return c6008;
            case 4:
                AbstractC6017.m10769(obj);
                return c6008;
            case 5:
                Pair pair = (Pair) preCompressedKt$respondStaticResource$1.L$1;
                InterfaceC4889 interfaceC48894 = (InterfaceC4889) preCompressedKt$respondStaticResource$1.L$0;
                AbstractC6017.m10769(obj);
                pairM9079 = pair;
                interfaceC48892 = interfaceC48894;
                second = pairM9079.getSecond();
                InterfaceC5925 interfaceC5925Mo947632 = AbstractC5228.f13320.mo9476(AbstractC4826.class);
                interfaceC5919M94712 = AbstractC5228.m9471(AbstractC4826.class);
                c76862 = new C7686(interfaceC5925Mo947632, interfaceC5919M94712);
                preCompressedKt$respondStaticResource$1.L$0 = null;
                preCompressedKt$respondStaticResource$1.L$1 = null;
                preCompressedKt$respondStaticResource$1.label = 6;
                if (interfaceC48892.mo9021(second, c76862, preCompressedKt$respondStaticResource$1) != obj2) {
                }
                break;
            case 6:
                AbstractC6017.m10769(obj);
                return c6008;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9082(InterfaceC4889 interfaceC4889, Path path, List list, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, ContinuationImpl continuationImpl) {
        PreCompressedKt$respondStaticPath$1 preCompressedKt$respondStaticPath$1;
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5919 interfaceC5919M94712;
        if (continuationImpl instanceof PreCompressedKt$respondStaticPath$1) {
            preCompressedKt$respondStaticPath$1 = (PreCompressedKt$respondStaticPath$1) continuationImpl;
            int i = preCompressedKt$respondStaticPath$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preCompressedKt$respondStaticPath$1.label = i - Integer.MIN_VALUE;
            } else {
                preCompressedKt$respondStaticPath$1 = new PreCompressedKt$respondStaticPath$1(continuationImpl);
            }
        }
        Object obj = preCompressedKt$respondStaticPath$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = preCompressedKt$respondStaticPath$1.label;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            interfaceC4889.getAttributes().m9145(AbstractC4954.f12858, path.toString());
            AbstractC3738.m6870(interfaceC4889.mo9018());
            throw null;
        }
        C6008 c6008 = C6008.f15084;
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            CompressedFileType compressedFileType = (CompressedFileType) preCompressedKt$respondStaticPath$1.L$4;
            Path path2 = (Path) preCompressedKt$respondStaticPath$1.L$3;
            InterfaceC7387 interfaceC73873 = (InterfaceC7387) preCompressedKt$respondStaticPath$1.L$2;
            Path path3 = (Path) preCompressedKt$respondStaticPath$1.L$1;
            InterfaceC4889 interfaceC48892 = (InterfaceC4889) preCompressedKt$respondStaticPath$1.L$0;
            AbstractC6017.m10769(obj);
            C4751 c4751 = new C4751(new C4952(path2, (C8954) interfaceC73873.invoke(path3)), compressedFileType.getEncoding());
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C4751.class);
            try {
                interfaceC5919M94712 = AbstractC5228.m9471(C4751.class);
            } catch (Throwable unused) {
                interfaceC5919M94712 = null;
            }
            C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M94712);
            preCompressedKt$respondStaticPath$1.L$0 = null;
            preCompressedKt$respondStaticPath$1.L$1 = null;
            preCompressedKt$respondStaticPath$1.L$2 = null;
            preCompressedKt$respondStaticPath$1.L$3 = null;
            preCompressedKt$respondStaticPath$1.L$4 = null;
            preCompressedKt$respondStaticPath$1.label = 4;
            return interfaceC48892.mo9021(c4751, c7686, preCompressedKt$respondStaticPath$1) == coroutineSingletons ? coroutineSingletons : c6008;
        }
        InterfaceC7387 interfaceC73874 = (InterfaceC7387) preCompressedKt$respondStaticPath$1.L$2;
        Path path4 = (Path) preCompressedKt$respondStaticPath$1.L$1;
        InterfaceC4889 interfaceC48893 = (InterfaceC4889) preCompressedKt$respondStaticPath$1.L$0;
        AbstractC6017.m10769(obj);
        C4952 c4952 = new C4952(path4, (C8954) interfaceC73874.invoke(path4));
        InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(C4952.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(C4952.class);
        } catch (Throwable unused2) {
            interfaceC5919M9471 = null;
        }
        C7686 c76862 = new C7686(interfaceC5925Mo94762, interfaceC5919M9471);
        preCompressedKt$respondStaticPath$1.L$0 = null;
        preCompressedKt$respondStaticPath$1.L$1 = null;
        preCompressedKt$respondStaticPath$1.L$2 = null;
        preCompressedKt$respondStaticPath$1.label = 2;
        if (interfaceC48893.mo9021(c4952, c76862, preCompressedKt$respondStaticPath$1) == coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0221 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0222 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9084(InterfaceC4889 interfaceC4889, File file, List list, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, ContinuationImpl continuationImpl) throws IOException {
        PreCompressedKt$respondStaticFile$1 preCompressedKt$respondStaticFile$1;
        CompressedFileType compressedFileType;
        File file2;
        Object next;
        C4953 c4953;
        InterfaceC5919 interfaceC5919M9471;
        C7686 c7686;
        InterfaceC5919 interfaceC5919M94712;
        InterfaceC4889 interfaceC48892 = interfaceC4889;
        File file3 = file;
        InterfaceC7387 interfaceC73873 = interfaceC7387;
        if (continuationImpl instanceof PreCompressedKt$respondStaticFile$1) {
            preCompressedKt$respondStaticFile$1 = (PreCompressedKt$respondStaticFile$1) continuationImpl;
            int i = preCompressedKt$respondStaticFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                preCompressedKt$respondStaticFile$1.label = i - Integer.MIN_VALUE;
            } else {
                preCompressedKt$respondStaticFile$1 = new PreCompressedKt$respondStaticFile$1(continuationImpl);
            }
        }
        Object obj = preCompressedKt$respondStaticFile$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = preCompressedKt$respondStaticFile$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C5036 attributes = interfaceC48892.getAttributes();
            C5041 c5041 = AbstractC4954.f12858;
            String path = file3.getPath();
            path.getClass();
            attributes.m9145(c5041, path);
            List listM6870 = AbstractC3738.m6870(interfaceC48892.mo9018());
            listM6870.getClass();
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(listM6870, 10));
            Iterator it = listM6870.iterator();
            while (it.hasNext()) {
                arrayList.add(((C8952) it.next()).f22767);
            }
            Set setM9347 = AbstractC5176.m9347(arrayList);
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : list) {
                    if (setM9347.contains(((CompressedFileType) obj3).getEncoding())) {
                        arrayList2.add(obj3);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (new File(file3.getAbsolutePath() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + ((CompressedFileType) next).getExtension()).isFile()) {
                        break;
                    }
                }
                compressedFileType = (CompressedFileType) next;
            } else {
                compressedFileType = null;
            }
            String strM9369 = AbstractC5176.m9369((Iterable) interfaceC73872.invoke(file3), ", ", null, null, null, 62);
            if (compressedFileType == null) {
                if (file3.isFile()) {
                    if (strM9369.length() > 0) {
                        InterfaceC4968 interfaceC4968Mo9020 = interfaceC48892.mo9020();
                        String[] strArr = AbstractC8944.f22758;
                        AbstractC3888.m7249(interfaceC4968Mo9020, "Cache-Control", strM9369);
                    }
                    preCompressedKt$respondStaticFile$1.L$0 = interfaceC48892;
                    preCompressedKt$respondStaticFile$1.L$1 = file3;
                    preCompressedKt$respondStaticFile$1.L$2 = interfaceC73873;
                    preCompressedKt$respondStaticFile$1.label = 1;
                    if (interfaceC7380.invoke(file3, interfaceC48892, preCompressedKt$respondStaticFile$1) != obj2) {
                        c4953 = new C4953(file3, (C8954) interfaceC73873.invoke(file3));
                        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C4953.class);
                        interfaceC5919M9471 = AbstractC5228.m9471(C4953.class);
                        c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
                        preCompressedKt$respondStaticFile$1.L$0 = null;
                        preCompressedKt$respondStaticFile$1.L$1 = null;
                        preCompressedKt$respondStaticFile$1.L$2 = null;
                        preCompressedKt$respondStaticFile$1.label = 2;
                        if (interfaceC48892.mo9021(c4953, c7686, preCompressedKt$respondStaticFile$1) != obj2) {
                        }
                    }
                }
            }
            C5041 c50412 = AbstractC4951.f12853;
            interfaceC48892.getAttributes().m9145(AbstractC4951.f12853, Boolean.TRUE);
            file2 = new File(file3.getAbsolutePath() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + compressedFileType.getExtension());
            if (strM9369.length() > 0) {
                InterfaceC4968 interfaceC4968Mo90202 = interfaceC48892.mo9020();
                String[] strArr2 = AbstractC8944.f22758;
                AbstractC3888.m7249(interfaceC4968Mo90202, "Cache-Control", strM9369);
            }
            preCompressedKt$respondStaticFile$1.L$0 = interfaceC48892;
            preCompressedKt$respondStaticFile$1.L$1 = file3;
            preCompressedKt$respondStaticFile$1.L$2 = interfaceC73873;
            preCompressedKt$respondStaticFile$1.L$3 = compressedFileType;
            preCompressedKt$respondStaticFile$1.L$4 = file2;
            preCompressedKt$respondStaticFile$1.label = 3;
            if (interfaceC7380.invoke(file3, interfaceC48892, preCompressedKt$respondStaticFile$1) != obj2) {
                C4751 c4751 = new C4751(new C4953(file2, (C8954) interfaceC73873.invoke(file3)), compressedFileType.getEncoding());
                InterfaceC5925 interfaceC5925Mo94762 = AbstractC5228.f13320.mo9476(C4751.class);
                interfaceC5919M94712 = AbstractC5228.m9471(C4751.class);
                C7686 c76862 = new C7686(interfaceC5925Mo94762, interfaceC5919M94712);
                preCompressedKt$respondStaticFile$1.L$0 = null;
                preCompressedKt$respondStaticFile$1.L$1 = null;
                preCompressedKt$respondStaticFile$1.L$2 = null;
                preCompressedKt$respondStaticFile$1.L$3 = null;
                preCompressedKt$respondStaticFile$1.L$4 = null;
                preCompressedKt$respondStaticFile$1.label = 4;
                if (interfaceC48892.mo9021(c4751, c76862, preCompressedKt$respondStaticFile$1) != obj2) {
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            File file4 = (File) preCompressedKt$respondStaticFile$1.L$4;
            CompressedFileType compressedFileType2 = (CompressedFileType) preCompressedKt$respondStaticFile$1.L$3;
            interfaceC73873 = (InterfaceC7387) preCompressedKt$respondStaticFile$1.L$2;
            File file5 = (File) preCompressedKt$respondStaticFile$1.L$1;
            InterfaceC4889 interfaceC48893 = (InterfaceC4889) preCompressedKt$respondStaticFile$1.L$0;
            AbstractC6017.m10769(obj);
            file2 = file4;
            compressedFileType = compressedFileType2;
            file3 = file5;
            interfaceC48892 = interfaceC48893;
            C4751 c47512 = new C4751(new C4953(file2, (C8954) interfaceC73873.invoke(file3)), compressedFileType.getEncoding());
            InterfaceC5925 interfaceC5925Mo947622 = AbstractC5228.f13320.mo9476(C4751.class);
            try {
                interfaceC5919M94712 = AbstractC5228.m9471(C4751.class);
            } catch (Throwable unused) {
                interfaceC5919M94712 = null;
            }
            C7686 c768622 = new C7686(interfaceC5925Mo947622, interfaceC5919M94712);
            preCompressedKt$respondStaticFile$1.L$0 = null;
            preCompressedKt$respondStaticFile$1.L$1 = null;
            preCompressedKt$respondStaticFile$1.L$2 = null;
            preCompressedKt$respondStaticFile$1.L$3 = null;
            preCompressedKt$respondStaticFile$1.L$4 = null;
            preCompressedKt$respondStaticFile$1.label = 4;
            return interfaceC48892.mo9021(c47512, c768622, preCompressedKt$respondStaticFile$1) != obj2 ? obj2 : c6008;
        }
        InterfaceC7387 interfaceC73874 = (InterfaceC7387) preCompressedKt$respondStaticFile$1.L$2;
        file3 = (File) preCompressedKt$respondStaticFile$1.L$1;
        InterfaceC4889 interfaceC48894 = (InterfaceC4889) preCompressedKt$respondStaticFile$1.L$0;
        AbstractC6017.m10769(obj);
        interfaceC73873 = interfaceC73874;
        interfaceC48892 = interfaceC48894;
        c4953 = new C4953(file3, (C8954) interfaceC73873.invoke(file3));
        InterfaceC5925 interfaceC5925Mo94763 = AbstractC5228.f13320.mo9476(C4953.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(C4953.class);
        } catch (Throwable unused2) {
            interfaceC5919M9471 = null;
        }
        c7686 = new C7686(interfaceC5925Mo94763, interfaceC5919M9471);
        preCompressedKt$respondStaticFile$1.L$0 = null;
        preCompressedKt$respondStaticFile$1.L$1 = null;
        preCompressedKt$respondStaticFile$1.L$2 = null;
        preCompressedKt$respondStaticFile$1.label = 2;
        if (interfaceC48892.mo9021(c4953, c7686, preCompressedKt$respondStaticFile$1) != obj2) {
        }
    }
}
