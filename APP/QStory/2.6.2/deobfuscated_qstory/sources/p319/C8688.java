package p319;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C2451;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.load.engine.C3004;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import io.ktor.util.C4210;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.util.qq.QQEnvTool;
import org.json.JSONException;
import p053.AbstractC6560;
import p075.C6957;
import p175.AbstractC7738;
import p217.AbstractC7968;
import p217.InterfaceC7962;
import p217.InterfaceC7963;
import p257.C8211;
import p257.C8239;
import p323.AbstractC8728;
import p323.C8729;
import p323.C8730;
import p323.C8734;
import p324.C8737;
import p324.C8738;
import top.suzhelan.qstory.hook.item.stickerpanel.adapter.StickerDirAdapter$SpecialAction;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8688 implements InterfaceC7962, InterfaceC7963 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C8703 f24495;

    public /* synthetic */ C8688(C8703 c8703) {
        this.f24495 = c8703;
    }

    @Override // p217.InterfaceC7963
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo1468(AbstractC7968 abstractC7968, View view, int i) {
        Activity activity;
        Map map;
        "<unused var>";
        "<unused var>";
        C8703 c8703 = this.f24495;
        C8734 c8734 = c8703.f24543;
        List list = c8734.f22045;
        C2451 c2451 = c8734.f7297;
        Object objM8831 = AbstractC4343.m8831(i, list);
        C8730 c8730 = objM8831 instanceof C8730 ? (C8730) objM8831 : null;
        StickerDirAdapter$SpecialAction stickerDirAdapter$SpecialAction = c8730 != null ? c8730.f24614 : null;
        int i2 = -1;
        int i3 = stickerDirAdapter$SpecialAction == null ? -1 : AbstractC8686.f24492[stickerDirAdapter$SpecialAction.ordinal()];
        int i4 = 0;
        if (i3 == -1) {
            Object objM88312 = AbstractC4343.m8831(i, c8734.f22045);
            C8729 c8729 = objM88312 instanceof C8729 ? (C8729) objM88312 : null;
            String str = c8729 != null ? c8729.f24613 : null;
            if (str == null) {
                return;
            }
            C8738.f24639.getClass();
            if (C8738.m14407().equals(str)) {
                return;
            }
            "dirName";
            C8738.m14409().m14640(str, "currentSelection");
            "dirName";
            if (!AbstractC4394.m8917(c8734.f24628, str)) {
                String str2 = c8734.f24628;
                c8734.f24628 = str;
                Iterator it = c8734.f22045.iterator();
                int i5 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i5 = -1;
                        break;
                    }
                    AbstractC8728 abstractC8728 = (AbstractC8728) it.next();
                    if ((abstractC8728 instanceof C8729) && AbstractC4394.m8917(((C8729) abstractC8728).f24613, str2)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                Iterator it2 = c8734.f22045.iterator();
                int i6 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC8728 abstractC87282 = (AbstractC8728) it2.next();
                    if ((abstractC87282 instanceof C8729) && AbstractC4394.m8917(((C8729) abstractC87282).f24613, str)) {
                        i2 = i6;
                        break;
                    }
                    i6++;
                }
                if (i5 >= 0) {
                    c2451.m4801("payload_selection", i5, 1);
                }
                if (i2 >= 0) {
                    c2451.m4801("payload_selection", i2, 1);
                }
                if (i5 < 0 && i2 < 0) {
                    c8734.m4781();
                }
            }
            C8703.m14384();
            c8703.m14385(str);
            DialogXRecycleView dialogXRecycleView = c8703.f24542;
            if (dialogXRecycleView != null) {
                dialogXRecycleView.post(new RunnableC8689(c8703, i4));
                return;
            }
            return;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                C4210.m8621();
                return;
            }
            C8738.f24639.getClass();
            StickerSdkConfig.setSTICKER_DIR(C8738.m14405());
            String currentUin = QQEnvTool.getCurrentUin();
            "getCurrentUin(...)";
            currentUin.getClass();
            StickerSdkConfig.setUSER_UIN(currentUin);
            String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
            "getCurrentAccountNickName(...)";
            currentAccountNickName.getClass();
            StickerSdkConfig.setUSER_NICKNAME(currentAccountNickName);
            Activity activityM13031 = AbstractC7738.m13031();
            if (activityM13031 == null) {
                return;
            }
            C3004 c3004 = new C3004(activityM13031, 3);
            C8239 c8239 = (C8239) c3004.f9535;
            c8239.f11585 = (int) (((double) AbstractC3737.m8045().getResources().getDisplayMetrics().heightPixels) * 0.8d);
            c8239.m13746();
            c8239.f22765 = new C8684(c3004);
            c8239.m13746();
            c8239.f22773 = false;
            C8685 c8685 = new C8685(c3004, 1);
            c8239.f22768 = c8685;
            if (c8239.f11579) {
                c8685.mo8079(c8239.f22767);
            }
            c8239.m13744();
            return;
        }
        C8687 c8687 = new C8687(c8703, 0);
        "onSettingsChanged";
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            map = (Map) declaredField.get(objInvoke);
        } catch (Exception unused) {
        }
        if (map == null) {
            activity = null;
        } else {
            for (Object obj : map.values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(obj);
                    break;
                }
                activity = null;
            }
            activity = null;
        }
        View viewInflate = AbstractC6560.m12028(activity).inflate(R.layout.dialog_sticker_setting, (ViewGroup) null);
        C8239 c8239M13743 = C8239.m13743();
        c8239M13743.f22762 = "\u8868\u60c5\u9762\u677f\u8bbe\u7f6e";
        c8239M13743.m13746();
        c8239M13743.f22765 = new C8684(viewInflate, c8687);
        c8239M13743.m13746();
        c8239M13743.m13744();
    }

    @Override // p217.InterfaceC7962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo12748(AbstractC7968 abstractC7968, View view, int i) throws JSONException, IOException {
        "adapter";
        "<unused var>";
        C8703 c8703 = this.f24495;
        Object objM8831 = AbstractC4343.m8831(i, c8703.f24543.f22045);
        C8729 c8729 = objM8831 instanceof C8729 ? (C8729) objM8831 : null;
        String str = c8729 != null ? c8729.f24613 : null;
        if (str == null) {
            return false;
        }
        C8687 c8687 = new C8687(c8703, 1);
        "dirName";
        "onDone";
        C8738.f24639.getClass();
        File file = new File(C8738.m14405(), str);
        if (file.exists()) {
            C8737.f24631.getClass();
            C8737 c8737M12232 = C6957.m12232(file);
            if (!new File(file, "config.json").exists()) {
                C6957.m12234(file, c8737M12232);
            }
            List listM12233 = C6957.m12233(file);
            View viewInflate = AbstractC6560.m12028(AbstractC7738.m13031()).inflate(R.layout.dialog_change_sticker_dir, (ViewGroup) null);
            C8239 c8239M13743 = C8239.m13743();
            c8239M13743.f22762 = "\u7f16\u8f91\u8868\u60c5\u5305";
            c8239M13743.m13746();
            c8239M13743.f22765 = new C8697(viewInflate, file, str, c8737M12232, listM12233, c8687);
            c8239M13743.m13746();
            c8239M13743.f22773 = false;
            c8239M13743.m13744();
        } else {
            C8211.m13720("\u76ee\u5f55\u4e0d\u5b58\u5728").m13724();
        }
        return true;
    }
}
