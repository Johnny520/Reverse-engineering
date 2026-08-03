package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import io.sentry.C1871f;
import io.sentry.C1927m1;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.C2059x2;
import io.sentry.C2067z2;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC2055w2;
import io.sentry.InterfaceC1651Z;
import io.sentry.android.replay.C1762c;
import io.sentry.android.replay.C1788i;
import io.sentry.android.replay.C1789j;
import io.sentry.android.replay.C1790k;
import io.sentry.android.replay.C1791l;
import io.sentry.android.replay.video.C1811a;
import io.sentry.android.replay.video.C1812b;
import io.sentry.android.replay.video.C1814d;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import io.sentry.rrweb.AbstractC1986b;
import io.sentry.rrweb.C1985a;
import io.sentry.rrweb.C1994j;
import io.sentry.rrweb.C1995k;
import io.sentry.rrweb.C1997m;
import io.sentry.rrweb.EnumC1987c;
import io.sentry.util.C2029a;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import p000.AbstractC0585Nj;
import p000.AbstractC0714Qj;
import p000.AbstractC2453ra;
import p000.AbstractC2711xa;
import p000.C0382Iv;
import p000.C0452Kf;
import p000.C2468rp;
import p000.C2554tp;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1772j {
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0192 A[EDGE_INSN: B:210:0x0192->B:75:0x0192 BREAK  A[LOOP:2: B:36:0x0105->B:73:0x0188], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0188 A[LOOP:2: B:36:0x0105->B:73:0x0188, LOOP_END] */
    /* JADX WARN: Type inference failed for: r7v1, types: [Dn, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC1775m m3965a(InterfaceC1651Z interfaceC1651Z, C2046v2 c2046v2, long j, Date date, C1970t c1970t, int i, int i2, int i3, EnumC2055w2 enumC2055w2, C1789j c1789j, int i4, int i5, String str, List list, Deque deque) {
        ArrayList arrayList;
        C2554tp c2554tp;
        ArrayList arrayList2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C1790k c1790k;
        List<C1871f> list2;
        boolean z;
        AbstractC1986b abstractC1986bMo3697j;
        Object obj;
        if (c1789j != null) {
            ArrayList arrayList3 = c1789j.f6505h;
            C2046v2 c2046v22 = c1789j.f6498a;
            long jMin = Math.min(j, 300000L);
            long time = date.getTime();
            File file = new File(c1789j.m3972f(), i + ".mp4");
            C2029a c2029a = c1789j.f6501d;
            long jConvert = 0;
            if (file.exists() && file.length() > 0) {
                file.delete();
            }
            C1762c c1762c = null;
            if (arrayList3.isEmpty()) {
                c2046v22.getLogger().mo3680e(EnumC1657a2.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                i9 = i2;
                i7 = i3;
                i8 = i4;
            } else {
                C1981r c1981rM4173a = c2029a.m4173a();
                try {
                    C1814d c1814d = new C1814d(c2046v22, new C1811a(file, i3, i2, i4, i5));
                    MediaCodec mediaCodec = c1814d.f6570d;
                    mediaCodec.configure((MediaFormat) c1814d.f6571e.getValue(), (Surface) null, (MediaCrypto) null, 1);
                    c1814d.f6574h = mediaCodec.createInputSurface();
                    mediaCodec.start();
                    c1814d.m3982a(false);
                    AbstractC0714Qj.m1489k(c1981rM4173a, null);
                    c1789j.f6503f = c1814d;
                    long j2 = ((long) 1000) / ((long) i4);
                    C1790k c1790k2 = (C1790k) AbstractC2453ra.m4898h0(arrayList3);
                    long j3 = time + jMin;
                    if (j3 <= Long.MIN_VALUE) {
                        c2554tp = C2554tp.f8874d;
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        c2554tp = new C2554tp(time, j3 - 1);
                    }
                    boolean z2 = j2 > 0;
                    Long lValueOf = Long.valueOf(j2);
                    if (!z2) {
                        throw new IllegalArgumentException("Step must be positive, was: " + lValueOf + '.');
                    }
                    long j4 = c2554tp.f8689a;
                    long j5 = c2554tp.f8690b;
                    long j6 = c2554tp.f8691c > 0 ? j2 : -j2;
                    long j7 = j4;
                    long j8 = new C2468rp(j7, j5, j6).f8690b;
                    if ((j6 <= 0 || j7 > j8) && (j6 >= 0 || j8 > j7)) {
                        arrayList2 = arrayList;
                        i6 = 0;
                    } else {
                        int i11 = 0;
                        while (true) {
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    i10 = i11;
                                    break;
                                }
                                c1790k = (C1790k) it.next();
                                long j9 = j7 + j2;
                                i10 = i11;
                                Iterator it2 = it;
                                long j10 = c1790k.f6509b;
                                if (j7 <= j10 && j10 <= j9) {
                                    break;
                                }
                                if (j10 > j9) {
                                    break;
                                }
                                i11 = i10;
                                it = it2;
                            }
                            c1790k = c1790k2;
                            if (c1790k == null) {
                                if (c1790k == null) {
                                    c1789j.m3971d(c1790k.f6508a);
                                    arrayList2 = arrayList;
                                    arrayList2.remove(c1790k);
                                    i6 = i10;
                                    c1790k2 = null;
                                } else {
                                    arrayList2 = arrayList;
                                    i6 = i10;
                                    c1790k2 = c1790k;
                                }
                                if (j7 != j8) {
                                    break;
                                }
                                j7 += j6;
                                arrayList = arrayList2;
                                i11 = i6;
                            } else {
                                try {
                                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(c1790k.f6508a.getAbsolutePath());
                                    c1981rM4173a = c2029a.m4173a();
                                    try {
                                        C1814d c1814d2 = c1789j.f6503f;
                                        if (c1814d2 != null) {
                                            c1814d2.m3983b(bitmapDecodeFile);
                                        }
                                        AbstractC0714Qj.m1489k(c1981rM4173a, null);
                                        bitmapDecodeFile.recycle();
                                        i6 = i10 + 1;
                                        c1790k2 = c1790k;
                                        arrayList2 = arrayList;
                                    } finally {
                                    }
                                } catch (Throwable th) {
                                    c2046v22.getLogger().mo3683r(EnumC1657a2.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
                                    if (c1790k == null) {
                                    }
                                }
                                if (j7 != j8) {
                                }
                            }
                        }
                    }
                    if (i6 == 0) {
                        c2046v22.getLogger().mo3680e(EnumC1657a2.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                        c1789j.m3971d(file);
                        i9 = i2;
                        i7 = i3;
                        i8 = i4;
                        c1762c = null;
                    } else {
                        c1981rM4173a = c2029a.m4173a();
                        try {
                            C1814d c1814d3 = c1789j.f6503f;
                            if (c1814d3 != null) {
                                c1814d3.m3984c();
                            }
                            C1814d c1814d4 = c1789j.f6503f;
                            if (c1814d4 != null) {
                                C1812b c1812b = c1814d4.f6573g;
                                if (c1812b.f6564e != 0) {
                                    jConvert = TimeUnit.MILLISECONDS.convert(c1812b.f6565f + c1812b.f6560a, TimeUnit.MICROSECONDS);
                                }
                            }
                            long j11 = jConvert;
                            c1789j.f6503f = null;
                            AbstractC0714Qj.m1489k(c1981rM4173a, null);
                            C0382Iv c0382Iv = new C0382Iv();
                            i7 = i3;
                            i8 = i4;
                            i9 = i2;
                            AbstractC2711xa.m5283e0(arrayList2, new C1788i(j3, c1789j, c0382Iv, 0));
                            c1762c = new C1762c(file, i6, j11);
                        } finally {
                        }
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
            if (c1762c != null) {
                File file2 = c1762c.f6413a;
                int i12 = c1762c.f6414b;
                long j12 = c1762c.f6415c;
                if (list == null) {
                    C0382Iv c0382Iv2 = new C0382Iv();
                    c0382Iv2.f1315a = C0452Kf.f1484a;
                    if (interfaceC1651Z != null) {
                        interfaceC1651Z.mo3719m(new C1791l(c0382Iv2, 1));
                    }
                    list2 = (List) c0382Iv2.f1315a;
                } else {
                    list2 = list;
                }
                Date dateM4068n = AbstractC1856a.m4068n(date.getTime() + j12);
                C2059x2 c2059x2 = new C2059x2();
                c2059x2.f5604a = c1970t;
                c2059x2.f7283s = c1970t;
                c2059x2.f7284t = i;
                c2059x2.f7285u = dateM4068n;
                c2059x2.f7286v = date;
                c2059x2.f7282r = enumC2055w2;
                c2059x2.f7280p = file2;
                ArrayList arrayList4 = new ArrayList();
                C1994j c1994j = new C1994j();
                c1994j.f7116b = date.getTime();
                c1994j.f7136d = i9;
                c1994j.f7137e = i7;
                arrayList4.add(c1994j);
                C1997m c1997m = new C1997m();
                c1997m.f7116b = date.getTime();
                c1997m.f7151d = i;
                c1997m.f7153f = j12;
                c1997m.f7158k = i12;
                c1997m.f7152e = file2.length();
                c1997m.f7160m = i8;
                c1997m.f7156i = i9;
                c1997m.f7157j = i7;
                c1997m.f7161n = 0;
                c1997m.f7162o = 0;
                arrayList4.add(c1997m);
                LinkedList linkedList = new LinkedList();
                C1871f c1871f = null;
                for (C1871f c1871f2 : list2) {
                    if (c1871f == null || !AbstractC0585Nj.m1134a(c1871f.f6714g, "network.event")) {
                        z = false;
                    } else {
                        Object obj2 = c1871f.f6713f.get("action");
                        if (obj2 == null) {
                            obj2 = null;
                        }
                        if (AbstractC0585Nj.m1134a(obj2, "NETWORK_AVAILABLE") && AbstractC0585Nj.m1134a(c1871f2.f6714g, "network.event") && c1871f2.f6713f.containsKey("network_type") && c1871f2.m4092a().getTime() + 5000 >= date.getTime()) {
                            z = true;
                        }
                    }
                    if ((c1871f2.m4092a().getTime() >= date.getTime() || z) && c1871f2.m4092a().getTime() < dateM4068n.getTime() && (abstractC1986bMo3697j = c2046v2.getReplayController().mo3705t().mo3697j(c1871f2)) != null) {
                        arrayList4.add(abstractC1986bMo3697j);
                        C1985a c1985a = abstractC1986bMo3697j instanceof C1985a ? (C1985a) abstractC1986bMo3697j : null;
                        if (AbstractC0585Nj.m1134a(c1985a != null ? c1985a.f7108f : null, "navigation")) {
                            C1985a c1985a2 = (C1985a) abstractC1986bMo3697j;
                            ConcurrentHashMap concurrentHashMap = c1985a2.f7111i;
                            if (concurrentHashMap == null || (obj = concurrentHashMap.get("to")) == null) {
                                obj = null;
                            }
                            if (obj instanceof String) {
                                linkedList.add((String) c1985a2.f7111i.get("to"));
                            }
                        }
                    }
                    c1871f = c1871f2;
                }
                if (str != null) {
                    if (!AbstractC0585Nj.m1134a(linkedList.isEmpty() ? null : linkedList.get(0), str)) {
                        linkedList.addFirst(str);
                    }
                }
                long time2 = dateM4068n.getTime();
                Iterator it3 = deque.iterator();
                while (it3.hasNext()) {
                    AbstractC1986b abstractC1986b = (AbstractC1986b) it3.next();
                    long j13 = abstractC1986b.f7116b;
                    if (j13 < time2) {
                        if (j13 >= date.getTime()) {
                            arrayList4.add(abstractC1986b);
                        }
                        it3.remove();
                    }
                }
                if (i == 0) {
                    C1995k c1995k = new C1995k(EnumC1987c.Custom);
                    HashMap map = new HashMap();
                    c1995k.f7140d = map;
                    c1995k.f7139c = "options";
                    C1968r sdkVersion = c2046v2.getSdkVersion();
                    if (sdkVersion != null) {
                        map.put("nativeSdkName", sdkVersion.f6999a);
                        map.put("nativeSdkVersion", sdkVersion.f7000b);
                    }
                    C2067z2 sessionReplay = c2046v2.getSessionReplay();
                    Double d = sessionReplay.f7306b;
                    CopyOnWriteArraySet copyOnWriteArraySet = sessionReplay.f7307c;
                    map.put("errorSampleRate", d);
                    map.put("sessionSampleRate", sessionReplay.f7305a);
                    map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.ImageView")));
                    map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.TextView")));
                    map.put("quality", sessionReplay.f7309e.serializedName());
                    map.put("maskedViewClasses", copyOnWriteArraySet);
                    map.put("unmaskedViewClasses", sessionReplay.f7308d);
                    arrayList4.add(c1995k);
                }
                C1927m1 c1927m1 = new C1927m1();
                c1927m1.f6817a = Integer.valueOf(i);
                c1927m1.f6818b = AbstractC2453ra.m4904n0(arrayList4, new C1771i());
                c2059x2.f7287w = linkedList;
                return new C1773k(c2059x2, c1927m1);
            }
        }
        return C1774l.f6461a;
    }
}
