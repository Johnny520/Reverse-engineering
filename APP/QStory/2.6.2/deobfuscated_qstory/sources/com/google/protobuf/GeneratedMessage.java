package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.AbstractC3532;
import com.google.protobuf.C3594;
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
import lin.xposed.hook.javaplugin.C5553;
import p330.C8796;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessage extends AbstractC3532 implements Serializable {
    static final String PRE22_GENCODE_ERROR_PROPERTY = "com.google.protobuf.error_on_unsafe_pre22_gencode";
    static final String PRE22_GENCODE_SILENCE_PROPERTY = "com.google.protobuf.use_unsafe_pre22_gencode";
    static final String PRE22_GENCODE_VULNERABILITY_MESSAGE = "As of 2022/09/29 (release 21.7) makeExtensionsImmutable should not be called from protobuf gencode. If you are seeing this message, your gencode is vulnerable to a denial of service attack. You should regenerate your code using protobuf 25.6 or later. Use the latest version that meets your needs. However, if you understand the risks and wish to continue with vulnerable gencode, you can set the system property `-Dcom.google.protobuf.use_unsafe_pre22_gencode` on the command line to silence this warning. You also can set `-Dcom.google.protobuf.error_on_unsafe_pre22_gencode` to throw an error instead. See security vulnerability: https://github.com/protocolbuffers/protobuf/security/advisories/GHSA-h4h5-3hr4-j3g2";
    private static final long serialVersionUID = 1;
    protected C3703 unknownFields;
    private static final Logger logger = Logger.getLogger(GeneratedMessage.class.getName());
    protected static boolean alwaysUseFieldBuilders = false;
    protected static final Set<String> loggedPre22TypeNames = new CopyOnWriteArraySet();

    public GeneratedMessage() {
        this.unknownFields = C3703.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageT extends ExtendableMessage<MessageT>, T> AbstractC3578 checkNotLite(AbstractC3581 abstractC3581) {
        if (!abstractC3581.mo7806()) {
            return (AbstractC3578) abstractC3581;
        }
        C5919.m11249("Expected non-lite extension.");
        return null;
    }

    public static int computeStringSize(int i, Object obj) throws Exception {
        if (!(obj instanceof String)) {
            return AbstractC3461.m7646(i, (ByteString) obj);
        }
        int iM7655 = AbstractC3461.m7655(i);
        int iM7997 = AbstractC3723.m7997((String) obj);
        return AbstractC3461.m7648(iM7997) + iM7997 + iM7655;
    }

    public static int computeStringSizeNoTag(Object obj) throws Exception {
        int size;
        int iM7648;
        if (obj instanceof String) {
            boolean z = AbstractC3461.f11124;
            size = AbstractC3723.m7997((String) obj);
            iM7648 = AbstractC3461.m7648(size);
        } else {
            boolean z2 = AbstractC3461.f11124;
            size = ((ByteString) obj).size();
            iM7648 = AbstractC3461.m7648(size);
        }
        return iM7648 + size;
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

    public static <T> InterfaceC3402 emptyList(Class<T> cls) {
        return C3379.f11022;
    }

    public static InterfaceC3403 emptyLongList() {
        return C3429.f11087;
    }

    public static void enableAlwaysUseFieldBuildersForTesting() {
        setAlwaysUseFieldBuildersForTesting(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<com.google.protobuf.C3656, java.lang.Object> getAllFieldsMutable(boolean r7) {
        /*
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            com.google.protobuf.飘花落叶言楪兰子苏哲世 r1 = r6.internalGetFieldAccessorTable()
            com.google.protobuf.飘花落叶言楪子哲世苏兰 r1 = r1.f11263
            java.util.List r1 = r1.m7888()
            r2 = 0
        L10:
            int r3 = r1.size()
            if (r2 >= r3) goto L6a
            java.lang.Object r3 = r1.get(r2)
            com.google.protobuf.飘花落叶言楪子兰世苏哲 r3 = (com.google.protobuf.C3656) r3
            com.google.protobuf.飘花落叶言楪世子苏哲兰 r4 = r3.f11340
            if (r4 == 0) goto L31
            int r3 = r4.f11224
            int r3 = r3 + (-1)
            int r2 = r2 + r3
            boolean r3 = r6.hasOneof(r4)
            if (r3 != 0) goto L2c
            goto L67
        L2c:
            com.google.protobuf.飘花落叶言楪子兰世苏哲 r3 = r6.getOneofFieldDescriptor(r4)
            goto L4e
        L31:
            boolean r4 = r3.mo7819()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r6.getField(r3)
            java.util.List r4 = (java.util.List) r4
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L67
            r0.put(r3, r4)
            goto L67
        L47:
            boolean r4 = r6.hasField(r3)
            if (r4 != 0) goto L4e
            goto L67
        L4e:
            if (r7 == 0) goto L60
            com.google.protobuf.Descriptors$FieldDescriptor$JavaType r4 = r3.m7876()
            com.google.protobuf.Descriptors$FieldDescriptor$JavaType r5 = com.google.protobuf.Descriptors$FieldDescriptor$JavaType.STRING
            if (r4 != r5) goto L60
            java.lang.Object r4 = r6.getFieldRaw(r3)
            r0.put(r3, r4)
            goto L67
        L60:
            java.lang.Object r4 = r6.getField(r3)
            r0.put(r3, r4)
        L67:
            int r2 = r2 + 1
            goto L10
        L6a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessage.getAllFieldsMutable(boolean):java.util.Map");
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
            C8796.m14449("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C8796.m14449("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static boolean isStringEmpty(Object obj) {
        return obj instanceof String ? ((String) obj).isEmpty() : ((ByteString) obj).isEmpty();
    }

    public static <ListT extends InterfaceC3402> ListT makeMutableCopy(ListT listt, int i) {
        int size = listt.size();
        if (i <= size) {
            i = size * 2;
        }
        if (i <= 0) {
            i = 10;
        }
        return (ListT) listt.mo7499(i);
    }

    private static <V> void maybeSerializeBooleanEntryTo(AbstractC3461 abstractC3461, Map<Boolean, V> map, C3415 c3415, int i, boolean z) {
        if (map.containsKey(Boolean.valueOf(z))) {
            abstractC3461.mo7662(i, c3415.newBuilderForType().setKey(Boolean.valueOf(z)).setValue(map.get(Boolean.valueOf(z))).build());
        }
    }

    public static <ContainingT extends InterfaceC3452, T> C3615 newFileScopedGeneratedExtension(Class<?> cls, InterfaceC3452 interfaceC3452) {
        return new C3615(null, cls, interfaceC3452, Extension$ExtensionType.IMMUTABLE);
    }

    public static <ContainingT extends InterfaceC3452, T> C3615 newMessageScopedGeneratedExtension(InterfaceC3452 interfaceC3452, int i, Class<?> cls, InterfaceC3452 interfaceC34522) {
        return new C3615(new C3642(interfaceC3452, i), cls, interfaceC34522, Extension$ExtensionType.IMMUTABLE);
    }

    public static <M extends InterfaceC3452> M parseDelimitedWithIOException(InterfaceC3374 interfaceC3374, InputStream inputStream) throws IOException {
        try {
            return (M) ((AbstractC3527) interfaceC3374).m7768(inputStream, AbstractC3527.f11169);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends InterfaceC3452> M parseWithIOException(InterfaceC3374 interfaceC3374, InputStream inputStream) throws IOException {
        try {
            AbstractC3527 abstractC3527 = (AbstractC3527) interfaceC3374;
            C3696 c3696 = AbstractC3527.f11169;
            abstractC3527.getClass();
            AbstractC3473 abstractC3473M7708 = AbstractC3473.m7708(inputStream);
            InterfaceC3440 interfaceC3440 = (InterfaceC3440) abstractC3527.mo7358(abstractC3473M7708, c3696);
            try {
                abstractC3473M7708.mo7725(0);
                AbstractC3527.m7764(interfaceC3440);
                return (M) interfaceC3440;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(interfaceC3440);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static <V> void serializeBooleanMapTo(AbstractC3461 abstractC3461, C3407 c3407, C3415 c3415, int i) {
        Map mapM7525 = c3407.m7525();
        abstractC3461.getClass();
        serializeMapTo(abstractC3461, mapM7525, c3415, i);
    }

    public static <V> void serializeIntegerMapTo(AbstractC3461 abstractC3461, C3407 c3407, C3415 c3415, int i) {
        Map mapM7525 = c3407.m7525();
        abstractC3461.getClass();
        serializeMapTo(abstractC3461, mapM7525, c3415, i);
    }

    public static <V> void serializeLongMapTo(AbstractC3461 abstractC3461, C3407 c3407, C3415 c3415, int i) {
        Map mapM7525 = c3407.m7525();
        abstractC3461.getClass();
        serializeMapTo(abstractC3461, mapM7525, c3415, i);
    }

    private static <K, V> void serializeMapTo(AbstractC3461 abstractC3461, Map<K, V> map, C3415 c3415, int i) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            abstractC3461.mo7662(i, c3415.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).buildPartial());
        }
    }

    public static <V> void serializeStringMapTo(AbstractC3461 abstractC3461, C3407 c3407, C3415 c3415, int i) {
        Map mapM7525 = c3407.m7525();
        abstractC3461.getClass();
        serializeMapTo(abstractC3461, mapM7525, c3415, i);
    }

    public static void setAlwaysUseFieldBuildersForTesting(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    public static void warnPre22Gencode(Class<?> cls) {
        if (System.getProperty(PRE22_GENCODE_SILENCE_PROPERTY) != null) {
            return;
        }
        String name = cls.getName();
        String strM156 = AbstractC0053.m156("Vulnerable protobuf generated type in use: ", name, "\nAs of 2022/09/29 (release 21.7) makeExtensionsImmutable should not be called from protobuf gencode. If you are seeing this message, your gencode is vulnerable to a denial of service attack. You should regenerate your code using protobuf 25.6 or later. Use the latest version that meets your needs. However, if you understand the risks and wish to continue with vulnerable gencode, you can set the system property `-Dcom.google.protobuf.use_unsafe_pre22_gencode` on the command line to silence this warning. You also can set `-Dcom.google.protobuf.error_on_unsafe_pre22_gencode` to throw an error instead. See security vulnerability: https://github.com/protocolbuffers/protobuf/security/advisories/GHSA-h4h5-3hr4-j3g2");
        if (System.getProperty(PRE22_GENCODE_ERROR_PROPERTY) != null) {
            C5919.m11247(strM156);
        } else if (loggedPre22TypeNames.add(name)) {
            logger.warning(strM156);
        }
    }

    public static void writeString(AbstractC3461 abstractC3461, int i, Object obj) {
        if (obj instanceof String) {
            abstractC3461.mo7670(i, (String) obj);
        } else {
            abstractC3461.mo7679(i, (ByteString) obj);
        }
    }

    public static void writeStringNoTag(AbstractC3461 abstractC3461, Object obj) {
        if (obj instanceof String) {
            abstractC3461.mo7669((String) obj);
        } else {
            abstractC3461.mo7680((ByteString) obj);
        }
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public Map<C3656, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    public Map<C3656, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public abstract /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
    public C3662 getDescriptorForType() {
        return internalGetFieldAccessorTable().f11263;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public Object getField(C3656 c3656) {
        return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7846(this);
    }

    public Object getFieldRaw(C3656 c3656) {
        return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7830(this);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public C3656 getOneofFieldDescriptor(C3593 c3593) {
        return C3618.m7839(internalGetFieldAccessorTable(), c3593).mo7836(this);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public InterfaceC3374 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public Object getRepeatedField(C3656 c3656, int i) {
        return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7853(i, this);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public int getRepeatedFieldCount(C3656 c3656) {
        return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7851(this);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7540 = AbstractC3412.m7540(this, getAllFieldsRaw());
        this.memoizedSize = iM7540;
        return iM7540;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public C3703 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
    public boolean hasField(C3656 c3656) {
        return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7848(this);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
    public boolean hasOneof(C3593 c3593) {
        return C3618.m7839(internalGetFieldAccessorTable(), c3593).mo7835(this);
    }

    public abstract C3618 internalGetFieldAccessorTable();

    @Deprecated
    public C3407 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public AbstractC3446 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
    public boolean isInitialized() {
        for (C3656 c3656 : getDescriptorForType().m7888()) {
            if (c3656.m7867() && !hasField(c3656)) {
                return false;
            }
            if (c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (c3656.mo7819()) {
                    Iterator it = ((List) getField(c3656)).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC3452) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(c3656) && !((InterfaceC3452) getField(c3656)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void makeExtensionsImmutable() {
        warnPre22Gencode(getClass());
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3449 newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ InterfaceC3453 newBuilderForType();

    public Object newInstance(AbstractC3616 abstractC3616) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    public boolean parseUnknownField(AbstractC3473 abstractC3473, C3711 c3711, C3696 c3696, int i) {
        abstractC3473.getClass();
        return c3711.m7980(i, abstractC3473);
    }

    public boolean parseUnknownFieldProto3(AbstractC3473 abstractC3473, C3711 c3711, C3696 c3696, int i) {
        return parseUnknownField(abstractC3473, c3711, c3696, i);
    }

    public void setUnknownFields(C3703 c3703) {
        this.unknownFields = c3703;
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public /* bridge */ /* synthetic */ InterfaceC3449 toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public abstract /* synthetic */ InterfaceC3453 toBuilder();

    public Object writeReplace() {
        return new GeneratedMessageLite.SerializedForm(this);
    }

    @Override // com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
    public void writeTo(AbstractC3461 abstractC3461) {
        AbstractC3412.m7534(this, getAllFieldsRaw(), abstractC3461);
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessage$飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class AbstractC3303 extends AbstractC3304 implements InterfaceC3626 {
        private C3684 extensions;

        public AbstractC3303() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3679 buildExtensions() {
            C3684 c3684 = this.extensions;
            return c3684 == null ? C3679.f11472 : c3684.m7948(true);
        }

        private void ensureExtensionsIsMutable() {
            if (this.extensions == null) {
                C3679 c3679 = C3679.f11472;
                this.extensions = new C3684(C3349.m7416());
            }
        }

        private void verifyContainingType(C3656 c3656) {
            if (c3656.f11341 == getDescriptorForType()) {
                return;
            }
            C5919.m11249("FieldDescriptor does not match message type.");
        }

        private void verifyExtensionContainingType(AbstractC3578 abstractC3578) {
            if (abstractC3578.mo7804().f11341 == getDescriptorForType()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Extension is for type \"");
            sb.append(abstractC3578.mo7804().f11341.f11368);
            sb.append("\" which does not match message type \"");
            C5919.m11249(AbstractC0053.m146(sb, getDescriptorForType().f11368, "\"."));
        }

        public final <T> AbstractC3303 addExtension(AbstractC3581 abstractC3581, T t) {
            AbstractC3578 abstractC3578CheckNotLite = GeneratedMessage.checkNotLite(abstractC3581);
            verifyExtensionContainingType(abstractC3578CheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.m7949(abstractC3578CheckNotLite.mo7804(), abstractC3578CheckNotLite.mo7802(t));
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3303 addRepeatedField(C3656 c3656, Object obj) {
            if (!c3656.f11350.hasExtendee()) {
                return (AbstractC3303) super.addRepeatedField(c3656, obj);
            }
            verifyContainingType(c3656);
            ensureExtensionsIsMutable();
            this.extensions.m7949(c3656, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3440 build() {
            return super.build();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3452 build();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3440 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3452 buildPartial();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public AbstractC3303 mo7355clear() {
            this.extensions = null;
            return (AbstractC3303) super.mo7355clear();
        }

        public final <T> AbstractC3303 clearExtension(AbstractC3581 abstractC3581) {
            AbstractC3578 abstractC3578CheckNotLite = GeneratedMessage.checkNotLite(abstractC3581);
            verifyExtensionContainingType(abstractC3578CheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.m7947(abstractC3578CheckNotLite.mo7804());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3303 clearField(C3656 c3656) {
            if (!c3656.f11350.hasExtendee()) {
                return (AbstractC3303) super.clearField(c3656);
            }
            verifyContainingType(c3656);
            ensureExtensionsIsMutable();
            this.extensions.m7947(c3656);
            onChanged();
            return this;
        }

        public boolean extensionsAreInitialized() {
            C3684 c3684 = this.extensions;
            return c3684 == null || c3684.m7955();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public Map<C3656, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable();
            C3684 c3684 = this.extensions;
            if (c3684 != null) {
                allFieldsMutable.putAll(c3684.m7945());
            }
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public abstract /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

        @Override // com.google.protobuf.InterfaceC3626
        public final <T> T getExtension(AbstractC3581 abstractC3581) {
            AbstractC3578 abstractC3578CheckNotLite = GeneratedMessage.checkNotLite(abstractC3581);
            verifyExtensionContainingType(abstractC3578CheckNotLite);
            C3656 c3656Mo7804 = abstractC3578CheckNotLite.mo7804();
            C3684 c3684 = this.extensions;
            Object objM7944 = c3684 == null ? null : c3684.m7944(c3656Mo7804);
            return objM7944 == null ? c3656Mo7804.mo7819() ? (T) Collections.EMPTY_LIST : c3656Mo7804.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? (T) ((C3615) abstractC3578CheckNotLite).f11255 : (T) abstractC3578CheckNotLite.mo7805(c3656Mo7804.m7877()) : (T) abstractC3578CheckNotLite.mo7805(objM7944);
        }

        @Override // com.google.protobuf.InterfaceC3626
        public final <T> int getExtensionCount(AbstractC3581 abstractC3581) {
            AbstractC3578 abstractC3578CheckNotLite = GeneratedMessage.checkNotLite(abstractC3581);
            verifyExtensionContainingType(abstractC3578CheckNotLite);
            C3656 c3656Mo7804 = abstractC3578CheckNotLite.mo7804();
            C3684 c3684 = this.extensions;
            if (c3684 == null) {
                return 0;
            }
            return c3684.m7957(c3656Mo7804);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public Object getField(C3656 c3656) {
            if (!c3656.f11350.hasExtendee()) {
                return super.getField(c3656);
            }
            verifyContainingType(c3656);
            C3684 c3684 = this.extensions;
            Object objM7944 = c3684 == null ? null : c3684.m7944(c3656);
            return objM7944 == null ? c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? C3594.getDefaultInstance(c3656.m7871()) : c3656.m7877() : objM7944;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public InterfaceC3453 getFieldBuilder(C3656 c3656) {
            if (!c3656.f11350.hasExtendee()) {
                return super.getFieldBuilder(c3656);
            }
            verifyContainingType(c3656);
            if (c3656.m7876() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C5919.m11247("getFieldBuilder() called on a non-Message type.");
                return null;
            }
            ensureExtensionsIsMutable();
            Object objM7954 = this.extensions.m7954(c3656);
            if (objM7954 == null) {
                C3594.C3595 c3595NewBuilder = C3594.newBuilder(c3656.m7871());
                this.extensions.m7951(c3656, c3595NewBuilder);
                onChanged();
                return c3595NewBuilder;
            }
            if (objM7954 instanceof InterfaceC3453) {
                return (InterfaceC3453) objM7954;
            }
            if (!(objM7954 instanceof InterfaceC3452)) {
                C5919.m11247("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            InterfaceC3453 builder = ((InterfaceC3452) objM7954).toBuilder();
            this.extensions.m7951(c3656, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3626
        public Object getRepeatedField(C3656 c3656, int i) {
            if (!c3656.f11350.hasExtendee()) {
                return super.getRepeatedField(c3656, i);
            }
            verifyContainingType(c3656);
            C3684 c3684 = this.extensions;
            if (c3684 == null) {
                throw new IndexOutOfBoundsException();
            }
            if (c3684.f11479) {
                c3684.m7946();
            }
            return C3684.m7941(c3684.m7953(c3656, i), true);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public InterfaceC3453 getRepeatedFieldBuilder(C3656 c3656, int i) {
            if (!c3656.f11350.hasExtendee()) {
                return super.getRepeatedFieldBuilder(c3656, i);
            }
            verifyContainingType(c3656);
            ensureExtensionsIsMutable();
            if (c3656.m7876() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C5919.m11247("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            Object objM7953 = this.extensions.m7953(c3656, i);
            if (objM7953 instanceof InterfaceC3453) {
                return (InterfaceC3453) objM7953;
            }
            if (!(objM7953 instanceof InterfaceC3452)) {
                C5919.m11247("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            InterfaceC3453 builder = ((InterfaceC3452) objM7953).toBuilder();
            this.extensions.m7952(c3656, i, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3626
        public int getRepeatedFieldCount(C3656 c3656) {
            if (!c3656.f11350.hasExtendee()) {
                return super.getRepeatedFieldCount(c3656);
            }
            verifyContainingType(c3656);
            C3684 c3684 = this.extensions;
            if (c3684 == null) {
                return 0;
            }
            return c3684.m7957(c3656);
        }

        @Override // com.google.protobuf.InterfaceC3626
        public final <T> boolean hasExtension(AbstractC3581 abstractC3581) {
            AbstractC3578 abstractC3578CheckNotLite = GeneratedMessage.checkNotLite(abstractC3581);
            verifyExtensionContainingType(abstractC3578CheckNotLite);
            C3684 c3684 = this.extensions;
            return c3684 != null && c3684.m7958(abstractC3578CheckNotLite.mo7804());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public boolean hasField(C3656 c3656) {
            if (!c3656.f11350.hasExtendee()) {
                return super.hasField(c3656);
            }
            verifyContainingType(c3656);
            C3684 c3684 = this.extensions;
            return c3684 != null && c3684.m7958(c3656);
        }

        public void internalSetExtensionSet(C3679 c3679) {
            C3684 c3684 = new C3684(C3679.m7916(c3679.f11475, true, false));
            c3684.f11481 = c3679.f11473;
            this.extensions = c3684;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        public void mergeExtensionFields(ExtendableMessage<?> extendableMessage) {
            if (((ExtendableMessage) extendableMessage).extensions != null) {
                ensureExtensionsIsMutable();
                this.extensions.m7956(((ExtendableMessage) extendableMessage).extensions);
                onChanged();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public InterfaceC3453 newBuilderForField(C3656 c3656) {
            return c3656.f11350.hasExtendee() ? C3594.newBuilder(c3656.m7871()) : super.newBuilderForField(c3656);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304
        public boolean parseUnknownField(AbstractC3473 abstractC3473, C3696 c3696, int i) {
            ensureExtensionsIsMutable();
            abstractC3473.getClass();
            return AbstractC3412.m7532(abstractC3473, getUnknownFieldSetBuilder(), c3696, getDescriptorForType(), new C3426(this.extensions), i);
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
        public final <T> AbstractC3303 setExtension(AbstractC3581 abstractC3581, T t) {
            AbstractC3578 abstractC3578CheckNotLite = GeneratedMessage.checkNotLite(abstractC3581);
            verifyExtensionContainingType(abstractC3578CheckNotLite);
            ensureExtensionsIsMutable();
            C3656 c3656Mo7804 = abstractC3578CheckNotLite.mo7804();
            C3684 c3684 = this.extensions;
            C3615 c3615 = (C3615) abstractC3578CheckNotLite;
            C3656 c3656Mo78042 = c3615.mo7804();
            if (!c3656Mo78042.mo7819()) {
                t = (T) c3615.mo7802(t);
            } else if (c3656Mo78042.m7876() == Descriptors$FieldDescriptor$JavaType.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) t).iterator();
                while (it.hasNext()) {
                    arrayList.add(c3615.mo7802(it.next()));
                }
                t = (T) arrayList;
            }
            c3684.m7951(c3656Mo7804, t);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3303 setField(C3656 c3656, Object obj) {
            if (!c3656.f11350.hasExtendee()) {
                return (AbstractC3303) super.setField(c3656, obj);
            }
            verifyContainingType(c3656);
            ensureExtensionsIsMutable();
            this.extensions.m7951(c3656, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3304, com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3303 setRepeatedField(C3656 c3656, int i, Object obj) {
            if (!c3656.f11350.hasExtendee()) {
                return (AbstractC3303) super.setRepeatedField(c3656, i, obj);
            }
            verifyContainingType(c3656);
            ensureExtensionsIsMutable();
            this.extensions.m7952(c3656, i, obj);
            onChanged();
            return this;
        }

        public AbstractC3303(InterfaceC3531 interfaceC3531) {
            super(interfaceC3531);
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
            return super.getExtensionCount(c3615);
        }

        public final <T> AbstractC3303 clearExtension(AbstractC3578 abstractC3578) {
            return clearExtension((AbstractC3581) abstractC3578);
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
            return super.hasExtension(c3615);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        public final <T> AbstractC3303 addExtension(AbstractC3578 abstractC3578, T t) {
            return addExtension((AbstractC3581) abstractC3578, (Object) t);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
            return super.getExtension(abstractC3578, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3626
        public final <T> T getExtension(AbstractC3581 abstractC3581, int i) {
            AbstractC3578 abstractC3578CheckNotLite = GeneratedMessage.checkNotLite(abstractC3581);
            verifyExtensionContainingType(abstractC3578CheckNotLite);
            C3656 c3656Mo7804 = abstractC3578CheckNotLite.mo7804();
            C3684 c3684 = this.extensions;
            if (c3684 != null) {
                if (c3684.f11479) {
                    c3684.m7946();
                }
                return (T) abstractC3578CheckNotLite.mo7803(C3684.m7941(c3684.m7953(c3656Mo7804, i), true));
            }
            throw new IndexOutOfBoundsException();
        }

        public final <T> AbstractC3303 setExtension(AbstractC3578 abstractC3578, T t) {
            return setExtension((AbstractC3581) abstractC3578, (Object) t);
        }

        public final <T> AbstractC3303 setExtension(AbstractC3578 abstractC3578, int i, T t) {
            return setExtension((AbstractC3581) abstractC3578, i, (Object) t);
        }

        public final <T> AbstractC3303 setExtension(AbstractC3581 abstractC3581, int i, T t) {
            AbstractC3578 abstractC3578CheckNotLite = GeneratedMessage.checkNotLite(abstractC3581);
            verifyExtensionContainingType(abstractC3578CheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.m7952(abstractC3578CheckNotLite.mo7804(), i, abstractC3578CheckNotLite.mo7802(t));
            onChanged();
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessage$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class AbstractC3304 extends AbstractC3532.AbstractC3533 {
        private InterfaceC3531 builderParent;
        private boolean isClean;
        private C3640 meAsParent;
        private Object unknownFieldsOrBuilder = C3703.getDefaultInstance();

        public AbstractC3304(InterfaceC3531 interfaceC3531) {
            this.builderParent = interfaceC3531;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<C3656, Object> getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List listM7888 = internalGetFieldAccessorTable().f11263.m7888();
            int i = 0;
            while (i < listM7888.size()) {
                C3656 oneofFieldDescriptor = (C3656) listM7888.get(i);
                C3593 c3593 = oneofFieldDescriptor.f11340;
                if (c3593 != null) {
                    i += c3593.f11224 - 1;
                    if (hasOneof(c3593)) {
                        oneofFieldDescriptor = getOneofFieldDescriptor(c3593);
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                } else if (oneofFieldDescriptor.mo7819()) {
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

        private AbstractC3304 setUnknownFieldsInternal(C3703 c3703) {
            this.unknownFieldsOrBuilder = c3703;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3304 addRepeatedField(C3656 c3656, Object obj) {
            C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7842(this, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3440 build() {
            return super.build();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3452 build();

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3440 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3449, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3452 buildPartial();

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        /* JADX INFO: renamed from: clear */
        public AbstractC3304 mo7355clear() {
            this.unknownFieldsOrBuilder = C3703.getDefaultInstance();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3304 clearField(C3656 c3656) {
            C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7849(this);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3304 clearOneof(C3593 c3593) {
            C3618.m7839(internalGetFieldAccessorTable(), c3593).mo7837(this);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533
        /* JADX INFO: renamed from: clone */
        public AbstractC3304 mo7357clone() {
            return (AbstractC3304) ((AbstractC3304) getDefaultInstanceForType().newBuilderForType()).mergeFrom(buildPartial());
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533
        public void dispose() {
            this.builderParent = null;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public Map<C3656, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public abstract /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public C3662 getDescriptorForType() {
            return internalGetFieldAccessorTable().f11263;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public Object getField(C3656 c3656) {
            Object objMo7845 = C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7845(this);
            return c3656.mo7819() ? Collections.unmodifiableList((List) objMo7845) : objMo7845;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public InterfaceC3453 getFieldBuilder(C3656 c3656) {
            return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7832(this);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public C3656 getOneofFieldDescriptor(C3593 c3593) {
            return C3618.m7839(internalGetFieldAccessorTable(), c3593).mo7834(this);
        }

        public InterfaceC3531 getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new C3640(this);
            }
            return this.meAsParent;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3626
        public Object getRepeatedField(C3656 c3656, int i) {
            return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7850(this, i);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public InterfaceC3453 getRepeatedFieldBuilder(C3656 c3656, int i) {
            return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7844(this, i);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3626
        public int getRepeatedFieldCount(C3656 c3656) {
            return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7852(this);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533
        public C3711 getUnknownFieldSetBuilder() {
            Object obj = this.unknownFieldsOrBuilder;
            if (obj instanceof C3703) {
                this.unknownFieldsOrBuilder = ((C3703) obj).toBuilder();
            }
            onChanged();
            return (C3711) this.unknownFieldsOrBuilder;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public final C3703 getUnknownFields() {
            Object obj = this.unknownFieldsOrBuilder;
            return obj instanceof C3703 ? (C3703) obj : ((C3711) obj).build();
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3441
        public boolean hasField(C3656 c3656) {
            return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7847(this);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public boolean hasOneof(C3593 c3593) {
            return C3618.m7839(internalGetFieldAccessorTable(), c3593).mo7833(this);
        }

        public abstract C3618 internalGetFieldAccessorTable();

        @Deprecated
        public C3407 internalGetMapField(int i) {
            throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
        }

        public AbstractC3446 internalGetMapFieldReflection(int i) {
            return internalGetMapField(i);
        }

        @Deprecated
        public C3407 internalGetMutableMapField(int i) {
            throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
        }

        public AbstractC3446 internalGetMutableMapFieldReflection(int i) {
            return internalGetMutableMapField(i);
        }

        public boolean isClean() {
            return this.isClean;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public boolean isInitialized() {
            for (C3656 c3656 : getDescriptorForType().m7888()) {
                if (c3656.m7867() && !hasField(c3656)) {
                    return false;
                }
                if (c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                    if (c3656.mo7819()) {
                        Iterator it = ((List) getField(c3656)).iterator();
                        while (it.hasNext()) {
                            if (!((InterfaceC3452) it.next()).isInitialized()) {
                                return false;
                            }
                        }
                    } else if (hasField(c3656) && !((InterfaceC3452) getField(c3656)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533
        public void markClean() {
            this.isClean = true;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3304 mergeUnknownFields(C3703 c3703) {
            if (C3703.getDefaultInstance().equals(c3703)) {
                return this;
            }
            if (C3703.getDefaultInstance().equals(this.unknownFieldsOrBuilder)) {
                this.unknownFieldsOrBuilder = c3703;
                onChanged();
                return this;
            }
            getUnknownFieldSetBuilder().m7984(c3703);
            onChanged();
            return this;
        }

        public final void mergeUnknownLengthDelimitedField(int i, ByteString byteString) {
            C3711 unknownFieldSetBuilder = getUnknownFieldSetBuilder();
            if (i > 0) {
                unknownFieldSetBuilder.m7982(i).m7974(byteString);
            } else {
                unknownFieldSetBuilder.getClass();
                C5553.m10812(i, " is not a valid field number.");
            }
        }

        public final void mergeUnknownVarintField(int i, int i2) {
            getUnknownFieldSetBuilder().m7985(i, i2);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public InterfaceC3453 newBuilderForField(C3656 c3656) {
            return C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7831();
        }

        public void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        public final void onChanged() {
            InterfaceC3531 interfaceC3531;
            if (!this.isClean || (interfaceC3531 = this.builderParent) == null) {
                return;
            }
            interfaceC3531.mo7395();
            this.isClean = false;
        }

        public boolean parseUnknownField(AbstractC3473 abstractC3473, C3696 c3696, int i) {
            abstractC3473.getClass();
            return getUnknownFieldSetBuilder().m7980(i, abstractC3473);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3304 setField(C3656 c3656, Object obj) {
            C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7829(this, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3304 setRepeatedField(C3656 c3656, int i, Object obj) {
            C3618.m7838(internalGetFieldAccessorTable(), c3656).mo7843(this, i, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533
        public void setUnknownFieldSetBuilder(C3711 c3711) {
            this.unknownFieldsOrBuilder = c3711;
            onChanged();
        }

        public AbstractC3304 setUnknownFieldsProto3(C3703 c3703) {
            return setUnknownFieldsInternal(c3703);
        }

        @Override // com.google.protobuf.AbstractC3532.AbstractC3533, com.google.protobuf.InterfaceC3453
        public AbstractC3304 setUnknownFields(C3703 c3703) {
            return setUnknownFieldsInternal(c3703);
        }

        public AbstractC3304() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static abstract class ExtendableMessage<MessageT extends ExtendableMessage<MessageT>> extends GeneratedMessage implements InterfaceC3626 {
        private static final long serialVersionUID = 1;
        private final C3679 extensions;

        public ExtendableMessage() {
            this.extensions = new C3679();
        }

        private void verifyContainingType(C3656 c3656) {
            if (c3656.f11341 == getDescriptorForType()) {
                return;
            }
            C5919.m11249("FieldDescriptor does not match message type.");
        }

        private void verifyExtensionContainingType(C3656 c3656) {
            if (c3656.f11341 == getDescriptorForType()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Extension is for type \"");
            sb.append(c3656.f11341.f11368);
            sb.append("\" which does not match message type \"");
            C5919.m11249(AbstractC0053.m146(sb, getDescriptorForType().f11368, "\"."));
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m7931();
        }

        public final Iterator<C3630> extensionsIterator() {
            return new C3629(this.extensions);
        }

        public int extensionsSerializedSize() {
            return this.extensions.m7932();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.m7934();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
        public Map<C3656, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage
        public Map<C3656, Object> getAllFieldsRaw() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public /* bridge */ /* synthetic */ InterfaceC3440 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3551
        public abstract /* synthetic */ InterfaceC3452 getDefaultInstanceForType();

        @Override // com.google.protobuf.InterfaceC3626
        public final <T> T getExtension(AbstractC3581 abstractC3581) {
            AbstractC3578 abstractC3578CheckNotLite = GeneratedMessage.checkNotLite(abstractC3581);
            C3656 c3656Mo7804 = abstractC3578CheckNotLite.mo7804();
            verifyExtensionContainingType(c3656Mo7804);
            Object objM7936 = this.extensions.m7936(c3656Mo7804);
            return objM7936 == null ? c3656Mo7804.mo7819() ? (T) C3379.f11022 : c3656Mo7804.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? (T) ((C3615) abstractC3578CheckNotLite).f11255 : (T) abstractC3578CheckNotLite.mo7805(c3656Mo7804.m7877()) : (T) abstractC3578CheckNotLite.mo7805(objM7936);
        }

        @Override // com.google.protobuf.InterfaceC3626
        public final <T> int getExtensionCount(AbstractC3581 abstractC3581) {
            C3656 c3656Mo7804 = GeneratedMessage.checkNotLite(abstractC3581).mo7804();
            verifyExtensionContainingType(c3656Mo7804);
            return this.extensions.m7929(c3656Mo7804);
        }

        public Map<C3656, Object> getExtensionFields() {
            return this.extensions.m7935();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
        public Object getField(C3656 c3656) {
            if (!c3656.f11350.hasExtendee()) {
                return super.getField(c3656);
            }
            verifyContainingType(c3656);
            Object objM7936 = this.extensions.m7936(c3656);
            return objM7936 == null ? c3656.mo7819() ? Collections.EMPTY_LIST : c3656.m7876() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? C3594.getDefaultInstance(c3656.m7871()) : c3656.m7877() : objM7936;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public Object getRepeatedField(C3656 c3656, int i) {
            if (!c3656.f11350.hasExtendee()) {
                return super.getRepeatedField(c3656, i);
            }
            verifyContainingType(c3656);
            return this.extensions.m7930(c3656, i);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452
        public int getRepeatedFieldCount(C3656 c3656) {
            if (!c3656.f11350.hasExtendee()) {
                return super.getRepeatedFieldCount(c3656);
            }
            verifyContainingType(c3656);
            return this.extensions.m7929(c3656);
        }

        @Override // com.google.protobuf.InterfaceC3626
        public final <T> boolean hasExtension(AbstractC3581 abstractC3581) {
            C3656 c3656Mo7804 = GeneratedMessage.checkNotLite(abstractC3581).mo7804();
            verifyExtensionContainingType(c3656Mo7804);
            return this.extensions.m7933(c3656Mo7804);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3441
        public boolean hasField(C3656 c3656) {
            if (!c3656.f11350.hasExtendee()) {
                return super.hasField(c3656);
            }
            verifyContainingType(c3656);
            return this.extensions.m7933(c3656);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3439, com.google.protobuf.InterfaceC3452, com.google.protobuf.InterfaceC3551
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        @Override // com.google.protobuf.GeneratedMessage
        public void makeExtensionsImmutable() {
            GeneratedMessage.warnPre22Gencode(getClass());
            this.extensions.m7927();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public /* bridge */ /* synthetic */ InterfaceC3449 newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public abstract /* synthetic */ InterfaceC3453 newBuilderForType();

        public InterfaceC3628 newExtensionSerializer() {
            return this.extensions.f11475.isEmpty() ? C3625.f11265 : new C3627(this, false);
        }

        @Deprecated
        public C3627 newExtensionWriter() {
            return new C3627(this, false);
        }

        public InterfaceC3628 newMessageSetExtensionSerializer() {
            return this.extensions.f11475.isEmpty() ? C3625.f11265 : new C3627(this, true);
        }

        public C3627 newMessageSetExtensionWriter() {
            return new C3627(this, true);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public /* bridge */ /* synthetic */ InterfaceC3449 toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3532, com.google.protobuf.AbstractC3528, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3452
        public abstract /* synthetic */ InterfaceC3453 toBuilder();

        public ExtendableMessage(AbstractC3303 abstractC3303) {
            super(abstractC3303);
            this.extensions = abstractC3303.buildExtensions();
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(C3615 c3615) {
            return super.getExtensionCount(c3615);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(C3615 c3615) {
            return super.hasExtension(c3615);
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3578 abstractC3578) {
            return super.getExtensionCount(abstractC3578);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3578 abstractC3578) {
            return super.hasExtension(abstractC3578);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578, int i) {
            return super.getExtension(abstractC3578, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615) {
            return super.getExtension(c3615);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C3615 c3615, int i) {
            return super.getExtension(c3615, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3578 abstractC3578) {
            return super.getExtension(abstractC3578);
        }

        @Override // com.google.protobuf.InterfaceC3626
        public final <T> T getExtension(AbstractC3581 abstractC3581, int i) {
            AbstractC3578 abstractC3578CheckNotLite = GeneratedMessage.checkNotLite(abstractC3581);
            C3656 c3656Mo7804 = abstractC3578CheckNotLite.mo7804();
            verifyExtensionContainingType(c3656Mo7804);
            return (T) abstractC3578CheckNotLite.mo7803(this.extensions.m7930(c3656Mo7804, i));
        }
    }

    public GeneratedMessage(AbstractC3304 abstractC3304) {
        this.unknownFields = abstractC3304.getUnknownFields();
    }

    public static <ListT extends InterfaceC3402> ListT makeMutableCopy(ListT listt) {
        return (ListT) makeMutableCopy(listt, 0);
    }

    public static <M extends InterfaceC3452> M parseDelimitedWithIOException(InterfaceC3374 interfaceC3374, InputStream inputStream, C3696 c3696) throws IOException {
        try {
            return (M) ((AbstractC3527) interfaceC3374).m7768(inputStream, c3696);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends InterfaceC3452> M parseWithIOException(InterfaceC3374 interfaceC3374, InputStream inputStream, C3696 c3696) throws IOException {
        try {
            AbstractC3527 abstractC3527 = (AbstractC3527) interfaceC3374;
            abstractC3527.getClass();
            AbstractC3473 abstractC3473M7708 = AbstractC3473.m7708(inputStream);
            InterfaceC3440 interfaceC3440 = (InterfaceC3440) abstractC3527.mo7358(abstractC3473M7708, c3696);
            try {
                abstractC3473M7708.mo7725(0);
                AbstractC3527.m7764(interfaceC3440);
                return (M) interfaceC3440;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(interfaceC3440);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static <M extends InterfaceC3452> M parseWithIOException(InterfaceC3374 interfaceC3374, AbstractC3473 abstractC3473) throws IOException {
        try {
            InterfaceC3440 interfaceC3440 = (InterfaceC3440) ((AbstractC3527) interfaceC3374).mo7358(abstractC3473, AbstractC3527.f11169);
            AbstractC3527.m7764(interfaceC3440);
            return (M) interfaceC3440;
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends InterfaceC3452> M parseWithIOException(InterfaceC3374 interfaceC3374, AbstractC3473 abstractC3473, C3696 c3696) throws IOException {
        try {
            InterfaceC3440 interfaceC3440 = (InterfaceC3440) ((AbstractC3527) interfaceC3374).mo7358(abstractC3473, c3696);
            AbstractC3527.m7764(interfaceC3440);
            return (M) interfaceC3440;
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }
}
