package com.alibaba.fastjson2.reader;

import af.C0084g;
import be.C0282g0;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import gf.C1402a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;
import p012ah.C0086a;
import p020b5.C0192k;
import p025bc.AbstractC0255e;
import p083fe.C1214a;
import p121i4.C1962c0;
import p199nd.AbstractC2963b0;
import p302ud.C4309e;
import p302ud.C4322r;
import p302ud.C4325u;
import re.C3800c;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0632k implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1969a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1970b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1971c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f1972d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0632k(ObjectReaderProvider objectReaderProvider, Annotation annotation, BeanInfo beanInfo) {
        this.f1969a = 1;
        this.f1972d = objectReaderProvider;
        this.f1970b = annotation;
        this.f1971c = beanInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1969a) {
            case 0:
                ObjectReaderProvider.lambda$getBeanInfo1xJSONPOJOBuilder$12((Annotation) this.f1970b, (BeanInfo) this.f1971c, (Class) this.f1972d, (Method) obj);
                return;
            case 1:
                ((ObjectReaderProvider) this.f1972d).lambda$getBeanInfo1x$9((Annotation) this.f1970b, (BeanInfo) this.f1971c, (Method) obj);
                return;
            case 2:
                ((ObjectWriterProvider) this.f1971c).lambda$processJSONField1x$1((Annotation) this.f1970b, (FieldInfo) this.f1972d, (Method) obj);
                return;
            case 3:
                C4325u c4325u = ((C1214a) this.f1970b).f4075a;
                C4309e c4309e = (C4309e) this.f1971c;
                C0086a c0086a = (C0086a) this.f1972d;
                AbstractC2963b0 abstractC2963b0 = (AbstractC2963b0) obj;
                C0192k c0192kMo6386O = abstractC2963b0.mo6386O();
                int i9 = c0192kMo6386O.f488b;
                C0192k c0192k = new C0192k(i9 & 7, c0192kMo6386O.f489c, 3);
                if (c0192k.m855g()) {
                    return;
                }
                int i10 = 1;
                if (c0192k.m853e() || (i9 & 7) == 0) {
                    C4309e c4309eMo6387P = abstractC2963b0.mo6387P();
                    if (c4309eMo6387P != null && c4325u.f14453s.m2215d(c4309e.m8655Z()).stream().anyMatch(new C0282g0(c4309eMo6387P, 2))) {
                        i10 = 4;
                    }
                    c0086a.m470z(abstractC2963b0, i10);
                    return;
                }
                if (!c0192k.m854f()) {
                    C0086a.m452k(String.valueOf(c0192k).concat(" is not supported"));
                    return;
                }
                C4309e c4309eMo6387P2 = abstractC2963b0.mo6387P();
                if (c4309eMo6387P2 == null || !c4325u.f14453s.m2215d(c4309e.m8655Z()).stream().anyMatch(new C0282g0(c4309eMo6387P2, 2))) {
                    c0086a.m470z(abstractC2963b0, 1);
                    return;
                }
                return;
            default:
                C1402a c1402a = (C1402a) obj;
                try {
                    C3800c.m7996m((C4325u) this.f1970b, (C4322r) this.f1971c, c1402a, (C1962c0) this.f1972d);
                    return;
                } catch (Exception e6) {
                    throw new C0084g(AbstractC0255e.m1021j("Usage info collection failed with error: ", e6.getMessage(), " at insn: ", String.valueOf(c1402a)), e6);
                }
        }
    }

    public /* synthetic */ C0632k(ObjectWriterProvider objectWriterProvider, Annotation annotation, FieldInfo fieldInfo) {
        this.f1969a = 2;
        this.f1971c = objectWriterProvider;
        this.f1970b = annotation;
        this.f1972d = fieldInfo;
    }

    public /* synthetic */ C0632k(Object obj, Object obj2, Object obj3, int i9) {
        this.f1969a = i9;
        this.f1970b = obj;
        this.f1971c = obj2;
        this.f1972d = obj3;
    }
}
