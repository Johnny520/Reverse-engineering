package p000;

import android.graphics.Path;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: kw */
/* JADX INFO: loaded from: classes.dex */
public class C0426kw implements InterfaceC0650qy {

    /* JADX INFO: renamed from: b */
    public static C0426kw f2874b;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2875a;

    public /* synthetic */ C0426kw(int i) {
        this.f2875a = i;
    }

    /* JADX INFO: renamed from: a */
    public static Path m1716a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* JADX INFO: renamed from: b */
    public boolean mo1719b(CharSequence charSequence) {
        return false;
    }

    @Override // p000.InterfaceC0650qy
    /* JADX INFO: renamed from: g */
    public void mo1720g() {
        switch (this.f2875a) {
            case Base64.NO_WRAP /* 2 */:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // p000.InterfaceC0650qy
    /* JADX INFO: renamed from: i */
    public void mo1721i(int i, Object obj) {
        String str;
        switch (this.f2875a) {
            case Base64.NO_WRAP /* 2 */:
                break;
            default:
                switch (i) {
                    case Base64.NO_PADDING /* 1 */:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case Base64.NO_WRAP /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    public C0426kw(RecyclerView recyclerView) {
        this.f2875a = 6;
    }

    /* JADX INFO: renamed from: c */
    private final void m1717c() {
    }

    /* JADX INFO: renamed from: d */
    private final void m1718d(int i, Object obj) {
    }
}
