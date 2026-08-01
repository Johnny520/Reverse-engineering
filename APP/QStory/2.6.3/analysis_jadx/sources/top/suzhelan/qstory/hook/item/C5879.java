package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ViewOnClickListenerC0070;
import com.alibaba.fastjson2.AbstractC2905;
import com.davemorrissey.labs.subscaleview.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import lin.xposed.hook.util.qq.QQAIOTool;
import lin.xposed.hook.util.qq.QQEnvTool;
import lin.xposed.hook.util.qq.QQSessionUtils;
import p018.AbstractC6253;
import p026.AbstractC6311;
import p029.C6320;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p287.AbstractC8405;
import p346.C8836;
import p384.C9028;
import top.suzhelan.qstory.hook.api.InterfaceC5809;
import top.suzhelan.qstory.hook.item.chat.C5826;
import top.suzhelan.qstory.hook.item.chat.C5840;
import top.suzhelan.qstory.hook.item.chat.C5842;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5879 implements InterfaceC5809 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6311 f16054;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16055;

    public /* synthetic */ C5879(AbstractC6311 abstractC6311, int i) {
        this.f16055 = i;
        this.f16054 = abstractC6311;
    }

    @Override // top.suzhelan.qstory.hook.api.InterfaceC5809
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo11229(Object obj, View view) {
        ViewGroup.LayoutParams layoutParams;
        int i = this.f16055;
        Class cls = Integer.TYPE;
        Class cls2 = Long.TYPE;
        AbstractC6311 abstractC6311 = this.f16054;
        switch (i) {
            case 0:
                AbstractC8405.m13972(1908);
                AbstractC8405.m13972(1909);
                Context context = view.getContext();
                ViewGroup viewGroup = (ViewGroup) view;
                Long l = (Long) AbstractC6336.m11859(cls2, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜喵喵喵喵呜~喵喵喵喵喵喵喵呜"), obj);
                C5878 c5878 = (C5878) abstractC6311;
                int i2 = c5878.f16053;
                View viewFindViewById = viewGroup.findViewById(i2);
                if (viewFindViewById != null) {
                    viewGroup.removeView(viewFindViewById);
                }
                if (c5878.f16052.contains(l)) {
                    TextView textView = new TextView(context);
                    textView.setText(AbstractC8405.m13973("呜喵喵呜呜喵呜喵~呜呜呜喵喵喵呜喵~呜呜喵呜喵喵喵喵~呜喵喵喵呜呜呜呜~呜呜呜喵喵喵喵喵~呜呜喵喵呜喵呜呜"));
                    textView.setId(i2);
                    textView.setGravity(17);
                    textView.setTextSize(20.0f);
                    textView.setTextColor(context.getColor(R.color.___res_0x24060485));
                    textView.setClickable(false);
                    try {
                        viewGroup.getContext();
                        int id = viewGroup.getId();
                        int contentId = QQAIOTool.getContentId(viewGroup);
                        Object objM6285 = AbstractC2905.m6285(new Object[]{-2, -2}, new Class[]{cls, cls}, AbstractC6337.m11866(AbstractC8405.m13972(1912)));
                        AbstractC8405.m13972(1913);
                        objM6285.getClass();
                        layoutParams = (ViewGroup.LayoutParams) objM6285;
                        AbstractC6336.m11865(layoutParams, AbstractC8405.m13972(1914), Integer.valueOf(id));
                        AbstractC6336.m11865(layoutParams, AbstractC8405.m13972(1915), Integer.valueOf(id));
                        AbstractC6336.m11865(layoutParams, AbstractC8405.m13972(1916), Integer.valueOf(contentId));
                    } catch (Exception unused) {
                        layoutParams = null;
                    }
                    viewGroup.addView(textView, layoutParams);
                }
                break;
            case 1:
                C5840 c5840 = (C5840) abstractC6311;
                LinkedHashMap linkedHashMap = c5840.f15986;
                AbstractC8405.m13972(1908);
                AbstractC8405.m13972(1909);
                ViewGroup viewGroup2 = (ViewGroup) view;
                if (QQAIOTool.hasContentMessage(viewGroup2)) {
                    String str = (String) AbstractC6336.m11859(String.class, AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵喵喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵呜呜喵喵喵喵~喵喵喵喵喵呜喵呜~喵喵喵喵喵呜喵呜"), obj);
                    Object objM11859 = AbstractC6336.m11859(cls2, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜喵呜呜~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜"), obj);
                    objM11859.getClass();
                    long jLongValue = ((Number) objM11859).longValue();
                    View viewFindViewById2 = viewGroup2.findViewById(c5840.f15990);
                    if (viewFindViewById2 != null) {
                        viewGroup2.removeView(viewFindViewById2);
                    }
                    Object objM118592 = AbstractC6336.m11859(cls2, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), obj);
                    objM118592.getClass();
                    if (System.currentTimeMillis() - (((Number) objM118592).longValue() * 1000) >= 2000) {
                        Object objM118593 = AbstractC6336.m11859(cls, AbstractC8405.m13972(125), obj);
                        AbstractC8405.m13972(1588);
                        objM118593.getClass();
                        int iIntValue = ((Number) objM118593).intValue();
                        String str2 = str + jLongValue;
                        if (iIntValue != 1) {
                            if (iIntValue == 2) {
                                if (linkedHashMap.containsKey(str2)) {
                                    C9028 c9028 = (C9028) linkedHashMap.get(str2);
                                    StringBuilder sb = new StringBuilder();
                                    if (c9028 == null) {
                                        C5925.m11311(AbstractC8405.m13972(1413));
                                    } else {
                                        sb.append(AbstractC8405.m13973("呜喵喵呜呜喵呜呜~呜呜喵呜喵呜呜呜~呜呜喵呜喵喵喵呜"));
                                        String uinFromUid = QQEnvTool.getUinFromUid(c9028.f25309);
                                        sb.append(C8836.m14492(c9028.f25310, uinFromUid));
                                        sb.append(AbstractC8405.m13973("喵呜喵呜呜喵呜呜"));
                                        sb.append(uinFromUid);
                                        sb.append(AbstractC8405.m13973("喵呜喵呜呜喵呜喵"));
                                        c5840.m11253(viewGroup2, sb.toString());
                                    }
                                }
                                break;
                            } else if (iIntValue != 100) {
                            }
                        }
                        if (c5840.f15987.containsKey(str2)) {
                            c5840.m11253(viewGroup2, "");
                        }
                        break;
                    }
                }
                break;
            case 2:
                C5842 c5842 = (C5842) abstractC6311;
                int i3 = c5842.f15997;
                AbstractC8405.m13972(1908);
                AbstractC8405.m13972(1909);
                Long l2 = (Long) AbstractC6336.m11859(cls2, AbstractC8405.m13972(483), obj);
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
                    imageView2.setImageDrawable(c5842.f15995);
                    Object currentContact = QQSessionUtils.getCurrentContact();
                    AbstractC8405.m13972(2207);
                    currentContact.getClass();
                    imageView2.setOnClickListener(new ViewOnClickListenerC0070(c5842, obj, currentContact));
                    context2.getClass();
                    int iM11754 = c5842.f15994;
                    if (iM11754 == 0) {
                        C6320 c6320 = c5842.f15998;
                        c6320.getClass();
                        Object objM11840 = c6320.m11840(26, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜喵呜"));
                        AbstractC8405.m13972(1866);
                        objM11840.getClass();
                        iM11754 = AbstractC6253.m11754(context2, ((Integer) objM11840).intValue());
                        c5842.f15994 = iM11754;
                    }
                    Object objM62852 = AbstractC2905.m6285(new Object[]{Integer.valueOf(iM11754), Integer.valueOf(iM11754)}, new Class[]{cls, cls}, AbstractC6337.m11866(AbstractC8405.m13972(1912)));
                    AbstractC8405.m13972(1913);
                    objM62852.getClass();
                    ViewGroup.LayoutParams layoutParams2 = (ViewGroup.LayoutParams) objM62852;
                    AbstractC6336.m11865(layoutParams2, AbstractC8405.m13972(1916), Integer.valueOf(contentId2));
                    AbstractC6336.m11865(layoutParams2, AbstractC8405.m13972(2208), Integer.valueOf(contentId2));
                    String strValueOf = String.valueOf(l2);
                    String currentUin = c5842.f15993;
                    if (currentUin == null) {
                        currentUin = QQEnvTool.getCurrentUin();
                        c5842.f15993 = currentUin;
                    }
                    if (strValueOf.equals(currentUin)) {
                        AbstractC6336.m11865(layoutParams2, AbstractC8405.m13972(2209), Integer.valueOf(contentId2));
                    } else {
                        AbstractC6336.m11865(layoutParams2, AbstractC8405.m13972(2210), Integer.valueOf(contentId2));
                    }
                    viewGroup3.addView(imageView2, layoutParams2);
                    break;
                }
                break;
            default:
                int i4 = ((C5826) abstractC6311).f15962;
                AbstractC8405.m13972(1908);
                AbstractC8405.m13972(1909);
                ViewGroup viewGroup4 = (ViewGroup) view;
                Context context3 = view.getContext();
                if (QQAIOTool.hasContentMessage(viewGroup4)) {
                    int contentId3 = QQAIOTool.getContentId(viewGroup4);
                    String str3 = new SimpleDateFormat(AbstractC8405.m13972(837), Locale.CHINA).format(new Date(1000 * ((Long) AbstractC6336.m11859(cls2, AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵喵喵呜呜喵~喵喵喵呜呜呜喵呜~喵喵呜呜呜呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜喵喵"), obj)).longValue()));
                    TextView textView2 = (TextView) viewGroup4.findViewById(i4);
                    if (textView2 != null) {
                        viewGroup4.removeView(textView2);
                    }
                    TextView textView3 = new TextView(context3);
                    textView3.setTextSize(9.0f);
                    textView3.setId(i4);
                    textView3.setText(str3);
                    Object objM62853 = AbstractC2905.m6285(new Object[]{-2, -2}, new Class[]{cls, cls}, AbstractC6337.m11866(AbstractC8405.m13972(1912)));
                    AbstractC8405.m13972(1913);
                    objM62853.getClass();
                    ViewGroup.LayoutParams layoutParams3 = (ViewGroup.LayoutParams) objM62853;
                    AbstractC6336.m11865(layoutParams3, AbstractC8405.m13972(2208), Integer.valueOf(contentId3));
                    AbstractC6336.m11865(layoutParams3, AbstractC8405.m13972(1915), Integer.valueOf(contentId3));
                    AbstractC6336.m11865(layoutParams3, AbstractC8405.m13972(2236), Integer.valueOf(AbstractC6253.m11754(context3, 3.0f)));
                    viewGroup4.addView(textView3, layoutParams3);
                    break;
                }
                break;
        }
    }
}
