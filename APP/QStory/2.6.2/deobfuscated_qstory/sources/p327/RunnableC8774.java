package p327;

import com.bumptech.glide.AbstractC3056;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p391.C9114;

/* JADX INFO: renamed from: 飘花落叶言苏世哲子兰楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8774 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8773 f24716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24717;

    public /* synthetic */ RunnableC8774(C8773 c8773, int i) {
        this.f24717 = i;
        this.f24716 = c8773;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f24717;
        C8773 c8773 = this.f24716;
        switch (i) {
            case 0:
                String str = C8773.f24710;
                try {
                    try {
                        boolean z = c8773.f24715;
                        C9114 c9114 = c8773.f24714;
                        if (!z) {
                            c8773.f24715 = true;
                            String str2 = c8773.f24713.format(new Date());
                            "format(...)";
                            str2.getClass();
                            String strM14641 = c9114.m14641("last_backup_date", "");
                            try {
                                C8773.m14437();
                                if (!str2.equals(strM14641)) {
                                    C8773.m14438();
                                    c8773.m14442();
                                    c9114.m14640(str2, "last_backup_date");
                                }
                            } catch (Exception e) {
                                AbstractC6157.m11574("AutoBackupModuleData", "\u81ea\u52a8\u5907\u4efd\u6267\u884c\u5f02\u5e38", e, true);
                            }
                        }
                        break;
                    } catch (Exception e2) {
                        AbstractC6157.m11574("AutoBackupModuleData", "\u542f\u52a8\u5907\u4efd\u68c0\u67e5\u5f02\u5e38", e2, true);
                        break;
                    }
                    return;
                } finally {
                    c8773.f24715 = false;
                }
            default:
                try {
                    C8773.m14437();
                    C8773.m14438();
                    File fileM14442 = c8773.m14442();
                    String str3 = String.format("\u624b\u52a8\u5907\u4efd\u6210\u529f\n\u6587\u4ef6: %s\n\u5927\u5c0f: %s", Arrays.copyOf(new Object[]{fileM14442.getName(), C8773.m14440(fileM14442.length())}, 2));
                    "format(...)";
                    AbstractC6154.m11561(str3);
                    return;
                } catch (Exception e3) {
                    String str4 = "\u5907\u4efd\u5931\u8d25: " + e3.getMessage();
                    AbstractC6157.m11574("AutoBackupModuleData", str4, e3, true);
                    AbstractC6154.m11561(str4);
                    return;
                }
        }
    }
}
