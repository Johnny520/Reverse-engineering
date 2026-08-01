package io.ktor.client.plugins.cookies;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.text.AbstractC5144;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: io.ktor.client.plugins.cookies.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3896 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public static final /* synthetic */ int f12101 = 0;

    static {
        AbstractC4396.f12975.mo8917(AbstractC3896.class);
        try {
            AbstractC4396.m8912(AbstractC3896.class);
        } catch (Throwable unused) {
        }
        if (AbstractC5144.m10172("HttpCookies")) {
            C5925.m11310("Name can't be blank");
        }
    }
}
