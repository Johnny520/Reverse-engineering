package me.yun.fkwechat.loader;

import android.app.Application;
import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\n2\u000e\b\u0004\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0082\b¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m16758d2 = {"Lme/yun/fkwechat/loader/LoaderCore;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Landroid/app/Application;", "application", "Ll8/i0;", "bootstrap", "(Landroid/app/Application;)V", "initialize", _UrlKt.FRAGMENT_ENCODE_SET, "buildDetailInfo", "()Ljava/lang/String;", "name", "Lkotlin/Function0;", "init", "initFeature", "(Ljava/lang/String;La9/a;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", _UrlKt.FRAGMENT_ENCODE_SET, "startTime", "J", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public final class LoaderCore {
    public static final int $stable = 0;
    public static final LoaderCore INSTANCE = null;
    private static final AtomicBoolean isInitialized = null;
    private static volatile long startTime;

    static {
        FkwLoader.registerNativesForClass(18, LoaderCore.class);
        Hidden0.special_clinit_18_00(LoaderCore.class);
    }

    private LoaderCore() {
    }

    /* JADX INFO: renamed from: a */
    public static native void m21241a();

    /* JADX INFO: renamed from: b */
    public static native void m21242b(Application application);

    public static final native void bootstrap(Application application);

    private final native String buildDetailInfo();

    private final native void initFeature(String name, InterfaceC0173a init);

    private final native void initialize(Application application);
}
