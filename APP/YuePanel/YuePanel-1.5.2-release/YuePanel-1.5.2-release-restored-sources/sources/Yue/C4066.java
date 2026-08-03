package Yue;

import Yue.C8336;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۤۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C4066 extends C8336.AbstractC8344 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public final List<C8336.AbstractC8344> f644;

    public C4066(int i) {
        this.f644 = new ArrayList(i);
    }

    @Override // Yue.C8336.AbstractC8344
    public void onPageScrollStateChanged(int i) {
        try {
            Iterator<C8336.AbstractC8344> it = this.f644.iterator();
            while (it.hasNext()) {
                it.next().onPageScrollStateChanged(i);
            }
        } catch (ConcurrentModificationException e) {
            m11499(e);
        }
    }

    @Override // Yue.C8336.AbstractC8344
    public void onPageScrolled(int i, float f, @InterfaceC6844 int i2) {
        try {
            Iterator<C8336.AbstractC8344> it = this.f644.iterator();
            while (it.hasNext()) {
                it.next().onPageScrolled(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            m11499(e);
        }
    }

    @Override // Yue.C8336.AbstractC8344
    public void onPageSelected(int i) {
        try {
            Iterator<C8336.AbstractC8344> it = this.f644.iterator();
            while (it.hasNext()) {
                it.next().onPageSelected(i);
            }
        } catch (ConcurrentModificationException e) {
            m11499(e);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1017(C8336.AbstractC8344 abstractC8344) {
        this.f644.add(abstractC8344);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m1018(C8336.AbstractC8344 abstractC8344) {
        this.f644.remove(abstractC8344);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m11499(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }
}
