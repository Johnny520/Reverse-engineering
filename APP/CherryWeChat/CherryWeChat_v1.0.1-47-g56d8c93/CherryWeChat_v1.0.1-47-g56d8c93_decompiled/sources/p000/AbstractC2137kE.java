package p000;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: kE */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2137kE {
    /* JADX INFO: renamed from: a */
    public static String[] m4319a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C2798zb m4320b(View view, C2798zb c2798zb) {
        ContentInfo contentInfoMo240m = c2798zb.f9467a.mo240m();
        Objects.requireNonNull(contentInfoMo240m);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoMo240m);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoMo240m ? c2798zb : new C2798zb(new C0132D2(contentInfoPerformReceiveContent));
    }
}
