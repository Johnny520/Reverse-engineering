package yyds;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲀᛶᲀᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2024 implements InterfaceC0556 {

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final List f10097;

    public C2024(InterfaceC0556... interfaceC0556Arr) {
        if (interfaceC0556Arr.length != 0) {
            this.f10097 = Arrays.asList(interfaceC0556Arr);
        } else {
            C0188.m798("MultiTransformation must contain at least one Transformation");
            throw null;
        }
    }

    @Override // yyds.InterfaceC1410
    public final boolean equals(Object obj) {
        if (obj instanceof C2024) {
            return this.f10097.equals(((C2024) obj).f10097);
        }
        return false;
    }

    @Override // yyds.InterfaceC1410
    public final int hashCode() {
        return this.f10097.hashCode();
    }

    @Override // yyds.InterfaceC0556
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final InterfaceC2162 mo1240(Context context, InterfaceC2162 interfaceC2162, int i, int i2) {
        Iterator it = this.f10097.iterator();
        InterfaceC2162 interfaceC21622 = interfaceC2162;
        while (it.hasNext()) {
            InterfaceC2162 interfaceC2162Mo1240 = ((InterfaceC0556) it.next()).mo1240(context, interfaceC21622, i, i2);
            if (interfaceC21622 != null && !interfaceC21622.equals(interfaceC2162) && !interfaceC21622.equals(interfaceC2162Mo1240)) {
                interfaceC21622.mo1177();
            }
            interfaceC21622 = interfaceC2162Mo1240;
        }
        return interfaceC21622;
    }

    @Override // yyds.InterfaceC1410
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1227(MessageDigest messageDigest) {
        Iterator it = this.f10097.iterator();
        while (it.hasNext()) {
            ((InterfaceC0556) it.next()).mo1227(messageDigest);
        }
    }
}
