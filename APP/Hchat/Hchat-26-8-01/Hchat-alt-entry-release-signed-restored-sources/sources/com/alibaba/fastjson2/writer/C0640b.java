package com.alibaba.fastjson2.writer;

import android.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import nc.C2958a;
import p067ef.C0918c;
import p182m7.C2790c;
import p182m7.C2797j;
import p215od.C3128a;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4317m;

/* JADX INFO: renamed from: com.alibaba.fastjson2.writer.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0640b implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2000a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [com.alibaba.fastjson2.writer.ObjectWriterProvider.getObjectWriterModule(java.lang.reflect.Type, java.lang.Class):com.alibaba.fastjson2.writer.ObjectWriter, ed.c.e():void, k8.g.t(java.lang.String, java.lang.String, f8.c, f8.g):void] */
    public /* synthetic */ C0640b(int i9) {
        this.f2000a = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2000a) {
            case 0:
                return ((Field) obj).getName();
            case 1:
                return ((ParameterizedType) obj).getActualTypeArguments();
            case 2:
                return ((StackTraceElement) obj).getFileName();
            case 3:
                return ((ParameterizedType) obj).getOwnerType();
            case 4:
                return ((ParameterizedType) obj).getRawType();
            case 5:
                return ((StackTraceElement) obj).getClassName();
            case 6:
                return ((StackTraceElement) obj).getMethodName();
            case 7:
                return ((Method) obj).getDeclaringClass();
            case 8:
                return ((Method) obj).getName();
            case 9:
                return ((Method) obj).getParameterTypes();
            case 10:
                return (Integer) obj;
            case 11:
                return 1;
            case 12:
                return ((C0918c) obj).f2877e;
            case 13:
                return ((C0918c) obj).f2875c;
            case 14:
                return ((C0918c) obj).f2876d;
            case 15:
                return new ArrayList();
            case 16:
                return ((C4320p) obj).f14396k.toString();
            case 17:
                return ((C4305a) obj).f14352m.stream();
            case 18:
                return new CopyOnWriteArrayList();
            case 19:
                return ((C3128a) obj).m6642f();
            case 20:
                return ((C3128a) obj).m6646k();
            case 21:
                return ((InterfaceC4317m) obj).mo2222q().f10153j.m6642f();
            case 22:
                return ((C4322r) obj).f14411l;
            case 23:
                return ((Path) obj).toFile();
            case 24:
                return (String) ((C2958a) obj).f9705h;
            case 25:
                return new CopyOnWriteArrayList();
            case 26:
                return ((C4305a) obj).f14351l.stream();
            case 27:
                return new ArrayList(2);
            case 28:
                return new ArrayList(1);
            default:
                C2790c c2790cM6199X = ((C2797j) obj).m6199X(R.attr.name);
                if (c2790cM6199X != null) {
                    return c2790cM6199X.m8935S();
                }
                return null;
        }
    }
}
