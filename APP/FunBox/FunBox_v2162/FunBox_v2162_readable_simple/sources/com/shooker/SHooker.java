package com.shooker;

import android.util.Pair;
import dalvik.system.DexFile;
import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.hookbackend.HookRecord;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class SHooker {

    /* JADX INFO: renamed from: a */
    public static HashMap f59a;

    static {
        f59a = new HashMap();
    }

    public static native synchronized boolean _deoptimize(Member r0);

    public static native synchronized void _init();

    public static native synchronized void _replace(Member r0, Member r1, Member r2);

    public static native synchronized boolean _setClassLoaderTrusted(ClassLoader r0);

    private static native synchronized boolean _setDexFileTrusted(DexFile r0);

    /* JADX INFO: renamed from: a */
    public static HookRecord m68a(Member r9, RuntimeDexGenerator r10) {
        int r0 = r9.hashCode();
        if (f59a.containsKey(Integer.valueOf(r0)) == true) goto L36;
        if (Modifier.isAbstract(r9.getModifiers()) == true) goto L34;
        if (Modifier.isNative(r9.getModifiers()) == true) goto L32;
        if (Proxy.isProxyClass(r9.getDeclaringClass()) == true) goto L30;
        if (Modifier.isInterface(r9.getDeclaringClass().getModifiers()) == true) goto L28;
        HookRecord r1 = new HookRecord(r9);
        r1.f820c = r10;
        f59a.put(Integer.valueOf(r0), r1);
        Class<?> r102 = r9.getDeclaringClass();
        boolean r02 = Modifier.isNative(r9.getModifiers());
        boolean r103 = Proxy.isProxyClass(r102);
        if (r02 == true) goto L26;
        if (r103 == true) goto L26;
        if ((r9 instanceof Method) == false) goto L19;
        Method r104 = (Method) r9;
        String r03 = "A" + new Random().nextInt(99999999);
        HookReplacementRecord r2 = ReplaceCallback.m67a();
        Pair r105 = m69b(r03, r104.getName(), RuntimeDexGenerator.m0e(r03, r104.getName(), r104.getReturnType(), r104.getParameterTypes(), Modifier.isStatic(r104.getModifiers()), r2.f62c), r2);
        r2.f60a = (Method) r105.second;
        r2.f61b = (Method) r105.first;
    L22:
        if (r2 == null) goto L24;
        r2.f63d = r1;
        Method r106 = r2.f60a;
        r1.f819b = r106;
        _replace(r9, r2.f61b, r106);
        r2.f60a.setAccessible(true);
    L24:
        return r1;
    L19:
        if ((r9 instanceof Constructor) == false) goto L21;
        String r04 = "A" + new Random().nextInt();
        r2 = ReplaceCallback.m67a();
        Pair r107 = m69b(r04, "__init", RuntimeDexGenerator.m0e(r04, "__init", Void.TYPE, ((Constructor) r9).getParameterTypes(), false, r2.f62c), r2);
        r2.f60a = (Method) r107.second;
        r2.f61b = (Method) r107.first;
        goto L22
    L21:
        r2 = null;
    L26:
        throw new IllegalArgumentException("Cannot hook native methods and proxy methods: " + r9);
    L28:
        throw new IllegalArgumentException("Cannot hook interface methods: " + r9);
    L30:
        throw new IllegalArgumentException("Cannot hook proxy methods: " + r9);
    L32:
        throw new IllegalArgumentException("Cannot hook native methods: " + r9);
    L34:
        throw new IllegalArgumentException("Cannot hook abstract methods: " + r9);
    L36:
        throw new IllegalArgumentException("Member " + r9 + " is already hooked.");
    }

    /* JADX INFO: renamed from: b */
    private static Pair m69b(String r10, String r11, byte[] r12, HookReplacementRecord r13) {
        Constructor<?>[] r1 = DexFile.class.getDeclaredConstructors();
        int r2 = r1.length;
        Method r3 = null;
        int r4 = 0;
        Constructor<?> r6 = null;
        int r5 = 0;
    L4:
        if (r5 >= r2) goto L11;
        Constructor<?> r8 = r1[r5];
        if (r8.getParameterCount() != 3) goto L10;
        if (r8.getParameterTypes()[0] != ByteBuffer[].class) goto L10;
        r6 = r8;
    L10:
        r5 = r5 + 1;
        goto L4
    L11:
        if (r6 == null) goto L27;
        ByteBuffer[] r122 = {ByteBuffer.wrap(r12)};     // Catch: Exception -> L23
        r6.setAccessible(true);     // Catch: Exception -> L23
        DexFile r22 = (DexFile) r6.newInstance(new Object[]{r122, SHooker.class.getClassLoader(), null});     // Catch: Exception -> L23
        Method r0 = DexFile.class.getDeclaredMethod("loadClass", new Class[]{String.class, ClassLoader.class});     // Catch: Exception -> L23
        r0.setAccessible(true);     // Catch: Exception -> L23
        Method[] r102 = ((Class) r0.invoke(r22, new Object[]{r10, SHooker.class.getClassLoader()})).getDeclaredMethods();     // Catch: Exception -> L23
        int r123 = r102.length;     // Catch: Exception -> L23
        Method r132 = null;
    L13:
        if (r4 >= r123) goto L21;
        Method r02 = r102[r4];     // Catch: Exception -> L23
        if (r02.getName().equals(r11) == false) goto L18;
        r3 = r02;
    L18:
        if (r02.getName().equals("backup") == false) goto L20;
        r132 = r02;
    L20:
        r4 = r4 + 1;     // Catch: Exception -> L23
        goto L13
    L21:
        return new Pair(r3, r132);
    L23:
        e = move-exception;
        throw new RuntimeException("Can't create target and backup method", e);
    L27:
        throw new RuntimeException("Can't create target and backup method because dexCreator == null");
    }
}
