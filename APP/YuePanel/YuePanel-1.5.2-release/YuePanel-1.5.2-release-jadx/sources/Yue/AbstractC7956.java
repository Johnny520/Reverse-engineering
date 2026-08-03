package Yue;

import Yue.AbstractC4565;
import Yue.AbstractC7956;
import Yue.InterfaceC7144;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7956 implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<C7995> mEndValuesList;
    private AbstractC7960 mEpicenterCallback;
    private InterfaceC7964[] mListenersCache;
    private C3394<String, String> mNameOverrides;
    AbstractC7988 mPropagation;
    C7963 mSeekController;
    long mSeekOffsetInParent;
    private ArrayList<C7995> mStartValuesList;
    long mTotalDuration;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final AbstractC6623 STRAIGHT_PATH_MOTION = new C1391();
    private static ThreadLocal<C3394<Animator, C7958>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private C7996 mStartValues = new C7996();
    private C7996 mEndValues = new C7996();
    C7991 mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private AbstractC7956 mCloneParent = null;
    private ArrayList<InterfaceC7964> mListeners = null;
    ArrayList<Animator> mAnimators = new ArrayList<>();
    private AbstractC6623 mPathMotion = STRAIGHT_PATH_MOTION;

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ */
    public class C1391 extends AbstractC6623 {
        @Override // Yue.AbstractC6623
        @InterfaceC6391
        public Path getPath(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟ */
    public class C1392 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: ۥ */
        public final /* synthetic */ C3394 f3142;

        public C1392(C3394 c3394) {
            this.f3142 = c3394;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3142.remove(animator);
            AbstractC7956.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC7956.this.mCurrentAnimators.add(animator);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟, reason: contains not printable characters */
    public class C7957 extends AnimatorListenerAdapter {
        public C7957() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC7956.this.end();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C7958 {

        /* JADX INFO: renamed from: ۥ */
        public View f3145;

        /* JADX INFO: renamed from: ۥ۟ */
        public String f3146;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C7995 f23727;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public WindowId f23728;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public AbstractC7956 f23729;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public Animator f23730;

        public C7958(View view, String str, AbstractC7956 abstractC7956, WindowId windowId, C7995 c7995, Animator animator) {
            this.f3145 = view;
            this.f3146 = str;
            this.f23727 = c7995;
            this.f23728 = windowId;
            this.f23729 = abstractC7956;
            this.f23730 = animator;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C7959 {
        /* JADX INFO: renamed from: ۥ */
        public static <T> ArrayList<T> m3982(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static <T> ArrayList<T> m3983(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static abstract class AbstractC7960 {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        public abstract Rect mo1922(@InterfaceC6391 AbstractC7956 abstractC7956);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC7113(26)
    public static class C7961 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static long m3984(Animator animator) {
            return animator.getTotalDuration();
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static void m3985(Animator animator, long j) {
            ((AnimatorSet) animator).setCurrentPlayTime(j);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC7962 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC7113(34)
    public class C7963 extends C7985 implements InterfaceC7990, AbstractC4565.InterfaceC4581 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f23732;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f23733;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public C7560 f23734;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public Runnable f23737;

        /* JADX INFO: renamed from: ۥ */
        public long f3147 = -1;

        /* JADX INFO: renamed from: ۥ۟ */
        public ArrayList<InterfaceC4144<InterfaceC7990>> f3148 = null;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public ArrayList<InterfaceC4144<InterfaceC7990>> f23731 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public InterfaceC4144<InterfaceC7990>[] f23735 = null;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final C8172 f23736 = new C8172();

        public C7963() {
        }

        @Override // Yue.C7985, Yue.AbstractC7956.InterfaceC7964
        public void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956) {
            this.f23733 = true;
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ */
        public void mo3986(float f) {
            if (this.f23734 != null) {
                throw new IllegalStateException("setCurrentFraction() called after animation has been started");
            }
            mo25127((long) (f * mo25134()));
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟ */
        public long mo3987() {
            return Math.min(mo25134(), Math.max(0L, this.f3147));
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public void mo25125(@InterfaceC6391 InterfaceC4144<InterfaceC7990> interfaceC4144) {
            ArrayList<InterfaceC4144<InterfaceC7990>> arrayList = this.f3148;
            if (arrayList != null) {
                arrayList.remove(interfaceC4144);
                if (this.f3148.isEmpty()) {
                    this.f3148 = null;
                }
            }
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean mo25126() {
            return this.f23732;
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo25127(long j) {
            if (this.f23734 != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            if (j == this.f3147 || !mo25126()) {
                return;
            }
            if (!this.f23733) {
                if (j != 0 || this.f3147 <= 0) {
                    long jMo25134 = mo25134();
                    if (j == jMo25134 && this.f3147 < jMo25134) {
                        j = 1 + jMo25134;
                    }
                } else {
                    j = -1;
                }
                long j2 = this.f3147;
                if (j != j2) {
                    AbstractC7956.this.setCurrentPlayTimeMillis(j, j2);
                    this.f3147 = j;
                }
            }
            m25135();
            this.f23736.m4198(AnimationUtils.currentAnimationTimeMillis(), j);
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo25128() {
            m25136();
            this.f23734.m23659(mo25134() + 1);
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo25129(@InterfaceC6391 Runnable runnable) {
            this.f23737 = runnable;
            m25136();
            this.f23734.m23659(0.0f);
        }

        @Override // Yue.AbstractC4565.InterfaceC4581
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo13631(AbstractC4565 abstractC4565, float f, float f2) {
            long jMax = Math.max(-1L, Math.min(mo25134() + 1, Math.round(f)));
            AbstractC7956.this.setCurrentPlayTimeMillis(jMax, this.f3147);
            this.f3147 = jMax;
            m25135();
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo25130(@InterfaceC6391 InterfaceC4144<InterfaceC7990> interfaceC4144) {
            if (this.f23731 == null) {
                this.f23731 = new ArrayList<>();
            }
            this.f23731.add(interfaceC4144);
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void mo25131(@InterfaceC6391 InterfaceC4144<InterfaceC7990> interfaceC4144) {
            if (mo25126()) {
                interfaceC4144.accept(this);
                return;
            }
            if (this.f3148 == null) {
                this.f3148 = new ArrayList<>();
            }
            this.f3148.add(interfaceC4144);
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void mo25132(@InterfaceC6391 InterfaceC4144<InterfaceC7990> interfaceC4144) {
            ArrayList<InterfaceC4144<InterfaceC7990>> arrayList = this.f23731;
            if (arrayList != null) {
                arrayList.remove(interfaceC4144);
            }
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public float mo25133() {
            return mo3987() / mo25134();
        }

        @Override // Yue.InterfaceC7990
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public long mo25134() {
            return AbstractC7956.this.getTotalDurationMillis();
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public final void m25135() {
            ArrayList<InterfaceC4144<InterfaceC7990>> arrayList = this.f23731;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            int size = this.f23731.size();
            if (this.f23735 == null) {
                this.f23735 = new InterfaceC4144[size];
            }
            InterfaceC4144<InterfaceC7990>[] interfaceC4144Arr = (InterfaceC4144[]) this.f23731.toArray(this.f23735);
            this.f23735 = null;
            for (int i = 0; i < size; i++) {
                interfaceC4144Arr[i].accept(this);
                interfaceC4144Arr[i] = null;
            }
            this.f23735 = interfaceC4144Arr;
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public final void m25136() {
            if (this.f23734 != null) {
                return;
            }
            this.f23736.m4198(AnimationUtils.currentAnimationTimeMillis(), this.f3147);
            this.f23734 = new C7560(new C4887());
            C7561 c7561 = new C7561();
            c7561.m23669(1.0f);
            c7561.m23671(200.0f);
            this.f23734.m23663(c7561);
            this.f23734.m13625(this.f3147);
            this.f23734.m13610(this);
            this.f23734.mo13626(this.f23736.m4199());
            this.f23734.mo13621(mo25134() + 1);
            this.f23734.mo13622(-1.0f);
            this.f23734.m13623(4.0f);
            this.f23734.m1513(new AbstractC4565.InterfaceC4580() { // from class: Yue.ۥۢۢ۟ۨ
                @Override // Yue.AbstractC4565.InterfaceC4580
                /* JADX INFO: renamed from: ۥ */
                public final void mo1542(AbstractC4565 abstractC4565, boolean z, float f, float f2) {
                    this.f3151.m25138(abstractC4565, z, f, f2);
                }
            });
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void m25137() {
            long j = mo25134() == 0 ? 1L : 0L;
            AbstractC7956.this.setCurrentPlayTimeMillis(j, this.f3147);
            this.f3147 = j;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ void m25138(AbstractC4565 abstractC4565, boolean z, float f, float f2) {
            if (z) {
                return;
            }
            if (f >= 1.0f) {
                AbstractC7956.this.notifyListeners(InterfaceC7965.f3150, false);
                return;
            }
            long jMo25134 = mo25134();
            AbstractC7956 abstractC7956M25184 = ((C7991) AbstractC7956.this).m25184(0);
            AbstractC7956 abstractC7956 = abstractC7956M25184.mCloneParent;
            abstractC7956M25184.mCloneParent = null;
            AbstractC7956.this.setCurrentPlayTimeMillis(-1L, this.f3147);
            AbstractC7956.this.setCurrentPlayTimeMillis(jMo25134, -1L);
            this.f3147 = jMo25134;
            Runnable runnable = this.f23737;
            if (runnable != null) {
                runnable.run();
            }
            AbstractC7956.this.mAnimators.clear();
            if (abstractC7956 != null) {
                abstractC7956.notifyListeners(InterfaceC7965.f3150, true);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public void m25139() {
            this.f23732 = true;
            ArrayList<InterfaceC4144<InterfaceC7990>> arrayList = this.f3148;
            if (arrayList != null) {
                this.f3148 = null;
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(this);
                }
            }
            m25135();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public interface InterfaceC7964 {
        void onTransitionCancel(@InterfaceC6391 AbstractC7956 abstractC7956);

        void onTransitionEnd(@InterfaceC6391 AbstractC7956 abstractC7956);

        void onTransitionPause(@InterfaceC6391 AbstractC7956 abstractC7956);

        void onTransitionResume(@InterfaceC6391 AbstractC7956 abstractC7956);

        void onTransitionStart(@InterfaceC6391 AbstractC7956 abstractC7956);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        default void mo25140(@InterfaceC6391 AbstractC7956 abstractC7956, boolean z) {
            onTransitionEnd(abstractC7956);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        default void mo14462(@InterfaceC6391 AbstractC7956 abstractC7956, boolean z) {
            onTransitionStart(abstractC7956);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۢ۟ۧ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    public interface InterfaceC7965 {

        /* JADX INFO: renamed from: ۥ */
        public static final InterfaceC7965 f3149 = new InterfaceC7965() { // from class: Yue.ۥۢۢ۠
            @Override // Yue.AbstractC7956.InterfaceC7965
            /* JADX INFO: renamed from: ۥ */
            public final void mo3989(AbstractC7956.InterfaceC7964 interfaceC7964, AbstractC7956 abstractC7956, boolean z) {
                interfaceC7964.mo14462(abstractC7956, z);
            }
        };

        /* JADX INFO: renamed from: ۥ۟ */
        public static final InterfaceC7965 f3150 = new InterfaceC7965() { // from class: Yue.ۥۢۢ۠۟
            @Override // Yue.AbstractC7956.InterfaceC7965
            /* JADX INFO: renamed from: ۥ */
            public final void mo3989(AbstractC7956.InterfaceC7964 interfaceC7964, AbstractC7956 abstractC7956, boolean z) {
                interfaceC7964.mo25140(abstractC7956, z);
            }
        };

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final InterfaceC7965 f23739 = new InterfaceC7965() { // from class: Yue.ۥۢۢ۠۠
            @Override // Yue.AbstractC7956.InterfaceC7965
            /* JADX INFO: renamed from: ۥ */
            public final void mo3989(AbstractC7956.InterfaceC7964 interfaceC7964, AbstractC7956 abstractC7956, boolean z) {
                interfaceC7964.onTransitionCancel(abstractC7956);
            }
        };

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final InterfaceC7965 f23740 = new InterfaceC7965() { // from class: Yue.ۥۢۢ۠ۡ
            @Override // Yue.AbstractC7956.InterfaceC7965
            /* JADX INFO: renamed from: ۥ */
            public final void mo3989(AbstractC7956.InterfaceC7964 interfaceC7964, AbstractC7956 abstractC7956, boolean z) {
                interfaceC7964.onTransitionPause(abstractC7956);
            }
        };

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final InterfaceC7965 f23741 = new InterfaceC7965() { // from class: Yue.ۥۢۢ۠ۢ
            @Override // Yue.AbstractC7956.InterfaceC7965
            /* JADX INFO: renamed from: ۥ */
            public final void mo3989(AbstractC7956.InterfaceC7964 interfaceC7964, AbstractC7956 abstractC7956, boolean z) {
                interfaceC7964.onTransitionResume(abstractC7956);
            }
        };

        /* JADX INFO: renamed from: ۥ */
        void mo3989(@InterfaceC6391 InterfaceC7964 interfaceC7964, @InterfaceC6391 AbstractC7956 abstractC7956, boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC7956() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m25104(C7996 c7996, View view, C7995 c7995) {
        c7996.f3179.put(view, c7995);
        int id = view.getId();
        if (id >= 0) {
            if (c7996.f3180.indexOfKey(id) >= 0) {
                c7996.f3180.put(id, null);
            } else {
                c7996.f3180.put(id, view);
            }
        }
        String strM27380 = C8273.m27380(view);
        if (strM27380 != null) {
            if (c7996.f23771.containsKey(strM27380)) {
                c7996.f23771.put(strM27380, null);
            } else {
                c7996.f23771.put(strM27380, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c7996.f23770.m18218(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c7996.f23770.m18222(itemIdAtPosition, view);
                    return;
                }
                View viewM18216 = c7996.f23770.m18216(itemIdAtPosition);
                if (viewM18216 != null) {
                    viewM18216.setHasTransientState(false);
                    c7996.f23770.m18222(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m25105(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static <T> ArrayList<T> m25106(ArrayList<T> arrayList, T t, boolean z) {
        return t != null ? z ? C7959.m3982(arrayList, t) : C7959.m3983(arrayList, t) : arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static C3394<Animator, C7958> m25107() {
        C3394<Animator, C7958> c3394 = sRunningAnimators.get();
        if (c3394 != null) {
            return c3394;
        }
        C3394<Animator, C7958> c33942 = new C3394<>();
        sRunningAnimators.set(c33942);
        return c33942;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m25108(int i) {
        return i >= 1 && i <= 4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m25109(C7995 c7995, C7995 c79952, String str) {
        Object obj = c7995.f3177.get(str);
        Object obj2 = c79952.f3177.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static int[] m25110(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            }
            i++;
        }
        return iArr;
    }

    @InterfaceC6391
    public AbstractC7956 addListener(@InterfaceC6391 InterfaceC7964 interfaceC7964) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(interfaceC7964);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public AbstractC7956 addTarget(@InterfaceC6391 View view) {
        this.mTargets.add(view);
        return this;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void animate(@InterfaceC6490 Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new C7957());
        animator.start();
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(InterfaceC7965.f23739, false);
    }

    public abstract void captureEndValues(@InterfaceC6391 C7995 c7995);

    public void capturePropagationValues(C7995 c7995) {
        String[] strArrMo4000;
        if (this.mPropagation == null || c7995.f3177.isEmpty() || (strArrMo4000 = this.mPropagation.mo4000()) == null) {
            return;
        }
        for (String str : strArrMo4000) {
            if (!c7995.f3177.containsKey(str)) {
                this.mPropagation.mo3999(c7995);
                return;
            }
        }
    }

    public abstract void captureStartValues(@InterfaceC6391 C7995 c7995);

    public void captureValues(@InterfaceC6391 ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C3394<String, String> c3394;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (viewFindViewById != null) {
                    C7995 c7995 = new C7995(viewFindViewById);
                    if (z) {
                        captureStartValues(c7995);
                    } else {
                        captureEndValues(c7995);
                    }
                    c7995.f23769.add(this);
                    capturePropagationValues(c7995);
                    if (z) {
                        m25104(this.mStartValues, viewFindViewById, c7995);
                    } else {
                        m25104(this.mEndValues, viewFindViewById, c7995);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                C7995 c79952 = new C7995(view);
                if (z) {
                    captureStartValues(c79952);
                } else {
                    captureEndValues(c79952);
                }
                c79952.f23769.add(this);
                capturePropagationValues(c79952);
                if (z) {
                    m25104(this.mStartValues, view, c79952);
                } else {
                    m25104(this.mEndValues, view, c79952);
                }
            }
        } else {
            m25112(viewGroup, z);
        }
        if (z || (c3394 = this.mNameOverrides) == null) {
            return;
        }
        int size = c3394.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.mStartValues.f23771.remove(this.mNameOverrides.keyAt(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.f23771.put(this.mNameOverrides.valueAt(i4), view2);
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.f3179.clear();
            this.mStartValues.f3180.clear();
            this.mStartValues.f23770.m18210();
        } else {
            this.mEndValues.f3179.clear();
            this.mEndValues.f3180.clear();
            this.mEndValues.f23770.m18210();
        }
    }

    @InterfaceC6490
    public Animator createAnimator(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        return null;
    }

    public void createAnimators(@InterfaceC6391 ViewGroup viewGroup, @InterfaceC6391 C7996 c7996, @InterfaceC6391 C7996 c79962, @InterfaceC6391 ArrayList<C7995> arrayList, @InterfaceC6391 ArrayList<C7995> arrayList2) {
        Animator animatorCreateAnimator;
        int i;
        int i2;
        View view;
        Animator animator;
        C7995 c7995;
        C3394<Animator, C7958> c3394M25107 = m25107();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z = getRootTransition().mSeekController != null;
        long jMin = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C7995 c79952 = arrayList.get(i3);
            C7995 c79953 = arrayList2.get(i3);
            if (c79952 != null && !c79952.f23769.contains(this)) {
                c79952 = null;
            }
            if (c79953 != null && !c79953.f23769.contains(this)) {
                c79953 = null;
            }
            if (!(c79952 == null && c79953 == null) && ((c79952 == null || c79953 == null || isTransitionRequired(c79952, c79953)) && (animatorCreateAnimator = createAnimator(viewGroup, c79952, c79953)) != null)) {
                if (c79953 != null) {
                    view = c79953.f3178;
                    String[] transitionProperties = getTransitionProperties();
                    Animator animator2 = animatorCreateAnimator;
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        c7995 = new C7995(view);
                        i = size;
                        C7995 c79954 = c79962.f3179.get(view);
                        if (c79954 != null) {
                            int i4 = 0;
                            while (i4 < transitionProperties.length) {
                                Map<String, Object> map = c7995.f3177;
                                int i5 = i3;
                                String str = transitionProperties[i4];
                                map.put(str, c79954.f3177.get(str));
                                i4++;
                                i3 = i5;
                                transitionProperties = transitionProperties;
                            }
                        }
                        i2 = i3;
                        int size2 = c3394M25107.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                break;
                            }
                            C7958 c7958 = c3394M25107.get(c3394M25107.keyAt(i6));
                            if (c7958.f23727 != null && c7958.f3145 == view && c7958.f3146.equals(getName()) && c7958.f23727.equals(c7995)) {
                                animator2 = null;
                                break;
                            }
                            i6++;
                        }
                    } else {
                        i = size;
                        i2 = i3;
                        c7995 = null;
                    }
                    animator = animator2;
                } else {
                    i = size;
                    i2 = i3;
                    view = c79952.f3178;
                    animator = animatorCreateAnimator;
                    c7995 = null;
                }
                if (animator != null) {
                    AbstractC7988 abstractC7988 = this.mPropagation;
                    if (abstractC7988 != null) {
                        long jMo10558 = abstractC7988.mo10558(viewGroup, this, c79952, c79953);
                        sparseIntArray.put(this.mAnimators.size(), (int) jMo10558);
                        jMin = Math.min(jMo10558, jMin);
                    }
                    long j = jMin;
                    C7958 c79582 = new C7958(view, getName(), this, viewGroup.getWindowId(), c7995, animator);
                    Animator animator3 = animator;
                    if (z) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(animator);
                        animator3 = animatorSet;
                    }
                    c3394M25107.put(animator3, c79582);
                    this.mAnimators.add(animator3);
                    jMin = j;
                }
            } else {
                i = size;
                i2 = i3;
            }
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                C7958 c79583 = c3394M25107.get(this.mAnimators.get(sparseIntArray.keyAt(i7)));
                c79583.f23730.setStartDelay((((long) sparseIntArray.valueAt(i7)) - jMin) + c79583.f23730.getStartDelay());
            }
        }
    }

    @InterfaceC6391
    @InterfaceC7113(34)
    public InterfaceC7990 createSeekController() {
        C7963 c7963 = new C7963();
        this.mSeekController = c7963;
        addListener(c7963);
        return this.mSeekController;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            notifyListeners(InterfaceC7965.f3150, false);
            for (int i2 = 0; i2 < this.mStartValues.f23770.m18231(); i2++) {
                View viewM18232 = this.mStartValues.f23770.m18232(i2);
                if (viewM18232 != null) {
                    viewM18232.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < this.mEndValues.f23770.m18231(); i3++) {
                View viewM182322 = this.mEndValues.f23770.m18232(i3);
                if (viewM182322 != null) {
                    viewM182322.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public AbstractC7956 excludeChildren(@InterfaceC6391 View view, boolean z) {
        this.mTargetChildExcludes = m25115(this.mTargetChildExcludes, view, z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public AbstractC7956 excludeTarget(@InterfaceC6391 View view, boolean z) {
        this.mTargetExcludes = m25115(this.mTargetExcludes, view, z);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: V */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: K */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(@InterfaceC6490 ViewGroup viewGroup) {
        C3394<Animator, C7958> c3394M25107 = m25107();
        int size = c3394M25107.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        C3394 c3394 = new C3394(c3394M25107);
        c3394M25107.clear();
        for (int i = size - 1; i >= 0; i--) {
            C7958 c7958 = (C7958) c3394.valueAt(i);
            if (c7958.f3145 != null && windowId.equals(c7958.f23728)) {
                ((Animator) c3394.keyAt(i)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    @InterfaceC6490
    public Rect getEpicenter() {
        AbstractC7960 abstractC7960 = this.mEpicenterCallback;
        if (abstractC7960 == null) {
            return null;
        }
        return abstractC7960.mo1922(this);
    }

    @InterfaceC6490
    public AbstractC7960 getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @InterfaceC6490
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.mEndValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.mStartValuesList;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C7995 getMatchedTransitionValues(View view, boolean z) {
        C7991 c7991 = this.mParent;
        if (c7991 != null) {
            return c7991.getMatchedTransitionValues(view, z);
        }
        ArrayList<C7995> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C7995 c7995 = arrayList.get(i);
            if (c7995 == null) {
                return null;
            }
            if (c7995.f3178 == view) {
                break;
            }
            i++;
        }
    }

    @InterfaceC6391
    public String getName() {
        return this.mName;
    }

    @InterfaceC6391
    public AbstractC6623 getPathMotion() {
        return this.mPathMotion;
    }

    @InterfaceC6490
    public AbstractC7988 getPropagation() {
        return this.mPropagation;
    }

    @InterfaceC6391
    public final AbstractC7956 getRootTransition() {
        C7991 c7991 = this.mParent;
        return c7991 != null ? c7991.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @InterfaceC6391
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @InterfaceC6490
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @InterfaceC6490
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @InterfaceC6391
    public List<View> getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    @InterfaceC6490
    public String[] getTransitionProperties() {
        return null;
    }

    @InterfaceC6490
    public C7995 getTransitionValues(@InterfaceC6391 View view, boolean z) {
        C7991 c7991 = this.mParent;
        if (c7991 != null) {
            return c7991.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).f3179.get(view);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(@InterfaceC6490 C7995 c7995, @InterfaceC6490 C7995 c79952) {
        if (c7995 == null || c79952 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties == null) {
            Iterator<String> it = c7995.f3177.keySet().iterator();
            while (it.hasNext()) {
                if (m25109(c7995, c79952, it.next())) {
                }
            }
            return false;
        }
        for (String str : transitionProperties) {
            if (!m25109(c7995, c79952, str)) {
            }
        }
        return false;
        return true;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && C8273.m27380(view) != null && this.mTargetNameExcludes.contains(C8273.m27380(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(C8273.m27380(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void notifyListeners(InterfaceC7965 interfaceC7965, boolean z) {
        m25121(this, interfaceC7965, z);
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void pause(@InterfaceC6490 View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(InterfaceC7965.f23740, false);
        this.mPaused = true;
    }

    public void playTransition(@InterfaceC6391 ViewGroup viewGroup) {
        C7958 c7958;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        m25120(this.mStartValues, this.mEndValues);
        C3394<Animator, C7958> c3394M25107 = m25107();
        int size = c3394M25107.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i = size - 1; i >= 0; i--) {
            Animator animatorKeyAt = c3394M25107.keyAt(i);
            if (animatorKeyAt != null && (c7958 = c3394M25107.get(animatorKeyAt)) != null && c7958.f3145 != null && windowId.equals(c7958.f23728)) {
                C7995 c7995 = c7958.f23727;
                View view = c7958.f3145;
                C7995 transitionValues = getTransitionValues(view, true);
                C7995 matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f3179.get(view);
                }
                if ((transitionValues != null || matchedTransitionValues != null) && c7958.f23729.isTransitionRequired(c7995, matchedTransitionValues)) {
                    AbstractC7956 abstractC7956 = c7958.f23729;
                    if (abstractC7956.getRootTransition().mSeekController != null) {
                        animatorKeyAt.cancel();
                        abstractC7956.mCurrentAnimators.remove(animatorKeyAt);
                        c3394M25107.remove(animatorKeyAt);
                        if (abstractC7956.mCurrentAnimators.size() == 0) {
                            abstractC7956.notifyListeners(InterfaceC7965.f23739, false);
                            if (!abstractC7956.mEnded) {
                                abstractC7956.mEnded = true;
                                abstractC7956.notifyListeners(InterfaceC7965.f3150, false);
                            }
                        }
                    } else if (animatorKeyAt.isRunning() || animatorKeyAt.isStarted()) {
                        animatorKeyAt.cancel();
                    } else {
                        c3394M25107.remove(animatorKeyAt);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
        } else if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            this.mSeekController.m25137();
            this.mSeekController.m25139();
        }
    }

    @InterfaceC7113(34)
    public void prepareAnimatorsForSeeking() {
        C3394<Animator, C7958> c3394M25107 = m25107();
        this.mTotalDuration = 0L;
        for (int i = 0; i < this.mAnimators.size(); i++) {
            Animator animator = this.mAnimators.get(i);
            C7958 c7958 = c3394M25107.get(animator);
            if (animator != null && c7958 != null) {
                if (getDuration() >= 0) {
                    c7958.f23730.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    c7958.f23730.setStartDelay(getStartDelay() + c7958.f23730.getStartDelay());
                }
                if (getInterpolator() != null) {
                    c7958.f23730.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, C7961.m3984(animator));
            }
        }
        this.mAnimators.clear();
    }

    @InterfaceC6391
    public AbstractC7956 removeListener(@InterfaceC6391 InterfaceC7964 interfaceC7964) {
        AbstractC7956 abstractC7956;
        ArrayList<InterfaceC7964> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC7964) && (abstractC7956 = this.mCloneParent) != null) {
            abstractC7956.removeListener(interfaceC7964);
        }
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public AbstractC7956 removeTarget(@InterfaceC6391 View view) {
        this.mTargets.remove(view);
        return this;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void resume(@InterfaceC6490 View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(InterfaceC7965.f23741, false);
            }
            this.mPaused = false;
        }
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        C3394<Animator, C7958> c3394M25107 = m25107();
        for (Animator animator : this.mAnimators) {
            if (c3394M25107.containsKey(animator)) {
                start();
                m25122(animator, c3394M25107);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    @InterfaceC7113(34)
    public void setCurrentPlayTimeMillis(long j, long j2) {
        long totalDurationMillis = getTotalDurationMillis();
        int i = 0;
        boolean z = j < j2;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if ((i2 < 0 && j >= 0) || (j2 > totalDurationMillis && j <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(InterfaceC7965.f3149, z);
        }
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int size = this.mCurrentAnimators.size(); i < size; size = size) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            C7961.m3985(animator, Math.min(Math.max(0L, j), C7961.m3984(animator)));
            i++;
            i2 = i2;
        }
        int i3 = i2;
        this.mAnimatorCache = animatorArr;
        if ((j <= totalDurationMillis || j2 > totalDurationMillis) && (j >= 0 || i3 < 0)) {
            return;
        }
        if (j > totalDurationMillis) {
            this.mEnded = true;
        }
        notifyListeners(InterfaceC7965.f3150, z);
    }

    @InterfaceC6391
    public AbstractC7956 setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(@InterfaceC6490 AbstractC7960 abstractC7960) {
        this.mEpicenterCallback = abstractC7960;
    }

    @InterfaceC6391
    public AbstractC7956 setInterpolator(@InterfaceC6490 TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(@InterfaceC6490 int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!m25108(iArr[i])) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            if (m25105(iArr, i)) {
                throw new IllegalArgumentException("matches contains a duplicate value");
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@InterfaceC6490 AbstractC6623 abstractC6623) {
        if (abstractC6623 == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = abstractC6623;
        }
    }

    public void setPropagation(@InterfaceC6490 AbstractC7988 abstractC7988) {
        this.mPropagation = abstractC7988;
    }

    @InterfaceC6391
    public AbstractC7956 setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(InterfaceC7965.f3149, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6391
    public String toString() {
        return toString("");
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m25111(C3394<View, C7995> c3394, C3394<View, C7995> c33942) {
        for (int i = 0; i < c3394.size(); i++) {
            C7995 c7995ValueAt = c3394.valueAt(i);
            if (isValidTarget(c7995ValueAt.f3178)) {
                this.mStartValuesList.add(c7995ValueAt);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < c33942.size(); i2++) {
            C7995 c7995ValueAt2 = c33942.valueAt(i2);
            if (isValidTarget(c7995ValueAt2.f3178)) {
                this.mEndValuesList.add(c7995ValueAt2);
                this.mStartValuesList.add(null);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m25112(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    C7995 c7995 = new C7995(view);
                    if (z) {
                        captureStartValues(c7995);
                    } else {
                        captureEndValues(c7995);
                    }
                    c7995.f23769.add(this);
                    capturePropagationValues(c7995);
                    if (z) {
                        m25104(this.mStartValues, view, c7995);
                    } else {
                        m25104(this.mEndValues, view, c7995);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                m25112(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final ArrayList<Integer> m25113(ArrayList<Integer> arrayList, int i, boolean z) {
        return i > 0 ? z ? C7959.m3982(arrayList, Integer.valueOf(i)) : C7959.m3983(arrayList, Integer.valueOf(i)) : arrayList;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final ArrayList<Class<?>> m25114(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        return cls != null ? z ? C7959.m3982(arrayList, cls) : C7959.m3983(arrayList, cls) : arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final ArrayList<View> m25115(ArrayList<View> arrayList, View view, boolean z) {
        return view != null ? z ? C7959.m3982(arrayList, view) : C7959.m3983(arrayList, view) : arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final void m25116(C3394<View, C7995> c3394, C3394<View, C7995> c33942, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                C7995 c7995 = c3394.get(viewValueAt);
                C7995 c79952 = c33942.get(view);
                if (c7995 != null && c79952 != null) {
                    this.mStartValuesList.add(c7995);
                    this.mEndValuesList.add(c79952);
                    c3394.remove(viewValueAt);
                    c33942.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final void m25117(C3394<View, C7995> c3394, C3394<View, C7995> c33942) {
        C7995 c7995Remove;
        for (int size = c3394.size() - 1; size >= 0; size--) {
            View viewKeyAt = c3394.keyAt(size);
            if (viewKeyAt != null && isValidTarget(viewKeyAt) && (c7995Remove = c33942.remove(viewKeyAt)) != null && isValidTarget(c7995Remove.f3178)) {
                this.mStartValuesList.add(c3394.removeAt(size));
                this.mEndValuesList.add(c7995Remove);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m25118(C3394<View, C7995> c3394, C3394<View, C7995> c33942, C5885<View> c5885, C5885<View> c58852) {
        View viewM18216;
        int iM18231 = c5885.m18231();
        for (int i = 0; i < iM18231; i++) {
            View viewM18232 = c5885.m18232(i);
            if (viewM18232 != null && isValidTarget(viewM18232) && (viewM18216 = c58852.m18216(c5885.m18221(i))) != null && isValidTarget(viewM18216)) {
                C7995 c7995 = c3394.get(viewM18232);
                C7995 c79952 = c33942.get(viewM18216);
                if (c7995 != null && c79952 != null) {
                    this.mStartValuesList.add(c7995);
                    this.mEndValuesList.add(c79952);
                    c3394.remove(viewM18232);
                    c33942.remove(viewM18216);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m25119(C3394<View, C7995> c3394, C3394<View, C7995> c33942, C3394<String, View> c33943, C3394<String, View> c33944) {
        View view;
        int size = c33943.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = c33943.valueAt(i);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = c33944.get(c33943.keyAt(i))) != null && isValidTarget(view)) {
                C7995 c7995 = c3394.get(viewValueAt);
                C7995 c79952 = c33942.get(view);
                if (c7995 != null && c79952 != null) {
                    this.mStartValuesList.add(c7995);
                    this.mEndValuesList.add(c79952);
                    c3394.remove(viewValueAt);
                    c33942.remove(view);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m25120(C7996 c7996, C7996 c79962) {
        C3394<View, C7995> c3394 = new C3394<>(c7996.f3179);
        C3394<View, C7995> c33942 = new C3394<>(c79962.f3179);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i >= iArr.length) {
                m25111(c3394, c33942);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                m25117(c3394, c33942);
            } else if (i2 == 2) {
                m25119(c3394, c33942, c7996.f23771, c79962.f23771);
            } else if (i2 == 3) {
                m25116(c3394, c33942, c7996.f3180, c79962.f3180);
            } else if (i2 == 4) {
                m25118(c3394, c33942, c7996.f23770, c79962.f23770);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m25121(AbstractC7956 abstractC7956, InterfaceC7965 interfaceC7965, boolean z) {
        AbstractC7956 abstractC79562 = this.mCloneParent;
        if (abstractC79562 != null) {
            abstractC79562.m25121(abstractC7956, interfaceC7965, z);
        }
        ArrayList<InterfaceC7964> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        InterfaceC7964[] interfaceC7964Arr = this.mListenersCache;
        if (interfaceC7964Arr == null) {
            interfaceC7964Arr = new InterfaceC7964[size];
        }
        this.mListenersCache = null;
        InterfaceC7964[] interfaceC7964Arr2 = (InterfaceC7964[]) this.mListeners.toArray(interfaceC7964Arr);
        for (int i = 0; i < size; i++) {
            interfaceC7965.mo3989(interfaceC7964Arr2[i], abstractC7956, z);
            interfaceC7964Arr2[i] = null;
        }
        this.mListenersCache = interfaceC7964Arr2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final void m25122(Animator animator, C3394<Animator, C7958> c3394) {
        if (animator != null) {
            animator.addListener(new C1392(c3394));
            animate(animator);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public AbstractC7956 addTarget(@InterfaceC5411 int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // 
    @InterfaceC6391
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AbstractC7956 mo25123clone() {
        try {
            AbstractC7956 abstractC7956 = (AbstractC7956) super.clone();
            abstractC7956.mAnimators = new ArrayList<>();
            abstractC7956.mStartValues = new C7996();
            abstractC7956.mEndValues = new C7996();
            abstractC7956.mStartValuesList = null;
            abstractC7956.mEndValuesList = null;
            abstractC7956.mSeekController = null;
            abstractC7956.mCloneParent = this;
            abstractC7956.mListeners = null;
            return abstractC7956;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public AbstractC7956 excludeChildren(@InterfaceC5411 int i, boolean z) {
        this.mTargetIdChildExcludes = m25113(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public AbstractC7956 excludeTarget(@InterfaceC5411 int i, boolean z) {
        this.mTargetIdExcludes = m25113(this.mTargetIdExcludes, i, z);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6391
    public AbstractC7956 removeTarget(@InterfaceC5411 int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public String toString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.mDuration != -1) {
            sb.append("dur(");
            sb.append(this.mDuration);
            sb.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb.append("dly(");
            sb.append(this.mStartDelay);
            sb.append(") ");
        }
        if (this.mInterpolator != null) {
            sb.append("interp(");
            sb.append(this.mInterpolator);
            sb.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i = 0; i < this.mTargetIds.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargetIds.get(i));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargets.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    @InterfaceC6391
    public AbstractC7956 addTarget(@InterfaceC6391 String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @InterfaceC6391
    public AbstractC7956 excludeChildren(@InterfaceC6391 Class<?> cls, boolean z) {
        this.mTargetTypeChildExcludes = m25114(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    @InterfaceC6391
    public AbstractC7956 excludeTarget(@InterfaceC6391 String str, boolean z) {
        this.mTargetNameExcludes = m25106(this.mTargetNameExcludes, str, z);
        return this;
    }

    @InterfaceC6391
    public AbstractC7956 removeTarget(@InterfaceC6391 String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @InterfaceC6391
    public AbstractC7956 excludeTarget(@InterfaceC6391 Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = m25114(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    @InterfaceC6391
    public AbstractC7956 removeTarget(@InterfaceC6391 Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @InterfaceC6391
    public AbstractC7956 addTarget(@InterfaceC6391 Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public AbstractC7956(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7652.f23042);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM25322 = C8021.m25322(typedArrayObtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (jM25322 >= 0) {
            setDuration(jM25322);
        }
        long jM253222 = C8021.m25322(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jM253222 > 0) {
            setStartDelay(jM253222);
        }
        int iM25323 = C8021.m25323(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iM25323 > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, iM25323));
        }
        String strM25324 = C8021.m25324(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM25324 != null) {
            setMatchOrder(m25110(strM25324));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
