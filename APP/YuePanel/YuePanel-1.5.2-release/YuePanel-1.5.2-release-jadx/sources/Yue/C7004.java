package Yue;

import Yue.InterfaceC3854;
import android.annotation.SuppressLint;
import android.util.Range;

/* JADX INFO: renamed from: Yue.ۥۡۥۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class C7004 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: Yue.ۥۡۥۨۧ$ۥ */
    public static final class C1137<T> implements InterfaceC3854<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Range<T> f21149;

        public C1137(Range<T> range) {
            this.f21149 = range;
        }

        @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
        public boolean isEmpty() {
            return InterfaceC3854.C0274.m909(this);
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)Z */
        @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
        /* JADX INFO: renamed from: ۥ */
        public boolean mo829(@InterfaceC6399 Comparable comparable) {
            return InterfaceC3854.C0274.m908(this, comparable);
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // Yue.InterfaceC3854, Yue.InterfaceC6571
        /* JADX INFO: renamed from: ۥ۟ */
        public Comparable mo830() {
            return this.f21149.getLower();
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // Yue.InterfaceC3854
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public Comparable mo10384() {
            return this.f21149.getUpper();
        }
    }

    @InterfaceC6399
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ */
    public static final <T extends Comparable<? super T>> Range<T> m3311(@InterfaceC6399 Range<T> range, @InterfaceC6399 Range<T> range2) {
        return range.intersect(range2);
    }

    @InterfaceC6399
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T extends Comparable<? super T>> Range<T> m3312(@InterfaceC6399 Range<T> range, @InterfaceC6399 Range<T> range2) {
        return range.extend(range2);
    }

    @InterfaceC6399
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> Range<T> m21639(@InterfaceC6399 Range<T> range, @InterfaceC6399 T t) {
        return range.extend(t);
    }

    @InterfaceC6399
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> Range<T> m21640(@InterfaceC6399 T t, @InterfaceC6399 T t2) {
        return new Range<>(t, t2);
    }

    @InterfaceC6399
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> InterfaceC3854<T> m21641(@InterfaceC6399 Range<T> range) {
        return new C1137(range);
    }

    @InterfaceC6399
    @InterfaceC7113(21)
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T extends Comparable<? super T>> Range<T> m21642(@InterfaceC6399 InterfaceC3854<T> interfaceC3854) {
        return new Range<>(interfaceC3854.mo830(), interfaceC3854.mo10384());
    }
}
