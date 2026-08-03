package io.sentry.android.replay;

import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.replay.video.C1814d;
import io.sentry.protocol.C1970t;
import io.sentry.util.C2029a;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0714Qj;
import p000.AbstractC2453ra;
import p000.AbstractC2564tz;
import p000.AbstractC2659w7;
import p000.AbstractC2675wh;
import p000.C1216bb;
import p000.C1251cA;
import p000.C2381po;

/* JADX INFO: renamed from: io.sentry.android.replay.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1789j implements Closeable {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6498a;

    /* JADX INFO: renamed from: b */
    public final C1970t f6499b;

    /* JADX INFO: renamed from: f */
    public C1814d f6503f;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f6500c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public final C2029a f6501d = new C2029a();

    /* JADX INFO: renamed from: e */
    public final C2029a f6502e = new C2029a();

    /* JADX INFO: renamed from: g */
    public final C1251cA f6504g = new C1251cA(new C1783g(this, 1));

    /* JADX INFO: renamed from: h */
    public final ArrayList f6505h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f6506i = new LinkedHashMap();

    /* JADX INFO: renamed from: j */
    public final C1251cA f6507j = new C1251cA(new C1783g(this, 0));

    public C1789j(C2046v2 c2046v2, C1970t c1970t) {
        this.f6498a = c2046v2;
        this.f6499b = c1970t;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1981r c1981rM4173a = this.f6501d.m4173a();
        try {
            C1814d c1814d = this.f6503f;
            if (c1814d != null) {
                c1814d.m3984c();
            }
            this.f6503f = null;
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
            this.f6500c.set(true);
        } finally {
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3971d(File file) {
        C2046v2 c2046v2 = this.f6498a;
        try {
            if (file.delete()) {
                return;
            }
            c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: f */
    public final File m3972f() {
        return (File) this.f6504g.getValue();
    }

    /* JADX INFO: renamed from: i */
    public final void m3973i(String str, String str2) {
        File file;
        File file2;
        C1251cA c1251cA = this.f6507j;
        LinkedHashMap linkedHashMap = this.f6506i;
        C1981r c1981rM4173a = this.f6502e.m4173a();
        try {
            if (this.f6500c.get()) {
                AbstractC0714Qj.m1489k(c1981rM4173a, null);
                return;
            }
            File file3 = (File) c1251cA.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) c1251cA.getValue()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) c1251cA.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), AbstractC2659w7.f9201a), 8192);
                try {
                    Iterator it = new C1216bb(new C2381po(0, bufferedReader)).iterator();
                    while (it.hasNext()) {
                        List listM5065Z = AbstractC2564tz.m5065Z((String) it.next(), new String[]{"="}, 2);
                        linkedHashMap.put((String) listM5065Z.get(0), (String) listM5065Z.get(1));
                    }
                    bufferedReader.close();
                } finally {
                }
            }
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
            File file4 = (File) c1251cA.getValue();
            if (file4 != null) {
                AbstractC2675wh.m5246i0(file4, AbstractC2453ra.m4901k0(linkedHashMap.entrySet(), "\n", null, null, C1787h.f6493b, 30));
            }
            AbstractC0714Qj.m1489k(c1981rM4173a, null);
        } finally {
        }
    }
}
