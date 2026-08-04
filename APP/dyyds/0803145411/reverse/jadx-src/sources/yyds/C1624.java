package yyds;

import android.app.Activity;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: yyds.ᛷᲀᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1624 extends AbstractC0041 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public C1908 f8265;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public int f8266;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public C2207 f8270;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public WeakReference f8271;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public CharSequence f8272;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public WeakReference f8275;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public final boolean f8268 = true;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public final float f8267 = AbstractC1655.f8447;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public final long f8273 = 1500;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public float f8274 = -1.0f;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public int f8269 = -1;

    public C1624() {
        this.f410 = new WeakReference(AbstractC0041.m264());
        this.f406 = false;
    }

    /* JADX INFO: renamed from: ᛲᲀᛵᛷ, reason: contains not printable characters */
    public static void m3320() {
        C1624 c1624M3323 = m3323();
        if (c1624M3323 != null) {
            c1624M3323.m3327();
        }
    }

    /* JADX INFO: renamed from: ᛳᛷᛶᛲ, reason: contains not printable characters */
    public static C1624 m3321(CharSequence charSequence) {
        C1624 c1624M3323 = m3323();
        if (c1624M3323 == null) {
            return new C1624();
        }
        c1624M3323.m3328(charSequence, 1);
        if (c1624M3323.m3325() == null) {
            c1624M3323.m287();
            AbstractC0041.m266(new RunnableC2006(c1624M3323, 0));
        }
        return c1624M3323;
    }

    /* JADX INFO: renamed from: ᛴᛸᛴᛸ, reason: contains not printable characters */
    public static C1624 m3322(String str, float f) {
        C1624 c1624M3323 = m3323();
        if (c1624M3323 == null) {
            return new C1624();
        }
        c1624M3323.m3328(str, 5);
        c1624M3323.f8274 = f;
        c1624M3323.m3324();
        if (c1624M3323.m3325() == null) {
            c1624M3323.m287();
            AbstractC0041.m266(new RunnableC2006(c1624M3323, 0));
        }
        return c1624M3323;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛶᛴᛱᛲ, reason: contains not printable characters */
    public static C1624 m3323() {
        Activity activityM264 = AbstractC0041.m264();
        if (activityM264 == 0 || activityM264.isFinishing() || activityM264.isDestroyed()) {
            return null;
        }
        if ((activityM264 instanceof InterfaceC2345) && ((InterfaceC2345) activityM264).mo14().f313 == EnumC1464.f6969) {
            return null;
        }
        for (AbstractC0041 abstractC0041 : AbstractC0041.f392 == null ? new ArrayList() : new CopyOnWriteArrayList(AbstractC0041.f392)) {
            if ((abstractC0041 instanceof C1624) && abstractC0041.f407 && abstractC0041.m282() == activityM264) {
                return (C1624) abstractC0041;
            }
        }
        return new C1624();
    }

    /* JADX INFO: renamed from: ᛱᲀᲈᛲ, reason: contains not printable characters */
    public final void m3324() {
        if (m3325() == null) {
            return;
        }
        AbstractC0041.m266(new RunnableC2006(this, 1));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᛲᛳᛴᛸ */
    public final boolean mo277() {
        WeakReference weakReference = AbstractC1655.f8450;
        return super.mo277();
    }

    /* JADX INFO: renamed from: ᛲᲀᛲᛲ, reason: contains not printable characters */
    public final C2458 m3325() {
        WeakReference weakReference = this.f8275;
        if (weakReference == null) {
            return null;
        }
        return (C2458) weakReference.get();
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final String mo283() {
        return C1624.class.getSimpleName() + "(" + Integer.toHexString(hashCode()) + ")";
    }

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public final void m3326() {
        this.f407 = false;
        new C1344().m2747();
        m291(EnumC1464.f6969);
        WeakReference weakReference = this.f8275;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f8275 = null;
        WeakReference weakReference2 = this.f8271;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f8271 = null;
        WeakReference weakReference3 = this.f410;
        if (weakReference3 != null) {
            weakReference3.clear();
        }
        WeakReference weakReference4 = AbstractC1655.f8450;
    }

    /* JADX INFO: renamed from: ᛷᛴᛴᲁ, reason: contains not printable characters */
    public final void m3327() {
        this.f407 = false;
        AbstractC0041.m266(new RunnableC2006(this, 2));
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC0041
    /* JADX INFO: renamed from: ᲀᛴᲁᲈ */
    public final void mo288() {
        m3324();
    }

    /* JADX INFO: renamed from: ᲁᛵᲁᲁ, reason: contains not printable characters */
    public final void m3328(CharSequence charSequence, int i) {
        this.f8272 = charSequence;
        if (this.f8266 != i) {
            this.f8269 = AbstractC2104.m4012(i);
            this.f8266 = i;
            if (m3325() != null) {
                C2458 c2458M3325 = m3325();
                c2458M3325.getClass();
                AbstractC0041.m266(new RunnableC1421(c2458M3325, i));
            }
        }
        m3324();
    }
}
