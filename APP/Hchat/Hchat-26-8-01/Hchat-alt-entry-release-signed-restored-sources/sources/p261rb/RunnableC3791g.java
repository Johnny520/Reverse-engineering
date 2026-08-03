package p261rb;

import android.app.Activity;
import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.C0114s;
import ca.C0532s;
import gb.AbstractC1387k;
import gb.C1383g;
import gg.AbstractC1416l;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p036c9.C0415a0;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p080fb.C1134i2;
import p080fb.C1138j2;
import p080fb.C1178t2;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p109hb.C1676e0;
import p119i2.C1955z;
import p129ig.AbstractC2043a;
import p153k8.C2351o;
import p153k8.C2355s;
import p210o8.C3086j;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p315v8.C4521a;
import p315v8.C4522b;
import p315v8.C4527g;
import p315v8.C4528h;
import p315v8.C4537q;
import p315v8.C4538r;
import p332wb.AbstractC4955ho;
import p332wb.C4824dp;
import p332wb.C4857ep;
import p332wb.C4925gr;
import p332wb.C5000j5;
import p332wb.C5071la;
import p332wb.C5321st;
import p345x8.C5718k;
import p345x8.C5724q;
import p357y1.C5953x2;
import p365y9.C6008d;
import p365y9.C6009e;
import sa.C3947a;
import sa.C3949c;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4178y;
import tf.C4173t;
import ua.C4300k;

