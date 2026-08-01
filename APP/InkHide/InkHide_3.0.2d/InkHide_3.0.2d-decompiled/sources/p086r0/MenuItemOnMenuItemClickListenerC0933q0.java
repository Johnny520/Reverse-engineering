package p086r0;

import android.view.MenuItem;
import com.p055lu.wxmask.p057ui.JsonMenuManager$AppLink;
import com.p055lu.wxmask.p057ui.JsonMenuManager$MenuBean;
import com.p055lu.wxmask.p057ui.MainActivity;
import p011F0.C0115c;
import p027N0.AbstractC0223g;
import p027N0.AbstractC0231o;
import p070i0.AbstractC0731a;
import p092u0.AbstractC1015a;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.q0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MenuItemOnMenuItemClickListenerC0933q0 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3325a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3326b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3327c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ MenuItemOnMenuItemClickListenerC0933q0(JsonMenuManager$MenuBean jsonMenuManager$MenuBean, MainActivity mainActivity) {
        this.f3326b = jsonMenuManager$MenuBean;
        this.f3327c = mainActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[LOOP:0: B:17:0x0036->B:60:?, LOOP_END, SYNTHETIC] */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Object obj = this.f3327c;
        Object obj2 = this.f3326b;
        switch (this.f3325a) {
            case 0:
                AbstractC0223g.m418e(menuItem, "it");
                C0842H0 c0842h0 = (C0842H0) obj2;
                c0842h0.getClass();
                boolean z2 = AbstractC1126i.f3786a;
                if (C1124g.m2415F()) {
                    c0842h0.m1688m((String) obj);
                }
                return true;
            default:
                AbstractC0223g.m418e(menuItem, "it");
                JsonMenuManager$MenuBean jsonMenuManager$MenuBean = (JsonMenuManager$MenuBean) obj2;
                JsonMenuManager$AppLink appLink = jsonMenuManager$MenuBean.getAppLink();
                String[] links = appLink != null ? appLink.getLinks() : null;
                MainActivity mainActivity = (MainActivity) obj;
                if (appLink == null || appLink.getPriority() < 0 || links == null || links.length == 0) {
                    try {
                        String link = jsonMenuManager$MenuBean.getLink();
                        if (link == null) {
                            throw new IllegalArgumentException("link is null");
                        }
                        AbstractC1015a.m2216b(mainActivity, link, new C0925n1(14));
                    } catch (Throwable th) {
                        AbstractC0731a.m1387d("open link error", th);
                    }
                } else {
                    C0115c c0115cM428d = AbstractC0231o.m428d(links);
                    int i2 = 0;
                    while (c0115cM428d.hasNext()) {
                        String str = (String) c0115cM428d.next();
                        if (str == null) {
                            throw new IllegalArgumentException("link is null");
                        }
                        try {
                            AbstractC1015a.m2216b(mainActivity, str, new C0925n1(14));
                        } catch (Throwable th2) {
                            i2++;
                            AbstractC0731a.m1387d("open link faild", th2);
                        }
                        if (i2 != 0) {
                            if (i2 == links.length) {
                                AbstractC0731a.m1387d("open appLink with all error", menuItem);
                                try {
                                    String link2 = jsonMenuManager$MenuBean.getLink();
                                    if (link2 == null) {
                                        throw new IllegalArgumentException("link is null");
                                    }
                                    AbstractC1015a.m2216b(mainActivity, link2, new C0925n1(14));
                                } catch (Throwable th3) {
                                    AbstractC0731a.m1387d("try open link also error", th3);
                                }
                            }
                        }
                        i2++;
                        AbstractC0731a.m1387d("open link faild", th2);
                        if (i2 != 0) {
                        }
                    }
                    if (i2 == links.length) {
                    }
                }
                return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ MenuItemOnMenuItemClickListenerC0933q0(C0842H0 c0842h0, String str, String str2) {
        this.f3326b = c0842h0;
        this.f3327c = str;
    }
}
