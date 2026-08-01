package androidx.compose.p001ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.lazy.C1597;
import androidx.compose.foundation.text.C1815;
import androidx.compose.foundation.text.C1850;
import androidx.compose.p001ui.graphics.C2422;
import androidx.compose.p001ui.platform.ViewTreeObserverOnGlobalLayoutListenerC2719;
import androidx.compose.p001ui.text.C2867;
import androidx.compose.p001ui.text.C2869;
import androidx.compose.runtime.collection.C2059;
import androidx.core.view.C3075;
import com.bumptech.glide.AbstractC3888;
import io.ktor.util.C5043;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$ObjectRef;
import p068.InterfaceC7372;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p128.C8157;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2834 implements InterfaceC2854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC7387 f6237;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC7387 f6238;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f6239;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ExecutorC2833 f6240;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2860 f6241;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f6242;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public RunnableC2836 f6243;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C2059 f6244;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2859 f6245;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2847 f6246;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Rect f6247;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C2843 f6248;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f6249;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6016 f6250;

    public C2834(View view, ViewTreeObserverOnGlobalLayoutListenerC2719 viewTreeObserverOnGlobalLayoutListenerC2719) {
        C2860 c2860 = new C2860(view);
        ExecutorC2833 executorC2833 = new ExecutorC2833(Choreographer.getInstance());
        this.f6242 = view;
        this.f6241 = c2860;
        this.f6240 = executorC2833;
        this.f6238 = new InterfaceC7387() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends InterfaceC2839>) obj);
                return C6008.f15084;
            }

            public final void invoke(List<? extends InterfaceC2839> list) {
            }
        };
        this.f6237 = new InterfaceC7387() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                m4267invokeKlQnJC8(((C2862) obj).f6323);
                return C6008.f15084;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m4267invokeKlQnJC8(int i) {
            }
        };
        this.f6246 = new C2847(4, C2869.f6348, "");
        this.f6245 = C2859.f6313;
        this.f6249 = new ArrayList();
        this.f6250 = AbstractC6019.m10774(LazyThreadSafetyMode.NONE, new InterfaceC7372() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // p068.InterfaceC7372
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.f6242, false);
            }
        });
        this.f6248 = new C2843(viewTreeObserverOnGlobalLayoutListenerC2719, c2860);
        this.f6244 = new C2059(0, new TextInputServiceAndroid$TextInputCommand[16]);
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo2241() {
        m4270(TextInputServiceAndroid$TextInputCommand.HideKeyboard);
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2242() {
        this.f6239 = false;
        this.f6238 = new InterfaceC7387() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends InterfaceC2839>) obj);
                return C6008.f15084;
            }

            public final void invoke(List<? extends InterfaceC2839> list) {
            }
        };
        this.f6237 = new InterfaceC7387() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            @Override // p068.InterfaceC7387
            public /* synthetic */ Object invoke(Object obj) {
                m4268invokeKlQnJC8(((C2862) obj).f6323);
                return C6008.f15084;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m4268invokeKlQnJC8(int i) {
            }
        };
        this.f6247 = null;
        m4270(TextInputServiceAndroid$TextInputCommand.StopInput);
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2243() {
        m4270(TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo2244(C8157 c8157) {
        Rect rect;
        this.f6247 = new Rect(AbstractC7390.m12617(c8157.f19885), AbstractC7390.m12617(c8157.f19884), AbstractC7390.m12617(c8157.f19883), AbstractC7390.m12617(c8157.f19882));
        if (!this.f6249.isEmpty() || (rect = this.f6247) == null) {
            return;
        }
        this.f6242.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo2245() {
        m4270(TextInputServiceAndroid$TextInputCommand.StartInput);
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2246(C2847 c2847, C2859 c2859, C1597 c1597, C1815 c1815) {
        this.f6239 = true;
        this.f6246 = c2847;
        this.f6245 = c2859;
        this.f6238 = c1597;
        this.f6237 = c1815;
        m4270(TextInputServiceAndroid$TextInputCommand.StartInput);
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo2247(C2847 c2847, InterfaceC2856 interfaceC2856, C2867 c2867, C1850 c1850, C8157 c8157, C8157 c81572) {
        C2843 c2843 = this.f6248;
        synchronized (c2843.f6263) {
            try {
                c2843.f6277 = c2847;
                c2843.f6275 = interfaceC2856;
                c2843.f6274 = c2867;
                c2843.f6267 = c1850;
                c2843.f6266 = c8157;
                c2843.f6270 = c81572;
                if (c2843.f6261 || c2843.f6262) {
                    c2843.m4271();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.p001ui.text.input.InterfaceC2854
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo2248(C2847 c2847, C2847 c28472) {
        boolean z = (C2869.m4313(this.f6246.f6291, c28472.f6291) && AbstractC5227.m9466(this.f6246.f6290, c28472.f6290)) ? false : true;
        this.f6246 = c28472;
        int size = this.f6249.size();
        for (int i = 0; i < size; i++) {
            InputConnectionC2846 inputConnectionC2846 = (InputConnectionC2846) ((WeakReference) this.f6249.get(i)).get();
            if (inputConnectionC2846 != null) {
                inputConnectionC2846.f6284 = c28472;
            }
        }
        C2843 c2843 = this.f6248;
        synchronized (c2843.f6263) {
            c2843.f6277 = null;
            c2843.f6275 = null;
            c2843.f6274 = null;
            c2843.f6267 = new InterfaceC7387() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                @Override // p068.InterfaceC7387
                public /* synthetic */ Object invoke(Object obj) {
                    m4265invoke58bKbWc(((C2422) obj).f5019);
                    return C6008.f15084;
                }

                /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m4265invoke58bKbWc(float[] fArr) {
                }
            };
            c2843.f6266 = null;
            c2843.f6270 = null;
        }
        if (AbstractC5227.m9466(c2847, c28472)) {
            if (z) {
                C2860 c2860 = this.f6241;
                int iM4317 = C2869.m4317(c28472.f6291);
                int iM4310 = C2869.m4310(c28472.f6291);
                C2869 c2869 = this.f6246.f6290;
                int iM43172 = c2869 != null ? C2869.m4317(c2869.f6349) : -1;
                C2869 c28692 = this.f6246.f6290;
                ((InputMethodManager) c2860.f6321.getValue()).updateSelection(c2860.f6322, iM4317, iM4310, iM43172, c28692 != null ? C2869.m4310(c28692.f6349) : -1);
                return;
            }
            return;
        }
        if (c2847 != null && (!AbstractC5227.m9466(c2847.f6292.f6474, c28472.f6292.f6474) || (C2869.m4313(c2847.f6291, c28472.f6291) && !AbstractC5227.m9466(c2847.f6290, c28472.f6290)))) {
            C2860 c28602 = this.f6241;
            ((InputMethodManager) c28602.f6321.getValue()).restartInput(c28602.f6322);
            return;
        }
        int size2 = this.f6249.size();
        for (int i2 = 0; i2 < size2; i2++) {
            InputConnectionC2846 inputConnectionC28462 = (InputConnectionC2846) ((WeakReference) this.f6249.get(i2)).get();
            if (inputConnectionC28462 != null) {
                C2847 c28473 = this.f6246;
                C2860 c28603 = this.f6241;
                if (inputConnectionC28462.f6288) {
                    inputConnectionC28462.f6284 = c28473;
                    if (inputConnectionC28462.f6282) {
                        ((InputMethodManager) c28603.f6321.getValue()).updateExtractedText(c28603.f6322, inputConnectionC28462.f6283, AbstractC3888.m7290(c28473));
                    }
                    C2869 c28693 = c28473.f6290;
                    long j = c28473.f6291;
                    int iM43173 = c28693 != null ? C2869.m4317(c28693.f6349) : -1;
                    C2869 c28694 = c28473.f6290;
                    ((InputMethodManager) c28603.f6321.getValue()).updateSelection(c28603.f6322, C2869.m4317(j), C2869.m4310(j), iM43173, c28694 != null ? C2869.m4310(c28694.f6349) : -1);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.text.input.飘花落叶言子世楪苏哲兰, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m4270(TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand) {
        this.f6244.m2607(textInputServiceAndroid$TextInputCommand);
        if (this.f6243 == null) {
            ?? r2 = new Runnable() { // from class: androidx.compose.ui.text.input.飘花落叶言子世楪苏哲兰
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.Boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    C2834 c2834 = this.f6252;
                    C2860 c2860 = c2834.f6241;
                    c2834.f6243 = null;
                    C2059 c2059 = c2834.f6244;
                    View view = c2834.f6242;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        c2059.m2612();
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Object[] objArr = c2059.f3866;
                    int i = c2059.f3865;
                    for (int i2 = 0; i2 < i; i2++) {
                        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand2 = (TextInputServiceAndroid$TextInputCommand) objArr[i2];
                        int i3 = AbstractC2835.f6251[textInputServiceAndroid$TextInputCommand2.ordinal()];
                        if (i3 == 1) {
                            ?? r8 = Boolean.TRUE;
                            ref$ObjectRef.element = r8;
                            ref$ObjectRef2.element = r8;
                        } else if (i3 == 2) {
                            ?? r82 = Boolean.FALSE;
                            ref$ObjectRef.element = r82;
                            ref$ObjectRef2.element = r82;
                        } else if (i3 != 3 && i3 != 4) {
                            C5043.m9170();
                            return;
                        } else if (!AbstractC5227.m9466(ref$ObjectRef.element, Boolean.FALSE)) {
                            ref$ObjectRef2.element = Boolean.valueOf(textInputServiceAndroid$TextInputCommand2 == TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
                        }
                    }
                    c2059.m2612();
                    if (AbstractC5227.m9466(ref$ObjectRef.element, Boolean.TRUE)) {
                        ((InputMethodManager) c2860.f6321.getValue()).restartInput(c2860.f6322);
                    }
                    Boolean bool = (Boolean) ref$ObjectRef2.element;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            ((C3075) c2860.f6320.f6882).mo4572();
                        } else {
                            ((C3075) c2860.f6320.f6882).mo4571();
                        }
                    }
                    if (AbstractC5227.m9466(ref$ObjectRef.element, Boolean.FALSE)) {
                        ((InputMethodManager) c2860.f6321.getValue()).restartInput(c2860.f6322);
                    }
                }
            };
            this.f6240.execute(r2);
            this.f6243 = r2;
        }
    }
}
