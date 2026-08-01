package top.suzhelan.qstory;

import android.app.Application;
import com.bumptech.glide.AbstractC3056;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p033.AbstractC6325;
import p261.AbstractC8247;
import p342.C8821;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/FixApplication;", "Landroid/app/Application;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class FixApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        String str = C8821.f24811;
        String str2 = getDataDir().getAbsolutePath() + "/config";
        "path";
        C8821.f24811 = str2;
        AbstractC6325 abstractC6325 = AbstractC8247.f22824;
        AbstractC3737.m8047(this);
        AbstractC8247.f22823 = DialogX$THEME.AUTO;
    }
}
