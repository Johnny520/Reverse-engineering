package Yue;

import android.annotation.SuppressLint;
import java.util.Objects;

/* JADX INFO: renamed from: Yue.ۥۡۤۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public interface InterfaceC6749<T> {
    @SuppressLint({"MissingNullability"})
    static <T> InterfaceC6749<T> isEqual(@SuppressLint({"MissingNullability"}) final Object obj) {
        return obj == null ? new InterfaceC6749() { // from class: Yue.ۥۣۡۤۧ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj2) {
                return Objects.isNull(obj2);
            }
        } : new InterfaceC6749() { // from class: Yue.ۥۡۤۧۤ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }

    @SuppressLint({"MissingNullability"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    static <T> InterfaceC6749<T> m21432(@SuppressLint({"MissingNullability"}) InterfaceC6749<? super T> interfaceC6749) {
        Objects.requireNonNull(interfaceC6749);
        return interfaceC6749.negate();
    }

    @SuppressLint({"MissingNullability"})
    default InterfaceC6749<T> negate() {
        return new InterfaceC6749() { // from class: Yue.ۥۡۤۧۦ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return this.f2274.m21438(obj);
            }
        };
    }

    boolean test(T t);

    @SuppressLint({"MissingNullability"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    default InterfaceC6749<T> m21437(@SuppressLint({"MissingNullability"}) final InterfaceC6749<? super T> interfaceC6749) {
        Objects.requireNonNull(interfaceC6749);
        return new InterfaceC6749() { // from class: Yue.ۥۡۤۧۢ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return this.f2269.m21439(interfaceC6749, obj);
            }
        };
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    /* synthetic */ default boolean m21438(Object obj) {
        return !test(obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    /* synthetic */ default boolean m21439(InterfaceC6749 interfaceC6749, Object obj) {
        return test(obj) || interfaceC6749.test(obj);
    }

    @SuppressLint({"MissingNullability"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    default InterfaceC6749<T> m21440(@SuppressLint({"MissingNullability"}) final InterfaceC6749<? super T> interfaceC6749) {
        Objects.requireNonNull(interfaceC6749);
        return new InterfaceC6749() { // from class: Yue.ۥۡۤۧۥ
            @Override // Yue.InterfaceC6749
            public final boolean test(Object obj) {
                return this.f2272.m21441(interfaceC6749, obj);
            }
        };
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    /* synthetic */ default boolean m21441(InterfaceC6749 interfaceC6749, Object obj) {
        return test(obj) && interfaceC6749.test(obj);
    }
}
