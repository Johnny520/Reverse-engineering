package yyds;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p000ss.android.ugc.aweme.yyds.R;
import com.qmdeve.blurview.widget.BlurView;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: yyds.ᛶᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1435 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1435 f6790;

    static {
        AbstractC2328.m4341(-594659269837678L);
        f6790 = new C1435();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2930(ViewGroup viewGroup) {
        int color;
        Bitmap bitmapDecodeByteArray;
        if (viewGroup == null) {
            return;
        }
        C1509.f7142.getClass();
        if (C1509.m3062()) {
            int iM1487 = AbstractC0598.m1487((C1509.m3041() * 255) / 100, 0, 255);
            String str = (String) C1509.f7201.m1579(C1509.f7179[72]);
            if (str.length() > 0) {
                try {
                    byte[] bArrDecode = Base64.decode(str, 2);
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                } catch (Exception unused) {
                    bitmapDecodeByteArray = null;
                }
                if (bitmapDecodeByteArray != null) {
                    C1509.f7142.getClass();
                    Drawable c1306 = new C1306(bitmapDecodeByteArray, ((Number) C1509.f7270.m1579(C1509.f7179[73])).intValue());
                    c1306.setAlpha(iM1487);
                    viewGroup.setBackground(c1306);
                    return;
                }
            }
            try {
                C1509.f7142.getClass();
                color = Color.parseColor(C1509.m3107()) & 16777215;
            } catch (Exception unused2) {
                color = 16119285;
            }
            int i = (iM1487 << 24) | color;
            LinkedHashMap linkedHashMap = AbstractC1426.f6739;
            AbstractC2328.m4341(-695303238484846L);
            Drawable background = viewGroup.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(i);
                return;
            }
            if (background instanceof RippleDrawable) {
                Drawable drawable = ((RippleDrawable) background).getDrawable(0);
                if (drawable instanceof GradientDrawable) {
                    ((GradientDrawable) drawable).setColor(i);
                    return;
                }
                return;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(20.0f);
            gradientDrawable.setColor(i);
            viewGroup.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m2931(C1435 c1435) {
        WeakReference weakReference = AbstractC0606.f2906;
        ViewGroup viewGroup = weakReference != null ? (ViewGroup) weakReference.get() : null;
        c1435.getClass();
        m2930(viewGroup);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m2932(C1435 c1435) {
        ViewGroup viewGroup;
        BlurView blurView;
        c1435.getClass();
        WeakReference weakReference = AbstractC0606.f2906;
        if (weakReference == null || (viewGroup = (ViewGroup) weakReference.get()) == null) {
            return;
        }
        viewGroup.setBackgroundColor(0);
        View viewFindViewById = viewGroup.findViewById(R.id.blurParentView);
        if (viewFindViewById == null) {
            C2336.f11496.m4354(AbstractC2328.m4341(-594225478140782L));
            C2701 c2701 = C2701.f13261;
            Context context = viewGroup.getContext();
            c2701.getClass();
            C2701.m4807(context);
            View viewInflate = AbstractC1115.m2309(viewGroup.getContext()).inflate(R.layout.blur_view_layout, (ViewGroup) null, false);
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
            blurView = (BlurView) AbstractC1741.m3479(viewInflate, R.id.blurView);
            if (blurView == null) {
                C0188.m789(AbstractC2328.m4341(-1748850126259054L).concat(viewInflate.getResources().getResourceName(R.id.blurView)));
                return;
            } else {
                AbstractC2328.m4341(-594285607682926L);
                viewGroup.addView(relativeLayout, 0);
            }
        } else {
            blurView = (BlurView) viewFindViewById.findViewById(R.id.blurView);
        }
        C1509.f7142.getClass();
        blurView.setBlurRadius(C1509.m3071());
        blurView.setOverlayColor(C1509.m3079());
        blurView.setCornerRadius(((Number) C1509.f7193.m1579(C1509.f7179[78])).floatValue());
        blurView.setDownsampleFactor(C1509.m3063());
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m2933() {
        ViewGroup viewGroup;
        View viewFindViewById;
        try {
            WeakReference weakReference = AbstractC0606.f2906;
            if (weakReference == null || (viewGroup = (ViewGroup) weakReference.get()) == null || (viewFindViewById = viewGroup.findViewById(R.id.blurParentView)) == null) {
                return;
            }
            BlurView blurView = (BlurView) viewFindViewById.findViewById(R.id.blurView);
            C2336.f11496.m4357(AbstractC2328.m4341(-594066564350830L) + blurView);
            if (blurView != null) {
                blurView.m3718();
            }
            viewGroup.removeView(viewFindViewById);
        } catch (Exception e) {
            C2336.f11496.m4355(AbstractC2328.m4341(-594143873762158L), e);
        }
    }
}
