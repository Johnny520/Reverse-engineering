package p358y2;

import ac.AbstractC0063p;
import ai.AbstractC0090c;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.AbstractC0098d0;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import gg.C1424t;
import java.util.UUID;
import okio.C3193a;
import p002a1.C0010h;
import p014b.C0123b;
import p041d1.C0655c0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p099h.Hchat.R;
import p117i0.AbstractC1863o;
import p117i0.AbstractC1874r;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1876r1;
import p117i0.C1892x;
import p118i1.C1912l;
import p243q9.C3465a;
import p293u2.C4241k;
import p293u2.C4242l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p308v1.InterfaceC4428t;
import p322w0.C4668s;
import p357y1.AbstractC5858a;

/* JADX INFO: renamed from: y2.x */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5989x extends AbstractC5858a {

    /* JADX INFO: renamed from: A */
    public final C1845j1 f24323A;

    /* JADX INFO: renamed from: B */
    public C4241k f24324B;

    /* JADX INFO: renamed from: C */
    public final C1892x f24325C;

    /* JADX INFO: renamed from: D */
    public final Rect f24326D;

    /* JADX INFO: renamed from: E */
    public final C4668s f24327E;

    /* JADX INFO: renamed from: F */
    public C0123b f24328F;

    /* JADX INFO: renamed from: G */
    public final C1845j1 f24329G;

    /* JADX INFO: renamed from: H */
    public boolean f24330H;

    /* JADX INFO: renamed from: I */
    public final int[] f24331I;

    /* JADX INFO: renamed from: p */
    public InterfaceC1220a f24332p;

    /* JADX INFO: renamed from: q */
    public C5967c0 f24333q;

    /* JADX INFO: renamed from: r */
    public String f24334r;

    /* JADX INFO: renamed from: s */
    public final View f24335s;

    /* JADX INFO: renamed from: t */
    public final boolean f24336t;

    /* JADX INFO: renamed from: u */
    public final C5963a0 f24337u;

    /* JADX INFO: renamed from: v */
    public final WindowManager f24338v;

    /* JADX INFO: renamed from: w */
    public final WindowManager.LayoutParams f24339w;

    /* JADX INFO: renamed from: x */
    public InterfaceC5965b0 f24340x;

    /* JADX INFO: renamed from: y */
    public EnumC4243m f24341y;

    /* JADX INFO: renamed from: z */
    public final C1845j1 f24342z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5989x(InterfaceC1220a interfaceC1220a, C5967c0 c5967c0, String str, View view, InterfaceC4233c interfaceC4233c, InterfaceC5965b0 interfaceC5965b0, UUID uuid, boolean z9) {
        super(view.getContext());
        int i9 = Build.VERSION.SDK_INT;
        C5963a0 c5991z = i9 >= 30 ? new C5991z() : i9 >= 29 ? new C5990y() : new C5963a0();
        this.f24332p = interfaceC1220a;
        this.f24333q = c5967c0;
        this.f24334r = str;
        this.f24335s = view;
        this.f24336t = z9;
        this.f24337u = c5991z;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.f24338v = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C5967c0 c5967c02 = this.f24333q;
        boolean zM10713b = AbstractC5978m.m10713b(view);
        boolean z10 = c5967c02.f24251b;
        int i10 = c5967c02.f24250a;
        if (z10 && zM10713b) {
            i10 |= 8192;
        } else if (z10 && !zM10713b) {
            i10 &= -8193;
        }
        layoutParams.flags = i10;
        layoutParams.type = this.f24333q.f24255f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f24339w = layoutParams;
        this.f24340x = interfaceC5965b0;
        this.f24341y = EnumC4243m.f13919g;
        this.f24342z = AbstractC1874r.m4639u(null);
        this.f24323A = AbstractC1874r.m4639u(null);
        this.f24325C = AbstractC1874r.m4634p(new C0655c0(this, 22));
        this.f24326D = new Rect();
        this.f24327E = new C4668s(new C5975j(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, AbstractC0098d0.m543a(view));
        setTag(R.id.view_tree_view_model_store_owner, AbstractC0098d0.m544b(view));
        setTag(R.id.view_tree_saved_state_registry_owner, AbstractC0063p.m427t(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC4233c.mo1601x0((float) 8));
        setOutlineProvider(new C1912l(3));
        this.f24329G = AbstractC1874r.m4639u(AbstractC5984s.f24300a);
        this.f24331I = new int[2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final InterfaceC1235p getContent() {
        return (InterfaceC1235p) this.f24329G.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final C4241k getDisplayBounds() {
        int i9 = this.f24333q.f24250a & Opcodes.ACC_INTERFACE;
        View view = this.f24335s;
        Rect rect = this.f24326D;
        C5963a0 c5963a0 = this.f24337u;
        if (i9 == 0) {
            c5963a0.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            c5963a0.mo10710a(view, rect);
        }
        return new C4241k(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC4428t getParentLayoutCoordinates() {
        return (InterfaceC4428t) this.f24323A.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setContent(InterfaceC1235p interfaceC1235p) {
        this.f24329G.setValue(interfaceC1235p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void setParentLayoutCoordinates(InterfaceC4428t interfaceC4428t) {
        this.f24323A.setValue(interfaceC4428t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5858a
    /* JADX INFO: renamed from: a */
    public final void mo10551a(C1836h0 c1836h0, int i9) {
        c1836h0.m4527b0(-857613600);
        int i10 = (c1836h0.m4538h(this) ? 4 : 2) | i9;
        if (c1836h0.m4516S(i10 & 1, (i10 & 3) != 2)) {
            getContent().invoke(c1836h0, 0);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0010h(this, i9, 7);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f24333q.f24252c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC1220a interfaceC1220a = this.f24332p;
                if (interfaceC1220a != null) {
                    interfaceC1220a.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f24325C.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WindowManager.LayoutParams getParams$ui() {
        return this.f24339w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final EnumC4243m getParentLayoutDirection() {
        return this.f24341y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C4242l m11096getPopupContentSizebOM6tXw() {
        return (C4242l) this.f24342z.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final InterfaceC5965b0 getPositionProvider() {
        return this.f24340x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5858a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f24330H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTestTag() {
        return this.f24334r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5858a
    /* JADX INFO: renamed from: h */
    public final void mo10557h(boolean z9, int i9, int i10, int i11, int i12) {
        super.mo10557h(z9, i9, i10, i11, i12);
        this.f24333q.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f24339w;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f24337u.getClass();
        this.f24338v.updateViewLayout(this, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5858a
    /* JADX INFO: renamed from: i */
    public final void mo10558i(int i9, int i10) {
        this.f24333q.getClass();
        C4241k displayBounds = getDisplayBounds();
        super.mo10558i(View.MeasureSpec.makeMeasureSpec(displayBounds.f13916c - displayBounds.f13914a, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.m8532a(), Integer.MIN_VALUE));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m10725n(AbstractC1863o abstractC1863o, InterfaceC1235p interfaceC1235p) {
        setParentCompositionContext(abstractC1863o);
        setContent(interfaceC1235p);
        this.f24330H = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m10726o(InterfaceC1220a interfaceC1220a, C5967c0 c5967c0, String str, EnumC4243m enumC4243m) {
        int i9;
        this.f24332p = interfaceC1220a;
        this.f24334r = str;
        if (!AbstractC1416l.m3825a(this.f24333q, c5967c0)) {
            c5967c0.getClass();
            this.f24333q = c5967c0;
            boolean zM10713b = AbstractC5978m.m10713b(this.f24335s);
            boolean z9 = c5967c0.f24251b;
            int i10 = c5967c0.f24250a;
            if (z9 && zM10713b) {
                i10 |= 8192;
            } else if (z9 && !zM10713b) {
                i10 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f24339w;
            layoutParams.flags = i10;
            this.f24337u.getClass();
            this.f24338v.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = enumC4243m.ordinal();
        if (iOrdinal != 0) {
            i9 = 1;
            if (iOrdinal != 1) {
                C3193a.m6822k();
                return;
            }
        } else {
            i9 = 0;
        }
        super.setLayoutDirection(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p357y1.AbstractC5858a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f24327E.m9163d();
        if (!this.f24333q.f24252c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f24328F == null) {
            this.f24328F = new C0123b(this.f24332p, 1);
        }
        AbstractC0090c.m504d(this, this.f24328F);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C4668s c4668s = this.f24327E;
        C3465a c3465a = c4668s.f15543h;
        if (c3465a != null) {
            c3465a.m7269e();
        }
        c4668s.m9160a();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC0090c.m505e(this, this.f24328F);
        }
        this.f24328F = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f24333q.f24253d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC1220a interfaceC1220a = this.f24332p;
            if (interfaceC1220a != null) {
                interfaceC1220a.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            InterfaceC1220a interfaceC1220a2 = this.f24332p;
            if (interfaceC1220a2 != null) {
                interfaceC1220a2.invoke();
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m10727p() {
        InterfaceC4428t parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo8856C()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jMo8858F = parentLayoutCoordinates.mo8858F();
            long jMo8859P = this.f24336t ? parentLayoutCoordinates.mo8859P(0L) : parentLayoutCoordinates.mo8867m(0L);
            long jRound = (((long) Math.round(Float.intBitsToFloat((int) (jMo8859P >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (jMo8859P & 4294967295L)))) & 4294967295L);
            int i9 = (int) (jRound >> 32);
            int i10 = (int) (jRound & 4294967295L);
            C4241k c4241k = new C4241k(i9, i10, ((int) (jMo8858F >> 32)) + i9, ((int) (jMo8858F & 4294967295L)) + i10);
            if (c4241k.equals(this.f24324B)) {
                return;
            }
            this.f24324B = c4241k;
            m10729r();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m10728q(InterfaceC4428t interfaceC4428t) {
        setParentLayoutCoordinates(interfaceC4428t);
        m10727p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m10729r() {
        C4242l c4242lM11096getPopupContentSizebOM6tXw;
        C4241k c4241k = this.f24324B;
        if (c4241k == null || (c4242lM11096getPopupContentSizebOM6tXw = m11096getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j3 = c4242lM11096getPopupContentSizebOM6tXw.f13918a;
        C4241k displayBounds = getDisplayBounds();
        long jM8532a = (((long) displayBounds.m8532a()) & 4294967295L) | (((long) (displayBounds.f13916c - displayBounds.f13914a)) << 32);
        C1424t c1424t = new C1424t();
        c1424t.f4737g = 0L;
        this.f24327E.m9162c(this, C5966c.f24248m, new C5988w(c1424t, this, c4241k, jM8532a, j3));
        long j4 = c1424t.f4737g;
        WindowManager.LayoutParams layoutParams = this.f24339w;
        layoutParams.x = (int) (j4 >> 32);
        layoutParams.y = (int) (j4 & 4294967295L);
        boolean z9 = this.f24333q.f24254e;
        C5963a0 c5963a0 = this.f24337u;
        if (z9) {
            c5963a0.mo10711b(this, (int) (jM8532a >> 32), (int) (jM8532a & 4294967295L));
        }
        c5963a0.getClass();
        this.f24338v.updateViewLayout(this, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setParentLayoutDirection(EnumC4243m enumC4243m) {
        this.f24341y = enumC4243m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m11097setPopupContentSizefhxjrPA(C4242l c4242l) {
        this.f24342z.setValue(c4242l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setPositionProvider(InterfaceC5965b0 interfaceC5965b0) {
        this.f24340x = interfaceC5965b0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTestTag(String str) {
        this.f24334r = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public AbstractC5858a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i9) {
    }
}
