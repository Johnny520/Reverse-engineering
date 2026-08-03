package ug;

import java.util.Arrays;
import p276sf.C3967n;
import sg.EnumC3969a;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ug.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4337b {

    /* JADX INFO: renamed from: g */
    public AbstractC4339d[] f14495g;

    /* JADX INFO: renamed from: h */
    public int f14496h;

    /* JADX INFO: renamed from: i */
    public int f14497i;

    /* JADX INFO: renamed from: j */
    public C4351p f14498j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractC4339d m8790a() {
        AbstractC4339d abstractC4339dMo8444c;
        C4351p c4351p;
        synchronized (this) {
            try {
                AbstractC4339d[] abstractC4339dArrMo8445d = this.f14495g;
                if (abstractC4339dArrMo8445d == null) {
                    abstractC4339dArrMo8445d = mo8445d();
                    this.f14495g = abstractC4339dArrMo8445d;
                } else if (this.f14496h >= abstractC4339dArrMo8445d.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC4339dArrMo8445d, abstractC4339dArrMo8445d.length * 2);
                    this.f14495g = (AbstractC4339d[]) objArrCopyOf;
                    abstractC4339dArrMo8445d = (AbstractC4339d[]) objArrCopyOf;
                }
                int i9 = this.f14497i;
                do {
                    abstractC4339dMo8444c = abstractC4339dArrMo8445d[i9];
                    if (abstractC4339dMo8444c == null) {
                        abstractC4339dMo8444c = mo8444c();
                        abstractC4339dArrMo8445d[i9] = abstractC4339dMo8444c;
                    }
                    i9++;
                    if (i9 >= abstractC4339dArrMo8445d.length) {
                        i9 = 0;
                    }
                } while (!abstractC4339dMo8444c.mo8447a(this));
                this.f14497i = i9;
                this.f14496h++;
                c4351p = this.f14498j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (c4351p != null) {
            c4351p.m8797v(1);
        }
        return abstractC4339dMo8444c;
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC4339d mo8444c();

    /* JADX INFO: renamed from: d */
    public abstract AbstractC4339d[] mo8445d();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m8791f(AbstractC4339d abstractC4339d) {
        C4351p c4351p;
        int i9;
        InterfaceC5557c[] interfaceC5557cArrMo8448b;
        synchronized (this) {
            try {
                int i10 = this.f14496h - 1;
                this.f14496h = i10;
                c4351p = this.f14498j;
                if (i10 == 0) {
                    this.f14497i = 0;
                }
                abstractC4339d.getClass();
                interfaceC5557cArrMo8448b = abstractC4339d.mo8448b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (InterfaceC5557c interfaceC5557c : interfaceC5557cArrMo8448b) {
            if (interfaceC5557c != null) {
                interfaceC5557c.resumeWith(C3967n.f12976a);
            }
        }
        if (c4351p != null) {
            c4351p.m8797v(-1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final C4351p m8792g() {
        C4351p c4351p;
        synchronized (this) {
            c4351p = this.f14498j;
            if (c4351p == null) {
                int i9 = this.f14496h;
                c4351p = new C4351p(1, Integer.MAX_VALUE, EnumC3969a.f12980h);
                c4351p.m8457p(Integer.valueOf(i9));
                this.f14498j = c4351p;
            }
        }
        return c4351p;
    }
}
