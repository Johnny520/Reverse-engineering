package p007D0;

import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p009E0.C0103c;
import p011F0.AbstractC0134v;

/* JADX INFO: renamed from: D0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0096d {

    /* JADX INFO: renamed from: a */
    public static final ThreadPoolExecutor f381a = new ThreadPoolExecutor(8, 16, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: b */
    public static final Map f382b = AbstractC0134v.m295Z(new C0103c("Cache-Control", "no-cache"));
}
