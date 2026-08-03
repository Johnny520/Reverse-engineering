package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2985<T> implements Iterator<T>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public EnumC7587 f4326 = EnumC7587.f22944;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public T f4327;

    /* JADX INFO: renamed from: Yue.ۥ۟۟ۡۡ$ۥ */
    public /* synthetic */ class C0014 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f24;

        static {
            int[] iArr = new int[EnumC7587.values().length];
            try {
                iArr[EnumC7587.f22945.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC7587.f22943.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f24 = iArr;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        EnumC7587 enumC7587 = this.f4326;
        if (enumC7587 == EnumC7587.f22946) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i = C0014.f24[enumC7587.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2) {
            return m5790();
        }
        return true;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4326 = EnumC7587.f22944;
        return this.f4327;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract void mo49();

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m50() {
        this.f4326 = EnumC7587.f22945;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m5789(T t) {
        this.f4327 = t;
        this.f4326 = EnumC7587.f22943;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final boolean m5790() {
        this.f4326 = EnumC7587.f22946;
        mo49();
        return this.f4326 == EnumC7587.f22943;
    }
}
