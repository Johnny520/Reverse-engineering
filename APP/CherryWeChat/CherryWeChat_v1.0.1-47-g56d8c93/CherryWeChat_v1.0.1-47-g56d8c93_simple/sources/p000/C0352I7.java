package p000;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: I7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0352I7 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f1185b;

    public /* synthetic */ C0352I7(int r1, Class r2) {
        this.f1184a = r1;
        this.f1185b = r2;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r14) {
        int r1 = 0;
        switch(this.f1184a) {
            case 0: goto L52;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        Class r0 = this.f1185b;
        AbstractC0295Gu.m625r(-576805517916213L);
        return Boolean.valueOf(((Class) r14).equals(r0));
    L6:
        Class r02 = this.f1185b;
        C1494hG r142 = (C1494hG) r14;
        AbstractC0295Gu.m625r(-21367462295605L);
        if (C0577Nb.f1872b.m2024e() == false) goto L51;
        Object r3 = ((Object[]) r142.f5263a.f8522c)[0];
        AbstractC0295Gu.m625r(-21423296870453L);
        ArrayList r4 = new ArrayList();
        Iterator r32 = ((List) r3).iterator();
    L11:
        if (r32.hasNext() == false) goto L49;
        Object r5 = r32.next();
        C2648vx r6 = AbstractC1406fG.m2685J(r5);
        String r7 = r02.getTypeName();
        AbstractC0295Gu.m625r(-21148418963509L);
        r6.m5182e(r7);
        Object r62 = r6.m5178a();
        Integer r72 = (Integer) AbstractC0213Ey.m404b(-21771189221429L, AbstractC1406fG.m2685J(r62));
        if (r72 == null) goto L15;
        int r73 = r72.intValue();
    L16:
        String r8 = (String) AbstractC0213Ey.m404b(-21848498632757L, AbstractC1406fG.m2685J(r62));
        if (r8 != null) goto L19;
        r8 = AbstractC0295Gu.m625r(-21912923142197L);
    L19:
        Long r63 = (Long) AbstractC0213Ey.m404b(-21917218109493L, AbstractC1406fG.m2685J(r62));
        if (r63 == null) goto L22;
        long r11 = r63.longValue();
    L73:
        int r64 = C0577Nb.f1873c.ordinal();     // Catch: Throwable -> L72
        if (r64 == 1) goto L44;
        if (r64 != 2) goto L28;
        if (r73 <= 0) goto L46;
    L33:
        boolean r65 = true;
    L47:
        if (r65 == false) goto L11;
        r4.add(r5);
        goto L11
    L28:
        if (r64 == 3) goto L37;
        if (r64 != 4) goto L32;
        r65 = AbstractC0085Bz.m132J(r8, false, AbstractC0295Gu.m625r(-21457656608821L));     // Catch: Throwable -> L72
        goto L47
    L32:
        if (r64 != 5) goto L33;
        r65 = C0577Nb.f1874d.contains(r8);     // Catch: Throwable -> L72
        goto L47
    L37:
        if (AbstractC0085Bz.m132J(r8, false, AbstractC0295Gu.m625r(-21964462749749L)) == true) goto L46;
        if (C0577Nb.f1874d.contains(r8) == true) goto L46;
    L44:
        if ((4611686018427387904L & r11) != 0) goto L33;
    L46:
        r65 = false;
        goto L47
    L22:
        r11 = 0;
        goto L73
    L15:
        r73 = 0;
        goto L16
    L49:
        ((Object[]) r142.f5263a.f8522c)[0] = r4;
    L51:
        return C0829TC.f2620a;
    L52:
        Class r03 = this.f1185b;
        AbstractC0295Gu.m625r(-177665617164341L);
        Object r143 = ((C1494hG) r14).f5263a.f8521b;
        AbstractC0295Gu.m625r(-177717156771893L);
        Activity r144 = (Activity) r143;
        if (r144.getIntent().getBooleanExtra(AbstractC0295Gu.m625r(-176316997433397L), false) == false) goto L71;
        HashMap r33 = AbstractC0999XA.f3193a;
        int r34 = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-176338472269877L));
        if (r34 == 0) goto L71;
        Field[] r04 = r03.getDeclaredFields();
        AbstractC0295Gu.m625r(-175926155409461L);
        int r42 = r04.length;
    L58:
        if (r1 >= r42) goto L71;
        Field r52 = r04[r1];
        if (AbstractC0585Nj.m1134a(r52.getType(), TextView.class) == false) goto L69;
        r52.setAccessible(true);
        Object r53 = r52.get(r144);
        if ((r53 instanceof TextView) == false) goto L64;
        TextView r54 = (TextView) r53;
    L65:
        if (r54 == null) goto L69;
        if (AbstractC0585Nj.m1134a(r54.getText().toString(), AbstractC0295Gu.m625r(-176024939657269L)) == false) goto L69;
        r54.setTextColor(r34);
        ViewParent r66 = r54.getParent();
        AbstractC0295Gu.m625r(-176059299395637L);
        ViewGroup r67 = (ViewGroup) r66;
        View r55 = r67.getChildAt(r67.indexOfChild(r54) + 1);
        AbstractC0295Gu.m625r(-176866753247285L);
        ImageView r56 = (ImageView) r55;
        r56.setColorFilter(new PorterDuffColorFilter(Color.rgb(Color.red(r34), Color.green(r34), Color.blue(r34)), PorterDuff.Mode.MULTIPLY));
        r56.setAlpha(Color.alpha(r34));
        goto L69
    L64:
        r54 = null;
    L69:
        r1 = r1 + 1;
    L71:
        return C0829TC.f2620a;
    }
}
