package bsh.classpath;

import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;
import lin.xposed.hook.loader.config.AbstractC5554;
import p026.AbstractC6293;
import p026.AbstractC6296;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2604 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7795;

    public /* synthetic */ C2604(int i) {
        this.f7795 = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7795) {
            case 0:
                ((C2609) obj).m5108(false);
                break;
            case 1:
                AbstractC6296 abstractC6296 = (AbstractC6296) obj;
                if (AbstractC6293.class.isAssignableFrom(abstractC6296.getClass())) {
                    AbstractC6293 abstractC6293 = (AbstractC6293) abstractC6296;
                    if (abstractC6293.isLoadedByDefault() && !AbstractC5554.m10835(abstractC6293.getItemPath()).getBypassDefaultLoad().booleanValue()) {
                        abstractC6293.f17376 = Boolean.TRUE;
                        break;
                    } else {
                        String itemPath = abstractC6293.getItemPath();
                        if (AbstractC5554.f15321.containsKey(itemPath)) {
                            Boolean boolIsEnabled = AbstractC5554.m10835(itemPath).isEnabled();
                            boolIsEnabled.getClass();
                            abstractC6293.f17376 = boolIsEnabled;
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
