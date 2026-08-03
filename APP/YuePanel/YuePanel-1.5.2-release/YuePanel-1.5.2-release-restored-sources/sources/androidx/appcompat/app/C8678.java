package androidx.appcompat.app;

import Yue.C6740;
import Yue.C8273;
import Yue.InterfaceC4330;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.AbstractC1583;
import androidx.appcompat.app.LayoutInflaterFactory2C8655;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.InterfaceC8699;
import androidx.appcompat.widget.C8762;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8678 extends AbstractC1583 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final InterfaceC4330 f25864;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final Window.Callback f25865;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final LayoutInflaterFactory2C8655.InterfaceC8662 f25866;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f25867;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean f25868;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean f25869;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public ArrayList<AbstractC1583.InterfaceC8641> f25870 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final Runnable f25871 = new RunnableC1594();

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final Toolbar.InterfaceC8735 f25872;

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ */
    public class RunnableC1594 implements Runnable {
        public RunnableC1594() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8678.this.m28961();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟ */
    public class C1595 implements Toolbar.InterfaceC8735 {
        public C1595() {
        }

        @Override // androidx.appcompat.widget.Toolbar.InterfaceC8735
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C8678.this.f25865.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟, reason: contains not printable characters */
    public final class C8679 implements InterfaceC8699.InterfaceC1607 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f25874;

        public C8679() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
        public void onCloseMenu(@InterfaceC6391 C8694 c8694, boolean z) {
            if (this.f25874) {
                return;
            }
            this.f25874 = true;
            C8678.this.f25864.mo12545();
            C8678.this.f25865.onPanelClosed(108, c8694);
            this.f25874 = false;
        }

        @Override // androidx.appcompat.view.menu.InterfaceC8699.InterfaceC1607
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4617(@InterfaceC6391 C8694 c8694) {
            C8678.this.f25865.onMenuOpened(108, c8694);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟۟, reason: contains not printable characters */
    public final class C8680 implements C8694.InterfaceC1603 {
        public C8680() {
        }

        @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
        public boolean onMenuItemSelected(@InterfaceC6391 C8694 c8694, @InterfaceC6391 MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.C8694.InterfaceC1603
        public void onMenuModeChange(@InterfaceC6391 C8694 c8694) {
            if (C8678.this.f25864.mo1297()) {
                C8678.this.f25865.onPanelClosed(108, c8694);
            } else if (C8678.this.f25865.onPreparePanel(0, null, c8694)) {
                C8678.this.f25865.onMenuOpened(108, c8694);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.ۥ۟۟۟ۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C8681 implements LayoutInflaterFactory2C8655.InterfaceC8662 {
        public C8681() {
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C8655.InterfaceC8662
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C8678.this.f25864.getContext());
            }
            return null;
        }

        @Override // androidx.appcompat.app.LayoutInflaterFactory2C8655.InterfaceC8662
        /* JADX INFO: renamed from: ۥ */
        public boolean mo4616(int i) {
            if (i != 0) {
                return false;
            }
            C8678 c8678 = C8678.this;
            if (c8678.f25867) {
                return false;
            }
            c8678.f25864.mo12537();
            C8678.this.f25867 = true;
            return false;
        }
    }

    public C8678(@InterfaceC6391 Toolbar toolbar, @InterfaceC6490 CharSequence charSequence, @InterfaceC6391 Window.Callback callback) {
        C1595 c1595 = new C1595();
        this.f25872 = c1595;
        C6740.m21415(toolbar);
        C8762 c8762 = new C8762(toolbar, false);
        this.f25864 = c8762;
        this.f25865 = (Window.Callback) C6740.m21415(callback);
        c8762.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(c1595);
        c8762.setWindowTitle(charSequence);
        this.f25866 = new C8681();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo28688(AbstractC1583.InterfaceC8641 interfaceC8641) {
        this.f25870.add(interfaceC8641);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo28689(AbstractC1583.AbstractC8643 abstractC8643) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo28690(AbstractC1583.AbstractC8643 abstractC8643, int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo28691(AbstractC1583.AbstractC8643 abstractC8643, int i, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public void mo28692(AbstractC1583.AbstractC8643 abstractC8643, boolean z) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo28693() {
        return this.f25864.mo12542();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public boolean mo28694() {
        if (!this.f25864.mo12549()) {
            return false;
        }
        this.f25864.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo28695(boolean z) {
        if (z == this.f25869) {
            return;
        }
        this.f25869 = z;
        int size = this.f25870.size();
        for (int i = 0; i < size; i++) {
            this.f25870.get(i).m4596(z);
        }
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public View mo28696() {
        return this.f25864.mo12546();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public int mo28697() {
        return this.f25864.mo12570();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public float mo28698() {
        return C8273.m27347(this.f25864.mo12565());
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public int mo28699() {
        return this.f25864.getHeight();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public int mo28701() {
        return 0;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public int mo28702() {
        return 0;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public int mo28703() {
        return -1;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public AbstractC1583.AbstractC8643 mo28704() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public CharSequence mo28705() {
        return this.f25864.mo12569();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public AbstractC1583.AbstractC8643 mo28706(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public int mo28707() {
        return 0;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public Context mo28708() {
        return this.f25864.getContext();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public CharSequence mo28709() {
        return this.f25864.getTitle();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public void mo28710() {
        this.f25864.setVisibility(8);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public boolean mo28711() {
        this.f25864.mo12565().removeCallbacks(this.f25871);
        C8273.m27427(this.f25864.mo12565(), this.f25871);
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo28713() {
        return this.f25864.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public boolean mo28714() {
        return super.mo28714();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public AbstractC1583.AbstractC8643 mo28715() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ */
    public void mo28716(Configuration configuration) {
        super.mo28716(configuration);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public void mo28717() {
        this.f25864.mo12565().removeCallbacks(this.f25871);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public boolean mo28718(int i, KeyEvent keyEvent) {
        Menu menuM28960 = m28960();
        if (menuM28960 == null) {
            return false;
        }
        menuM28960.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM28960.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public boolean mo28719(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo28720();
        }
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public boolean mo28720() {
        return this.f25864.mo12543();
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public void mo28721() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public void mo28722(AbstractC1583.InterfaceC8641 interfaceC8641) {
        this.f25870.remove(interfaceC8641);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo28723(AbstractC1583.AbstractC8643 abstractC8643) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public void mo28724(int i) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public boolean mo28725() {
        ViewGroup viewGroupMo12565 = this.f25864.mo12565();
        if (viewGroupMo12565 == null || viewGroupMo12565.hasFocus()) {
            return false;
        }
        viewGroupMo12565.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
    public void mo28726(AbstractC1583.AbstractC8643 abstractC8643) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public void mo28727(@InterfaceC6490 Drawable drawable) {
        this.f25864.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public void mo28728(int i) {
        mo28729(LayoutInflater.from(this.f25864.getContext()).inflate(i, this.f25864.mo12565(), false));
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public void mo28729(View view) {
        mo28730(view, new AbstractC1583.C8639(-2, -2));
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo28730(View view, AbstractC1583.C8639 c8639) {
        if (view != null) {
            view.setLayoutParams(c8639);
        }
        this.f25864.mo12573(view);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo28731(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public void mo28732(boolean z) {
        mo28734(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo28733(int i) {
        mo28734(i, -1);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo28734(int i, int i2) {
        this.f25864.mo12551((i & i2) | ((~i2) & this.f25864.mo12570()));
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo28735(boolean z) {
        mo28734(z ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public void mo28736(boolean z) {
        mo28734(z ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    public void mo28737(boolean z) {
        mo28734(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public void mo28738(boolean z) {
        mo28734(z ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ */
    public void mo28739(float f) {
        C8273.m27453(this.f25864.mo12565(), f);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo28742(int i) {
        this.f25864.mo12572(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public void mo28743(CharSequence charSequence) {
        this.f25864.mo12552(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۢ */
    public void mo28744(int i) {
        this.f25864.mo12563(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo28745(Drawable drawable) {
        this.f25864.mo12577(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public void mo28746(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۥ */
    public void mo28747(int i) {
        this.f25864.setIcon(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۦ */
    public void mo28748(Drawable drawable) {
        this.f25864.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public void mo28749(SpinnerAdapter spinnerAdapter, AbstractC1583.InterfaceC8642 interfaceC8642) {
        this.f25864.mo12567(spinnerAdapter, new C8677(interfaceC8642));
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ */
    public void mo28750(int i) {
        this.f25864.setLogo(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥ */
    public void mo28751(Drawable drawable) {
        this.f25864.mo12548(drawable);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥ۟ */
    public void mo28752(int i) {
        if (i == 2) {
            throw new IllegalArgumentException("Tabs not supported in this configuration");
        }
        this.f25864.mo12562(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo28753(int i) {
        if (this.f25864.mo12559() != 1) {
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
        }
        this.f25864.mo12556(i);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۡ */
    public void mo28754(boolean z) {
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public void mo28755(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۣ */
    public void mo28756(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۤ */
    public void mo28757(int i) {
        InterfaceC4330 interfaceC4330 = this.f25864;
        interfaceC4330.mo12553(i != 0 ? interfaceC4330.getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public void mo28758(CharSequence charSequence) {
        this.f25864.mo12553(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۦ */
    public void mo28759(int i) {
        InterfaceC4330 interfaceC4330 = this.f25864;
        interfaceC4330.setTitle(i != 0 ? interfaceC4330.getContext().getText(i) : null);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۧ */
    public void mo28760(CharSequence charSequence) {
        this.f25864.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۥۨ */
    public void mo28761(CharSequence charSequence) {
        this.f25864.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.AbstractC1583
    /* JADX INFO: renamed from: ۥ۟۟ۦ */
    public void mo28762() {
        this.f25864.setVisibility(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦ۠, reason: contains not printable characters */
    public final Menu m28960() {
        if (!this.f25868) {
            this.f25864.mo12564(new C8679(), new C8680());
            this.f25868 = true;
        }
        return this.f25864.mo12557();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public void m28961() {
        Menu menuM28960 = m28960();
        C8694 c8694 = menuM28960 instanceof C8694 ? (C8694) menuM28960 : null;
        if (c8694 != null) {
            c8694.stopDispatchingItemsChanged();
        }
        try {
            menuM28960.clear();
            if (!this.f25865.onCreatePanelMenu(0, menuM28960) || !this.f25865.onPreparePanel(0, null, menuM28960)) {
                menuM28960.clear();
            }
            if (c8694 != null) {
                c8694.startDispatchingItemsChanged();
            }
        } catch (Throwable th) {
            if (c8694 != null) {
                c8694.startDispatchingItemsChanged();
            }
            throw th;
        }
    }
}
