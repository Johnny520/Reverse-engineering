package p223p0;

import be.AbstractC0283h;
import bsh.C0353j;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import java.util.ConcurrentModificationException;
import p266s0.C3877g;

/* JADX INFO: renamed from: p0.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C3276d extends AbstractC3275c {

    /* JADX INFO: renamed from: j */
    public final C3877g f10429j;

    /* JADX INFO: renamed from: k */
    public Object f10430k;

    /* JADX INFO: renamed from: l */
    public boolean f10431l;

    /* JADX INFO: renamed from: m */
    public int f10432m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3276d(C3877g c3877g, AbstractC3283k[] abstractC3283kArr) {
        super(c3877g.f12728h, abstractC3283kArr);
        this.f10429j = c3877g;
        this.f10432m = c3877g.f12730j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m6941d(int i9, C3282j c3282j, Object obj, int i10) {
        int i11 = i10 * 5;
        AbstractC3283k[] abstractC3283kArr = this.f10426g;
        if (i11 <= 30) {
            int iM1122B = 1 << AbstractC0283h.m1122B(i9, i11);
            if (c3282j.m6951h(iM1122B)) {
                abstractC3283kArr[i10].m6967a(c3282j.f10443d, Integer.bitCount(c3282j.f10440a) * 2, c3282j.m6949f(iM1122B));
                this.f10427h = i10;
                return;
            } else {
                int iM6962t = c3282j.m6962t(iM1122B);
                C3282j c3282jM6961s = c3282j.m6961s(iM6962t);
                abstractC3283kArr[i10].m6967a(c3282j.f10443d, Integer.bitCount(c3282j.f10440a) * 2, iM6962t);
                m6941d(i9, c3282jM6961s, obj, i10 + 1);
                return;
            }
        }
        AbstractC3283k abstractC3283k = abstractC3283kArr[i10];
        Object[] objArr = c3282j.f10443d;
        abstractC3283k.m6967a(objArr, objArr.length, 0);
        while (true) {
            AbstractC3283k abstractC3283k2 = abstractC3283kArr[i10];
            if (AbstractC1416l.m3825a(abstractC3283k2.f10444g[abstractC3283k2.f10446i], obj)) {
                this.f10427h = i10;
                return;
            } else {
                abstractC3283kArr[i10].f10446i += 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p223p0.AbstractC3275c, java.util.Iterator
    public final Object next() {
        if (this.f10429j.f12730j != this.f10432m) {
            throw new ConcurrentModificationException();
        }
        if (!this.f10428i) {
            C0353j.m1307e();
            return null;
        }
        AbstractC3283k abstractC3283k = this.f10426g[this.f10427h];
        this.f10430k = abstractC3283k.f10444g[abstractC3283k.f10446i];
        this.f10431l = true;
        return super.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p223p0.AbstractC3275c, java.util.Iterator
    public final void remove() {
        if (!this.f10431l) {
            throw new IllegalStateException();
        }
        boolean z9 = this.f10428i;
        C3877g c3877g = this.f10429j;
        if (!z9) {
            AbstractC1428x.m3837b(c3877g).remove(this.f10430k);
        } else {
            if (!z9) {
                C0353j.m1307e();
                return;
            }
            AbstractC3283k abstractC3283k = this.f10426g[this.f10427h];
            Object obj = abstractC3283k.f10444g[abstractC3283k.f10446i];
            AbstractC1428x.m3837b(c3877g).remove(this.f10430k);
            m6941d(obj != null ? obj.hashCode() : 0, c3877g.f12728h, obj, 0);
        }
        this.f10430k = null;
        this.f10431l = false;
        this.f10432m = c3877g.f12730j;
    }
}
