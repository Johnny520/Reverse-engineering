package p339;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C3284;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.load.engine.C3837;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import io.ktor.util.C5043;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import org.json.JSONException;
import p034.AbstractC7082;
import p091.C7790;
import p233.AbstractC8798;
import p233.InterfaceC8792;
import p233.InterfaceC8793;
import p273.C9041;
import p273.C9069;
import p303.AbstractC9234;
import p337.C9516;
import p337.C9517;
import p340.AbstractC9560;
import p340.C9561;
import p340.C9562;
import p340.C9566;
import top.suzhelan.qstory.hook.item.stickerpanel.adapter.StickerDirAdapter$SpecialAction;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.net.StickerSdkConfig;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9540 implements InterfaceC8792, InterfaceC8793 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C9555 f24887;

    public /* synthetic */ C9540(C9555 c9555) {
        this.f24887 = c9555;
    }

    @Override // p233.InterfaceC8793
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public void mo2038(AbstractC8798 abstractC8798, View view, int i) {
        Activity activity;
        Map map;
        AbstractC9234.m14531(1293);
        AbstractC9234.m14531(1293);
        C9555 c9555 = this.f24887;
        C9566 c9566 = c9555.f24938;
        List list = c9566.f22387;
        C3284 c3284 = c9566.f7643;
        Object objM9377 = AbstractC5176.m9377(i, list);
        C9562 c9562 = objM9377 instanceof C9562 ? (C9562) objM9377 : null;
        StickerDirAdapter$SpecialAction stickerDirAdapter$SpecialAction = c9562 != null ? c9562.f24961 : null;
        int i2 = -1;
        int i3 = stickerDirAdapter$SpecialAction == null ? -1 : AbstractC9538.f24884[stickerDirAdapter$SpecialAction.ordinal()];
        int i4 = 0;
        int i5 = 1;
        if (i3 == -1) {
            Object objM93772 = AbstractC5176.m9377(i, c9566.f22387);
            C9561 c9561 = objM93772 instanceof C9561 ? (C9561) objM93772 : null;
            String str = c9561 != null ? c9561.f24960 : null;
            if (str == null) {
                return;
            }
            C9517.f24851.getClass();
            if (C9517.m14971().equals(str)) {
                return;
            }
            AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵");
            C9517.m14973().m15236(str, AbstractC9234.m14531(2666));
            AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵");
            if (!AbstractC5227.m9466(c9566.f24975, str)) {
                String str2 = c9566.f24975;
                c9566.f24975 = str;
                Iterator it = c9566.f22387.iterator();
                int i6 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i6 = -1;
                        break;
                    }
                    AbstractC9560 abstractC9560 = (AbstractC9560) it.next();
                    if ((abstractC9560 instanceof C9561) && AbstractC5227.m9466(((C9561) abstractC9560).f24960, str2)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                Iterator it2 = c9566.f22387.iterator();
                int i7 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    AbstractC9560 abstractC95602 = (AbstractC9560) it2.next();
                    if ((abstractC95602 instanceof C9561) && AbstractC5227.m9466(((C9561) abstractC95602).f24960, str)) {
                        i2 = i7;
                        break;
                    }
                    i7++;
                }
                if (i6 >= 0) {
                    c3284.m5371(AbstractC9234.m14531(2718), i6, 1);
                }
                if (i2 >= 0) {
                    c3284.m5371(AbstractC9234.m14531(2718), i2, 1);
                }
                if (i6 < 0 && i2 < 0) {
                    c9566.m5351();
                }
            }
            C9555.m14991();
            c9555.m14992(str);
            DialogXRecycleView dialogXRecycleView = c9555.f24937;
            if (dialogXRecycleView != null) {
                dialogXRecycleView.post(new RunnableC9541(c9555, i4));
                return;
            }
            return;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                C5043.m9170();
                return;
            }
            C9517.f24851.getClass();
            StickerSdkConfig.setSTICKER_DIR(C9517.m14969());
            String currentUin = QQEnvTool.getCurrentUin();
            AbstractC9234.m14531(1263);
            currentUin.getClass();
            StickerSdkConfig.setUSER_UIN(currentUin);
            String currentAccountNickName = QQEnvTool.getCurrentAccountNickName();
            AbstractC9234.m14531(1264);
            currentAccountNickName.getClass();
            StickerSdkConfig.setUSER_NICKNAME(currentAccountNickName);
            Activity activityM7213 = AbstractC3887.m7213();
            if (activityM7213 == null) {
                return;
            }
            C3837 c3837 = new C3837(activityM7213, 3);
            C9069 c9069 = (C9069) c3837.f9882;
            c9069.f11935 = (int) (((double) AbstractC4570.m8591().getResources().getDisplayMetrics().heightPixels) * 0.8d);
            c9069.m14322();
            c9069.f23109 = new C9536(c3837);
            c9069.m14322();
            c9069.f23117 = false;
            c9069.m14320(new C9537(c3837, i5));
            c9069.m14319();
            return;
        }
        C9539 c9539 = new C9539(c9555, 0);
        AbstractC9234.m14531(2764);
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
        View viewInflate = AbstractC7082.m12309(activity).inflate(C0328R.layout.dialog_sticker_setting, (ViewGroup) null);
        C9069 c9069M14318 = C9069.m14318();
        c9069M14318.f23106 = AbstractC9234.m14531(2765);
        c9069M14318.m14322();
        c9069M14318.f23109 = new C9536(viewInflate, c9539);
        c9069M14318.m14322();
        c9069M14318.m14319();
    }

    @Override // p233.InterfaceC8792
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public boolean mo13336(AbstractC8798 abstractC8798, View view, int i) throws JSONException, IOException {
        AbstractC9234.m14532("喵喵喵呜喵喵呜喵~喵喵喵呜喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵呜呜");
        AbstractC9234.m14531(1293);
        C9555 c9555 = this.f24887;
        Object objM9377 = AbstractC5176.m9377(i, c9555.f24938.f22387);
        C9561 c9561 = objM9377 instanceof C9561 ? (C9561) objM9377 : null;
        String str = c9561 != null ? c9561.f24960 : null;
        if (str == null) {
            return false;
        }
        C9539 c9539 = new C9539(c9555, 1);
        AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵呜喵喵喵~喵喵呜喵喵呜呜喵~喵喵喵喵喵呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵");
        AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵呜");
        C9517.f24851.getClass();
        File file = new File(C9517.m14969(), str);
        if (file.exists()) {
            C9516.f24843.getClass();
            C9516 c9516M12831 = C7790.m12831(file);
            if (!new File(file, AbstractC9234.m14531(2669)).exists()) {
                C7790.m12832(file, c9516M12831);
            }
            List listM12829 = C7790.m12829(file);
            View viewInflate = AbstractC7082.m12309(AbstractC3887.m7213()).inflate(C0328R.layout.dialog_change_sticker_dir, (ViewGroup) null);
            C9069 c9069M14318 = C9069.m14318();
            c9069M14318.f23106 = AbstractC9234.m14531(2730);
            c9069M14318.m14322();
            c9069M14318.f23109 = new C9549(viewInflate, file, str, c9516M12831, listM12829, c9539);
            c9069M14318.m14322();
            c9069M14318.f23117 = false;
            c9069M14318.m14319();
        } else {
            C9041.m14296(AbstractC9234.m14531(2729)).m14300();
        }
        return true;
    }
}
