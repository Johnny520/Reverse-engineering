package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.ConnectivityManager;
import java.io.InputStream;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r80 implements kh1, bq0 {
    public final /* synthetic */ int h;
    public final Context i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ r80(Context context, int i) {
        this.h = i;
        this.i = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bq0
    public Object get() {
        return (ConnectivityManager) this.i.getSystemService("connectivity");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.kh1
    public jh1 q(kj1 kj1Var) {
        int i = this.h;
        Context context = this.i;
        switch (i) {
            case 0:
                return new tg(context, this);
            case 1:
                return new tg(context, this);
            case 2:
                return new tg(context, this);
            case 3:
            default:
                return new tg(context, kj1Var.g(Integer.class, InputStream.class));
            case 4:
                return new uf1(context, 0);
            case 5:
                return new uf1(context, 1);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new uf1(context, 2);
            case 7:
                return new tg(context, kj1Var.g(Integer.class, AssetFileDescriptor.class));
        }
    }
}
