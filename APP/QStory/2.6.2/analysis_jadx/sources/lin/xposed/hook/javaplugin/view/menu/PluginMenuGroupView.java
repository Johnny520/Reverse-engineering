package lin.xposed.hook.javaplugin.view.menu;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.AbstractC0053;
import androidx.fragment.app.RunnableC2346;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.util.Iterator;
import java.util.Map;
import lin.xposed.hook.javaplugin.PluginCallback;
import lin.xposed.hook.javaplugin.controller.PluginLoader;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.view.ViewOnClickListenerC5543;
import lin.xposed.hook.javaplugin.view.menu.PluginMenuGroupView;
import p010.AbstractC6154;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMenuGroupView extends LinearLayout {
    private final PluginLoader pluginLoader;
    private final TextView pluginNameTextView;

    public PluginMenuGroupView(Context context, PluginLoader pluginLoader) {
        super(context);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.plugin_menu_item_group, this);
        this.pluginLoader = pluginLoader;
        TextView textView = (TextView) findViewById(R.id.plugin_menu_name);
        this.pluginNameTextView = textView;
        String pluginName = pluginLoader.getJavaPluginInfo().getPluginName();
        textView.setText(pluginName);
        textView.setOnClickListener(new ViewOnClickListenerC5543(this, pluginName, pluginLoader, 1));
        initView();
    }

    private void initView() {
        PluginLoader pluginLoader = this.pluginLoader;
        Map<String, String> map = pluginLoader.dialogItemMap;
        Map<String, String> map2 = pluginLoader.temporaryItemMap;
        if (map.isEmpty() && map2.isEmpty()) {
            setVisibility(8);
            return;
        }
        Iterator<Map.Entry<String, String>> it = map2.entrySet().iterator();
        while (true) {
            final int i = 0;
            if (!it.hasNext()) {
                break;
            }
            final String key = it.next().getKey();
            LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.plugin_menu_btn_layout, (ViewGroup) null, false);
            Button button = (Button) linearLayout.findViewById(R.id.plugin_menu_btn);
            button.setText(key);
            button.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言世哲兰楪子苏.飘花落叶言子楪世苏哲兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ PluginMenuGroupView f17368;

                {
                    this.f17368 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    String str = key;
                    PluginMenuGroupView pluginMenuGroupView = this.f17368;
                    switch (i2) {
                        case 0:
                            pluginMenuGroupView.lambda$initView$2(str, view);
                            break;
                        default:
                            pluginMenuGroupView.lambda$initView$3(str, view);
                            break;
                    }
                }
            });
            addView(linearLayout);
        }
        Iterator<Map.Entry<String, String>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            final String key2 = it2.next().getKey();
            LinearLayout linearLayout2 = (LinearLayout) LayoutInflater.from(getContext()).inflate(R.layout.plugin_menu_btn_layout, (ViewGroup) null, false);
            Button button2 = (Button) linearLayout2.findViewById(R.id.plugin_menu_btn);
            button2.setText(key2);
            final int i2 = 1;
            button2.setOnClickListener(new View.OnClickListener(this) { // from class: 飘花落叶言世哲兰楪子苏.飘花落叶言子楪世苏哲兰

                /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
                public final /* synthetic */ PluginMenuGroupView f17368;

                {
                    this.f17368 = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i2;
                    String str = key2;
                    PluginMenuGroupView pluginMenuGroupView = this.f17368;
                    switch (i22) {
                        case 0:
                            pluginMenuGroupView.lambda$initView$2(str, view);
                            break;
                        default:
                            pluginMenuGroupView.lambda$initView$3(str, view);
                            break;
                    }
                }
            });
            addView(linearLayout2);
        }
    }

    private void invokeInPluginMenuCallback(String str) {
        PluginCallback.onMenuCallback(this.pluginLoader, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$2(String str, View view) {
        PluginCallback.onMenuTemporaryCallback(this.pluginLoader, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$3(String str, View view) {
        invokeInPluginMenuCallback(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(PluginLoader pluginLoader, String str) {
        try {
            try {
                pluginLoader.loadPlugin();
            } catch (Exception e) {
                AbstractC6154.m11561(AbstractC3056.m6668(-3937638416628581799L) + Log.getStackTraceString(e));
                PluginManager.stopPlugin(pluginLoader.getJavaPluginInfo());
            }
        } finally {
            this.pluginNameTextView.setText(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(String str, PluginLoader pluginLoader, View view) {
        TextView textView = this.pluginNameTextView;
        StringBuilder sbM149 = AbstractC0053.m149(str);
        sbM149.append(AbstractC3056.m6668(-3937638476758123943L));
        textView.setText(sbM149.toString());
        pluginLoader.stopPlugin();
        TextView textView2 = this.pluginNameTextView;
        StringBuilder sbM1492 = AbstractC0053.m149(str);
        sbM1492.append(AbstractC3056.m6668(-3937638515412829607L));
        textView2.setText(sbM1492.toString());
        new Thread(new RunnableC2346(this, pluginLoader, str, 5)).start();
    }
}
