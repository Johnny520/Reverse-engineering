package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ViewOnClickListenerC0917;
import com.alibaba.fastjson2.AbstractC3738;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import lin.xposed.hook.util.p011qq.QQAIOTool;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import lin.xposed.hook.util.p011qq.QQSessionUtils;
import p034.AbstractC7082;
import p042.AbstractC7140;
import p045.C7149;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p362.C9665;
import p400.C9857;
import top.suzhelan.qstory.hook.api.InterfaceC6639;
import top.suzhelan.qstory.hook.item.chat.C6656;
import top.suzhelan.qstory.hook.item.chat.C6670;
import top.suzhelan.qstory.hook.item.chat.C6672;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6709 implements InterfaceC6639 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC7140 f16399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16400;

    public /* synthetic */ C6709(AbstractC7140 abstractC7140, int i) {
        this.f16400 = i;
        this.f16399 = abstractC7140;
    }

    @Override // top.suzhelan.qstory.hook.api.InterfaceC6639
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11788(Object obj, View view) {
        ViewGroup.LayoutParams layoutParams;
        int i = this.f16400;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        AbstractC7140 abstractC7140 = this.f16399;
        switch (i) {
            case 0:
                "msgItemView";
                "msgRecord";
                Context context = view.getContext();
                ViewGroup viewGroup = (ViewGroup) view;
                Long l = (Long) AbstractC7165.m12418(cls2, "msgId", obj);
                C6708 c6708 = (C6708) abstractC7140;
                int i2 = c6708.f16398;
                View viewFindViewById = viewGroup.findViewById(i2);
                if (viewFindViewById != null) {
                    viewGroup.removeView(viewFindViewById);
                }
                if (c6708.f16397.contains(l)) {
                    TextView textView = new TextView(context);
                    textView.setText("闪照");
                    textView.setId(i2);
                    textView.setGravity(17);
                    textView.setTextSize(20.0f);
                    textView.setTextColor(context.getColor(C0328R.color.___res_0x24060485));
                    textView.setClickable(false);
                    try {
                        viewGroup.getContext();
                        int id = viewGroup.getId();
                        int contentId = QQAIOTool.getContentId(viewGroup);
                        Object objM6845 = AbstractC3738.m6845(new Object[]{-2, -2}, new Class[]{cls, cls}, AbstractC7166.m12425("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams"));
                        "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams";
                        objM6845.getClass();
                        layoutParams = (ViewGroup.LayoutParams) objM6845;
                        AbstractC7165.m12424(layoutParams, "startToStart", Integer.valueOf(id));
                        AbstractC7165.m12424(layoutParams, "endToEnd", Integer.valueOf(id));
                        AbstractC7165.m12424(layoutParams, "topToTop", Integer.valueOf(contentId));
                    } catch (Exception unused) {
                        layoutParams = null;
                    }
                    viewGroup.addView(textView, layoutParams);
                }
                break;
            case 1:
                C6670 c6670 = (C6670) abstractC7140;
                LinkedHashMap linkedHashMap = c6670.f16331;
                "msgItemView";
                "msgRecord";
                ViewGroup viewGroup2 = (ViewGroup) view;
                if (QQAIOTool.hasContentMessage(viewGroup2)) {
                    String str = (String) AbstractC7165.m12418(String.class, "peerUid", obj);
                    Object objM12418 = AbstractC7165.m12418(cls2, "msgSeq", obj);
                    objM12418.getClass();
                    long jLongValue = ((Number) objM12418).longValue();
                    View viewFindViewById2 = viewGroup2.findViewById(c6670.f16335);
                    if (viewFindViewById2 != null) {
                        viewGroup2.removeView(viewFindViewById2);
                    }
                    Object objM124182 = AbstractC7165.m12418(cls2, "msgTime", obj);
                    objM124182.getClass();
                    if (System.currentTimeMillis() - (((Number) objM124182).longValue() * 1000) >= 2000) {
                        Object objM124183 = AbstractC7165.m12418(cls, "chatType", obj);
                        "getField(...)";
                        objM124183.getClass();
                        int iIntValue = ((Number) objM124183).intValue();
                        String str2 = str + jLongValue;
                        if (iIntValue != 1) {
                            if (iIntValue == 2) {
                                if (linkedHashMap.containsKey(str2)) {
                                    C9857 c9857 = (C9857) linkedHashMap.get(str2);
                                    StringBuilder sb = new StringBuilder();
                                    if (c9857 == null) {
                                        C6755.m11870("Check failed.");
                                    } else {
                                        sb.append("被");
                                        String uinFromUid = QQEnvTool.getUinFromUid(c9857.f25654);
                                        sb.append(C9665.m15051(c9857.f25655, uinFromUid));
                                        sb.append("(");
                                        sb.append(uinFromUid);
                                        sb.append(")");
                                        c6670.m11812(viewGroup2, sb.toString());
                                    }
                                }
                                break;
                            } else if (iIntValue != 100) {
                            }
                        }
                        if (c6670.f16332.containsKey(str2)) {
                            c6670.m11812(viewGroup2, "");
                        }
                        break;
                    }
                }
                break;
            case 2:
                C6672 c6672 = (C6672) abstractC7140;
                int i3 = c6672.f16342;
                "msgItemView";
                "msgRecord";
                Long l2 = (Long) AbstractC7165.m12418(cls2, "senderUin", obj);
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
                    imageView2.setImageDrawable(c6672.f16340);
                    Object currentContact = QQSessionUtils.getCurrentContact();
                    "getCurrentContact(...)";
                    currentContact.getClass();
                    imageView2.setOnClickListener(new ViewOnClickListenerC0917(c6672, obj, currentContact));
                    context2.getClass();
                    int iM12313 = c6672.f16339;
                    if (iM12313 == 0) {
                        C7149 c7149 = c6672.f16343;
                        c7149.getClass();
                        Object objM12399 = c7149.m12399(26, "size");
                        "null cannot be cast to non-null type kotlin.Int";
                        objM12399.getClass();
                        iM12313 = AbstractC7082.m12313(context2, ((Integer) objM12399).intValue());
                        c6672.f16339 = iM12313;
                    }
                    Object objM68452 = AbstractC3738.m6845(new Object[]{Integer.valueOf(iM12313), Integer.valueOf(iM12313)}, new Class[]{cls, cls}, AbstractC7166.m12425("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams"));
                    "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams";
                    objM68452.getClass();
                    ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) objM68452;
                    AbstractC7165.m12424(layoutParams2, "topToTop", Integer.valueOf(contentId2));
                    AbstractC7165.m12424(layoutParams2, "bottomToBottom", Integer.valueOf(contentId2));
                    String strValueOf = String.valueOf(l2);
                    String currentUin = c6672.f16338;
                    if (currentUin == null) {
                        currentUin = QQEnvTool.getCurrentUin();
                        c6672.f16338 = currentUin;
                    }
                    if (strValueOf.equals(currentUin)) {
                        AbstractC7165.m12424(layoutParams2, "endToStart", Integer.valueOf(contentId2));
                    } else {
                        AbstractC7165.m12424(layoutParams2, "startToEnd", Integer.valueOf(contentId2));
                    }
                    viewGroup3.addView(imageView2, layoutParams2);
                    break;
                }
                break;
            default:
                int i4 = ((C6656) abstractC7140).f16307;
                "msgItemView";
                "msgRecord";
                ViewGroup viewGroup4 = (ViewGroup) view;
                Context context3 = view.getContext();
                if (QQAIOTool.hasContentMessage(viewGroup4)) {
                    int contentId3 = QQAIOTool.getContentId(viewGroup4);
                    String str3 = new SimpleDateFormat("HH:mm:ss", Locale.CHINA).format(new Date(1000 * ((Long) AbstractC7165.m12418(cls2, "msgTime", obj)).longValue()));
                    TextView textView2 = (TextView) viewGroup4.findViewById(i4);
                    if (textView2 != null) {
                        viewGroup4.removeView(textView2);
                    }
                    TextView textView3 = new TextView(context3);
                    textView3.setTextSize(9.0f);
                    textView3.setId(i4);
                    textView3.setText(str3);
                    Object objM68453 = AbstractC3738.m6845(new Object[]{-2, -2}, new Class[]{cls, cls}, AbstractC7166.m12425("androidx.constraintlayout.widget.ConstraintLayout$LayoutParams"));
                    "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams";
                    objM68453.getClass();
                    ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) objM68453;
                    AbstractC7165.m12424(layoutParams3, "bottomToBottom", Integer.valueOf(contentId3));
                    AbstractC7165.m12424(layoutParams3, "endToEnd", Integer.valueOf(contentId3));
                    AbstractC7165.m12424(layoutParams3, "bottomMargin", Integer.valueOf(AbstractC7082.m12313(context3, 3.0f)));
                    viewGroup4.addView(textView3, layoutParams3);
                    break;
                }
                break;
        }
    }
}
