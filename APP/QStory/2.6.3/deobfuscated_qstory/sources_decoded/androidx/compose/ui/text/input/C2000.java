package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.foundation.lazy.C0756;
import androidx.compose.foundation.text.C0977;
import androidx.compose.foundation.text.C1012;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.graphics.C1587;
import androidx.compose.ui.platform.ViewTreeObserverOnGlobalLayoutListenerC1884;
import androidx.compose.ui.text.C2033;
import androidx.compose.ui.text.C2035;
import androidx.core.view.C2242;
import com.bumptech.glide.AbstractC3056;
import io.ktor.util.C4211;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6543;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p112.C7328;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2000 implements InterfaceC2020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC6558 f5892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC6558 f5893;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ExecutorC1999 f5895;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2026 f5896;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f5897;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public RunnableC2002 f5898;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C1224 f5899;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2025 f5900;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2013 f5901;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Rect f5902;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C2009 f5903;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f5904;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC5184 f5905;

    public C2000(View view, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        C2026 c2026 = new C2026(view);
        ExecutorC1999 executorC1999 = new ExecutorC1999(Choreographer.getInstance());
        this.f5897 = view;
        this.f5896 = c2026;
        this.f5895 = executorC1999;
        this.f5893 = new InterfaceC6558() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends InterfaceC2005>) obj);
                return C5176.f14739;
            }

            public final void invoke(List<? extends InterfaceC2005> list) {
            }
        };
        this.f5892 = new InterfaceC6558() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                m3707invokeKlQnJC8(((C2028) obj).f5978);
                return C5176.f14739;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m3707invokeKlQnJC8(int i) {
            }
        };
        this.f5901 = new C2013(4, C2035.f6003, "");
        this.f5900 = C2025.f5968;
        this.f5904 = new ArrayList();
        this.f5905 = AbstractC5187.m10215(LazyThreadSafetyMode.NONE, new InterfaceC6543() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6543
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.f5897, false);
            }
        });
        this.f5903 = new C2009(viewTreeObserverOnGlobalLayoutListenerC1884, c2026);
        this.f5899 = new C1224(0, new TextInputServiceAndroid$TextInputCommand[16]);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo1681() {
        m3710(TextInputServiceAndroid$TextInputCommand.HideKeyboard);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1682() {
        this.f5894 = false;
        this.f5893 = new InterfaceC6558() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            @Override // p052.InterfaceC6558
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends InterfaceC2005>) obj);
                return C5176.f14739;
            }

            public final void invoke(List<? extends InterfaceC2005> list) {
            }
        };
        this.f5892 = new InterfaceC6558() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            @Override // p052.InterfaceC6558
            public /* synthetic */ Object invoke(Object obj) {
                m3708invokeKlQnJC8(((C2028) obj).f5978);
                return C5176.f14739;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m3708invokeKlQnJC8(int i) {
            }
        };
        this.f5902 = null;
        m3710(TextInputServiceAndroid$TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1683() {
        m3710(TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1684(C7328 c7328) {
        Rect rect;
        this.f5902 = new Rect(AbstractC6561.m12058(c7328.f19540), AbstractC6561.m12058(c7328.f19539), AbstractC6561.m12058(c7328.f19538), AbstractC6561.m12058(c7328.f19537));
        if (!this.f5904.isEmpty() || (rect = this.f5902) == null) {
            return;
        }
        this.f5897.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1685() {
        m3710(TextInputServiceAndroid$TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1686(C2013 c2013, C2025 c2025, C0756 c0756, C0977 c0977) {
        this.f5894 = true;
        this.f5901 = c2013;
        this.f5900 = c2025;
        this.f5893 = c0756;
        this.f5892 = c0977;
        m3710(TextInputServiceAndroid$TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1687(C2013 c2013, InterfaceC2022 interfaceC2022, C2033 c2033, C1012 c1012, C7328 c7328, C7328 c73282) {
        C2009 c2009 = this.f5903;
        synchronized (c2009.f5918) {
            try {
                c2009.f5932 = c2013;
                c2009.f5930 = interfaceC2022;
                c2009.f5929 = c2033;
                c2009.f5922 = c1012;
                c2009.f5921 = c7328;
                c2009.f5925 = c73282;
                if (c2009.f5916 || c2009.f5917) {
                    c2009.m3711();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo1688(C2013 c2013, C2013 c20132) {
        boolean z = (C2035.m3753(this.f5901.f5946, c20132.f5946) && AbstractC4395.m8907(this.f5901.f5945, c20132.f5945)) ? false : true;
        this.f5901 = c20132;
        int size = this.f5904.size();
        for (int i = 0; i < size; i++) {
            InputConnectionC2012 inputConnectionC2012 = (InputConnectionC2012) ((WeakReference) this.f5904.get(i)).get();
            if (inputConnectionC2012 != null) {
                inputConnectionC2012.f5939 = c20132;
            }
        }
        C2009 c2009 = this.f5903;
        synchronized (c2009.f5918) {
            c2009.f5932 = null;
            c2009.f5930 = null;
            c2009.f5929 = null;
            c2009.f5922 = new InterfaceC6558() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                @Override // p052.InterfaceC6558
                public /* synthetic */ Object invoke(Object obj) {
                    m3705invoke58bKbWc(((C1587) obj).f4674);
                    return C5176.f14739;
                }

                /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m3705invoke58bKbWc(float[] fArr) {
                }
            };
            c2009.f5921 = null;
            c2009.f5925 = null;
        }
        if (AbstractC4395.m8907(c2013, c20132)) {
            if (z) {
                C2026 c2026 = this.f5896;
                int iM3757 = C2035.m3757(c20132.f5946);
                int iM3750 = C2035.m3750(c20132.f5946);
                C2035 c2035 = this.f5901.f5945;
                int iM37572 = c2035 != null ? C2035.m3757(c2035.f6004) : -1;
                C2035 c20352 = this.f5901.f5945;
                ((InputMethodManager) c2026.f5976.getValue()).updateSelection(c2026.f5977, iM3757, iM3750, iM37572, c20352 != null ? C2035.m3750(c20352.f6004) : -1);
                return;
            }
            return;
        }
        if (c2013 != null && (!AbstractC4395.m8907(c2013.f5947.f6129, c20132.f5947.f6129) || (C2035.m3753(c2013.f5946, c20132.f5946) && !AbstractC4395.m8907(c2013.f5945, c20132.f5945)))) {
            C2026 c20262 = this.f5896;
            ((InputMethodManager) c20262.f5976.getValue()).restartInput(c20262.f5977);
            return;
        }
        int size2 = this.f5904.size();
        for (int i2 = 0; i2 < size2; i2++) {
            InputConnectionC2012 inputConnectionC20122 = (InputConnectionC2012) ((WeakReference) this.f5904.get(i2)).get();
            if (inputConnectionC20122 != null) {
                C2013 c20133 = this.f5901;
                C2026 c20263 = this.f5896;
                if (inputConnectionC20122.f5943) {
                    inputConnectionC20122.f5939 = c20133;
                    if (inputConnectionC20122.f5937) {
                        ((InputMethodManager) c20263.f5976.getValue()).updateExtractedText(c20263.f5977, inputConnectionC20122.f5938, AbstractC3056.m6730(c20133));
                    }
                    C2035 c20353 = c20133.f5945;
                    long j = c20133.f5946;
                    int iM37573 = c20353 != null ? C2035.m3757(c20353.f6004) : -1;
                    C2035 c20354 = c20133.f5945;
                    ((InputMethodManager) c20263.f5976.getValue()).updateSelection(c20263.f5977, C2035.m3757(j), C2035.m3750(j), iM37573, c20354 != null ? C2035.m3750(c20354.f6004) : -1);
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
    public final void m3710(TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand) {
        this.f5899.m2047(textInputServiceAndroid$TextInputCommand);
        if (this.f5898 == null) {
            ?? r2 = new Runnable() { // from class: androidx.compose.ui.text.input.飘花落叶言子世楪苏哲兰
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.Boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    C2000 c2000 = this.f5907;
                    C2026 c2026 = c2000.f5896;
                    c2000.f5898 = null;
                    C1224 c1224 = c2000.f5899;
                    View view = c2000.f5897;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        c1224.m2052();
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Object[] objArr = c1224.f3521;
                    int i = c1224.f3520;
                    for (int i2 = 0; i2 < i; i2++) {
                        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand2 = (TextInputServiceAndroid$TextInputCommand) objArr[i2];
                        int i3 = AbstractC2001.f5906[textInputServiceAndroid$TextInputCommand2.ordinal()];
                        if (i3 == 1) {
                            ?? r8 = Boolean.TRUE;
                            ref$ObjectRef.element = r8;
                            ref$ObjectRef2.element = r8;
                        } else if (i3 == 2) {
                            ?? r82 = Boolean.FALSE;
                            ref$ObjectRef.element = r82;
                            ref$ObjectRef2.element = r82;
                        } else if (i3 != 3 && i3 != 4) {
                            C4211.m8611();
                            return;
                        } else if (!AbstractC4395.m8907(ref$ObjectRef.element, Boolean.FALSE)) {
                            ref$ObjectRef2.element = Boolean.valueOf(textInputServiceAndroid$TextInputCommand2 == TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
                        }
                    }
                    c1224.m2052();
                    if (AbstractC4395.m8907(ref$ObjectRef.element, Boolean.TRUE)) {
                        ((InputMethodManager) c2026.f5976.getValue()).restartInput(c2026.f5977);
                    }
                    Boolean bool = (Boolean) ref$ObjectRef2.element;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            ((C2242) c2026.f5975.f6537).mo4012();
                        } else {
                            ((C2242) c2026.f5975.f6537).mo4011();
                        }
                    }
                    if (AbstractC4395.m8907(ref$ObjectRef.element, Boolean.FALSE)) {
                        ((InputMethodManager) c2026.f5976.getValue()).restartInput(c2026.f5977);
                    }
                }
            };
            this.f5895.execute(r2);
            this.f5898 = r2;
        }
    }
}
