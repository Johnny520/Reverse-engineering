package p095T;

import android.content.Context;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import me.dartcv.nuke.BuildConfig;
import p010B3.AbstractC0227f;
import p027E4.C0330q;
import p056K2.C0891q;
import p058L.C0943o;
import p058L.EnumC0947s;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p160f3.InterfaceC2160t;
import p178i3.EnumC2341v;

/* JADX INFO: renamed from: T.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1394w0 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4942h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f4943i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1394w0(int i5, InterfaceC1046d interfaceC1046d, int i6) {
        super(i5, interfaceC1046d);
        this.f4942h = i6;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f4942h) {
            case 0:
                return ((C1394w0) mo7n((InterfaceC1046d) obj2, (EnumC1392v0) obj)).mo8p(C0891q.f2780a);
            case BuildConfig.VERSION_CODE /* 1 */:
                return ((C1394w0) mo7n((InterfaceC1046d) obj2, (EnumC2341v) obj)).mo8p(C0891q.f2780a);
            default:
                return ((C1394w0) mo7n((InterfaceC1046d) obj2, (InterfaceC2160t) obj)).mo8p(C0891q.f2780a);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f4942h) {
            case 0:
                C1394w0 c1394w0 = new C1394w0(2, interfaceC1046d, 0);
                c1394w0.f4943i = obj;
                return c1394w0;
            case BuildConfig.VERSION_CODE /* 1 */:
                C1394w0 c1394w02 = new C1394w0(2, interfaceC1046d, 1);
                c1394w02.f4943i = obj;
                return c1394w02;
            default:
                return new C1394w0((C0943o) this.f4943i, interfaceC1046d);
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    public final Object mo8p(Object obj) {
        String str;
        switch (this.f4942h) {
            case 0:
                AbstractC1784a.m3205S(obj);
                return Boolean.valueOf(((EnumC1392v0) this.f4943i) == EnumC1392v0.f4934d);
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC1784a.m3205S(obj);
                return Boolean.valueOf(((EnumC2341v) this.f4943i) != EnumC2341v.f7630d);
            default:
                AbstractC1784a.m3205S(obj);
                C0943o c0943o = (C0943o) this.f4943i;
                Context context = c0943o.f2965b;
                EnumC0947s enumC0947s = c0943o.f2966c;
                TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
                int iOrdinal = enumC0947s.ordinal();
                if (iOrdinal == 0) {
                    str = "edittext";
                } else {
                    if (iOrdinal != 1) {
                        throw new C0330q();
                    }
                    str = "textview";
                }
                AbstractC0227f.m331C();
                TextClassifier textClassifierCreateTextClassificationSession = textClassificationManager.createTextClassificationSession(AbstractC0227f.m341i(context.getPackageName(), str).build());
                c0943o.f2969f = textClassifierCreateTextClassificationSession;
                return textClassifierCreateTextClassificationSession;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1394w0(C0943o c0943o, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f4942h = 2;
        this.f4943i = c0943o;
    }
}
