package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaCodec;
import android.media.MediaFormat;
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
    static {
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [Dn, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public static AbstractC1775m m3965a(InterfaceC1651Z r30, C2046v2 r31, long r32, Date r34, C1970t r35, int r36, int r37, int r38, EnumC2055w2 r39, C1789j r40, int r41, int r42, String r43, List r44, Deque r45) {
        if (r40 == null) goto L184;
        ArrayList r12 = r40.f6505h;
        C2046v2 r13 = r40.f6498a;
        long r14 = Math.min(r32, 300000);
        long r4 = r34.getTime();
        File r5 = new File(r40.m3972f(), r36 + ".mp4");
        C2029a r46 = r40.f6501d;
        long r16 = 0;
        if (r5.exists() == true) goto L7;
    L9:
        C1762c r8 = null;
        if (r12.isEmpty() == false) goto L12;
        r13.getLogger().mo3680e(EnumC1657a2.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
        int r10 = r37;
        int r132 = r38;
        int r142 = r41;
    L91:
        if (r8 == null) goto L184;
        File r0 = r8.f6413a;
        int r2 = r8.f6414b;
        long r3 = r8.f6415c;
        if (r44 != null) goto L99;
        C0382Iv r52 = new C0382Iv();
        r52.f1315a = C0452Kf.f1484a;
        if (r30 == null) goto L98;
        r30.mo3719m(new C1791l(r52, 1));
    L98:
        List r1 = (List) r52.f1315a;
    L100:
        Date r53 = AbstractC1856a.m4068n(r34.getTime() + r3);
        C2059x2 r6 = new C2059x2();
        r6.f5604a = r35;
        r6.f7283s = r35;
        r6.f7284t = r36;
        r6.f7285u = r53;
        r6.f7286v = r34;
        r6.f7282r = r39;
        r6.f7280p = r0;
        ArrayList r9 = new ArrayList();
        C1994j r11 = new C1994j();
        r11.f7116b = r34.getTime();
        r11.f7136d = r10;
        r11.f7137e = r132;
        r9.add(r11);
        C1997m r02 = new C1997m();
        r02.f7116b = r34.getTime();
        r02.f7151d = r36;
        r02.f7153f = r3;
        r02.f7158k = r2;
        r02.f7152e = r0.length();
        r02.f7160m = r142;
        r02.f7156i = r10;
        r02.f7157j = r132;
        r02.f7161n = 0;
        r02.f7162o = 0;
        r9.add(r02);
        LinkedList r03 = new LinkedList();
        Iterator r15 = r1.iterator();
        C1871f r22 = null;
    L102:
        if (r15.hasNext() == false) goto L145;
        C1871f r33 = (C1871f) r15.next();
        if (r22 != null) goto L106;
    L119:
        boolean r23 = false;
    L121:
        if (r33.m4092a().getTime() >= r34.getTime()) goto L124;
        if (r23 == true) goto L124;
    L144:
        r22 = r33;
    L124:
        if (r33.m4092a().getTime() >= r53.getTime()) goto L144;
        AbstractC1986b r24 = r31.getReplayController().mo3705t().mo3697j(r33);
        if (r24 == null) goto L144;
        r9.add(r24);
        if ((r24 instanceof C1985a) == false) goto L130;
        C1985a r47 = (C1985a) r24;
    L131:
        if (r47 == null) goto L133;
        String r48 = r47.f7108f;
    L135:
        if (AbstractC0585Nj.m1134a(r48, "navigation") == false) goto L144;
        C1985a r25 = (C1985a) r24;
        ConcurrentHashMap r49 = r25.f7111i;
        if (r49 == null) goto L140;
        Object r410 = r49.get("to");
        if (r410 == null) goto L140;
    L142:
        if ((r410 instanceof String) == false) goto L144;
        r03.add((String) r25.f7111i.get("to"));
    L140:
        r410 = null;
        goto L142
    L133:
        r48 = null;
        goto L135
    L130:
        r47 = null;
        goto L131
    L106:
        if (AbstractC0585Nj.m1134a(r22.f6714g, "network.event") == false) goto L119;
        Object r26 = r22.f6713f.get("action");
        if (r26 != null) goto L111;
        r26 = null;
    L111:
        if (AbstractC0585Nj.m1134a(r26, "NETWORK_AVAILABLE") == false) goto L119;
        if (AbstractC0585Nj.m1134a(r33.f6714g, "network.event") == false) goto L119;
        if (r33.f6713f.containsKey("network_type") == false) goto L119;
        if ((r33.m4092a().getTime() + 5000) < r34.getTime()) goto L119;
        r23 = true;
        goto L121
    L145:
        if (r43 != null) goto L147;
    L154:
        long r17 = r53.getTime();
        Iterator r310 = r45.iterator();
    L156:
        if (r310.hasNext() == false) goto L163;
        AbstractC1986b r411 = (AbstractC1986b) r310.next();
        long r102 = r411.f7116b;
        if (r102 >= r17) goto L156;
        if (r102 < r34.getTime()) goto L162;
        r9.add(r411);
    L162:
        r310.remove();
        goto L156
    L163:
        if (r36 != 0) goto L168;
        C1995k r18 = new C1995k(EnumC1987c.Custom);
        HashMap r27 = new HashMap();
        r18.f7140d = r27;
        r18.f7139c = "options";
        C1968r r311 = r31.getSdkVersion();
        if (r311 == null) goto L167;
        r27.put("nativeSdkName", r311.f6999a);
        r27.put("nativeSdkVersion", r311.f7000b);
    L167:
        C2067z2 r312 = r31.getSessionReplay();
        Double r412 = r312.f7306b;
        CopyOnWriteArraySet r54 = r312.f7307c;
        r27.put("errorSampleRate", r412);
        r27.put("sessionSampleRate", r312.f7305a);
        r27.put("maskAllImages", Boolean.valueOf(r54.contains("android.widget.ImageView")));
        r27.put("maskAllText", Boolean.valueOf(r54.contains("android.widget.TextView")));
        r27.put("quality", r312.f7309e.serializedName());
        r27.put("maskedViewClasses", r54);
        r27.put("unmaskedViewClasses", r312.f7308d);
        r9.add(r18);
    L168:
        C1927m1 r19 = new C1927m1();
        r19.f6817a = Integer.valueOf(r36);
        r19.f6818b = AbstractC2453ra.m4904n0(r9, new C1771i());
        r6.f7287w = r03;
        return new C1773k(r6, r19);
    L147:
        if (r03.isEmpty() == false) goto L150;
        Object r110 = null;
    L152:
        if (AbstractC0585Nj.m1134a(r110, r43) == true) goto L154;
        r03.addFirst(r43);
        goto L154
    L150:
        r110 = r03.get(0);
        goto L152
    L99:
        r1 = r44;
        goto L100
    L12:
        C1981r r143 = r46.m4173a();
        C1814d r04 = new C1814d(r13, new C1811a(r5, r38, r37, r41, r42));     // Catch: Throwable -> L177
        MediaCodec r62 = r04.f6570d;     // Catch: Throwable -> L177
        r62.configure((MediaFormat) r04.f6571e.getValue(), null, null, 1);     // Catch: Throwable -> L177
        r04.f6574h = r62.createInputSurface();     // Catch: Throwable -> L177
        r62.start();     // Catch: Throwable -> L177
        r04.m3982a(false);     // Catch: Throwable -> L177
        AbstractC0714Qj.m1489k(r143, null);
        r40.f6503f = r04;
        long r63 = ((long) 1000) / ((long) r41);
        C1790k r05 = (C1790k) AbstractC2453ra.m4898h0(r12);
        long r82 = r4 + r14;
        if (r82 > Long.MIN_VALUE) goto L17;
        C2554tp r28 = C2554tp.f8874d;
        ArrayList r222 = r12;
    L19:
        if (r63 <= 0) goto L21;
        boolean r313 = true;
    L22:
        Long r112 = Long.valueOf(r63);
        if (r313 == false) goto L175;
        long r113 = r28.f8689a;
        long r314 = r28.f8690b;
        if (r28.f8691c <= 0) goto L27;
        long r282 = r63;
    L28:
        long r242 = r113;
        long r114 = new C2468rp(r242, r314, r282).f8690b;
        if (r282 > 0) goto L31;
    L32:
        if (r282 < 0) goto L34;
    L74:
        ArrayList r29 = r222;
        int r315 = 0;
    L75:
        if (r315 != 0) goto L77;
        r13.getLogger().mo3680e(EnumC1657a2.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
        r40.m3971d(r5);
        r10 = r37;
        r132 = r38;
        r142 = r41;
        r8 = null;
        goto L91
    L77:
        C1981r r413 = r46.m4173a();
        C1814d r06 = r40.f6503f;     // Catch: Throwable -> L81
        if (r06 == null) goto L83;
        r06.m3984c();     // Catch: Throwable -> L81
    L83:
        C1814d r07 = r40.f6503f;     // Catch: Throwable -> L81
        if (r07 == null) goto L89;
        C1812b r08 = r07.f6573g;     // Catch: Throwable -> L81
        if (r08.f6564e == 0) goto L89;
        r16 = TimeUnit.MILLISECONDS.convert(r08.f6565f + r08.f6560a, TimeUnit.MICROSECONDS);     // Catch: Throwable -> L81
    L89:
        long r115 = r16;
        r40.f6503f = null;     // Catch: Throwable -> L81
        AbstractC0714Qj.m1489k(r413, null);
        C0382Iv r83 = new C0382Iv();
        r132 = r38;
        r142 = r41;
        r10 = r37;
        AbstractC2711xa.m5283e0(r29, new C1788i(r82, r40, r83, 0));
        String r09 = (String) r83.f1315a;
        r8 = new C1762c(r5, r315, r115);
    L81:
        th = move-exception;
        throw th;     // Catch: Throwable -> L171
    L171:
        th = move-exception;
        AbstractC0714Qj.m1489k(r413, th);
        throw th;
    L34:
        if (r114 > r242) goto L74;
    L35:
        int r210 = 0;
    L36:
        Iterator r316 = r222.iterator();
    L38:
        if (r316.hasNext() == false) goto L48;
        C1790k r414 = (C1790k) r316.next();
        long r20 = r242 + r63;
        int r332 = r210;
        Iterator r422 = r316;
        long r211 = r414.f6509b;
        if (r242 > r211) goto L45;
        if (r211 > r20) goto L45;
    L50:
        if (r414 != null) goto L195;
    L68:
        if (r414 == null) goto L70;
        r40.m3971d(r414.f6508a);
        r29 = r222;
        r29.remove(r414);
        r315 = r332;
        r05 = null;
    L72:
        if (r242 == r114) goto L75;
        r242 = r242 + r282;
        r222 = r29;
        r210 = r315;
        goto L36
    L70:
        r29 = r222;
        r315 = r332;
        r05 = r414;
        goto L72
    L195:
        Bitmap r010 = BitmapFactory.decodeFile(r414.f6508a.getAbsolutePath());     // Catch: Throwable -> L61
        C1981r r212 = r46.m4173a();     // Catch: Throwable -> L61
        C1814d r317 = r40.f6503f;     // Catch: Throwable -> L57
        if (r317 == null) goto L59;
        r317.m3983b(r010);     // Catch: Throwable -> L57
    L59:
        AbstractC0714Qj.m1489k(r212, null);     // Catch: Throwable -> L61
        r010.recycle();     // Catch: Throwable -> L61
        r315 = r332 + 1;
        r05 = r414;
        r29 = r222;
        goto L72
    L57:
        th = move-exception;
        throw th;     // Catch: Throwable -> L64
    L64:
        th = move-exception;
        AbstractC0714Qj.m1489k(r212, th);     // Catch: Throwable -> L61
        throw th;     // Catch: Throwable -> L61
    L61:
        th = move-exception;
        r13.getLogger().mo3683r(EnumC1657a2.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
    L45:
        if (r211 > r20) goto L49;
        r210 = r332;
        r316 = r422;
    L49:
        r414 = r05;
        goto L50
    L48:
        r332 = r210;
        goto L49
    L31:
        if (r242 <= r114) goto L35;
    L27:
        r282 = -r63;
        goto L28
    L175:
        throw new IllegalArgumentException("Step must be positive, was: " + r112 + '.');
    L21:
        r313 = false;
        goto L22
    L17:
        r222 = r12;
        r28 = new C2554tp(r4, r82 - 1);
    L177:
        th = move-exception;
        throw th;     // Catch: Throwable -> L180
    L180:
        th = move-exception;
        AbstractC0714Qj.m1489k(r143, th);
        throw th;
    L7:
        if (r5.length() <= 0) goto L9;
        r5.delete();
    L184:
        return C1774l.f6461a;
    }
}
