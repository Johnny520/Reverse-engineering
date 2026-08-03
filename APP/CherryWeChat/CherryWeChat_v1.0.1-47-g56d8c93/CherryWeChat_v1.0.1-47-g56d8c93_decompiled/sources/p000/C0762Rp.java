package p000;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import io.github.cherrywechat.R;
import io.github.cherrywechat.lua.LuaEngine;
import io.github.cherrywechat.lua.api.CherryGlobalAPI;
import io.github.cherrywechat.lua.dev.CherryDevServer;
import io.github.cherrywechat.lua.loader.LoadedScript;
import io.github.cherrywechat.lua.loader.ScriptManager;
import io.github.cherrywechat.lua.loader.ScriptState;
import io.github.cherrywechat.lua.loader.ScriptStateListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
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
    public final Handler f2416h = new Handler(Looper.getMainLooper());

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
        C1498hd c1498hd = AbstractC1499he.f5282a;
        C2283nk c2283nk = AbstractC1106Zp.f3500a;
        C0343Hz c0343Hz = new C0343Hz();
        c2283nk.getClass();
        this.f2424p = AbstractC0671Pj.m1343a(AbstractC1406fG.m2700Z(c2283nk, c0343Hz));
        this.f2425q = AbstractC2496sa.m4977b0(new C0634Op(AbstractC0295Gu.m625r(-129184026327093L), AbstractC0295Gu.m625r(-128685810120757L), AbstractC0295Gu.m625r(-128707284957237L)), new C0634Op(AbstractC0295Gu.m625r(-129338645149749L), AbstractC0295Gu.m625r(-129377299855413L), AbstractC0295Gu.m625r(-129433134430261L)), new C0634Op(AbstractC0295Gu.m625r(-127461744441397L), AbstractC0295Gu.m625r(-127483219277877L), AbstractC0295Gu.m625r(-127023657777205L)), new C0634Op(AbstractC0295Gu.m625r(-125271311120437L), AbstractC0295Gu.m625r(-125301375891509L), AbstractC0295Gu.m625r(-124841814390837L)), new C0634Op(AbstractC0295Gu.m625r(-139912854632501L), AbstractC0295Gu.m625r(-140496970184757L), AbstractC0295Gu.m625r(-140591459465269L)), new C0634Op(AbstractC0295Gu.m625r(-137640816932917L), AbstractC0295Gu.m625r(-137662291769397L), AbstractC0295Gu.m625r(-138293651961909L)), new C0634Op(AbstractC0295Gu.m625r(-136262132430901L), AbstractC0295Gu.m625r(-136313672038453L), AbstractC0295Gu.m625r(-135854110537781L)), new C0634Op(AbstractC0295Gu.m625r(-132881993168949L), AbstractC0295Gu.m625r(-132907762972725L), AbstractC0295Gu.m625r(-132989367351349L)), new C0634Op(AbstractC0295Gu.m625r(-108044197296181L), AbstractC0295Gu.m625r(-108074262067253L), AbstractC0295Gu.m625r(-108164456380469L)), new C0634Op(AbstractC0295Gu.m625r(-121143847548981L), AbstractC0295Gu.m625r(-121186797221941L), AbstractC0295Gu.m625r(-121822452381749L)), new C0634Op(AbstractC0295Gu.m625r(-443511207884853L), AbstractC0295Gu.m625r(-443545567623221L), AbstractC0295Gu.m625r(-443592812263477L)), new C0634Op(AbstractC0295Gu.m625r(-454051057629237L), AbstractC0295Gu.m625r(-454081122400309L), AbstractC0295Gu.m625r(-453578611226677L)));
    }

    /* JADX INFO: renamed from: e */
    public static TextView m1557e(Activity activity, String str, int i, InterfaceC0884Ui interfaceC0884Ui) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(8));
        textView.setBackground(gradientDrawable);
        textView.setPadding(AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(14), AbstractC0295Gu.m616i(8));
        textView.setClickable(true);
        textView.setFocusable(true);
        textView.setOnClickListener(new ViewOnClickListenerC0462Kp(0, interfaceC0884Ui));
        return textView;
    }

    /* JADX INFO: renamed from: f */
    public static View m1558f(Activity activity) {
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(8), 0));
        return view;
    }

    /* JADX INFO: renamed from: a */
    public final void m1559a(String str) {
        TextView textView = this.f2411c;
        if (textView != null) {
            textView.append(str);
            TextView textView2 = this.f2411c;
            if (textView2 == null) {
                AbstractC0295Gu.m625r(-431682867951669L);
                textView2 = null;
            }
            ViewParent parent = textView2.getParent();
            ScrollView scrollView = parent instanceof ScrollView ? (ScrollView) parent : null;
            if (scrollView != null) {
                scrollView.post(new RunnableC0562N2(17, scrollView));
            }
        }
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: b */
    public final void mo1337b() {
        AbstractC0295Gu.m625r(-482999137204277L);
        C0104Cb c0104Cb = this.f2424p;
        InterfaceC1332dm interfaceC1332dm = (InterfaceC1332dm) c0104Cb.f248a.mo24m(C1456gf.f5162f);
        if (interfaceC1332dm == null) {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + c0104Cb).toString());
        }
        interfaceC1332dm.mo1749r(null);
        ScriptManager.INSTANCE.removeStateListener(this);
        CherryGlobalAPI.INSTANCE.setPrintListener(null);
        Handler handler = this.f2422n;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f2422n = null;
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: c */
    public final void mo1338c(Activity activity, int i, int i2, Intent intent) {
        Uri data;
        int columnIndex;
        AbstractC0295Gu.m625r(-483037791909941L);
        if (i != 1001 || i2 != -1 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        try {
            String strM625r = AbstractC0295Gu.m625r(-432327113046069L);
            Activity activity2 = this.f2415g;
            Activity activity3 = null;
            if (activity2 == null) {
                AbstractC0295Gu.m625r(-432374357686325L);
                activity2 = null;
            }
            Cursor cursorQuery = activity2.getContentResolver().query(data, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex(AbstractC0295Gu.m625r(-432992832976949L))) >= 0) {
                        strM625r = cursorQuery.getString(columnIndex);
                        AbstractC0295Gu.m625r(-433052962519093L);
                    }
                    cursorQuery.close();
                } finally {
                }
            }
            if (!AbstractC0085Bz.m132J(strM625r, false, AbstractC0295Gu.m625r(-433117387028533L))) {
                m1559a(AbstractC0295Gu.m625r(-433138861865013L));
                Activity activity4 = this.f2415g;
                if (activity4 == null) {
                    AbstractC0295Gu.m625r(-432666415462453L);
                } else {
                    activity3 = activity4;
                }
                Toast.makeText(activity3, AbstractC0295Gu.m625r(-432735134939189L), 0).show();
                return;
            }
            Activity activity5 = this.f2415g;
            if (activity5 == null) {
                AbstractC0295Gu.m625r(-432786674546741L);
                activity5 = null;
            }
            File file = new File(activity5.getFilesDir(), AbstractC0295Gu.m625r(-432855394023477L));
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, strM625r);
            Activity activity6 = this.f2415g;
            if (activity6 == null) {
                AbstractC0295Gu.m625r(-432906933631029L);
                activity6 = null;
            }
            InputStream inputStreamOpenInputStream = activity6.getContentResolver().openInputStream(data);
            if (inputStreamOpenInputStream != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        AbstractC1293cr.m2555p(inputStreamOpenInputStream, fileOutputStream);
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                    } finally {
                    }
                } finally {
                }
            }
            m1559a(AbstractC0295Gu.m625r(-431326385666101L) + file2.getAbsolutePath() + '\n');
            ScriptManager scriptManager = ScriptManager.INSTANCE;
            Activity activity7 = this.f2415g;
            if (activity7 == null) {
                AbstractC0295Gu.m625r(-431382220240949L);
            } else {
                activity3 = activity7;
            }
            LoadedScript loadedScriptLoadScript = scriptManager.loadScript(activity3, file2, false);
            if (loadedScriptLoadScript == null) {
                m1559a(AbstractC0295Gu.m625r(-431081572530229L));
                return;
            }
            m1559a(AbstractC0295Gu.m625r(-431450939717685L) + loadedScriptLoadScript.getName() + AbstractC0295Gu.m625r(-431506774292533L) + loadedScriptLoadScript.getVersion() + '\n');
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-431519659194421L));
            sb.append(loadedScriptLoadScript.getAuthor());
            sb.append('\n');
            m1559a(sb.toString());
            if (loadedScriptLoadScript.getDescription().length() > 0) {
                m1559a(AbstractC0295Gu.m625r(-431025737955381L) + loadedScriptLoadScript.getDescription() + '\n');
            }
            m1560g();
        } catch (Exception e) {
            m1559a(AbstractC0295Gu.m625r(-431137407105077L) + e.getMessage() + '\n');
        }
    }

    @Override // p000.InterfaceC0972Wk
    /* JADX INFO: renamed from: d */
    public final void mo1339d(Activity activity) {
        AbstractC0295Gu.m625r(-439207650654261L);
        this.f2415g = activity;
        ScriptManager.INSTANCE.addStateListener(this);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setBackgroundColor(activity.getColor(R.color.colorBackground));
        this.f2409a = linearLayout;
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        scrollView.setFillViewport(true);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        linearLayout3.setGravity(16);
        final int i = 1;
        linearLayout3.addView(m1557e(activity, AbstractC0295Gu.m625r(-437996469876789L), activity.getColor(R.color.colorPrimary), new InterfaceC0884Ui(this) { // from class: Hp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0762Rp f1138b;

            {
                this.f1138b = this;
            }

            @Override // p000.InterfaceC0884Ui
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                String string;
                boolean zIsInitialized;
                int i2 = i;
                C0829TC c0829tc = C0829TC.f2620a;
                EditText editText = null;
                Activity activity2 = null;
                C0762Rp c0762Rp = this.f1138b;
                switch (i2) {
                    case 0:
                        EditText editText2 = c0762Rp.f2410b;
                        if (editText2 == null) {
                            AbstractC0295Gu.m625r(-483149461059637L);
                        } else {
                            editText = editText2;
                        }
                        editText.setText(AbstractC0295Gu.m625r(-483196705699893L));
                        TextView textView = c0762Rp.f2411c;
                        if (textView != null) {
                            textView.setText(AbstractC0295Gu.m625r(-431777357232181L));
                        }
                        break;
                    case 1:
                        EditText editText3 = c0762Rp.f2410b;
                        if (editText3 == null) {
                            AbstractC0295Gu.m625r(-431270551091253L);
                            editText3 = null;
                        }
                        Editable text = editText3.getText();
                        if (text != null && (string = text.toString()) != null) {
                            if (!AbstractC2564tz.m5059T(string)) {
                                try {
                                    zIsInitialized = LuaEngine.INSTANCE.isInitialized();
                                } catch (Exception unused) {
                                    zIsInitialized = false;
                                }
                                if (!zIsInitialized) {
                                    c0762Rp.m1559a(AbstractC0295Gu.m625r(-431919091152949L));
                                } else {
                                    CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
                                    Activity activity3 = c0762Rp.f2415g;
                                    if (activity3 == null) {
                                        AbstractC0295Gu.m625r(-431992105596981L);
                                        activity3 = null;
                                    }
                                    cherryGlobalAPI.setCurrentActivity(activity3);
                                    Activity activity4 = c0762Rp.f2415g;
                                    if (activity4 == null) {
                                        AbstractC0295Gu.m625r(-432060825073717L);
                                        activity4 = null;
                                    }
                                    cherryGlobalAPI.setCurrentContext(activity4.getApplicationContext());
                                    cherryGlobalAPI.setPrintListener(new C0376Ip(c0762Rp, 1));
                                    c0762Rp.m1559a(AbstractC0295Gu.m625r(-431579788736565L));
                                    C0104Cb c0104Cb = c0762Rp.f2424p;
                                    C1498hd c1498hd = AbstractC1499he.f5282a;
                                    ExecutorC0921Vc executorC0921Vc = ExecutorC0921Vc.f2876b;
                                    AbstractC0585Nj.m1128G(c0104Cb, new C2297ny(string, c0762Rp, (InterfaceC0190Eb) null), 2);
                                }
                            } else {
                                c0762Rp.m1559a(AbstractC0295Gu.m625r(-431867551545397L));
                            }
                        }
                        break;
                    default:
                        c0762Rp.getClass();
                        Intent intent = new Intent(AbstractC0295Gu.m625r(-433851826436149L));
                        intent.addCategory(AbstractC0295Gu.m625r(-434006445258805L));
                        intent.setType(AbstractC0295Gu.m625r(-432498911737909L));
                        intent.putExtra(AbstractC0295Gu.m625r(-432516091607093L), new String[]{AbstractC0295Gu.m625r(-432653530560565L), AbstractC0295Gu.m625r(-432151019386933L)});
                        Activity activity5 = c0762Rp.f2415g;
                        if (activity5 == null) {
                            AbstractC0295Gu.m625r(-432258393569333L);
                        } else {
                            activity2 = activity5;
                        }
                        activity2.startActivityForResult(intent, 1001);
                        break;
                }
                return c0829tc;
            }
        }));
        linearLayout3.addView(m1558f(activity));
        final int i2 = 2;
        linearLayout3.addView(m1557e(activity, AbstractC0295Gu.m625r(-438017944713269L), activity.getColor(R.color.colorSuccess), new InterfaceC0884Ui(this) { // from class: Hp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0762Rp f1138b;

            {
                this.f1138b = this;
            }

            @Override // p000.InterfaceC0884Ui
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                String string;
                boolean zIsInitialized;
                int i22 = i2;
                C0829TC c0829tc = C0829TC.f2620a;
                EditText editText = null;
                Activity activity2 = null;
                C0762Rp c0762Rp = this.f1138b;
                switch (i22) {
                    case 0:
                        EditText editText2 = c0762Rp.f2410b;
                        if (editText2 == null) {
                            AbstractC0295Gu.m625r(-483149461059637L);
                        } else {
                            editText = editText2;
                        }
                        editText.setText(AbstractC0295Gu.m625r(-483196705699893L));
                        TextView textView = c0762Rp.f2411c;
                        if (textView != null) {
                            textView.setText(AbstractC0295Gu.m625r(-431777357232181L));
                        }
                        break;
                    case 1:
                        EditText editText3 = c0762Rp.f2410b;
                        if (editText3 == null) {
                            AbstractC0295Gu.m625r(-431270551091253L);
                            editText3 = null;
                        }
                        Editable text = editText3.getText();
                        if (text != null && (string = text.toString()) != null) {
                            if (!AbstractC2564tz.m5059T(string)) {
                                try {
                                    zIsInitialized = LuaEngine.INSTANCE.isInitialized();
                                } catch (Exception unused) {
                                    zIsInitialized = false;
                                }
                                if (!zIsInitialized) {
                                    c0762Rp.m1559a(AbstractC0295Gu.m625r(-431919091152949L));
                                } else {
                                    CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
                                    Activity activity3 = c0762Rp.f2415g;
                                    if (activity3 == null) {
                                        AbstractC0295Gu.m625r(-431992105596981L);
                                        activity3 = null;
                                    }
                                    cherryGlobalAPI.setCurrentActivity(activity3);
                                    Activity activity4 = c0762Rp.f2415g;
                                    if (activity4 == null) {
                                        AbstractC0295Gu.m625r(-432060825073717L);
                                        activity4 = null;
                                    }
                                    cherryGlobalAPI.setCurrentContext(activity4.getApplicationContext());
                                    cherryGlobalAPI.setPrintListener(new C0376Ip(c0762Rp, 1));
                                    c0762Rp.m1559a(AbstractC0295Gu.m625r(-431579788736565L));
                                    C0104Cb c0104Cb = c0762Rp.f2424p;
                                    C1498hd c1498hd = AbstractC1499he.f5282a;
                                    ExecutorC0921Vc executorC0921Vc = ExecutorC0921Vc.f2876b;
                                    AbstractC0585Nj.m1128G(c0104Cb, new C2297ny(string, c0762Rp, (InterfaceC0190Eb) null), 2);
                                }
                            } else {
                                c0762Rp.m1559a(AbstractC0295Gu.m625r(-431867551545397L));
                            }
                        }
                        break;
                    default:
                        c0762Rp.getClass();
                        Intent intent = new Intent(AbstractC0295Gu.m625r(-433851826436149L));
                        intent.addCategory(AbstractC0295Gu.m625r(-434006445258805L));
                        intent.setType(AbstractC0295Gu.m625r(-432498911737909L));
                        intent.putExtra(AbstractC0295Gu.m625r(-432516091607093L), new String[]{AbstractC0295Gu.m625r(-432653530560565L), AbstractC0295Gu.m625r(-432151019386933L)});
                        Activity activity5 = c0762Rp.f2415g;
                        if (activity5 == null) {
                            AbstractC0295Gu.m625r(-432258393569333L);
                        } else {
                            activity2 = activity5;
                        }
                        activity2.startActivityForResult(intent, 1001);
                        break;
                }
                return c0829tc;
            }
        }));
        linearLayout3.addView(m1558f(activity));
        linearLayout3.addView(m1557e(activity, AbstractC0295Gu.m625r(-438043714517045L), activity.getColor(R.color.colorInfo), new C1389f(6, this, activity)));
        linearLayout3.addView(m1558f(activity));
        final int i3 = 0;
        linearLayout3.addView(m1557e(activity, AbstractC0295Gu.m625r(-438056599418933L), activity.getColor(R.color.colorWarning), new InterfaceC0884Ui(this) { // from class: Hp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0762Rp f1138b;

            {
                this.f1138b = this;
            }

            @Override // p000.InterfaceC0884Ui
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                String string;
                boolean zIsInitialized;
                int i22 = i3;
                C0829TC c0829tc = C0829TC.f2620a;
                EditText editText = null;
                Activity activity2 = null;
                C0762Rp c0762Rp = this.f1138b;
                switch (i22) {
                    case 0:
                        EditText editText2 = c0762Rp.f2410b;
                        if (editText2 == null) {
                            AbstractC0295Gu.m625r(-483149461059637L);
                        } else {
                            editText = editText2;
                        }
                        editText.setText(AbstractC0295Gu.m625r(-483196705699893L));
                        TextView textView = c0762Rp.f2411c;
                        if (textView != null) {
                            textView.setText(AbstractC0295Gu.m625r(-431777357232181L));
                        }
                        break;
                    case 1:
                        EditText editText3 = c0762Rp.f2410b;
                        if (editText3 == null) {
                            AbstractC0295Gu.m625r(-431270551091253L);
                            editText3 = null;
                        }
                        Editable text = editText3.getText();
                        if (text != null && (string = text.toString()) != null) {
                            if (!AbstractC2564tz.m5059T(string)) {
                                try {
                                    zIsInitialized = LuaEngine.INSTANCE.isInitialized();
                                } catch (Exception unused) {
                                    zIsInitialized = false;
                                }
                                if (!zIsInitialized) {
                                    c0762Rp.m1559a(AbstractC0295Gu.m625r(-431919091152949L));
                                } else {
                                    CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
                                    Activity activity3 = c0762Rp.f2415g;
                                    if (activity3 == null) {
                                        AbstractC0295Gu.m625r(-431992105596981L);
                                        activity3 = null;
                                    }
                                    cherryGlobalAPI.setCurrentActivity(activity3);
                                    Activity activity4 = c0762Rp.f2415g;
                                    if (activity4 == null) {
                                        AbstractC0295Gu.m625r(-432060825073717L);
                                        activity4 = null;
                                    }
                                    cherryGlobalAPI.setCurrentContext(activity4.getApplicationContext());
                                    cherryGlobalAPI.setPrintListener(new C0376Ip(c0762Rp, 1));
                                    c0762Rp.m1559a(AbstractC0295Gu.m625r(-431579788736565L));
                                    C0104Cb c0104Cb = c0762Rp.f2424p;
                                    C1498hd c1498hd = AbstractC1499he.f5282a;
                                    ExecutorC0921Vc executorC0921Vc = ExecutorC0921Vc.f2876b;
                                    AbstractC0585Nj.m1128G(c0104Cb, new C2297ny(string, c0762Rp, (InterfaceC0190Eb) null), 2);
                                }
                            } else {
                                c0762Rp.m1559a(AbstractC0295Gu.m625r(-431867551545397L));
                            }
                        }
                        break;
                    default:
                        c0762Rp.getClass();
                        Intent intent = new Intent(AbstractC0295Gu.m625r(-433851826436149L));
                        intent.addCategory(AbstractC0295Gu.m625r(-434006445258805L));
                        intent.setType(AbstractC0295Gu.m625r(-432498911737909L));
                        intent.putExtra(AbstractC0295Gu.m625r(-432516091607093L), new String[]{AbstractC0295Gu.m625r(-432653530560565L), AbstractC0295Gu.m625r(-432151019386933L)});
                        Activity activity5 = c0762Rp.f2415g;
                        if (activity5 == null) {
                            AbstractC0295Gu.m625r(-432258393569333L);
                        } else {
                            activity2 = activity5;
                        }
                        activity2.startActivityForResult(intent, 1001);
                        break;
                }
                return c0829tc;
            }
        }));
        View view = new View(activity);
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        linearLayout3.addView(view);
        TextView textView = new TextView(activity);
        AbstractC0213Ey.m414l(-438069484320821L, textView, 12.0f);
        textView.setTextColor(activity.getColor(R.color.colorWarning));
        this.f2412d = textView;
        linearLayout3.addView(textView);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(activity);
        linearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), 0);
        linearLayout4.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(activity.getColor(R.color.colorForeground));
        gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(12));
        linearLayout4.setBackground(gradientDrawable);
        LinearLayout linearLayout5 = new LinearLayout(activity);
        linearLayout5.setOrientation(0);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout5.setGravity(16);
        linearLayout5.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        linearLayout5.setClickable(true);
        TextView textView2 = new TextView(activity);
        AbstractC0213Ey.m414l(-437631397656629L, textView2, 12.0f);
        textView2.setTextColor(activity.getColor(R.color.textSummary));
        textView2.setPadding(0, 0, AbstractC0295Gu.m616i(8), 0);
        TextView textView3 = new TextView(activity);
        AbstractC0213Ey.m414l(-437639987591221L, textView3, 14.0f);
        textView3.setTextColor(activity.getColor(R.color.textTitle));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView3.setTypeface(typeface);
        textView3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView4 = new TextView(activity);
        AbstractC0213Ey.m414l(-437678642296885L, textView4, 12.0f);
        textView4.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-437695822166069L)));
        this.f2417i = textView4;
        linearLayout5.addView(textView2);
        linearLayout5.addView(textView3);
        TextView textView5 = this.f2417i;
        if (textView5 == null) {
            AbstractC0295Gu.m625r(-437730181904437L);
            textView5 = null;
        }
        linearLayout5.addView(textView5);
        linearLayout5.setOnClickListener(new ViewOnClickListenerC2176l5(15, this, textView2));
        linearLayout4.addView(linearLayout5);
        LinearLayout linearLayout6 = new LinearLayout(activity);
        linearLayout6.setOrientation(1);
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout6.setVisibility(8);
        linearLayout6.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        View view2 = new View(activity);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams2.setMargins(0, 0, 0, AbstractC0295Gu.m616i(12));
        view2.setLayoutParams(layoutParams2);
        view2.setBackgroundColor(Color.parseColor(AbstractC0295Gu.m625r(-437816081250357L)));
        linearLayout6.addView(view2);
        LinearLayout linearLayout7 = new LinearLayout(activity);
        linearLayout7.setOrientation(0);
        linearLayout7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout7.setGravity(16);
        TextView textView6 = new TextView(activity);
        AbstractC0213Ey.m414l(-437850440988725L, textView6, 13.0f);
        textView6.setTextColor(activity.getColor(R.color.textSummary));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(0, 0, AbstractC0295Gu.m616i(8), 0);
        textView6.setLayoutParams(layoutParams3);
        linearLayout7.addView(textView6);
        TextView textView7 = new TextView(activity);
        AbstractC0213Ey.m414l(-437867620857909L, textView7, 13.0f);
        textView7.setTextColor(activity.getColor(R.color.textTitle));
        textView7.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f2418j = textView7;
        linearLayout7.addView(textView7);
        linearLayout6.addView(linearLayout7);
        LinearLayout linearLayout8 = new LinearLayout(activity);
        linearLayout8.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(0, AbstractC0295Gu.m616i(6), 0, 0);
        linearLayout8.setLayoutParams(layoutParams4);
        linearLayout8.setGravity(16);
        TextView textView8 = new TextView(activity);
        AbstractC0213Ey.m414l(-438507570985013L, textView8, 13.0f);
        textView8.setTextColor(activity.getColor(R.color.textSummary));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.setMargins(0, 0, AbstractC0295Gu.m616i(8), 0);
        textView8.setLayoutParams(layoutParams5);
        linearLayout8.addView(textView8);
        TextView textView9 = new TextView(activity);
        AbstractC0213Ey.m414l(-438524750854197L, textView9, 13.0f);
        textView9.setTextColor(activity.getColor(R.color.textTitle));
        textView9.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f2419k = textView9;
        linearLayout8.addView(textView9);
        linearLayout6.addView(linearLayout8);
        LinearLayout linearLayout9 = new LinearLayout(activity);
        linearLayout9.setOrientation(0);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.setMargins(0, AbstractC0295Gu.m616i(12), 0, 0);
        linearLayout9.setLayoutParams(layoutParams6);
        linearLayout9.setGravity(17);
        TextView textView10 = new TextView(activity);
        textView10.setText(AbstractC0295Gu.m625r(-438649304905781L));
        textView10.setTextSize(14.0f);
        textView10.setTextColor(-1);
        textView10.setTypeface(typeface);
        textView10.setGravity(17);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(Color.parseColor(AbstractC0295Gu.m625r(-438679369676853L)));
        gradientDrawable2.setCornerRadius(AbstractC0295Gu.m616i(8));
        textView10.setBackground(gradientDrawable2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams7.setMargins(0, 0, AbstractC0295Gu.m616i(8), 0);
        textView10.setLayoutParams(layoutParams7);
        textView10.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10));
        textView10.setClickable(true);
        textView10.setFocusable(true);
        final int i4 = 1;
        textView10.setOnClickListener(new View.OnClickListener(this) { // from class: Jp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0762Rp f1400b;

            {
                this.f1400b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i4) {
                    case 0:
                        TextView textView11 = this.f1400b.f2411c;
                        if (textView11 != null) {
                            textView11.setText(AbstractC0295Gu.m625r(-431777357232181L));
                        }
                        break;
                    case 1:
                        CherryDevServer cherryDevServer = CherryDevServer.INSTANCE;
                        boolean zIsRunning = cherryDevServer.isRunning();
                        C0762Rp c0762Rp = this.f1400b;
                        if (!zIsRunning) {
                            Activity activity2 = c0762Rp.f2415g;
                            if (activity2 == null) {
                                AbstractC0295Gu.m625r(-436969972693045L);
                                activity2 = null;
                            }
                            if (!CherryDevServer.start$default(cherryDevServer, activity2, 0, 2, null)) {
                                c0762Rp.m1559a(AbstractC0295Gu.m625r(-436557655832629L));
                            } else {
                                c0762Rp.m1561h(true);
                                Handler handler = new Handler(Looper.getMainLooper());
                                c0762Rp.f2422n = handler;
                                handler.postDelayed(new RunnableC0431K0(11, c0762Rp), 2000L);
                                c0762Rp.m1559a(AbstractC0295Gu.m625r(-437038692169781L) + cherryDevServer.getServerUrl() + '\n');
                            }
                        } else {
                            cherryDevServer.stop();
                            Handler handler2 = c0762Rp.f2422n;
                            if (handler2 != null) {
                                handler2.removeCallbacksAndMessages(null);
                            }
                            c0762Rp.f2422n = null;
                            c0762Rp.m1561h(false);
                            c0762Rp.m1559a(AbstractC0295Gu.m625r(-436905548183605L));
                        }
                        break;
                    default:
                        C0762Rp c0762Rp2 = this.f1400b;
                        c0762Rp2.getClass();
                        String serverUrl = CherryDevServer.INSTANCE.getServerUrl();
                        Activity activity3 = null;
                        if (serverUrl == null) {
                            Activity activity4 = c0762Rp2.f2415g;
                            if (activity4 == null) {
                                AbstractC0295Gu.m625r(-434685050091573L);
                            } else {
                                activity3 = activity4;
                            }
                            Toast.makeText(activity3, AbstractC0295Gu.m625r(-434753769568309L), 0).show();
                        } else {
                            Activity activity5 = c0762Rp2.f2415g;
                            if (activity5 == null) {
                                AbstractC0295Gu.m625r(-436317137664053L);
                                activity5 = null;
                            }
                            Object systemService = activity5.getSystemService(AbstractC0295Gu.m625r(-436385857140789L));
                            AbstractC0295Gu.m625r(-436428806813749L);
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-436179698710581L), serverUrl));
                            Activity activity6 = c0762Rp2.f2415g;
                            if (activity6 == null) {
                                AbstractC0295Gu.m625r(-434590560811061L);
                            } else {
                                activity3 = activity6;
                            }
                            Toast.makeText(activity3, AbstractC0295Gu.m625r(-434659280287797L).concat(serverUrl), 0).show();
                        }
                        break;
                }
            }
        });
        this.f2420l = textView10;
        linearLayout9.addView(textView10);
        TextView textView11 = new TextView(activity);
        textView11.setText(AbstractC0295Gu.m625r(-438245577979957L));
        textView11.setTextSize(14.0f);
        textView11.setTextColor(-1);
        textView11.setTypeface(typeface);
        textView11.setGravity(17);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(Color.parseColor(AbstractC0295Gu.m625r(-438271347783733L)));
        gradientDrawable3.setCornerRadius(AbstractC0295Gu.m616i(8));
        textView11.setBackground(gradientDrawable3);
        textView11.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView11.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10));
        textView11.setClickable(true);
        textView11.setFocusable(true);
        final int i5 = 2;
        textView11.setOnClickListener(new View.OnClickListener(this) { // from class: Jp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0762Rp f1400b;

            {
                this.f1400b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                switch (i5) {
                    case 0:
                        TextView textView112 = this.f1400b.f2411c;
                        if (textView112 != null) {
                            textView112.setText(AbstractC0295Gu.m625r(-431777357232181L));
                        }
                        break;
                    case 1:
                        CherryDevServer cherryDevServer = CherryDevServer.INSTANCE;
                        boolean zIsRunning = cherryDevServer.isRunning();
                        C0762Rp c0762Rp = this.f1400b;
                        if (!zIsRunning) {
                            Activity activity2 = c0762Rp.f2415g;
                            if (activity2 == null) {
                                AbstractC0295Gu.m625r(-436969972693045L);
                                activity2 = null;
                            }
                            if (!CherryDevServer.start$default(cherryDevServer, activity2, 0, 2, null)) {
                                c0762Rp.m1559a(AbstractC0295Gu.m625r(-436557655832629L));
                            } else {
                                c0762Rp.m1561h(true);
                                Handler handler = new Handler(Looper.getMainLooper());
                                c0762Rp.f2422n = handler;
                                handler.postDelayed(new RunnableC0431K0(11, c0762Rp), 2000L);
                                c0762Rp.m1559a(AbstractC0295Gu.m625r(-437038692169781L) + cherryDevServer.getServerUrl() + '\n');
                            }
                        } else {
                            cherryDevServer.stop();
                            Handler handler2 = c0762Rp.f2422n;
                            if (handler2 != null) {
                                handler2.removeCallbacksAndMessages(null);
                            }
                            c0762Rp.f2422n = null;
                            c0762Rp.m1561h(false);
                            c0762Rp.m1559a(AbstractC0295Gu.m625r(-436905548183605L));
                        }
                        break;
                    default:
                        C0762Rp c0762Rp2 = this.f1400b;
                        c0762Rp2.getClass();
                        String serverUrl = CherryDevServer.INSTANCE.getServerUrl();
                        Activity activity3 = null;
                        if (serverUrl == null) {
                            Activity activity4 = c0762Rp2.f2415g;
                            if (activity4 == null) {
                                AbstractC0295Gu.m625r(-434685050091573L);
                            } else {
                                activity3 = activity4;
                            }
                            Toast.makeText(activity3, AbstractC0295Gu.m625r(-434753769568309L), 0).show();
                        } else {
                            Activity activity5 = c0762Rp2.f2415g;
                            if (activity5 == null) {
                                AbstractC0295Gu.m625r(-436317137664053L);
                                activity5 = null;
                            }
                            Object systemService = activity5.getSystemService(AbstractC0295Gu.m625r(-436385857140789L));
                            AbstractC0295Gu.m625r(-436428806813749L);
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-436179698710581L), serverUrl));
                            Activity activity6 = c0762Rp2.f2415g;
                            if (activity6 == null) {
                                AbstractC0295Gu.m625r(-434590560811061L);
                            } else {
                                activity3 = activity6;
                            }
                            Toast.makeText(activity3, AbstractC0295Gu.m625r(-434659280287797L).concat(serverUrl), 0).show();
                        }
                        break;
                }
            }
        });
        linearLayout9.addView(textView11);
        linearLayout6.addView(linearLayout9);
        TextView textView12 = new TextView(activity);
        AbstractC0213Ey.m414l(-438305707522101L, textView12, 11.0f);
        textView12.setTextColor(activity.getColor(R.color.colorTextHint));
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.setMargins(0, AbstractC0295Gu.m616i(8), 0, 0);
        textView12.setLayoutParams(layoutParams8);
        linearLayout6.addView(textView12);
        this.f2421m = linearLayout6;
        linearLayout4.addView(linearLayout6);
        linearLayout2.addView(linearLayout4);
        LinearLayout linearLayout10 = new LinearLayout(activity);
        linearLayout10.setOrientation(1);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams9.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        linearLayout10.setLayoutParams(layoutParams9);
        GradientDrawable gradientDrawable4 = new GradientDrawable();
        gradientDrawable4.setColor(activity.getColor(R.color.colorForeground));
        gradientDrawable4.setCornerRadius(AbstractC0295Gu.m616i(12));
        linearLayout10.setBackground(gradientDrawable4);
        LinearLayout linearLayout11 = new LinearLayout(activity);
        linearLayout11.setOrientation(0);
        linearLayout11.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout11.setGravity(16);
        linearLayout11.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        TextView textView13 = new TextView(activity);
        AbstractC0213Ey.m414l(-434783834339381L, textView13, 14.0f);
        textView13.setTextColor(activity.getColor(R.color.textTitle));
        textView13.setTypeface(typeface);
        textView13.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout11.addView(textView13);
        TextView textView14 = new TextView(activity);
        AbstractC0213Ey.m414l(-434822489045045L, textView14, 12.0f);
        textView14.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-434843963881525L)));
        textView14.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(4));
        textView14.setClickable(true);
        textView14.setOnClickListener(new ViewOnClickListenerC2176l5(14, activity, this));
        linearLayout11.addView(textView14);
        linearLayout10.addView(linearLayout11);
        LinearLayout linearLayout12 = new LinearLayout(activity);
        linearLayout12.setOrientation(1);
        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout12.setPadding(AbstractC0295Gu.m616i(16), 0, AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12));
        this.f2413e = linearLayout12;
        TextView textView15 = new TextView(activity);
        AbstractC0213Ey.m414l(-434328567806005L, textView15, 13.0f);
        textView15.setTextColor(activity.getColor(R.color.textSummary));
        textView15.setGravity(17);
        textView15.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        this.f2414f = textView15;
        LinearLayout linearLayout13 = this.f2413e;
        if (linearLayout13 == null) {
            AbstractC0295Gu.m625r(-434448826890293L);
            linearLayout13 = null;
        }
        TextView textView16 = this.f2414f;
        if (textView16 == null) {
            AbstractC0295Gu.m625r(-434547611138101L);
            textView16 = null;
        }
        linearLayout13.addView(textView16);
        View view3 = this.f2413e;
        if (view3 == null) {
            AbstractC0295Gu.m625r(-435157496494133L);
            view3 = null;
        }
        linearLayout10.addView(view3);
        linearLayout2.addView(linearLayout10);
        LinearLayout linearLayout14 = new LinearLayout(activity);
        linearLayout14.setOrientation(1);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(280));
        layoutParams10.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(0), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        linearLayout14.setLayoutParams(layoutParams10);
        GradientDrawable gradientDrawable5 = new GradientDrawable();
        gradientDrawable5.setColor(activity.getColor(R.color.colorForeground));
        gradientDrawable5.setCornerRadius(AbstractC0295Gu.m616i(12));
        linearLayout14.setBackground(gradientDrawable5);
        TextView textView17 = new TextView(activity);
        AbstractC0213Ey.m414l(-433405149837365L, textView17, 14.0f);
        textView17.setTextColor(activity.getColor(R.color.textTitle));
        textView17.setTypeface(typeface);
        textView17.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8));
        linearLayout14.addView(textView17);
        EditText editText = new EditText(activity);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        editText.setGravity(8388659);
        Typeface typeface2 = Typeface.MONOSPACE;
        editText.setTypeface(typeface2);
        editText.setTextSize(12.0f);
        editText.setTextColor(activity.getColor(R.color.textTitle));
        editText.setHintTextColor(activity.getColor(R.color.textSummary));
        editText.setHint(AbstractC0295Gu.m625r(-433435214608437L));
        ViewGroup viewGroup = null;
        editText.setBackground(null);
        editText.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        editText.setHorizontallyScrolling(true);
        editText.setText(((C0634Op) this.f2425q.get(0)).f2031c);
        this.f2410b = editText;
        linearLayout14.addView(editText);
        linearLayout2.addView(linearLayout14);
        LinearLayout linearLayout15 = new LinearLayout(activity);
        linearLayout15.setOrientation(1);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-1, AbstractC0295Gu.m616i(200));
        layoutParams11.setMargins(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(0), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        linearLayout15.setLayoutParams(layoutParams11);
        GradientDrawable gradientDrawable6 = new GradientDrawable();
        gradientDrawable6.setColor(Color.parseColor(AbstractC0295Gu.m625r(-434191128852533L)));
        gradientDrawable6.setCornerRadius(AbstractC0295Gu.m616i(12));
        linearLayout15.setBackground(gradientDrawable6);
        LinearLayout linearLayout16 = new LinearLayout(activity);
        linearLayout16.setOrientation(0);
        linearLayout16.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout16.setGravity(16);
        linearLayout16.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(6));
        TextView textView18 = new TextView(activity);
        AbstractC0213Ey.m414l(-434225488590901L, textView18, 13.0f);
        textView18.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-434238373492789L)));
        textView18.setTypeface(typeface);
        textView18.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout16.addView(textView18);
        TextView textView19 = new TextView(activity);
        AbstractC0213Ey.m414l(-434272733231157L, textView19, 12.0f);
        textView19.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-434285618133045L)));
        textView19.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(4));
        textView19.setClickable(true);
        final int i6 = 0;
        textView19.setOnClickListener(new View.OnClickListener(this) { // from class: Jp

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C0762Rp f1400b;

            {
                this.f1400b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view32) {
                switch (i6) {
                    case 0:
                        TextView textView112 = this.f1400b.f2411c;
                        if (textView112 != null) {
                            textView112.setText(AbstractC0295Gu.m625r(-431777357232181L));
                        }
                        break;
                    case 1:
                        CherryDevServer cherryDevServer = CherryDevServer.INSTANCE;
                        boolean zIsRunning = cherryDevServer.isRunning();
                        C0762Rp c0762Rp = this.f1400b;
                        if (!zIsRunning) {
                            Activity activity2 = c0762Rp.f2415g;
                            if (activity2 == null) {
                                AbstractC0295Gu.m625r(-436969972693045L);
                                activity2 = null;
                            }
                            if (!CherryDevServer.start$default(cherryDevServer, activity2, 0, 2, null)) {
                                c0762Rp.m1559a(AbstractC0295Gu.m625r(-436557655832629L));
                            } else {
                                c0762Rp.m1561h(true);
                                Handler handler = new Handler(Looper.getMainLooper());
                                c0762Rp.f2422n = handler;
                                handler.postDelayed(new RunnableC0431K0(11, c0762Rp), 2000L);
                                c0762Rp.m1559a(AbstractC0295Gu.m625r(-437038692169781L) + cherryDevServer.getServerUrl() + '\n');
                            }
                        } else {
                            cherryDevServer.stop();
                            Handler handler2 = c0762Rp.f2422n;
                            if (handler2 != null) {
                                handler2.removeCallbacksAndMessages(null);
                            }
                            c0762Rp.f2422n = null;
                            c0762Rp.m1561h(false);
                            c0762Rp.m1559a(AbstractC0295Gu.m625r(-436905548183605L));
                        }
                        break;
                    default:
                        C0762Rp c0762Rp2 = this.f1400b;
                        c0762Rp2.getClass();
                        String serverUrl = CherryDevServer.INSTANCE.getServerUrl();
                        Activity activity3 = null;
                        if (serverUrl == null) {
                            Activity activity4 = c0762Rp2.f2415g;
                            if (activity4 == null) {
                                AbstractC0295Gu.m625r(-434685050091573L);
                            } else {
                                activity3 = activity4;
                            }
                            Toast.makeText(activity3, AbstractC0295Gu.m625r(-434753769568309L), 0).show();
                        } else {
                            Activity activity5 = c0762Rp2.f2415g;
                            if (activity5 == null) {
                                AbstractC0295Gu.m625r(-436317137664053L);
                                activity5 = null;
                            }
                            Object systemService = activity5.getSystemService(AbstractC0295Gu.m625r(-436385857140789L));
                            AbstractC0295Gu.m625r(-436428806813749L);
                            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(AbstractC0295Gu.m625r(-436179698710581L), serverUrl));
                            Activity activity6 = c0762Rp2.f2415g;
                            if (activity6 == null) {
                                AbstractC0295Gu.m625r(-434590560811061L);
                            } else {
                                activity3 = activity6;
                            }
                            Toast.makeText(activity3, AbstractC0295Gu.m625r(-434659280287797L).concat(serverUrl), 0).show();
                        }
                        break;
                }
            }
        });
        linearLayout16.addView(textView19);
        linearLayout15.addView(linearLayout16);
        ScrollView scrollView2 = new ScrollView(activity);
        scrollView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        scrollView2.setVerticalScrollBarEnabled(true);
        TextView textView20 = new TextView(activity);
        textView20.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView20.setTypeface(typeface2);
        textView20.setTextSize(11.0f);
        textView20.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-433770222057525L)));
        textView20.setPadding(AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(16), AbstractC0295Gu.m616i(16));
        textView20.setTextIsSelectable(true);
        this.f2411c = textView20;
        scrollView2.addView(textView20);
        linearLayout15.addView(scrollView2);
        linearLayout2.addView(linearLayout15);
        scrollView.addView(linearLayout2);
        ViewGroup viewGroup2 = this.f2409a;
        if (viewGroup2 == null) {
            AbstractC0295Gu.m625r(-439246305359925L);
        } else {
            viewGroup = viewGroup2;
        }
        viewGroup.addView(scrollView);
        this.f2416h.post(new RunnableC2260n3(11, this, activity));
    }

    /* JADX INFO: renamed from: g */
    public final void m1560g() {
        String strM625r;
        String strM625r2;
        TextView textView;
        LinearLayout linearLayout = this.f2413e;
        if (linearLayout == null) {
            AbstractC0295Gu.m625r(-433529703888949L);
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        List<LoadedScript> loadedScripts = ScriptManager.INSTANCE.getLoadedScripts();
        if (loadedScripts.isEmpty()) {
            LinearLayout linearLayout2 = this.f2413e;
            if (linearLayout2 == null) {
                AbstractC0295Gu.m625r(-433628488136757L);
                linearLayout2 = null;
            }
            TextView textView2 = this.f2414f;
            if (textView2 == null) {
                AbstractC0295Gu.m625r(-433727272384565L);
                textView = null;
            } else {
                textView = textView2;
            }
            linearLayout2.addView(textView);
            return;
        }
        for (LoadedScript loadedScript : loadedScripts) {
            ViewGroup viewGroup = this.f2413e;
            ViewGroup viewGroup2 = viewGroup;
            if (viewGroup == null) {
                AbstractC0295Gu.m625r(-433237646112821L);
                viewGroup2 = null;
            }
            Activity activity = this.f2415g;
            if (activity == null) {
                AbstractC0295Gu.m625r(-433336430360629L);
                activity = null;
            }
            LinearLayout linearLayout3 = new LinearLayout(activity);
            linearLayout3.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, AbstractC0295Gu.m616i(8), 0, 0);
            linearLayout3.setLayoutParams(layoutParams);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(Color.parseColor(AbstractC0295Gu.m625r(-435256280741941L)));
            gradientDrawable.setCornerRadius(AbstractC0295Gu.m616i(8));
            linearLayout3.setBackground(gradientDrawable);
            linearLayout3.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(10), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(10));
            linearLayout3.setGravity(16);
            ScriptState state = loadedScript.getState();
            int[] iArr = AbstractC0677Pp.f2153a;
            int i = iArr[state.ordinal()];
            if (i == 1) {
                strM625r = AbstractC0295Gu.m625r(-435290640480309L);
            } else if (i == 2) {
                strM625r = AbstractC0295Gu.m625r(-435325000218677L);
            } else if (i == 3) {
                strM625r = AbstractC0295Gu.m625r(-435359359957045L);
            } else if (i == 4) {
                strM625r = AbstractC0295Gu.m625r(-435393719695413L);
            } else {
                if (i != 5) {
                    throw new C0232Fa();
                }
                strM625r = AbstractC0295Gu.m625r(-434878323619893L);
            }
            View view = new View(activity);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(8));
            layoutParams2.setMargins(0, 0, AbstractC0295Gu.m616i(10), 0);
            view.setLayoutParams(layoutParams2);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(1);
            gradientDrawable2.setColor(Color.parseColor(strM625r));
            view.setBackground(gradientDrawable2);
            linearLayout3.addView(view);
            LinearLayout linearLayout4 = new LinearLayout(activity);
            linearLayout4.setOrientation(1);
            linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView3 = new TextView(activity);
            textView3.setText(loadedScript.getName() + AbstractC0295Gu.m625r(-434912683358261L) + loadedScript.getVersion());
            textView3.setTextSize(13.0f);
            textView3.setTextColor(-1);
            textView3.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout4.addView(textView3);
            TextView textView4 = new TextView(activity);
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-434925568260149L));
            sb.append(loadedScript.getAuthor());
            sb.append(AbstractC0295Gu.m625r(-434947043096629L));
            int i2 = iArr[loadedScript.getState().ordinal()];
            if (i2 == 1) {
                strM625r2 = AbstractC0295Gu.m625r(-435084482050101L);
            } else if (i2 == 2) {
                strM625r2 = AbstractC0295Gu.m625r(-435101661919285L);
            } else if (i2 == 3) {
                strM625r2 = AbstractC0295Gu.m625r(-435131726690357L);
            } else if (i2 == 4) {
                strM625r2 = AbstractC0295Gu.m625r(-433499639117877L);
            } else {
                if (i2 != 5) {
                    throw new C0232Fa();
                }
                strM625r2 = AbstractC0295Gu.m625r(-433512524019765L);
            }
            sb.append(strM625r2);
            textView4.setText(sb.toString());
            textView4.setTextSize(11.0f);
            textView4.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-434964222965813L)));
            linearLayout4.addView(textView4);
            linearLayout3.addView(linearLayout4);
            if (loadedScript.getState() == ScriptState.LOADED || loadedScript.getState() == ScriptState.COMPLETED) {
                TextView textView5 = new TextView(activity);
                AbstractC0213Ey.m414l(-434998582704181L, textView5, 16.0f);
                textView5.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-435007172638773L)));
                textView5.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8));
                textView5.setClickable(true);
                textView5.setOnClickListener(new ViewOnClickListenerC0591Np(this, loadedScript));
                linearLayout3.addView(textView5);
            }
            TextView textView6 = new TextView(activity);
            AbstractC0213Ey.m414l(-435041532377141L, textView6, 16.0f);
            textView6.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-435050122311733L)));
            textView6.setPadding(AbstractC0295Gu.m616i(12), AbstractC0295Gu.m616i(8), AbstractC0295Gu.m616i(4), AbstractC0295Gu.m616i(8));
            textView6.setClickable(true);
            textView6.setOnClickListener(new ViewOnClickListenerC0591Np(loadedScript, this));
            linearLayout3.addView(textView6);
            viewGroup2.addView(linearLayout3);
        }
    }

    @Override // p000.InterfaceC0972Wk
    public final View getContentView() {
        LinearLayout linearLayout = this.f2409a;
        if (linearLayout != null) {
            return linearLayout;
        }
        AbstractC0295Gu.m625r(-483076446615605L);
        return null;
    }

    @Override // p000.InterfaceC0972Wk
    public final String getTitle() {
        return AbstractC0295Gu.m625r(-483110806353973L);
    }

    /* JADX INFO: renamed from: h */
    public final void m1561h(boolean z) {
        GradientDrawable gradientDrawable;
        if (!z) {
            TextView textView = this.f2417i;
            if (textView == null) {
                AbstractC0295Gu.m625r(-437300685174837L);
                textView = null;
            }
            textView.setText(AbstractC0295Gu.m625r(-435737317079093L));
            TextView textView2 = this.f2417i;
            if (textView2 == null) {
                AbstractC0295Gu.m625r(-435754496948277L);
                textView2 = null;
            }
            textView2.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-435840396294197L)));
            TextView textView3 = this.f2418j;
            if (textView3 == null) {
                AbstractC0295Gu.m625r(-435874756032565L);
                textView3 = null;
            }
            textView3.setText(AbstractC0295Gu.m625r(-435947770476597L));
            TextView textView4 = this.f2419k;
            if (textView4 == null) {
                AbstractC0295Gu.m625r(-435415194531893L);
                textView4 = null;
            }
            textView4.setText(AbstractC0295Gu.m625r(-435492503943221L));
            TextView textView5 = this.f2420l;
            if (textView5 == null) {
                AbstractC0295Gu.m625r(-435539748583477L);
                textView5 = null;
            }
            textView5.setText(AbstractC0295Gu.m625r(-435621352962101L));
            TextView textView6 = this.f2420l;
            if (textView6 == null) {
                AbstractC0295Gu.m625r(-435651417733173L);
                textView6 = null;
            }
            Drawable background = textView6.getBackground();
            gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(Color.parseColor(AbstractC0295Gu.m625r(-436282777925685L)));
                return;
            }
            return;
        }
        TextView textView7 = this.f2417i;
        if (textView7 == null) {
            AbstractC0295Gu.m625r(-436626375309365L);
            textView7 = null;
        }
        textView7.setText(AbstractC0295Gu.m625r(-436712274655285L));
        TextView textView8 = this.f2417i;
        if (textView8 == null) {
            AbstractC0295Gu.m625r(-436729454524469L);
            textView8 = null;
        }
        textView8.setTextColor(Color.parseColor(AbstractC0295Gu.m625r(-437365109684277L)));
        TextView textView9 = this.f2418j;
        if (textView9 == null) {
            AbstractC0295Gu.m625r(-437399469422645L);
            textView9 = null;
        }
        CherryDevServer cherryDevServer = CherryDevServer.INSTANCE;
        String serverUrl = cherryDevServer.getServerUrl();
        if (serverUrl == null) {
            serverUrl = AbstractC0295Gu.m625r(-437472483866677L);
        }
        textView9.setText(serverUrl);
        TextView textView10 = this.f2419k;
        if (textView10 == null) {
            AbstractC0295Gu.m625r(-437502548637749L);
            textView10 = null;
        }
        textView10.setText(cherryDevServer.getConnectionCount() + AbstractC0295Gu.m625r(-437579858049077L));
        TextView textView11 = this.f2420l;
        if (textView11 == null) {
            AbstractC0295Gu.m625r(-437073051908149L);
            textView11 = null;
        }
        textView11.setText(AbstractC0295Gu.m625r(-437154656286773L));
        TextView textView12 = this.f2420l;
        if (textView12 == null) {
            AbstractC0295Gu.m625r(-437184721057845L);
            textView12 = null;
        }
        Drawable background2 = textView12.getBackground();
        gradientDrawable = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(Color.parseColor(AbstractC0295Gu.m625r(-437266325436469L)));
        }
    }

    @Override // io.github.cherrywechat.lua.loader.ScriptStateListener
    public final void onScriptStateChanged(LoadedScript loadedScript) {
        AbstractC0295Gu.m625r(-482969072433205L);
        this.f2416h.post(new RunnableC0562N2(18, this));
    }
}
