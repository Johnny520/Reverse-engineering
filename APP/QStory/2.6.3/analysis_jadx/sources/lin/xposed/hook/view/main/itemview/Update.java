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
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3055;
import com.davemorrissey.labs.subscaleview.R;
import java.util.List;
import lin.xposed.BuildConfig;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import lin.xposed.hook.view.main.itemview.Update;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p028.DialogC6319;
import p257.C8198;
import p287.AbstractC8405;
import p345.C8834;
import retrofit2.C5755;
import retrofit2.InterfaceC5778;
import retrofit2.InterfaceC5795;
import top.suzhelan.qstory.entity.HasUpdate;
import top.suzhelan.qstory.entity.QSResult;
import top.suzhelan.qstory.entity.UpdateInfo;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
            return AbstractC8405.m13973("喵呜喵喵呜呜喵喵");
        }
    }

    public static String getUpdateLog() {
        try {
            StringBuilder sb = new StringBuilder();
            for (UpdateInfo updateInfo : updateInfoList) {
                sb.append(AbstractC8405.m13973("喵喵喵喵喵呜喵呜"));
                sb.append(updateInfo.getVersionName());
                sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜"));
                sb.append(updateInfo.getUpdateLog());
                sb.append(AbstractC8405.m13973("喵呜呜呜呜喵喵呜~喵呜呜呜呜呜呜呜"));
            }
            return sb.toString();
        } catch (Exception unused) {
            return AbstractC8405.m13972(1038);
        }
    }

    public static String getUpdateUrl() {
        try {
            return AbstractC8405.m13972(1037) + updateInfoList.get(0).getVersionCode();
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
        intent.setAction(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR));
        intent.setData(Uri.parse(str));
        AbstractC3055.m6653().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$detectUpdates$0() {
        try {
            HasUpdate hasUpdate2 = (HasUpdate) ((QSResult) C8834.m14489().m14514(BuildConfig.VERSION_CODE).execute().f15756).getData();
            hasUpdate = hasUpdate2;
            if (hasUpdate2.getHasUpdate()) {
                updateInfoList = (List) ((QSResult) C8834.m14489().m14513(BuildConfig.VERSION_CODE).execute().f15756).getData();
            }
        } catch (Exception e) {
            String strM13972 = AbstractC8405.m13972(1042);
            String str = AbstractC6188.f17016;
            AbstractC6188.m11605(strM13972, e.toString(), e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getOnClick$4(final View view) {
        C8198.m13707(AbstractC8405.m13972(1041));
        C8834.m14489().m14514(BuildConfig.VERSION_CODE).mo11163(new InterfaceC5795() { // from class: lin.xposed.hook.view.main.itemview.Update.1

            /* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.Update$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public class C55601 implements InterfaceC5795 {
                public C55601() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ void lambda$onResponse$0(View view) {
                    if (Update.mandatoryUpdate()) {
                        Update.jumpToBrowserUpdates(Update.getUpdateUrl());
                    } else if (Update.hasUpdate()) {
                        Update.showUpdateDialog((Activity) view.getContext(), null);
                    } else {
                        AbstractC6185.m11592(AbstractC8405.m13972(1035));
                    }
                }

                @Override // retrofit2.InterfaceC5795
                public void onFailure(InterfaceC5778<QSResult<List<UpdateInfo>>> interfaceC5778, Throwable th) {
                    AbstractC6185.m11592(AbstractC8405.m13972(1034) + th);
                    String strM13973 = AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜喵呜~喵喵喵呜呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜");
                    String str = AbstractC6188.f17016;
                    AbstractC6188.m11605(strM13973, th.toString(), th, true);
                    C8198.m13710();
                }

                @Override // retrofit2.InterfaceC5795
                public void onResponse(InterfaceC5778<QSResult<List<UpdateInfo>>> interfaceC5778, C5755<QSResult<List<UpdateInfo>>> c5755) {
                    C8198.m13710();
                    Update.updateInfoList = (List) ((QSResult) c5755.f15756).getData();
                    Handler handler = new Handler(Looper.getMainLooper());
                    final View view = view;
                    handler.post(new Runnable() { // from class: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世兰哲苏
                        @Override // java.lang.Runnable
                        public final void run() {
                            Update.AnonymousClass1.C55601.lambda$onResponse$0(view);
                        }
                    });
                }
            }

            @Override // retrofit2.InterfaceC5795
            public void onFailure(InterfaceC5778<QSResult<HasUpdate>> interfaceC5778, Throwable th) {
                AbstractC6185.m11592(AbstractC8405.m13972(1036) + th);
                String strM13973 = AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜喵呜~喵喵喵呜呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜");
                String str = AbstractC6188.f17016;
                AbstractC6188.m11605(strM13973, th.toString(), th, true);
                C8198.m13710();
            }

            @Override // retrofit2.InterfaceC5795
            public void onResponse(InterfaceC5778<QSResult<HasUpdate>> interfaceC5778, C5755<QSResult<HasUpdate>> c5755) {
                Update.hasUpdate = (HasUpdate) ((QSResult) c5755.f15756).getData();
                C8834.m14489().m14513(BuildConfig.VERSION_CODE).mo11163(new C55601());
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
    public static /* synthetic */ void lambda$showUpdateDialog$3(DialogC6319 dialogC6319, View.OnClickListener onClickListener, View view) {
        dialogC6319.dismiss();
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
        DialogC6319 dialogC6319 = new DialogC6319(activity);
        dialogC6319.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世哲兰苏
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
            dialogC6319.setCancelable(false);
            dialogC6319.setCanceledOnTouchOutside(false);
        }
        button.setOnClickListener(new ViewOnClickListenerC5533(7));
        button2.setOnClickListener(new ViewOnClickListenerC5562(dialogC6319, i, onClickListener));
        textView2.setText(getUpdateLog());
        textView.setText(AbstractC8405.m13972(1039) + getLatestVersionName());
        dialogC6319.setContentView(viewGroup);
        dialogC6319.show();
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC8405.m13972(1040);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5566(this, 3);
    }
}
