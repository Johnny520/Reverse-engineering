package p313v9;

import java.lang.annotation.Annotation;
import p024b9.AbstractC1043k;
import p081fa.InterfaceC2371b;
import p213oa.C5695f;

/* JADX INFO: renamed from: v9.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8869h implements InterfaceC2371b {

    /* JADX INFO: renamed from: b */
    public static final a f29441b = new a(null);

    /* JADX INFO: renamed from: a */
    public final C5695f f29442a;

    public AbstractC8869h(C5695f c5695f) {
        this.f29442a = c5695f;
    }

    @Override // p081fa.InterfaceC2371b
    public C5695f getName() {
        return this.f29442a;
    }

    /* JADX INFO: renamed from: v9.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC8869h m34042a(Object obj, C5695f c5695f) {
            obj.getClass();
            return AbstractC8865f.m34036l(obj.getClass()) ? new C8884v(c5695f, (Enum) obj) : obj instanceof Annotation ? new C8871i(c5695f, (Annotation) obj) : obj instanceof Object[] ? new C8874l(c5695f, (Object[]) obj) : obj instanceof Class ? new C8880r(c5695f, (Class) obj) : new C8886x(c5695f, obj);
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC8869h(C5695f c5695f, AbstractC1043k abstractC1043k) {
        this(c5695f);
    }
}
