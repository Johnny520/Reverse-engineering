package yyds;

import io.github.libxposed.api.XposedInterface;
import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᛱᛷᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0174 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0174 f998;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0078 f999;

    static {
        AbstractC2328.m4341(-923627994907502L);
        f998 = new C0174();
        f999 = new C0078(new C2307(25));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m734(XposedInterface.HookHandle hookHandle) {
        AbstractC2328.m4341(-923507735823214L);
        ((C2424) f999.getValue()).f11969.add(hookHandle);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m735() {
        C0078 c0078 = f999;
        ((C2424) c0078.getValue()).f11968.clear();
        Iterator it = ((C2424) c0078.getValue()).f11969.iterator();
        while (it.hasNext()) {
            try {
                ((XposedInterface.HookHandle) it.next()).unhook();
            } catch (Exception e) {
                C2336.f11496.m4355(AbstractC2328.m4341(-923572160332654L), e);
            }
        }
    }
}
