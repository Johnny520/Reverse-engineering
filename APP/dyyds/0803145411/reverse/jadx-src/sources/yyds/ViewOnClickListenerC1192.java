package yyds;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Editable;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import com.android.NativeUtil;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.p000ss.android.ugc.awemes.MainActivity;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.ugc.aweme.ImageUrlStruct;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛵᲀᲈᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1192 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f5461;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5462;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f5463;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f5464;

    public /* synthetic */ ViewOnClickListenerC1192(InterfaceC2266 interfaceC2266, C0763 c0763, LinkedHashMap linkedHashMap) {
        this.f5462 = 17;
        this.f5461 = interfaceC2266;
        this.f5464 = c0763;
        this.f5463 = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x033a  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) throws Exception {
        Object c2658;
        String string;
        Emoji emoji;
        boolean zM1313;
        final int i = 5;
        final int i2 = 2;
        int i3 = 0;
        int i4 = 3;
        Object next = null;
        switch (this.f5462) {
            case 0:
                C2565 c2565 = (C2565) this.f5464;
                InterfaceC2266 interfaceC2266 = (InterfaceC2266) this.f5461;
                Dialog dialog = (Dialog) this.f5463;
                if (c2565 != null) {
                    String str = c2565.f12649;
                    C1937.f9742.getClass();
                    AbstractC2328.m4341(-602085268292462L);
                    synchronized (C1937.f9746) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(C1937.m3733());
                        if (linkedHashMap.remove(str) != null) {
                            C1937.m3735(linkedHashMap);
                        }
                        break;
                    }
                    interfaceC2266.mo731();
                    dialog.dismiss();
                    AbstractC1960.m3789(AbstractC2328.m4341(-215228974007150L));
                    return;
                }
                return;
            case 1:
                AbstractC2071.m3952((Context) this.f5464, null, new C0654((C1633) this.f5461, (C0172) this.f5463, i3));
                return;
            case 2:
                EditText editText = (EditText) this.f5464;
                C0184 c0184 = (C0184) this.f5461;
                AlertDialog alertDialog = (AlertDialog) this.f5463;
                String strM2001 = AbstractC0897.m2001(editText);
                if (strM2001.length() == 0) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-129346807956334L));
                    return;
                }
                File file = new File(strM2001);
                if (!file.exists()) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-129385462661998L));
                    return;
                }
                if (!file.isDirectory()) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-129411232465774L));
                    return;
                }
                if (!file.canRead()) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-129441297236846L));
                    return;
                }
                C1509.f7142.getClass();
                AbstractC2328.m4341(-28848868197230L);
                C1509.f7101.m1581(C1509.f7179[201], strM2001);
                c0184.m768(strM2001);
                alertDialog.dismiss();
                return;
            case 3:
                Activity activity = (Activity) this.f5464;
                C0172 c0172 = (C0172) this.f5461;
                AlertDialog alertDialog2 = (AlertDialog) this.f5463;
                AbstractC2328.m4341(-191301711201134L);
                AbstractC2328.m4341(-191306006168430L);
                AbstractC2328.m4341(-191310301135726L);
                String strM4341 = AbstractC2328.m4341(-191314596103022L);
                AbstractC2328.m4341(-191318891070318L);
                String strM43412 = AbstractC2328.m4341(-207300464378734L);
                AbstractC2328.m4341(-191323186037614L);
                String strM43413 = AbstractC2328.m4341(-207330529149806L);
                AbstractC2328.m4341(-191331775972206L);
                String strM43414 = AbstractC2328.m4341(-207485147972462L);
                AbstractC2328.m4341(-191434855187310L);
                String strM43415 = AbstractC2328.m4341(-207506622808942L);
                C2661 c2661 = new C2661(activity, c0172, alertDialog2, i3);
                AbstractC2328.m4341(-191370430677870L);
                new DialogC1378(activity, new C1343(strM43412, strM43413, strM43415, strM4341, strM43414, -1754827, c2661, false)).show();
                return;
            case 4:
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f5464;
                C2713 c2713 = (C2713) this.f5461;
                Dialog dialog2 = (Dialog) this.f5463;
                if (linkedHashMap2.isEmpty()) {
                    return;
                }
                Collection collectionValues = linkedHashMap2.values();
                AbstractC2328.m4341(-160382241637230L);
                c2713.mo371(AbstractC1595.m3269(collectionValues));
                dialog2.dismiss();
                return;
            case 5:
                C0763 c0763 = (C0763) this.f5464;
                View view2 = (View) this.f5461;
                TextView textView = (TextView) this.f5463;
                c0763.m1712();
                C0073 c0073 = C0073.f636;
                Context context = view2.getContext();
                AbstractC2328.m4341(-1085307743798126L);
                C1223 c1223 = new C1223(i4, textView);
                c0073.getClass();
                AbstractC2328.m4341(-196116369539950L);
                AbstractC2328.m4341(-196150729278318L);
                ArrayList arrayListM2490 = AbstractC1222.m2490(AbstractC2328.m4341(-196180794049390L));
                AbstractC2328.m4341(-196249513526126L);
                if (arrayListM2490.isEmpty()) {
                    C2701.f13261.getClass();
                    C2701.m4807(context);
                    View viewInflate = AbstractC1115.m2309(context).inflate(R.layout.dialog_comment_bg_settings, (ViewGroup) null, false);
                    int i5 = R.id.btnClearCommentBgImage;
                    TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.btnClearCommentBgImage);
                    if (textView2 != null) {
                        i5 = R.id.btnClose;
                        ImageView imageView = (ImageView) AbstractC1741.m3479(viewInflate, R.id.btnClose);
                        if (imageView != null) {
                            i5 = R.id.btnCommentBgAlphaMinus;
                            TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.btnCommentBgAlphaMinus);
                            if (textView3 != null) {
                                i5 = R.id.btnCommentBgAlphaPlus;
                                TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.btnCommentBgAlphaPlus);
                                if (textView4 != null) {
                                    i5 = R.id.btnPickCommentBgImage;
                                    TextView textView5 = (TextView) AbstractC1741.m3479(viewInflate, R.id.btnPickCommentBgImage);
                                    if (textView5 != null) {
                                        i5 = R.id.btnScaleTypeCenterCrop;
                                        TextView textView6 = (TextView) AbstractC1741.m3479(viewInflate, R.id.btnScaleTypeCenterCrop);
                                        if (textView6 != null) {
                                            i5 = R.id.btnScaleTypeFitCenter;
                                            TextView textView7 = (TextView) AbstractC1741.m3479(viewInflate, R.id.btnScaleTypeFitCenter);
                                            if (textView7 != null) {
                                                i5 = R.id.btnScaleTypeFitXY;
                                                TextView textView8 = (TextView) AbstractC1741.m3479(viewInflate, R.id.btnScaleTypeFitXY);
                                                if (textView8 != null) {
                                                    i5 = R.id.btnScaleTypeTile;
                                                    TextView textView9 = (TextView) AbstractC1741.m3479(viewInflate, R.id.btnScaleTypeTile);
                                                    if (textView9 != null) {
                                                        i5 = R.id.etBlurOverlayColor;
                                                        EditText editText2 = (EditText) AbstractC1741.m3479(viewInflate, R.id.etBlurOverlayColor);
                                                        if (editText2 != null) {
                                                            i5 = R.id.etCommentBgColorInput;
                                                            EditText editText3 = (EditText) AbstractC1741.m3479(viewInflate, R.id.etCommentBgColorInput);
                                                            if (editText3 != null) {
                                                                i5 = R.id.ivCommentBgThumb;
                                                                ImageView imageView2 = (ImageView) AbstractC1741.m3479(viewInflate, R.id.ivCommentBgThumb);
                                                                if (imageView2 != null) {
                                                                    i5 = R.id.layoutBlurParams;
                                                                    LinearLayout linearLayout = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.layoutBlurParams);
                                                                    if (linearLayout != null) {
                                                                        i5 = R.id.layoutColorImageParams;
                                                                        LinearLayout linearLayout2 = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.layoutColorImageParams);
                                                                        if (linearLayout2 != null) {
                                                                            i5 = R.id.seekbarBlurCorner;
                                                                            SeekBar seekBar = (SeekBar) AbstractC1741.m3479(viewInflate, R.id.seekbarBlurCorner);
                                                                            if (seekBar != null) {
                                                                                i5 = R.id.seekbarBlurDownsample;
                                                                                SeekBar seekBar2 = (SeekBar) AbstractC1741.m3479(viewInflate, R.id.seekbarBlurDownsample);
                                                                                if (seekBar2 != null) {
                                                                                    i5 = R.id.seekbarBlurRadius;
                                                                                    SeekBar seekBar3 = (SeekBar) AbstractC1741.m3479(viewInflate, R.id.seekbarBlurRadius);
                                                                                    if (seekBar3 != null) {
                                                                                        i5 = R.id.seekbarCommentBgAlpha;
                                                                                        SeekBar seekBar4 = (SeekBar) AbstractC1741.m3479(viewInflate, R.id.seekbarCommentBgAlpha);
                                                                                        if (seekBar4 != null) {
                                                                                            i5 = R.id.switchCommentBgBlurEnabled;
                                                                                            Switch r25 = (Switch) AbstractC1741.m3479(viewInflate, R.id.switchCommentBgBlurEnabled);
                                                                                            if (r25 != null) {
                                                                                                i5 = R.id.switchCommentBgEnabled;
                                                                                                Switch r26 = (Switch) AbstractC1741.m3479(viewInflate, R.id.switchCommentBgEnabled);
                                                                                                if (r26 != null) {
                                                                                                    i5 = R.id.tvBlurCorner;
                                                                                                    TextView textView10 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tvBlurCorner);
                                                                                                    if (textView10 != null) {
                                                                                                        i5 = R.id.tvBlurDownsample;
                                                                                                        TextView textView11 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tvBlurDownsample);
                                                                                                        if (textView11 != null) {
                                                                                                            i5 = R.id.tvBlurRadius;
                                                                                                            TextView textView12 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tvBlurRadius);
                                                                                                            if (textView12 != null) {
                                                                                                                i5 = R.id.tvCommentBgAlpha;
                                                                                                                TextView textView13 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tvCommentBgAlpha);
                                                                                                                if (textView13 != null) {
                                                                                                                    i5 = R.id.viewBlurOverlayColorPreview;
                                                                                                                    View viewM3479 = AbstractC1741.m3479(viewInflate, R.id.viewBlurOverlayColorPreview);
                                                                                                                    if (viewM3479 != null) {
                                                                                                                        i5 = R.id.viewCommentBgColorPreview;
                                                                                                                        View viewM34792 = AbstractC1741.m3479(viewInflate, R.id.viewCommentBgColorPreview);
                                                                                                                        if (viewM34792 != null) {
                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) viewInflate;
                                                                                                                            C1729 c1729 = new C1729(linearLayout3, textView2, imageView, textView3, textView4, textView5, textView6, textView7, textView8, textView9, editText2, editText3, imageView2, linearLayout, linearLayout2, seekBar, seekBar2, seekBar3, seekBar4, r25, r26, textView10, textView11, textView12, textView13, viewM3479, viewM34792);
                                                                                                                            AbstractC2328.m4341(-196378362545006L);
                                                                                                                            C0912 c0912 = new C0912(ActivityStack.getTopActivity());
                                                                                                                            c0912.f4152 = AbstractC2328.m4341(-196434197119854L);
                                                                                                                            c0912.m2033(linearLayout3);
                                                                                                                            c0912.m2029(new ViewOnTouchListenerC0565());
                                                                                                                            c0912.m2032();
                                                                                                                            c0912.m2026();
                                                                                                                            c0912.f4155 = new C0644(c1729, context, c1223);
                                                                                                                            c0912.m2025();
                                                                                                                            return;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C0188.m789(AbstractC2328.m4341(-1742901596554094L).concat(viewInflate.getResources().getResourceName(i5)));
                    return;
                }
                return;
            case 6:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C1126((Context) this.f5464, (String) this.f5461, (String) this.f5463, null, 1), 3);
                return;
            case 7:
                AbstractC2071.m3959(AbstractC2797.m4924(), null, new C1647((Comment) this.f5464, (Context) this.f5461, (String) this.f5463, (InterfaceC0274) null), 3);
                return;
            case 8:
                C0947 c0947 = (C0947) this.f5464;
                C2146 c2146 = (C2146) this.f5461;
                AlertDialog alertDialog3 = (AlertDialog) this.f5463;
                int i6 = c0947.f4410;
                if (i6 < 0) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-966032207020910L));
                    return;
                } else {
                    c2146.mo371(Integer.valueOf(i6));
                    alertDialog3.dismiss();
                    return;
                }
            case 9:
                C0947 c09472 = (C0947) this.f5464;
                C2146 c21462 = (C2146) this.f5461;
                AlertDialog alertDialog4 = (AlertDialog) this.f5463;
                int i7 = c09472.f4410;
                if (i7 == -1) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-966070861726574L));
                    return;
                } else {
                    c21462.mo371(Integer.valueOf(i7));
                    alertDialog4.dismiss();
                    return;
                }
            case 10:
                C1417 c1417 = (C1417) this.f5464;
                MainActivity mainActivity = (MainActivity) this.f5461;
                AlertDialog alertDialog5 = (AlertDialog) this.f5463;
                List list = MainActivity.f451;
                c1417.f6702 = true;
                mainActivity.getPreferences(0).edit().putString(AbstractC2328.m4341(-271355606631278L), mainActivity.f477.f4609).apply();
                alertDialog5.dismiss();
                return;
            case 11:
                C2368 c2368 = (C2368) this.f5464;
                C1016 c1016 = (C1016) this.f5461;
                LinearLayout linearLayout4 = (LinearLayout) this.f5463;
                List list2 = MainActivity.f451;
                c2368.mo511(c1016, linearLayout4);
                return;
            case 12:
                MainActivity mainActivity2 = (MainActivity) this.f5464;
                C0539 c0539 = (C0539) this.f5461;
                Intent intent = (Intent) this.f5463;
                TextView textView14 = c0539.f2589;
                List list3 = MainActivity.f451;
                mainActivity2.m325(textView14);
                try {
                    mainActivity2.startActivity(intent);
                    c2658 = C2746.f13459;
                    break;
                } catch (Throwable th) {
                    c2658 = new C2658(th);
                }
                if (C2248.m4249(c2658) != null) {
                    Toast.makeText(c0539.getContext(), AbstractC2328.m4341(-1342189737771886L), 0).show();
                    return;
                }
                return;
            case 13:
                C2673 c2673 = (C2673) this.f5464;
                Dialog dialog3 = (Dialog) this.f5463;
                Context context2 = (Context) this.f5461;
                ArrayList arrayList = c2673.f13120;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    Aweme aweme = (Aweme) obj;
                    if (c2673.f13121.contains(C2673.m4765(aweme)) && c2673.m4766(aweme)) {
                        arrayList2.add(obj);
                    }
                }
                if (arrayList2.isEmpty()) {
                    arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (c2673.m4766((Aweme) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-200192293503854L));
                    return;
                } else {
                    dialog3.dismiss();
                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C1360(arrayList2, context2, null), 3);
                    return;
                }
            case 14:
                EditText editText4 = (EditText) this.f5464;
                String str2 = (String) this.f5461;
                Context context3 = (Context) this.f5463;
                String string2 = editText4.getText().toString();
                int iM1487 = AbstractC0598.m1487(editText4.getSelectionStart(), 0, string2.length());
                String string3 = new StringBuilder(string2).insert(iM1487, str2).toString();
                AbstractC2328.m4341(-112407456940910L);
                editText4.setText(string3);
                editText4.setSelection(str2.length() + iM1487);
                editText4.requestFocus();
                C1327 c1327 = C1327.f6093;
                C1327.m2618(context3);
                return;
            case 15:
                final String[] strArr = (String[]) this.f5464;
                Context context4 = (Context) this.f5461;
                final String[] strArr2 = (String[]) this.f5463;
                C1509.f7142.getClass();
                List listM1296 = AbstractC0473.m1296(C1509.m3121(), new String[]{AbstractC2328.m4341(-138469318493038L)}, 6);
                ArrayList arrayList3 = new ArrayList();
                Iterator it = listM1296.iterator();
                while (it.hasNext()) {
                    int iM3942 = AbstractC2070.m3942((String) it.next(), strArr2);
                    Integer numValueOf = Integer.valueOf(iM3942);
                    if (iM3942 < 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList3.add(numValueOf);
                    }
                }
                int[] iArrM3268 = AbstractC1595.m3268(arrayList3);
                C1022 c1022M2210 = C1022.m2210();
                c1022M2210.m2215(strArr);
                c1022M2210.m2217();
                c1022M2210.f3518 = AbstractC2328.m4341(-138477908427630L);
                c1022M2210.m2220();
                c1022M2210.m2212(iArrM3268);
                c1022M2210.f3532 = false;
                c1022M2210.m2220();
                c1022M2210.f3527 = AbstractC2328.m4341(-138507973198702L);
                c1022M2210.m2220();
                c1022M2210.f4652 = true;
                c1022M2210.f21 = null;
                c1022M2210.m4();
                c1022M2210.m2220();
                c1022M2210.f4656 = AbstractC2328.m4341(-138563807773550L);
                c1022M2210.m2220();
                final int i8 = 7;
                c1022M2210.m2219(AbstractC2328.m4341(-138593872544622L), new InterfaceC1006() { // from class: yyds.ᲇᛲᛷᲈ
                    static {
                        NativeUtil.classesInit0(79);
                    }

                    @Override // yyds.InterfaceC1006
                    /* JADX INFO: renamed from: ᛲᲈᲁ */
                    public final native boolean mo1031(AbstractC0041 abstractC0041);
                });
                final int i9 = 8;
                c1022M2210.m2218(AbstractC2328.m4341(-138606757446510L), new InterfaceC1006() { // from class: yyds.ᲇᛲᛷᲈ
                    static {
                        NativeUtil.classesInit0(79);
                    }

                    @Override // yyds.InterfaceC1006
                    /* JADX INFO: renamed from: ᛲᲈᲁ */
                    public final native boolean mo1031(AbstractC0041 abstractC0041);
                });
                String strM43416 = AbstractC2328.m4341(-138619642348398L);
                InterfaceC1006 interfaceC1006 = new InterfaceC1006() { // from class: yyds.ᲁᛶᛷᛲ
                    static {
                        NativeUtil.classesInit0(178);
                    }

                    @Override // yyds.InterfaceC1006
                    /* JADX INFO: renamed from: ᛲᲈᲁ */
                    public final native boolean mo1031(AbstractC0041 abstractC0041);
                };
                c1022M2210.f3514 = strM43416;
                c1022M2210.f3526 = interfaceC1006;
                c1022M2210.m2220();
                c1022M2210.m1715(context4);
                return;
            case 16:
                String[] strArr3 = (String[]) this.f5464;
                Context context5 = (Context) this.f5461;
                TextView textView15 = (TextView) this.f5463;
                C1022 c1022M22102 = C1022.m2210();
                c1022M22102.m2215(strArr3);
                c1022M22102.m2211();
                C1509.f7142.getClass();
                c1022M22102.m2225(AbstractC0598.m1487(C1509.m3060(), 0, 3));
                c1022M22102.f3518 = AbstractC2328.m4341(-139598894891886L);
                c1022M22102.m2220();
                c1022M22102.f3527 = AbstractC2328.m4341(-139628959662958L);
                c1022M22102.m2220();
                c1022M22102.f4668 = new C0571(textView15, i4, strArr3);
                c1022M22102.f3514 = AbstractC2328.m4341(-139714859008878L);
                c1022M22102.m2220();
                c1022M22102.m1715(context5);
                return;
            case 17:
                InterfaceC2266 interfaceC22662 = (InterfaceC2266) this.f5461;
                C0763 c07632 = (C0763) this.f5464;
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.f5463;
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    String str3 = (String) entry.getKey();
                    C0570 c0570 = (C0570) entry.getValue();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(AbstractC2328.m4341(-110771074401134L), c0570.f2752);
                    String strM43417 = AbstractC2328.m4341(-110792549237614L);
                    Editable text = c0570.f2749.getText();
                    String string4 = (text == null || (string = text.toString()) == null) ? null : AbstractC0473.m1314(string).toString();
                    if (string4 == null) {
                        string4 = AbstractC2328.m4341(-110818319041390L);
                    }
                    jSONObject2.put(strM43417, string4);
                    jSONObject.put(str3, jSONObject2);
                }
                C1509 c1509 = C1509.f7142;
                String string5 = jSONObject.toString();
                AbstractC2328.m4341(-110822614008686L);
                c1509.getClass();
                AbstractC2328.m4341(-28745788982126L);
                C1509.f7259.m1581(C1509.f7179[191], string5);
                AbstractC1960.m3789(AbstractC2328.m4341(-110882743550830L));
                if (interfaceC22662 != null) {
                    interfaceC22662.mo731();
                }
                c07632.m1712();
                return;
            case 18:
                C0947 c09473 = (C0947) this.f5464;
                C2214 c2214 = (C2214) this.f5461;
                Context context6 = (Context) this.f5463;
                C1022 c1022M22103 = C1022.m2210();
                c1022M22103.m2225(c09473.f4410);
                c1022M22103.m2222(c2214.f10952);
                c1022M22103.f3514 = AbstractC2328.m4341(-121663111463790L);
                c1022M22103.m2220();
                c1022M22103.m2218(AbstractC2328.m4341(-121675996365678L), new C2202(c09473, c2214, 1));
                c1022M22103.m1715(context6);
                return;
            case 19:
                final Context context7 = (Context) this.f5464;
                final TextView textView16 = (TextView) this.f5461;
                final FrameLayout frameLayout = (FrameLayout) this.f5463;
                C1509.f7142.getClass();
                final int i10 = C1509.m3098() == 4 ? 9 : 4;
                final String strM43418 = AbstractC2328.m4341(i10 == 4 ? -226481788322670L : -226498968191854L);
                new AlertDialog.Builder(context7).setTitle(AbstractC2328.m4341(-226516148061038L)).setMessage(AbstractC2328.m4341(-226546212832110L) + strM43418 + AbstractC2328.m4341(-226576277603182L)).setPositiveButton(AbstractC2328.m4341(-226683651785582L), new DialogInterface.OnClickListener(i10, textView16, strM43418, context7, frameLayout) { // from class: yyds.ᛱᛶᲈᛲ

                    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
                    public final /* synthetic */ String f942;

                    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
                    public final /* synthetic */ FrameLayout f943;

                    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
                    public final /* synthetic */ int f944;

                    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
                    public final /* synthetic */ Context f945;

                    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                    public final /* synthetic */ TextView f946;

                    @Override // android.content.DialogInterface.OnClickListener
                    public final native void onClick(DialogInterface dialogInterface, int i11);
                }).setNegativeButton(AbstractC2328.m4341(-226696536687470L), (DialogInterface.OnClickListener) null).show();
                return;
            case 20:
                View view3 = (View) this.f5464;
                final List listM3265 = (List) this.f5461;
                final TextView textView17 = (TextView) this.f5463;
                Context context8 = view3.getContext();
                C2701.f13261.getClass();
                C2701.m4807(context8);
                C1509.f7142.getClass();
                float fM3084 = C1509.m3084();
                if (listM3265.isEmpty()) {
                    listM3265 = AbstractC1595.m3265(AbstractC1595.m3279(listM3265, Float.valueOf(fM3084)));
                } else {
                    Iterator it2 = listM3265.iterator();
                    while (it2.hasNext()) {
                        if (Math.abs(((Number) it2.next()).floatValue() - fM3084) < 1.0E-4f) {
                        }
                    }
                    listM3265 = AbstractC1595.m3265(AbstractC1595.m3279(listM3265, Float.valueOf(fM3084)));
                }
                C1953 c1953 = (C1953) AbstractC2725.m4849(listM3265).iterator();
                if (c1953.f9807) {
                    next = c1953.next();
                    if (c1953.f9807) {
                        float fAbs = Math.abs(((Number) listM3265.get(((Number) next).intValue())).floatValue() - fM3084);
                        do {
                            Object next2 = c1953.next();
                            float fAbs2 = Math.abs(((Number) listM3265.get(((Number) next2).intValue())).floatValue() - fM3084);
                            if (Float.compare(fAbs, fAbs2) > 0) {
                                next = next2;
                                fAbs = fAbs2;
                            }
                        } while (c1953.f9807);
                    }
                }
                Integer num = (Integer) next;
                int iIntValue = num != null ? num.intValue() : 2;
                C1022 c1022M2209 = C1022.m2209(context8);
                c1022M2209.f3518 = AbstractC2328.m4341(-181912912692078L);
                c1022M2209.m2220();
                c1022M2209.f3527 = AbstractC2328.m4341(-181934387528558L);
                c1022M2209.m2220();
                ArrayList arrayList4 = new ArrayList(AbstractC0055.m419(listM3265, 10));
                Iterator it3 = listM3265.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(AbstractC2104.m4000(new Object[]{Float.valueOf(((Number) it3.next()).floatValue())}, 1, AbstractC2328.m4341(-182007401972590L), -182028876809070L).concat("x"));
                }
                c1022M2209.m2222(arrayList4);
                c1022M2209.m2225(iIntValue);
                c1022M2209.m2218(AbstractC2328.m4341(-182080416416622L), new InterfaceC1006() { // from class: yyds.ᛴᲈ
                    static {
                        NativeUtil.classesInit0(206);
                    }

                    @Override // yyds.InterfaceC1006
                    /* JADX INFO: renamed from: ᛲᲈᲁ */
                    public final native boolean mo1031(AbstractC0041 abstractC0041);
                });
                c1022M2209.f3514 = AbstractC2328.m4341(-182093301318510L);
                c1022M2209.m2220();
                c1022M2209.m1715(context8);
                return;
            case 21:
                C1417 c14172 = (C1417) this.f5464;
                Set set = (Set) this.f5461;
                C0901 c0901 = (C0901) this.f5463;
                C1516 c1516 = c0901.f4109;
                if (c14172.f6702) {
                    return;
                }
                boolean zContains = set.contains(c1516.f7320);
                String str4 = c1516.f7320;
                if (zContains) {
                    set.remove(str4);
                } else {
                    set.add(str4);
                }
                C1509 c15092 = C1509.f7142;
                String strM3285 = AbstractC1595.m3285(set, AbstractC2328.m4341(-119889289970542L), null, null, null, 62);
                c15092.getClass();
                AbstractC2328.m4341(-28917587673966L);
                C1509.f7115.m1581(C1509.f7179[207], strM3285);
                ViewParent parent = c0901.f4110.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    TransitionManager.beginDelayedTransition(viewGroup, new AutoTransition().setDuration(200L));
                }
                AbstractC0395.m1130(set, c0901);
                return;
            case 22:
                C0052 c0052 = (C0052) this.f5464;
                AlertDialog alertDialog6 = (AlertDialog) this.f5461;
                Context context9 = (Context) this.f5463;
                String strM20012 = AbstractC0897.m2001((EditText) c0052.f551);
                if (strM20012.length() == 0) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-213274763887470L));
                    return;
                } else {
                    alertDialog6.dismiss();
                    AbstractC1367.m2782(context9, strM20012);
                    return;
                }
            case 23:
                C0488 c0488 = (C0488) this.f5464;
                Object obj3 = this.f5461;
                Context context10 = (Context) this.f5463;
                int i11 = AbstractC2293.f11258;
                C1189 c1189M3892 = AbstractC0476.m1327(c0488.f2405).m3892();
                c1189M3892.f5456 = new C0514(29);
                c1189M3892.m2393();
                C0536 c0536 = (C0536) AbstractC1595.m3281(c1189M3892.mo736());
                PopupWindow popupWindow = c0536 != null ? (PopupWindow) c0536.m1376(new Object[0]) : null;
                C0802 c0802M3893 = AbstractC0476.m1327(obj3).m3893();
                c0802M3893.f3681 = AbstractC2328.m4341(-969253432492910L);
                C1558 c1558 = (C1558) AbstractC1595.m3281(c0802M3893.mo736());
                Object objM3209 = c1558 != null ? c1558.m3209() : null;
                String strM43419 = AbstractC2328.m4341(-969451000988526L);
                Object[] objArr = new Object[0];
                if (objM3209 != null) {
                    try {
                        C2014 c2014M1327 = AbstractC0476.m1327(objM3209);
                        ((C0903) c2014M1327.f10074).f4118 = 2;
                        C1189 c1189M38922 = c2014M1327.m3892();
                        c1189M38922.m4478();
                        c1189M38922.f12003 = strM43419;
                        AbstractC2328.m4341(-872178581668718L);
                        C0536 c05362 = (C0536) AbstractC1595.m3281(c1189M38922.mo736());
                        Object objM1372 = c05362 != null ? c05362.m1372(Arrays.copyOf(objArr, 0)) : null;
                        if (!(objM1372 instanceof Emoji)) {
                            objM1372 = null;
                        }
                        emoji = (Emoji) objM1372;
                    } catch (Exception e) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-969515425497966L), e);
                        emoji = null;
                    }
                    break;
                }
                if (emoji != null) {
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    }
                    C2336.f11496.m4354(AbstractC2328.m4341(-969588439941998L) + emoji);
                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C1647(emoji, context10, null), 3);
                    return;
                }
                return;
            case 24:
                C0947 c09474 = (C0947) this.f5464;
                C2585 c2585 = (C2585) this.f5461;
                C0947 c09475 = (C0947) this.f5463;
                C1509.f7142.getClass();
                boolean z = C1509.m3083() == 5;
                if (z) {
                    C1509.f7216.m1581(C1509.f7179[31], 0);
                    if (c09474.f4410 == 5) {
                        c09474.f4410 = 0;
                        C0050.m376(c2585, c09474);
                    }
                }
                C1082 c1082 = C1082.f4981;
                synchronized (C1082.f4982) {
                    C1082.f4984++;
                    zM1313 = AbstractC0473.m1313(C1509.m3113());
                    C1509.m3077(AbstractC2328.m4341(-562185022112622L));
                    String string6 = UUID.randomUUID().toString();
                    AbstractC2328.m4341(-562782022566766L);
                    C1509.m3093(string6);
                    C1082.f4986 = null;
                    C1082.f4980 = null;
                }
                if (!zM1313) {
                    C1082.m2291();
                }
                if (zM1313) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-232254224368494L));
                } else {
                    AbstractC1960.m3789(AbstractC2328.m4341(-232206979728238L));
                }
                if (z) {
                    C0142.m642();
                }
                C0050.m375(c2585, c09475);
                return;
            case 25:
                String str5 = (String) this.f5464;
                Context context11 = (Context) this.f5461;
                Aweme aweme2 = (Aweme) this.f5463;
                if (str5 == null || AbstractC0473.m1313(str5)) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-211019906057070L));
                    return;
                } else {
                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C2429(context11, aweme2, null, 1), 3);
                    return;
                }
            case 26:
                ImageUrlStruct imageUrlStruct = (ImageUrlStruct) this.f5464;
                Context context12 = (Context) this.f5461;
                String str6 = (String) this.f5463;
                Map map = C2609.f12814;
                List listM4683 = C2609.m4683(imageUrlStruct.video);
                if (listM4683 != null && !listM4683.isEmpty()) {
                    String str7 = (String) AbstractC1595.m3280(listM4683);
                    C1327 c13272 = C1327.f6093;
                    AbstractC2328.m4341(-533035079074670L);
                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C1126(context12, str6, str7, null, 2), 3);
                    return;
                }
                C2701 c2701 = C2701.f13261;
                String strM434110 = AbstractC2328.m4341(-211054265795438L);
                c2701.getClass();
                AbstractC2328.m4341(-744394714678126L);
                AbstractC2328.m4341(-744429074416494L);
                C1624 c1624M3321 = C1624.m3321(strM434110);
                try {
                    try {
                        AbstractC2071.m3959(AbstractC2797.m4924(), null, new C2474(context12, str6, null, 4), 3);
                        break;
                    } catch (Exception e2) {
                        C2336.f11496.m4355(AbstractC2328.m4341(-744454844220270L), e2);
                        break;
                    }
                    return;
                } finally {
                    c1624M3321.m3327();
                }
            case 27:
                EditText editText5 = (EditText) this.f5464;
                InterfaceC1549 interfaceC1549 = (InterfaceC1549) this.f5461;
                Dialog dialog4 = (Dialog) this.f5463;
                if (((Boolean) interfaceC1549.mo371(editText5.getVisibility() == 0 ? editText5.getText().toString() : null)).booleanValue()) {
                    dialog4.dismiss();
                    return;
                }
                return;
            case 28:
                C0947 c09476 = (C0947) this.f5464;
                TextView textView18 = (TextView) this.f5461;
                C0438 c0438 = (C0438) this.f5463;
                int i12 = (c09476.f4410 + 1) % 3;
                c09476.f4410 = i12;
                textView18.setText(i12 != 1 ? i12 != 2 ? AbstractC2328.m4341(-984406077113198L) : AbstractC2328.m4341(-984393192211310L) : AbstractC2328.m4341(-984371717374830L));
                c0438.mo731();
                return;
            default:
                C1521 c1521 = (C1521) this.f5464;
                Context context13 = (Context) this.f5461;
                C0763 c07633 = (C0763) this.f5463;
                String strM20013 = AbstractC0897.m2001((EditText) c1521.f7343);
                String strM20014 = AbstractC0897.m2001((EditText) c1521.f7339);
                String strM20015 = AbstractC0897.m2001((EditText) c1521.f7342);
                if (strM20013.length() == 0 || strM20014.length() == 0 || strM20015.length() == 0) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-191018243359598L));
                    return;
                }
                C0695.f3286.getClass();
                AbstractC2328.m4341(-599594187260782L);
                AbstractC2328.m4341(-599628546999150L);
                AbstractC2328.m4341(-599671496672110L);
                AbstractC2328.m4341(-599710151377774L);
                SharedPreferences.Editor editorEdit = C0695.m1610(context13).edit();
                editorEdit.putString(AbstractC2328.m4341(-599748806083438L), strM20013);
                editorEdit.putString(AbstractC2328.m4341(-599796050723694L), strM20014);
                editorEdit.putString(AbstractC2328.m4341(-599834705429358L), strM20015);
                editorEdit.apply();
                editorEdit.commit();
                AbstractC0027.m3912().putString(AbstractC2328.m4341(-599873360135022L), strM20013);
                AbstractC0027.m3912().putString(AbstractC2328.m4341(-599920604775278L), strM20014);
                AbstractC0027.m3912().putString(AbstractC2328.m4341(-599959259480942L), strM20015);
                AbstractC1960.m3789(AbstractC2328.m4341(-191052603097966L));
                c07633.m1712();
                return;
        }
    }

    public /* synthetic */ ViewOnClickListenerC1192(Object obj, Object obj2, Object obj3, int i) {
        this.f5462 = i;
        this.f5464 = obj;
        this.f5461 = obj2;
        this.f5463 = obj3;
    }

    public /* synthetic */ ViewOnClickListenerC1192(C2673 c2673, Dialog dialog, Context context) {
        this.f5462 = 13;
        this.f5464 = c2673;
        this.f5463 = dialog;
        this.f5461 = context;
    }
}
