package com.tendcloud.tenddata;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.tendcloud.tenddata.C0032an;
import com.tendcloud.tenddata.C0066bu;
import com.tendcloud.tenddata.C0121n;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.TreeSet;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import p001.C0167c4;

/* JADX INFO: renamed from: com.tendcloud.tenddata.co */
/* JADX INFO: loaded from: classes.dex */
public class C0087co {

    /* JADX INFO: renamed from: a */
    private static String f393a = "utf-8";

    /* JADX INFO: renamed from: c */
    private static final int f395c = 5;

    /* JADX INFO: renamed from: d */
    private static final int f396d = 30000;

    /* JADX INFO: renamed from: g */
    private static final boolean f397g = true;

    /* JADX INFO: renamed from: h */
    private static final int f398h = 65536;

    /* JADX INFO: renamed from: j */
    private static HandlerThread f400j;

    /* JADX INFO: renamed from: e */
    private long f401e = 0;

    /* JADX INFO: renamed from: f */
    private boolean f402f = f397g;

    /* JADX INFO: renamed from: k */
    private Handler f403k;

    /* JADX INFO: renamed from: b */
    private static final CRC32 f394b = new CRC32();

    /* JADX INFO: renamed from: i */
    private static volatile C0087co f399i = null;

    static {
        try {
            C0132z.m785a().register(m431a());
        } catch (Throwable unused) {
        }
    }

