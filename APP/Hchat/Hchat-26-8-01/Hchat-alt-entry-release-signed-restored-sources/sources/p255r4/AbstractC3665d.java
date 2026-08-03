package p255r4;

import p311v4.C4450c;
import p311v4.C4451c0;
import p311v4.C4452d;
import p311v4.C4453d0;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;

/* JADX INFO: renamed from: r4.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3665d {

    /* JADX INFO: renamed from: a */
    public static final C4453d0 f11905a = C4453d0.m8902l(C4683c.m9182m("Ldalvik/annotation/AnnotationDefault;"));

    /* JADX INFO: renamed from: b */
    public static final C4453d0 f11906b = C4453d0.m8902l(C4683c.m9182m("Ldalvik/annotation/EnclosingClass;"));

    /* JADX INFO: renamed from: c */
    public static final C4453d0 f11907c = C4453d0.m8902l(C4683c.m9182m("Ldalvik/annotation/EnclosingMethod;"));

    /* JADX INFO: renamed from: d */
    public static final C4453d0 f11908d = C4453d0.m8902l(C4683c.m9182m("Ldalvik/annotation/InnerClass;"));

    /* JADX INFO: renamed from: e */
    public static final C4453d0 f11909e = C4453d0.m8902l(C4683c.m9182m("Ldalvik/annotation/MemberClasses;"));

    /* JADX INFO: renamed from: f */
    public static final C4453d0 f11910f = C4453d0.m8902l(C4683c.m9182m("Ldalvik/annotation/Signature;"));

    /* JADX INFO: renamed from: g */
    public static final C4453d0 f11911g = C4453d0.m8902l(C4683c.m9182m("Ldalvik/annotation/SourceDebugExtension;"));

    /* JADX INFO: renamed from: h */
    public static final C4453d0 f11912h = C4453d0.m8902l(C4683c.m9182m("Ldalvik/annotation/Throws;"));

    /* JADX INFO: renamed from: i */
    public static final C4451c0 f11913i = new C4451c0("accessFlags");

    /* JADX INFO: renamed from: j */
    public static final C4451c0 f11914j = new C4451c0("name");

    /* JADX INFO: renamed from: k */
    public static final C4451c0 f11915k = new C4451c0("value");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C4452d m7647a(InterfaceC4685e interfaceC4685e) {
        int size = interfaceC4685e.size();
        C4450c c4450c = new C4450c(size);
        for (int i9 = 0; i9 < size; i9++) {
            c4450c.m10841m(i9, C4453d0.m8902l(interfaceC4685e.getType(i9)));
        }
        c4450c.f24613g = false;
        return new C4452d(c4450c);
    }
}
