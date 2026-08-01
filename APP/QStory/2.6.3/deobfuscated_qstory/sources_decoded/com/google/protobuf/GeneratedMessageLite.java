package com.google.protobuf;

import androidx.collection.C0276;
import bsh.C2633;
import com.alibaba.fastjson2.C2942;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p009.AbstractC6183;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessageLite extends AbstractC3529 {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected C3707 unknownFields = C3707.f11516;

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

        public SerializedForm(InterfaceC3441 interfaceC3441) {
            this.messageClass = interfaceC3441.getClass();
            this.messageClassName = interfaceC3441.getClass().getName();
            this.asBytes = interfaceC3441.toByteArray();
        }

        public static SerializedForm of(InterfaceC3441 interfaceC3441) {
            return new SerializedForm(interfaceC3441);
        }

        private Class<?> resolveMessageClass() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            if (cls != null) {
                return cls;
            }
            Class<?> cls2 = Class.forName(this.messageClassName, false, SerializedForm.class.getClassLoader());
            if (InterfaceC3441.class.isAssignableFrom(cls2)) {
                return cls2;
            }
            throw new ClassNotFoundException();
        }

        public Object readResolve() {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                InterfaceC3450 interfaceC3450NewBuilderForType = ((InterfaceC3441) declaredField.get(null)).newBuilderForType();
                interfaceC3450NewBuilderForType.mergeFrom(this.asBytes);
                return interfaceC3450NewBuilderForType.buildPartial();
            } catch (InvalidProtocolBufferException e) {
                C0276.m848("Unable to understand proto buffer", e);
                return null;
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                C0276.m848("Unable to call parsePartialFrom", e3);
                return null;
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find DEFAULT_INSTANCE in " + this.messageClassName, e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e5);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends AbstractC3306, BuilderType, T> C3603 checkIsLite(AbstractC3582 abstractC3582) {
        if (abstractC3582.mo7793()) {
            return (C3603) abstractC3582;
        }
        C5925.m11310("Expected a lite extension.");
        return null;
    }

    private static <T extends GeneratedMessageLite> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    private int computeSerializedSize(InterfaceC3345 interfaceC3345) {
        if (interfaceC3345 != null) {
            return interfaceC3345.mo7399(this);
        }
        C3372 c3372 = C3372.f11018;
        c3372.getClass();
        return c3372.m7480(getClass()).mo7399(this);
    }

    public static InterfaceC3612 emptyBooleanList() {
        return C3535.f11177;
    }

    public static InterfaceC3400 emptyDoubleList() {
        return C3591.f11210;
    }

    public static InterfaceC3396 emptyFloatList() {
        return C3639.f11309;
    }

    public static InterfaceC3395 emptyIntList() {
        return C3613.f11249;
    }

    public static InterfaceC3404 emptyLongList() {
        return C3430.f11092;
    }

    public static <E> InterfaceC3403 emptyProtobufList() {
        return C3380.f11027;
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C3707.f11516) {
            this.unknownFields = new C3707();
        }
    }

    public static <T extends GeneratedMessageLite> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                C8791.m14473("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) AbstractC3726.m7989(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            defaultInstanceMap.put((Class<?>) cls, t2);
            return t2;
        }
        C2633.m5341();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends GeneratedMessageLite> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C3372 c3372 = C3372.f11018;
        c3372.getClass();
        boolean zMo7393 = c3372.m7480(t.getClass()).mo7393(t);
        if (z) {
            t.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zMo7393 ? t : null, null);
        }
        return zMo7393;
    }

    public static InterfaceC3395 mutableCopy(InterfaceC3395 interfaceC3395) {
        return ((C3613) interfaceC3395).mo7486(((C3613) interfaceC3395).f11252 * 2);
    }

    public static Object newMessageInfo(InterfaceC3441 interfaceC3441, String str, Object[] objArr) {
        return new C3378(interfaceC3441, str, objArr);
    }

    public static <ContainingType extends InterfaceC3441, Type> C3603 newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC3441 interfaceC3441, InterfaceC3398 interfaceC3398, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class<?> cls) {
        return new C3603(containingtype, C3380.f11027, interfaceC3441, new C3602(interfaceC3398, i, wireFormat$FieldType, true, z));
    }

    public static <ContainingType extends InterfaceC3441, Type> C3603 newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC3441 interfaceC3441, InterfaceC3398 interfaceC3398, int i, WireFormat$FieldType wireFormat$FieldType, Class<?> cls) {
        return new C3603(containingtype, type, interfaceC3441, new C3602(interfaceC3398, i, wireFormat$FieldType, false, false));
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C3697.m7947()));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream) {
        return (T) checkMessageInitialized(parsePartialFrom(t, AbstractC3474.m7695(inputStream), C3697.m7947()));
    }

    private static <T extends GeneratedMessageLite> T parsePartialDelimitedFrom(T t, InputStream inputStream, C3697 c3697) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            AbstractC3474 abstractC3474M7695 = AbstractC3474.m7695(new C3531(inputStream, AbstractC3474.m7690(inputStream, i), 0));
            T t2 = (T) parsePartialFrom(t, abstractC3474M7695, c3697);
            try {
                abstractC3474M7695.mo7712(0);
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

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, AbstractC3474 abstractC3474, C3697 c3697) throws InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            C3372 c3372 = C3372.f11018;
            c3372.getClass();
            InterfaceC3345 interfaceC3345M7480 = c3372.m7480(t2.getClass());
            C3464 c3464 = abstractC3474.f11153;
            if (c3464 == null) {
                c3464 = new C3464(abstractC3474);
            }
            interfaceC3345M7480.mo7392(t2, c3464, c3697);
            interfaceC3345M7480.mo7394(t2);
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
        C3372 c3372 = C3372.f11018;
        c3372.getClass();
        return c3372.m7480(getClass()).mo7398(this);
    }

    public final <MessageType2 extends GeneratedMessageLite, BuilderType2 extends AbstractC3607> BuilderType2 createBuilder() {
        if (dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null) == null) {
            return null;
        }
        C2942.m6394();
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
        C3372 c3372 = C3372.f11018;
        c3372.getClass();
        return c3372.m7480(getClass()).mo7397(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE, null, null);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.AbstractC3529
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public final InterfaceC3375 getParserForType() {
        return (InterfaceC3375) dynamicMethod(MethodToInvoke.GET_PARSER, null, null);
    }

    @Override // com.google.protobuf.AbstractC3529
    public int getSerializedSize(InterfaceC3345 interfaceC3345) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(interfaceC3345);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            C5925.m11311(AbstractC6183.m11588(iComputeSerializedSize, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(interfaceC3345);
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
        C3372 c3372 = C3372.f11018;
        c3372.getClass();
        c3372.m7480(getClass()).mo7394(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        C3707 c3707 = this.unknownFields;
        c3707.m7956();
        if (i != 0) {
            c3707.m7952((i << 3) | 2, byteString);
        } else {
            C5925.m11310("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(C3707 c3707) {
        this.unknownFields = C3707.m7951(this.unknownFields, c3707);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        C3707 c3707 = this.unknownFields;
        c3707.m7956();
        if (i != 0) {
            c3707.m7952(i << 3, Long.valueOf(i2));
        } else {
            C5925.m11310("Zero is not a valid field number.");
        }
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public final AbstractC3607 newBuilderForType() {
        if (dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null) == null) {
            return null;
        }
        C2942.m6394();
        return null;
    }

    public GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE, null, null);
    }

    public boolean parseUnknownField(int i, AbstractC3474 abstractC3474) {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.m7953(i, abstractC3474);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // com.google.protobuf.AbstractC3529
    public void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            C5925.m11311(AbstractC6183.m11588(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public final AbstractC3607 toBuilder() {
        dynamicMethod(MethodToInvoke.NEW_BUILDER, null, null).getClass();
        throw new ClassCastException();
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = AbstractC3443.f11122;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC3443.m7609(this, sb, 0);
        return sb.toString();
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        C3372 c3372 = C3372.f11018;
        c3372.getClass();
        InterfaceC3345 interfaceC3345M7480 = c3372.m7480(getClass());
        C3427 c3427 = abstractC3462.f11130;
        if (c3427 == null) {
            c3427 = new C3427(abstractC3462);
        }
        interfaceC3345M7480.mo7395(this, c3427);
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream, C3697 c3697) {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, c3697));
    }

    public static InterfaceC3404 mutableCopy(InterfaceC3404 interfaceC3404) {
        return ((C3430) interfaceC3404).mo7486(((C3430) interfaceC3404).f11095 * 2);
    }

    public final <MessageType2 extends GeneratedMessageLite, BuilderType2 extends AbstractC3607> BuilderType2 createBuilder(MessageType2 messagetype2) {
        createBuilder();
        throw null;
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public /* bridge */ /* synthetic */ InterfaceC3450 newBuilderForType() {
        newBuilderForType();
        return null;
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public /* bridge */ /* synthetic */ InterfaceC3450 toBuilder() {
        toBuilder();
        return null;
    }

    public static InterfaceC3396 mutableCopy(InterfaceC3396 interfaceC3396) {
        return ((C3639) interfaceC3396).mo7486(((C3639) interfaceC3396).f11312 * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, C3697.m7947());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteString byteString) {
        return (T) checkMessageInitialized(parseFrom(t, byteString, C3697.m7947()));
    }

    public static InterfaceC3400 mutableCopy(InterfaceC3400 interfaceC3400) {
        return ((C3591) interfaceC3400).mo7486(((C3591) interfaceC3400).f11213 * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteString byteString, C3697 c3697) {
        return (T) checkMessageInitialized(parsePartialFrom(t, byteString, c3697));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, C3697.m7947()));
    }

    public static InterfaceC3612 mutableCopy(InterfaceC3612 interfaceC3612) {
        return ((C3535) interfaceC3612).mo7486(((C3535) interfaceC3612).f11180 * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr, C3697 c3697) {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, c3697));
    }

    public static <E> InterfaceC3403 mutableCopy(InterfaceC3403 interfaceC3403) {
        return interfaceC3403.mo7486(interfaceC3403.size() * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer, C3697 c3697) {
        return (T) checkMessageInitialized(parseFrom(t, AbstractC3474.m7693(byteBuffer), c3697));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream, C3697 c3697) {
        return (T) checkMessageInitialized(parsePartialFrom(t, AbstractC3474.m7695(inputStream), c3697));
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, AbstractC3474 abstractC3474) {
        return (T) parseFrom(t, abstractC3474, C3697.m7947());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, AbstractC3474 abstractC3474, C3697 c3697) {
        return (T) checkMessageInitialized(parsePartialFrom(t, abstractC3474, c3697));
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    @Override // com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessageLite$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC3306 extends GeneratedMessageLite implements InterfaceC3440 {
        protected C3680 extensions = C3680.f11477;

        private void eagerlyMergeMessageSetExtension(AbstractC3474 abstractC3474, C3603 c3603, C3697 c3697, int i) {
            parseExtension(abstractC3474, c3697, c3603, (i << 3) | 2, i);
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, C3697 c3697, C3603 c3603) {
            InterfaceC3441 interfaceC3441 = (InterfaceC3441) this.extensions.m7923(c3603.f11242);
            InterfaceC3450 builder = interfaceC3441 != null ? interfaceC3441.toBuilder() : null;
            if (builder == null) {
                builder = c3603.f11243.newBuilderForType();
            }
            builder.mergeFrom(byteString, c3697);
            ensureExtensionsAreMutable().m7913(c3603.f11242, c3603.m7809(builder.build()));
        }

        private <MessageType2 extends InterfaceC3441> void mergeMessageSetExtensionFromCodedStream(MessageType2 messagetype2, AbstractC3474 abstractC3474, C3697 c3697) {
            int iMo7704 = 0;
            ByteString byteStringMo7719 = null;
            C3603 c3603M7948 = null;
            while (true) {
                int iMo7705 = abstractC3474.mo7705();
                if (iMo7705 == 0) {
                    break;
                }
                if (iMo7705 == 16) {
                    iMo7704 = abstractC3474.mo7704();
                    if (iMo7704 != 0) {
                        c3603M7948 = c3697.m7948(iMo7704, messagetype2);
                    }
                } else if (iMo7705 == 26) {
                    if (iMo7704 == 0 || c3603M7948 == null) {
                        byteStringMo7719 = abstractC3474.mo7719();
                    } else {
                        eagerlyMergeMessageSetExtension(abstractC3474, c3603M7948, c3697, iMo7704);
                        byteStringMo7719 = null;
                    }
                } else if (!abstractC3474.mo7697(iMo7705)) {
                    break;
                }
            }
            abstractC3474.mo7712(12);
            if (byteStringMo7719 == null || iMo7704 == 0) {
                return;
            }
            if (c3603M7948 != null) {
                mergeMessageSetExtensionFromBytes(byteStringMo7719, c3697, c3603M7948);
            } else {
                mergeLengthDelimitedField(iMo7704, byteStringMo7719);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:4:0x0007  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private boolean parseExtension(com.google.protobuf.AbstractC3474 r8, com.google.protobuf.C3697 r9, com.google.protobuf.C3603 r10, int r11, int r12) {
            /*
                Method dump skipped, instruction units count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.AbstractC3306.parseExtension(com.google.protobuf.飘花落叶言子世苏兰哲楪, com.google.protobuf.飘花落叶言楪苏子哲兰世, com.google.protobuf.飘花落叶言楪兰世哲苏子, int, int):boolean");
        }

        private void verifyExtensionContainingType(C3603 c3603) {
            if (c3603.f11245 == getDefaultInstanceForType()) {
                return;
            }
            C5925.m11310("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public C3680 ensureExtensionsAreMutable() {
            C3680 c3680 = this.extensions;
            if (c3680.f11479) {
                this.extensions = c3680.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m7918();
        }

        public int extensionsSerializedSize() {
            return this.extensions.m7919();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.m7921();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [Type, com.google.protobuf.飘花落叶言世哲苏子楪兰, com.google.protobuf.飘花落叶言子楪苏世哲兰] */
        public final <Type> Type getExtension(AbstractC3582 abstractC3582) {
            C3603 c3603CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3582);
            verifyExtensionContainingType(c3603CheckIsLite);
            Type type = (Type) this.extensions.m7923(c3603CheckIsLite.f11242);
            if (type == null) {
                return (Type) c3603CheckIsLite.f11244;
            }
            C3602 c3602 = c3603CheckIsLite.f11242;
            if (!c3602.f11238) {
                return (Type) c3603CheckIsLite.m7810(type);
            }
            if (c3602.f11240.getJavaType() != WireFormat$JavaType.ENUM) {
                return type;
            }
            ?? r0 = (Type) new C3380();
            List list = (List) type;
            r0.m7484(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r0.add(c3603CheckIsLite.m7810(it.next()));
            }
            r0.m7787();
            return r0;
        }

        public final <Type> int getExtensionCount(AbstractC3582 abstractC3582) {
            C3603 c3603CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3582);
            verifyExtensionContainingType(c3603CheckIsLite);
            return this.extensions.m7916(c3603CheckIsLite.f11242);
        }

        public final <Type> boolean hasExtension(AbstractC3582 abstractC3582) {
            C3603 c3603CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3582);
            verifyExtensionContainingType(c3603CheckIsLite);
            return this.extensions.m7920(c3603CheckIsLite.f11242);
        }

        public final void mergeExtensionFields(AbstractC3306 abstractC3306) {
            C3680 c3680 = this.extensions;
            if (c3680.f11479) {
                this.extensions = c3680.clone();
            }
            this.extensions.m7915(abstractC3306.extensions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3450 newBuilderForType() {
            newBuilderForType();
            return null;
        }

        public C3606 newExtensionWriter() {
            return new C3606(this);
        }

        public C3606 newMessageSetExtensionWriter() {
            return new C3606(this);
        }

        public <MessageType2 extends InterfaceC3441> boolean parseUnknownField(MessageType2 messagetype2, AbstractC3474 abstractC3474, C3697 c3697, int i) {
            int i2 = i >>> 3;
            return parseExtension(abstractC3474, c3697, c3697.m7948(i2, messagetype2), i, i2);
        }

        public <MessageType2 extends InterfaceC3441> boolean parseUnknownFieldAsMessageSet(MessageType2 messagetype2, AbstractC3474 abstractC3474, C3697 c3697, int i) {
            if (i != 11) {
                return (i & 7) == 2 ? parseUnknownField(messagetype2, abstractC3474, c3697, i) : abstractC3474.mo7697(i);
            }
            mergeMessageSetExtensionFromCodedStream(messagetype2, abstractC3474, c3697);
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3450 toBuilder() {
            toBuilder();
            return null;
        }

        public final <Type> Type getExtension(AbstractC3582 abstractC3582, int i) {
            C3603 c3603CheckIsLite = GeneratedMessageLite.checkIsLite(abstractC3582);
            verifyExtensionContainingType(c3603CheckIsLite);
            return (Type) c3603CheckIsLite.m7810(this.extensions.m7917(c3603CheckIsLite.f11242, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C3697 c3697) throws InvalidProtocolBufferException {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            C3372 c3372 = C3372.f11018;
            c3372.getClass();
            InterfaceC3345 interfaceC3345M7480 = c3372.m7480(t2.getClass());
            interfaceC3345M7480.mo7391(t2, bArr, i, i + i2, new C3546(c3697));
            interfaceC3345M7480.mo7394(t2);
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

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, AbstractC3474 abstractC3474) {
        return (T) parsePartialFrom(t, abstractC3474, C3697.m7947());
    }

    private static <T extends GeneratedMessageLite> T parsePartialFrom(T t, ByteString byteString, C3697 c3697) throws InvalidProtocolBufferException {
        AbstractC3474 abstractC3474NewCodedInput = byteString.newCodedInput();
        T t2 = (T) parsePartialFrom(t, abstractC3474NewCodedInput, c3697);
        try {
            abstractC3474NewCodedInput.mo7712(0);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(t2);
        }
    }
}
