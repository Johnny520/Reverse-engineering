package sa;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import gb.AbstractC2675i2;
import gb.AbstractC2706r0;
import gb.AbstractC2718v0;
import gb.InterfaceC2716u1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.internal.p218ws.WebSocketProtocol;
import p112hb.InterfaceC2947f;
import p129ib.C3381l;
import p186m9.AbstractC5128i;
import p186m9.C5139t;
import p213oa.C5692c;
import p213oa.C5693d;
import p213oa.C5697h;
import p229p9.AbstractC6040t;
import p229p9.AbstractC6043u;
import p229p9.EnumC5996e0;
import p229p9.EnumC5998f;
import p229p9.InterfaceC5983a;
import p229p9.InterfaceC5985a1;
import p229p9.InterfaceC5986b;
import p229p9.InterfaceC5988b1;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6004h;
import p229p9.InterfaceC6005h0;
import p229p9.InterfaceC6006h1;
import p229p9.InterfaceC6019m;
import p229p9.InterfaceC6023n0;
import p229p9.InterfaceC6028p;
import p229p9.InterfaceC6031q;
import p229p9.InterfaceC6042t1;
import p229p9.InterfaceC6044u0;
import p254r5.C6494d0;
import p327wa.AbstractC9211e;

/* JADX INFO: renamed from: sa.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7259i {

    /* JADX INFO: renamed from: a */
    public static final C5692c f24130a = new C5692c("kotlin.jvm.JvmName");

    /* JADX INFO: renamed from: A */
    public static boolean m28735A(InterfaceC6019m interfaceC6019m) {
        return m28738D(interfaceC6019m, EnumC5998f.f18950t);
    }

    /* JADX INFO: renamed from: B */
    public static boolean m28736B(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(36);
        }
        return m28738D(interfaceC6019m, EnumC5998f.f18951u);
    }

    /* JADX INFO: renamed from: C */
    public static boolean m28737C(InterfaceC6019m interfaceC6019m) {
        return m28738D(interfaceC6019m, EnumC5998f.f18949s);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m28738D(InterfaceC6019m interfaceC6019m, EnumC5998f enumC5998f) {
        if (enumC5998f == null) {
            m28748a(37);
        }
        return (interfaceC6019m instanceof InterfaceC5995e) && ((InterfaceC5995e) interfaceC6019m).mo5588j() == enumC5998f;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m28739E(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(1);
        }
        while (interfaceC6019m != null) {
            if (m28768u(interfaceC6019m) || m28772y(interfaceC6019m)) {
                return true;
            }
            interfaceC6019m = interfaceC6019m.mo7443b();
        }
        return false;
    }

    /* JADX INFO: renamed from: F */
    public static boolean m28740F(AbstractC2706r0 abstractC2706r0, InterfaceC6019m interfaceC6019m) {
        if (abstractC2706r0 == null) {
            m28748a(30);
        }
        if (interfaceC6019m == null) {
            m28748a(31);
        }
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u == null) {
            return false;
        }
        InterfaceC6019m interfaceC6019mMo12664a = interfaceC6004hMo5602u.mo12664a();
        return (interfaceC6019mMo12664a instanceof InterfaceC6004h) && (interfaceC6019m instanceof InterfaceC6004h) && ((InterfaceC6004h) interfaceC6019m).mo5591o().equals(((InterfaceC6004h) interfaceC6019mMo12664a).mo5591o());
    }

    /* JADX INFO: renamed from: G */
    public static boolean m28741G(InterfaceC6019m interfaceC6019m) {
        return (m28738D(interfaceC6019m, EnumC5998f.f18948r) || m28738D(interfaceC6019m, EnumC5998f.f18949s)) && ((InterfaceC5995e) interfaceC6019m).mo5592p() == EnumC5996e0.f18937s;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m28742H(InterfaceC5995e interfaceC5995e, InterfaceC5995e interfaceC5995e2) {
        if (interfaceC5995e == null) {
            m28748a(28);
        }
        if (interfaceC5995e2 == null) {
            m28748a(29);
        }
        return m28743I(interfaceC5995e.mo7508x(), interfaceC5995e2.mo12664a());
    }

    /* JADX INFO: renamed from: I */
    public static boolean m28743I(AbstractC2706r0 abstractC2706r0, InterfaceC6019m interfaceC6019m) {
        if (abstractC2706r0 == null) {
            m28748a(32);
        }
        if (interfaceC6019m == null) {
            m28748a(33);
        }
        if (m28740F(abstractC2706r0, interfaceC6019m)) {
            return true;
        }
        Iterator it = abstractC2706r0.mo9332T0().mo9546n().iterator();
        while (it.hasNext()) {
            if (m28743I((AbstractC2706r0) it.next(), interfaceC6019m)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static boolean m28744J(InterfaceC6019m interfaceC6019m) {
        return interfaceC6019m != null && (interfaceC6019m.mo7443b() instanceof InterfaceC6023n0);
    }

    /* JADX INFO: renamed from: K */
    public static boolean m28745K(InterfaceC6042t1 interfaceC6042t1, AbstractC2706r0 abstractC2706r0) {
        if (interfaceC6042t1 == null) {
            m28748a(65);
        }
        if (abstractC2706r0 == null) {
            m28748a(66);
        }
        if (interfaceC6042t1.mo12681n0() || AbstractC2718v0.m9643a(abstractC2706r0)) {
            return false;
        }
        if (AbstractC2675i2.m9454b(abstractC2706r0)) {
            return true;
        }
        AbstractC5128i abstractC5128iM35858m = AbstractC9211e.m35858m(interfaceC6042t1);
        if (!AbstractC5128i.m20886t0(abstractC2706r0)) {
            InterfaceC2947f interfaceC2947f = InterfaceC2947f.f7782a;
            if (!interfaceC2947f.mo10841d(abstractC5128iM35858m.m20913X(), abstractC2706r0) && !interfaceC2947f.mo10841d(abstractC5128iM35858m.m20904L().mo7508x(), abstractC2706r0) && !interfaceC2947f.mo10841d(abstractC5128iM35858m.m20920i(), abstractC2706r0) && !C5139t.m20981d(abstractC2706r0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static InterfaceC5986b m28746L(InterfaceC5986b interfaceC5986b) {
        if (interfaceC5986b == null) {
            m28748a(58);
        }
        while (interfaceC5986b.mo12678j() == InterfaceC5986b.a.FAKE_OVERRIDE) {
            Collection collectionMo12674e = interfaceC5986b.mo12674e();
            if (collectionMo12674e.isEmpty()) {
                C6494d0.m25749a("Fake override should have at least one overridden descriptor: ", interfaceC5986b);
                return null;
            }
            interfaceC5986b = (InterfaceC5986b) collectionMo12674e.iterator().next();
        }
        return interfaceC5986b;
    }

    /* JADX INFO: renamed from: M */
    public static InterfaceC6031q m28747M(InterfaceC6031q interfaceC6031q) {
        if (interfaceC6031q == null) {
            m28748a(63);
        }
        if (interfaceC6031q instanceof InterfaceC5986b) {
            return m28746L((InterfaceC5986b) interfaceC6031q);
        }
        if (interfaceC6031q == null) {
            m28748a(64);
        }
        return interfaceC6031q;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m28748a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.LLOAD /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case Opcodes.AALOAD /* 50 */:
            case Opcodes.BALOAD /* 51 */:
            case 52:
            case Opcodes.SALOAD /* 53 */:
            case 59:
            case 61:
            case 62:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 71:
            case 75:
            case 82:
            case Opcodes.AASTORE /* 83 */:
            case Opcodes.CASTORE /* 85 */:
            case Opcodes.POP2 /* 88 */:
            case 93:
            case Opcodes.SWAP /* 95 */:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.LLOAD /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case Opcodes.AALOAD /* 50 */:
            case Opcodes.BALOAD /* 51 */:
            case 52:
            case Opcodes.SALOAD /* 53 */:
            case 59:
            case 61:
            case 62:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 71:
            case 75:
            case 82:
            case Opcodes.AASTORE /* 83 */:
            case Opcodes.CASTORE /* 85 */:
            case Opcodes.POP2 /* 88 */:
            case 93:
            case Opcodes.SWAP /* 95 */:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case Opcodes.FCONST_0 /* 11 */:
            case Opcodes.FCONST_2 /* 13 */:
            case Opcodes.DCONST_0 /* 14 */:
            case 15:
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.FLOAD /* 23 */:
            case Opcodes.DLOAD /* 24 */:
            case 34:
            case 35:
            case 36:
            case Opcodes.DSTORE /* 57 */:
            case Opcodes.ASTORE /* 58 */:
            case 60:
            case 63:
            case 81:
            case 94:
                objArr[0] = "descriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.LLOAD /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case Opcodes.AALOAD /* 50 */:
            case Opcodes.BALOAD /* 51 */:
            case 52:
            case Opcodes.SALOAD /* 53 */:
            case 59:
            case 61:
            case 62:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 71:
            case 75:
            case 82:
            case Opcodes.AASTORE /* 83 */:
            case Opcodes.CASTORE /* 85 */:
            case Opcodes.POP2 /* 88 */:
            case 93:
            case Opcodes.SWAP /* 95 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            case 16:
                objArr[0] = "first";
                break;
            case Opcodes.SIPUSH /* 17 */:
                objArr[0] = "second";
                break;
            case Opcodes.LDC /* 18 */:
            case 19:
                objArr[0] = "aClass";
                break;
            case 20:
                objArr[0] = "kotlinType";
                break;
            case Opcodes.ALOAD /* 25 */:
                objArr[0] = "declarationDescriptor";
                break;
            case 26:
            case 28:
                objArr[0] = "subClass";
                break;
            case 27:
            case 29:
            case 33:
                objArr[0] = "superClass";
                break;
            case 30:
            case 32:
            case 45:
            case 66:
                objArr[0] = "type";
                break;
            case 31:
                objArr[0] = "other";
                break;
            case 37:
                objArr[0] = "classKind";
                break;
            case 38:
            case 39:
            case 41:
            case 44:
            case 48:
            case Opcodes.ISTORE /* 54 */:
            case 67:
            case 68:
            case 69:
            case 76:
            case 77:
                objArr[0] = "classDescriptor";
                break;
            case Opcodes.IALOAD /* 46 */:
                objArr[0] = "typeConstructor";
                break;
            case Opcodes.LSTORE /* 55 */:
                objArr[0] = "innerClassName";
                break;
            case Opcodes.FSTORE /* 56 */:
                objArr[0] = "location";
                break;
            case 65:
                objArr[0] = "variable";
                break;
            case 70:
                objArr[0] = "f";
                break;
            case 72:
                objArr[0] = "current";
                break;
            case 73:
                objArr[0] = "result";
                break;
            case 74:
                objArr[0] = "memberDescriptor";
                break;
            case 78:
            case Opcodes.IASTORE /* 79 */:
            case 80:
                objArr[0] = "annotated";
                break;
            case Opcodes.BASTORE /* 84 */:
            case 86:
            case Opcodes.DUP /* 89 */:
            case 91:
                objArr[0] = "scope";
                break;
            case Opcodes.POP /* 87 */:
            case 90:
            case Opcodes.DUP2 /* 92 */:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getFqNameSafe";
                break;
            case 7:
                objArr[1] = "getFqNameUnsafe";
                break;
            case 9:
            case 10:
                objArr[1] = "getFqNameFromTopLevelClass";
                break;
            case Opcodes.FCONST_1 /* 12 */:
                objArr[1] = "getClassIdForNonLocalClass";
                break;
            case Opcodes.LLOAD /* 22 */:
                objArr[1] = "getContainingModule";
                break;
            case 40:
                objArr[1] = "getSuperclassDescriptors";
                break;
            case 42:
            case 43:
                objArr[1] = "getSuperClassType";
                break;
            case 47:
                objArr[1] = "getClassDescriptorForTypeConstructor";
                break;
            case 49:
            case Opcodes.AALOAD /* 50 */:
            case Opcodes.BALOAD /* 51 */:
            case 52:
            case Opcodes.SALOAD /* 53 */:
                objArr[1] = "getDefaultConstructorVisibility";
                break;
            case 59:
                objArr[1] = "unwrapFakeOverride";
                break;
            case 61:
            case 62:
                objArr[1] = "unwrapSubstitutionOverride";
                break;
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
                objArr[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 71:
                objArr[1] = "getAllOverriddenDescriptors";
                break;
            case 75:
                objArr[1] = "getAllOverriddenDeclarations";
                break;
            case 82:
            case Opcodes.AASTORE /* 83 */:
                objArr[1] = "getContainingSourceFile";
                break;
            case Opcodes.CASTORE /* 85 */:
                objArr[1] = "getAllDescriptors";
                break;
            case Opcodes.POP2 /* 88 */:
                objArr[1] = "getFunctionByName";
                break;
            case 93:
                objArr[1] = "getPropertyByName";
                break;
            case Opcodes.SWAP /* 95 */:
                objArr[1] = "getDirectMember";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
        }
        switch (i10) {
            case 1:
                objArr[2] = "isLocal";
                break;
            case 2:
                objArr[2] = "getFqName";
                break;
            case 3:
                objArr[2] = "getFqNameSafe";
                break;
            case 4:
            case 7:
            case 9:
            case 10:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.LLOAD /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case Opcodes.AALOAD /* 50 */:
            case Opcodes.BALOAD /* 51 */:
            case 52:
            case Opcodes.SALOAD /* 53 */:
            case 59:
            case 61:
            case 62:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 71:
            case 75:
            case 82:
            case Opcodes.AASTORE /* 83 */:
            case Opcodes.CASTORE /* 85 */:
            case Opcodes.POP2 /* 88 */:
            case 93:
            case Opcodes.SWAP /* 95 */:
                break;
            case 5:
                objArr[2] = "getFqNameSafeIfPossible";
                break;
            case 6:
                objArr[2] = "getFqNameUnsafe";
                break;
            case 8:
                objArr[2] = "getFqNameFromTopLevelClass";
                break;
            case Opcodes.FCONST_0 /* 11 */:
                objArr[2] = "getClassIdForNonLocalClass";
                break;
            case Opcodes.FCONST_2 /* 13 */:
                objArr[2] = "isExtension";
                break;
            case Opcodes.DCONST_0 /* 14 */:
                objArr[2] = "isOverride";
                break;
            case 15:
                objArr[2] = "isStaticDeclaration";
                break;
            case 16:
            case Opcodes.SIPUSH /* 17 */:
                objArr[2] = "areInSameModule";
                break;
            case Opcodes.LDC /* 18 */:
            case 19:
                objArr[2] = "getParentOfType";
                break;
            case 20:
            case Opcodes.FLOAD /* 23 */:
                objArr[2] = "getContainingModuleOrNull";
                break;
            case Opcodes.ILOAD /* 21 */:
                objArr[2] = "getContainingModule";
                break;
            case Opcodes.DLOAD /* 24 */:
                objArr[2] = "getContainingClass";
                break;
            case Opcodes.ALOAD /* 25 */:
                objArr[2] = "isAncestor";
                break;
            case 26:
            case 27:
                objArr[2] = "isDirectSubclass";
                break;
            case 28:
            case 29:
                objArr[2] = "isSubclass";
                break;
            case 30:
            case 31:
                objArr[2] = "isSameClass";
                break;
            case 32:
            case 33:
                objArr[2] = "isSubtypeOfClass";
                break;
            case 34:
                objArr[2] = "isAnonymousObject";
                break;
            case 35:
                objArr[2] = "isAnonymousFunction";
                break;
            case 36:
                objArr[2] = "isEnumEntry";
                break;
            case 37:
                objArr[2] = "isKindOf";
                break;
            case 38:
                objArr[2] = "hasAbstractMembers";
                break;
            case 39:
                objArr[2] = "getSuperclassDescriptors";
                break;
            case 41:
                objArr[2] = "getSuperClassType";
                break;
            case 44:
                objArr[2] = "getSuperClassDescriptor";
                break;
            case 45:
                objArr[2] = "getClassDescriptorForType";
                break;
            case Opcodes.IALOAD /* 46 */:
                objArr[2] = "getClassDescriptorForTypeConstructor";
                break;
            case 48:
                objArr[2] = "getDefaultConstructorVisibility";
                break;
            case Opcodes.ISTORE /* 54 */:
            case Opcodes.LSTORE /* 55 */:
            case Opcodes.FSTORE /* 56 */:
                objArr[2] = "getInnerClassByName";
                break;
            case Opcodes.DSTORE /* 57 */:
                objArr[2] = "isStaticNestedClass";
                break;
            case Opcodes.ASTORE /* 58 */:
                objArr[2] = "unwrapFakeOverride";
                break;
            case 60:
                objArr[2] = "unwrapSubstitutionOverride";
                break;
            case 63:
                objArr[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            case 65:
            case 66:
                objArr[2] = "shouldRecordInitializerForProperty";
                break;
            case 67:
                objArr[2] = "classCanHaveAbstractFakeOverride";
                break;
            case 68:
                objArr[2] = "classCanHaveAbstractDeclaration";
                break;
            case 69:
                objArr[2] = "classCanHaveOpenMembers";
                break;
            case 70:
                objArr[2] = "getAllOverriddenDescriptors";
                break;
            case 72:
            case 73:
                objArr[2] = "collectAllOverriddenDescriptors";
                break;
            case 74:
                objArr[2] = "getAllOverriddenDeclarations";
                break;
            case 76:
                objArr[2] = "isSingletonOrAnonymousObject";
                break;
            case 77:
                objArr[2] = "canHaveDeclaredConstructors";
                break;
            case 78:
                objArr[2] = "getJvmName";
                break;
            case Opcodes.IASTORE /* 79 */:
                objArr[2] = "findJvmNameAnnotation";
                break;
            case 80:
                objArr[2] = "hasJvmNameAnnotation";
                break;
            case 81:
                objArr[2] = "getContainingSourceFile";
                break;
            case Opcodes.BASTORE /* 84 */:
                objArr[2] = "getAllDescriptors";
                break;
            case 86:
            case Opcodes.POP /* 87 */:
                objArr[2] = "getFunctionByName";
                break;
            case Opcodes.DUP /* 89 */:
            case 90:
                objArr[2] = "getFunctionByNameOrNull";
                break;
            case 91:
            case Opcodes.DUP2 /* 92 */:
                objArr[2] = "getPropertyByName";
                break;
            case 94:
                objArr[2] = "getDirectMember";
                break;
            default:
                objArr[2] = "getDispatchReceiverParameterIfNeeded";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 7:
            case 9:
            case 10:
            case Opcodes.FCONST_1 /* 12 */:
            case Opcodes.LLOAD /* 22 */:
            case 40:
            case 42:
            case 43:
            case 47:
            case 49:
            case Opcodes.AALOAD /* 50 */:
            case Opcodes.BALOAD /* 51 */:
            case 52:
            case Opcodes.SALOAD /* 53 */:
            case 59:
            case 61:
            case 62:
            case WebSocketProtocol.B0_FLAG_RSV1 /* 64 */:
            case 71:
            case 75:
            case 82:
            case Opcodes.AASTORE /* 83 */:
            case Opcodes.CASTORE /* 85 */:
            case Opcodes.POP2 /* 88 */:
            case 93:
            case Opcodes.SWAP /* 95 */:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m28749b(InterfaceC6019m interfaceC6019m, InterfaceC6019m interfaceC6019m2) {
        if (interfaceC6019m == null) {
            m28748a(16);
        }
        if (interfaceC6019m2 == null) {
            m28748a(17);
        }
        return m28754g(interfaceC6019m).equals(m28754g(interfaceC6019m2));
    }

    /* JADX INFO: renamed from: c */
    public static void m28750c(InterfaceC5983a interfaceC5983a, Set set) {
        if (interfaceC5983a == null) {
            m28748a(72);
        }
        if (set == null) {
            m28748a(73);
        }
        if (set.contains(interfaceC5983a)) {
            return;
        }
        Iterator it = interfaceC5983a.mo12664a().mo12674e().iterator();
        while (it.hasNext()) {
            InterfaceC5983a interfaceC5983aMo12664a = ((InterfaceC5983a) it.next()).mo12664a();
            m28750c(interfaceC5983aMo12664a, set);
            set.add(interfaceC5983aMo12664a);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Set m28751d(InterfaceC5983a interfaceC5983a) {
        if (interfaceC5983a == null) {
            m28748a(70);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m28750c(interfaceC5983a.mo12664a(), linkedHashSet);
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC5995e m28752e(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m28748a(45);
        }
        return m28753f(abstractC2706r0.mo9332T0());
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC5995e m28753f(InterfaceC2716u1 interfaceC2716u1) {
        if (interfaceC2716u1 == null) {
            m28748a(46);
        }
        InterfaceC5995e interfaceC5995e = (InterfaceC5995e) interfaceC2716u1.mo5602u();
        if (interfaceC5995e == null) {
            m28748a(47);
        }
        return interfaceC5995e;
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC6005h0 m28754g(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(21);
        }
        InterfaceC6005h0 interfaceC6005h0M28756i = m28756i(interfaceC6019m);
        if (interfaceC6005h0M28756i == null) {
            m28748a(22);
        }
        return interfaceC6005h0M28756i;
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC6005h0 m28755h(AbstractC2706r0 abstractC2706r0) {
        if (abstractC2706r0 == null) {
            m28748a(20);
        }
        InterfaceC6004h interfaceC6004hMo5602u = abstractC2706r0.mo9332T0().mo5602u();
        if (interfaceC6004hMo5602u == null) {
            return null;
        }
        return m28756i(interfaceC6004hMo5602u);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC6005h0 m28756i(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(23);
        }
        while (interfaceC6019m != null) {
            if (interfaceC6019m instanceof InterfaceC6005h0) {
                return (InterfaceC6005h0) interfaceC6019m;
            }
            if (interfaceC6019m instanceof InterfaceC6044u0) {
                return ((InterfaceC6044u0) interfaceC6019m).mo24099z0();
            }
            interfaceC6019m = interfaceC6019m.mo7443b();
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC6006h1 m28757j(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(81);
        }
        if (interfaceC6019m instanceof InterfaceC5985a1) {
            interfaceC6019m = ((InterfaceC5985a1) interfaceC6019m).mo24109F0();
        }
        if (interfaceC6019m instanceof InterfaceC6028p) {
            InterfaceC6006h1 interfaceC6006h1Mo10689a = ((InterfaceC6028p) interfaceC6019m).getSource().mo10689a();
            if (interfaceC6006h1Mo10689a == null) {
                m28748a(82);
            }
            return interfaceC6006h1Mo10689a;
        }
        InterfaceC6006h1 interfaceC6006h1 = InterfaceC6006h1.f18959a;
        if (interfaceC6006h1 == null) {
            m28748a(83);
        }
        return interfaceC6006h1;
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC6043u m28758k(InterfaceC5995e interfaceC5995e, boolean z10) {
        if (interfaceC5995e == null) {
            m28748a(48);
        }
        EnumC5998f enumC5998fMo5588j = interfaceC5995e.mo5588j();
        if (enumC5998fMo5588j == EnumC5998f.f18950t || enumC5998fMo5588j.m24010c()) {
            AbstractC6043u abstractC6043u = AbstractC6040t.f18982a;
            if (abstractC6043u == null) {
                m28748a(49);
            }
            return abstractC6043u;
        }
        if (m28741G(interfaceC5995e)) {
            if (z10) {
                AbstractC6043u abstractC6043u2 = AbstractC6040t.f18984c;
                if (abstractC6043u2 == null) {
                    m28748a(50);
                }
                return abstractC6043u2;
            }
            AbstractC6043u abstractC6043u3 = AbstractC6040t.f18982a;
            if (abstractC6043u3 == null) {
                m28748a(51);
            }
            return abstractC6043u3;
        }
        if (m28768u(interfaceC5995e)) {
            AbstractC6043u abstractC6043u4 = AbstractC6040t.f18993l;
            if (abstractC6043u4 == null) {
                m28748a(52);
            }
            return abstractC6043u4;
        }
        AbstractC6043u abstractC6043u5 = AbstractC6040t.f18986e;
        if (abstractC6043u5 == null) {
            m28748a(53);
        }
        return abstractC6043u5;
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC5988b1 m28759l(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(0);
        }
        if (interfaceC6019m instanceof InterfaceC5995e) {
            return ((InterfaceC5995e) interfaceC6019m).mo23999P0();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static C5693d m28760m(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(2);
        }
        C5692c c5692cM28762o = m28762o(interfaceC6019m);
        return c5692cM28762o != null ? c5692cM28762o.m23002i() : m28763p(interfaceC6019m);
    }

    /* JADX INFO: renamed from: n */
    public static C5692c m28761n(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(3);
        }
        C5692c c5692cM28762o = m28762o(interfaceC6019m);
        if (c5692cM28762o == null) {
            c5692cM28762o = m28763p(interfaceC6019m).m23016m();
        }
        if (c5692cM28762o == null) {
            m28748a(4);
        }
        return c5692cM28762o;
    }

    /* JADX INFO: renamed from: o */
    public static C5692c m28762o(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(5);
        }
        if ((interfaceC6019m instanceof InterfaceC6005h0) || C3381l.m12704m(interfaceC6019m)) {
            return C5692c.f17899d;
        }
        if (interfaceC6019m instanceof InterfaceC6044u0) {
            return ((InterfaceC6044u0) interfaceC6019m).mo24097d();
        }
        if (interfaceC6019m instanceof InterfaceC6023n0) {
            return ((InterfaceC6023n0) interfaceC6019m).mo24031d();
        }
        return null;
    }

    /* JADX INFO: renamed from: p */
    public static C5693d m28763p(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(6);
        }
        C5693d c5693dM23006b = m28760m(interfaceC6019m.mo7443b()).m23006b(interfaceC6019m.getName());
        if (c5693dM23006b == null) {
            m28748a(7);
        }
        return c5693dM23006b;
    }

    /* JADX INFO: renamed from: q */
    public static InterfaceC6019m m28764q(InterfaceC6019m interfaceC6019m, Class cls) {
        if (cls == null) {
            m28748a(18);
        }
        return m28765r(interfaceC6019m, cls, true);
    }

    /* JADX INFO: renamed from: r */
    public static InterfaceC6019m m28765r(InterfaceC6019m interfaceC6019m, Class cls, boolean z10) {
        if (cls == null) {
            m28748a(19);
        }
        if (interfaceC6019m == null) {
            return null;
        }
        if (z10) {
            interfaceC6019m = interfaceC6019m.mo7443b();
        }
        while (interfaceC6019m != null) {
            if (cls.isInstance(interfaceC6019m)) {
                return interfaceC6019m;
            }
            interfaceC6019m = interfaceC6019m.mo7443b();
        }
        return null;
    }

    /* JADX INFO: renamed from: s */
    public static InterfaceC5995e m28766s(InterfaceC5995e interfaceC5995e) {
        if (interfaceC5995e == null) {
            m28748a(44);
        }
        Iterator it = interfaceC5995e.mo5591o().mo9546n().iterator();
        while (it.hasNext()) {
            InterfaceC5995e interfaceC5995eM28752e = m28752e((AbstractC2706r0) it.next());
            if (interfaceC5995eM28752e.mo5588j() != EnumC5998f.f18949s) {
                return interfaceC5995eM28752e;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m28767t(InterfaceC6019m interfaceC6019m) {
        return m28738D(interfaceC6019m, EnumC5998f.f18952v);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m28768u(InterfaceC6019m interfaceC6019m) {
        if (interfaceC6019m == null) {
            m28748a(34);
        }
        return m28769v(interfaceC6019m) && interfaceC6019m.getName().equals(C5697h.f17916b);
    }

    /* JADX INFO: renamed from: v */
    public static boolean m28769v(InterfaceC6019m interfaceC6019m) {
        return m28738D(interfaceC6019m, EnumC5998f.f18948r);
    }

    /* JADX INFO: renamed from: w */
    public static boolean m28770w(InterfaceC6019m interfaceC6019m) {
        return m28769v(interfaceC6019m) || m28735A(interfaceC6019m);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m28771x(InterfaceC6019m interfaceC6019m) {
        return m28738D(interfaceC6019m, EnumC5998f.f18953w) && ((InterfaceC5995e) interfaceC6019m).mo5568D();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m28772y(InterfaceC6019m interfaceC6019m) {
        return (interfaceC6019m instanceof InterfaceC6031q) && ((InterfaceC6031q) interfaceC6019m).mo5587g() == AbstractC6040t.f18987f;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m28773z(InterfaceC5995e interfaceC5995e, InterfaceC5995e interfaceC5995e2) {
        if (interfaceC5995e == null) {
            m28748a(26);
        }
        if (interfaceC5995e2 == null) {
            m28748a(27);
        }
        Iterator it = interfaceC5995e.mo5591o().mo9546n().iterator();
        while (it.hasNext()) {
            if (m28740F((AbstractC2706r0) it.next(), interfaceC5995e2.mo12664a())) {
                return true;
            }
        }
        return false;
    }
}
