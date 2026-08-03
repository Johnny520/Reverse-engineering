package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;

/* JADX INFO: renamed from: ak */
/* JADX INFO: loaded from: classes.dex */
public final class C1145ak extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C1145ak f3636b = new C1145ak(new C1116Zz(AbstractC0295Gu.m625r(-26414048868405L), AbstractC0295Gu.m625r(-26435523704885L), false, AbstractC0295Gu.m625r(-26521423050805L), AbstractC0295Gu.m625r(-26555782789173L), new C2648vx(AbstractC0295Gu.m625r(-26736171415605L), AbstractC0295Gu.m625r(-26843545598005L), AbstractC0295Gu.m625r(-26847840565301L), AbstractC0295Gu.m625r(-26877905336373L), new ViewOnClickListenerC1079Z4(9)), true));

    /* JADX INFO: renamed from: c */
    public static Typeface f3637c;

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        C1337ds c1337ds = C1337ds.f4821a;
        C1354e8 c1354e8 = new C1354e8(1);
        c1337ds.getClass();
        AbstractC0295Gu.m625r(-96456375531573L);
        C1337ds.f4822b.add(c1354e8);
        if (m2024e()) {
            SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
            String strM1173b = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-7812545509429L), AbstractC0295Gu.m625r(-7919919691829L));
            if (strM1173b.length() == 0) {
                return;
            }
            Typeface typefaceCreateFromFile = Typeface.createFromFile(strM1173b);
            f3637c = typefaceCreateFromFile;
            if (typefaceCreateFromFile == null) {
                return;
            }
            C0620Ob c0620Ob = new C0620Ob(11);
            AbstractC0295Gu.m625r(-579558591952949L);
            AbstractC0295Gu.m625r(-579588656724021L);
            AbstractC0295Gu.m625r(-579988088682549L);
            new C2428qs(11, TextView.class).m4870f(c0620Ob);
            C1538iG c1538iG = new C1538iG(TextView.class);
            c1538iG.m2921f(AbstractC0295Gu.m625r(-7924214659125L));
            c1538iG.m2922g(Typeface.class);
            c1538iG.m2917b(new C0620Ob(12));
            C1538iG c1538iG2 = new C1538iG(TextView.class);
            c1538iG2.m2921f(AbstractC0295Gu.m625r(-8525510080565L));
            c1538iG2.m2922g(Typeface.class, Integer.TYPE);
            c1538iG2.m2917b(new C0620Ob(13));
            C0620Ob c0620Ob2 = new C0620Ob(14);
            AbstractC0295Gu.m625r(-579558591952949L);
            AbstractC0295Gu.m625r(-579588656724021L);
            AbstractC0295Gu.m625r(-579988088682549L);
            new C2428qs(11, Paint.class).m4870f(c0620Ob2);
            C1538iG c1538iG3 = new C1538iG(Paint.class);
            c1538iG3.m2921f(AbstractC0295Gu.m625r(-8577049688117L));
            c1538iG3.m2922g(Typeface.class);
            c1538iG3.m2917b(new C0620Ob(15));
        }
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-26637387167797L);
    }

    @Override // p000.AbstractC1101Zk
    /* JADX INFO: renamed from: d */
    public final ArrayList mo1096d(Context context) {
        AbstractC0295Gu.m625r(-8194797598773L);
        ArrayList arrayList = new ArrayList(super.mo1096d(context));
        Object obj = 1 < arrayList.size() ? arrayList.get(1) : null;
        C2748yA c2748yA = obj instanceof C2748yA ? (C2748yA) obj : null;
        if (c2748yA != null) {
            SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
            String strM1173b = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-8229157337141L), AbstractC0295Gu.m625r(-7786775705653L));
            if (strM1173b.length() > 0) {
                c2748yA.setSummary(AbstractC0295Gu.m625r(-7791070672949L) + new File(strM1173b).getName());
            }
        }
        return arrayList;
    }
}
