package yyds;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲈᛵᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2661 implements InterfaceC2266 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f13063;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f13064;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ Object f13065;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ Object f13066;

    public /* synthetic */ C2661(Object obj, Object obj2, Object obj3, int i) {
        this.f13064 = i;
        this.f13066 = obj;
        this.f13063 = obj2;
        this.f13065 = obj3;
    }

    @Override // yyds.InterfaceC2266
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final Object mo731() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int i = this.f13064;
        C2746 c2746 = C2746.f13459;
        Object obj = this.f13065;
        Object obj2 = this.f13063;
        Object obj3 = this.f13066;
        switch (i) {
            case 0:
                AlertDialog alertDialog = (AlertDialog) obj;
                C0078 c0078 = C2604.f12804;
                C2604.m4681((Activity) obj3, AbstractC2328.m4341(-207231744901998L));
                C0174.f998.getClass();
                C0174.m735();
                InterfaceC2798 interfaceC2798 = (InterfaceC2798) ((C0172) obj2).f997;
                if (interfaceC2798 != null) {
                    interfaceC2798.mo2093(null);
                }
                alertDialog.dismiss();
                AbstractC0027.m3912().putBoolean(AbstractC2328.m4341(-207261809673070L), true);
                return c2746;
            case 1:
                return ((C2342) obj3).f11510.mo662(((C1618) obj).f8234.f670, ((C2126) obj2).m4040());
            case 2:
                C2419.m4468((C2803) obj3, (Context) obj2, (String) obj);
                return c2746;
            case 3:
                C1776.m3532((C2803) obj3, (Context) obj2, (String) obj);
                return c2746;
            case 4:
                WeakReference weakReference = (WeakReference) obj2;
                ArrayList<Pair> arrayList = (ArrayList) obj;
                View view = (View) ((WeakReference) obj3).get();
                if (view != null) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                }
                LinearLayout linearLayout = (LinearLayout) weakReference.get();
                if (linearLayout != null) {
                    ViewParent parent2 = linearLayout.getParent();
                    ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(linearLayout);
                    }
                }
                for (Pair pair : arrayList) {
                    WeakReference weakReference2 = (WeakReference) pair.component1();
                    int[] iArr = (int[]) pair.component2();
                    LinearLayout linearLayout2 = (LinearLayout) weakReference2.get();
                    if (linearLayout2 != null) {
                        linearLayout2.setPadding(iArr[0], iArr[1], iArr[2], iArr[3]);
                    }
                }
                return c2746;
            case 5:
                C2133 c2133 = (C2133) obj3;
                C0644 c0644 = (C0644) obj;
                String strM4341 = ((User) obj2).uid;
                if (strM4341 == null) {
                    strM4341 = AbstractC2328.m4341(-906774543237998L);
                }
                boolean zM4054 = c2133.m4054(strM4341, AbstractC2328.m4341(-906787428139886L));
                TextView textView = (TextView) c0644.f3101;
                if (zM4054) {
                    textView.setText(AbstractC2328.m4341(-906800313041774L));
                } else {
                    textView.setText(AbstractC2328.m4341(-906830377812846L));
                }
                return c2746;
            default:
                Resources resources = (Resources) obj;
                Method declaredMethod = AssetManager.class.getDeclaredMethod(AbstractC2328.m4341(-746297385190254L), String.class);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke((AssetManager) obj3, (String) obj2);
                Integer num = objInvoke instanceof Integer ? (Integer) objInvoke : null;
                if ((num != null ? num.intValue() : 0) == 0) {
                    C0188.m800(AbstractC2328.m4341(-746353219765102L));
                    return null;
                }
                String resourceName = resources.getResourceName(R.layout.dialog_setting_layout);
                if (AbstractC0692.m1600(resourceName, AbstractC2328.m4341(-746486363751278L), false)) {
                    return Boolean.TRUE;
                }
                throw new Resources.NotFoundException(AbstractC2328.m4341(-746615212770158L).concat(resourceName));
        }
    }
}
