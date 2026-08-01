package io.ktor.server.engine;

import androidx.compose.animation.C1272;
import androidx.compose.foundation.C1905;
import androidx.compose.runtime.internal.C2080;
import com.alibaba.fastjson2.AbstractC3738;
import com.kongzue.dialogx.util.C4595;
import io.ktor.http.cio.C4791;
import io.ktor.server.application.C4891;
import io.ktor.server.application.InterfaceC4887;
import io.ktor.server.application.InterfaceC4889;
import io.ktor.server.application.InterfaceC4897;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.server.plugins.NotFoundException;
import io.ktor.server.plugins.PayloadTooLargeException;
import io.ktor.server.plugins.UnsupportedMediaTypeException;
import io.ktor.server.request.AbstractC4963;
import io.ktor.server.request.InterfaceC4959;
import io.ktor.server.request.InterfaceC4961;
import io.ktor.util.AbstractC5042;
import io.ktor.util.C5041;
import io.ktor.util.cio.ChannelIOException;
import io.ktor.util.pipeline.AbstractC5026;
import io.ktor.utils.p007io.InterfaceC5084;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5919;
import kotlin.reflect.InterfaceC5925;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import kotlinx.coroutines.AbstractC6227;
import kotlinx.coroutines.TimeoutCancellationException;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p064.C7346;
import p064.C7348;
import p075.C7686;
import p191.AbstractC8568;
import p246.C8882;
import p252.AbstractC8944;
import p252.C8926;
import p252.C8928;
import p252.InterfaceC8941;
import p269.AbstractC9018;
import p414.AbstractC9968;
import p414.InterfaceC9970;
import top.suzhelan.qstory.hook.item.C6755;
import top.suzhelan.qstory.hook.item.mcp.config.C6705;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4925 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.ktor.server.application.飘花落叶言子楪世苏兰哲, io.ktor.server.application.飘花落叶言子楪哲苏世兰, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [io.ktor.server.application.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r7v5, types: [io.ktor.server.application.飘花落叶言子楪世苏兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9049(InterfaceC4897 interfaceC4897, Throwable th, ContinuationImpl continuationImpl) {
        DefaultEnginePipelineKt$handleFailure$1 defaultEnginePipelineKt$handleFailure$1;
        if (continuationImpl instanceof DefaultEnginePipelineKt$handleFailure$1) {
            defaultEnginePipelineKt$handleFailure$1 = (DefaultEnginePipelineKt$handleFailure$1) continuationImpl;
            int i = defaultEnginePipelineKt$handleFailure$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEnginePipelineKt$handleFailure$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEnginePipelineKt$handleFailure$1 = new DefaultEnginePipelineKt$handleFailure$1(continuationImpl);
            }
        }
        Object obj = defaultEnginePipelineKt$handleFailure$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultEnginePipelineKt$handleFailure$1.label;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            defaultEnginePipelineKt$handleFailure$1.L$0 = interfaceC4897;
            defaultEnginePipelineKt$handleFailure$1.L$1 = th;
            defaultEnginePipelineKt$handleFailure$1.label = 1;
            AbstractC5754.m10442(interfaceC4897.mo9019());
            Object objInvoke = new DefaultEnginePipelineKt$logError$2(interfaceC4897, th, null).invoke((Object) defaultEnginePipelineKt$handleFailure$1);
            if (objInvoke != coroutineSingletons) {
                objInvoke = c6008;
            }
            if (objInvoke != coroutineSingletons) {
                objInvoke = c6008;
            }
            if (objInvoke != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        th = (Throwable) defaultEnginePipelineKt$handleFailure$1.L$1;
        interfaceC4897 = (InterfaceC4889) defaultEnginePipelineKt$handleFailure$1.L$0;
        AbstractC6017.m10769(obj);
        th.getClass();
        C8926 c8926 = th instanceof BadRequestException ? C8926.f22698 : th instanceof NotFoundException ? C8926.f22690 : th instanceof UnsupportedMediaTypeException ? C8926.f22695 : th instanceof PayloadTooLargeException ? C8926.f22685 : ((th instanceof TimeoutException) || (th instanceof TimeoutCancellationException)) ? C8926.f22692 : null;
        if (c8926 == null) {
            c8926 = C8926.f22693;
        }
        defaultEnginePipelineKt$handleFailure$1.L$0 = null;
        defaultEnginePipelineKt$handleFailure$1.L$1 = null;
        defaultEnginePipelineKt$handleFailure$1.label = 2;
        return m9055(interfaceC4897, c8926, defaultEnginePipelineKt$handleFailure$1) == coroutineSingletons ? coroutineSingletons : c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Field m9050(Class cls) {
        Field field;
        Field fieldM9050;
        Field[] declaredFields = cls.getDeclaredFields();
        declaredFields.getClass();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (AbstractC5227.m9466(field.getName(), "ucp") && field.getType().getSimpleName().equals("URLClassPath")) {
                break;
            }
            i++;
        }
        if (field != null) {
            return field;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || (fieldM9050 = m9050(superclass)) == null) {
            return null;
        }
        return fieldM9050;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C4934 m9051(int i, C6705 c6705) {
        List listM12487 = AbstractC7176.m12487(AbstractC4927.f12784);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        emptyCoroutineContext.getClass();
        C4933 c4933 = new C4933();
        c4933.f12794 = i;
        c4933.f12795 = "0.0.0.0";
        InterfaceC4937[] interfaceC4937Arr = (InterfaceC4937[]) Arrays.copyOf(new InterfaceC4937[]{c4933}, 1);
        ClassLoader classLoader = AbstractC4925.class.getClassLoader();
        classLoader.getClass();
        AbstractC9968.m15262("io.ktor.server.Application").getClass();
        C8882 c8882 = new C8882(5);
        InterfaceC9970 interfaceC9970M15262 = AbstractC9968.m15262("io.ktor.server.Application");
        interfaceC9970M15262.getClass();
        C4924 c4924 = new C4924(classLoader, interfaceC9970M15262, c8882);
        ArrayList arrayList = new ArrayList();
        AbstractC7176.m12487(AbstractC4927.f12784);
        boolean z = AbstractC5042.f13045;
        EmptyCoroutineContext emptyCoroutineContext2 = EmptyCoroutineContext.INSTANCE;
        InterfaceC5192 interfaceC5192Plus = EmptyCoroutineContext.INSTANCE.plus(emptyCoroutineContext);
        interfaceC5192Plus.getClass();
        arrayList.add(c6705);
        return new C4934(new C4891(c4924, arrayList, listM12487, "", z, interfaceC5192Plus), new C1905(interfaceC4937Arr, 15));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set m9052(ClassLoader classLoader) {
        Set setM9052;
        Method method;
        classLoader.getClass();
        ClassLoader parent = classLoader.getParent();
        if (parent == null || (setM9052 = m9052(parent)) == null) {
            setM9052 = EmptySet.INSTANCE;
        }
        if (classLoader instanceof URLClassLoader) {
            URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
            uRLs.getClass();
            return AbstractC8568.m13613(AbstractC5176.m9347(AbstractC5179.m9385(uRLs)), setM9052);
        }
        Iterable iterableM9057 = null;
        try {
            try {
                Field fieldM9050 = m9050(classLoader.getClass());
                if (fieldM9050 != null) {
                    fieldM9050.setAccessible(true);
                    Object obj = fieldM9050.get(classLoader);
                    if (obj != null && (method = obj.getClass().getMethod("getURLs", null)) != null) {
                        method.setAccessible(true);
                        URL[] urlArr = (URL[]) method.invoke(obj, null);
                        if (urlArr != null) {
                            iterableM9057 = AbstractC5179.m9405(urlArr);
                        }
                    }
                }
            } catch (Throwable unused) {
                iterableM9057 = m9057(classLoader);
            }
        } catch (Throwable unused2) {
        }
        return iterableM9057 == null ? setM9052 : AbstractC8568.m13613(setM9052, iterableM9057);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9053(AbstractC5026 abstractC5026, ContinuationImpl continuationImpl) {
        BaseApplicationEngineKt$verifyHostHeader$1 baseApplicationEngineKt$verifyHostHeader$1;
        if (continuationImpl instanceof BaseApplicationEngineKt$verifyHostHeader$1) {
            baseApplicationEngineKt$verifyHostHeader$1 = (BaseApplicationEngineKt$verifyHostHeader$1) continuationImpl;
            int i = baseApplicationEngineKt$verifyHostHeader$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                baseApplicationEngineKt$verifyHostHeader$1.label = i - Integer.MIN_VALUE;
            } else {
                baseApplicationEngineKt$verifyHostHeader$1 = new BaseApplicationEngineKt$verifyHostHeader$1(continuationImpl);
            }
        }
        Object obj = baseApplicationEngineKt$verifyHostHeader$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = baseApplicationEngineKt$verifyHostHeader$1.label;
        InterfaceC5919 interfaceC5919M9471 = null;
        C6008 c6008 = C6008.f15084;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC8941 interfaceC8941Mo944 = ((InterfaceC4897) abstractC5026.f13009).mo9018().mo944();
            String[] strArr = AbstractC8944.f22758;
            List listMo8913 = interfaceC8941Mo944.mo8913("Host");
            if (listMo8913 == null) {
                return c6008;
            }
            if (listMo8913.size() > 1) {
                InterfaceC4897 interfaceC4897 = (InterfaceC4897) abstractC5026.f13009;
                C8926 c8926 = C8926.f22698;
                InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8926.class);
                try {
                    interfaceC5919M9471 = AbstractC5228.m9471(C8926.class);
                } catch (Throwable unused) {
                }
                C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
                baseApplicationEngineKt$verifyHostHeader$1.L$0 = abstractC5026;
                baseApplicationEngineKt$verifyHostHeader$1.label = 1;
                if (interfaceC4897.mo9021(c8926, c7686, baseApplicationEngineKt$verifyHostHeader$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return c6008;
        }
        if (i2 != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        abstractC5026 = (AbstractC5026) baseApplicationEngineKt$verifyHostHeader$1.L$0;
        AbstractC6017.m10769(obj);
        abstractC5026.mo9127();
        return c6008;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m9054(InterfaceC4887 interfaceC4887, InterfaceC4889 interfaceC4889, Throwable th) {
        String str;
        try {
            Object objMo959 = interfaceC4889.mo9020().mo959();
            if (objMo959 == null) {
                objMo959 = "Unhandled";
            }
            try {
                try {
                    InterfaceC4961 interfaceC4961Mo9018 = interfaceC4889.mo9018();
                    interfaceC4961Mo9018.getClass();
                    str = ((C8928) ((C2080) AbstractC9018.m14236(interfaceC4961Mo9018)).f3964).f22719 + " - " + AbstractC3738.m6896(interfaceC4961Mo9018);
                } catch (OutOfMemoryError unused) {
                    System.err.print((Object) "OutOfMemoryError: ");
                    System.err.print((Object) th.getMessage());
                    System.err.print((Object) "\n");
                    return;
                }
            } catch (Throwable th2) {
                str = "(request error: " + th2 + ')';
            }
            String str2 = objMo959 + ": " + str + ". Exception " + AbstractC5228.f13320.mo9476(th.getClass()) + ": " + th.getMessage();
            if (!(th instanceof CancellationException) && !(th instanceof ClosedChannelException) && !(th instanceof ChannelIOException) && !(th instanceof IOException) && !(th instanceof BadRequestException) && !(th instanceof NotFoundException) && !(th instanceof PayloadTooLargeException) && !(th instanceof UnsupportedMediaTypeException)) {
                ((C4924) interfaceC4887).f12782.error(objMo959 + ": " + str, th);
                return;
            }
            ((C4924) interfaceC4887).f12782.debug(str2, th);
        } catch (OutOfMemoryError unused2) {
            InterfaceC9970 interfaceC9970 = ((C4924) interfaceC4887).f12782;
            interfaceC9970.getClass();
            th.getClass();
            String message = th.getMessage();
            if (message == null) {
                message = "Exception of type " + AbstractC5228.f13320.mo9476(th.getClass());
            }
            interfaceC9970.error(message, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m9055(InterfaceC4889 interfaceC4889, C8926 c8926, ContinuationImpl continuationImpl) {
        DefaultEnginePipelineKt$tryRespondError$1 defaultEnginePipelineKt$tryRespondError$1;
        if (continuationImpl instanceof DefaultEnginePipelineKt$tryRespondError$1) {
            defaultEnginePipelineKt$tryRespondError$1 = (DefaultEnginePipelineKt$tryRespondError$1) continuationImpl;
            int i = defaultEnginePipelineKt$tryRespondError$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultEnginePipelineKt$tryRespondError$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultEnginePipelineKt$tryRespondError$1 = new DefaultEnginePipelineKt$tryRespondError$1(continuationImpl);
            }
        }
        Object obj = defaultEnginePipelineKt$tryRespondError$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultEnginePipelineKt$tryRespondError$1.label;
        InterfaceC5919 interfaceC5919M9471 = null;
        try {
            if (i2 == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8926.class);
                try {
                    interfaceC5919M9471 = AbstractC5228.m9471(C8926.class);
                } catch (Throwable unused) {
                }
                C7686 c7686 = new C7686(interfaceC5925Mo9476, interfaceC5919M9471);
                defaultEnginePipelineKt$tryRespondError$1.label = 1;
                if (interfaceC4889.mo9021(c8926, c7686, defaultEnginePipelineKt$tryRespondError$1) == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
        } catch (BaseApplicationResponse$ResponseAlreadySentException unused2) {
        }
        return C6008.f15084;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4791 m9056(AbstractC5026 abstractC5026, InterfaceC5084 interfaceC5084) {
        abstractC5026.getClass();
        InterfaceC4897 interfaceC4897 = (InterfaceC4897) abstractC5026.f13009;
        InterfaceC4959 interfaceC4959Mo9018 = interfaceC4897.mo9018();
        String[] strArr = AbstractC8944.f22758;
        String strM6864 = AbstractC3738.m6864(interfaceC4959Mo9018, "Content-Type");
        if (strM6864 == null) {
            C6755.m11870("Content-Type header is required for multipart processing");
            return null;
        }
        String strM68642 = AbstractC3738.m6864(interfaceC4897.mo9018(), "Content-Length");
        Long lValueOf = strM68642 != null ? Long.valueOf(Long.parseLong(strM68642)) : null;
        InterfaceC5192 interfaceC5192Plus = abstractC5026.mo2990().plus(AbstractC6227.f15374);
        C5041 c5041 = AbstractC4963.f12872;
        interfaceC4897.getClass();
        Long l = (Long) interfaceC4897.getAttributes().m9146(AbstractC4963.f12872);
        return new C4791(interfaceC5192Plus, interfaceC5084, strM6864, lValueOf, l != null ? l.longValue() : 52428800L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final ArrayList m9057(ClassLoader classLoader) throws IOException {
        Iterable list;
        ArrayList arrayListM8647 = new C4595(classLoader).m8647();
        ArrayList<String> arrayList = new ArrayList(AbstractC5177.m9381(arrayListM8647, 10));
        Iterator it = arrayListM8647.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC5971.m10688((String) it.next(), TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        }
        HashSet hashSet = new HashSet();
        for (String str : arrayList) {
            List listM10709 = AbstractC5976.m10709(str, new char[]{'/'});
            C7348 c7348 = new C7348(1, listM10709.size(), 1);
            ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(c7348, 10));
            Iterator it2 = c7348.iterator();
            while (true) {
                C7346 c7346 = (C7346) it2;
                if (c7346.f18168) {
                    arrayList2.add(AbstractC5176.m9369(listM10709.subList(0, c7346.nextInt()), "/", null, null, null, 62));
                }
            }
            AbstractC5176.m9363(AbstractC5176.m9353(arrayList2, str), hashSet);
        }
        ArrayList arrayListM9353 = AbstractC5176.m9353(AbstractC5176.m9337(hashSet, new C1272(4)), "");
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayListM9353.iterator();
        while (it3.hasNext()) {
            Enumeration<URL> resources = classLoader.getResources((String) it3.next());
            if (resources != null) {
                list = Collections.list(resources);
                list.getClass();
            } else {
                list = EmptyList.INSTANCE;
            }
            AbstractC5176.m9363(list, arrayList3);
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            String path = ((URL) obj).getPath();
            path.getClass();
            if (hashSet2.add(AbstractC5976.m10716(path, '!'))) {
                arrayList4.add(obj);
            }
        }
        return arrayList4;
    }
}
