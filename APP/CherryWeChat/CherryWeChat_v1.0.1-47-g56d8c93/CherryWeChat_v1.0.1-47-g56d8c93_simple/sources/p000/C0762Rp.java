package p000;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import io.github.cherrywechat.R;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.dev.CherryDevServer;
import io.github.cherrywechat.lua.loader.LoadedScript;
import io.github.cherrywechat.lua.loader.ScriptManager;
import io.github.cherrywechat.lua.loader.ScriptState;
import io.github.cherrywechat.lua.loader.ScriptStateListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Rp */
/* JADX INFO: loaded from: classes.dex */
public final class C0762Rp implements InterfaceC0972Wk, ScriptStateListener {

    /* JADX INFO: renamed from: a */
    public LinearLayout f2409a;

    /* JADX INFO: renamed from: b */
    public EditText f2410b;

    /* JADX INFO: renamed from: c */
    public TextView f2411c;

    /* JADX INFO: renamed from: d */
    public TextView f2412d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f2413e;

    /* JADX INFO: renamed from: f */
    public TextView f2414f;

    /* JADX INFO: renamed from: g */
    public Activity f2415g;

    /* JADX INFO: renamed from: h */
    public final Handler f2416h;

    /* JADX INFO: renamed from: i */
    public TextView f2417i;

    /* JADX INFO: renamed from: j */
    public TextView f2418j;

    /* JADX INFO: renamed from: k */
    public TextView f2419k;

    /* JADX INFO: renamed from: l */
    public TextView f2420l;

    /* JADX INFO: renamed from: m */
    public LinearLayout f2421m;

    /* JADX INFO: renamed from: n */
    public Handler f2422n;

    /* JADX INFO: renamed from: o */
    public boolean f2423o;

    /* JADX INFO: renamed from: p */
    public final C0104Cb f2424p;

    /* JADX INFO: renamed from: q */
    public final List f2425q;

    public C0762Rp() {
        this.f2416h = new Handler(Looper.getMainLooper());
        C1498hd r1 = AbstractC1499he.f5282a;
        C2283nk r12 = AbstractC1106Zp.f3500a;
        C0343Hz r2 = new C0343Hz();
        r12.getClass();
        this.f2424p = AbstractC0671Pj.m1343a(AbstractC1406fG.m2700Z(r12, r2));
        this.f2425q = AbstractC2496sa.m4977b0(new C0634Op[]{new C0634Op(AbstractC0295Gu.m625r(-129184026327093L), AbstractC0295Gu.m625r(-128685810120757L), AbstractC0295Gu.m625r(-128707284957237L)), new C0634Op(AbstractC0295Gu.m625r(-129338645149749L), AbstractC0295Gu.m625r(-129377299855413L), AbstractC0295Gu.m625r(-129433134430261L)), new C0634Op(AbstractC0295Gu.m625r(-127461744441397L), AbstractC0295Gu.m625r(-127483219277877L), AbstractC0295Gu.m625r(-127023657777205L)), new C0634Op(AbstractC0295Gu.m625r(-125271311120437L), AbstractC0295Gu.m625r(-125301375891509L), AbstractC0295Gu.m625r(-124841814390837L)), new C0634Op(AbstractC0295Gu.m625r(-139912854632501L), AbstractC0295Gu.m625r(-140496970184757L), AbstractC0295Gu.m625r(-140591459465269L)), new C0634Op(AbstractC0295Gu.m625r(-137640816932917L), AbstractC0295Gu.m625r(-137662291769397L), AbstractC0295Gu.m625r(-138293651961909L)), new C0634Op(AbstractC0295Gu.m625r(-136262132430901L), AbstractC0295Gu.m625r(-136313672038453L), AbstractC0295Gu.m625r(-135854110537781L)), new C0634Op(AbstractC0295Gu.m625r(-132881993168949L), AbstractC0295Gu.m625r(-132907762972725L), AbstractC0295Gu.m625r(-132989367351349L)), new C0634Op(AbstractC0295Gu.m625r(-108044197296181L), AbstractC0295Gu.m625r(-108074262067253L), AbstractC0295Gu.m625r(-108164456380469L)), new C0634Op(AbstractC0295Gu.m625r(-121143847548981L), AbstractC0295Gu.m625r(-121186797221941L), AbstractC0295Gu.m625r(-121822452381749L)), new C0634Op(AbstractC0295Gu.m625r(-443511207884853L), AbstractC0295Gu.m625r(-443545567623221L), AbstractC0295Gu.m625r(-443592812263477L)), new C0634Op(AbstractC0295Gu.m625r(-454051057629237L), AbstractC0295Gu.m625r(-454081122400309L), AbstractC0295Gu.m625r(-453578611226677L))});
    }

