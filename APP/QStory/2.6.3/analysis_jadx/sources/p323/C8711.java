package p323;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C2451;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.load.engine.C3005;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import io.ktor.util.C4211;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.util.qq.QQEnvTool;
import org.json.JSONException;
import p018.AbstractC6253;
import p075.C6961;
import p217.AbstractC7969;
import p217.InterfaceC7963;
import p217.InterfaceC7964;
import p257.C8212;
import p257.C8240;
import p287.AbstractC8405;
import p321.C8687;
import p321.C8688;
import p324.AbstractC8731;
import p324.C8732;
import p324.C8733;
import p324.C8737;
import top.suzhelan.qstory.hook.item.stickerpanel.adapter.StickerDirAdapter$SpecialAction;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8711 implements InterfaceC7963, InterfaceC7964 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C8726 f24542;

    public /* synthetic */ C8711(C8726 c8726) {
        this.f24542 = c8726;
    }

    @Override // p217.InterfaceC7964
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo1478(AbstractC7969 abstractC7969, View view, int i) {
        Activity activity;
        Map map;
        AbstractC8405.m13972(1293);
        AbstractC8405.m13972(1293);
        C8726 c8726 = this.f24542;
        C8737 c8737 = c8726.f24593;
        List list = c8737.f22042;
        C2451 c2451 = c8737.f7298;
        Object objM8818 = AbstractC4344.m8818(i, list);
        C8733 c8733 = objM8818 instanceof C8733 ? (C8733) objM8818 : null;
        StickerDirAdapter$SpecialAction stickerDirAdapter$SpecialAction = c8733 != null ? c8733.f24616 : null;
        int i2 = -1;
        int i3 = stickerDirAdapter$SpecialAction == null ? -1 : AbstractC8709.f24539[stickerDirAdapter$SpecialAction.ordinal()];
        int i4 = 0;
        int i5 = 1;
        if (i3 == -1) {
            Object objM88182 = AbstractC4344.m8818(i, c8737.f22042);
            C8732 c8732 = objM88182 instanceof C8732 ? (C8732) objM88182 : null;
            String str = c8732 != null ? c8732.f24615 : null;
            if (str == null) {
                return;
            }
            C8688.f24506.getClass();
            if (C8688.m14412().equals(str)) {
                return;
            }
            AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵");
            C8688.m14414().m14677(str, AbstractC8405.m13972(2666));
            AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵");
            if (!AbstractC4395.m8907(c8737.f24630, str)) {
                String str2 = c8737.f24630;
                c8737.f24630 = str;
                Iterator it = c8737.f22042.iterator();
                int i6 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i6 = -1;
                        break;
                    }
                    AbstractC8731 abstractC8731 = (AbstractC8731) it.next();
                    if ((abstractC8731 instanceof C8732) && AbstractC4395.m8907(((C8732) abstractC8731).f24615, str2)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                Iterator it2 = c8737.f22042.iterator();
                int i7 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC8731 abstractC87312 = (AbstractC8731) it2.next();
                    if ((abstractC87312 instanceof C8732) && AbstractC4395.m8907(((C8732) abstractC87312).f24615, str)) {
                        i2 = i7;
                        break;
                    }
                    i7++;
                }
                if (i6 >= 0) {
                    c2451.m4811(AbstractC8405.m13972(2718), i6, 1);
                }
                if (i2 >= 0) {
                    c2451.m4811(AbstractC8405.m13972(2718), i2, 1);
                }
                if (i6 < 0 && i2 < 0) {
                    c8737.m4791();
                }
            }
            C8726.m14432();
            c8726.m14433(str);
            DialogXRecycleView dialogXRecycleView = c8726.f24592;
            if (dialogXRecycleView != null) {
                dialogXRecycleView.post(new RunnableC8712(c8726, i4));
                return;
            }
            return;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                C4211.m8611();
                return;
            }
            C8688.f24506.getClass();
            StickerSdkConfig.setSTICKER_DIR(C8688.m14410());
            String currentUin = QQEnvTool.getCurrentUin();
            AbstractC8405.m13972(1263);
            currentUin.getClass();
            StickerSdkConfig.setUSER_UIN(currentUin);
            String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
            AbstractC8405.m13972(1264);
            currentAccountNickName.getClass();
            StickerSdkConfig.setUSER_NICKNAME(currentAccountNickName);
            Activity activityM6653 = AbstractC3055.m6653();
            if (activityM6653 == null) {
                return;
            }
            C3005 c3005 = new C3005(activityM6653, 3);
            C8240 c8240 = (C8240) c3005.f9537;
            c8240.f11590 = (int) (((double) AbstractC3738.m8032().getResources().getDisplayMetrics().heightPixels) * 0.8d);
            c8240.m13763();
            c8240.f22764 = new C8707(c3005);
            c8240.m13763();
            c8240.f22772 = false;
            c8240.m13761(new C8708(c3005, i5));
            c8240.m13760();
            return;
        }
        C8710 c8710 = new C8710(c8726, 0);
        AbstractC8405.m13972(2764);
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
        View viewInflate = AbstractC6253.m11750(activity).inflate(R.layout.dialog_sticker_setting, (ViewGroup) null);
        C8240 c8240M13759 = C8240.m13759();
        c8240M13759.f22761 = AbstractC8405.m13972(2765);
        c8240M13759.m13763();
        c8240M13759.f22764 = new C8707(viewInflate, c8710);
        c8240M13759.m13763();
        c8240M13759.m13760();
    }

    @Override // p217.InterfaceC7963
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo12777(AbstractC7969 abstractC7969, View view, int i) throws JSONException, IOException {
        AbstractC8405.m13973("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC8405.m13972(1293);
        C8726 c8726 = this.f24542;
        Object objM8818 = AbstractC4344.m8818(i, c8726.f24593.f22042);
        C8732 c8732 = objM8818 instanceof C8732 ? (C8732) objM8818 : null;
        String str = c8732 != null ? c8732.f24615 : null;
        if (str == null) {
            return false;
        }
        C8710 c8710 = new C8710(c8726, 1);
        AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵");
        AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵呜");
        C8688.f24506.getClass();
        File file = new File(C8688.m14410(), str);
        if (file.exists()) {
            C8687.f24498.getClass();
            C8687 c8687M12272 = C6961.m12272(file);
            if (!new File(file, AbstractC8405.m13972(2669)).exists()) {
                C6961.m12273(file, c8687M12272);
            }
            List listM12270 = C6961.m12270(file);
            View viewInflate = AbstractC6253.m11750(AbstractC3055.m6653()).inflate(R.layout.dialog_change_sticker_dir, (ViewGroup) null);
            C8240 c8240M13759 = C8240.m13759();
            c8240M13759.f22761 = AbstractC8405.m13972(2730);
            c8240M13759.m13763();
            c8240M13759.f22764 = new C8720(viewInflate, file, str, c8687M12272, listM12270, c8710);
            c8240M13759.m13763();
            c8240M13759.f22772 = false;
            c8240M13759.m13760();
        } else {
            C8212.m13737(AbstractC8405.m13972(2729)).m13741();
        }
        return true;
    }
}
