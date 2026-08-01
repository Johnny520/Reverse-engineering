package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.C0688x;
import java.util.List;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p185m8.AbstractC5114x;
import p224p4.C5949a;
import p224p4.InterfaceC5950b;
import p376zd.C10010p0;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\n0\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m16758d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Lp4/b;", "Landroidx/lifecycle/o;", "<init>", "()V", "Landroid/content/Context;", "context", "a", "(Landroid/content/Context;)Landroidx/lifecycle/o;", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "lifecycle-process_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class ProcessLifecycleInitializer implements InterfaceC5950b {
    @Override // p224p4.InterfaceC5950b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC0676o create(Context context) {
        context.getClass();
        C5949a c5949aM23921e = C5949a.m23921e(context);
        c5949aM23921e.getClass();
        if (!c5949aM23921e.m23927g(ProcessLifecycleInitializer.class)) {
            C10010p0.m38820a("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
            return null;
        }
        C0670l.m2637a(context);
        C0688x.b bVar = C0688x.f2008y;
        bVar.m2701b(context);
        return bVar.m2700a();
    }

    @Override // p224p4.InterfaceC5950b
    public List dependencies() {
        return AbstractC5114x.m20800o();
    }
}
