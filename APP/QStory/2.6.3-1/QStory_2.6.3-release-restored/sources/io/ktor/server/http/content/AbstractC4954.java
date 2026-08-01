package io.ktor.server.http.content;

import androidx.activity.AbstractC0900;
import com.alibaba.fastjson2.C3775;
import io.ktor.server.application.AbstractC4892;
import io.ktor.server.application.AbstractC4898;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.util.AbstractC5049;
import io.ktor.util.C5041;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.text.AbstractC5976;
import net.bytebuddy.pool.TypePool;
import p068.InterfaceC7380;
import p068.InterfaceC7387;
import p075.C7686;
import p252.C8926;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: io.ktor.server.http.content.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4954 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5041 f12858;

    static {
        InterfaceC5919 interfaceC5919M9471;
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(String.class);
        try {
            interfaceC5919M9471 = AbstractC5228.m9471(String.class);
        } catch (Throwable unused) {
            interfaceC5919M9471 = null;
        }
        f12858 = new C5041("StaticFileLocation", new C7686(interfaceC5925Mo9476, interfaceC5919M9471));
        AbstractC5228.f13320.mo9476(File.class);
        try {
            AbstractC5228.m9471(File.class);
        } catch (Throwable unused2) {
        }
        if (AbstractC5976.m10731("BaseFolder")) {
            C6755.m11869("Name can't be blank");
            return;
        }
        AbstractC5228.f13320.mo9476(AbstractC4892.class);
        try {
            AbstractC5228.m9471(AbstractC4892.class);
        } catch (Throwable unused3) {
        }
        if (AbstractC5976.m10731("StaticContentAutoHead")) {
            C6755.m11869("Name can't be blank");
            return;
        }
        AbstractC5228.f13320.mo9476(String.class);
        try {
            AbstractC5228.m9471(String.class);
        } catch (Throwable unused4) {
        }
        if (AbstractC5976.m10731("BasePackage")) {
            C6755.m11869("Name can't be blank");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9074(InterfaceC7387 interfaceC7387, InterfaceC4889 interfaceC4889, Path path, ContinuationImpl continuationImpl) {
        StaticContentKt$respondStaticPath$checkExclude$1 staticContentKt$respondStaticPath$checkExclude$1;
        if (continuationImpl instanceof StaticContentKt$respondStaticPath$checkExclude$1) {
            staticContentKt$respondStaticPath$checkExclude$1 = (StaticContentKt$respondStaticPath$checkExclude$1) continuationImpl;
            int i = staticContentKt$respondStaticPath$checkExclude$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                staticContentKt$respondStaticPath$checkExclude$1.label = i - Integer.MIN_VALUE;
            } else {
                staticContentKt$respondStaticPath$checkExclude$1 = new StaticContentKt$respondStaticPath$checkExclude$1(continuationImpl);
            }
        }
        Object obj = staticContentKt$respondStaticPath$checkExclude$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = staticContentKt$respondStaticPath$checkExclude$1.label;
        InterfaceC5919 interfaceC5919M9471 = null;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (!((Boolean) interfaceC7387.invoke(path)).booleanValue()) {
                return Boolean.FALSE;
            }
            Object obj3 = C8926.f22699;
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8926.class);
            try {
                interfaceC5919M9471 = AbstractC5228.m9471(C8926.class);
            } catch (Throwable unused) {
            }
            C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
            staticContentKt$respondStaticPath$checkExclude$1.label = 1;
            if (interfaceC4889.mo9021(obj3, c7686, staticContentKt$respondStaticPath$checkExclude$1) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9075(InterfaceC7387 interfaceC7387, InterfaceC4889 interfaceC4889, File file, ContinuationImpl continuationImpl) {
        StaticContentKt$respondStaticFile$checkExclude$1 staticContentKt$respondStaticFile$checkExclude$1;
        if (continuationImpl instanceof StaticContentKt$respondStaticFile$checkExclude$1) {
            staticContentKt$respondStaticFile$checkExclude$1 = (StaticContentKt$respondStaticFile$checkExclude$1) continuationImpl;
            int i = staticContentKt$respondStaticFile$checkExclude$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                staticContentKt$respondStaticFile$checkExclude$1.label = i - Integer.MIN_VALUE;
            } else {
                staticContentKt$respondStaticFile$checkExclude$1 = new StaticContentKt$respondStaticFile$checkExclude$1(continuationImpl);
            }
        }
        Object obj = staticContentKt$respondStaticFile$checkExclude$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = staticContentKt$respondStaticFile$checkExclude$1.label;
        InterfaceC5919 interfaceC5919M9471 = null;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            if (!((Boolean) interfaceC7387.invoke(file)).booleanValue()) {
                return Boolean.FALSE;
            }
            Object obj3 = C8926.f22699;
            InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8926.class);
            try {
                interfaceC5919M9471 = AbstractC5228.m9471(C8926.class);
            } catch (Throwable unused) {
            }
            C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
            staticContentKt$respondStaticFile$checkExclude$1.label = 1;
            if (interfaceC4889.mo9021(obj3, c7686, staticContentKt$respondStaticFile$checkExclude$1) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x017b, code lost:
    
        if (r0 == r1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0183, code lost:
    
        if (io.ktor.server.application.AbstractC4898.m9028(r15) != false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x017b -> B:21:0x0090). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9076(InterfaceC4889 interfaceC4889, String str, String str2, List list, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, InterfaceC7387 interfaceC73873, List list2, String str3, ContinuationImpl continuationImpl) throws IOException {
        StaticContentKt$respondStaticResource$1 staticContentKt$respondStaticResource$1;
        String str4;
        List list3;
        String str5;
        List list4;
        InterfaceC7387 interfaceC73874;
        InterfaceC7387 interfaceC73875;
        InterfaceC7380 interfaceC73802;
        InterfaceC7387 interfaceC73876;
        String str6;
        String str7;
        InterfaceC4889 interfaceC48892;
        String str8;
        Iterator it;
        String str9;
        String str10;
        String str11;
        InterfaceC7380 interfaceC73803;
        InterfaceC7387 interfaceC73877;
        InterfaceC7387 interfaceC73878;
        List list5;
        String str12;
        InterfaceC4889 interfaceC48893;
        String str13;
        if (continuationImpl instanceof StaticContentKt$respondStaticResource$1) {
            staticContentKt$respondStaticResource$1 = (StaticContentKt$respondStaticResource$1) continuationImpl;
            int i = staticContentKt$respondStaticResource$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                staticContentKt$respondStaticResource$1.label = i - Integer.MIN_VALUE;
            } else {
                staticContentKt$respondStaticResource$1 = new StaticContentKt$respondStaticResource$1(continuationImpl);
            }
        }
        StaticContentKt$respondStaticResource$1 staticContentKt$respondStaticResource$12 = staticContentKt$respondStaticResource$1;
        Object obj = staticContentKt$respondStaticResource$12.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = staticContentKt$respondStaticResource$12.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            List listMo8913 = interfaceC4889.getParameters().mo8913("static-content-path-parameter");
            if (listMo8913 != null) {
                String str14 = File.separator;
                str14.getClass();
                String strM9369 = AbstractC5176.m9369(listMo8913, str14, null, null, null, 62);
                staticContentKt$respondStaticResource$12.L$0 = interfaceC4889;
                str4 = str;
                staticContentKt$respondStaticResource$12.L$1 = str4;
                staticContentKt$respondStaticResource$12.L$2 = str2;
                staticContentKt$respondStaticResource$12.L$3 = list;
                staticContentKt$respondStaticResource$12.L$4 = interfaceC7387;
                staticContentKt$respondStaticResource$12.L$5 = interfaceC73872;
                staticContentKt$respondStaticResource$12.L$6 = interfaceC7380;
                staticContentKt$respondStaticResource$12.L$7 = interfaceC73873;
                list3 = list2;
                staticContentKt$respondStaticResource$12.L$8 = list3;
                staticContentKt$respondStaticResource$12.L$9 = str3;
                staticContentKt$respondStaticResource$12.L$10 = strM9369;
                staticContentKt$respondStaticResource$12.label = 1;
                if (AbstractC4957.m9081(interfaceC4889, strM9369, str2, list, interfaceC7387, interfaceC73872, interfaceC7380, interfaceC73873, staticContentKt$respondStaticResource$12) != coroutineSingletons) {
                    str5 = str2;
                    list4 = list;
                    interfaceC73874 = interfaceC7387;
                    interfaceC73875 = interfaceC73872;
                    interfaceC73802 = interfaceC7380;
                    interfaceC73876 = interfaceC73873;
                    str6 = strM9369;
                    str7 = str3;
                    interfaceC48892 = interfaceC4889;
                }
                return coroutineSingletons;
            }
            return c6008;
        }
        if (i2 == 1) {
            str6 = (String) staticContentKt$respondStaticResource$12.L$10;
            str7 = (String) staticContentKt$respondStaticResource$12.L$9;
            List list6 = (List) staticContentKt$respondStaticResource$12.L$8;
            interfaceC73876 = (InterfaceC7387) staticContentKt$respondStaticResource$12.L$7;
            interfaceC73802 = (InterfaceC7380) staticContentKt$respondStaticResource$12.L$6;
            interfaceC73875 = (InterfaceC7387) staticContentKt$respondStaticResource$12.L$5;
            interfaceC73874 = (InterfaceC7387) staticContentKt$respondStaticResource$12.L$4;
            list4 = (List) staticContentKt$respondStaticResource$12.L$3;
            String str15 = (String) staticContentKt$respondStaticResource$12.L$2;
            String str16 = (String) staticContentKt$respondStaticResource$12.L$1;
            interfaceC48892 = (InterfaceC4889) staticContentKt$respondStaticResource$12.L$0;
            AbstractC6017.m10769(obj);
            str5 = str15;
            str4 = str16;
            list3 = list6;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        AbstractC6017.m10769(obj);
                        return c6008;
                    }
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str11 = (String) staticContentKt$respondStaticResource$12.L$6;
                interfaceC73803 = (InterfaceC7380) staticContentKt$respondStaticResource$12.L$5;
                interfaceC73877 = (InterfaceC7387) staticContentKt$respondStaticResource$12.L$4;
                interfaceC73878 = (InterfaceC7387) staticContentKt$respondStaticResource$12.L$3;
                list5 = (List) staticContentKt$respondStaticResource$12.L$2;
                str12 = (String) staticContentKt$respondStaticResource$12.L$1;
                interfaceC48893 = (InterfaceC4889) staticContentKt$respondStaticResource$12.L$0;
                AbstractC6017.m10769(obj);
                list4 = list5;
                str10 = str12;
                interfaceC48892 = interfaceC48893;
                interfaceC73802 = interfaceC73803;
                interfaceC73875 = interfaceC73877;
                interfaceC73874 = interfaceC73878;
                str7 = str11;
                if (!AbstractC4898.m9028(interfaceC48892) && str7 != null) {
                    staticContentKt$respondStaticResource$12.L$0 = null;
                    staticContentKt$respondStaticResource$12.L$1 = null;
                    staticContentKt$respondStaticResource$12.L$2 = null;
                    staticContentKt$respondStaticResource$12.L$3 = null;
                    staticContentKt$respondStaticResource$12.L$4 = null;
                    staticContentKt$respondStaticResource$12.L$5 = null;
                    staticContentKt$respondStaticResource$12.L$6 = null;
                    staticContentKt$respondStaticResource$12.L$7 = null;
                    staticContentKt$respondStaticResource$12.L$8 = null;
                    staticContentKt$respondStaticResource$12.L$9 = null;
                    staticContentKt$respondStaticResource$12.L$10 = null;
                    staticContentKt$respondStaticResource$12.label = 4;
                    if (AbstractC4957.m9080(interfaceC48892, str7, str10, list4, interfaceC73874, interfaceC73875, interfaceC73802, staticContentKt$respondStaticResource$12, 64) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return c6008;
            }
            it = (Iterator) staticContentKt$respondStaticResource$12.L$10;
            String str17 = (String) staticContentKt$respondStaticResource$12.L$9;
            String str18 = (String) staticContentKt$respondStaticResource$12.L$8;
            interfaceC73876 = (InterfaceC7387) staticContentKt$respondStaticResource$12.L$7;
            interfaceC73802 = (InterfaceC7380) staticContentKt$respondStaticResource$12.L$6;
            interfaceC73875 = (InterfaceC7387) staticContentKt$respondStaticResource$12.L$5;
            interfaceC73874 = (InterfaceC7387) staticContentKt$respondStaticResource$12.L$4;
            list4 = (List) staticContentKt$respondStaticResource$12.L$3;
            str13 = (String) staticContentKt$respondStaticResource$12.L$2;
            str9 = (String) staticContentKt$respondStaticResource$12.L$1;
            interfaceC48892 = (InterfaceC4889) staticContentKt$respondStaticResource$12.L$0;
            AbstractC6017.m10769(obj);
            str8 = str17;
            str7 = str18;
            str5 = str13;
        }
        if (!AbstractC4898.m9028(interfaceC48892)) {
            str8 = str6;
            it = list3.iterator();
            str9 = str4;
            if (it.hasNext()) {
                String strM724 = AbstractC0900.m724(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, str8, (String) it.next());
                staticContentKt$respondStaticResource$12.L$0 = interfaceC48892;
                staticContentKt$respondStaticResource$12.L$1 = str9;
                staticContentKt$respondStaticResource$12.L$2 = str5;
                staticContentKt$respondStaticResource$12.L$3 = list4;
                staticContentKt$respondStaticResource$12.L$4 = interfaceC73874;
                staticContentKt$respondStaticResource$12.L$5 = interfaceC73875;
                staticContentKt$respondStaticResource$12.L$6 = interfaceC73802;
                staticContentKt$respondStaticResource$12.L$7 = interfaceC73876;
                staticContentKt$respondStaticResource$12.L$8 = str7;
                staticContentKt$respondStaticResource$12.L$9 = str8;
                staticContentKt$respondStaticResource$12.L$10 = it;
                staticContentKt$respondStaticResource$12.label = 2;
                String str19 = str5;
                InterfaceC7387 interfaceC73879 = interfaceC73875;
                InterfaceC7387 interfaceC738710 = interfaceC73874;
                List list7 = list4;
                InterfaceC4889 interfaceC48894 = interfaceC48892;
                Object objM9081 = AbstractC4957.m9081(interfaceC48894, strM724, str19, list7, interfaceC738710, interfaceC73879, interfaceC73802, interfaceC73876, staticContentKt$respondStaticResource$12);
                str13 = str19;
            } else {
                String str20 = str5;
                if (str9 != null) {
                    String strM711 = AbstractC0900.m711(AbstractC0900.m700(str8), File.separator, str9);
                    staticContentKt$respondStaticResource$12.L$0 = interfaceC48892;
                    staticContentKt$respondStaticResource$12.L$1 = str20;
                    staticContentKt$respondStaticResource$12.L$2 = list4;
                    staticContentKt$respondStaticResource$12.L$3 = interfaceC73874;
                    staticContentKt$respondStaticResource$12.L$4 = interfaceC73875;
                    staticContentKt$respondStaticResource$12.L$5 = interfaceC73802;
                    staticContentKt$respondStaticResource$12.L$6 = str7;
                    staticContentKt$respondStaticResource$12.L$7 = null;
                    staticContentKt$respondStaticResource$12.L$8 = null;
                    staticContentKt$respondStaticResource$12.L$9 = null;
                    staticContentKt$respondStaticResource$12.L$10 = null;
                    staticContentKt$respondStaticResource$12.label = 3;
                    if (AbstractC4957.m9080(interfaceC48892, strM711, str20, list4, interfaceC73874, interfaceC73875, interfaceC73802, staticContentKt$respondStaticResource$12, 64) != coroutineSingletons) {
                        str11 = str7;
                        interfaceC73803 = interfaceC73802;
                        interfaceC73877 = interfaceC73875;
                        interfaceC73878 = interfaceC73874;
                        list5 = list4;
                        str12 = str20;
                        interfaceC48893 = interfaceC48892;
                        list4 = list5;
                        str10 = str12;
                        interfaceC48892 = interfaceC48893;
                        interfaceC73802 = interfaceC73803;
                        interfaceC73875 = interfaceC73877;
                        interfaceC73874 = interfaceC73878;
                        str7 = str11;
                        if (!AbstractC4898.m9028(interfaceC48892)) {
                            staticContentKt$respondStaticResource$12.L$0 = null;
                            staticContentKt$respondStaticResource$12.L$1 = null;
                            staticContentKt$respondStaticResource$12.L$2 = null;
                            staticContentKt$respondStaticResource$12.L$3 = null;
                            staticContentKt$respondStaticResource$12.L$4 = null;
                            staticContentKt$respondStaticResource$12.L$5 = null;
                            staticContentKt$respondStaticResource$12.L$6 = null;
                            staticContentKt$respondStaticResource$12.L$7 = null;
                            staticContentKt$respondStaticResource$12.L$8 = null;
                            staticContentKt$respondStaticResource$12.L$9 = null;
                            staticContentKt$respondStaticResource$12.L$10 = null;
                            staticContentKt$respondStaticResource$12.label = 4;
                            if (AbstractC4957.m9080(interfaceC48892, str7, str10, list4, interfaceC73874, interfaceC73875, interfaceC73802, staticContentKt$respondStaticResource$12, 64) != coroutineSingletons) {
                            }
                        }
                    }
                } else {
                    str10 = str20;
                    if (!AbstractC4898.m9028(interfaceC48892)) {
                    }
                }
            }
            return coroutineSingletons;
        }
        return c6008;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x013f, code lost:
    
        if (io.ktor.server.http.content.AbstractC4957.m9082(r14, r3, r12, r11, r10, r9, r1) == r2) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0218 A[PHI: r6 r7 r9 r10 r11 r12 r15
  0x0218: PHI (r6v9 java.lang.String) = (r6v1 java.lang.String), (r6v12 java.lang.String) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r7v10 java.util.List) = (r7v1 java.util.List), (r7v13 java.util.List) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r9v9 io.ktor.server.http.content.飘花落叶言子楪世哲苏兰) = (r9v0 io.ktor.server.http.content.飘花落叶言子楪世哲苏兰), (r9v11 io.ktor.server.http.content.飘花落叶言子楪世哲苏兰) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r10v10 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏) = (r10v1 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏), (r10v12 飘花落叶言世子哲楪兰苏.飘花落叶言子楪哲兰世苏) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r11v10 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) = (r11v1 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世), (r11v12 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r12v10 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) = (r12v1 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世), (r12v12 飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]
  0x0218: PHI (r15v6 io.ktor.server.application.飘花落叶言子楪世苏兰哲) = (r15v1 io.ktor.server.application.飘花落叶言子楪世苏兰哲), (r15v8 io.ktor.server.application.飘花落叶言子楪世苏兰哲) binds: [B:63:0x020f, B:43:0x0159] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01d6 -> B:17:0x0067). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9077(InterfaceC4889 interfaceC4889, String str, String str2, List list, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, InterfaceC7387 interfaceC73873, List list2, String str3, ContinuationImpl continuationImpl) throws IOException {
        StaticContentKt$respondStaticPath$1 staticContentKt$respondStaticPath$1;
        String str4;
        InterfaceC7380 interfaceC73802;
        InterfaceC7387 interfaceC73874;
        InterfaceC7387 interfaceC73875;
        List list3;
        InterfaceC4889 interfaceC48892;
        InterfaceC4948 interfaceC4948;
        Path path;
        List list4;
        InterfaceC7387 interfaceC73876;
        InterfaceC7380 interfaceC73803;
        InterfaceC7387 interfaceC73877;
        InterfaceC7387 interfaceC73878;
        List list5;
        String str5;
        InterfaceC4889 interfaceC48893;
        Iterator it;
        Path path2;
        Iterator it2;
        Path path3;
        String str6;
        InterfaceC7387 interfaceC73879;
        List list6;
        String str7;
        Path pathM9073;
        if (continuationImpl instanceof StaticContentKt$respondStaticPath$1) {
            staticContentKt$respondStaticPath$1 = (StaticContentKt$respondStaticPath$1) continuationImpl;
            int i = staticContentKt$respondStaticPath$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                staticContentKt$respondStaticPath$1.label = i - Integer.MIN_VALUE;
            } else {
                staticContentKt$respondStaticPath$1 = new StaticContentKt$respondStaticPath$1(continuationImpl);
            }
        }
        Object obj = staticContentKt$respondStaticPath$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = staticContentKt$respondStaticPath$1.label;
        InterfaceC4948 interfaceC49482 = null;
        C6008 c6008 = C6008.f15084;
        switch (i2) {
            case 0:
                AbstractC6017.m10769(obj);
                List listMo8913 = interfaceC4889.getParameters().mo8913("static-content-path-parameter");
                if (listMo8913 != null) {
                    String str8 = File.separator;
                    str8.getClass();
                    AbstractC5176.m9369(listMo8913, str8, null, null, null, 62);
                    throw null;
                }
                return c6008;
            case 1:
                str4 = (String) staticContentKt$respondStaticPath$1.L$7;
                interfaceC73802 = (InterfaceC7380) staticContentKt$respondStaticPath$1.L$6;
                interfaceC73874 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$5;
                interfaceC73875 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$4;
                list3 = (List) staticContentKt$respondStaticPath$1.L$3;
                if (staticContentKt$respondStaticPath$1.L$1 != null) {
                    C3775.m6954();
                    return null;
                }
                interfaceC48892 = (InterfaceC4889) staticContentKt$respondStaticPath$1.L$0;
                AbstractC6017.m10769(obj);
                interfaceC4948 = null;
                if (!AbstractC4898.m9028(interfaceC48892) && str4 != null) {
                    pathM9073 = interfaceC4948.m9073();
                    staticContentKt$respondStaticPath$1.L$0 = null;
                    staticContentKt$respondStaticPath$1.L$1 = null;
                    staticContentKt$respondStaticPath$1.L$2 = null;
                    staticContentKt$respondStaticPath$1.L$3 = null;
                    staticContentKt$respondStaticPath$1.L$4 = null;
                    staticContentKt$respondStaticPath$1.L$5 = null;
                    staticContentKt$respondStaticPath$1.L$6 = null;
                    staticContentKt$respondStaticPath$1.L$7 = null;
                    staticContentKt$respondStaticPath$1.L$8 = null;
                    staticContentKt$respondStaticPath$1.L$9 = null;
                    staticContentKt$respondStaticPath$1.L$10 = null;
                    staticContentKt$respondStaticPath$1.label = 6;
                    if (AbstractC4957.m9082(interfaceC48892, pathM9073, list3, interfaceC73875, interfaceC73874, interfaceC73802, staticContentKt$respondStaticPath$1) != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return c6008;
            case 2:
                path = (Path) staticContentKt$respondStaticPath$1.L$10;
                str4 = (String) staticContentKt$respondStaticPath$1.L$9;
                list4 = (List) staticContentKt$respondStaticPath$1.L$8;
                interfaceC73876 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$7;
                interfaceC73803 = (InterfaceC7380) staticContentKt$respondStaticPath$1.L$6;
                interfaceC73877 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$5;
                interfaceC73878 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$4;
                list5 = (List) staticContentKt$respondStaticPath$1.L$3;
                str5 = (String) staticContentKt$respondStaticPath$1.L$2;
                if (staticContentKt$respondStaticPath$1.L$1 != null) {
                    C3775.m6954();
                    return null;
                }
                interfaceC48893 = (InterfaceC4889) staticContentKt$respondStaticPath$1.L$0;
                AbstractC6017.m10769(obj);
                if (!((Boolean) obj).booleanValue()) {
                    staticContentKt$respondStaticPath$1.L$0 = interfaceC48893;
                    staticContentKt$respondStaticPath$1.L$1 = null;
                    staticContentKt$respondStaticPath$1.L$2 = str5;
                    staticContentKt$respondStaticPath$1.L$3 = list5;
                    staticContentKt$respondStaticPath$1.L$4 = interfaceC73878;
                    staticContentKt$respondStaticPath$1.L$5 = interfaceC73877;
                    staticContentKt$respondStaticPath$1.L$6 = interfaceC73803;
                    staticContentKt$respondStaticPath$1.L$7 = interfaceC73876;
                    staticContentKt$respondStaticPath$1.L$8 = list4;
                    staticContentKt$respondStaticPath$1.L$9 = str4;
                    staticContentKt$respondStaticPath$1.L$10 = path;
                    staticContentKt$respondStaticPath$1.label = 3;
                    break;
                }
                return c6008;
            case 3:
                path = (Path) staticContentKt$respondStaticPath$1.L$10;
                str4 = (String) staticContentKt$respondStaticPath$1.L$9;
                list4 = (List) staticContentKt$respondStaticPath$1.L$8;
                interfaceC73876 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$7;
                interfaceC73803 = (InterfaceC7380) staticContentKt$respondStaticPath$1.L$6;
                interfaceC73877 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$5;
                interfaceC73878 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$4;
                list5 = (List) staticContentKt$respondStaticPath$1.L$3;
                str5 = (String) staticContentKt$respondStaticPath$1.L$2;
                if (staticContentKt$respondStaticPath$1.L$1 != null) {
                    C3775.m6954();
                    return null;
                }
                interfaceC48893 = (InterfaceC4889) staticContentKt$respondStaticPath$1.L$0;
                AbstractC6017.m10769(obj);
                if (!AbstractC4898.m9028(interfaceC48893)) {
                    it = list4.iterator();
                    list3 = list5;
                    interfaceC48892 = interfaceC48893;
                    interfaceC73875 = interfaceC73878;
                    interfaceC73874 = interfaceC73877;
                    interfaceC73802 = interfaceC73803;
                    interfaceC4948 = null;
                    if (!it.hasNext()) {
                        path.toString();
                        Path pathM90732 = interfaceC4948.m9073();
                        staticContentKt$respondStaticPath$1.L$0 = interfaceC48892;
                        staticContentKt$respondStaticPath$1.L$1 = interfaceC4948;
                        staticContentKt$respondStaticPath$1.L$2 = str5;
                        staticContentKt$respondStaticPath$1.L$3 = list3;
                        staticContentKt$respondStaticPath$1.L$4 = interfaceC73875;
                        staticContentKt$respondStaticPath$1.L$5 = interfaceC73874;
                        staticContentKt$respondStaticPath$1.L$6 = interfaceC73802;
                        staticContentKt$respondStaticPath$1.L$7 = interfaceC73876;
                        staticContentKt$respondStaticPath$1.L$8 = str4;
                        staticContentKt$respondStaticPath$1.L$9 = path;
                        staticContentKt$respondStaticPath$1.L$10 = it;
                        staticContentKt$respondStaticPath$1.L$11 = pathM90732;
                        staticContentKt$respondStaticPath$1.label = 4;
                        Object objM9074 = m9074(interfaceC73876, interfaceC48892, pathM90732, staticContentKt$respondStaticPath$1);
                        if (objM9074 != coroutineSingletons) {
                            String str9 = str4;
                            it2 = it;
                            obj = objM9074;
                            interfaceC49482 = interfaceC4948;
                            interfaceC73879 = interfaceC73876;
                            str6 = str9;
                            List list7 = list3;
                            path3 = path;
                            path2 = pathM90732;
                            str7 = str5;
                            list6 = list7;
                            if (!((Boolean) obj).booleanValue()) {
                                staticContentKt$respondStaticPath$1.L$0 = interfaceC48892;
                                staticContentKt$respondStaticPath$1.L$1 = interfaceC49482;
                                staticContentKt$respondStaticPath$1.L$2 = str7;
                                staticContentKt$respondStaticPath$1.L$3 = list6;
                                staticContentKt$respondStaticPath$1.L$4 = interfaceC73875;
                                staticContentKt$respondStaticPath$1.L$5 = interfaceC73874;
                                staticContentKt$respondStaticPath$1.L$6 = interfaceC73802;
                                staticContentKt$respondStaticPath$1.L$7 = interfaceC73879;
                                staticContentKt$respondStaticPath$1.L$8 = str6;
                                staticContentKt$respondStaticPath$1.L$9 = path3;
                                staticContentKt$respondStaticPath$1.L$10 = it2;
                                staticContentKt$respondStaticPath$1.L$11 = null;
                                staticContentKt$respondStaticPath$1.label = 5;
                                if (AbstractC4957.m9082(interfaceC48892, path2, list6, interfaceC73875, interfaceC73874, interfaceC73802, staticContentKt$respondStaticPath$1) != coroutineSingletons) {
                                    it = it2;
                                    path = path3;
                                    str4 = str6;
                                    interfaceC73876 = interfaceC73879;
                                    list3 = list6;
                                    str5 = str7;
                                    interfaceC4948 = interfaceC49482;
                                    if (!AbstractC4898.m9028(interfaceC48892)) {
                                        if (!it.hasNext()) {
                                            if (!AbstractC4898.m9028(interfaceC48892)) {
                                                pathM9073 = interfaceC4948.m9073();
                                                staticContentKt$respondStaticPath$1.L$0 = null;
                                                staticContentKt$respondStaticPath$1.L$1 = null;
                                                staticContentKt$respondStaticPath$1.L$2 = null;
                                                staticContentKt$respondStaticPath$1.L$3 = null;
                                                staticContentKt$respondStaticPath$1.L$4 = null;
                                                staticContentKt$respondStaticPath$1.L$5 = null;
                                                staticContentKt$respondStaticPath$1.L$6 = null;
                                                staticContentKt$respondStaticPath$1.L$7 = null;
                                                staticContentKt$respondStaticPath$1.L$8 = null;
                                                staticContentKt$respondStaticPath$1.L$9 = null;
                                                staticContentKt$respondStaticPath$1.L$10 = null;
                                                staticContentKt$respondStaticPath$1.label = 6;
                                                if (AbstractC4957.m9082(interfaceC48892, pathM9073, list3, interfaceC73875, interfaceC73874, interfaceC73802, staticContentKt$respondStaticPath$1) != coroutineSingletons) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return c6008;
            case 4:
                path2 = (Path) staticContentKt$respondStaticPath$1.L$11;
                it2 = (Iterator) staticContentKt$respondStaticPath$1.L$10;
                path3 = (Path) staticContentKt$respondStaticPath$1.L$9;
                str6 = (String) staticContentKt$respondStaticPath$1.L$8;
                interfaceC73879 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$7;
                interfaceC73802 = (InterfaceC7380) staticContentKt$respondStaticPath$1.L$6;
                interfaceC73874 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$5;
                interfaceC73875 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$4;
                list6 = (List) staticContentKt$respondStaticPath$1.L$3;
                str7 = (String) staticContentKt$respondStaticPath$1.L$2;
                if (staticContentKt$respondStaticPath$1.L$1 != null) {
                    C3775.m6954();
                    return null;
                }
                interfaceC48892 = (InterfaceC4889) staticContentKt$respondStaticPath$1.L$0;
                AbstractC6017.m10769(obj);
                if (!((Boolean) obj).booleanValue()) {
                }
                return c6008;
            case 5:
                Iterator it3 = (Iterator) staticContentKt$respondStaticPath$1.L$10;
                Path path4 = (Path) staticContentKt$respondStaticPath$1.L$9;
                String str10 = (String) staticContentKt$respondStaticPath$1.L$8;
                interfaceC73876 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$7;
                InterfaceC7380 interfaceC73804 = (InterfaceC7380) staticContentKt$respondStaticPath$1.L$6;
                InterfaceC7387 interfaceC738710 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$5;
                InterfaceC7387 interfaceC738711 = (InterfaceC7387) staticContentKt$respondStaticPath$1.L$4;
                List list8 = (List) staticContentKt$respondStaticPath$1.L$3;
                str5 = (String) staticContentKt$respondStaticPath$1.L$2;
                if (staticContentKt$respondStaticPath$1.L$1 != null) {
                    C3775.m6954();
                    return null;
                }
                InterfaceC4889 interfaceC48894 = (InterfaceC4889) staticContentKt$respondStaticPath$1.L$0;
                AbstractC6017.m10769(obj);
                it = it3;
                path = path4;
                str4 = str10;
                list3 = list8;
                interfaceC48892 = interfaceC48894;
                interfaceC73875 = interfaceC738711;
                interfaceC73874 = interfaceC738710;
                interfaceC73802 = interfaceC73804;
                interfaceC4948 = interfaceC49482;
                if (!AbstractC4898.m9028(interfaceC48892)) {
                }
                return c6008;
            case 6:
                AbstractC6017.m10769(obj);
                return c6008;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0295 -> B:58:0x029f). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9078(InterfaceC4889 interfaceC4889, String str, File file, List list, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, InterfaceC7387 interfaceC73873, List list2, String str2, ContinuationImpl continuationImpl) {
        StaticContentKt$respondStaticFile$1 staticContentKt$respondStaticFile$1;
        C6008 c6008;
        InterfaceC4889 interfaceC48892;
        InterfaceC7380 interfaceC73802;
        File file2;
        List list3;
        InterfaceC4889 interfaceC48893;
        File file3;
        InterfaceC7387 interfaceC73874;
        InterfaceC7387 interfaceC73875;
        InterfaceC7387 interfaceC73876;
        InterfaceC7380 interfaceC73803;
        List list4;
        String str3;
        File file4;
        List list5;
        File file5;
        Iterator it;
        File file6;
        Iterator it2;
        File file7;
        String str4;
        InterfaceC7387 interfaceC73877;
        InterfaceC7380 interfaceC73804;
        InterfaceC7387 interfaceC73878;
        InterfaceC7387 interfaceC73879;
        List list6;
        File file8;
        InterfaceC4889 interfaceC48894;
        C6008 c60082;
        File file9;
        File file10 = file;
        List list7 = list;
        InterfaceC7387 interfaceC738710 = interfaceC7387;
        InterfaceC7387 interfaceC738711 = interfaceC73872;
        String str5 = str2;
        if (continuationImpl instanceof StaticContentKt$respondStaticFile$1) {
            staticContentKt$respondStaticFile$1 = (StaticContentKt$respondStaticFile$1) continuationImpl;
            int i = staticContentKt$respondStaticFile$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                staticContentKt$respondStaticFile$1.label = i - Integer.MIN_VALUE;
            } else {
                staticContentKt$respondStaticFile$1 = new StaticContentKt$respondStaticFile$1(continuationImpl);
            }
        }
        Object objM9075 = staticContentKt$respondStaticFile$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = staticContentKt$respondStaticFile$1.label;
        C6008 c60083 = C6008.f15084;
        switch (i2) {
            case 0:
                AbstractC6017.m10769(objM9075);
                List listMo8913 = interfaceC4889.getParameters().mo8913("static-content-path-parameter");
                if (listMo8913 != null) {
                    String str6 = File.separator;
                    str6.getClass();
                    File fileM9182 = AbstractC5049.m9182(file10, AbstractC5176.m9369(listMo8913, str6, null, null, null, 62));
                    boolean zIsDirectory = fileM9182.isDirectory();
                    if (str != null && zIsDirectory) {
                        File file11 = new File(fileM9182, str);
                        staticContentKt$respondStaticFile$1.L$0 = interfaceC4889;
                        staticContentKt$respondStaticFile$1.L$1 = file10;
                        staticContentKt$respondStaticFile$1.L$2 = list7;
                        staticContentKt$respondStaticFile$1.L$3 = interfaceC738710;
                        staticContentKt$respondStaticFile$1.L$4 = interfaceC738711;
                        staticContentKt$respondStaticFile$1.L$5 = interfaceC7380;
                        staticContentKt$respondStaticFile$1.L$6 = str5;
                        staticContentKt$respondStaticFile$1.label = 1;
                        if (AbstractC4957.m9084(interfaceC4889, file11, list7, interfaceC738710, interfaceC738711, interfaceC7380, staticContentKt$respondStaticFile$1) != coroutineSingletons) {
                            interfaceC48892 = interfaceC4889;
                            interfaceC73802 = interfaceC7380;
                            file2 = file10;
                            c6008 = c60083;
                            if (!AbstractC4898.m9028(interfaceC48892)) {
                            }
                        }
                    } else if (zIsDirectory) {
                        c6008 = c60083;
                        interfaceC48892 = interfaceC4889;
                        interfaceC73802 = interfaceC7380;
                        file2 = file10;
                        if (!AbstractC4898.m9028(interfaceC48892)) {
                            return c6008;
                        }
                        file9 = new File(file2, str5);
                        staticContentKt$respondStaticFile$1.L$0 = null;
                        staticContentKt$respondStaticFile$1.L$1 = null;
                        staticContentKt$respondStaticFile$1.L$2 = null;
                        staticContentKt$respondStaticFile$1.L$3 = null;
                        staticContentKt$respondStaticFile$1.L$4 = null;
                        staticContentKt$respondStaticFile$1.L$5 = null;
                        staticContentKt$respondStaticFile$1.L$6 = null;
                        staticContentKt$respondStaticFile$1.L$7 = null;
                        staticContentKt$respondStaticFile$1.L$8 = null;
                        staticContentKt$respondStaticFile$1.L$9 = null;
                        staticContentKt$respondStaticFile$1.label = 6;
                        if (AbstractC4957.m9084(interfaceC48892, file9, list7, interfaceC738710, interfaceC738711, interfaceC73802, staticContentKt$respondStaticFile$1) == coroutineSingletons) {
                        }
                    } else {
                        staticContentKt$respondStaticFile$1.L$0 = interfaceC4889;
                        staticContentKt$respondStaticFile$1.L$1 = file10;
                        staticContentKt$respondStaticFile$1.L$2 = list7;
                        staticContentKt$respondStaticFile$1.L$3 = interfaceC738710;
                        staticContentKt$respondStaticFile$1.L$4 = interfaceC738711;
                        staticContentKt$respondStaticFile$1.L$5 = interfaceC7380;
                        staticContentKt$respondStaticFile$1.L$6 = interfaceC73873;
                        list3 = list2;
                        staticContentKt$respondStaticFile$1.L$7 = list3;
                        staticContentKt$respondStaticFile$1.L$8 = str5;
                        staticContentKt$respondStaticFile$1.L$9 = fileM9182;
                        staticContentKt$respondStaticFile$1.label = 2;
                        Object objM90752 = m9075(interfaceC73873, interfaceC4889, fileM9182, staticContentKt$respondStaticFile$1);
                        if (objM90752 != coroutineSingletons) {
                            interfaceC48893 = interfaceC4889;
                            file3 = fileM9182;
                            objM9075 = objM90752;
                            interfaceC73874 = interfaceC738710;
                            interfaceC73875 = interfaceC73873;
                            interfaceC73876 = interfaceC738711;
                            interfaceC73803 = interfaceC7380;
                            if (!((Boolean) objM9075).booleanValue()) {
                                staticContentKt$respondStaticFile$1.L$0 = interfaceC48893;
                                staticContentKt$respondStaticFile$1.L$1 = file10;
                                staticContentKt$respondStaticFile$1.L$2 = list7;
                                staticContentKt$respondStaticFile$1.L$3 = interfaceC73874;
                                staticContentKt$respondStaticFile$1.L$4 = interfaceC73876;
                                staticContentKt$respondStaticFile$1.L$5 = interfaceC73803;
                                staticContentKt$respondStaticFile$1.L$6 = interfaceC73875;
                                staticContentKt$respondStaticFile$1.L$7 = list3;
                                staticContentKt$respondStaticFile$1.L$8 = str5;
                                staticContentKt$respondStaticFile$1.L$9 = file3;
                                staticContentKt$respondStaticFile$1.label = 3;
                                File file12 = file3;
                                if (AbstractC4957.m9084(interfaceC48893, file12, list7, interfaceC73874, interfaceC73876, interfaceC73803, staticContentKt$respondStaticFile$1) != coroutineSingletons) {
                                    List list8 = list7;
                                    list4 = list3;
                                    str3 = str5;
                                    file4 = file10;
                                    list5 = list8;
                                    file5 = file12;
                                    if (!AbstractC4898.m9028(interfaceC48893)) {
                                        it = list4.iterator();
                                        if (!it.hasNext()) {
                                            String str7 = (String) it.next();
                                            StringBuilder sb = new StringBuilder();
                                            c60082 = c60083;
                                            sb.append(file5.getPath());
                                            sb.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                                            sb.append(str7);
                                            File file13 = new File(sb.toString());
                                            staticContentKt$respondStaticFile$1.L$0 = interfaceC48893;
                                            staticContentKt$respondStaticFile$1.L$1 = file4;
                                            staticContentKt$respondStaticFile$1.L$2 = list5;
                                            staticContentKt$respondStaticFile$1.L$3 = interfaceC73874;
                                            staticContentKt$respondStaticFile$1.L$4 = interfaceC73876;
                                            staticContentKt$respondStaticFile$1.L$5 = interfaceC73803;
                                            staticContentKt$respondStaticFile$1.L$6 = interfaceC73875;
                                            staticContentKt$respondStaticFile$1.L$7 = str3;
                                            staticContentKt$respondStaticFile$1.L$8 = file5;
                                            staticContentKt$respondStaticFile$1.L$9 = it;
                                            staticContentKt$respondStaticFile$1.L$10 = file13;
                                            staticContentKt$respondStaticFile$1.label = 4;
                                            objM9075 = m9075(interfaceC73875, interfaceC48893, file13, staticContentKt$respondStaticFile$1);
                                            if (objM9075 != coroutineSingletons) {
                                                Iterator it3 = it;
                                                file7 = file5;
                                                file6 = file13;
                                                interfaceC48894 = interfaceC48893;
                                                file8 = file4;
                                                list6 = list5;
                                                interfaceC73879 = interfaceC73874;
                                                interfaceC73878 = interfaceC73876;
                                                interfaceC73804 = interfaceC73803;
                                                interfaceC73877 = interfaceC73875;
                                                str4 = str3;
                                                it2 = it3;
                                                if (!((Boolean) objM9075).booleanValue()) {
                                                    return c60082;
                                                }
                                                staticContentKt$respondStaticFile$1.L$0 = interfaceC48894;
                                                staticContentKt$respondStaticFile$1.L$1 = file8;
                                                staticContentKt$respondStaticFile$1.L$2 = list6;
                                                staticContentKt$respondStaticFile$1.L$3 = interfaceC73879;
                                                staticContentKt$respondStaticFile$1.L$4 = interfaceC73878;
                                                staticContentKt$respondStaticFile$1.L$5 = interfaceC73804;
                                                staticContentKt$respondStaticFile$1.L$6 = interfaceC73877;
                                                staticContentKt$respondStaticFile$1.L$7 = str4;
                                                staticContentKt$respondStaticFile$1.L$8 = file7;
                                                staticContentKt$respondStaticFile$1.L$9 = it2;
                                                staticContentKt$respondStaticFile$1.L$10 = null;
                                                staticContentKt$respondStaticFile$1.label = 5;
                                                if (AbstractC4957.m9084(interfaceC48894, file6, list6, interfaceC73879, interfaceC73878, interfaceC73804, staticContentKt$respondStaticFile$1) != coroutineSingletons) {
                                                    file5 = file7;
                                                    it = it2;
                                                    str3 = str4;
                                                    interfaceC73875 = interfaceC73877;
                                                    interfaceC73803 = interfaceC73804;
                                                    interfaceC73876 = interfaceC73878;
                                                    interfaceC73874 = interfaceC73879;
                                                    list5 = list6;
                                                    file4 = file8;
                                                    interfaceC48893 = interfaceC48894;
                                                    if (!AbstractC4898.m9028(interfaceC48893)) {
                                                        return c60082;
                                                    }
                                                    c60083 = c60082;
                                                    if (!it.hasNext()) {
                                                        c6008 = c60083;
                                                        File file14 = file4;
                                                        str5 = str3;
                                                        interfaceC73802 = interfaceC73803;
                                                        interfaceC738711 = interfaceC73876;
                                                        file2 = file14;
                                                        interfaceC738710 = interfaceC73874;
                                                        list7 = list5;
                                                        interfaceC48892 = interfaceC48893;
                                                        if (!AbstractC4898.m9028(interfaceC48892) || str5 == null) {
                                                            return c6008;
                                                        }
                                                        file9 = new File(file2, str5);
                                                        staticContentKt$respondStaticFile$1.L$0 = null;
                                                        staticContentKt$respondStaticFile$1.L$1 = null;
                                                        staticContentKt$respondStaticFile$1.L$2 = null;
                                                        staticContentKt$respondStaticFile$1.L$3 = null;
                                                        staticContentKt$respondStaticFile$1.L$4 = null;
                                                        staticContentKt$respondStaticFile$1.L$5 = null;
                                                        staticContentKt$respondStaticFile$1.L$6 = null;
                                                        staticContentKt$respondStaticFile$1.L$7 = null;
                                                        staticContentKt$respondStaticFile$1.L$8 = null;
                                                        staticContentKt$respondStaticFile$1.L$9 = null;
                                                        staticContentKt$respondStaticFile$1.label = 6;
                                                        if (AbstractC4957.m9084(interfaceC48892, file9, list7, interfaceC738710, interfaceC738711, interfaceC73802, staticContentKt$respondStaticFile$1) == coroutineSingletons) {
                                                            return c6008;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return c60083;
            case 1:
                String str8 = (String) staticContentKt$respondStaticFile$1.L$6;
                interfaceC73802 = (InterfaceC7380) staticContentKt$respondStaticFile$1.L$5;
                InterfaceC7387 interfaceC738712 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$4;
                interfaceC738710 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$3;
                List list9 = (List) staticContentKt$respondStaticFile$1.L$2;
                file2 = (File) staticContentKt$respondStaticFile$1.L$1;
                interfaceC48892 = (InterfaceC4889) staticContentKt$respondStaticFile$1.L$0;
                AbstractC6017.m10769(objM9075);
                interfaceC738711 = interfaceC738712;
                list7 = list9;
                str5 = str8;
                c6008 = c60083;
                if (!AbstractC4898.m9028(interfaceC48892)) {
                }
                break;
            case 2:
                file3 = (File) staticContentKt$respondStaticFile$1.L$9;
                String str9 = (String) staticContentKt$respondStaticFile$1.L$8;
                List list10 = (List) staticContentKt$respondStaticFile$1.L$7;
                interfaceC73875 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$6;
                interfaceC73803 = (InterfaceC7380) staticContentKt$respondStaticFile$1.L$5;
                interfaceC73876 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$4;
                interfaceC73874 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$3;
                List list11 = (List) staticContentKt$respondStaticFile$1.L$2;
                File file15 = (File) staticContentKt$respondStaticFile$1.L$1;
                interfaceC48893 = (InterfaceC4889) staticContentKt$respondStaticFile$1.L$0;
                AbstractC6017.m10769(objM9075);
                str5 = str9;
                list3 = list10;
                list7 = list11;
                file10 = file15;
                if (!((Boolean) objM9075).booleanValue()) {
                }
                return c60083;
            case 3:
                file5 = (File) staticContentKt$respondStaticFile$1.L$9;
                str3 = (String) staticContentKt$respondStaticFile$1.L$8;
                list4 = (List) staticContentKt$respondStaticFile$1.L$7;
                interfaceC73875 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$6;
                interfaceC73803 = (InterfaceC7380) staticContentKt$respondStaticFile$1.L$5;
                interfaceC73876 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$4;
                interfaceC73874 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$3;
                list5 = (List) staticContentKt$respondStaticFile$1.L$2;
                file4 = (File) staticContentKt$respondStaticFile$1.L$1;
                interfaceC48893 = (InterfaceC4889) staticContentKt$respondStaticFile$1.L$0;
                AbstractC6017.m10769(objM9075);
                if (!AbstractC4898.m9028(interfaceC48893)) {
                }
                return c60083;
            case 4:
                file6 = (File) staticContentKt$respondStaticFile$1.L$10;
                it2 = (Iterator) staticContentKt$respondStaticFile$1.L$9;
                file7 = (File) staticContentKt$respondStaticFile$1.L$8;
                str4 = (String) staticContentKt$respondStaticFile$1.L$7;
                interfaceC73877 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$6;
                interfaceC73804 = (InterfaceC7380) staticContentKt$respondStaticFile$1.L$5;
                interfaceC73878 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$4;
                interfaceC73879 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$3;
                list6 = (List) staticContentKt$respondStaticFile$1.L$2;
                file8 = (File) staticContentKt$respondStaticFile$1.L$1;
                interfaceC48894 = (InterfaceC4889) staticContentKt$respondStaticFile$1.L$0;
                AbstractC6017.m10769(objM9075);
                c60082 = c60083;
                if (!((Boolean) objM9075).booleanValue()) {
                }
                break;
            case 5:
                Iterator it4 = (Iterator) staticContentKt$respondStaticFile$1.L$9;
                File file16 = (File) staticContentKt$respondStaticFile$1.L$8;
                String str10 = (String) staticContentKt$respondStaticFile$1.L$7;
                interfaceC73875 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$6;
                interfaceC73803 = (InterfaceC7380) staticContentKt$respondStaticFile$1.L$5;
                interfaceC73876 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$4;
                interfaceC73874 = (InterfaceC7387) staticContentKt$respondStaticFile$1.L$3;
                list5 = (List) staticContentKt$respondStaticFile$1.L$2;
                file4 = (File) staticContentKt$respondStaticFile$1.L$1;
                interfaceC48893 = (InterfaceC4889) staticContentKt$respondStaticFile$1.L$0;
                AbstractC6017.m10769(objM9075);
                it = it4;
                file5 = file16;
                str3 = str10;
                c60082 = c60083;
                if (!AbstractC4898.m9028(interfaceC48893)) {
                }
                break;
            case 6:
                AbstractC6017.m10769(objM9075);
                return c60083;
            default:
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
