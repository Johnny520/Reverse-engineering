package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C1046R;
import androidx.constraintlayout.widget.C1052f;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;
import p000a.C0889w1;
import p000a.C0944z;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1051e {

    /* JADX INFO: renamed from: d */
    public static final int[] f4265d = {0, 4, 8};

    /* JADX INFO: renamed from: e */
    public static final SparseIntArray f4266e;

    /* JADX INFO: renamed from: a */
    public final HashMap<String, C1048b> f4267a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final boolean f4268b = true;

    /* JADX INFO: renamed from: c */
    public final HashMap<Integer, a> f4269c = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f4270a;

        /* JADX INFO: renamed from: b */
        public final d f4271b;

        /* JADX INFO: renamed from: c */
        public final c f4272c;

        /* JADX INFO: renamed from: d */
        public final b f4273d;

        /* JADX INFO: renamed from: e */
        public final e f4274e;

        /* JADX INFO: renamed from: f */
        public HashMap<String, C1048b> f4275f;

        public a() {
            d dVar = new d();
            dVar.f4343a = 0;
            dVar.f4344b = 0;
            dVar.f4345c = 1.0f;
            dVar.f4346d = Float.NaN;
            this.f4271b = dVar;
            c cVar = new c();
            cVar.f4339a = -1;
            cVar.f4340b = -1;
            cVar.f4341c = Float.NaN;
            cVar.f4342d = Float.NaN;
            this.f4272c = cVar;
            b bVar = new b();
            bVar.f4303a = false;
            bVar.f4309d = -1;
            bVar.f4311e = -1;
            bVar.f4313f = -1.0f;
            bVar.f4315g = -1;
            bVar.f4317h = -1;
            bVar.f4319i = -1;
            bVar.f4321j = -1;
            bVar.f4322k = -1;
            bVar.f4323l = -1;
            bVar.f4324m = -1;
            bVar.f4325n = -1;
            bVar.f4326o = -1;
            bVar.f4327p = -1;
            bVar.f4328q = -1;
            bVar.f4329r = -1;
            bVar.f4330s = -1;
            bVar.f4331t = 0.5f;
            bVar.f4332u = 0.5f;
            bVar.f4333v = null;
            bVar.f4334w = -1;
            bVar.f4335x = 0;
            bVar.f4336y = 0.0f;
            bVar.f4337z = -1;
            bVar.f4277A = -1;
            bVar.f4278B = -1;
            bVar.f4279C = -1;
            bVar.f4280D = -1;
            bVar.f4281E = -1;
            bVar.f4282F = -1;
            bVar.f4283G = -1;
            bVar.f4284H = -1;
            bVar.f4285I = -1;
            bVar.f4286J = -1;
            bVar.f4287K = -1;
            bVar.f4288L = -1;
            bVar.f4289M = -1;
            bVar.f4290N = -1;
            bVar.f4291O = -1.0f;
            bVar.f4292P = -1.0f;
            bVar.f4293Q = 0;
            bVar.f4294R = 0;
            bVar.f4295S = 0;
            bVar.f4296T = 0;
            bVar.f4297U = -1;
            bVar.f4298V = -1;
            bVar.f4299W = -1;
            bVar.f4300X = -1;
            bVar.f4301Y = 1.0f;
            bVar.f4302Z = 1.0f;
            bVar.f4304a0 = -1;
            bVar.f4306b0 = 0;
            bVar.f4308c0 = -1;
            bVar.f4316g0 = false;
            bVar.f4318h0 = false;
            bVar.f4320i0 = true;
            this.f4273d = bVar;
            e eVar = new e();
            eVar.f4348a = 0.0f;
            eVar.f4349b = 0.0f;
            eVar.f4350c = 0.0f;
            eVar.f4351d = 1.0f;
            eVar.f4352e = 1.0f;
            eVar.f4353f = Float.NaN;
            eVar.f4354g = Float.NaN;
            eVar.f4355h = 0.0f;
            eVar.f4356i = 0.0f;
            eVar.f4357j = 0.0f;
            eVar.f4358k = false;
            eVar.f4359l = 0.0f;
            this.f4274e = eVar;
            this.f4275f = new HashMap<>();
        }

        /* JADX INFO: renamed from: a */
        public final void m2429a(ConstraintLayout.C1044a c1044a) {
            b bVar = this.f4273d;
            c1044a.f4190d = bVar.f4315g;
            c1044a.f4192e = bVar.f4317h;
            c1044a.f4194f = bVar.f4319i;
            c1044a.f4196g = bVar.f4321j;
            c1044a.f4198h = bVar.f4322k;
            c1044a.f4200i = bVar.f4323l;
            c1044a.f4202j = bVar.f4324m;
            c1044a.f4204k = bVar.f4325n;
            c1044a.f4206l = bVar.f4326o;
            c1044a.f4211p = bVar.f4327p;
            c1044a.f4212q = bVar.f4328q;
            c1044a.f4213r = bVar.f4329r;
            c1044a.f4214s = bVar.f4330s;
            ((ViewGroup.MarginLayoutParams) c1044a).leftMargin = bVar.f4279C;
            ((ViewGroup.MarginLayoutParams) c1044a).rightMargin = bVar.f4280D;
            ((ViewGroup.MarginLayoutParams) c1044a).topMargin = bVar.f4281E;
            ((ViewGroup.MarginLayoutParams) c1044a).bottomMargin = bVar.f4282F;
            c1044a.f4219x = bVar.f4290N;
            c1044a.f4220y = bVar.f4289M;
            c1044a.f4216u = bVar.f4286J;
            c1044a.f4218w = bVar.f4288L;
            c1044a.f4221z = bVar.f4331t;
            c1044a.f4158A = bVar.f4332u;
            c1044a.f4208m = bVar.f4334w;
            c1044a.f4209n = bVar.f4335x;
            c1044a.f4210o = bVar.f4336y;
            c1044a.f4159B = bVar.f4333v;
            c1044a.f4173P = bVar.f4337z;
            c1044a.f4174Q = bVar.f4277A;
            c1044a.f4162E = bVar.f4291O;
            c1044a.f4161D = bVar.f4292P;
            c1044a.f4164G = bVar.f4294R;
            c1044a.f4163F = bVar.f4293Q;
            c1044a.f4176S = bVar.f4316g0;
            c1044a.f4177T = bVar.f4318h0;
            c1044a.f4165H = bVar.f4295S;
            c1044a.f4166I = bVar.f4296T;
            c1044a.f4169L = bVar.f4297U;
            c1044a.f4170M = bVar.f4298V;
            c1044a.f4167J = bVar.f4299W;
            c1044a.f4168K = bVar.f4300X;
            c1044a.f4171N = bVar.f4301Y;
            c1044a.f4172O = bVar.f4302Z;
            c1044a.f4175R = bVar.f4278B;
            c1044a.f4188c = bVar.f4313f;
            c1044a.f4184a = bVar.f4309d;
            c1044a.f4186b = bVar.f4311e;
            ((ViewGroup.MarginLayoutParams) c1044a).width = bVar.f4305b;
            ((ViewGroup.MarginLayoutParams) c1044a).height = bVar.f4307c;
            String str = bVar.f4314f0;
            if (str != null) {
                c1044a.f4178U = str;
            }
            c1044a.setMarginStart(bVar.f4284H);
            c1044a.setMarginEnd(bVar.f4283G);
            c1044a.m2413a();
        }

        /* JADX INFO: renamed from: b */
        public final void m2430b(int i, ConstraintLayout.C1044a c1044a) {
            this.f4270a = i;
            int i2 = c1044a.f4190d;
            b bVar = this.f4273d;
            bVar.f4315g = i2;
            bVar.f4317h = c1044a.f4192e;
            bVar.f4319i = c1044a.f4194f;
            bVar.f4321j = c1044a.f4196g;
            bVar.f4322k = c1044a.f4198h;
            bVar.f4323l = c1044a.f4200i;
            bVar.f4324m = c1044a.f4202j;
            bVar.f4325n = c1044a.f4204k;
            bVar.f4326o = c1044a.f4206l;
            bVar.f4327p = c1044a.f4211p;
            bVar.f4328q = c1044a.f4212q;
            bVar.f4329r = c1044a.f4213r;
            bVar.f4330s = c1044a.f4214s;
            bVar.f4331t = c1044a.f4221z;
            bVar.f4332u = c1044a.f4158A;
            bVar.f4333v = c1044a.f4159B;
            bVar.f4334w = c1044a.f4208m;
            bVar.f4335x = c1044a.f4209n;
            bVar.f4336y = c1044a.f4210o;
            bVar.f4337z = c1044a.f4173P;
            bVar.f4277A = c1044a.f4174Q;
            bVar.f4278B = c1044a.f4175R;
            bVar.f4313f = c1044a.f4188c;
            bVar.f4309d = c1044a.f4184a;
            bVar.f4311e = c1044a.f4186b;
            bVar.f4305b = ((ViewGroup.MarginLayoutParams) c1044a).width;
            bVar.f4307c = ((ViewGroup.MarginLayoutParams) c1044a).height;
            bVar.f4279C = ((ViewGroup.MarginLayoutParams) c1044a).leftMargin;
            bVar.f4280D = ((ViewGroup.MarginLayoutParams) c1044a).rightMargin;
            bVar.f4281E = ((ViewGroup.MarginLayoutParams) c1044a).topMargin;
            bVar.f4282F = ((ViewGroup.MarginLayoutParams) c1044a).bottomMargin;
            bVar.f4291O = c1044a.f4162E;
            bVar.f4292P = c1044a.f4161D;
            bVar.f4294R = c1044a.f4164G;
            bVar.f4293Q = c1044a.f4163F;
            bVar.f4316g0 = c1044a.f4176S;
            bVar.f4318h0 = c1044a.f4177T;
            bVar.f4295S = c1044a.f4165H;
            bVar.f4296T = c1044a.f4166I;
            bVar.f4297U = c1044a.f4169L;
            bVar.f4298V = c1044a.f4170M;
            bVar.f4299W = c1044a.f4167J;
            bVar.f4300X = c1044a.f4168K;
            bVar.f4301Y = c1044a.f4171N;
            bVar.f4302Z = c1044a.f4172O;
            bVar.f4314f0 = c1044a.f4178U;
            bVar.f4286J = c1044a.f4216u;
            bVar.f4288L = c1044a.f4218w;
            bVar.f4285I = c1044a.f4215t;
            bVar.f4287K = c1044a.f4217v;
            bVar.f4290N = c1044a.f4219x;
            bVar.f4289M = c1044a.f4220y;
            bVar.f4283G = c1044a.getMarginEnd();
            bVar.f4284H = c1044a.getMarginStart();
        }

        /* JADX INFO: renamed from: c */
        public final void m2431c(int i, C1052f.a aVar) {
            m2430b(i, aVar);
            this.f4271b.f4345c = aVar.f4360m0;
            float f = aVar.f4363p0;
            e eVar = this.f4274e;
            eVar.f4348a = f;
            eVar.f4349b = aVar.f4364q0;
            eVar.f4350c = aVar.f4365r0;
            eVar.f4351d = aVar.f4366s0;
            eVar.f4352e = aVar.f4367t0;
            eVar.f4353f = aVar.f4368u0;
            eVar.f4354g = aVar.f4369v0;
            eVar.f4355h = aVar.f4370w0;
            eVar.f4356i = aVar.f4371x0;
            eVar.f4357j = aVar.f4372y0;
            eVar.f4359l = aVar.f4362o0;
            eVar.f4358k = aVar.f4361n0;
        }

        public final Object clone() {
            a aVar = new a();
            b bVar = aVar.f4273d;
            bVar.getClass();
            b bVar2 = this.f4273d;
            bVar.f4303a = bVar2.f4303a;
            bVar.f4305b = bVar2.f4305b;
            bVar.f4307c = bVar2.f4307c;
            bVar.f4309d = bVar2.f4309d;
            bVar.f4311e = bVar2.f4311e;
            bVar.f4313f = bVar2.f4313f;
            bVar.f4315g = bVar2.f4315g;
            bVar.f4317h = bVar2.f4317h;
            bVar.f4319i = bVar2.f4319i;
            bVar.f4321j = bVar2.f4321j;
            bVar.f4322k = bVar2.f4322k;
            bVar.f4323l = bVar2.f4323l;
            bVar.f4324m = bVar2.f4324m;
            bVar.f4325n = bVar2.f4325n;
            bVar.f4326o = bVar2.f4326o;
            bVar.f4327p = bVar2.f4327p;
            bVar.f4328q = bVar2.f4328q;
            bVar.f4329r = bVar2.f4329r;
            bVar.f4330s = bVar2.f4330s;
            bVar.f4331t = bVar2.f4331t;
            bVar.f4332u = bVar2.f4332u;
            bVar.f4333v = bVar2.f4333v;
            bVar.f4334w = bVar2.f4334w;
            bVar.f4335x = bVar2.f4335x;
            bVar.f4336y = bVar2.f4336y;
            bVar.f4337z = bVar2.f4337z;
            bVar.f4277A = bVar2.f4277A;
            bVar.f4278B = bVar2.f4278B;
            bVar.f4279C = bVar2.f4279C;
            bVar.f4280D = bVar2.f4280D;
            bVar.f4281E = bVar2.f4281E;
            bVar.f4282F = bVar2.f4282F;
            bVar.f4283G = bVar2.f4283G;
            bVar.f4284H = bVar2.f4284H;
            bVar.f4285I = bVar2.f4285I;
            bVar.f4286J = bVar2.f4286J;
            bVar.f4287K = bVar2.f4287K;
            bVar.f4288L = bVar2.f4288L;
            bVar.f4289M = bVar2.f4289M;
            bVar.f4290N = bVar2.f4290N;
            bVar.f4291O = bVar2.f4291O;
            bVar.f4292P = bVar2.f4292P;
            bVar.f4293Q = bVar2.f4293Q;
            bVar.f4294R = bVar2.f4294R;
            bVar.f4295S = bVar2.f4295S;
            bVar.f4296T = bVar2.f4296T;
            bVar.f4297U = bVar2.f4297U;
            bVar.f4298V = bVar2.f4298V;
            bVar.f4299W = bVar2.f4299W;
            bVar.f4300X = bVar2.f4300X;
            bVar.f4301Y = bVar2.f4301Y;
            bVar.f4302Z = bVar2.f4302Z;
            bVar.f4304a0 = bVar2.f4304a0;
            bVar.f4306b0 = bVar2.f4306b0;
            bVar.f4308c0 = bVar2.f4308c0;
            bVar.f4314f0 = bVar2.f4314f0;
            int[] iArr = bVar2.f4310d0;
            if (iArr != null) {
                bVar.f4310d0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                bVar.f4310d0 = null;
            }
            bVar.f4312e0 = bVar2.f4312e0;
            bVar.f4316g0 = bVar2.f4316g0;
            bVar.f4318h0 = bVar2.f4318h0;
            bVar.f4320i0 = bVar2.f4320i0;
            c cVar = aVar.f4272c;
            cVar.getClass();
            c cVar2 = this.f4272c;
            cVar2.getClass();
            cVar.f4339a = cVar2.f4339a;
            cVar.f4340b = cVar2.f4340b;
            cVar.f4342d = cVar2.f4342d;
            cVar.f4341c = cVar2.f4341c;
            d dVar = aVar.f4271b;
            d dVar2 = this.f4271b;
            dVar.f4343a = dVar2.f4343a;
            dVar.f4345c = dVar2.f4345c;
            dVar.f4346d = dVar2.f4346d;
            dVar.f4344b = dVar2.f4344b;
            e eVar = aVar.f4274e;
            eVar.getClass();
            e eVar2 = this.f4274e;
            eVar2.getClass();
            eVar.f4348a = eVar2.f4348a;
            eVar.f4349b = eVar2.f4349b;
            eVar.f4350c = eVar2.f4350c;
            eVar.f4351d = eVar2.f4351d;
            eVar.f4352e = eVar2.f4352e;
            eVar.f4353f = eVar2.f4353f;
            eVar.f4354g = eVar2.f4354g;
            eVar.f4355h = eVar2.f4355h;
            eVar.f4356i = eVar2.f4356i;
            eVar.f4357j = eVar2.f4357j;
            eVar.f4358k = eVar2.f4358k;
            eVar.f4359l = eVar2.f4359l;
            aVar.f4270a = this.f4270a;
            return aVar;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$b */
    public static class b {

        /* JADX INFO: renamed from: j0 */
        public static final SparseIntArray f4276j0;

        /* JADX INFO: renamed from: A */
        public int f4277A;

        /* JADX INFO: renamed from: B */
        public int f4278B;

        /* JADX INFO: renamed from: C */
        public int f4279C;

        /* JADX INFO: renamed from: D */
        public int f4280D;

        /* JADX INFO: renamed from: E */
        public int f4281E;

        /* JADX INFO: renamed from: F */
        public int f4282F;

        /* JADX INFO: renamed from: G */
        public int f4283G;

        /* JADX INFO: renamed from: H */
        public int f4284H;

        /* JADX INFO: renamed from: I */
        public int f4285I;

        /* JADX INFO: renamed from: J */
        public int f4286J;

        /* JADX INFO: renamed from: K */
        public int f4287K;

        /* JADX INFO: renamed from: L */
        public int f4288L;

        /* JADX INFO: renamed from: M */
        public int f4289M;

        /* JADX INFO: renamed from: N */
        public int f4290N;

        /* JADX INFO: renamed from: O */
        public float f4291O;

        /* JADX INFO: renamed from: P */
        public float f4292P;

        /* JADX INFO: renamed from: Q */
        public int f4293Q;

        /* JADX INFO: renamed from: R */
        public int f4294R;

        /* JADX INFO: renamed from: S */
        public int f4295S;

        /* JADX INFO: renamed from: T */
        public int f4296T;

        /* JADX INFO: renamed from: U */
        public int f4297U;

        /* JADX INFO: renamed from: V */
        public int f4298V;

        /* JADX INFO: renamed from: W */
        public int f4299W;

        /* JADX INFO: renamed from: X */
        public int f4300X;

        /* JADX INFO: renamed from: Y */
        public float f4301Y;

        /* JADX INFO: renamed from: Z */
        public float f4302Z;

        /* JADX INFO: renamed from: a */
        public boolean f4303a;

        /* JADX INFO: renamed from: a0 */
        public int f4304a0;

        /* JADX INFO: renamed from: b */
        public int f4305b;

        /* JADX INFO: renamed from: b0 */
        public int f4306b0;

        /* JADX INFO: renamed from: c */
        public int f4307c;

        /* JADX INFO: renamed from: c0 */
        public int f4308c0;

        /* JADX INFO: renamed from: d */
        public int f4309d;

        /* JADX INFO: renamed from: d0 */
        public int[] f4310d0;

        /* JADX INFO: renamed from: e */
        public int f4311e;

        /* JADX INFO: renamed from: e0 */
        public String f4312e0;

        /* JADX INFO: renamed from: f */
        public float f4313f;

        /* JADX INFO: renamed from: f0 */
        public String f4314f0;

        /* JADX INFO: renamed from: g */
        public int f4315g;

        /* JADX INFO: renamed from: g0 */
        public boolean f4316g0;

        /* JADX INFO: renamed from: h */
        public int f4317h;

        /* JADX INFO: renamed from: h0 */
        public boolean f4318h0;

        /* JADX INFO: renamed from: i */
        public int f4319i;

        /* JADX INFO: renamed from: i0 */
        public boolean f4320i0;

        /* JADX INFO: renamed from: j */
        public int f4321j;

        /* JADX INFO: renamed from: k */
        public int f4322k;

        /* JADX INFO: renamed from: l */
        public int f4323l;

        /* JADX INFO: renamed from: m */
        public int f4324m;

        /* JADX INFO: renamed from: n */
        public int f4325n;

        /* JADX INFO: renamed from: o */
        public int f4326o;

        /* JADX INFO: renamed from: p */
        public int f4327p;

        /* JADX INFO: renamed from: q */
        public int f4328q;

        /* JADX INFO: renamed from: r */
        public int f4329r;

        /* JADX INFO: renamed from: s */
        public int f4330s;

        /* JADX INFO: renamed from: t */
        public float f4331t;

        /* JADX INFO: renamed from: u */
        public float f4332u;

        /* JADX INFO: renamed from: v */
        public String f4333v;

        /* JADX INFO: renamed from: w */
        public int f4334w;

        /* JADX INFO: renamed from: x */
        public int f4335x;

        /* JADX INFO: renamed from: y */
        public float f4336y;

        /* JADX INFO: renamed from: z */
        public int f4337z;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4276j0 = sparseIntArray;
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintLeft_toLeftOf, 24);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintLeft_toRightOf, 25);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintRight_toLeftOf, 28);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintRight_toRightOf, 29);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintTop_toTopOf, 35);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintTop_toBottomOf, 34);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintBottom_toTopOf, 4);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintBottom_toBottomOf, 3);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintBaseline_toBaselineOf, 1);
            sparseIntArray.append(C1046R.styleable.Layout_layout_editor_absoluteX, 6);
            sparseIntArray.append(C1046R.styleable.Layout_layout_editor_absoluteY, 7);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintGuide_begin, 17);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintGuide_end, 18);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintGuide_percent, 19);
            sparseIntArray.append(C1046R.styleable.Layout_android_orientation, 26);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintStart_toEndOf, 31);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintStart_toStartOf, 32);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintEnd_toStartOf, 10);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintEnd_toEndOf, 9);
            sparseIntArray.append(C1046R.styleable.Layout_layout_goneMarginLeft, 13);
            sparseIntArray.append(C1046R.styleable.Layout_layout_goneMarginTop, 16);
            sparseIntArray.append(C1046R.styleable.Layout_layout_goneMarginRight, 14);
            sparseIntArray.append(C1046R.styleable.Layout_layout_goneMarginBottom, 11);
            sparseIntArray.append(C1046R.styleable.Layout_layout_goneMarginStart, 15);
            sparseIntArray.append(C1046R.styleable.Layout_layout_goneMarginEnd, 12);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintVertical_weight, 38);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintHorizontal_weight, 37);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintHorizontal_chainStyle, 39);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintVertical_chainStyle, 40);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintHorizontal_bias, 20);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintVertical_bias, 36);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintDimensionRatio, 5);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintLeft_creator, 76);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintTop_creator, 76);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintRight_creator, 76);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintBottom_creator, 76);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintBaseline_creator, 76);
            sparseIntArray.append(C1046R.styleable.Layout_android_layout_marginLeft, 23);
            sparseIntArray.append(C1046R.styleable.Layout_android_layout_marginRight, 27);
            sparseIntArray.append(C1046R.styleable.Layout_android_layout_marginStart, 30);
            sparseIntArray.append(C1046R.styleable.Layout_android_layout_marginEnd, 8);
            sparseIntArray.append(C1046R.styleable.Layout_android_layout_marginTop, 33);
            sparseIntArray.append(C1046R.styleable.Layout_android_layout_marginBottom, 2);
            sparseIntArray.append(C1046R.styleable.Layout_android_layout_width, 22);
            sparseIntArray.append(C1046R.styleable.Layout_android_layout_height, 21);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintCircle, 61);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintCircleRadius, 62);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintCircleAngle, 63);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintWidth_percent, 69);
            sparseIntArray.append(C1046R.styleable.Layout_layout_constraintHeight_percent, 70);
            sparseIntArray.append(C1046R.styleable.Layout_chainUseRtl, 71);
            sparseIntArray.append(C1046R.styleable.Layout_barrierDirection, 72);
            sparseIntArray.append(C1046R.styleable.Layout_barrierMargin, 73);
            sparseIntArray.append(C1046R.styleable.Layout_constraint_referenced_ids, 74);
            sparseIntArray.append(C1046R.styleable.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* JADX INFO: renamed from: a */
        public final void m2432a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1046R.styleable.Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                SparseIntArray sparseIntArray = f4276j0;
                int i2 = sparseIntArray.get(index);
                if (i2 == 80) {
                    this.f4316g0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4316g0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f4326o = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4326o);
                            break;
                        case 2:
                            this.f4282F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4282F);
                            break;
                        case 3:
                            this.f4325n = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4325n);
                            break;
                        case 4:
                            this.f4324m = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4324m);
                            break;
                        case 5:
                            this.f4333v = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f4337z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4337z);
                            break;
                        case 7:
                            this.f4277A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4277A);
                            break;
                        case 8:
                            this.f4283G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4283G);
                            break;
                        case 9:
                            this.f4330s = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4330s);
                            break;
                        case 10:
                            this.f4329r = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4329r);
                            break;
                        case 11:
                            this.f4288L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4288L);
                            break;
                        case 12:
                            this.f4289M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4289M);
                            break;
                        case 13:
                            this.f4285I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4285I);
                            break;
                        case 14:
                            this.f4287K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4287K);
                            break;
                        case 15:
                            this.f4290N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4290N);
                            break;
                        case 16:
                            this.f4286J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4286J);
                            break;
                        case 17:
                            this.f4309d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4309d);
                            break;
                        case 18:
                            this.f4311e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4311e);
                            break;
                        case 19:
                            this.f4313f = typedArrayObtainStyledAttributes.getFloat(index, this.f4313f);
                            break;
                        case 20:
                            this.f4331t = typedArrayObtainStyledAttributes.getFloat(index, this.f4331t);
                            break;
                        case 21:
                            this.f4307c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f4307c);
                            break;
                        case 22:
                            this.f4305b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f4305b);
                            break;
                        case 23:
                            this.f4279C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4279C);
                            break;
                        case 24:
                            this.f4315g = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4315g);
                            break;
                        case 25:
                            this.f4317h = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4317h);
                            break;
                        case 26:
                            this.f4278B = typedArrayObtainStyledAttributes.getInt(index, this.f4278B);
                            break;
                        case 27:
                            this.f4280D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4280D);
                            break;
                        case 28:
                            this.f4319i = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4319i);
                            break;
                        case 29:
                            this.f4321j = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4321j);
                            break;
                        case 30:
                            this.f4284H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4284H);
                            break;
                        case 31:
                            this.f4327p = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4327p);
                            break;
                        case 32:
                            this.f4328q = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4328q);
                            break;
                        case 33:
                            this.f4281E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4281E);
                            break;
                        case 34:
                            this.f4323l = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4323l);
                            break;
                        case 35:
                            this.f4322k = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4322k);
                            break;
                        case 36:
                            this.f4332u = typedArrayObtainStyledAttributes.getFloat(index, this.f4332u);
                            break;
                        case 37:
                            this.f4292P = typedArrayObtainStyledAttributes.getFloat(index, this.f4292P);
                            break;
                        case 38:
                            this.f4291O = typedArrayObtainStyledAttributes.getFloat(index, this.f4291O);
                            break;
                        case 39:
                            this.f4293Q = typedArrayObtainStyledAttributes.getInt(index, this.f4293Q);
                            break;
                        case 40:
                            this.f4294R = typedArrayObtainStyledAttributes.getInt(index, this.f4294R);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f4295S = typedArrayObtainStyledAttributes.getInt(index, this.f4295S);
                                    break;
                                case 55:
                                    this.f4296T = typedArrayObtainStyledAttributes.getInt(index, this.f4296T);
                                    break;
                                case 56:
                                    this.f4297U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4297U);
                                    break;
                                case 57:
                                    this.f4298V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4298V);
                                    break;
                                case 58:
                                    this.f4299W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4299W);
                                    break;
                                case 59:
                                    this.f4300X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4300X);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f4334w = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4334w);
                                            break;
                                        case 62:
                                            this.f4335x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4335x);
                                            break;
                                        case 63:
                                            this.f4336y = typedArrayObtainStyledAttributes.getFloat(index, this.f4336y);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f4301Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f4302Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f4304a0 = typedArrayObtainStyledAttributes.getInt(index, this.f4304a0);
                                                    break;
                                                case 73:
                                                    this.f4306b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f4306b0);
                                                    break;
                                                case 74:
                                                    this.f4312e0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f4320i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4320i0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                    break;
                                                case 77:
                                                    this.f4314f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f4318h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f4318h0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$c */
    public static class c {

        /* JADX INFO: renamed from: e */
        public static final SparseIntArray f4338e;

        /* JADX INFO: renamed from: a */
        public int f4339a;

        /* JADX INFO: renamed from: b */
        public int f4340b;

        /* JADX INFO: renamed from: c */
        public float f4341c;

        /* JADX INFO: renamed from: d */
        public float f4342d;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4338e = sparseIntArray;
            sparseIntArray.append(C1046R.styleable.Motion_motionPathRotate, 1);
            sparseIntArray.append(C1046R.styleable.Motion_pathMotionArc, 2);
            sparseIntArray.append(C1046R.styleable.Motion_transitionEasing, 3);
            sparseIntArray.append(C1046R.styleable.Motion_drawPath, 4);
            sparseIntArray.append(C1046R.styleable.Motion_animate_relativeTo, 5);
            sparseIntArray.append(C1046R.styleable.Motion_motionStagger, 6);
        }

        /* JADX INFO: renamed from: a */
        public final void m2433a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1046R.styleable.Motion);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f4338e.get(index)) {
                    case 1:
                        this.f4342d = typedArrayObtainStyledAttributes.getFloat(index, this.f4342d);
                        break;
                    case 2:
                        this.f4340b = typedArrayObtainStyledAttributes.getInt(index, this.f4340b);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            String str = C0889w1.f3486n[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f4339a = C1051e.m2425f(typedArrayObtainStyledAttributes, index, this.f4339a);
                        break;
                    case 6:
                        this.f4341c = typedArrayObtainStyledAttributes.getFloat(index, this.f4341c);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public int f4343a;

        /* JADX INFO: renamed from: b */
        public int f4344b;

        /* JADX INFO: renamed from: c */
        public float f4345c;

        /* JADX INFO: renamed from: d */
        public float f4346d;

        /* JADX INFO: renamed from: a */
        public final void m2434a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1046R.styleable.PropertySet);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == C1046R.styleable.PropertySet_android_alpha) {
                    this.f4345c = typedArrayObtainStyledAttributes.getFloat(index, this.f4345c);
                } else if (index == C1046R.styleable.PropertySet_android_visibility) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.f4343a);
                    this.f4343a = i2;
                    this.f4343a = C1051e.f4265d[i2];
                } else if (index == C1046R.styleable.PropertySet_visibilityMode) {
                    this.f4344b = typedArrayObtainStyledAttributes.getInt(index, this.f4344b);
                } else if (index == C1046R.styleable.PropertySet_motionProgress) {
                    this.f4346d = typedArrayObtainStyledAttributes.getFloat(index, this.f4346d);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$e */
    public static class e {

        /* JADX INFO: renamed from: m */
        public static final SparseIntArray f4347m;

        /* JADX INFO: renamed from: a */
        public float f4348a;

        /* JADX INFO: renamed from: b */
        public float f4349b;

        /* JADX INFO: renamed from: c */
        public float f4350c;

        /* JADX INFO: renamed from: d */
        public float f4351d;

        /* JADX INFO: renamed from: e */
        public float f4352e;

        /* JADX INFO: renamed from: f */
        public float f4353f;

        /* JADX INFO: renamed from: g */
        public float f4354g;

        /* JADX INFO: renamed from: h */
        public float f4355h;

        /* JADX INFO: renamed from: i */
        public float f4356i;

        /* JADX INFO: renamed from: j */
        public float f4357j;

        /* JADX INFO: renamed from: k */
        public boolean f4358k;

        /* JADX INFO: renamed from: l */
        public float f4359l;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f4347m = sparseIntArray;
            sparseIntArray.append(C1046R.styleable.Transform_android_rotation, 1);
            sparseIntArray.append(C1046R.styleable.Transform_android_rotationX, 2);
            sparseIntArray.append(C1046R.styleable.Transform_android_rotationY, 3);
            sparseIntArray.append(C1046R.styleable.Transform_android_scaleX, 4);
            sparseIntArray.append(C1046R.styleable.Transform_android_scaleY, 5);
            sparseIntArray.append(C1046R.styleable.Transform_android_transformPivotX, 6);
            sparseIntArray.append(C1046R.styleable.Transform_android_transformPivotY, 7);
            sparseIntArray.append(C1046R.styleable.Transform_android_translationX, 8);
            sparseIntArray.append(C1046R.styleable.Transform_android_translationY, 9);
            sparseIntArray.append(C1046R.styleable.Transform_android_translationZ, 10);
            sparseIntArray.append(C1046R.styleable.Transform_android_elevation, 11);
        }

        /* JADX INFO: renamed from: a */
        public final void m2435a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1046R.styleable.Transform);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                switch (f4347m.get(index)) {
                    case 1:
                        this.f4348a = typedArrayObtainStyledAttributes.getFloat(index, this.f4348a);
                        break;
                    case 2:
                        this.f4349b = typedArrayObtainStyledAttributes.getFloat(index, this.f4349b);
                        break;
                    case 3:
                        this.f4350c = typedArrayObtainStyledAttributes.getFloat(index, this.f4350c);
                        break;
                    case 4:
                        this.f4351d = typedArrayObtainStyledAttributes.getFloat(index, this.f4351d);
                        break;
                    case 5:
                        this.f4352e = typedArrayObtainStyledAttributes.getFloat(index, this.f4352e);
                        break;
                    case 6:
                        this.f4353f = typedArrayObtainStyledAttributes.getDimension(index, this.f4353f);
                        break;
                    case 7:
                        this.f4354g = typedArrayObtainStyledAttributes.getDimension(index, this.f4354g);
                        break;
                    case 8:
                        this.f4355h = typedArrayObtainStyledAttributes.getDimension(index, this.f4355h);
                        break;
                    case 9:
                        this.f4356i = typedArrayObtainStyledAttributes.getDimension(index, this.f4356i);
                        break;
                    case 10:
                        this.f4357j = typedArrayObtainStyledAttributes.getDimension(index, this.f4357j);
                        break;
                    case 11:
                        this.f4358k = true;
                        this.f4359l = typedArrayObtainStyledAttributes.getDimension(index, this.f4359l);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4266e = sparseIntArray;
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(C1046R.styleable.Constraint_android_orientation, 27);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintLeft_creator, 82);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintTop_creator, 82);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintRight_creator, 82);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintBottom_creator, 82);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintBaseline_creator, 82);
        sparseIntArray.append(C1046R.styleable.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(C1046R.styleable.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(C1046R.styleable.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(C1046R.styleable.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(C1046R.styleable.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(C1046R.styleable.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(C1046R.styleable.Constraint_android_layout_width, 23);
        sparseIntArray.append(C1046R.styleable.Constraint_android_layout_height, 21);
        sparseIntArray.append(C1046R.styleable.Constraint_android_visibility, 22);
        sparseIntArray.append(C1046R.styleable.Constraint_android_alpha, 43);
        sparseIntArray.append(C1046R.styleable.Constraint_android_elevation, 44);
        sparseIntArray.append(C1046R.styleable.Constraint_android_rotationX, 45);
        sparseIntArray.append(C1046R.styleable.Constraint_android_rotationY, 46);
        sparseIntArray.append(C1046R.styleable.Constraint_android_rotation, 60);
        sparseIntArray.append(C1046R.styleable.Constraint_android_scaleX, 47);
        sparseIntArray.append(C1046R.styleable.Constraint_android_scaleY, 48);
        sparseIntArray.append(C1046R.styleable.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(C1046R.styleable.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(C1046R.styleable.Constraint_android_translationX, 51);
        sparseIntArray.append(C1046R.styleable.Constraint_android_translationY, 52);
        sparseIntArray.append(C1046R.styleable.Constraint_android_translationZ, 53);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(C1046R.styleable.Constraint_animate_relativeTo, 64);
        sparseIntArray.append(C1046R.styleable.Constraint_transitionEasing, 65);
        sparseIntArray.append(C1046R.styleable.Constraint_drawPath, 66);
        sparseIntArray.append(C1046R.styleable.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(C1046R.styleable.Constraint_motionStagger, 79);
        sparseIntArray.append(C1046R.styleable.Constraint_android_id, 38);
        sparseIntArray.append(C1046R.styleable.Constraint_motionProgress, 68);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(C1046R.styleable.Constraint_chainUseRtl, 71);
        sparseIntArray.append(C1046R.styleable.Constraint_barrierDirection, 72);
        sparseIntArray.append(C1046R.styleable.Constraint_barrierMargin, 73);
        sparseIntArray.append(C1046R.styleable.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(C1046R.styleable.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(C1046R.styleable.Constraint_pathMotionArc, 76);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(C1046R.styleable.Constraint_visibilityMode, 78);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(C1046R.styleable.Constraint_layout_constrainedHeight, 81);
    }

    /* JADX INFO: renamed from: c */
    public static int[] m2423c(C1047a c1047a, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = c1047a.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Integer num = null;
            try {
                iIntValue = C1046R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && c1047a.isInEditMode() && (c1047a.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c1047a.getParent();
                if (strTrim != null) {
                    HashMap<String, Integer> map = constraintLayout.f4155m;
                    if (map != null && map.containsKey(strTrim)) {
                        num = constraintLayout.f4155m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (num != null && (num instanceof Integer)) {
                    iIntValue = num.intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: d */
    public static a m2424d(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1046R.styleable.Constraint);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            int i2 = C1046R.styleable.Constraint_android_id;
            d dVar = aVar.f4271b;
            c cVar = aVar.f4272c;
            e eVar = aVar.f4274e;
            b bVar = aVar.f4273d;
            if (index != i2 && C1046R.styleable.Constraint_android_layout_marginStart != index && C1046R.styleable.Constraint_android_layout_marginEnd != index) {
                cVar.getClass();
                bVar.getClass();
                eVar.getClass();
            }
            SparseIntArray sparseIntArray = f4266e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    bVar.f4326o = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4326o);
                    break;
                case 2:
                    bVar.f4282F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4282F);
                    break;
                case 3:
                    bVar.f4325n = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4325n);
                    break;
                case 4:
                    bVar.f4324m = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4324m);
                    break;
                case 5:
                    bVar.f4333v = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    bVar.f4337z = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f4337z);
                    break;
                case 7:
                    bVar.f4277A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f4277A);
                    break;
                case 8:
                    bVar.f4283G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4283G);
                    break;
                case 9:
                    bVar.f4330s = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4330s);
                    break;
                case 10:
                    bVar.f4329r = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4329r);
                    break;
                case 11:
                    bVar.f4288L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4288L);
                    break;
                case 12:
                    bVar.f4289M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4289M);
                    break;
                case 13:
                    bVar.f4285I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4285I);
                    break;
                case 14:
                    bVar.f4287K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4287K);
                    break;
                case 15:
                    bVar.f4290N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4290N);
                    break;
                case 16:
                    bVar.f4286J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4286J);
                    break;
                case 17:
                    bVar.f4309d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f4309d);
                    break;
                case 18:
                    bVar.f4311e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f4311e);
                    break;
                case 19:
                    bVar.f4313f = typedArrayObtainStyledAttributes.getFloat(index, bVar.f4313f);
                    break;
                case 20:
                    bVar.f4331t = typedArrayObtainStyledAttributes.getFloat(index, bVar.f4331t);
                    break;
                case 21:
                    bVar.f4307c = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f4307c);
                    break;
                case 22:
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, dVar.f4343a);
                    dVar.f4343a = i3;
                    dVar.f4343a = f4265d[i3];
                    break;
                case 23:
                    bVar.f4305b = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f4305b);
                    break;
                case 24:
                    bVar.f4279C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4279C);
                    break;
                case 25:
                    bVar.f4315g = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4315g);
                    break;
                case 26:
                    bVar.f4317h = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4317h);
                    break;
                case 27:
                    bVar.f4278B = typedArrayObtainStyledAttributes.getInt(index, bVar.f4278B);
                    break;
                case 28:
                    bVar.f4280D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4280D);
                    break;
                case 29:
                    bVar.f4319i = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4319i);
                    break;
                case 30:
                    bVar.f4321j = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4321j);
                    break;
                case 31:
                    bVar.f4284H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4284H);
                    break;
                case 32:
                    bVar.f4327p = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4327p);
                    break;
                case 33:
                    bVar.f4328q = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4328q);
                    break;
                case 34:
                    bVar.f4281E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4281E);
                    break;
                case 35:
                    bVar.f4323l = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4323l);
                    break;
                case 36:
                    bVar.f4322k = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4322k);
                    break;
                case 37:
                    bVar.f4332u = typedArrayObtainStyledAttributes.getFloat(index, bVar.f4332u);
                    break;
                case 38:
                    aVar.f4270a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f4270a);
                    break;
                case 39:
                    bVar.f4292P = typedArrayObtainStyledAttributes.getFloat(index, bVar.f4292P);
                    break;
                case 40:
                    bVar.f4291O = typedArrayObtainStyledAttributes.getFloat(index, bVar.f4291O);
                    break;
                case 41:
                    bVar.f4293Q = typedArrayObtainStyledAttributes.getInt(index, bVar.f4293Q);
                    break;
                case 42:
                    bVar.f4294R = typedArrayObtainStyledAttributes.getInt(index, bVar.f4294R);
                    break;
                case 43:
                    dVar.f4345c = typedArrayObtainStyledAttributes.getFloat(index, dVar.f4345c);
                    break;
                case 44:
                    eVar.f4358k = true;
                    eVar.f4359l = typedArrayObtainStyledAttributes.getDimension(index, eVar.f4359l);
                    break;
                case 45:
                    eVar.f4349b = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4349b);
                    break;
                case 46:
                    eVar.f4350c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4350c);
                    break;
                case 47:
                    eVar.f4351d = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4351d);
                    break;
                case 48:
                    eVar.f4352e = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4352e);
                    break;
                case 49:
                    eVar.f4353f = typedArrayObtainStyledAttributes.getDimension(index, eVar.f4353f);
                    break;
                case 50:
                    eVar.f4354g = typedArrayObtainStyledAttributes.getDimension(index, eVar.f4354g);
                    break;
                case 51:
                    eVar.f4355h = typedArrayObtainStyledAttributes.getDimension(index, eVar.f4355h);
                    break;
                case 52:
                    eVar.f4356i = typedArrayObtainStyledAttributes.getDimension(index, eVar.f4356i);
                    break;
                case 53:
                    eVar.f4357j = typedArrayObtainStyledAttributes.getDimension(index, eVar.f4357j);
                    break;
                case 54:
                    bVar.f4295S = typedArrayObtainStyledAttributes.getInt(index, bVar.f4295S);
                    break;
                case 55:
                    bVar.f4296T = typedArrayObtainStyledAttributes.getInt(index, bVar.f4296T);
                    break;
                case 56:
                    bVar.f4297U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4297U);
                    break;
                case 57:
                    bVar.f4298V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4298V);
                    break;
                case 58:
                    bVar.f4299W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4299W);
                    break;
                case 59:
                    bVar.f4300X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4300X);
                    break;
                case 60:
                    eVar.f4348a = typedArrayObtainStyledAttributes.getFloat(index, eVar.f4348a);
                    break;
                case 61:
                    bVar.f4334w = m2425f(typedArrayObtainStyledAttributes, index, bVar.f4334w);
                    break;
                case 62:
                    bVar.f4335x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4335x);
                    break;
                case 63:
                    bVar.f4336y = typedArrayObtainStyledAttributes.getFloat(index, bVar.f4336y);
                    break;
                case 64:
                    cVar.f4339a = m2425f(typedArrayObtainStyledAttributes, index, cVar.f4339a);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        cVar.getClass();
                    } else {
                        String str = C0889w1.f3486n[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        cVar.getClass();
                    }
                    break;
                case 66:
                    typedArrayObtainStyledAttributes.getInt(index, 0);
                    cVar.getClass();
                    break;
                case 67:
                    cVar.f4342d = typedArrayObtainStyledAttributes.getFloat(index, cVar.f4342d);
                    break;
                case 68:
                    dVar.f4346d = typedArrayObtainStyledAttributes.getFloat(index, dVar.f4346d);
                    break;
                case 69:
                    bVar.f4301Y = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    bVar.f4302Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    bVar.f4304a0 = typedArrayObtainStyledAttributes.getInt(index, bVar.f4304a0);
                    break;
                case 73:
                    bVar.f4306b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f4306b0);
                    break;
                case 74:
                    bVar.f4312e0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    bVar.f4320i0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f4320i0);
                    break;
                case 76:
                    cVar.f4340b = typedArrayObtainStyledAttributes.getInt(index, cVar.f4340b);
                    break;
                case 77:
                    bVar.f4314f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    dVar.f4344b = typedArrayObtainStyledAttributes.getInt(index, dVar.f4344b);
                    break;
                case 79:
                    cVar.f4341c = typedArrayObtainStyledAttributes.getFloat(index, cVar.f4341c);
                    break;
                case 80:
                    bVar.f4316g0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f4316g0);
                    break;
                case 81:
                    bVar.f4318h0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f4318h0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: renamed from: f */
    public static int m2425f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: a */
    public final void m2426a(ConstraintLayout constraintLayout) {
        int i;
        int i2;
        HashSet hashSet;
        HashSet hashSet2;
        String resourceEntryName;
        C1051e c1051e = this;
        int i3 = 1;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = c1051e.f4269c;
        HashSet<Integer> hashSet3 = new HashSet(map.keySet());
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c1051e.f4268b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet3.remove(Integer.valueOf(id));
                        a aVar = map.get(Integer.valueOf(id));
                        if (childAt instanceof C1047a) {
                            aVar.f4273d.f4308c0 = i3;
                        }
                        int i5 = aVar.f4273d.f4308c0;
                        if (i5 != -1 && i5 == i3) {
                            C1047a c1047a = (C1047a) childAt;
                            c1047a.setId(id);
                            b bVar = aVar.f4273d;
                            c1047a.setType(bVar.f4304a0);
                            c1047a.setMargin(bVar.f4306b0);
                            c1047a.setAllowsGoneWidget(bVar.f4320i0);
                            int[] iArr = bVar.f4310d0;
                            if (iArr != null) {
                                c1047a.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f4312e0;
                                if (str != null) {
                                    int[] iArrM2423c = m2423c(c1047a, str);
                                    bVar.f4310d0 = iArrM2423c;
                                    c1047a.setReferencedIds(iArrM2423c);
                                }
                            }
                        }
                        ConstraintLayout.C1044a c1044a = (ConstraintLayout.C1044a) childAt.getLayoutParams();
                        c1044a.m2413a();
                        aVar.m2429a(c1044a);
                        HashMap<String, C1048b> map2 = aVar.f4275f;
                        Class<?> cls = childAt.getClass();
                        for (String str2 : map2.keySet()) {
                            int i6 = i3;
                            C1048b c1048b = map2.get(str2);
                            String strM2231k = C0944z.m2231k("set", str2);
                            int i7 = childCount;
                            try {
                                int iOrdinal = c1048b.f4235a.ordinal();
                                Class cls2 = Integer.TYPE;
                                Class cls3 = Float.TYPE;
                                switch (iOrdinal) {
                                    case 0:
                                        hashSet2 = hashSet3;
                                        cls.getMethod(strM2231k, cls2).invoke(childAt, Integer.valueOf(c1048b.f4236b));
                                        break;
                                    case 1:
                                        hashSet2 = hashSet3;
                                        cls.getMethod(strM2231k, cls3).invoke(childAt, Float.valueOf(c1048b.f4237c));
                                        break;
                                    case 2:
                                        hashSet2 = hashSet3;
                                        cls.getMethod(strM2231k, cls2).invoke(childAt, Integer.valueOf(c1048b.f4240f));
                                        break;
                                    case 3:
                                        Method method = cls.getMethod(strM2231k, Drawable.class);
                                        hashSet2 = hashSet3;
                                        try {
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c1048b.f4240f);
                                            method.invoke(childAt, colorDrawable);
                                        } catch (IllegalAccessException e2) {
                                            e = e2;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                        } catch (NoSuchMethodException e3) {
                                            e = e3;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            Log.e("TransitionLayout", cls.getName() + " must have a method " + strM2231k);
                                        } catch (InvocationTargetException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                        }
                                        break;
                                    case 4:
                                        cls.getMethod(strM2231k, CharSequence.class).invoke(childAt, c1048b.f4238d);
                                        hashSet2 = hashSet3;
                                        break;
                                    case 5:
                                        cls.getMethod(strM2231k, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c1048b.f4239e));
                                        hashSet2 = hashSet3;
                                        break;
                                    case 6:
                                        cls.getMethod(strM2231k, cls3).invoke(childAt, Float.valueOf(c1048b.f4237c));
                                        hashSet2 = hashSet3;
                                        break;
                                    default:
                                        hashSet2 = hashSet3;
                                        break;
                                }
                            } catch (IllegalAccessException e5) {
                                e = e5;
                                hashSet2 = hashSet3;
                            } catch (NoSuchMethodException e6) {
                                e = e6;
                                hashSet2 = hashSet3;
                            } catch (InvocationTargetException e7) {
                                e = e7;
                                hashSet2 = hashSet3;
                            }
                            i3 = i6;
                            childCount = i7;
                            hashSet3 = hashSet2;
                        }
                        i = i3;
                        i2 = childCount;
                        hashSet = hashSet3;
                        childAt.setLayoutParams(c1044a);
                        d dVar = aVar.f4271b;
                        if (dVar.f4344b == 0) {
                            childAt.setVisibility(dVar.f4343a);
                        }
                        childAt.setAlpha(dVar.f4345c);
                        e eVar = aVar.f4274e;
                        childAt.setRotation(eVar.f4348a);
                        childAt.setRotationX(eVar.f4349b);
                        childAt.setRotationY(eVar.f4350c);
                        childAt.setScaleX(eVar.f4351d);
                        childAt.setScaleY(eVar.f4352e);
                        if (!Float.isNaN(eVar.f4353f)) {
                            childAt.setPivotX(eVar.f4353f);
                        }
                        if (!Float.isNaN(eVar.f4354g)) {
                            childAt.setPivotY(eVar.f4354g);
                        }
                        childAt.setTranslationX(eVar.f4355h);
                        childAt.setTranslationY(eVar.f4356i);
                        childAt.setTranslationZ(eVar.f4357j);
                        if (eVar.f4358k) {
                            childAt.setElevation(eVar.f4359l);
                        }
                    } else {
                        i = i3;
                        i2 = childCount;
                        hashSet = hashSet3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i4++;
                c1051e = this;
                i3 = i;
                childCount = i2;
                hashSet3 = hashSet;
            }
            i = i3;
            i2 = childCount;
            hashSet = hashSet3;
            i4++;
            c1051e = this;
            i3 = i;
            childCount = i2;
            hashSet3 = hashSet;
        }
        int i8 = i3;
        for (Integer num : hashSet3) {
            a aVar2 = map.get(num);
            b bVar2 = aVar2.f4273d;
            int i9 = bVar2.f4308c0;
            int i10 = i8;
            if (i9 != -1 && i9 == i10) {
                Context context = constraintLayout.getContext();
                C1047a c1047a2 = new C1047a(context);
                c1047a2.f4249a = new int[32];
                c1047a2.f4254f = new HashMap<>();
                c1047a2.f4251c = context;
                c1047a2.mo2406e(null);
                c1047a2.setVisibility(8);
                c1047a2.setId(num.intValue());
                int[] iArr2 = bVar2.f4310d0;
                if (iArr2 != null) {
                    c1047a2.setReferencedIds(iArr2);
                } else {
                    String str3 = bVar2.f4312e0;
                    if (str3 != null) {
                        int[] iArrM2423c2 = m2423c(c1047a2, str3);
                        bVar2.f4310d0 = iArrM2423c2;
                        c1047a2.setReferencedIds(iArrM2423c2);
                    }
                }
                c1047a2.setType(bVar2.f4304a0);
                c1047a2.setMargin(bVar2.f4306b0);
                int i11 = ConstraintLayout.f4142p;
                ConstraintLayout.C1044a c1044a2 = new ConstraintLayout.C1044a();
                c1047a2.m2421g();
                aVar2.m2429a(c1044a2);
                constraintLayout.addView(c1047a2, c1044a2);
            }
            if (bVar2.f4303a) {
                View c1053g = new C1053g(constraintLayout.getContext());
                c1053g.setId(num.intValue());
                int i12 = ConstraintLayout.f4142p;
                ConstraintLayout.C1044a c1044a3 = new ConstraintLayout.C1044a();
                aVar2.m2429a(c1044a3);
                constraintLayout.addView(c1053g, c1044a3);
            }
            i8 = i10;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2427b(ConstraintLayout constraintLayout) {
        C1051e c1051e = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = c1051e.f4269c;
        map.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C1044a c1044a = (ConstraintLayout.C1044a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c1051e.f4268b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new a());
            }
            a aVar = map.get(Integer.valueOf(id));
            HashMap<String, C1048b> map2 = c1051e.f4267a;
            HashMap<String, C1048b> map3 = new HashMap<>();
            Class<?> cls = childAt.getClass();
            for (String str : map2.keySet()) {
                C1048b c1048b = map2.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map3.put(str, new C1048b(c1048b, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map3.put(str, new C1048b(c1048b, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                } catch (InvocationTargetException e4) {
                    e4.printStackTrace();
                }
            }
            aVar.f4275f = map3;
            aVar.m2430b(id, c1044a);
            int visibility = childAt.getVisibility();
            d dVar = aVar.f4271b;
            dVar.f4343a = visibility;
            dVar.f4345c = childAt.getAlpha();
            float rotation = childAt.getRotation();
            e eVar = aVar.f4274e;
            eVar.f4348a = rotation;
            eVar.f4349b = childAt.getRotationX();
            eVar.f4350c = childAt.getRotationY();
            eVar.f4351d = childAt.getScaleX();
            eVar.f4352e = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                eVar.f4353f = pivotX;
                eVar.f4354g = pivotY;
            }
            eVar.f4355h = childAt.getTranslationX();
            eVar.f4356i = childAt.getTranslationY();
            eVar.f4357j = childAt.getTranslationZ();
            if (eVar.f4358k) {
                eVar.f4359l = childAt.getElevation();
            }
            if (childAt instanceof C1047a) {
                C1047a c1047a = (C1047a) childAt;
                boolean z = c1047a.f4234i.f1439h0;
                b bVar = aVar.f4273d;
                bVar.f4320i0 = z;
                bVar.f4310d0 = c1047a.getReferencedIds();
                bVar.f4304a0 = c1047a.getType();
                bVar.f4306b0 = c1047a.getMargin();
            }
            i++;
            c1051e = this;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2428e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM2424d = m2424d(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM2424d.f4273d.f4303a = true;
                    }
                    this.f4269c.put(Integer.valueOf(aVarM2424d.f4270a), aVarM2424d);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
