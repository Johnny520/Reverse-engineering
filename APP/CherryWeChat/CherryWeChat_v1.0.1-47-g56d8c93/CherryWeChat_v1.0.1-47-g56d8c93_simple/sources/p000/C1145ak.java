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
    public static final C1145ak f3636b = null;

    /* JADX INFO: renamed from: c */
    public static Typeface f3637c;

    static {
        C2648vx r1 = new C2648vx(AbstractC0295Gu.m625r(-26736171415605L), AbstractC0295Gu.m625r(-26843545598005L), AbstractC0295Gu.m625r(-26847840565301L), AbstractC0295Gu.m625r(-26877905336373L), new ViewOnClickListenerC1079Z4(9));
        f3636b = new C1145ak(new C1116Zz(AbstractC0295Gu.m625r(-26414048868405L), AbstractC0295Gu.m625r(-26435523704885L), false, AbstractC0295Gu.m625r(-26521423050805L), AbstractC0295Gu.m625r(-26555782789173L), r1, true));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        C1337ds r0 = C1337ds.f4821a;
        C1354e8 r1 = new C1354e8(1);
        r0.getClass();
        AbstractC0295Gu.m625r(-96456375531573L);
        C1337ds.f4822b.add(r1);
        if (m2024e() == false) goto L13;
        SharedPreferences r02 = AbstractC0599Nx.f1939a;
        String r03 = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-7812545509429L), AbstractC0295Gu.m625r(-7919919691829L));
        if (r03.length() == 0) goto L14;
        Typeface r04 = Typeface.createFromFile(r03);
        f3637c = r04;
        if (r04 != null) goto L11;
        return;
    L11:
        C0620Ob r05 = new C0620Ob(11);
        AbstractC0295Gu.m625r(-579558591952949L);
        AbstractC0295Gu.m625r(-579588656724021L);
        AbstractC0295Gu.m625r(-579988088682549L);
        new C2428qs(11, TextView.class).m4870f(r05);
        C1538iG r06 = new C1538iG(TextView.class);
        r06.m2921f(AbstractC0295Gu.m625r(-7924214659125L));
        r06.m2922g(new Object[]{Typeface.class});
        r06.m2917b(new C0620Ob(12));
        C1538iG r07 = new C1538iG(TextView.class);
        r07.m2921f(AbstractC0295Gu.m625r(-8525510080565L));
        r07.m2922g(new Object[]{Typeface.class, Integer.TYPE});
        r07.m2917b(new C0620Ob(13));
        C0620Ob r08 = new C0620Ob(14);
        AbstractC0295Gu.m625r(-579558591952949L);
        AbstractC0295Gu.m625r(-579588656724021L);
        AbstractC0295Gu.m625r(-579988088682549L);
        new C2428qs(11, Paint.class).m4870f(r08);
        C1538iG r09 = new C1538iG(Paint.class);
        r09.m2921f(AbstractC0295Gu.m625r(-8577049688117L));
        r09.m2922g(new Object[]{Typeface.class});
        r09.m2917b(new C0620Ob(15));
        return;
    L14:
        return;
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-26637387167797L);
    }

    @Override // p000.AbstractC1101Zk
    /* JADX INFO: renamed from: d */
    public final ArrayList mo1096d(Context r6) {
        AbstractC0295Gu.m625r(-8194797598773L);
        ArrayList r0 = new ArrayList(super.mo1096d(r6));
        C2748yA r1 = null;
        if (1 >= r0.size()) goto L5;
        Object r62 = r0.get(1);
    L7:
        if ((r62 instanceof C2748yA) == false) goto L9;
        r1 = (C2748yA) r62;
    L9:
        if (r1 == null) goto L14;
        SharedPreferences r63 = AbstractC0599Nx.f1939a;
        String r64 = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-8229157337141L), AbstractC0295Gu.m625r(-7786775705653L));
        if (r64.length() <= 0) goto L14;
        r1.setSummary(AbstractC0295Gu.m625r(-7791070672949L) + new File(r64).getName());
    L14:
        return r0;
    L5:
        r62 = null;
        goto L7
    }
}
