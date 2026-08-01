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
import com.alibaba.fastjson2.reader.C2699;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.AbstractC3748;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.controller.C5531;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.util.PluginDemoBuildUtil;
import lin.xposed.hook.javaplugin.view.PluginItemView;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p175.AbstractC7738;
import p257.C8232;
import p316.C8675;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginDialog {
    private List<PluginInfo> currentPluginList;
    private String currentSortType;
    private final C8232 dialog;
    private ProgressBar loadingView;
    private final String pluginDir;
    private LinearLayout pluginListContainer;
    private View rootView;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public interface PluginLoadCallback {
        void notificationError();

        void notificationLoad(boolean z);
    }

    public PluginDialog(Context context) {
        C8232 c8232M13736 = C8232.m13736();
        this.dialog = c8232M13736;
        this.pluginDir = AbstractC3932.m8313().concat("/Plugin/");
        this.currentPluginList = new ArrayList();
        this.currentSortType = "date";
        c8232M13736.f22723 = new AbstractC3748(R.layout.dialog_java_plugin_pager) { // from class: lin.xposed.hook.javaplugin.dialog.PluginDialog.1
            @Override // com.kongzue.dialogx.interfaces.AbstractC3748
            public void onBind(C8232 c8232, View view) {
                PluginDialog.this.rootView = view;
                PluginDialog.this.initViews();
                PluginDialog.this.setupPluginList();
                PluginDialog.this.loadPlugins();
            }
        };
        c8232M13736.m13737();
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
        textView.setText("\u811a\u672c\u5b58\u653e\u4f4d\u7f6e(\u70b9\u51fb\u53ef\u590d\u5236)\uff1a" + this.pluginDir);
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
        ((Button) this.rootView.findViewById(R.id.scriptDevelopmentDocumentation_btn)).setOnClickListener(new ViewOnClickListenerC5532(i));
        this.loadingView = (ProgressBar) this.rootView.findViewById(R.id.pb_loading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$0(View view) {
        this.dialog.m13739();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$1(View view) {
        C8675.m14361(this.rootView.getContext(), this.pluginDir);
        AbstractC6154.m11561("\u590d\u5236\u811a\u672c\u5b58\u653e\u8def\u5f84\u6210\u529f");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$2(View view) {
        AbstractC6154.m11561("\u521b\u5efa\u6210\u529f");
        this.dialog.m13739();
        new PluginDialog(view.getContext()).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initViews$3(View view) {
        try {
            new PluginDemoBuildUtil().createDemoPlugin(view.getContext());
            new Handler(Looper.getMainLooper()).post(new RunnableC5534(this, view, 0));
        } catch (Exception e) {
            AbstractC6154.m11561("\u521b\u5efa\u5931\u8d25");
            String strM6668 = "create demo plugin";
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initViews$4(View view) {
        new Thread(new RunnableC5534(this, view, 1)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$initViews$5(View view) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://artistic-sword-1d7.notion.site/QStory-Java-32d4a5bbff238047b09ec04d68e0299c"));
        AbstractC7738.m13031().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setupPluginList$6(View view) {
        AbstractC6154.m11561("\u5f53\u524d\u9ed8\u8ba4\u6309\u521b\u5efa\u65f6\u95f4\u6392\u5e8f");
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
        return new File(AbstractC3932.m8313().concat("/Plugin")).listFiles(new C5531(0));
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
        textView.setOnClickListener(new ViewOnClickListenerC5532(1));
        frameLayout.addView(viewInflate);
    }

    private void sortPlugins(String str) {
        ArrayList arrayList = new ArrayList(this.currentPluginList);
        arrayList.sort(Comparator.comparing(new C2699(11), new C0707(5)));
        displayPlugins(arrayList);
    }

    public void removePluginView(PluginItemView pluginItemView) {
        this.pluginListContainer.removeView(pluginItemView);
    }

    public void show() {
        this.dialog.m13738();
    }

    public void switchToLocalScript() {
        loadPlugins();
    }

    public void switchToAnOnlineScript() {
    }
}
