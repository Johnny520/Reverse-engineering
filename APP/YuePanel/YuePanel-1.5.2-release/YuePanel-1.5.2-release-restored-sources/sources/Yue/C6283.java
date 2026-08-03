package Yue;

import Yue.C6273;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.C8770;
import androidx.constraintlayout.widget.C8778;
import androidx.constraintlayout.widget.C8790;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: Yue.ۥۡۡۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6283 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f15754 = "MotionScene";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final boolean f15755 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f15756 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f15757 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f15758 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f15759 = -2;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f15760 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f15761 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f15762 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f15763 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f15764 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f15765 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f15766 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f15767 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f15768 = 5;

    /* JADX INFO: renamed from: ۥ */
    public final C6273 f1971;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public MotionEvent f15780;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C6273.InterfaceC6277 f15783;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean f15784;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public float f15785;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public float f15786;

    /* JADX INFO: renamed from: ۥ۟ */
    public C8790 f1972 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C0952 f15769 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean f15770 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ArrayList<C0952> f15771 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C0952 f15772 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public ArrayList<C0952> f15773 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public SparseArray<C8770> f15774 = new SparseArray<>();

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public HashMap<String, Integer> f15775 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public SparseIntArray f15776 = new SparseIntArray();

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f15777 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int f15778 = 400;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int f15779 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public boolean f15781 = false;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean f15782 = false;

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۥ$ۥ */
    public class InterpolatorC0951 implements Interpolator {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C4586 f1973;

        public InterpolatorC0951(C4586 c4586) {
            this.f1973 = c4586;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            return (float) this.f1973.mo1543(f);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6283(C6273 c6273) {
        this.f1971 = c6273;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static String m19473(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m19474(C6273 c6273, int i) {
        for (C0952 c0952 : this.f15771) {
            if (c0952.f15803.size() > 0) {
                Iterator it = c0952.f15803.iterator();
                while (it.hasNext()) {
                    ((C0952.ViewOnClickListenerC6284) it.next()).m19566(c6273);
                }
            }
        }
        for (C0952 c09522 : this.f15773) {
            if (c09522.f15803.size() > 0) {
                Iterator it2 = c09522.f15803.iterator();
                while (it2.hasNext()) {
                    ((C0952.ViewOnClickListenerC6284) it2.next()).m19566(c6273);
                }
            }
        }
        for (C0952 c09523 : this.f15771) {
            if (c09523.f15803.size() > 0) {
                Iterator it3 = c09523.f15803.iterator();
                while (it3.hasNext()) {
                    ((C0952.ViewOnClickListenerC6284) it3.next()).m2757(c6273, i, c09523);
                }
            }
        }
        for (C0952 c09524 : this.f15773) {
            if (c09524.f15803.size() > 0) {
                Iterator it4 = c09524.f15803.iterator();
                while (it4.hasNext()) {
                    ((C0952.ViewOnClickListenerC6284) it4.next()).m2757(c6273, i, c09524);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m19475(C0952 c0952) {
        int iM19488 = m19488(c0952);
        if (iM19488 == -1) {
            this.f15771.add(c0952);
        } else {
            this.f15771.set(iM19488, c0952);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m19476(C6273 c6273, int i) {
        if (m19505() || this.f15770) {
            return false;
        }
        for (C0952 c0952 : this.f15771) {
            if (c0952.f15804 != 0 && this.f15769 != c0952) {
                if (i == c0952.f15794 && (c0952.f15804 == 4 || c0952.f15804 == 2)) {
                    C6273.EnumC6281 enumC6281 = C6273.EnumC6281.FINISHED;
                    c6273.setState(enumC6281);
                    c6273.setTransition(c0952);
                    if (c0952.f15804 == 4) {
                        c6273.m19414();
                        c6273.setState(C6273.EnumC6281.SETUP);
                        c6273.setState(C6273.EnumC6281.MOVING);
                    } else {
                        c6273.setProgress(1.0f);
                        c6273.m19388(true);
                        c6273.setState(C6273.EnumC6281.SETUP);
                        c6273.setState(C6273.EnumC6281.MOVING);
                        c6273.setState(enumC6281);
                        c6273.m19405();
                    }
                    return true;
                }
                if (i == c0952.f15793 && (c0952.f15804 == 3 || c0952.f15804 == 1)) {
                    C6273.EnumC6281 enumC62812 = C6273.EnumC6281.FINISHED;
                    c6273.setState(enumC62812);
                    c6273.setTransition(c0952);
                    if (c0952.f15804 == 3) {
                        c6273.m19415();
                        c6273.setState(C6273.EnumC6281.SETUP);
                        c6273.setState(C6273.EnumC6281.MOVING);
                    } else {
                        c6273.setProgress(0.0f);
                        c6273.m19388(true);
                        c6273.setState(C6273.EnumC6281.SETUP);
                        c6273.setState(C6273.EnumC6281.MOVING);
                        c6273.setState(enumC62812);
                        c6273.m19405();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C0952 m19477(int i, float f, float f2, MotionEvent motionEvent) {
        if (i == -1) {
            return this.f15769;
        }
        List<C0952> listM19502 = m19502(i);
        RectF rectF = new RectF();
        float f3 = 0.0f;
        C0952 c0952 = null;
        for (C0952 c09522 : listM19502) {
            if (!c09522.f15805 && c09522.f15802 != null) {
                c09522.f15802.m25071(this.f15784);
                RectF rectFM25062 = c09522.f15802.m25062(this.f1971, rectF);
                if (rectFM25062 == null || motionEvent == null || rectFM25062.contains(motionEvent.getX(), motionEvent.getY())) {
                    RectF rectFM250622 = c09522.f15802.m25062(this.f1971, rectF);
                    if (rectFM250622 == null || motionEvent == null || rectFM250622.contains(motionEvent.getX(), motionEvent.getY())) {
                        float fM3960 = c09522.f15802.m3960(f, f2) * (c09522.f15793 == i ? -1.0f : 1.1f);
                        if (fM3960 > f3) {
                            c0952 = c09522;
                            f3 = fM3960;
                        }
                    }
                }
            }
        }
        return c0952;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m19478(boolean z) {
        this.f15770 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m19479() {
        C0952 c0952 = this.f15769;
        if (c0952 != null) {
            return c0952.f15806;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C8770 m19480(int i) {
        return m19481(i, -1, -1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C8770 m19481(int i, int i2, int i3) {
        int iM29483;
        if (this.f15777) {
            PrintStream printStream = System.out;
            printStream.println("id " + i);
            printStream.println("size " + this.f15774.size());
        }
        C8790 c8790 = this.f1972;
        if (c8790 != null && (iM29483 = c8790.m29483(i, i2, i3)) != -1) {
            i = iM29483;
        }
        if (this.f15774.get(i) != null) {
            return this.f15774.get(i);
        }
        Log.e(f15754, "Warning could not find ConstraintSet id/" + C4308.m12435(this.f1971.getContext(), i) + " In MotionScene");
        SparseArray<C8770> sparseArray = this.f15774;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C8770 m19482(Context context, String str) {
        if (this.f15777) {
            PrintStream printStream = System.out;
            printStream.println("id " + str);
            printStream.println("size " + this.f15774.size());
        }
        for (int i = 0; i < this.f15774.size(); i++) {
            int iKeyAt = this.f15774.keyAt(i);
            String resourceName = context.getResources().getResourceName(iKeyAt);
            if (this.f15777) {
                System.out.println("Id for <" + i + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.f15774.get(iKeyAt);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int[] m19483() {
        int size = this.f15774.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = this.f15774.keyAt(i);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public ArrayList<C0952> m19484() {
        return this.f15771;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m19485() {
        C0952 c0952 = this.f15769;
        return c0952 != null ? c0952.f15798 : this.f15778;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m19486() {
        C0952 c0952 = this.f15769;
        if (c0952 == null) {
            return -1;
        }
        return c0952.f15793;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final int m19487(Context context, String str) {
        int identifier;
        if (str.contains("/")) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), Name.MARK, context.getPackageName());
            if (this.f15777) {
                System.out.println("id getMap res = " + identifier);
            }
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e(f15754, "error in parsing id");
        return identifier;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final int m19488(C0952 c0952) {
        int i = c0952.f1975;
        if (i == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i2 = 0; i2 < this.f15771.size(); i2++) {
            if (this.f15771.get(i2).f1975 == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public Interpolator m19489() {
        int i = this.f15769.f15795;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f1971.getContext(), this.f15769.f15797);
        }
        if (i == -1) {
            return new InterpolatorC0951(C4586.m13632(this.f15769.f15796));
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new AnticipateInterpolator();
        }
        if (i != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public AbstractC5616 m19490(Context context, int i, int i2, int i3) {
        C0952 c0952 = this.f15769;
        if (c0952 == null) {
            return null;
        }
        for (C5638 c5638 : c0952.f15801) {
            for (Integer num : c5638.m17502()) {
                if (i2 == num.intValue()) {
                    for (AbstractC5616 abstractC5616 : c5638.m17501(num.intValue())) {
                        if (abstractC5616.f1571 == i3 && abstractC5616.f13603 == i) {
                            return abstractC5616;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m19491(C6269 c6269) {
        C0952 c0952 = this.f15769;
        if (c0952 != null) {
            Iterator it = c0952.f15801.iterator();
            while (it.hasNext()) {
                ((C5638) it.next()).m2343(c6269);
            }
        } else {
            C0952 c09522 = this.f15772;
            if (c09522 != null) {
                Iterator it2 = c09522.f15801.iterator();
                while (it2.hasNext()) {
                    ((C5638) it2.next()).m2343(c6269);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public float m19492() {
        C0952 c0952 = this.f15769;
        if (c0952 == null || c0952.f15802 == null) {
            return 0.0f;
        }
        return this.f15769.f15802.m25058();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public float m19493() {
        C0952 c0952 = this.f15769;
        if (c0952 == null || c0952.f15802 == null) {
            return 0.0f;
        }
        return this.f15769.f15802.m25059();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean m19494() {
        C0952 c0952 = this.f15769;
        if (c0952 == null || c0952.f15802 == null) {
            return false;
        }
        return this.f15769.f15802.m25060();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public float m19495(View view, int i) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public float m19496(float f, float f2) {
        C0952 c0952 = this.f15769;
        if (c0952 == null || c0952.f15802 == null) {
            return 0.0f;
        }
        return this.f15769.f15802.m25061(f, f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final int m19497(int i) {
        int iM29483;
        C8790 c8790 = this.f1972;
        return (c8790 == null || (iM29483 = c8790.m29483(i, -1, -1)) == -1) ? i : iM29483;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public float m19498() {
        C0952 c0952 = this.f15769;
        if (c0952 != null) {
            return c0952.f15799;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int m19499() {
        C0952 c0952 = this.f15769;
        if (c0952 == null) {
            return -1;
        }
        return c0952.f15794;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C0952 m19500(int i) {
        for (C0952 c0952 : this.f15771) {
            if (c0952.f1975 == i) {
                return c0952;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public int m19501(int i) {
        Iterator<C0952> it = this.f15771.iterator();
        while (it.hasNext()) {
            if (it.next().f15794 == i) {
                return 0;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public List<C0952> m19502(int i) {
        int iM19497 = m19497(i);
        ArrayList arrayList = new ArrayList();
        for (C0952 c0952 : this.f15771) {
            if (c0952.f15794 == iM19497 || c0952.f15793 == iM19497) {
                arrayList.add(c0952);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final boolean m19503(int i) {
        int i2 = this.f15776.get(i);
        int size = this.f15776.size();
        while (i2 > 0) {
            if (i2 == i) {
                return true;
            }
            int i3 = size - 1;
            if (size < 0) {
                return true;
            }
            i2 = this.f15776.get(i2);
            size = i3;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public boolean m19504(View view, int i) {
        C0952 c0952 = this.f15769;
        if (c0952 == null) {
            return false;
        }
        Iterator it = c0952.f15801.iterator();
        while (it.hasNext()) {
            Iterator<AbstractC5616> it2 = ((C5638) it.next()).m17501(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f1571 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final boolean m19505() {
        return this.f15783 != null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final void m19506(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            C0952 c0952 = null;
            while (true) {
                byte b = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    if (this.f15777) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            b = !name.equals(C8770.f26658) ? (byte) -1 : (byte) 5;
                            break;
                        case -1239391468:
                            b = !name.equals("KeyFrameSet") ? (byte) -1 : (byte) 6;
                            break;
                        case 269306229:
                            if (!name.equals("Transition")) {
                                b = -1;
                            }
                            break;
                        case 312750793:
                            b = !name.equals("OnClick") ? (byte) -1 : (byte) 3;
                            break;
                        case 327855227:
                            b = !name.equals("OnSwipe") ? (byte) -1 : (byte) 2;
                            break;
                        case 793277014:
                            b = !name.equals(f15754) ? (byte) -1 : (byte) 0;
                            break;
                        case 1382829617:
                            b = !name.equals("StateSet") ? (byte) -1 : (byte) 4;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        case 0:
                            m19511(context, xml);
                            break;
                        case 1:
                            ArrayList<C0952> arrayList = this.f15771;
                            c0952 = new C0952(this, context, xml);
                            arrayList.add(c0952);
                            if (this.f15769 == null && !c0952.f1976) {
                                this.f15769 = c0952;
                                if (c0952.f15802 != null) {
                                    this.f15769.f15802.m25071(this.f15784);
                                }
                            }
                            if (c0952.f1976) {
                                if (c0952.f15793 == -1) {
                                    this.f15772 = c0952;
                                } else {
                                    this.f15773.add(c0952);
                                }
                                this.f15771.remove(c0952);
                            }
                            break;
                        case 2:
                            if (c0952 == null) {
                                Log.v(f15754, " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            c0952.f15802 = new C7945(context, this.f1971, xml);
                            break;
                        case 3:
                            c0952.m19544(context, xml);
                            break;
                        case 4:
                            this.f1972 = new C8790(context, xml);
                            break;
                        case 5:
                            m19510(context, xml);
                            break;
                        case 6:
                            c0952.f15801.add(new C5638(context, xml));
                            break;
                        default:
                            Log.v(f15754, "WARNING UNKNOWN ATTRIBUTE " + name);
                            break;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int m19507(String str) {
        return this.f15775.get(str).intValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public String m19508(int i) {
        for (Map.Entry<String, Integer> entry : this.f15775.entrySet()) {
            if (entry.getValue().intValue() == i) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public void m19509(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final void m19510(Context context, XmlPullParser xmlPullParser) {
        C8770 c8770 = new C8770();
        c8770.m29432(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int iM19487 = -1;
        int iM194872 = -1;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (this.f15777) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            if (attributeName.equals("deriveConstraintsFrom")) {
                iM194872 = m19487(context, attributeValue);
            } else if (attributeName.equals(Name.MARK)) {
                iM19487 = m19487(context, attributeValue);
                this.f15775.put(m19473(attributeValue), Integer.valueOf(iM19487));
            }
        }
        if (iM19487 != -1) {
            if (this.f1971.f15642 != 0) {
                c8770.m29456(true);
            }
            c8770.m29412(context, xmlPullParser);
            if (iM194872 != -1) {
                this.f15776.put(iM19487, iM194872);
            }
            this.f15774.put(iM19487, c8770);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final void m19511(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8778.C8789.f29224);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == C8778.C8789.f29225) {
                this.f15778 = typedArrayObtainStyledAttributes.getInt(index, this.f15778);
            } else if (index == C8778.C8789.f29226) {
                this.f15779 = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m19512(float f, float f2) {
        C0952 c0952 = this.f15769;
        if (c0952 == null || c0952.f15802 == null) {
            return;
        }
        this.f15769.f15802.m25065(f, f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void m19513(float f, float f2) {
        C0952 c0952 = this.f15769;
        if (c0952 == null || c0952.f15802 == null) {
            return;
        }
        this.f15769.f15802.m25066(f, f2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void m19514(MotionEvent motionEvent, int i, C6273 c6273) {
        C6273.InterfaceC6277 interfaceC6277;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f15783 == null) {
            this.f15783 = this.f1971.m19404();
        }
        this.f15783.mo19442(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f15785 = motionEvent.getRawX();
                this.f15786 = motionEvent.getRawY();
                this.f15780 = motionEvent;
                this.f15781 = false;
                if (this.f15769.f15802 != null) {
                    RectF rectFM25056 = this.f15769.f15802.m25056(this.f1971, rectF);
                    if (rectFM25056 != null && !rectFM25056.contains(this.f15780.getX(), this.f15780.getY())) {
                        this.f15780 = null;
                        this.f15781 = true;
                        return;
                    }
                    RectF rectFM25062 = this.f15769.f15802.m25062(this.f1971, rectF);
                    if (rectFM25062 == null || rectFM25062.contains(this.f15780.getX(), this.f15780.getY())) {
                        this.f15782 = false;
                    } else {
                        this.f15782 = true;
                    }
                    this.f15769.f15802.m25068(this.f15785, this.f15786);
                    return;
                }
                return;
            }
            if (action == 2 && !this.f15781) {
                float rawY = motionEvent.getRawY() - this.f15786;
                float rawX = motionEvent.getRawX() - this.f15785;
                if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f15780) == null) {
                    return;
                }
                C0952 c0952M19477 = m19477(i, rawX, rawY, motionEvent2);
                if (c0952M19477 != null) {
                    c6273.setTransition(c0952M19477);
                    RectF rectFM250622 = this.f15769.f15802.m25062(this.f1971, rectF);
                    if (rectFM250622 != null && !rectFM250622.contains(this.f15780.getX(), this.f15780.getY())) {
                        z = true;
                    }
                    this.f15782 = z;
                    this.f15769.f15802.m25073(this.f15785, this.f15786);
                }
            }
        }
        if (this.f15781) {
            return;
        }
        C0952 c0952 = this.f15769;
        if (c0952 != null && c0952.f15802 != null && !this.f15782) {
            this.f15769.f15802.m25064(motionEvent, this.f15783, i, this);
        }
        this.f15785 = motionEvent.getRawX();
        this.f15786 = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (interfaceC6277 = this.f15783) == null) {
            return;
        }
        interfaceC6277.recycle();
        this.f15783 = null;
        int i2 = c6273.f15624;
        if (i2 != -1) {
            m19476(c6273, i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final void m19515(int i) {
        int i2 = this.f15776.get(i);
        if (i2 > 0) {
            m19515(this.f15776.get(i));
            C8770 c8770 = this.f15774.get(i);
            C8770 c87702 = this.f15774.get(i2);
            if (c87702 != null) {
                c8770.m29419(c87702);
                this.f15776.put(i, -1);
            } else {
                Log.e(f15754, "ERROR! invalid deriveConstraintsFrom: @id/" + C4308.m12435(this.f1971.getContext(), i2));
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m19516(C6273 c6273) {
        for (int i = 0; i < this.f15774.size(); i++) {
            int iKeyAt = this.f15774.keyAt(i);
            if (m19503(iKeyAt)) {
                Log.e(f15754, "Cannot be derived from yourself");
                return;
            }
            m19515(iKeyAt);
        }
        for (int i2 = 0; i2 < this.f15774.size(); i2++) {
            this.f15774.valueAt(i2).m29418(c6273);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m19517(C0952 c0952) {
        int iM19488 = m19488(c0952);
        if (iM19488 != -1) {
            this.f15771.remove(iM19488);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m19518(int i, C8770 c8770) {
        this.f15774.put(i, c8770);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m19519(int i) {
        C0952 c0952 = this.f15769;
        if (c0952 != null) {
            c0952.m19562(i);
        } else {
            this.f15778 = i;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m19520(View view, int i, String str, Object obj) {
        C0952 c0952 = this.f15769;
        if (c0952 == null) {
            return;
        }
        Iterator it = c0952.f15801.iterator();
        while (it.hasNext()) {
            Iterator<AbstractC5616> it2 = ((C5638) it.next()).m17501(view.getId()).iterator();
            while (it2.hasNext()) {
                if (it2.next().f1571 == i) {
                    if (obj != null) {
                    }
                    str.equalsIgnoreCase("app:PerpendicularPath_percent");
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m19521(boolean z) {
        this.f15784 = z;
        C0952 c0952 = this.f15769;
        if (c0952 == null || c0952.f15802 == null) {
            return;
        }
        this.f15769.f15802.m25071(this.f15784);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m19522(int i, int i2) {
        int iM29483;
        int iM294832;
        C8790 c8790 = this.f1972;
        if (c8790 != null) {
            iM29483 = c8790.m29483(i, -1, -1);
            if (iM29483 == -1) {
                iM29483 = i;
            }
            iM294832 = this.f1972.m29483(i2, -1, -1);
            if (iM294832 == -1) {
            }
            for (C0952 c0952 : this.f15771) {
                if ((c0952.f15793 == iM294832 && c0952.f15794 == iM29483) || (c0952.f15793 == i2 && c0952.f15794 == i)) {
                    this.f15769 = c0952;
                    if (c0952 == null || c0952.f15802 == null) {
                        return;
                    }
                    this.f15769.f15802.m25071(this.f15784);
                    return;
                }
            }
            C0952 c09522 = this.f15772;
            for (C0952 c09523 : this.f15773) {
                if (c09523.f15793 == i2) {
                    c09522 = c09523;
                }
            }
            C0952 c09524 = new C0952(this, c09522);
            c09524.f15794 = iM29483;
            c09524.f15793 = iM294832;
            if (iM29483 != -1) {
                this.f15771.add(c09524);
            }
            this.f15769 = c09524;
        }
        iM29483 = i;
        iM294832 = i2;
        while (r3.hasNext()) {
        }
        C0952 c095222 = this.f15772;
        while (r3.hasNext()) {
        }
        C0952 c095242 = new C0952(this, c095222);
        c095242.f15794 = iM29483;
        c095242.f15793 = iM294832;
        if (iM29483 != -1) {
        }
        this.f15769 = c095242;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public void m19523(C0952 c0952) {
        this.f15769 = c0952;
        if (c0952 == null || c0952.f15802 == null) {
            return;
        }
        this.f15769.f15802.m25071(this.f15784);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m19524() {
        C0952 c0952 = this.f15769;
        if (c0952 == null || c0952.f15802 == null) {
            return;
        }
        this.f15769.f15802.m25074();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public boolean m19525() {
        Iterator<C0952> it = this.f15771.iterator();
        while (it.hasNext()) {
            if (it.next().f15802 != null) {
                return true;
            }
        }
        C0952 c0952 = this.f15769;
        return (c0952 == null || c0952.f15802 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public boolean m19526(C6273 c6273) {
        return c6273 == this.f1971 && c6273.f15620 == this;
    }

    public C6283(Context context, C6273 c6273, int i) {
        this.f1971 = c6273;
        m19506(context, i);
        this.f15774.put(C8778.C8783.f27848, new C8770());
        this.f15775.put("motion_base", Integer.valueOf(C8778.C8783.f27848));
    }

    /* JADX INFO: renamed from: Yue.ۥۡۡۥۥ$ۥ۟ */
    public static class C0952 {

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final int f15787 = 0;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final int f15788 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final int f15789 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final int f15790 = 3;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final int f15791 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static final int f15792 = 1;

        /* JADX INFO: renamed from: ۥ */
        public int f1975;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f1976;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f15793;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f15794;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f15795;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public String f15796;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f15797;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f15798;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public float f15799;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final C6283 f15800;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public ArrayList<C5638> f15801;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public C7945 f15802;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public ArrayList<ViewOnClickListenerC6284> f15803;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int f15804;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public boolean f15805;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public int f15806;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f15807;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public int f15808;

        /* JADX INFO: renamed from: Yue.ۥۡۡۥۥ$ۥ۟$ۥ, reason: contains not printable characters */
        public static class ViewOnClickListenerC6284 implements View.OnClickListener {

            /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
            public static final int f15809 = 1;

            /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
            public static final int f15810 = 17;

            /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
            public static final int f15811 = 16;

            /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
            public static final int f15812 = 256;

            /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
            public static final int f15813 = 4096;

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final C0952 f15814;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public int f15815;

            /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
            public int f15816;

            public ViewOnClickListenerC6284(Context context, C0952 c0952, XmlPullParser xmlPullParser) {
                this.f15815 = -1;
                this.f15816 = 17;
                this.f15814 = c0952;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C8778.C8789.f29231);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == C8778.C8789.f29233) {
                        this.f15815 = typedArrayObtainStyledAttributes.getResourceId(index, this.f15815);
                    } else if (index == C8778.C8789.f29232) {
                        this.f15816 = typedArrayObtainStyledAttributes.getInt(index, this.f15816);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C6273 c6273 = this.f15814.f15800.f1971;
                if (c6273.m19402()) {
                    if (this.f15814.f15794 == -1) {
                        int currentState = c6273.getCurrentState();
                        if (currentState == -1) {
                            c6273.m19416(this.f15814.f15793);
                            return;
                        }
                        C0952 c0952 = new C0952(this.f15814.f15800, this.f15814);
                        c0952.f15794 = currentState;
                        c0952.f15793 = this.f15814.f15793;
                        c6273.setTransition(c0952);
                        c6273.m19414();
                        return;
                    }
                    C0952 c09522 = this.f15814.f15800.f15769;
                    int i = this.f15816;
                    boolean z = false;
                    boolean z2 = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                    boolean z3 = ((i & 16) == 0 && (i & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        C0952 c09523 = this.f15814.f15800.f15769;
                        C0952 c09524 = this.f15814;
                        if (c09523 != c09524) {
                            c6273.setTransition(c09524);
                        }
                        if (c6273.getCurrentState() != c6273.getEndState() && c6273.getProgress() <= 0.5f) {
                            z3 = false;
                            z = z2;
                        }
                    } else {
                        z = z2;
                    }
                    if (m2758(c09522, c6273)) {
                        if (z && (this.f15816 & 1) != 0) {
                            c6273.setTransition(this.f15814);
                            c6273.m19414();
                            return;
                        }
                        if (z3 && (this.f15816 & 16) != 0) {
                            c6273.setTransition(this.f15814);
                            c6273.m19415();
                        } else if (z && (this.f15816 & 256) != 0) {
                            c6273.setTransition(this.f15814);
                            c6273.setProgress(1.0f);
                        } else {
                            if (!z3 || (this.f15816 & 4096) == 0) {
                                return;
                            }
                            c6273.setTransition(this.f15814);
                            c6273.setProgress(0.0f);
                        }
                    }
                }
            }

            /* JADX INFO: renamed from: ۥ */
            public void m2757(C6273 c6273, int i, C0952 c0952) {
                int i2 = this.f15815;
                View viewFindViewById = c6273;
                if (i2 != -1) {
                    viewFindViewById = c6273.findViewById(i2);
                }
                if (viewFindViewById == null) {
                    Log.e(C6283.f15754, "OnClick could not find id " + this.f15815);
                    return;
                }
                int i3 = c0952.f15794;
                int i4 = c0952.f15793;
                if (i3 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i5 = this.f15816;
                boolean z = false;
                boolean z2 = ((i5 & 1) != 0 && i == i3) | ((i5 & 1) != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z = true;
                }
                if (z2 || z) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            /* JADX INFO: renamed from: ۥ۟ */
            public boolean m2758(C0952 c0952, C6273 c6273) {
                C0952 c09522 = this.f15814;
                if (c09522 == c0952) {
                    return true;
                }
                int i = c09522.f15793;
                int i2 = this.f15814.f15794;
                if (i2 == -1) {
                    return c6273.f15624 != i;
                }
                int i3 = c6273.f15624;
                return i3 == i2 || i3 == i;
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public void m19566(C6273 c6273) {
                int i = this.f15815;
                if (i == -1) {
                    return;
                }
                View viewFindViewById = c6273.findViewById(i);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e(C6283.f15754, " (*)  could not find id " + this.f15815);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0952(C6283 c6283, C0952 c0952) {
            this.f1975 = -1;
            this.f1976 = false;
            this.f15793 = -1;
            this.f15794 = -1;
            this.f15795 = 0;
            this.f15796 = null;
            this.f15797 = -1;
            this.f15798 = 400;
            this.f15799 = 0.0f;
            this.f15801 = new ArrayList<>();
            this.f15802 = null;
            this.f15803 = new ArrayList<>();
            this.f15804 = 0;
            this.f15805 = false;
            this.f15806 = -1;
            this.f15807 = 0;
            this.f15808 = 0;
            this.f15800 = c6283;
            if (c0952 != null) {
                this.f15806 = c0952.f15806;
                this.f15795 = c0952.f15795;
                this.f15796 = c0952.f15796;
                this.f15797 = c0952.f15797;
                this.f15798 = c0952.f15798;
                this.f15801 = c0952.f15801;
                this.f15799 = c0952.f15799;
                this.f15807 = c0952.f15807;
            }
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public void m19544(Context context, XmlPullParser xmlPullParser) {
            this.f15803.add(new ViewOnClickListenerC6284(context, this, xmlPullParser));
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public String m19545(Context context) {
            String resourceEntryName = this.f15794 == -1 ? "null" : context.getResources().getResourceEntryName(this.f15794);
            if (this.f15793 == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f15793);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final void m19546(C6283 c6283, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                if (index == C8778.C8789.f29390) {
                    this.f15793 = typedArray.getResourceId(index, this.f15793);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f15793))) {
                        C8770 c8770 = new C8770();
                        c8770.m29411(context, this.f15793);
                        c6283.f15774.append(this.f15793, c8770);
                    }
                } else if (index == C8778.C8789.f29391) {
                    this.f15794 = typedArray.getResourceId(index, this.f15794);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f15794))) {
                        C8770 c87702 = new C8770();
                        c87702.m29411(context, this.f15794);
                        c6283.f15774.append(this.f15794, c87702);
                    }
                } else if (index == C8778.C8789.f29394) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f15797 = resourceId;
                        if (resourceId != -1) {
                            this.f15795 = -2;
                        }
                    } else if (i2 == 3) {
                        String string = typedArray.getString(index);
                        this.f15796 = string;
                        if (string.indexOf("/") > 0) {
                            this.f15797 = typedArray.getResourceId(index, -1);
                            this.f15795 = -2;
                        } else {
                            this.f15795 = -1;
                        }
                    } else {
                        this.f15795 = typedArray.getInteger(index, this.f15795);
                    }
                } else if (index == C8778.C8789.f29392) {
                    this.f15798 = typedArray.getInt(index, this.f15798);
                } else if (index == C8778.C8789.f29396) {
                    this.f15799 = typedArray.getFloat(index, this.f15799);
                } else if (index == C8778.C8789.f29389) {
                    this.f15804 = typedArray.getInteger(index, this.f15804);
                } else if (index == C8778.C8789.f29388) {
                    this.f1975 = typedArray.getResourceId(index, this.f1975);
                } else if (index == C8778.C8789.f29397) {
                    this.f15805 = typedArray.getBoolean(index, this.f15805);
                } else if (index == C8778.C8789.f29395) {
                    this.f15806 = typedArray.getInteger(index, -1);
                } else if (index == C8778.C8789.f29393) {
                    this.f15807 = typedArray.getInteger(index, 0);
                } else if (index == C8778.C8789.f29398) {
                    this.f15808 = typedArray.getInteger(index, 0);
                }
            }
            if (this.f15794 == -1) {
                this.f1976 = true;
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final void m19547(C6283 c6283, Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f29387);
            m19546(c6283, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int m19548() {
            return this.f15804;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int m19549() {
            return this.f15798;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public int m19550() {
            return this.f15793;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public int m19551() {
            return this.f1975;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public List<C5638> m19552() {
            return this.f15801;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public int m19553() {
            return this.f15807;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public List<ViewOnClickListenerC6284> m19554() {
            return this.f15803;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public int m19555() {
            return this.f15806;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public float m19556() {
            return this.f15799;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public int m19557() {
            return this.f15794;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public C7945 m19558() {
            return this.f15802;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public boolean m19559() {
            return !this.f15805;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public boolean m19560(int i) {
            return (i & this.f15808) != 0;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public void m19561(int i) {
            this.f15804 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public void m19562(int i) {
            this.f15798 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public void m19563(boolean z) {
            this.f15805 = !z;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public void m19564(int i) {
            this.f15806 = i;
        }

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public void m19565(float f) {
            this.f15799 = f;
        }

        public C0952(int i, C6283 c6283, int i2, int i3) {
            this.f1975 = -1;
            this.f1976 = false;
            this.f15793 = -1;
            this.f15794 = -1;
            this.f15795 = 0;
            this.f15796 = null;
            this.f15797 = -1;
            this.f15798 = 400;
            this.f15799 = 0.0f;
            this.f15801 = new ArrayList<>();
            this.f15802 = null;
            this.f15803 = new ArrayList<>();
            this.f15804 = 0;
            this.f15805 = false;
            this.f15806 = -1;
            this.f15807 = 0;
            this.f15808 = 0;
            this.f1975 = i;
            this.f15800 = c6283;
            this.f15794 = i2;
            this.f15793 = i3;
            this.f15798 = c6283.f15778;
            this.f15807 = c6283.f15779;
        }

        public C0952(C6283 c6283, Context context, XmlPullParser xmlPullParser) {
            this.f1975 = -1;
            this.f1976 = false;
            this.f15793 = -1;
            this.f15794 = -1;
            this.f15795 = 0;
            this.f15796 = null;
            this.f15797 = -1;
            this.f15798 = 400;
            this.f15799 = 0.0f;
            this.f15801 = new ArrayList<>();
            this.f15802 = null;
            this.f15803 = new ArrayList<>();
            this.f15804 = 0;
            this.f15805 = false;
            this.f15806 = -1;
            this.f15807 = 0;
            this.f15808 = 0;
            this.f15798 = c6283.f15778;
            this.f15807 = c6283.f15779;
            this.f15800 = c6283;
            m19547(c6283, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}
