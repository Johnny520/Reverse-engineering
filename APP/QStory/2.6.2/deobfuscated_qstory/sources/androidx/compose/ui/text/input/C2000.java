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
import com.bumptech.glide.AbstractC3054;
import io.ktor.util.C4210;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$ObjectRef;
import p052.InterfaceC6542;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p112.C7327;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2000 implements InterfaceC2020 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public InterfaceC6557 f5891;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public InterfaceC6557 f5892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public boolean f5893;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ExecutorC1999 f5894;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2026 f5895;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final View f5896;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public RunnableC2002 f5897;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final C1224 f5898;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C2025 f5899;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C2013 f5900;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Rect f5901;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C2009 f5902;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ArrayList f5903;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC5183 f5904;

    public C2000(View view, ViewTreeObserverOnGlobalLayoutListenerC1884 viewTreeObserverOnGlobalLayoutListenerC1884) {
        C2026 c2026 = new C2026(view);
        ExecutorC1999 executorC1999 = new ExecutorC1999(Choreographer.getInstance());
        this.f5896 = view;
        this.f5895 = c2026;
        this.f5894 = executorC1999;
        this.f5892 = new InterfaceC6557() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onEditCommand$1
            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends InterfaceC2005>) obj);
                return C5175.f14739;
            }

            public final void invoke(List<? extends InterfaceC2005> list) {
            }
        };
        this.f5891 = new InterfaceC6557() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1
            @Override // p052.InterfaceC6557
            public /* synthetic */ Object invoke(Object obj) {
                m3697invokeKlQnJC8(((C2028) obj).f5977);
                return C5175.f14739;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m3697invokeKlQnJC8(int i) {
            }
        };
        this.f5900 = new C2013(4, C2035.f6002, "");
        this.f5899 = C2025.f5967;
        this.f5903 = new ArrayList();
        this.f5904 = AbstractC5186.m10211(LazyThreadSafetyMode.NONE, new InterfaceC6542() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // p052.InterfaceC6542
            public final BaseInputConnection invoke() {
                return new BaseInputConnection(this.this$0.f5896, false);
            }
        });
        this.f5902 = new C2009(viewTreeObserverOnGlobalLayoutListenerC1884, c2026);
        this.f5898 = new C1224(0, new TextInputServiceAndroid$TextInputCommand[16]);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo1671() {
        m3700(TextInputServiceAndroid$TextInputCommand.HideKeyboard);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo1672() {
        this.f5893 = false;
        this.f5892 = new InterfaceC6557() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$1
            @Override // p052.InterfaceC6557
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List<? extends InterfaceC2005>) obj);
                return C5175.f14739;
            }

            public final void invoke(List<? extends InterfaceC2005> list) {
            }
        };
        this.f5891 = new InterfaceC6557() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2
            @Override // p052.InterfaceC6557
            public /* synthetic */ Object invoke(Object obj) {
                m3698invokeKlQnJC8(((C2028) obj).f5977);
                return C5175.f14739;
            }

            /* JADX INFO: renamed from: invoke-KlQnJC8, reason: not valid java name */
            public final void m3698invokeKlQnJC8(int i) {
            }
        };
        this.f5901 = null;
        m3700(TextInputServiceAndroid$TextInputCommand.StopInput);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo1673() {
        m3700(TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1674(C7327 c7327) {
        Rect rect;
        this.f5901 = new Rect(AbstractC6560.m12006(c7327.f19545), AbstractC6560.m12006(c7327.f19544), AbstractC6560.m12006(c7327.f19543), AbstractC6560.m12006(c7327.f19542));
        if (!this.f5903.isEmpty() || (rect = this.f5901) == null) {
            return;
        }
        this.f5896.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo1675() {
        m3700(TextInputServiceAndroid$TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo1676(C2013 c2013, C2025 c2025, C0756 c0756, C0977 c0977) {
        this.f5893 = true;
        this.f5900 = c2013;
        this.f5899 = c2025;
        this.f5892 = c0756;
        this.f5891 = c0977;
        m3700(TextInputServiceAndroid$TextInputCommand.StartInput);
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final void mo1677(C2013 c2013, InterfaceC2022 interfaceC2022, C2033 c2033, C1012 c1012, C7327 c7327, C7327 c73272) {
        C2009 c2009 = this.f5902;
        synchronized (c2009.f5917) {
            try {
                c2009.f5931 = c2013;
                c2009.f5929 = interfaceC2022;
                c2009.f5928 = c2033;
                c2009.f5921 = c1012;
                c2009.f5920 = c7327;
                c2009.f5924 = c73272;
                if (c2009.f5915 || c2009.f5916) {
                    c2009.m3701();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.ui.text.input.InterfaceC2020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final void mo1678(C2013 c2013, C2013 c20132) {
        boolean z = (C2035.m3743(this.f5900.f5945, c20132.f5945) && AbstractC4394.m8917(this.f5900.f5944, c20132.f5944)) ? false : true;
        this.f5900 = c20132;
        int size = this.f5903.size();
        for (int i = 0; i < size; i++) {
            InputConnectionC2012 inputConnectionC2012 = (InputConnectionC2012) ((WeakReference) this.f5903.get(i)).get();
            if (inputConnectionC2012 != null) {
                inputConnectionC2012.f5938 = c20132;
            }
        }
        C2009 c2009 = this.f5902;
        synchronized (c2009.f5917) {
            c2009.f5931 = null;
            c2009.f5929 = null;
            c2009.f5928 = null;
            c2009.f5921 = new InterfaceC6557() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                @Override // p052.InterfaceC6557
                public /* synthetic */ Object invoke(Object obj) {
                    m3695invoke58bKbWc(((C1587) obj).f4673);
                    return C5175.f14739;
                }

                /* JADX INFO: renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m3695invoke58bKbWc(float[] fArr) {
                }
            };
            c2009.f5920 = null;
            c2009.f5924 = null;
        }
        if (AbstractC4394.m8917(c2013, c20132)) {
            if (z) {
                C2026 c2026 = this.f5895;
                int iM3747 = C2035.m3747(c20132.f5945);
                int iM3740 = C2035.m3740(c20132.f5945);
                C2035 c2035 = this.f5900.f5944;
                int iM37472 = c2035 != null ? C2035.m3747(c2035.f6003) : -1;
                C2035 c20352 = this.f5900.f5944;
                ((InputMethodManager) c2026.f5975.getValue()).updateSelection(c2026.f5976, iM3747, iM3740, iM37472, c20352 != null ? C2035.m3740(c20352.f6003) : -1);
                return;
            }
            return;
        }
        if (c2013 != null && (!AbstractC4394.m8917(c2013.f5946.f6128, c20132.f5946.f6128) || (C2035.m3743(c2013.f5945, c20132.f5945) && !AbstractC4394.m8917(c2013.f5944, c20132.f5944)))) {
            C2026 c20262 = this.f5895;
            ((InputMethodManager) c20262.f5975.getValue()).restartInput(c20262.f5976);
            return;
        }
        int size2 = this.f5903.size();
        for (int i2 = 0; i2 < size2; i2++) {
            InputConnectionC2012 inputConnectionC20122 = (InputConnectionC2012) ((WeakReference) this.f5903.get(i2)).get();
            if (inputConnectionC20122 != null) {
                C2013 c20133 = this.f5900;
                C2026 c20263 = this.f5895;
                if (inputConnectionC20122.f5942) {
                    inputConnectionC20122.f5938 = c20133;
                    if (inputConnectionC20122.f5936) {
                        ((InputMethodManager) c20263.f5975.getValue()).updateExtractedText(c20263.f5976, inputConnectionC20122.f5937, AbstractC3054.m6579(c20133));
                    }
                    C2035 c20353 = c20133.f5944;
                    long j = c20133.f5945;
                    int iM37473 = c20353 != null ? C2035.m3747(c20353.f6003) : -1;
                    C2035 c20354 = c20133.f5944;
                    ((InputMethodManager) c20263.f5975.getValue()).updateSelection(c20263.f5976, C2035.m3747(j), C2035.m3740(j), iM37473, c20354 != null ? C2035.m3740(c20354.f6003) : -1);
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
    public final void m3700(TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand) {
        this.f5898.m2037(textInputServiceAndroid$TextInputCommand);
        if (this.f5897 == null) {
            ?? r2 = new Runnable() { // from class: androidx.compose.ui.text.input.飘花落叶言子世楪苏哲兰
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v2, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v3, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r8v6, types: [T, java.lang.Boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    C2000 c2000 = this.f5906;
                    C2026 c2026 = c2000.f5895;
                    c2000.f5897 = null;
                    C1224 c1224 = c2000.f5898;
                    View view = c2000.f5896;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        c1224.m2042();
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Object[] objArr = c1224.f3520;
                    int i = c1224.f3519;
                    for (int i2 = 0; i2 < i; i2++) {
                        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand2 = (TextInputServiceAndroid$TextInputCommand) objArr[i2];
                        int i3 = AbstractC2001.f5905[textInputServiceAndroid$TextInputCommand2.ordinal()];
                        if (i3 == 1) {
                            ?? r8 = Boolean.TRUE;
                            ref$ObjectRef.element = r8;
                            ref$ObjectRef2.element = r8;
                        } else if (i3 == 2) {
                            ?? r82 = Boolean.FALSE;
                            ref$ObjectRef.element = r82;
                            ref$ObjectRef2.element = r82;
                        } else if (i3 != 3 && i3 != 4) {
                            C4210.m8621();
                            return;
                        } else if (!AbstractC4394.m8917(ref$ObjectRef.element, Boolean.FALSE)) {
                            ref$ObjectRef2.element = Boolean.valueOf(textInputServiceAndroid$TextInputCommand2 == TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
                        }
                    }
                    c1224.m2042();
                    if (AbstractC4394.m8917(ref$ObjectRef.element, Boolean.TRUE)) {
                        ((InputMethodManager) c2026.f5975.getValue()).restartInput(c2026.f5976);
                    }
                    Boolean bool = (Boolean) ref$ObjectRef2.element;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            ((C2242) c2026.f5974.f6536).mo4002();
                        } else {
                            ((C2242) c2026.f5974.f6536).mo4001();
                        }
                    }
                    if (AbstractC4394.m8917(ref$ObjectRef.element, Boolean.FALSE)) {
                        ((InputMethodManager) c2026.f5975.getValue()).restartInput(c2026.f5976);
                    }
                }
            };
            this.f5894.execute(r2);
            this.f5897 = r2;
        }
    }
}
