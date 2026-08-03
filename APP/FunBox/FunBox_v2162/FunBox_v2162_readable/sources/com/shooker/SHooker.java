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
    public static HashMap f59a = new HashMap();

    public static native synchronized boolean _deoptimize(Member member);

    public static native synchronized void _init();

    public static native synchronized void _replace(Member member, Member member2, Member member3);

    public static native synchronized boolean _setClassLoaderTrusted(ClassLoader classLoader);

    private static native synchronized boolean _setDexFileTrusted(DexFile dexFile);

    /* JADX INFO: renamed from: a */
    public static HookRecord m68a(Member member, RuntimeDexGenerator runtimeDexGenerator) {
        HookReplacementRecord hookReplacementRecordM67a;
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
        HookRecord hookRecord = new HookRecord(member);
        hookRecord.f820c = runtimeDexGenerator;
        f59a.put(Integer.valueOf(iHashCode), hookRecord);
        Class<?> declaringClass = member.getDeclaringClass();
        boolean zIsNative = Modifier.isNative(member.getModifiers());
        boolean zIsProxyClass = Proxy.isProxyClass(declaringClass);
        if (zIsNative || zIsProxyClass) {
            throw new IllegalArgumentException("Cannot hook native methods and proxy methods: " + member);
        }
        if (member instanceof Method) {
            Method method = (Method) member;
            String str = "A" + new Random().nextInt(99999999);
            hookReplacementRecordM67a = ReplaceCallback.m67a();
            Pair pairM69b = m69b(str, method.getName(), RuntimeDexGenerator.m0e(str, method.getName(), method.getReturnType(), method.getParameterTypes(), Modifier.isStatic(method.getModifiers()), hookReplacementRecordM67a.f62c), hookReplacementRecordM67a);
            hookReplacementRecordM67a.f60a = (Method) pairM69b.second;
            hookReplacementRecordM67a.f61b = (Method) pairM69b.first;
        } else if (member instanceof Constructor) {
            String str2 = "A" + new Random().nextInt();
            hookReplacementRecordM67a = ReplaceCallback.m67a();
            Pair pairM69b2 = m69b(str2, "__init", RuntimeDexGenerator.m0e(str2, "__init", Void.TYPE, ((Constructor) member).getParameterTypes(), false, hookReplacementRecordM67a.f62c), hookReplacementRecordM67a);
            hookReplacementRecordM67a.f60a = (Method) pairM69b2.second;
            hookReplacementRecordM67a.f61b = (Method) pairM69b2.first;
        } else {
            hookReplacementRecordM67a = null;
        }
        if (hookReplacementRecordM67a != null) {
            hookReplacementRecordM67a.f63d = hookRecord;
            Method method2 = hookReplacementRecordM67a.f60a;
            hookRecord.f819b = method2;
            _replace(member, hookReplacementRecordM67a.f61b, method2);
            hookReplacementRecordM67a.f60a.setAccessible(true);
        }
        return hookRecord;
    }

    /* JADX INFO: renamed from: b */
    private static Pair m69b(String str, String str2, byte[] bArr, HookReplacementRecord hookReplacementRecord) {
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
