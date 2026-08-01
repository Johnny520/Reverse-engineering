package lin.xposed.hook.javaplugin.dialog;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.LinearLayout;
import androidx.compose.material.ripple.RunnableC1945;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.util.C4596;
import com.lxj.xpopup.core.AbstractC4613;
import com.lxj.xpopup.core.C4616;
import com.lxj.xpopup.util.AbstractC4620;
import java.util.Iterator;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.view.menu.PluginMenuGroupView;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMenuDialog extends AbstractC4613 {
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
        AbstractC3888.m7247(context);
        C4596 c4596 = new C4596(context, 1);
        C4616 c4616 = new C4616();
        c4616.f12159 = true;
        PluginMenuDialog pluginMenuDialog = new PluginMenuDialog(c4596);
        pluginMenuDialog.popupInfo = c4616;
        pluginMenuDialog.show();
    }

    @Override // com.lxj.xpopup.core.AbstractC4613, com.lxj.xpopup.core.AbstractC4608
    public int getImplLayoutId() {
        return C0328R.layout.plugin_menu_dialog;
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public int getMaxHeight() {
        return (int) (AbstractC4620.m8661(getContext()) * 0.5f);
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public int getPopupHeight() {
        return (int) (AbstractC4620.m8661(getContext()) * 0.5f);
    }

    public synchronized void noticeViewUpdate() {
        this.handler.post(new RunnableC1945(this, 9));
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public void onCreate() {
        Instance = this;
        this.pluginMenuGroup = (LinearLayout) findViewById(C0328R.id.plugin_menu_container);
        initView();
    }

    @Override // com.lxj.xpopup.core.AbstractC4608
    public void onDismiss() {
        Iterator<PluginLoader> it = PluginManager.getAllRunningPluginLoader().iterator();
        while (it.hasNext()) {
            it.next().temporaryItemMap.clear();
        }
    }
}
