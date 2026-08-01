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
import androidx.compose.p001ui.platform.RunnableC2733;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3887;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.List;
import lin.xposed.BuildConfig;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import lin.xposed.hook.view.main.itemview.Update;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p044.DialogC7148;
import p273.C9027;
import p303.AbstractC9234;
import p361.C9663;
import retrofit2.C6585;
import retrofit2.InterfaceC6608;
import retrofit2.InterfaceC6625;
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
        new Thread(new RunnableC2733(3)).start();
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
            return AbstractC9234.m14532("喵呜喵喵呜呜喵喵");
        }
    }

    public static String getUpdateLog() {
        try {
            StringBuilder sb = new StringBuilder();
            for (UpdateInfo updateInfo : updateInfoList) {
                sb.append(AbstractC9234.m14532("喵喵喵喵喵呜喵呜"));
                sb.append(updateInfo.getVersionName());
                sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜"));
                sb.append(updateInfo.getUpdateLog());
                sb.append(AbstractC9234.m14532("喵呜呜呜呜喵喵呜~喵呜呜呜呜呜呜呜"));
            }
            return sb.toString();
        } catch (Exception unused) {
            return AbstractC9234.m14531(1038);
        }
    }

    public static String getUpdateUrl() {
        try {
            return AbstractC9234.m14531(1037) + updateInfoList.get(0).getVersionCode();
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
        intent.setAction(AbstractC9234.m14531(Opcodes.ADD_DOUBLE_2ADDR));
        intent.setData(Uri.parse(str));
        AbstractC3887.m7213().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$detectUpdates$0() {
        try {
            HasUpdate hasUpdate2 = (HasUpdate) ((QSResult) C9663.m15048().m15073(BuildConfig.VERSION_CODE).execute().f16101).getData();
            hasUpdate = hasUpdate2;
            if (hasUpdate2.getHasUpdate()) {
                updateInfoList = (List) ((QSResult) C9663.m15048().m15072(BuildConfig.VERSION_CODE).execute().f16101).getData();
            }
        } catch (Exception e) {
            String strM14531 = AbstractC9234.m14531(1042);
            String str = AbstractC7017.f17361;
            AbstractC7017.m12164(strM14531, e.toString(), e, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getOnClick$4(final View view) {
        C9027.m14266(AbstractC9234.m14531(1041));
        C9663.m15048().m15073(BuildConfig.VERSION_CODE).mo11722(new InterfaceC6625() { // from class: lin.xposed.hook.view.main.itemview.Update.1

            /* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.Update$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
            public class AnonymousClass1 implements InterfaceC6625 {
                public AnonymousClass1() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static /* synthetic */ void lambda$onResponse$0(View view) {
                    if (Update.mandatoryUpdate()) {
                        Update.jumpToBrowserUpdates(Update.getUpdateUrl());
                    } else if (Update.hasUpdate()) {
                        Update.showUpdateDialog((Activity) view.getContext(), null);
                    } else {
                        AbstractC7014.m12151(AbstractC9234.m14531(1035));
                    }
                }

                @Override // retrofit2.InterfaceC6625
                public void onFailure(InterfaceC6608<QSResult<List<UpdateInfo>>> interfaceC6608, Throwable th) {
                    AbstractC7014.m12151(AbstractC9234.m14531(1034) + th);
                    String strM14532 = AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜喵呜~喵喵喵呜呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜");
                    String str = AbstractC7017.f17361;
                    AbstractC7017.m12164(strM14532, th.toString(), th, true);
                    C9027.m14269();
                }

                @Override // retrofit2.InterfaceC6625
                public void onResponse(InterfaceC6608<QSResult<List<UpdateInfo>>> interfaceC6608, C6585<QSResult<List<UpdateInfo>>> c6585) {
                    C9027.m14269();
                    Update.updateInfoList = (List) ((QSResult) c6585.f16101).getData();
                    Handler handler = new Handler(Looper.getMainLooper());
                    final View view = view;
                    handler.post(new Runnable() { // from class: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世兰哲苏
                        @Override // java.lang.Runnable
                        public final void run() {
                            Update.C04341.AnonymousClass1.lambda$onResponse$0(view);
                        }
                    });
                }
            }

            @Override // retrofit2.InterfaceC6625
            public void onFailure(InterfaceC6608<QSResult<HasUpdate>> interfaceC6608, Throwable th) {
                AbstractC7014.m12151(AbstractC9234.m14531(1036) + th);
                String strM14532 = AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜喵呜~喵喵喵呜呜呜呜喵~喵喵喵喵呜喵喵呜~喵喵喵呜喵喵喵呜~喵喵喵喵呜喵喵呜");
                String str = AbstractC7017.f17361;
                AbstractC7017.m12164(strM14532, th.toString(), th, true);
                C9027.m14269();
            }

            @Override // retrofit2.InterfaceC6625
            public void onResponse(InterfaceC6608<QSResult<HasUpdate>> interfaceC6608, C6585<QSResult<HasUpdate>> c6585) {
                Update.hasUpdate = (HasUpdate) ((QSResult) c6585.f16101).getData();
                C9663.m15048().m15072(BuildConfig.VERSION_CODE).mo11722(new AnonymousClass1());
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
    public static /* synthetic */ void lambda$showUpdateDialog$3(DialogC7148 dialogC7148, View.OnClickListener onClickListener, View view) {
        dialogC7148.dismiss();
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
        DialogC7148 dialogC7148 = new DialogC7148(activity);
        dialogC7148.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世哲兰苏
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Update.lambda$showUpdateDialog$1(onClickListener, dialogInterface);
            }
        });
        int i = 0;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(activity).inflate(C0328R.layout.update_layout, (ViewGroup) null, false);
        TextView textView = (TextView) viewGroup.findViewById(C0328R.id.update_title);
        TextView textView2 = (TextView) viewGroup.findViewById(C0328R.id.update_log);
        Button button = (Button) viewGroup.findViewById(C0328R.id.goToUpdate);
        Button button2 = (Button) viewGroup.findViewById(C0328R.id.cancelUpdate);
        if (mandatoryUpdate()) {
            button2.setVisibility(8);
            viewGroup.findViewById(C0328R.id.view_separated).setVisibility(8);
            dialogC7148.setCancelable(false);
            dialogC7148.setCanceledOnTouchOutside(false);
        }
        button.setOnClickListener(new ViewOnClickListenerC6365(7));
        button2.setOnClickListener(new ViewOnClickListenerC6392(dialogC7148, i, onClickListener));
        textView2.setText(getUpdateLog());
        textView.setText(AbstractC9234.m14531(1039) + getLatestVersionName());
        dialogC7148.setContentView(viewGroup);
        dialogC7148.show();
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC9234.m14531(1040);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC6396(this, 3);
    }
}
