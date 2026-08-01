package p157k8;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p361yc.C9785y1;

/* JADX INFO: renamed from: k8.k1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00078\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, m16758d2 = {"Lk8/k1;", "Lk8/m1;", "<init>", "()V", "Luc/b;", "serializer", "()Luc/b;", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getJsonrpc", "jsonrpc", "kotlin-sdk-core"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class C4093k1 implements InterfaceC4107m1 {
    public static final C4093k1 INSTANCE = new C4093k1();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String jsonrpc = "2.0";

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC4705l f11996b = AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: k8.j1
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return C4093k1.m16270b();
        }
    });

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC8647b m16270b() {
        return new C9785y1("io.modelcontextprotocol.kotlin.sdk.types.JSONRPCEmptyMessage", INSTANCE, new Annotation[0]);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC8647b m16271c() {
        return (InterfaceC8647b) f11996b.getValue();
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof C4093k1);
    }

    public int hashCode() {
        return 1096955593;
    }

    public final InterfaceC8647b serializer() {
        return m16271c();
    }

    public String toString() {
        return "JSONRPCEmptyMessage";
    }
}