    /* JADX INFO: renamed from: e */
    public static TextView m1557e(Activity r2, String r3, int r4, InterfaceC0884Ui r5) {
        TextView r0 = new TextView(r2);
        r0.setText(r3);
        r0.setTextSize(13.0f);
        r0.setTextColor(-1);
        r0.setTypeface(Typeface.DEFAULT_BOLD);
        r0.setGravity(17);
        GradientDrawable r22 = new GradientDrawable();
        r22.setColor(r4);
        r22.setCornerRadius(AbstractC0295Gu.m616i(8));
        r0.setBackground(r22);
        r0.setPadding(AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(8));
        r0.setClickable(true);
        r0.setFocusable(true);
        r0.setOnClickListener(new ViewOnClickListenerC0462Kp(0, r5));
        return r0;
    }

    /* JADX INFO: renamed from: f */
    public static View m1558f(Activity r3) {
        View r0 = new View(r3);
        r0.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(8), 0));
        return r0;
    }

    /* JADX INFO: renamed from: a */
    public final void m1559a(String r4) {
        TextView r0 = this.f2411c;
        if (r0 == null) goto L13;
        r0.append(r4);
        TextView r42 = this.f2411c;
        ScrollView r02 = null;
        if (r42 != null) goto L7;
        AbstractC0295Gu.m625r(-431682867951669L);
        r42 = null;
    L7:
        ViewParent r43 = r42.getParent();
        if ((r43 instanceof ScrollView) == false) goto L10;
        r02 = (ScrollView) r43;
    L10:
        if (r02 == null) goto L14;
        r02.post(new RunnableC0562N2(17, r02));
        return;
    L14:
        return;
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-482999137204277L);
        C0104Cb r0 = this.f2424p;
        InterfaceC1332dm r1 = (InterfaceC1332dm) r0.f248a.mo24m(C1456gf.f5162f);
        if (r1 == null) goto L10;
        r1.mo1749r(null);
        ScriptManager.INSTANCE.removeStateListener(this);
        CherryGlobalAPI.INSTANCE.setPrintListener(null);
        Handler r12 = this.f2422n;
        if (r12 == null) goto L7;
        r12.removeCallbacksAndMessages(null);
    L7:
        this.f2422n = null;
        return;
    L10:
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + r0).toString());
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity r7, int r8, int r9, Intent r10) {
        AbstractC0295Gu.m625r(-483037791909941L);
        if (r8 == 1001) goto L5;
        return;
    L5:
        if (r9 != (-1)) goto L97;
        if (r10 == null) goto L98;
        Uri r1 = r10.getData();
        if (r1 != null) goto L95;
        return;
    L95:
        String r72 = AbstractC0295Gu.m625r(-432327113046069L);     // Catch: Exception -> L13
        Activity r82 = this.f2415g;     // Catch: Exception -> L13
        Activity r102 = null;
        if (r82 != null) goto L15;
        AbstractC0295Gu.m625r(-432374357686325L);     // Catch: Exception -> L13
        r82 = null;
    L15:
        Cursor r83 = r82.getContentResolver().query(r1, null, null, null, null);     // Catch: Exception -> L13
        if (r83 == null) goto L33;
    L23:
        th = move-exception;
        throw th;     // Catch: Throwable -> L28
    L28:
        th = move-exception;
        AbstractC0585Nj.m1138f(r83, th);     // Catch: Exception -> L13
        throw th;     // Catch: Exception -> L13
    L18:
        if (r83.moveToFirst() == false) goto L25;
        int r0 = r83.getColumnIndex(AbstractC0295Gu.m625r(-432992832976949L));     // Catch: Throwable -> L23
        if (r0 < 0) goto L25;
        r72 = r83.getString(r0);     // Catch: Throwable -> L23
        AbstractC0295Gu.m625r(-433052962519093L);     // Catch: Throwable -> L23
    L25:
        r83.close();     // Catch: Exception -> L13
    L33:
        if (AbstractC0085Bz.m132J(r72, false, AbstractC0295Gu.m625r(-433117387028533L)) == true) goto L40;
        m1559a(AbstractC0295Gu.m625r(-433138861865013L));     // Catch: Exception -> L13
        Activity r73 = this.f2415g;     // Catch: Exception -> L13
        if (r73 != null) goto L37;
        AbstractC0295Gu.m625r(-432666415462453L);     // Catch: Exception -> L13
    L38:
        Toast.makeText(r102, AbstractC0295Gu.m625r(-432735134939189L), 0).show();     // Catch: Exception -> L13
        return;
    L37:
        r102 = r73;
        goto L38
    L40:
        Activity r2 = this.f2415g;     // Catch: Exception -> L13
        if (r2 != null) goto L43;
        AbstractC0295Gu.m625r(-432786674546741L);     // Catch: Exception -> L13
        r2 = null;
    L43:
        File r84 = new File(r2.getFilesDir(), AbstractC0295Gu.m625r(-432855394023477L));     // Catch: Exception -> L13
        if (r84.exists() == true) goto L46;
        r84.mkdirs();     // Catch: Exception -> L13
    L46:
        File r22 = new File(r84, r72);     // Catch: Exception -> L13
        Activity r74 = this.f2415g;     // Catch: Exception -> L13
        if (r74 != null) goto L49;
        AbstractC0295Gu.m625r(-432906933631029L);     // Catch: Exception -> L13
        r74 = null;
    L49:
        InputStream r75 = r74.getContentResolver().openInputStream(r1);     // Catch: Exception -> L13
        if (r75 != null) goto L84;
    L69:
        m1559a(AbstractC0295Gu.m625r(-431326385666101L) + r22.getAbsolutePath() + '\n');     // Catch: Exception -> L13
        ScriptManager r76 = ScriptManager.INSTANCE;     // Catch: Exception -> L13
        Activity r85 = this.f2415g;     // Catch: Exception -> L13
        if (r85 != null) goto L72;
        AbstractC0295Gu.m625r(-431382220240949L);     // Catch: Exception -> L13
    L73:
        LoadedScript r77 = r76.loadScript(r102, r22, false);     // Catch: Exception -> L13
        if (r77 == null) goto L80;
        m1559a(AbstractC0295Gu.m625r(-431450939717685L) + r77.getName() + AbstractC0295Gu.m625r(-431506774292533L) + r77.getVersion() + '\n');     // Catch: Exception -> L13
        StringBuilder r86 = new StringBuilder();     // Catch: Exception -> L13
        r86.append(AbstractC0295Gu.m625r(-431519659194421L));     // Catch: Exception -> L13
        r86.append(r77.getAuthor());     // Catch: Exception -> L13
        r86.append('\n');     // Catch: Exception -> L13
        m1559a(r86.toString());     // Catch: Exception -> L13
        if (r77.getDescription().length() <= 0) goto L78;
        m1559a(AbstractC0295Gu.m625r(-431025737955381L) + r77.getDescription() + '\n');     // Catch: Exception -> L13
    L78:
        m1560g();     // Catch: Exception -> L13
        return;
    L80:
        m1559a(AbstractC0295Gu.m625r(-431081572530229L));     // Catch: Exception -> L13
        return;
    L72:
        r102 = r85;
        goto L73
    L84:
        FileOutputStream r87 = new FileOutputStream(r22);     // Catch: Throwable -> L56
        AbstractC1293cr.m2555p(r75, r87);     // Catch: Throwable -> L58
        r87.close();     // Catch: Throwable -> L56
        r75.close();     // Catch: Exception -> L13
        goto L69
    L58:
        th = move-exception;
        throw th;     // Catch: Throwable -> L61
    L61:
        th = move-exception;
        AbstractC0585Nj.m1138f(r87, th);     // Catch: Throwable -> L56
        throw th;     // Catch: Throwable -> L56
    L56:
        th = move-exception;
        throw th;     // Catch: Throwable -> L65
    L65:
        th = move-exception;
        AbstractC0585Nj.m1138f(r75, th);     // Catch: Exception -> L13
        throw th;     // Catch: Exception -> L13
    L13:
        e = move-exception;
        m1559a(AbstractC0295Gu.m625r(-431137407105077L) + e.getMessage() + '\n');
        return;
    L98:
        return;
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity r26) {
        AbstractC0295Gu.m625r(-439207650654261L);
        this.f2415g = r26;
        ScriptManager.INSTANCE.addStateListener(this);
        LinearLayout r4 = new LinearLayout(r26);
        r4.setOrientation(1);
        r4.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r4.setBackgroundColor(r26.getColor(R.color.colorBackground));
        this.f2409a = r4;
        ScrollView r42 = new ScrollView(r26);
        r42.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r42.setFillViewport(true);
        LinearLayout r6 = new LinearLayout(r26);
        r6.setOrientation(1);
        r6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout r8 = new LinearLayout(r26);
        r8.setOrientation(0);
        r8.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r8.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        r8.setGravity(16);
        final int r14 = 1;
        r8.addView(m1557e(r26, AbstractC0295Gu.m625r(-437996469876789L), r26.getColor(R.color.colorPrimary), new C0333Hp(this, r14)));
        r8.addView(m1558f(r26));
        final int r12 = 2;
        r8.addView(m1557e(r26, AbstractC0295Gu.m625r(-438017944713269L), r26.getColor(R.color.colorSuccess), new C0333Hp(this, r12)));
        r8.addView(m1558f(r26));
        r8.addView(m1557e(r26, AbstractC0295Gu.m625r(-438043714517045L), r26.getColor(R.color.colorInfo), new C1389f(6, this, r26)));
        r8.addView(m1558f(r26));
        final int r9 = 0;
        r8.addView(m1557e(r26, AbstractC0295Gu.m625r(-438056599418933L), r26.getColor(R.color.colorWarning), new C0333Hp(this, r9)));
        View r5 = new View(r26);
        r5.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        r8.addView(r5);
        TextView r52 = new TextView(r26);
        AbstractC0213Ey.m414l(-438069484320821L, r52, 12.0f);
        r52.setTextColor(r26.getColor(R.color.colorWarning));
        this.f2412d = r52;
        r8.addView(r52);
        r6.addView(r8);
        LinearLayout r82 = new LinearLayout(r26);
        r82.setOrientation(1);
        LinearLayout.LayoutParams r122 = new LinearLayout.LayoutParams(-1, -2);
        r122.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), 0);
        r82.setLayoutParams(r122);
        GradientDrawable r2 = new GradientDrawable();
        r2.setColor(r26.getColor(R.color.colorForeground));
        r2.setCornerRadius(AbstractC0295Gu.m616i(12));
        r82.setBackground(r2);
        LinearLayout r22 = new LinearLayout(r26);
        r22.setOrientation(0);
        r22.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r22.setGravity(16);
        r22.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        r22.setClickable(true);
        TextView r10 = new TextView(r26);
        AbstractC0213Ey.m414l(-437631397656629L, r10, 12.0f);
        r10.setTextColor(r26.getColor(R.color.textSummary));
        r10.setPadding(0, 0, AbstractC0295Gu.m616i(8), 0);
        TextView r13 = new TextView(r26);
        AbstractC0213Ey.m414l(-437639987591221L, r13, 14.0f);
        r13.setTextColor(r26.getColor(R.color.textTitle));
        Typeface r15 = Typeface.DEFAULT_BOLD;
        r13.setTypeface(r15);
        r13.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r3 = new TextView(r26);
        AbstractC0213Ey.m414l(-437678642296885L, r3, 12.0f);
        r3.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-437695822166069L)));
        this.f2417i = r3;
        r22.addView(r10);
        r22.addView(r13);
        TextView r32 = this.f2417i;
        if (r32 != null) goto L5;
        AbstractC0295Gu.m625r(-437730181904437L);
        r32 = null;
    L5:
        r22.addView(r32);
        r22.setOnClickListener(new ViewOnClickListenerC2176l5(15, this, r10));
        r82.addView(r22);
        LinearLayout r23 = new LinearLayout(r26);
        r23.setOrientation(1);
        r23.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r23.setVisibility(8);
        r23.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        View r33 = new View(r26);
        LinearLayout.LayoutParams r102 = new LinearLayout.LayoutParams(-1, 1);
        r102.setMargins(0, 0, 0, AbstractC0295Gu.m616i(12));
        r33.setLayoutParams(r102);
        r33.setBackgroundColor(Color.parseColor(AbstractC0295Gu.m625r(-437816081250357L)));
        r23.addView(r33);
        LinearLayout r34 = new LinearLayout(r26);
        r34.setOrientation(0);
        r34.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r34.setGravity(16);
        TextView r103 = new TextView(r26);
        AbstractC0213Ey.m414l(-437850440988725L, r103, 13.0f);
        r103.setTextColor(r26.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r142 = new LinearLayout.LayoutParams(-2, -2);
        r142.setMargins(0, 0, AbstractC0295Gu.m616i(8), 0);
        r103.setLayoutParams(r142);
        r34.addView(r103);
        TextView r104 = new TextView(r26);
        AbstractC0213Ey.m414l(-437867620857909L, r104, 13.0f);
        r104.setTextColor(r26.getColor(R.color.textTitle));
        r104.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f2418j = r104;
        r34.addView(r104);
        r23.addView(r34);
        LinearLayout r35 = new LinearLayout(r26);
        r35.setOrientation(0);
        LinearLayout.LayoutParams r105 = new LinearLayout.LayoutParams(-1, -2);
        r105.setMargins(0, AbstractC0295Gu.m616i(6), 0, 0);
        r35.setLayoutParams(r105);
        r35.setGravity(16);
        TextView r106 = new TextView(r26);
        AbstractC0213Ey.m414l(-438507570985013L, r106, 13.0f);
        r106.setTextColor(r26.getColor(R.color.textSummary));
        LinearLayout.LayoutParams r132 = new LinearLayout.LayoutParams(-2, -2);
        r132.setMargins(0, 0, AbstractC0295Gu.m616i(8), 0);
        r106.setLayoutParams(r132);
        r35.addView(r106);
        TextView r107 = new TextView(r26);
        AbstractC0213Ey.m414l(-438524750854197L, r107, 13.0f);
        r107.setTextColor(r26.getColor(R.color.textTitle));
        r107.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f2419k = r107;
        r35.addView(r107);
        r23.addView(r35);
        LinearLayout r36 = new LinearLayout(r26);
        r36.setOrientation(0);
        LinearLayout.LayoutParams r108 = new LinearLayout.LayoutParams(-1, -2);
        r108.setMargins(0, AbstractC0295Gu.m616i(12), 0, 0);
        r36.setLayoutParams(r108);
        r36.setGravity(17);
        TextView r123 = new TextView(r26);
        r123.setText(AbstractC0295Gu.m625r(-438649304905781L));
        r123.setTextSize(14.0f);
        r123.setTextColor(-1);
        r123.setTypeface(r15);
        r123.setGravity(17);
        GradientDrawable r143 = new GradientDrawable();
        r143.setColor(Color.parseColor(AbstractC0295Gu.m625r(-438679369676853L)));
        r143.setCornerRadius(AbstractC0295Gu.m616i(8));
        r123.setBackground(r143);
        LinearLayout.LayoutParams r144 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        r144.setMargins(0, 0, AbstractC0295Gu.m616i(8), 0);
        r123.setLayoutParams(r144);
        r123.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10));
        r123.setClickable(true);
        r123.setFocusable(true);
        final int r133 = 1;
        r123.setOnClickListener(new ViewOnClickListenerC0419Jp(this, r133));
        this.f2420l = r123;
        r36.addView(r123);
        TextView r109 = new TextView(r26);
        r109.setText(AbstractC0295Gu.m625r(-438245577979957L));
        r109.setTextSize(14.0f);
        r109.setTextColor(-1);
        r109.setTypeface(r15);
        r109.setGravity(17);
        GradientDrawable r124 = new GradientDrawable();
        r124.setColor(Color.parseColor(AbstractC0295Gu.m625r(-438271347783733L)));
        r124.setCornerRadius(AbstractC0295Gu.m616i(8));
        r109.setBackground(r124);
        r109.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        r109.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10));
        r109.setClickable(true);
        r109.setFocusable(true);
        final int r134 = 2;
        r109.setOnClickListener(new ViewOnClickListenerC0419Jp(this, r134));
        r36.addView(r109);
        r23.addView(r36);
        TextView r37 = new TextView(r26);
        AbstractC0213Ey.m414l(-438305707522101L, r37, 11.0f);
        r37.setTextColor(r26.getColor(R.color.colorTextHint));
        LinearLayout.LayoutParams r125 = new LinearLayout.LayoutParams(-1, -2);
        r125.setMargins(0, AbstractC0295Gu.m616i(8), 0, 0);
        r37.setLayoutParams(r125);
        r23.addView(r37);
        this.f2421m = r23;
        r82.addView(r23);
        r6.addView(r82);
        LinearLayout r24 = new LinearLayout(r26);
        r24.setOrientation(1);
        LinearLayout.LayoutParams r38 = new LinearLayout.LayoutParams(-1, -2);
        r38.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r24.setLayoutParams(r38);
        GradientDrawable r39 = new GradientDrawable();
        r39.setColor(r26.getColor(R.color.colorForeground));
        r39.setCornerRadius(AbstractC0295Gu.m616i(12));
        r24.setBackground(r39);
        LinearLayout r310 = new LinearLayout(r26);
        r310.setOrientation(0);
        r310.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r310.setGravity(16);
        r310.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        TextView r83 = new TextView(r26);
        AbstractC0213Ey.m414l(-434783834339381L, r83, 14.0f);
        r83.setTextColor(r26.getColor(R.color.textTitle));
        r83.setTypeface(r15);
        r83.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r310.addView(r83);
        TextView r84 = new TextView(r26);
        AbstractC0213Ey.m414l(-434822489045045L, r84, 12.0f);
        r84.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-434843963881525L)));
        r84.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(4));
        r84.setClickable(true);
        r84.setOnClickListener(new ViewOnClickListenerC2176l5(14, r26, this));
        r310.addView(r84);
        r24.addView(r310);
        LinearLayout r311 = new LinearLayout(r26);
        r311.setOrientation(1);
        r311.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r311.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        this.f2413e = r311;
        TextView r312 = new TextView(r26);
        AbstractC0213Ey.m414l(-434328567806005L, r312, 13.0f);
        r312.setTextColor(r26.getColor(R.color.textSummary));
        r312.setGravity(17);
        r312.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        this.f2414f = r312;
        LinearLayout r313 = this.f2413e;
        if (r313 != null) goto L8;
        AbstractC0295Gu.m625r(-434448826890293L);
        r313 = null;
    L8:
        TextView r85 = this.f2414f;
        if (r85 != null) goto L11;
        AbstractC0295Gu.m625r(-434547611138101L);
        r85 = null;
    L11:
        r313.addView(r85);
        View r314 = this.f2413e;
        if (r314 != null) goto L14;
        AbstractC0295Gu.m625r(-435157496494133L);
        r314 = null;
    L14:
        r24.addView(r314);
        r6.addView(r24);
        LinearLayout r25 = new LinearLayout(r26);
        r25.setOrientation(1);
        LinearLayout.LayoutParams r315 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(280));
        r315.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(0), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r25.setLayoutParams(r315);
        GradientDrawable r316 = new GradientDrawable();
        r316.setColor(r26.getColor(R.color.colorForeground));
        r316.setCornerRadius(AbstractC0295Gu.m616i(12));
        r25.setBackground(r316);
        TextView r317 = new TextView(r26);
        AbstractC0213Ey.m414l(-433405149837365L, r317, 14.0f);
        r317.setTextColor(r26.getColor(R.color.textTitle));
        r317.setTypeface(r15);
        r317.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        r25.addView(r317);
        EditText r318 = new EditText(r26);
        r318.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r318.setGravity(8388659);
        Typeface r86 = Typeface.MONOSPACE;
        r318.setTypeface(r86);
        r318.setTextSize(12.0f);
        r318.setTextColor(r26.getColor(R.color.textTitle));
        r318.setHintTextColor(r26.getColor(R.color.textSummary));
        r318.setHint(AbstractC0295Gu.m625r(-433435214608437L));
        ViewGroup r126 = null;
        r318.setBackground(null);
        r318.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        r318.setHorizontallyScrolling(true);
        r318.setText(((C0634Op) this.f2425q.get(0)).f2031c);
        this.f2410b = r318;
        r25.addView(r318);
        r6.addView(r25);
        LinearLayout r27 = new LinearLayout(r26);
        r27.setOrientation(1);
        LinearLayout.LayoutParams r319 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(200));
        r319.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(0), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        r27.setLayoutParams(r319);
        GradientDrawable r320 = new GradientDrawable();
        r320.setColor(Color.parseColor(AbstractC0295Gu.m625r(-434191128852533L)));
        r320.setCornerRadius(AbstractC0295Gu.m616i(12));
        r27.setBackground(r320);
        LinearLayout r321 = new LinearLayout(r26);
        r321.setOrientation(0);
        r321.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r321.setGravity(16);
        r321.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(6));
        TextView r7 = new TextView(r26);
        AbstractC0213Ey.m414l(-434225488590901L, r7, 13.0f);
        r7.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-434238373492789L)));
        r7.setTypeface(r15);
        r7.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        r321.addView(r7);
        TextView r53 = new TextView(r26);
        AbstractC0213Ey.m414l(-434272733231157L, r53, 12.0f);
        r53.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-434285618133045L)));
        r53.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(4));
        r53.setClickable(true);
        final int r11 = 0;
        r53.setOnClickListener(new ViewOnClickListenerC0419Jp(this, r11));
        r321.addView(r53);
        r27.addView(r321);
        ScrollView r322 = new ScrollView(r26);
        r322.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        r322.setVerticalScrollBarEnabled(true);
        TextView r54 = new TextView(r26);
        r54.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        r54.setTypeface(r86);
        r54.setTextSize(11.0f);
        r54.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-433770222057525L)));
        r54.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        r54.setTextIsSelectable(true);
        this.f2411c = r54;
        r322.addView(r54);
        r27.addView(r322);
        r6.addView(r27);
        r42.addView(r6);
        ViewGroup r28 = this.f2409a;
        if (r28 != null) goto L17;
        AbstractC0295Gu.m625r(-439246305359925L);
    L18:
        r126.addView(r42);
        this.f2416h.post(new RunnableC2260n3(11, this, r26));
        return;
    L17:
        r126 = r28;
        goto L18
    }

    /* JADX INFO: renamed from: g */
    public final void m1560g() {
        LinearLayout r1 = this.f2413e;
        if (r1 != null) goto L5;
        AbstractC0295Gu.m625r(-433529703888949L);
        r1 = null;
    L5:
        r1.removeAllViews();
        List<LoadedScript> r12 = ScriptManager.INSTANCE.getLoadedScripts();
        if (r12.isEmpty() == false) goto L16;
        LinearLayout r13 = this.f2413e;
        if (r13 != null) goto L10;
        AbstractC0295Gu.m625r(-433628488136757L);
        r13 = null;
    L10:
        TextView r3 = this.f2414f;
        if (r3 != null) goto L13;
        AbstractC0295Gu.m625r(-433727272384565L);
        TextView r2 = null;
    L14:
        r13.addView(r2);
        return;
    L13:
        r2 = r3;
        goto L14
    L16:
        Iterator<T> r14 = r12.iterator();
    L18:
        if (r14.hasNext() == false) goto L61;
        LoadedScript r32 = (LoadedScript) r14.next();
        ViewGroup r4 = this.f2413e;
        ViewGroup r42 = r4;
        if (r4 != null) goto L22;
        AbstractC0295Gu.m625r(-433237646112821L);
        r42 = null;
    L22:
        Activity r5 = this.f2415g;
        if (r5 != null) goto L25;
        AbstractC0295Gu.m625r(-433336430360629L);
        r5 = null;
    L25:
        LinearLayout r6 = new LinearLayout(r5);
        r6.setOrientation(0);
        LinearLayout.LayoutParams r8 = new LinearLayout.LayoutParams(-1, -2);
        r8.setMargins(0, AbstractC0295Gu.m616i(8), 0, 0);
        r6.setLayoutParams(r8);
        GradientDrawable r82 = new GradientDrawable();
        r82.setColor(Color.parseColor(AbstractC0295Gu.m625r(-435256280741941L)));
        r82.setCornerRadius(AbstractC0295Gu.m616i(8));
        r6.setBackground(r82);
        r6.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(10));
        r6.setGravity(16);
        ScriptState r22 = r32.getState();
        int[] r122 = AbstractC0677Pp.f2153a;
        int r23 = r122[r22.ordinal()];
        if (r23 == 1) goto L37;
        if (r23 == 2) goto L36;
        if (r23 == 3) goto L35;
        if (r23 == 4) goto L34;
        if (r23 != 5) goto L33;
        String r24 = AbstractC0295Gu.m625r(-434878323619893L);
    L38:
        View r142 = new View(r5);
        LinearLayout.LayoutParams r10 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8));
        r10.setMargins(0, 0, AbstractC0295Gu.m616i(10), 0);
        r142.setLayoutParams(r10);
        GradientDrawable r9 = new GradientDrawable();
        r9.setShape(1);
        r9.setColor(Color.parseColor(r24));
        r142.setBackground(r9);
        r6.addView(r142);
        LinearLayout r25 = new LinearLayout(r5);
        r25.setOrientation(1);
        r25.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView r92 = new TextView(r5);
        r92.setText(r32.getName() + AbstractC0295Gu.m625r(-434912683358261L) + r32.getVersion());
        r92.setTextSize(13.0f);
        r92.setTextColor(-1);
        r92.setTypeface(Typeface.DEFAULT_BOLD);
        r25.addView(r92);
        TextView r93 = new TextView(r5);
        StringBuilder r102 = new StringBuilder();
        r102.append(AbstractC0295Gu.m625r(-434925568260149L));
        r102.append(r32.getAuthor());
        r102.append(AbstractC0295Gu.m625r(-434947043096629L));
        int r123 = r122[r32.getState().ordinal()];
        if (r123 != 1) goto L41;
        String r124 = AbstractC0295Gu.m625r(-435084482050101L);
    L55:
        r102.append(r124);
        r93.setText(r102.toString());
        r93.setTextSize(11.0f);
        r93.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-434964222965813L)));
        r25.addView(r93);
        r6.addView(r25);
        if (r32.getState() != ScriptState.LOADED) goto L58;
    L59:
        TextView r26 = new TextView(r5);
        AbstractC0213Ey.m414l(-434998582704181L, r26, 16.0f);
        r26.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-435007172638773L)));
        r26.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
        r26.setClickable(true);
        r26.setOnClickListener(new ViewOnClickListenerC0591Np(this, r32));
        r6.addView(r26);
    L60:
        TextView r27 = new TextView(r5);
        AbstractC0213Ey.m414l(-435041532377141L, r27, 16.0f);
        r27.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-435050122311733L)));
        r27.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(8));
        r27.setClickable(true);
        r27.setOnClickListener(new ViewOnClickListenerC0591Np(r32, this));
        r6.addView(r27);
        r42.addView(r6);
        goto L18
    L58:
        if (r32.getState() != ScriptState.COMPLETED) goto L60;
    L41:
        if (r123 != 2) goto L43;
        r124 = AbstractC0295Gu.m625r(-435101661919285L);
        goto L55
    L43:
        if (r123 != 3) goto L45;
        r124 = AbstractC0295Gu.m625r(-435131726690357L);
        goto L55
    L45:
        if (r123 != 4) goto L47;
        r124 = AbstractC0295Gu.m625r(-433499639117877L);
        goto L55
    L47:
        if (r123 != 5) goto L50;
        r124 = AbstractC0295Gu.m625r(-433512524019765L);
        goto L55
    L50:
        throw new C0232Fa();
    L33:
        throw new C0232Fa();
    L34:
        r24 = AbstractC0295Gu.m625r(-435393719695413L);
        goto L38
    L35:
        r24 = AbstractC0295Gu.m625r(-435359359957045L);
        goto L38
    L36:
        r24 = AbstractC0295Gu.m625r(-435325000218677L);
        goto L38
    L37:
        r24 = AbstractC0295Gu.m625r(-435290640480309L);
        goto L38
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        LinearLayout r0 = this.f2409a;
        if (r0 != null) goto L6;
        AbstractC0295Gu.m625r(-483076446615605L);
        return null;
    L6:
        return r0;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-483110806353973L);
    }

    /* JADX INFO: renamed from: h */
    public final void m1561h(boolean r6) {
        GradientDrawable r0 = null;
        if (r6 == false) goto L32;
        TextView r62 = this.f2417i;
        if (r62 != null) goto L7;
        AbstractC0295Gu.m625r(-436626375309365L);
        r62 = null;
    L7:
        r62.setText(AbstractC0295Gu.m625r(-436712274655285L));
        TextView r63 = this.f2417i;
        if (r63 != null) goto L10;
        AbstractC0295Gu.m625r(-436729454524469L);
        r63 = null;
    L10:
        r63.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-437365109684277L)));
        TextView r64 = this.f2418j;
        if (r64 != null) goto L13;
        AbstractC0295Gu.m625r(-437399469422645L);
        r64 = null;
    L13:
        CherryDevServer r1 = CherryDevServer.INSTANCE;
        String r2 = r1.getServerUrl();
        if (r2 != null) goto L17;
        r2 = AbstractC0295Gu.m625r(-437472483866677L);
    L17:
        r64.setText(r2);
        TextView r65 = this.f2419k;
        if (r65 != null) goto L20;
        AbstractC0295Gu.m625r(-437502548637749L);
        r65 = null;
    L20:
        r65.setText(r1.getConnectionCount() + AbstractC0295Gu.m625r(-437579858049077L));
        TextView r66 = this.f2420l;
        if (r66 != null) goto L23;
        AbstractC0295Gu.m625r(-437073051908149L);
        r66 = null;
    L23:
        r66.setText(AbstractC0295Gu.m625r(-437154656286773L));
        TextView r67 = this.f2420l;
        if (r67 != null) goto L26;
        AbstractC0295Gu.m625r(-437184721057845L);
        r67 = null;
    L26:
        Drawable r68 = r67.getBackground();
        if ((r68 instanceof GradientDrawable) == false) goto L29;
        r0 = (GradientDrawable) r68;
    L29:
        if (r0 == null) goto L56;
        r0.setColor(Color.parseColor(AbstractC0295Gu.m625r(-437266325436469L)));
        return;
    L56:
        return;
    L32:
        TextView r69 = this.f2417i;
        if (r69 != null) goto L35;
        AbstractC0295Gu.m625r(-437300685174837L);
        r69 = null;
    L35:
        r69.setText(AbstractC0295Gu.m625r(-435737317079093L));
        TextView r610 = this.f2417i;
        if (r610 != null) goto L38;
        AbstractC0295Gu.m625r(-435754496948277L);
        r610 = null;
    L38:
        r610.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-435840396294197L)));
        TextView r611 = this.f2418j;
        if (r611 != null) goto L41;
        AbstractC0295Gu.m625r(-435874756032565L);
        r611 = null;
    L41:
        r611.setText(AbstractC0295Gu.m625r(-435947770476597L));
        TextView r612 = this.f2419k;
        if (r612 != null) goto L44;
        AbstractC0295Gu.m625r(-435415194531893L);
        r612 = null;
    L44:
        r612.setText(AbstractC0295Gu.m625r(-435492503943221L));
        TextView r613 = this.f2420l;
        if (r613 != null) goto L47;
        AbstractC0295Gu.m625r(-435539748583477L);
        r613 = null;
    L47:
        r613.setText(AbstractC0295Gu.m625r(-435621352962101L));
        TextView r614 = this.f2420l;
        if (r614 != null) goto L50;
        AbstractC0295Gu.m625r(-435651417733173L);
        r614 = null;
    L50:
        Drawable r615 = r614.getBackground();
        if ((r615 instanceof GradientDrawable) == false) goto L53;
        r0 = (GradientDrawable) r615;
    L53:
        if (r0 == null) goto L57;
        r0.setColor(Color.parseColor(AbstractC0295Gu.m625r(-436282777925685L)));
        return;
    }

    @Override // io.github.cherrywechat.lua.loader.ScriptStateListener
    public final void onScriptStateChanged(LoadedScript r3) {
        AbstractC0295Gu.m625r(-482969072433205L);
        RunnableC0562N2 r32 = new RunnableC0562N2(18, this);
        this.f2416h.post(r32);
    }
}
