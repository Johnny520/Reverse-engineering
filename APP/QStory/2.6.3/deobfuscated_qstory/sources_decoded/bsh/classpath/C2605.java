package bsh.classpath;

import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;
import lin.xposed.hook.loader.config.AbstractC5555;
import p026.AbstractC6311;
import p026.AbstractC6314;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2605 implements Consumer {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7797;

    public /* synthetic */ C2605(int i) {
        this.f7797 = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7797) {
            case 0:
                ((C2610) obj).m5153(false);
                break;
            case 1:
                AbstractC6314 abstractC6314 = (AbstractC6314) obj;
                if (AbstractC6311.class.isAssignableFrom(abstractC6314.getClass())) {
                    AbstractC6311 abstractC6311 = (AbstractC6311) abstractC6314;
                    if (abstractC6311.isLoadedByDefault() && !AbstractC5555.m10892(abstractC6311.getItemPath()).getBypassDefaultLoad().booleanValue()) {
                        abstractC6311.f17425 = Boolean.TRUE;
                        break;
                    } else {
                        String itemPath = abstractC6311.getItemPath();
                        if (AbstractC5555.f15321.containsKey(itemPath)) {
                            Boolean boolIsEnabled = AbstractC5555.m10892(itemPath).isEnabled();
                            boolIsEnabled.getClass();
                            abstractC6311.f17425 = boolIsEnabled;
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
