package p001;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Iterator;
import p001.C0250i3;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.t9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0405t9 extends AbstractC0484za {

    /* JADX INFO: renamed from: ۥ */
    public boolean f1115 = true;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f1116 = true;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f1822;

    /* JADX INFO: renamed from: ۟.t9$a */
    public static final class a extends AbstractC0335o4 implements InterfaceC0208f3<C0433vb> {
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final C0433vb mo7() {
            C0405t9.this.getClass();
            C0373r3.m1210("com.xingin.redview.sticker.StickerBrowserActivity", "onCreate", new Object[]{Bundle.class}, C0366q9.f1048);
            C0373r3.m1210("com.xingin.im.ui.activity.ChatEmojiPreviewActivity", "onCreate", new Object[]{Bundle.class}, C0392s9.f1093);
            return C0433vb.f1163;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m1236(C0405t9 c0405t9, XC_MethodHook.MethodHookParam methodHookParam) {
        LinearLayout linearLayout;
        Object obj = methodHookParam.thisObject;
        int i = 6;
        C0237h4.m1089("thisObject", obj);
        C0274k c0274k = C0283k8.f1632;
        Object objM1203 = C0373r3.m1203(obj, C0283k8.a.m885().f1576);
        C0325n8.f994.getClass();
        View viewM1159 = C0325n8.m1159(methodHookParam);
        if (viewM1159 != null) {
            String str = C0283k8.a.m885().f1578;
            C0237h4.m1089("MatrixFeedbackRIdCls", str);
            Integer numM1206 = C0373r3.m1206(str, C0283k8.a.m885().f1577);
            linearLayout = (LinearLayout) viewM1159.findViewById(numM1206 != null ? numM1206.intValue() : -1);
        } else {
            linearLayout = null;
        }
        if (objM1203 == null || linearLayout == null) {
            return;
        }
        if (C0237h4.m864(C0373r3.m1203(objM1203, "noteType"), "normal")) {
            c0405t9.m1241(linearLayout, objM1203);
            return;
        }
        c0405t9.getClass();
        Context context = linearLayout.getContext();
        C0237h4.m1089("getContext(...)", context);
        TextView textViewM1243 = c0405t9.m1243(context, "保存视频(无水印)");
        textViewM1243.setOnClickListener(new ViewOnClickListenerC0458xa(5));
        linearLayout.addView(textViewM1243);
        if (C0211f6.f1446.length() > 0) {
            Context context2 = linearLayout.getContext();
            C0237h4.m1089("getContext(...)", context2);
            TextView textViewM12432 = c0405t9.m1243(context2, "保存原声");
            textViewM12432.setOnClickListener(new ViewOnClickListenerC0458xa(i));
            linearLayout.addView(textViewM12432);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m1237(C0405t9 c0405t9, LinearLayout linearLayout, Object obj) {
        c0405t9.getClass();
        Context context = linearLayout.getContext();
        C0237h4.m1089("getContext(...)", context);
        LinearLayout linearLayoutM1242 = c0405t9.m1242(context);
        c0405t9.m1241(linearLayoutM1242, obj);
        linearLayout.addView(linearLayoutM1242, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static final void m1238(C0405t9 c0405t9, LinearLayout linearLayout) {
        c0405t9.getClass();
        Context context = linearLayout.getContext();
        C0237h4.m1089("getContext(...)", context);
        LinearLayout linearLayoutM1242 = c0405t9.m1242(context);
        Context context2 = linearLayout.getContext();
        C0237h4.m1089("getContext(...)", context2);
        TextView textViewM1243 = c0405t9.m1243(context2, "保存视频(无水印)");
        textViewM1243.setOnClickListener(new ViewOnClickListenerC0458xa(3));
        linearLayoutM1242.addView(textViewM1243);
        if (C0211f6.f1446.length() > 0) {
            Context context3 = linearLayout.getContext();
            C0237h4.m1089("getContext(...)", context3);
            TextView textViewM12432 = c0405t9.m1243(context3, "保存原声");
            textViewM12432.setOnClickListener(new ViewOnClickListenerC0458xa(4));
            linearLayoutM1242.addView(textViewM12432);
        }
        linearLayout.addView(linearLayoutM1242, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public static ArrayList m1240(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj == null) {
            return arrayList;
        }
        boolean z = false;
        Object objM1202 = C0373r3.m1202(obj, "imagesList", false);
        ArrayList arrayList2 = objM1202 instanceof ArrayList ? (ArrayList) objM1202 : null;
        if (arrayList2 != null && (!arrayList2.isEmpty())) {
            z = true;
        }
        if (!z) {
            return arrayList;
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C0250i3 c0250i3M871 = C0250i3.a.m871(it.next());
            if (c0250i3M871 != null) {
                arrayList.add(c0250i3M871);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0139a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo802(String str) {
        C0237h4.m1090("processName", str);
        this.f1115 = C0192e1.m846(EnumC0164c1.f1373);
        boolean zM846 = C0192e1.m846(EnumC0164c1.f1372);
        this.f1116 = zM846;
        if (this.f1115 && zM846) {
            String str2 = C0283k8.f1632.f1575;
            C0237h4.m1089("NoteDetailFeedbackV2ControllerCls", str2);
            C0373r3.m1208(str2, "onAttach", new Object[]{Bundle.class}, new C0326n9(this));
            String str3 = C0283k8.f1632.f892;
            C0237h4.m1089("FunctionPanelControllerCls", str3);
            C0373r3.m1208(str3, "onAttach", new Object[]{Bundle.class}, new C0340o9(this));
        }
        if (this.f1116) {
            String str4 = C0283k8.f1632.f1546;
            C0237h4.m1089("CommentMediaBrowserActivityCls", str4);
            C0373r3.m1208(str4, C0283k8.f1632.f1547, new Object[0], C0284k9.f915);
            String str5 = C0283k8.f1632.f1553;
            C0237h4.m1089("CommonImageBrowserActivityCls", str5);
            C0373r3.m1208(str5, "onCreate", new Object[]{Bundle.class}, C0312m9.f968);
        }
        C0192e1.m1054(EnumC0164c1.f1376, new a());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final void m1241(LinearLayout linearLayout, final Object obj) {
        final int i = 0;
        final C0250i3 c0250i3M871 = C0250i3.a.m871(C0373r3.m1202(obj, "imageInfo", false));
        if (c0250i3M871 == null) {
            return;
        }
        if (c0250i3M871.f1519) {
            Context context = linearLayout.getContext();
            C0237h4.m1089("getContext(...)", context);
            TextView textViewM1243 = m1243(context, "保存当前LivePhoto（无水印）");
            textViewM1243.setOnClickListener(new View.OnClickListener() { // from class: ۟.f9
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
                @Override // android.view.View.OnClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            C0250i3 c0250i3 = c0250i3M871;
                            String str = c0250i3.f854;
                            if (str == null) {
                                z = false;
                            } else if (!(str.length() > 0)) {
                            }
                            if (!z) {
                                int i2 = C0330o.f1000;
                                C0330o.m1173(0, "猪手获取到当前Live图为空");
                            } else {
                                String str2 = C0436w1.f1166;
                                C0436w1.m953(c0250i3.f1520, C0272jb.m1105(c0250i3.f854));
                            }
                            break;
                        default:
                            C0250i3 c0250i32 = c0250i3M871;
                            if (!(c0250i32.f853.length() > 0)) {
                                int i3 = C0330o.f1000;
                                C0330o.m1173(0, "猪手获取到当前原图为空");
                            } else {
                                String str3 = C0436w1.f1166;
                                C0436w1.m953("jpg", C0272jb.m1105(c0250i32.f853));
                            }
                            break;
                    }
                }
            });
            linearLayout.addView(textViewM1243);
            Context context2 = linearLayout.getContext();
            C0237h4.m1089("getContext(...)", context2);
            TextView textViewM12432 = m1243(context2, "保存全部LivePhoto（无水印）");
            textViewM12432.setOnClickListener(new View.OnClickListener(this) { // from class: ۟.g9

                /* JADX INFO: renamed from: ۥ۟ */
                public final /* synthetic */ C0405t9 f813;

                {
                    this.f813 = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            C0405t9 c0405t9 = this.f813;
                            Object obj2 = obj;
                            C0237h4.m1090("this$0", c0405t9);
                            C0237h4.m1090("$feedbackBean", obj2);
                            ArrayList arrayList = new ArrayList();
                            String strM915 = "mp4";
                            ArrayList<C0250i3> arrayListM1240 = C0405t9.m1240(C0373r3.m1202(obj2, "note", false));
                            if (!arrayListM1240.isEmpty()) {
                                for (C0250i3 c0250i3 : arrayListM1240) {
                                    if (c0250i3.f1519) {
                                        String str = c0250i3.f854;
                                        C0237h4.m865(str);
                                        arrayList.add(str);
                                        strM915 = c0250i3.f1520;
                                    }
                                }
                            } else {
                                for (C0250i3 c0250i32 : C0211f6.f1445) {
                                    if (c0250i32.f1519) {
                                        String str2 = c0250i32.f854;
                                        C0237h4.m865(str2);
                                        arrayList.add(str2);
                                        strM915 = c0250i32.f1520;
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                String str3 = C0436w1.f1166;
                                C0436w1.m953(strM915, arrayList);
                            } else {
                                int i2 = C0330o.f1000;
                                C0330o.m1173(0, "猪手获取不到Live图");
                            }
                            break;
                        default:
                            C0405t9 c0405t92 = this.f813;
                            Object obj3 = obj;
                            C0237h4.m1090("this$0", c0405t92);
                            C0237h4.m1090("$feedbackBean", obj3);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayListM12402 = C0405t9.m1240(C0373r3.m1202(obj3, "note", false));
                            if (arrayListM12402.isEmpty()) {
                                Iterator<C0250i3> it = C0211f6.f1445.iterator();
                                while (it.hasNext()) {
                                    arrayList2.add(it.next().f853);
                                }
                            } else {
                                Iterator it2 = arrayListM12402.iterator();
                                while (it2.hasNext()) {
                                    arrayList2.add(((C0250i3) it2.next()).f853);
                                }
                            }
                            C0436w1.m953("jpg", arrayList2);
                            break;
                    }
                }
            });
            linearLayout.addView(textViewM12432);
        }
        Context context3 = linearLayout.getContext();
        C0237h4.m1089("getContext(...)", context3);
        TextView textViewM12433 = m1243(context3, "保存当前图片(原图无水印)");
        final int i2 = 1;
        textViewM12433.setOnClickListener(new View.OnClickListener() { // from class: ۟.f9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        C0250i3 c0250i3 = c0250i3M871;
                        String str = c0250i3.f854;
                        if (str == null) {
                            z = false;
                        } else if (!(str.length() > 0)) {
                        }
                        if (!z) {
                            int i22 = C0330o.f1000;
                            C0330o.m1173(0, "猪手获取到当前Live图为空");
                        } else {
                            String str2 = C0436w1.f1166;
                            C0436w1.m953(c0250i3.f1520, C0272jb.m1105(c0250i3.f854));
                        }
                        break;
                    default:
                        C0250i3 c0250i32 = c0250i3M871;
                        if (!(c0250i32.f853.length() > 0)) {
                            int i3 = C0330o.f1000;
                            C0330o.m1173(0, "猪手获取到当前原图为空");
                        } else {
                            String str3 = C0436w1.f1166;
                            C0436w1.m953("jpg", C0272jb.m1105(c0250i32.f853));
                        }
                        break;
                }
            }
        });
        linearLayout.addView(textViewM12433);
        Context context4 = linearLayout.getContext();
        C0237h4.m1089("getContext(...)", context4);
        TextView textViewM12434 = m1243(context4, "保存全部图片(原图无水印)");
        textViewM12434.setOnClickListener(new View.OnClickListener(this) { // from class: ۟.g9

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ C0405t9 f813;

            {
                this.f813 = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        C0405t9 c0405t9 = this.f813;
                        Object obj2 = obj;
                        C0237h4.m1090("this$0", c0405t9);
                        C0237h4.m1090("$feedbackBean", obj2);
                        ArrayList arrayList = new ArrayList();
                        String strM915 = "mp4";
                        ArrayList<C0250i3> arrayListM1240 = C0405t9.m1240(C0373r3.m1202(obj2, "note", false));
                        if (!arrayListM1240.isEmpty()) {
                            for (C0250i3 c0250i3 : arrayListM1240) {
                                if (c0250i3.f1519) {
                                    String str = c0250i3.f854;
                                    C0237h4.m865(str);
                                    arrayList.add(str);
                                    strM915 = c0250i3.f1520;
                                }
                            }
                        } else {
                            for (C0250i3 c0250i32 : C0211f6.f1445) {
                                if (c0250i32.f1519) {
                                    String str2 = c0250i32.f854;
                                    C0237h4.m865(str2);
                                    arrayList.add(str2);
                                    strM915 = c0250i32.f1520;
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            String str3 = C0436w1.f1166;
                            C0436w1.m953(strM915, arrayList);
                        } else {
                            int i22 = C0330o.f1000;
                            C0330o.m1173(0, "猪手获取不到Live图");
                        }
                        break;
                    default:
                        C0405t9 c0405t92 = this.f813;
                        Object obj3 = obj;
                        C0237h4.m1090("this$0", c0405t92);
                        C0237h4.m1090("$feedbackBean", obj3);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayListM12402 = C0405t9.m1240(C0373r3.m1202(obj3, "note", false));
                        if (arrayListM12402.isEmpty()) {
                            Iterator<C0250i3> it = C0211f6.f1445.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(it.next().f853);
                            }
                        } else {
                            Iterator it2 = arrayListM12402.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(((C0250i3) it2.next()).f853);
                            }
                        }
                        C0436w1.m953("jpg", arrayList2);
                        break;
                }
            }
        });
        linearLayout.addView(textViewM12434);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۤ, reason: contains not printable characters */
    public final LinearLayout m1242(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        C0325n8.f994.getClass();
        if (C0325n8.m1158()) {
            int iM1038 = (int) C0167c4.m1038(1, 5.0f);
            int color = Color.parseColor("#1a191e");
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setCornerRadius(iM1038);
            gradientDrawable.setColor(color);
            linearLayout.setBackground(gradientDrawable);
        } else {
            int iM10382 = (int) C0167c4.m1038(1, 5.0f);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setGradientType(0);
            gradientDrawable2.setCornerRadius(iM10382);
            gradientDrawable2.setColor(-1);
            linearLayout.setBackground(gradientDrawable2);
        }
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i = AbstractAlertDialogC0471ya.f1886;
        linearLayout.setPadding(0, i, 0, 0);
        int i2 = this.f1822;
        layoutParams.setMargins(i2, i, i2, i);
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۥ, reason: contains not printable characters */
    public final TextView m1243(Context context, String str) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(16.0f);
        C0325n8.f994.getClass();
        textView.setTextColor(C0325n8.m1158() ? -1 : -16777216);
        textView.setPadding(this.f1822, (int) C0167c4.m1038(1, 8.0f), 0, (int) C0167c4.m1038(1, 15.0f));
        return textView;
    }
}
