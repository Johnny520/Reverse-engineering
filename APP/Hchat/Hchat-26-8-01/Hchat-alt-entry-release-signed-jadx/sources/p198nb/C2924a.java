package p198nb;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;
import android.view.autofill.AutofillValue;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import p015b0.C0147m;
import p025bc.AbstractC0255e;
import p054dg.AbstractC0793l;
import p068eh.AbstractC0921a;
import p069f.C0925b0;
import p071f1.InterfaceC0998d0;
import p071f1.InterfaceC1026r0;
import p072f2.AbstractC1060w;
import p072f2.InterfaceC1062y;
import p080fb.C1113d1;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p100h0.AbstractC1522h0;
import p100h0.C1519g0;
import p100h0.EnumC1516f0;
import p100h0.InterfaceC1533l;
import p102h2.EnumC1571a;
import p116i.C1760j;
import p117i0.C1829f1;
import p201o.AbstractC3026b;
import p218og.AbstractC3149m;
import p218og.C3141e;
import p218og.C3144h;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p223p0.C3274b;
import p244qb.C3490k;
import p251r.C3631p;
import p251r.C3641z;
import p254r3.C3658e;
import p258r8.C3742g;
import p259r9.C3761k;
import p261rb.C3788d;
import p265s.C3813a0;
import p265s.C3834h0;
import p269s3.C3927e;
import p276sf.C3959f;
import p276sf.C3967n;
import p307v0.C4364d;
import p307v0.InterfaceC4366f;
import p315v8.C4521a;
import p315v8.C4527g;
import p320vh.C4578e;
import p321w.C4609j1;
import p321w.EnumC4599g0;
import p322w0.C4667r;
import p322w0.C4668s;
import p332wb.AbstractC4994j;
import p332wb.C4759bp;
import p332wb.C4792cp;
import p332wb.C4844ec;
import p332wb.C4963i;
import p332wb.C5518yt;
import p339x1.C5602f0;
import p371yg.C6046b;
import p373z0.C6066f;
import p380z8.C6128d;
import sh.C4005e2;
import tf.AbstractC4149a;
import tf.AbstractC4165l;
import th.C4217i;

