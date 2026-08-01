package io.ktor.server.engine;

import androidx.compose.animation.C0426;
import androidx.compose.foundation.C1067;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3054;
import com.kongzue.dialogx.util.C3762;
import io.ktor.http.cio.C3958;
import io.ktor.server.application.C4058;
import io.ktor.server.application.InterfaceC4054;
import io.ktor.server.application.InterfaceC4056;
import io.ktor.server.application.InterfaceC4064;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.server.plugins.NotFoundException;
import io.ktor.server.plugins.PayloadTooLargeException;
import io.ktor.server.plugins.UnsupportedMediaTypeException;
import io.ktor.server.request.AbstractC4130;
import io.ktor.server.request.InterfaceC4126;
import io.ktor.server.request.InterfaceC4128;
import io.ktor.util.AbstractC4209;
import io.ktor.util.C4208;
import io.ktor.util.cio.ChannelIOException;
import io.ktor.util.pipeline.AbstractC4193;
import io.ktor.utils.io.InterfaceC4251;
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
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4359;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import kotlinx.coroutines.AbstractC5394;
import net.bytebuddy.pool.TypePool;
import p048.C6516;
import p048.C6518;
import p230.C8052;
import p236.AbstractC8114;
import p236.C8098;
import p253.AbstractC8188;
import p253.AbstractC8189;
import p400.AbstractC9154;
import p400.InterfaceC9156;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.mcp.config.C5870;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4092 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r7v0, types: [io.ktor.server.application.飘花落叶言子楪世苏兰哲, io.ktor.server.application.飘花落叶言子楪哲苏世兰, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [io.ktor.server.application.飘花落叶言子楪世苏兰哲] */
    /* JADX WARN: Type inference failed for: r7v5, types: [io.ktor.server.application.飘花落叶言子楪世苏兰哲] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8500(io.ktor.server.application.InterfaceC4064 r7, java.lang.Throwable r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.server.engine.DefaultEnginePipelineKt$handleFailure$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.server.engine.DefaultEnginePipelineKt$handleFailure$1 r0 = (io.ktor.server.engine.DefaultEnginePipelineKt$handleFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.engine.DefaultEnginePipelineKt$handleFailure$1 r0 = new io.ktor.server.engine.DefaultEnginePipelineKt$handleFailure$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5175.f14739
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            kotlin.AbstractC5184.m10206(r9)
            return r3
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r7)
            return r6
        L33:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r7 = r0.L$0
            io.ktor.server.application.飘花落叶言子楪世苏兰哲 r7 = (io.ktor.server.application.InterfaceC4056) r7
            kotlin.AbstractC5184.m10206(r9)
            goto L64
        L40:
            kotlin.AbstractC5184.m10206(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            io.ktor.server.application.飘花落叶言子楪世苏哲兰 r9 = r7.mo8470()
            kotlin.reflect.jvm.internal.AbstractC5061.m10022(r9)
            io.ktor.server.engine.DefaultEnginePipelineKt$logError$2 r9 = new io.ktor.server.engine.DefaultEnginePipelineKt$logError$2
            r9.<init>(r7, r8, r6)
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto L5c
            goto L5d
        L5c:
            r9 = r3
        L5d:
            if (r9 != r1) goto L60
            goto L61
        L60:
            r9 = r3
        L61:
            if (r9 != r1) goto L64
            goto La0
        L64:
            r8.getClass()
            boolean r9 = r8 instanceof io.ktor.server.plugins.BadRequestException
            if (r9 == 0) goto L6e
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8096.f22355
            goto L90
        L6e:
            boolean r9 = r8 instanceof io.ktor.server.plugins.NotFoundException
            if (r9 == 0) goto L75
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8096.f22347
            goto L90
        L75:
            boolean r9 = r8 instanceof io.ktor.server.plugins.UnsupportedMediaTypeException
            if (r9 == 0) goto L7c
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8096.f22352
            goto L90
        L7c:
            boolean r9 = r8 instanceof io.ktor.server.plugins.PayloadTooLargeException
            if (r9 == 0) goto L83
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8096.f22342
            goto L90
        L83:
            boolean r9 = r8 instanceof java.util.concurrent.TimeoutException
            if (r9 != 0) goto L8e
            boolean r8 = r8 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r8 == 0) goto L8c
            goto L8e
        L8c:
            r8 = r6
            goto L90
        L8e:
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8096.f22349
        L90:
            if (r8 != 0) goto L94
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8096.f22350
        L94:
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = m8506(r7, r8, r0)
            if (r7 != r1) goto La1
        La0:
            return r1
        La1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.AbstractC4092.m8500(io.ktor.server.application.飘花落叶言子楪哲苏世兰, java.lang.Throwable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Field m8501(Class cls) {
        Field field;
        Field fieldM8501;
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
            if (AbstractC4394.m8917(field.getName(), "ucp") && field.getType().getSimpleName().equals("URLClassPath")) {
                break;
            }
            i++;
        }
        if (field != null) {
            return field;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || (fieldM8501 = m8501(superclass)) == null) {
            return null;
        }
        return fieldM8501;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C4101 m8502(int i, C5870 c5870) {
        List listM13660 = AbstractC8189.m13660(AbstractC4094.f12435);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        emptyCoroutineContext.getClass();
        C4100 c4100 = new C4100();
        c4100.f12445 = i;
        c4100.f12446 = "0.0.0.0";
        InterfaceC4104[] interfaceC4104Arr = (InterfaceC4104[]) Arrays.copyOf(new InterfaceC4104[]{c4100}, 1);
        ClassLoader classLoader = AbstractC4092.class.getClassLoader();
        classLoader.getClass();
        AbstractC9154.m14712("io.ktor.server.Application").getClass();
        C8052 c8052 = new C8052(5);
        InterfaceC9156 interfaceC9156M14712 = AbstractC9154.m14712("io.ktor.server.Application");
        interfaceC9156M14712.getClass();
        C4091 c4091 = new C4091(classLoader, interfaceC9156M14712, c8052);
        ArrayList arrayList = new ArrayList();
        AbstractC8189.m13660(AbstractC4094.f12435);
        boolean z = AbstractC4209.f12696;
        EmptyCoroutineContext emptyCoroutineContext2 = EmptyCoroutineContext.INSTANCE;
        InterfaceC4359 interfaceC4359Plus = EmptyCoroutineContext.INSTANCE.plus(emptyCoroutineContext);
        interfaceC4359Plus.getClass();
        arrayList.add(c5870);
        return new C4101(new C4058(c4091, arrayList, listM13660, "", z, interfaceC4359Plus), new C1067(interfaceC4104Arr, 15));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set m8503(ClassLoader classLoader) {
        Set setM8503;
        Method method;
        classLoader.getClass();
        ClassLoader parent = classLoader.getParent();
        if (parent == null || (setM8503 = m8503(parent)) == null) {
            setM8503 = EmptySet.INSTANCE;
        }
        if (classLoader instanceof URLClassLoader) {
            URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
            uRLs.getClass();
            return AbstractC0455.m1156(AbstractC4343.m8800(AbstractC4346.m8864(uRLs)), setM8503);
        }
        Iterable iterableM8508 = null;
        try {
            try {
                Field fieldM8501 = m8501(classLoader.getClass());
                if (fieldM8501 != null) {
                    fieldM8501.setAccessible(true);
                    Object obj = fieldM8501.get(classLoader);
                    if (obj != null && (method = obj.getClass().getMethod("getURLs", null)) != null) {
                        method.setAccessible(true);
                        URL[] urlArr = (URL[]) method.invoke(obj, null);
                        if (urlArr != null) {
                            iterableM8508 = AbstractC4346.m8850(urlArr);
                        }
                    }
                }
            } catch (Throwable unused) {
                iterableM8508 = m8508(classLoader);
            }
        } catch (Throwable unused2) {
        }
        return iterableM8508 == null ? setM8503 : AbstractC0455.m1156(setM8503, iterableM8508);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8504(io.ktor.util.pipeline.AbstractC4193 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            boolean r0 = r9 instanceof io.ktor.server.engine.BaseApplicationEngineKt$verifyHostHeader$1
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.server.engine.BaseApplicationEngineKt$verifyHostHeader$1 r0 = (io.ktor.server.engine.BaseApplicationEngineKt$verifyHostHeader$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            io.ktor.server.engine.BaseApplicationEngineKt$verifyHostHeader$1 r0 = new io.ktor.server.engine.BaseApplicationEngineKt$verifyHostHeader$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5175.f14739
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 != r5) goto L2e
            java.lang.Object r8 = r0.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r8 = (io.ktor.util.pipeline.AbstractC4193) r8
            kotlin.AbstractC5184.m10206(r9)
            goto L76
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r8)
            return r3
        L34:
            kotlin.AbstractC5184.m10206(r9)
            java.lang.Object r9 = r8.f12660
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r9 = (io.ktor.server.application.InterfaceC4064) r9
            io.ktor.server.request.飘花落叶言子楪世兰苏哲 r9 = r9.mo8469()
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰世哲苏 r9 = r9.mo383()
            java.lang.String[] r2 = p236.AbstractC8114.f22415
            java.lang.String r2 = "Host"
            java.util.List r9 = r9.mo8364(r2)
            if (r9 != 0) goto L4e
            return r4
        L4e:
            int r9 = r9.size()
            if (r9 <= r5) goto L79
            java.lang.Object r9 = r8.f12660
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r9 = (io.ktor.server.application.InterfaceC4064) r9
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r2 = p236.C8096.f22355
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r6 = kotlin.jvm.internal.AbstractC4395.f12971
            java.lang.Class<飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰> r7 = p236.C8096.class
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r6 = r6.mo8927(r7)
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r3 = kotlin.jvm.internal.AbstractC4395.m8922(r7)     // Catch: java.lang.Throwable -> L66
        L66:
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r7 = new 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰
            r7.<init>(r6, r3)
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r9.mo8472(r2, r7, r0)
            if (r9 != r1) goto L76
            goto L7a
        L76:
            r8.mo8578()
        L79:
            r1 = r4
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.AbstractC4092.m8504(io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8505(InterfaceC4054 interfaceC4054, InterfaceC4056 interfaceC4056, Throwable th) {
        String str;
        try {
            Object objMo398 = interfaceC4056.mo8471().mo398();
            if (objMo398 == null) {
                objMo398 = "Unhandled";
            }
            try {
                try {
                    InterfaceC4128 interfaceC4128Mo8469 = interfaceC4056.mo8469();
                    interfaceC4128Mo8469.getClass();
                    str = ((C8098) ((C1245) AbstractC8188.m13653(interfaceC4128Mo8469)).f3618).f22376 + " - " + AbstractC3054.m6606(interfaceC4128Mo8469);
                } catch (OutOfMemoryError unused) {
                    System.err.print((Object) "OutOfMemoryError: ");
                    System.err.print((Object) th.getMessage());
                    System.err.print((Object) "\n");
                    return;
                }
            } catch (Throwable th2) {
                str = "(request error: " + th2 + ')';
            }
            String str2 = objMo398 + ": " + str + ". Exception " + AbstractC4395.f12971.mo8927(th.getClass()) + ": " + th.getMessage();
            if (!(th instanceof CancellationException) && !(th instanceof ClosedChannelException) && !(th instanceof ChannelIOException) && !(th instanceof IOException) && !(th instanceof BadRequestException) && !(th instanceof NotFoundException) && !(th instanceof PayloadTooLargeException) && !(th instanceof UnsupportedMediaTypeException)) {
                ((C4091) interfaceC4054).f12433.error(objMo398 + ": " + str, th);
                return;
            }
            ((C4091) interfaceC4054).f12433.debug(str2, th);
        } catch (OutOfMemoryError unused2) {
            InterfaceC9156 interfaceC9156 = ((C4091) interfaceC4054).f12433;
            interfaceC9156.getClass();
            th.getClass();
            String message = th.getMessage();
            if (message == null) {
                message = "Exception of type " + AbstractC4395.f12971.mo8927(th.getClass());
            }
            interfaceC9156.error(message, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8506(io.ktor.server.application.InterfaceC4056 r6, p236.C8096 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            java.lang.Class<飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰> r0 = p236.C8096.class
            boolean r1 = r8 instanceof io.ktor.server.engine.DefaultEnginePipelineKt$tryRespondError$1
            if (r1 == 0) goto L15
            r1 = r8
            io.ktor.server.engine.DefaultEnginePipelineKt$tryRespondError$1 r1 = (io.ktor.server.engine.DefaultEnginePipelineKt$tryRespondError$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            io.ktor.server.engine.DefaultEnginePipelineKt$tryRespondError$1 r1 = new io.ktor.server.engine.DefaultEnginePipelineKt$tryRespondError$1
            r1.<init>(r8)
        L1a:
            java.lang.Object r8 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L30
            if (r3 != r5) goto L2a
            kotlin.AbstractC5184.m10206(r8)     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            goto L4b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r6)
            return r4
        L30:
            kotlin.AbstractC5184.m10206(r8)
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r8 = kotlin.jvm.internal.AbstractC4395.f12971     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r8 = r8.mo8927(r0)     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r4 = kotlin.jvm.internal.AbstractC4395.m8922(r0)     // Catch: java.lang.Throwable -> L3d
        L3d:
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r0 = new 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            r0.<init>(r8, r4)     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            r1.label = r5     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            java.lang.Object r6 = r6.mo8472(r7, r0, r1)     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            if (r6 != r2) goto L4b
            return r2
        L4b:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5175.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.AbstractC4092.m8506(io.ktor.server.application.飘花落叶言子楪世苏兰哲, 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3958 m8507(AbstractC4193 abstractC4193, InterfaceC4251 interfaceC4251) {
        abstractC4193.getClass();
        InterfaceC4064 interfaceC4064 = (InterfaceC4064) abstractC4193.f12660;
        InterfaceC4126 interfaceC4126Mo8469 = interfaceC4064.mo8469();
        String[] strArr = AbstractC8114.f22415;
        String strM6609 = AbstractC3054.m6609(interfaceC4126Mo8469, "Content-Type");
        if (strM6609 == null) {
            C5919.m11250("Content-Type header is required for multipart processing");
            return null;
        }
        String strM66092 = AbstractC3054.m6609(interfaceC4064.mo8469(), "Content-Length");
        Long lValueOf = strM66092 != null ? Long.valueOf(Long.parseLong(strM66092)) : null;
        InterfaceC4359 interfaceC4359Plus = abstractC4193.mo2420().plus(AbstractC5394.f15029);
        C4208 c4208 = AbstractC4130.f12523;
        interfaceC4064.getClass();
        Long l = (Long) interfaceC4064.getAttributes().m8597(AbstractC4130.f12523);
        return new C3958(interfaceC4359Plus, interfaceC4251, strM6609, lValueOf, l != null ? l.longValue() : 52428800L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final ArrayList m8508(ClassLoader classLoader) throws IOException {
        Iterable list;
        ArrayList arrayListM8101 = new C3762(classLoader).m8101();
        ArrayList<String> arrayList = new ArrayList(AbstractC4344.m8832(arrayListM8101, 10));
        Iterator it = arrayListM8101.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC5138.m10129((String) it.next(), TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        }
        HashSet hashSet = new HashSet();
        for (String str : arrayList) {
            List listM10147 = AbstractC5143.m10147(str, new char[]{'/'});
            C6518 c6518 = new C6518(1, listM10147.size(), 1);
            ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(c6518, 10));
            Iterator it2 = c6518.iterator();
            while (true) {
                C6516 c6516 = (C6516) it2;
                if (c6516.f17827) {
                    arrayList2.add(AbstractC4343.m8813(listM10147.subList(0, c6516.nextInt()), "/", null, null, null, 62));
                }
            }
            AbstractC4343.m8794(AbstractC4343.m8821(arrayList2, str), hashSet);
        }
        ArrayList arrayListM8821 = AbstractC4343.m8821(AbstractC4343.m8817(hashSet, new C0426(4)), "");
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayListM8821.iterator();
        while (it3.hasNext()) {
            Enumeration<URL> resources = classLoader.getResources((String) it3.next());
            if (resources != null) {
                list = Collections.list(resources);
                list.getClass();
            } else {
                list = EmptyList.INSTANCE;
            }
            AbstractC4343.m8794(list, arrayList3);
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            String path = ((URL) obj).getPath();
            path.getClass();
            if (hashSet2.add(AbstractC5143.m10137(path, '!'))) {
                arrayList4.add(obj);
            }
        }
        return arrayList4;
    }
}
