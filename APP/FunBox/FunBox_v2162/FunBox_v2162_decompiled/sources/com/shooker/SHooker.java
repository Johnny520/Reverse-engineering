package com.shooker;

import android.util.Pair;
import dalvik.system.DexFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Random;
import p000a.AbstractC0001b;
import p014o.C0211a;

/* JADX INFO: loaded from: classes.dex */
public class SHooker {

    /* JADX INFO: renamed from: a */
    public static HashMap f59a = new HashMap();

    public static native synchronized boolean _deoptimize(Member member);

    public static native synchronized void _init();

    public static native synchronized void _replace(Member member, Member member2, Member member3);

    public static native synchronized boolean _setClassLoaderTrusted(ClassLoader classLoader);

    private static native synchronized boolean _setDexFileTrusted(DexFile dexFile);

    /* JADX INFO: renamed from: a */
    public static C0211a m68a(Member member, AbstractC0001b abstractC0001b) {
        C0015a c0015aM67a;
        int iHashCode = member.hashCode();
        if (f59a.containsKey(Integer.valueOf(iHashCode))) {
            throw new IllegalArgumentException("Member " + member + " is already hooked.");
        }
        if (Modifier.isAbstract(member.getModifiers())) {
            throw new IllegalArgumentException("Cannot hook abstract methods: " + member);
        }
        if (Modifier.isNative(member.getModifiers())) {
            throw new IllegalArgumentException("Cannot hook native methods: " + member);
        }
        if (Proxy.isProxyClass(member.getDeclaringClass())) {
            throw new IllegalArgumentException("Cannot hook proxy methods: " + member);
        }
        if (Modifier.isInterface(member.getDeclaringClass().getModifiers())) {
            throw new IllegalArgumentException("Cannot hook interface methods: " + member);
        }
        C0211a c0211a = new C0211a(member);
        c0211a.f820c = abstractC0001b;
        f59a.put(Integer.valueOf(iHashCode), c0211a);
        Class<?> declaringClass = member.getDeclaringClass();
        boolean zIsNative = Modifier.isNative(member.getModifiers());
        boolean zIsProxyClass = Proxy.isProxyClass(declaringClass);
        if (zIsNative || zIsProxyClass) {
            throw new IllegalArgumentException("Cannot hook native methods and proxy methods: " + member);
        }
        if (member instanceof Method) {
            Method method = (Method) member;
            String str = "A" + new Random().nextInt(99999999);
            c0015aM67a = ReplaceCallback.m67a();
            Pair pairM69b = m69b(str, method.getName(), AbstractC0001b.m0e(str, method.getName(), method.getReturnType(), method.getParameterTypes(), Modifier.isStatic(method.getModifiers()), c0015aM67a.f62c), c0015aM67a);
            c0015aM67a.f60a = (Method) pairM69b.second;
            c0015aM67a.f61b = (Method) pairM69b.first;
        } else if (member instanceof Constructor) {
            String str2 = "A" + new Random().nextInt();
            c0015aM67a = ReplaceCallback.m67a();
            Pair pairM69b2 = m69b(str2, "__init", AbstractC0001b.m0e(str2, "__init", Void.TYPE, ((Constructor) member).getParameterTypes(), false, c0015aM67a.f62c), c0015aM67a);
            c0015aM67a.f60a = (Method) pairM69b2.second;
            c0015aM67a.f61b = (Method) pairM69b2.first;
        } else {
            c0015aM67a = null;
        }
        if (c0015aM67a != null) {
            c0015aM67a.f63d = c0211a;
            Method method2 = c0015aM67a.f60a;
            c0211a.f819b = method2;
            _replace(member, c0015aM67a.f61b, method2);
            c0015aM67a.f60a.setAccessible(true);
        }
        return c0211a;
    }

    /* JADX INFO: renamed from: b */
    private static Pair m69b(String str, String str2, byte[] bArr, C0015a c0015a) {
        Method method = null;
        Constructor<?> constructor = null;
        for (Constructor<?> constructor2 : DexFile.class.getDeclaredConstructors()) {
            if (constructor2.getParameterCount() == 3 && constructor2.getParameterTypes()[0] == ByteBuffer[].class) {
                constructor = constructor2;
            }
        }
        if (constructor == null) {
            throw new RuntimeException("Can't create target and backup method because dexCreator == null");
        }
        try {
            ByteBuffer[] byteBufferArr = {ByteBuffer.wrap(bArr)};
            constructor.setAccessible(true);
            DexFile dexFile = (DexFile) constructor.newInstance(byteBufferArr, SHooker.class.getClassLoader(), null);
            Method declaredMethod = DexFile.class.getDeclaredMethod("loadClass", String.class, ClassLoader.class);
            declaredMethod.setAccessible(true);
            Method method2 = null;
            for (Method method3 : ((Class) declaredMethod.invoke(dexFile, str, SHooker.class.getClassLoader())).getDeclaredMethods()) {
                if (method3.getName().equals(str2)) {
                    method = method3;
                }
                if (method3.getName().equals("backup")) {
                    method2 = method3;
                }
            }
            return new Pair(method, method2);
        } catch (Exception e2) {
            throw new RuntimeException("Can't create target and backup method", e2);
        }
    }
}
