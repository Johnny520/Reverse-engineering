package lin.xposed.hook.javaplugin.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3054;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.kongzue.dialogx.interfaces.RunnableC3741;
import io.ktor.client.plugins.AbstractC3932;
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
import p010.AbstractC6154;
import p031.DialogC6312;
import p036.C6351;
import p036.C6352;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        File file = new File(AbstractC3932.m8321(AbstractC3056.m6668(-3937640289234322855L)), AbstractC3056.m6668(-3937640181860140455L) + j + AbstractC3056.m6668(-3937640216219878823L));
        onlinePluginTool.downloadScript(j, file);
        AbstractC3054.m6577(file.getAbsolutePath(), AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937620425010578855L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setDownloadClick$1(DialogC6312 dialogC6312) {
        dialogC6312.f17404.setText(AbstractC3056.m6668(-3937640323594061223L));
        String strM6668 = AbstractC3056.m6668(-3937640345068897703L);
        TextView textView = dialogC6312.f17402;
        if (textView.getVisibility() == 8) {
            textView.setVisibility(0);
        }
        textView.setText(strM6668);
        dialogC6312.f17398 = true;
        dialogC6312.f17399.setVisibility(8);
        AbstractC6154.m11561(AbstractC3056.m6668(-3937640297824257447L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setDownloadClick$2(long j, View view) {
        DialogC6312 dialogC6312 = new DialogC6312(getContext());
        dialogC6312.f17404.setText(AbstractC3056.m6668(-3937640508277654951L));
        String str = AbstractC3056.m6668(-3937640383723603367L) + j;
        TextView textView = dialogC6312.f17402;
        int i = 0;
        if (textView.getVisibility() == 8) {
            textView.setVisibility(0);
        }
        textView.setText(str);
        dialogC6312.show();
        C6351 c6351 = new C6351();
        c6351.f17479 = new RunnableC3741(c6351, 9, new C5541(j));
        c6351.f17478 = new RunnableC5540(dialogC6312, i);
        HashMap map = C6351.f17477;
        ExecutorService executorService = (ExecutorService) map.get(DownloadPluginItemView.class);
        if (executorService == null) {
            C6352 c6352 = new C6352(1, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
            map.put(DownloadPluginItemView.class, c6352);
            executorService = c6352;
        }
        executorService.execute(c6351.f17479);
    }

    private void setDownloadCountText(int i) {
        this.downloadCountTextView.setText(AbstractC3056.m6668(-3937640448148112807L) + i);
    }

    private void setUploadTimeText(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC3056.m6668(-3937640645716608423L));
        this.uploadTimeTextView.setText(AbstractC3056.m6668(-3937640559817262503L) + simpleDateFormat.format(date));
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
        setAuthorText(AbstractC3056.m6668(-3937640714436085159L) + pluginInfo.getPluginAuthor());
        setDescText(AbstractC3056.m6668(-3937640697256215975L) + pluginInfo.getPluginDesc());
        setPluginVersionText(AbstractC3056.m6668(-3937640611356870055L) + pluginInfo.getPluginVersion());
        setPluginIdText(AbstractC3056.m6668(-3937640594177000871L) + pluginInfo.getPluginID());
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
