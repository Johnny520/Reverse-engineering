package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Metadata(m16757d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0098\u0001\bF\u0012\u000e\b\u0002\u0010\u0002\u001a\u00020\u0003B\u0004\b\u0003\u0010\u0002\u0012\f\b\u0002\u0010\u0004\u001a\u00020\u0005B\u0002\b\f\u0012\u001e\b\u0002\u0010\u0006\u001a\u00020\u0005B\u0014\b\fJ\u0004\b\u0003\u0010\u0002J\u0004\b\u0003\u0010\u0000J\u0004\b\u0003\u0010\u0006\u0012\u0012\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bB\u0002\b\f\u0012\u0012\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bB\u0002\b\f\u0012\u000e\b\u0002\u0010\u000b\u001a\u00020\tB\u0004\b\b(\f\u0012\u000e\b\u0002\u0010\r\u001a\u00020\tB\u0004\b\b(\f\u0012\u000e\b\u0002\u0010\u000e\u001a\u00020\u0003B\u0004\b\u0003\u0010\u0000R\u0015\u0010\u0002\u001a\u00020\u00038\u0007X\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0004\u001a\u00020\u00058\u0007X\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u0005X\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0015\u0010\u000b\u001a\u00020\t8\u0007X\u0086\u0084\b¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\r\u001a\u00020\tX\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000e\u001a\u00020\u0003X\u0087\u0084\b¢\u0006\f\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0010¨\u0006\u001f"}, m16758d2 = {"Lkotlin/Metadata;", _UrlKt.FRAGMENT_ENCODE_SET, "kind", _UrlKt.FRAGMENT_ENCODE_SET, "metadataVersion", _UrlKt.FRAGMENT_ENCODE_SET, "bytecodeVersion", "data1", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, "data2", "extraString", _UrlKt.FRAGMENT_ENCODE_SET, "packageName", "extraInt", "k", "()I", "mv", "()[I", "bv$annotations", "()V", "bv", "d1", "()[Ljava/lang/String;", "d2", "xs", "()Ljava/lang/String;", "pn$annotations", "pn", "xi$annotations", "xi", "kotlin-stdlib"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public @interface Metadata {
    /* JADX INFO: renamed from: bv */
    int[] m16756bv() default {1, 0, 3};

    /* JADX INFO: renamed from: d1 */
    String[] m16757d1() default {};

    /* JADX INFO: renamed from: d2 */
    String[] m16758d2() default {};

    /* JADX INFO: renamed from: k */
    int m16759k() default 1;

    /* JADX INFO: renamed from: mv */
    int[] m16760mv() default {};

    /* JADX INFO: renamed from: pn */
    String m16761pn() default "";

    /* JADX INFO: renamed from: xi */
    int m16762xi() default 0;

    /* JADX INFO: renamed from: xs */
    String m16763xs() default "";
}
