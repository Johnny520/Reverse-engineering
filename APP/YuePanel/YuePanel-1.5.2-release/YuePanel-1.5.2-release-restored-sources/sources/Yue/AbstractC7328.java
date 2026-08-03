package Yue;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۡۨۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7147
@InterfaceC7470(version = "1.3")
public abstract class AbstractC7328<T> {
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public abstract Object mo3574(T t, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199);

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final Object m3575(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objMo22861 = mo22861(interfaceC7326.iterator(), interfaceC4199);
        return objMo22861 == C5508.m17142() ? objMo22861 : C8107.f3222;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final Object m22866(@InterfaceC6399 Iterable<? extends T> iterable, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199) {
        Object objMo22861;
        return (!((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) && (objMo22861 = mo22861(iterable.iterator(), interfaceC4199)) == C5508.m17142()) ? objMo22861 : C8107.f3222;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public abstract Object mo22861(@InterfaceC6399 Iterator<? extends T> it, @InterfaceC6399 InterfaceC4199<? super C8107> interfaceC4199);
}
