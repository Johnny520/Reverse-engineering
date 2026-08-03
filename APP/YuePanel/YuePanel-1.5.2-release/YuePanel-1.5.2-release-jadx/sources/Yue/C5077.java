package Yue;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewModelStoreOwner;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۢۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5077 {

    /* JADX INFO: renamed from: ۥ */
    public final AbstractC5078<?> f1258;

    public C5077(AbstractC5078<?> abstractC5078) {
        this.f1258 = abstractC5078;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static C5077 m1895(@InterfaceC6391 AbstractC5078<?> abstractC5078) {
        return new C5077((AbstractC5078) C6740.m21416(abstractC5078, "callbacks == null"));
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1896(@InterfaceC6490 Fragment fragment) {
        AbstractC5078<?> abstractC5078 = this.f1258;
        abstractC5078.f12033.m29747(abstractC5078, abstractC5078, fragment);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m15629() {
        this.f1258.f12033.m29760();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m15630(@InterfaceC6391 Configuration configuration) {
        this.f1258.f12033.m29762(configuration, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean m15631(@InterfaceC6391 MenuItem menuItem) {
        return this.f1258.f12033.m29763(menuItem);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m15632() {
        this.f1258.f12033.m29764();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m15633(@InterfaceC6391 Menu menu, @InterfaceC6391 MenuInflater menuInflater) {
        return this.f1258.f12033.m29765(menu, menuInflater);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m15634() {
        this.f1258.f12033.m29766();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m15635() {
        this.f1258.f12033.m29767();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m15636() {
        this.f1258.f12033.m29768(true);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m15637(boolean z) {
        this.f1258.f12033.m29769(z, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m15638(@InterfaceC6391 MenuItem menuItem) {
        return this.f1258.f12033.m29772(menuItem);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m15639(@InterfaceC6391 Menu menu) {
        this.f1258.f12033.m29773(menu);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m15640() {
        this.f1258.f12033.m29775();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m15641(boolean z) {
        this.f1258.f12033.m29776(z, true);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m15642(@InterfaceC6391 Menu menu) {
        return this.f1258.f12033.m29777(menu);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m15643() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m15644() {
        this.f1258.f12033.m29779();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m15645() {
        this.f1258.f12033.m29780();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m15646() {
        this.f1258.f12033.m29782();
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void m15647() {
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m15648() {
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public void m15649() {
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m15650(boolean z) {
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m15651(@InterfaceC6391 String str, @InterfaceC6490 FileDescriptor fileDescriptor, @InterfaceC6391 PrintWriter printWriter, @InterfaceC6490 String[] strArr) {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public boolean m15652() {
        return this.f1258.f12033.m29789(true);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Fragment m15653(@InterfaceC6391 String str) {
        return this.f1258.f12033.m29797(str);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public List<Fragment> m15654(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f1258.f12033.m29802();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public int m15655() {
        return this.f1258.f12033.m29801();
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public FragmentManager m15656() {
        return this.f1258.f12033;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public AbstractC5748 m15657() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void m15658() {
        this.f1258.f12033.m29840();
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public View m15659(@InterfaceC6490 View view, @InterfaceC6391 String str, @InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        return this.f1258.f12033.m29813().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void m15660() {
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m15661(@InterfaceC6490 Parcelable parcelable, @InterfaceC6490 C5085 c5085) {
        this.f1258.f12033.m29861(parcelable, c5085);
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void m15662(@InterfaceC6490 Parcelable parcelable, @InterfaceC6490 List<Fragment> list) {
        this.f1258.f12033.m29861(parcelable, new C5085(list, null, null));
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void m15663(@SuppressLint({"UnknownNullness"}) C7467<String, AbstractC5748> c7467) {
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void m15664(@InterfaceC6490 Parcelable parcelable) {
        AbstractC5078<?> abstractC5078 = this.f1258;
        if (!(abstractC5078 instanceof ViewModelStoreOwner)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        abstractC5078.f12033.m29864(parcelable);
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public C7467<String, AbstractC5748> m15665() {
        return null;
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public C5085 m15666() {
        return this.f1258.f12033.m29866();
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public List<Fragment> m15667() {
        C5085 c5085M29866 = this.f1258.f12033.m29866();
        if (c5085M29866 == null || c5085M29866.m1898() == null) {
            return null;
        }
        return new ArrayList(c5085M29866.m1898());
    }

    @InterfaceC6490
    @Deprecated
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public Parcelable m15668() {
        return this.f1258.f12033.m29867();
    }
}
