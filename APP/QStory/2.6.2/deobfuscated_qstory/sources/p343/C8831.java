package p343;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.AbstractC2484;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.davemorrissey.labs.subscaleview.R;
import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import lin.xposed.hook.javaplugin.bean.GroupInfo;
import lin.xposed.hook.view.main.itemview.ViewOnClickListenerC5561;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p217.AbstractC7968;
import p315.C8671;
import p385.ViewOnClickListenerC9091;
import p386.ViewOnLongClickListenerC9095;
import p387.AbstractC9098;
import p388.C9105;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏哲世楪子兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8831 extends AbstractC7968 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final /* synthetic */ int f24837 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final /* synthetic */ int f24838;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Object f24839;

    public C8831() {
        this.f24838 = 1;
        this.f24839 = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public void m14474(boolean z) {
        Iterator it = this.f22045.iterator();
        while (it.hasNext()) {
            ((LinkedHashMap) this.f24839).put(((GroupInfo) it.next()).GroupUin, Boolean.valueOf(z));
        }
        m4781();
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final AbstractC2484 mo13427(Context context, ViewGroup viewGroup, int i) {
        switch (this.f24838) {
            case 0:
                View viewInflate = AbstractC6560.m12028(context).inflate(R.layout.item_download_dir, viewGroup, false);
                viewInflate.getClass();
                return new C8671(viewInflate);
            case 1:
                "context";
                "parent";
                C8671 c8671 = new C8671(R.layout.item_select_troop, viewGroup);
                c8671.itemView.setOnClickListener(new ViewOnClickListenerC5561(c8671, 18, this));
                return c8671;
            default:
                View viewInflate2 = AbstractC6560.m12028(context).inflate(R.layout.item_comment, viewGroup, false);
                viewInflate2.getClass();
                return new C8671(viewInflate2);
        }
    }

    @Override // p217.AbstractC7968
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final void mo13429(AbstractC2484 abstractC2484, int i, Object obj) {
        int i2;
        switch (this.f24838) {
            case 0:
                C8671 c8671 = (C8671) abstractC2484;
                File file = (File) obj;
                if (file != null) {
                    c8671.m14341(R.id.tv_dir_name, file.getName());
                    File[] fileArrListFiles = file.listFiles();
                    int i3 = 0;
                    if (fileArrListFiles != null) {
                        i2 = 0;
                        for (File file2 : fileArrListFiles) {
                            if (file2.isFile() && !AbstractC4394.m8917(file2.getName(), "config.json")) {
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
                    c8671.m14341(R.id.tv_dir_info, i2 + " 个文件 · " + AbstractC4921.m9892(i3));
                    ((TextView) c8671.m14342(R.id.tv_select)).setOnClickListener(new ViewOnClickListenerC5561(this, 16, file));
                } else {
                    C5919.m11250("Check failed.");
                }
                break;
            case 1:
                C8671 c86712 = (C8671) abstractC2484;
                GroupInfo groupInfo = (GroupInfo) obj;
                "holder";
                if (groupInfo != null) {
                    String str = groupInfo.GroupUin;
                    c86712.m14341(R.id.tv_troop_name, groupInfo.GroupName);
                    c86712.m14341(R.id.tv_troop_uin, groupInfo.GroupUin);
                    String str2 = "https://p.qlogo.cn/gh/" + str + '/' + str + "/640/";
                    ImageView imageView = (ImageView) c86712.m14342(R.id.iv_troop_avatar);
                    ComponentCallbacks2C3057.m6720(imageView.getContext()).m6751(str2).m6744(imageView);
                    ((CheckBox) c86712.m14342(R.id.cb_troop_select)).setChecked(AbstractC4394.m8917(((LinkedHashMap) this.f24839).get(groupInfo.GroupUin), Boolean.TRUE));
                    break;
                }
                break;
            default:
                C8671 c86713 = (C8671) abstractC2484;
                C9105 c9105 = (C9105) obj;
                if (c9105 != null) {
                    TextView textView = (TextView) c86713.m14342(R.id.nickname_text);
                    TextView textView2 = (TextView) c86713.m14342(R.id.date_text);
                    TextView textView3 = (TextView) c86713.m14342(R.id.content_text);
                    ImageView imageView2 = (ImageView) c86713.m14342(R.id.avatar_image);
                    ComponentCallbacks2C3057.m6719(imageView2).m6751("https://q.qlogo.cn/g?b=qq&nk=" + c9105.getUin() + "&s=100").m6744(imageView2);
                    textView.setText(c9105.getNickname());
                    int i4 = AbstractC9098.f25417;
                    String createdAt = c9105.getCreatedAt();
                    createdAt.getClass();
                    String str3 = Instant.parse(createdAt).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    str3.getClass();
                    textView2.setText(str3);
                    textView3.setText(c9105.getContent());
                    if (c9105.getContent().length() > 32) {
                        textView3.setOnClickListener(new ViewOnClickListenerC9091(this, textView3));
                    }
                    c86713.itemView.setOnClickListener(new ViewOnClickListenerC5561(this, 21, c9105));
                    c86713.itemView.setOnLongClickListener(new ViewOnLongClickListenerC9095(this, c86713, c9105, 3));
                } else {
                    C5919.m11250("Check failed.");
                }
                break;
        }
    }

    public /* synthetic */ C8831(InterfaceC6557 interfaceC6557, int i) {
        this.f24838 = i;
        this.f24839 = interfaceC6557;
    }
}