/* JADX INFO: renamed from: rb.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3791g implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12431g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f12432h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f12433i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC3791g(List list, C4857ep c4857ep, C4824dp c4824dp) {
        this.f12431g = 13;
        this.f12432h = list;
        this.f12433i = c4824dp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0660 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x04a3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:539:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ec A[Catch: all -> 0x01e7, TryCatch #6 {all -> 0x01e7, blocks: (B:89:0x01cb, B:91:0x01d3, B:104:0x01fc, B:106:0x0202, B:114:0x0224, B:98:0x01ec, B:100:0x01f2), top: B:431:0x01cb }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        int i9;
        boolean z9;
        String string;
        String str2;
        boolean z10;
        long millis;
        long j3;
        boolean zRemove;
        C3010h c3010h;
        WeChatMessage weChatMessage;
        boolean z11;
        boolean z12;
        Iterator it;
        long j4;
        Object c3959f;
        byte[] bArr;
        long j5;
        Object c3959f2;
        Object c3959f3;
        Set setM8412U1;
        List<Map.Entry> listM8407P1;
        long j10 = 0;
        boolean z13 = false;
        switch (this.f12431g) {
            case 0:
                C3795k c3795k = (C3795k) this.f12432h;
                C3792h c3792h = (C3792h) this.f12433i;
                synchronized (c3795k.f12444d) {
                    if (c3795k.f12457q != c3792h) {
                        return;
                    }
                    c3795k.f12457q = null;
                    c3795k.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
                    c3795k.m7980f(c3792h, "检测超时");
                    return;
                }
            case 1:
                C3949c c3949c = (C3949c) this.f12432h;
                String str3 = (String) this.f12433i;
                c3949c.getClass();
                try {
                    Toast.makeText(c3949c.f12950a, str3, 0).show();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 2:
                C3949c c3949c2 = (C3949c) this.f12432h;
                Uri uri = (Uri) this.f12433i;
                String str4 = c3949c2.f12951b;
                try {
                    Ringtone ringtone = RingtoneManager.getRingtone(c3949c2.f12950a, uri);
                    if (ringtone == null) {
                        return;
                    }
                    try {
                        ringtone.setStreamType(5);
                        break;
                    } catch (Throwable unused2) {
                    }
                    try {
                        ringtone.play();
                        c3949c2.f12954e.postDelayed(new RunnableC3791g(c3949c2, 3, ringtone), 3500L);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        str = " 铃声播放失败: ";
                        AbstractC0255e.m1030s(th, AbstractC0255e.m1025n(str4, str), th);
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = " 铃声加载失败: ";
                }
                break;
            case 3:
                C3949c c3949c3 = (C3949c) this.f12432h;
                Ringtone ringtone2 = (Ringtone) this.f12433i;
                c3949c3.getClass();
                try {
                    if (ringtone2.isPlaying()) {
                        ringtone2.stop();
                        return;
                    }
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            case 4:
                C4300k c4300k = (C4300k) this.f12432h;
                String str5 = (String) this.f12433i;
                if (c4300k.f14343h) {
                    c4300k.m8637d(str5);
                    return;
                }
                c4300k.f14344i.addLast(str5);
                if (c4300k.f14342g != null) {
                    return;
                }
                c4300k.f14342g = new TextToSpeech(c4300k.f14336a.getApplicationContext(), new C3947a(c4300k, 1));
                return;
            case 5:
                C4537q c4537q = (C4537q) this.f12432h;
                C2351o c2351o = (C2351o) this.f12433i;
                if (c2351o.f7721i) {
                    ConcurrentLinkedDeque concurrentLinkedDeque = c4537q.f14976g;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    WeChatMessage weChatMessage2 = c2351o.f7723k;
                    String str6 = c2351o.f7715c;
                    int i10 = weChatMessage2.type;
                    if (i10 <= 0) {
                        i9 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                    } else {
                        int i11 = i10 & 255;
                        i9 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        int i12 = i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                        if ((i10 >>> 16) != 0) {
                            if (i12 == 10000 || i12 == 10002) {
                                i10 = i12;
                            } else if (i11 != 0 && i12 == i11) {
                                i10 = i11;
                            }
                        }
                    }
                    Iterator it2 = concurrentLinkedDeque.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        C4527g c4527g = (C4527g) it2.next();
                        long j11 = c4527g.f14937e;
                        String str7 = c4527g.f14935c;
                        if (jCurrentTimeMillis - j11 > 10000) {
                            concurrentLinkedDeque.remove(c4527g);
                        } else {
                            if (AbstractC1416l.m3825a(c4527g.f14933a, str6) && c4527g.f14934b == i10) {
                                c4537q.m8961m(c4527g);
                                WeChatMessage weChatMessage3 = c2351o.f7722j;
                                if (weChatMessage3 == null) {
                                    weChatMessage3 = c2351o.f7723k;
                                }
                                long j12 = weChatMessage3.msgSvrId;
                                Long lValueOf = Long.valueOf(j12);
                                if (j12 <= 0) {
                                    lValueOf = null;
                                }
                                if (lValueOf != null) {
                                    long jLongValue = lValueOf.longValue();
                                    C2355s c2355sMessageStore = WeChatApis.messageStore();
                                    WeChatMessage weChatMessageM5663e = c2355sMessageStore != null ? c2355sMessageStore.m5663e(jLongValue, str6) : null;
                                    c3010h = new C3010h(new C3011i(AbstractC4165l.m8376k0(new WeChatMessage[]{weChatMessage3, weChatMessageM5663e}), z13, new C1955z(29)));
                                    while (c3010h.hasNext()) {
                                        WeChatMessage weChatMessage4 = (WeChatMessage) c3010h.next();
                                        weChatMessage = weChatMessage3;
                                        C3010h c3010h2 = c3010h;
                                        long j13 = weChatMessage4.msgId;
                                        if (j13 <= 0 || !c4527g.f14938f.contains(Long.valueOf(j13))) {
                                            long j14 = weChatMessage4.msgSvrId;
                                            if (j14 <= 0 || !c4527g.f14939g.contains(Long.valueOf(j14))) {
                                                weChatMessage3 = weChatMessage;
                                                c3010h = c3010h2;
                                            }
                                        }
                                        z11 = true;
                                        if (AbstractC1416l.m3825a(c2351o.f7713a, "local_send") && !AbstractC3149m.m6721t0(str7)) {
                                            it = AbstractC4165l.m8376k0(new String[]{c2351o.f7717e, weChatMessage.bodyContent()}).iterator();
                                            while (it.hasNext()) {
                                                if (AbstractC1416l.m3825a((String) it.next(), str7)) {
                                                    z12 = true;
                                                    if (!z11 || z12) {
                                                        zRemove = concurrentLinkedDeque.remove(c4527g);
                                                        if (zRemove) {
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        z12 = false;
                                        if (!z11) {
                                        }
                                        zRemove = concurrentLinkedDeque.remove(c4527g);
                                        if (zRemove) {
                                        }
                                    }
                                    weChatMessage = weChatMessage3;
                                    z11 = false;
                                    if (AbstractC1416l.m3825a(c2351o.f7713a, "local_send")) {
                                        it = AbstractC4165l.m8376k0(new String[]{c2351o.f7717e, weChatMessage.bodyContent()}).iterator();
                                        while (it.hasNext()) {
                                        }
                                    }
                                    z12 = false;
                                    if (!z11) {
                                    }
                                    zRemove = concurrentLinkedDeque.remove(c4527g);
                                    if (zRemove) {
                                    }
                                }
                                c3010h = new C3010h(new C3011i(AbstractC4165l.m8376k0(new WeChatMessage[]{weChatMessage3, weChatMessageM5663e}), z13, new C1955z(29)));
                                while (c3010h.hasNext()) {
                                }
                                weChatMessage = weChatMessage3;
                                z11 = false;
                                if (AbstractC1416l.m3825a(c2351o.f7713a, "local_send")) {
                                }
                                z12 = false;
                                if (!z11) {
                                }
                                zRemove = concurrentLinkedDeque.remove(c4527g);
                                if (zRemove) {
                                }
                            }
                            z13 = false;
                        }
                    }
                    zRemove = false;
                    if (zRemove) {
                    }
                } else {
                    i9 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                }
                C4538r c4538r = C4538r.f14978a;
                if (!C4538r.m8966a(c4537q.f14971b)) {
                    return;
                }
                LinkedHashSet linkedHashSet = C4538r.f14979b;
                if (linkedHashSet.contains(c2351o.f7714b)) {
                    z9 = true;
                } else {
                    int i13 = c2351o.f7723k.type;
                    if (i13 > 0) {
                        int i14 = i13 & 255;
                        int i15 = i13 & i9;
                        if ((i13 >>> 16) != 0) {
                            if (i15 == 10000 || i15 == 10002) {
                                i13 = i15;
                            } else if (i14 != 0 && i15 == i14) {
                                i13 = i14;
                            }
                        }
                    }
                    if (i13 != 62 || !linkedHashSet.contains("video_number_video")) {
                        z9 = false;
                    }
                }
                if (!z9) {
                    return;
                }
                List listM101y0 = AbstractC0000a.m101y0(c2351o.f7717e, c2351o.f7718f, c2351o.f7723k.bodyContent());
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM101y0) {
                    String str8 = (String) obj;
                    str8.getClass();
                    if (!AbstractC3149m.m6721t0(str8)) {
                        arrayList.add(obj);
                    }
                }
                String strM8392A1 = AbstractC4166m.m8392A1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)), "\n", null, null, null, 62);
                String strM5616c = c2351o.f7716d;
                if (AbstractC3149m.m6721t0(strM5616c)) {
                    strM5616c = c2351o.m5616c();
                }
                String strM6839l = AbstractC3199a.m6839l(strM5616c, strM5616c);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C4538r c4538r2 = C4538r.f14978a;
                for (C4521a c4521a : C4538r.m8967b(c4537q.f14971b)) {
                    String str9 = c2351o.f7715c;
                    str9.getClass();
                    String str10 = c2351o.f7714b;
                    str10.getClass();
                    if (C4537q.m8953n(c4521a, str9, str10, c2351o.f7723k.type, strM8392A1, c2351o.f7721i, strM6839l)) {
                        for (String str11 : c4521a.f14903g) {
                            if (!AbstractC3149m.m6721t0(str11) && !str11.equals(c2351o.f7715c)) {
                                if (c4521a.f14905i) {
                                    TimeUnit timeUnit = TimeUnit.SECONDS;
                                    long j15 = c4521a.f14906j;
                                    if (j15 < 0) {
                                        j15 = 0;
                                    }
                                    millis = timeUnit.toMillis(j15);
                                } else {
                                    millis = 0;
                                }
                                Object linkedHashMap2 = linkedHashMap.get(str11);
                                if (linkedHashMap2 == null) {
                                    linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap.put(str11, linkedHashMap2);
                                }
                                Map map = (Map) linkedHashMap2;
                                String str12 = c4521a.f14897a;
                                if (millis <= 0) {
                                    j3 = jCurrentTimeMillis2;
                                } else {
                                    j3 = Long.MAX_VALUE;
                                    if (jCurrentTimeMillis2 <= Long.MAX_VALUE - millis) {
                                        j3 = jCurrentTimeMillis2 + millis;
                                    }
                                }
                                map.put(str12, Long.valueOf(j3));
                            }
                        }
                    }
                }
                Set setKeySet = linkedHashMap.keySet();
                setKeySet.getClass();
                List listM8402K1 = AbstractC4166m.m8402K1(setKeySet, new C0415a0(linkedHashMap, 28));
                if (listM8402K1.isEmpty()) {
                    return;
                }
                WeChatMessage weChatMessage5 = c2351o.f7723k;
                long j16 = weChatMessage5.msgSvrId;
                if (j16 > 0) {
                    str2 = "svr:";
                } else {
                    j16 = weChatMessage5.msgId;
                    if (j16 <= 0) {
                        String str13 = c2351o.f7715c;
                        long j17 = weChatMessage5.createTime;
                        int i16 = weChatMessage5.type;
                        int iHashCode = c2351o.f7717e.hashCode();
                        StringBuilder sbM2259v = AbstractC0921a.m2259v("event:", str13, ":", j17);
                        sbM2259v.append(":");
                        sbM2259v.append(i16);
                        sbM2259v.append(":");
                        sbM2259v.append(iHashCode);
                        string = sbM2259v.toString();
                        synchronized (c4537q.f14973d) {
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            Set setEntrySet = c4537q.f14973d.entrySet();
                            setEntrySet.getClass();
                            Iterator it3 = setEntrySet.iterator();
                            while (it3.hasNext()) {
                                Map.Entry entry = (Map.Entry) it3.next();
                                entry.getClass();
                                Object value = entry.getValue();
                                value.getClass();
                                if (jCurrentTimeMillis3 - ((Number) value).longValue() > 600000) {
                                    it3.remove();
                                }
                            }
                            if (c4537q.f14973d.containsKey(string)) {
                                z10 = false;
                            } else {
                                c4537q.f14973d.put(string, Long.valueOf(jCurrentTimeMillis3));
                                z10 = true;
                            }
                        }
                        if (z10 && c4537q.f14974e.add(string)) {
                            if (c4537q.f14974e.size() > 128) {
                                c4537q.f14974e.remove(string);
                                return;
                            }
                            WeChatMessage weChatMessage6 = c2351o.f7723k;
                            String str14 = c2351o.f7715c;
                            str14.getClass();
                            long j18 = weChatMessage6.msgSvrId;
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(AbstractC4178y.m8438a0(linkedHashMap.size()));
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                linkedHashMap3.put(entry2.getKey(), AbstractC4178y.m8443f0((Map) entry2.getValue()));
                            }
                            String str15 = c2351o.f7714b;
                            str15.getClass();
                            int i17 = weChatMessage6.type;
                            boolean z14 = c2351o.f7721i;
                            long j19 = jCurrentTimeMillis2 + 60000;
                            String string2 = UUID.randomUUID().toString();
                            string2.getClass();
                            C4528h c4528h = new C4528h(string, str14, j18, weChatMessage6, listM8402K1, linkedHashMap3, str15, i17, strM8392A1, z14, strM6839l, j19, AbstractC3156t.m6737a0(string2, "-", HttpUrl.FRAGMENT_ENCODE_SET, false));
                            if (c4537q.m8962o(350L, new C4522b(c4537q, c4528h, 3))) {
                                return;
                            }
                            c4537q.m8957d(c4528h);
                            return;
                        }
                        return;
                    }
                    str2 = "local:";
                }
                string = AbstractC0255e.m1018g(j16, str2);
                synchronized (c4537q.f14973d) {
                }
                break;
            case 6:
                ((InterfaceC1235p) this.f12432h).invoke((List) this.f12433i, null);
                return;
            case 7:
                ((InterfaceC1235p) this.f12432h).invoke(C4173t.f13710g, (Throwable) this.f12433i);
                return;
            case 8:
                ((C5071la) this.f12432h).invoke((List) this.f12433i, null);
                return;
            case 9:
                ((C5071la) this.f12432h).invoke(C4173t.f13710g, (Throwable) this.f12433i);
                return;
            case 10:
                ((C5071la) this.f12432h).invoke(new C5000j5(), (Throwable) this.f12433i);
                return;
            case 11:
                Activity activity = (Activity) this.f12432h;
                C1676e0 c1676e0 = (C1676e0) this.f12433i;
                if (activity.isFinishing() || activity.isDestroyed()) {
                    return;
                }
                c1676e0.invoke();
                return;
            case 12:
                Activity activity2 = (Activity) this.f12432h;
                String message = ((Throwable) this.f12433i).getMessage();
                if (message == null) {
                    message = "读取附加文件失败";
                }
                Toast.makeText(activity2, message, 0).show();
                return;
            case 13:
                List<Uri> list = (List) this.f12432h;
                C4824dp c4824dp = (C4824dp) this.f12433i;
                ArrayList arrayList2 = new ArrayList();
                for (Uri uri2 : list) {
                    Activity activity3 = c4824dp.f16691a;
                    C4857ep c4857ep = C4857ep.f16968a;
                    try {
                        String strM9309C6 = AbstractC4955ho.m9309C6(activity3, uri2);
                        if (strM9309C6 != null) {
                            String strM6697L0 = AbstractC3149m.m6697L0(strM9309C6, '/', strM9309C6);
                            String strM6697L02 = AbstractC3149m.m6697L0(strM6697L0, '\\', strM6697L0);
                            if (AbstractC3149m.m6721t0(strM6697L02)) {
                                strM6697L02 = null;
                            }
                            if (strM6697L02 == null) {
                                String lastPathSegment = uri2.getLastPathSegment();
                                strM6697L02 = lastPathSegment != null ? AbstractC3149m.m6697L0(lastPathSegment, '/', lastPathSegment) : null;
                                if (strM6697L02 == null) {
                                    strM6697L02 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                            }
                            try {
                                if (AbstractC3149m.m6721t0(strM6697L02)) {
                                    throw new IllegalArgumentException("无法读取所选文件名");
                                }
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    InputStream inputStreamOpenInputStream = activity3.getContentResolver().openInputStream(uri2);
                                    try {
                                        if (inputStreamOpenInputStream == null) {
                                            throw new IllegalStateException("无法打开所选文件");
                                        }
                                        try {
                                            bArr = new byte[32768];
                                            j5 = j10;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            j4 = j10;
                                        }
                                        while (true) {
                                            int i18 = inputStreamOpenInputStream.read(bArr);
                                            if (i18 >= 0) {
                                                j4 = j10;
                                                j5 += (long) i18;
                                                if (j5 > 16777216) {
                                                    throw new IllegalArgumentException((strM6697L02 + " 超过 16384 KiB").toString());
                                                }
                                                try {
                                                    byteArrayOutputStream.write(bArr, 0, i18);
                                                    j10 = j4;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                }
                                                th = th5;
                                                Throwable th6 = th;
                                                try {
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    AbstractC2043a.m5035i(inputStreamOpenInputStream, th6);
                                                    throw th7;
                                                }
                                            }
                                            inputStreamOpenInputStream.close();
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            byteArrayOutputStream.close();
                                            Set set = AbstractC1387k.f4608a;
                                            byteArray.getClass();
                                            c3959f = AbstractC1387k.m3766c(strM6697L02, byteArray);
                                            j4 = j10;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        Throwable th9 = th;
                                        try {
                                            throw th9;
                                        } catch (Throwable th10) {
                                            AbstractC2043a.m5035i(byteArrayOutputStream, th9);
                                            throw th10;
                                        }
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    j4 = j10;
                                }
                            } catch (Throwable th12) {
                                th = th12;
                                c3959f = new C3959f(th);
                            }
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        j4 = j10;
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC3791g(activity3, 12, thM8182b));
                        c3959f = null;
                    }
                    C1383g c1383g = (C1383g) c3959f;
                    if (c1383g != null) {
                        arrayList2.add(c1383g);
                    }
                    j10 = j4;
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    String str16 = ((C1383g) obj2).f4590a;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str16.toLowerCase(locale);
                    lowerCase.getClass();
                    if (hashSet.add(lowerCase)) {
                        arrayList3.add(obj2);
                    }
                }
                if (arrayList3.isEmpty()) {
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC3791g(c4824dp, 14, arrayList3));
                return;
            case 14:
                ((C4824dp) this.f12432h).f16692b.invoke((ArrayList) this.f12433i);
                return;
            case 15:
                Context context = (Context) this.f12432h;
                String message2 = ((Throwable) this.f12433i).getMessage();
                if (message2 == null) {
                    message2 = "读取附件失败";
                }
                Toast.makeText(context, message2, 0).show();
                return;
            case 16:
                ((C4925gr) this.f12432h).f17490c.invoke((ArrayList) this.f12433i);
                return;
            case 17:
                Context context2 = (Context) this.f12432h;
                C1138j2 c1138j2 = (C1138j2) this.f12433i;
                try {
                    ConcurrentHashMap concurrentHashMap = C1178t2.f3961a;
                    context2.getClass();
                    c1138j2.getClass();
                    try {
                        C1178t2.m3081q(C1178t2.m3073i(context2, c1138j2.f3743a));
                        break;
                    } catch (Throwable unused4) {
                    }
                    c3959f2 = C3967n.f12976a;
                    break;
                } catch (Throwable th14) {
                    c3959f2 = new C3959f(th14);
                }
                Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                if (thM8182b2 != null) {
                    AbstractC1184v0.m3204n("[Hchat:ScriptAgent] 清理恢复工作区失败", thM8182b2);
                    return;
                }
                return;
            case 18:
                Context context3 = (Context) this.f12432h;
                C1134i2 c1134i2 = ((C5321st) this.f12433i).f20719b;
                ConcurrentHashMap concurrentHashMap2 = C1178t2.f3961a;
                c1134i2.getClass();
                try {
                    C1178t2.m3081q(C1178t2.m3071g(context3, c1134i2));
                    return;
                } catch (Throwable unused5) {
                    return;
                }
            case 19:
                C5718k c5718k = (C5718k) this.f12432h;
                AtomicBoolean atomicBoolean = c5718k.f23265k;
                C5718k c5718k2 = (C5718k) this.f12433i;
                while (true) {
                    try {
                        if (!c5718k.f23263i.get()) {
                            long jCurrentTimeMillis4 = c5718k.f23259e - (System.currentTimeMillis() - c5718k.f23266l.get());
                            if (jCurrentTimeMillis4 <= 0) {
                                AtomicReference atomicReference = C5724q.f23305i;
                                while (true) {
                                    if (atomicReference.compareAndSet(c5718k2, null)) {
                                        c5718k.m10317b("idle timeout");
                                    } else if (atomicReference.get() != c5718k2) {
                                        c5718k.m10317b("idle replaced");
                                    }
                                }
                            } else {
                                if (jCurrentTimeMillis4 < 1000) {
                                    jCurrentTimeMillis4 = 1000;
                                }
                                Thread.sleep(jCurrentTimeMillis4);
                            }
                        }
                    } catch (Throwable th15) {
                        c3959f3 = new C3959f(th15);
                    }
                }
                c3959f3 = C3967n.f12976a;
                atomicBoolean.set(false);
                Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                if (thM8182b3 != null) {
                    atomicBoolean.set(false);
                    AbstractC0921a.m2261x("[Hchat:AutoReply] 小智MCP空闲检查失败: ", thM8182b3.getMessage(), thM8182b3);
                    return;
                }
                return;
            case 20:
                C5953x2 c5953x2 = (C5953x2) this.f12432h;
                C0114s c0114s = (C0114s) this.f12433i;
                if (c5953x2.f24187i) {
                    return;
                }
                c5953x2.f24188j = c0114s;
                c0114s.m552a(c5953x2);
                return;
            case 21:
                C6009e c6009e = (C6009e) this.f12432h;
                String str17 = (String) this.f12433i;
                Map map2 = c6009e.f24394e;
                map2.getClass();
                synchronized (map2) {
                    setM8412U1 = AbstractC4166m.m8412U1(c6009e.f24394e.values());
                }
                for (C6008d c6008d : AbstractC3015m.m6418b0(new C3011i(new C0795n(setM8412U1, 6), true, new C0532s(str17, 23)))) {
                    c6008d.getClass();
                    C3086j c3086jTasks = WeChatApis.tasks();
                    if (c3086jTasks != null) {
                        c3086jTasks.m6554e(new RunnableC3791g(c6009e, 22, c6008d));
                    }
                }
                return;
            default:
                C6009e c6009e2 = (C6009e) this.f12432h;
                C6008d c6008d2 = (C6008d) this.f12433i;
                Map map3 = c6009e2.f24394e;
                map3.getClass();
                synchronized (map3) {
                    listM8407P1 = AbstractC4166m.m8407P1(c6009e2.f24394e.entrySet());
                }
                for (Map.Entry entry3 : listM8407P1) {
                    TextView textView = (TextView) entry3.getKey();
                    if (AbstractC1416l.m3825a((C6008d) entry3.getValue(), c6008d2)) {
                        textView.getClass();
                        c6009e2.m10764a(textView, c6008d2.f24388a, c6008d2.f24389b);
                    }
                }
                return;
        }
    }

    public /* synthetic */ RunnableC3791g(Object obj, int i9, Object obj2) {
        this.f12431g = i9;
        this.f12432h = obj;
        this.f12433i = obj2;
    }
}
