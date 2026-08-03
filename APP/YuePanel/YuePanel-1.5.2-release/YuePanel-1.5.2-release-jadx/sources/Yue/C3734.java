package Yue;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3734 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final String f497 = "Channel was closed";

    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m810(@InterfaceC6399 InterfaceC7042<?> interfaceC7042, @InterfaceC6489 Throwable th) {
        C3736.m813(interfaceC7042, th);
    }

    @InterfaceC6501
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <E, R> R m10213(@InterfaceC6399 InterfaceC3592<E> interfaceC3592, @InterfaceC6399 InterfaceC5124<? super InterfaceC7042<? extends E>, ? extends R> interfaceC5124) {
        return (R) C3736.m814(interfaceC3592, interfaceC5124);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <E, R> R m10214(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC5124<? super InterfaceC7042<? extends E>, ? extends R> interfaceC5124) {
        return (R) C3736.m10281(interfaceC7042, interfaceC5124);
    }

    @InterfaceC6489
    @InterfaceC6501
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <E> Object m10215(@InterfaceC6399 InterfaceC3592<E> interfaceC3592, @InterfaceC6399 InterfaceC5124<? super E, C8107> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return C3736.m10282(interfaceC3592, interfaceC5124, interfaceC4199);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <E> Object m10216(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC5124<? super E, C8107> interfaceC5124, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        return C3736.m10283(interfaceC7042, interfaceC5124, interfaceC4199);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final InterfaceC5124<Throwable, C8107> m10217(@InterfaceC6399 InterfaceC7042<?> interfaceC7042) {
        return C3738.m816(interfaceC7042);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final InterfaceC5124<Throwable, C8107> m10218(@InterfaceC6399 InterfaceC7042<?>... interfaceC7042Arr) {
        return C3738.m10289(interfaceC7042Arr);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final <E, K> InterfaceC7042<E> m10221(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5138<? super E, ? super InterfaceC4199<? super K>, ? extends Object> interfaceC5138) {
        return C3738.m10292(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final <E> InterfaceC7042<E> m10229(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5138<? super E, ? super InterfaceC4199<? super Boolean>, ? extends Object> interfaceC5138) {
        return C3738.m10300(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final <E> InterfaceC7042<E> m10235(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042) {
        return C3738.m10306(interfaceC7042);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final <E, R> InterfaceC7042<R> m10246(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5138<? super E, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5138) {
        return C3738.m10317(interfaceC7042, interfaceC4225, interfaceC5138);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final <E, R> InterfaceC7042<R> m10248(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5140<? super Integer, ? super E, ? super InterfaceC4199<? super R>, ? extends Object> interfaceC5140) {
        return C3738.m10319(interfaceC7042, interfaceC4225, interfaceC5140);
    }

    @InterfaceC6399
    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'onReceiveCatching'")
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final <E> InterfaceC7287<E> m10257(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042) {
        return C3736.m10286(interfaceC7042);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @InterfaceC7097(expression = "receiveCatching().getOrNull()", imports = {}))
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final <E> Object m10258(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4199<? super E> interfaceC4199) {
        return C3736.m10287(interfaceC7042, interfaceC4199);
    }

    @InterfaceC4372(level = EnumC0393.f8971, message = "Deprecated in the favour of 'trySendBlocking'. Consider handling the result of 'trySendBlocking' explicitly and rethrow exception if necessary", replaceWith = @InterfaceC7097(expression = "trySendBlocking(element)", imports = {}))
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final <E> void m10260(@InterfaceC6399 InterfaceC7317<? super E> interfaceC7317, E e) throws InterruptedException {
        C3735.m811(interfaceC7317, e);
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final <E, C extends InterfaceC7317<? super E>> Object m10267(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC4199<? super C> interfaceC4199) {
        return C3738.m10335(interfaceC7042, c, interfaceC4199);
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final <E, C extends Collection<? super E>> Object m10268(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 C c, @InterfaceC6399 InterfaceC4199<? super C> interfaceC4199) {
        return C3738.m10336(interfaceC7042, c, interfaceC4199);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final <E> Object m10269(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4199<? super List<? extends E>> interfaceC4199) {
        return C3736.m10288(interfaceC7042, interfaceC4199);
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final <K, V, M extends Map<? super K, ? super V>> Object m10271(@InterfaceC6399 InterfaceC7042<? extends C6599<? extends K, ? extends V>> interfaceC7042, @InterfaceC6399 M m, @InterfaceC6399 InterfaceC4199<? super M> interfaceC4199) {
        return C3738.m10338(interfaceC7042, m, interfaceC4199);
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final <E> Object m10273(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC4199<? super Set<E>> interfaceC4199) {
        return C3738.m10340(interfaceC7042, interfaceC4199);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final <E> Object m10275(@InterfaceC6399 InterfaceC7317<? super E> interfaceC7317, E e) {
        return C3735.m812(interfaceC7317, e);
    }

    @InterfaceC6399
    @InterfaceC6839
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final <E, R, V> InterfaceC7042<V> m10279(@InterfaceC6399 InterfaceC7042<? extends E> interfaceC7042, @InterfaceC6399 InterfaceC7042<? extends R> interfaceC70422, @InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 InterfaceC5138<? super E, ? super R, ? extends V> interfaceC5138) {
        return C3738.m10345(interfaceC7042, interfaceC70422, interfaceC4225, interfaceC5138);
    }
}
