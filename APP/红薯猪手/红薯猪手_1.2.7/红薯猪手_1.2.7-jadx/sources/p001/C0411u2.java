package p001;

import android.content.Context;
import android.media.ExifInterface;
import java.io.InputStream;
import p001.AbstractC0469y8;
import p001.C0481z7;

/* JADX INFO: renamed from: ۟.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0411u2 extends C0370r0 {
    public C0411u2(Context context) {
        super(context);
    }

    @Override // p001.C0370r0, p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean mo831(C0443w8 c0443w8) {
        return "file".equals(c0443w8.f1842.getScheme());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.C0370r0, p001.AbstractC0469y8
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final AbstractC0469y8.a mo1030(C0443w8 c0443w8) {
        InputStream inputStreamM1194 = m1194(c0443w8);
        C0481z7.e eVar = C0481z7.e.DISK;
        int attributeInt = new ExifInterface(c0443w8.f1842.getPath()).getAttributeInt("Orientation", 1);
        return new AbstractC0469y8.a(null, inputStreamM1194, eVar, attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : 270 : 90 : 180);
    }
}
