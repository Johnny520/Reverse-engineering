package androidx.fragment.app;

import Yue.C5093;
import Yue.C6884;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C8877 implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final String f29712 = "FragmentManager";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final FragmentManager f29713;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۢ$ۥ */
    public class ViewOnAttachStateChangeListenerC1697 implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C8882 f29714;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ViewOnAttachStateChangeListenerC1697(C8882 c8882) {
            this.f29714 = c8882;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment fragmentM30000 = this.f29714.m30000();
            this.f29714.m30002();
            AbstractC8887.m30076((ViewGroup) fragmentM30000.mView.getParent(), LayoutInflaterFactory2C8877.this.f29713).m30085();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public LayoutInflaterFactory2C8877(FragmentManager fragmentManager) {
        this.f29713 = fragmentManager;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.LayoutInflater.Factory
    @InterfaceC6490
    public View onCreateView(@InterfaceC6391 String str, @InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // android.view.LayoutInflater.Factory2
    @InterfaceC6490
    public View onCreateView(@InterfaceC6490 View view, @InterfaceC6391 String str, @InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        C8882 c8882M29758;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f29713);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6884.C6886.f2416);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(C6884.C6886.f2417);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C6884.C6886.f18209, -1);
        String string = typedArrayObtainStyledAttributes.getString(C6884.C6886.f18210);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue == null || !C8876.m4841(context.getClassLoader(), attributeValue)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
        }
        Fragment fragmentM29795 = resourceId != -1 ? this.f29713.m29795(resourceId) : null;
        if (fragmentM29795 == null && string != null) {
            fragmentM29795 = this.f29713.m29796(string);
        }
        if (fragmentM29795 == null && id != -1) {
            fragmentM29795 = this.f29713.m29795(id);
        }
        if (fragmentM29795 == null) {
            fragmentM29795 = this.f29713.m29809().mo4815(context.getClassLoader(), attributeValue);
            fragmentM29795.mFromLayout = true;
            fragmentM29795.mFragmentId = resourceId != 0 ? resourceId : id;
            fragmentM29795.mContainerId = id;
            fragmentM29795.mTag = string;
            fragmentM29795.mInLayout = true;
            FragmentManager fragmentManager = this.f29713;
            fragmentM29795.mFragmentManager = fragmentManager;
            fragmentM29795.mHost = fragmentManager.m29812();
            fragmentM29795.onInflate(this.f29713.m29812().m15670(), attributeSet, fragmentM29795.mSavedFragmentState);
            c8882M29758 = this.f29713.m29742(fragmentM29795);
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Fragment " + fragmentM29795 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        } else {
            if (fragmentM29795.mInLayout) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
            }
            fragmentM29795.mInLayout = true;
            FragmentManager fragmentManager2 = this.f29713;
            fragmentM29795.mFragmentManager = fragmentManager2;
            fragmentM29795.mHost = fragmentManager2.m29812();
            fragmentM29795.onInflate(this.f29713.m29812().m15670(), attributeSet, fragmentM29795.mSavedFragmentState);
            c8882M29758 = this.f29713.m29758(fragmentM29795);
            if (FragmentManager.m29739(2)) {
                Log.v("FragmentManager", "Retained Fragment " + fragmentM29795 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        C5093.m15701(fragmentM29795, viewGroup);
        fragmentM29795.mContainer = viewGroup;
        c8882M29758.m30002();
        c8882M29758.m29999();
        View view2 = fragmentM29795.mView;
        if (view2 == null) {
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        if (resourceId != 0) {
            view2.setId(resourceId);
        }
        if (fragmentM29795.mView.getTag() == null) {
            fragmentM29795.mView.setTag(string);
        }
        fragmentM29795.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1697(c8882M29758));
        return fragmentM29795.mView;
    }
}
