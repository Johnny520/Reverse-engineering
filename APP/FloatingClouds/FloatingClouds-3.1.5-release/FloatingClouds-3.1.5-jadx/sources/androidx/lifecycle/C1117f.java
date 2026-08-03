package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.FragmentC1124l;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import p000a.C0385V5;
import p000a.C0631i9;

/* JADX INFO: renamed from: androidx.lifecycle.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1117f {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f4678a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.f$a */
    @Metadata(m3302d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m3303d2 = {"Landroidx/lifecycle/f$a;", "La/V5;", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "La/Wf;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "lifecycle-process_release"}, m3304k = 1, m3305mv = {1, 8, 0}, m3307xi = 48)
    public static final class a extends C0385V5 {
        @Override // p000a.C0385V5, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            C0631i9.m1482e(activity, "activity");
            int i = FragmentC1124l.f4699b;
            FragmentC1124l.a.m2607b(activity);
        }
    }
}
