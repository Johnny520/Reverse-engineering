package lin.xposed.hook.javaplugin.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.kongzue.dialogx.interfaces.RunnableC4574;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import lin.xposed.hook.javaplugin.bean.PluginInfo;
import lin.xposed.hook.javaplugin.online.OnlinePluginTool;
import lin.xposed.hook.javaplugin.online.bean.PluginVO;
import p026.AbstractC7014;
import p048.DialogC7160;
import p053.C7197;
import p053.C7198;
import p069.AbstractC7390;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DownloadPluginItemView extends PluginItemView {
    private final TextView downloadCountTextView;
    private final ImageView downloadImage;
    private final TextView uploadTimeTextView;

    public DownloadPluginItemView(Context context) {
        super(context);
        this.downloadImage = (ImageView) findViewById(C0328R.id.plugin_download_image);
        this.downloadCountTextView = (TextView) findViewById(C0328R.id.plugin_download_count);
        this.uploadTimeTextView = (TextView) findViewById(C0328R.id.plugin_upload_time);
        hideLocalPluginView();
        showOnlinePluginView();
    }

    private void hideLocalPluginView() {
        this.progressBar.setVisibility(8);
        this.autoLoadCheckbox.setVisibility(8);
        this.pluginSwitch.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setDownloadClick$0(long j) throws Exception {
        OnlinePluginTool onlinePluginTool = new OnlinePluginTool();
        File file = new File(AbstractC4765.m8870(AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵")), AbstractC9234.m14532("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵呜~喵呜喵喵呜呜喵喵") + j + AbstractC9234.m14532("喵呜喵呜呜呜喵呜~喵喵喵喵呜呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵呜呜喵喵喵"));
        onlinePluginTool.downloadScript(j, file);
        AbstractC7390.m12622(file.getAbsolutePath(), AbstractC4765.m8874().concat(AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setDownloadClick$1(DialogC7160 dialogC7160) {
        dialogC7160.f17798.setText(AbstractC9234.m14531(741));
        String strM14531 = AbstractC9234.m14531(742);
        TextView textView = dialogC7160.f17796;
        if (textView.getVisibility() == 8) {
            textView.setVisibility(0);
        }
        textView.setText(strM14531);
        dialogC7160.f17792 = true;
        dialogC7160.f17793.setVisibility(8);
        AbstractC7014.m12151(AbstractC9234.m14531(743));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setDownloadClick$2(long j, View view) {
        DialogC7160 dialogC7160 = new DialogC7160(getContext());
        dialogC7160.f17798.setText(AbstractC9234.m14531(739));
        String str = AbstractC9234.m14531(740) + j;
        TextView textView = dialogC7160.f17796;
        int i = 0;
        if (textView.getVisibility() == 8) {
            textView.setVisibility(0);
        }
        textView.setText(str);
        dialogC7160.show();
        C7197 c7197 = new C7197();
        c7197.f17870 = new RunnableC4574(c7197, 9, new C6373(j));
        c7197.f17869 = new RunnableC6372(dialogC7160, i);
        HashMap map = C7197.f17868;
        ExecutorService executorService = (ExecutorService) map.get(DownloadPluginItemView.class);
        if (executorService == null) {
            C7198 c7198 = new C7198(1, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            map.put(DownloadPluginItemView.class, c7198);
            executorService = c7198;
        }
        executorService.execute(c7197.f17870);
    }

    private void setDownloadCountText(int i) {
        this.downloadCountTextView.setText(AbstractC9234.m14531(738) + i);
    }

    private void setUploadTimeText(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC9234.m14531(736));
        this.uploadTimeTextView.setText(AbstractC9234.m14531(737) + simpleDateFormat.format(date));
    }

    private void showOnlinePluginView() {
        this.downloadImage.setVisibility(0);
        this.downloadCountTextView.setVisibility(0);
        this.uploadTimeTextView.setVisibility(0);
    }

    public void bindPluginData(PluginVO pluginVO) {
        PluginInfo pluginInfo = pluginVO.getPluginInfo();
        this.pluginInfo = pluginInfo;
        setDownloadClick(pluginVO.getCloudId());
        setPluginNameText(pluginInfo.getPluginName());
        setAuthorText(AbstractC9234.m14532("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵喵喵~呜呜呜喵喵呜呜喵~呜喵喵喵喵喵喵喵~呜呜呜喵喵呜喵呜~呜呜呜喵呜喵喵呜~喵呜喵呜呜喵呜呜") + pluginInfo.getPluginAuthor());
        setDescText(AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜喵呜呜喵呜呜~呜呜呜呜呜喵呜喵~呜喵喵喵呜呜喵喵~呜呜喵呜呜呜呜喵~呜呜呜喵喵呜呜呜~喵呜喵呜呜喵呜呜") + pluginInfo.getPluginDesc());
        setPluginVersionText(AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜呜呜呜呜喵喵~呜呜呜呜喵喵呜喵~呜喵喵喵呜呜呜喵~呜呜呜呜呜喵喵呜~呜呜喵喵喵喵喵喵~喵呜喵呜呜喵呜呜") + pluginInfo.getPluginVersion());
        setPluginIdText(AbstractC9234.m14532("喵喵呜呜呜喵呜喵~喵喵呜呜喵喵喵呜~喵呜喵喵喵喵喵喵") + pluginInfo.getPluginID());
        setDownloadCountText(pluginVO.getDownloadCount());
        setUploadTimeText(pluginVO.getCreateTime());
        setOnClickListener(this);
    }

    public void setDownloadClick(final long j) {
        this.downloadImage.setOnClickListener(new View.OnClickListener() { // from class: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世苏哲兰
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15642.lambda$setDownloadClick$2(j, view);
            }
        });
    }
}
