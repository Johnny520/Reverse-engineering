package p342;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.AbstractC3065;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5562;
import p018.AbstractC6253;
import p052.InterfaceC6558;
import p217.AbstractC7969;
import p287.AbstractC8405;
import p315.C8663;
import p385.C9072;
import p386.ViewOnClickListenerC9078;
import p387.AbstractC9081;
import p388.ViewOnLongClickListenerC9083;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子兰楪.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8817 extends AbstractC7969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f24818 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f24819;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object f24820;

    public C8817() {
        this.f24819 = 1;
        this.f24820 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m14485(boolean z) {
        Iterator it = this.f22042.iterator();
        while (it.hasNext()) {
            ((LinkedHashMap) this.f24820).put(((GroupInfo) it.next()).GroupUin, Boolean.valueOf(z));
        }
        m4791();
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13455(Context context, ViewGroup viewGroup, int i) {
        switch (this.f24819) {
            case 0:
                View viewInflate = AbstractC6253.m11750(context).inflate(R.layout.item_download_dir, viewGroup, false);
                viewInflate.getClass();
                return new C8663(viewInflate);
            case 1:
                AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                C8663 c8663 = new C8663(R.layout.item_select_troop, viewGroup);
                c8663.itemView.setOnClickListener(new ViewOnClickListenerC5562(c8663, 18, this));
                return c8663;
            default:
                View viewInflate2 = AbstractC6253.m11750(context).inflate(R.layout.item_comment, viewGroup, false);
                viewInflate2.getClass();
                return new C8663(viewInflate2);
        }
    }

    @Override // p217.AbstractC7969
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13457(AbstractC2484 abstractC2484, int i, Object obj) {
        int i2;
        switch (this.f24819) {
            case 0:
                C8663 c8663 = (C8663) abstractC2484;
                File file = (File) obj;
                if (file != null) {
                    c8663.m14359(R.id.tv_dir_name, file.getName());
                    File[] fileArrListFiles = file.listFiles();
                    int i3 = 0;
                    if (fileArrListFiles != null) {
                        i2 = 0;
                        for (File file2 : fileArrListFiles) {
                            if (file2.isFile() && !AbstractC4395.m8907(file2.getName(), "config.json")) {
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
                    c8663.m14359(R.id.tv_dir_info, i2 + " 个文件 · " + AbstractC3065.m6835(i3));
                    ((TextView) c8663.m14360(R.id.tv_select)).setOnClickListener(new ViewOnClickListenerC5562(this, 15, file));
                } else {
                    C5925.m11311("Check failed.");
                }
                break;
            case 1:
                C8663 c86632 = (C8663) abstractC2484;
                GroupInfo groupInfo = (GroupInfo) obj;
                AbstractC8405.m13973("喵喵喵呜呜喵呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜呜喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
                if (groupInfo != null) {
                    String str = groupInfo.GroupUin;
                    c86632.m14359(R.id.tv_troop_name, groupInfo.GroupName);
                    c86632.m14359(R.id.tv_troop_uin, groupInfo.GroupUin);
                    String str2 = AbstractC8405.m13972(2928) + str + '/' + str + AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵呜喵喵喵喵呜呜~喵呜喵喵呜呜呜喵~喵呜喵呜呜喵喵喵~喵呜喵喵呜喵呜喵");
                    ImageView imageView = (ImageView) c86632.m14360(R.id.iv_troop_avatar);
                    ComponentCallbacks2C3058.m6765(imageView.getContext()).m6796(str2).m6789(imageView);
                    ((CheckBox) c86632.m14360(R.id.cb_troop_select)).setChecked(AbstractC4395.m8907(((LinkedHashMap) this.f24820).get(groupInfo.GroupUin), Boolean.TRUE));
                    break;
                }
                break;
            default:
                C8663 c86633 = (C8663) abstractC2484;
                C9072 c9072 = (C9072) obj;
                if (c9072 != null) {
                    TextView textView = (TextView) c86633.m14360(R.id.nickname_text);
                    TextView textView2 = (TextView) c86633.m14360(R.id.date_text);
                    TextView textView3 = (TextView) c86633.m14360(R.id.content_text);
                    ImageView imageView2 = (ImageView) c86633.m14360(R.id.avatar_image);
                    ComponentCallbacks2C3058.m6764(imageView2).m6796("https://q.qlogo.cn/g?b=qq&nk=" + c9072.getUin() + "&s=100").m6789(imageView2);
                    textView.setText(c9072.getNickname());
                    int i4 = AbstractC9081.f25455;
                    String createdAt = c9072.getCreatedAt();
                    createdAt.getClass();
                    String str3 = Instant.parse(createdAt).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    str3.getClass();
                    textView2.setText(str3);
                    textView3.setText(c9072.getContent());
                    if (c9072.getContent().length() > 32) {
                        textView3.setOnClickListener(new ViewOnClickListenerC9078(this, textView3));
                    }
                    c86633.itemView.setOnClickListener(new ViewOnClickListenerC5562(this, 21, c9072));
                    c86633.itemView.setOnLongClickListener(new ViewOnLongClickListenerC9083(this, c86633, c9072, 3));
                } else {
                    C5925.m11311("Check failed.");
                }
                break;
        }
    }

    public /* synthetic */ C8817(InterfaceC6558 interfaceC6558, int i) {
        this.f24819 = i;
        this.f24820 = interfaceC6558;
    }
}
