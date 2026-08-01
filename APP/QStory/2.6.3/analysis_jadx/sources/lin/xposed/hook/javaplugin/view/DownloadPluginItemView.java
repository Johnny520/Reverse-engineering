package lin.xposed.hook.javaplugin.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.RunnableC3742;
import io.ktor.client.plugins.AbstractC3933;
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
import p010.AbstractC6185;
import p032.DialogC6331;
import p037.C6368;
import p037.C6369;
import p053.AbstractC6561;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class DownloadPluginItemView extends PluginItemView {
    private final TextView downloadCountTextView;
    private final ImageView downloadImage;
    private final TextView uploadTimeTextView;

    public DownloadPluginItemView(Context context) {
        super(context);
        this.downloadImage = (ImageView) findViewById(R.id.plugin_download_image);
        this.downloadCountTextView = (TextView) findViewById(R.id.plugin_download_count);
        this.uploadTimeTextView = (TextView) findViewById(R.id.plugin_upload_time);
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
        File file = new File(AbstractC3933.m8311(AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜呜喵喵呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵呜喵")), AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵呜喵呜呜喵~喵喵喵喵喵喵喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜喵喵呜~喵呜喵喵呜呜喵喵") + j + AbstractC8405.m13973("喵呜喵呜呜呜喵呜~喵喵喵喵呜呜呜呜~喵喵喵呜喵喵呜呜~喵喵喵呜呜喵喵喵"));
        onlinePluginTool.downloadScript(j, file);
        AbstractC6561.m12063(file.getAbsolutePath(), AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵呜喵呜~喵喵喵呜喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜喵呜~喵喵喵喵呜呜呜呜")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setDownloadClick$1(DialogC6331 dialogC6331) {
        dialogC6331.f17453.setText(AbstractC8405.m13972(741));
        String strM13972 = AbstractC8405.m13972(742);
        TextView textView = dialogC6331.f17451;
        if (textView.getVisibility() == 8) {
            textView.setVisibility(0);
        }
        textView.setText(strM13972);
        dialogC6331.f17447 = true;
        dialogC6331.f17448.setVisibility(8);
        AbstractC6185.m11592(AbstractC8405.m13972(743));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setDownloadClick$2(long j, View view) {
        DialogC6331 dialogC6331 = new DialogC6331(getContext());
        dialogC6331.f17453.setText(AbstractC8405.m13972(739));
        String str = AbstractC8405.m13972(740) + j;
        TextView textView = dialogC6331.f17451;
        int i = 0;
        if (textView.getVisibility() == 8) {
            textView.setVisibility(0);
        }
        textView.setText(str);
        dialogC6331.show();
        C6368 c6368 = new C6368();
        c6368.f17525 = new RunnableC3742(c6368, 9, new C5542(j));
        c6368.f17524 = new RunnableC5541(dialogC6331, i);
        HashMap map = C6368.f17523;
        ExecutorService executorService = (ExecutorService) map.get(DownloadPluginItemView.class);
        if (executorService == null) {
            C6369 c6369 = new C6369(1, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            map.put(DownloadPluginItemView.class, c6369);
            executorService = c6369;
        }
        executorService.execute(c6368.f17525);
    }

    private void setDownloadCountText(int i) {
        this.downloadCountTextView.setText(AbstractC8405.m13972(738) + i);
    }

    private void setUploadTimeText(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC8405.m13972(736));
        this.uploadTimeTextView.setText(AbstractC8405.m13972(737) + simpleDateFormat.format(date));
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
        setAuthorText(AbstractC8405.m13973("呜喵喵呜喵呜呜呜~呜呜喵喵呜喵喵喵~呜呜呜喵喵呜呜喵~呜喵喵喵喵喵喵喵~呜呜呜喵喵呜喵呜~呜呜呜喵呜喵喵呜~喵呜喵呜呜喵呜呜") + pluginInfo.getPluginAuthor());
        setDescText(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜呜喵呜呜~呜呜呜呜呜喵呜喵~呜喵喵喵呜呜喵喵~呜呜喵呜呜呜呜喵~呜呜呜喵喵呜呜呜~喵呜喵呜呜喵呜呜") + pluginInfo.getPluginDesc());
        setPluginVersionText(AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜呜呜呜呜喵喵~呜呜呜呜喵喵呜喵~呜喵喵喵呜呜呜喵~呜呜呜呜呜喵喵呜~呜呜喵喵喵喵喵喵~喵呜喵呜呜喵呜呜") + pluginInfo.getPluginVersion());
        setPluginIdText(AbstractC8405.m13973("喵喵呜呜呜喵呜喵~喵喵呜呜喵喵喵呜~喵呜喵喵喵喵喵喵") + pluginInfo.getPluginID());
        setDownloadCountText(pluginVO.getDownloadCount());
        setUploadTimeText(pluginVO.getCreateTime());
        setOnClickListener(this);
    }

    public void setDownloadClick(final long j) {
        this.downloadImage.setOnClickListener(new View.OnClickListener() { // from class: lin.xposed.hook.javaplugin.view.飘花落叶言子楪世苏哲兰
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15297.lambda$setDownloadClick$2(j, view);
            }
        });
    }
}
