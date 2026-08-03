package androidx.constraintlayout.widget;

import Yue.C4128;
import Yue.C4308;
import Yue.C4586;
import Yue.C5281;
import Yue.C6283;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1643;
import androidx.constraintlayout.widget.C8774;
import androidx.constraintlayout.widget.C8778;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8770 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f26658 = "ConstraintSet";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final String f26659 = "XML parser error must be within a Constraint ";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f26660 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f26661 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f26662 = -2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f26663 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f26664 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f26665 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f26666 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f26667 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f26668 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f26669 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f26670 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f26671 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f26672 = 8;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f26673 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final int f26674 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f26675 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f26676 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final int f26677 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final int f26678 = 6;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final int f26679 = 7;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f26680 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final int f26681 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f26682 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f26683 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f26684 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final boolean f26685 = false;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int[] f26686 = {0, 4, 8};

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f26687 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static SparseIntArray f26688 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f26689 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f26690 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f26691 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f26692 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f26693 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f26694 = 6;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f26695 = 7;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f26696 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f26697 = 9;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int f26698 = 10;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static final int f26699 = 11;

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public static final int f26700 = 12;

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public static final int f26701 = 13;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f26702 = 14;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final int f26703 = 15;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f26704 = 16;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f26705 = 17;

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public static final int f26706 = 18;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int f26707 = 19;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public static final int f26708 = 20;

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public static final int f26709 = 21;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final int f26710 = 22;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final int f26711 = 23;

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public static final int f26712 = 24;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public static final int f26713 = 25;

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public static final int f26714 = 26;

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public static final int f26715 = 27;

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public static final int f26716 = 28;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public static final int f26717 = 29;

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public static final int f26718 = 30;

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public static final int f26719 = 31;

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public static final int f26720 = 32;

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static final int f26721 = 33;

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public static final int f26722 = 34;

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public static final int f26723 = 35;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public static final int f26724 = 36;

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public static final int f26725 = 37;

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public static final int f26726 = 38;

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public static final int f26727 = 39;

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public static final int f26728 = 40;

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public static final int f26729 = 41;

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public static final int f26730 = 42;

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public static final int f26731 = 43;

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public static final int f26732 = 44;

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public static final int f26733 = 45;

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public static final int f26734 = 46;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public static final int f26735 = 47;

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public static final int f26736 = 48;

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public static final int f26737 = 49;

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public static final int f26738 = 50;

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public static final int f26739 = 51;

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public static final int f26740 = 52;

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public static final int f26741 = 53;

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public static final int f26742 = 54;

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public static final int f26743 = 55;

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public static final int f26744 = 56;

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static final int f26745 = 57;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public static final int f26746 = 58;

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public static final int f26747 = 59;

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static final int f26748 = 60;

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public static final int f26749 = 61;

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public static final int f26750 = 62;

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public static final int f26751 = 63;

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public static final int f26752 = 64;

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public static final int f26753 = 65;

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public static final int f26754 = 66;

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public static final int f26755 = 67;

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public static final int f26756 = 68;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public static final int f26757 = 69;

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public static final int f26758 = 70;

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public static final int f26759 = 71;

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public static final int f26760 = 72;

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public static final int f26761 = 73;

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public static final int f26762 = 74;

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public static final int f26763 = 75;

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public static final int f26764 = 76;

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public static final int f26765 = 77;

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public static final int f26766 = 78;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final int f26767 = 79;

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public static final int f26768 = 80;

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public static final int f26769 = 81;

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public static final int f26770 = 82;

    /* JADX INFO: renamed from: ۥ */
    public boolean f3702;

    /* JADX INFO: renamed from: ۥ۟ */
    public HashMap<String, C1643> f3703 = new HashMap<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f26771 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public HashMap<Integer, C1646> f26772 = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ */
    public static class C1646 {

        /* JADX INFO: renamed from: ۥ */
        public int f3704;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C8772 f3705 = new C8772();

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C8771 f26773 = new C8771();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C1647 f26774 = new C1647();

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C8773 f26775 = new C8773();

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public HashMap<String, C1643> f26776 = new HashMap<>();

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m29468(ConstraintLayout.C1641 c1641) {
            C1647 c1647 = this.f26774;
            c1641.f26478 = c1647.f26835;
            c1641.f26479 = c1647.f26836;
            c1641.f26480 = c1647.f26837;
            c1641.f26481 = c1647.f26838;
            c1641.f26482 = c1647.f26839;
            c1641.f26483 = c1647.f26840;
            c1641.f26484 = c1647.f26841;
            c1641.f26485 = c1647.f26842;
            c1641.f26486 = c1647.f26843;
            c1641.f26490 = c1647.f26844;
            c1641.f26491 = c1647.f26845;
            c1641.f26492 = c1647.f26846;
            c1641.f26493 = c1647.f26847;
            ((ViewGroup.MarginLayoutParams) c1641).leftMargin = c1647.f26857;
            ((ViewGroup.MarginLayoutParams) c1641).rightMargin = c1647.f26858;
            ((ViewGroup.MarginLayoutParams) c1641).topMargin = c1647.f26859;
            ((ViewGroup.MarginLayoutParams) c1641).bottomMargin = c1647.f26860;
            c1641.f26498 = c1647.f26868;
            c1641.f26499 = c1647.f26867;
            c1641.f26495 = c1647.f26864;
            c1641.f26497 = c1647.f26866;
            c1641.f26500 = c1647.f26848;
            c1641.f26501 = c1647.f26849;
            c1641.f26487 = c1647.f26851;
            c1641.f26488 = c1647.f26852;
            c1641.f26489 = c1647.f26853;
            c1641.f26502 = c1647.f26850;
            c1641.f26517 = c1647.f26854;
            c1641.f26518 = c1647.f26855;
            c1641.f26506 = c1647.f26869;
            c1641.f26505 = c1647.f26870;
            c1641.f26508 = c1647.f26872;
            c1641.f26507 = c1647.f26871;
            c1641.f26520 = c1647.f26887;
            c1641.f26521 = c1647.f26888;
            c1641.f26509 = c1647.f26873;
            c1641.f26510 = c1647.f26874;
            c1641.f26513 = c1647.f26875;
            c1641.f26514 = c1647.f26876;
            c1641.f26511 = c1647.f26877;
            c1641.f26512 = c1647.f26878;
            c1641.f26515 = c1647.f26879;
            c1641.f26516 = c1647.f26880;
            c1641.f26519 = c1647.f26856;
            c1641.f26477 = c1647.f26834;
            c1641.f3685 = c1647.f26832;
            c1641.f3686 = c1647.f26833;
            ((ViewGroup.MarginLayoutParams) c1641).width = c1647.f26830;
            ((ViewGroup.MarginLayoutParams) c1641).height = c1647.f26831;
            String str = c1647.f26886;
            if (str != null) {
                c1641.f26522 = str;
            }
            c1641.setMarginStart(c1647.f26862);
            c1641.setMarginEnd(this.f26774.f26861);
            c1641.m29262();
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C1646 clone() {
            C1646 c1646 = new C1646();
            c1646.f26774.m4720(this.f26774);
            c1646.f26773.m4722(this.f26773);
            c1646.f3705.m4724(this.f3705);
            c1646.f26775.m4726(this.f26775);
            c1646.f3704 = this.f3704;
            return c1646;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public final void m29470(int i, ConstraintLayout.C1641 c1641) {
            this.f3704 = i;
            C1647 c1647 = this.f26774;
            c1647.f26835 = c1641.f26478;
            c1647.f26836 = c1641.f26479;
            c1647.f26837 = c1641.f26480;
            c1647.f26838 = c1641.f26481;
            c1647.f26839 = c1641.f26482;
            c1647.f26840 = c1641.f26483;
            c1647.f26841 = c1641.f26484;
            c1647.f26842 = c1641.f26485;
            c1647.f26843 = c1641.f26486;
            c1647.f26844 = c1641.f26490;
            c1647.f26845 = c1641.f26491;
            c1647.f26846 = c1641.f26492;
            c1647.f26847 = c1641.f26493;
            c1647.f26848 = c1641.f26500;
            c1647.f26849 = c1641.f26501;
            c1647.f26850 = c1641.f26502;
            c1647.f26851 = c1641.f26487;
            c1647.f26852 = c1641.f26488;
            c1647.f26853 = c1641.f26489;
            c1647.f26854 = c1641.f26517;
            c1647.f26855 = c1641.f26518;
            c1647.f26856 = c1641.f26519;
            c1647.f26834 = c1641.f26477;
            c1647.f26832 = c1641.f3685;
            c1647.f26833 = c1641.f3686;
            c1647.f26830 = ((ViewGroup.MarginLayoutParams) c1641).width;
            c1647.f26831 = ((ViewGroup.MarginLayoutParams) c1641).height;
            c1647.f26857 = ((ViewGroup.MarginLayoutParams) c1641).leftMargin;
            c1647.f26858 = ((ViewGroup.MarginLayoutParams) c1641).rightMargin;
            c1647.f26859 = ((ViewGroup.MarginLayoutParams) c1641).topMargin;
            c1647.f26860 = ((ViewGroup.MarginLayoutParams) c1641).bottomMargin;
            c1647.f26869 = c1641.f26506;
            c1647.f26870 = c1641.f26505;
            c1647.f26872 = c1641.f26508;
            c1647.f26871 = c1641.f26507;
            c1647.f26887 = c1641.f26520;
            c1647.f26888 = c1641.f26521;
            c1647.f26873 = c1641.f26509;
            c1647.f26874 = c1641.f26510;
            c1647.f26875 = c1641.f26513;
            c1647.f26876 = c1641.f26514;
            c1647.f26877 = c1641.f26511;
            c1647.f26878 = c1641.f26512;
            c1647.f26879 = c1641.f26515;
            c1647.f26880 = c1641.f26516;
            c1647.f26886 = c1641.f26522;
            c1647.f26864 = c1641.f26495;
            c1647.f26866 = c1641.f26497;
            c1647.f26863 = c1641.f26494;
            c1647.f26865 = c1641.f26496;
            c1647.f26868 = c1641.f26498;
            c1647.f26867 = c1641.f26499;
            c1647.f26861 = c1641.getMarginEnd();
            this.f26774.f26862 = c1641.getMarginStart();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public final void m29471(int i, C8774.C1648 c1648) {
            m29470(i, c1648);
            this.f3705.f26903 = c1648.f26930;
            C8773 c8773 = this.f26775;
            c8773.f3713 = c1648.f26933;
            c8773.f26917 = c1648.f26934;
            c8773.f26918 = c1648.f26935;
            c8773.f26919 = c1648.f26936;
            c8773.f26920 = c1648.f26937;
            c8773.f26921 = c1648.f26938;
            c8773.f26922 = c1648.f26939;
            c8773.f26923 = c1648.f26940;
            c8773.f26924 = c1648.f26941;
            c8773.f26925 = c1648.f26942;
            c8773.f26927 = c1648.f26932;
            c8773.f26926 = c1648.f26931;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m29472(AbstractC8767 abstractC8767, int i, C8774.C1648 c1648) {
            m29471(i, c1648);
            if (abstractC8767 instanceof C1642) {
                C1647 c1647 = this.f26774;
                c1647.f26883 = 1;
                C1642 c1642 = (C1642) abstractC8767;
                c1647.f26881 = c1642.getType();
                this.f26774.f26884 = c1642.getReferencedIds();
                this.f26774.f26882 = c1642.getMargin();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final C1643 m29473(String str, C1643.EnumC8766 enumC8766) {
            if (!this.f26776.containsKey(str)) {
                C1643 c1643 = new C1643(str, enumC8766);
                this.f26776.put(str, c1643);
                return c1643;
            }
            C1643 c16432 = this.f26776.get(str);
            if (c16432.m29270() == enumC8766) {
                return c16432;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a " + c16432.m29270().name());
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public final void m29474(String str, int i) {
            m29473(str, C1643.EnumC8766.COLOR_TYPE).m29274(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public final void m29475(String str, float f) {
            m29473(str, C1643.EnumC8766.FLOAT_TYPE).m29275(f);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public final void m29476(String str, int i) {
            m29473(str, C1643.EnumC8766.INT_TYPE).m29276(i);
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final void m29477(String str, String str2) {
            m29473(str, C1643.EnumC8766.STRING_TYPE).m29278(str2);
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟ */
    public static class C1647 {

        /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
        public static final int f26777 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public static SparseIntArray f26778 = null;

        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public static final int f26779 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public static final int f26780 = 2;

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public static final int f26781 = 3;

        /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
        public static final int f26782 = 4;

        /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
        public static final int f26783 = 5;

        /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
        public static final int f26784 = 6;

        /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
        public static final int f26785 = 7;

        /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
        public static final int f26786 = 8;

        /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
        public static final int f26787 = 9;

        /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
        public static final int f26788 = 10;

        /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
        public static final int f26789 = 11;

        /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
        public static final int f26790 = 12;

        /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
        public static final int f26791 = 13;

        /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
        public static final int f26792 = 14;

        /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
        public static final int f26793 = 15;

        /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
        public static final int f26794 = 16;

        /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
        public static final int f26795 = 17;

        /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
        public static final int f26796 = 18;

        /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
        public static final int f26797 = 19;

        /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
        public static final int f26798 = 20;

        /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
        public static final int f26799 = 21;

        /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
        public static final int f26800 = 22;

        /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
        public static final int f26801 = 23;

        /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
        public static final int f26802 = 24;

        /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
        public static final int f26803 = 25;

        /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
        public static final int f26804 = 26;

        /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
        public static final int f26805 = 27;

        /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
        public static final int f26806 = 28;

        /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
        public static final int f26807 = 29;

        /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
        public static final int f26808 = 30;

        /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
        public static final int f26809 = 31;

        /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
        public static final int f26810 = 32;

        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public static final int f26811 = 33;

        /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
        public static final int f26812 = 34;

        /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
        public static final int f26813 = 35;

        /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
        public static final int f26814 = 36;

        /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
        public static final int f26815 = 37;

        /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
        public static final int f26816 = 38;

        /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
        public static final int f26817 = 39;

        /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
        public static final int f26818 = 40;

        /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
        public static final int f26819 = 61;

        /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
        public static final int f26820 = 62;

        /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
        public static final int f26821 = 63;

        /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
        public static final int f26822 = 69;

        /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
        public static final int f26823 = 70;

        /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
        public static final int f26824 = 71;

        /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
        public static final int f26825 = 72;

        /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
        public static final int f26826 = 73;

        /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
        public static final int f26827 = 74;

        /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
        public static final int f26828 = 75;

        /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
        public static final int f26829 = 76;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f26830;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f26831;

        /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
        public int[] f26884;

        /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
        public String f26885;

        /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
        public String f26886;

        /* JADX INFO: renamed from: ۥ */
        public boolean f3706 = false;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f3707 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f26832 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f26833 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public float f26834 = -1.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public int f26835 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f26836 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public int f26837 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public int f26838 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public int f26839 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int f26840 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int f26841 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public int f26842 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public int f26843 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public int f26844 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public int f26845 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public int f26846 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f26847 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public float f26848 = 0.5f;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public float f26849 = 0.5f;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public String f26850 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public int f26851 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public int f26852 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public float f26853 = 0.0f;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public int f26854 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public int f26855 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public int f26856 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public int f26857 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public int f26858 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
        public int f26859 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
        public int f26860 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
        public int f26861 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
        public int f26862 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
        public int f26863 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
        public int f26864 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
        public int f26865 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
        public int f26866 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
        public int f26867 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
        public int f26868 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public float f26869 = -1.0f;

        /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
        public float f26870 = -1.0f;

        /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
        public int f26871 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
        public int f26872 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
        public int f26873 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
        public int f26874 = 0;

        /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
        public int f26875 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public int f26876 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f26877 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
        public int f26878 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
        public float f26879 = 1.0f;

        /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
        public float f26880 = 1.0f;

        /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
        public int f26881 = -1;

        /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
        public int f26882 = 0;

        /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
        public int f26883 = -1;

        /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
        public boolean f26887 = false;

        /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
        public boolean f26888 = false;

        /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
        public boolean f26889 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f26778 = sparseIntArray;
            sparseIntArray.append(C8778.C8789.f29112, 24);
            f26778.append(C8778.C8789.f29113, 25);
            f26778.append(C8778.C8789.f29115, 28);
            f26778.append(C8778.C8789.f29116, 29);
            f26778.append(C8778.C8789.f29121, 35);
            f26778.append(C8778.C8789.f29120, 34);
            f26778.append(C8778.C8789.f29094, 4);
            f26778.append(C8778.C8789.f29093, 3);
            f26778.append(C8778.C8789.f29091, 1);
            f26778.append(C8778.C8789.f29129, 6);
            f26778.append(C8778.C8789.f29130, 7);
            f26778.append(C8778.C8789.f29101, 17);
            f26778.append(C8778.C8789.f29102, 18);
            f26778.append(C8778.C8789.f29103, 19);
            f26778.append(C8778.C8789.f29073, 26);
            f26778.append(C8778.C8789.f29117, 31);
            f26778.append(C8778.C8789.f29118, 32);
            f26778.append(C8778.C8789.f29100, 10);
            f26778.append(C8778.C8789.f29099, 9);
            f26778.append(C8778.C8789.f29133, 13);
            f26778.append(C8778.C8789.f29136, 16);
            f26778.append(C8778.C8789.f29134, 14);
            f26778.append(C8778.C8789.f29131, 11);
            f26778.append(C8778.C8789.f29135, 15);
            f26778.append(C8778.C8789.f29132, 12);
            f26778.append(C8778.C8789.f29124, 38);
            f26778.append(C8778.C8789.f29110, 37);
            f26778.append(C8778.C8789.f29109, 39);
            f26778.append(C8778.C8789.f29123, 40);
            f26778.append(C8778.C8789.f29108, 20);
            f26778.append(C8778.C8789.f29122, 36);
            f26778.append(C8778.C8789.f29098, 5);
            f26778.append(C8778.C8789.f29111, 76);
            f26778.append(C8778.C8789.f29119, 76);
            f26778.append(C8778.C8789.f29114, 76);
            f26778.append(C8778.C8789.f29092, 76);
            f26778.append(C8778.C8789.f29090, 76);
            f26778.append(C8778.C8789.f29076, 23);
            f26778.append(C8778.C8789.f29078, 27);
            f26778.append(C8778.C8789.f29080, 30);
            f26778.append(C8778.C8789.f29081, 8);
            f26778.append(C8778.C8789.f29077, 33);
            f26778.append(C8778.C8789.f29079, 2);
            f26778.append(C8778.C8789.f29074, 22);
            f26778.append(C8778.C8789.f29075, 21);
            f26778.append(C8778.C8789.f29095, 61);
            f26778.append(C8778.C8789.f29097, 62);
            f26778.append(C8778.C8789.f29096, 63);
            f26778.append(C8778.C8789.f29128, 69);
            f26778.append(C8778.C8789.f29107, 70);
            f26778.append(C8778.C8789.f29085, 71);
            f26778.append(C8778.C8789.f29083, 72);
            f26778.append(C8778.C8789.f29084, 73);
            f26778.append(C8778.C8789.f29086, 74);
            f26778.append(C8778.C8789.f29082, 75);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4720(C1647 c1647) {
            this.f3706 = c1647.f3706;
            this.f26830 = c1647.f26830;
            this.f3707 = c1647.f3707;
            this.f26831 = c1647.f26831;
            this.f26832 = c1647.f26832;
            this.f26833 = c1647.f26833;
            this.f26834 = c1647.f26834;
            this.f26835 = c1647.f26835;
            this.f26836 = c1647.f26836;
            this.f26837 = c1647.f26837;
            this.f26838 = c1647.f26838;
            this.f26839 = c1647.f26839;
            this.f26840 = c1647.f26840;
            this.f26841 = c1647.f26841;
            this.f26842 = c1647.f26842;
            this.f26843 = c1647.f26843;
            this.f26844 = c1647.f26844;
            this.f26845 = c1647.f26845;
            this.f26846 = c1647.f26846;
            this.f26847 = c1647.f26847;
            this.f26848 = c1647.f26848;
            this.f26849 = c1647.f26849;
            this.f26850 = c1647.f26850;
            this.f26851 = c1647.f26851;
            this.f26852 = c1647.f26852;
            this.f26853 = c1647.f26853;
            this.f26854 = c1647.f26854;
            this.f26855 = c1647.f26855;
            this.f26856 = c1647.f26856;
            this.f26857 = c1647.f26857;
            this.f26858 = c1647.f26858;
            this.f26859 = c1647.f26859;
            this.f26860 = c1647.f26860;
            this.f26861 = c1647.f26861;
            this.f26862 = c1647.f26862;
            this.f26863 = c1647.f26863;
            this.f26864 = c1647.f26864;
            this.f26865 = c1647.f26865;
            this.f26866 = c1647.f26866;
            this.f26867 = c1647.f26867;
            this.f26868 = c1647.f26868;
            this.f26869 = c1647.f26869;
            this.f26870 = c1647.f26870;
            this.f26871 = c1647.f26871;
            this.f26872 = c1647.f26872;
            this.f26873 = c1647.f26873;
            this.f26874 = c1647.f26874;
            this.f26875 = c1647.f26875;
            this.f26876 = c1647.f26876;
            this.f26877 = c1647.f26877;
            this.f26878 = c1647.f26878;
            this.f26879 = c1647.f26879;
            this.f26880 = c1647.f26880;
            this.f26881 = c1647.f26881;
            this.f26882 = c1647.f26882;
            this.f26883 = c1647.f26883;
            this.f26886 = c1647.f26886;
            int[] iArr = c1647.f26884;
            if (iArr != null) {
                this.f26884 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f26884 = null;
            }
            this.f26885 = c1647.f26885;
            this.f26887 = c1647.f26887;
            this.f26888 = c1647.f26888;
            this.f26889 = c1647.f26889;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4721(C6283 c6283, StringBuilder sb) {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objM19508 = c6283.m19508(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(objM19508 == null ? num : objM19508);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f = (Float) obj;
                            if (f.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void m29478(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f29072);
            this.f3707 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                int i2 = f26778.get(index);
                if (i2 == 80) {
                    this.f26887 = typedArrayObtainStyledAttributes.getBoolean(index, this.f26887);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f26843 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26843);
                            break;
                        case 2:
                            this.f26860 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26860);
                            break;
                        case 3:
                            this.f26842 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26842);
                            break;
                        case 4:
                            this.f26841 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26841);
                            break;
                        case 5:
                            this.f26850 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f26854 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f26854);
                            break;
                        case 7:
                            this.f26855 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f26855);
                            break;
                        case 8:
                            this.f26861 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26861);
                            break;
                        case 9:
                            this.f26847 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26847);
                            break;
                        case 10:
                            this.f26846 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26846);
                            break;
                        case 11:
                            this.f26866 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26866);
                            break;
                        case 12:
                            this.f26867 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26867);
                            break;
                        case 13:
                            this.f26863 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26863);
                            break;
                        case 14:
                            this.f26865 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26865);
                            break;
                        case 15:
                            this.f26868 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26868);
                            break;
                        case 16:
                            this.f26864 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26864);
                            break;
                        case 17:
                            this.f26832 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f26832);
                            break;
                        case 18:
                            this.f26833 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f26833);
                            break;
                        case 19:
                            this.f26834 = typedArrayObtainStyledAttributes.getFloat(index, this.f26834);
                            break;
                        case 20:
                            this.f26848 = typedArrayObtainStyledAttributes.getFloat(index, this.f26848);
                            break;
                        case 21:
                            this.f26831 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f26831);
                            break;
                        case 22:
                            this.f26830 = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f26830);
                            break;
                        case 23:
                            this.f26857 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26857);
                            break;
                        case 24:
                            this.f26835 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26835);
                            break;
                        case 25:
                            this.f26836 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26836);
                            break;
                        case 26:
                            this.f26856 = typedArrayObtainStyledAttributes.getInt(index, this.f26856);
                            break;
                        case 27:
                            this.f26858 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26858);
                            break;
                        case 28:
                            this.f26837 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26837);
                            break;
                        case 29:
                            this.f26838 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26838);
                            break;
                        case 30:
                            this.f26862 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26862);
                            break;
                        case 31:
                            this.f26844 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26844);
                            break;
                        case 32:
                            this.f26845 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26845);
                            break;
                        case 33:
                            this.f26859 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26859);
                            break;
                        case 34:
                            this.f26840 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26840);
                            break;
                        case 35:
                            this.f26839 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26839);
                            break;
                        case 36:
                            this.f26849 = typedArrayObtainStyledAttributes.getFloat(index, this.f26849);
                            break;
                        case 37:
                            this.f26870 = typedArrayObtainStyledAttributes.getFloat(index, this.f26870);
                            break;
                        case 38:
                            this.f26869 = typedArrayObtainStyledAttributes.getFloat(index, this.f26869);
                            break;
                        case 39:
                            this.f26871 = typedArrayObtainStyledAttributes.getInt(index, this.f26871);
                            break;
                        case 40:
                            this.f26872 = typedArrayObtainStyledAttributes.getInt(index, this.f26872);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f26873 = typedArrayObtainStyledAttributes.getInt(index, this.f26873);
                                    break;
                                case 55:
                                    this.f26874 = typedArrayObtainStyledAttributes.getInt(index, this.f26874);
                                    break;
                                case 56:
                                    this.f26875 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26875);
                                    break;
                                case 57:
                                    this.f26876 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26876);
                                    break;
                                case 58:
                                    this.f26877 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26877);
                                    break;
                                case 59:
                                    this.f26878 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26878);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f26851 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f26851);
                                            break;
                                        case 62:
                                            this.f26852 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26852);
                                            break;
                                        case 63:
                                            this.f26853 = typedArrayObtainStyledAttributes.getFloat(index, this.f26853);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f26879 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f26880 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e(C8770.f26658, "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f26881 = typedArrayObtainStyledAttributes.getInt(index, this.f26881);
                                                    break;
                                                case 73:
                                                    this.f26882 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f26882);
                                                    break;
                                                case 74:
                                                    this.f26885 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f26889 = typedArrayObtainStyledAttributes.getBoolean(index, this.f26889);
                                                    break;
                                                case 76:
                                                    Log.w(C8770.f26658, "unused attribute 0x" + Integer.toHexString(index) + "   " + f26778.get(index));
                                                    break;
                                                case 77:
                                                    this.f26886 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w(C8770.f26658, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f26778.get(index));
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f26888 = typedArrayObtainStyledAttributes.getBoolean(index, this.f26888);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟۟, reason: contains not printable characters */
    public static class C8771 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static SparseIntArray f26890 = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f26891 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f26892 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static final int f26893 = 3;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public static final int f26894 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public static final int f26895 = 5;

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static final int f26896 = 6;

        /* JADX INFO: renamed from: ۥ */
        public boolean f3708 = false;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3709 = -1;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public String f26897 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f26898 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f26899 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public float f26900 = Float.NaN;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public float f26901 = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f26890 = sparseIntArray;
            sparseIntArray.append(C8778.C8789.f29210, 1);
            f26890.append(C8778.C8789.f29212, 2);
            f26890.append(C8778.C8789.f29213, 3);
            f26890.append(C8778.C8789.f29209, 4);
            f26890.append(C8778.C8789.f29208, 5);
            f26890.append(C8778.C8789.f29211, 6);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4722(C8771 c8771) {
            this.f3708 = c8771.f3708;
            this.f3709 = c8771.f3709;
            this.f26897 = c8771.f26897;
            this.f26898 = c8771.f26898;
            this.f26899 = c8771.f26899;
            this.f26901 = c8771.f26901;
            this.f26900 = c8771.f26900;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4723(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f29207);
            this.f3708 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f26890.get(index)) {
                    case 1:
                        this.f26901 = typedArrayObtainStyledAttributes.getFloat(index, this.f26901);
                        break;
                    case 2:
                        this.f26898 = typedArrayObtainStyledAttributes.getInt(index, this.f26898);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f26897 = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f26897 = C4586.f9863[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f26899 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3709 = C8770.m29346(typedArrayObtainStyledAttributes, index, this.f3709);
                        break;
                    case 6:
                        this.f26900 = typedArrayObtainStyledAttributes.getFloat(index, this.f26900);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟۟۟, reason: contains not printable characters */
    public static class C8772 {

        /* JADX INFO: renamed from: ۥ */
        public boolean f3710 = false;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3711 = 0;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f26902 = 0;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f26903 = 1.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f26904 = Float.NaN;

        /* JADX INFO: renamed from: ۥ */
        public void m4724(C8772 c8772) {
            this.f3710 = c8772.f3710;
            this.f3711 = c8772.f3711;
            this.f26903 = c8772.f26903;
            this.f26904 = c8772.f26904;
            this.f26902 = c8772.f26902;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4725(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f29253);
            this.f3710 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C8778.C8789.f29255) {
                    this.f26903 = typedArrayObtainStyledAttributes.getFloat(index, this.f26903);
                } else if (index == C8778.C8789.f29254) {
                    this.f3711 = typedArrayObtainStyledAttributes.getInt(index, this.f3711);
                    this.f3711 = C8770.f26686[this.f3711];
                } else if (index == C8778.C8789.f29258) {
                    this.f26902 = typedArrayObtainStyledAttributes.getInt(index, this.f26902);
                } else if (index == C8778.C8789.f29257) {
                    this.f26904 = typedArrayObtainStyledAttributes.getFloat(index, this.f26904);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟۠$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C8773 {

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public static SparseIntArray f26905 = null;

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public static final int f26906 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public static final int f26907 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public static final int f26908 = 3;

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public static final int f26909 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public static final int f26910 = 5;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final int f26911 = 6;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public static final int f26912 = 7;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public static final int f26913 = 8;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public static final int f26914 = 9;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public static final int f26915 = 10;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public static final int f26916 = 11;

        /* JADX INFO: renamed from: ۥ */
        public boolean f3712 = false;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f3713 = 0.0f;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public float f26917 = 0.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public float f26918 = 0.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public float f26919 = 1.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public float f26920 = 1.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public float f26921 = Float.NaN;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public float f26922 = Float.NaN;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public float f26923 = 0.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public float f26924 = 0.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public float f26925 = 0.0f;

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean f26926 = false;

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public float f26927 = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f26905 = sparseIntArray;
            sparseIntArray.append(C8778.C8789.f29382, 1);
            f26905.append(C8778.C8789.f29383, 2);
            f26905.append(C8778.C8789.f29384, 3);
            f26905.append(C8778.C8789.f29380, 4);
            f26905.append(C8778.C8789.f29381, 5);
            f26905.append(C8778.C8789.f29376, 6);
            f26905.append(C8778.C8789.f29377, 7);
            f26905.append(C8778.C8789.f29378, 8);
            f26905.append(C8778.C8789.f29379, 9);
            f26905.append(C8778.C8789.f29385, 10);
            f26905.append(C8778.C8789.f29386, 11);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4726(C8773 c8773) {
            this.f3712 = c8773.f3712;
            this.f3713 = c8773.f3713;
            this.f26917 = c8773.f26917;
            this.f26918 = c8773.f26918;
            this.f26919 = c8773.f26919;
            this.f26920 = c8773.f26920;
            this.f26921 = c8773.f26921;
            this.f26922 = c8773.f26922;
            this.f26923 = c8773.f26923;
            this.f26924 = c8773.f26924;
            this.f26925 = c8773.f26925;
            this.f26926 = c8773.f26926;
            this.f26927 = c8773.f26927;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m4727(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f29375);
            this.f3712 = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f26905.get(index)) {
                    case 1:
                        this.f3713 = typedArrayObtainStyledAttributes.getFloat(index, this.f3713);
                        break;
                    case 2:
                        this.f26917 = typedArrayObtainStyledAttributes.getFloat(index, this.f26917);
                        break;
                    case 3:
                        this.f26918 = typedArrayObtainStyledAttributes.getFloat(index, this.f26918);
                        break;
                    case 4:
                        this.f26919 = typedArrayObtainStyledAttributes.getFloat(index, this.f26919);
                        break;
                    case 5:
                        this.f26920 = typedArrayObtainStyledAttributes.getFloat(index, this.f26920);
                        break;
                    case 6:
                        this.f26921 = typedArrayObtainStyledAttributes.getDimension(index, this.f26921);
                        break;
                    case 7:
                        this.f26922 = typedArrayObtainStyledAttributes.getDimension(index, this.f26922);
                        break;
                    case 8:
                        this.f26923 = typedArrayObtainStyledAttributes.getDimension(index, this.f26923);
                        break;
                    case 9:
                        this.f26924 = typedArrayObtainStyledAttributes.getDimension(index, this.f26924);
                        break;
                    case 10:
                        this.f26925 = typedArrayObtainStyledAttributes.getDimension(index, this.f26925);
                        break;
                    case 11:
                        this.f26926 = true;
                        this.f26927 = typedArrayObtainStyledAttributes.getDimension(index, this.f26927);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26688 = sparseIntArray;
        sparseIntArray.append(C8778.C8789.f28682, 25);
        f26688.append(C8778.C8789.f28683, 26);
        f26688.append(C8778.C8789.f28685, 29);
        f26688.append(C8778.C8789.f28686, 30);
        f26688.append(C8778.C8789.f28692, 36);
        f26688.append(C8778.C8789.f28691, 35);
        f26688.append(C8778.C8789.f28664, 4);
        f26688.append(C8778.C8789.f28663, 3);
        f26688.append(C8778.C8789.f28661, 1);
        f26688.append(C8778.C8789.f28700, 6);
        f26688.append(C8778.C8789.f28701, 7);
        f26688.append(C8778.C8789.f28671, 17);
        f26688.append(C8778.C8789.f28672, 18);
        f26688.append(C8778.C8789.f28673, 19);
        f26688.append(C8778.C8789.f28605, 27);
        f26688.append(C8778.C8789.f28687, 32);
        f26688.append(C8778.C8789.f28688, 33);
        f26688.append(C8778.C8789.f28670, 10);
        f26688.append(C8778.C8789.f28669, 9);
        f26688.append(C8778.C8789.f28704, 13);
        f26688.append(C8778.C8789.f28707, 16);
        f26688.append(C8778.C8789.f28705, 14);
        f26688.append(C8778.C8789.f28702, 11);
        f26688.append(C8778.C8789.f28706, 15);
        f26688.append(C8778.C8789.f28703, 12);
        f26688.append(C8778.C8789.f28695, 40);
        f26688.append(C8778.C8789.f28680, 39);
        f26688.append(C8778.C8789.f28679, 41);
        f26688.append(C8778.C8789.f28694, 42);
        f26688.append(C8778.C8789.f28678, 20);
        f26688.append(C8778.C8789.f28693, 37);
        f26688.append(C8778.C8789.f28668, 5);
        f26688.append(C8778.C8789.f28681, 82);
        f26688.append(C8778.C8789.f28690, 82);
        f26688.append(C8778.C8789.f28684, 82);
        f26688.append(C8778.C8789.f28662, 82);
        f26688.append(C8778.C8789.f28660, 82);
        f26688.append(C8778.C8789.f28610, 24);
        f26688.append(C8778.C8789.f28612, 28);
        f26688.append(C8778.C8789.f28628, 31);
        f26688.append(C8778.C8789.f28629, 8);
        f26688.append(C8778.C8789.f28611, 34);
        f26688.append(C8778.C8789.f28613, 2);
        f26688.append(C8778.C8789.f28608, 23);
        f26688.append(C8778.C8789.f28609, 21);
        f26688.append(C8778.C8789.f28607, 22);
        f26688.append(C8778.C8789.f28618, 43);
        f26688.append(C8778.C8789.f28631, 44);
        f26688.append(C8778.C8789.f28626, 45);
        f26688.append(C8778.C8789.f28627, 46);
        f26688.append(C8778.C8789.f28625, 60);
        f26688.append(C8778.C8789.f28623, 47);
        f26688.append(C8778.C8789.f28624, 48);
        f26688.append(C8778.C8789.f28619, 49);
        f26688.append(C8778.C8789.f28620, 50);
        f26688.append(C8778.C8789.f28621, 51);
        f26688.append(C8778.C8789.f28622, 52);
        f26688.append(C8778.C8789.f28630, 53);
        f26688.append(C8778.C8789.f28696, 54);
        f26688.append(C8778.C8789.f28674, 55);
        f26688.append(C8778.C8789.f28697, 56);
        f26688.append(C8778.C8789.f28675, 57);
        f26688.append(C8778.C8789.f28698, 58);
        f26688.append(C8778.C8789.f28676, 59);
        f26688.append(C8778.C8789.f28665, 61);
        f26688.append(C8778.C8789.f28667, 62);
        f26688.append(C8778.C8789.f28666, 63);
        f26688.append(C8778.C8789.f28632, 64);
        f26688.append(C8778.C8789.f28712, 65);
        f26688.append(C8778.C8789.f28639, 66);
        f26688.append(C8778.C8789.f28713, 67);
        f26688.append(C8778.C8789.f28709, 79);
        f26688.append(C8778.C8789.f28606, 38);
        f26688.append(C8778.C8789.f28708, 68);
        f26688.append(C8778.C8789.f28699, 69);
        f26688.append(C8778.C8789.f28677, 70);
        f26688.append(C8778.C8789.f28636, 71);
        f26688.append(C8778.C8789.f28634, 72);
        f26688.append(C8778.C8789.f28635, 73);
        f26688.append(C8778.C8789.f28637, 74);
        f26688.append(C8778.C8789.f28633, 75);
        f26688.append(C8778.C8789.f28710, 76);
        f26688.append(C8778.C8789.f28689, 77);
        f26688.append(C8778.C8789.f28714, 78);
        f26688.append(C8778.C8789.f28659, 80);
        f26688.append(C8778.C8789.f28658, 81);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
    public static int m29346(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public static String[] m29347(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c = charArray[i2];
            if (c == ',' && !z) {
                arrayList.add(new String(charArray, i, i2 - i));
                i = i2 + 1;
            } else if (c == '\"') {
                z = !z;
            }
        }
        arrayList.add(new String(charArray, i, charArray.length - i));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m29348(C1643.EnumC8766 enumC8766, String... strArr) {
        for (int i = 0; i < strArr.length; i++) {
            if (this.f3703.containsKey(strArr[i])) {
                C1643 c1643 = this.f3703.get(strArr[i]);
                if (c1643.m29270() != enumC8766) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + c1643.m29270().name());
                }
            } else {
                this.f3703.put(strArr[i], new C1643(strArr[i], enumC8766));
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m29349(String... strArr) {
        m29348(C1643.EnumC8766.COLOR_TYPE, strArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29350(String... strArr) {
        m29348(C1643.EnumC8766.FLOAT_TYPE, strArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m29351(String... strArr) {
        m29348(C1643.EnumC8766.INT_TYPE, strArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m29352(String... strArr) {
        m29348(C1643.EnumC8766.STRING_TYPE, strArr);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m29353(int i, int i2, int i3) {
        m29376(i, 1, i2, i2 == 0 ? 1 : 2, 0);
        m29376(i, 2, i3, i3 == 0 ? 2 : 1, 0);
        if (i2 != 0) {
            m29376(i2, 2, i, 1, 0);
        }
        if (i3 != 0) {
            m29376(i3, 1, i, 2, 0);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m29354(int i, int i2, int i3) {
        m29376(i, 6, i2, i2 == 0 ? 6 : 7, 0);
        m29376(i, 7, i3, i3 == 0 ? 7 : 6, 0);
        if (i2 != 0) {
            m29376(i2, 7, i, 6, 0);
        }
        if (i3 != 0) {
            m29376(i3, 6, i, 7, 0);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m29355(int i, int i2, int i3) {
        m29376(i, 3, i2, i2 == 0 ? 3 : 4, 0);
        m29376(i, 4, i3, i3 == 0 ? 4 : 3, 0);
        if (i2 != 0) {
            m29376(i2, 4, i, 3, 0);
        }
        if (i3 != 0) {
            m29376(i3, 3, i, 4, 0);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m29356(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f26772.containsKey(Integer.valueOf(id))) {
                Log.v(f26658, "id unknown " + C4308.m12437(childAt));
            } else {
                if (this.f26771 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.f26772.containsKey(Integer.valueOf(id))) {
                    C1643.m29269(childAt, this.f26772.get(Integer.valueOf(id)).f26776);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m29357(ConstraintLayout constraintLayout) {
        m29359(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m29358(AbstractC8767 abstractC8767, C4128 c4128, ConstraintLayout.C1641 c1641, SparseArray<C4128> sparseArray) {
        int id = abstractC8767.getId();
        if (this.f26772.containsKey(Integer.valueOf(id))) {
            C1646 c1646 = this.f26772.get(Integer.valueOf(id));
            if (c4128 instanceof C5281) {
                abstractC8767.mo29254(c1646, (C5281) c4128, c1641, sparseArray);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m29359(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f26772.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f26772.containsKey(Integer.valueOf(id))) {
                Log.w(f26658, "id unknown " + C4308.m12437(childAt));
            } else {
                if (this.f26771 && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.f26772.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        C1646 c1646 = this.f26772.get(Integer.valueOf(id));
                        if (childAt instanceof C1642) {
                            c1646.f26774.f26883 = 1;
                        }
                        int i2 = c1646.f26774.f26883;
                        if (i2 != -1 && i2 == 1) {
                            C1642 c1642 = (C1642) childAt;
                            c1642.setId(id);
                            c1642.setType(c1646.f26774.f26881);
                            c1642.setMargin(c1646.f26774.f26882);
                            c1642.setAllowsGoneWidget(c1646.f26774.f26889);
                            C1647 c1647 = c1646.f26774;
                            int[] iArr = c1647.f26884;
                            if (iArr != null) {
                                c1642.setReferencedIds(iArr);
                            } else {
                                String str = c1647.f26885;
                                if (str != null) {
                                    c1647.f26884 = m29390(c1642, str);
                                    c1642.setReferencedIds(c1646.f26774.f26884);
                                }
                            }
                        }
                        ConstraintLayout.C1641 c1641 = (ConstraintLayout.C1641) childAt.getLayoutParams();
                        c1641.m29262();
                        c1646.m29468(c1641);
                        if (z) {
                            C1643.m29269(childAt, c1646.f26776);
                        }
                        childAt.setLayoutParams(c1641);
                        C8772 c8772 = c1646.f3705;
                        if (c8772.f26902 == 0) {
                            childAt.setVisibility(c8772.f3711);
                        }
                        childAt.setAlpha(c1646.f3705.f26903);
                        childAt.setRotation(c1646.f26775.f3713);
                        childAt.setRotationX(c1646.f26775.f26917);
                        childAt.setRotationY(c1646.f26775.f26918);
                        childAt.setScaleX(c1646.f26775.f26919);
                        childAt.setScaleY(c1646.f26775.f26920);
                        if (!Float.isNaN(c1646.f26775.f26921)) {
                            childAt.setPivotX(c1646.f26775.f26921);
                        }
                        if (!Float.isNaN(c1646.f26775.f26922)) {
                            childAt.setPivotY(c1646.f26775.f26922);
                        }
                        childAt.setTranslationX(c1646.f26775.f26923);
                        childAt.setTranslationY(c1646.f26775.f26924);
                        childAt.setTranslationZ(c1646.f26775.f26925);
                        C8773 c8773 = c1646.f26775;
                        if (c8773.f26926) {
                            childAt.setElevation(c8773.f26927);
                        }
                    } else {
                        Log.v(f26658, "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            C1646 c16462 = this.f26772.get(num);
            int i3 = c16462.f26774.f26883;
            if (i3 != -1 && i3 == 1) {
                C1642 c16422 = new C1642(constraintLayout.getContext());
                c16422.setId(num.intValue());
                C1647 c16472 = c16462.f26774;
                int[] iArr2 = c16472.f26884;
                if (iArr2 != null) {
                    c16422.setReferencedIds(iArr2);
                } else {
                    String str2 = c16472.f26885;
                    if (str2 != null) {
                        c16472.f26884 = m29390(c16422, str2);
                        c16422.setReferencedIds(c16462.f26774.f26884);
                    }
                }
                c16422.setType(c16462.f26774.f26881);
                c16422.setMargin(c16462.f26774.f26882);
                ConstraintLayout.C1641 c1641GenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                c16422.m29296();
                c16462.m29468(c1641GenerateDefaultLayoutParams);
                constraintLayout.addView(c16422, c1641GenerateDefaultLayoutParams);
            }
            if (c16462.f26774.f3706) {
                View c8776 = new C8776(constraintLayout.getContext());
                c8776.setId(num.intValue());
                ConstraintLayout.C1641 c1641GenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                c16462.m29468(c1641GenerateDefaultLayoutParams2);
                constraintLayout.addView(c8776, c1641GenerateDefaultLayoutParams2);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m29360(int i, ConstraintLayout.C1641 c1641) {
        if (this.f26772.containsKey(Integer.valueOf(i))) {
            this.f26772.get(Integer.valueOf(i)).m29468(c1641);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m29361(ConstraintLayout constraintLayout) {
        m29359(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m29362(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        if (i4 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i7 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i3 == 1 || i3 == 2) {
            m29376(i, 1, i2, i3, i4);
            m29376(i, 2, i5, i6, i7);
            this.f26772.get(Integer.valueOf(i)).f26774.f26848 = f;
        } else if (i3 == 6 || i3 == 7) {
            m29376(i, 6, i2, i3, i4);
            m29376(i, 7, i5, i6, i7);
            this.f26772.get(Integer.valueOf(i)).f26774.f26848 = f;
        } else {
            m29376(i, 3, i2, i3, i4);
            m29376(i, 4, i5, i6, i7);
            this.f26772.get(Integer.valueOf(i)).f26774.f26849 = f;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m29363(int i, int i2) {
        if (i2 == 0) {
            m29362(i, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            m29362(i, i2, 2, 0, i2, 1, 0, 0.5f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m29364(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        m29376(i, 1, i2, i3, i4);
        m29376(i, 2, i5, i6, i7);
        this.f26772.get(Integer.valueOf(i)).f26774.f26848 = f;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29365(int i, int i2) {
        if (i2 == 0) {
            m29362(i, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            m29362(i, i2, 7, 0, i2, 6, 0, 0.5f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m29366(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        m29376(i, 6, i2, i3, i4);
        m29376(i, 7, i5, i6, i7);
        this.f26772.get(Integer.valueOf(i)).f26774.f26848 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m29367(int i, int i2) {
        if (i2 == 0) {
            m29362(i, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            m29362(i, i2, 4, 0, i2, 3, 0, 0.5f);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m29368(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f) {
        m29376(i, 3, i2, i3, i4);
        m29376(i, 4, i5, i6, i7);
        this.f26772.get(Integer.valueOf(i)).f26774.f26849 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m29369(int i) {
        this.f26772.remove(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m29370(int i, int i2) {
        if (this.f26772.containsKey(Integer.valueOf(i))) {
            C1646 c1646 = this.f26772.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C1647 c1647 = c1646.f26774;
                    c1647.f26836 = -1;
                    c1647.f26835 = -1;
                    c1647.f26857 = -1;
                    c1647.f26863 = -1;
                    return;
                case 2:
                    C1647 c16472 = c1646.f26774;
                    c16472.f26838 = -1;
                    c16472.f26837 = -1;
                    c16472.f26858 = -1;
                    c16472.f26865 = -1;
                    return;
                case 3:
                    C1647 c16473 = c1646.f26774;
                    c16473.f26840 = -1;
                    c16473.f26839 = -1;
                    c16473.f26859 = -1;
                    c16473.f26864 = -1;
                    return;
                case 4:
                    C1647 c16474 = c1646.f26774;
                    c16474.f26841 = -1;
                    c16474.f26842 = -1;
                    c16474.f26860 = -1;
                    c16474.f26866 = -1;
                    return;
                case 5:
                    c1646.f26774.f26843 = -1;
                    return;
                case 6:
                    C1647 c16475 = c1646.f26774;
                    c16475.f26844 = -1;
                    c16475.f26845 = -1;
                    c16475.f26862 = -1;
                    c16475.f26868 = -1;
                    return;
                case 7:
                    C1647 c16476 = c1646.f26774;
                    c16476.f26846 = -1;
                    c16476.f26847 = -1;
                    c16476.f26861 = -1;
                    c16476.f26867 = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m29371(Context context, int i) {
        m29372((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void m29372(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f26772.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C1641 c1641 = (ConstraintLayout.C1641) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f26771 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f26772.containsKey(Integer.valueOf(id))) {
                this.f26772.put(Integer.valueOf(id), new C1646());
            }
            C1646 c1646 = this.f26772.get(Integer.valueOf(id));
            c1646.f26776 = C1643.m29267(this.f3703, childAt);
            c1646.m29470(id, c1641);
            c1646.f3705.f3711 = childAt.getVisibility();
            c1646.f3705.f26903 = childAt.getAlpha();
            c1646.f26775.f3713 = childAt.getRotation();
            c1646.f26775.f26917 = childAt.getRotationX();
            c1646.f26775.f26918 = childAt.getRotationY();
            c1646.f26775.f26919 = childAt.getScaleX();
            c1646.f26775.f26920 = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C8773 c8773 = c1646.f26775;
                c8773.f26921 = pivotX;
                c8773.f26922 = pivotY;
            }
            c1646.f26775.f26923 = childAt.getTranslationX();
            c1646.f26775.f26924 = childAt.getTranslationY();
            c1646.f26775.f26925 = childAt.getTranslationZ();
            C8773 c87732 = c1646.f26775;
            if (c87732.f26926) {
                c87732.f26927 = childAt.getElevation();
            }
            if (childAt instanceof C1642) {
                C1642 c1642 = (C1642) childAt;
                c1646.f26774.f26889 = c1642.m29265();
                c1646.f26774.f26884 = c1642.getReferencedIds();
                c1646.f26774.f26881 = c1642.getType();
                c1646.f26774.f26882 = c1642.getMargin();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public void m29373(C8770 c8770) {
        this.f26772.clear();
        for (Integer num : c8770.f26772.keySet()) {
            this.f26772.put(num, c8770.f26772.get(num).clone());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void m29374(C8774 c8774) {
        int childCount = c8774.getChildCount();
        this.f26772.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = c8774.getChildAt(i);
            C8774.C1648 c1648 = (C8774.C1648) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f26771 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f26772.containsKey(Integer.valueOf(id))) {
                this.f26772.put(Integer.valueOf(id), new C1646());
            }
            C1646 c1646 = this.f26772.get(Integer.valueOf(id));
            if (childAt instanceof AbstractC8767) {
                c1646.m29472((AbstractC8767) childAt, id, c1648);
            }
            c1646.m29471(id, c1648);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void m29375(int i, int i2, int i3, int i4) {
        if (!this.f26772.containsKey(Integer.valueOf(i))) {
            this.f26772.put(Integer.valueOf(i), new C1646());
        }
        C1646 c1646 = this.f26772.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C1647 c1647 = c1646.f26774;
                    c1647.f26835 = i3;
                    c1647.f26836 = -1;
                    return;
                } else if (i4 == 2) {
                    C1647 c16472 = c1646.f26774;
                    c16472.f26836 = i3;
                    c16472.f26835 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m29462(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    C1647 c16473 = c1646.f26774;
                    c16473.f26837 = i3;
                    c16473.f26838 = -1;
                    return;
                } else if (i4 == 2) {
                    C1647 c16474 = c1646.f26774;
                    c16474.f26838 = i3;
                    c16474.f26837 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    C1647 c16475 = c1646.f26774;
                    c16475.f26839 = i3;
                    c16475.f26840 = -1;
                    c16475.f26843 = -1;
                    return;
                }
                if (i4 == 4) {
                    C1647 c16476 = c1646.f26774;
                    c16476.f26840 = i3;
                    c16476.f26839 = -1;
                    c16476.f26843 = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
            case 4:
                if (i4 == 4) {
                    C1647 c16477 = c1646.f26774;
                    c16477.f26842 = i3;
                    c16477.f26841 = -1;
                    c16477.f26843 = -1;
                    return;
                }
                if (i4 == 3) {
                    C1647 c16478 = c1646.f26774;
                    c16478.f26841 = i3;
                    c16478.f26842 = -1;
                    c16478.f26843 = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
                }
                C1647 c16479 = c1646.f26774;
                c16479.f26843 = i3;
                c16479.f26842 = -1;
                c16479.f26841 = -1;
                c16479.f26839 = -1;
                c16479.f26840 = -1;
                return;
            case 6:
                if (i4 == 6) {
                    C1647 c164710 = c1646.f26774;
                    c164710.f26845 = i3;
                    c164710.f26844 = -1;
                    return;
                } else if (i4 == 7) {
                    C1647 c164711 = c1646.f26774;
                    c164711.f26844 = i3;
                    c164711.f26845 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    C1647 c164712 = c1646.f26774;
                    c164712.f26847 = i3;
                    c164712.f26846 = -1;
                    return;
                } else if (i4 == 6) {
                    C1647 c164713 = c1646.f26774;
                    c164713.f26846 = i3;
                    c164713.f26847 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m29462(i2) + " to " + m29462(i4) + " unknown");
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m29376(int i, int i2, int i3, int i4, int i5) {
        if (!this.f26772.containsKey(Integer.valueOf(i))) {
            this.f26772.put(Integer.valueOf(i), new C1646());
        }
        C1646 c1646 = this.f26772.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C1647 c1647 = c1646.f26774;
                    c1647.f26835 = i3;
                    c1647.f26836 = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("Left to " + m29462(i4) + " undefined");
                    }
                    C1647 c16472 = c1646.f26774;
                    c16472.f26836 = i3;
                    c16472.f26835 = -1;
                }
                c1646.f26774.f26857 = i5;
                return;
            case 2:
                if (i4 == 1) {
                    C1647 c16473 = c1646.f26774;
                    c16473.f26837 = i3;
                    c16473.f26838 = -1;
                } else {
                    if (i4 != 2) {
                        throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
                    }
                    C1647 c16474 = c1646.f26774;
                    c16474.f26838 = i3;
                    c16474.f26837 = -1;
                }
                c1646.f26774.f26858 = i5;
                return;
            case 3:
                if (i4 == 3) {
                    C1647 c16475 = c1646.f26774;
                    c16475.f26839 = i3;
                    c16475.f26840 = -1;
                    c16475.f26843 = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
                    }
                    C1647 c16476 = c1646.f26774;
                    c16476.f26840 = i3;
                    c16476.f26839 = -1;
                    c16476.f26843 = -1;
                }
                c1646.f26774.f26859 = i5;
                return;
            case 4:
                if (i4 == 4) {
                    C1647 c16477 = c1646.f26774;
                    c16477.f26842 = i3;
                    c16477.f26841 = -1;
                    c16477.f26843 = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
                    }
                    C1647 c16478 = c1646.f26774;
                    c16478.f26841 = i3;
                    c16478.f26842 = -1;
                    c16478.f26843 = -1;
                }
                c1646.f26774.f26860 = i5;
                return;
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
                }
                C1647 c16479 = c1646.f26774;
                c16479.f26843 = i3;
                c16479.f26842 = -1;
                c16479.f26841 = -1;
                c16479.f26839 = -1;
                c16479.f26840 = -1;
                return;
            case 6:
                if (i4 == 6) {
                    C1647 c164710 = c1646.f26774;
                    c164710.f26845 = i3;
                    c164710.f26844 = -1;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
                    }
                    C1647 c164711 = c1646.f26774;
                    c164711.f26844 = i3;
                    c164711.f26845 = -1;
                }
                c1646.f26774.f26862 = i5;
                return;
            case 7:
                if (i4 == 7) {
                    C1647 c164712 = c1646.f26774;
                    c164712.f26847 = i3;
                    c164712.f26846 = -1;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException("right to " + m29462(i4) + " undefined");
                    }
                    C1647 c164713 = c1646.f26774;
                    c164713.f26846 = i3;
                    c164713.f26847 = -1;
                }
                c1646.f26774.f26861 = i5;
                return;
            default:
                throw new IllegalArgumentException(m29462(i2) + " to " + m29462(i4) + " unknown");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m29377(int i, int i2, int i3, float f) {
        C1647 c1647 = m29399(i).f26774;
        c1647.f26851 = i2;
        c1647.f26852 = i3;
        c1647.f26853 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void m29378(int i, int i2) {
        m29399(i).f26774.f26874 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m29379(int i, int i2) {
        m29399(i).f26774.f26873 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m29380(int i, int i2) {
        m29399(i).f26774.f26831 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m29381(int i, int i2) {
        m29399(i).f26774.f26876 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void m29382(int i, int i2) {
        m29399(i).f26774.f26875 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m29383(int i, int i2) {
        m29399(i).f26774.f26878 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void m29384(int i, int i2) {
        m29399(i).f26774.f26877 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public void m29385(int i, float f) {
        m29399(i).f26774.f26880 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m29386(int i, float f) {
        m29399(i).f26774.f26879 = f;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m29387(int i, int i2) {
        m29399(i).f26774.f26830 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void m29388(int i, boolean z) {
        m29399(i).f26774.f26888 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void m29389(int i, boolean z) {
        m29399(i).f26774.f26887 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final int[] m29390(View view, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            try {
                iIntValue = C8778.C8783.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, Name.MARK, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public void m29391(int i, int i2) {
        C1647 c1647 = m29399(i).f26774;
        c1647.f3706 = true;
        c1647.f26856 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void m29392(int i, int i2, int i3, int... iArr) {
        C1647 c1647 = m29399(i).f26774;
        c1647.f26883 = 1;
        c1647.f26881 = i2;
        c1647.f26882 = i3;
        c1647.f3706 = false;
        c1647.f26884 = iArr;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public void m29393(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        m29394(i, i2, i3, i4, iArr, fArr, i5, 1, 2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final void m29394(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5, int i6, int i7) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            m29399(iArr[0]).f26774.f26870 = fArr[0];
        }
        m29399(iArr[0]).f26774.f26871 = i5;
        m29376(iArr[0], i6, i, i2, -1);
        for (int i8 = 1; i8 < iArr.length; i8++) {
            int i9 = i8 - 1;
            m29376(iArr[i8], i6, iArr[i9], i7, -1);
            m29376(iArr[i9], i7, iArr[i8], i6, -1);
            if (fArr != null) {
                m29399(iArr[i8]).f26774.f26870 = fArr[i8];
            }
        }
        m29376(iArr[iArr.length - 1], i7, i3, i4, -1);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m29395(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        m29394(i, i2, i3, i4, iArr, fArr, i5, 6, 7);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void m29396(int i, int i2, int i3, int i4, int[] iArr, float[] fArr, int i5) {
        if (iArr.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != iArr.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            m29399(iArr[0]).f26774.f26869 = fArr[0];
        }
        m29399(iArr[0]).f26774.f26872 = i5;
        m29376(iArr[0], 3, i, i2, 0);
        for (int i6 = 1; i6 < iArr.length; i6++) {
            int i7 = i6 - 1;
            m29376(iArr[i6], 3, iArr[i7], 4, 0);
            m29376(iArr[i7], 4, iArr[i6], 3, 0);
            if (fArr != null) {
                m29399(iArr[i6]).f26774.f26869 = fArr[i6];
            }
        }
        m29376(iArr[iArr.length - 1], 4, i3, i4, 0);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m29397(C6283 c6283, int... iArr) {
        HashSet hashSet;
        Set<Integer> setKeySet = this.f26772.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i : iArr) {
                hashSet.add(Integer.valueOf(i));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            C1646 c1646 = this.f26772.get(num);
            sb.append("<Constraint id=");
            sb.append(num);
            sb.append(" \n");
            c1646.f26774.m4721(c6283, sb);
            sb.append("/>\n");
        }
        System.out.println(sb.toString());
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final C1646 m29398(Context context, AttributeSet attributeSet) {
        C1646 c1646 = new C1646();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8778.C8789.f28604);
        m29417(context, c1646, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return c1646;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public final C1646 m29399(int i) {
        if (!this.f26772.containsKey(Integer.valueOf(i))) {
            this.f26772.put(Integer.valueOf(i), new C1646());
        }
        return this.f26772.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public boolean m29400(int i) {
        return m29399(i).f26775.f26926;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public C1646 m29401(int i) {
        if (this.f26772.containsKey(Integer.valueOf(i))) {
            return this.f26772.get(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public HashMap<String, C1643> m29402() {
        return this.f3703;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public int m29403(int i) {
        return m29399(i).f26774.f26831;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public int[] m29404() {
        Integer[] numArr = (Integer[]) this.f26772.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public C1646 m29405(int i) {
        return m29399(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public int[] m29406(int i) {
        int[] iArr = m29399(i).f26774.f26884;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public int m29407(int i) {
        return m29399(i).f3705.f3711;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public int m29408(int i) {
        return m29399(i).f3705.f26902;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public int m29409(int i) {
        return m29399(i).f26774.f26830;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public boolean m29410() {
        return this.f26771;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m29411(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C1646 c1646M29398 = m29398(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c1646M29398.f26774.f3706 = true;
                    }
                    this.f26772.put(Integer.valueOf(c1646M29398.f3704), c1646M29398);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x017d, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0095  */
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m29412(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            C1646 c1646M29398 = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    byte b = 3;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                b = !name.equals("Layout") ? (byte) -1 : (byte) 5;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    b = 6;
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    b = 4;
                                    break;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    b = 1;
                                    break;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    b = 2;
                                    break;
                                }
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    b = 7;
                                    break;
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    b = 0;
                                    break;
                                }
                                break;
                            default:
                                break;
                        }
                        switch (b) {
                            case 0:
                                c1646M29398 = m29398(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case 1:
                                c1646M29398 = m29398(context, Xml.asAttributeSet(xmlPullParser));
                                C1647 c1647 = c1646M29398.f26774;
                                c1647.f3706 = true;
                                c1647.f3707 = true;
                                break;
                            case 2:
                                c1646M29398 = m29398(context, Xml.asAttributeSet(xmlPullParser));
                                c1646M29398.f26774.f26883 = 1;
                                break;
                            case 3:
                                if (c1646M29398 == null) {
                                    throw new RuntimeException(f26659 + xmlPullParser.getLineNumber());
                                }
                                c1646M29398.f3705.m4725(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case 4:
                                if (c1646M29398 == null) {
                                    throw new RuntimeException(f26659 + xmlPullParser.getLineNumber());
                                }
                                c1646M29398.f26775.m4727(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case 5:
                                if (c1646M29398 == null) {
                                    throw new RuntimeException(f26659 + xmlPullParser.getLineNumber());
                                }
                                c1646M29398.f26774.m29478(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case 6:
                                if (c1646M29398 == null) {
                                    throw new RuntimeException(f26659 + xmlPullParser.getLineNumber());
                                }
                                c1646M29398.f26773.m4723(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case 7:
                                if (c1646M29398 == null) {
                                    throw new RuntimeException(f26659 + xmlPullParser.getLineNumber());
                                }
                                C1643.m29268(context, xmlPullParser, c1646M29398.f26776);
                                break;
                                break;
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if (f26658.equals(name2)) {
                            return;
                        }
                        if (name2.equalsIgnoreCase("Constraint")) {
                            this.f26772.put(Integer.valueOf(c1646M29398.f3704), c1646M29398);
                            c1646M29398 = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public void m29413(C1646 c1646, String str) {
        String[] strArrSplit = str.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(f26658, " Unable to parse " + strArrSplit[i]);
            } else {
                c1646.m29474(strArrSplit2[0], Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public void m29414(C1646 c1646, String str) {
        String[] strArrSplit = str.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(f26658, " Unable to parse " + strArrSplit[i]);
            } else {
                c1646.m29475(strArrSplit2[0], Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public void m29415(C1646 c1646, String str) {
        String[] strArrSplit = str.split(",");
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(f26658, " Unable to parse " + strArrSplit[i]);
            } else {
                c1646.m29475(strArrSplit2[0], Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠, reason: contains not printable characters */
    public void m29416(C1646 c1646, String str) {
        String[] strArrM29347 = m29347(str);
        for (int i = 0; i < strArrM29347.length; i++) {
            String[] strArrSplit = strArrM29347[i].split("=");
            Log.w(f26658, " Unable to parse " + strArrM29347[i]);
            c1646.m29477(strArrSplit[0], strArrSplit[1]);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public final void m29417(Context context, C1646 c1646, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != C8778.C8789.f28606 && C8778.C8789.f28628 != index && C8778.C8789.f28629 != index) {
                c1646.f26773.f3708 = true;
                c1646.f26774.f3707 = true;
                c1646.f3705.f3710 = true;
                c1646.f26775.f3712 = true;
            }
            switch (f26688.get(index)) {
                case 1:
                    C1647 c1647 = c1646.f26774;
                    c1647.f26843 = m29346(typedArray, index, c1647.f26843);
                    break;
                case 2:
                    C1647 c16472 = c1646.f26774;
                    c16472.f26860 = typedArray.getDimensionPixelSize(index, c16472.f26860);
                    break;
                case 3:
                    C1647 c16473 = c1646.f26774;
                    c16473.f26842 = m29346(typedArray, index, c16473.f26842);
                    break;
                case 4:
                    C1647 c16474 = c1646.f26774;
                    c16474.f26841 = m29346(typedArray, index, c16474.f26841);
                    break;
                case 5:
                    c1646.f26774.f26850 = typedArray.getString(index);
                    break;
                case 6:
                    C1647 c16475 = c1646.f26774;
                    c16475.f26854 = typedArray.getDimensionPixelOffset(index, c16475.f26854);
                    break;
                case 7:
                    C1647 c16476 = c1646.f26774;
                    c16476.f26855 = typedArray.getDimensionPixelOffset(index, c16476.f26855);
                    break;
                case 8:
                    C1647 c16477 = c1646.f26774;
                    c16477.f26861 = typedArray.getDimensionPixelSize(index, c16477.f26861);
                    break;
                case 9:
                    C1647 c16478 = c1646.f26774;
                    c16478.f26847 = m29346(typedArray, index, c16478.f26847);
                    break;
                case 10:
                    C1647 c16479 = c1646.f26774;
                    c16479.f26846 = m29346(typedArray, index, c16479.f26846);
                    break;
                case 11:
                    C1647 c164710 = c1646.f26774;
                    c164710.f26866 = typedArray.getDimensionPixelSize(index, c164710.f26866);
                    break;
                case 12:
                    C1647 c164711 = c1646.f26774;
                    c164711.f26867 = typedArray.getDimensionPixelSize(index, c164711.f26867);
                    break;
                case 13:
                    C1647 c164712 = c1646.f26774;
                    c164712.f26863 = typedArray.getDimensionPixelSize(index, c164712.f26863);
                    break;
                case 14:
                    C1647 c164713 = c1646.f26774;
                    c164713.f26865 = typedArray.getDimensionPixelSize(index, c164713.f26865);
                    break;
                case 15:
                    C1647 c164714 = c1646.f26774;
                    c164714.f26868 = typedArray.getDimensionPixelSize(index, c164714.f26868);
                    break;
                case 16:
                    C1647 c164715 = c1646.f26774;
                    c164715.f26864 = typedArray.getDimensionPixelSize(index, c164715.f26864);
                    break;
                case 17:
                    C1647 c164716 = c1646.f26774;
                    c164716.f26832 = typedArray.getDimensionPixelOffset(index, c164716.f26832);
                    break;
                case 18:
                    C1647 c164717 = c1646.f26774;
                    c164717.f26833 = typedArray.getDimensionPixelOffset(index, c164717.f26833);
                    break;
                case 19:
                    C1647 c164718 = c1646.f26774;
                    c164718.f26834 = typedArray.getFloat(index, c164718.f26834);
                    break;
                case 20:
                    C1647 c164719 = c1646.f26774;
                    c164719.f26848 = typedArray.getFloat(index, c164719.f26848);
                    break;
                case 21:
                    C1647 c164720 = c1646.f26774;
                    c164720.f26831 = typedArray.getLayoutDimension(index, c164720.f26831);
                    break;
                case 22:
                    C8772 c8772 = c1646.f3705;
                    c8772.f3711 = typedArray.getInt(index, c8772.f3711);
                    C8772 c87722 = c1646.f3705;
                    c87722.f3711 = f26686[c87722.f3711];
                    break;
                case 23:
                    C1647 c164721 = c1646.f26774;
                    c164721.f26830 = typedArray.getLayoutDimension(index, c164721.f26830);
                    break;
                case 24:
                    C1647 c164722 = c1646.f26774;
                    c164722.f26857 = typedArray.getDimensionPixelSize(index, c164722.f26857);
                    break;
                case 25:
                    C1647 c164723 = c1646.f26774;
                    c164723.f26835 = m29346(typedArray, index, c164723.f26835);
                    break;
                case 26:
                    C1647 c164724 = c1646.f26774;
                    c164724.f26836 = m29346(typedArray, index, c164724.f26836);
                    break;
                case 27:
                    C1647 c164725 = c1646.f26774;
                    c164725.f26856 = typedArray.getInt(index, c164725.f26856);
                    break;
                case 28:
                    C1647 c164726 = c1646.f26774;
                    c164726.f26858 = typedArray.getDimensionPixelSize(index, c164726.f26858);
                    break;
                case 29:
                    C1647 c164727 = c1646.f26774;
                    c164727.f26837 = m29346(typedArray, index, c164727.f26837);
                    break;
                case 30:
                    C1647 c164728 = c1646.f26774;
                    c164728.f26838 = m29346(typedArray, index, c164728.f26838);
                    break;
                case 31:
                    C1647 c164729 = c1646.f26774;
                    c164729.f26862 = typedArray.getDimensionPixelSize(index, c164729.f26862);
                    break;
                case 32:
                    C1647 c164730 = c1646.f26774;
                    c164730.f26844 = m29346(typedArray, index, c164730.f26844);
                    break;
                case 33:
                    C1647 c164731 = c1646.f26774;
                    c164731.f26845 = m29346(typedArray, index, c164731.f26845);
                    break;
                case 34:
                    C1647 c164732 = c1646.f26774;
                    c164732.f26859 = typedArray.getDimensionPixelSize(index, c164732.f26859);
                    break;
                case 35:
                    C1647 c164733 = c1646.f26774;
                    c164733.f26840 = m29346(typedArray, index, c164733.f26840);
                    break;
                case 36:
                    C1647 c164734 = c1646.f26774;
                    c164734.f26839 = m29346(typedArray, index, c164734.f26839);
                    break;
                case 37:
                    C1647 c164735 = c1646.f26774;
                    c164735.f26849 = typedArray.getFloat(index, c164735.f26849);
                    break;
                case 38:
                    c1646.f3704 = typedArray.getResourceId(index, c1646.f3704);
                    break;
                case 39:
                    C1647 c164736 = c1646.f26774;
                    c164736.f26870 = typedArray.getFloat(index, c164736.f26870);
                    break;
                case 40:
                    C1647 c164737 = c1646.f26774;
                    c164737.f26869 = typedArray.getFloat(index, c164737.f26869);
                    break;
                case 41:
                    C1647 c164738 = c1646.f26774;
                    c164738.f26871 = typedArray.getInt(index, c164738.f26871);
                    break;
                case 42:
                    C1647 c164739 = c1646.f26774;
                    c164739.f26872 = typedArray.getInt(index, c164739.f26872);
                    break;
                case 43:
                    C8772 c87723 = c1646.f3705;
                    c87723.f26903 = typedArray.getFloat(index, c87723.f26903);
                    break;
                case 44:
                    C8773 c8773 = c1646.f26775;
                    c8773.f26926 = true;
                    c8773.f26927 = typedArray.getDimension(index, c8773.f26927);
                    break;
                case 45:
                    C8773 c87732 = c1646.f26775;
                    c87732.f26917 = typedArray.getFloat(index, c87732.f26917);
                    break;
                case 46:
                    C8773 c87733 = c1646.f26775;
                    c87733.f26918 = typedArray.getFloat(index, c87733.f26918);
                    break;
                case 47:
                    C8773 c87734 = c1646.f26775;
                    c87734.f26919 = typedArray.getFloat(index, c87734.f26919);
                    break;
                case 48:
                    C8773 c87735 = c1646.f26775;
                    c87735.f26920 = typedArray.getFloat(index, c87735.f26920);
                    break;
                case 49:
                    C8773 c87736 = c1646.f26775;
                    c87736.f26921 = typedArray.getDimension(index, c87736.f26921);
                    break;
                case 50:
                    C8773 c87737 = c1646.f26775;
                    c87737.f26922 = typedArray.getDimension(index, c87737.f26922);
                    break;
                case 51:
                    C8773 c87738 = c1646.f26775;
                    c87738.f26923 = typedArray.getDimension(index, c87738.f26923);
                    break;
                case 52:
                    C8773 c87739 = c1646.f26775;
                    c87739.f26924 = typedArray.getDimension(index, c87739.f26924);
                    break;
                case 53:
                    C8773 c877310 = c1646.f26775;
                    c877310.f26925 = typedArray.getDimension(index, c877310.f26925);
                    break;
                case 54:
                    C1647 c164740 = c1646.f26774;
                    c164740.f26873 = typedArray.getInt(index, c164740.f26873);
                    break;
                case 55:
                    C1647 c164741 = c1646.f26774;
                    c164741.f26874 = typedArray.getInt(index, c164741.f26874);
                    break;
                case 56:
                    C1647 c164742 = c1646.f26774;
                    c164742.f26875 = typedArray.getDimensionPixelSize(index, c164742.f26875);
                    break;
                case 57:
                    C1647 c164743 = c1646.f26774;
                    c164743.f26876 = typedArray.getDimensionPixelSize(index, c164743.f26876);
                    break;
                case 58:
                    C1647 c164744 = c1646.f26774;
                    c164744.f26877 = typedArray.getDimensionPixelSize(index, c164744.f26877);
                    break;
                case 59:
                    C1647 c164745 = c1646.f26774;
                    c164745.f26878 = typedArray.getDimensionPixelSize(index, c164745.f26878);
                    break;
                case 60:
                    C8773 c877311 = c1646.f26775;
                    c877311.f3713 = typedArray.getFloat(index, c877311.f3713);
                    break;
                case 61:
                    C1647 c164746 = c1646.f26774;
                    c164746.f26851 = m29346(typedArray, index, c164746.f26851);
                    break;
                case 62:
                    C1647 c164747 = c1646.f26774;
                    c164747.f26852 = typedArray.getDimensionPixelSize(index, c164747.f26852);
                    break;
                case 63:
                    C1647 c164748 = c1646.f26774;
                    c164748.f26853 = typedArray.getFloat(index, c164748.f26853);
                    break;
                case 64:
                    C8771 c8771 = c1646.f26773;
                    c8771.f3709 = m29346(typedArray, index, c8771.f3709);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c1646.f26773.f26897 = typedArray.getString(index);
                    } else {
                        c1646.f26773.f26897 = C4586.f9863[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    c1646.f26773.f26899 = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C8771 c87712 = c1646.f26773;
                    c87712.f26901 = typedArray.getFloat(index, c87712.f26901);
                    break;
                case 68:
                    C8772 c87724 = c1646.f3705;
                    c87724.f26904 = typedArray.getFloat(index, c87724.f26904);
                    break;
                case 69:
                    c1646.f26774.f26879 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    c1646.f26774.f26880 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e(f26658, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C1647 c164749 = c1646.f26774;
                    c164749.f26881 = typedArray.getInt(index, c164749.f26881);
                    break;
                case 73:
                    C1647 c164750 = c1646.f26774;
                    c164750.f26882 = typedArray.getDimensionPixelSize(index, c164750.f26882);
                    break;
                case 74:
                    c1646.f26774.f26885 = typedArray.getString(index);
                    break;
                case 75:
                    C1647 c164751 = c1646.f26774;
                    c164751.f26889 = typedArray.getBoolean(index, c164751.f26889);
                    break;
                case 76:
                    C8771 c87713 = c1646.f26773;
                    c87713.f26898 = typedArray.getInt(index, c87713.f26898);
                    break;
                case 77:
                    c1646.f26774.f26886 = typedArray.getString(index);
                    break;
                case 78:
                    C8772 c87725 = c1646.f3705;
                    c87725.f26902 = typedArray.getInt(index, c87725.f26902);
                    break;
                case 79:
                    C8771 c87714 = c1646.f26773;
                    c87714.f26900 = typedArray.getFloat(index, c87714.f26900);
                    break;
                case 80:
                    C1647 c164752 = c1646.f26774;
                    c164752.f26887 = typedArray.getBoolean(index, c164752.f26887);
                    break;
                case 81:
                    C1647 c164753 = c1646.f26774;
                    c164753.f26888 = typedArray.getBoolean(index, c164753.f26888);
                    break;
                case 82:
                    Log.w(f26658, "unused attribute 0x" + Integer.toHexString(index) + "   " + f26688.get(index));
                    break;
                default:
                    Log.w(f26658, "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f26688.get(index));
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public void m29418(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C1641 c1641 = (ConstraintLayout.C1641) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f26771 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f26772.containsKey(Integer.valueOf(id))) {
                this.f26772.put(Integer.valueOf(id), new C1646());
            }
            C1646 c1646 = this.f26772.get(Integer.valueOf(id));
            if (!c1646.f26774.f3707) {
                c1646.m29470(id, c1641);
                if (childAt instanceof AbstractC8767) {
                    c1646.f26774.f26884 = ((AbstractC8767) childAt).getReferencedIds();
                    if (childAt instanceof C1642) {
                        C1642 c1642 = (C1642) childAt;
                        c1646.f26774.f26889 = c1642.m29265();
                        c1646.f26774.f26881 = c1642.getType();
                        c1646.f26774.f26882 = c1642.getMargin();
                    }
                }
                c1646.f26774.f3707 = true;
            }
            C8772 c8772 = c1646.f3705;
            if (!c8772.f3710) {
                c8772.f3711 = childAt.getVisibility();
                c1646.f3705.f26903 = childAt.getAlpha();
                c1646.f3705.f3710 = true;
            }
            C8773 c8773 = c1646.f26775;
            if (!c8773.f3712) {
                c8773.f3712 = true;
                c8773.f3713 = childAt.getRotation();
                c1646.f26775.f26917 = childAt.getRotationX();
                c1646.f26775.f26918 = childAt.getRotationY();
                c1646.f26775.f26919 = childAt.getScaleX();
                c1646.f26775.f26920 = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    C8773 c87732 = c1646.f26775;
                    c87732.f26921 = pivotX;
                    c87732.f26922 = pivotY;
                }
                c1646.f26775.f26923 = childAt.getTranslationX();
                c1646.f26775.f26924 = childAt.getTranslationY();
                c1646.f26775.f26925 = childAt.getTranslationZ();
                C8773 c87733 = c1646.f26775;
                if (c87733.f26926) {
                    c87733.f26927 = childAt.getElevation();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public void m29419(C8770 c8770) {
        for (Integer num : c8770.f26772.keySet()) {
            num.intValue();
            C1646 c1646 = c8770.f26772.get(num);
            if (!this.f26772.containsKey(num)) {
                this.f26772.put(num, new C1646());
            }
            C1646 c16462 = this.f26772.get(num);
            C1647 c1647 = c16462.f26774;
            if (!c1647.f3707) {
                c1647.m4720(c1646.f26774);
            }
            C8772 c8772 = c16462.f3705;
            if (!c8772.f3710) {
                c8772.m4724(c1646.f3705);
            }
            C8773 c8773 = c16462.f26775;
            if (!c8773.f3712) {
                c8773.m4726(c1646.f26775);
            }
            C8771 c8771 = c16462.f26773;
            if (!c8771.f3708) {
                c8771.m4722(c1646.f26773);
            }
            for (String str : c1646.f26776.keySet()) {
                if (!c16462.f26776.containsKey(str)) {
                    c16462.f26776.put(str, c1646.f26776.get(str));
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ, reason: contains not printable characters */
    public void m29420(String str) {
        this.f3703.remove(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public void m29421(int i) {
        if (this.f26772.containsKey(Integer.valueOf(i))) {
            C1647 c1647 = this.f26772.get(Integer.valueOf(i)).f26774;
            int i2 = c1647.f26836;
            int i3 = c1647.f26837;
            if (i2 != -1 || i3 != -1) {
                if (i2 != -1 && i3 != -1) {
                    m29376(i2, 2, i3, 1, 0);
                    m29376(i3, 1, i2, 2, 0);
                } else if (i2 != -1 || i3 != -1) {
                    int i4 = c1647.f26838;
                    if (i4 != -1) {
                        m29376(i2, 2, i4, 2, 0);
                    } else {
                        int i5 = c1647.f26835;
                        if (i5 != -1) {
                            m29376(i3, 1, i5, 1, 0);
                        }
                    }
                }
                m29370(i, 1);
                m29370(i, 2);
                return;
            }
            int i6 = c1647.f26844;
            int i7 = c1647.f26846;
            if (i6 != -1 || i7 != -1) {
                if (i6 != -1 && i7 != -1) {
                    m29376(i6, 7, i7, 6, 0);
                    m29376(i7, 6, i2, 7, 0);
                } else if (i2 != -1 || i7 != -1) {
                    int i8 = c1647.f26838;
                    if (i8 != -1) {
                        m29376(i2, 7, i8, 7, 0);
                    } else {
                        int i9 = c1647.f26835;
                        if (i9 != -1) {
                            m29376(i7, 6, i9, 6, 0);
                        }
                    }
                }
            }
            m29370(i, 6);
            m29370(i, 7);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ, reason: contains not printable characters */
    public void m29422(int i) {
        if (this.f26772.containsKey(Integer.valueOf(i))) {
            C1647 c1647 = this.f26772.get(Integer.valueOf(i)).f26774;
            int i2 = c1647.f26840;
            int i3 = c1647.f26841;
            if (i2 != -1 || i3 != -1) {
                if (i2 != -1 && i3 != -1) {
                    m29376(i2, 4, i3, 3, 0);
                    m29376(i3, 3, i2, 4, 0);
                } else if (i2 != -1 || i3 != -1) {
                    int i4 = c1647.f26842;
                    if (i4 != -1) {
                        m29376(i2, 4, i4, 4, 0);
                    } else {
                        int i5 = c1647.f26839;
                        if (i5 != -1) {
                            m29376(i3, 3, i5, 3, 0);
                        }
                    }
                }
            }
        }
        m29370(i, 3);
        m29370(i, 4);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۧ, reason: contains not printable characters */
    public void m29423(int i, float f) {
        m29399(i).f3705.f26903 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۨ, reason: contains not printable characters */
    public void m29424(int i, boolean z) {
        m29399(i).f26775.f26926 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ, reason: contains not printable characters */
    public void m29425(int i, int i2) {
        m29399(i).f26774.f26883 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۟, reason: contains not printable characters */
    public void m29426(int i, String str, int i2) {
        m29399(i).m29474(str, i2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public void m29427(int i, String str) {
        m29399(i).f26774.f26850 = str;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public void m29428(int i, int i2) {
        m29399(i).f26774.f26854 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters */
    public void m29429(int i, int i2) {
        m29399(i).f26774.f26855 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters */
    public void m29430(int i, float f) {
        m29399(i).f26775.f26927 = f;
        m29399(i).f26775.f26926 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public void m29431(int i, String str, float f) {
        m29399(i).m29475(str, f);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public void m29432(boolean z) {
        this.f26771 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public void m29433(int i, int i2, int i3) {
        C1646 c1646M29399 = m29399(i);
        switch (i2) {
            case 1:
                c1646M29399.f26774.f26863 = i3;
                return;
            case 2:
                c1646M29399.f26774.f26865 = i3;
                return;
            case 3:
                c1646M29399.f26774.f26864 = i3;
                return;
            case 4:
                c1646M29399.f26774.f26866 = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                c1646M29399.f26774.f26868 = i3;
                return;
            case 7:
                c1646M29399.f26774.f26867 = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public void m29434(int i, int i2) {
        m29399(i).f26774.f26832 = i2;
        m29399(i).f26774.f26833 = -1;
        m29399(i).f26774.f26834 = -1.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public void m29435(int i, int i2) {
        m29399(i).f26774.f26833 = i2;
        m29399(i).f26774.f26832 = -1;
        m29399(i).f26774.f26834 = -1.0f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public void m29436(int i, float f) {
        m29399(i).f26774.f26834 = f;
        m29399(i).f26774.f26833 = -1;
        m29399(i).f26774.f26832 = -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public void m29437(int i, float f) {
        m29399(i).f26774.f26848 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public void m29438(int i, int i2) {
        m29399(i).f26774.f26871 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public void m29439(int i, float f) {
        m29399(i).f26774.f26870 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters */
    public void m29440(int i, String str, int i2) {
        m29399(i).m29476(str, i2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public void m29441(int i, int i2, int i3) {
        C1646 c1646M29399 = m29399(i);
        switch (i2) {
            case 1:
                c1646M29399.f26774.f26857 = i3;
                return;
            case 2:
                c1646M29399.f26774.f26858 = i3;
                return;
            case 3:
                c1646M29399.f26774.f26859 = i3;
                return;
            case 4:
                c1646M29399.f26774.f26860 = i3;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                c1646M29399.f26774.f26862 = i3;
                return;
            case 7:
                c1646M29399.f26774.f26861 = i3;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public void m29442(int i, int... iArr) {
        m29399(i).f26774.f26884 = iArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters */
    public void m29443(int i, float f) {
        m29399(i).f26775.f3713 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public void m29444(int i, float f) {
        m29399(i).f26775.f26917 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public void m29445(int i, float f) {
        m29399(i).f26775.f26918 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public void m29446(int i, float f) {
        m29399(i).f26775.f26919 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public void m29447(int i, float f) {
        m29399(i).f26775.f26920 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public void m29448(int i, String str, String str2) {
        m29399(i).m29477(str, str2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public void m29449(int i, float f, float f2) {
        C8773 c8773 = m29399(i).f26775;
        c8773.f26922 = f2;
        c8773.f26921 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public void m29450(int i, float f) {
        m29399(i).f26775.f26921 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public void m29451(int i, float f) {
        m29399(i).f26775.f26922 = f;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public void m29452(int i, float f, float f2) {
        C8773 c8773 = m29399(i).f26775;
        c8773.f26923 = f;
        c8773.f26924 = f2;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: contains not printable characters */
    public void m29453(int i, float f) {
        m29399(i).f26775.f26923 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public void m29454(int i, float f) {
        m29399(i).f26775.f26924 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public void m29455(int i, float f) {
        m29399(i).f26775.f26925 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    public void m29456(boolean z) {
        this.f3702 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public void m29457(int i, float f) {
        m29399(i).f26774.f26849 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public void m29458(int i, int i2) {
        m29399(i).f26774.f26872 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public void m29459(int i, float f) {
        m29399(i).f26774.f26869 = f;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public void m29460(int i, int i2) {
        m29399(i).f3705.f3711 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters */
    public void m29461(int i, int i2) {
        m29399(i).f3705.f26902 = i2;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public final String m29462(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }
}
