package com.google.protobuf;

import androidx.activity.AbstractC0900;
import com.google.protobuf.AbstractC4365;
import com.google.protobuf.C4427;
import com.google.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Logger;
import lin.xposed.hook.javaplugin.C6385;
import p352.C9620;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessage extends AbstractC4365 implements Serializable {
    static final String PRE22_GENCODE_ERROR_PROPERTY = "com.google.protobuf.error_on_unsafe_pre22_gencode";
    static final String PRE22_GENCODE_SILENCE_PROPERTY = "com.google.protobuf.use_unsafe_pre22_gencode";
    static final String PRE22_GENCODE_VULNERABILITY_MESSAGE = "As of 2022/09/29 (release 21.7) makeExtensionsImmutable should not be called from protobuf gencode. If you are seeing this message, your gencode is vulnerable to a denial of service attack. You should regenerate your code using protobuf 25.6 or later. Use the latest version that meets your needs. However, if you understand the risks and wish to continue with vulnerable gencode, you can set the system property `-Dcom.google.protobuf.use_unsafe_pre22_gencode` on the command line to silence this warning. You also can set `-Dcom.google.protobuf.error_on_unsafe_pre22_gencode` to throw an error instead. See security vulnerability: https://github.com/protocolbuffers/protobuf/security/advisories/GHSA-h4h5-3hr4-j3g2";
    private static final long serialVersionUID = 1;
    protected C4536 unknownFields;
    private static final Logger logger = Logger.getLogger(GeneratedMessage.class.getName());
    protected static boolean alwaysUseFieldBuilders = false;
    protected static final Set<String> loggedPre22TypeNames = new CopyOnWriteArraySet();

    public GeneratedMessage() {
        this.unknownFields = C4536.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageT extends ExtendableMessage<MessageT>, T> AbstractC4411 checkNotLite(AbstractC4414 abstractC4414) {
        if (!abstractC4414.mo8352()) {
            return (AbstractC4411) abstractC4414;
        }
        C6755.m11869("Expected non-lite extension.");
        return null;
    }

    public static int computeStringSize(int i, Object obj) throws Exception {
        if (!(obj instanceof String)) {
            return AbstractC4294.m8192(i, (ByteString) obj);
        }
        int iM8201 = AbstractC4294.m8201(i);
        int iM8543 = AbstractC4556.m8543((String) obj);
        return AbstractC4294.m8194(iM8543) + iM8543 + iM8201;
    }

    public static int computeStringSizeNoTag(Object obj) throws Exception {
        int size;
        int iM8194;
        if (obj instanceof String) {
            boolean z = AbstractC4294.f11474;
            size = AbstractC4556.m8543((String) obj);
            iM8194 = AbstractC4294.m8194(size);
        } else {
            boolean z2 = AbstractC4294.f11474;
            size = ((ByteString) obj).size();
            iM8194 = AbstractC4294.m8194(size);
        }
        return iM8194 + size;
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

    public static <T> InterfaceC4235 emptyList(Class<T> cls) {
        return C4212.f11372;
    }

    public static InterfaceC4236 emptyLongList() {
        return C4262.f11437;
    }

    public static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Map<C4489, Object> getAllFieldsMutable(boolean z) {
        TreeMap treeMap = new TreeMap();
        List listM8434 = internalGetFieldAccessorTable().f11613.m8434();
        int i = 0;
        while (i < listM8434.size()) {
            C4489 oneofFieldDescriptor = (C4489) listM8434.get(i);
            C4426 c4426 = oneofFieldDescriptor.f11690;
            if (c4426 != null) {
                i += c4426.f11574 - 1;
                if (hasOneof(c4426)) {
                    oneofFieldDescriptor = getOneofFieldDescriptor(c4426);
                    if (z || oneofFieldDescriptor.m8422() != Descriptors$FieldDescriptor$JavaType.STRING) {
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    } else {
                        treeMap.put(oneofFieldDescriptor, getFieldRaw(oneofFieldDescriptor));
                    }
                }
            } else if (oneofFieldDescriptor.mo8365()) {
                List list = (List) getField(oneofFieldDescriptor);
                if (!list.isEmpty()) {
                    treeMap.put(oneofFieldDescriptor, list);
                }
            } else if (hasField(oneofFieldDescriptor)) {
                if (z) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
            }
            i++;
        }
        return treeMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.reflect.Method getMethodOrDie(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            C9620.m15032("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C9620.m15032("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static boolean isStringEmpty(Object obj) {
        return obj instanceof String ? ((String) obj).isEmpty() : ((ByteString) obj).isEmpty();
    }

    public static <ListT extends InterfaceC4235> ListT makeMutableCopy(ListT listt, int i) {
        int size = listt.size();
        if (i <= size) {
            i = size * 2;
        }
        if (i <= 0) {
            i = 10;
        }
        return (ListT) listt.mo8045(i);
    }

    private static <V> void maybeSerializeBooleanEntryTo(AbstractC4294 abstractC4294, Map<Boolean, V> map, C4248 c4248, int i, boolean z) {
        if (map.containsKey(Boolean.valueOf(z))) {
            abstractC4294.mo8208(i, c4248.newBuilderForType().setKey(Boolean.valueOf(z)).setValue(map.get(Boolean.valueOf(z))).build());
        }
    }

    public static <ContainingT extends InterfaceC4285, T> C4448 newFileScopedGeneratedExtension(Class<?> cls, InterfaceC4285 interfaceC4285) {
        return new C4448(null, cls, interfaceC4285, Extension$ExtensionType.IMMUTABLE);
    }

    public static <ContainingT extends InterfaceC4285, T> C4448 newMessageScopedGeneratedExtension(InterfaceC4285 interfaceC4285, int i, Class<?> cls, InterfaceC4285 interfaceC42852) {
        return new C4448(new C4475(interfaceC4285, i), cls, interfaceC42852, Extension$ExtensionType.IMMUTABLE);
    }

    public static <M extends InterfaceC4285> M parseDelimitedWithIOException(InterfaceC4207 interfaceC4207, InputStream inputStream) throws IOException {
        try {
            return (M) ((AbstractC4360) interfaceC4207).m8314(inputStream, AbstractC4360.f11519);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends InterfaceC4285> M parseWithIOException(InterfaceC4207 interfaceC4207, InputStream inputStream) throws IOException {
        try {
            AbstractC4360 abstractC4360 = (AbstractC4360) interfaceC4207;
            C4529 c4529 = AbstractC4360.f11519;
            abstractC4360.getClass();
            AbstractC4306 abstractC4306M8254 = AbstractC4306.m8254(inputStream);
            InterfaceC4273 interfaceC4273 = (InterfaceC4273) abstractC4360.mo7904(abstractC4306M8254, c4529);
            try {
                abstractC4306M8254.mo8271(0);
                AbstractC4360.m8310(interfaceC4273);
                return (M) interfaceC4273;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(interfaceC4273);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static <V> void serializeBooleanMapTo(AbstractC4294 abstractC4294, C4240 c4240, C4248 c4248, int i) {
        Map mapM8071 = c4240.m8071();
        abstractC4294.getClass();
        serializeMapTo(abstractC4294, mapM8071, c4248, i);
    }

    public static <V> void serializeIntegerMapTo(AbstractC4294 abstractC4294, C4240 c4240, C4248 c4248, int i) {
        Map mapM8071 = c4240.m8071();
        abstractC4294.getClass();
        serializeMapTo(abstractC4294, mapM8071, c4248, i);
    }

    public static <V> void serializeLongMapTo(AbstractC4294 abstractC4294, C4240 c4240, C4248 c4248, int i) {
        Map mapM8071 = c4240.m8071();
        abstractC4294.getClass();
        serializeMapTo(abstractC4294, mapM8071, c4248, i);
    }

    private static <K, V> void serializeMapTo(AbstractC4294 abstractC4294, Map<K, V> map, C4248 c4248, int i) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            abstractC4294.mo8208(i, c4248.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).buildPartial());
        }
    }

    public static <V> void serializeStringMapTo(AbstractC4294 abstractC4294, C4240 c4240, C4248 c4248, int i) {
        Map mapM8071 = c4240.m8071();
        abstractC4294.getClass();
        serializeMapTo(abstractC4294, mapM8071, c4248, i);
    }

    public static void setAlwaysUseFieldBuildersForTesting(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    public static void warnPre22Gencode(Class<?> cls) {
        if (System.getProperty(PRE22_GENCODE_SILENCE_PROPERTY) != null) {
            return;
        }
        String name = cls.getName();
        String strM718 = AbstractC0900.m718("Vulnerable protobuf generated type in use: ", name, "\nAs of 2022/09/29 (release 21.7) makeExtensionsImmutable should not be called from protobuf gencode. If you are seeing this message, your gencode is vulnerable to a denial of service attack. You should regenerate your code using protobuf 25.6 or later. Use the latest version that meets your needs. However, if you understand the risks and wish to continue with vulnerable gencode, you can set the system property `-Dcom.google.protobuf.use_unsafe_pre22_gencode` on the command line to silence this warning. You also can set `-Dcom.google.protobuf.error_on_unsafe_pre22_gencode` to throw an error instead. See security vulnerability: https://github.com/protocolbuffers/protobuf/security/advisories/GHSA-h4h5-3hr4-j3g2");
        if (System.getProperty(PRE22_GENCODE_ERROR_PROPERTY) != null) {
            C6755.m11867(strM718);
        } else if (loggedPre22TypeNames.add(name)) {
            logger.warning(strM718);
        }
    }

    public static void writeString(AbstractC4294 abstractC4294, int i, Object obj) {
        if (obj instanceof String) {
            abstractC4294.mo8216(i, (String) obj);
        } else {
            abstractC4294.mo8225(i, (ByteString) obj);
        }
    }

    public static void writeStringNoTag(AbstractC4294 abstractC4294, Object obj) {
        if (obj instanceof String) {
            abstractC4294.mo8215((String) obj);
        } else {
            abstractC4294.mo8226((ByteString) obj);
        }
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public Map<C4489, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    public Map<C4489, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public abstract /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
    public C4495 getDescriptorForType() {
        return internalGetFieldAccessorTable().f11613;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public Object getField(C4489 c4489) {
        return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8392(this);
    }

    public Object getFieldRaw(C4489 c4489) {
        return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8376(this);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public C4489 getOneofFieldDescriptor(C4426 c4426) {
        return C4451.m8385(internalGetFieldAccessorTable(), c4426).mo8382(this);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public InterfaceC4207 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public Object getRepeatedField(C4489 c4489, int i) {
        return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8399(i, this);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public int getRepeatedFieldCount(C4489 c4489) {
        return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8397(this);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM8086 = AbstractC4245.m8086(this, getAllFieldsRaw());
        this.memoizedSize = iM8086;
        return iM8086;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public C4536 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
    public boolean hasField(C4489 c4489) {
        return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8394(this);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
    public boolean hasOneof(C4426 c4426) {
        return C4451.m8385(internalGetFieldAccessorTable(), c4426).mo8381(this);
    }

    public abstract C4451 internalGetFieldAccessorTable();

    @Deprecated
    public C4240 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public AbstractC4279 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
    public boolean isInitialized() {
        for (C4489 c4489 : getDescriptorForType().m8434()) {
            if (c4489.m8413() && !hasField(c4489)) {
                return false;
            }
            if (c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (c4489.mo8365()) {
                    Iterator it = ((List) getField(c4489)).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC4285) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(c4489) && !((InterfaceC4285) getField(c4489)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void makeExtensionsImmutable() {
        warnPre22Gencode(getClass());
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public /* bridge */ /* synthetic */ InterfaceC4282 newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ InterfaceC4286 newBuilderForType();

    public Object newInstance(AbstractC4449 abstractC4449) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    public boolean parseUnknownField(AbstractC4306 abstractC4306, C4544 c4544, C4529 c4529, int i) {
        abstractC4306.getClass();
        return c4544.m8526(i, abstractC4306);
    }

    public boolean parseUnknownFieldProto3(AbstractC4306 abstractC4306, C4544 c4544, C4529 c4529, int i) {
        return parseUnknownField(abstractC4306, c4544, c4529, i);
    }

    public void setUnknownFields(C4536 c4536) {
        this.unknownFields = c4536;
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public /* bridge */ /* synthetic */ InterfaceC4282 toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public abstract /* synthetic */ InterfaceC4286 toBuilder();

    public Object writeReplace() {
        return new GeneratedMessageLite.SerializedForm(this);
    }

    @Override // com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
    public void writeTo(AbstractC4294 abstractC4294) {
        AbstractC4245.m8080(this, getAllFieldsRaw(), abstractC4294);
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessage$飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC4136 extends AbstractC4137 implements InterfaceC4459 {
        private C4517 extensions;

        public AbstractC4136() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C4512 buildExtensions() {
            C4517 c4517 = this.extensions;
            return c4517 == null ? C4512.f11822 : c4517.m8494(true);
        }

        private void ensureExtensionsIsMutable() {
            if (this.extensions == null) {
                C4512 c4512 = C4512.f11822;
                this.extensions = new C4517(C4182.m7962());
            }
        }

        private void verifyContainingType(C4489 c4489) {
            if (c4489.f11691 == getDescriptorForType()) {
                return;
            }
            C6755.m11869("FieldDescriptor does not match message type.");
        }

        private void verifyExtensionContainingType(AbstractC4411 abstractC4411) {
            if (abstractC4411.mo8350().f11691 == getDescriptorForType()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Extension is for type \"");
            sb.append(abstractC4411.mo8350().f11691.f11718);
            sb.append("\" which does not match message type \"");
            C6755.m11869(AbstractC0900.m711(sb, getDescriptorForType().f11718, "\"."));
        }

        public final <T> AbstractC4136 addExtension(AbstractC4414 abstractC4414, T t) {
            AbstractC4411 abstractC4411CheckNotLite = GeneratedMessage.checkNotLite(abstractC4414);
            verifyExtensionContainingType(abstractC4411CheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.m8495(abstractC4411CheckNotLite.mo8350(), abstractC4411CheckNotLite.mo8348(t));
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4136 addRepeatedField(C4489 c4489, Object obj) {
            if (!c4489.f11700.hasExtendee()) {
                return (AbstractC4136) super.addRepeatedField(c4489, obj);
            }
            verifyContainingType(c4489);
            ensureExtensionsIsMutable();
            this.extensions.m8495(c4489, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public /* bridge */ /* synthetic */ InterfaceC4273 build() {
            return super.build();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public abstract /* synthetic */ InterfaceC4285 build();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public /* bridge */ /* synthetic */ InterfaceC4273 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public abstract /* synthetic */ InterfaceC4285 buildPartial();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public AbstractC4136 mo7901clear() {
            this.extensions = null;
            return (AbstractC4136) super.mo7901clear();
        }

        public final <T> AbstractC4136 clearExtension(AbstractC4414 abstractC4414) {
            AbstractC4411 abstractC4411CheckNotLite = GeneratedMessage.checkNotLite(abstractC4414);
            verifyExtensionContainingType(abstractC4411CheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.m8493(abstractC4411CheckNotLite.mo8350());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4136 clearField(C4489 c4489) {
            if (!c4489.f11700.hasExtendee()) {
                return (AbstractC4136) super.clearField(c4489);
            }
            verifyContainingType(c4489);
            ensureExtensionsIsMutable();
            this.extensions.m8493(c4489);
            onChanged();
            return this;
        }

        public boolean extensionsAreInitialized() {
            C4517 c4517 = this.extensions;
            return c4517 == null || c4517.m8501();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public Map<C4489, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable();
            C4517 c4517 = this.extensions;
            if (c4517 != null) {
                allFieldsMutable.putAll(c4517.m8491());
            }
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public abstract /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

        @Override // com.google.protobuf.InterfaceC4459
        public final <T> T getExtension(AbstractC4414 abstractC4414) {
            AbstractC4411 abstractC4411CheckNotLite = GeneratedMessage.checkNotLite(abstractC4414);
            verifyExtensionContainingType(abstractC4411CheckNotLite);
            C4489 c4489Mo8350 = abstractC4411CheckNotLite.mo8350();
            C4517 c4517 = this.extensions;
            Object objM8490 = c4517 == null ? null : c4517.m8490(c4489Mo8350);
            return objM8490 == null ? c4489Mo8350.mo8365() ? (T) Collections.EMPTY_LIST : c4489Mo8350.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? (T) ((C4448) abstractC4411CheckNotLite).f11605 : (T) abstractC4411CheckNotLite.mo8351(c4489Mo8350.m8423()) : (T) abstractC4411CheckNotLite.mo8351(objM8490);
        }

        @Override // com.google.protobuf.InterfaceC4459
        public final <T> int getExtensionCount(AbstractC4414 abstractC4414) {
            AbstractC4411 abstractC4411CheckNotLite = GeneratedMessage.checkNotLite(abstractC4414);
            verifyExtensionContainingType(abstractC4411CheckNotLite);
            C4489 c4489Mo8350 = abstractC4411CheckNotLite.mo8350();
            C4517 c4517 = this.extensions;
            if (c4517 == null) {
                return 0;
            }
            return c4517.m8503(c4489Mo8350);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public Object getField(C4489 c4489) {
            if (!c4489.f11700.hasExtendee()) {
                return super.getField(c4489);
            }
            verifyContainingType(c4489);
            C4517 c4517 = this.extensions;
            Object objM8490 = c4517 == null ? null : c4517.m8490(c4489);
            return objM8490 == null ? c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? C4427.getDefaultInstance(c4489.m8417()) : c4489.m8423() : objM8490;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public InterfaceC4286 getFieldBuilder(C4489 c4489) {
            if (!c4489.f11700.hasExtendee()) {
                return super.getFieldBuilder(c4489);
            }
            verifyContainingType(c4489);
            if (c4489.m8422() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C6755.m11867("getFieldBuilder() called on a non-Message type.");
                return null;
            }
            ensureExtensionsIsMutable();
            Object objM8500 = this.extensions.m8500(c4489);
            if (objM8500 == null) {
                C4427.C4428 c4428NewBuilder = C4427.newBuilder(c4489.m8417());
                this.extensions.m8497(c4489, c4428NewBuilder);
                onChanged();
                return c4428NewBuilder;
            }
            if (objM8500 instanceof InterfaceC4286) {
                return (InterfaceC4286) objM8500;
            }
            if (!(objM8500 instanceof InterfaceC4285)) {
                C6755.m11867("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            InterfaceC4286 builder = ((InterfaceC4285) objM8500).toBuilder();
            this.extensions.m8497(c4489, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4459
        public Object getRepeatedField(C4489 c4489, int i) {
            if (!c4489.f11700.hasExtendee()) {
                return super.getRepeatedField(c4489, i);
            }
            verifyContainingType(c4489);
            C4517 c4517 = this.extensions;
            if (c4517 == null) {
                throw new IndexOutOfBoundsException();
            }
            if (c4517.f11829) {
                c4517.m8492();
            }
            return C4517.m8487(c4517.m8499(c4489, i), true);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public InterfaceC4286 getRepeatedFieldBuilder(C4489 c4489, int i) {
            if (!c4489.f11700.hasExtendee()) {
                return super.getRepeatedFieldBuilder(c4489, i);
            }
            verifyContainingType(c4489);
            ensureExtensionsIsMutable();
            if (c4489.m8422() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C6755.m11867("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            Object objM8499 = this.extensions.m8499(c4489, i);
            if (objM8499 instanceof InterfaceC4286) {
                return (InterfaceC4286) objM8499;
            }
            if (!(objM8499 instanceof InterfaceC4285)) {
                C6755.m11867("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            InterfaceC4286 builder = ((InterfaceC4285) objM8499).toBuilder();
            this.extensions.m8498(c4489, i, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4459
        public int getRepeatedFieldCount(C4489 c4489) {
            if (!c4489.f11700.hasExtendee()) {
                return super.getRepeatedFieldCount(c4489);
            }
            verifyContainingType(c4489);
            C4517 c4517 = this.extensions;
            if (c4517 == null) {
                return 0;
            }
            return c4517.m8503(c4489);
        }

        @Override // com.google.protobuf.InterfaceC4459
        public final <T> boolean hasExtension(AbstractC4414 abstractC4414) {
            AbstractC4411 abstractC4411CheckNotLite = GeneratedMessage.checkNotLite(abstractC4414);
            verifyExtensionContainingType(abstractC4411CheckNotLite);
            C4517 c4517 = this.extensions;
            return c4517 != null && c4517.m8504(abstractC4411CheckNotLite.mo8350());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public boolean hasField(C4489 c4489) {
            if (!c4489.f11700.hasExtendee()) {
                return super.hasField(c4489);
            }
            verifyContainingType(c4489);
            C4517 c4517 = this.extensions;
            return c4517 != null && c4517.m8504(c4489);
        }

        public void internalSetExtensionSet(C4512 c4512) {
            C4517 c4517 = new C4517(C4512.m8462(c4512.f11825, true, false));
            c4517.f11831 = c4512.f11823;
            this.extensions = c4517;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        public void mergeExtensionFields(ExtendableMessage<?> extendableMessage) {
            if (((ExtendableMessage) extendableMessage).extensions != null) {
                ensureExtensionsIsMutable();
                this.extensions.m8502(((ExtendableMessage) extendableMessage).extensions);
                onChanged();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public InterfaceC4286 newBuilderForField(C4489 c4489) {
            return c4489.f11700.hasExtendee() ? C4427.newBuilder(c4489.m8417()) : super.newBuilderForField(c4489);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137
        public boolean parseUnknownField(AbstractC4306 abstractC4306, C4529 c4529, int i) {
            ensureExtensionsIsMutable();
            abstractC4306.getClass();
            return AbstractC4245.m8078(abstractC4306, getUnknownFieldSetBuilder(), c4529, getDescriptorForType(), new C4259(this.extensions), i);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final <T> AbstractC4136 setExtension(AbstractC4414 abstractC4414, T t) {
            AbstractC4411 abstractC4411CheckNotLite = GeneratedMessage.checkNotLite(abstractC4414);
            verifyExtensionContainingType(abstractC4411CheckNotLite);
            ensureExtensionsIsMutable();
            C4489 c4489Mo8350 = abstractC4411CheckNotLite.mo8350();
            C4517 c4517 = this.extensions;
            C4448 c4448 = (C4448) abstractC4411CheckNotLite;
            C4489 c4489Mo83502 = c4448.mo8350();
            if (!c4489Mo83502.mo8365()) {
                t = (T) c4448.mo8348(t);
            } else if (c4489Mo83502.m8422() == Descriptors$FieldDescriptor$JavaType.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) t).iterator();
                while (it.hasNext()) {
                    arrayList.add(c4448.mo8348(it.next()));
                }
                t = (T) arrayList;
            }
            c4517.m8497(c4489Mo8350, t);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4136 setField(C4489 c4489, Object obj) {
            if (!c4489.f11700.hasExtendee()) {
                return (AbstractC4136) super.setField(c4489, obj);
            }
            verifyContainingType(c4489);
            ensureExtensionsIsMutable();
            this.extensions.m8497(c4489, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC4137, com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4136 setRepeatedField(C4489 c4489, int i, Object obj) {
            if (!c4489.f11700.hasExtendee()) {
                return (AbstractC4136) super.setRepeatedField(c4489, i, obj);
            }
            verifyContainingType(c4489);
            ensureExtensionsIsMutable();
            this.extensions.m8498(c4489, i, obj);
            onChanged();
            return this;
        }

        public AbstractC4136(InterfaceC4364 interfaceC4364) {
            super(interfaceC4364);
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
            return super.getExtensionCount(c4448);
        }

        public final <T> AbstractC4136 clearExtension(AbstractC4411 abstractC4411) {
            return clearExtension((AbstractC4414) abstractC4411);
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
            return super.hasExtension(c4448);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        public final <T> AbstractC4136 addExtension(AbstractC4411 abstractC4411, T t) {
            return addExtension((AbstractC4414) abstractC4411, (Object) t);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
            return super.getExtension(abstractC4411, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4459
        public final <T> T getExtension(AbstractC4414 abstractC4414, int i) {
            AbstractC4411 abstractC4411CheckNotLite = GeneratedMessage.checkNotLite(abstractC4414);
            verifyExtensionContainingType(abstractC4411CheckNotLite);
            C4489 c4489Mo8350 = abstractC4411CheckNotLite.mo8350();
            C4517 c4517 = this.extensions;
            if (c4517 != null) {
                if (c4517.f11829) {
                    c4517.m8492();
                }
                return (T) abstractC4411CheckNotLite.mo8349(C4517.m8487(c4517.m8499(c4489Mo8350, i), true));
            }
            throw new IndexOutOfBoundsException();
        }

        public final <T> AbstractC4136 setExtension(AbstractC4411 abstractC4411, T t) {
            return setExtension((AbstractC4414) abstractC4411, (Object) t);
        }

        public final <T> AbstractC4136 setExtension(AbstractC4411 abstractC4411, int i, T t) {
            return setExtension((AbstractC4414) abstractC4411, i, (Object) t);
        }

        public final <T> AbstractC4136 setExtension(AbstractC4414 abstractC4414, int i, T t) {
            AbstractC4411 abstractC4411CheckNotLite = GeneratedMessage.checkNotLite(abstractC4414);
            verifyExtensionContainingType(abstractC4411CheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.m8498(abstractC4411CheckNotLite.mo8350(), i, abstractC4411CheckNotLite.mo8348(t));
            onChanged();
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessage$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC4137 extends AbstractC4365.AbstractC4366 {
        private InterfaceC4364 builderParent;
        private boolean isClean;
        private C4473 meAsParent;
        private Object unknownFieldsOrBuilder = C4536.getDefaultInstance();

        public AbstractC4137(InterfaceC4364 interfaceC4364) {
            this.builderParent = interfaceC4364;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<C4489, Object> getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List listM8434 = internalGetFieldAccessorTable().f11613.m8434();
            int i = 0;
            while (i < listM8434.size()) {
                C4489 oneofFieldDescriptor = (C4489) listM8434.get(i);
                C4426 c4426 = oneofFieldDescriptor.f11690;
                if (c4426 != null) {
                    i += c4426.f11574 - 1;
                    if (hasOneof(c4426)) {
                        oneofFieldDescriptor = getOneofFieldDescriptor(c4426);
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                } else if (oneofFieldDescriptor.mo8365()) {
                    List list = (List) getField(oneofFieldDescriptor);
                    if (!list.isEmpty()) {
                        treeMap.put(oneofFieldDescriptor, list);
                    }
                } else if (hasField(oneofFieldDescriptor)) {
                    treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                }
                i++;
            }
            return treeMap;
        }

        private AbstractC4137 setUnknownFieldsInternal(C4536 c4536) {
            this.unknownFieldsOrBuilder = c4536;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4137 addRepeatedField(C4489 c4489, Object obj) {
            C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8388(this, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public /* bridge */ /* synthetic */ InterfaceC4273 build() {
            return super.build();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public abstract /* synthetic */ InterfaceC4285 build();

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public /* bridge */ /* synthetic */ InterfaceC4273 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4282, com.google.protobuf.InterfaceC4286
        public abstract /* synthetic */ InterfaceC4285 buildPartial();

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        /* JADX INFO: renamed from: clear */
        public AbstractC4137 mo7901clear() {
            this.unknownFieldsOrBuilder = C4536.getDefaultInstance();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4137 clearField(C4489 c4489) {
            C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8395(this);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4137 clearOneof(C4426 c4426) {
            C4451.m8385(internalGetFieldAccessorTable(), c4426).mo8383(this);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366
        /* JADX INFO: renamed from: clone */
        public AbstractC4137 mo7903clone() {
            return (AbstractC4137) ((AbstractC4137) getDefaultInstanceForType().newBuilderForType()).mergeFrom(buildPartial());
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366
        public void dispose() {
            this.builderParent = null;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public Map<C4489, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public abstract /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public C4495 getDescriptorForType() {
            return internalGetFieldAccessorTable().f11613;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public Object getField(C4489 c4489) {
            Object objMo8391 = C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8391(this);
            return c4489.mo8365() ? Collections.unmodifiableList((List) objMo8391) : objMo8391;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public InterfaceC4286 getFieldBuilder(C4489 c4489) {
            return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8378(this);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public C4489 getOneofFieldDescriptor(C4426 c4426) {
            return C4451.m8385(internalGetFieldAccessorTable(), c4426).mo8380(this);
        }

        public InterfaceC4364 getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new C4473(this);
            }
            return this.meAsParent;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4459
        public Object getRepeatedField(C4489 c4489, int i) {
            return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8396(this, i);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public InterfaceC4286 getRepeatedFieldBuilder(C4489 c4489, int i) {
            return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8390(this, i);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4459
        public int getRepeatedFieldCount(C4489 c4489) {
            return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8398(this);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366
        public C4544 getUnknownFieldSetBuilder() {
            Object obj = this.unknownFieldsOrBuilder;
            if (obj instanceof C4536) {
                this.unknownFieldsOrBuilder = ((C4536) obj).toBuilder();
            }
            onChanged();
            return (C4544) this.unknownFieldsOrBuilder;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public final C4536 getUnknownFields() {
            Object obj = this.unknownFieldsOrBuilder;
            return obj instanceof C4536 ? (C4536) obj : ((C4544) obj).build();
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286, com.google.protobuf.InterfaceC4274
        public boolean hasField(C4489 c4489) {
            return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8393(this);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public boolean hasOneof(C4426 c4426) {
            return C4451.m8385(internalGetFieldAccessorTable(), c4426).mo8379(this);
        }

        public abstract C4451 internalGetFieldAccessorTable();

        @Deprecated
        public C4240 internalGetMapField(int i) {
            throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
        }

        public AbstractC4279 internalGetMapFieldReflection(int i) {
            return internalGetMapField(i);
        }

        @Deprecated
        public C4240 internalGetMutableMapField(int i) {
            throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
        }

        public AbstractC4279 internalGetMutableMapFieldReflection(int i) {
            return internalGetMutableMapField(i);
        }

        public boolean isClean() {
            return this.isClean;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public boolean isInitialized() {
            for (C4489 c4489 : getDescriptorForType().m8434()) {
                if (c4489.m8413() && !hasField(c4489)) {
                    return false;
                }
                if (c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                    if (c4489.mo8365()) {
                        Iterator it = ((List) getField(c4489)).iterator();
                        while (it.hasNext()) {
                            if (!((InterfaceC4285) it.next()).isInitialized()) {
                                return false;
                            }
                        }
                    } else if (hasField(c4489) && !((InterfaceC4285) getField(c4489)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366
        public void markClean() {
            this.isClean = true;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4137 mergeUnknownFields(C4536 c4536) {
            if (C4536.getDefaultInstance().equals(c4536)) {
                return this;
            }
            if (C4536.getDefaultInstance().equals(this.unknownFieldsOrBuilder)) {
                this.unknownFieldsOrBuilder = c4536;
                onChanged();
                return this;
            }
            getUnknownFieldSetBuilder().m8530(c4536);
            onChanged();
            return this;
        }

        public final void mergeUnknownLengthDelimitedField(int i, ByteString byteString) {
            C4544 unknownFieldSetBuilder = getUnknownFieldSetBuilder();
            if (i > 0) {
                unknownFieldSetBuilder.m8528(i).m8520(byteString);
            } else {
                unknownFieldSetBuilder.getClass();
                C6385.m11428(i, " is not a valid field number.");
            }
        }

        public final void mergeUnknownVarintField(int i, int i2) {
            getUnknownFieldSetBuilder().m8531(i, i2);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public InterfaceC4286 newBuilderForField(C4489 c4489) {
            return C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8377();
        }

        public void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        public final void onChanged() {
            InterfaceC4364 interfaceC4364;
            if (!this.isClean || (interfaceC4364 = this.builderParent) == null) {
                return;
            }
            interfaceC4364.mo7941();
            this.isClean = false;
        }

        public boolean parseUnknownField(AbstractC4306 abstractC4306, C4529 c4529, int i) {
            abstractC4306.getClass();
            return getUnknownFieldSetBuilder().m8526(i, abstractC4306);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4137 setField(C4489 c4489, Object obj) {
            C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8375(this, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4137 setRepeatedField(C4489 c4489, int i, Object obj) {
            C4451.m8384(internalGetFieldAccessorTable(), c4489).mo8389(this, i, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366
        public void setUnknownFieldSetBuilder(C4544 c4544) {
            this.unknownFieldsOrBuilder = c4544;
            onChanged();
        }

        public AbstractC4137 setUnknownFieldsProto3(C4536 c4536) {
            return setUnknownFieldsInternal(c4536);
        }

        @Override // com.google.protobuf.AbstractC4365.AbstractC4366, com.google.protobuf.InterfaceC4286
        public AbstractC4137 setUnknownFields(C4536 c4536) {
            return setUnknownFieldsInternal(c4536);
        }

        public AbstractC4137() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class ExtendableMessage<MessageT extends ExtendableMessage<MessageT>> extends GeneratedMessage implements InterfaceC4459 {
        private static final long serialVersionUID = 1;
        private final C4512 extensions;

        public ExtendableMessage() {
            this.extensions = new C4512();
        }

        private void verifyContainingType(C4489 c4489) {
            if (c4489.f11691 == getDescriptorForType()) {
                return;
            }
            C6755.m11869("FieldDescriptor does not match message type.");
        }

        private void verifyExtensionContainingType(C4489 c4489) {
            if (c4489.f11691 == getDescriptorForType()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Extension is for type \"");
            sb.append(c4489.f11691.f11718);
            sb.append("\" which does not match message type \"");
            C6755.m11869(AbstractC0900.m711(sb, getDescriptorForType().f11718, "\"."));
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m8477();
        }

        public final Iterator<C4463> extensionsIterator() {
            return new C4462(this.extensions);
        }

        public int extensionsSerializedSize() {
            return this.extensions.m8478();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.m8480();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
        public Map<C4489, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage
        public Map<C4489, Object> getAllFieldsRaw() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public /* bridge */ /* synthetic */ InterfaceC4273 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274, com.google.protobuf.InterfaceC4384
        public abstract /* synthetic */ InterfaceC4285 getDefaultInstanceForType();

        @Override // com.google.protobuf.InterfaceC4459
        public final <T> T getExtension(AbstractC4414 abstractC4414) {
            AbstractC4411 abstractC4411CheckNotLite = GeneratedMessage.checkNotLite(abstractC4414);
            C4489 c4489Mo8350 = abstractC4411CheckNotLite.mo8350();
            verifyExtensionContainingType(c4489Mo8350);
            Object objM8482 = this.extensions.m8482(c4489Mo8350);
            return objM8482 == null ? c4489Mo8350.mo8365() ? (T) C4212.f11372 : c4489Mo8350.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? (T) ((C4448) abstractC4411CheckNotLite).f11605 : (T) abstractC4411CheckNotLite.mo8351(c4489Mo8350.m8423()) : (T) abstractC4411CheckNotLite.mo8351(objM8482);
        }

        @Override // com.google.protobuf.InterfaceC4459
        public final <T> int getExtensionCount(AbstractC4414 abstractC4414) {
            C4489 c4489Mo8350 = GeneratedMessage.checkNotLite(abstractC4414).mo8350();
            verifyExtensionContainingType(c4489Mo8350);
            return this.extensions.m8475(c4489Mo8350);
        }

        public Map<C4489, Object> getExtensionFields() {
            return this.extensions.m8481();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
        public Object getField(C4489 c4489) {
            if (!c4489.f11700.hasExtendee()) {
                return super.getField(c4489);
            }
            verifyContainingType(c4489);
            Object objM8482 = this.extensions.m8482(c4489);
            return objM8482 == null ? c4489.mo8365() ? Collections.EMPTY_LIST : c4489.m8422() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? C4427.getDefaultInstance(c4489.m8417()) : c4489.m8423() : objM8482;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public Object getRepeatedField(C4489 c4489, int i) {
            if (!c4489.f11700.hasExtendee()) {
                return super.getRepeatedField(c4489, i);
            }
            verifyContainingType(c4489);
            return this.extensions.m8476(c4489, i);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285
        public int getRepeatedFieldCount(C4489 c4489) {
            if (!c4489.f11700.hasExtendee()) {
                return super.getRepeatedFieldCount(c4489);
            }
            verifyContainingType(c4489);
            return this.extensions.m8475(c4489);
        }

        @Override // com.google.protobuf.InterfaceC4459
        public final <T> boolean hasExtension(AbstractC4414 abstractC4414) {
            C4489 c4489Mo8350 = GeneratedMessage.checkNotLite(abstractC4414).mo8350();
            verifyExtensionContainingType(c4489Mo8350);
            return this.extensions.m8479(c4489Mo8350);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4274
        public boolean hasField(C4489 c4489) {
            if (!c4489.f11700.hasExtendee()) {
                return super.hasField(c4489);
            }
            verifyContainingType(c4489);
            return this.extensions.m8479(c4489);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4272, com.google.protobuf.InterfaceC4285, com.google.protobuf.InterfaceC4384
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        @Override // com.google.protobuf.GeneratedMessage
        public void makeExtensionsImmutable() {
            GeneratedMessage.warnPre22Gencode(getClass());
            this.extensions.m8473();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public /* bridge */ /* synthetic */ InterfaceC4282 newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public abstract /* synthetic */ InterfaceC4286 newBuilderForType();

        public InterfaceC4461 newExtensionSerializer() {
            return this.extensions.f11825.isEmpty() ? C4458.f11615 : new C4460(this, false);
        }

        @Deprecated
        public C4460 newExtensionWriter() {
            return new C4460(this, false);
        }

        public InterfaceC4461 newMessageSetExtensionSerializer() {
            return this.extensions.f11825.isEmpty() ? C4458.f11615 : new C4460(this, true);
        }

        public C4460 newMessageSetExtensionWriter() {
            return new C4460(this, true);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public /* bridge */ /* synthetic */ InterfaceC4282 toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC4365, com.google.protobuf.AbstractC4361, com.google.protobuf.InterfaceC4273, com.google.protobuf.InterfaceC4285
        public abstract /* synthetic */ InterfaceC4286 toBuilder();

        public ExtendableMessage(AbstractC4136 abstractC4136) {
            super(abstractC4136);
            this.extensions = abstractC4136.buildExtensions();
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(C4448 c4448) {
            return super.getExtensionCount(c4448);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(C4448 c4448) {
            return super.hasExtension(c4448);
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC4411 abstractC4411) {
            return super.getExtensionCount(abstractC4411);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC4411 abstractC4411) {
            return super.hasExtension(abstractC4411);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411, int i) {
            return super.getExtension(abstractC4411, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448) {
            return super.getExtension(c4448);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C4448 c4448, int i) {
            return super.getExtension(c4448, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC4411 abstractC4411) {
            return super.getExtension(abstractC4411);
        }

        @Override // com.google.protobuf.InterfaceC4459
        public final <T> T getExtension(AbstractC4414 abstractC4414, int i) {
            AbstractC4411 abstractC4411CheckNotLite = GeneratedMessage.checkNotLite(abstractC4414);
            C4489 c4489Mo8350 = abstractC4411CheckNotLite.mo8350();
            verifyExtensionContainingType(c4489Mo8350);
            return (T) abstractC4411CheckNotLite.mo8349(this.extensions.m8476(c4489Mo8350, i));
        }
    }

    public GeneratedMessage(AbstractC4137 abstractC4137) {
        this.unknownFields = abstractC4137.getUnknownFields();
    }

    public static <ListT extends InterfaceC4235> ListT makeMutableCopy(ListT listt) {
        return (ListT) makeMutableCopy(listt, 0);
    }

    public static <M extends InterfaceC4285> M parseDelimitedWithIOException(InterfaceC4207 interfaceC4207, InputStream inputStream, C4529 c4529) throws IOException {
        try {
            return (M) ((AbstractC4360) interfaceC4207).m8314(inputStream, c4529);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends InterfaceC4285> M parseWithIOException(InterfaceC4207 interfaceC4207, InputStream inputStream, C4529 c4529) throws IOException {
        try {
            AbstractC4360 abstractC4360 = (AbstractC4360) interfaceC4207;
            abstractC4360.getClass();
            AbstractC4306 abstractC4306M8254 = AbstractC4306.m8254(inputStream);
            InterfaceC4273 interfaceC4273 = (InterfaceC4273) abstractC4360.mo7904(abstractC4306M8254, c4529);
            try {
                abstractC4306M8254.mo8271(0);
                AbstractC4360.m8310(interfaceC4273);
                return (M) interfaceC4273;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(interfaceC4273);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static <M extends InterfaceC4285> M parseWithIOException(InterfaceC4207 interfaceC4207, AbstractC4306 abstractC4306) throws IOException {
        try {
            InterfaceC4273 interfaceC4273 = (InterfaceC4273) ((AbstractC4360) interfaceC4207).mo7904(abstractC4306, AbstractC4360.f11519);
            AbstractC4360.m8310(interfaceC4273);
            return (M) interfaceC4273;
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends InterfaceC4285> M parseWithIOException(InterfaceC4207 interfaceC4207, AbstractC4306 abstractC4306, C4529 c4529) throws IOException {
        try {
            InterfaceC4273 interfaceC4273 = (InterfaceC4273) ((AbstractC4360) interfaceC4207).mo7904(abstractC4306, c4529);
            AbstractC4360.m8310(interfaceC4273);
            return (M) interfaceC4273;
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }
}
