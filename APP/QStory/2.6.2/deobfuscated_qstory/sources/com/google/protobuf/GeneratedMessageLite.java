package com.google.protobuf;

import androidx.collection.C0276;
import bsh.C2632;
import com.alibaba.fastjson2.C2941;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p007.AbstractC6136;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite extends AbstractC3528 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C3706 unknownFields = C3706.f11511;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        public SerializedForm(InterfaceC3440 interfaceC3440) {
            this.messageClass = interfaceC3440.getClass();
            this.messageClassName = interfaceC3440.getClass().getName();
            this.asBytes = interfaceC3440.toByteArray();
        }

        public static SerializedForm of(InterfaceC3440 interfaceC3440) {
            return new SerializedForm(interfaceC3440);
        }

        private Class<?> resolveMessageClass() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            if (cls != null) {
                return cls;
            }
            Class<?> cls2 = Class.forName(this.messageClassName, false, SerializedForm.class.getClassLoader());
            if (InterfaceC3440.class.isAssignableFrom(cls2)) {
                return cls2;
            }
            throw new ClassNotFoundException();
        }

        public Object readResolve() {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                InterfaceC3449 interfaceC3449NewBuilderForType = ((InterfaceC3440) declaredField.get(null)).newBuilderForType();
                interfaceC3449NewBuilderForType.mergeFrom(this.asBytes);
                return interfaceC3449NewBuilderForType.buildPartial();
            } catch (InvalidProtocolBufferException e) {
                C0276.m847("Unable to understand proto buffer", e);
                return null;
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                C0276.m847("Unable to call parsePartialFrom", e3);
                return null;
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find DEFAULT_INSTANCE in " + this.messageClassName, e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends AbstractC3305, BuilderType, T> C3602 checkIsLite(AbstractC3581 abstractC3581) {
        if (abstractC3581.mo7806()) {
            return (C3602) abstractC3581;
        }
        C5919.m11249("Expected a lite extension.");
        return null;
    }

    private static <T extends GeneratedMessageLite> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    private int computeSerializedSize(InterfaceC3344 interfaceC3344) {
        if (interfaceC3344 != null) {
            return interfaceC3344.mo7412(this);
        }
        C3371 c3371 = C3371.f11013;
        c3371.getClass();
        return c3371.m7493(getClass()).mo7412(this);
    }

    public static InterfaceC3611 emptyBooleanList() {
        return C3534.f11172;
    }

    public static InterfaceC3399 emptyDoubleList() {
        return C3590.f11205;
    }

    public static InterfaceC3395 emptyFloatList() {
        return C3638.f11304;
    }

    public static InterfaceC3394 emptyIntList() {
        return C3612.f11244;
    }

    public static InterfaceC3403 emptyLongList() {
        return C3429.f11087;
    }

    public static <E> InterfaceC3402 emptyProtobufList() {
        return C3379.f11022;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C3706.f11511) {
            this.unknownFields = new C3706();
        }
    }

    public static <T extends GeneratedMessageLite> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                C8796.m14449("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) AbstractC3725.m8002(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            defaultInstanceMap.put((Class<?>) cls, t2);
            return t2;
        }
        C2632.m5296();
        return null;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends GeneratedMessageLite> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C3371 c3371 = C3371.f11013;
        c3371.getClass();
        boolean zMo7406 = c3371.m7493(t.getClass()).mo7406(t);
        if (z) {
            t.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zMo7406 ? t : null, null);
        }
        return zMo7406;
    }

    public static InterfaceC3394 mutableCopy(InterfaceC3394 interfaceC3394) {
        return ((C3612) interfaceC3394).mo7499(((C3612) interfaceC3394).f11247 * 2);
    }

    public static Object newMessageInfo(InterfaceC3440 interfaceC3440, String str, Object[] objArr) {
        return new C3377(interfaceC3440, str, objArr);
    }

    public static <ContainingType extends InterfaceC3440, Type> C3602 newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC3440 interfaceC3440, InterfaceC3397 interfaceC3397, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class<?> cls) {
        return new C3602(containingtype, C3379.f11022, interfaceC3440, new C3601(interfaceC3397, i, wireFormat$FieldType, true, z));
    }

    public static <ContainingType extends InterfaceC3440, Type> C3602 newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC3440 interfaceC3440, InterfaceC3397 interfaceC3397, int i, WireFormat$FieldType wireFormat$FieldType, Class<?> cls) {
        return new C3602(containingtype, type, interfaceC3440, new C3601(interfaceC3397, i, wireFormat$FieldType, false, false));
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C3696.m7960()));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialFrom(t, AbstractC3473.m7708(inputStream), C3696.m7960()));
    }

    private static <T extends GeneratedMessageLite> T parsePartialDelimitedFrom(T t, InputStream inputStream, C3696 c3696) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            AbstractC3473 abstractC3473M7708 = AbstractC3473.m7708(new C3530(inputStream, AbstractC3473.m7703(inputStream, i), 0));
            T t2 = (T) parsePartialFrom(t, abstractC3473M7708, c3696);
            try {
                abstractC3473M7708.mo7725(0);
                return t2;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (InvalidProtocolBufferException e2) {
            if (e2.getThrownFromInputStream()) {
                throw new InvalidProtocolBufferException((IOException) e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3);
        }
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, AbstractC3473 abstractC3473, C3696 c3696) throws InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            C3371 c3371 = C3371.f11013;
            c3371.getClass();
            InterfaceC3344 interfaceC3344M7493 = c3371.m7493(t2.getClass());
            C3463 c3463 = abstractC3473.f11148;
            if (c3463 == null) {
                c3463 = new C3463(abstractC3473);
            }
            interfaceC3344M7493.mo7405(t2, c3463, c3696);
            interfaceC3344M7493.mo7407(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends GeneratedMessageLite> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO, null, null);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        C3371 c3371 = C3371.f11013;
        c3371.getClass();
        return c3371.m7493(getClass()).mo7411(this);
    }

    public final <MessageType2 extends GeneratedMessageLite, BuilderType2 extends AbstractC3606> BuilderType2 createBuilder() {
        if (dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null) == null) {
            return null;
        }
        C2941.m6336();
        return null;
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3371 c3371 = C3371.f11013;
        c3371.getClass();
        return c3371.m7493(getClass()).mo7410(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE, null, null);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC3528
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public final InterfaceC3374 getParserForType() {
        return (InterfaceC3374) dynamicMethod(MethodToInvoke.GET_PARSER, null, null);
    }

    @Override // com.google.protobuf.AbstractC3528
    public int getSerializedSize(InterfaceC3344 interfaceC3344) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(interfaceC3344);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            C5919.m11250(AbstractC6136.m11556(iComputeSerializedSize, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(interfaceC3344);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void makeImmutable() {
        C3371 c3371 = C3371.f11013;
        c3371.getClass();
        c3371.m7493(getClass()).mo7407(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        C3706 c3706 = this.unknownFields;
        c3706.m7969();
        if (i != 0) {
            c3706.m7965((i << 3) | 2, byteString);
        } else {
            C5919.m11249("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(C3706 c3706) {
        this.unknownFields = C3706.m7964(this.unknownFields, c3706);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        C3706 c3706 = this.unknownFields;
        c3706.m7969();
        if (i != 0) {
            c3706.m7965(i << 3, Long.valueOf(i2));
        } else {
            C5919.m11249("Zero is not a valid field number.");
        }
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public final AbstractC3606 newBuilderForType() {
        if (dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null) == null) {
            return null;
        }
        C2941.m6336();
        return null;
    }

    public GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE, null, null);
    }

    public boolean parseUnknownField(int i, AbstractC3473 abstractC3473) {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.m7966(i, abstractC3473);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // com.google.protobuf.AbstractC3528
    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            C5919.m11250(AbstractC6136.m11556(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public final AbstractC3606 toBuilder() {
        dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null).getClass();
        throw new ClassCastException();
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = AbstractC3442.f11117;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC3442.m7622(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        C3371 c3371 = C3371.f11013;
        c3371.getClass();
        InterfaceC3344 interfaceC3344M7493 = c3371.m7493(getClass());
        C3426 c3426 = abstractC3461.f11125;
        if (c3426 == null) {
            c3426 = new C3426(abstractC3461);
        }
        interfaceC3344M7493.mo7408(this, c3426);
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream, C3696 c3696) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, c3696));
    }

    public static InterfaceC3403 mutableCopy(InterfaceC3403 interfaceC3403) {
        return ((C3429) interfaceC3403).mo7499(((C3429) interfaceC3403).f11090 * 2);
    }

    public final <MessageType2 extends GeneratedMessageLite, BuilderType2 extends AbstractC3606> BuilderType2 createBuilder(MessageType2 messagetype2) {
        createBuilder();
        throw null;
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3449 newBuilderForType() {
        newBuilderForType();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3449 toBuilder() {
        toBuilder();
        return null;
    }

    public static InterfaceC3395 mutableCopy(InterfaceC3395 interfaceC3395) {
        return ((C3638) interfaceC3395).mo7499(((C3638) interfaceC3395).f11307 * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, C3696.m7960());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteString byteString) {
        return (T) checkMessageInitialized(parseFrom(t, byteString, C3696.m7960()));
    }

    public static InterfaceC3399 mutableCopy(InterfaceC3399 interfaceC3399) {
        return ((C3590) interfaceC3399).mo7499(((C3590) interfaceC3399).f11208 * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteString byteString, C3696 c3696) {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, c3696));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, C3696.m7960()));
    }

    public static InterfaceC3611 mutableCopy(InterfaceC3611 interfaceC3611) {
        return ((C3534) interfaceC3611).mo7499(((C3534) interfaceC3611).f11175 * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr, C3696 c3696) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, c3696));
    }

    public static <E> InterfaceC3402 mutableCopy(InterfaceC3402 interfaceC3402) {
        return interfaceC3402.mo7499(interfaceC3402.size() * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer, C3696 c3696) {
        return (T) checkMessageInitialized(parseFrom(t, AbstractC3473.m7706(byteBuffer), c3696));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream, C3696 c3696) {
        return (T) checkMessageInitialized(parsePartialFrom(t, AbstractC3473.m7708(inputStream), c3696));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, AbstractC3473 abstractC3473) {
        return (T) parseFrom(t, abstractC3473, C3696.m7960());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, AbstractC3473 abstractC3473, C3696 c3696) {
        return (T) checkMessageInitialized(parsePartialFrom(t, abstractC3473, c3696));
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    @Override // com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class AbstractC3305 extends GeneratedMessageLite implements InterfaceC3439 {
        protected C3679 extensions = C3679.f11472;

        private void eagerlyMergeMessageSetExtension(AbstractC3473 abstractC3473, C3602 c3602, C3696 c3696, int i) {
            parseExtension(abstractC3473, c3696, c3602, (i << 3) | 2, i);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, C3696 c3696, C3602 c3602) {
            InterfaceC3440 interfaceC3440 = (InterfaceC3440) this.extensions.m7936(c3602.f11237);
            InterfaceC3449 builder = interfaceC3440 != null ? interfaceC3440.toBuilder() : null;
            if (builder == null) {
                builder = c3602.f11238.newBuilderForType();
            }
            builder.mergeFrom(byteString, c3696);
            ensureExtensionsAreMutable().m7926(c3602.f11237, c3602.m7822(builder.build()));
        }

        private <MessageType2 extends InterfaceC3440> void mergeMessageSetExtensionFromCodedStream(MessageType2 messagetype2, AbstractC3473 abstractC3473, C3696 c3696) {
            int iMo7717 = 0;
            ByteString byteStringMo7732 = null;
            C3602 c3602M7961 = null;
            while (true) {
                int iMo7718 = abstractC3473.mo7718();
                if (iMo7718 == 0) {
                    break;
                }
                if (iMo7718 == 16) {
                    iMo7717 = abstractC3473.mo7717();
                    if (iMo7717 != 0) {
                        c3602M7961 = c3696.m7961(iMo7717, messagetype2);
                    }
                } else if (iMo7718 == 26) {
                    if (iMo7717 == 0 || c3602M7961 == null) {
                        byteStringMo7732 = abstractC3473.mo7732();
                    } else {
                        eagerlyMergeMessageSetExtension(abstractC3473, c3602M7961, c3696, iMo7717);
                        byteStringMo7732 = null;
                    }
                } else if (!abstractC3473.mo7710(iMo7718)) {
                    break;
                }
            }
            abstractC3473.mo7725(12);
            if (byteStringMo7732 == null || iMo7717 == 0) {
                return;
            }
            if (c3602M7961 != null) {
                mergeMessageSetExtensionFromBytes(byteStringMo7732, c3696, c3602M7961);
            } else {
                mergeLengthDelimitedField(iMo7717, byteStringMo7732);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean parseExtension(com.google.protobuf.AbstractC3473 r8, com.google.protobuf.C3696 r9, com.google.protobuf.C3602 r10, int r11, int r12) {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.AbstractC3305.parseExtension(com.google.protobuf.飘花落叶言子世苏兰哲楪, com.google.protobuf.飘花落叶言楪苏子哲兰世, com.google.protobuf.飘花落叶言楪兰世哲苏子, int, int):boolean");
        }

        private void verifyExtensionContainingType(C3602 c3602) {
            if (c3602.f11240 == getDefaultInstanceForType()) {
                return;
            }
            C5919.m11249("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public C3679 ensureExtensionsAreMutable() {
            C3679 c3679 = this.extensions;
            if (c3679.f11474) {
                this.extensions = c3679.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m7931();
        }

        public int extensionsSerializedSize() {
            return this.extensions.m7932();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.m7934();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [Type, com.google.protobuf.飘花落叶言世哲苏子楪兰, com.google.protobuf.飘花落叶言子楪苏世哲兰] */
        public final <Type> Type getExtension(AbstractC3581 abstractC3581) {
            C3602 c3602CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3581);
            verifyExtensionContainingType(c3602CheckIsLite);
            Type type = (Type) this.extensions.m7936(c3602CheckIsLite.f11237);
            if (type == null) {
                return (Type) c3602CheckIsLite.f11239;
            }
            C3601 c3601 = c3602CheckIsLite.f11237;
            if (!c3601.f11233) {
                return (Type) c3602CheckIsLite.m7823(type);
            }
            if (c3601.f11235.getJavaType() != WireFormat$JavaType.ENUM) {
                return type;
            }
            ?? r0 = (Type) new C3379();
            List list = (List) type;
            r0.m7497(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r0.add(c3602CheckIsLite.m7823(it.next()));
            }
            r0.m7800();
            return r0;
        }

        public final <Type> int getExtensionCount(AbstractC3581 abstractC3581) {
            C3602 c3602CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3581);
            verifyExtensionContainingType(c3602CheckIsLite);
            return this.extensions.m7929(c3602CheckIsLite.f11237);
        }

        public final <Type> boolean hasExtension(AbstractC3581 abstractC3581) {
            C3602 c3602CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3581);
            verifyExtensionContainingType(c3602CheckIsLite);
            return this.extensions.m7933(c3602CheckIsLite.f11237);
        }

        public final void mergeExtensionFields(AbstractC3305 abstractC3305) {
            C3679 c3679 = this.extensions;
            if (c3679.f11474) {
                this.extensions = c3679.clone();
            }
            this.extensions.m7928(abstractC3305.extensions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public /* bridge */ /* synthetic */ InterfaceC3449 newBuilderForType() {
            newBuilderForType();
            return null;
        }

        public C3605 newExtensionWriter() {
            return new C3605(this);
        }

        public C3605 newMessageSetExtensionWriter() {
            return new C3605(this);
        }

        public <MessageType2 extends InterfaceC3440> boolean parseUnknownField(MessageType2 messagetype2, AbstractC3473 abstractC3473, C3696 c3696, int i) {
            int i2 = i >>> 3;
            return parseExtension(abstractC3473, c3696, c3696.m7961(i2, messagetype2), i, i2);
        }

        public <MessageType2 extends InterfaceC3440> boolean parseUnknownFieldAsMessageSet(MessageType2 messagetype2, AbstractC3473 abstractC3473, C3696 c3696, int i) {
            if (i != 11) {
                return (i & 7) == 2 ? parseUnknownField(messagetype2, abstractC3473, c3696, i) : abstractC3473.mo7710(i);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype2, abstractC3473, c3696);
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public /* bridge */ /* synthetic */ InterfaceC3449 toBuilder() {
            toBuilder();
            return null;
        }

        public final <Type> Type getExtension(AbstractC3581 abstractC3581, int i) {
            C3602 c3602CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3581);
            verifyExtensionContainingType(c3602CheckIsLite);
            return (Type) c3602CheckIsLite.m7823(this.extensions.m7930(c3602CheckIsLite.f11237, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C3696 c3696) throws InvalidProtocolBufferException {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            C3371 c3371 = C3371.f11013;
            c3371.getClass();
            InterfaceC3344 interfaceC3344M7493 = c3371.m7493(t2.getClass());
            interfaceC3344M7493.mo7404(t2, bArr, i, i + i2, new C3545(c3696));
            interfaceC3344M7493.mo7407(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            InvalidProtocolBufferException invalidProtocolBufferException = e;
            if (invalidProtocolBufferException.getThrownFromInputStream()) {
                invalidProtocolBufferException = new InvalidProtocolBufferException((IOException) invalidProtocolBufferException);
            }
            throw invalidProtocolBufferException.setUnfinishedMessage(t2);
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, AbstractC3473 abstractC3473) {
        return (T) parsePartialFrom(t, abstractC3473, C3696.m7960());
    }

    private static <T extends GeneratedMessageLite> T parsePartialFrom(T t, ByteString byteString, C3696 c3696) throws InvalidProtocolBufferException {
        AbstractC3473 abstractC3473NewCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, abstractC3473NewCodedInput, c3696);
        try {
            abstractC3473NewCodedInput.mo7725(0);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }
}
