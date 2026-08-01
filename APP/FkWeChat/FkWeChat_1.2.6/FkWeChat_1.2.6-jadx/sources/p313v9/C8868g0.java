package p313v9;

import java.lang.annotation.Annotation;
import java.util.List;
import okhttp3.internal.url._UrlKt;
import p081fa.InterfaceC2372b0;
import p213oa.C5692c;
import p213oa.C5695f;

/* JADX INFO: renamed from: v9.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8868g0 extends AbstractC8883u implements InterfaceC2372b0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC8864e0 f29437a;

    /* JADX INFO: renamed from: b */
    public final Annotation[] f29438b;

    /* JADX INFO: renamed from: c */
    public final String f29439c;

    /* JADX INFO: renamed from: d */
    public final boolean f29440d;

    public C8868g0(AbstractC8864e0 abstractC8864e0, Annotation[] annotationArr, String str, boolean z10) {
        abstractC8864e0.getClass();
        annotationArr.getClass();
        this.f29437a = abstractC8864e0;
        this.f29438b = annotationArr;
        this.f29439c = str;
        this.f29440d = z10;
    }

    @Override // p081fa.InterfaceC2372b0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public AbstractC8864e0 getType() {
        return this.f29437a;
    }

    @Override // p081fa.InterfaceC2372b0
    /* JADX INFO: renamed from: a */
    public boolean mo8599a() {
        return this.f29440d;
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: b */
    public C8867g mo8603b(C5692c c5692c) {
        c5692c.getClass();
        return AbstractC8873k.m34045a(this.f29438b, c5692c);
    }

    @Override // p081fa.InterfaceC2375d
    public List getAnnotations() {
        return AbstractC8873k.m34046b(this.f29438b);
    }

    @Override // p081fa.InterfaceC2372b0
    public C5695f getName() {
        String str = this.f29439c;
        if (str != null) {
            return C5695f.m23026i(str);
        }
        return null;
    }

    @Override // p081fa.InterfaceC2375d
    /* JADX INFO: renamed from: k */
    public boolean mo8604k() {
        return false;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C8868g0.class.getName());
        sb2.append(": ");
        sb2.append(mo8599a() ? "vararg " : _UrlKt.FRAGMENT_ENCODE_SET);
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }
}
