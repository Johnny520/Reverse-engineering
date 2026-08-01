package lin.xposed.hook.view.main.itemview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.ui.platform.RunnableC1898;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.util.List;
import lin.xposed.BuildConfig;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import lin.xposed.hook.view.main.itemview.Update;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p010.AbstractC6154;
import p010.AbstractC6157;
import p027.DialogC6300;
import p175.AbstractC7738;
import p257.C8197;
import p349.C8865;
import retrofit2.C5754;
import retrofit2.InterfaceC5777;
import retrofit2.InterfaceC5794;
import top.suzhelan.qstory.entity.HasUpdate;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.entity.UpdateInfo;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class Update extends OtherViewItemInfo {
    private static HasUpdate hasUpdate;
    private static List<UpdateInfo> updateInfoList;

    public Update(Context context) {
        super(context);
    }

    public static void detectUpdates() {
        new Thread(new RunnableC1898(3)).start();
    }

    public static int getLatestVersionCode() {
        try {
            return hasUpdate.getVersion();
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String getLatestVersionName() {
        try {
            return updateInfoList.get(0).getVersionName();
        } catch (Exception unused) {
            return "?";
        }
    }

    public static String getUpdateLog() {
        try {
            StringBuilder sb = new StringBuilder();
            for (UpdateInfo updateInfo : updateInfoList) {
                sb.append("v");
                sb.append(updateInfo.getVersionName());
                sb.append("\n");
                sb.append(updateInfo.getUpdateLog());
                sb.append("\n\n");
            }
            return sb.toString();
        } catch (Exception unused) {
            return "\u8bf7\u524d\u5f80TG\u9891\u9053\u67e5\u770b\u66f4\u65b0\u65e5\u5fd7";
        }
    }

    public static String getUpdateUrl() {
        try {
            return "https://qstory.suzhelan.top/update/download?version=" + updateInfoList.get(0).getVersionCode();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean hasUpdate() {
        try {
            return hasUpdate.getHasUpdate();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void jumpToBrowserUpdates(String str) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        AbstractC7738.m13031().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$detectUpdates$0() {
        try {
            HasUpdate hasUpdate2 = (HasUpdate) ((QSResult) C8865.m14508().m14499(BuildConfig.VERSION_CODE).execute().f15756).getData();
            hasUpdate = hasUpdate2;
            if (hasUpdate2.getHasUpdate()) {
                updateInfoList = (List) ((QSResult) C8865.m14508().m14498(BuildConfig.VERSION_CODE).execute().f15756).getData();
            }
        } catch (Exception e) {
            String strM6668 = "t-update";
            String str = AbstractC6157.f16779;
            AbstractC6157.m11574(strM6668, e.toString(), e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getOnClick$4(final View view) {
        C8197.m13690("\u6b63\u5728\u68c0\u67e5\u66f4\u65b0...");
        C8865.m14508().m14499(BuildConfig.VERSION_CODE).mo11106(new InterfaceC5794() { // from class: lin.xposed.hook.view.main.itemview.Update.1

            /* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.Update$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
            public class C55591 implements InterfaceC5794 {
                public C55591() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ void lambda$onResponse$0(View view) {
                    if (Update.mandatoryUpdate()) {
                        Update.jumpToBrowserUpdates(Update.getUpdateUrl());
                    } else if (Update.hasUpdate()) {
                        Update.showUpdateDialog((Activity) view.getContext(), null);
                    } else {
                        AbstractC6154.m11561("\u65e0\u66f4\u65b0 \u5f53\u524d\u662f\u6700\u65b0\u7248\u672c .. ");
                    }
                }

                @Override // retrofit2.InterfaceC5794
                public void onFailure(InterfaceC5777<QSResult<List<UpdateInfo>>> interfaceC5777, Throwable th) {
                    AbstractC6154.m11561("\u83b7\u53d6\u66f4\u65b0\u65e5\u5fd7\u5931\u8d25:" + th);
                    String strM6668 = "update";
                    String str = AbstractC6157.f16779;
                    AbstractC6157.m11574(strM6668, th.toString(), th, true);
                    C8197.m13693();
                }

                @Override // retrofit2.InterfaceC5794
                public void onResponse(InterfaceC5777<QSResult<List<UpdateInfo>>> interfaceC5777, C5754<QSResult<List<UpdateInfo>>> c5754) {
                    C8197.m13693();
                    Update.updateInfoList = (List) ((QSResult) c5754.f15756).getData();
                    Handler handler = new Handler(Looper.getMainLooper());
                    final View view = view;
                    handler.post(new Runnable() { // from class: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世兰哲苏
                        @Override // java.lang.Runnable
                        public final void run() {
                            Update.AnonymousClass1.C55591.lambda$onResponse$0(view);
                        }
                    });
                }
            }

            @Override // retrofit2.InterfaceC5794
            public void onFailure(InterfaceC5777<QSResult<HasUpdate>> interfaceC5777, Throwable th) {
                AbstractC6154.m11561("\u68c0\u67e5\u66f4\u65b0\u5931\u8d25:" + th);
                String strM6668 = "update";
                String str = AbstractC6157.f16779;
                AbstractC6157.m11574(strM6668, th.toString(), th, true);
                C8197.m13693();
            }

            @Override // retrofit2.InterfaceC5794
            public void onResponse(InterfaceC5777<QSResult<HasUpdate>> interfaceC5777, C5754<QSResult<HasUpdate>> c5754) {
                Update.hasUpdate = (HasUpdate) ((QSResult) c5754.f15756).getData();
                C8865.m14508().m14498(BuildConfig.VERSION_CODE).mo11106(new C55591());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showUpdateDialog$1(View.OnClickListener onClickListener, DialogInterface dialogInterface) {
        if (onClickListener != null) {
            onClickListener.onClick(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showUpdateDialog$2(View view) {
        jumpToBrowserUpdates(getUpdateUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showUpdateDialog$3(DialogC6300 dialogC6300, View.OnClickListener onClickListener, View view) {
        dialogC6300.dismiss();
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static boolean mandatoryUpdate() {
        try {
            return hasUpdate.isForceUpdate();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void showUpdateDialog(Activity activity, final View.OnClickListener onClickListener) {
        DialogC6300 dialogC6300 = new DialogC6300(activity);
        dialogC6300.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世哲兰苏
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Update.lambda$showUpdateDialog$1(onClickListener, dialogInterface);
            }
        });
        int i = 0;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(R.layout.update_layout, (ViewGroup) null, false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.update_title);
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.update_log);
        Button button = (Button) viewGroup.findViewById(R.id.goToUpdate);
        Button button2 = (Button) viewGroup.findViewById(R.id.cancelUpdate);
        if (mandatoryUpdate()) {
            button2.setVisibility(8);
            viewGroup.findViewById(R.id.view_separated).setVisibility(8);
            dialogC6300.setCancelable(false);
            dialogC6300.setCanceledOnTouchOutside(false);
        }
        button.setOnClickListener(new ViewOnClickListenerC5532(7));
        button2.setOnClickListener(new ViewOnClickListenerC5561(dialogC6300, i, onClickListener));
        textView2.setText(getUpdateLog());
        textView.setText("\u6709\u65b0\u66f4\u65b0 v" + getLatestVersionName());
        dialogC6300.setContentView(viewGroup);
        dialogC6300.show();
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "\u68c0\u6d4b\u66f4\u65b0";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5565(this, 3);
    }
}
