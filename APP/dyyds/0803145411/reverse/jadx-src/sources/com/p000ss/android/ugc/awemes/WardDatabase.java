package com.p000ss.android.ugc.awemes;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import yyds.AbstractC0055;
import yyds.AbstractC0353;
import yyds.AbstractC1320;
import yyds.AbstractC1595;
import yyds.AbstractC1960;
import yyds.AbstractC2217;
import yyds.AbstractC2328;
import yyds.AbstractC2366;
import yyds.C0188;
import yyds.C0380;
import yyds.C0469;
import yyds.C0522;
import yyds.C0574;
import yyds.C0869;
import yyds.C1024;
import yyds.C1223;
import yyds.C1422;
import yyds.C1491;
import yyds.C1860;
import yyds.C2133;
import yyds.C2234;
import yyds.C2454;
import yyds.C2576;
import yyds.C2586;
import yyds.C2713;
import yyds.C2793;
import yyds.ExecutorC2250;
import yyds.InterfaceC0477;
import yyds.InterfaceC0584;
import yyds.InterfaceC1997;
import yyds.InterfaceC2213;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WardDatabase {

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static final C1024 f489;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static volatile WardDatabase f490;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static final C1024 f491;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final C0469 f492;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final C1024 f493;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f494;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public C1491 f496;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public C2454 f497;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public InterfaceC2213 f498;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public Executor f502;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0522 f503;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public ExecutorC2250 f504;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C2133 f499 = new C2133(15);

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final ThreadLocal f495 = new ThreadLocal();

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final LinkedHashMap f501 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public boolean f500 = true;

    static {
        AbstractC2328.m4341(-1341038686536558L);
        f492 = new C0469(28);
        f489 = new C1024(1, 2, 0);
        f491 = new C1024(2, 3, 1);
        f493 = new C1024(3, 4, 2);
    }

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public abstract C0380 mo344();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean m345() {
        C1491 c1491 = this.f496;
        if (c1491 == null) {
            c1491 = null;
        }
        return ((InterfaceC1997) c1491.f7040) != null;
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final Object m346(boolean z, InterfaceC0477 interfaceC0477, AbstractC1320 abstractC1320) {
        C1491 c1491 = this.f496;
        if (c1491 == null) {
            c1491 = null;
        }
        return ((InterfaceC0584) c1491.f7042).mo1465(z, interfaceC0477, abstractC1320);
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean m347() {
        return m352() && m348().mo3773().m1444();
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC1997 m348() {
        C1491 c1491 = this.f496;
        if (c1491 == null) {
            c1491 = null;
        }
        InterfaceC1997 interfaceC1997 = (InterfaceC1997) c1491.f7040;
        if (interfaceC1997 != null) {
            return interfaceC1997;
        }
        C0188.m800("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m349() {
        if (this.f494) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            C0188.m800("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public List mo350(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC2366.m4382(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((C2234) entry.getKey()).mo3993(), entry.getValue());
        }
        return C1860.f9345;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public LinkedHashMap mo351() {
        int iM4382 = AbstractC2366.m4382(AbstractC0055.m419(C1422.f6715, 10));
        if (iM4382 < 16) {
            iM4382 = 16;
        }
        return new LinkedHashMap(iM4382);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean m352() {
        C1491 c1491 = this.f496;
        if (c1491 == null) {
            c1491 = null;
        }
        C0574 c0574 = (C0574) c1491.f7036;
        if (c0574 != null) {
            return c0574.isOpen();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final void m353(Runnable runnable) throws Throwable {
        C1223 c1223 = new C1223(18, runnable);
        if (!m345()) {
            AbstractC1960.m3776(this, new C2713(14, c1223));
            return;
        }
        m349();
        m349();
        C0574 c0574Mo3773 = m348().mo3773();
        if (!c0574Mo3773.m1444()) {
            C0522 c0522 = this.f503;
            if (c0522 == null) {
                c0522 = null;
            }
            c0522.getClass();
            C2793 c2793 = new C2793(c0522, null, 2);
            Thread.interrupted();
            AbstractC2217.m4197(C2586.f12764, new C2576(c2793, null));
        }
        if (c0574Mo3773.f2765.isWriteAheadLoggingEnabled()) {
            c0574Mo3773.m1447();
        } else {
            c0574Mo3773.m1442();
        }
        try {
            c1223.mo731();
            m348().mo3773().m1443();
        } finally {
            m354();
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m354() {
        m348().mo3773().m1445();
        if (m347()) {
            return;
        }
        C0522 c0522 = this.f503;
        if (c0522 == null) {
            c0522 = null;
        }
        c0522.f2516.m1591(c0522.f2517, c0522.f2514);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public abstract C0522 mo355();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Set mo356() {
        return AbstractC1595.m3267(new ArrayList(AbstractC0055.m419(C1422.f6715, 10)));
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public AbstractC0353 mo357() {
        throw new C0869();
    }
}
