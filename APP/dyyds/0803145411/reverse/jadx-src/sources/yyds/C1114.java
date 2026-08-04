package yyds;

import android.graphics.Bitmap;
import android.util.Base64;
import java.util.UUID;

/* JADX INFO: renamed from: yyds.ᛵᛶᛵᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1114 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f5130;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f5131;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1114(String str, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f5131 = i;
        this.f5130 = str;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        Bitmap bitmap;
        Object c2658;
        byte[] bArrDecode;
        int length;
        switch (this.f5131) {
            case 0:
                AbstractC1544.m3189(obj);
                C1509.f7142.getClass();
                String strM3113 = C1509.m3113();
                C1082 c1082 = C1082.f4981;
                boolean z = true;
                if (AbstractC0473.m1313(strM3113) || strM3113.length() > 2700000) {
                    bitmap = null;
                } else {
                    try {
                        bArrDecode = Base64.decode(strM3113, 2);
                        length = bArrDecode.length;
                    } catch (Throwable th) {
                        c2658 = new C2658(th);
                    }
                    if (1 > length || length >= 2000001) {
                        throw new IllegalArgumentException(AbstractC2328.m4341(-562189317079918L).toString());
                    }
                    c2658 = C1082.m2287(bArrDecode);
                    if (c2658 instanceof C2658) {
                        c2658 = null;
                    }
                    bitmap = (Bitmap) c2658;
                }
                Object obj2 = C1082.f4982;
                String str = this.f5130;
                synchronized (obj2) {
                    try {
                        C1509.f7142.getClass();
                        if (!AbstractC1544.m3188((String) C1509.f7120.m1579(C1509.f7179[34]), str) || !AbstractC1544.m3188(C1509.m3113(), strM3113)) {
                            z = false;
                        } else if (AbstractC0473.m1313(strM3113) || bitmap != null) {
                            C1082.f4986 = new C1816(bitmap, str);
                        } else {
                            C1509.m3077(AbstractC2328.m4341(-680897918174062L));
                            C1082 c10822 = C1082.f4981;
                            String string = UUID.randomUUID().toString();
                            AbstractC2328.m4341(-562782022566766L);
                            C1509.m3093(string);
                            C1082.f4986 = new C1816(null, string);
                        }
                        if (AbstractC1544.m3188(C1082.f4980, str)) {
                            C1082.f4980 = null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                if (z) {
                    C1082 c10823 = C1082.f4981;
                    C1082.m2291();
                }
                return C2746.f13459;
            default:
                AbstractC1544.m3189(obj);
                AbstractC1960.m3789(this.f5130);
                return C2746.f13459;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f5131;
        String str = this.f5130;
        switch (i) {
            case 0:
                return new C1114(str, interfaceC0274, 0);
            default:
                return new C1114(str, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Throwable {
        int i = this.f5131;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                ((C1114) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
            default:
                ((C1114) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                break;
        }
        return c2746;
    }
}
