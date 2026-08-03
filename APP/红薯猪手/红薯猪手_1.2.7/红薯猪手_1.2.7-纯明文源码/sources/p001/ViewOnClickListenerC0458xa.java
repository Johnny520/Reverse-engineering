package p001;

import android.view.View;
import com.skyhand.redbookhelper.MainActivity;

/* JADX INFO: renamed from: ۟.xa */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0458xa implements View.OnClickListener {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f1195;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [۟.ib.run():void, ۟.t9.ۥ۟۟(۟.t9, de.robv.android.xposed.XC_MethodHook$MethodHookParam):void, ۟.t9.ۥ۟ۡ(۟.t9, android.widget.LinearLayout):void, ۟.ya.ۥ۟۠(java.lang.String):android.widget.RelativeLayout] */
    public /* synthetic */ ViewOnClickListenerC0458xa(int i) {
        this.f1195 = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1195) {
            case 0:
                int i = C0330o.f1000;
                C0330o.m1171(true);
                break;
            case 1:
                C0286kb c0286kb = MainActivity.f1289;
                int i2 = C0330o.f1000;
                C0330o.m911("Skyhand的猪手圈");
                C0330o.m1173(0, "请关注公众号获取更新");
                break;
            case 2:
                C0286kb c0286kb2 = MainActivity.f1289;
                int i3 = C0330o.f1000;
                C0330o.m911("Skyhand的猪手圈");
                C0330o.m1173(0, "已复制到粘贴板");
                break;
            case 3:
                String str = C0211f6.f785;
                if (!(str.length() > 0)) {
                    int i4 = C0330o.f1000;
                    C0330o.m1173(0, "猪手获取到当前视频链接为空");
                } else {
                    String str2 = C0436w1.f1166;
                    C0436w1.m953("mp4", C0272jb.m1105(str));
                }
                break;
            case 4:
                String str3 = C0436w1.f1166;
                C0436w1.m953("wav", C0272jb.m1105(C0211f6.f1446));
                break;
            case 5:
                String str4 = C0211f6.f785;
                if (!(str4.length() > 0)) {
                    int i5 = C0330o.f1000;
                    C0330o.m1173(0, "猪手获取到当前视频链接为空");
                } else {
                    String str5 = C0436w1.f1166;
                    C0436w1.m953("mp4", C0272jb.m1105(str4));
                }
                break;
            default:
                String str6 = C0436w1.f1166;
                C0436w1.m953("wav", C0272jb.m1105(C0211f6.f1446));
                break;
        }
    }
}
