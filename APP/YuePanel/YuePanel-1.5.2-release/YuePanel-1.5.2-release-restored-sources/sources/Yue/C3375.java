package Yue;

import Yue.InterfaceC7144;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C3375 extends AbstractC7728 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static volatile C3375 f5411;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public static final Executor f5412 = new Executor() { // from class: Yue.ۥ۟ۡۦۢ
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C3375.m6927(runnable);
        }
    };

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public static final Executor f5413 = new Executor() { // from class: Yue.ۥ۟ۡۦۣ
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C3375.m6928(runnable);
        }
    };

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public AbstractC7728 f262;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final AbstractC7728 f263;

    public C3375() {
        C4358 c4358 = new C4358();
        this.f263 = c4358;
        this.f262 = c4358;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Executor m6924() {
        return f5413;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static C3375 m6925() {
        if (f5411 != null) {
            return f5411;
        }
        synchronized (C3375.class) {
            try {
                if (f5411 == null) {
                    f5411 = new C3375();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f5411;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Executor m6926() {
        return f5412;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static /* synthetic */ void m6927(Runnable runnable) {
        m6925().mo6930(runnable);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m6928(Runnable runnable) {
        m6925().mo461(runnable);
    }

    @Override // Yue.AbstractC7728
    /* JADX INFO: renamed from: ۥ */
    public void mo461(@InterfaceC6391 Runnable runnable) {
        this.f262.mo461(runnable);
    }

    @Override // Yue.AbstractC7728
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean mo6929() {
        return this.f262.mo6929();
    }

    @Override // Yue.AbstractC7728
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo6930(@InterfaceC6391 Runnable runnable) {
        this.f262.mo6930(runnable);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m6931(@InterfaceC6490 AbstractC7728 abstractC7728) {
        if (abstractC7728 == null) {
            abstractC7728 = this.f263;
        }
        this.f262 = abstractC7728;
    }
}
