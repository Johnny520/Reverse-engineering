package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C0276;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends AbstractC4712 implements Serializable {
    public GeneratedMessageLite() {
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(strValueOf.length() + name.length() + 45);
            AbstractC6136.m11530(sb, "Generated message class \"", name, "\" missing method \"", strValueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            C0276.m847("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C0276.m847("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static <ContainingType extends InterfaceC4700, Type> C4724 newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC4700 interfaceC4700, InterfaceC4722 interfaceC4722, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class cls) {
        return new C4724(containingtype, Collections.EMPTY_LIST, interfaceC4700, new C4723(interfaceC4722, i, wireFormat$FieldType, true, z), cls);
    }

    public static <ContainingType extends InterfaceC4700, Type> C4724 newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC4700 interfaceC4700, InterfaceC4722 interfaceC4722, int i, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new C4724(containingtype, type, interfaceC4700, new C4723(interfaceC4722, i, wireFormat$FieldType, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700> boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.C4730 r7, MessageType r8, kotlin.reflect.jvm.internal.impl.protobuf.C4708 r9, kotlin.reflect.jvm.internal.impl.protobuf.C4707 r10, kotlin.reflect.jvm.internal.impl.protobuf.C4725 r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏哲兰世, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰哲苏, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲, int):boolean");
    }

    public abstract /* synthetic */ InterfaceC4700 getDefaultInstanceForType();

    public InterfaceC4698 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public abstract /* synthetic */ int getSerializedSize();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
    public abstract /* synthetic */ boolean isInitialized();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public abstract /* synthetic */ InterfaceC4716 newBuilderForType();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public abstract /* synthetic */ InterfaceC4716 toBuilder();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public abstract /* synthetic */ void writeTo(C4707 c4707);

    public GeneratedMessageLite(AbstractC4728 abstractC4728) {
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements InterfaceC4699 {
        private final C4730 extensions;

        public ExtendableMessage(AbstractC4720 abstractC4720) {
            abstractC4720.f13787.m9431();
            abstractC4720.f13788 = false;
            this.extensions = abstractC4720.f13787;
        }

        private void verifyExtensionContainingType(C4724 c4724) {
            if (c4724.f13798 == getDefaultInstanceForType()) {
                return;
            }
            C5919.m11249("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public boolean extensionsAreInitialized() {
            C4695 c4695 = this.extensions.f13809;
            int i = 0;
            while (true) {
                if (i >= c4695.f13740.size()) {
                    Iterator it = c4695.m9353().iterator();
                    while (it.hasNext()) {
                        if (!C4730.m9425((Map.Entry) it.next())) {
                        }
                    }
                    return true;
                }
                if (!C4730.m9425((Map.Entry) c4695.f13740.get(i))) {
                    break;
                }
                i++;
            }
            return false;
        }

        public int extensionsSerializedSize() {
            C4695 c4695 = this.extensions.f13809;
            int iM9426 = 0;
            for (int i = 0; i < c4695.f13740.size(); i++) {
                Map.Entry entry = (Map.Entry) c4695.f13740.get(i);
                iM9426 += C4730.m9426((C4723) entry.getKey(), entry.getValue());
            }
            for (Map.Entry entry2 : c4695.m9353()) {
                iM9426 += C4730.m9426((C4723) entry2.getKey(), entry2.getValue());
            }
            return iM9426;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public abstract /* synthetic */ InterfaceC4700 getDefaultInstanceForType();

        /* JADX WARN: Type inference failed for: r0v4, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(C4724 c4724) {
            verifyExtensionContainingType(c4724);
            C4730 c4730 = this.extensions;
            Type type = (Type) c4730.f13809.get(c4724.f13795);
            if (type == null) {
                return (Type) c4724.f13797;
            }
            C4723 c4723 = c4724.f13795;
            if (!c4723.f13790) {
                return (Type) c4724.m9423(type);
            }
            if (c4723.f13792.getJavaType() != WireFormat$JavaType.ENUM) {
                return type;
            }
            ?? r0 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r0.add(c4724.m9423(it.next()));
            }
            return r0;
        }

        public final <Type> int getExtensionCount(C4724 c4724) {
            verifyExtensionContainingType(c4724);
            C4730 c4730 = this.extensions;
            C4723 c4723 = c4724.f13795;
            c4730.getClass();
            if (!c4723.f13790) {
                C5919.m11249("getRepeatedField() can only be called on repeated fields.");
                return 0;
            }
            Object obj = c4730.f13809.get(c4723);
            if (obj == null) {
                return 0;
            }
            return ((List) obj).size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public abstract /* synthetic */ int getSerializedSize();

        public final <Type> boolean hasExtension(C4724 c4724) {
            verifyExtensionContainingType(c4724);
            C4730 c4730 = this.extensions;
            C4723 c4723 = c4724.f13795;
            c4730.getClass();
            if (!c4723.f13790) {
                return c4730.f13809.get(c4723) != null;
            }
            C5919.m11249("hasField() can only be called on non-repeated fields.");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
        public abstract /* synthetic */ boolean isInitialized();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.extensions.m9431();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public abstract /* synthetic */ InterfaceC4716 newBuilderForType();

        public C4719 newExtensionWriter() {
            return new C4719(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(C4708 c4708, C4707 c4707, C4725 c4725, int i) {
            return GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), c4708, c4707, c4725, i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public abstract /* synthetic */ InterfaceC4716 toBuilder();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public abstract /* synthetic */ void writeTo(C4707 c4707);

        public ExtendableMessage() {
            this.extensions = new C4730();
        }

        public final <Type> Type getExtension(C4724 c4724, int i) {
            verifyExtensionContainingType(c4724);
            C4730 c4730 = this.extensions;
            C4723 c4723 = c4724.f13795;
            c4730.getClass();
            if (c4723.f13790) {
                Object obj = c4730.f13809.get(c4723);
                if (obj != null) {
                    return (Type) c4724.m9423(((List) obj).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            C5919.m11249("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
    }

    public void makeExtensionsImmutable() {
    }

    public boolean parseUnknownField(C4708 c4708, C4707 c4707, C4725 c4725, int i) {
        return c4708.m9401(i, c4707);
    }
}