/* JADX INFO: renamed from: nb.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2924a implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9555g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f9556h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2924a(C2928c c2928c, PackageManager packageManager) {
        this.f9555g = 0;
        this.f9556h = packageManager;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0217  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object c3959f;
        String string;
        InputStream inputStream;
        Object c3959f2;
        FileOutputStream fileOutputStream;
        C3631p c3631p;
        String str;
        boolean z9;
        boolean z10;
        switch (this.f9555g) {
            case 0:
                PackageManager packageManager = (PackageManager) this.f9556h;
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo == null) {
                    return null;
                }
                String str3 = serviceInfo.packageName;
                String string2 = str3 != null ? AbstractC3149m.m6703R0(str3).toString() : null;
                if (string2 == null) {
                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (string2.length() == 0 || !serviceInfo.enabled || !serviceInfo.exported) {
                    return null;
                }
                if (serviceInfo.applicationInfo != null ? !r2.enabled : false) {
                    return null;
                }
                try {
                    CharSequence charSequenceLoadLabel = resolveInfo.loadLabel(packageManager);
                    c3959f = (charSequenceLoadLabel != null && (string = charSequenceLoadLabel.toString()) != null) ? AbstractC3149m.m6703R0(string).toString() : null;
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                String str4 = (String) (c3959f instanceof C3959f ? null : c3959f);
                if (str4 != null) {
                    str2 = str4;
                }
                if (AbstractC3149m.m6721t0(str2)) {
                    str2 = string2;
                }
                return new C2930d(string2, str2);
            case 1:
                return ((C3144h) this.f9556h).m6675a(((Integer) obj).intValue());
            case 2:
                C3490k c3490k = (C3490k) this.f9556h;
                String str5 = (String) obj;
                str5.getClass();
                C3742g c3742g = c3490k.f11330a;
                if (AbstractC0921a.m2262y(str5)) {
                    return str5;
                }
                if (AbstractC3149m.m6721t0(str5)) {
                    inputStream = null;
                } else {
                    String[] strArr = {"com.tencent.mm.vfs.w6", "com.tencent.mm.vfs.p6"};
                    for (int i9 = 0; i9 < 2; i9++) {
                        Class<?> clsLoadClass = KavaReflector.loadClass(strArr[i9], c3742g.f12145c);
                        if (clsLoadClass != null) {
                            String[] strArr2 = {"E", "F"};
                            int i10 = 0;
                            while (true) {
                                if (i10 < 2) {
                                    Method methodFindMethod = KavaReflector.findMethod(clsLoadClass, strArr2[i10], String.class);
                                    if (methodFindMethod != null) {
                                        Object objInvoke = KavaReflector.invoke(methodFindMethod, null, str5);
                                        InputStream inputStream2 = objInvoke instanceof InputStream ? (InputStream) objInvoke : null;
                                        if (inputStream2 != null) {
                                            inputStream = inputStream2;
                                        }
                                    }
                                    i10++;
                                } else {
                                    for (Method method : KavaReflector.declaredMethods(clsLoadClass)) {
                                        if (Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), InputStream.class)) {
                                            Class<?>[] parameterTypes = method.getParameterTypes();
                                            if (parameterTypes.length == 1 && AbstractC1416l.m3825a(parameterTypes[0], String.class)) {
                                                Object objInvoke2 = KavaReflector.invoke(method, null, str5);
                                                inputStream = objInvoke2 instanceof InputStream ? (InputStream) objInvoke2 : null;
                                                if (inputStream != null) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    inputStream = null;
                }
                if (inputStream != null) {
                    String strM2023c0 = AbstractC0793l.m2023c0(new File(str5));
                    if (AbstractC3149m.m6721t0(strM2023c0) || strM2023c0.length() > 8) {
                        strM2023c0 = null;
                    }
                    if (strM2023c0 == null) {
                        strM2023c0 = "silk";
                    }
                    File file = new File(c3742g.f12143a.getCacheDir(), "Hchat_fav_voice");
                    if (file.isDirectory() || file.mkdirs()) {
                        File file2 = new File(file, AbstractC0255e.m1021j("fav_", Integer.toHexString(str5.hashCode()), ".", strM2023c0));
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(file2, false);
                            } catch (Throwable th3) {
                                c3959f2 = new C3959f(th3);
                            }
                            try {
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int i11 = inputStream.read(bArr);
                                    if (i11 <= 0) {
                                        fileOutputStream.close();
                                        inputStream.close();
                                        if (!file2.isFile() || file2.length() <= 0) {
                                            file2 = null;
                                        }
                                        c3959f2 = file2 != null ? file2.getAbsolutePath() : null;
                                        return (String) (c3959f2 instanceof C3959f ? null : c3959f2);
                                    }
                                    fileOutputStream.write(bArr, 0, i11);
                                }
                            } finally {
                            }
                        } finally {
                        }
                    }
                }
                return null;
            case 3:
                C3641z c3641z = (C3641z) this.f9556h;
                float f3 = -((Float) obj).floatValue();
                if ((f3 >= 0.0f || c3641z.mo5461d()) && (f3 <= 0.0f || c3641z.mo5460c())) {
                    if (Math.abs(c3641z.f11804h) > 0.5f) {
                        AbstractC3026b.m6430c("entered drag with non-zero pending scroll");
                    }
                    c3641z.f11800d = true;
                    float f10 = c3641z.f11804h + f3;
                    c3641z.f11804h = f10;
                    if (Math.abs(f10) > 0.5f) {
                        float f11 = c3641z.f11804h;
                        int iRound = Math.round(f11);
                        C3631p c3631pM7610a = ((C3631p) c3641z.f11802f.getValue()).m7610a(iRound, !c3641z.f11798b);
                        if (c3631pM7610a != null && (c3631p = c3641z.f11799c) != null) {
                            C3631p c3631pM7610a2 = c3631p.m7610a(iRound, true);
                            if (c3631pM7610a2 != null) {
                                c3641z.f11799c = c3631pM7610a2;
                            } else {
                                c3631pM7610a = null;
                            }
                        }
                        if (c3631pM7610a != null) {
                            c3641z.m7620g(c3631pM7610a, c3641z.f11798b, true);
                            c3641z.f11819w.setValue(C3967n.f12976a);
                            c3641z.m7624k(f11 - c3641z.f11804h, c3631pM7610a);
                        } else {
                            C5602f0 c5602f0 = c3641z.f11808l;
                            if (c5602f0 != null) {
                                c5602f0.m10039k();
                            }
                            c3641z.m7624k(f11 - c3641z.f11804h, c3641z.m7623j());
                        }
                    }
                    if (Math.abs(c3641z.f11804h) > 0.5f) {
                        f3 -= c3641z.f11804h;
                        c3641z.f11804h = 0.0f;
                    }
                } else {
                    f3 = 0.0f;
                }
                return Float.valueOf(-f3);
            case 4:
                C3761k c3761k = (C3761k) this.f9556h;
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                interfaceC3142f.getClass();
                C3145i c3145i = (C3145i) interfaceC3142f;
                C3144h c3144h = c3145i.f10203c;
                C3141e c3141eM6675a = c3144h.m6675a(1);
                if (c3141eM6675a != null) {
                    str = c3141eM6675a.f10195a;
                } else {
                    C3141e c3141eM6675a2 = c3144h.m6675a(2);
                    str = c3141eM6675a2 != null ? c3141eM6675a2.f10195a : null;
                    if (str == null) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }
                String str6 = (String) c3761k.invoke(str);
                return str6 != null ? str6 : c3145i.m6678c();
            case 5:
                C3788d c3788d = (C3788d) this.f9556h;
                C3788d c3788d2 = (C3788d) obj;
                c3788d2.getClass();
                return Boolean.valueOf(AbstractC1416l.m3825a(c3788d2.f12418a, c3788d.f12418a));
            case 6:
                return new C0147m((C3813a0) this.f9556h, 3);
            case 7:
                return new C0147m((C3834h0) this.f9556h, 5);
            case 8:
                InterfaceC4366f interfaceC4366f = (InterfaceC4366f) this.f9556h;
                return Boolean.valueOf(interfaceC4366f != null ? interfaceC4366f.mo8036a(obj) : true);
            case 9:
                ((C3927e) this.f9556h).f12901a.setValue((C3658e) obj);
                return C3967n.f12976a;
            case 10:
                InterfaceC1026r0 interfaceC1026r0 = (InterfaceC1026r0) this.f9556h;
                InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj;
                interfaceC0998d0.getClass();
                interfaceC0998d0.mo2533Q0(interfaceC1026r0);
                interfaceC0998d0.mo2548r(true);
                return C3967n.f12976a;
            case 11:
                C4005e2 c4005e2 = (C4005e2) this.f9556h;
                C1760j c1760j = (C1760j) obj;
                c1760j.getClass();
                c4005e2.m8229b(((Number) c1760j.f5880e.getValue()).floatValue());
                return C3967n.f12976a;
            case 12:
                return obj == ((AbstractC4149a) this.f9556h) ? "(this Collection)" : String.valueOf(obj);
            case 13:
                C3274b c3274b = (C3274b) this.f9556h;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == c3274b ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != c3274b ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 14:
                C4217i c4217i = (C4217i) this.f9556h;
                InterfaceC0998d0 interfaceC0998d02 = (InterfaceC0998d0) obj;
                interfaceC0998d02.getClass();
                interfaceC0998d02.mo2548r(true);
                interfaceC0998d02.mo2533Q0((C4578e) c4217i.f13864B.f15088g);
                interfaceC0998d02.mo2534Y(1);
                return C3967n.f12976a;
            case 15:
                InterfaceC1062y interfaceC1062y = (InterfaceC1062y) this.f9556h;
                AutofillValue autofillValue = ((C6066f) obj).f24547a;
                Boolean boolValueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (boolValueOf != null) {
                    AbstractC1060w.m2682e(interfaceC1062y, boolValueOf.booleanValue() ? EnumC1571a.f5230g : EnumC1571a.f5231h);
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 16:
                InterfaceC4366f interfaceC4366f2 = ((C4364d) this.f9556h).f14570i;
                return Boolean.valueOf(interfaceC4366f2 != null ? interfaceC4366f2.mo8036a(obj) : true);
            case 17:
                C4527g c4527g = (C4527g) this.f9556h;
                WeChatMessage weChatMessage = (WeChatMessage) obj;
                weChatMessage.getClass();
                long j3 = weChatMessage.msgId;
                if (j3 > 0) {
                    LinkedHashSet linkedHashSet = c4527g.f14936d;
                    String str7 = c4527g.f14935c;
                    if (!linkedHashSet.contains(Long.valueOf(j3))) {
                        long j4 = weChatMessage.createTime;
                        if (1 <= j4 && j4 < 100000000000L) {
                            j4 *= 1000;
                        }
                        if (j4 < c4527g.f14937e - 5000) {
                            z10 = false;
                        } else {
                            if (!AbstractC3149m.m6721t0(str7)) {
                                Iterator it = AbstractC4165l.m8376k0(new String[]{weChatMessage.content, weChatMessage.bodyContent()}).iterator();
                                while (it.hasNext()) {
                                    if (AbstractC1416l.m3825a((String) it.next(), str7)) {
                                    }
                                }
                                z10 = false;
                            }
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            case 18:
                Map map = (Map) this.f9556h;
                C4521a c4521a = (C4521a) obj;
                c4521a.getClass();
                return (Long) map.get(c4521a.f14897a);
            case 19:
                StringBuilder sb3 = (StringBuilder) this.f9556h;
                String str8 = (String) obj;
                str8.getClass();
                sb3.append(str8);
                sb3.append('\n');
                return C3967n.f12976a;
            case 20:
                ((InterfaceC1062y) obj).mo2644a(AbstractC1522h0.f5086c, new C1519g0(EnumC4599g0.f15156g, ((InterfaceC1533l) this.f9556h).mo4036a(), EnumC1516f0.f5067h, true));
                return C3967n.f12976a;
            case 21:
                C4609j1 c4609j1 = (C4609j1) this.f9556h;
                float fFloatValue = ((Float) obj).floatValue();
                C1829f1 c1829f1 = c4609j1.f15206a;
                float fM4488g = c1829f1.m4488g() + fFloatValue;
                C1829f1 c1829f12 = c4609j1.f15207b;
                if (fM4488g > c1829f12.m4488g()) {
                    fFloatValue = c1829f12.m4488g() - c1829f1.m4488g();
                } else if (fM4488g < 0.0f) {
                    fFloatValue = -c1829f1.m4488g();
                }
                c1829f1.m4489h(c1829f1.m4488g() + fFloatValue);
                return Float.valueOf(fFloatValue);
            case 22:
                C4668s c4668s = (C4668s) this.f9556h;
                synchronized (c4668s.f15542g) {
                    C4667r c4667r = c4668s.f15544i;
                    c4667r.getClass();
                    Object obj2 = c4667r.f15524b;
                    obj2.getClass();
                    int i12 = c4667r.f15526d;
                    C0925b0 c0925b0 = c4667r.f15525c;
                    if (c0925b0 == null) {
                        c0925b0 = new C0925b0();
                        c4667r.f15525c = c0925b0;
                        c4667r.f15528f.m2326m(obj2, c0925b0);
                    }
                    c4667r.m9157b(obj, i12, obj2, c0925b0);
                }
                return C3967n.f12976a;
            case 23:
                AbstractC4994j abstractC4994j = (AbstractC4994j) this.f9556h;
                C4759bp c4759bp = (C4759bp) obj;
                c4759bp.getClass();
                ((C4963i) abstractC4994j).f17746a.f16423d.invoke(c4759bp);
                return C3967n.f12976a;
            case 24:
                C4844ec c4844ec = (C4844ec) this.f9556h;
                if (((Boolean) obj).booleanValue()) {
                    c4844ec.invoke();
                }
                return C3967n.f12976a;
            case 25:
                C4792cp c4792cp = (C4792cp) this.f9556h;
                C4759bp c4759bp2 = (C4759bp) obj;
                c4759bp2.getClass();
                c4792cp.f16423d.invoke(c4759bp2);
                return C3967n.f12976a;
            case 26:
                Parcelable parcelable = (Parcelable) this.f9556h;
                Method method2 = (Method) obj;
                method2.getClass();
                Object objInvoke3 = KavaReflector.invoke(method2, parcelable, new Object[0]);
                if (objInvoke3 instanceof String) {
                    return (String) objInvoke3;
                }
                return null;
            case 27:
                C1113d1 c1113d1 = (C1113d1) this.f9556h;
                ((String) obj).getClass();
                return new C5518yt(c1113d1);
            case 28:
                ((C6046b) this.f9556h).m10808f(null);
                return C3967n.f12976a;
            default:
                C6128d c6128d = (C6128d) this.f9556h;
                Class superclass = (Class) obj;
                superclass.getClass();
                c6128d.getClass();
                ArrayList arrayList = new ArrayList();
                while (superclass != null && !superclass.equals(Object.class)) {
                    List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : listDeclaredFields) {
                        if (!KavaReflector.isStatic((Field) obj3)) {
                            arrayList2.add(obj3);
                        }
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((Field) it2.next());
                    }
                    superclass = superclass.getSuperclass();
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj4 : arrayList) {
                    Field field = (Field) obj4;
                    if (!KavaReflector.isStatic(field) && (AbstractC1416l.m3825a(field.getType(), Boolean.TYPE) || AbstractC1416l.m3825a(field.getType(), Boolean.class))) {
                        arrayList3.add(obj4);
                    }
                }
                return arrayList3;
        }
    }

    public /* synthetic */ C2924a(Object obj, int i9, Object obj2) {
        this.f9555g = i9;
        this.f9556h = obj;
    }

    public /* synthetic */ C2924a(Object obj, int i9) {
        this.f9555g = i9;
        this.f9556h = obj;
    }
}
