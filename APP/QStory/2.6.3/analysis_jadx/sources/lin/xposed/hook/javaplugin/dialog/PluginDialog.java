package lin.xposed.hook.javaplugin.dialog;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.foundation.lazy.layout.C0707;
import com.alibaba.fastjson2.reader.C2700;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3055;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3749;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.C5532;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.util.PluginDemoBuildUtil;
import lin.xposed.hook.javaplugin.view.PluginItemView;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p257.C8233;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginDialog {
    private List<PluginInfo> currentPluginList;
    private String currentSortType;
    private final C8233 dialog;
    private ProgressBar loadingView;
    private final String pluginDir;
    private LinearLayout pluginListContainer;
    private View rootView;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public interface PluginLoadCallback {
        void notificationError();

        void notificationLoad(boolean z);
    }

    public PluginDialog(Context context) {
        C8233 c8233M13752 = C8233.m13752();
        this.dialog = c8233M13752;
        this.pluginDir = AbstractC3933.m8315().concat(AbstractC8405.m13972(684));
        this.currentPluginList = new ArrayList();
        this.currentSortType = AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵呜呜喵呜");
        c8233M13752.f22722 = new AbstractC3749(R.layout.dialog_java_plugin_pager) { // from class: lin.xposed.hook.javaplugin.dialog.PluginDialog.1
            @Override // com.kongzue.dialogx.interfaces.AbstractC3749
            public void onBind(C8233 c8233, View view) {
                PluginDialog.this.rootView = view;
                PluginDialog.this.initViews();
                PluginDialog.this.setupPluginList();
                PluginDialog.this.loadPlugins();
            }
        };
        c8233M13752.m13753();
    }

    private void displayPlugins(List<PluginInfo> list) {
        this.pluginListContainer.removeAllViews();
        for (PluginInfo pluginInfo : list) {
            PluginItemView pluginItemView = new PluginItemView(this.rootView.getContext());
            pluginItemView.setPluginDialog(this);
            pluginItemView.bindPluginInfoData(pluginInfo);
            this.pluginListContainer.addView(pluginItemView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void filterPlugins(String str) {
        if (str == null || str.isEmpty()) {
            displayPlugins(this.currentPluginList);
            return;
        }
        ArrayList arrayList = new ArrayList();
        String lowerCase = str.toLowerCase();
        for (PluginInfo pluginInfo : this.currentPluginList) {
            if (pluginInfo.getPluginName().toLowerCase().contains(lowerCase) || pluginInfo.getPluginVersion().toLowerCase().contains(lowerCase) || pluginInfo.getPluginAuthor().toLowerCase().contains(lowerCase)) {
                arrayList.add(pluginInfo);
            }
        }
        displayPlugins(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initViews() {
        final int i = 0;
        ((TextView) this.rootView.findViewById(R.id.btn_back)).setOnClickListener(new View.OnClickListener(this) { // from class: lin.xposed.hook.javaplugin.dialog.飘花落叶言子楪世苏兰哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ PluginDialog f15281;

            {
                this.f15281 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                PluginDialog pluginDialog = this.f15281;
                switch (i2) {
                    case 0:
                        pluginDialog.lambda$initViews$0(view);
                        break;
                    case 1:
                        pluginDialog.lambda$initViews$1(view);
                        break;
                    default:
                        pluginDialog.lambda$initViews$4(view);
                        break;
                }
            }
        });
        TextView textView = (TextView) this.rootView.findViewById(R.id.plugin_path);
        textView.setText(AbstractC8405.m13972(685) + this.pluginDir);
        final int i2 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: lin.xposed.hook.javaplugin.dialog.飘花落叶言子楪世苏兰哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ PluginDialog f15281;

            {
                this.f15281 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                PluginDialog pluginDialog = this.f15281;
                switch (i22) {
                    case 0:
                        pluginDialog.lambda$initViews$0(view);
                        break;
                    case 1:
                        pluginDialog.lambda$initViews$1(view);
                        break;
                    default:
                        pluginDialog.lambda$initViews$4(view);
                        break;
                }
            }
        });
        final int i3 = 2;
        ((Button) this.rootView.findViewById(R.id.create_demo_plugin)).setOnClickListener(new View.OnClickListener(this) { // from class: lin.xposed.hook.javaplugin.dialog.飘花落叶言子楪世苏兰哲

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ PluginDialog f15281;

            {
                this.f15281 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                PluginDialog pluginDialog = this.f15281;
                switch (i22) {
                    case 0:
                        pluginDialog.lambda$initViews$0(view);
                        break;
                    case 1:
                        pluginDialog.lambda$initViews$1(view);
                        break;
                    default:
                        pluginDialog.lambda$initViews$4(view);
                        break;
                }
            }
        });
        ((Button) this.rootView.findViewById(R.id.scriptDevelopmentDocumentation_btn)).setOnClickListener(new ViewOnClickListenerC5533(i));
        this.loadingView = (ProgressBar) this.rootView.findViewById(R.id.pb_loading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        this.dialog.m13755();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view) {
        AbstractC4922.m9890(this.rootView.getContext(), this.pluginDir);
        AbstractC6185.m11592(AbstractC8405.m13972(691));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$2(View view) {
        AbstractC6185.m11592(AbstractC8405.m13972(690));
        this.dialog.m13755();
        new PluginDialog(view.getContext()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initViews$3(View view) {
        try {
            new PluginDemoBuildUtil().createDemoPlugin(view.getContext());
            new Handler(Looper.getMainLooper()).post(new RunnableC5535(this, view, 0));
        } catch (Exception e) {
            AbstractC6185.m11592(AbstractC8405.m13972(688));
            String strM13972 = AbstractC8405.m13972(689);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$4(View view) {
        new Thread(new RunnableC5535(this, view, 1)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$initViews$5(View view) {
        Intent intent = new Intent();
        intent.setAction(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR));
        intent.setData(Uri.parse(AbstractC8405.m13972(687)));
        AbstractC3055.m6653().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setupPluginList$6(View view) {
        AbstractC6185.m11592(AbstractC8405.m13972(686));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$sortPlugins$7(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null) {
            return 1;
        }
        if (str2 == null) {
            return -1;
        }
        return str2.compareTo(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadPlugins() {
        this.loadingView.setVisibility(0);
        PluginInfo[] pluginInfoArrScanAllJavaPluginInfo = scanAllJavaPluginInfo();
        this.currentPluginList.clear();
        for (PluginInfo pluginInfo : pluginInfoArrScanAllJavaPluginInfo) {
            this.currentPluginList.add(pluginInfo);
        }
        displayPlugins(this.currentPluginList);
        this.loadingView.setVisibility(8);
    }

    private PluginInfo[] scanAllJavaPluginInfo() {
        File[] fileArrScanScriptDirectory = scanScriptDirectory();
        ArrayList arrayList = new ArrayList();
        if (fileArrScanScriptDirectory == null) {
            return (PluginInfo[]) arrayList.toArray(new PluginInfo[0]);
        }
        for (File file : fileArrScanScriptDirectory) {
            PluginInfo pluginInfoNewPluginInfo = PluginManager.newPluginInfo(file);
            if (pluginInfoNewPluginInfo != null) {
                arrayList.add(pluginInfoNewPluginInfo);
            }
        }
        return (PluginInfo[]) arrayList.toArray(new PluginInfo[0]);
    }

    private File[] scanScriptDirectory() {
        return new File(AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜"))).listFiles(new C5532(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupPluginList() {
        FrameLayout frameLayout = (FrameLayout) this.rootView.findViewById(R.id.box);
        View viewInflate = LayoutInflater.from(this.rootView.getContext()).inflate(R.layout.item_java_plugin_pager, (ViewGroup) frameLayout, false);
        this.pluginListContainer = (LinearLayout) viewInflate.findViewById(R.id.rv_plugin_list);
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_search);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_sort);
        editText.addTextChangedListener(new TextWatcher() { // from class: lin.xposed.hook.javaplugin.dialog.PluginDialog.2
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                PluginDialog.this.filterPlugins(charSequence.toString());
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
        textView.setOnClickListener(new ViewOnClickListenerC5533(1));
        frameLayout.addView(viewInflate);
    }

    private void sortPlugins(String str) {
        ArrayList arrayList = new ArrayList(this.currentPluginList);
        arrayList.sort(Comparator.comparing(new C2700(11), new C0707(5)));
        displayPlugins(arrayList);
    }

    public void removePluginView(PluginItemView pluginItemView) {
        this.pluginListContainer.removeView(pluginItemView);
    }

    public void show() {
        this.dialog.m13754();
    }

    public void switchToLocalScript() {
        loadPlugins();
    }

    public void switchToAnOnlineScript() {
    }
}
