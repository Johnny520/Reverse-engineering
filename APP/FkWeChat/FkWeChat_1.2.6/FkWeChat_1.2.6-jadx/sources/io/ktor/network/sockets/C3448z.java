package io.ktor.network.sockets;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.SocketOption;
import java.nio.channels.DatagramChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p185m8.AbstractC5107t0;
import p185m8.AbstractC5109u0;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: io.ktor.network.sockets.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3448z {

    /* JADX INFO: renamed from: a */
    public static final C3448z f9510a = new C3448z();

    /* JADX INFO: renamed from: b */
    public static final Map f9511b;

    /* JADX INFO: renamed from: c */
    public static final Method f9512c;

    /* JADX INFO: renamed from: d */
    public static final Method f9513d;

    /* JADX INFO: renamed from: e */
    public static final Method f9514e;

    static {
        Map mapM20768i;
        Method method;
        Method method2;
        try {
            Field[] fields = Class.forName("java.net.StandardSocketOptions").getFields();
            if (fields != null) {
                ArrayList arrayList = new ArrayList();
                for (Field field : fields) {
                    int modifiers = field.getModifiers();
                    if (Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers) && Modifier.isPublic(modifiers)) {
                        arrayList.add(field);
                    }
                }
                mapM20768i = new LinkedHashMap(AbstractC2368o.m8578e(AbstractC5107t0.m20763e(AbstractC5116y.m20814z(arrayList, 10)), 16));
                for (Object obj : arrayList) {
                    String name = ((Field) obj).getName();
                    name.getClass();
                    mapM20768i.put(name, obj);
                }
            } else {
                mapM20768i = AbstractC5109u0.m20768i();
            }
        } catch (Throwable unused) {
            mapM20768i = AbstractC5109u0.m20768i();
        }
        f9511b = mapM20768i;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("java.nio.channels.SocketChannel");
            Method[] methods = cls.getMethods();
            methods.getClass();
            int length = methods.length;
            for (int i10 = 0; i10 < length; i10++) {
                method = methods[i10];
                int modifiers2 = method.getModifiers();
                if (Modifier.isPublic(modifiers2) && !Modifier.isStatic(modifiers2) && AbstractC1061t.m3842c(method.getName(), "setOption") && method.getParameterTypes().length == 2 && AbstractC1061t.m3842c(method.getReturnType(), cls) && AbstractC1061t.m3842c(method.getParameterTypes()[0], SocketOption.class) && AbstractC1061t.m3842c(method.getParameterTypes()[1], Object.class)) {
                    break;
                }
            }
        } catch (Throwable unused2) {
        }
        method = null;
        f9512c = method;
        try {
            Class<?> cls2 = Class.forName("java.nio.channels.ServerSocketChannel");
            Method[] methods2 = cls2.getMethods();
            methods2.getClass();
            int length2 = methods2.length;
            for (int i11 = 0; i11 < length2; i11++) {
                method2 = methods2[i11];
                int modifiers3 = method2.getModifiers();
                if (Modifier.isPublic(modifiers3) && !Modifier.isStatic(modifiers3) && AbstractC1061t.m3842c(method2.getName(), "setOption") && method2.getParameterTypes().length == 2 && AbstractC1061t.m3842c(method2.getReturnType(), cls2) && AbstractC1061t.m3842c(method2.getParameterTypes()[0], SocketOption.class) && AbstractC1061t.m3842c(method2.getParameterTypes()[1], Object.class)) {
                    break;
                }
            }
        } catch (Throwable unused3) {
        }
        method2 = null;
        f9513d = method2;
        try {
            Class<?> cls3 = Class.forName("java.nio.channels.DatagramChannel");
            Method[] methods3 = cls3.getMethods();
            methods3.getClass();
            int length3 = methods3.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length3) {
                    break;
                }
                Method method4 = methods3[i12];
                int modifiers4 = method4.getModifiers();
                if (Modifier.isPublic(modifiers4) && !Modifier.isStatic(modifiers4) && AbstractC1061t.m3842c(method4.getName(), "setOption") && method4.getParameterTypes().length == 2 && AbstractC1061t.m3842c(method4.getReturnType(), cls3) && AbstractC1061t.m3842c(method4.getParameterTypes()[0], SocketOption.class) && AbstractC1061t.m3842c(method4.getParameterTypes()[1], Object.class)) {
                    method3 = method4;
                    break;
                }
                i12++;
            }
        } catch (Throwable unused4) {
        }
        f9514e = method3;
    }

    /* JADX INFO: renamed from: a */
    public final void m12858a(DatagramChannel datagramChannel) throws IllegalAccessException, IOException, InvocationTargetException {
        datagramChannel.getClass();
        Object objM12861d = m12861d("SO_REUSEPORT");
        Method method = f9514e;
        method.getClass();
        method.invoke(datagramChannel, objM12861d, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: b */
    public final void m12859b(ServerSocketChannel serverSocketChannel) throws IllegalAccessException, IOException, InvocationTargetException {
        serverSocketChannel.getClass();
        Object objM12861d = m12861d("SO_REUSEPORT");
        Method method = f9513d;
        method.getClass();
        method.invoke(serverSocketChannel, objM12861d, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c */
    public final void m12860c(SocketChannel socketChannel) throws IllegalAccessException, IOException, InvocationTargetException {
        socketChannel.getClass();
        Object objM12861d = m12861d("SO_REUSEPORT");
        Method method = f9512c;
        method.getClass();
        method.invoke(socketChannel, objM12861d, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: d */
    public final Object m12861d(String str) throws IOException {
        Object obj;
        Field field = (Field) f9511b.get(str);
        if (field != null && (obj = field.get(null)) != null) {
            return obj;
        }
        throw new IOException("Socket option " + str + " is not supported");
    }
}
