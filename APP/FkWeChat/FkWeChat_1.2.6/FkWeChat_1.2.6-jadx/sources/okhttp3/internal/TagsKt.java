package okhttp3.internal;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p098g9.InterfaceC2549c;
import p163l.AbstractC4284d1;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a?\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m16758d2 = {_UrlKt.FRAGMENT_ENCODE_SET, "T", "Ljava/util/concurrent/atomic/AtomicReference;", "Lokhttp3/internal/Tags;", "Lg9/c;", "type", "Lkotlin/Function0;", "compute", "computeIfAbsent", "(Ljava/util/concurrent/atomic/AtomicReference;Lg9/c;La9/a;)Ljava/lang/Object;", "okhttp"}, m16759k = 2, m16760mv = {2, 2, 0}, m16762xi = 48)
public final class TagsKt {
    public static final <T> T computeIfAbsent(AtomicReference<Tags> atomicReference, InterfaceC2549c interfaceC2549c, InterfaceC0173a interfaceC0173a) {
        Tags tags;
        atomicReference.getClass();
        interfaceC2549c.getClass();
        interfaceC0173a.getClass();
        T t10 = null;
        do {
            tags = atomicReference.get();
            T t11 = (T) tags.get(interfaceC2549c);
            if (t11 != null) {
                return t11;
            }
            if (t10 == null) {
                t10 = (T) interfaceC0173a.invoke();
            }
        } while (!AbstractC4284d1.m16830a(atomicReference, tags, tags.plus(interfaceC2549c, t10)));
        return t10;
    }
}
