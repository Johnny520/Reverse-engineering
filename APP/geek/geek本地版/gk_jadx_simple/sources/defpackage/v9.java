package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.support.v4.graphics.drawable.C0006;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0013;
import androidx.appcompat.widget.C0015;
import androidx.appcompat.widget.C0016;
import androidx.legacy.content.C0028;
import androidx.profileinstaller.C0030;
import androidx.recyclerview.widget.C0032;
import androidx.versionedparcelable.C0038;
import com.github.megatronking.stringfog.xor.C0046;
import com.google.android.material.bottomsheet.C0051;
import com.google.android.material.theme.C0064;
import com.ljx.wechatmod.ui.C0067;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.regex.Pattern;
import kotlinx.coroutines.C0070;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v9 implements View.OnClickListener {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ v9(Object r4, Object r5, Object r6, int r7) {
        this.a = r7;
        this.c = r4;
        this.d = r5;
        this.b = r6;
        int r0 = 0;
        int r1 = C0046.m186("ۦۦ۠");
    L3:
        switch(r1) {
            case 1746784: goto L6;
            case 1750754: goto L19;
            case 1751555: goto L9;
            case 1753632: goto L11;
            case 1754379: goto L24;
            case 1755339: goto L14;
            default: goto L3;
        };
    L6:
        if (C0038.m155() > 0) goto L23;
        C0032.m128();
        String r12 = "ۧۢۡ";
    L8:
        r1 = C0015.m60(r12);
        goto L3
    L23:
        r12 = "ۦۦ۠";
        goto L8
    L9:
        System.out.println(r0);
        r1 = (C0030.f30 | C0051.f51) ^ (-1754412);
        goto L3
    L11:
        if (C0038.m155() > 0) goto L19;
        String r13 = "ۨ۟ۢ";
    L13:
        r1 = C0028.m114(r13);
        goto L3
    L14:
        r0 = Integer.parseInt(C0064.m256("wKUSEvooPrfjRtm"));
        if (C0013.m52() < 0) goto L17;
        C0006.m24();
        r13 = "ۣۦۥ";
        goto L13
    L17:
        r13 = "ۤۡ۠";
    L19:
        if (C0070.f70 > 0) goto L22;
        C0013.m52();
        String r14 = "ۦۡۧ";
    L21:
        r1 = C0072.m288(r14);
        goto L3
    L22:
        r14 = "ۣۧ۟";
        goto L21
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View r37) {
        int r5 = this.a;
        Object r4 = this.b;
        Object r3 = this.d;
        Object r2 = this.c;
        switch(r5) {
            case 0: goto L84;
            case 1: goto L79;
            case 2: goto L60;
            case 3: goto L10;
            default: goto L4;
        };
    L4:
        Activity r22 = (Activity) r2;
        FrameLayout r32 = (FrameLayout) r3;
        LinearLayout r42 = (LinearLayout) r4;
        q50.d = null;
        q50.e = null;
        gn r52 = gn.a;     // Catch: Throwable -> L8
        String r6 = u40.a("Qbi1+lhhOkd1sqI=\n", "Kt3MpTwIWSI=\n");     // Catch: Throwable -> L8
        r52.getClass();     // Catch: Throwable -> L8
        gn.f(r6, false);     // Catch: Throwable -> L8
        gn.f(u40.a("9sOWw/1scTzyyA==\n", "nabvnI8cAmM=\n"), false);     // Catch: Throwable -> L8
    L6:
        gn r53 = gn.a;
        String r62 = u40.a("GMpuhj9Y50p79A4CVwbPIxzKUQ==\n", "+lbrptrvVaw=\n");
        r53.getClass();
        gn.k(r22, r62);
        r32.removeView(r42);
        return;
    L9:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("fWsCFYtUR9Bbbzg/qQ==\n", "PgNndP8EJr4=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        goto L6
    L10:
        Activity r15 = (Activity) r2;
        TextView r11 = (TextView) r3;
        i00 r43 = (i00) r4;
        if (z30.q("oWaxgVj9XKW5Za2sc/xNpKVll7FC\n", "ygPI3iyPPcs=\n", gn.a) == false) goto L47;
        long r63 = System.currentTimeMillis();
        Object r23 = r37.getTag(2115108882);
        if ((r23 instanceof Long) == false) goto L36;
        Long r24 = (Long) r23;
    L15:
        if (r24 == null) goto L37;
        long r25 = r24.longValue();
    L18:
        if ((((r63 - 12) - r25) + 12) >= 300) goto L46;
        gn.i(r37, 1);
        String r12 = (String) r43.b;
        Dialog r13 = new Dialog(r15, R.style.Theme.Translucent.NoTitleBar);
        float r14 = r15.getResources().getDisplayMetrics().density;
        String r26 = u40.a("7adQUoXbVWg=\n", "sY8MNq6HfEw=\n");
        ip.o("pattern", r26);
        Pattern r27 = Pattern.compile(r26);
        ip.n("compile(...)", r27);
        ip.o("input", r12);
        String r28 = r27.matcher(r12).replaceAll("");
        ip.n("replaceAll(...)", r28);
        String r10 = b50.T(r28).toString();
        String r29 = gn.d("top_title_text_" + r10, "");
        final g00 r44 = new g00();
        r44.a = gn.b("top_title_color_" + r10, 0);
        FrameLayout r21 = new FrameLayout(r15);
        r21.setBackgroundColor(Color.parseColor(u40.a("UfuMWZjFZAJC\n", "cs26aaj1VDI=\n")));
        r21.setOnClickListener(new u6(r13, 15));
        LinearLayout r222 = new LinearLayout(r15);
        r222.setOrientation(1);
        GradientDrawable r33 = new GradientDrawable();
        r33.setColor(-1);
        r33.setCornerRadius(16.0f * r14);
        r222.setBackground(r33);
        int r34 = (int) (20.0f * r14);
        r222.setPadding(r34, r34, r34, r34);
        FrameLayout.LayoutParams r54 = new FrameLayout.LayoutParams(-1, -2);
        r54.gravity = 17;
        int r64 = (int) (30.0f * r14);
        r54.leftMargin = r64;
        r54.rightMargin = r64;
        r222.setLayoutParams(r54);
        r222.setOnClickListener(new u9());
        TextView r55 = new TextView(r15);
        r55.setText(u40.a("eJZttyPHregW3nnGSOjhrT+tP+cp\n", "kTfbXqBvS0g=\n"));
        r55.setTextSize(18.0f);
        r55.setTextColor(Color.parseColor(u40.a("+rHeJrQiEA==\n", "2YLtFYcRI0U=\n")));
        r55.setTypeface(null, 1);
        int r65 = (int) (15.0f * r14);
        r55.setPadding(0, 0, 0, r65);
        r222.addView(r55);
        final EditText r8 = new EditText(r15);
        if (r29.length() <= 0) goto L38;
    L21:
        r8.setText(r29);
        r8.setTextSize(16.0f);
        int r210 = r44.a;
        if (r210 == 0) goto L39;
    L23:
        r8.setTextColor(r210);
        r8.setSingleLine(true);
        GradientDrawable r211 = new GradientDrawable();
        r211.setColor(Color.parseColor(u40.a("RjXg61KNIQ==\n", "ZXPVrWfLFGs=\n")));
        float r16 = 8.0f * r14;
        r211.setCornerRadius(r16);
        r211.setStroke((int) (1.0f * r14), Color.parseColor(u40.a("ocJvyx6P2g==\n", "goYrj1rLnpU=\n")));
        r8.setBackground(r211);
        int r212 = (int) (12.0f * r14);
        int r56 = (int) (10.0f * r14);
        r8.setPadding(r212, r56, r212, r56);
        LinearLayout.LayoutParams r213 = new LinearLayout.LayoutParams(-1, -2);
        r213.bottomMargin = r65;
        r8.setLayoutParams(r213);
        r8.setSelection(r8.getText().length());
        r222.addView(r8);
        TextView r214 = new TextView(r15);
        r214.setText(u40.a("UINx2DuC5Kk+6lqmWYme4TCx2BZVnKTtAYMchgrCuZFRrVwX\n", "uQP4PrArAgk=\n"));
        r214.setTextSize(13.0f);
        r214.setTextColor(Color.parseColor(u40.a("ftKdFeQVuA==\n", "XeSrI9IjjnQ=\n")));
        int r0 = (int) r16;
        r214.setPadding(0, 0, 0, r0);
        r222.addView(r214);
        LinearLayout r18 = new LinearLayout(r15);
        r18.setOrientation(0);
        LinearLayout.LayoutParams r215 = new LinearLayout.LayoutParams(-1, -2);
        r215.bottomMargin = r34;
        r18.setLayoutParams(r215);
        int[] r02 = {0, Color.parseColor(u40.a("IiAhkNEn3g==\n", "AWUUp+IQ7Xw=\n")), Color.parseColor(u40.a("+QttAKhjeA==\n", "2j1ZQp0lTkQ=\n")), Color.parseColor(u40.a("/CkREwRZtw==\n", "3xEgUDNhgyw=\n")), Color.parseColor(u40.a("fpfvjmsbsw==\n", "XdGpzFgrgz8=\n")), Color.parseColor(u40.a("Fd7ddb/OQw==\n", "NpycQ4eNe3M=\n"))};
        final ArrayList r66 = new ArrayList();
        int r216 = 0;
    L24:
        int r9 = r216;
        if (r9 >= 6) goto L42;
        final int r57 = r02[r9];
        final FrameLayout r35 = new FrameLayout(r15);
        LinearLayout.LayoutParams r217 = new LinearLayout.LayoutParams(0, (int) (36.0f * r14), 1.0f);
        int r7 = (int) (4.0f * r14);
        r217.setMargins(r7, 0, r7, 0);
        r35.setLayoutParams(r217);
        View r72 = new View(r15);
        GradientDrawable r20 = new GradientDrawable();
        r20.setShape(1);
        if (r57 != 0) goto L40;
        int r218 = Color.parseColor(u40.a("3KUFfF7bHA==\n", "/+A1OW6eLC4=\n"));
    L29:
        r20.setColor(r218);
        r72.setBackground(r20);
        int r219 = (int) (28.0f * r14);
        FrameLayout.LayoutParams r202 = new FrameLayout.LayoutParams(r219, r219);
        r202.gravity = 17;
        r72.setLayoutParams(r202);
        if (r57 != 0) goto L32;
        GradientDrawable r220 = new GradientDrawable();
        r220.setShape(1);
        r220.setColor(0);
        r220.setStroke((int) (1.5f * r14), Color.parseColor(u40.a("eoAcXVWXmQ==\n", "WbklZGyuoJY=\n")));
        r72.setBackground(r220);
    L32:
        r35.addView(r72);
        final GradientDrawable r73 = new GradientDrawable();
        r73.setShape(1);
        r73.setColor(0);
        r73.setStroke((int) (2.0f * r14), Color.parseColor(u40.a("a2dC5YYZqw==\n", "SFRx1rUqmFQ=\n")));
        if (r57 != r44.a) goto L41;
        GradientDrawable r221 = r73;
    L35:
        r35.setBackground(r221);
        r35.setOnClickListener(new i80(r35, r44, r57, r66, r73, r8));
        r66.add(r35);
        r18.addView(r35);
        r216 = ((r9 - 20) + 1) + 20;
        goto L24
    L41:
        r221 = null;
        goto L35
    L40:
        r218 = r57;
        goto L29
    L42:
        r222.addView(r18);
        LinearLayout r223 = new LinearLayout(r15);
        r223.setOrientation(0);
        r223.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView r36 = new TextView(r15);
        r36.setText(u40.a("cMRltebD23YOrWn0\n", "lkXHUEJOMs0=\n"));
        r36.setTextSize(15.0f);
        r36.setTextColor(Color.parseColor(u40.a("GXnZisV1Cg==\n", "Ok/vvPNDPIQ=\n")));
        r36.setGravity(17);
        r36.setTypeface(null, 1);
        GradientDrawable r58 = new GradientDrawable();
        r58.setColor(Color.parseColor(u40.a("WqWnTgYifA==\n", "eeOXCDZkTCU=\n")));
        r58.setCornerRadius(r16);
        r36.setBackground(r58);
        int r59 = (int) (42.0f * r14);
        LinearLayout.LayoutParams r67 = new LinearLayout.LayoutParams(0, r59, 1.0f);
        r67.rightMargin = r0;
        r36.setLayoutParams(r67);
        r36.setOnClickListener(new x9(r10, r11, r12, r13, 3));
        TextView r68 = new TextView(r15);
        z30.n("XsSPNdXH7gYlnYdY\n", "unsS0HhfCZI=\n", r68, 15.0f, -1);
        r68.setGravity(17);
        r68.setTypeface(null, 1);
        GradientDrawable r74 = new GradientDrawable();
        r74.setColor(Color.parseColor(u40.a("H5DgxMaoqg==\n", "PKbWhvXu7EM=\n")));
        r74.setCornerRadius(r16);
        r68.setBackground(r74);
        LinearLayout.LayoutParams r75 = new LinearLayout.LayoutParams(0, r59, 1.0f);
        r75.leftMargin = r0;
        r68.setLayoutParams(r75);
        r68.setOnClickListener(new w7(r8, r12, r44, r10, r11, r13));
        r223.addView(r36);
        r223.addView(r68);
        r222.addView(r223);
        r21.addView(r222);
        r13.setContentView(r21);
        Window r224 = r13.getWindow();
        if (r224 == null) goto L45;
        r224.setSoftInputMode(4);
    L45:
        r13.show();
        r37.setTag(2115108882, 0L);
        return;
    L39:
        r210 = -16777216;
        goto L23
    L38:
        r29 = r12;
        goto L21
    L46:
        r37.setTag(2115108882, Long.valueOf(r63));
        goto L47
    L37:
        r25 = 0;
        goto L18
    L36:
        r24 = null;
    L47:
        Object r225 = r37.getParent();
        if ((r225 instanceof View) == false) goto L56;
        View r226 = (View) r225;
    L50:
        if (r226 == null) goto L207;
        if (r226.isClickable() == true) goto L55;
        if (r226.hasOnClickListeners() == true) goto L55;
        Object r227 = r226.getParent();
        if ((r227 instanceof View) == false) goto L56;
        r226 = (View) r227;
        goto L50
    L56:
        r226 = null;
    L55:
        r226.performClick();
        return;
    L207:
        return;
    L181:
        r226 = null;
        goto L50
    L60:
        nv r228 = (nv) r2;
        mv r45 = (mv) r4;
        LinkedHashSet r510 = r228.c;
        String r38 = ((ov) r3).a;
        if (r510.contains(r38) == false) goto L76;
        r510.remove(r38);
    L63:
        View r511 = r45.a;
        Object r39 = r511.getTag(2114322433);
        if ((r39 instanceof h40) == false) goto L77;
        h40 r310 = (h40) r39;
    L66:
        if (r310 != null) goto L168;
        h40 r311 = new h40(r511, h40.n);
        r511.setTag(2114322433, r311);
        h40 r46 = r311;
    L68:
        Object r312 = r511.getTag(2114322434);
        if ((r312 instanceof h40) == false) goto L78;
        h40 r313 = (h40) r312;
    L71:
        if (r313 != null) goto L73;
        r313 = new h40(r511, h40.o);
        r511.setTag(2114322434, r313);
    L73:
        r511.setScaleX(0.65f);
        r511.setScaleY(0.65f);
        i40 r512 = new i40(1.0f);
        r512.b(1500.0f);
        r512.a(0.45f);
        r46.j = r512;
        r313.j = z30.f(1.0f, 1500.0f, 0.45f);
        r46.h();
        r313.h();
        r228.notifyDataSetChanged();
        r228.g.a();
        if (C0067.m269() > 0) goto L197;
        System.out.println(Float.parseFloat(C0016.m67("yzDbojiYXlOaFvqoYQKB2DoKzEFa")));
        return;
    L197:
        return;
    L78:
        r313 = null;
        goto L71
    L168:
        r46 = r310;
        goto L68
    L77:
        r310 = null;
        goto L66
    L76:
        r510.add(r38);
        goto L63
    L79:
        g00 r314 = (g00) r3;
        Context r47 = (Context) r4;
        gn r513 = gn.a;
        ip.l(r37);
        r513.getClass();
        gn.i(r37, 1);
        if (((g00) r2).a == 0) goto L83;
        r314.a = 2;
        String r315 = "TTWtSf/HTvsAYZMWoNYBihkFzBfatxHvQQCmRMzh\n";
        String r229 = "qIUrrEVTqW8=\n";
    L82:
        gn.k(r47, u40.a(r315, r229));
        return;
    L83:
        r315 = "AnxZg1MC/oVCN1bsMByi8GpaCt57Y7mFAlpc\n";
        r229 = "6tPuZtaKGxk=\n";
        goto L82
    L84:
        Dialog r316 = (Dialog) r3;
        Context r17 = (Context) r4;
        gn r48 = gn.a;
        ip.l(r37);
        r48.getClass();
        gn.i(r37, 1);
        Field r49 = in.g;     // Catch: Throwable -> L131
        if (r49 == null) goto L129;
        Object r230 = r49.get(r2);     // Catch: Throwable -> L131
    L89:
        if ((r230 instanceof String) == false) goto L130;
        String r231 = (String) r230;     // Catch: Throwable -> L131
    L91:
        if (r231 != null) goto L93;
        r231 = "";
    L93:
        String r19 = r231;
    L94:
        r316.dismiss();
        if (r19.length() <= 0) goto L164;
        Handler r232 = uv.a;
        ClassLoader r182 = d9.a;
        Float r242 = Float.valueOf(10.0f);
        Float r262 = Float.valueOf(32.0f);
        if (r19.length() == 0) goto L200;
        if (r182 != null) goto L100;
        return;
    L100:
        if ((r17 instanceof Activity) == false) goto L105;
        Activity r233 = (Activity) r17;
        if (r233.isFinishing() == false) goto L104;
        return;
    L104:
        if (r233.isDestroyed() == false) goto L105;
        return;
    L105:
        final kv r2210 = new kv(r17, 0);
        final kv r234 = new kv(r17, 1);
        if (Build.VERSION.SDK_INT < 29) goto L133;
        int r235 = r17.getResources().getConfiguration().uiMode;
        if ((r235 & (r235 ^ (-49))) != 32) goto L133;
        boolean r252 = true;
    L175:
        gn r236 = gn.a;     // Catch: Throwable -> L134
        String r317 = u40.a("WHhar2yDRSNbeE6V\n", "Mx0j8BnqGlc=\n");     // Catch: Throwable -> L165
        r236.getClass();     // Catch: Throwable -> L165
        int r272 = gn.b(r317, 0);     // Catch: Throwable -> L165
    L113:
        pv r237 = new pv(Color.parseColor(u40.a("wPmbtb5ehw==\n", "47+s84kYsMs=\n")), Color.parseColor(u40.a("MjQ1GkMFOw==\n", "EXEAX3ZAejs=\n")), Color.parseColor(u40.a("WXCjqxadYg==\n", "ekHgmlWsJ+k=\n")), Color.parseColor(u40.a("A89eDRYo6g==\n", "IPcbNVMR2Zs=\n")), Color.parseColor(u40.a("sK6ndgM98w==\n", "k56XQUJ7tc8=\n")), Color.parseColor(u40.a("nT3iCm5Hdw==\n", "vg3SP1gFRGk=\n")), Color.parseColor(u40.a("C1g02grZ7w==\n", "KBsCmTya10A=\n")), Color.parseColor(u40.a("qIw4bfcAN5C7\n", "i715XccwB6A=\n")));
        pv r318 = new pv(Color.parseColor(u40.a("teCGCRnqnQ==\n", "lqbATymsqMA=\n")), Color.parseColor(u40.a("kUoOr/aDZA==\n", "sgxI6sLGVUw=\n")), Color.parseColor(u40.a("Cwh+ibadgA==\n", "KD06vYaut5A=\n")), Color.parseColor(u40.a("kLlsXPx0SQ==\n", "s/hdZMRDDyM=\n")), Color.parseColor(u40.a("3Vsa6x6Akw==\n", "/h1c0yvBoYQ=\n")), Color.parseColor(u40.a("3BmoBpD31g==\n", "/1/uMKm14to=\n")), Color.parseColor(u40.a("+REzZZM31g==\n", "2lQDJtF0lGw=\n")), Color.parseColor(u40.a("JTKkPUMaozs3\n", "BgGXewVYlXg=\n")));
        pv r410 = new pv(Color.parseColor(u40.a("26ZXCPF9TA==\n", "+JcUObJMCRM=\n")), Color.parseColor(u40.a("shINESkweg==\n", "kSBOI2oCP4A=\n")), Color.parseColor(u40.a("M/IVsFttIg==\n", "ELQg9m4rFyk=\n")), Color.parseColor(u40.a("k1+1HZ7dHQ==\n", "sGfwJdvkLnM=\n")), Color.parseColor(u40.a("oqeHdwtp4Q==\n", "gZfGTz8vpzQ=\n")), Color.parseColor(u40.a("nf+uQm/RKw==\n", "vs+ed1mTGN8=\n")), Color.parseColor(u40.a("U2xvAqvL4A==\n", "cFhXNpP/oXc=\n")), Color.parseColor(u40.a("7l7AHCDJsoaL\n", "zW3zWmaP9MA=\n")));
        pv r514 = new pv(Color.parseColor(u40.a("WoyXu7CDRg==\n", "ecrR/fbFACw=\n")), Color.parseColor(u40.a("Mi1XgIRWVw==\n", "EWtlxrYQZZA=\n")), Color.parseColor(u40.a("KfFRqaJZ0A==\n", "CsJimpFq4+U=\n")), Color.parseColor(u40.a("sFsA8ChDXg==\n", "k202xh51aNw=\n")), Color.parseColor(u40.a("2j4fu7p+Bw==\n", "+Q4vgoxGP/A=\n")), Color.parseColor(u40.a("jPWvxzAGug==\n", "r8Wf8Akw+N4=\n")), Color.parseColor(u40.a("kcfsR7/xPg==\n", "soSvBPyyfbo=\n")), Color.parseColor(u40.a("xP0Xopdk2UHX\n", "58xWkqdU6XE=\n")));
        pv r69 = new pv(Color.parseColor(u40.a("XA/NzpaJHg==\n", "fz6O/9W4W2c=\n")), Color.parseColor(u40.a("GnBX6gknBA==\n", "OUIU2EoVQW0=\n")), Color.parseColor(u40.a("95Qet1OmQw==\n", "1NIr8Wbgdv8=\n")), Color.parseColor(u40.a("hseAyS8u3g==\n", "pf/F8WoX7f4=\n")), Color.parseColor(u40.a("V8Uvyx5nSQ==\n", "dPVu8yohD4Y=\n")), Color.parseColor(u40.a("DHCNij8AEw==\n", "L0C9vwlCIL8=\n")), Color.parseColor(u40.a("xjQMsTDGZw==\n", "5QA0hQjyJgQ=\n")), Color.parseColor(u40.a("YBWE6Kfk198F\n", "Qya3ruGikZk=\n")));
        final pv r76 = new pv(Color.parseColor(u40.a("69ckXBPaYw==\n", "yOYWbSHrUTQ=\n")), Color.parseColor(u40.a("Uj0DiqIeQg==\n", "cQxGu+cvB3g=\n")), Color.parseColor(u40.a("Vu+q50z+xg==\n", "daqaony79kk=\n")), Color.parseColor(u40.a("zlajTWo2qA==\n", "7W/mdC8P7Xk=\n")), Color.parseColor(u40.a("1LrpOP7aKQ==\n", "94LZe7yZHXo=\n")), Color.parseColor(u40.a("d95biYwLwQ==\n", "VO5rsLoz+R0=\n")), Color.parseColor(u40.a("iza0paA7GA==\n", "qAKGkZIPKgo=\n")), Color.parseColor(u40.a("fmal7eP3C18b\n", "XVWWq6WxTRk=\n")));
        if (r272 != 1) goto L116;
        r76 = r318;
    L121:
        final g00 r319 = new g00();
        final i00 r112 = new i00();
        r112.b = "";
        LinkedHashSet r142 = new LinkedHashSet();
        final ArrayList r102 = new ArrayList();
        final i00 r122 = new i00();
        Dialog r162 = new Dialog(r17, R.style.Theme.Translucent.NoTitleBar);
        FrameLayout r31 = new FrameLayout(r17);
        r31.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (r272 == 2) goto L124;
        if (r252 == true) goto L124;
        String r238 = "eiDSgPfhm6lp\n";
        String r411 = "WRSWsMfRq5k=\n";
    L125:
        r31.setBackgroundColor(Color.parseColor(u40.a(r238, r411)));
        r31.setOnClickListener(new u6(r162, 13));
        int r03 = (int) (((double) r17.getResources().getDisplayMetrics().heightPixels) * 0.88d);
        LinearLayout r332 = new LinearLayout(r17);
        r332.setOrientation(1);
        FrameLayout.LayoutParams r239 = new FrameLayout.LayoutParams(-1, r03);
        r239.gravity = 80;
        r332.setLayoutParams(r239);
        GradientDrawable r412 = new GradientDrawable();
        int r132 = r76.a;
        r412.setColor(r132);
        r412.setCornerRadii(new float[]{((Number) r234.f(r262)).floatValue(), ((Number) r234.f(r262)).floatValue(), ((Number) r234.f(r262)).floatValue(), ((Number) r234.f(r262)).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f});
        r332.setBackground(r412);
        r332.setElevation(((Number) r234.f(Float.valueOf(24.0f))).floatValue());
        r332.setClickable(true);
        View r413 = new View(r17);
        GradientDrawable r515 = new GradientDrawable();
        r515.setColor(r76.g);
        r515.setCornerRadius(((Number) r234.f(r242)).floatValue());
        r413.setBackground(r515);
        LinearLayout.LayoutParams r516 = new LinearLayout.LayoutParams(((Number) r2210.f(40)).intValue(), ((Number) r2210.f(5)).intValue());
        r516.gravity = 1;
        r516.topMargin = ((Number) r2210.f(16)).intValue();
        r516.bottomMargin = ((Number) r2210.f(12)).intValue();
        r413.setLayoutParams(r516);
        r332.addView(r413);
        TextView r414 = new TextView(r17);
        int r152 = r76.c;
        z30.n("Qquk17SiHUUi0Kqv3JJVJDuG\n", "pDUlPjQ9+M0=\n", r414, 18.0f, r152);
        r414.setTypeface(null, 1);
        r414.setGravity(17);
        LinearLayout.LayoutParams r517 = new LinearLayout.LayoutParams(-1, -2);
        r517.bottomMargin = ((Number) r2210.f(16)).intValue();
        r414.setLayoutParams(r517);
        r332.addView(r414);
        LinearLayout r415 = new LinearLayout(r17);
        r415.setPadding(((Number) r2210.f(24)).intValue(), 0, ((Number) r2210.f(24)).intValue(), ((Number) r2210.f(16)).intValue());
        r415.setOrientation(1);
        EditText r342 = new EditText(r17);
        r342.setHint(u40.a("bpv7Mm+zGyt5sM1a6uhuOBUriAHrvQo9\n", "ngRvv09Vi7c=\n"));
        r342.setTextSize(15.0f);
        r342.setTextColor(r152);
        r342.setHintTextColor(r76.d);
        GradientDrawable r518 = new GradientDrawable();
        int r04 = r76.b;
        r518.setColor(r04);
        r518.setCornerRadius(((Number) r234.f(Float.valueOf(14.0f))).floatValue());
        r342.setBackground(r518);
        r342.setPadding(((Number) r2210.f(16)).intValue(), ((Number) r2210.f(10)).intValue(), ((Number) r2210.f(16)).intValue(), ((Number) r2210.f(10)).intValue());
        r342.setSingleLine(true);
        r415.addView(r342);
        r332.addView(r415);
        LinearLayout r2110 = new LinearLayout(r17);
        r2110.setOrientation(0);
        LinearLayout.LayoutParams r416 = new LinearLayout.LayoutParams(-1, -2);
        r416.setMargins(((Number) r2210.f(24)).intValue(), 0, ((Number) r2210.f(24)).intValue(), ((Number) r2210.f(16)).intValue());
        r2110.setLayoutParams(r416);
        GradientDrawable r417 = new GradientDrawable();
        r417.setColor(r04);
        r417.setCornerRadius(((Number) r234.f(Float.valueOf(12.0f))).floatValue());
        r2110.setBackground(r417);
        r2110.setPadding(((Number) r2210.f(4)).intValue(), ((Number) r2210.f(4)).intValue(), ((Number) r2210.f(4)).intValue(), ((Number) r2210.f(4)).intValue());
        final TextView[] r519 = {new TextView(r17), new TextView(r17), new TextView(r17)};
        String[] r05 = {u40.a("z1cLCbGh\n", "KtKj4DIJcKI=\n"), u40.a("IEzej8TJ\n", "xeljaktC5mQ=\n"), u40.a("xLf8JF6z\n", "IwlYzN8506Q=\n")};
        final int r418 = 0;
    L127:
        if (r418 >= 3) goto L142;
        final TextView r610 = r519[r418];
        r610.setText(r05[r418]);
        r610.setTextSize(14.0f);
        r610.setTextColor(r152);
        r610.setGravity(17);
        r610.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r610.setPadding(0, ((Number) r2210.f(8)).intValue(), 0, ((Number) r2210.f(8)).intValue());
        r610.setOnClickListener(new lv(r319, r418, r519, r610, r76, r234, r2210, r102, r112, r122));
        r2110.addView(r519[r418]);
        r418 = 1 - (0 - r418);
        goto L127
    L142:
        r519[0].performClick();
        r332.addView(r2110);
        View r419 = new View(r17);
        r419.setLayoutParams(new LinearLayout.LayoutParams(-1, ((Number) r2210.f(1)).intValue()));
        r419.setBackgroundColor(r04);
        r332.addView(r419);
        LinearLayout r520 = new LinearLayout(r17);
        r520.setOrientation(1);
        r520.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        ListView r611 = new ListView(r17);
        r611.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        r611.setDivider(new ColorDrawable(0));
        r611.setDividerHeight(0);
        r611.setVerticalScrollBarEnabled(false);
        LinearLayout r82 = new LinearLayout(r17);
        r82.setOrientation(0);
        r82.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r82.setPadding(((Number) r2210.f(24)).intValue(), ((Number) r2210.f(16)).intValue(), ((Number) r2210.f(24)).intValue(), ((Number) r2210.f(24)).intValue());
        r82.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(0, Color.red(r132), Color.green(r132), Color.blue(r132)), Color.argb(255, Color.red(r132), Color.green(r132), Color.blue(r132))}));
        TextView r153 = new TextView(r17);
        r153.setText(u40.a("vCH/pN1p\n", "Wa5uTV3op9Y=\n"));
        r153.setTextSize(16.0f);
        r153.setGravity(17);
        r153.setLayoutParams(new LinearLayout.LayoutParams(-1, ((Number) r2210.f(50)).intValue()));
        GradientDrawable.Orientation r240 = GradientDrawable.Orientation.LEFT_RIGHT;
        int r420 = r76.f;
        int r92 = r76.e;
        GradientDrawable r133 = new GradientDrawable(r240, new int[]{r92, r420});
        r133.setCornerRadius(((Number) r234.f(Float.valueOf(25.0f))).floatValue());
        r153.setBackground(r133);
        r153.setTextColor(-1);
        r153.setTypeface(null, 1);
        r153.setAlpha(0.5f);
        r153.setEnabled(false);
        r153.setTranslationY(((Number) r234.f(Float.valueOf(15.0f))).floatValue());
        int r282 = Build.VERSION.SDK_INT;
        if (r282 < 28) goto L145;
        r153.setElevation(((Number) r234.f(r242)).floatValue());
        c0.s(r153, r92);
        c0.B(r153, r92);
    L145:
        r153.setOnClickListener(new w7(r142, r153, r162, r17, r182, r19, 2));
        r82.addView(r153);
        r520.addView(r611);
        r520.addView(r82);
        r332.addView(r520);
        nv r183 = new nv(r17, r102, r142, r2210, r234, r76, r252, new iv(r153, r142, r234, 2));
        r122.b = r183;
        r611.setAdapter(r183);
        r342.addTextChangedListener(new qv(r319, r112, r122, r102));
        r31.addView(r332);
        r162.setContentView(r31);
        Window r521 = r162.getWindow();
        if (r521 == null) goto L151;
        r521.setLayout(-1, -1);
        r521.setBackgroundDrawable(new ColorDrawable(0));
        r521.addFlags(Integer.MIN_VALUE);
        r521.addFlags(512);
        r521.clearFlags(67108864);
        r521.setStatusBarColor(0);
        r521.setNavigationBarColor(0);
        if (r282 < 31) goto L157;
        r521.addFlags(4);     // Catch: Throwable -> L154
        p7.u(r521.getAttributes());     // Catch: Throwable -> L154
        r521.setDimAmount(0.2f);     // Catch: Throwable -> L154
    L155:
        r521.setDimAmount(0.5f);
        goto L151
    L157:
        if (r272 == 2) goto L167;
        if (r252 == false) goto L161;
        float r241 = 0.5f;
    L160:
        r521.setDimAmount(r241);
        goto L151
    L161:
        r241 = 0.4f;
        goto L160
    L167:
        r241 = 0.5f;
    L151:
        r162.setOnShowListener(new mk(r332, r03, 2));
        r162.show();     // Catch: Throwable -> L162
        xf r243 = wg.a;
        a80.r(ip.c(ls.a), null, new sv(r102, r319, r112, r122, null), 3);
        return;
    L163:
        z30.o("Nwje\n", "Q2m5jaPP2Zc=\n", u40.a("QJRCsmncprJ/uHaJY8WGvmyLSoY=\n", "Decl4Qyywtc=\n"), "Fg==\n", "c8HJlSTQVfc=\n");
        return;
    L124:
        r238 = "+u6G3vxqxInp\n";
        r411 = "2da27sxa9Lk=\n";
        goto L125
    L116:
        if (r272 != 2) goto L118;
        r76 = r410;
        goto L121
    L118:
        if (r272 == 3) goto L137;
        if (r252 == false) goto L136;
        r76 = r69;
        goto L121
    L136:
        r76 = r237;
        goto L121
    L137:
        if (r252 == true) goto L121;
        r76 = r514;
    L135:
        r272 = 0;
    L133:
        r252 = false;
        goto L175
    L200:
        return;
    L164:
        gn r244 = gn.a;
        String r320 = u40.a("tgea7uFa9bHzYLK4hnuy++ANyK/fJKm7\n", "XoktC27MHR4=\n");
        r244.getClass();
        gn.k(r17, r320);
        return;
    L130:
        r231 = null;
        goto L91
    L129:
        r230 = null;
    L132:
        r19 = "";
        goto L94
    }
}
