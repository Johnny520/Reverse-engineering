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
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends AbstractC4713 implements Serializable {
    public GeneratedMessageLite() {
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(strValueOf.length() + name.length() + 45);
            AbstractC6183.m11577(sb, "Generated message class \"", name, "\" missing method \"", strValueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            C0276.m848("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C0276.m848("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static <ContainingType extends InterfaceC4701, Type> C4725 newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC4701 interfaceC4701, InterfaceC4723 interfaceC4723, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class cls) {
        return new C4725(containingtype, Collections.EMPTY_LIST, interfaceC4701, new C4724(interfaceC4723, i, wireFormat$FieldType, true, z), cls);
    }

    public static <ContainingType extends InterfaceC4701, Type> C4725 newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC4701 interfaceC4701, InterfaceC4723 interfaceC4723, int i, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new C4725(containingtype, type, interfaceC4701, new C4724(interfaceC4723, i, wireFormat$FieldType, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701> boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.C4731 r7, MessageType r8, kotlin.reflect.jvm.internal.impl.protobuf.C4709 r9, kotlin.reflect.jvm.internal.impl.protobuf.C4708 r10, kotlin.reflect.jvm.internal.impl.protobuf.C4726 r11, int r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏哲兰世, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪苏哲兰, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰苏哲, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪世兰哲苏, kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪苏世兰哲, int):boolean");
    }

    public abstract /* synthetic */ InterfaceC4701 getDefaultInstanceForType();

    public InterfaceC4699 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public abstract /* synthetic */ int getSerializedSize();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public abstract /* synthetic */ boolean isInitialized();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public abstract /* synthetic */ InterfaceC4717 newBuilderForType();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public abstract /* synthetic */ InterfaceC4717 toBuilder();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public abstract /* synthetic */ void writeTo(C4708 c4708);

    public GeneratedMessageLite(AbstractC4729 abstractC4729) {
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements InterfaceC4700 {
        private final C4731 extensions;

        public ExtendableMessage(AbstractC4721 abstractC4721) {
            abstractC4721.f13791.m9421();
            abstractC4721.f13792 = false;
            this.extensions = abstractC4721.f13791;
        }

        private void verifyExtensionContainingType(C4725 c4725) {
            if (c4725.f13802 == getDefaultInstanceForType()) {
                return;
            }
            C5925.m11310("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public boolean extensionsAreInitialized() {
            C4696 c4696 = this.extensions.f13813;
            int i = 0;
            while (true) {
                if (i >= c4696.f13744.size()) {
                    Iterator it = c4696.m9343().iterator();
                    while (it.hasNext()) {
                        if (!C4731.m9415((Map.Entry) it.next())) {
                        }
                    }
                    return true;
                }
                if (!C4731.m9415((Map.Entry) c4696.f13744.get(i))) {
                    break;
                }
                i++;
            }
            return false;
        }

        public int extensionsSerializedSize() {
            C4696 c4696 = this.extensions.f13813;
            int iM9416 = 0;
            for (int i = 0; i < c4696.f13744.size(); i++) {
                Map.Entry entry = (Map.Entry) c4696.f13744.get(i);
                iM9416 += C4731.m9416((C4724) entry.getKey(), entry.getValue());
            }
            for (Map.Entry entry2 : c4696.m9343()) {
                iM9416 += C4731.m9416((C4724) entry2.getKey(), entry2.getValue());
            }
            return iM9416;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public abstract /* synthetic */ InterfaceC4701 getDefaultInstanceForType();

        /* JADX WARN: Type inference failed for: r0v4, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(C4725 c4725) {
            verifyExtensionContainingType(c4725);
            C4731 c4731 = this.extensions;
            Type type = (Type) c4731.f13813.get(c4725.f13799);
            if (type == null) {
                return (Type) c4725.f13801;
            }
            C4724 c4724 = c4725.f13799;
            if (!c4724.f13794) {
                return (Type) c4725.m9413(type);
            }
            if (c4724.f13796.getJavaType() != WireFormat$JavaType.ENUM) {
                return type;
            }
            ?? r0 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r0.add(c4725.m9413(it.next()));
            }
            return r0;
        }

        public final <Type> int getExtensionCount(C4725 c4725) {
            verifyExtensionContainingType(c4725);
            C4731 c4731 = this.extensions;
            C4724 c4724 = c4725.f13799;
            c4731.getClass();
            if (!c4724.f13794) {
                C5925.m11310("getRepeatedField() can only be called on repeated fields.");
                return 0;
            }
            Object obj = c4731.f13813.get(c4724);
            if (obj == null) {
                return 0;
            }
            return ((List) obj).size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public abstract /* synthetic */ int getSerializedSize();

        public final <Type> boolean hasExtension(C4725 c4725) {
            verifyExtensionContainingType(c4725);
            C4731 c4731 = this.extensions;
            C4724 c4724 = c4725.f13799;
            c4731.getClass();
            if (!c4724.f13794) {
                return c4731.f13813.get(c4724) != null;
            }
            C5925.m11310("hasField() can only be called on non-repeated fields.");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public abstract /* synthetic */ boolean isInitialized();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.extensions.m9421();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public abstract /* synthetic */ InterfaceC4717 newBuilderForType();

        public C4720 newExtensionWriter() {
            return new C4720(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(C4709 c4709, C4708 c4708, C4726 c4726, int i) {
            return GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), c4709, c4708, c4726, i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public abstract /* synthetic */ InterfaceC4717 toBuilder();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public abstract /* synthetic */ void writeTo(C4708 c4708);

        public ExtendableMessage() {
            this.extensions = new C4731();
        }

        public final <Type> Type getExtension(C4725 c4725, int i) {
            verifyExtensionContainingType(c4725);
            C4731 c4731 = this.extensions;
            C4724 c4724 = c4725.f13799;
            c4731.getClass();
            if (c4724.f13794) {
                Object obj = c4731.f13813.get(c4724);
                if (obj != null) {
                    return (Type) c4725.m9413(((List) obj).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            C5925.m11310("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
    }

    public void makeExtensionsImmutable() {
    }

    public boolean parseUnknownField(C4709 c4709, C4708 c4708, C4726 c4726, int i) {
        return c4709.m9391(i, c4708);
    }
}
