package yyds;

import android.content.Context;
import com.p000ss.android.ugc.awemes.WardDatabase;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: yyds.ᛳᲀᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0691 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f3272;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f3273;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3274;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3275 = 1;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public /* synthetic */ Object f3276;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final /* synthetic */ Object f3277;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public Object f3278;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691(String str, Aweme aweme, Comment comment, Context context, boolean z, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f3278 = str;
        this.f3276 = aweme;
        this.f3277 = comment;
        this.f3273 = context;
        this.f3274 = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo474(Object obj) throws Throwable {
        Object objMo2546;
        InterfaceC2684 interfaceC2684;
        EnumC2065 enumC2065;
        EnumC2065 enumC20652;
        InterfaceC2684 interfaceC26842;
        InterfaceC2684 interfaceC26843;
        Object objMo2547;
        Object objMo25462;
        Object obj2;
        Object objM2624;
        int i = this.f3275;
        Object obj3 = C2746.f13459;
        Object obj4 = this.f3277;
        EnumC1765 enumC1765 = EnumC1765.f8858;
        Object obj5 = this.f3273;
        switch (i) {
            case 0:
                InterfaceC1549 interfaceC1549 = (InterfaceC1549) obj5;
                WardDatabase wardDatabase = (WardDatabase) obj4;
                int i2 = this.f3272;
                if (i2 == 0) {
                    AbstractC1544.m3189(obj);
                    InterfaceC2684 interfaceC26844 = (InterfaceC2684) this.f3276;
                    if (!this.f3274) {
                        return interfaceC1549.mo371(((InterfaceC1851) interfaceC26844).mo885());
                    }
                    this.f3276 = interfaceC26844;
                    EnumC2065 enumC20653 = EnumC2065.f10217;
                    this.f3278 = enumC20653;
                    this.f3272 = 1;
                    objMo2546 = interfaceC26844.mo2546(this);
                    if (objMo2546 == enumC1765) {
                        return enumC1765;
                    }
                    interfaceC2684 = interfaceC26844;
                    enumC2065 = enumC20653;
                } else if (i2 == 1) {
                    enumC2065 = (EnumC2065) this.f3278;
                    InterfaceC2684 interfaceC26845 = (InterfaceC2684) this.f3276;
                    AbstractC1544.m3189(obj);
                    interfaceC2684 = interfaceC26845;
                    objMo2546 = obj;
                } else if (i2 == 2) {
                    enumC2065 = (EnumC2065) this.f3278;
                    interfaceC26843 = (InterfaceC2684) this.f3276;
                    AbstractC1544.m3189(obj);
                    InterfaceC2684 interfaceC26846 = interfaceC26843;
                    enumC20652 = enumC2065;
                    interfaceC26842 = interfaceC26846;
                    C2186 c2186 = new C2186(null, interfaceC1549, 0);
                    this.f3276 = interfaceC26842;
                    this.f3278 = null;
                    this.f3272 = 3;
                    objMo2547 = interfaceC26842.mo2547(enumC20652, c2186, this);
                    if (objMo2547 == enumC1765) {
                        return enumC1765;
                    }
                    this.f3276 = objMo2547;
                    this.f3272 = 4;
                    objMo25462 = interfaceC26842.mo2546(this);
                    if (objMo25462 != enumC1765) {
                    }
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            C0188.m800("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj6 = this.f3276;
                        AbstractC1544.m3189(obj);
                        obj2 = obj6;
                        objMo25462 = obj;
                        if (!((Boolean) objMo25462).booleanValue()) {
                            return obj2;
                        }
                        C0522 c0522 = wardDatabase.f503;
                        C0522 c05222 = c0522 != null ? c0522 : null;
                        c05222.f2516.m1591(c05222.f2517, c05222.f2514);
                        return obj2;
                    }
                    interfaceC26842 = (InterfaceC2684) this.f3276;
                    AbstractC1544.m3189(obj);
                    objMo2547 = obj;
                    this.f3276 = objMo2547;
                    this.f3272 = 4;
                    objMo25462 = interfaceC26842.mo2546(this);
                    if (objMo25462 != enumC1765) {
                        return enumC1765;
                    }
                    obj2 = objMo2547;
                    if (!((Boolean) objMo25462).booleanValue()) {
                    }
                }
                if (((Boolean) objMo2546).booleanValue()) {
                    enumC20652 = enumC2065;
                    interfaceC26842 = interfaceC2684;
                    C2186 c21862 = new C2186(null, interfaceC1549, 0);
                    this.f3276 = interfaceC26842;
                    this.f3278 = null;
                    this.f3272 = 3;
                    objMo2547 = interfaceC26842.mo2547(enumC20652, c21862, this);
                    if (objMo2547 == enumC1765) {
                    }
                    this.f3276 = objMo2547;
                    this.f3272 = 4;
                    objMo25462 = interfaceC26842.mo2546(this);
                    if (objMo25462 != enumC1765) {
                    }
                } else {
                    C0522 c05223 = wardDatabase.f503;
                    if (c05223 == null) {
                        c05223 = null;
                    }
                    this.f3276 = interfaceC2684;
                    this.f3278 = enumC2065;
                    this.f3272 = 2;
                    Object objM1592 = c05223.f2516.m1592(this);
                    if (objM1592 == enumC1765) {
                        obj3 = objM1592;
                    }
                    if (obj3 == enumC1765) {
                        return enumC1765;
                    }
                    interfaceC26843 = interfaceC2684;
                    InterfaceC2684 interfaceC268462 = interfaceC26843;
                    enumC20652 = enumC2065;
                    interfaceC26842 = interfaceC268462;
                    C2186 c218622 = new C2186(null, interfaceC1549, 0);
                    this.f3276 = interfaceC26842;
                    this.f3278 = null;
                    this.f3272 = 3;
                    objMo2547 = interfaceC26842.mo2547(enumC20652, c218622, this);
                    if (objMo2547 == enumC1765) {
                    }
                    this.f3276 = objMo2547;
                    this.f3272 = 4;
                    objMo25462 = interfaceC26842.mo2546(this);
                    if (objMo25462 != enumC1765) {
                    }
                }
                break;
            default:
                Context context = (Context) obj5;
                int i3 = this.f3272;
                try {
                    if (i3 == 0) {
                        AbstractC1544.m3189(obj);
                        boolean z = this.f3274;
                        this.f3272 = 1;
                        objM2624 = C1327.f6093.m2624((String) this.f3278, (Aweme) this.f3276, (Comment) obj4, null, (Context) obj5, true, z, this);
                        if (objM2624 == enumC1765) {
                            return enumC1765;
                        }
                    } else {
                        if (i3 != 1) {
                            C0188.m800(AbstractC2328.m4341(-584772255122286L));
                            return null;
                        }
                        AbstractC1544.m3189(obj);
                        objM2624 = obj;
                    }
                    C2270 c2270 = (C2270) objM2624;
                    Object obj7 = c2270.f11190;
                    Object obj8 = c2270.f11191;
                    if (((Boolean) obj7).booleanValue()) {
                        C1327 c1327 = C1327.f6093;
                        C1327.m2617(context, (String) c2270.f11189);
                        AbstractC1960.m3789(AbstractC2328.m4341(-584651996037998L));
                    } else if (!AbstractC1544.m3188(obj8, AbstractC2328.m4341(-584673470874478L))) {
                        AbstractC1960.m3789(AbstractC2328.m4341(-584690650743662L) + ((String) obj8));
                    }
                } catch (Exception e) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-584720715514734L), e);
                    AbstractC1960.m3789(AbstractC2328.m4341(-584742190351214L) + e.getMessage());
                }
                C1327 c13272 = C1327.f6093;
                C1327.m2618(context);
                return obj3;
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f3275;
        Object obj2 = this.f3273;
        Object obj3 = this.f3277;
        switch (i) {
            case 0:
                C0691 c0691 = new C0691(this.f3274, (WardDatabase) obj3, interfaceC0274, (InterfaceC1549) obj2);
                c0691.f3276 = obj;
                return c0691;
            default:
                return new C0691((String) this.f3278, (Aweme) this.f3276, (Comment) obj3, (Context) obj2, this.f3274, interfaceC0274);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        int i = this.f3275;
        C2746 c2746 = C2746.f13459;
        switch (i) {
            case 0:
                return ((C0691) mo630((InterfaceC2684) obj, (InterfaceC0274) obj2)).mo474(c2746);
            default:
                return ((C0691) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(c2746);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0691(boolean z, WardDatabase wardDatabase, InterfaceC0274 interfaceC0274, InterfaceC1549 interfaceC1549) {
        super(2, interfaceC0274);
        this.f3274 = z;
        this.f3277 = wardDatabase;
        this.f3273 = interfaceC1549;
    }
}
