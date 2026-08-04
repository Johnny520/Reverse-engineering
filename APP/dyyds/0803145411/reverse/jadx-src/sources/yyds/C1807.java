package yyds;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.NativeUtil;
import com.android.app.CustomRecyclerView;
import com.bumptech.glide.ComponentCallbacks2C0040;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛸᛶᲇᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1807 extends AbstractC1865 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f9080;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f9081;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f9082;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1807(Set set, C0172 c0172) {
        super(R.layout.dialog_comment_filter);
        this.f9082 = 0;
        this.f9080 = set;
        this.f9081 = c0172;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final void m3579(C1633 c1633, Pair[] pairArr) {
        C1509.f7142.getClass();
        Set<String> setM3090 = C1509.m3090();
        int i = 0;
        if (setM3090 == null || !setM3090.isEmpty()) {
            int i2 = 0;
            for (String str : setM3090) {
                int length = pairArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (AbstractC1544.m3188(pairArr[i3].getFirst(), str)) {
                        i2++;
                        if (i2 < 0) {
                            AbstractC2725.m4851();
                            throw null;
                        }
                    } else {
                        i3++;
                    }
                }
            }
            i = i2;
        }
        ((TextView) c1633.f8333).setText(AbstractC2328.m4341(-1085994938565486L) + i + AbstractC2328.m4341(-1086016413401966L));
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final void m3580(C1633 c1633) {
        String strM4341;
        C1509.f7142.getClass();
        int size = ((Set) C1509.f7196.m1579(C1509.f7179[140])).size();
        TextView textView = (TextView) c1633.f8335;
        if (size > 0) {
            strM4341 = AbstractC2328.m4341(-1085823139873646L) + size + AbstractC2328.m4341(-1085844614710126L);
        } else {
            strM4341 = AbstractC2328.m4341(-1085857499612014L);
        }
        textView.setText(strM4341);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3581(View view, View view2, String str) {
        Object c2658;
        int iIntValue;
        if (str.length() <= 0) {
            str = null;
        }
        if (str != null) {
            try {
                c2658 = Integer.valueOf(Color.parseColor(str));
            } catch (Throwable th) {
                c2658 = new C2658(th);
            }
            Integer num = (Integer) (c2658 instanceof C2658 ? null : c2658);
            iIntValue = num != null ? num.intValue() : 0;
        }
        float f = view.getResources().getDisplayMetrics().density;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(6.0f * f);
        gradientDrawable.setColor(iIntValue);
        gradientDrawable.setStroke((int) (f + 0.5f), 855638016);
        view2.setBackground(gradientDrawable);
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static final void m3582(TextView textView) {
        String strM4341;
        C1509.f7142.getClass();
        int size = ((Set) C1509.f7199.m1579(C1509.f7179[79])).size();
        if (size > 0) {
            strM4341 = AbstractC2328.m4341(-1085080110531438L) + size + AbstractC2328.m4341(-1085101585367918L);
        } else {
            strM4341 = AbstractC2328.m4341(-1085114470269806L);
        }
        textView.setText(strM4341);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static final void m3583(C1521 c1521, C1417 c1417) {
        EditText editText = (EditText) c1521.f7342;
        ImageButton imageButton = (ImageButton) c1521.f7344;
        int selectionStart = editText.getSelectionStart();
        editText.setTransformationMethod(c1417.f6702 ? HideReturnsTransformationMethod.getInstance() : PasswordTransformationMethod.getInstance());
        imageButton.setImageResource(c1417.f6702 ? R.drawable.ic_visibility_off : R.drawable.ic_visibility);
        imageButton.setContentDescription(AbstractC2328.m4341(c1417.f6702 ? -190940933948270L : -190962408784750L));
        editText.setSelection(AbstractC0598.m1487(selectionStart, 0, editText.getText().length()));
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final void m3584(EditText editText, TextView textView) {
        List listM1296 = AbstractC0473.m1296(editText.getText().toString(), new String[]{AbstractC2328.m4341(-145487295054702L)}, 6);
        ArrayList arrayList = new ArrayList(AbstractC0055.m419(listM1296, 10));
        Iterator it = listM1296.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC0473.m1314((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        textView.setText(AbstractC2328.m4341(-145495884989294L) + arrayList2.size() + AbstractC2328.m4341(-145517359825774L));
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x09a4 A[PHI: r2
  0x09a4: PHI (r2v5 int) = 
  (r2v4 int)
  (r2v6 int)
  (r2v7 int)
  (r2v8 int)
  (r2v9 int)
  (r2v10 int)
  (r2v11 int)
  (r2v12 int)
  (r2v13 int)
  (r2v14 int)
  (r2v15 int)
  (r2v16 int)
  (r2v17 int)
 binds: [B:102:0x0518, B:104:0x0523, B:106:0x052c, B:108:0x053b, B:110:0x054a, B:112:0x0559, B:114:0x0568, B:116:0x0577, B:118:0x0586, B:120:0x0595, B:122:0x05a4, B:124:0x05b3, B:126:0x05c2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // yyds.AbstractC1865
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo890(AbstractC0041 abstractC0041, View view) {
        String string;
        C2417 c2417;
        C2417 c24172;
        int i = this.f9082;
        int i2 = 10;
        InterfaceC0274 interfaceC0274 = null;
        final int i3 = 4;
        final int i4 = 2;
        Object obj = this.f9081;
        Object obj2 = this.f9080;
        final int i5 = 1;
        final int i6 = 0;
        switch (i) {
            case 0:
                AbstractC2328.m4341(-145440050414446L);
                AbstractC2328.m4341(-145470115185518L);
                EditText editText = (EditText) view.findViewById(R.id.filterKeywordsEditText);
                TextView textView = (TextView) view.findViewById(R.id.filterCountText);
                editText.setText(AbstractC1595.m3285((Set) obj2, AbstractC2328.m4341(-145478705120110L), null, null, null, 62));
                m3584(editText, textView);
                editText.addTextChangedListener(new C1673((C0172) obj, editText, textView));
                break;
            case 1:
                View view2 = (View) obj;
                C0763 c0763 = (C0763) obj2;
                AbstractC2328.m4341(-1083770145506158L);
                AbstractC2328.m4341(-1083800210277230L);
                C2701 c2701 = C2701.f13261;
                Context context = view.getContext();
                c2701.getClass();
                C2701.m4807(context);
                int i7 = R.id.buryAlert;
                Switch r15 = (Switch) AbstractC1741.m3479(view, R.id.buryAlert);
                if (r15 != null) {
                    i7 = R.id.buryAlertRl;
                    if (((LinearLayout) AbstractC1741.m3479(view, R.id.buryAlertRl)) != null) {
                        i7 = R.id.buryAlertView;
                        if (AbstractC1741.m3479(view, R.id.buryAlertView) != null) {
                            i7 = R.id.commentBgSettingLayout;
                            LinearLayout linearLayout = (LinearLayout) AbstractC1741.m3479(view, R.id.commentBgSettingLayout);
                            if (linearLayout != null) {
                                i7 = R.id.commentBgSettingValue;
                                TextView textView2 = (TextView) AbstractC1741.m3479(view, R.id.commentBgSettingValue);
                                if (textView2 != null) {
                                    i7 = R.id.commentColorPreview;
                                    View viewM3479 = AbstractC1741.m3479(view, R.id.commentColorPreview);
                                    if (viewM3479 != null) {
                                        TextView textView3 = (TextView) AbstractC1741.m3479(view, R.id.commentDialogMenuCount);
                                        if (textView3 != null) {
                                            LinearLayout linearLayout2 = (LinearLayout) AbstractC1741.m3479(view, R.id.commentDialogMenuLayout);
                                            if (linearLayout2 != null) {
                                                TextView textView4 = (TextView) AbstractC1741.m3479(view, R.id.commentFilterCount);
                                                if (textView4 != null) {
                                                    LinearLayout linearLayout3 = (LinearLayout) AbstractC1741.m3479(view, R.id.commentFilterLayout);
                                                    if (linearLayout3 != null) {
                                                        TextView textView5 = (TextView) AbstractC1741.m3479(view, R.id.commentMenuHiddenCount);
                                                        if (textView5 != null) {
                                                            LinearLayout linearLayout4 = (LinearLayout) AbstractC1741.m3479(view, R.id.commentMenuHiddenLayout);
                                                            if (linearLayout4 == null) {
                                                                i7 = R.id.commentMenuHiddenLayout;
                                                            } else if (((LinearLayout) AbstractC1741.m3479(view, R.id.commentPanelHeightLayout)) != null) {
                                                                SeekBar seekBar = (SeekBar) AbstractC1741.m3479(view, R.id.commentPanelHeightSeekBar);
                                                                if (seekBar != null) {
                                                                    TextView textView6 = (TextView) AbstractC1741.m3479(view, R.id.commentPanelHeightValue);
                                                                    if (textView6 != null) {
                                                                        Switch r8 = (Switch) AbstractC1741.m3479(view, R.id.commentPauseVideo);
                                                                        if (r8 != null) {
                                                                            EditText editText2 = (EditText) AbstractC1741.m3479(view, R.id.commentTextColorEditText);
                                                                            if (editText2 != null) {
                                                                                int i8 = R.id.diggAlert;
                                                                                Switch r7 = (Switch) AbstractC1741.m3479(view, R.id.diggAlert);
                                                                                if (r7 != null) {
                                                                                    i8 = R.id.diggAlertRl;
                                                                                    if (((LinearLayout) AbstractC1741.m3479(view, R.id.diggAlertRl)) != null) {
                                                                                        i8 = R.id.diggAlertView;
                                                                                        if (AbstractC1741.m3479(view, R.id.diggAlertView) != null) {
                                                                                            i8 = R.id.disableCommentEmptyInput;
                                                                                            Switch r13 = (Switch) AbstractC1741.m3479(view, R.id.disableCommentEmptyInput);
                                                                                            if (r13 != null) {
                                                                                                i8 = R.id.disableCommentScaleVideo;
                                                                                                Switch r132 = (Switch) AbstractC1741.m3479(view, R.id.disableCommentScaleVideo);
                                                                                                if (r132 != null) {
                                                                                                    i8 = R.id.disableCopyAt;
                                                                                                    Switch r133 = (Switch) AbstractC1741.m3479(view, R.id.disableCopyAt);
                                                                                                    if (r133 != null) {
                                                                                                        i8 = R.id.disableItemClick;
                                                                                                        Switch r12 = (Switch) AbstractC1741.m3479(view, R.id.disableItemClick);
                                                                                                        if (r12 != null) {
                                                                                                            i8 = R.id.hideBottomInputBar;
                                                                                                            Switch r82 = (Switch) AbstractC1741.m3479(view, R.id.hideBottomInputBar);
                                                                                                            if (r82 != null) {
                                                                                                                i8 = R.id.hideBury;
                                                                                                                Switch r134 = (Switch) AbstractC1741.m3479(view, R.id.hideBury);
                                                                                                                if (r134 != null) {
                                                                                                                    i8 = R.id.hideCommentAdComment;
                                                                                                                    Switch r152 = (Switch) AbstractC1741.m3479(view, R.id.hideCommentAdComment);
                                                                                                                    if (r152 != null) {
                                                                                                                        i8 = R.id.hideCommentHeaderAd;
                                                                                                                        Switch r153 = (Switch) AbstractC1741.m3479(view, R.id.hideCommentHeaderAd);
                                                                                                                        if (r153 != null) {
                                                                                                                            i8 = R.id.hideDigg;
                                                                                                                            Switch r154 = (Switch) AbstractC1741.m3479(view, R.id.hideDigg);
                                                                                                                            if (r154 != null) {
                                                                                                                                i8 = R.id.hideReply;
                                                                                                                                Switch r72 = (Switch) AbstractC1741.m3479(view, R.id.hideReply);
                                                                                                                                if (r72 != null) {
                                                                                                                                    TextView textView7 = (TextView) AbstractC1741.m3479(view, R.id.placeholderOriginalText);
                                                                                                                                    if (textView7 != null) {
                                                                                                                                        TextView textView8 = (TextView) AbstractC1741.m3479(view, R.id.placeholderTime);
                                                                                                                                        if (textView8 != null) {
                                                                                                                                            Switch r6 = (Switch) AbstractC1741.m3479(view, R.id.replaceAudioComment);
                                                                                                                                            if (r6 != null) {
                                                                                                                                                Switch r62 = (Switch) AbstractC1741.m3479(view, R.id.showCommentDiggRealCount);
                                                                                                                                                if (r62 != null) {
                                                                                                                                                    Switch r9 = (Switch) AbstractC1741.m3479(view, R.id.showTime);
                                                                                                                                                    if (r9 != null) {
                                                                                                                                                        final EditText editText3 = (EditText) AbstractC1741.m3479(view, R.id.showTimePattern);
                                                                                                                                                        if (editText3 != null) {
                                                                                                                                                            LinearLayout linearLayout5 = (LinearLayout) AbstractC1741.m3479(view, R.id.showTimePatternRl);
                                                                                                                                                            if (linearLayout5 != null) {
                                                                                                                                                                final EditText editText4 = (EditText) AbstractC1741.m3479(view, R.id.showTimeTemplate);
                                                                                                                                                                if (editText4 != null) {
                                                                                                                                                                    final C1633 c1633 = new C1633();
                                                                                                                                                                    c1633.f8333 = textView3;
                                                                                                                                                                    c1633.f8335 = textView5;
                                                                                                                                                                    c1633.f8331 = textView6;
                                                                                                                                                                    c1633.f8334 = r9;
                                                                                                                                                                    c1633.f8332 = linearLayout5;
                                                                                                                                                                    AbstractC2328.m4341(-1083808800211822L);
                                                                                                                                                                    C1509 c1509 = C1509.f7142;
                                                                                                                                                                    c1509.getClass();
                                                                                                                                                                    r154.setChecked(C1509.m3044());
                                                                                                                                                                    r62.setChecked(C1509.m3104());
                                                                                                                                                                    C0668 c0668 = C1509.f7297;
                                                                                                                                                                    InterfaceC1989[] interfaceC1989Arr = C1509.f7179;
                                                                                                                                                                    r72.setChecked(((Boolean) c0668.m1579(interfaceC1989Arr[120])).booleanValue());
                                                                                                                                                                    r134.setChecked(((Boolean) C1509.f7273.m1579(interfaceC1989Arr[82])).booleanValue());
                                                                                                                                                                    r9.setChecked(C1509.m3087());
                                                                                                                                                                    r12.setChecked(((Boolean) C1509.f7303.m1579(interfaceC1989Arr[122])).booleanValue());
                                                                                                                                                                    r82.setChecked(((Boolean) C1509.f7141.m1579(interfaceC1989Arr[121])).booleanValue());
                                                                                                                                                                    AbstractC2328.m4341(-1083851749884782L);
                                                                                                                                                                    editText3.setText((String) C1509.f7278.m1579(interfaceC1989Arr[91]));
                                                                                                                                                                    AbstractC2328.m4341(-1083920469361518L);
                                                                                                                                                                    editText4.setText((String) C1509.f7137.m1579(interfaceC1989Arr[92]));
                                                                                                                                                                    if (!r9.isChecked()) {
                                                                                                                                                                        linearLayout5.setVisibility(8);
                                                                                                                                                                    }
                                                                                                                                                                    textView7.setOnClickListener(new ViewOnClickListenerC0895(editText4, 1));
                                                                                                                                                                    textView8.setOnClickListener(new ViewOnClickListenerC0895(editText4, 0));
                                                                                                                                                                    AbstractC2328.m4341(-1083993483805550L);
                                                                                                                                                                    AbstractC2328.m4341(-1084100857987950L);
                                                                                                                                                                    editText2.setText(C1509.m3076());
                                                                                                                                                                    m3581(view, viewM3479, C1509.m3076());
                                                                                                                                                                    editText2.addTextChangedListener(new C0308(view, viewM3479, this));
                                                                                                                                                                    viewM3479.setOnClickListener(new ViewOnClickListenerC0257(view, editText2, viewM3479, this, 4));
                                                                                                                                                                    AbstractC2328.m4341(-1084186757333870L);
                                                                                                                                                                    AbstractC2328.m4341(-1084272656679790L);
                                                                                                                                                                    m3582(textView4);
                                                                                                                                                                    linearLayout3.setOnClickListener(new ViewOnClickListenerC1374(view, 8, textView4));
                                                                                                                                                                    AbstractC2328.m4341(-1084354261058414L);
                                                                                                                                                                    c1509.getClass();
                                                                                                                                                                    textView2.setText(AbstractC2328.m4341(C1509.m3062() ? -1085273384059758L : -1085290563928942L));
                                                                                                                                                                    linearLayout.setOnClickListener(new ViewOnClickListenerC1192(c0763, view, textView2, 5));
                                                                                                                                                                    r7.setChecked(((Boolean) C1509.f7267.m1579(interfaceC1989Arr[83])).booleanValue());
                                                                                                                                                                    r15.setChecked(((Boolean) C1509.f7152.m1579(interfaceC1989Arr[84])).booleanValue());
                                                                                                                                                                    r133.setChecked(((Boolean) C1509.f7215.m1579(interfaceC1989Arr[85])).booleanValue());
                                                                                                                                                                    r154.setOnCheckedChangeListener(new C1247(10));
                                                                                                                                                                    r62.setOnCheckedChangeListener(new C1247(11));
                                                                                                                                                                    r133.setOnCheckedChangeListener(new C1247(12));
                                                                                                                                                                    r6.setChecked(C1509.m3072());
                                                                                                                                                                    r6.setOnCheckedChangeListener(new C1247(13));
                                                                                                                                                                    r8.setChecked(C1509.m3088());
                                                                                                                                                                    r8.setOnCheckedChangeListener(new C1247(14));
                                                                                                                                                                    AbstractC2328.m4341(-1084448750338926L);
                                                                                                                                                                    seekBar.setMax(66);
                                                                                                                                                                    C0718 c0718 = C0718.f3373;
                                                                                                                                                                    c0718.getClass();
                                                                                                                                                                    int iM1658 = C0718.m1658();
                                                                                                                                                                    seekBar.setProgress(iM1658 == 0 ? 0 : iM1658 - 34);
                                                                                                                                                                    c0718.getClass();
                                                                                                                                                                    int iM16582 = C0718.m1658();
                                                                                                                                                                    if (iM16582 == 0) {
                                                                                                                                                                        string = AbstractC2328.m4341(-853443934323566L);
                                                                                                                                                                    } else {
                                                                                                                                                                        StringBuilder sb = new StringBuilder();
                                                                                                                                                                        sb.append(iM16582);
                                                                                                                                                                        sb.append('%');
                                                                                                                                                                        string = sb.toString();
                                                                                                                                                                    }
                                                                                                                                                                    textView6.setText(string);
                                                                                                                                                                    seekBar.setOnSeekBarChangeListener(new C2582(2, c1633));
                                                                                                                                                                    r132.setChecked(((Boolean) C1509.f7162.m1579(interfaceC1989Arr[137])).booleanValue());
                                                                                                                                                                    r132.setOnCheckedChangeListener(new C1247(15));
                                                                                                                                                                    r153.setChecked(((Boolean) C1509.f7200.m1579(interfaceC1989Arr[138])).booleanValue());
                                                                                                                                                                    r153.setOnCheckedChangeListener(new C1247(1));
                                                                                                                                                                    r152.setChecked(C1509.m3129());
                                                                                                                                                                    r152.setOnCheckedChangeListener(new C1247(2));
                                                                                                                                                                    List list = C0718.f3372;
                                                                                                                                                                    m3580(c1633);
                                                                                                                                                                    linearLayout4.setOnClickListener(new ViewOnClickListenerC0257(list, view2, view, c1633, 2));
                                                                                                                                                                    Pair[] pairArr = (Pair[]) C1509.f7116.toArray(new Pair[0]);
                                                                                                                                                                    m3579(c1633, pairArr);
                                                                                                                                                                    linearLayout2.setOnClickListener(new ViewOnClickListenerC0257(pairArr, view2, view, c1633, 3));
                                                                                                                                                                    r13.setChecked(((Boolean) C1509.f7281.m1579(interfaceC1989Arr[141])).booleanValue());
                                                                                                                                                                    r13.setOnCheckedChangeListener(new C1247(3));
                                                                                                                                                                    r134.setOnCheckedChangeListener(new C1247(4));
                                                                                                                                                                    r7.setOnCheckedChangeListener(new C1247(5));
                                                                                                                                                                    r15.setOnCheckedChangeListener(new C1247(6));
                                                                                                                                                                    r72.setOnCheckedChangeListener(new C1247(7));
                                                                                                                                                                    r82.setOnCheckedChangeListener(new C1247(8));
                                                                                                                                                                    r12.setOnCheckedChangeListener(new C1247(9));
                                                                                                                                                                    final int i9 = 0;
                                                                                                                                                                    r9.setOnCheckedChangeListener(new C1703(0, c1633));
                                                                                                                                                                    editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: yyds.ᲀᛵᲀᛲ
                                                                                                                                                                        static {
                                                                                                                                                                            NativeUtil.classesInit0(257);
                                                                                                                                                                        }

                                                                                                                                                                        @Override // android.widget.TextView.OnEditorActionListener
                                                                                                                                                                        public final native boolean onEditorAction(TextView textView9, int i10, KeyEvent keyEvent);
                                                                                                                                                                    });
                                                                                                                                                                    final int i10 = 1;
                                                                                                                                                                    editText4.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: yyds.ᲀᛵᲀᛲ
                                                                                                                                                                        static {
                                                                                                                                                                            NativeUtil.classesInit0(257);
                                                                                                                                                                        }

                                                                                                                                                                        @Override // android.widget.TextView.OnEditorActionListener
                                                                                                                                                                        public final native boolean onEditorAction(TextView textView9, int i102, KeyEvent keyEvent);
                                                                                                                                                                    });
                                                                                                                                                                    c0763.mo1714(AbstractC2328.m4341(-1084560419488622L), new InterfaceC1376() { // from class: yyds.ᛲᛱᛴᛴ
                                                                                                                                                                        static {
                                                                                                                                                                            NativeUtil.classesInit0(6);
                                                                                                                                                                        }

                                                                                                                                                                        @Override // yyds.InterfaceC1376
                                                                                                                                                                        /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
                                                                                                                                                                        public final native boolean mo912(AbstractC0041 abstractC00412);
                                                                                                                                                                    });
                                                                                                                                                                } else {
                                                                                                                                                                    i7 = R.id.showTimeTemplate;
                                                                                                                                                                }
                                                                                                                                                            } else {
                                                                                                                                                                i7 = R.id.showTimePatternRl;
                                                                                                                                                            }
                                                                                                                                                        } else {
                                                                                                                                                            i7 = R.id.showTimePattern;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        i7 = R.id.showTime;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    i7 = R.id.showCommentDiggRealCount;
                                                                                                                                                }
                                                                                                                                            } else {
                                                                                                                                                i7 = R.id.replaceAudioComment;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i7 = R.id.placeholderTime;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i7 = R.id.placeholderOriginalText;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i7 = i8;
                                                                                                                                }
                                                                                                                                break;
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
                                                                            } else {
                                                                                i7 = R.id.commentTextColorEditText;
                                                                            }
                                                                        } else {
                                                                            i7 = R.id.commentPauseVideo;
                                                                        }
                                                                    } else {
                                                                        i7 = R.id.commentPanelHeightValue;
                                                                    }
                                                                } else {
                                                                    i7 = R.id.commentPanelHeightSeekBar;
                                                                }
                                                            } else {
                                                                i7 = R.id.commentPanelHeightLayout;
                                                            }
                                                        } else {
                                                            i7 = R.id.commentMenuHiddenCount;
                                                        }
                                                    } else {
                                                        i7 = R.id.commentFilterLayout;
                                                    }
                                                } else {
                                                    i7 = R.id.commentFilterCount;
                                                }
                                            } else {
                                                i7 = R.id.commentDialogMenuLayout;
                                            }
                                        } else {
                                            i7 = R.id.commentDialogMenuCount;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                C0188.m789(AbstractC2328.m4341(-1739289529058158L).concat(view.getResources().getResourceName(i7)));
                break;
            case 2:
                AbstractC2328.m4341(-121895039697774L);
                AbstractC2328.m4341(-121925104468846L);
                C2701 c27012 = C2701.f13261;
                Context context2 = view.getContext();
                c27012.getClass();
                C2701.m4807(context2);
                Context context3 = (Context) obj2;
                C2701.m4807(context3);
                LinearLayout linearLayout6 = (LinearLayout) view.findViewById(R.id.emoji_container);
                ArrayList arrayList = (ArrayList) obj;
                int i11 = (int) (6.0f * context3.getResources().getDisplayMetrics().density);
                int i12 = -1;
                int iM3792 = AbstractC1960.m3792(0, arrayList.size() - 1, 4);
                if (iM3792 >= 0) {
                    int i13 = 0;
                    while (true) {
                        LinearLayout linearLayout7 = new LinearLayout(context3);
                        int i14 = -2;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i12, -2);
                        layoutParams.topMargin = i13 == 0 ? 0 : i11;
                        linearLayout7.setLayoutParams(layoutParams);
                        linearLayout7.setOrientation(0);
                        int i15 = 0;
                        while (i15 < i3) {
                            int i16 = i13 + i15;
                            if (i16 < arrayList.size()) {
                                C1274 c1274 = (C1274) arrayList.get(i16);
                                View viewInflate = AbstractC1115.m2309(context3).inflate(R.layout.decorated_emoji_item_layout, (ViewGroup) linearLayout7, false);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, i14, 1.0f);
                                layoutParams2.leftMargin = i15 == 0 ? 0 : i11;
                                viewInflate.setLayoutParams(layoutParams2);
                                try {
                                    ((C0472) ComponentCallbacks2C0040.m250(context3).m2500(context3).m4277(c1274.f5862).m1786(C2340.f11504)).m1283((ImageView) viewInflate.findViewById(R.id.emoji_image));
                                } catch (Exception e) {
                                    C2336.f11496.m4354(AbstractC2328.m4341(-146247504266094L) + e.getMessage());
                                }
                                ((TextView) viewInflate.findViewById(R.id.save_icon)).setOnClickListener(new ViewOnClickListenerC1374(context3, i2, c1274));
                                linearLayout7.addView(viewInflate);
                            } else {
                                View view3 = new View(context3);
                                view3.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
                                linearLayout7.addView(view3);
                            }
                            i15++;
                            i3 = 4;
                            i14 = -2;
                            break;
                        }
                        linearLayout6.addView(linearLayout7);
                        if (i13 != iM3792) {
                            i13 += 4;
                            i12 = -1;
                            i3 = 4;
                        }
                    }
                }
                break;
            case 3:
                final C0763 c07632 = (C0763) abstractC0041;
                AbstractC2328.m4341(-175453281878894L);
                AbstractC2328.m4341(-175483346649966L);
                final Context context4 = (Context) obj2;
                C2531 c2531 = (C2531) obj;
                C0172 c0172 = new C0172();
                c0172.f997 = new ArrayList(AbstractC1838.m3608());
                C0172 c01722 = new C0172();
                C0172 c01723 = new C0172();
                C0172 c01724 = new C0172();
                c01724.f997 = AbstractC2328.m4341(-184661691761518L);
                C0172 c01725 = new C0172();
                c01725.f997 = new C2417(new C0059(context4, c0172, c01724, c01722, c01723, c01725, c2531));
                CustomRecyclerView customRecyclerView = (CustomRecyclerView) c2531.f12464;
                LinearLayout linearLayout8 = (LinearLayout) c2531.f12465;
                customRecyclerView.setLayoutManager(new LinearLayoutManager(1));
                Object obj3 = c01725.f997;
                if (obj3 == null) {
                    AbstractC2328.m4341(-184665986728814L);
                    c2417 = null;
                } else {
                    c2417 = (C2417) obj3;
                }
                customRecyclerView.setAdapter(c2417);
                Object obj4 = c01725.f997;
                if (obj4 == null) {
                    AbstractC2328.m4341(-184700346467182L);
                    c24172 = null;
                } else {
                    c24172 = (C2417) obj4;
                }
                c24172.f1986.m1156((List) c0172.f997, null);
                if (((List) c0172.f997).isEmpty()) {
                    customRecyclerView.setVisibility(8);
                    linearLayout8.setVisibility(0);
                } else {
                    customRecyclerView.setVisibility(0);
                    linearLayout8.setVisibility(8);
                }
                ((EditText) c2531.f12462).addTextChangedListener(new C2400(c01724, c0172, c01722, c01723, c01725, c2531, 0));
                c2531.f12468.setOnClickListener(new ViewOnClickListenerC1140(context4, c01722, c2531, c0172, c01724, c01723, c01725, 0));
                c2531.f12466.setOnClickListener(new ViewOnClickListenerC1140(context4, c01723, c2531, c0172, c01724, c01722, c01725, 1));
                ((Button) c2531.f12463).setOnClickListener(new ViewOnClickListenerC1140(context4, c0172, c01724, c01722, c01723, c01725, c2531));
                ((Button) c2531.f12461).setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛳᛳᛳᛵ
                    static {
                        NativeUtil.classesInit0(66);
                    }

                    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
                    private final native void m1382(View view4);

                    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
                    private final native void m1383(View view4);

                    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
                    private final native void m1384(View view4);

                    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
                    private final native void m1385(View view4);

                    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
                    private final native void m1386(View view4);

                    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
                    private final native void m1387(View view4);

                    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
                    private final native void m1388(View view4);

                    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                    private final native void m1389(View view4);

                    @Override // android.view.View.OnClickListener
                    public final native void onClick(View view4);
                });
                ((Button) c2531.f12460).setOnClickListener(new View.OnClickListener(c07632, i6) { // from class: yyds.ᲈᲀᛷᲀ

                    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
                    public final /* synthetic */ int f13456;

                    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                    public final /* synthetic */ C0763 f13457;

                    @Override // android.view.View.OnClickListener
                    public final native void onClick(View view4);
                });
                break;
            case 4:
                AbstractC2328.m4341(-164896252265326L);
                AbstractC2328.m4341(-164926317036398L);
                C1509.f7142.getClass();
                Set set = (Set) C1509.f7206.m1579(C1509.f7179[203]);
                for (Pair pair : (List) obj2) {
                    String str = (String) pair.component1();
                    Object objComponent2 = pair.component2();
                    AbstractC2328.m4341(-164947791872878L);
                    ((Switch) objComponent2).setChecked(set.contains(str));
                }
                RadioGroup radioGroup = (RadioGroup) ((C0052) obj).f551;
                C1509.f7142.getClass();
                radioGroup.check(((Number) C1509.f7158.m1579(C1509.f7179[204])).intValue() == 0 ? R.id.videoInfoMessageDialogRadio : R.id.videoInfoBottomDialogRadio);
                break;
            case 5:
                AbstractC2328.m4341(-123170644984686L);
                AbstractC2328.m4341(-123200709755758L);
                final Context context5 = (Context) obj2;
                final C1127 c1127 = (C1127) obj;
                C0695 c0695 = C0695.f3286;
                c0695.getClass();
                boolean zM1612 = C0695.m1612(context5);
                TextView textView9 = c1127.f5195;
                if (zM1612) {
                    textView9.setText(AbstractC2328.m4341(-171879869088622L));
                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context5, c1127, interfaceC0274, i6), 3);
                } else {
                    textView9.setText(AbstractC2328.m4341(-171725250265966L));
                }
                c0695.getClass();
                boolean zM16122 = C0695.m1612(context5);
                TextView textView10 = c1127.f5190;
                if (zM16122) {
                    textView10.setText(AbstractC2328.m4341(-171673710658414L));
                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context5, c1127, interfaceC0274, i5), 3);
                } else {
                    textView10.setText(AbstractC2328.m4341(-171613581116270L));
                }
                Switch r1 = (Switch) c1127.f5193;
                c0695.getClass();
                r1.setChecked(C0695.m1608(context5));
                r1.setOnCheckedChangeListener(new C1703(5, context5));
                ((Button) c1127.f5194).setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛳᛷᛲᲁ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i17 = i6;
                        int i18 = 2;
                        int i19 = 3;
                        InterfaceC0274 interfaceC02742 = null;
                        C1127 c11272 = c1127;
                        Context context6 = context5;
                        switch (i17) {
                            case 0:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123346738643822L));
                                } else {
                                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context6, c11272, interfaceC02742, i18), 3);
                                }
                                break;
                            case 1:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123574371910510L));
                                } else {
                                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context6, c11272, interfaceC02742, i19), 3);
                                }
                                break;
                            default:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123621616550766L));
                                } else {
                                    new AlertDialog.Builder(context6).setTitle(AbstractC2328.m4341(-123668861191022L)).setMessage(AbstractC2328.m4341(-123698925962094L)).setPositiveButton(AbstractC2328.m4341(-123814890079086L), new DialogInterfaceOnClickListenerC2477(context6, c11272, 1)).setNegativeButton(AbstractC2328.m4341(-123832069948270L), new DialogInterfaceOnClickListenerC2477(context6, c11272, i18)).setNeutralButton(AbstractC2328.m4341(-123853544784750L), (DialogInterface.OnClickListener) null).show();
                                }
                                break;
                        }
                    }
                });
                ((Button) c1127.f5189).setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛳᲀᛳᛷ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i17 = i6;
                        Context context6 = context5;
                        switch (i17) {
                            case 0:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123393983284078L));
                                } else {
                                    new AlertDialog.Builder(context6).setTitle(AbstractC2328.m4341(-123441227924334L)).setMessage(AbstractC2328.m4341(-123462702760814L)).setPositiveButton(AbstractC2328.m4341(-123548602106734L), new DialogInterface.OnClickListener(3, context6) { // from class: yyds.ᛳᛶᛶᛲ

                                        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
                                        public final /* synthetic */ int f2977;

                                        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                                        public final /* synthetic */ Object f2978;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final native void onClick(DialogInterface dialogInterface, int i18);
                                    }).setNegativeButton(AbstractC2328.m4341(-123561487008622L), (DialogInterface.OnClickListener) null).show();
                                }
                                break;
                            default:
                                AbstractC2328.m4341(-116277222474606L);
                                View viewInflate2 = AbstractC1115.m2309(context6).inflate(R.layout.dialog_webdav_config, (ViewGroup) new RelativeLayout(context6), false);
                                int i18 = R.id.passwordEditText;
                                EditText editText5 = (EditText) AbstractC1741.m3479(viewInflate2, R.id.passwordEditText);
                                if (editText5 != null) {
                                    i18 = R.id.passwordVisibilityToggle;
                                    ImageButton imageButton = (ImageButton) AbstractC1741.m3479(viewInflate2, R.id.passwordVisibilityToggle);
                                    if (imageButton != null) {
                                        i18 = R.id.saveConfigBtn;
                                        Button button = (Button) AbstractC1741.m3479(viewInflate2, R.id.saveConfigBtn);
                                        if (button != null) {
                                            i18 = R.id.serverUrlEditText;
                                            EditText editText6 = (EditText) AbstractC1741.m3479(viewInflate2, R.id.serverUrlEditText);
                                            if (editText6 != null) {
                                                i18 = R.id.testConnectionBtn;
                                                Button button2 = (Button) AbstractC1741.m3479(viewInflate2, R.id.testConnectionBtn);
                                                if (button2 != null) {
                                                    i18 = R.id.usernameEditText;
                                                    EditText editText7 = (EditText) AbstractC1741.m3479(viewInflate2, R.id.usernameEditText);
                                                    if (editText7 != null) {
                                                        ScrollView scrollView = (ScrollView) viewInflate2;
                                                        C1521 c1521 = new C1521(scrollView, editText5, imageButton, button, editText6, button2, editText7);
                                                        AbstractC2328.m4341(-116311582212974L);
                                                        C0763 c0763M1709 = C0763.m1709(context6);
                                                        c0763M1709.f3518 = AbstractC2328.m4341(-116367416787822L);
                                                        c0763M1709.mo1719();
                                                        c0763M1709.f3522 = new C1807(c1521, context6, scrollView, 6);
                                                        c0763M1709.mo1719();
                                                        c0763M1709.m1715(context6);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C0188.m789(AbstractC2328.m4341(-1741939523879790L).concat(viewInflate2.getResources().getResourceName(i18)));
                                break;
                        }
                    }
                });
                ((Button) c1127.f5188).setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛳᲀᛳᛷ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i17 = i5;
                        Object context6 = context5;
                        switch (i17) {
                            case 0:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123393983284078L));
                                } else {
                                    new AlertDialog.Builder(context6).setTitle(AbstractC2328.m4341(-123441227924334L)).setMessage(AbstractC2328.m4341(-123462702760814L)).setPositiveButton(AbstractC2328.m4341(-123548602106734L), new DialogInterface.OnClickListener(3, context6) { // from class: yyds.ᛳᛶᛶᛲ

                                        /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
                                        public final /* synthetic */ int f2977;

                                        /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
                                        public final /* synthetic */ Object f2978;

                                        @Override // android.content.DialogInterface.OnClickListener
                                        public final native void onClick(DialogInterface dialogInterface, int i18);
                                    }).setNegativeButton(AbstractC2328.m4341(-123561487008622L), (DialogInterface.OnClickListener) null).show();
                                }
                                break;
                            default:
                                AbstractC2328.m4341(-116277222474606L);
                                View viewInflate2 = AbstractC1115.m2309(context6).inflate(R.layout.dialog_webdav_config, (ViewGroup) new RelativeLayout(context6), false);
                                int i18 = R.id.passwordEditText;
                                EditText editText5 = (EditText) AbstractC1741.m3479(viewInflate2, R.id.passwordEditText);
                                if (editText5 != null) {
                                    i18 = R.id.passwordVisibilityToggle;
                                    ImageButton imageButton = (ImageButton) AbstractC1741.m3479(viewInflate2, R.id.passwordVisibilityToggle);
                                    if (imageButton != null) {
                                        i18 = R.id.saveConfigBtn;
                                        Button button = (Button) AbstractC1741.m3479(viewInflate2, R.id.saveConfigBtn);
                                        if (button != null) {
                                            i18 = R.id.serverUrlEditText;
                                            EditText editText6 = (EditText) AbstractC1741.m3479(viewInflate2, R.id.serverUrlEditText);
                                            if (editText6 != null) {
                                                i18 = R.id.testConnectionBtn;
                                                Button button2 = (Button) AbstractC1741.m3479(viewInflate2, R.id.testConnectionBtn);
                                                if (button2 != null) {
                                                    i18 = R.id.usernameEditText;
                                                    EditText editText7 = (EditText) AbstractC1741.m3479(viewInflate2, R.id.usernameEditText);
                                                    if (editText7 != null) {
                                                        ScrollView scrollView = (ScrollView) viewInflate2;
                                                        C1521 c1521 = new C1521(scrollView, editText5, imageButton, button, editText6, button2, editText7);
                                                        AbstractC2328.m4341(-116311582212974L);
                                                        C0763 c0763M1709 = C0763.m1709(context6);
                                                        c0763M1709.f3518 = AbstractC2328.m4341(-116367416787822L);
                                                        c0763M1709.mo1719();
                                                        c0763M1709.f3522 = new C1807(c1521, context6, scrollView, 6);
                                                        c0763M1709.mo1719();
                                                        c0763M1709.m1715(context6);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C0188.m789(AbstractC2328.m4341(-1741939523879790L).concat(viewInflate2.getResources().getResourceName(i18)));
                                break;
                        }
                    }
                });
                ((Button) c1127.f5191).setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛳᛷᛲᲁ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i17 = i5;
                        int i18 = 2;
                        int i19 = 3;
                        InterfaceC0274 interfaceC02742 = null;
                        C1127 c11272 = c1127;
                        Context context6 = context5;
                        switch (i17) {
                            case 0:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123346738643822L));
                                } else {
                                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context6, c11272, interfaceC02742, i18), 3);
                                }
                                break;
                            case 1:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123574371910510L));
                                } else {
                                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context6, c11272, interfaceC02742, i19), 3);
                                }
                                break;
                            default:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123621616550766L));
                                } else {
                                    new AlertDialog.Builder(context6).setTitle(AbstractC2328.m4341(-123668861191022L)).setMessage(AbstractC2328.m4341(-123698925962094L)).setPositiveButton(AbstractC2328.m4341(-123814890079086L), new DialogInterfaceOnClickListenerC2477(context6, c11272, 1)).setNegativeButton(AbstractC2328.m4341(-123832069948270L), new DialogInterfaceOnClickListenerC2477(context6, c11272, i18)).setNeutralButton(AbstractC2328.m4341(-123853544784750L), (DialogInterface.OnClickListener) null).show();
                                }
                                break;
                        }
                    }
                });
                ((Button) c1127.f5192).setOnClickListener(new View.OnClickListener() { // from class: yyds.ᛳᛷᛲᲁ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i17 = i4;
                        int i18 = 2;
                        int i19 = 3;
                        InterfaceC0274 interfaceC02742 = null;
                        C1127 c11272 = c1127;
                        Context context6 = context5;
                        switch (i17) {
                            case 0:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123346738643822L));
                                } else {
                                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context6, c11272, interfaceC02742, i18), 3);
                                }
                                break;
                            case 1:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123574371910510L));
                                } else {
                                    AbstractC2071.m3959(AbstractC2797.m4924(), null, new C0382(context6, c11272, interfaceC02742, i19), 3);
                                }
                                break;
                            default:
                                C0695.f3286.getClass();
                                if (!C0695.m1612(context6)) {
                                    AbstractC1960.m3789(AbstractC2328.m4341(-123621616550766L));
                                } else {
                                    new AlertDialog.Builder(context6).setTitle(AbstractC2328.m4341(-123668861191022L)).setMessage(AbstractC2328.m4341(-123698925962094L)).setPositiveButton(AbstractC2328.m4341(-123814890079086L), new DialogInterfaceOnClickListenerC2477(context6, c11272, 1)).setNegativeButton(AbstractC2328.m4341(-123832069948270L), new DialogInterfaceOnClickListenerC2477(context6, c11272, i18)).setNeutralButton(AbstractC2328.m4341(-123853544784750L), (DialogInterface.OnClickListener) null).show();
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AbstractC2328.m4341(-190889394340718L);
                AbstractC2328.m4341(-190919459111790L);
                C1521 c1521 = (C1521) obj2;
                EditText editText5 = (EditText) c1521.f7343;
                Context context6 = (Context) obj;
                C0695.f3286.getClass();
                editText5.setText(C0695.m1611(context6));
                ((EditText) c1521.f7339).setText(C0695.m1613(context6));
                ((EditText) c1521.f7342).setText(C0695.m1609(context6));
                C1417 c1417 = new C1417();
                m3583(c1521, c1417);
                ((ImageButton) c1521.f7344).setOnClickListener(new ViewOnClickListenerC1374(c1417, 23, c1521));
                ((Button) c1521.f7341).setOnClickListener(new ViewOnClickListenerC1462(17, c1521));
                ((Button) c1521.f7340).setOnClickListener(new ViewOnClickListenerC1192(c1521, context6, (C0763) abstractC0041, 29));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1807(Object obj, Object obj2, ViewGroup viewGroup, int i) {
        super(viewGroup);
        this.f9082 = i;
        this.f9080 = obj;
        this.f9081 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1807(C0763 c0763, View view) {
        super(R.layout.comment_setting_layout);
        this.f9082 = 1;
        this.f9080 = c0763;
        this.f9081 = view;
    }
}
