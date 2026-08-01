package p358;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC3317;
import com.bumptech.glide.AbstractC3897;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC6392;
import p034.AbstractC7082;
import p068.InterfaceC7387;
import p233.AbstractC8798;
import p303.AbstractC9234;
import p331.C9492;
import p401.C9901;
import p402.ViewOnClickListenerC9907;
import p403.AbstractC9910;
import p404.ViewOnLongClickListenerC9912;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9646 extends AbstractC8798 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f25163 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f25164;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object f25165;

    public C9646() {
        this.f25164 = 1;
        this.f25165 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m15044(boolean z) {
        Iterator it = this.f22387.iterator();
        while (it.hasNext()) {
            ((LinkedHashMap) this.f25165).put(((GroupInfo) it.next()).GroupUin, Boolean.valueOf(z));
        }
        m5351();
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC3317 mo14014(Context context, ViewGroup viewGroup, int i) {
        switch (this.f25164) {
            case 0:
                View viewInflate = AbstractC7082.m12309(context).inflate(C0328R.layout.item_download_dir, viewGroup, false);
                viewInflate.getClass();
                return new C9492(viewInflate);
            case 1:
                AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                C9492 c9492 = new C9492(C0328R.layout.item_select_troop, viewGroup);
                c9492.itemView.setOnClickListener(new ViewOnClickListenerC6392(c9492, 18, this));
                return c9492;
            default:
                View viewInflate2 = AbstractC7082.m12309(context).inflate(C0328R.layout.item_comment, viewGroup, false);
                viewInflate2.getClass();
                return new C9492(viewInflate2);
        }
    }

    @Override // p233.AbstractC8798
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo14016(AbstractC3317 abstractC3317, int i, Object obj) {
        int i2;
        switch (this.f25164) {
            case 0:
                C9492 c9492 = (C9492) abstractC3317;
                File file = (File) obj;
                if (file != null) {
                    c9492.m14918(C0328R.id.tv_dir_name, file.getName());
                    File[] fileArrListFiles = file.listFiles();
                    int i3 = 0;
                    if (fileArrListFiles != null) {
                        i2 = 0;
                        for (File file2 : fileArrListFiles) {
                            if (file2.isFile() && !AbstractC5227.m9466(file2.getName(), "config.json")) {
                                String name = file2.getName();
                                name.getClass();
                                if (!name.endsWith(".bak")) {
                                    i2++;
                                }
                            }
                        }
                    } else {
                        i2 = 0;
                    }
                    File[] fileArrListFiles2 = file.listFiles();
                    if (fileArrListFiles2 != null) {
                        ArrayList arrayList = new ArrayList();
                        int length = fileArrListFiles2.length;
                        while (i3 < length) {
                            File file3 = fileArrListFiles2[i3];
                            if (file3.isFile()) {
                                arrayList.add(file3);
                            }
                            i3++;
                        }
                        Iterator it = arrayList.iterator();
                        long length2 = 0;
                        while (it.hasNext()) {
                            length2 += ((File) it.next()).length();
                        }
                        i3 = (int) length2;
                    }
                    c9492.m14918(C0328R.id.tv_dir_info, i2 + " 个文件 · " + AbstractC3897.m7395(i3));
                    ((TextView) c9492.m14919(C0328R.id.tv_select)).setOnClickListener(new ViewOnClickListenerC6392(this, 15, file));
                } else {
                    C6755.m11870("Check failed.");
                }
                break;
            case 1:
                C9492 c94922 = (C9492) abstractC3317;
                GroupInfo groupInfo = (GroupInfo) obj;
                AbstractC9234.m14532("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                if (groupInfo != null) {
                    String str = groupInfo.GroupUin;
                    c94922.m14918(C0328R.id.tv_troop_name, groupInfo.GroupName);
                    c94922.m14918(C0328R.id.tv_troop_uin, groupInfo.GroupUin);
                    String str2 = AbstractC9234.m14531(2928) + str + '/' + str + AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵呜喵喵喵喵呜呜~喵呜喵喵呜呜呜喵~喵呜喵呜呜喵喵喵~喵呜喵喵呜喵呜喵");
                    ImageView imageView = (ImageView) c94922.m14919(C0328R.id.iv_troop_avatar);
                    ComponentCallbacks2C3890.m7325(imageView.getContext()).m7356(str2).m7349(imageView);
                    ((CheckBox) c94922.m14919(C0328R.id.cb_troop_select)).setChecked(AbstractC5227.m9466(((LinkedHashMap) this.f25165).get(groupInfo.GroupUin), Boolean.TRUE));
                    break;
                }
                break;
            default:
                C9492 c94923 = (C9492) abstractC3317;
                C9901 c9901 = (C9901) obj;
                if (c9901 != null) {
                    TextView textView = (TextView) c94923.m14919(C0328R.id.nickname_text);
                    TextView textView2 = (TextView) c94923.m14919(C0328R.id.date_text);
                    TextView textView3 = (TextView) c94923.m14919(C0328R.id.content_text);
                    ImageView imageView2 = (ImageView) c94923.m14919(C0328R.id.avatar_image);
                    ComponentCallbacks2C3890.m7324(imageView2).m7356("https://q.qlogo.cn/g?b=qq&nk=" + c9901.getUin() + "&s=100").m7349(imageView2);
                    textView.setText(c9901.getNickname());
                    int i4 = AbstractC9910.f25800;
                    String createdAt = c9901.getCreatedAt();
                    createdAt.getClass();
                    String str3 = Instant.parse(createdAt).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    str3.getClass();
                    textView2.setText(str3);
                    textView3.setText(c9901.getContent());
                    if (c9901.getContent().length() > 32) {
                        textView3.setOnClickListener(new ViewOnClickListenerC9907(this, textView3));
                    }
                    c94923.itemView.setOnClickListener(new ViewOnClickListenerC6392(this, 21, c9901));
                    c94923.itemView.setOnLongClickListener(new ViewOnLongClickListenerC9912(this, c94923, c9901, 3));
                } else {
                    C6755.m11870("Check failed.");
                }
                break;
        }
    }

    public /* synthetic */ C9646(InterfaceC7387 interfaceC7387, int i) {
        this.f25164 = i;
        this.f25165 = interfaceC7387;
    }
}
