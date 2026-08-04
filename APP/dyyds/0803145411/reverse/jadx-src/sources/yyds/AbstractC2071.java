package yyds;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import kotlin.Pair;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᲀᲀᛸᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2071 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C0716 f10226 = new C0716(new C0188(21));

    /* JADX INFO: renamed from: ᛱᛳᲇ, reason: contains not printable characters */
    public static int m3947(int i, int i2, boolean z, InterfaceC1549 interfaceC1549) {
        if (((C2739) interfaceC1549.mo371(Integer.valueOf(z ? 0 : i - 1))).f13445 < 0.97f) {
            return 0;
        }
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            if (((C2739) interfaceC1549.mo371(Integer.valueOf(z ? i5 : (i - 1) - i5))).f13445 < 0.97f) {
                i3++;
                if (i3 > 2) {
                    break;
                }
            } else {
                i4 = i5 + 1;
                i3 = 0;
            }
        }
        return i4;
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static boolean m3948(int i, int i2, int i3, InterfaceC1549 interfaceC1549) {
        float fMax = 0.0f;
        float fMin = 1.0f;
        for (int i4 = 0; i4 < 5; i4++) {
            C2739 c2739 = (C2739) interfaceC1549.mo371(Integer.valueOf(AbstractC0598.m1487((i2 * i4) + i, 0, i3 - 1)));
            fMax = Math.max(fMax, c2739.f13446);
            fMin = Math.min(fMin, c2739.f13445);
        }
        return fMax >= 48.0f && fMin < 0.85f;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public static void m3949(yyds.C1633 r18, yyds.C0312 r19) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yyds.AbstractC2071.m3949(yyds.ᛷᲀᲇᲈ, yyds.ᛲᛳᛶᲁ):void");
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static boolean m3950(C1446 c1446, C0216 c0216) {
        if (c1446.m2945() > 0 && c1446.m2944() > 0) {
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 11; i3++) {
                int iM1487 = AbstractC0598.m1487((int) (((i3 + 0.5f) * c1446.m2944()) / 11.0f), 0, c1446.m2944() - 1) + c1446.f6861;
                for (int i4 = 0; i4 < 11; i4++) {
                    int iIntValue = ((Number) c0216.mo511(Integer.valueOf(AbstractC0598.m1487((int) (((i4 + 0.5f) * c1446.m2945()) / 11.0f), 0, c1446.m2945() - 1) + c1446.f6860), Integer.valueOf(iM1487))).intValue();
                    if (((((iIntValue & 255) * 19) + ((((iIntValue >>> 8) & 255) * 183) + (((iIntValue >>> 16) & 255) * 54))) >>> 8) > 40) {
                        i++;
                    }
                    i2++;
                }
            }
            if (i >= i2 * 0.15f) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static C1446 m3951(int i, int i2, final C0216 c0216) {
        AbstractC2328.m4341(-617873568072558L);
        if (i < 24 || i2 < 24) {
            return null;
        }
        final C0172 c0172 = new C0172();
        final int i3 = 0;
        c0172.f997 = new C1446(0, 0, i, i2);
        Pair pairM3962 = m3962(i2, new InterfaceC1549() { // from class: yyds.ᛵᛸᛳᛷ
            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final Object mo371(Object obj) {
                int i4 = i3;
                long j = 0;
                C0216 c02162 = c0216;
                C0172 c01722 = c0172;
                Integer num = (Integer) obj;
                num.getClass();
                switch (i4) {
                    case 0:
                        C1446 c1446 = (C1446) c01722.f997;
                        int i5 = c1446.f6860;
                        int i6 = c1446.f6862 - i5;
                        int iMin = Math.min(i6, 96);
                        if (iMin < 1) {
                            iMin = 1;
                        }
                        int i7 = 0;
                        for (int i8 = 0; i8 < iMin; i8++) {
                            int iIntValue = ((Number) c02162.mo511(Integer.valueOf(AbstractC0598.m1487((int) (((i8 + 0.5f) * i6) / iMin), 0, i6 - 1) + i5), num)).intValue();
                            int i9 = ((iIntValue >>> 8) & 255) * 183;
                            int i10 = (((iIntValue & 255) * 19) + (i9 + (((iIntValue >>> 16) & 255) * 54))) >>> 8;
                            if (i10 <= 24) {
                                i7++;
                            }
                            j += (long) i10;
                        }
                        float f = iMin;
                        return new C2739(i7 / f, j / f);
                    default:
                        C1446 c14462 = (C1446) c01722.f997;
                        int i11 = c14462.f6861;
                        int i12 = c14462.f6863 - i11;
                        int iMin2 = Math.min(i12, 96);
                        if (iMin2 < 1) {
                            iMin2 = 1;
                        }
                        int i13 = 0;
                        for (int i14 = 0; i14 < iMin2; i14++) {
                            int iIntValue2 = ((Number) c02162.mo511(num, Integer.valueOf(AbstractC0598.m1487((int) (((i14 + 0.5f) * i12) / iMin2), 0, i12 - 1) + i11))).intValue();
                            int i15 = ((iIntValue2 >>> 8) & 255) * 183;
                            int i16 = (((iIntValue2 & 255) * 19) + (i15 + (((iIntValue2 >>> 16) & 255) * 54))) >>> 8;
                            if (i16 <= 24) {
                                i13++;
                            }
                            j += (long) i16;
                        }
                        float f2 = iMin2;
                        return new C2739(i13 / f2, j / f2);
                }
            }
        }, new InterfaceC0477() { // from class: yyds.ᛵᛲᲈᛱ
            @Override // yyds.InterfaceC0477
            /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
            public final Object mo511(Object obj, Object obj2) {
                boolean zM3950;
                int i4 = i3;
                C0216 c02162 = c0216;
                C0172 c01722 = c0172;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                switch (i4) {
                    case 0:
                        C1446 c1446 = (C1446) c01722.f997;
                        zM3950 = AbstractC2071.m3950(new C1446(c1446.f6860, iIntValue, c1446.f6862, iIntValue2), c02162);
                        break;
                    default:
                        C1446 c14462 = (C1446) c01722.f997;
                        zM3950 = AbstractC2071.m3950(new C1446(iIntValue, c14462.f6861, iIntValue2, c14462.f6863), c02162);
                        break;
                }
                return Boolean.valueOf(zM3950);
            }
        });
        if (pairM3962 != null) {
            c0172.f997 = C1446.m2943((C1446) c0172.f997, 0, ((Number) pairM3962.component1()).intValue(), 0, i2 - ((Number) pairM3962.component2()).intValue(), 5);
        }
        final int i4 = 1;
        Pair pairM39622 = m3962(i, new InterfaceC1549() { // from class: yyds.ᛵᛸᛳᛷ
            @Override // yyds.InterfaceC1549
            /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
            public final Object mo371(Object obj) {
                int i42 = i4;
                long j = 0;
                C0216 c02162 = c0216;
                C0172 c01722 = c0172;
                Integer num = (Integer) obj;
                num.getClass();
                switch (i42) {
                    case 0:
                        C1446 c1446 = (C1446) c01722.f997;
                        int i5 = c1446.f6860;
                        int i6 = c1446.f6862 - i5;
                        int iMin = Math.min(i6, 96);
                        if (iMin < 1) {
                            iMin = 1;
                        }
                        int i7 = 0;
                        for (int i8 = 0; i8 < iMin; i8++) {
                            int iIntValue = ((Number) c02162.mo511(Integer.valueOf(AbstractC0598.m1487((int) (((i8 + 0.5f) * i6) / iMin), 0, i6 - 1) + i5), num)).intValue();
                            int i9 = ((iIntValue >>> 8) & 255) * 183;
                            int i10 = (((iIntValue & 255) * 19) + (i9 + (((iIntValue >>> 16) & 255) * 54))) >>> 8;
                            if (i10 <= 24) {
                                i7++;
                            }
                            j += (long) i10;
                        }
                        float f = iMin;
                        return new C2739(i7 / f, j / f);
                    default:
                        C1446 c14462 = (C1446) c01722.f997;
                        int i11 = c14462.f6861;
                        int i12 = c14462.f6863 - i11;
                        int iMin2 = Math.min(i12, 96);
                        if (iMin2 < 1) {
                            iMin2 = 1;
                        }
                        int i13 = 0;
                        for (int i14 = 0; i14 < iMin2; i14++) {
                            int iIntValue2 = ((Number) c02162.mo511(num, Integer.valueOf(AbstractC0598.m1487((int) (((i14 + 0.5f) * i12) / iMin2), 0, i12 - 1) + i11))).intValue();
                            int i15 = ((iIntValue2 >>> 8) & 255) * 183;
                            int i16 = (((iIntValue2 & 255) * 19) + (i15 + (((iIntValue2 >>> 16) & 255) * 54))) >>> 8;
                            if (i16 <= 24) {
                                i13++;
                            }
                            j += (long) i16;
                        }
                        float f2 = iMin2;
                        return new C2739(i13 / f2, j / f2);
                }
            }
        }, new InterfaceC0477() { // from class: yyds.ᛵᛲᲈᛱ
            @Override // yyds.InterfaceC0477
            /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
            public final Object mo511(Object obj, Object obj2) {
                boolean zM3950;
                int i42 = i4;
                C0216 c02162 = c0216;
                C0172 c01722 = c0172;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                switch (i42) {
                    case 0:
                        C1446 c1446 = (C1446) c01722.f997;
                        zM3950 = AbstractC2071.m3950(new C1446(c1446.f6860, iIntValue, c1446.f6862, iIntValue2), c02162);
                        break;
                    default:
                        C1446 c14462 = (C1446) c01722.f997;
                        zM3950 = AbstractC2071.m3950(new C1446(iIntValue, c14462.f6861, iIntValue2, c14462.f6863), c02162);
                        break;
                }
                return Boolean.valueOf(zM3950);
            }
        });
        if (pairM39622 != null) {
            c0172.f997 = C1446.m2943((C1446) c0172.f997, ((Number) pairM39622.component1()).intValue(), 0, i - ((Number) pairM39622.component2()).intValue(), 0, 10);
        }
        Object obj = c0172.f997;
        C1446 c1446 = (C1446) obj;
        return (C1446) ((c1446.f6860 > 0 || c1446.f6861 > 0 || c1446.f6862 < i || c1446.f6863 < i2) ? obj : null);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public static void m3952(Context context, C0324 c0324, InterfaceC2266 interfaceC2266) {
        EnumC1841 enumC1841;
        String strM4341;
        String str;
        String str2 = null;
        int i = 0;
        View viewInflate = AbstractC1115.m2309(context).inflate(R.layout.dialog_ab_test_editor, (ViewGroup) null, false);
        int i2 = R.id.abEditorCancel;
        TextView textView = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEditorCancel);
        if (textView != null) {
            i2 = R.id.abEditorDelete;
            TextView textView2 = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEditorDelete);
            if (textView2 != null) {
                i2 = R.id.abEditorEnabled;
                Switch r11 = (Switch) AbstractC1741.m3479(viewInflate, R.id.abEditorEnabled);
                if (r11 != null) {
                    i2 = R.id.abEditorError;
                    TextView textView3 = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEditorError);
                    if (textView3 != null) {
                        i2 = R.id.abEditorHint;
                        TextView textView4 = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEditorHint);
                        if (textView4 != null) {
                            i2 = R.id.abEditorKey;
                            EditText editText = (EditText) AbstractC1741.m3479(viewInflate, R.id.abEditorKey);
                            if (editText != null) {
                                i2 = R.id.abEditorSave;
                                TextView textView5 = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEditorSave);
                                if (textView5 != null) {
                                    i2 = R.id.abEditorTitle;
                                    TextView textView6 = (TextView) AbstractC1741.m3479(viewInflate, R.id.abEditorTitle);
                                    if (textView6 != null) {
                                        i2 = R.id.abEditorType;
                                        Spinner spinner = (Spinner) AbstractC1741.m3479(viewInflate, R.id.abEditorType);
                                        if (spinner != null) {
                                            i2 = R.id.abEditorValue;
                                            EditText editText2 = (EditText) AbstractC1741.m3479(viewInflate, R.id.abEditorValue);
                                            if (editText2 != null) {
                                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                                C2531 c2531 = new C2531(linearLayout, textView, textView2, r11, textView3, textView4, editText, textView5, textView6, spinner, editText2);
                                                AbstractC2328.m4341(-214726462833518L);
                                                C2701.f13261.getClass();
                                                C2701.m4793(linearLayout);
                                                Dialog dialog = new Dialog(context, android.R.style.Theme.Translucent.NoTitleBar);
                                                dialog.setContentView(linearLayout);
                                                dialog.setCanceledOnTouchOutside(false);
                                                m3960(dialog, context);
                                                C0468 c0468 = EnumC1841.f9223;
                                                ArrayList arrayList = new ArrayList(AbstractC0055.m419(c0468, 10));
                                                C0437 c0437 = new C0437(0, c0468);
                                                while (c0437.hasNext()) {
                                                    arrayList.add(((EnumC1841) c0437.next()).f9232);
                                                }
                                                C0094 c0094 = new C0094(context, arrayList);
                                                c0094.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                                                spinner.setAdapter((SpinnerAdapter) c0094);
                                                C2565 c2565 = c0324 != null ? c0324.f1708 : null;
                                                ((TextView) c2531.f12460).setText(AbstractC2328.m4341(c2565 == null ? -214782297408366L : -214825247081326L));
                                                EditText editText3 = (EditText) c2531.f12462;
                                                String strM43412 = c0324 != null ? c0324.f1704 : null;
                                                if (strM43412 == null) {
                                                    strM43412 = AbstractC2328.m4341(-214868196754286L);
                                                }
                                                editText3.setText(strM43412);
                                                if (c2565 == null || (enumC1841 = c2565.f12650) == null) {
                                                    enumC1841 = c0324 != null ? c0324.f1705 : EnumC1841.f9230;
                                                }
                                                int iIndexOf = c0468.indexOf(enumC1841);
                                                if (iIndexOf < 0) {
                                                    iIndexOf = 0;
                                                }
                                                spinner.setSelection(iIndexOf);
                                                EditText editText4 = (EditText) c2531.f12465;
                                                if (c2565 != null) {
                                                    strM4341 = c2565.f12651;
                                                } else {
                                                    if (c0324 != null && (str = c0324.f1707) != null && !str.equals(AbstractC2328.m4341(-214872491721582L))) {
                                                        str2 = str;
                                                    }
                                                    strM4341 = str2 == null ? AbstractC2328.m4341(-214893966558062L) : str2;
                                                }
                                                editText4.setText(strM4341);
                                                ((Switch) c2531.f12461).setChecked(c2565 != null ? c2565.f12652 : true);
                                                textView2.setVisibility(c2565 == null ? 8 : 0);
                                                spinner.setOnItemSelectedListener(new C1619(c0468, c2531));
                                                m3961(c0468, c2531);
                                                c2531.f12466.setOnClickListener(new ViewOnClickListenerC1393(dialog, 0));
                                                textView2.setOnClickListener(new ViewOnClickListenerC1192(c2565, interfaceC2266, dialog, i));
                                                ((TextView) c2531.f12463).setOnClickListener(new ViewOnClickListenerC0365(c2531, c0468, interfaceC2266, dialog, c2565, 0));
                                                dialog.show();
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
        C0188.m789(AbstractC2328.m4341(-1742764157600622L).concat(viewInflate.getResources().getResourceName(i2)));
    }

    /* JADX INFO: renamed from: ᛵᛶᛲᲀ, reason: contains not printable characters */
    public static Class m3953(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static C1110 m3954(InterfaceC0990 interfaceC0990, InterfaceC0477 interfaceC0477) {
        InterfaceC2213 interfaceC2213M989 = AbstractC0319.m989(interfaceC0990.mo119(), C2586.f12764, true);
        C1206 c1206 = AbstractC0221.f1238;
        if (interfaceC2213M989 != c1206 && interfaceC2213M989.mo423(C0135.f836) == null) {
            interfaceC2213M989 = interfaceC2213M989.mo422(c1206);
        }
        C1110 c1110 = new C1110(interfaceC2213M989, true);
        c1110.m813(1, c1110, interfaceC0477);
        return c1110;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛶᛳᛶᛵ, reason: contains not printable characters */
    public static final Object m3955(InterfaceC2213 interfaceC2213, InterfaceC0477 interfaceC0477, InterfaceC0274 interfaceC0274) {
        Unsafe unsafe;
        long j;
        InterfaceC2213 interfaceC2213Mo733 = interfaceC0274.mo733();
        InterfaceC2213 interfaceC2213Mo422 = !((Boolean) interfaceC2213.mo424(Boolean.FALSE, new C1936(7))).booleanValue() ? interfaceC2213Mo733.mo422(interfaceC2213) : AbstractC0319.m989(interfaceC2213Mo733, interfaceC2213, false);
        AbstractC0024.m3304(interfaceC2213Mo422);
        if (interfaceC2213Mo422 == interfaceC2213Mo733) {
            C1612 c1612 = new C1612(interfaceC2213Mo422, interfaceC0274);
            return AbstractC1917.m3704(c1612, c1612, interfaceC0477);
        }
        C0135 c0135 = C0135.f836;
        if (AbstractC1544.m3188(interfaceC2213Mo422.mo423(c0135), interfaceC2213Mo733.mo423(c0135))) {
            C2101 c2101 = new C2101(interfaceC2213Mo422, interfaceC0274);
            InterfaceC2213 interfaceC22132 = c2101.f1119;
            Object objM1832 = AbstractC0797.m1832(interfaceC22132, null);
            try {
                return AbstractC1917.m3704(c2101, c2101, interfaceC0477);
            } finally {
                AbstractC0797.m1826(interfaceC22132, objM1832);
            }
        }
        C1305 c1305 = new C1305(interfaceC2213Mo422, interfaceC0274);
        try {
            AbstractC0427.m1189(C2746.f13459, AbstractC1367.m2783(((AbstractC0332) interfaceC0477).mo630(c1305, c1305)));
            do {
                unsafe = AbstractC2112.f10448;
                j = C1305.f5970;
                int intVolatile = unsafe.getIntVolatile(c1305, j);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        C0188.m800("Already suspended");
                        return null;
                    }
                    Object objM1137 = AbstractC0395.m1137(c1305.m2163());
                    if (objM1137 instanceof C0417) {
                        throw ((C0417) objM1137).f2152;
                    }
                    return objM1137;
                }
            } while (!unsafe.compareAndSwapInt(c1305, j, 0, 1));
            return EnumC1765.f8858;
        } catch (Throwable th) {
            c1305.mo812(new C2658(th));
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public static final void m3956(InterfaceC2213 interfaceC2213, Throwable th) {
        try {
            if (((C0256) interfaceC2213.mo423(C0469.f2330)) != null) {
                return;
            }
            AbstractC2217.m4207(interfaceC2213, th);
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC1579.m3235(runtimeException, th);
                th = runtimeException;
            }
            AbstractC2217.m4207(interfaceC2213, th);
        }
    }

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public static MappedByteBuffer m3957(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: ᛷᛵᲇᲀ, reason: contains not printable characters */
    public static boolean m3958(BitmapFactory.Options options) {
        if (Build.VERSION.SDK_INT == 34 && options.inPreferredConfig == Bitmap.Config.HARDWARE) {
            return ((Boolean) f10226.get()).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static C0289 m3959(InterfaceC0990 interfaceC0990, InterfaceC2213 interfaceC2213, InterfaceC0477 interfaceC0477, int i) {
        if ((i & 1) != 0) {
            interfaceC2213 = C2586.f12764;
        }
        InterfaceC2213 interfaceC2213M989 = AbstractC0319.m989(interfaceC0990.mo119(), interfaceC2213, true);
        C1206 c1206 = AbstractC0221.f1238;
        if (interfaceC2213M989 != c1206 && interfaceC2213M989.mo423(C0135.f836) == null) {
            interfaceC2213M989 = interfaceC2213M989.mo422(c1206);
        }
        C0289 c0289 = new C0289(interfaceC2213M989, true);
        c0289.m813(1, c0289, interfaceC0477);
        return c0289;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m3960(Dialog dialog, Context context) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            window.setLayout(-1, (int) (context.getResources().getDisplayMetrics().heightPixels * 0.85f));
            window.setWindowAnimations(android.R.style.Animation.InputMethod);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(16);
        }
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public static final void m3961(C0468 c0468, C2531 c2531) {
        String strM4341;
        EnumC1841 enumC1841 = (EnumC1841) AbstractC1595.m3276(((Spinner) c2531.f12464).getSelectedItemPosition(), c0468);
        if (enumC1841 == null) {
            enumC1841 = EnumC1841.f9230;
        }
        TextView textView = (TextView) c2531.f12467;
        C1937.f9742.getClass();
        AbstractC2328.m4341(-602622139204462L);
        switch (enumC1841.ordinal()) {
            case 0:
                strM4341 = AbstractC2328.m4341(-602643614040942L);
                break;
            case 1:
                strM4341 = AbstractC2328.m4341(-602746693256046L);
                break;
            case 2:
                strM4341 = AbstractC2328.m4341(-602811117765486L);
                break;
            case 3:
                strM4341 = AbstractC2328.m4341(-602862657373038L);
                break;
            case 4:
                strM4341 = AbstractC2328.m4341(-602905607045998L);
                break;
            case 5:
                strM4341 = AbstractC2328.m4341(-602961441620846L);
                break;
            case 6:
                strM4341 = AbstractC2328.m4341(-603000096326510L);
                break;
            default:
                C0188.m801();
                return;
        }
        textView.setText(strM4341);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static Pair m3962(int i, InterfaceC1549 interfaceC1549, InterfaceC0477 interfaceC0477) {
        float f = i;
        int i2 = (int) (0.4f * f);
        if (i2 < 1) {
            i2 = 1;
        }
        int iM3947 = m3947(i, i2, true, interfaceC1549);
        int iM39472 = m3947(i, i2, false, interfaceC1549);
        int iM748 = AbstractC0181.m748(0.03f * f);
        if (iM748 < 2) {
            iM748 = 2;
        }
        if (iM3947 < iM748 || iM39472 < iM748) {
            return null;
        }
        if (Math.abs(iM3947 - iM39472) > Math.max(4, Math.max(AbstractC0181.m748(0.02f * f), AbstractC0181.m748(Math.max(iM3947, iM39472) * 0.08f)))) {
            return null;
        }
        int i3 = i - iM39472;
        if (i3 - iM3947 >= f * 0.2f && m3948(iM3947, 1, i, interfaceC1549) && m3948(i3 - 1, -1, i, interfaceC1549) && ((Boolean) interfaceC0477.mo511(Integer.valueOf(iM3947), Integer.valueOf(i3))).booleanValue()) {
            return new Pair(Integer.valueOf(iM3947), Integer.valueOf(iM39472));
        }
        return null;
    }
}
