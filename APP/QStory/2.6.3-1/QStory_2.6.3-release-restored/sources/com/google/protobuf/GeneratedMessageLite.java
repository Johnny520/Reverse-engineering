package com.google.protobuf;

import androidx.collection.C1123;
import bsh.C3466;
import com.alibaba.fastjson2.C3775;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p025.AbstractC7012;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite extends AbstractC4361 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C4539 unknownFields = C4539.f11861;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        public SerializedForm(InterfaceC4273 interfaceC4273) {
            this.messageClass = interfaceC4273.getClass();
            this.messageClassName = interfaceC4273.getClass().getName();
            this.asBytes = interfaceC4273.toByteArray();
        }

        /* JADX INFO: renamed from: of */
        public static SerializedForm m143of(InterfaceC4273 interfaceC4273) {
            return new SerializedForm(interfaceC4273);
        }

        private Class<?> resolveMessageClass() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            if (cls != null) {
                return cls;
            }
            Class<?> cls2 = Class.forName(this.messageClassName, false, SerializedForm.class.getClassLoader());
            if (InterfaceC4273.class.isAssignableFrom(cls2)) {
                return cls2;
            }
            throw new ClassNotFoundException();
        }

        public Object readResolve() {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                InterfaceC4282 interfaceC4282NewBuilderForType = ((InterfaceC4273) declaredField.get(null)).newBuilderForType();
                interfaceC4282NewBuilderForType.mergeFrom(this.asBytes);
                return interfaceC4282NewBuilderForType.buildPartial();
            } catch (InvalidProtocolBufferException e) {
                C1123.m1408("Unable to understand proto buffer", e);
                return null;
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                C1123.m1408("Unable to call parsePartialFrom", e3);
                return null;
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find DEFAULT_INSTANCE in " + this.messageClassName, e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends AbstractC4138, BuilderType, T> C4435 checkIsLite(AbstractC4414 abstractC4414) {
        if (abstractC4414.mo8352()) {
            return (C4435) abstractC4414;
        }
        C6755.m11869("Expected a lite extension.");
        return null;
    }

    private static <T extends GeneratedMessageLite> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    private int computeSerializedSize(InterfaceC4177 interfaceC4177) {
        if (interfaceC4177 != null) {
            return interfaceC4177.mo7958(this);
        }
        C4204 c4204 = C4204.f11363;
        c4204.getClass();
        return c4204.m8039(getClass()).mo7958(this);
    }

    public static InterfaceC4444 emptyBooleanList() {
        return C4367.f11522;
    }

    public static InterfaceC4232 emptyDoubleList() {
        return C4423.f11555;
    }

    public static InterfaceC4228 emptyFloatList() {
        return C4471.f11654;
    }

    public static InterfaceC4227 emptyIntList() {
        return C4445.f11594;
    }

    public static InterfaceC4236 emptyLongList() {
        return C4262.f11437;
    }

    public static <E> InterfaceC4235 emptyProtobufList() {
        return C4212.f11372;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C4539.f11861) {
            this.unknownFields = new C4539();
        }
    }

    public static <T extends GeneratedMessageLite> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                C9620.m15032("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) AbstractC4558.m8548(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            defaultInstanceMap.put((Class<?>) cls, t2);
            return t2;
        }
        C3466.m5901();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends GeneratedMessageLite> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C4204 c4204 = C4204.f11363;
        c4204.getClass();
        boolean zMo7952 = c4204.m8039(t.getClass()).mo7952(t);
        if (z) {
            t.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zMo7952 ? t : null, null);
        }
        return zMo7952;
    }

    public static InterfaceC4227 mutableCopy(InterfaceC4227 interfaceC4227) {
        return ((C4445) interfaceC4227).mo8045(((C4445) interfaceC4227).f11597 * 2);
    }

    public static Object newMessageInfo(InterfaceC4273 interfaceC4273, String str, Object[] objArr) {
        return new C4210(interfaceC4273, str, objArr);
    }

    public static <ContainingType extends InterfaceC4273, Type> C4435 newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC4273 interfaceC4273, InterfaceC4230 interfaceC4230, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class<?> cls) {
        return new C4435(containingtype, C4212.f11372, interfaceC4273, new C4434(interfaceC4230, i, wireFormat$FieldType, true, z));
    }

    public static <ContainingType extends InterfaceC4273, Type> C4435 newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC4273 interfaceC4273, InterfaceC4230 interfaceC4230, int i, WireFormat$FieldType wireFormat$FieldType, Class<?> cls) {
        return new C4435(containingtype, type, interfaceC4273, new C4434(interfaceC4230, i, wireFormat$FieldType, false, false));
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C4529.m8506()));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialFrom(t, AbstractC4306.m8254(inputStream), C4529.m8506()));
    }

    private static <T extends GeneratedMessageLite> T parsePartialDelimitedFrom(T t, InputStream inputStream, C4529 c4529) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            AbstractC4306 abstractC4306M8254 = AbstractC4306.m8254(new C4363(inputStream, AbstractC4306.m8249(inputStream, i), 0));
            T t2 = (T) parsePartialFrom(t, abstractC4306M8254, c4529);
            try {
                abstractC4306M8254.mo8271(0);
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

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, AbstractC4306 abstractC4306, C4529 c4529) throws InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            C4204 c4204 = C4204.f11363;
            c4204.getClass();
            InterfaceC4177 interfaceC4177M8039 = c4204.m8039(t2.getClass());
            C4296 c4296 = abstractC4306.f11498;
            if (c4296 == null) {
                c4296 = new C4296(abstractC4306);
            }
            interfaceC4177M8039.mo7951(t2, c4296, c4529);
            interfaceC4177M8039.mo7953(t2);
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
        C4204 c4204 = C4204.f11363;
        c4204.getClass();
        return c4204.m8039(getClass()).mo7957(this);
    }

    public final <MessageType2 extends GeneratedMessageLite, BuilderType2 extends AbstractC4439> BuilderType2 createBuilder() {
        if (dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null) == null) {
            return null;
        }
        C3775.m6954();
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
        C4204 c4204 = C4204.f11363;
        c4204.getClass();
        return c4204.m8039(getClass()).mo7956(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE, null, null);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC4361
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public final InterfaceC4207 getParserForType() {
        return (InterfaceC4207) dynamicMethod(MethodToInvoke.GET_PARSER, null, null);
    }

    @Override // com.google.protobuf.AbstractC4361
    public int getSerializedSize(InterfaceC4177 interfaceC4177) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(interfaceC4177);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            C6755.m11870(AbstractC7012.m12147(iComputeSerializedSize, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(interfaceC4177);
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
        C4204 c4204 = C4204.f11363;
        c4204.getClass();
        c4204.m8039(getClass()).mo7953(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        C4539 c4539 = this.unknownFields;
        c4539.m8515();
        if (i != 0) {
            c4539.m8511((i << 3) | 2, byteString);
        } else {
            C6755.m11869("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(C4539 c4539) {
        this.unknownFields = C4539.m8510(this.unknownFields, c4539);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        C4539 c4539 = this.unknownFields;
        c4539.m8515();
        if (i != 0) {
            c4539.m8511(i << 3, Long.valueOf(i2));
        } else {
            C6755.m11869("Zero is not a valid field number.");
        }
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public final AbstractC4439 newBuilderForType() {
        if (dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null) == null) {
            return null;
        }
        C3775.m6954();
        return null;
    }

    public GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE, null, null);
    }

    public boolean parseUnknownField(int i, AbstractC4306 abstractC4306) {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.m8512(i, abstractC4306);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // com.google.protobuf.AbstractC4361
    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            C6755.m11870(AbstractC7012.m12147(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public final AbstractC4439 toBuilder() {
        dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null).getClass();
        throw new ClassCastException();
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = AbstractC4275.f11467;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC4275.m8168(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        C4204 c4204 = C4204.f11363;
        c4204.getClass();
        InterfaceC4177 interfaceC4177M8039 = c4204.m8039(getClass());
        C4259 c4259 = abstractC4294.f11475;
        if (c4259 == null) {
            c4259 = new C4259(abstractC4294);
        }
        interfaceC4177M8039.mo7954(this, c4259);
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream, C4529 c4529) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, c4529));
    }

    public static InterfaceC4236 mutableCopy(InterfaceC4236 interfaceC4236) {
        return ((C4262) interfaceC4236).mo8045(((C4262) interfaceC4236).f11440 * 2);
    }

    public final <MessageType2 extends GeneratedMessageLite, BuilderType2 extends AbstractC4439> BuilderType2 createBuilder(MessageType2 messagetype2) {
        createBuilder();
        throw null;
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public /* bridge */ /* synthetic */ InterfaceC4282 newBuilderForType() {
        newBuilderForType();
        return null;
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public /* bridge */ /* synthetic */ InterfaceC4282 toBuilder() {
        toBuilder();
        return null;
    }

    public static InterfaceC4228 mutableCopy(InterfaceC4228 interfaceC4228) {
        return ((C4471) interfaceC4228).mo8045(((C4471) interfaceC4228).f11657 * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, C4529.m8506());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteString byteString) {
        return (T) checkMessageInitialized(parseFrom(t, byteString, C4529.m8506()));
    }

    public static InterfaceC4232 mutableCopy(InterfaceC4232 interfaceC4232) {
        return ((C4423) interfaceC4232).mo8045(((C4423) interfaceC4232).f11558 * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteString byteString, C4529 c4529) {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, c4529));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, C4529.m8506()));
    }

    public static InterfaceC4444 mutableCopy(InterfaceC4444 interfaceC4444) {
        return ((C4367) interfaceC4444).mo8045(((C4367) interfaceC4444).f11525 * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr, C4529 c4529) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, c4529));
    }

    public static <E> InterfaceC4235 mutableCopy(InterfaceC4235 interfaceC4235) {
        return interfaceC4235.mo8045(interfaceC4235.size() * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer, C4529 c4529) {
        return (T) checkMessageInitialized(parseFrom(t, AbstractC4306.m8252(byteBuffer), c4529));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream, C4529 c4529) {
        return (T) checkMessageInitialized(parsePartialFrom(t, AbstractC4306.m8254(inputStream), c4529));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, AbstractC4306 abstractC4306) {
        return (T) parseFrom(t, abstractC4306, C4529.m8506());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, AbstractC4306 abstractC4306, C4529 c4529) {
        return (T) checkMessageInitialized(parsePartialFrom(t, abstractC4306, c4529));
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    @Override // com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC4138 extends GeneratedMessageLite implements InterfaceC4272 {
        protected C4512 extensions = C4512.f11822;

        private void eagerlyMergeMessageSetExtension(AbstractC4306 abstractC4306, C4435 c4435, C4529 c4529, int i) {
            parseExtension(abstractC4306, c4529, c4435, (i << 3) | 2, i);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, C4529 c4529, C4435 c4435) {
            InterfaceC4273 interfaceC4273 = (InterfaceC4273) this.extensions.m8482(c4435.f11587);
            InterfaceC4282 builder = interfaceC4273 != null ? interfaceC4273.toBuilder() : null;
            if (builder == null) {
                builder = c4435.f11588.newBuilderForType();
            }
            builder.mergeFrom(byteString, c4529);
            ensureExtensionsAreMutable().m8472(c4435.f11587, c4435.m8368(builder.build()));
        }

        private <MessageType2 extends InterfaceC4273> void mergeMessageSetExtensionFromCodedStream(MessageType2 messagetype2, AbstractC4306 abstractC4306, C4529 c4529) {
            int iMo8263 = 0;
            ByteString byteStringMo8278 = null;
            C4435 c4435M8507 = null;
            while (true) {
                int iMo8264 = abstractC4306.mo8264();
                if (iMo8264 == 0) {
                    break;
                }
                if (iMo8264 == 16) {
                    iMo8263 = abstractC4306.mo8263();
                    if (iMo8263 != 0) {
                        c4435M8507 = c4529.m8507(iMo8263, messagetype2);
                    }
                } else if (iMo8264 == 26) {
                    if (iMo8263 == 0 || c4435M8507 == null) {
                        byteStringMo8278 = abstractC4306.mo8278();
                    } else {
                        eagerlyMergeMessageSetExtension(abstractC4306, c4435M8507, c4529, iMo8263);
                        byteStringMo8278 = null;
                    }
                } else if (!abstractC4306.mo8256(iMo8264)) {
                    break;
                }
            }
            abstractC4306.mo8271(12);
            if (byteStringMo8278 == null || iMo8263 == 0) {
                return;
            }
            if (c4435M8507 != null) {
                mergeMessageSetExtensionFromBytes(byteStringMo8278, c4529, c4435M8507);
            } else {
                mergeLengthDelimitedField(iMo8263, byteStringMo8278);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean parseExtension(AbstractC4306 abstractC4306, C4529 c4529, C4435 c4435, int i, int i2) {
            boolean z;
            Object objBuild;
            InterfaceC4273 interfaceC4273;
            int i3 = i & 7;
            boolean z2 = false;
            if (c4435 == null) {
                z = false;
                z2 = true;
            } else {
                C4434 c4434 = c4435.f11587;
                WireFormat$FieldType wireFormat$FieldType = c4434.f11585;
                C4512 c4512 = C4512.f11822;
                if (i3 == wireFormat$FieldType.getWireType()) {
                    z = false;
                } else if (c4434.f11583 && c4434.f11585.isPackable() && i3 == 2) {
                    z = true;
                }
            }
            if (z2) {
                return parseUnknownField(i, abstractC4306);
            }
            ensureExtensionsAreMutable();
            if (z) {
                int iMo8286 = abstractC4306.mo8286(abstractC4306.mo8260());
                C4434 c44342 = c4435.f11587;
                if (c44342.f11585 == WireFormat$FieldType.ENUM) {
                    while (abstractC4306.mo8269() > 0) {
                        InterfaceC4231 interfaceC4231Mo7905 = c44342.f11586.mo7905(abstractC4306.mo8283());
                        if (interfaceC4231Mo7905 == null) {
                            return true;
                        }
                        this.extensions.m8469(c44342, c4435.m8368(interfaceC4231Mo7905));
                    }
                } else {
                    while (abstractC4306.mo8269() > 0) {
                        WireFormat$FieldType wireFormat$FieldType2 = c44342.f11585;
                        C4512 c45122 = C4512.f11822;
                        this.extensions.m8469(c44342, abstractC4306.m8261(wireFormat$FieldType2, WireFormat$Utf8Validation.LOOSE));
                    }
                }
                abstractC4306.mo8285(iMo8286);
                return true;
            }
            int[] iArr = AbstractC4436.f11591;
            C4434 c44343 = c4435.f11587;
            int i4 = iArr[c44343.f11585.getJavaType().ordinal()];
            if (i4 == 1) {
                InterfaceC4282 builder = (c44343.f11583 || (interfaceC4273 = (InterfaceC4273) this.extensions.m8482(c44343)) == null) ? null : interfaceC4273.toBuilder();
                if (builder == null) {
                    builder = c4435.f11588.newBuilderForType();
                }
                if (c44343.f11585 == WireFormat$FieldType.GROUP) {
                    abstractC4306.mo8272(c44343.f11584, builder, c4529);
                } else {
                    abstractC4306.mo8275(builder, c4529);
                }
                objBuild = builder.build();
            } else if (i4 != 2) {
                WireFormat$FieldType wireFormat$FieldType3 = c44343.f11585;
                C4512 c45123 = C4512.f11822;
                objBuild = abstractC4306.m8261(wireFormat$FieldType3, WireFormat$Utf8Validation.LOOSE);
            } else {
                int iMo8283 = abstractC4306.mo8283();
                InterfaceC4231 interfaceC4231Mo79052 = c44343.f11586.mo7905(iMo8283);
                if (interfaceC4231Mo79052 == null) {
                    mergeVarintField(i2, iMo8283);
                    return true;
                }
                objBuild = interfaceC4231Mo79052;
            }
            boolean z3 = c44343.f11583;
            C4512 c45124 = this.extensions;
            if (z3) {
                c45124.m8469(c44343, c4435.m8368(objBuild));
                return true;
            }
            c45124.m8472(c44343, c4435.m8368(objBuild));
            return true;
        }

        private void verifyExtensionContainingType(C4435 c4435) {
            if (c4435.f11590 == getDefaultInstanceForType()) {
                return;
            }
            C6755.m11869("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public C4512 ensureExtensionsAreMutable() {
            C4512 c4512 = this.extensions;
            if (c4512.f11824) {
                this.extensions = c4512.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m8477();
        }

        public int extensionsSerializedSize() {
            return this.extensions.m8478();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.m8480();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [Type, com.google.protobuf.飘花落叶言世哲苏子楪兰, com.google.protobuf.飘花落叶言子楪苏世哲兰] */
        public final <Type> Type getExtension(AbstractC4414 abstractC4414) {
            C4435 c4435CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC4414);
            verifyExtensionContainingType(c4435CheckIsLite);
            Type type = (Type) this.extensions.m8482(c4435CheckIsLite.f11587);
            if (type == null) {
                return (Type) c4435CheckIsLite.f11589;
            }
            C4434 c4434 = c4435CheckIsLite.f11587;
            if (!c4434.f11583) {
                return (Type) c4435CheckIsLite.m8369(type);
            }
            if (c4434.f11585.getJavaType() != WireFormat$JavaType.ENUM) {
                return type;
            }
            ?? r0 = (Type) new C4212();
            List list = (List) type;
            r0.m8043(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r0.add(c4435CheckIsLite.m8369(it.next()));
            }
            r0.m8346();
            return r0;
        }

        public final <Type> int getExtensionCount(AbstractC4414 abstractC4414) {
            C4435 c4435CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC4414);
            verifyExtensionContainingType(c4435CheckIsLite);
            return this.extensions.m8475(c4435CheckIsLite.f11587);
        }

        public final <Type> boolean hasExtension(AbstractC4414 abstractC4414) {
            C4435 c4435CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC4414);
            verifyExtensionContainingType(c4435CheckIsLite);
            return this.extensions.m8479(c4435CheckIsLite.f11587);
        }

        public final void mergeExtensionFields(AbstractC4138 abstractC4138) {
            C4512 c4512 = this.extensions;
            if (c4512.f11824) {
                this.extensions = c4512.clone();
            }
            this.extensions.m8474(abstractC4138.extensions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public /* bridge */ /* synthetic */ InterfaceC4282 newBuilderForType() {
            newBuilderForType();
            return null;
        }

        public C4438 newExtensionWriter() {
            return new C4438(this);
        }

        public C4438 newMessageSetExtensionWriter() {
            return new C4438(this);
        }

        public <MessageType2 extends InterfaceC4273> boolean parseUnknownField(MessageType2 messagetype2, AbstractC4306 abstractC4306, C4529 c4529, int i) {
            int i2 = i >>> 3;
            return parseExtension(abstractC4306, c4529, c4529.m8507(i2, messagetype2), i, i2);
        }

        public <MessageType2 extends InterfaceC4273> boolean parseUnknownFieldAsMessageSet(MessageType2 messagetype2, AbstractC4306 abstractC4306, C4529 c4529, int i) {
            if (i != 11) {
                return (i & 7) == 2 ? parseUnknownField(messagetype2, abstractC4306, c4529, i) : abstractC4306.mo8256(i);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype2, abstractC4306, c4529);
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public /* bridge */ /* synthetic */ InterfaceC4282 toBuilder() {
            toBuilder();
            return null;
        }

        public final <Type> Type getExtension(AbstractC4414 abstractC4414, int i) {
            C4435 c4435CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC4414);
            verifyExtensionContainingType(c4435CheckIsLite);
            return (Type) c4435CheckIsLite.m8369(this.extensions.m8476(c4435CheckIsLite.f11587, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C4529 c4529) throws InvalidProtocolBufferException {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            C4204 c4204 = C4204.f11363;
            c4204.getClass();
            InterfaceC4177 interfaceC4177M8039 = c4204.m8039(t2.getClass());
            interfaceC4177M8039.mo7950(t2, bArr, i, i + i2, new C4378(c4529));
            interfaceC4177M8039.mo7953(t2);
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

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, AbstractC4306 abstractC4306) {
        return (T) parsePartialFrom(t, abstractC4306, C4529.m8506());
    }

    private static <T extends GeneratedMessageLite> T parsePartialFrom(T t, ByteString byteString, C4529 c4529) throws InvalidProtocolBufferException {
        AbstractC4306 abstractC4306NewCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, abstractC4306NewCodedInput, c4529);
        try {
            abstractC4306NewCodedInput.mo8271(0);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }
}
