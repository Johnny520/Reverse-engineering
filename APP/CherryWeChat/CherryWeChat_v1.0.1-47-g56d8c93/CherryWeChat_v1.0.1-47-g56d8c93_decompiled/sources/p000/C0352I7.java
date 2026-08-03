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
import java.util.List;

/* JADX INFO: renamed from: I7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0352I7 implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1184a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f1185b;

    public /* synthetic */ C0352I7(int i, Class cls) {
        this.f1184a = i;
        this.f1185b = cls;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo90g(Object obj) throws IllegalAccessException {
        boolean zM132J;
        int iOrdinal;
        switch (this.f1184a) {
            case 0:
                Class cls = this.f1185b;
                AbstractC0295Gu.m625r(-177665617164341L);
                Object obj2 = ((C1494hG) obj).f5263a.f8521b;
                AbstractC0295Gu.m625r(-177717156771893L);
                Activity activity = (Activity) obj2;
                if (activity.getIntent().getBooleanExtra(AbstractC0295Gu.m625r(-176316997433397L), false)) {
                    HashMap map = AbstractC0999XA.f3193a;
                    int iM2889a = C1517hw.m2889a(0, AbstractC0295Gu.m625r(-176338472269877L));
                    if (iM2889a != 0) {
                        Field[] declaredFields = cls.getDeclaredFields();
                        AbstractC0295Gu.m625r(-175926155409461L);
                        for (Field field : declaredFields) {
                            if (AbstractC0585Nj.m1134a(field.getType(), TextView.class)) {
                                field.setAccessible(true);
                                Object obj3 = field.get(activity);
                                TextView textView = obj3 instanceof TextView ? (TextView) obj3 : null;
                                if (textView != null && AbstractC0585Nj.m1134a(textView.getText().toString(), AbstractC0295Gu.m625r(-176024939657269L))) {
                                    textView.setTextColor(iM2889a);
                                    ViewParent parent = textView.getParent();
                                    AbstractC0295Gu.m625r(-176059299395637L);
                                    ViewGroup viewGroup = (ViewGroup) parent;
                                    View childAt = viewGroup.getChildAt(viewGroup.indexOfChild(textView) + 1);
                                    AbstractC0295Gu.m625r(-176866753247285L);
                                    ImageView imageView = (ImageView) childAt;
                                    imageView.setColorFilter(new PorterDuffColorFilter(Color.rgb(Color.red(iM2889a), Color.green(iM2889a), Color.blue(iM2889a)), PorterDuff.Mode.MULTIPLY));
                                    imageView.setAlpha(Color.alpha(iM2889a));
                                }
                            }
                        }
                    }
                }
                return C0829TC.f2620a;
            case 1:
                Class cls2 = this.f1185b;
                C1494hG c1494hG = (C1494hG) obj;
                AbstractC0295Gu.m625r(-21367462295605L);
                if (C0577Nb.f1872b.m2024e()) {
                    Object obj4 = ((Object[]) c1494hG.f5263a.f8522c)[0];
                    AbstractC0295Gu.m625r(-21423296870453L);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : (List) obj4) {
                        C2648vx c2648vxM2685J = AbstractC1406fG.m2685J(obj5);
                        String typeName = cls2.getTypeName();
                        AbstractC0295Gu.m625r(-21148418963509L);
                        c2648vxM2685J.m5182e(typeName);
                        Object objM5178a = c2648vxM2685J.m5178a();
                        Integer num = (Integer) AbstractC0213Ey.m404b(-21771189221429L, AbstractC1406fG.m2685J(objM5178a));
                        int iIntValue = num != null ? num.intValue() : 0;
                        String strM625r = (String) AbstractC0213Ey.m404b(-21848498632757L, AbstractC1406fG.m2685J(objM5178a));
                        if (strM625r == null) {
                            strM625r = AbstractC0295Gu.m625r(-21912923142197L);
                        }
                        Long l = (Long) AbstractC0213Ey.m404b(-21917218109493L, AbstractC1406fG.m2685J(objM5178a));
                        long jLongValue = l != null ? l.longValue() : 0L;
                        try {
                            iOrdinal = C0577Nb.f1873c.ordinal();
                            break;
                        } catch (Throwable unused) {
                        }
                        if (iOrdinal != 1) {
                            if (iOrdinal != 2) {
                                if (iOrdinal != 3) {
                                    if (iOrdinal == 4) {
                                        zM132J = AbstractC0085Bz.m132J(strM625r, false, AbstractC0295Gu.m625r(-21457656608821L));
                                    } else if (iOrdinal == 5) {
                                        zM132J = C0577Nb.f1874d.contains(strM625r);
                                    }
                                } else if (AbstractC0085Bz.m132J(strM625r, false, AbstractC0295Gu.m625r(-21964462749749L)) || C0577Nb.f1874d.contains(strM625r)) {
                                    zM132J = false;
                                }
                                zM132J = true;
                            } else if (iIntValue > 0) {
                                zM132J = true;
                            }
                        } else if ((4611686018427387904L & jLongValue) != 0) {
                        }
                        if (zM132J) {
                            arrayList.add(obj5);
                        }
                    }
                    ((Object[]) c1494hG.f5263a.f8522c)[0] = arrayList;
                }
                return C0829TC.f2620a;
            default:
                Class cls3 = this.f1185b;
                AbstractC0295Gu.m625r(-576805517916213L);
                return Boolean.valueOf(((Class) obj).equals(cls3));
        }
    }
}
