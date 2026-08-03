package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import de.robv.android.xposed.XposedHelpers;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.Arrays;

/* JADX INFO: renamed from: C2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0089C2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f195a;

    /* JADX INFO: renamed from: b */
    public Object f196b;

    /* JADX INFO: renamed from: c */
    public Object f197c;

    /* JADX INFO: renamed from: d */
    public Object f198d;

    /* JADX INFO: renamed from: e */
    public Object f199e;

    /* JADX INFO: renamed from: f */
    public Object f200f;

    /* JADX INFO: renamed from: g */
    public Object f201g;

    /* JADX INFO: renamed from: h */
    public Object f202h;

    public C0089C2(int i, Object obj) {
        this.f195a = i;
        switch (i) {
            case 3:
                AbstractC0295Gu.m625r(-165558104356917L);
                this.f202h = obj;
                String strM625r = AbstractC0295Gu.m625r(-165579579193397L);
                AbstractC0295Gu.m625r(-578325936338997L);
                Object objCallMethod = XposedHelpers.callMethod(obj, strM625r, Arrays.copyOf(new Object[0], 0));
                AbstractC0295Gu.m625r(-165639708735541L);
                this.f196b = (Long) objCallMethod;
                String strM625r2 = AbstractC0295Gu.m625r(-164200894691381L);
                AbstractC0295Gu.m625r(-578325936338997L);
                Object objCallMethod2 = XposedHelpers.callMethod(obj, strM625r2, Arrays.copyOf(new Object[0], 0));
                AbstractC0295Gu.m625r(-164235254429749L);
                this.f199e = (Integer) objCallMethod2;
                this.f197c = (String) AbstractC0213Ey.m404b(-163891657046069L, AbstractC1406fG.m2685J(obj));
                this.f198d = (String) AbstractC0213Ey.m404b(-163951786588213L, AbstractC1406fG.m2685J(obj));
                this.f200f = (Long) AbstractC0213Ey.m404b(-164007621163061L, AbstractC1406fG.m2685J(obj));
                this.f201g = (Integer) AbstractC0213Ey.m404b(-164059160770613L, AbstractC1406fG.m2685J(obj));
                break;
            default:
                AbstractC0295Gu.m625r(-166305428666421L);
                this.f202h = obj;
                this.f196b = (ImageView) AbstractC0213Ey.m404b(-166369853175861L, AbstractC1406fG.m2685J(obj));
                this.f197c = AbstractC0213Ey.m404b(-166408507881525L, AbstractC1406fG.m2685J(obj));
                this.f198d = (View) AbstractC0213Ey.m404b(-166502997162037L, AbstractC1406fG.m2685J(obj));
                this.f199e = (View) AbstractC0213Ey.m404b(-166056320563253L, AbstractC1406fG.m2685J(obj));
                this.f200f = (TextView) AbstractC0213Ey.m404b(-166902429120565L, AbstractC1406fG.m2685J(obj));
                this.f201g = (TextView) AbstractC0213Ey.m404b(-166984033499189L, AbstractC1406fG.m2685J(obj));
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m137e(Context context, String str, String str2) throws CharConversionException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return AbstractC0585Nj.m1143k(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(AbstractC2374ph.m4814k("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    /* JADX INFO: renamed from: f */
    public static C1017Xm m138f(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C2286nn c2286nnM4612D = C2286nn.m4612D(byteArrayInputStream, C0839Tg.m1660a());
            byteArrayInputStream.close();
            return new C1017Xm(1, (C2153kn) ((C2286nn) C2656w4.m5191o(c2286nnM4612D).f9196b).m5159v());
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized C0132D2 m139a() {
        C1017Xm c1017XmM138f;
        C0132D2 c0132d2;
        try {
            if (((String) this.f197c) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (C0132D2.f325c) {
                try {
                    byte[] bArrM137e = m137e((Context) this.f196b, (String) this.f197c, (String) this.f198d);
                    if (bArrM137e == null) {
                        if (((String) this.f199e) != null) {
                            this.f200f = m143g();
                        }
                        this.f202h = m140b();
                    } else if (((String) this.f199e) != null) {
                        try {
                            this.f200f = new C0175E2().m328c((String) this.f199e);
                            try {
                                c1017XmM138f = new C1017Xm(1, (C2153kn) ((C2286nn) C2656w4.m5187D(new C0132D2(6, new ByteArrayInputStream(bArrM137e)), (C0947W1) this.f200f).f9196b).m5159v());
                            } catch (IOException | GeneralSecurityException e) {
                                try {
                                    c1017XmM138f = m138f(bArrM137e);
                                } catch (IOException unused) {
                                    throw e;
                                }
                            }
                        } catch (GeneralSecurityException | ProviderException e2) {
                            try {
                                c1017XmM138f = m138f(bArrM137e);
                                Object obj = C0132D2.f325c;
                            } catch (IOException unused2) {
                                throw e2;
                            }
                        }
                        this.f202h = c1017XmM138f;
                    } else {
                        this.f202h = m138f(bArrM137e);
                    }
                    c0132d2 = new C0132D2(this);
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return c0132d2;
    }

    /* JADX INFO: renamed from: b */
    public C1017Xm m140b() throws GeneralSecurityException, IOException {
        if (((C1420fn) this.f201g) == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        C1017Xm c1017Xm = new C1017Xm(1, C2286nn.m4611C());
        C1420fn c1420fn = (C1420fn) this.f201g;
        synchronized (c1017Xm) {
            c1017Xm.m1907a(c1420fn.f5014a);
        }
        int iM4959A = AbstractC2708xD.m5281a((C2286nn) c1017Xm.m1910g().f9196b).m4993y().m4959A();
        synchronized (c1017Xm) {
            for (int i = 0; i < ((C2286nn) ((C2153kn) c1017Xm.f3226b).f8871b).m4619z(); i++) {
                try {
                    C2243mn c2243mnM4618y = ((C2286nn) ((C2153kn) c1017Xm.f3226b).f8871b).m4618y(i);
                    if (c2243mnM4618y.m4557B() == iM4959A) {
                        if (!c2243mnM4618y.m4559D().equals(EnumC1271cn.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iM4959A);
                        }
                        C2153kn c2153kn = (C2153kn) c1017Xm.f3226b;
                        c2153kn.m5038e();
                        C2286nn.m4614w((C2286nn) c2153kn.f8871b, iM4959A);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new GeneralSecurityException("key not found: " + iM4959A);
        }
        Context context = (Context) this.f196b;
        String str = (String) this.f197c;
        String str2 = (String) this.f198d;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((C0947W1) this.f200f) != null) {
            C2656w4 c2656w4M1910g = c1017Xm.m1910g();
            C0947W1 c0947w1 = (C0947W1) this.f200f;
            byte[] bArr = new byte[0];
            C2286nn c2286nn = (C2286nn) c2656w4M1910g.f9196b;
            byte[] bArrMo1002a = c0947w1.mo1002a(c2286nn.m66e(), bArr);
            try {
                if (!C2286nn.m4613E(c0947w1.mo1003b(bArrMo1002a, bArr), C0839Tg.m1660a()).equals(c2286nn)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                C0838Tf c0838TfM1730z = C0881Uf.m1730z();
                C2701x6 c2701x6M5328c = AbstractC2744y6.m5328c(bArrMo1002a, 0, bArrMo1002a.length);
                c0838TfM1730z.m5038e();
                C0881Uf.m1728w((C0881Uf) c0838TfM1730z.f8871b, c2701x6M5328c);
                C2509sn c2509snM5281a = AbstractC2708xD.m5281a(c2286nn);
                c0838TfM1730z.m5038e();
                C0881Uf.m1729x((C0881Uf) c0838TfM1730z.f8871b, c2509snM5281a);
                if (!editorEdit.putString(str, AbstractC0585Nj.m1155w(((C0881Uf) c0838TfM1730z.m5035b()).m66e())).commit()) {
                    throw new IOException("Failed to write to SharedPreferences");
                }
            } catch (C0673Pl unused) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
        } else if (!editorEdit.putString(str, AbstractC0585Nj.m1155w(((C2286nn) c1017Xm.m1910g().f9196b).m66e())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
        return c1017Xm;
    }

    /* JADX INFO: renamed from: c */
    public View m141c() {
        Object obj = this.f202h;
        String strM625r = AbstractC0295Gu.m625r(-167014098270261L);
        Object[] objArr = new Object[0];
        AbstractC0295Gu.m625r(-578325936338997L);
        Object objCallMethod = XposedHelpers.callMethod(obj, strM625r, Arrays.copyOf(objArr, objArr.length));
        View view = objCallMethod instanceof View ? (View) objCallMethod : null;
        return view == null ? (View) this.f199e : view;
    }

    /* JADX INFO: renamed from: d */
    public boolean m142d() {
        Integer num = (Integer) this.f201g;
        return num != null && num.intValue() == 1;
    }

    /* JADX INFO: renamed from: g */
    public C0947W1 m143g() throws KeyStoreException {
        Object obj = C0132D2.f325c;
        C0175E2 c0175e2 = new C0175E2();
        try {
            boolean zM326a = C0175E2.m326a((String) this.f199e);
            try {
                return c0175e2.m328c((String) this.f199e);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!zM326a) {
                    throw new KeyStoreException(AbstractC2374ph.m4814k("the master key ", (String) this.f199e, " exists but is unusable"), e);
                }
                Object obj2 = C0132D2.f325c;
                return null;
            }
        } catch (GeneralSecurityException | ProviderException unused) {
            Object obj3 = C0132D2.f325c;
            return null;
        }
    }

    public String toString() {
        switch (this.f195a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append(AbstractC0295Gu.m625r(-164664751159349L));
                sb.append((Long) this.f196b);
                sb.append(AbstractC0295Gu.m625r(-164750650505269L));
                sb.append((Integer) this.f199e);
                sb.append(AbstractC0295Gu.m625r(-164785010243637L));
                sb.append((Integer) this.f201g);
                sb.append(AbstractC0295Gu.m625r(-164836549851189L));
                AbstractC2374ph.m4817n(sb, (String) this.f197c, -164883794491445L);
                sb.append((Long) this.f200f);
                sb.append(AbstractC0295Gu.m625r(-164926744164405L));
                sb.append((String) this.f198d);
                sb.append(AbstractC0295Gu.m625r(-164424232990773L));
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0089C2() {
        this.f195a = 0;
        this.f196b = null;
        this.f197c = null;
        this.f198d = null;
        this.f199e = null;
        this.f200f = null;
        this.f201g = null;
    }

    public C0089C2(ExecutorServiceC0971Wj executorServiceC0971Wj, ExecutorServiceC0971Wj executorServiceC0971Wj2, ExecutorServiceC0971Wj executorServiceC0971Wj3, ExecutorServiceC0971Wj executorServiceC0971Wj4, C1264cg c1264cg, C1264cg c1264cg2) {
        this.f195a = 2;
        this.f202h = AbstractC0714Qj.m1478I(150, new C0132D2(22, this));
        this.f196b = executorServiceC0971Wj;
        this.f197c = executorServiceC0971Wj2;
        this.f198d = executorServiceC0971Wj3;
        this.f199e = executorServiceC0971Wj4;
        this.f200f = c1264cg;
        this.f201g = c1264cg2;
    }
}
