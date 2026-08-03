package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
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

    public C0089C2(int r7, Object r8) {
        this.f195a = r7;
        switch(r7) {
            case 3: goto L6;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-166305428666421L);
        this.f202h = r8;
        this.f196b = (ImageView) AbstractC0213Ey.m404b(-166369853175861L, AbstractC1406fG.m2685J(r8));
        this.f197c = AbstractC0213Ey.m404b(-166408507881525L, AbstractC1406fG.m2685J(r8));
        CheckBox r72 = (CheckBox) AbstractC0213Ey.m404b(-166464342456373L, AbstractC1406fG.m2685J(r8));
        this.f198d = (View) AbstractC0213Ey.m404b(-166502997162037L, AbstractC1406fG.m2685J(r8));
        ImageView r73 = (ImageView) AbstractC0213Ey.m404b(-166545946834997L, AbstractC1406fG.m2685J(r8));
        this.f199e = (View) AbstractC0213Ey.m404b(-166056320563253L, AbstractC1406fG.m2685J(r8));
        View r74 = (View) AbstractC0213Ey.m404b(-166107860170805L, AbstractC1406fG.m2685J(r8));
        View r75 = (View) AbstractC0213Ey.m404b(-166167989712949L, AbstractC1406fG.m2685J(r8));
        View r76 = (View) AbstractC0213Ey.m404b(-166206644418613L, AbstractC1406fG.m2685J(r8));
        String r77 = (String) AbstractC0213Ey.m404b(-166262478993461L, AbstractC1406fG.m2685J(r8));
        ImageView r78 = (ImageView) AbstractC0213Ey.m404b(-166868069382197L, AbstractC1406fG.m2685J(r8));
        this.f200f = (TextView) AbstractC0213Ey.m404b(-166902429120565L, AbstractC1406fG.m2685J(r8));
        ProgressBar r79 = (ProgressBar) AbstractC0213Ey.m404b(-166932493891637L, AbstractC1406fG.m2685J(r8));
        this.f201g = (TextView) AbstractC0213Ey.m404b(-166984033499189L, AbstractC1406fG.m2685J(r8));
        return;
    L6:
        AbstractC0295Gu.m625r(-165558104356917L);
        this.f202h = r8;
        String r710 = AbstractC0295Gu.m625r(-165579579193397L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r711 = XposedHelpers.callMethod(r8, r710, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-165639708735541L);
        this.f196b = (Long) r711;
        String r712 = AbstractC0295Gu.m625r(-164200894691381L);
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r713 = XposedHelpers.callMethod(r8, r712, Arrays.copyOf(new Object[0], 0));
        AbstractC0295Gu.m625r(-164235254429749L);
        this.f199e = (Integer) r713;
        this.f197c = (String) AbstractC0213Ey.m404b(-163891657046069L, AbstractC1406fG.m2685J(r8));
        this.f198d = (String) AbstractC0213Ey.m404b(-163951786588213L, AbstractC1406fG.m2685J(r8));
        this.f200f = (Long) AbstractC0213Ey.m404b(-164007621163061L, AbstractC1406fG.m2685J(r8));
        this.f201g = (Integer) AbstractC0213Ey.m404b(-164059160770613L, AbstractC1406fG.m2685J(r8));
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m137e(Context r1, String r2, String r3) {
        if (r2 == null) goto L16;
        Context r12 = r1.getApplicationContext();
        if (r3 != null) goto L6;
        SharedPreferences r13 = PreferenceManager.getDefaultSharedPreferences(r12);
    L17:
        String r14 = r13.getString(r2, null);     // Catch: Throwable -> L13
        if (r14 != null) goto L11;
        return null;
    L11:
        return AbstractC0585Nj.m1143k(r14);
    L14:
        throw new CharConversionException(AbstractC2374ph.m4814k("can't read keyset; the pref value ", r2, " is not a valid hex string"));
    L6:
        r13 = r12.getSharedPreferences(r3, 0);
        goto L17
    L16:
        throw new IllegalArgumentException("keysetName cannot be null");
    }

    /* JADX INFO: renamed from: f */
    public static C1017Xm m138f(byte[] r2) {
        ByteArrayInputStream r0 = new ByteArrayInputStream(r2);
        C2286nn r22 = C2286nn.m4612D(r0, C0839Tg.m1660a());     // Catch: Throwable -> L6
        r0.close();
        int r1 = 1;
        return new C1017Xm(r1, (C2153kn) ((C2286nn) C2656w4.m5191o(r22).f9196b).m5159v());
    L6:
        th = move-exception;
        r0.close();
        throw th;
    }

    /* JADX INFO: renamed from: a */
    public synchronized C0132D2 m139a() {
        monitor-enter(this);
    L39:
        th = move-exception;
        throw th;
    L4:
        if (((String) this.f197c) == null) goto L42;
        Object r0 = C0132D2.f325c;     // Catch: Throwable -> L39
        monitor-enter(r0);     // Catch: Throwable -> L39
        byte[] r1 = m137e((Context) this.f196b, (String) this.f197c, (String) this.f198d);     // Catch: Throwable -> L12
        if (r1 != null) goto L16;
        if (((String) this.f199e) == null) goto L14;
        this.f200f = m143g();     // Catch: Throwable -> L12
    L14:
        this.f202h = m140b();     // Catch: Throwable -> L12
    L33:
        C0132D2 r12 = new C0132D2(this);     // Catch: Throwable -> L12
        monitor-exit(r0);     // Catch: Throwable -> L12
        monitor-exit(this);
        return r12;
    L16:
        if (((String) this.f199e) != null) goto L51;
        this.f202h = m138f(r1);     // Catch: Throwable -> L12
        goto L33
    L51:
        this.f200f = new C0175E2().m328c((String) this.f199e);     // Catch: Throwable -> L12 ProviderException -> L26 Throwable -> L28
        int r4 = 6;
        C2153kn r2 = (C2153kn) ((C2286nn) C2656w4.m5187D(new C0132D2(r4, new ByteArrayInputStream(r1)), (C0947W1) this.f200f).f9196b).m5159v();     // Catch: Throwable -> L12 Throwable -> L20 IOException -> L22
        C1017Xm r3 = new C1017Xm(1, r2);     // Catch: Throwable -> L12 Throwable -> L20 IOException -> L22
    L30:
        this.f202h = r3;     // Catch: Throwable -> L12
    L20:
        e = move-exception;
        r3 = m138f(r1);     // Catch: Throwable -> L12 IOException -> L25
    L25:
        throw e;     // Catch: Throwable -> L12
    L28:
        e = move-exception;
        r3 = m138f(r1);     // Catch: Throwable -> L12 IOException -> L31
        Object r13 = C0132D2.f325c;     // Catch: Throwable -> L12 IOException -> L31
    L31:
        throw e;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;     // Catch: Throwable -> L39
    L42:
        throw new IllegalArgumentException("keysetName cannot be null");     // Catch: Throwable -> L39
    }

    /* JADX INFO: renamed from: b */
    public C1017Xm m140b() {
        if (((C1420fn) this.f201g) == null) goto L59;
        C1017Xm r0 = new C1017Xm(1, C2286nn.m4611C());
        C1420fn r1 = (C1420fn) this.f201g;
        monitor-enter(r0);
        r0.m1907a(r1.f5014a);     // Catch: Throwable -> L55
        monitor-exit(r0);
        int r12 = AbstractC2708xD.m5281a((C2286nn) r0.m1910g().f9196b).m4993y().m4959A();
        monitor-enter(r0);
        int r3 = 0;
    L64:
    L48:
        th = move-exception;
        throw th;
    L12:
        if (r3 >= ((C2286nn) ((C2153kn) r0.f3226b).f8871b).m4619z()) goto L52;
        C2243mn r4 = ((C2286nn) ((C2153kn) r0.f3226b).f8871b).m4618y(r3);     // Catch: Throwable -> L48
        if (r4.m4557B() == r12) goto L16;
        r3 = r3 + 1;     // Catch: Throwable -> L48
        goto L64
    L16:
        if (r4.m4559D().equals(EnumC1271cn.f4327c) == false) goto L47;
        C2153kn r32 = (C2153kn) r0.f3226b;     // Catch: Throwable -> L48
        r32.m5038e();     // Catch: Throwable -> L48
        C2286nn.m4614w((C2286nn) r32.f8871b, r12);     // Catch: Throwable -> L48
        monitor-exit(r0);
        Context r13 = (Context) this.f196b;
        String r33 = (String) this.f197c;
        String r42 = (String) this.f198d;
        if (r33 == null) goto L45;
        Context r14 = r13.getApplicationContext();
        if (r42 != null) goto L24;
        SharedPreferences.Editor r15 = PreferenceManager.getDefaultSharedPreferences(r14).edit();
    L26:
        if (((C0947W1) this.f200f) == null) goto L40;
        C2656w4 r43 = r0.m1910g();
        C0947W1 r5 = (C0947W1) this.f200f;
        byte[] r6 = new byte[0];
        C2286nn r44 = (C2286nn) r43.f9196b;
        byte[] r7 = r5.mo1002a(r44.m66e(), r6);
        if (C2286nn.m4613E(r5.mo1003b(r7, r6), C0839Tg.m1660a()).equals(r44) == false) goto L36;
        C0838Tf r52 = C0881Uf.m1730z();
        C2701x6 r2 = AbstractC2744y6.m5328c(r7, 0, r7.length);
        r52.m5038e();
        C0881Uf.m1728w((C0881Uf) r52.f8871b, r2);
        C2509sn r22 = AbstractC2708xD.m5281a(r44);
        r52.m5038e();
        C0881Uf.m1729x((C0881Uf) r52.f8871b, r22);
        if (r15.putString(r33, AbstractC0585Nj.m1155w(((C0881Uf) r52.m5035b()).m66e())).commit() == false) goto L34;
    L41:
        return r0;
    L34:
        throw new IOException("Failed to write to SharedPreferences");
    L36:
        throw new GeneralSecurityException("cannot encrypt keyset");     // Catch: C0673Pl -> L37
    L38:
        throw new GeneralSecurityException("invalid keyset, corrupted key material");
    L40:
        if (r15.putString(r33, AbstractC0585Nj.m1155w(((C2286nn) r0.m1910g().f9196b).m66e())).commit() == true) goto L41;
        throw new IOException("Failed to write to SharedPreferences");
    L24:
        r15 = r14.getSharedPreferences(r42, 0).edit();
        goto L26
    L45:
        throw new IllegalArgumentException("keysetName cannot be null");
    L47:
        throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + r12);     // Catch: Throwable -> L48
    L52:
        throw new GeneralSecurityException("key not found: " + r12);     // Catch: Throwable -> L48
    L55:
        th = move-exception;
        throw th;
    L59:
        throw new GeneralSecurityException("cannot read or generate keyset");
    }

    /* JADX INFO: renamed from: c */
    public View m141c() {
        Object r0 = this.f202h;
        String r1 = AbstractC0295Gu.m625r(-167014098270261L);
        Object[] r2 = new Object[0];
        AbstractC0295Gu.m625r(-578325936338997L);
        Object r02 = XposedHelpers.callMethod(r0, r1, Arrays.copyOf(r2, r2.length));
        if ((r02 instanceof View) == false) goto L5;
        View r03 = (View) r02;
    L6:
        if (r03 == null) goto L8;
        return r03;
    L8:
        return (View) this.f199e;
    L5:
        r03 = null;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public boolean m142d() {
        Integer r0 = (Integer) this.f201g;
        if (r0 != null) goto L6;
        return false;
    L6:
        if (r0.intValue() != 1) goto L8;
        return true;
    L8:
        return false;
    }

    /* JADX INFO: renamed from: g */
    public C0947W1 m143g() {
        Object r0 = C0132D2.f325c;
        C0175E2 r02 = new C0175E2();
        boolean r2 = C0175E2.m326a((String) this.f199e);     // Catch: Throwable -> L14
        return r02.m328c((String) this.f199e);
    L6:
        e = move-exception;
        if (r2 == false) goto L13;
        Object r03 = C0132D2.f325c;
        return null;
    L13:
        throw new KeyStoreException(AbstractC2374ph.m4814k("the master key ", (String) this.f199e, " exists but is unusable"), e);
    L14:
        Object r04 = C0132D2.f325c;
        return null;
    }

    public String toString() {
        switch(this.f195a) {
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-164664751159349L));
        r0.append((Long) this.f196b);
        r0.append(AbstractC0295Gu.m625r(-164750650505269L));
        r0.append((Integer) this.f199e);
        r0.append(AbstractC0295Gu.m625r(-164785010243637L));
        r0.append((Integer) this.f201g);
        r0.append(AbstractC0295Gu.m625r(-164836549851189L));
        AbstractC2374ph.m4817n(r0, (String) this.f197c, -164883794491445L);
        r0.append((Long) this.f200f);
        r0.append(AbstractC0295Gu.m625r(-164926744164405L));
        r0.append((String) this.f198d);
        r0.append(AbstractC0295Gu.m625r(-164424232990773L));
        return r0.toString();
    L5:
        return super.toString();
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

    public C0089C2(ExecutorServiceC0971Wj r3, ExecutorServiceC0971Wj r4, ExecutorServiceC0971Wj r5, ExecutorServiceC0971Wj r6, C1264cg r7, C1264cg r8) {
        this.f195a = 2;
        this.f202h = AbstractC0714Qj.m1478I(150, new C0132D2(22, this));
        this.f196b = r3;
        this.f197c = r4;
        this.f198d = r5;
        this.f199e = r6;
        this.f200f = r7;
        this.f201g = r8;
    }
}
