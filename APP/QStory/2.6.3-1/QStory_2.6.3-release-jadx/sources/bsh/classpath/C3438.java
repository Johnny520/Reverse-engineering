package bsh.classpath;

import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;
import lin.xposed.hook.loader.config.AbstractC6386;
import p042.AbstractC7140;
import p042.AbstractC7143;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3438 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8142;

    public /* synthetic */ C3438(int i) {
        this.f8142 = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f8142) {
            case 0:
                ((C3443) obj).m5713(false);
                break;
            case 1:
                AbstractC7143 abstractC7143 = (AbstractC7143) obj;
                if (AbstractC7140.class.isAssignableFrom(abstractC7143.getClass())) {
                    AbstractC7140 abstractC7140 = (AbstractC7140) abstractC7143;
                    if (abstractC7140.isLoadedByDefault() && !AbstractC6386.m11451(abstractC7140.getItemPath()).getBypassDefaultLoad().booleanValue()) {
                        abstractC7140.f17770 = Boolean.TRUE;
                        break;
                    } else {
                        String itemPath = abstractC7140.getItemPath();
                        if (AbstractC6386.f15666.containsKey(itemPath)) {
                            Boolean boolIsEnabled = AbstractC6386.m11451(itemPath).isEnabled();
                            boolIsEnabled.getClass();
                            abstractC7140.f17770 = boolIsEnabled;
                            break;
                        }
                    }
                }
                break;
            default:
                ((ConcurrentMap) obj).clear();
                break;
        }
    }
}
