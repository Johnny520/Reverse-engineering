package io.ktor.server.engine;

import androidx.compose.animation.C0426;
import androidx.compose.foundation.C1067;
import androidx.compose.runtime.internal.C1245;
import com.alibaba.fastjson2.AbstractC2905;
import com.kongzue.dialogx.util.C3763;
import io.ktor.http.cio.C3959;
import io.ktor.server.application.C4059;
import io.ktor.server.application.InterfaceC4055;
import io.ktor.server.application.InterfaceC4057;
import io.ktor.server.application.InterfaceC4065;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.server.plugins.NotFoundException;
import io.ktor.server.plugins.PayloadTooLargeException;
import io.ktor.server.plugins.UnsupportedMediaTypeException;
import io.ktor.server.request.AbstractC4131;
import io.ktor.server.request.InterfaceC4127;
import io.ktor.server.request.InterfaceC4129;
import io.ktor.util.AbstractC4210;
import io.ktor.util.C4209;
import io.ktor.util.cio.ChannelIOException;
import io.ktor.util.pipeline.AbstractC4194;
import io.ktor.utils.io.InterfaceC4252;
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
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC4360;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.AbstractC5395;
import net.bytebuddy.pool.TypePool;
import p034.AbstractC6347;
import p048.C6517;
import p048.C6519;
import p175.AbstractC7739;
import p230.C8053;
import p236.AbstractC8115;
import p236.C8099;
import p253.AbstractC8189;
import p398.AbstractC9139;
import p398.InterfaceC9141;
import top.suzhelan.qstory.hook.item.C5925;
import top.suzhelan.qstory.hook.item.mcp.config.C5875;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4093 {
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
    public static final java.lang.Object m8490(io.ktor.server.application.InterfaceC4065 r7, java.lang.Throwable r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
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
            kotlin.飘花落叶言子楪兰苏哲世 r3 = kotlin.C5176.f14739
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            kotlin.AbstractC5185.m10210(r9)
            return r3
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r7)
            return r6
        L33:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r7 = r0.L$0
            io.ktor.server.application.飘花落叶言子楪世苏兰哲 r7 = (io.ktor.server.application.InterfaceC4057) r7
            kotlin.AbstractC5185.m10210(r9)
            goto L64
        L40:
            kotlin.AbstractC5185.m10210(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            io.ktor.server.application.飘花落叶言子楪世苏哲兰 r9 = r7.mo8460()
            kotlin.reflect.jvm.internal.types.AbstractC4922.m9883(r9)
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
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8097.f22353
            goto L90
        L6e:
            boolean r9 = r8 instanceof io.ktor.server.plugins.NotFoundException
            if (r9 == 0) goto L75
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8097.f22345
            goto L90
        L75:
            boolean r9 = r8 instanceof io.ktor.server.plugins.UnsupportedMediaTypeException
            if (r9 == 0) goto L7c
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8097.f22350
            goto L90
        L7c:
            boolean r9 = r8 instanceof io.ktor.server.plugins.PayloadTooLargeException
            if (r9 == 0) goto L83
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8097.f22340
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
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8097.f22347
        L90:
            if (r8 != 0) goto L94
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r8 = p236.C8097.f22348
        L94:
            r0.L$0 = r6
            r0.L$1 = r6
            r0.label = r4
            java.lang.Object r7 = m8496(r7, r8, r0)
            if (r7 != r1) goto La1
        La0:
            return r1
        La1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.AbstractC4093.m8490(io.ktor.server.application.飘花落叶言子楪哲苏世兰, java.lang.Throwable, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Field m8491(Class cls) {
        Field field;
        Field fieldM8491;
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
            if (AbstractC4395.m8907(field.getName(), "ucp") && field.getType().getSimpleName().equals("URLClassPath")) {
                break;
            }
            i++;
        }
        if (field != null) {
            return field;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || (fieldM8491 = m8491(superclass)) == null) {
            return null;
        }
        return fieldM8491;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C4102 m8492(int i, C5875 c5875) {
        List listM11928 = AbstractC6347.m11928(AbstractC4095.f12439);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        emptyCoroutineContext.getClass();
        C4101 c4101 = new C4101();
        c4101.f12449 = i;
        c4101.f12450 = "0.0.0.0";
        InterfaceC4105[] interfaceC4105Arr = (InterfaceC4105[]) Arrays.copyOf(new InterfaceC4105[]{c4101}, 1);
        ClassLoader classLoader = AbstractC4093.class.getClassLoader();
        classLoader.getClass();
        AbstractC9139.m14703("io.ktor.server.Application").getClass();
        C8053 c8053 = new C8053(5);
        InterfaceC9141 interfaceC9141M14703 = AbstractC9139.m14703("io.ktor.server.Application");
        interfaceC9141M14703.getClass();
        C4092 c4092 = new C4092(classLoader, interfaceC9141M14703, c8053);
        ArrayList arrayList = new ArrayList();
        AbstractC6347.m11928(AbstractC4095.f12439);
        boolean z = AbstractC4210.f12700;
        EmptyCoroutineContext emptyCoroutineContext2 = EmptyCoroutineContext.INSTANCE;
        InterfaceC4360 interfaceC4360Plus = EmptyCoroutineContext.INSTANCE.plus(emptyCoroutineContext);
        interfaceC4360Plus.getClass();
        arrayList.add(c5875);
        return new C4102(new C4059(c4092, arrayList, listM11928, "", z, interfaceC4360Plus), new C1067(interfaceC4105Arr, 15));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set m8493(ClassLoader classLoader) {
        Set setM8493;
        Method method;
        classLoader.getClass();
        ClassLoader parent = classLoader.getParent();
        if (parent == null || (setM8493 = m8493(parent)) == null) {
            setM8493 = EmptySet.INSTANCE;
        }
        if (classLoader instanceof URLClassLoader) {
            URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
            uRLs.getClass();
            return AbstractC7739.m13054(AbstractC4344.m8788(AbstractC4347.m8826(uRLs)), setM8493);
        }
        Iterable iterableM8498 = null;
        try {
            try {
                Field fieldM8491 = m8491(classLoader.getClass());
                if (fieldM8491 != null) {
                    fieldM8491.setAccessible(true);
                    Object obj = fieldM8491.get(classLoader);
                    if (obj != null && (method = obj.getClass().getMethod("getURLs", null)) != null) {
                        method.setAccessible(true);
                        URL[] urlArr = (URL[]) method.invoke(obj, null);
                        if (urlArr != null) {
                            iterableM8498 = AbstractC4347.m8846(urlArr);
                        }
                    }
                }
            } catch (Throwable unused) {
                iterableM8498 = m8498(classLoader);
            }
        } catch (Throwable unused2) {
        }
        return iterableM8498 == null ? setM8493 : AbstractC7739.m13054(setM8493, iterableM8498);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8494(io.ktor.util.pipeline.AbstractC4194 r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
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
            kotlin.飘花落叶言子楪兰苏哲世 r4 = kotlin.C5176.f14739
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 != r5) goto L2e
            java.lang.Object r8 = r0.L$0
            io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏 r8 = (io.ktor.util.pipeline.AbstractC4194) r8
            kotlin.AbstractC5185.m10210(r9)
            goto L76
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r8)
            return r3
        L34:
            kotlin.AbstractC5185.m10210(r9)
            java.lang.Object r9 = r8.f12664
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r9 = (io.ktor.server.application.InterfaceC4065) r9
            io.ktor.server.request.飘花落叶言子楪世兰苏哲 r9 = r9.mo8459()
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪兰世哲苏 r9 = r9.mo384()
            java.lang.String[] r2 = p236.AbstractC8115.f22413
            java.lang.String r2 = "Host"
            java.util.List r9 = r9.mo8354(r2)
            if (r9 != 0) goto L4e
            return r4
        L4e:
            int r9 = r9.size()
            if (r9 <= r5) goto L79
            java.lang.Object r9 = r8.f12664
            io.ktor.server.application.飘花落叶言子楪哲苏世兰 r9 = (io.ktor.server.application.InterfaceC4065) r9
            飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰 r2 = p236.C8097.f22353
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r6 = kotlin.jvm.internal.AbstractC4396.f12975
            java.lang.Class<飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰> r7 = p236.C8097.class
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r6 = r6.mo8917(r7)
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r3 = kotlin.jvm.internal.AbstractC4396.m8912(r7)     // Catch: java.lang.Throwable -> L66
        L66:
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r7 = new 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰
            r7.<init>(r6, r3)
            r0.L$0 = r8
            r0.label = r5
            java.lang.Object r9 = r9.mo8462(r2, r7, r0)
            if (r9 != r1) goto L76
            goto L7a
        L76:
            r8.mo8568()
        L79:
            r1 = r4
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.AbstractC4093.m8494(io.ktor.util.pipeline.飘花落叶言子楪世哲兰苏, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final void m8495(InterfaceC4055 interfaceC4055, InterfaceC4057 interfaceC4057, Throwable th) {
        String str;
        try {
            Object objMo399 = interfaceC4057.mo8461().mo399();
            if (objMo399 == null) {
                objMo399 = "Unhandled";
            }
            try {
                try {
                    InterfaceC4129 interfaceC4129Mo8459 = interfaceC4057.mo8459();
                    interfaceC4129Mo8459.getClass();
                    str = ((C8099) ((C1245) AbstractC8189.m13677(interfaceC4129Mo8459)).f3619).f22374 + " - " + AbstractC2905.m6336(interfaceC4129Mo8459);
                } catch (OutOfMemoryError unused) {
                    System.err.print((Object) "OutOfMemoryError: ");
                    System.err.print((Object) th.getMessage());
                    System.err.print((Object) "\n");
                    return;
                }
            } catch (Throwable th2) {
                str = "(request error: " + th2 + ')';
            }
            String str2 = objMo399 + ": " + str + ". Exception " + AbstractC4396.f12975.mo8917(th.getClass()) + ": " + th.getMessage();
            if (!(th instanceof CancellationException) && !(th instanceof ClosedChannelException) && !(th instanceof ChannelIOException) && !(th instanceof IOException) && !(th instanceof BadRequestException) && !(th instanceof NotFoundException) && !(th instanceof PayloadTooLargeException) && !(th instanceof UnsupportedMediaTypeException)) {
                ((C4092) interfaceC4055).f12437.error(objMo399 + ": " + str, th);
                return;
            }
            ((C4092) interfaceC4055).f12437.debug(str2, th);
        } catch (OutOfMemoryError unused2) {
            InterfaceC9141 interfaceC9141 = ((C4092) interfaceC4055).f12437;
            interfaceC9141.getClass();
            th.getClass();
            String message = th.getMessage();
            if (message == null) {
                message = "Exception of type " + AbstractC4396.f12975.mo8917(th.getClass());
            }
            interfaceC9141.error(message, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m8496(io.ktor.server.application.InterfaceC4057 r6, p236.C8097 r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            java.lang.Class<飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰> r0 = p236.C8097.class
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
            kotlin.AbstractC5185.m10210(r8)     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            goto L4b
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5925.m11311(r6)
            return r4
        L30:
            kotlin.AbstractC5185.m10210(r8)
            kotlin.jvm.internal.飘花落叶言子楪苏兰哲世 r8 = kotlin.jvm.internal.AbstractC4396.f12975     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            kotlin.reflect.飘花落叶言子楪世哲兰苏 r8 = r8.mo8917(r0)     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            kotlin.reflect.飘花落叶言子世楪苏兰哲 r4 = kotlin.jvm.internal.AbstractC4396.m8912(r0)     // Catch: java.lang.Throwable -> L3d
        L3d:
            飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰 r0 = new 飘花落叶言世子楪苏哲兰.飘花落叶言子楪世苏哲兰     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            r0.<init>(r8, r4)     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            r1.label = r5     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            java.lang.Object r6 = r6.mo8462(r7, r0, r1)     // Catch: io.ktor.server.engine.BaseApplicationResponse$ResponseAlreadySentException -> L4b
            if (r6 != r2) goto L4b
            return r2
        L4b:
            kotlin.飘花落叶言子楪兰苏哲世 r6 = kotlin.C5176.f14739
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.engine.AbstractC4093.m8496(io.ktor.server.application.飘花落叶言子楪世苏兰哲, 飘花落叶言楪兰世哲子苏.飘花落叶言子世楪哲苏兰, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C3959 m8497(AbstractC4194 abstractC4194, InterfaceC4252 interfaceC4252) {
        abstractC4194.getClass();
        InterfaceC4065 interfaceC4065 = (InterfaceC4065) abstractC4194.f12664;
        InterfaceC4127 interfaceC4127Mo8459 = interfaceC4065.mo8459();
        String[] strArr = AbstractC8115.f22413;
        String strM6304 = AbstractC2905.m6304(interfaceC4127Mo8459, "Content-Type");
        if (strM6304 == null) {
            C5925.m11311("Content-Type header is required for multipart processing");
            return null;
        }
        String strM63042 = AbstractC2905.m6304(interfaceC4065.mo8459(), "Content-Length");
        Long lValueOf = strM63042 != null ? Long.valueOf(Long.parseLong(strM63042)) : null;
        InterfaceC4360 interfaceC4360Plus = abstractC4194.mo2430().plus(AbstractC5395.f15029);
        C4209 c4209 = AbstractC4131.f12527;
        interfaceC4065.getClass();
        Long l = (Long) interfaceC4065.getAttributes().m8587(AbstractC4131.f12527);
        return new C3959(interfaceC4360Plus, interfaceC4252, strM6304, lValueOf, l != null ? l.longValue() : 52428800L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final ArrayList m8498(ClassLoader classLoader) throws IOException {
        Iterable list;
        ArrayList arrayListM8088 = new C3763(classLoader).m8088();
        ArrayList<String> arrayList = new ArrayList(AbstractC4345.m8822(arrayListM8088, 10));
        Iterator it = arrayListM8088.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC5139.m10129((String) it.next(), TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/'));
        }
        HashSet hashSet = new HashSet();
        for (String str : arrayList) {
            List listM10150 = AbstractC5144.m10150(str, new char[]{'/'});
            C6519 c6519 = new C6519(1, listM10150.size(), 1);
            ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(c6519, 10));
            Iterator it2 = c6519.iterator();
            while (true) {
                C6517 c6517 = (C6517) it2;
                if (c6517.f17823) {
                    arrayList2.add(AbstractC4344.m8810(listM10150.subList(0, c6517.nextInt()), "/", null, null, null, 62));
                }
            }
            AbstractC4344.m8804(AbstractC4344.m8794(arrayList2, str), hashSet);
        }
        ArrayList arrayListM8794 = AbstractC4344.m8794(AbstractC4344.m8778(hashSet, new C0426(4)), "");
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayListM8794.iterator();
        while (it3.hasNext()) {
            Enumeration<URL> resources = classLoader.getResources((String) it3.next());
            if (resources != null) {
                list = Collections.list(resources);
                list.getClass();
            } else {
                list = EmptyList.INSTANCE;
            }
            AbstractC4344.m8804(list, arrayList3);
        }
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            String path = ((URL) obj).getPath();
            path.getClass();
            if (hashSet2.add(AbstractC5144.m10157(path, '!'))) {
                arrayList4.add(obj);
            }
        }
        return arrayList4;
    }
}
