package Yue;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5725 extends Fragment {

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f14147 = 16711681;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f14148 = 16711682;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f14149 = 16711683;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Handler f14150 = new Handler();

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Runnable f14151 = new RunnableC0852();

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final AdapterView.OnItemClickListener f14152 = new C0853();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public ListAdapter f14153;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public ListView f14154;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public View f14155;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public TextView f14156;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public View f14157;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public View f14158;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public CharSequence f14159;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public boolean f14160;

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ$ۥ */
    public class RunnableC0852 implements Runnable {
        public RunnableC0852() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = C5725.this.f14154;
            listView.focusableViewAvailable(listView);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۧۢ$ۥ۟ */
    public class C0853 implements AdapterView.OnItemClickListener {
        public C0853() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            C5725.this.m17729((ListView) adapterView, view, i, j);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @InterfaceC6490
    public View onCreateView(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, @InterfaceC6490 Bundle bundle) {
        Context contextRequireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireContext);
        LinearLayout linearLayout = new LinearLayout(contextRequireContext);
        linearLayout.setId(f14148);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(contextRequireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(contextRequireContext);
        frameLayout2.setId(f14149);
        TextView textView = new TextView(contextRequireContext);
        textView.setId(f14147);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(contextRequireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f14150.removeCallbacks(this.f14151);
        this.f14154 = null;
        this.f14160 = false;
        this.f14158 = null;
        this.f14157 = null;
        this.f14155 = null;
        this.f14156 = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@InterfaceC6391 View view, @InterfaceC6490 Bundle bundle) {
        super.onViewCreated(view, bundle);
        m17724();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m17724() {
        if (this.f14154 != null) {
            return;
        }
        View view = getView();
        if (view == null) {
            throw new IllegalStateException("Content view not yet created");
        }
        if (view instanceof ListView) {
            this.f14154 = (ListView) view;
        } else {
            TextView textView = (TextView) view.findViewById(f14147);
            this.f14156 = textView;
            if (textView == null) {
                this.f14155 = view.findViewById(R.id.empty);
            } else {
                textView.setVisibility(8);
            }
            this.f14157 = view.findViewById(f14148);
            this.f14158 = view.findViewById(f14149);
            View viewFindViewById = view.findViewById(R.id.list);
            if (!(viewFindViewById instanceof ListView)) {
                if (viewFindViewById != null) {
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
            }
            ListView listView = (ListView) viewFindViewById;
            this.f14154 = listView;
            View view2 = this.f14155;
            if (view2 != null) {
                listView.setEmptyView(view2);
            } else {
                CharSequence charSequence = this.f14159;
                if (charSequence != null) {
                    this.f14156.setText(charSequence);
                    this.f14154.setEmptyView(this.f14156);
                }
            }
        }
        this.f14160 = true;
        this.f14154.setOnItemClickListener(this.f14152);
        ListAdapter listAdapter = this.f14153;
        if (listAdapter != null) {
            this.f14153 = null;
            m17732(listAdapter);
        } else if (this.f14157 != null) {
            m17734(false, false);
        }
        this.f14150.post(this.f14151);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public ListAdapter m17725() {
        return this.f14153;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public ListView m17726() {
        m17724();
        return this.f14154;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public long m17727() {
        m17724();
        return this.f14154.getSelectedItemId();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m17728() {
        m17724();
        return this.f14154.getSelectedItemPosition();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m17729(@InterfaceC6391 ListView listView, @InterfaceC6391 View view, int i, long j) {
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final ListAdapter m17730() {
        ListAdapter listAdapterM17725 = m17725();
        if (listAdapterM17725 != null) {
            return listAdapterM17725;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m17731(@InterfaceC6490 CharSequence charSequence) {
        m17724();
        TextView textView = this.f14156;
        if (textView == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        textView.setText(charSequence);
        if (this.f14159 == null) {
            this.f14154.setEmptyView(this.f14156);
        }
        this.f14159 = charSequence;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m17732(@InterfaceC6490 ListAdapter listAdapter) {
        boolean z = this.f14153 != null;
        this.f14153 = listAdapter;
        ListView listView = this.f14154;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (this.f14160 || z) {
                return;
            }
            m17734(true, requireView().getWindowToken() != null);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m17733(boolean z) {
        m17734(z, true);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m17734(boolean z, boolean z2) {
        m17724();
        View view = this.f14157;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        }
        if (this.f14160 == z) {
            return;
        }
        this.f14160 = z;
        if (z) {
            if (z2) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                this.f14158.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            } else {
                view.clearAnimation();
                this.f14158.clearAnimation();
            }
            this.f14157.setVisibility(8);
            this.f14158.setVisibility(0);
            return;
        }
        if (z2) {
            view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
            this.f14158.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
        } else {
            view.clearAnimation();
            this.f14158.clearAnimation();
        }
        this.f14157.setVisibility(0);
        this.f14158.setVisibility(8);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m17735(boolean z) {
        m17734(z, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m17736(int i) {
        m17724();
        this.f14154.setSelection(i);
    }
}
