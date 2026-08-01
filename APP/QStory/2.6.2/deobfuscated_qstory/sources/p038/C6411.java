package p038;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ViewOnClickListenerC0070;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import lin.xposed.hook.util.qq.QQAIOTool;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p000.AbstractC6087;
import p026.AbstractC6293;
import p028.C6301;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p175.AbstractC7738;
import p346.C8849;
import p383.C9022;
import top.suzhelan.qstory.hook.api.InterfaceC5808;
import top.suzhelan.qstory.hook.item.C5874;
import top.suzhelan.qstory.hook.item.C5919;
import top.suzhelan.qstory.hook.item.chat.C5829;
import top.suzhelan.qstory.hook.item.chat.C5835;
import top.suzhelan.qstory.hook.item.chat.C5841;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6411 implements InterfaceC5808 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6293 f17569;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17570;

    public /* synthetic */ C6411(AbstractC6293 abstractC6293, int i) {
        this.f17570 = i;
        this.f17569 = abstractC6293;
    }

    @Override // top.suzhelan.qstory.hook.api.InterfaceC5808
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11172(Object obj, View view) {
        ViewGroup.LayoutParams layoutParams;
        int i = this.f17570;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        AbstractC6293 abstractC6293 = this.f17569;
        switch (i) {
            case 0:
                Long l = (Long) AbstractC6317.m11831(cls2, "msgId", obj);
                l.getClass();
                HashMap map = ((C6415) abstractC6293).f17576;
                if (map.containsKey(l)) {
                    Log.d(C6411.class.getSimpleName(), "\u547d\u4e2d");
                    for (View view2 : AbstractC7738.m13052(QQAIOTool.getContentView((ViewGroup) view))) {
                        if (view2.getClass().getName().equals("com.tencent.qqnt.aio.widget.AIOMsgTextView")) {
                            ((TextView) view2).setText((CharSequence) map.get(l));
                        }
                    }
                    break;
                }
                break;
            case 1:
                "msgItemView";
                "msgRecord";
                Context context = view.getContext();
                ViewGroup viewGroup = (ViewGroup) view;
                Long l2 = (Long) AbstractC6317.m11831(cls2, "msgId", obj);
                C5874 c5874 = (C5874) abstractC6293;
                int i2 = c5874.f16048;
                View viewFindViewById = viewGroup.findViewById(i2);
                if (viewFindViewById != null) {
                    viewGroup.removeView(viewFindViewById);
                }
                if (c5874.f16047.contains(l2)) {
                    TextView textView = new TextView(context);
                    textView.setText("\u95ea\u7167");
                    textView.setId(i2);
                    textView.setGravity(17);
                    textView.setTextSize(20.0f);
                    textView.setTextColor(context.getColor(R.color.___res_0x24060485));
                    textView.setClickable(false);
                    try {
                        viewGroup.getContext();
                        int id = viewGroup.getId();
                        int contentId = QQAIOTool.getContentId(viewGroup);
                        Object objM11389 = AbstractC6087.m11389(new Object[]{-2, -2}, new Class[]{cls, cls}, AbstractC6318.m11838("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams"));
                        "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams";
                        objM11389.getClass();
                        layoutParams = (ViewGroup.LayoutParams) objM11389;
                        AbstractC6317.m11837(layoutParams, "startToStart", Integer.valueOf(id));
                        AbstractC6317.m11837(layoutParams, "endToEnd", Integer.valueOf(id));
                        AbstractC6317.m11837(layoutParams, "topToTop", Integer.valueOf(contentId));
                    } catch (Exception unused) {
                        layoutParams = null;
                    }
                    viewGroup.addView(textView, layoutParams);
                }
                break;
            case 2:
                C5835 c5835 = (C5835) abstractC6293;
                LinkedHashMap linkedHashMap = c5835.f15975;
                "msgItemView";
                "msgRecord";
                ViewGroup viewGroup2 = (ViewGroup) view;
                if (QQAIOTool.hasContentMessage(viewGroup2)) {
                    String str = (String) AbstractC6317.m11831(String.class, "peerUid", obj);
                    Object objM11831 = AbstractC6317.m11831(cls2, "msgSeq", obj);
                    objM11831.getClass();
                    long jLongValue = ((Number) objM11831).longValue();
                    View viewFindViewById2 = viewGroup2.findViewById(c5835.f15979);
                    if (viewFindViewById2 != null) {
                        viewGroup2.removeView(viewFindViewById2);
                    }
                    Object objM118312 = AbstractC6317.m11831(cls2, "msgTime", obj);
                    objM118312.getClass();
                    if (System.currentTimeMillis() - (((Number) objM118312).longValue() * 1000) >= 2000) {
                        Object objM118313 = AbstractC6317.m11831(cls, "chatType", obj);
                        "getField(...)";
                        objM118313.getClass();
                        int iIntValue = ((Number) objM118313).intValue();
                        String str2 = str + jLongValue;
                        if (iIntValue != 1) {
                            if (iIntValue == 2) {
                                if (linkedHashMap.containsKey(str2)) {
                                    C9022 c9022 = (C9022) linkedHashMap.get(str2);
                                    StringBuilder sb = new StringBuilder();
                                    if (c9022 != null) {
                                        sb.append("\u88ab");
                                        String uinFromUid = QQEnvTool.getUinFromUid(c9022.f25316);
                                        sb.append(C8849.m14477(c9022.f25317, uinFromUid));
                                        sb.append("(");
                                        sb.append(uinFromUid);
                                        sb.append(")");
                                        c5835.m11188(viewGroup2, sb.toString());
                                    } else {
                                        C5919.m11250("Check failed.");
                                    }
                                }
                                break;
                            } else if (iIntValue != 100) {
                            }
                        }
                        if (c5835.f15976.containsKey(str2)) {
                            c5835.m11188(viewGroup2, "");
                        }
                        break;
                    }
                }
                break;
            case 3:
                C5841 c5841 = (C5841) abstractC6293;
                int i3 = c5841.f15999;
                "msgItemView";
                "msgRecord";
                Long l3 = (Long) AbstractC6317.m11831(cls2, "senderUin", obj);
                ViewGroup viewGroup3 = (ViewGroup) view;
                Context context2 = viewGroup3.getContext();
                int contentId2 = QQAIOTool.getContentId(viewGroup3);
                if (QQAIOTool.hasContentMessage(viewGroup3) && viewGroup3.findViewById(contentId2) != null) {
                    ImageView imageView = (ImageView) viewGroup3.findViewById(i3);
                    if (imageView != null) {
                        viewGroup3.removeView(imageView);
                    }
                    ImageView imageView2 = new ImageView(context2);
                    imageView2.setId(i3);
                    imageView2.setImageDrawable(c5841.f15997);
                    Object currentContact = QQSessionUtils.getCurrentContact();
                    "getCurrentContact(...)";
                    currentContact.getClass();
                    imageView2.setOnClickListener(new ViewOnClickListenerC0070(c5841, obj, currentContact));
                    context2.getClass();
                    int iM6267 = c5841.f15996;
                    if (iM6267 == 0) {
                        C6301 c6301 = c5841.f16000;
                        c6301.getClass();
                        Object objM11812 = c6301.m11812(26, "size");
                        "null cannot be cast to non-null type kotlin.Int";
                        objM11812.getClass();
                        iM6267 = AbstractC2904.m6267(context2, ((Integer) objM11812).intValue());
                        c5841.f15996 = iM6267;
                    }
                    Object objM113892 = AbstractC6087.m11389(new Object[]{Integer.valueOf(iM6267), Integer.valueOf(iM6267)}, new Class[]{cls, cls}, AbstractC6318.m11838("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams"));
                    "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams";
                    objM113892.getClass();
                    ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) objM113892;
                    AbstractC6317.m11837(layoutParams2, "topToTop", Integer.valueOf(contentId2));
                    AbstractC6317.m11837(layoutParams2, "bottomToBottom", Integer.valueOf(contentId2));
                    String strValueOf = String.valueOf(l3);
                    String currentUin = c5841.f15995;
                    if (currentUin == null) {
                        currentUin = QQEnvTool.getCurrentUin();
                        c5841.f15995 = currentUin;
                    }
                    if (strValueOf.equals(currentUin)) {
                        AbstractC6317.m11837(layoutParams2, "endToStart", Integer.valueOf(contentId2));
                    } else {
                        AbstractC6317.m11837(layoutParams2, "startToEnd", Integer.valueOf(contentId2));
                    }
                    viewGroup3.addView(imageView2, layoutParams2);
                    break;
                }
                break;
            default:
                int i4 = ((C5829) abstractC6293).f15963;
                "msgItemView";
                "msgRecord";
                ViewGroup viewGroup4 = (ViewGroup) view;
                Context context3 = view.getContext();
                if (QQAIOTool.hasContentMessage(viewGroup4)) {
                    int contentId3 = QQAIOTool.getContentId(viewGroup4);
                    String str3 = new SimpleDateFormat("HH:mm:ss", Locale.CHINA).format(new Date(1000 * ((Long) AbstractC6317.m11831(cls2, "msgTime", obj)).longValue()));
                    TextView textView2 = (TextView) viewGroup4.findViewById(i4);
                    if (textView2 != null) {
                        viewGroup4.removeView(textView2);
                    }
                    TextView textView3 = new TextView(context3);
                    textView3.setTextSize(9.0f);
                    textView3.setId(i4);
                    textView3.setText(str3);
                    Object objM113893 = AbstractC6087.m11389(new Object[]{-2, -2}, new Class[]{cls, cls}, AbstractC6318.m11838("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams"));
                    "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams";
                    objM113893.getClass();
                    ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) objM113893;
                    AbstractC6317.m11837(layoutParams3, "bottomToBottom", Integer.valueOf(contentId3));
                    AbstractC6317.m11837(layoutParams3, "endToEnd", Integer.valueOf(contentId3));
                    AbstractC6317.m11837(layoutParams3, "bottomMargin", Integer.valueOf(AbstractC2904.m6267(context3, 3.0f)));
                    viewGroup4.addView(textView3, layoutParams3);
                    break;
                }
                break;
        }
    }
}
