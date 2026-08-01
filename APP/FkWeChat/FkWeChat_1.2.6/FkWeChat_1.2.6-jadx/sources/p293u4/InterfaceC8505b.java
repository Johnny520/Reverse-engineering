package p293u4;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: renamed from: u4.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC8505b {

    /* JADX INFO: renamed from: a */
    public static final a f28398a = a.f28399a;

    /* JADX INFO: renamed from: u4.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a f28399a = new a();

        /* JADX INFO: renamed from: b */
        public static final String f28400b = InterfaceC8505b.class.getSimpleName();

        /* JADX INFO: renamed from: a */
        public final InterfaceC8505b m32754a() {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 30 ? C8509f.f28404b : i10 >= 29 ? C8508e.f28403b : i10 >= 28 ? C8507d.f28402b : C8506c.f28401b;
        }

        /* JADX INFO: renamed from: b */
        public final String m32755b() {
            return f28400b;
        }
    }

    /* JADX INFO: renamed from: a */
    Rect mo32753a(Activity activity);
}
