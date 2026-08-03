package com.bumptech.glide.manager;

import Yue.C3394;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class RequestManagerRetriever implements Handler.Callback {
    private static final RequestManagerFactory DEFAULT_FACTORY = new RequestManagerFactory() { // from class: com.bumptech.glide.manager.RequestManagerRetriever.1
        @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
        @InterfaceC6391
        public RequestManager build(@InterfaceC6391 Glide glide, @InterfaceC6391 Lifecycle lifecycle, @InterfaceC6391 RequestManagerTreeNode requestManagerTreeNode, @InterfaceC6391 Context context) {
            return new RequestManager(glide, lifecycle, requestManagerTreeNode, context);
        }
    };

    @InterfaceC8392
    static final String FRAGMENT_TAG = "com.bumptech.glide.manager";
    private volatile RequestManager applicationManager;
    private final RequestManagerFactory factory;
    private final FrameWaiter frameWaiter;
    private final LifecycleRequestManagerRetriever lifecycleRequestManagerRetriever;
    private final C3394<View, Fragment> tempViewToSupportFragment = new C3394<>();

    public interface RequestManagerFactory {
        @InterfaceC6391
        RequestManager build(@InterfaceC6391 Glide glide, @InterfaceC6391 Lifecycle lifecycle, @InterfaceC6391 RequestManagerTreeNode requestManagerTreeNode, @InterfaceC6391 Context context);
    }

    public RequestManagerRetriever(@InterfaceC6490 RequestManagerFactory requestManagerFactory) {
        requestManagerFactory = requestManagerFactory == null ? DEFAULT_FACTORY : requestManagerFactory;
        this.factory = requestManagerFactory;
        this.lifecycleRequestManagerRetriever = new LifecycleRequestManagerRetriever(requestManagerFactory);
        this.frameWaiter = buildFrameWaiter();
    }

    @TargetApi(17)
    private static void assertNotDestroyed(@InterfaceC6391 Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static FrameWaiter buildFrameWaiter() {
        return (HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED && HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED) ? new FirstFrameWaiter() : new DoNothingFirstFrameWaiter();
    }

    @InterfaceC6490
    private static Activity findActivity(@InterfaceC6391 Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void findAllSupportFragmentsWithViews(@InterfaceC6490 Collection<Fragment> collection, @InterfaceC6391 Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                findAllSupportFragmentsWithViews(fragment.getChildFragmentManager().m29811(), map);
            }
        }
    }

    @InterfaceC6490
    private Fragment findSupportFragment(@InterfaceC6391 View view, @InterfaceC6391 FragmentActivity fragmentActivity) {
        this.tempViewToSupportFragment.clear();
        findAllSupportFragmentsWithViews(fragmentActivity.getSupportFragmentManager().m29811(), this.tempViewToSupportFragment);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = this.tempViewToSupportFragment.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.tempViewToSupportFragment.clear();
        return fragment;
    }

    @InterfaceC6391
    private RequestManager getApplicationManager(@InterfaceC6391 Context context) {
        if (this.applicationManager == null) {
            synchronized (this) {
                try {
                    if (this.applicationManager == null) {
                        this.applicationManager = this.factory.build(Glide.get(context.getApplicationContext()), new ApplicationLifecycle(), new EmptyRequestManagerTreeNode(), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.applicationManager;
    }

    private static boolean isActivityVisible(Context context) {
        Activity activityFindActivity = findActivity(context);
        return activityFindActivity == null || !activityFindActivity.isFinishing();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public RequestManager get(@InterfaceC6391 Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (Util.isOnMainThread() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return get((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return get(contextWrapper.getBaseContext());
                }
            }
        }
        return getApplicationManager(context);
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @InterfaceC6391
    public RequestManager get(@InterfaceC6391 FragmentActivity fragmentActivity) {
        if (Util.isOnBackgroundThread()) {
            return get(fragmentActivity.getApplicationContext());
        }
        assertNotDestroyed(fragmentActivity);
        this.frameWaiter.registerSelf(fragmentActivity);
        boolean zIsActivityVisible = isActivityVisible(fragmentActivity);
        return this.lifecycleRequestManagerRetriever.getOrCreate(fragmentActivity, Glide.get(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), zIsActivityVisible);
    }

    @InterfaceC6391
    public RequestManager get(@InterfaceC6391 Fragment fragment) {
        Preconditions.checkNotNull(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (Util.isOnBackgroundThread()) {
            return get(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.frameWaiter.registerSelf(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.lifecycleRequestManagerRetriever.getOrCreate(context, Glide.get(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @InterfaceC6391
    @Deprecated
    public RequestManager get(@InterfaceC6391 Activity activity) {
        return get(activity.getApplicationContext());
    }

    @InterfaceC6391
    public RequestManager get(@InterfaceC6391 View view) {
        if (Util.isOnBackgroundThread()) {
            return get(view.getContext().getApplicationContext());
        }
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityFindActivity = findActivity(view.getContext());
        if (activityFindActivity == null) {
            return get(view.getContext().getApplicationContext());
        }
        if (activityFindActivity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityFindActivity;
            Fragment fragmentFindSupportFragment = findSupportFragment(view, fragmentActivity);
            return fragmentFindSupportFragment != null ? get(fragmentFindSupportFragment) : get(fragmentActivity);
        }
        return get(view.getContext().getApplicationContext());
    }

    @InterfaceC6391
    @TargetApi(17)
    @Deprecated
    public RequestManager get(@InterfaceC6391 android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            return get(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }
}
