package p223p0;

import bsh.C0353j;
import java.util.Iterator;
import p114hg.InterfaceC1711a;

/* JADX INFO: renamed from: p0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3275c implements Iterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final AbstractC3283k[] f10426g;

    /* JADX INFO: renamed from: h */
    public int f10427h;

    /* JADX INFO: renamed from: i */
    public boolean f10428i = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3275c(C3282j c3282j, AbstractC3283k[] abstractC3283kArr) {
        this.f10426g = abstractC3283kArr;
        abstractC3283kArr[0].m6967a(c3282j.f10443d, Integer.bitCount(c3282j.f10440a) * 2, 0);
        this.f10427h = 0;
        m6939a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m6939a() {
        int i9 = this.f10427h;
        AbstractC3283k[] abstractC3283kArr = this.f10426g;
        AbstractC3283k abstractC3283k = abstractC3283kArr[i9];
        if (abstractC3283k.f10446i < abstractC3283k.f10445h) {
            return;
        }
        while (-1 < i9) {
            int iM6940c = m6940c(i9);
            if (iM6940c == -1) {
                AbstractC3283k abstractC3283k2 = abstractC3283kArr[i9];
                int i10 = abstractC3283k2.f10446i;
                Object[] objArr = abstractC3283k2.f10444g;
                if (i10 < objArr.length) {
                    int length = objArr.length;
                    abstractC3283k2.f10446i = i10 + 1;
                    iM6940c = m6940c(i9);
                }
            }
            if (iM6940c != -1) {
                this.f10427h = iM6940c;
                return;
            }
            if (i9 > 0) {
                AbstractC3283k abstractC3283k3 = abstractC3283kArr[i9 - 1];
                int i11 = abstractC3283k3.f10446i;
                int length2 = abstractC3283k3.f10444g.length;
                abstractC3283k3.f10446i = i11 + 1;
            }
            abstractC3283kArr[i9].m6967a(C3282j.f10439e.f10443d, 0, 0);
            i9--;
        }
        this.f10428i = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m6940c(int i9) {
        AbstractC3283k[] abstractC3283kArr = this.f10426g;
        AbstractC3283k abstractC3283k = abstractC3283kArr[i9];
        int i10 = abstractC3283k.f10446i;
        if (i10 < abstractC3283k.f10445h) {
            return i9;
        }
        Object[] objArr = abstractC3283k.f10444g;
        if (i10 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i10];
        obj.getClass();
        C3282j c3282j = (C3282j) obj;
        if (i9 == 6) {
            AbstractC3283k abstractC3283k2 = abstractC3283kArr[i9 + 1];
            Object[] objArr2 = c3282j.f10443d;
            abstractC3283k2.m6967a(objArr2, objArr2.length, 0);
        } else {
            abstractC3283kArr[i9 + 1].m6967a(c3282j.f10443d, Integer.bitCount(c3282j.f10440a) * 2, 0);
        }
        return m6940c(i9 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f10428i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public Object next() {
        if (!this.f10428i) {
            C0353j.m1307e();
            return null;
        }
        Object next = this.f10426g[this.f10427h].next();
        m6939a();
        return next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
