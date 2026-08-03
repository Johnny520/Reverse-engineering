package p126ia;

import gg.AbstractC1428x;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ng.AbstractC3015m;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p011ab.C0042b;
import p054dg.C0795n;
import p085fg.InterfaceC1231l;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p218og.AbstractC3149m;
import p230p8.C3351d0;
import p230p8.C3372x;
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: ia.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2014h {

    /* JADX INFO: renamed from: a */
    public final C3742g f6791a;

    /* JADX INFO: renamed from: b */
    public final C0042b f6792b;

    /* JADX INFO: renamed from: c */
    public final ConcurrentHashMap f6793c;

    /* JADX INFO: renamed from: d */
    public volatile Class f6794d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f6795e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2014h(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f6791a = c3742g;
        this.f6792b = c0042b;
        this.f6793c = new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2012f m4964a(C2008b c2008b) {
        return new C2012f(("comment:".concat(c2008b.f6773a).hashCode() & 1073741823) | Integer.MIN_VALUE, c2008b.f6774b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static int m4965b(Object obj, String str) {
        Object field = KavaReflector.readField(obj, str);
        Number number = field instanceof Number ? (Number) field : null;
        if (number != null) {
            return number.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m4966c(Object obj, HashSet hashSet) {
        C2028v c2028vM227O;
        if (hashSet.isEmpty() || (c2028vM227O = AbstractC0018a.m227O(obj)) == null || c2028vM227O.f6856b != 2) {
            return false;
        }
        return hashSet.contains(new C2012f(c2028vM227O.f6857c, c2028vM227O.f6855a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static List m4967e(Object obj, String str) {
        Object field = KavaReflector.readField(obj, str);
        if (AbstractC1428x.m3840e(field)) {
            field.getClass();
            return AbstractC1428x.m3836a(field);
        }
        LinkedList linkedList = new LinkedList();
        if (KavaReflector.writeField(obj, str, linkedList)) {
            return linkedList;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m4968h(ByteArrayOutputStream byteArrayOutputStream, int i9, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        m4969i(byteArrayOutputStream, (i9 << 3) | 2);
        m4969i(byteArrayOutputStream, bytes.length);
        byteArrayOutputStream.write(bytes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m4969i(ByteArrayOutputStream byteArrayOutputStream, long j3) {
        while (((-128) & j3) != 0) {
            byteArrayOutputStream.write((int) ((127 & j3) | 128));
            j3 >>>= 7;
        }
        byteArrayOutputStream.write((int) j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:161:0x01d9 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Iterable, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v34, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: d */
    public final C2006a m4970d(byte[] bArr, C2009c c2009c, C2009c c2009c2, boolean z9, boolean z10) {
        String str;
        String str2;
        int i9;
        int i10;
        boolean z11;
        ?? arrayList;
        Class<?> cls;
        byte[] bArr2;
        int i11;
        int i12;
        String str3;
        int i13;
        String str4;
        int i14;
        int i15;
        Object objNewInstance;
        Method methodFindCompatibleMethod;
        C4173t c4173t = C4173t.f13710g;
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.protocal.protobuf.SnsObject", this.f6791a.f12145c);
        Object obj = (clsLoadClass == null || (objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(clsLoadClass, new Class[0]), new Object[0])) == null || (methodFindCompatibleMethod = KavaReflector.findCompatibleMethod(objNewInstance.getClass(), "parseFrom", bArr)) == null || !KavaReflector.invokeSuccessfully(methodFindCompatibleMethod, objNewInstance, bArr)) ? null : objNewInstance;
        if (obj == null) {
            return new C2006a(bArr, false);
        }
        List listM4967e = m4967e(obj, "LikeUserList");
        if (listM4967e == null) {
            return new C2006a(bArr, false);
        }
        List listM4967e2 = m4967e(obj, "CommentUserList");
        if (listM4967e2 == null) {
            return new C2006a(bArr, false);
        }
        int iM4965b = m4965b(obj, "LikeCount");
        String str5 = "LikeUserListCount";
        int iM4965b2 = m4965b(obj, "LikeUserListCount");
        String str6 = "CommentCount";
        int iM4965b3 = m4965b(obj, "CommentCount");
        String str7 = "CommentUserListCount";
        int iM4965b4 = m4965b(obj, "CommentUserListCount");
        Object objM6411U = AbstractC3015m.m6411U(AbstractC3015m.m6415Y(new C0795n(listM4967e, 6), new C0795n(listM4967e2, 6)));
        Class<?> cls2 = objM6411U != null ? objM6411U.getClass() : null;
        List list = c2009c2.f6778a;
        final HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (true) {
            str = str6;
            str2 = "like:";
            if (!it.hasNext()) {
                break;
            }
            C4173t c4173t2 = c4173t;
            C2010d c2010d = (C2010d) it.next();
            String str8 = str7;
            hashSet.add(new C2013g((("like:" + c2010d.f6782a).hashCode() & 1073741823) | Integer.MIN_VALUE, c2010d.f6782a));
            str5 = str5;
            str6 = str;
            c4173t = c4173t2;
            str7 = str8;
            cls2 = cls2;
        }
        List<C2008b> list2 = c4173t;
        String str9 = str5;
        String str10 = str7;
        Class<?> cls3 = cls2;
        List list3 = c2009c2.f6779b;
        final HashSet hashSet2 = new HashSet();
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            hashSet2.add(m4964a((C2008b) it2.next()));
        }
        final int i16 = 0;
        InterfaceC1231l interfaceC1231l = new InterfaceC1231l(this) { // from class: ia.e

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C2014h f6785h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f6785h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            @Override // p085fg.InterfaceC1231l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj2) {
                C2028v c2028vM227O;
                boolean z12;
                switch (i16) {
                    case 0:
                        obj2.getClass();
                        boolean z13 = true;
                        if (!AbstractC0018a.m262z(1, obj2)) {
                            this.f6785h.getClass();
                            HashSet hashSet3 = hashSet;
                            if (!((hashSet3.isEmpty() || (c2028vM227O = AbstractC0018a.m227O(obj2)) == null || c2028vM227O.f6856b != 1) ? false : hashSet3.contains(new C2013g(c2028vM227O.f6857c, c2028vM227O.f6855a)))) {
                                z13 = false;
                            }
                        }
                        return Boolean.valueOf(z13);
                    default:
                        obj2.getClass();
                        if (!AbstractC0018a.m262z(2, obj2)) {
                            this.f6785h.getClass();
                            z12 = C2014h.m4966c(obj2, hashSet);
                        }
                        return Boolean.valueOf(z12);
                }
            }
        };
        final int i17 = 1;
        InterfaceC1231l interfaceC1231l2 = new InterfaceC1231l(this) { // from class: ia.e

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C2014h f6785h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f6785h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
            @Override // p085fg.InterfaceC1231l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj2) {
                C2028v c2028vM227O;
                boolean z12;
                switch (i17) {
                    case 0:
                        obj2.getClass();
                        boolean z13 = true;
                        if (!AbstractC0018a.m262z(1, obj2)) {
                            this.f6785h.getClass();
                            HashSet hashSet3 = hashSet2;
                            if (!((hashSet3.isEmpty() || (c2028vM227O = AbstractC0018a.m227O(obj2)) == null || c2028vM227O.f6856b != 1) ? false : hashSet3.contains(new C2013g(c2028vM227O.f6857c, c2028vM227O.f6855a)))) {
                                z13 = false;
                            }
                        }
                        return Boolean.valueOf(z13);
                    default:
                        obj2.getClass();
                        if (!AbstractC0018a.m262z(2, obj2)) {
                            this.f6785h.getClass();
                            z12 = C2014h.m4966c(obj2, hashSet2);
                        }
                        return Boolean.valueOf(z12);
                }
            }
        };
        if (listM4967e.isEmpty()) {
            i9 = 0;
        } else {
            Iterator it3 = listM4967e.iterator();
            int i18 = 0;
            while (it3.hasNext()) {
                if (((Boolean) interfaceC1231l.invoke(it3.next())).booleanValue() && (i18 = i18 + 1) < 0) {
                    AbstractC0000a.m30P0();
                    throw null;
                }
            }
            i9 = i18;
        }
        if (listM4967e2.isEmpty()) {
            i10 = 0;
        } else {
            Iterator it4 = listM4967e2.iterator();
            int i19 = 0;
            while (it4.hasNext()) {
                if (((Boolean) interfaceC1231l2.invoke(it4.next())).booleanValue() && (i19 = i19 + 1) < 0) {
                    AbstractC0000a.m30P0();
                    throw null;
                }
            }
            i10 = i19;
        }
        boolean z12 = AbstractC4171r.m8433i1(interfaceC1231l2, listM4967e2) || AbstractC4171r.m8433i1(interfaceC1231l, listM4967e);
        HashSet hashSet3 = new HashSet();
        Iterator it5 = listM4967e.iterator();
        while (it5.hasNext()) {
            C2028v c2028vM227O = AbstractC0018a.m227O(it5.next());
            String str11 = c2028vM227O != null ? c2028vM227O.f6855a : null;
            if (str11 != null) {
                hashSet3.add(str11);
            }
        }
        int size = listM4967e.size();
        int size2 = listM4967e2.size();
        if (z9) {
            List list4 = c2009c.f6778a;
            z11 = z12;
            arrayList = new ArrayList();
            Iterator it6 = list4.iterator();
            while (it6.hasNext()) {
                Iterator it7 = it6;
                Object next = it7.next();
                int i20 = size;
                if (!hashSet3.contains(((C2010d) next).f6782a)) {
                    arrayList.add(next);
                }
                it6 = it7;
                size = i20;
            }
        } else {
            z11 = z12;
            arrayList = list2;
        }
        int i21 = size;
        if (z10) {
            list2 = c2009c.f6779b;
        }
        if (arrayList.isEmpty() && list2.isEmpty()) {
            i11 = i9;
            bArr2 = null;
            i12 = i21;
            str3 = str;
            i13 = iM4965b;
            str4 = str9;
            i14 = i10;
            i15 = size2;
        } else {
            if (cls3 != null) {
                cls = cls3;
            } else {
                cls = this.f6794d;
                if (cls == null) {
                    m4972g();
                    cls = this.f6794d;
                }
            }
            if (cls == null) {
                if (!this.f6795e) {
                    this.f6795e = true;
                    this.f6792b.invoke("朋友圈伪互动节点类型尚未就绪", null);
                }
                return new C2006a(bArr, false);
            }
            byte[] bArr3 = null;
            boolean z13 = true;
            this.f6794d = cls;
            for (C2010d c2010d2 : arrayList) {
                boolean z14 = z13;
                String str12 = str2;
                int i22 = size2;
                int i23 = i9;
                int i24 = i21;
                String str13 = str;
                int i25 = iM4965b;
                String str14 = str9;
                int i26 = i10;
                Object objM4971f = m4971f(cls, c2010d2.f6782a, c2010d2.f6783b, HttpUrl.FRAGMENT_ENCODE_SET, 1, (int) (System.currentTimeMillis() / 1000), ((str12 + c2010d2.f6782a).hashCode() & 1073741823) | Integer.MIN_VALUE);
                if (objM4971f != null) {
                    listM4967e.add(objM4971f);
                    z11 = z14;
                }
                size2 = i22;
                i10 = i26;
                z13 = z14;
                bArr3 = null;
                str2 = str12;
                str9 = str14;
                iM4965b = i25;
                str = str13;
                i21 = i24;
                i9 = i23;
            }
            boolean z15 = z13;
            bArr2 = bArr3;
            i11 = i9;
            i12 = i21;
            str3 = str;
            i13 = iM4965b;
            str4 = str9;
            i14 = i10;
            i15 = size2;
            for (C2008b c2008b : list2) {
                Object objM4971f2 = m4971f(cls, c2008b.f6774b, c2008b.f6775c, c2008b.f6776d, 2, (int) AbstractC3754e0.m7911s(c2008b.f6777e / 1000, 1L, 2147483647L), ("comment:".concat(c2008b.f6773a).hashCode() & 1073741823) | Integer.MIN_VALUE);
                if (objM4971f2 != null) {
                    listM4967e2.add(objM4971f2);
                    z11 = z15;
                }
            }
        }
        if (!z11) {
            return new C2006a(bArr, false);
        }
        int size3 = listM4967e.size() - i12;
        if (size3 < 0) {
            size3 = 0;
        }
        int size4 = listM4967e2.size() - i15;
        if (size4 < 0) {
            size4 = 0;
        }
        int i27 = i13 - i11;
        if (i27 < i12) {
            i27 = i12;
        }
        int i28 = iM4965b2 - i11;
        if (i28 < i12) {
            i28 = i12;
        }
        int i29 = iM4965b3 - i14;
        if (i29 < i15) {
            i29 = i15;
        }
        int i30 = iM4965b4 - i14;
        if (i30 >= i15) {
            i15 = i30;
        }
        KavaReflector.writeField(obj, "LikeCount", Integer.valueOf(i27 + size3));
        KavaReflector.writeField(obj, str4, Integer.valueOf(i28 + size3));
        KavaReflector.writeField(obj, str3, Integer.valueOf(i29 + size4));
        KavaReflector.writeField(obj, str10, Integer.valueOf(i15 + size4));
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "toByteArray", new Object[0]);
        byte[] bArr4 = objInvokeMethod instanceof byte[] ? (byte[]) objInvokeMethod : bArr2;
        return bArr4 != null ? new C2006a(bArr4, !Arrays.equals(bArr4, bArr)) : new C2006a(bArr, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:28:0x0054 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4971f(Class cls, String str, String str2, String str3, int i9, int i10, int i11) throws IOException {
        Object c3959f;
        Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(cls, new Class[0]), new Object[0]);
        if (objNewInstance != null) {
            String string = AbstractC3149m.m6703R0(str2).toString();
            if (string.length() <= 0 || string.equals(str)) {
                ConcurrentHashMap concurrentHashMap = this.f6793c;
                Object obj = concurrentHashMap.get(str);
                Object obj2 = obj;
                if (obj == null) {
                    try {
                        C1368i c1368iContacts = WeChatApis.contacts();
                        c3959f = c1368iContacts != null ? c1368iContacts.m3729r(str) : null;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (c3959f instanceof C3959f) {
                        c3959f = null;
                    }
                    String str4 = (String) c3959f;
                    if (str4 != null) {
                        boolean zM6721t0 = AbstractC3149m.m6721t0(str4);
                        String str5 = str4;
                        if (zM6721t0) {
                            str5 = null;
                        }
                        if (str5 == null) {
                            str5 = str;
                        }
                        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(str, str5);
                        obj2 = str5;
                        if (objPutIfAbsent != null) {
                            obj2 = objPutIfAbsent;
                        }
                    }
                }
                obj2.getClass();
                string = (String) obj2;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m4968h(byteArrayOutputStream, 1, str);
            m4968h(byteArrayOutputStream, 2, string);
            m4969i(byteArrayOutputStream, 24);
            m4969i(byteArrayOutputStream, 0);
            m4969i(byteArrayOutputStream, 32);
            m4969i(byteArrayOutputStream, i9);
            if (str3.length() > 0) {
                m4968h(byteArrayOutputStream, 5, str3);
            }
            m4969i(byteArrayOutputStream, 48);
            m4969i(byteArrayOutputStream, i10);
            m4969i(byteArrayOutputStream, 56);
            m4969i(byteArrayOutputStream, i11);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArray.getClass();
            Method methodFindCompatibleMethod = KavaReflector.findCompatibleMethod(cls, "parseFrom", byteArray);
            if (methodFindCompatibleMethod == null || !KavaReflector.invokeSuccessfully(methodFindCompatibleMethod, objNewInstance, byteArray)) {
                return null;
            }
            return objNewInstance;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4972g() {
        C3372x c3372xM7076h;
        Method methodM7151f;
        Class<?> returnType;
        if (this.f6794d != null) {
            return true;
        }
        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
        Class<?> cls = null;
        if (c3351d0SnsApi != null && (c3372xM7076h = c3351d0SnsApi.m7076h()) != null && (methodM7151f = c3372xM7076h.m7151f()) != null && (returnType = methodM7151f.getReturnType()) != null && !returnType.equals(Void.TYPE) && !returnType.isPrimitive() && !returnType.equals(Object.class)) {
            cls = returnType;
        }
        if (cls == null) {
            return false;
        }
        this.f6794d = cls;
        return true;
    }
}