    private C0087co() {
        this.f403k = null;
        HandlerThread handlerThread = new HandlerThread("ModuleDataForward", 10);
        f400j = handlerThread;
        handlerThread.start();
        this.f403k = new Handler(f400j.getLooper()) { // from class: com.tendcloud.tenddata.co.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                try {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof AbstractC0018a)) {
                        C0087co.this.m433a((AbstractC0018a) obj);
                    }
                    C0087co.this.m439b();
                } catch (Throwable unused) {
                }
            }
        };
        m439b();
    }

    /* JADX INFO: renamed from: a */
    public static C0087co m431a() {
        if (f399i == null) {
            synchronized (C0087co.class) {
                if (f399i == null) {
                    f399i = new C0087co();
                }
            }
        }
        return f399i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    private static String m432a(TreeSet<C0089cq> treeSet) {
        StringBuilder sbM1039 = C0167c4.m1039("[");
        for (C0089cq c0089cq : treeSet) {
            if (c0089cq.m450c() != null && c0089cq.m450c().length > 0) {
                sbM1039.append(new String(c0089cq.m450c()));
                sbM1039.append(",");
            }
        }
        sbM1039.deleteCharAt(sbM1039.length() - 1);
        sbM1039.append("]");
        return sbM1039.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m433a(AbstractC0018a abstractC0018a) {
        boolean zM660a;
        TreeSet<C0089cq> treeSetM441a;
        String str;
        if (C0122o.m688b(C0020ab.f132g) && abstractC0018a.needToSendData()) {
            boolean z = false;
            try {
                zM660a = C0121n.m660a(C0121n.b.getFeatureLockFileName(abstractC0018a.index()));
            } catch (Throwable unused) {
            }
            if (!zM660a) {
                if (zM660a) {
                    C0121n.releaseFileLock(C0121n.b.getFeatureLockFileName(abstractC0018a.index()));
                    return;
                }
                return;
            }
            try {
                treeSetM441a = C0088cp.m440a().m441a(abstractC0018a);
            } catch (Throwable unused2) {
                z = zM660a;
                if (!z) {
                    return;
                }
            }
            if (treeSetM441a != null && treeSetM441a.size() > 0) {
                m436a("New local data found!", abstractC0018a, false);
                byte[] bArrM437a = m437a(treeSetM441a, C0131y.m780f(m432a(treeSetM441a)));
                C0034ap c0034ap = new C0034ap();
                byte[] bArrM734a = null;
                if (!abstractC0018a.name().equals("PUSH")) {
                    bArrM734a = C0127u.m734a(bArrM437a);
                    c0034ap.m203a("decrypt-version", C0020ab.f105O);
                }
                if (bArrM734a != null) {
                    bArrM437a = bArrM734a;
                }
                CRC32 crc32 = f394b;
                crc32.reset();
                crc32.update(bArrM437a);
                if (bArrM437a != null && bArrM437a.length > 0) {
                    m436a("Submit local data to collector server ...", abstractC0018a, f397g);
                }
                StringBuilder sb = new StringBuilder(abstractC0018a.name().equals("SDK") ? C0125s.m728b(C0020ab.f132g, C0020ab.f148w, C0020ab.f93C, abstractC0018a.getUrl()) : abstractC0018a.getUrl());
                if (abstractC0018a.name().equals("TRACKING")) {
                    sb.append("/" + Long.toHexString(crc32.getValue()));
                    str = "/1";
                } else {
                    str = "/" + Long.toHexString(crc32.getValue());
                }
                sb.append(str);
                C0036ar c0036arM131a = C0030al.m131a(C0030al.m129a().url(sb.toString()).body(new C0032an(C0032an.a.EMPTY, bArrM437a)).method(EnumC0035aq.POST).cert(abstractC0018a.getCert()).header(c0034ap).host(abstractC0018a.name().equals("SDK") ? C0125s.m728b(C0020ab.f132g, C0020ab.f148w, C0020ab.f94D, abstractC0018a.getHost()) : abstractC0018a.getHost()).m137ip(abstractC0018a.getIP()).build(), abstractC0018a);
                if (c0036arM131a.m212b() == 200) {
                    this.f401e = SystemClock.elapsedRealtime();
                    this.f402f = f397g;
                    C0088cp.m440a().sendMessageSuccess(abstractC0018a);
                    m436a("Data submitted successfully!", abstractC0018a, f397g);
                    C0020ab.f114X.set(0);
                } else {
                    C0020ab.f114X.incrementAndGet();
                    C0088cp.m440a().sendMessageFaild(abstractC0018a);
                    this.f402f = false;
                    m436a("Failed to submit data! Response code " + c0036arM131a.m212b(), abstractC0018a, f397g);
                }
                if (zM660a) {
                    C0121n.releaseFileLock(C0121n.b.getFeatureLockFileName(abstractC0018a.index()));
                    return;
                }
                return;
            }
            m436a("No new data found!", abstractC0018a, false);
            if (zM660a) {
                C0121n.releaseFileLock(C0121n.b.getFeatureLockFileName(abstractC0018a.index()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m437a(TreeSet<C0089cq> treeSet, byte[] bArr) {
        int size;
        try {
            if (bArr.length < f398h || (size = treeSet.size()) == 1) {
                return bArr;
            }
            for (int i = 0; i < size / 2; i++) {
                treeSet.pollLast();
            }
            return m437a(treeSet, C0131y.m780f(m432a(treeSet)));
        } catch (Throwable unused) {
            return bArr;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m438a(byte[] bArr) {
        BufferedInputStream bufferedInputStream;
        byte[] bArr2 = new byte[2048];
        try {
            bufferedInputStream = new BufferedInputStream(new InflaterInputStream(new ByteArrayInputStream(bArr), new Inflater(false)));
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int i = bufferedInputStream.read(bArr2);
                    if (i == -1) {
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return byteArrayOutputStream.toByteArray();
                    }
                    byteArrayOutputStream.write(bArr2, 0, i);
                }
            } catch (Exception unused) {
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return null;
            }
        } catch (Exception unused2) {
            bufferedInputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m439b() {
        if (this.f403k.hasMessages(5)) {
            return;
        }
        try {
            SecureRandom secureRandomM762b = C0131y.m762b();
            int[] iArrM18a = C0020ab.m18a();
            int iNextInt = C0122o.m700i(C0020ab.f132g) ? !this.f402f ? (iArrM18a[1] * 1) + secureRandomM762b.nextInt(f396d) : iArrM18a[1] : !this.f402f ? (secureRandomM762b.nextInt(60000) - f396d) + (iArrM18a[0] * 1) : iArrM18a[0];
            if (iNextInt > 1800000) {
                iNextInt = 1800000;
            }
            for (AbstractC0018a abstractC0018a : AbstractC0018a.getFeaturesList()) {
                Handler handler = this.f403k;
                handler.sendMessageDelayed(Message.obtain(handler, 5, abstractC0018a), iNextInt);
            }
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventForwardRequest(C0066bu c0066bu) {
        if (c0066bu == null || C0020ab.f132g == null) {
            return;
        }
        if (c0066bu.f351b.equals(C0066bu.a.IMMEDIATELY)) {
            if (this.f403k.hasMessages(5, c0066bu.f350a)) {
                this.f403k.removeMessages(5);
            }
            Message.obtain(this.f403k, 5, c0066bu.f350a).sendToTarget();
        } else if (c0066bu.f351b.equals(C0066bu.a.HIGH)) {
            if (this.f403k.hasMessages(5)) {
                this.f403k.removeMessages(5);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f401e;
            long j = C0020ab.f118aa;
            long jAbs = Math.abs(jElapsedRealtime - C0020ab.f118aa);
            if (jAbs <= C0020ab.f118aa) {
                j = jAbs;
            }
            this.f403k.sendMessageDelayed(Message.obtain(this.f403k, 5, c0066bu.f350a), j);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m436a(String str, AbstractC0018a abstractC0018a, boolean z) {
        StringBuilder sbM1039 = C0167c4.m1039("[");
        sbM1039.append(abstractC0018a.name());
        sbM1039.append("] ");
        sbM1039.append(str);
        String string = sbM1039.toString();
        int iIndex = abstractC0018a.index();
        if (iIndex != 0 && iIndex != 1 && iIndex != 3 && iIndex != 99 && iIndex != 7 && iIndex != 8) {
            C0115h.iForInternal(string);
        } else if (z) {
            C0115h.iForDeveloper(string);
        } else {
            C0115h.dForInternal(string);
        }
    }
}
