package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import io.github.cherrywechat.R;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: az */
/* JADX INFO: loaded from: classes.dex */
public final class C1196az {

    /* JADX INFO: renamed from: a */
    public int f4104a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1006Xb f4105b;

    /* JADX INFO: renamed from: c */
    public int[][] f4106c = new int[10][];

    /* JADX INFO: renamed from: d */
    public InterfaceC1006Xb[] f4107d = new InterfaceC1006Xb[10];

    /* JADX INFO: renamed from: b */
    public static C1196az m2313b(InterfaceC1006Xb interfaceC1006Xb) {
        C1196az c1196az = new C1196az();
        c1196az.m2314a(StateSet.WILD_CARD, interfaceC1006Xb);
        return c1196az;
    }

    /* JADX INFO: renamed from: a */
    public final void m2314a(int[] iArr, InterfaceC1006Xb interfaceC1006Xb) {
        int i = this.f4104a;
        if (i == 0 || iArr.length == 0) {
            this.f4105b = interfaceC1006Xb;
        }
        int[][] iArr2 = this.f4106c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f4106c = iArr3;
            InterfaceC1006Xb[] interfaceC1006XbArr = new InterfaceC1006Xb[i2];
            System.arraycopy(this.f4107d, 0, interfaceC1006XbArr, 0, i);
            this.f4107d = interfaceC1006XbArr;
        }
        int[][] iArr4 = this.f4106c;
        int i3 = this.f4104a;
        iArr4[i3] = iArr;
        this.f4107d[i3] = interfaceC1006Xb;
        this.f4104a = i3 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1006Xb m2315c(int[] iArr) {
        int i;
        int[][] iArr2 = this.f4106c;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (i3 >= this.f4104a) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f4106c;
            while (true) {
                if (i2 >= this.f4104a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i2], iArr3)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            i3 = i;
        }
        return i3 < 0 ? this.f4105b : this.f4107d[i3];
    }

    /* JADX INFO: renamed from: d */
    public final void m2316d(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = AbstractC0939Vu.f2956y;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                InterfaceC1006Xb interfaceC1006XbM1513c = C0728Qx.m1513c(typedArrayObtainAttributes, 5, new C2436r(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i] = attributeNameResource;
                        i = i3;
                    }
                }
                m2314a(StateSet.trimStateSet(iArr2, i), interfaceC1006XbM1513c);
            }
        }
    }
}
