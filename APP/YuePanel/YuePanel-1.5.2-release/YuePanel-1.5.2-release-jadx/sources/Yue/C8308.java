package Yue;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢۤۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C8308 {

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۦ$ۥ */
    public static final class C1480 implements InterfaceC7326<View> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ ViewGroup f3398;

        public C1480(ViewGroup viewGroup) {
            this.f3398 = viewGroup;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<View> iterator() {
            return C8308.m27691(this.f3398);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۦ$ۥ۟ */
    public static final class C1481 extends AbstractC5673 implements InterfaceC5124<View, Iterator<? extends View>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1481 f24800 = new C1481();

        public C1481() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Iterator<View> invoke(@InterfaceC6399 View view) {
            InterfaceC7326<View> interfaceC7326M27685;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup == null || (interfaceC7326M27685 = C8308.m27685(viewGroup)) == null) {
                return null;
            }
            return interfaceC7326M27685.iterator();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۦ$ۥ۟۟, reason: contains not printable characters */
    public static final class C8309 implements Iterator<View>, InterfaceC5594 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f24801;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ ViewGroup f24802;

        public C8309(ViewGroup viewGroup) {
            this.f24802 = viewGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24801 < this.f24802.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f24802;
            int i = this.f24801 - 1;
            this.f24801 = i;
            viewGroup.removeViewAt(i);
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f24802;
            int i = this.f24801;
            this.f24801 = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۦ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,680:1\n127#2:681\n*E\n"})
    public static final class C8310 implements InterfaceC7326<View> {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ ViewGroup f3399;

        public C8310(ViewGroup viewGroup) {
            this.f3399 = viewGroup;
        }

        @Override // Yue.InterfaceC7326
        @InterfaceC6399
        public Iterator<View> iterator() {
            return new C8000(C8308.m27685(this.f3399).iterator(), C1481.f24800);
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static final boolean m4290(@InterfaceC6399 ViewGroup viewGroup, @InterfaceC6399 View view) {
        return viewGroup.indexOfChild(view) != -1;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m4291(@InterfaceC6399 ViewGroup viewGroup, @InterfaceC6399 InterfaceC5124<? super View, C8107> interfaceC5124) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            interfaceC5124.invoke(viewGroup.getChildAt(i));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m27683(@InterfaceC6399 ViewGroup viewGroup, @InterfaceC6399 InterfaceC5138<? super Integer, ? super View, C8107> interfaceC5138) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            interfaceC5138.invoke(Integer.valueOf(i), viewGroup.getChildAt(i));
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final View m27684(@InterfaceC6399 ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final InterfaceC7326<View> m27685(@InterfaceC6399 ViewGroup viewGroup) {
        return new C1480(viewGroup);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final InterfaceC7326<View> m27686(@InterfaceC6399 ViewGroup viewGroup) {
        return new C8310(viewGroup);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final C5458 m27687(@InterfaceC6399 ViewGroup viewGroup) {
        return C7007.m21793(0, viewGroup.getChildCount());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m27688(@InterfaceC6399 ViewGroup viewGroup) {
        return viewGroup.getChildCount();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m27689(@InterfaceC6399 ViewGroup viewGroup) {
        return viewGroup.getChildCount() == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m27690(@InterfaceC6399 ViewGroup viewGroup) {
        return viewGroup.getChildCount() != 0;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Iterator<View> m27691(@InterfaceC6399 ViewGroup viewGroup) {
        return new C8309(viewGroup);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m27692(@InterfaceC6399 ViewGroup viewGroup, @InterfaceC6399 View view) {
        viewGroup.removeView(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final void m27693(@InterfaceC6399 ViewGroup viewGroup, @InterfaceC6399 View view) {
        viewGroup.addView(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m27694(@InterfaceC6399 ViewGroup.MarginLayoutParams marginLayoutParams, @InterfaceC6844 int i) {
        marginLayoutParams.setMargins(i, i, i, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m27695(@InterfaceC6399 ViewGroup.MarginLayoutParams marginLayoutParams, @InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6844 int i3, @InterfaceC6844 int i4) {
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ void m27696(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.leftMargin;
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.rightMargin;
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMargins(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final void m27697(@InterfaceC6399 ViewGroup.MarginLayoutParams marginLayoutParams, @InterfaceC6844 int i, @InterfaceC6844 int i2, @InterfaceC6844 int i3, @InterfaceC6844 int i4) {
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m27698(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = marginLayoutParams.getMarginStart();
        }
        if ((i5 & 2) != 0) {
            i2 = marginLayoutParams.topMargin;
        }
        if ((i5 & 4) != 0) {
            i3 = marginLayoutParams.getMarginEnd();
        }
        if ((i5 & 8) != 0) {
            i4 = marginLayoutParams.bottomMargin;
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.topMargin = i2;
        marginLayoutParams.setMarginEnd(i3);
        marginLayoutParams.bottomMargin = i4;
    }
}
