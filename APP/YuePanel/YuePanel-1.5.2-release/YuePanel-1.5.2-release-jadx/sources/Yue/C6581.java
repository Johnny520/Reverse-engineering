package Yue;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۣۡۤۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6581 {
    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ */
    public static final <T> InterfaceC7326<T> m3035(@InterfaceC6399 Optional<? extends T> optional) {
        C5499.m17103(optional, "<this>");
        return optional.isPresent() ? C7332.m22881(optional.get()) : C7332.m22871();
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final <T> T m3036(@InterfaceC6399 Optional<? extends T> optional, T t) {
        C5499.m17103(optional, "<this>");
        return optional.isPresent() ? optional.get() : t;
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final <T> T m20896(@InterfaceC6399 Optional<? extends T> optional, @InterfaceC6399 InterfaceC5122<? extends T> interfaceC5122) {
        C5499.m17103(optional, "<this>");
        C5499.m17103(interfaceC5122, "defaultValue");
        return optional.isPresent() ? optional.get() : interfaceC5122.invoke();
    }

    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.8")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final <T> T m20897(@InterfaceC6399 Optional<T> optional) {
        C5499.m17103(optional, "<this>");
        return optional.orElse(null);
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final <T, C extends Collection<? super T>> C m20898(@InterfaceC6399 Optional<T> optional, @InterfaceC6399 C c) {
        C5499.m17103(optional, "<this>");
        C5499.m17103(c, "destination");
        if (optional.isPresent()) {
            T t = optional.get();
            C5499.m17102(t, "get()");
            c.add(t);
        }
        return c;
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final <T> List<T> m20899(@InterfaceC6399 Optional<? extends T> optional) {
        C5499.m17103(optional, "<this>");
        return optional.isPresent() ? C3879.m10715(optional.get()) : C3880.m10735();
    }

    @InterfaceC6399
    @InterfaceC8405(markerClass = {InterfaceC4772.class})
    @InterfaceC7470(version = "1.8")
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final <T> Set<T> m20900(@InterfaceC6399 Optional<? extends T> optional) {
        C5499.m17103(optional, "<this>");
        return optional.isPresent() ? C7386.m23120(optional.get()) : C7387.m23125();
    }
}
