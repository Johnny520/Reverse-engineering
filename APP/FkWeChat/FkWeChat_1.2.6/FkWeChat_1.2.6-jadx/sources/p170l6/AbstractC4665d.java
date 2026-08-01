package p170l6;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1052o0;
import p098g9.InterfaceC2549c;
import p170l6.C4663b;
import p170l6.C4675n;
import p172l8.AbstractC4706m;
import p172l8.EnumC4708o;
import p172l8.InterfaceC4705l;
import p300uc.C8658l;
import p300uc.InterfaceC8647b;
import p300uc.InterfaceC8660n;
import p329wc.InterfaceC9218f;
import p345xc.InterfaceC9486d;
import p361yc.AbstractC9769u2;

/* JADX INFO: renamed from: l6.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8660n
@Metadata(m16757d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, m16758d2 = {"Ll6/d;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", _UrlKt.FRAGMENT_ENCODE_SET, "seen0", "Lyc/u2;", "serializationConstructorMarker", "(ILyc/u2;)V", "self", "Lxc/d;", "output", "Lwc/f;", "serialDesc", "Ll8/i0;", "e", "(Ll6/d;Lxc/d;Lwc/f;)V", "Ll6/o;", "d", "()Ll6/o;", "location", "Companion", "a", "Ll6/b;", "Ll6/n;", "highlights"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public abstract class AbstractC4665d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4705l f13833a = AbstractC4706m.m18788b(EnumC4708o.f13922r, new InterfaceC0173a() { // from class: l6.c
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC4665d.m18639b();
        }
    });

    public /* synthetic */ AbstractC4665d(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ InterfaceC8647b m18639b() {
        return new C8658l("dev.snipme.highlights.model.CodeHighlight", AbstractC1052o0.m3807b(AbstractC4665d.class), new InterfaceC2549c[]{AbstractC1052o0.m3807b(C4663b.class), AbstractC1052o0.m3807b(C4675n.class)}, new InterfaceC8647b[]{C4663b.a.f13832a, C4675n.a.f13847a}, new Annotation[0]);
    }

    /* JADX INFO: renamed from: d */
    public abstract C4676o mo18635d();

    /* JADX INFO: renamed from: l6.d$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public Companion() {
        }

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8647b m18642a() {
            return (InterfaceC8647b) AbstractC4665d.f13833a.getValue();
        }

        public final InterfaceC8647b serializer() {
            return m18642a();
        }

        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }
    }

    public AbstractC4665d() {
    }

    public /* synthetic */ AbstractC4665d(int i10, AbstractC9769u2 abstractC9769u2) {
    }

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ void m18641e(AbstractC4665d self, InterfaceC9486d output, InterfaceC9218f serialDesc) {
    }
}
