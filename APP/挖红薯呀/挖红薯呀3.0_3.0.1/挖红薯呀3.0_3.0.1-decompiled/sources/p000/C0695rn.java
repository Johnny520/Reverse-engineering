package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.AnnotationElementMatcher;
import org.luckypray.dexkit.query.matchers.AnnotationMatcher;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.FieldMatcher;
import org.luckypray.dexkit.query.matchers.FieldsMatcher;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.query.matchers.MethodsMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.result.MethodData;
import p000.C0695rn;

/* JADX INFO: renamed from: rn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0695rn {

    /* JADX INFO: renamed from: P */
    private static final u60 f5448P;

    /* JADX INFO: renamed from: Q */
    private static final u60 f5449Q;

    /* JADX INFO: renamed from: R */
    private static final u60 f5450R;

    /* JADX INFO: renamed from: S */
    private static final u60 f5451S;

    /* JADX INFO: renamed from: T */
    private static final u60 f5452T;

    /* JADX INFO: renamed from: U */
    private static final u60 f5453U;

    /* JADX INFO: renamed from: V */
    private static final u60 f5454V;

    /* JADX INFO: renamed from: W */
    private static final u60 f5455W;

    /* JADX INFO: renamed from: b */
    private static final u60 f5458b;

    /* JADX INFO: renamed from: c */
    private static final u60 f5459c;

    /* JADX INFO: renamed from: e */
    private static final u60 f5461e;

    /* JADX INFO: renamed from: f */
    private static final u60 f5462f;

    /* JADX INFO: renamed from: g */
    private static final u60 f5463g;

    /* JADX INFO: renamed from: h */
    private static final u60 f5464h;

    /* JADX INFO: renamed from: i */
    private static final u60 f5465i;

    /* JADX INFO: renamed from: j */
    private static final u60 f5466j;

    /* JADX INFO: renamed from: k */
    private static final u60 f5467k;

    /* JADX INFO: renamed from: l */
    private static final u60 f5468l;

    /* JADX INFO: renamed from: m */
    private static final u60 f5469m;

    /* JADX INFO: renamed from: n */
    private static final u60 f5470n;

    /* JADX INFO: renamed from: o */
    private static final u60 f5471o;

    /* JADX INFO: renamed from: p */
    private static final u60 f5472p;

    /* JADX INFO: renamed from: q */
    private static final u60 f5473q;

    /* JADX INFO: renamed from: r */
    private static final u60 f5474r;

    /* JADX INFO: renamed from: s */
    private static final u60 f5475s;

    /* JADX INFO: renamed from: t */
    private static final u60 f5476t;

    /* JADX INFO: renamed from: u */
    private static final u60 f5477u;

    /* JADX INFO: renamed from: v */
    private static final u60 f5478v;

    /* JADX INFO: renamed from: w */
    private static final u60 f5479w;

    /* JADX INFO: renamed from: x */
    private static final u60 f5480x;

    /* JADX INFO: renamed from: a */
    public static final C0695rn f5457a = new C0695rn();

    /* JADX INFO: renamed from: d */
    private static final u60 f5460d = new x51(new C0252gn(19));

    /* JADX INFO: renamed from: y */
    private static final u60 f5481y = new x51(new C0658qn(0));

    /* JADX INFO: renamed from: z */
    private static final u60 f5482z = new x51(new C0252gn(13));

    /* JADX INFO: renamed from: A */
    private static final u60 f5433A = new x51(new C0252gn(14));

    /* JADX INFO: renamed from: B */
    private static final u60 f5434B = new x51(new C0252gn(15));

    /* JADX INFO: renamed from: C */
    private static final u60 f5435C = new x51(new C0252gn(16));

    /* JADX INFO: renamed from: D */
    private static final u60 f5436D = new x51(new C0252gn(17));

    /* JADX INFO: renamed from: E */
    private static final u60 f5437E = new x51(new C0252gn(18));

    /* JADX INFO: renamed from: F */
    private static final u60 f5438F = new x51(new C0252gn(20));

    /* JADX INFO: renamed from: G */
    private static final u60 f5439G = new x51(new C0252gn(21));

    /* JADX INFO: renamed from: H */
    private static final u60 f5440H = new x51(new C0252gn(22));

    /* JADX INFO: renamed from: I */
    private static final u60 f5441I = new x51(new C0252gn(23));

    /* JADX INFO: renamed from: J */
    private static final u60 f5442J = new x51(new C0252gn(24));

    /* JADX INFO: renamed from: K */
    private static final u60 f5443K = new x51(new C0252gn(25));

    /* JADX INFO: renamed from: L */
    private static final u60 f5444L = new x51(new C0252gn(26));

    /* JADX INFO: renamed from: M */
    private static final u60 f5445M = new x51(new C0252gn(27));

    /* JADX INFO: renamed from: N */
    private static final u60 f5446N = new x51(new C0252gn(28));

    /* JADX INFO: renamed from: O */
    private static final u60 f5447O = new x51(new C0252gn(29));

    /* JADX INFO: renamed from: X */
    public static final int f5456X = 8;

    /* JADX INFO: renamed from: rn$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class a {

        /* JADX INFO: renamed from: w */
        public static final int f5483w = 8;

        /* JADX INFO: renamed from: a */
        private final Class<?> f5484a;

        /* JADX INFO: renamed from: b */
        private final List<Class<?>> f5485b;

        /* JADX INFO: renamed from: c */
        private final Class<?> f5486c;

        /* JADX INFO: renamed from: d */
        private final Class<?> f5487d;

        /* JADX INFO: renamed from: e */
        private final Class<?> f5488e;

        /* JADX INFO: renamed from: f */
        private final Class<?> f5489f;

        /* JADX INFO: renamed from: g */
        private final Class<?> f5490g;

        /* JADX INFO: renamed from: h */
        private final Class<?> f5491h;

        /* JADX INFO: renamed from: i */
        private final Class<?> f5492i;

        /* JADX INFO: renamed from: j */
        private final Class<?> f5493j;

        /* JADX INFO: renamed from: k */
        private final Class<?> f5494k;

        /* JADX INFO: renamed from: l */
        private final String f5495l;

        /* JADX INFO: renamed from: m */
        private final Class<?> f5496m;

        /* JADX INFO: renamed from: n */
        private final Class<?> f5497n;

        /* JADX INFO: renamed from: o */
        private final Class<?> f5498o;

        /* JADX INFO: renamed from: p */
        private final String f5499p;

        /* JADX INFO: renamed from: q */
        private final Class<?> f5500q;

        /* JADX INFO: renamed from: r */
        private final Class<?> f5501r;

        /* JADX INFO: renamed from: s */
        private final Class<?> f5502s;

        /* JADX INFO: renamed from: t */
        private final Class<?> f5503t;

        /* JADX INFO: renamed from: u */
        private final Class<?> f5504u;

        /* JADX INFO: renamed from: v */
        private final Class<?> f5505v;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00a4: CONSTRUCTOR 
  (r27v0 java.lang.Class)
  (r28v0 java.util.List)
  (r29v0 java.lang.Class)
  (r30v0 java.lang.Class)
  (r31v0 java.lang.Class)
  (r32v0 java.lang.Class)
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0002: ARITH (r49v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r33v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x000b: ARITH (r49v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r34v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0013: ARITH (r49v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r35v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x001b: ARITH (r49v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r36v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0023: ARITH (r49v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r37v0 java.lang.Class))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r49v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0033: ARITH (r49v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r39v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x003c: ARITH (r49v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r40v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0045: ARITH (r49v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r41v0 java.lang.Class))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (32768 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r42v0 java.lang.String))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x005b: ARITH (65536 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r43v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0065: ARITH (131072 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r44v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x006f: ARITH (262144 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r45v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0079: ARITH (524288 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r46v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0083: ARITH (1048576 int) & (r49v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r47v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x008d: ARITH (r49v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Class) : (r48v0 java.lang.Class))
 A[MD:(java.lang.Class<?>, java.util.List<? extends java.lang.Class<?>>, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.String, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.String, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>):void (m)] (LINE:1) call: rn.a.<init>(java.lang.Class, java.util.List, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.String, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.String, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class, java.lang.Class):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ a(Class cls, List list, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, String str, Class cls11, Class cls12, Class cls13, String str2, Class cls14, Class cls15, Class cls16, Class cls17, Class cls18, Class cls19, int i, AbstractC0619pl abstractC0619pl) {
            this(cls, list, cls2, cls3, cls4, cls5, (i & 64) != 0 ? null : cls6, (i & 128) != 0 ? null : cls7, (i & 256) != 0 ? null : cls8, (i & 512) != 0 ? null : cls9, (i & 1024) != 0 ? null : cls10, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : cls11, (i & 8192) != 0 ? null : cls12, (i & 16384) != 0 ? null : cls13, (32768 & i) != 0 ? null : str2, (65536 & i) != 0 ? null : cls14, (131072 & i) != 0 ? null : cls15, (262144 & i) != 0 ? null : cls16, (524288 & i) != 0 ? null : cls17, (1048576 & i) != 0 ? null : cls18, (i & 2097152) != 0 ? null : cls19);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r17v0, resolved type: rn$a */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: x */
        public static /* synthetic */ a m3918x(a aVar, Class cls, List list, Class cls2, Class cls3, Class cls4, Class cls5, Class cls6, Class cls7, Class cls8, Class cls9, Class cls10, String str, Class cls11, Class cls12, Class cls13, String str2, Class cls14, Class cls15, Class cls16, Class cls17, Class cls18, Class cls19, int i, Object obj) {
            Class cls20;
            Class cls21;
            Class cls22 = (i & 1) != 0 ? aVar.f5484a : cls;
            List list2 = (i & 2) != 0 ? aVar.f5485b : list;
            Class cls23 = (i & 4) != 0 ? aVar.f5486c : cls2;
            Class cls24 = (i & 8) != 0 ? aVar.f5487d : cls3;
            Class cls25 = (i & 16) != 0 ? aVar.f5488e : cls4;
            Class cls26 = (i & 32) != 0 ? aVar.f5489f : cls5;
            Class cls27 = (i & 64) != 0 ? aVar.f5490g : cls6;
            Class cls28 = (i & 128) != 0 ? aVar.f5491h : cls7;
            Class cls29 = (i & 256) != 0 ? aVar.f5492i : cls8;
            Class cls30 = (i & 512) != 0 ? aVar.f5493j : cls9;
            Class cls31 = (i & 1024) != 0 ? aVar.f5494k : cls10;
            String str3 = (i & 2048) != 0 ? aVar.f5495l : str;
            Class cls32 = (i & 4096) != 0 ? aVar.f5496m : cls11;
            Class cls33 = (i & 8192) != 0 ? aVar.f5497n : cls12;
            Class cls34 = cls22;
            Class cls35 = (i & 16384) != 0 ? aVar.f5498o : cls13;
            String str4 = (i & 32768) != 0 ? aVar.f5499p : str2;
            Class cls36 = (i & 65536) != 0 ? aVar.f5500q : cls14;
            Class cls37 = (i & MethodData.ACC_DECLARED_SYNCHRONIZED) != 0 ? aVar.f5501r : cls15;
            Class cls38 = (i & 262144) != 0 ? aVar.f5502s : cls16;
            Class cls39 = (i & 524288) != 0 ? aVar.f5503t : cls17;
            Class cls40 = (i & 1048576) != 0 ? aVar.f5504u : cls18;
            if ((i & 2097152) != 0) {
                cls21 = cls40;
                cls20 = aVar.f5505v;
            } else {
                cls20 = cls19;
                cls21 = cls40;
            }
            return aVar.m3963w(cls34, list2, cls23, cls24, cls25, cls26, cls27, cls28, cls29, cls30, cls31, str3, cls32, cls33, cls35, str4, cls36, cls37, cls38, cls39, cls21, cls20);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: A */
        public final Class<?> m3919A() {
            return this.f5501r;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: B */
        public final int m3920B() {
            int i = this.f5484a != null ? 1 : 0;
            if (!this.f5485b.isEmpty()) {
                i++;
            }
            if (this.f5486c != null) {
                i++;
            }
            if (this.f5487d != null) {
                i++;
            }
            if (this.f5491h != null) {
                i++;
            }
            if (this.f5492i != null) {
                i++;
            }
            if (this.f5493j != null) {
                i++;
            }
            if (this.f5494k != null) {
                i++;
            }
            if (this.f5496m != null) {
                i++;
            }
            if (this.f5497n != null) {
                i++;
            }
            if (this.f5498o != null) {
                i++;
            }
            if (this.f5500q != null) {
                i++;
            }
            if (this.f5501r != null) {
                i++;
            }
            if (this.f5502s != null) {
                i++;
            }
            if (this.f5503t != null) {
                i++;
            }
            if (this.f5504u != null) {
                i++;
            }
            return this.f5505v != null ? i + 1 : i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: C */
        public final Class<?> m3921C() {
            return this.f5491h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: D */
        public final Class<?> m3922D() {
            return this.f5496m;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: E */
        public final Class<?> m3923E() {
            return this.f5487d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: F */
        public final List<Class<?>> m3924F() {
            return this.f5485b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: G */
        public final Class<?> m3925G() {
            return this.f5498o;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: H */
        public final String m3926H() {
            return this.f5499p;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: I */
        public final Class<?> m3927I() {
            return this.f5486c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: J */
        public final Class<?> m3928J() {
            return this.f5489f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: K */
        public final Class<?> m3929K() {
            return this.f5484a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: L */
        public final Class<?> m3930L() {
            return this.f5497n;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: M */
        public final Class<?> m3931M() {
            return this.f5490g;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: N */
        public final String m3932N() {
            return this.f5495l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: O */
        public final Class<?> m3933O() {
            return this.f5494k;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: P */
        public final Class<?> m3934P() {
            return this.f5504u;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: Q */
        public final Class<?> m3935Q() {
            return this.f5503t;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: R */
        public final Class<?> m3936R() {
            return this.f5505v;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: S */
        public final Class<?> m3937S() {
            return this.f5493j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: T */
        public final Class<?> m3938T() {
            return this.f5502s;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: U */
        public final int m3939U() {
            return 17;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: V */
        public final Class<?> m3940V() {
            return this.f5488e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final Class<?> m3941a() {
            return this.f5484a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final Class<?> m3942b() {
            return this.f5493j;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final Class<?> m3943c() {
            return this.f5494k;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final String m3944d() {
            return this.f5495l;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final Class<?> m3945e() {
            return this.f5496m;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p30.m3002l(this.f5484a, aVar.f5484a) && p30.m3002l(this.f5485b, aVar.f5485b) && p30.m3002l(this.f5486c, aVar.f5486c) && p30.m3002l(this.f5487d, aVar.f5487d) && p30.m3002l(this.f5488e, aVar.f5488e) && p30.m3002l(this.f5489f, aVar.f5489f) && p30.m3002l(this.f5490g, aVar.f5490g) && p30.m3002l(this.f5491h, aVar.f5491h) && p30.m3002l(this.f5492i, aVar.f5492i) && p30.m3002l(this.f5493j, aVar.f5493j) && p30.m3002l(this.f5494k, aVar.f5494k) && p30.m3002l(this.f5495l, aVar.f5495l) && p30.m3002l(this.f5496m, aVar.f5496m) && p30.m3002l(this.f5497n, aVar.f5497n) && p30.m3002l(this.f5498o, aVar.f5498o) && p30.m3002l(this.f5499p, aVar.f5499p) && p30.m3002l(this.f5500q, aVar.f5500q) && p30.m3002l(this.f5501r, aVar.f5501r) && p30.m3002l(this.f5502s, aVar.f5502s) && p30.m3002l(this.f5503t, aVar.f5503t) && p30.m3002l(this.f5504u, aVar.f5504u) && p30.m3002l(this.f5505v, aVar.f5505v);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final Class<?> m3946f() {
            return this.f5497n;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g */
        public final Class<?> m3947g() {
            return this.f5498o;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: h */
        public final String m3948h() {
            return this.f5499p;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            Class<?> cls = this.f5484a;
            int iHashCode = (this.f5485b.hashCode() + ((cls == null ? 0 : cls.hashCode()) * 31)) * 31;
            Class<?> cls2 = this.f5486c;
            int iHashCode2 = (iHashCode + (cls2 == null ? 0 : cls2.hashCode())) * 31;
            Class<?> cls3 = this.f5487d;
            int iHashCode3 = (iHashCode2 + (cls3 == null ? 0 : cls3.hashCode())) * 31;
            Class<?> cls4 = this.f5488e;
            int iHashCode4 = (iHashCode3 + (cls4 == null ? 0 : cls4.hashCode())) * 31;
            Class<?> cls5 = this.f5489f;
            int iHashCode5 = (iHashCode4 + (cls5 == null ? 0 : cls5.hashCode())) * 31;
            Class<?> cls6 = this.f5490g;
            int iHashCode6 = (iHashCode5 + (cls6 == null ? 0 : cls6.hashCode())) * 31;
            Class<?> cls7 = this.f5491h;
            int iHashCode7 = (iHashCode6 + (cls7 == null ? 0 : cls7.hashCode())) * 31;
            Class<?> cls8 = this.f5492i;
            int iHashCode8 = (iHashCode7 + (cls8 == null ? 0 : cls8.hashCode())) * 31;
            Class<?> cls9 = this.f5493j;
            int iHashCode9 = (iHashCode8 + (cls9 == null ? 0 : cls9.hashCode())) * 31;
            Class<?> cls10 = this.f5494k;
            int iHashCode10 = (iHashCode9 + (cls10 == null ? 0 : cls10.hashCode())) * 31;
            String str = this.f5495l;
            int iHashCode11 = (iHashCode10 + (str == null ? 0 : str.hashCode())) * 31;
            Class<?> cls11 = this.f5496m;
            int iHashCode12 = (iHashCode11 + (cls11 == null ? 0 : cls11.hashCode())) * 31;
            Class<?> cls12 = this.f5497n;
            int iHashCode13 = (iHashCode12 + (cls12 == null ? 0 : cls12.hashCode())) * 31;
            Class<?> cls13 = this.f5498o;
            int iHashCode14 = (iHashCode13 + (cls13 == null ? 0 : cls13.hashCode())) * 31;
            String str2 = this.f5499p;
            int iHashCode15 = (iHashCode14 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Class<?> cls14 = this.f5500q;
            int iHashCode16 = (iHashCode15 + (cls14 == null ? 0 : cls14.hashCode())) * 31;
            Class<?> cls15 = this.f5501r;
            int iHashCode17 = (iHashCode16 + (cls15 == null ? 0 : cls15.hashCode())) * 31;
            Class<?> cls16 = this.f5502s;
            int iHashCode18 = (iHashCode17 + (cls16 == null ? 0 : cls16.hashCode())) * 31;
            Class<?> cls17 = this.f5503t;
            int iHashCode19 = (iHashCode18 + (cls17 == null ? 0 : cls17.hashCode())) * 31;
            Class<?> cls18 = this.f5504u;
            int iHashCode20 = (iHashCode19 + (cls18 == null ? 0 : cls18.hashCode())) * 31;
            Class<?> cls19 = this.f5505v;
            return iHashCode20 + (cls19 != null ? cls19.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: i */
        public final Class<?> m3949i() {
            return this.f5500q;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: j */
        public final Class<?> m3950j() {
            return this.f5501r;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: k */
        public final Class<?> m3951k() {
            return this.f5502s;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: l */
        public final List<Class<?>> m3952l() {
            return this.f5485b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: m */
        public final Class<?> m3953m() {
            return this.f5503t;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: n */
        public final Class<?> m3954n() {
            return this.f5504u;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: o */
        public final Class<?> m3955o() {
            return this.f5505v;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: p */
        public final Class<?> m3956p() {
            return this.f5486c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: q */
        public final Class<?> m3957q() {
            return this.f5487d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: r */
        public final Class<?> m3958r() {
            return this.f5488e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: s */
        public final Class<?> m3959s() {
            return this.f5489f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: t */
        public final Class<?> m3960t() {
            return this.f5490g;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "FoundClasses(noteDetailActivity=" + this.f5484a + ", imageLongClickHandlers=" + this.f5485b + ", longPressDialog=" + this.f5486c + ", imageBean=" + this.f5487d + ", videoNoteController=" + this.f5488e + ", menuBuilder=" + this.f5489f + ", playVideoEntry=" + this.f5490g + ", homeNavigationView=" + this.f5491h + ", commentMediaFeedController=" + this.f5492i + ", shareSpiProxyImpl=" + this.f5493j + ", profilePageFragment=" + this.f5494k + ", profileOnCreateViewMethodName=" + this.f5495l + ", homeTabView=" + this.f5496m + ", oliveCreatorImpl=" + this.f5497n + ", leftEntranceConfigClass=" + this.f5498o + ", leftEntranceConfigMethod=" + this.f5499p + ", commentPictureInfo=" + this.f5500q + ", commentVideoInfo=" + this.f5501r + ", sidebarDynamicData=" + this.f5502s + ", settingNewBean=" + this.f5503t + ", settingEnumType=" + this.f5504u + ", settingTrackData=" + this.f5505v + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: u */
        public final Class<?> m3961u() {
            return this.f5491h;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: v */
        public final Class<?> m3962v() {
            return this.f5492i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: w */
        public final a m3963w(Class<?> cls, List<? extends Class<?>> list, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Class<?> cls8, Class<?> cls9, Class<?> cls10, String str, Class<?> cls11, Class<?> cls12, Class<?> cls13, String str2, Class<?> cls14, Class<?> cls15, Class<?> cls16, Class<?> cls17, Class<?> cls18, Class<?> cls19) {
            list.getClass();
            return new a(cls, list, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9, cls10, str, cls11, cls12, cls13, str2, cls14, cls15, cls16, cls17, cls18, cls19);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: y */
        public final Class<?> m3964y() {
            return this.f5492i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: z */
        public final Class<?> m3965z() {
            return this.f5500q;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.lang.Class<?>> */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Class<?> cls, List<? extends Class<?>> list, Class<?> cls2, Class<?> cls3, Class<?> cls4, Class<?> cls5, Class<?> cls6, Class<?> cls7, Class<?> cls8, Class<?> cls9, Class<?> cls10, String str, Class<?> cls11, Class<?> cls12, Class<?> cls13, String str2, Class<?> cls14, Class<?> cls15, Class<?> cls16, Class<?> cls17, Class<?> cls18, Class<?> cls19) {
            list.getClass();
            this.f5484a = cls;
            this.f5485b = list;
            this.f5486c = cls2;
            this.f5487d = cls3;
            this.f5488e = cls4;
            this.f5489f = cls5;
            this.f5490g = cls6;
            this.f5491h = cls7;
            this.f5492i = cls8;
            this.f5493j = cls9;
            this.f5494k = cls10;
            this.f5495l = str;
            this.f5496m = cls11;
            this.f5497n = cls12;
            this.f5498o = cls13;
            this.f5499p = str2;
            this.f5500q = cls14;
            this.f5501r = cls15;
            this.f5502s = cls16;
            this.f5503t = cls17;
            this.f5504u = cls18;
            this.f5505v = cls19;
        }
    }

    /* JADX INFO: renamed from: rn$b */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f5506a;

        /* JADX INFO: renamed from: b */
        private final int f5507b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(String str, int i) {
            str.getClass();
            this.f5506a = str;
            this.f5507b = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ b m3966d(b bVar, String str, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = bVar.f5506a;
            }
            if ((i2 & 2) != 0) {
                i = bVar.f5507b;
            }
            return bVar.m3969c(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final String m3967a() {
            return this.f5506a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final int m3968b() {
            return this.f5507b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final b m3969c(String str, int i) {
            str.getClass();
            return new b(str, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final int m3970e() {
            return this.f5507b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p30.m3002l(this.f5506a, bVar.f5506a) && this.f5507b == bVar.f5507b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final String m3971f() {
            return this.f5506a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return Integer.hashCode(this.f5507b) + (this.f5506a.hashCode() * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "M(name=" + this.f5506a + ", count=" + this.f5507b + ")";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        final int i = 15;
        f5458b = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i2 = 26;
        f5459c = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i3 = 0;
        f5461e = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i4 = 9;
        f5462f = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i5 = 10;
        f5463g = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i6 = 11;
        f5464h = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i7 = 12;
        f5465i = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i8 = 13;
        f5466j = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i9 = 14;
        f5467k = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i10 = 16;
        f5468l = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i11 = 17;
        f5469m = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i12 = 18;
        f5470n = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i13 = 19;
        f5471o = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i14 = 20;
        f5472p = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i15 = 21;
        f5473q = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i16 = 22;
        f5474r = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i17 = 23;
        f5475s = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i17) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i18 = 24;
        f5476t = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i18) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i19 = 25;
        f5477u = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i19) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i20 = 27;
        f5478v = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i20) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i21 = 28;
        f5479w = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i22 = 29;
        f5480x = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i23 = 1;
        f5448P = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i23) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i24 = 2;
        f5449Q = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i24) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i25 = 3;
        f5450R = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i25) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i26 = 4;
        f5451S = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i26) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i27 = 5;
        f5452T = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i27) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i28 = 6;
        f5453U = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i28) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i29 = 7;
        f5454V = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i29) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
        final int i30 = 8;
        f5455W = new x51(new InterfaceC0298hw() { // from class: kn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                switch (i30) {
                    case 0:
                        return C0695rn.m3728c2();
                    case 1:
                        return C0695rn.m3855s2();
                    case 2:
                        return C0695rn.m3871u2();
                    case 3:
                        return C0695rn.m3840q2();
                    case 4:
                        return C0695rn.m3848r2();
                    case 5:
                        return C0695rn.m3685W2();
                    case 6:
                        return C0695rn.m3863t2();
                    case 7:
                        return C0695rn.m3879v2();
                    case 8:
                        return C0695rn.m3678V2();
                    case 9:
                        return C0695rn.m3692X2();
                    case 10:
                        return C0695rn.m3671U2();
                    case 11:
                        return C0695rn.m3664T2();
                    case 12:
                        return C0695rn.m3792k2();
                    case 13:
                        return C0695rn.m3760g2();
                    case 14:
                        return C0695rn.m3537C2();
                    case j50.f2734e /* 15 */:
                        return C0695rn.m3744e2();
                    case 16:
                        return C0695rn.m3553E2();
                    case 17:
                        return C0695rn.m3902y2();
                    case 18:
                        return C0695rn.m3545D2();
                    case 19:
                        return C0695rn.m3910z2();
                    case 20:
                        return C0695rn.m3832p2();
                    case 21:
                        return C0695rn.m3569G2();
                    case 22:
                        return C0695rn.m3824o2();
                    case 23:
                        return C0695rn.m3816n2();
                    case 24:
                        return C0695rn.m3615M2();
                    case 25:
                        return C0695rn.m3894x2();
                    case 26:
                        return C0695rn.m3752f2();
                    case 27:
                        return C0695rn.m3529B2();
                    case 28:
                        return C0695rn.m3521A2();
                    default:
                        return C0695rn.m3636P2();
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private C0695rn() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final String m3521A2() {
        return ik0.f2579a.m1592a(46, 22, 17, 83, 39, 29, 35, 89, 42, 10, 21, 101, 36, 60, 25, 80, 37, 60, 25, 80, 37, 57, 0, 65);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A3 */
    public static final na1 m3522A3(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName("setTabName");
        methodMatcher.setParamCount(1);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public static final na1 m3523A4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.methods(new C0480mn(8));
        C0695rn c0695rn = f5457a;
        classMatcher.setUsingStrings(o30.m2783w(c0695rn.m3716a6(), c0695rn.m3674U5()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A5 */
    private final String m3524A5() {
        return (String) f5458b.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A6 */
    private final Class<?> m3525A6(List<ClassData> list, ClassLoader classLoader) {
        try {
            ClassData classData = (ClassData) AbstractC0960ye.m5241K(list);
            if (classData != null) {
                return classData.getInstance(classLoader);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final String m3529B2() {
        return ik0.f2579a.m1592a(40, 23, 29, 31, 51, 17, 30, 86, 34, 22, 94, 73, 35, 11, 94, 89, 36, 21, 21, 65, 42, 31, 21, 31, 56, 8, 25, 31, 3, 23, 29, 84, 5, 25, 6, 88, 44, 25, 4, 88, 36, 22, 57, 92, 59, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B3 */
    public static final na1 m3530B3(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName("getAnimationView");
        methodMatcher.setParamCount(0);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public static final na1 m3531B4(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        methodsMatcher.add(new C0621pn(5));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B5 */
    private final String m3532B5() {
        return (String) f5459c.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B6 */
    private final Class<?> m3533B6(DexKitBridge dexKitBridge, ClassLoader classLoader, b bVar, b bVar2, b bVar3) {
        Iterator<ClassData> it = dexKitBridge.findClass(new C0361jn(bVar3, bVar, bVar2, 2)).iterator();
        it.getClass();
        while (it.hasNext()) {
            ClassData next = it.next();
            next.getClass();
            Class<?> clsM3914z6 = m3914z6(next, classLoader);
            if (clsM3914z6 != null) {
                try {
                    if (m3597J6(clsM3914z6)) {
                        return clsM3914z6;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public static final String m3537C2() {
        return ik0.f2579a.m1592a(2, 21, 17, 86, 46, 52, 31, 95, 44, 59, 28, 88, 40, 19, 88, 67, 46, 27, 9, 82, 39, 29, 2, 103, 34, 29, 7, 12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C3 */
    private final Class<?> m3538C3(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        ClassDataList classDataListFindClass = dexKitBridge.findClass(new C0881w9(28));
        ClassData classDataFirstOrNull = classDataListFindClass.firstOrNull(new C0480mn(0));
        return classDataFirstOrNull != null ? f5457a.m3914z6(classDataFirstOrNull, classLoader) : m3525A6(classDataListFindClass, classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C4 */
    public static final na1 m3539C4(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        C0695rn c0695rn = f5457a;
        methodMatcher.setName(c0695rn.m3572G5());
        methodMatcher.setParamTypes(o30.m2782v(c0695rn.m3836p6()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C5 */
    private final String m3540C5() {
        return (String) f5466j.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C6 */
    public static /* synthetic */ Class m3541C6(C0695rn c0695rn, DexKitBridge dexKitBridge, ClassLoader classLoader, b bVar, b bVar2, b bVar3, int i, Object obj) {
        if ((i & 16) != 0) {
            bVar3 = null;
        }
        return c0695rn.m3533B6(dexKitBridge, classLoader, bVar, bVar2, bVar3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final String m3545D2() {
        return ik0.f2579a.m1592a(7, 23, 30, 86, 27, 10, 21, 66, 56);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public static final na1 m3546D3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0621pn(21));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D4 */
    public static final boolean m3547D4(ClassData classData) {
        classData.getClass();
        String simpleName = classData.getSimpleName();
        C0695rn c0695rn = f5457a;
        return k41.m1764V(simpleName, c0695rn.m3604K5(), true) && k41.m1764V(classData.getSimpleName(), c0695rn.m3596J5(), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D5 */
    private final String m3548D5() {
        return (String) f5445M.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D6 */
    public static final na1 m3549D6(b bVar, b bVar2, b bVar3, FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0361jn(bVar, bVar2, bVar3, 1));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E2 */
    public static final String m3553E2() {
        return ik0.f2579a.m1592a(37, 23, 4, 84);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public static final na1 m3554E3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.fields(new C0518nn(10));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E4 */
    private final Class<?> m3555E4(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        return m3525A6(dexKitBridge.findClass(new C0480mn(28)), classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E5 */
    private final String m3556E5() {
        return (String) f5447O.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E6 */
    public static final na1 m3557E6(b bVar, b bVar2, b bVar3, ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.methods(new C0361jn(bVar, bVar2, bVar3, 0));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final String m3561F2() {
        return ik0.f2579a.m1592a(56, 17, 20, 84, 41, 25, 2, 110, 57, 23, 31, 92);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public static final na1 m3562F3(FieldsMatcher fieldsMatcher) {
        fieldsMatcher.getClass();
        fieldsMatcher.add(new C0480mn(13));
        fieldsMatcher.add(new C0480mn(14));
        fieldsMatcher.add(new C0480mn(15));
        fieldsMatcher.add(new C0480mn(16));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public static final na1 m3563F4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(21));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F5 */
    private final String m3564F5() {
        return (String) f5446N.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F6 */
    public static final na1 m3565F6(final b bVar, final b bVar2, final b bVar3, MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        final int i = 0;
        methodsMatcher.add(new InterfaceC0742sw() { // from class: ln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                int i2 = i;
                C0695rn.b bVar4 = bVar2;
                MethodMatcher methodMatcher = (MethodMatcher) obj;
                switch (i2) {
                    case 0:
                        return C0695rn.m3573G6(bVar4, methodMatcher);
                    case 1:
                        return C0695rn.m3581H6(bVar4, methodMatcher);
                    default:
                        return C0695rn.m3589I6(bVar4, methodMatcher);
                }
            }
        });
        final int i2 = 1;
        methodsMatcher.add(new InterfaceC0742sw() { // from class: ln
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                int i22 = i2;
                C0695rn.b bVar4 = bVar3;
                MethodMatcher methodMatcher = (MethodMatcher) obj;
                switch (i22) {
                    case 0:
                        return C0695rn.m3573G6(bVar4, methodMatcher);
                    case 1:
                        return C0695rn.m3581H6(bVar4, methodMatcher);
                    default:
                        return C0695rn.m3589I6(bVar4, methodMatcher);
                }
            }
        });
        if (bVar != null) {
            final int i3 = 2;
            methodsMatcher.add(new InterfaceC0742sw() { // from class: ln
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p000.InterfaceC0742sw
                public final Object invoke(Object obj) {
                    int i22 = i3;
                    C0695rn.b bVar4 = bVar;
                    MethodMatcher methodMatcher = (MethodMatcher) obj;
                    switch (i22) {
                        case 0:
                            return C0695rn.m3573G6(bVar4, methodMatcher);
                        case 1:
                            return C0695rn.m3581H6(bVar4, methodMatcher);
                        default:
                            return C0695rn.m3589I6(bVar4, methodMatcher);
                    }
                }
            });
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public static final String m3569G2() {
        return ik0.f2579a.m1592a(40, 23, 29, 31, 51, 17, 30, 86, 34, 22, 94, 87, 36, 13, 30, 85, 42, 12, 25, 94, 37, 86, 19, 94, 57, 29, 94, 71, 121, 86, 20, 88, 42, 20, 31, 86, 101, 52, 51, 115, 9, 23, 4, 69, 36, 21, 35, 89, 46, 29, 4, 117, 34, 25, 28, 94, 44);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G3 */
    public static final na1 m3570G3(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        C0695rn c0695rn = f5457a;
        fieldMatcher.setName(c0695rn.m3524A5());
        fieldMatcher.setType(c0695rn.m3867t6());
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G4 */
    public static final na1 m3571G4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.methods(new C0621pn(10));
        classMatcher.setUsingStrings(o30.m2782v("oplus_8388608"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G5 */
    private final String m3572G5() {
        return (String) f5465i.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G6 */
    public static final na1 m3573G6(b bVar, MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName(bVar.m3971f());
        methodMatcher.setParamCount(bVar.m3970e());
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H2 */
    public static final String m3577H2() {
        return ik0.f2579a.m1592a(40, 23, 29, 31, 44, 23, 31, 86, 39, 29, 94, 80, 37, 28, 2, 94, 34, 28, 94, 92, 42, 12, 21, 67, 34, 25, 28, 31, 37, 25, 6, 88, 44, 25, 4, 88, 36, 22, 94, 127, 42, 14, 25, 86, 42, 12, 25, 94, 37, 46, 25, 84, 60);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H3 */
    public static final na1 m3578H3(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        C0695rn c0695rn = f5457a;
        fieldMatcher.setName(c0695rn.m3532B5());
        fieldMatcher.setType(c0695rn.m3844q6());
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H4 */
    public static final na1 m3579H4(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        methodsMatcher.add(new C0621pn(12));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H5 */
    private final String m3580H5() {
        return (String) f5444L.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H6 */
    public static final na1 m3581H6(b bVar, MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName(bVar.m3971f());
        methodMatcher.setParamCount(bVar.m3970e());
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final String m3585I2() {
        return ik0.f2579a.m1592a(42);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I3 */
    public static final na1 m3586I3(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        C0695rn c0695rn = f5457a;
        fieldMatcher.setName(c0695rn.m3913z5());
        fieldMatcher.setType(c0695rn.m3844q6());
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I4 */
    public static final na1 m3587I4(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName("setVideoData");
        methodMatcher.setParamCount(5);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I5 */
    private final String m3588I5() {
        return (String) f5443K.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I6 */
    public static final na1 m3589I6(b bVar, MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName(bVar.m3971f());
        methodMatcher.setParamCount(bVar.m3970e());
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final String m3593J2() {
        return ik0.f2579a.m1592a(41);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J3 */
    public static final na1 m3594J3(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        C0695rn c0695rn = f5457a;
        fieldMatcher.setName(c0695rn.m3905y5());
        fieldMatcher.setType(c0695rn.m3867t6());
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J4 */
    private final String m3595J4(Class<?> cls) {
        C0822v c0822vM1933s = AbstractC0398kl.m1933s(cls.getDeclaredMethods());
        while (c0822vM1933s.hasNext()) {
            Method method = (Method) c0822vM1933s.next();
            if (method.getParameterTypes().length == 2) {
                return method.getName();
            }
        }
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            C0822v c0822vM1933s2 = AbstractC0398kl.m1933s(superclass.getDeclaredMethods());
            while (c0822vM1933s2.hasNext()) {
                Method method2 = (Method) c0822vM1933s2.next();
                if (method2.getParameterTypes().length == 2) {
                    return method2.getName();
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J5 */
    private final String m3596J5() {
        return (String) f5475s.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J6 */
    private final boolean m3597J6(Class<?> cls) {
        if (m3906y6(cls)) {
            return m3883v6(cls, m3828o6()) || m3883v6(cls, m3820n6()) || m3883v6(cls, m3812m6());
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K2 */
    public static final String m3601K2() {
        return ik0.f2579a.m1592a(0, 65);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K3 */
    public static final boolean m3602K3(ClassData classData) {
        classData.getClass();
        return p30.m3002l(classData.getSimpleName(), f5457a.m3780i6());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K4 */
    private final uo0 m3603K4(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        String strM3595J4;
        try {
            Class<?> clsLoadClass = classLoader.loadClass("com.xingin.matrix.v3.profile.page.ProfilePageV3Fragment");
            clsLoadClass.getClass();
            String strM3595J42 = m3595J4(clsLoadClass);
            if (strM3595J42 != null) {
                return new uo0(clsLoadClass, strM3595J42);
            }
        } catch (Exception unused) {
        }
        Iterator<ClassData> it = dexKitBridge.findClass(new C0621pn(18)).iterator();
        it.getClass();
        while (it.hasNext()) {
            ClassData next = it.next();
            next.getClass();
            Class<?> clsM3914z6 = m3914z6(next, classLoader);
            if (clsM3914z6 != null && (strM3595J4 = m3595J4(clsM3914z6)) != null) {
                return new uo0(clsM3914z6, strM3595J4);
            }
        }
        return new uo0(null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K5 */
    private final String m3604K5() {
        return (String) f5474r.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final String m3608L2() {
        return ik0.f2579a.m1592a(2, 65);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x00be, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: L3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List<Class<?>> m3609L3(DexKitBridge dexKitBridge, ClassLoader classLoader, Class<?> cls) {
        Constructor<?> constructor;
        Iterator<ClassData> it = dexKitBridge.findClass(new C0881w9(10)).iterator();
        it.getClass();
        while (it.hasNext()) {
            ClassData next = it.next();
            next.getClass();
            Class<?> clsM3914z6 = m3914z6(next, classLoader);
            if (clsM3914z6 != null) {
                Constructor<?>[] constructors = clsM3914z6.getConstructors();
                constructors.getClass();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 7) {
                        break;
                    }
                    i++;
                }
                if (constructor != null) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    parameterTypes.getClass();
                    Class cls2 = (Class) AbstractC0201f9.m1065k0(0, parameterTypes);
                    if (!k41.m1764V(cls2 != null ? cls2.getSimpleName() : "", "RecyclerView", false)) {
                        continue;
                    } else {
                        if (cls == null) {
                            return o30.m2782v(clsM3914z6);
                        }
                        Class<?>[] parameterTypes2 = constructor.getParameterTypes();
                        parameterTypes2.getClass();
                        Class cls3 = (Class) AbstractC0201f9.m1065k0(1, parameterTypes2);
                        if (p30.m3002l(cls3 != null ? cls3.getName() : null, cls.getName())) {
                            return o30.m2782v(clsM3914z6);
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        Iterator<ClassData> it2 = dexKitBridge.findClass(new C0480mn(12)).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            ClassData next2 = it2.next();
            next2.getClass();
            Class<?> clsM3914z62 = m3914z6(next2, classLoader);
            if (clsM3914z62 != null) {
                C0822v c0822vM1933s = AbstractC0398kl.m1933s(clsM3914z62.getConstructors());
                while (c0822vM1933s.hasNext()) {
                    Constructor constructor2 = (Constructor) c0822vM1933s.next();
                    Class<?>[] parameterTypes3 = constructor2.getParameterTypes();
                    parameterTypes3.getClass();
                    ArrayList arrayList = new ArrayList(parameterTypes3.length);
                    for (Class<?> cls4 : parameterTypes3) {
                        arrayList.add(cls4.getSimpleName());
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it3 = arrayList.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                String str = (String) it3.next();
                                str.getClass();
                                if (k41.m1764V(str, "RecyclerView", false)) {
                                    if (cls != null) {
                                        Class<?>[] parameterTypes4 = constructor2.getParameterTypes();
                                        parameterTypes4.getClass();
                                        for (Class<?> cls5 : parameterTypes4) {
                                            if (cls5.getName().equals(cls.getName())) {
                                                return o30.m2782v(clsM3914z62);
                                            }
                                        }
                                    } else if (arrayList.isEmpty()) {
                                        continue;
                                    } else {
                                        Iterator it4 = arrayList.iterator();
                                        while (it4.hasNext()) {
                                            if (p30.m3002l((String) it4.next(), f5457a.m3780i6())) {
                                                return o30.m2782v(clsM3914z62);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return C0294hs.f2354d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L4 */
    public static final na1 m3610L4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0621pn(15));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L5 */
    private final String m3611L5() {
        return (String) f5472p.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final String m3615M2() {
        return ik0.f2579a.m1592a(2, 21, 17, 86, 46, 58, 21, 80, 37);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M3 */
    public static final na1 m3616M3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(2));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M4 */
    public static final na1 m3617M4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.fields(new C0518nn(14));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M5 */
    private final String m3618M5() {
        return (String) f5450R.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N2 */
    public static final String m3622N2() {
        return ik0.f2579a.m1592a(5, 65);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public static final na1 m3623N3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.methods(new C0518nn(12));
        classMatcher.setUsingStrings(o30.m2782v(f5457a.m3701Y5()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N4 */
    public static final na1 m3624N4(FieldsMatcher fieldsMatcher) {
        fieldsMatcher.getClass();
        fieldsMatcher.add(new C0518nn(19));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N5 */
    private final String m3625N5() {
        return (String) f5451S.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public static final String m3629O2() {
        return ik0.f2579a.m1592a(40, 23, 29, 31, 51, 17, 30, 86, 34, 22, 94, 84, 37, 12, 25, 69, 34, 29, 3, 31, 37, 23, 4, 84, 47, 29, 4, 80, 34, 20, 94, 127, 36, 12, 21, 119, 46, 29, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O3 */
    public static final na1 m3630O3(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        methodsMatcher.add(new C0518nn(29));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O4 */
    public static final na1 m3631O4(FieldMatcher fieldMatcher) {
        fieldMatcher.getClass();
        fieldMatcher.setType(f5457a.m3851r6());
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O5 */
    private final String m3632O5() {
        return (String) f5448P.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final String m3636P2() {
        return ik0.f2579a.m1592a(36, 22, 34, 84, 56, 13, 29, 84);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P3 */
    public static final na1 m3637P3(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName(f5457a.m3540C5());
        methodMatcher.setParamCount(7);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P4 */
    private final Class<?> m3638P4(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Class<?> clsLoadClass;
        Class<?> cls;
        Method method;
        int i;
        int i2;
        try {
            clsLoadClass = classLoader.loadClass("com.xingin.android.xhscomm.router.RouterMapping_auto_update.1");
        } catch (Throwable unused) {
            clsLoadClass = null;
        }
        Class cls2 = Integer.TYPE;
        int i3 = 2;
        int i4 = 3;
        int i5 = 1;
        if (clsLoadClass != null) {
            try {
                Method[] declaredMethods = clsLoadClass.getDeclaredMethods();
                declaredMethods.getClass();
                int length = declaredMethods.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        cls = null;
                        method = null;
                        break;
                    }
                    try {
                        method = declaredMethods[i6];
                        cls = null;
                        try {
                            if (p30.m3002l(method.getName(), "invoke")) {
                                break;
                            }
                            i6++;
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable unused3) {
                        cls = null;
                    }
                }
                if (method != null) {
                    Iterator<ClassData> it = dexKitBridge.findClass(new C0621pn(i5)).iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        ClassData next = it.next();
                        next.getClass();
                        Class<?> clsM3914z6 = m3914z6(next, classLoader);
                        if (clsM3914z6 != null) {
                            try {
                                Method[] declaredMethods2 = clsM3914z6.getDeclaredMethods();
                                declaredMethods2.getClass();
                                int length2 = declaredMethods2.length;
                                int i7 = 0;
                                while (i7 < length2) {
                                    Method method2 = declaredMethods2[i7];
                                    if (Modifier.isStatic(method2.getModifiers())) {
                                        i2 = i5;
                                        try {
                                            if (method2.getParameterTypes().length == 3 && p30.m3002l(method2.getParameterTypes()[0], Context.class) && p30.m3002l(method2.getParameterTypes()[i2], Bundle.class) && p30.m3002l(method2.getParameterTypes()[2], cls2)) {
                                                return clsM3914z6;
                                            }
                                        } catch (Throwable unused4) {
                                            i5 = i2;
                                        }
                                    } else {
                                        i2 = i5;
                                    }
                                    i7++;
                                    i5 = i2;
                                }
                            } catch (Throwable unused5) {
                                i2 = i5;
                            }
                        }
                    }
                }
                i = i5;
            } catch (Throwable unused6) {
                i = 1;
                cls = null;
            }
        } else {
            i = 1;
            cls = null;
        }
        Iterator<ClassData> it2 = dexKitBridge.findClass(new C0621pn(i3)).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            ClassData next2 = it2.next();
            next2.getClass();
            Class<?> clsM3914z62 = m3914z6(next2, classLoader);
            if (clsM3914z62 != null) {
                try {
                    Method[] declaredMethods3 = clsM3914z62.getDeclaredMethods();
                    declaredMethods3.getClass();
                    for (Method method3 : declaredMethods3) {
                        if (method3.getParameterTypes().length == 3 && p30.m3002l(method3.getParameterTypes()[0], Context.class) && p30.m3002l(method3.getParameterTypes()[i], Bundle.class) && p30.m3002l(method3.getParameterTypes()[2], cls2)) {
                            return clsM3914z62;
                        }
                    }
                } catch (Throwable unused7) {
                    continue;
                }
            }
        }
        Iterator<ClassData> it3 = dexKitBridge.findClass(new C0621pn(i4)).iterator();
        it3.getClass();
        while (it3.hasNext()) {
            ClassData next3 = it3.next();
            next3.getClass();
            Class<?> clsM3914z63 = m3914z6(next3, classLoader);
            if (clsM3914z63 != null) {
                try {
                    Method[] declaredMethods4 = clsM3914z63.getDeclaredMethods();
                    declaredMethods4.getClass();
                    for (Method method4 : declaredMethods4) {
                        if (method4.getParameterTypes().length == 3 && p30.m3002l(method4.getParameterTypes()[0], Context.class) && p30.m3002l(method4.getParameterTypes()[i], Bundle.class)) {
                            return clsM3914z63;
                        }
                    }
                } catch (Throwable unused8) {
                    continue;
                }
            }
        }
        Iterator<ClassData> it4 = dexKitBridge.findClass(new C0621pn(4)).iterator();
        it4.getClass();
        while (it4.hasNext()) {
            ClassData next4 = it4.next();
            next4.getClass();
            Class<?> clsM3914z64 = m3914z6(next4, classLoader);
            if (clsM3914z64 != null) {
                try {
                    Method[] declaredMethods5 = clsM3914z64.getDeclaredMethods();
                    declaredMethods5.getClass();
                    for (Method method5 : declaredMethods5) {
                        if (Modifier.isStatic(method5.getModifiers()) && method5.getParameterTypes().length == 3 && p30.m3002l(method5.getParameterTypes()[0], Context.class) && p30.m3002l(method5.getParameterTypes()[i], Bundle.class)) {
                            return clsM3914z64;
                        }
                    }
                } catch (Throwable unused9) {
                    continue;
                }
            }
        }
        return cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P5 */
    private final String m3639P5() {
        return (String) f5453U.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final String m3643Q2() {
        return ik0.f2579a.m1592a(27, 74);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q3 */
    public static final na1 m3644Q3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(6));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q4 */
    public static final na1 m3645Q4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0518nn(24));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q5 */
    private final String m3646Q5() {
        return (String) f5449Q.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public static final String m3650R2() {
        return ik0.f2579a.m1592a(27, 65);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R3 */
    public static final na1 m3651R3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v(f5457a.m3701Y5()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public static final na1 m3652R4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.methods(new C0480mn(25));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R5 */
    private final String m3653R5() {
        return (String) f5454V.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public static final String m3657S2() {
        return ik0.f2579a.m1592a(26, 65);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0037, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: S3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final uo0 m3658S3(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Collection callers;
        int i = 0;
        Iterator<ClassData> it = dexKitBridge.findClass(new C0518nn(i)).iterator();
        it.getClass();
        while (it.hasNext()) {
            ClassData next = it.next();
            next.getClass();
            ClassData classData = next;
            Class<?> clsM3914z6 = m3914z6(classData, classLoader);
            if (clsM3914z6 != null) {
                Iterator<MethodData> it2 = dexKitBridge.findMethod(new C0557on(classData, i)).iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    MethodData next2 = it2.next();
                    next2.getClass();
                    MethodData methodData = next2;
                    try {
                        callers = methodData.getCallers();
                    } catch (Exception unused) {
                        callers = C0294hs.f2354d;
                    }
                    if (callers == null || !callers.isEmpty()) {
                        Iterator it3 = callers.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                MethodData methodData2 = (MethodData) it3.next();
                                String className = methodData2.getClassName();
                                C0695rn c0695rn = f5457a;
                                if (p30.m3002l(className, c0695rn.m3695X5()) && p30.m3002l(methodData2.getName(), c0695rn.m3688W5())) {
                                    try {
                                        Class<?> returnType = methodData.getMethodInstance(classLoader).getReturnType();
                                        Class cls = Boolean.TYPE;
                                        if (p30.m3002l(returnType, cls) || p30.m3002l(returnType, cls)) {
                                            return new uo0(clsM3914z6, methodData.getName());
                                        }
                                    } catch (Exception unused2) {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return new uo0(null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public static final na1 m3659S4(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        methodsMatcher.add(new C0518nn(8));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S5 */
    private final String m3660S5() {
        return (String) f5440H.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T2 */
    public static final String m3664T2() {
        return ik0.f2579a.m1592a(42, 22, 20, 67, 36, 17, 20, 31, 36, 11, 94, 115, 62, 22, 20, 93, 46);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public static final na1 m3665T3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0621pn(13));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T4 */
    public static final na1 m3666T4(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setParamTypes(o30.m2783w("android.content.Context", "android.os.Bundle", "int"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T5 */
    private final String m3667T5() {
        return (String) f5477u.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public static final String m3671U2() {
        return ik0.f2579a.m1592a(34, 22, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public static final na1 m3672U3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.addAnnotation(new C0621pn(6));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U4 */
    public static final na1 m3673U4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(22));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U5 */
    private final String m3674U5() {
        return (String) f5469m.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public static final String m3678V2() {
        return ik0.f2579a.m1592a(40, 23, 29, 31, 51, 17, 30, 86, 34, 22, 94, 92, 42, 4, 2, 88, 51, 86, 5, 69, 34, 20, 3, 31, 27, 6, 31, 87, 34, 20, 21, 125, 34, 22, 21, 82, 54, 27, 20, 84, 15, 29, 20, 84, 40, 25, 4, 84);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public static final na1 m3679V3(AnnotationMatcher annotationMatcher) {
        annotationMatcher.getClass();
        annotationMatcher.setType("kotlin.Deprecated");
        annotationMatcher.addElement(new C0881w9(13));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V4 */
    public static final na1 m3680V4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v("auto_update"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V5 */
    private final String m3681V5() {
        return (String) f5471o.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public static final String m3685W2() {
        return ik0.f2579a.m1592a(40, 23, 29, 31, 51, 17, 30, 86, 34, 22, 94, 66, 35, 25, 2, 84, 56, 28, 27, 31, 56, 8, 25, 31, 24, 16, 17, 67, 46, 43, 0, 88, 27, 10, 31, 73, 50, 49, 29, 65, 39);
    }

    /* JADX DEBUG: Class process forced to load method for inline: org.luckypray.dexkit.query.matchers.AnnotationElementMatcher.stringValue$default(org.luckypray.dexkit.query.matchers.AnnotationElementMatcher, java.lang.String, org.luckypray.dexkit.query.enums.StringMatchType, boolean, int, java.lang.Object):org.luckypray.dexkit.query.matchers.AnnotationElementMatcher */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W3 */
    public static final na1 m3686W3(AnnotationElementMatcher annotationElementMatcher) {
        annotationElementMatcher.getClass();
        annotationElementMatcher.setName("message");
        AnnotationElementMatcher.stringValue$default(annotationElementMatcher, f5457a.m3667T5(), null, false, 6, null);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public static final na1 m3687W4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(24));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W5 */
    private final String m3688W5() {
        return (String) f5479w.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public static final String m3692X2() {
        return ik0.f2579a.m1592a(33, 25, 6, 80, 101, 20, 17, 95, 44, 86, 35, 69, 57, 17, 30, 86);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public static final na1 m3693X3(ClassData classData, FindMethod findMethod) {
        findMethod.getClass();
        findMethod.matcher(new C0557on(classData, 1));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public static final na1 m3694X4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v("routers"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X5 */
    private final String m3695X5() {
        return (String) f5478v.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y3 */
    public static final na1 m3699Y3(ClassData classData, MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setDeclaredClass(classData.getName());
        methodMatcher.setParamCount(0);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y4 */
    public static final na1 m3700Y4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0621pn(17));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y5 */
    private final String m3701Y5() {
        return (String) f5467k.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z2 */
    private final Class<?> m3705Z2(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Iterator<ClassData> it = dexKitBridge.findClass(new C0518nn(4)).iterator();
        it.getClass();
        while (it.hasNext()) {
            ClassData next = it.next();
            next.getClass();
            Class<?> clsM3914z6 = m3914z6(next, classLoader);
            if (clsM3914z6 != null && !clsM3914z6.isInterface() && m3875u6(clsM3914z6) && m3916r4(clsM3914z6) != null) {
                return clsM3914z6;
            }
        }
        Iterator<ClassData> it2 = dexKitBridge.findClass(new C0518nn(5)).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            ClassData next2 = it2.next();
            next2.getClass();
            Class<?> clsM3914z62 = m3914z6(next2, classLoader);
            if (clsM3914z62 != null && !clsM3914z62.isInterface() && m3916r4(clsM3914z62) != null) {
                return clsM3914z62;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z3 */
    private final Class<?> m3706Z3(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        ClassData classDataFirstOrNull = dexKitBridge.findClass(new C0518nn(21)).firstOrNull(new C0518nn(22));
        if (classDataFirstOrNull != null) {
            return f5457a.m3914z6(classDataFirstOrNull, classLoader);
        }
        ClassData classDataFirstOrNull2 = dexKitBridge.findClass(new C0518nn(23)).firstOrNull(new C0518nn(25));
        if (classDataFirstOrNull2 != null) {
            return f5457a.m3914z6(classDataFirstOrNull2, classLoader);
        }
        ClassData classDataFirstOrNull3 = dexKitBridge.findClass(new C0518nn(26)).firstOrNull(new C0518nn(27));
        if (classDataFirstOrNull3 != null) {
            return f5457a.m3914z6(classDataFirstOrNull3, classLoader);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z4 */
    public static final na1 m3707Z4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.methods(new C0621pn(0));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z5 */
    private final String m3708Z5() {
        return (String) f5470n.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public static final na1 m3713a3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(27));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public static final na1 m3714a4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0518nn(15));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a5 */
    public static final na1 m3715a5(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        methodsMatcher.add(new C0480mn(4));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a6 */
    private final String m3716a6() {
        return (String) f5468l.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public static final na1 m3721b3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v(f5457a.m3632O5()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public static final na1 m3722b4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.methods(new C0518nn(11));
        classMatcher.setSuperClass(f5457a.m3732c6());
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b5 */
    public static final na1 m3723b5(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setParamTypes(o30.m2783w("android.content.Context", "android.os.Bundle", "int"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b6 */
    private final String m3724b6() {
        return (String) f5441I.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final String m3728c2() {
        return ik0.f2579a.m1592a(45, 17, 28, 84, 2, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c3 */
    public static final na1 m3729c3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0621pn(11));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public static final na1 m3730c4(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        methodsMatcher.add(new C0480mn(29));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c5 */
    private final Class<?> m3731c5(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Iterator<ClassData> it = dexKitBridge.findClass(new C0518nn(17)).iterator();
        it.getClass();
        while (it.hasNext()) {
            ClassData next = it.next();
            next.getClass();
            Class<?> clsM3914z6 = m3914z6(next, classLoader);
            if (clsM3914z6 != null) {
                try {
                    if (clsM3914z6.isEnum()) {
                        Object[] enumConstants = clsM3914z6.getEnumConstants();
                        if ((enumConstants != null ? enumConstants.length : 0) >= 3) {
                            return clsM3914z6;
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c6 */
    private final String m3732c6() {
        return (String) f5473q.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final String m3736d2() {
        return ik0.f2579a.m1592a(35, 29, 25, 86, 35, 12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public static final na1 m3737d3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v(f5457a.m3618M5()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public static final na1 m3738d4(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        C0695rn c0695rn = f5457a;
        methodMatcher.setName(c0695rn.m3572G5());
        methodMatcher.setParamTypes(o30.m2782v(c0695rn.m3836p6()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d5 */
    public static final na1 m3739d5(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0518nn(16));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d6 */
    private final String m3740d6() {
        return (String) f5442J.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final String m3744e2() {
        return ik0.f2579a.m1592a(62, 10, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0012, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: e3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Class<?> m3745e3(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Class<?> clsM3914z6;
        Iterator<ClassData> it = dexKitBridge.findClass(new C0480mn(19)).iterator();
        it.getClass();
        loop0: while (true) {
            if (!it.hasNext()) {
                Iterator<ClassData> it2 = dexKitBridge.findClass(new C0480mn(20)).iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    ClassData next = it2.next();
                    next.getClass();
                    Class<?> clsM3914z62 = m3914z6(next, classLoader);
                    if (clsM3914z62 != null && m3890w6(clsM3914z62, "getWidth", 0) && m3890w6(clsM3914z62, "getHeight", 0)) {
                        return clsM3914z62;
                    }
                }
                return null;
            }
            ClassData next2 = it.next();
            next2.getClass();
            clsM3914z6 = m3914z6(next2, classLoader);
            if (clsM3914z6 != null) {
                try {
                    if (Parcelable.class.isAssignableFrom(clsM3914z6)) {
                        Method[] declaredMethods = clsM3914z6.getDeclaredMethods();
                        declaredMethods.getClass();
                        int length = declaredMethods.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                Method method = declaredMethods[i];
                                if (p30.m3002l(method.getName(), "a")) {
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    parameterTypes.getClass();
                                    if (parameterTypes.length == 0 && p30.m3002l(method.getReturnType(), String.class)) {
                                        Method[] declaredMethods2 = clsM3914z6.getDeclaredMethods();
                                        declaredMethods2.getClass();
                                        for (Method method2 : declaredMethods2) {
                                            if (p30.m3002l(method2.getName(), "b")) {
                                                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                                                parameterTypes2.getClass();
                                                if (parameterTypes2.length == 0 && (p30.m3002l(method2.getReturnType(), Boolean.TYPE) || p30.m3002l(method2.getReturnType(), Boolean.class))) {
                                                    break loop0;
                                                }
                                            }
                                        }
                                    }
                                }
                                i++;
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return clsM3914z6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public static final boolean m3746e4(ClassData classData) {
        classData.getClass();
        return k41.m1764V(classData.getSimpleName(), f5457a.m3708Z5(), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e5 */
    public static final na1 m3747e5(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v("TEXT_ARROW"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e6 */
    private final String m3748e6() {
        return (String) f5435C.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final String m3752f2() {
        return ik0.f2579a.m1592a(60, 17, 20, 69, 35);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f3 */
    public static final na1 m3753f3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(1));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public static final na1 m3754f4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(11));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f5 */
    private final Class<?> m3755f5(DexKitBridge dexKitBridge, ClassLoader classLoader, Class<?> cls) {
        Iterator<ClassData> it = dexKitBridge.findClass(new C0480mn(26)).iterator();
        it.getClass();
        while (it.hasNext()) {
            ClassData next = it.next();
            next.getClass();
            Class<?> clsM3914z6 = m3914z6(next, classLoader);
            if (clsM3914z6 != null) {
                try {
                    Constructor<?>[] constructors = clsM3914z6.getConstructors();
                    constructors.getClass();
                    for (Constructor<?> constructor : constructors) {
                        if (constructor.getParameterTypes().length == 20) {
                            return clsM3914z6;
                        }
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f6 */
    private final String m3756f6() {
        return (String) f5434B.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public static final String m3760g2() {
        return ik0.f2579a.m1592a(119, 17, 30, 88, 63, 70);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public static final na1 m3761g3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v("ShareCommentPictureInfo"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public static final na1 m3762g4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setSuperClass(f5457a.m3732c6());
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public static final na1 m3763g5(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0881w9(25));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g6 */
    private final String m3764g6() {
        return (String) f5438F.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final String m3768h2() {
        return ik0.f2579a.m1592a(7, 73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public static final na1 m3769h3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0621pn(9));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public static final boolean m3770h4(ClassData classData) {
        classData.getClass();
        return k41.m1764V(classData.getSimpleName(), f5457a.m3708Z5(), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h5 */
    public static final na1 m3771h5(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v("SettingNewBean"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h6 */
    private final String m3772h6() {
        return (String) f5436D.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final String m3776i2() {
        return ik0.f2579a.m1592a(37, 23, 4, 84, 8, 23, 29, 92, 46, 22, 4, 120, 38, 25, 23, 84, 15, 17, 2, 84, 40, 12, 28, 72, 24, 16, 17, 67, 46);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final na1 m3777i3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v(f5457a.m3639P5()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public static final na1 m3778i4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0518nn(20));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i5 */
    private final Class<?> m3779i5(Class<?> cls, ClassLoader classLoader) {
        Constructor<?> constructor;
        if (cls != null) {
            try {
                Constructor<?>[] constructors = cls.getConstructors();
                constructors.getClass();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 20) {
                        break;
                    }
                    i++;
                }
                if (constructor != null) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    parameterTypes.getClass();
                    Class<?> cls2 = (Class) AbstractC0201f9.m1065k0(15, parameterTypes);
                    if (cls2 != null) {
                        String name = cls2.getName();
                        String name2 = cls.getName();
                        int iLastIndexOf = name2.lastIndexOf(".", name2.length() - 1);
                        if (iLastIndexOf != -1) {
                            name2 = name2.substring(0, iLastIndexOf);
                        }
                        if (r41.m3382S(name, name2, false)) {
                            return cls2;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i6 */
    private final String m3780i6() {
        return (String) f5476t.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public static final String m3784j2() {
        return ik0.f2579a.m1592a(37, 23, 4, 84, 8, 23, 29, 92, 46, 22, 4, 120, 38, 25, 23, 84, 24, 16, 17, 67, 46);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0012, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: j3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Class<?> m3785j3(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Iterator<ClassData> it = dexKitBridge.findClass(new C0881w9(21)).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                Iterator<ClassData> it2 = dexKitBridge.findClass(new C0881w9(22)).iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    ClassData next = it2.next();
                    next.getClass();
                    Class<?> clsM3914z6 = m3914z6(next, classLoader);
                    if (clsM3914z6 != null && m3890w6(clsM3914z6, "getWidth", 0) && m3890w6(clsM3914z6, "getHeight", 0)) {
                        return clsM3914z6;
                    }
                }
                return null;
            }
            ClassData next2 = it.next();
            next2.getClass();
            Class<?> clsM3914z62 = m3914z6(next2, classLoader);
            if (clsM3914z62 != null) {
                try {
                    if (Parcelable.class.isAssignableFrom(clsM3914z62)) {
                        Method[] declaredMethods = clsM3914z62.getDeclaredMethods();
                        declaredMethods.getClass();
                        int length = declaredMethods.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                Method method = declaredMethods[i];
                                if (p30.m3002l(method.getName(), "a")) {
                                    Class<?>[] parameterTypes = method.getParameterTypes();
                                    parameterTypes.getClass();
                                    if (parameterTypes.length == 0 && p30.m3002l(method.getReturnType(), Long.TYPE)) {
                                        Method[] declaredMethods2 = clsM3914z62.getDeclaredMethods();
                                        declaredMethods2.getClass();
                                        for (Method method2 : declaredMethods2) {
                                            if (p30.m3002l(method2.getName(), "b")) {
                                                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                                                parameterTypes2.getClass();
                                                if (parameterTypes2.length == 0 && p30.m3002l(method2.getReturnType(), String.class)) {
                                                    return clsM3914z62;
                                                }
                                            }
                                        }
                                    }
                                }
                                i++;
                            }
                        }
                    } else {
                        continue;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public static final na1 m3786j4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        ik0 ik0Var = ik0.f2579a;
        classMatcher.setUsingStrings(o30.m2783w(ik0Var.m1592a(20374, 23328), ik0Var.m1592a(21069, 20179), ik0Var.m1592a(20085, 25309), ik0Var.m1592a(20038, 24935, 20740, 36242)));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j5 */
    private final Class<?> m3787j5(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Class<?> clsLoadClass;
        Iterator<ClassData> it = dexKitBridge.findClass(new C0518nn(6)).iterator();
        it.getClass();
        while (it.hasNext()) {
            ClassData next = it.next();
            next.getClass();
            Class<?> clsM3914z6 = m3914z6(next, classLoader);
            if (clsM3914z6 != null && !clsM3914z6.isInterface() && m3898x6(clsM3914z6, m3564F5(), 8)) {
                return clsM3914z6;
            }
        }
        try {
            clsLoadClass = classLoader.loadClass(m3859s6());
        } catch (Throwable unused) {
            clsLoadClass = null;
        }
        if (clsLoadClass == null || clsLoadClass.isInterface()) {
            return null;
        }
        return clsLoadClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j6 */
    private final String m3788j6() {
        return (String) f5437E.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final String m3792k2() {
        return ik0.f2579a.m1592a(36, 22, 51, 67, 46, 25, 4, 84);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k3 */
    public static final na1 m3793k3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0518nn(1));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k4 */
    public static final boolean m3794k4(ClassData classData) {
        classData.getClass();
        String simpleName = classData.getSimpleName();
        C0695rn c0695rn = f5457a;
        return k41.m1764V(simpleName, c0695rn.m3708Z5(), true) || k41.m1764V(classData.getSimpleName(), c0695rn.m3681V5(), true) || k41.m1764V(classData.getSimpleName(), c0695rn.m3611L5(), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k5 */
    public static final na1 m3795k5(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0518nn(18));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k6 */
    private final String m3796k6() {
        return (String) f5439G.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final String m3800l2() {
        return ik0.f2579a.m1592a(25, 73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final na1 m3801l3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v("ShareCommentVideoInfo"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l4 */
    private final Class<?> m3802l4(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Method method;
        Iterator<ClassData> it = dexKitBridge.findClass(new C0881w9(20)).iterator();
        it.getClass();
        while (true) {
            Method method2 = null;
            if (!it.hasNext()) {
                return null;
            }
            ClassData next = it.next();
            next.getClass();
            Class<?> clsM3914z6 = m3914z6(next, classLoader);
            if (clsM3914z6 != null) {
                try {
                    Method[] declaredMethods = clsM3914z6.getDeclaredMethods();
                    declaredMethods.getClass();
                    int length = declaredMethods.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            method = null;
                            break;
                        }
                        method = declaredMethods[i];
                        if (p30.m3002l(method.getName(), f5457a.m3756f6()) && method.getParameterTypes().length == 1) {
                            break;
                        }
                        i++;
                    }
                    Method[] declaredMethods2 = clsM3914z6.getDeclaredMethods();
                    declaredMethods2.getClass();
                    int length2 = declaredMethods2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            break;
                        }
                        Method method3 = declaredMethods2[i2];
                        if (p30.m3002l(method3.getName(), f5457a.m3748e6()) && method3.getParameterTypes().length == 1) {
                            method2 = method3;
                            break;
                        }
                        i2++;
                    }
                    if (method != null && method2 != null && p30.m3002l(method.getParameterTypes()[0], List.class) && p30.m3002l(method2.getParameterTypes()[0], Float.class)) {
                        return clsM3914z6;
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l5 */
    public static final na1 m3803l5(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.methods(new C0518nn(9));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l6 */
    private final String m3804l6() {
        return (String) f5480x.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public static final String m3808m2() {
        return ik0.f2579a.m1592a(24, 73);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public static final na1 m3809m3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(5));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m4 */
    public static final na1 m3810m4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0881w9(23));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m5 */
    public static final na1 m3811m5(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        methodsMatcher.add(new C0518nn(2));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m6 */
    private final String m3812m6() {
        return (String) f5433A.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final String m3816n2() {
        return ik0.f2579a.m1592a(10, 27, 4, 88, 61, 17, 4, 72);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public static final na1 m3817n3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v(f5457a.m3653R5()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n4 */
    public static final na1 m3818n4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.methods(new C0621pn(14));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n5 */
    public static final na1 m3819n5(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName(f5457a.m3556E5());
        methodMatcher.setParamCount(4);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n6 */
    private final String m3820n6() {
        return (String) f5482z.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final String m3824o2() {
        return ik0.f2579a.m1592a(5, 23, 4, 84, 15, 29, 4, 80, 34, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o3 */
    private final Class<?> m3825o3(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        boolean z;
        try {
            return classLoader.loadClass("com.xingin.update.manager.channel.a");
        } catch (Exception unused) {
            Iterator<ClassData> it = dexKitBridge.findClass(new C0480mn(9)).iterator();
            it.getClass();
            while (it.hasNext()) {
                ClassData next = it.next();
                next.getClass();
                Class<?> clsM3914z6 = this.m3914z6(next, classLoader);
                if (clsM3914z6 != null) {
                    try {
                        Method[] declaredMethods = clsM3914z6.getDeclaredMethods();
                        declaredMethods.getClass();
                        int length = declaredMethods.length;
                        boolean z2 = false;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z = false;
                                break;
                            }
                            Method method = declaredMethods[i];
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && p30.m3002l(method.getReturnType(), Void.TYPE)) {
                                z = true;
                                break;
                            }
                            i++;
                        }
                        Method[] declaredMethods2 = clsM3914z6.getDeclaredMethods();
                        declaredMethods2.getClass();
                        int length2 = declaredMethods2.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length2) {
                                break;
                            }
                            Method method2 = declaredMethods2[i2];
                            if (method2.getParameterTypes().length == 2 && p30.m3002l(method2.getParameterTypes()[0], Context.class) && p30.m3002l(method2.getParameterTypes()[1], Boolean.TYPE)) {
                                z2 = true;
                                break;
                            }
                            i2++;
                        }
                        if (z && z2) {
                            return clsM3914z6;
                        }
                    } catch (Throwable unused2) {
                        continue;
                    }
                }
            }
            return this.m3525A6(dexKitBridge.findClass(new C0480mn(10)), classLoader);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o4 */
    public static final na1 m3826o4(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        methodsMatcher.add(new C0480mn(17));
        methodsMatcher.add(new C0480mn(18));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o5 */
    private final Class<?> m3827o5(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Iterator<ClassData> it = dexKitBridge.findClass(new C0621pn(16)).iterator();
        it.getClass();
        while (it.hasNext()) {
            ClassData next = it.next();
            next.getClass();
            Class<?> clsM3914z6 = m3914z6(next, classLoader);
            if (clsM3914z6 != null) {
                try {
                    C0822v c0822vM1933s = AbstractC0398kl.m1933s(clsM3914z6.getDeclaredFields());
                    while (c0822vM1933s.hasNext()) {
                        if (((Field) c0822vM1933s.next()).getType().getName().equals("com.google.gson.l")) {
                            return clsM3914z6;
                        }
                    }
                } catch (Throwable unused) {
                    continue;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o6 */
    private final String m3828o6() {
        return (String) f5481y.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p2 */
    public static final String m3832p2() {
        return ik0.f2579a.m1592a(9, 23, 4, 69, 36, 21, 35, 89, 46, 29, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public static final na1 m3833p3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0881w9(24));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p4 */
    public static final na1 m3834p4(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName(f5457a.m3756f6());
        methodMatcher.setParamCount(1);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p5 */
    public static final na1 m3835p5(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(3));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p6 */
    private final String m3836p6() {
        return (String) f5464h.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final String m3840q2() {
        return ik0.f2579a.m1592a(8, 55, 61, 124, 14, 54, 36, 110, 2, 53, 49, 118, 14, 39, 60, 126, 5, 63, 47, 97, 25, 61, 35, 98);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public static final na1 m3841q3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v("XhsAppUpdate"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q4 */
    public static final na1 m3842q4(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName(f5457a.m3748e6());
        methodMatcher.setParamCount(1);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q5 */
    public static final na1 m3843q5(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v("DynamicData"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q6 */
    private final String m3844q6() {
        return (String) f5463g.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final String m3848r2() {
        return ik0.f2579a.m1592a(40, 23, 29, 92, 46, 22, 4, 110, 34, 21, 17, 86, 46, 39, 6, 88, 46, 15, 47, 65, 42, 31, 21);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final na1 m3849r3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0480mn(7));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r5 */
    private final Class<?> m3850r5(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        boolean z;
        boolean z2;
        boolean z3;
        Iterator<ClassData> it = dexKitBridge.findClass(new C0621pn(19)).iterator();
        it.getClass();
        while (true) {
            boolean zHasNext = it.hasNext();
            Class cls = Void.TYPE;
            boolean z4 = true;
            if (!zHasNext) {
                Iterator<ClassData> it2 = dexKitBridge.findClass(new C0621pn(20)).iterator();
                it2.getClass();
                while (it2.hasNext()) {
                    ClassData next = it2.next();
                    next.getClass();
                    Class<?> clsM3914z6 = m3914z6(next, classLoader);
                    if (clsM3914z6 != null) {
                        try {
                            Method[] declaredMethods = clsM3914z6.getDeclaredMethods();
                            declaredMethods.getClass();
                            int length = declaredMethods.length;
                            int i = 0;
                            while (true) {
                                if (i >= length) {
                                    z = false;
                                    break;
                                }
                                Method method = declaredMethods[i];
                                if (method.getParameterTypes().length == 1 && p30.m3002l(method.getParameterTypes()[0], String.class)) {
                                    z = true;
                                    break;
                                }
                                i++;
                            }
                            Method[] declaredMethods2 = clsM3914z6.getDeclaredMethods();
                            declaredMethods2.getClass();
                            int length2 = declaredMethods2.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= length2) {
                                    z2 = false;
                                    break;
                                }
                                Method method2 = declaredMethods2[i2];
                                Class<?>[] parameterTypes = method2.getParameterTypes();
                                parameterTypes.getClass();
                                if (parameterTypes.length == 0 && p30.m3002l(method2.getReturnType(), cls)) {
                                    z2 = true;
                                    break;
                                }
                                i2++;
                            }
                            if (z && z2) {
                                return clsM3914z6;
                            }
                        } catch (Throwable unused) {
                            continue;
                        }
                    }
                }
                try {
                    try {
                        return classLoader.loadClass("ycb.b");
                    } catch (Exception unused2) {
                        return classLoader.loadClass("ffb.b");
                    }
                } catch (Exception unused3) {
                    return null;
                }
            }
            ClassData next2 = it.next();
            next2.getClass();
            Class<?> clsM3914z62 = m3914z6(next2, classLoader);
            if (clsM3914z62 != null) {
                try {
                    Method[] declaredMethods3 = clsM3914z62.getDeclaredMethods();
                    declaredMethods3.getClass();
                    int length3 = declaredMethods3.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length3) {
                            z3 = false;
                            break;
                        }
                        Method method3 = declaredMethods3[i3];
                        if (method3.getParameterTypes().length == 1 && p30.m3002l(method3.getParameterTypes()[0], String.class)) {
                            z3 = true;
                            break;
                        }
                        i3++;
                    }
                    Method[] declaredMethods4 = clsM3914z62.getDeclaredMethods();
                    declaredMethods4.getClass();
                    int length4 = declaredMethods4.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length4) {
                            z4 = false;
                            break;
                        }
                        Method method4 = declaredMethods4[i4];
                        Class<?>[] parameterTypes2 = method4.getParameterTypes();
                        parameterTypes2.getClass();
                        if (parameterTypes2.length == 0 && p30.m3002l(method4.getReturnType(), cls)) {
                            break;
                        }
                        i4++;
                    }
                    if (z3 && z4) {
                        return clsM3914z62;
                    }
                } catch (Throwable unused4) {
                    continue;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r6 */
    private final String m3851r6() {
        return (String) f5455W.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final String m3855s2() {
        return ik0.f2579a.m1592a(8, 23, 29, 92, 46, 22, 4, 124, 46, 28, 25, 80, 13, 29, 21, 85, 8, 23, 30, 69, 57, 23, 28, 93, 46, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s3 */
    public static final na1 m3856s3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v("DefaultUpdateManager.apkDownload"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s4 */
    private final Class<?> m3857s4(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        ClassData classDataFirstOrNull = dexKitBridge.findClass(new C0881w9(15)).firstOrNull(new C0881w9(16));
        if (classDataFirstOrNull != null) {
            return f5457a.m3914z6(classDataFirstOrNull, classLoader);
        }
        ClassData classDataFirstOrNull2 = dexKitBridge.findClass(new C0881w9(17)).firstOrNull(new C0881w9(18));
        if (classDataFirstOrNull2 != null) {
            return f5457a.m3914z6(classDataFirstOrNull2, classLoader);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s5 */
    public static final na1 m3858s5(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0621pn(8));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s6 */
    private final String m3859s6() {
        return (String) f5452T.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final String m3863t2() {
        return ik0.f2579a.m1592a(8, 23, 29, 92, 46, 22, 4, 97, 34, 27, 4, 68, 57, 29, 57, 95, 45, 23);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t3 */
    private final Class<?> m3864t3(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        return m3525A6(dexKitBridge.findClass(new C0518nn(7)), classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t4 */
    public static final na1 m3865t4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0881w9(14));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t5 */
    public static final na1 m3866t5(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2783w("Lite", "GooglePlay", "harmony"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t6 */
    private final String m3867t6() {
        return (String) f5462f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final String m3871u2() {
        return ik0.f2579a.m1592a(40, 23, 29, 92, 46, 22, 4, 110, 59, 23, 3, 69);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public static final na1 m3872u3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0518nn(28));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u4 */
    public static final na1 m3873u4(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.methods(new C0881w9(29));
        C0695rn c0695rn = f5457a;
        classMatcher.setUsingStrings(o30.m2783w(c0695rn.m3716a6(), c0695rn.m3674U5()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u5 */
    public static final na1 m3874u5(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0881w9(12));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: u6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m3875u6(Class<?> cls) {
        while (true) {
            if (cls == null || cls.equals(Object.class)) {
                break;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (p30.m3002l(method.getReturnType(), Activity.class)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    if (parameterTypes.length == 0) {
                        return true;
                    }
                }
            }
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            for (Field field : declaredFields) {
                if (p30.m3002l(field.getType(), Activity.class)) {
                    return true;
                }
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final String m3879v2() {
        return ik0.f2579a.m1592a(8, 23, 29, 92, 46, 22, 4, 103, 34, 28, 21, 94, 2, 22, 22, 94);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v3 */
    public static final na1 m3880v3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        C0695rn c0695rn = f5457a;
        classMatcher.setSuperClass(c0695rn.m3740d6());
        classMatcher.setUsingStrings(o30.m2783w(c0695rn.m3660S5(), c0695rn.m3724b6()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public static final na1 m3881v4(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        methodsMatcher.add(new C0518nn(3));
        methodsMatcher.add(new C0518nn(13));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v5 */
    public static final na1 m3882v5(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setUsingStrings(o30.m2782v("Lite"));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m3883v6(Class<?> cls, String str) {
        while (true) {
            if (cls == null || cls.equals(Object.class)) {
                break;
            }
            try {
                Method[] declaredMethods = cls.getDeclaredMethods();
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    if (p30.m3002l(method.getName(), str) && method.getParameterTypes().length == 1) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public static final String m3887w2() {
        return ik0.f2579a.m1592a(40, 10, 21, 80, 63, 23, 2, 110, 40, 29, 30, 69, 46, 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w3 */
    private final Class<?> m3888w3(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        try {
            return classLoader.loadClass("com.xingin.xhs.homepage.tabbar.TabView");
        } catch (Exception unused) {
            Iterator<ClassData> it = dexKitBridge.findClass(new C0480mn(23)).iterator();
            it.getClass();
            while (it.hasNext()) {
                ClassData next = it.next();
                next.getClass();
                Class<?> clsM3914z6 = this.m3914z6(next, classLoader);
                if (clsM3914z6 != null) {
                    try {
                        clsM3914z6.getMethod("setTabName", String.class);
                        return clsM3914z6;
                    } catch (Exception unused2) {
                        continue;
                    }
                }
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w4 */
    public static final na1 m3889w4(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        C0695rn c0695rn = f5457a;
        methodMatcher.setName(c0695rn.m3572G5());
        methodMatcher.setParamTypes(o30.m2782v(c0695rn.m3836p6()));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: w6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m3890w6(Class<?> cls, String str, int i) {
        while (true) {
            if (cls == null || cls.equals(Object.class)) {
                break;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (p30.m3002l(method.getName(), str) && method.getParameterTypes().length == i) {
                    return true;
                }
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final String m3894x2() {
        return ik0.f2579a.m1592a(35772, 20231, 30040, 17, 9, 13, 25, 93, 47, 59, 31, 95, 45, 17, 23, 66, 30, 12, 25, 93, 29, 74, 80, 24020, 20796, 31747, 65404, 36842, 34823, 58, 5, 88, 39, 28, 51, 94, 37, 30, 25, 86, 20394, 24599, 33735, 21479);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final na1 m3895x3(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0621pn(7));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public static final na1 m3896x4(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        methodMatcher.setName(f5457a.m3804l6());
        methodMatcher.setParamCount(0);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x5 */
    private final Class<?> m3897x5(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        Class<?> clsM3533B6 = m3533B6(dexKitBridge, classLoader, new b(m3772h6(), 0), new b(m3788j6(), 0), new b(m3764g6(), 0));
        return clsM3533B6 != null ? clsM3533B6 : m3541C6(this, dexKitBridge, classLoader, new b(m3772h6(), 0), new b(m3788j6(), 0), null, 16, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        return false;
     */
    /* JADX INFO: renamed from: x6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean m3898x6(Class<?> cls, String str, int i) {
        while (true) {
            if (cls == null || cls.equals(Object.class)) {
                break;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            for (Method method : declaredMethods) {
                if (p30.m3002l(method.getName(), str) && method.getParameterTypes().length == i) {
                    return true;
                }
            }
            cls = cls.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final String m3902y2() {
        return ik0.f2579a.m1592a(47, 29, 4, 80, 34, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public static final na1 m3903y3(ClassMatcher classMatcher) {
        classMatcher.getClass();
        classMatcher.setSuperClass("android.view.View");
        classMatcher.methods(new C0881w9(11));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public static final boolean m3904y4(ClassData classData) {
        classData.getClass();
        String simpleName = classData.getSimpleName();
        C0695rn c0695rn = f5457a;
        return k41.m1764V(simpleName, c0695rn.m3604K5(), true) && k41.m1764V(classData.getSimpleName(), c0695rn.m3596J5(), true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y5 */
    private final String m3905y5() {
        return (String) f5461e.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y6 */
    private final boolean m3906y6(Class<?> cls) {
        while (cls != null && !cls.equals(Object.class)) {
            try {
                C0822v c0822vM1933s = AbstractC0398kl.m1933s(cls.getDeclaredFields());
                while (c0822vM1933s.hasNext()) {
                    if (((Field) c0822vM1933s.next()).getType().getName().equals(m3796k6())) {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            cls = cls.getSuperclass();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final String m3910z2() {
        return ik0.f2579a.m1592a(15, 17, 17, 93, 36, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3 */
    public static final na1 m3911z3(MethodsMatcher methodsMatcher) {
        methodsMatcher.getClass();
        methodsMatcher.add(new C0881w9(26));
        methodsMatcher.add(new C0881w9(27));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public static final na1 m3912z4(FindClass findClass) {
        findClass.getClass();
        findClass.matcher(new C0881w9(19));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z5 */
    private final String m3913z5() {
        return (String) f5460d.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z6 */
    private final Class<?> m3914z6(ClassData classData, ClassLoader classLoader) {
        try {
            return classData.getInstance(classLoader);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y2 */
    public final a m3915Y2(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        dexKitBridge.getClass();
        classLoader.getClass();
        Class<?> clsM3538C3 = m3538C3(dexKitBridge, classLoader);
        Class<?> clsM3857s4 = m3857s4(dexKitBridge, classLoader);
        Class<?> clsM3706Z3 = m3706Z3(dexKitBridge, classLoader);
        List<Class<?>> listM3609L3 = m3609L3(dexKitBridge, classLoader, clsM3538C3);
        Class<?> clsM3864t3 = m3864t3(dexKitBridge, classLoader);
        Class<?> clsM3705Z2 = m3705Z2(dexKitBridge, classLoader);
        Class<?> clsM3787j5 = m3787j5(dexKitBridge, classLoader);
        uo0 uo0VarM3603K4 = m3603K4(dexKitBridge, classLoader);
        Class cls = (Class) uo0VarM3603K4.f6274d;
        String str = (String) uo0VarM3603K4.f6275e;
        Class<?> clsM3888w3 = m3888w3(dexKitBridge, classLoader);
        Class<?> clsM3555E4 = m3555E4(dexKitBridge, classLoader);
        uo0 uo0VarM3658S3 = m3658S3(dexKitBridge, classLoader);
        Class cls2 = (Class) uo0VarM3658S3.f6274d;
        String str2 = (String) uo0VarM3658S3.f6275e;
        Class<?> clsM3745e3 = m3745e3(dexKitBridge, classLoader);
        Class<?> clsM3785j3 = m3785j3(dexKitBridge, classLoader);
        Class<?> clsM3897x5 = m3897x5(dexKitBridge, classLoader);
        Class<?> clsM3802l4 = m3802l4(dexKitBridge, classLoader);
        Class<?> clsM3731c5 = m3731c5(dexKitBridge, classLoader);
        Class<?> clsM3755f5 = m3755f5(dexKitBridge, classLoader, clsM3731c5);
        return new a(clsM3857s4, listM3609L3, clsM3706Z3, clsM3538C3, clsM3897x5, clsM3802l4, null, clsM3864t3, clsM3705Z2, clsM3787j5, cls, str, clsM3888w3, clsM3555E4, cls2, str2, clsM3745e3, clsM3785j3, m3827o5(dexKitBridge, classLoader), clsM3755f5, clsM3731c5, m3779i5(clsM3755f5, classLoader));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r4 */
    public final Method m3916r4(Class<?> cls) {
        cls.getClass();
        while (cls != null && !cls.equals(Object.class)) {
            C0822v c0822vM1933s = AbstractC0398kl.m1933s(cls.getDeclaredMethods());
            while (c0822vM1933s.hasNext()) {
                Method method = (Method) c0822vM1933s.next();
                if (method.getParameterTypes().length == 1 && List.class.isAssignableFrom(method.getReturnType())) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w5 */
    public final c m3917w5(DexKitBridge dexKitBridge, ClassLoader classLoader) {
        dexKitBridge.getClass();
        classLoader.getClass();
        return new c(m3850r5(dexKitBridge, classLoader), m3638P4(dexKitBridge, classLoader), m3825o3(dexKitBridge, classLoader));
    }

    /* JADX INFO: renamed from: rn$c */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class c {

        /* JADX INFO: renamed from: d */
        public static final int f5508d = 8;

        /* JADX INFO: renamed from: a */
        private final Class<?> f5509a;

        /* JADX INFO: renamed from: b */
        private final Class<?> f5510b;

        /* JADX INFO: renamed from: c */
        private final Class<?> f5511c;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (null java.lang.Class) : (r2v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (null java.lang.Class) : (r3v0 java.lang.Class))
  (wrap:java.lang.Class:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED] (LINE:12)) != (0 int)) ? (null java.lang.Class) : (r4v0 java.lang.Class))
 A[MD:(java.lang.Class<?>, java.lang.Class<?>, java.lang.Class<?>):void (m)] (LINE:17) call: rn.c.<init>(java.lang.Class, java.lang.Class, java.lang.Class):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ c(Class cls, Class cls2, Class cls3, int i, AbstractC0619pl abstractC0619pl) {
            this((i & 1) != 0 ? null : cls, (i & 2) != 0 ? null : cls2, (i & 4) != 0 ? null : cls3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: rn$c */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: e */
        public static /* synthetic */ c m3972e(c cVar, Class cls, Class cls2, Class cls3, int i, Object obj) {
            if ((i & 1) != 0) {
                cls = cVar.f5509a;
            }
            if ((i & 2) != 0) {
                cls2 = cVar.f5510b;
            }
            if ((i & 4) != 0) {
                cls3 = cVar.f5511c;
            }
            return cVar.m3976d(cls, cls2, cls3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final Class<?> m3973a() {
            return this.f5509a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final Class<?> m3974b() {
            return this.f5510b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final Class<?> m3975c() {
            return this.f5511c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final c m3976d(Class<?> cls, Class<?> cls2, Class<?> cls3) {
            return new c(cls, cls2, cls3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p30.m3002l(this.f5509a, cVar.f5509a) && p30.m3002l(this.f5510b, cVar.f5510b) && p30.m3002l(this.f5511c, cVar.f5511c);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final Class<?> m3977f() {
            return this.f5511c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g */
        public final Class<?> m3978g() {
            return this.f5510b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: h */
        public final Class<?> m3979h() {
            return this.f5509a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            Class<?> cls = this.f5509a;
            int iHashCode = (cls == null ? 0 : cls.hashCode()) * 31;
            Class<?> cls2 = this.f5510b;
            int iHashCode2 = (iHashCode + (cls2 == null ? 0 : cls2.hashCode())) * 31;
            Class<?> cls3 = this.f5511c;
            return iHashCode2 + (cls3 != null ? cls3.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "UpdateBlockClasses(stateManager=" + this.f5509a + ", routerHandler=" + this.f5510b + ", defaultUpdateMgr=" + this.f5511c + ")";
        }

        public c(Class<?> cls, Class<?> cls2, Class<?> cls3) {
            this.f5509a = cls;
            this.f5510b = cls2;
            this.f5511c = cls3;
        }

        public c() {
            this(null, null, null, 7, null);
        }
    }
}
