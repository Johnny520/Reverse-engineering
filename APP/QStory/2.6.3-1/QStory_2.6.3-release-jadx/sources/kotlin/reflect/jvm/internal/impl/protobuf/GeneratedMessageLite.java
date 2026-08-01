package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.collection.C1123;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class GeneratedMessageLite extends AbstractC5545 implements Serializable {
    public GeneratedMessageLite() {
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(strValueOf.length() + name.length() + 45);
            AbstractC7012.m12136(sb, "Generated message class \"", name, "\" missing method \"", strValueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            C1123.m1408("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C1123.m1408("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static <ContainingType extends InterfaceC5533, Type> C5557 newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC5533 interfaceC5533, InterfaceC5555 interfaceC5555, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class cls) {
        return new C5557(containingtype, Collections.EMPTY_LIST, interfaceC5533, new C5556(interfaceC5555, i, wireFormat$FieldType, true, z), cls);
    }

    public static <ContainingType extends InterfaceC5533, Type> C5557 newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC5533 interfaceC5533, InterfaceC5555 interfaceC5555, int i, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new C5557(containingtype, type, interfaceC5533, new C5556(interfaceC5555, i, wireFormat$FieldType, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <MessageType extends InterfaceC5533> boolean parseUnknownField(C5563 c5563, MessageType messagetype, C5541 c5541, C5540 c5540, C5558 c5558, int i) throws IOException {
        boolean z;
        Object objBuild;
        InterfaceC5533 interfaceC5533;
        int i2 = i & 7;
        C5557 c5557 = (C5557) c5558.f14149.get(new C5559(messagetype, i >>> 3));
        boolean z2 = false;
        if (c5557 == null) {
            z = false;
            z2 = true;
        } else {
            C5556 c5556 = c5557.f14144;
            WireFormat$FieldType wireFormat$FieldType = c5556.f14141;
            C5563 c55632 = C5563.f14156;
            if (i2 == wireFormat$FieldType.getWireType()) {
                z = false;
            } else if (c5556.f14139 && c5556.f14141.isPackable() && i2 == 2) {
                z = true;
            }
        }
        if (z2) {
            return c5541.m9950(i, c5540);
        }
        if (z) {
            int iM9942 = c5541.m9942(c5541.m9956());
            C5556 c55562 = c5557.f14144;
            if (c55562.f14141 == WireFormat$FieldType.ENUM) {
                while (c5541.m9944() > 0) {
                    InterfaceC5554 interfaceC5554Mo9826 = c55562.f14142.mo9826(c5541.m9956());
                    if (interfaceC5554Mo9826 == null) {
                        return true;
                    }
                    c5563.m9982(c55562, c5557.m9971(interfaceC5554Mo9826));
                }
            } else {
                while (c5541.m9944() > 0) {
                    c5563.m9982(c55562, C5563.m9977(c5541, c55562.f14141));
                }
            }
            c5541.m9943(iM9942);
            return true;
        }
        int[] iArr = AbstractC5560.f14152;
        C5556 c55563 = c5557.f14144;
        int i3 = iArr[c55563.f14141.getJavaType().ordinal()];
        if (i3 == 1) {
            InterfaceC5549 builder = (c55563.f14139 || (interfaceC5533 = (InterfaceC5533) c5563.f14158.get(c55563)) == null) ? null : interfaceC5533.toBuilder();
            if (builder == null) {
                builder = c5557.f14145.newBuilderForType();
            }
            if (c55563.f14141 == WireFormat$FieldType.GROUP) {
                int i4 = c55563.f14140;
                int i5 = c5541.f14118;
                if (i5 >= 64) {
                    throw InvalidProtocolBufferException.recursionLimitExceeded();
                }
                c5541.f14118 = i5 + 1;
                builder.mo9830(c5541, c5558);
                if (c5541.f14110 != ((i4 << 3) | 4)) {
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                c5541.f14118--;
            } else {
                int iM9956 = c5541.m9956();
                if (c5541.f14118 >= 64) {
                    throw InvalidProtocolBufferException.recursionLimitExceeded();
                }
                int iM99422 = c5541.m9942(iM9956);
                c5541.f14118++;
                builder.mo9830(c5541, c5558);
                if (c5541.f14110 != 0) {
                    throw InvalidProtocolBufferException.invalidEndTag();
                }
                c5541.f14118--;
                c5541.m9943(iM99422);
            }
            objBuild = builder.build();
        } else if (i3 != 2) {
            objBuild = C5563.m9977(c5541, c55563.f14141);
        } else {
            int iM99562 = c5541.m9956();
            InterfaceC5554 interfaceC5554Mo98262 = c55563.f14142.mo9826(iM99562);
            if (interfaceC5554Mo98262 == null) {
                c5540.m9925(i);
                c5540.m9925(iM99562);
                return true;
            }
            objBuild = interfaceC5554Mo98262;
        }
        if (c55563.f14139) {
            c5563.m9982(c55563, c5557.m9971(objBuild));
            return true;
        }
        c5563.m9984(c55563, c5557.m9971(objBuild));
        return true;
    }

    public abstract /* synthetic */ InterfaceC5533 getDefaultInstanceForType();

    public InterfaceC5531 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public abstract /* synthetic */ int getSerializedSize();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
    public abstract /* synthetic */ boolean isInitialized();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public abstract /* synthetic */ InterfaceC5549 newBuilderForType();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public abstract /* synthetic */ InterfaceC5549 toBuilder();

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public abstract /* synthetic */ void writeTo(C5540 c5540);

    public GeneratedMessageLite(AbstractC5561 abstractC5561) {
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements InterfaceC5532 {
        private final C5563 extensions;

        public ExtendableMessage(AbstractC5553 abstractC5553) {
            abstractC5553.f14136.m9980();
            abstractC5553.f14137 = false;
            this.extensions = abstractC5553.f14136;
        }

        private void verifyExtensionContainingType(C5557 c5557) {
            if (c5557.f14147 == getDefaultInstanceForType()) {
                return;
            }
            C6755.m11869("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public boolean extensionsAreInitialized() {
            C5528 c5528 = this.extensions.f14158;
            int i = 0;
            while (true) {
                if (i >= c5528.f14089.size()) {
                    Iterator it = c5528.m9902().iterator();
                    while (it.hasNext()) {
                        if (!C5563.m9974((Map.Entry) it.next())) {
                        }
                    }
                    return true;
                }
                if (!C5563.m9974((Map.Entry) c5528.f14089.get(i))) {
                    break;
                }
                i++;
            }
            return false;
        }

        public int extensionsSerializedSize() {
            C5528 c5528 = this.extensions.f14158;
            int iM9975 = 0;
            for (int i = 0; i < c5528.f14089.size(); i++) {
                Map.Entry entry = (Map.Entry) c5528.f14089.get(i);
                iM9975 += C5563.m9975((C5556) entry.getKey(), entry.getValue());
            }
            for (Map.Entry entry2 : c5528.m9902()) {
                iM9975 += C5563.m9975((C5556) entry2.getKey(), entry2.getValue());
            }
            return iM9975;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public abstract /* synthetic */ InterfaceC5533 getDefaultInstanceForType();

        /* JADX WARN: Type inference failed for: r0v4, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(C5557 c5557) {
            verifyExtensionContainingType(c5557);
            C5563 c5563 = this.extensions;
            Type type = (Type) c5563.f14158.get(c5557.f14144);
            if (type == null) {
                return (Type) c5557.f14146;
            }
            C5556 c5556 = c5557.f14144;
            if (!c5556.f14139) {
                return (Type) c5557.m9972(type);
            }
            if (c5556.f14141.getJavaType() != WireFormat$JavaType.ENUM) {
                return type;
            }
            ?? r0 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r0.add(c5557.m9972(it.next()));
            }
            return r0;
        }

        public final <Type> int getExtensionCount(C5557 c5557) {
            verifyExtensionContainingType(c5557);
            C5563 c5563 = this.extensions;
            C5556 c5556 = c5557.f14144;
            c5563.getClass();
            if (!c5556.f14139) {
                C6755.m11869("getRepeatedField() can only be called on repeated fields.");
                return 0;
            }
            Object obj = c5563.f14158.get(c5556);
            if (obj == null) {
                return 0;
            }
            return ((List) obj).size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public abstract /* synthetic */ int getSerializedSize();

        public final <Type> boolean hasExtension(C5557 c5557) {
            verifyExtensionContainingType(c5557);
            C5563 c5563 = this.extensions;
            C5556 c5556 = c5557.f14144;
            c5563.getClass();
            if (!c5556.f14139) {
                return c5563.f14158.get(c5556) != null;
            }
            C6755.m11869("hasField() can only be called on non-repeated fields.");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
        public abstract /* synthetic */ boolean isInitialized();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.extensions.m9980();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public abstract /* synthetic */ InterfaceC5549 newBuilderForType();

        public C5552 newExtensionWriter() {
            return new C5552(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(C5541 c5541, C5540 c5540, C5558 c5558, int i) {
            return GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), c5541, c5540, c5558, i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public abstract /* synthetic */ InterfaceC5549 toBuilder();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public abstract /* synthetic */ void writeTo(C5540 c5540);

        public ExtendableMessage() {
            this.extensions = new C5563();
        }

        public final <Type> Type getExtension(C5557 c5557, int i) {
            verifyExtensionContainingType(c5557);
            C5563 c5563 = this.extensions;
            C5556 c5556 = c5557.f14144;
            c5563.getClass();
            if (c5556.f14139) {
                Object obj = c5563.f14158.get(c5556);
                if (obj != null) {
                    return (Type) c5557.m9972(((List) obj).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            C6755.m11869("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
    }

    public void makeExtensionsImmutable() {
    }

    public boolean parseUnknownField(C5541 c5541, C5540 c5540, C5558 c5558, int i) {
        return c5541.m9950(i, c5540);
    }
}
