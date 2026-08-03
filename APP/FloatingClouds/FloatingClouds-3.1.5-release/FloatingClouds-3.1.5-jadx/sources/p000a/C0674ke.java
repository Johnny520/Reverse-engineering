package p000a;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: a.ke */
/* JADX INFO: loaded from: classes.dex */
public final class C0674ke {

    /* JADX INFO: renamed from: a.ke$a */
    public static class a extends c {
        public a(View view) {
        }
    }

    /* JADX INFO: renamed from: a.ke$b */
    public static class b extends a {
    }

    /* JADX INFO: renamed from: a.ke$c */
    public static class c {
    }

    public C0674ke(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            new b(view);
        } else {
            new a(view);
        }
    }
}
