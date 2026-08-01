package top.suzhelan.qstory;

import android.app.Application;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import net.bytebuddy.description.method.MethodDescription;
import p230.C8049;
import p261.AbstractC8248;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/FixApplication;", "Landroid/app/Application;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class FixApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        String str = getDataDir().getAbsolutePath() + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵喵呜喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵喵喵呜呜~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜呜喵");
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵");
        C8049.f22218 = str;
        AbstractC4922 abstractC4922 = AbstractC8248.f22823;
        AbstractC3738.m8034(this);
        AbstractC8248.f22822 = DialogX$THEME.AUTO;
    }
}
