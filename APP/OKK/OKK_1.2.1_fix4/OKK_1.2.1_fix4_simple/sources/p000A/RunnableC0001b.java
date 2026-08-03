package p000A;

import androidx.emoji2.text.AbstractC0483h;
import java.util.ArrayList;
import java.util.List;
import p001A0.AbstractC0040p;
import p006D.C0095d;
import p083u.AbstractC1083b;

/* JADX INFO: renamed from: A.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0001b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3a;

    /* JADX INFO: renamed from: b */
    public final int f4b;

    /* JADX INFO: renamed from: c */
    public final Object f5c;

    public RunnableC0001b(C0095d r2, int r3) {
        this.f3a = 0;
        this.f5c = r2;
        this.f4b = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f3a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        ArrayList r02 = (ArrayList) this.f5c;
        int r1 = r02.size();
        int r4 = 0;
        if (this.f4b == 1) goto L8;
    L6:
        if (r4 >= r1) goto L10;
        ((AbstractC0483h) r02.get(r4)).mo686a();
        r4 = r4 + 1;
        goto L6
    L10:
        return;
    L8:
        if (r4 >= r1) goto L17;
        ((AbstractC0483h) r02.get(r4)).mo685b();
        r4 = r4 + 1;
        goto L8
    L17:
        return;
    L11:
        AbstractC1083b r03 = (AbstractC1083b) ((C0095d) this.f5c).f251b;
        if (r03 == null) goto L18;
        r03.mo2163f(this.f4b);
        return;
    }

    public RunnableC0001b(List r1, int r2, Throwable r3) {
        this.f3a = 1;
        AbstractC0040p.m106i(r1, "initCallbacks cannot be null");
        this.f5c = new ArrayList(r1);
        this.f4b = r2;
    }
}
