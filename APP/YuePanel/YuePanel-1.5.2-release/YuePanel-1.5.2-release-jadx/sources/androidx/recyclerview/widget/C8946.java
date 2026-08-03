package androidx.recyclerview.widget;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import androidx.recyclerview.widget.C8961;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8946<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6490
    public final Executor f3916;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final Executor f3917;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final C8961.AbstractC8963<T> f30086;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟$ۥ */
    public static final class C1760<T> {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final Object f30087 = new Object();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static Executor f30088;

        /* JADX INFO: renamed from: ۥ */
        @InterfaceC6490
        public Executor f3918;

        /* JADX INFO: renamed from: ۥ۟ */
        public Executor f3919;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C8961.AbstractC8963<T> f30089;

        public C1760(@InterfaceC6391 C8961.AbstractC8963<T> abstractC8963) {
            this.f30089 = abstractC8963;
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ */
        public C8946<T> m4968() {
            if (this.f3919 == null) {
                synchronized (f30087) {
                    try {
                        if (f30088 == null) {
                            f30088 = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f3919 = f30088;
            }
            return new C8946<>(this.f3918, this.f3919, this.f30089);
        }

        @InterfaceC6391
        /* JADX INFO: renamed from: ۥ۟ */
        public C1760<T> m4969(Executor executor) {
            this.f3919 = executor;
            return this;
        }

        @InterfaceC6391
        @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C1760<T> m30521(Executor executor) {
            this.f3918 = executor;
            return this;
        }
    }

    public C8946(@InterfaceC6490 Executor executor, @InterfaceC6391 Executor executor2, @InterfaceC6391 C8961.AbstractC8963<T> abstractC8963) {
        this.f3916 = executor;
        this.f3917 = executor2;
        this.f30086 = abstractC8963;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public Executor m4966() {
        return this.f3917;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public C8961.AbstractC8963<T> m4967() {
        return this.f30086;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Executor m30520() {
        return this.f3916;
    }
}
