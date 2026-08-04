package yyds;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.ComponentCallbacks2C0040;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: yyds.ᛷᛶᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1586 implements InterfaceC2289, InterfaceC1352, InterfaceC2111, InterfaceC1081, InterfaceC2614, InterfaceC1434, InterfaceC0790, InterfaceC0503, InterfaceC1414 {

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static C1586 f8037;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static volatile C1621 f8042;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C1586 f8040 = new C1586();

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final C1586 f8038 = new C1586();

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final /* synthetic */ C1586 f8041 = new C1586();

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final C1586 f8039 = new C1586();

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final C1586 f8036 = new C1586();

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static void m3251(Context context, String str, String str2, String str3, String str4, InterfaceC1549 interfaceC1549) {
        String str5;
        AbstractC2328.m4341(-129810664424302L);
        AbstractC2328.m4341(-129845024162670L);
        AbstractC2328.m4341(-129875088933742L);
        AbstractC2328.m4341(-129913743639406L);
        AbstractC2328.m4341(-129930923508590L);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_add_keep_fire, (ViewGroup) new RelativeLayout(context), false);
        int i = R.id.btn_cancel;
        Button button = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_cancel);
        if (button != null) {
            i = R.id.btn_confirm;
            Button button2 = (Button) AbstractC1741.m3479(viewInflate, R.id.btn_confirm);
            if (button2 != null) {
                i = R.id.group_selector_layout;
                LinearLayout linearLayout = (LinearLayout) AbstractC1741.m3479(viewInflate, R.id.group_selector_layout);
                if (linearLayout != null) {
                    i = R.id.iv_avatar;
                    ImageView imageView = (ImageView) AbstractC1741.m3479(viewInflate, R.id.iv_avatar);
                    if (imageView != null) {
                        i = R.id.tv_continuous_days;
                        TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_continuous_days);
                        if (textView != null) {
                            i = R.id.tv_last_fire_time;
                            TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_last_fire_time);
                            if (textView2 != null) {
                                i = R.id.tv_nickname;
                                TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_nickname);
                                if (textView3 != null) {
                                    i = R.id.tv_selected_group;
                                    TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_selected_group);
                                    if (textView4 != null) {
                                        i = R.id.tv_type;
                                        TextView textView5 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_type);
                                        if (textView5 != null) {
                                            i = R.id.tv_uid;
                                            TextView textView6 = (TextView) AbstractC1741.m3479(viewInflate, R.id.tv_uid);
                                            if (textView6 != null) {
                                                C1633 c1633 = new C1633();
                                                c1633.f8335 = button;
                                                c1633.f8331 = button2;
                                                c1633.f8332 = linearLayout;
                                                c1633.f8334 = imageView;
                                                c1633.f8333 = textView4;
                                                AbstractC2328.m4341(-129952398345070L);
                                                AlertDialog alertDialogCreate = new AlertDialog.Builder(context, R.style.DouyinDialogStyle).setView((LinearLayout) viewInflate).create();
                                                alertDialogCreate.setCancelable(true);
                                                Window window = alertDialogCreate.getWindow();
                                                if (window != null) {
                                                    window.setBackgroundDrawableResource(android.R.color.transparent);
                                                }
                                                textView3.setText(str2);
                                                textView6.setText(AbstractC2328.m4341(-130008232919918L).concat(str3));
                                                textView5.setText(str4);
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(0);
                                                sb.append((char) 22825);
                                                textView.setText(sb.toString());
                                                textView2.setText(AbstractC2328.m4341(-130034002723694L));
                                                try {
                                                    str5 = str;
                                                    try {
                                                        ((C0472) ((C0472) ((C0472) ((C0472) ComponentCallbacks2C0040.m250(context).m2500(context).m4277(str5).m1790()).m1793()).m1786(C2340.f11504)).m1798()).m1283(imageView);
                                                    } catch (Exception unused) {
                                                        ((ImageView) c1633.f8334).setImageResource(R.drawable.kuku);
                                                    }
                                                } catch (Exception unused2) {
                                                    str5 = str;
                                                }
                                                List listM3610 = AbstractC1838.m3610();
                                                C0172 c0172 = new C0172();
                                                C2721 c2721 = (C2721) AbstractC1595.m3281(listM3610);
                                                if (c2721 == null) {
                                                    c2721 = C2721.f13356;
                                                }
                                                c0172.f997 = c2721;
                                                ((TextView) c1633.f8333).setText(c2721.m4838());
                                                ((LinearLayout) c1633.f8332).setOnClickListener(new ViewOnClickListenerC0257(listM3610, context, c0172, c1633, 0));
                                                ((Button) c1633.f8335).setOnClickListener(new ViewOnClickListenerC0852(alertDialogCreate, 0));
                                                ((Button) c1633.f8331).setOnClickListener(new ViewOnClickListenerC1977(str5, str2, str3, str4, c0172, alertDialogCreate, interfaceC1549, 0));
                                                alertDialogCreate.show();
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
        C0188.m789(AbstractC2328.m4341(-1744589518701422L).concat(viewInflate.getResources().getResourceName(i)));
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static List m3252(String str) throws JSONException {
        AbstractC2328.m4341(-383527267500910L);
        LinkedHashMap linkedHashMap = AbstractC1718.f8702;
        C2701.f13261.getClass();
        String str2 = (String) linkedHashMap.get(C2701.m4798(str));
        if (str2 != null) {
            AbstractC2328.m4341(-388844437013358L);
            String string = AbstractC0473.m1314(str2).toString();
            if (string.length() != 0) {
                if (!string.startsWith(AbstractC2328.m4341(-388891681653614L))) {
                    int iM1311 = AbstractC0473.m1311(string, "->", 0, false, 6);
                    return Collections.singletonList(iM1311 == -1 ? new C2068(string) : AbstractC0473.m1311(string, ":", iM1311 + 1, false, 4) == -1 ? new C0757(string) : new C1743(string));
                }
                JSONArray jSONArray = new JSONArray(string);
                C2578 c2578 = new C2578(jSONArray.length());
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String string2 = jSONArray.getString(i);
                    AbstractC2328.m4341(-388900271588206L);
                    int iM13112 = AbstractC0473.m1311(string2, "->", 0, false, 6);
                    c2578.add(iM13112 == -1 ? new C2068(string2) : AbstractC0473.m1311(string2, ":", iM13112 + 1, false, 4) == -1 ? new C0757(string2) : new C1743(string2));
                }
                return AbstractC0024.m3305(c2578);
            }
        }
        return C1860.f9345;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static InterfaceC1863 m3253(String str) {
        AbstractC2328.m4341(-383488612795246L);
        LinkedHashMap linkedHashMap = AbstractC1718.f8702;
        C2701.f13261.getClass();
        String str2 = (String) linkedHashMap.get(C2701.m4798(str));
        if (str2 == null) {
            return null;
        }
        int iM1311 = AbstractC0473.m1311(str2, "->", 0, false, 6);
        return iM1311 == -1 ? new C2068(str2) : AbstractC0473.m1311(str2, ":", iM1311 + 1, false, 4) == -1 ? new C0757(str2) : new C1743(str2);
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static C0757 m3254(String str) {
        AbstractC2328.m4341(-383385533580142L);
        return (C0757) m3253(str);
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m3255(InterfaceC1212 interfaceC1212, Object obj) {
        C2770 c2770 = (C2770) obj;
        AbstractC2328.m4341(-21311200592750L);
        AbstractC2328.m4341(-21354150265710L);
        interfaceC1212.mo434(1, c2770.f13510);
        interfaceC1212.mo434(2, c2770.f13511);
        interfaceC1212.mo434(3, c2770.f13516);
        interfaceC1212.mo434(4, c2770.f13518);
        interfaceC1212.mo434(5, c2770.f13509);
        interfaceC1212.mo434(6, c2770.f13517);
        interfaceC1212.mo435(7, c2770.f13512);
        interfaceC1212.mo435(8, c2770.f13507);
        String str = c2770.f13508;
        if (str == null) {
            interfaceC1212.mo432(9);
        } else {
            interfaceC1212.mo434(9, str);
        }
        String str2 = c2770.f13515;
        if (str2 == null) {
            interfaceC1212.mo432(10);
        } else {
            interfaceC1212.mo434(10, str2);
        }
        String str3 = c2770.f13513;
        if (str3 == null) {
            interfaceC1212.mo432(11);
        } else {
            interfaceC1212.mo434(11, str3);
        }
        String str4 = c2770.f13514;
        if (str4 == null) {
            interfaceC1212.mo432(12);
        } else {
            interfaceC1212.mo434(12, str4);
        }
    }

    @Override // yyds.InterfaceC1081
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public boolean mo443(Object obj, File file, C0822 c0822) throws Throwable {
        try {
            AbstractC0282.m928((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }

    @Override // yyds.InterfaceC2614
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public void mo543() {
    }

    @Override // yyds.InterfaceC1434
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public Object mo384() {
        return new ArrayList();
    }

    @Override // yyds.InterfaceC0790
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public Class mo1779() {
        return InputStream.class;
    }

    @Override // yyds.InterfaceC2111
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public void mo246(InterfaceC1021 interfaceC1021) {
        interfaceC1021.mo1203();
    }

    @Override // yyds.InterfaceC0790
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public Object mo1780(File file) {
        return new FileInputStream(file);
    }

    @Override // yyds.InterfaceC0503
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public boolean mo609(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0 || str.trim() != str) {
            return true;
        }
        char cCharAt = str.charAt(0);
        if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '-') {
            return true;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == '\r' || cCharAt2 == '\n' || cCharAt2 == '\t' || cCharAt2 == ' ' || AbstractC1960.m3788(cCharAt2) || cCharAt2 == '\b' || cCharAt2 == '\f' || cCharAt2 == '\n' || AbstractC1960.m3786(cCharAt2)) {
                return true;
            }
        }
        return AbstractC1960.m3775(str);
    }

    @Override // yyds.InterfaceC2111
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public void mo247(InterfaceC1021 interfaceC1021) {
    }

    @Override // yyds.InterfaceC0790
    /* JADX INFO: renamed from: ᲇᛱᛲ */
    public void mo1781(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    @Override // yyds.InterfaceC2614
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public void mo569(Bitmap bitmap, InterfaceC2587 interfaceC2587) {
    }
}
