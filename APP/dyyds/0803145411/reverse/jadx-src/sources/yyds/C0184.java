package yyds;

import android.app.AlertDialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: yyds.ᛱᛸᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0184 {

    /* JADX INFO: renamed from: ᛱᛳᛶᛳ, reason: contains not printable characters */
    public C2355 f1047;

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public final LinearLayout f1048;

    /* JADX INFO: renamed from: ᛱᛸᲁᲇ, reason: contains not printable characters */
    public File f1049;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final EditText f1050;

    /* JADX INFO: renamed from: ᛲᛱᲁᛳ, reason: contains not printable characters */
    public List f1051;

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final LinearLayout f1052;

    /* JADX INFO: renamed from: ᛲᛳᛴᛸ, reason: contains not printable characters */
    public int f1053 = -1;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final ImageView f1054;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final TextView f1055;

    /* JADX INFO: renamed from: ᛲᛶᛱᲈ, reason: contains not printable characters */
    public final TextView f1056;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Context f1057;

    /* JADX INFO: renamed from: ᛳᛸᛴᛶ, reason: contains not printable characters */
    public final LinearLayout f1058;

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final Spinner f1059;

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public final LinearLayout f1060;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final AlertDialog f1061;

    /* JADX INFO: renamed from: ᛵᲀᛵᛸ, reason: contains not printable characters */
    public MediaPlayer f1062;

    /* JADX INFO: renamed from: ᛵᲀᲈᛴ, reason: contains not printable characters */
    public final TextView f1063;

    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public final TextView f1064;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final LinearLayout f1065;

    /* JADX INFO: renamed from: ᛶᛸᲀᲁ, reason: contains not printable characters */
    public final SeekBar f1066;

    /* JADX INFO: renamed from: ᛶᲀᲈᲇ, reason: contains not printable characters */
    public boolean f1067;

    /* JADX INFO: renamed from: ᛶᲈᛴᲈ, reason: contains not printable characters */
    public final ImageView f1068;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final TextView f1069;

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public final TextView f1070;

    /* JADX INFO: renamed from: ᛷᛶᛷᲀ, reason: contains not printable characters */
    public String f1071;

    /* JADX INFO: renamed from: ᛷᛸᲇᛶ, reason: contains not printable characters */
    public InterfaceC0477 f1072;

    /* JADX INFO: renamed from: ᛷᲇᛲᛱ, reason: contains not printable characters */
    public boolean f1073;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final ImageView f1074;

    /* JADX INFO: renamed from: ᛸᛴᛵᛶ, reason: contains not printable characters */
    public boolean f1075;

    /* JADX INFO: renamed from: ᛸᛸᛷᛱ, reason: contains not printable characters */
    public final C2454 f1076;

    /* JADX INFO: renamed from: ᲀᛲᛱᛱ, reason: contains not printable characters */
    public C0289 f1077;

    /* JADX INFO: renamed from: ᲀᛲᛲᲇ, reason: contains not printable characters */
    public final LinearLayout f1078;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1213 f1079;

    /* JADX INFO: renamed from: ᲀᛴᲁᲈ, reason: contains not printable characters */
    public List f1080;

    /* JADX INFO: renamed from: ᲁᛶᛴᛸ, reason: contains not printable characters */
    public C0289 f1081;

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final EditText f1082;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final TextView f1083;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final LinearLayout f1084;

    /* JADX INFO: renamed from: ᲈᛷᲈᛶ, reason: contains not printable characters */
    public EnumC2639 f1085;

    /* JADX INFO: renamed from: ᲈᲀᛲᲀ, reason: contains not printable characters */
    public final TextView f1086;

    public C0184(Context context, AlertDialog alertDialog, C1213 c1213, LinearLayout linearLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, EditText editText, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView3, TextView textView4, LinearLayout linearLayout3, LinearLayout linearLayout4, ImageView imageView4, ImageView imageView5, Spinner spinner, EditText editText2, TextView textView5, LinearLayout linearLayout5, TextView textView6, LinearLayout linearLayout6, LinearLayout linearLayout7, ImageView imageView6, SeekBar seekBar, TextView textView7, TextView textView8, TextView textView9, TextView textView10) {
        this.f1057 = context;
        this.f1061 = alertDialog;
        this.f1079 = c1213;
        this.f1084 = linearLayout;
        this.f1055 = textView;
        this.f1083 = textView2;
        this.f1065 = linearLayout2;
        this.f1050 = editText;
        this.f1054 = imageView;
        this.f1074 = imageView2;
        this.f1069 = textView3;
        this.f1070 = textView4;
        this.f1052 = linearLayout3;
        this.f1048 = linearLayout4;
        this.f1059 = spinner;
        this.f1082 = editText2;
        this.f1064 = textView5;
        this.f1060 = linearLayout5;
        this.f1078 = linearLayout6;
        this.f1058 = linearLayout7;
        this.f1068 = imageView6;
        this.f1066 = seekBar;
        this.f1063 = textView7;
        this.f1056 = textView8;
        this.f1086 = textView10;
        C1206 c1206 = AbstractC0221.f1238;
        C1158 c1158 = AbstractC1353.f6250;
        C1455 c1455M3297 = AbstractC0024.m3297();
        c1158.getClass();
        C2454 c2454M3696 = AbstractC1917.m3696(AbstractC0879.m1960(c1158, c1455M3297));
        this.f1076 = c2454M3696;
        C1860 c1860 = C1860.f9345;
        this.f1080 = c1860;
        this.f1073 = true;
        this.f1085 = EnumC2639.f13016;
        this.f1051 = c1860;
        int i = 0;
        textView3.setOnClickListener(new ViewOnClickListenerC2433(this, i));
        textView4.setOnClickListener(new ViewOnClickListenerC2433(this, 1));
        if (editText != null) {
            editText.addTextChangedListener(new C0507(this, 0));
        }
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickListenerC2433(this, 9));
        }
        if (imageView2 != null) {
            imageView2.setImageResource(this.f1073 ? R.drawable.ic_sort_descending : R.drawable.ic_sort_ascending);
        }
        if (imageView3 != null) {
            imageView3.setOnClickListener(new ViewOnClickListenerC2433(this, 2));
        }
        int i2 = 3;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new ViewOnClickListenerC2433(this, i2));
        }
        imageView4.setOnClickListener(new ViewOnClickListenerC2433(this, 4));
        imageView4.setOnLongClickListener(new ViewOnLongClickListenerC0358(i, this));
        imageView5.setOnClickListener(new ViewOnClickListenerC2433(this, 5));
        editText2.addTextChangedListener(new C0507(this, 1));
        textView6.setOnClickListener(new ViewOnClickListenerC2433(this, 6));
        imageView6.setOnClickListener(new ViewOnClickListenerC2433(this, 7));
        seekBar.setOnSeekBarChangeListener(new C2582(i, this));
        textView9.setOnClickListener(new ViewOnClickListenerC2433(this, 8));
        AbstractC2071.m3959(c2454M3696, null, new C2318(this, null, i), 3);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static ArrayList m761(String str) {
        List listM1296 = AbstractC0473.m1296(AbstractC0473.m1314(str).toString(), new String[]{AbstractC2328.m4341(-126280201306990L)}, 6);
        ArrayList arrayList = new ArrayList();
        Iterator it = listM1296.iterator();
        while (it.hasNext()) {
            Matcher matcher = Pattern.compile(AbstractC2328.m4341(-126288791241582L)).matcher(AbstractC0473.m1314((String) it.next()).toString());
            C0644 c0644 = !matcher.find(0) ? null : new C0644(matcher);
            C2302 c2302 = c0644 != null ? new C2302((String) ((C1057) c0644.m1559()).get(1), (String) ((C1057) c0644.m1559()).get(2)) : null;
            if (c2302 != null) {
                arrayList.add(c2302);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static String m762(int i) {
        int i2 = i / 1000;
        int i3 = i2 / 60;
        return AbstractC2104.m4000(new Object[]{Integer.valueOf(i3), Integer.valueOf(i2 % 60)}, 2, AbstractC2328.m4341(-127594461299566L), -127637410972526L);
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final void m763() {
        m764();
        this.f1067 = false;
        MediaPlayer mediaPlayer = this.f1062;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
        }
        this.f1062 = null;
        this.f1053 = -1;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final void m764() {
        C0289 c0289 = this.f1081;
        if (c0289 != null) {
            c0289.mo2093(null);
        }
        this.f1081 = null;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void m765(File file) {
        try {
            m763();
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.prepare();
            this.f1056.setText(m762(mediaPlayer.getDuration()));
            this.f1063.setText(AbstractC2328.m4341(-127478497182574L));
            this.f1066.setProgress(0);
            mediaPlayer.setOnCompletionListener(new C2575(0, this));
            this.f1062 = mediaPlayer;
            this.f1068.setImageResource(R.drawable.play);
            this.f1067 = false;
        } catch (Exception e) {
            C2336.f11496.m4358(AbstractC2328.m4341(-127504266986350L), e);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m766() {
        AbstractC0027.m3912().remove(AbstractC2328.m4341(-125519992095598L));
        AbstractC0027.m3912().remove(AbstractC2328.m4341(-125618776343406L));
        AbstractC1960.m3789(AbstractC2328.m4341(-125717560591214L));
        AbstractC2071.m3959(this.f1076, null, new C2318(this, null, 0), 3);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m767() {
        m763();
        C0289 c0289 = this.f1077;
        if (c0289 != null) {
            c0289.mo2093(null);
        }
        AlertDialog alertDialog = this.f1061;
        if (alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m768(String str) {
        AbstractC2328.m4341(-127998188225390L);
        this.f1071 = str;
        TextView textView = this.f1055;
        textView.setText(str);
        textView.setOnClickListener(new ViewOnClickListenerC2433(this, 11));
        int i = 0;
        textView.setOnLongClickListener(new ViewOnLongClickListenerC1733(str, i, this));
        LinearLayout linearLayout = this.f1065;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        this.f1079.setVisibility(8);
        this.f1084.setVisibility(8);
        this.f1083.setText(AbstractC2328.m4341(-128041137898350L));
        C0289 c0289 = this.f1077;
        InterfaceC0274 interfaceC0274 = null;
        if (c0289 != null) {
            c0289.mo2093(null);
        }
        this.f1077 = AbstractC2071.m3959(this.f1076, null, new C0219(this, str, interfaceC0274, i), 3);
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m769(EnumC2639 enumC2639) {
        this.f1085 = enumC2639;
        int iOrdinal = enumC2639.ordinal();
        LinearLayout linearLayout = this.f1048;
        LinearLayout linearLayout2 = this.f1052;
        TextView textView = this.f1070;
        Context context = this.f1057;
        TextView textView2 = this.f1069;
        if (iOrdinal == 0) {
            linearLayout2.setVisibility(0);
            linearLayout.setVisibility(8);
            textView2.setBackgroundResource(R.drawable.bg_douyin_button_primary);
            textView2.setTextColor(context.getResources().getColor(android.R.color.white, null));
            textView.setBackgroundResource(R.drawable.bg_douyin_button_secondary);
            textView.setTextColor(context.getResources().getColor(R.color.dialog_button_secondary_text, null));
            return;
        }
        if (iOrdinal != 1) {
            C0188.m801();
            return;
        }
        linearLayout2.setVisibility(8);
        linearLayout.setVisibility(0);
        textView2.setBackgroundResource(R.drawable.bg_douyin_button_secondary);
        textView2.setTextColor(context.getResources().getColor(R.color.dialog_button_secondary_text, null));
        textView.setBackgroundResource(R.drawable.bg_douyin_button_primary);
        textView.setTextColor(context.getResources().getColor(android.R.color.white, null));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m770(String str) {
        int i;
        int i2;
        if (this.f1080.isEmpty()) {
            return;
        }
        int length = str.length();
        List<C2522> list = this.f1080;
        int i3 = 0;
        if (length != 0) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                String name = ((C2522) obj).f12445.getName();
                AbstractC2328.m4341(-127693245547374L);
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                AbstractC2328.m4341(-127749080122222L);
                String lowerCase2 = str.toLowerCase(locale);
                AbstractC2328.m4341(-127822094566254L);
                if (AbstractC0473.m1301(lowerCase, lowerCase2, false)) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        String strM4341 = this.f1071;
        if (strM4341 == null) {
            strM4341 = AbstractC2328.m4341(-127895109010286L);
        }
        File file = new File(strM4341);
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (!((C2522) it.next()).f12446 && (i = i + 1) < 0) {
                    AbstractC2725.m4851();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        if (list == null || !list.isEmpty()) {
            i2 = 0;
            for (C2522 c2522 : list) {
                if (c2522.f12446) {
                    String absolutePath = c2522.f12445.getAbsolutePath();
                    File parentFile = file.getParentFile();
                    if (!AbstractC1544.m3188(absolutePath, parentFile != null ? parentFile.getAbsolutePath() : null) && (i2 = i2 + 1) < 0) {
                        AbstractC2725.m4851();
                        throw null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        boolean zIsEmpty = list.isEmpty();
        TextView textView = this.f1083;
        LinearLayout linearLayout = this.f1084;
        C1213 c1213 = this.f1079;
        if (zIsEmpty) {
            c1213.setVisibility(8);
            linearLayout.setVisibility(0);
            textView.setText(AbstractC2328.m4341(-127899403977582L));
        } else {
            c1213.setVisibility(0);
            linearLayout.setVisibility(8);
            StringBuilder sb = new StringBuilder();
            if (i2 > 0) {
                sb.append(i2 + AbstractC2328.m4341(-127920878814062L));
            }
            if (i > 0) {
                if (i2 > 0) {
                    sb.append(AbstractC2328.m4341(-127942353650542L));
                }
                sb.append(i + AbstractC2328.m4341(-127959533519726L));
            }
            if (i2 == 0 && i == 0) {
                sb.append(AbstractC2328.m4341(-127976713388910L));
            }
            textView.setText(sb.toString());
        }
        C2355 c2355 = this.f1047;
        if (c2355 != null) {
            AbstractC2328.m4341(-195519369085806L);
            File file2 = c2355.f11567;
            ArrayList<C2522> arrayList2 = c2355.f11570;
            arrayList2.clear();
            arrayList2.addAll(list);
            if (file2 != null) {
                for (C2522 c25222 : arrayList2) {
                    if (!c25222.f12446 && AbstractC1544.m3188(c25222.f12445.getAbsolutePath(), file2.getAbsolutePath())) {
                        break;
                    } else {
                        i3++;
                    }
                }
                i3 = -1;
            } else {
                i3 = -1;
            }
            c2355.f11571 = i3;
            c2355.f11574 = -1;
            c2355.m1058();
        }
    }
}
