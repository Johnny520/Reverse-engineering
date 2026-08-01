package lin.xposed.hook.javaplugin.dialog;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.LinearLayout;
import androidx.compose.material.ripple.RunnableC1107;
import com.bumptech.glide.AbstractC3065;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.util.C3763;
import com.lxj.xpopup.core.AbstractC3780;
import com.lxj.xpopup.core.C3783;
import com.lxj.xpopup.util.AbstractC3787;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.view.menu.PluginMenuGroupView;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMenuDialog extends AbstractC3780 {
    public static PluginMenuDialog Instance;
    public Handler handler;
    private LinearLayout pluginMenuGroup;

    public PluginMenuDialog(Context context) {
        super(context);
        this.handler = new Handler(Looper.getMainLooper());
    }

    public static PluginMenuDialog getCurrentInstance() {
        return Instance;
    }

    private void initView() {
        Iterator<PluginLoader> it = PluginManager.getAllRunningPluginLoader().iterator();
        while (it.hasNext()) {
            this.pluginMenuGroup.addView(new PluginMenuGroupView(getContext(), it.next()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$noticeViewUpdate$0() {
        this.pluginMenuGroup.removeAllViews();
        initView();
    }

    public static void showDialog(Context context) {
        AbstractC3065.m6858(context);
        C3763 c3763 = new C3763(context, 1);
        C3783 c3783 = new C3783();
        c3783.f11809 = true;
        PluginMenuDialog pluginMenuDialog = new PluginMenuDialog(c3763);
        pluginMenuDialog.popupInfo = c3783;
        pluginMenuDialog.show();
    }

    @Override // com.lxj.xpopup.core.AbstractC3780, com.lxj.xpopup.core.AbstractC3775
    public int getImplLayoutId() {
        return R.layout.plugin_menu_dialog;
    }

    @Override // com.lxj.xpopup.core.AbstractC3775
    public int getMaxHeight() {
        return (int) (AbstractC3787.m8115(getContext()) * 0.5f);
    }

    @Override // com.lxj.xpopup.core.AbstractC3775
    public int getPopupHeight() {
        return (int) (AbstractC3787.m8115(getContext()) * 0.5f);
    }

    public synchronized void noticeViewUpdate() {
        this.handler.post(new RunnableC1107(this, 9));
    }

    @Override // com.lxj.xpopup.core.AbstractC3775
    public void onCreate() {
        Instance = this;
        this.pluginMenuGroup = (LinearLayout) findViewById(R.id.plugin_menu_container);
        initView();
    }

    @Override // com.lxj.xpopup.core.AbstractC3775
    public void onDismiss() {
        Iterator<PluginLoader> it = PluginManager.getAllRunningPluginLoader().iterator();
        while (it.hasNext()) {
            it.next().temporaryItemMap.clear();
        }
    }
}
