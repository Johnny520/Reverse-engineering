package top.suzhelan.qstory;

import android.app.Application;
import com.kongzue.dialogx.DialogX$THEME;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import net.bytebuddy.description.method.MethodDescription;
import p246.C8878;
import p277.AbstractC9077;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/FixApplication;", "Landroid/app/Application;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class FixApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        String str = getDataDir().getAbsolutePath() + "/config";
        "path";
        C8878.f22563 = str;
        AbstractC5754 abstractC5754 = AbstractC9077.f23168;
        AbstractC4570.m8593(this);
        AbstractC9077.f23167 = DialogX$THEME.AUTO;
    }
}
