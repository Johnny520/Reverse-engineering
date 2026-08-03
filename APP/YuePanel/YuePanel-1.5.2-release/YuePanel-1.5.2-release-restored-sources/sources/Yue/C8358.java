package Yue;

import Yue.InterfaceC7144;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢۤۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
public class C8358 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Interpolator f24954;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public InterfaceC8359 f24955;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f24956;

    /* JADX INFO: renamed from: ۥ۟ */
    public long f3435 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final C8360 f24957 = new C1498();

    /* JADX INFO: renamed from: ۥ */
    public final ArrayList<C8357> f3434 = new ArrayList<>();

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۧ$ۥ */
    public class C1498 extends C8360 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3436 = false;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3437 = 0;

        public C1498() {
        }

        @Override // Yue.C8360, Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo34(View view) {
            int i = this.f3437 + 1;
            this.f3437 = i;
            if (i == C8358.this.f3434.size()) {
                InterfaceC8359 interfaceC8359 = C8358.this.f24955;
                if (interfaceC8359 != null) {
                    interfaceC8359.mo34(null);
                }
                m27901();
            }
        }

        @Override // Yue.C8360, Yue.InterfaceC8359
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo5710(View view) {
            if (this.f3436) {
                return;
            }
            this.f3436 = true;
            InterfaceC8359 interfaceC8359 = C8358.this.f24955;
            if (interfaceC8359 != null) {
                interfaceC8359.mo5710(null);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m27901() {
            this.f3437 = 0;
            this.f3436 = false;
            C8358.this.m4328();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4327() {
        if (this.f24956) {
            Iterator<C8357> it = this.f3434.iterator();
            while (it.hasNext()) {
                it.next().m27857();
            }
            this.f24956 = false;
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4328() {
        this.f24956 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C8358 m27895(C8357 c8357) {
        if (!this.f24956) {
            this.f3434.add(c8357);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C8358 m27896(C8357 c8357, C8357 c83572) {
        this.f3434.add(c8357);
        c83572.m27875(c8357.m27858());
        this.f3434.add(c83572);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C8358 m27897(long j) {
        if (!this.f24956) {
            this.f3435 = j;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C8358 m27898(Interpolator interpolator) {
        if (!this.f24956) {
            this.f24954 = interpolator;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C8358 m27899(InterfaceC8359 interfaceC8359) {
        if (!this.f24956) {
            this.f24955 = interfaceC8359;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m27900() {
        if (this.f24956) {
            return;
        }
        for (C8357 c8357 : this.f3434) {
            long j = this.f3435;
            if (j >= 0) {
                c8357.m27871(j);
            }
            Interpolator interpolator = this.f24954;
            if (interpolator != null) {
                c8357.m27872(interpolator);
            }
            if (this.f24955 != null) {
                c8357.m27873(this.f24957);
            }
            c8357.m27877();
        }
        this.f24956 = true;
    }
}
