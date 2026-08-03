package Yue;

import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥ۟ۥۡۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3882 extends C3881 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥ۟ۥۡۥ$ۥ */
    public static final class C0279<T> implements Iterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Enumeration<T> f7429;

        public C0279(Enumeration<T> enumeration) {
            this.f7429 = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f7429.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f7429.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static <T> Iterator<T> m10760(@InterfaceC6399 Enumeration<T> enumeration) {
        C5499.m17103(enumeration, "<this>");
        return new C0279(enumeration);
    }
}
