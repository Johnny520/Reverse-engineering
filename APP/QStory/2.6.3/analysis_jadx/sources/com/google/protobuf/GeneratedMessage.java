package com.google.protobuf;

import androidx.activity.AbstractC0053;
import com.google.protobuf.AbstractC3533;
import com.google.protobuf.C3595;
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
import lin.xposed.hook.javaplugin.C5554;
import p336.C8791;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GeneratedMessage extends AbstractC3533 implements Serializable {
    static final String PRE22_GENCODE_ERROR_PROPERTY = "com.google.protobuf.error_on_unsafe_pre22_gencode";
    static final String PRE22_GENCODE_SILENCE_PROPERTY = "com.google.protobuf.use_unsafe_pre22_gencode";
    static final String PRE22_GENCODE_VULNERABILITY_MESSAGE = "As of 2022/09/29 (release 21.7) makeExtensionsImmutable should not be called from protobuf gencode. If you are seeing this message, your gencode is vulnerable to a denial of service attack. You should regenerate your code using protobuf 25.6 or later. Use the latest version that meets your needs. However, if you understand the risks and wish to continue with vulnerable gencode, you can set the system property `-Dcom.google.protobuf.use_unsafe_pre22_gencode` on the command line to silence this warning. You also can set `-Dcom.google.protobuf.error_on_unsafe_pre22_gencode` to throw an error instead. See security vulnerability: https://github.com/protocolbuffers/protobuf/security/advisories/GHSA-h4h5-3hr4-j3g2";
    private static final long serialVersionUID = 1;
    protected C3704 unknownFields;
    private static final Logger logger = Logger.getLogger(GeneratedMessage.class.getName());
    protected static boolean alwaysUseFieldBuilders = false;
    protected static final Set<String> loggedPre22TypeNames = new CopyOnWriteArraySet();

    public GeneratedMessage() {
        this.unknownFields = C3704.getDefaultInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageT extends ExtendableMessage<MessageT>, T> AbstractC3579 checkNotLite(AbstractC3582 abstractC3582) {
        if (!abstractC3582.mo7793()) {
            return (AbstractC3579) abstractC3582;
        }
        C5925.m11310("Expected non-lite extension.");
        return null;
    }

    public static int computeStringSize(int i, Object obj) throws Exception {
        if (!(obj instanceof String)) {
            return AbstractC3462.m7633(i, (ByteString) obj);
        }
        int iM7642 = AbstractC3462.m7642(i);
        int iM7984 = AbstractC3724.m7984((String) obj);
        return AbstractC3462.m7635(iM7984) + iM7984 + iM7642;
    }

    public static int computeStringSizeNoTag(Object obj) throws Exception {
        int size;
        int iM7635;
        if (obj instanceof String) {
            boolean z = AbstractC3462.f11129;
            size = AbstractC3724.m7984((String) obj);
            iM7635 = AbstractC3462.m7635(size);
        } else {
            boolean z2 = AbstractC3462.f11129;
            size = ((ByteString) obj).size();
            iM7635 = AbstractC3462.m7635(size);
        }
        return iM7635 + size;
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

    public static <T> InterfaceC3403 emptyList(Class<T> cls) {
        return C3380.f11027;
    }

    public static InterfaceC3404 emptyLongList() {
        return C3430.f11092;
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
    public java.util.Map<com.google.protobuf.C3657, java.lang.Object> getAllFieldsMutable(boolean r7) {
        /*
            r6 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            com.google.protobuf.飘花落叶言楪兰子苏哲世 r1 = r6.internalGetFieldAccessorTable()
            com.google.protobuf.飘花落叶言楪子哲世苏兰 r1 = r1.f11268
            java.util.List r1 = r1.m7875()
            r2 = 0
        L10:
            int r3 = r1.size()
            if (r2 >= r3) goto L6a
            java.lang.Object r3 = r1.get(r2)
            com.google.protobuf.飘花落叶言楪子兰世苏哲 r3 = (com.google.protobuf.C3657) r3
            com.google.protobuf.飘花落叶言楪世子苏哲兰 r4 = r3.f11345
            if (r4 == 0) goto L31
            int r3 = r4.f11229
            int r3 = r3 + (-1)
            int r2 = r2 + r3
            boolean r3 = r6.hasOneof(r4)
            if (r3 != 0) goto L2c
            goto L67
        L2c:
            com.google.protobuf.飘花落叶言楪子兰世苏哲 r3 = r6.getOneofFieldDescriptor(r4)
            goto L4e
        L31:
            boolean r4 = r3.mo7806()
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
            com.google.protobuf.Descriptors$FieldDescriptor$JavaType r4 = r3.m7863()
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
            C8791.m14473("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            C8791.m14473("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static boolean isStringEmpty(Object obj) {
        return obj instanceof String ? ((String) obj).isEmpty() : ((ByteString) obj).isEmpty();
    }

    public static <ListT extends InterfaceC3403> ListT makeMutableCopy(ListT listt, int i) {
        int size = listt.size();
        if (i <= size) {
            i = size * 2;
        }
        if (i <= 0) {
            i = 10;
        }
        return (ListT) listt.mo7486(i);
    }

    private static <V> void maybeSerializeBooleanEntryTo(AbstractC3462 abstractC3462, Map<Boolean, V> map, C3416 c3416, int i, boolean z) {
        if (map.containsKey(Boolean.valueOf(z))) {
            abstractC3462.mo7649(i, c3416.newBuilderForType().setKey(Boolean.valueOf(z)).setValue(map.get(Boolean.valueOf(z))).build());
        }
    }

    public static <ContainingT extends InterfaceC3453, T> C3616 newFileScopedGeneratedExtension(Class<?> cls, InterfaceC3453 interfaceC3453) {
        return new C3616(null, cls, interfaceC3453, Extension$ExtensionType.IMMUTABLE);
    }

    public static <ContainingT extends InterfaceC3453, T> C3616 newMessageScopedGeneratedExtension(InterfaceC3453 interfaceC3453, int i, Class<?> cls, InterfaceC3453 interfaceC34532) {
        return new C3616(new C3643(interfaceC3453, i), cls, interfaceC34532, Extension$ExtensionType.IMMUTABLE);
    }

    public static <M extends InterfaceC3453> M parseDelimitedWithIOException(InterfaceC3375 interfaceC3375, InputStream inputStream) throws IOException {
        try {
            return (M) ((AbstractC3528) interfaceC3375).m7755(inputStream, AbstractC3528.f11174);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends InterfaceC3453> M parseWithIOException(InterfaceC3375 interfaceC3375, InputStream inputStream) throws IOException {
        try {
            AbstractC3528 abstractC3528 = (AbstractC3528) interfaceC3375;
            C3697 c3697 = AbstractC3528.f11174;
            abstractC3528.getClass();
            AbstractC3474 abstractC3474M7695 = AbstractC3474.m7695(inputStream);
            InterfaceC3441 interfaceC3441 = (InterfaceC3441) abstractC3528.mo7345(abstractC3474M7695, c3697);
            try {
                abstractC3474M7695.mo7712(0);
                AbstractC3528.m7751(interfaceC3441);
                return (M) interfaceC3441;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(interfaceC3441);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static <V> void serializeBooleanMapTo(AbstractC3462 abstractC3462, C3408 c3408, C3416 c3416, int i) {
        Map mapM7512 = c3408.m7512();
        abstractC3462.getClass();
        serializeMapTo(abstractC3462, mapM7512, c3416, i);
    }

    public static <V> void serializeIntegerMapTo(AbstractC3462 abstractC3462, C3408 c3408, C3416 c3416, int i) {
        Map mapM7512 = c3408.m7512();
        abstractC3462.getClass();
        serializeMapTo(abstractC3462, mapM7512, c3416, i);
    }

    public static <V> void serializeLongMapTo(AbstractC3462 abstractC3462, C3408 c3408, C3416 c3416, int i) {
        Map mapM7512 = c3408.m7512();
        abstractC3462.getClass();
        serializeMapTo(abstractC3462, mapM7512, c3416, i);
    }

    private static <K, V> void serializeMapTo(AbstractC3462 abstractC3462, Map<K, V> map, C3416 c3416, int i) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            abstractC3462.mo7649(i, c3416.newBuilderForType().setKey(entry.getKey()).setValue(entry.getValue()).buildPartial());
        }
    }

    public static <V> void serializeStringMapTo(AbstractC3462 abstractC3462, C3408 c3408, C3416 c3416, int i) {
        Map mapM7512 = c3408.m7512();
        abstractC3462.getClass();
        serializeMapTo(abstractC3462, mapM7512, c3416, i);
    }

    public static void setAlwaysUseFieldBuildersForTesting(boolean z) {
        alwaysUseFieldBuilders = z;
    }

    public static void warnPre22Gencode(Class<?> cls) {
        if (System.getProperty(PRE22_GENCODE_SILENCE_PROPERTY) != null) {
            return;
        }
        String name = cls.getName();
        String strM158 = AbstractC0053.m158("Vulnerable protobuf generated type in use: ", name, "\nAs of 2022/09/29 (release 21.7) makeExtensionsImmutable should not be called from protobuf gencode. If you are seeing this message, your gencode is vulnerable to a denial of service attack. You should regenerate your code using protobuf 25.6 or later. Use the latest version that meets your needs. However, if you understand the risks and wish to continue with vulnerable gencode, you can set the system property `-Dcom.google.protobuf.use_unsafe_pre22_gencode` on the command line to silence this warning. You also can set `-Dcom.google.protobuf.error_on_unsafe_pre22_gencode` to throw an error instead. See security vulnerability: https://github.com/protocolbuffers/protobuf/security/advisories/GHSA-h4h5-3hr4-j3g2");
        if (System.getProperty(PRE22_GENCODE_ERROR_PROPERTY) != null) {
            C5925.m11308(strM158);
        } else if (loggedPre22TypeNames.add(name)) {
            logger.warning(strM158);
        }
    }

    public static void writeString(AbstractC3462 abstractC3462, int i, Object obj) {
        if (obj instanceof String) {
            abstractC3462.mo7657(i, (String) obj);
        } else {
            abstractC3462.mo7666(i, (ByteString) obj);
        }
    }

    public static void writeStringNoTag(AbstractC3462 abstractC3462, Object obj) {
        if (obj instanceof String) {
            abstractC3462.mo7656((String) obj);
        } else {
            abstractC3462.mo7667((ByteString) obj);
        }
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public Map<C3657, Object> getAllFields() {
        return Collections.unmodifiableMap(getAllFieldsMutable(false));
    }

    public Map<C3657, Object> getAllFieldsRaw() {
        return Collections.unmodifiableMap(getAllFieldsMutable(true));
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public abstract /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
    public C3663 getDescriptorForType() {
        return internalGetFieldAccessorTable().f11268;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public Object getField(C3657 c3657) {
        return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7833(this);
    }

    public Object getFieldRaw(C3657 c3657) {
        return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7817(this);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public C3657 getOneofFieldDescriptor(C3594 c3594) {
        return C3619.m7826(internalGetFieldAccessorTable(), c3594).mo7823(this);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public InterfaceC3375 getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public Object getRepeatedField(C3657 c3657, int i) {
        return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7840(i, this);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public int getRepeatedFieldCount(C3657 c3657) {
        return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7838(this);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM7527 = AbstractC3413.m7527(this, getAllFieldsRaw());
        this.memoizedSize = iM7527;
        return iM7527;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public C3704 getUnknownFields() {
        return this.unknownFields;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
    public boolean hasField(C3657 c3657) {
        return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7835(this);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
    public boolean hasOneof(C3594 c3594) {
        return C3619.m7826(internalGetFieldAccessorTable(), c3594).mo7822(this);
    }

    public abstract C3619 internalGetFieldAccessorTable();

    @Deprecated
    public C3408 internalGetMapField(int i) {
        throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
    }

    public AbstractC3447 internalGetMapFieldReflection(int i) {
        return internalGetMapField(i);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
    public boolean isInitialized() {
        for (C3657 c3657 : getDescriptorForType().m7875()) {
            if (c3657.m7854() && !hasField(c3657)) {
                return false;
            }
            if (c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                if (c3657.mo7806()) {
                    Iterator it = ((List) getField(c3657)).iterator();
                    while (it.hasNext()) {
                        if (!((InterfaceC3453) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (hasField(c3657) && !((InterfaceC3453) getField(c3657)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void makeExtensionsImmutable() {
        warnPre22Gencode(getClass());
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public /* bridge */ /* synthetic */ InterfaceC3450 newBuilderForType() {
        return super.newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ InterfaceC3454 newBuilderForType();

    public Object newInstance(AbstractC3617 abstractC3617) {
        throw new UnsupportedOperationException("This method must be overridden by the subclass.");
    }

    public boolean parseUnknownField(AbstractC3474 abstractC3474, C3712 c3712, C3697 c3697, int i) {
        abstractC3474.getClass();
        return c3712.m7967(i, abstractC3474);
    }

    public boolean parseUnknownFieldProto3(AbstractC3474 abstractC3474, C3712 c3712, C3697 c3697, int i) {
        return parseUnknownField(abstractC3474, c3712, c3697, i);
    }

    public void setUnknownFields(C3704 c3704) {
        this.unknownFields = c3704;
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public /* bridge */ /* synthetic */ InterfaceC3450 toBuilder() {
        return super.toBuilder();
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public abstract /* synthetic */ InterfaceC3454 toBuilder();

    public Object writeReplace() {
        return new GeneratedMessageLite.SerializedForm(this);
    }

    @Override // com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
    public void writeTo(AbstractC3462 abstractC3462) {
        AbstractC3413.m7521(this, getAllFieldsRaw(), abstractC3462);
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessage$飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC3304 extends AbstractC3305 implements InterfaceC3627 {
        private C3685 extensions;

        public AbstractC3304() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public C3680 buildExtensions() {
            C3685 c3685 = this.extensions;
            return c3685 == null ? C3680.f11477 : c3685.m7935(true);
        }

        private void ensureExtensionsIsMutable() {
            if (this.extensions == null) {
                C3680 c3680 = C3680.f11477;
                this.extensions = new C3685(C3350.m7403());
            }
        }

        private void verifyContainingType(C3657 c3657) {
            if (c3657.f11346 == getDescriptorForType()) {
                return;
            }
            C5925.m11310("FieldDescriptor does not match message type.");
        }

        private void verifyExtensionContainingType(AbstractC3579 abstractC3579) {
            if (abstractC3579.mo7791().f11346 == getDescriptorForType()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Extension is for type \"");
            sb.append(abstractC3579.mo7791().f11346.f11373);
            sb.append("\" which does not match message type \"");
            C5925.m11310(AbstractC0053.m151(sb, getDescriptorForType().f11373, "\"."));
        }

        public final <T> AbstractC3304 addExtension(AbstractC3582 abstractC3582, T t) {
            AbstractC3579 abstractC3579CheckNotLite = GeneratedMessage.checkNotLite(abstractC3582);
            verifyExtensionContainingType(abstractC3579CheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.m7936(abstractC3579CheckNotLite.mo7791(), abstractC3579CheckNotLite.mo7789(t));
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3304 addRepeatedField(C3657 c3657, Object obj) {
            if (!c3657.f11355.hasExtendee()) {
                return (AbstractC3304) super.addRepeatedField(c3657, obj);
            }
            verifyContainingType(c3657);
            ensureExtensionsIsMutable();
            this.extensions.m7936(c3657, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public /* bridge */ /* synthetic */ InterfaceC3441 build() {
            return super.build();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public abstract /* synthetic */ InterfaceC3453 build();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public /* bridge */ /* synthetic */ InterfaceC3441 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public abstract /* synthetic */ InterfaceC3453 buildPartial();

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public AbstractC3304 mo7342clear() {
            this.extensions = null;
            return (AbstractC3304) super.mo7342clear();
        }

        public final <T> AbstractC3304 clearExtension(AbstractC3582 abstractC3582) {
            AbstractC3579 abstractC3579CheckNotLite = GeneratedMessage.checkNotLite(abstractC3582);
            verifyExtensionContainingType(abstractC3579CheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.m7934(abstractC3579CheckNotLite.mo7791());
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3304 clearField(C3657 c3657) {
            if (!c3657.f11355.hasExtendee()) {
                return (AbstractC3304) super.clearField(c3657);
            }
            verifyContainingType(c3657);
            ensureExtensionsIsMutable();
            this.extensions.m7934(c3657);
            onChanged();
            return this;
        }

        public boolean extensionsAreInitialized() {
            C3685 c3685 = this.extensions;
            return c3685 == null || c3685.m7942();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public Map<C3657, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable();
            C3685 c3685 = this.extensions;
            if (c3685 != null) {
                allFieldsMutable.putAll(c3685.m7932());
            }
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public abstract /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

        @Override // com.google.protobuf.InterfaceC3627
        public final <T> T getExtension(AbstractC3582 abstractC3582) {
            AbstractC3579 abstractC3579CheckNotLite = GeneratedMessage.checkNotLite(abstractC3582);
            verifyExtensionContainingType(abstractC3579CheckNotLite);
            C3657 c3657Mo7791 = abstractC3579CheckNotLite.mo7791();
            C3685 c3685 = this.extensions;
            Object objM7931 = c3685 == null ? null : c3685.m7931(c3657Mo7791);
            return objM7931 == null ? c3657Mo7791.mo7806() ? (T) Collections.EMPTY_LIST : c3657Mo7791.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? (T) ((C3616) abstractC3579CheckNotLite).f11260 : (T) abstractC3579CheckNotLite.mo7792(c3657Mo7791.m7864()) : (T) abstractC3579CheckNotLite.mo7792(objM7931);
        }

        @Override // com.google.protobuf.InterfaceC3627
        public final <T> int getExtensionCount(AbstractC3582 abstractC3582) {
            AbstractC3579 abstractC3579CheckNotLite = GeneratedMessage.checkNotLite(abstractC3582);
            verifyExtensionContainingType(abstractC3579CheckNotLite);
            C3657 c3657Mo7791 = abstractC3579CheckNotLite.mo7791();
            C3685 c3685 = this.extensions;
            if (c3685 == null) {
                return 0;
            }
            return c3685.m7944(c3657Mo7791);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public Object getField(C3657 c3657) {
            if (!c3657.f11355.hasExtendee()) {
                return super.getField(c3657);
            }
            verifyContainingType(c3657);
            C3685 c3685 = this.extensions;
            Object objM7931 = c3685 == null ? null : c3685.m7931(c3657);
            return objM7931 == null ? c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? C3595.getDefaultInstance(c3657.m7858()) : c3657.m7864() : objM7931;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public InterfaceC3454 getFieldBuilder(C3657 c3657) {
            if (!c3657.f11355.hasExtendee()) {
                return super.getFieldBuilder(c3657);
            }
            verifyContainingType(c3657);
            if (c3657.m7863() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C5925.m11308("getFieldBuilder() called on a non-Message type.");
                return null;
            }
            ensureExtensionsIsMutable();
            Object objM7941 = this.extensions.m7941(c3657);
            if (objM7941 == null) {
                C3595.C3596 c3596NewBuilder = C3595.newBuilder(c3657.m7858());
                this.extensions.m7938(c3657, c3596NewBuilder);
                onChanged();
                return c3596NewBuilder;
            }
            if (objM7941 instanceof InterfaceC3454) {
                return (InterfaceC3454) objM7941;
            }
            if (!(objM7941 instanceof InterfaceC3453)) {
                C5925.m11308("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            InterfaceC3454 builder = ((InterfaceC3453) objM7941).toBuilder();
            this.extensions.m7938(c3657, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3627
        public Object getRepeatedField(C3657 c3657, int i) {
            if (!c3657.f11355.hasExtendee()) {
                return super.getRepeatedField(c3657, i);
            }
            verifyContainingType(c3657);
            C3685 c3685 = this.extensions;
            if (c3685 == null) {
                throw new IndexOutOfBoundsException();
            }
            if (c3685.f11484) {
                c3685.m7933();
            }
            return C3685.m7928(c3685.m7940(c3657, i), true);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public InterfaceC3454 getRepeatedFieldBuilder(C3657 c3657, int i) {
            if (!c3657.f11355.hasExtendee()) {
                return super.getRepeatedFieldBuilder(c3657, i);
            }
            verifyContainingType(c3657);
            ensureExtensionsIsMutable();
            if (c3657.m7863() != Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                C5925.m11308("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            Object objM7940 = this.extensions.m7940(c3657, i);
            if (objM7940 instanceof InterfaceC3454) {
                return (InterfaceC3454) objM7940;
            }
            if (!(objM7940 instanceof InterfaceC3453)) {
                C5925.m11308("getRepeatedFieldBuilder() called on a non-Message type.");
                return null;
            }
            InterfaceC3454 builder = ((InterfaceC3453) objM7940).toBuilder();
            this.extensions.m7939(c3657, i, builder);
            onChanged();
            return builder;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3627
        public int getRepeatedFieldCount(C3657 c3657) {
            if (!c3657.f11355.hasExtendee()) {
                return super.getRepeatedFieldCount(c3657);
            }
            verifyContainingType(c3657);
            C3685 c3685 = this.extensions;
            if (c3685 == null) {
                return 0;
            }
            return c3685.m7944(c3657);
        }

        @Override // com.google.protobuf.InterfaceC3627
        public final <T> boolean hasExtension(AbstractC3582 abstractC3582) {
            AbstractC3579 abstractC3579CheckNotLite = GeneratedMessage.checkNotLite(abstractC3582);
            verifyExtensionContainingType(abstractC3579CheckNotLite);
            C3685 c3685 = this.extensions;
            return c3685 != null && c3685.m7945(abstractC3579CheckNotLite.mo7791());
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public boolean hasField(C3657 c3657) {
            if (!c3657.f11355.hasExtendee()) {
                return super.hasField(c3657);
            }
            verifyContainingType(c3657);
            C3685 c3685 = this.extensions;
            return c3685 != null && c3685.m7945(c3657);
        }

        public void internalSetExtensionSet(C3680 c3680) {
            C3685 c3685 = new C3685(C3680.m7903(c3680.f11480, true, false));
            c3685.f11486 = c3680.f11478;
            this.extensions = c3685;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        public void mergeExtensionFields(ExtendableMessage<?> extendableMessage) {
            if (((ExtendableMessage) extendableMessage).extensions != null) {
                ensureExtensionsIsMutable();
                this.extensions.m7943(((ExtendableMessage) extendableMessage).extensions);
                onChanged();
            }
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public InterfaceC3454 newBuilderForField(C3657 c3657) {
            return c3657.f11355.hasExtendee() ? C3595.newBuilder(c3657.m7858()) : super.newBuilderForField(c3657);
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305
        public boolean parseUnknownField(AbstractC3474 abstractC3474, C3697 c3697, int i) {
            ensureExtensionsIsMutable();
            abstractC3474.getClass();
            return AbstractC3413.m7519(abstractC3474, getUnknownFieldSetBuilder(), c3697, getDescriptorForType(), new C3427(this.extensions), i);
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
        public final <T> AbstractC3304 setExtension(AbstractC3582 abstractC3582, T t) {
            AbstractC3579 abstractC3579CheckNotLite = GeneratedMessage.checkNotLite(abstractC3582);
            verifyExtensionContainingType(abstractC3579CheckNotLite);
            ensureExtensionsIsMutable();
            C3657 c3657Mo7791 = abstractC3579CheckNotLite.mo7791();
            C3685 c3685 = this.extensions;
            C3616 c3616 = (C3616) abstractC3579CheckNotLite;
            C3657 c3657Mo77912 = c3616.mo7791();
            if (!c3657Mo77912.mo7806()) {
                t = (T) c3616.mo7789(t);
            } else if (c3657Mo77912.m7863() == Descriptors$FieldDescriptor$JavaType.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) t).iterator();
                while (it.hasNext()) {
                    arrayList.add(c3616.mo7789(it.next()));
                }
                t = (T) arrayList;
            }
            c3685.m7938(c3657Mo7791, t);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3304 setField(C3657 c3657, Object obj) {
            if (!c3657.f11355.hasExtendee()) {
                return (AbstractC3304) super.setField(c3657, obj);
            }
            verifyContainingType(c3657);
            ensureExtensionsIsMutable();
            this.extensions.m7938(c3657, obj);
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessage.AbstractC3305, com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3304 setRepeatedField(C3657 c3657, int i, Object obj) {
            if (!c3657.f11355.hasExtendee()) {
                return (AbstractC3304) super.setRepeatedField(c3657, i, obj);
            }
            verifyContainingType(c3657);
            ensureExtensionsIsMutable();
            this.extensions.m7939(c3657, i, obj);
            onChanged();
            return this;
        }

        public AbstractC3304(InterfaceC3532 interfaceC3532) {
            super(interfaceC3532);
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
            return super.getExtensionCount(c3616);
        }

        public final <T> AbstractC3304 clearExtension(AbstractC3579 abstractC3579) {
            return clearExtension((AbstractC3582) abstractC3579);
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
            return super.hasExtension(c3616);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        public final <T> AbstractC3304 addExtension(AbstractC3579 abstractC3579, T t) {
            return addExtension((AbstractC3582) abstractC3579, (Object) t);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
            return super.getExtension(abstractC3579, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3627
        public final <T> T getExtension(AbstractC3582 abstractC3582, int i) {
            AbstractC3579 abstractC3579CheckNotLite = GeneratedMessage.checkNotLite(abstractC3582);
            verifyExtensionContainingType(abstractC3579CheckNotLite);
            C3657 c3657Mo7791 = abstractC3579CheckNotLite.mo7791();
            C3685 c3685 = this.extensions;
            if (c3685 != null) {
                if (c3685.f11484) {
                    c3685.m7933();
                }
                return (T) abstractC3579CheckNotLite.mo7790(C3685.m7928(c3685.m7940(c3657Mo7791, i), true));
            }
            throw new IndexOutOfBoundsException();
        }

        public final <T> AbstractC3304 setExtension(AbstractC3579 abstractC3579, T t) {
            return setExtension((AbstractC3582) abstractC3579, (Object) t);
        }

        public final <T> AbstractC3304 setExtension(AbstractC3579 abstractC3579, int i, T t) {
            return setExtension((AbstractC3582) abstractC3579, i, (Object) t);
        }

        public final <T> AbstractC3304 setExtension(AbstractC3582 abstractC3582, int i, T t) {
            AbstractC3579 abstractC3579CheckNotLite = GeneratedMessage.checkNotLite(abstractC3582);
            verifyExtensionContainingType(abstractC3579CheckNotLite);
            ensureExtensionsIsMutable();
            this.extensions.m7939(abstractC3579CheckNotLite.mo7791(), i, abstractC3579CheckNotLite.mo7789(t));
            onChanged();
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.GeneratedMessage$飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class AbstractC3305 extends AbstractC3533.AbstractC3534 {
        private InterfaceC3532 builderParent;
        private boolean isClean;
        private C3641 meAsParent;
        private Object unknownFieldsOrBuilder = C3704.getDefaultInstance();

        public AbstractC3305(InterfaceC3532 interfaceC3532) {
            this.builderParent = interfaceC3532;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Map<C3657, Object> getAllFieldsMutable() {
            TreeMap treeMap = new TreeMap();
            List listM7875 = internalGetFieldAccessorTable().f11268.m7875();
            int i = 0;
            while (i < listM7875.size()) {
                C3657 oneofFieldDescriptor = (C3657) listM7875.get(i);
                C3594 c3594 = oneofFieldDescriptor.f11345;
                if (c3594 != null) {
                    i += c3594.f11229 - 1;
                    if (hasOneof(c3594)) {
                        oneofFieldDescriptor = getOneofFieldDescriptor(c3594);
                        treeMap.put(oneofFieldDescriptor, getField(oneofFieldDescriptor));
                    }
                } else if (oneofFieldDescriptor.mo7806()) {
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

        private AbstractC3305 setUnknownFieldsInternal(C3704 c3704) {
            this.unknownFieldsOrBuilder = c3704;
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3305 addRepeatedField(C3657 c3657, Object obj) {
            C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7829(this, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public /* bridge */ /* synthetic */ InterfaceC3441 build() {
            return super.build();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public abstract /* synthetic */ InterfaceC3453 build();

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public /* bridge */ /* synthetic */ InterfaceC3441 buildPartial() {
            return super.buildPartial();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3450, com.google.protobuf.InterfaceC3454
        public abstract /* synthetic */ InterfaceC3453 buildPartial();

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        /* JADX INFO: renamed from: clear */
        public AbstractC3305 mo7342clear() {
            this.unknownFieldsOrBuilder = C3704.getDefaultInstance();
            onChanged();
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3305 clearField(C3657 c3657) {
            C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7836(this);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3305 clearOneof(C3594 c3594) {
            C3619.m7826(internalGetFieldAccessorTable(), c3594).mo7824(this);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534
        /* JADX INFO: renamed from: clone */
        public AbstractC3305 mo7344clone() {
            return (AbstractC3305) ((AbstractC3305) getDefaultInstanceForType().newBuilderForType()).mergeFrom(buildPartial());
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534
        public void dispose() {
            this.builderParent = null;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public Map<C3657, Object> getAllFields() {
            return Collections.unmodifiableMap(getAllFieldsMutable());
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public abstract /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public C3663 getDescriptorForType() {
            return internalGetFieldAccessorTable().f11268;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public Object getField(C3657 c3657) {
            Object objMo7832 = C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7832(this);
            return c3657.mo7806() ? Collections.unmodifiableList((List) objMo7832) : objMo7832;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public InterfaceC3454 getFieldBuilder(C3657 c3657) {
            return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7819(this);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public C3657 getOneofFieldDescriptor(C3594 c3594) {
            return C3619.m7826(internalGetFieldAccessorTable(), c3594).mo7821(this);
        }

        public InterfaceC3532 getParentForChildren() {
            if (this.meAsParent == null) {
                this.meAsParent = new C3641(this);
            }
            return this.meAsParent;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3627
        public Object getRepeatedField(C3657 c3657, int i) {
            return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7837(this, i);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public InterfaceC3454 getRepeatedFieldBuilder(C3657 c3657, int i) {
            return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7831(this, i);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3627
        public int getRepeatedFieldCount(C3657 c3657) {
            return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7839(this);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534
        public C3712 getUnknownFieldSetBuilder() {
            Object obj = this.unknownFieldsOrBuilder;
            if (obj instanceof C3704) {
                this.unknownFieldsOrBuilder = ((C3704) obj).toBuilder();
            }
            onChanged();
            return (C3712) this.unknownFieldsOrBuilder;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public final C3704 getUnknownFields() {
            Object obj = this.unknownFieldsOrBuilder;
            return obj instanceof C3704 ? (C3704) obj : ((C3712) obj).build();
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454, com.google.protobuf.InterfaceC3442
        public boolean hasField(C3657 c3657) {
            return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7834(this);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public boolean hasOneof(C3594 c3594) {
            return C3619.m7826(internalGetFieldAccessorTable(), c3594).mo7820(this);
        }

        public abstract C3619 internalGetFieldAccessorTable();

        @Deprecated
        public C3408 internalGetMapField(int i) {
            throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
        }

        public AbstractC3447 internalGetMapFieldReflection(int i) {
            return internalGetMapField(i);
        }

        @Deprecated
        public C3408 internalGetMutableMapField(int i) {
            throw new IllegalArgumentException("No map fields found in ".concat(getClass().getName()));
        }

        public AbstractC3447 internalGetMutableMapFieldReflection(int i) {
            return internalGetMutableMapField(i);
        }

        public boolean isClean() {
            return this.isClean;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public boolean isInitialized() {
            for (C3657 c3657 : getDescriptorForType().m7875()) {
                if (c3657.m7854() && !hasField(c3657)) {
                    return false;
                }
                if (c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE) {
                    if (c3657.mo7806()) {
                        Iterator it = ((List) getField(c3657)).iterator();
                        while (it.hasNext()) {
                            if (!((InterfaceC3453) it.next()).isInitialized()) {
                                return false;
                            }
                        }
                    } else if (hasField(c3657) && !((InterfaceC3453) getField(c3657)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534
        public void markClean() {
            this.isClean = true;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3305 mergeUnknownFields(C3704 c3704) {
            if (C3704.getDefaultInstance().equals(c3704)) {
                return this;
            }
            if (C3704.getDefaultInstance().equals(this.unknownFieldsOrBuilder)) {
                this.unknownFieldsOrBuilder = c3704;
                onChanged();
                return this;
            }
            getUnknownFieldSetBuilder().m7971(c3704);
            onChanged();
            return this;
        }

        public final void mergeUnknownLengthDelimitedField(int i, ByteString byteString) {
            C3712 unknownFieldSetBuilder = getUnknownFieldSetBuilder();
            if (i > 0) {
                unknownFieldSetBuilder.m7969(i).m7961(byteString);
            } else {
                unknownFieldSetBuilder.getClass();
                C5554.m10869(i, " is not a valid field number.");
            }
        }

        public final void mergeUnknownVarintField(int i, int i2) {
            getUnknownFieldSetBuilder().m7972(i, i2);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public InterfaceC3454 newBuilderForField(C3657 c3657) {
            return C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7818();
        }

        public void onBuilt() {
            if (this.builderParent != null) {
                markClean();
            }
        }

        public final void onChanged() {
            InterfaceC3532 interfaceC3532;
            if (!this.isClean || (interfaceC3532 = this.builderParent) == null) {
                return;
            }
            interfaceC3532.mo7382();
            this.isClean = false;
        }

        public boolean parseUnknownField(AbstractC3474 abstractC3474, C3697 c3697, int i) {
            abstractC3474.getClass();
            return getUnknownFieldSetBuilder().m7967(i, abstractC3474);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3305 setField(C3657 c3657, Object obj) {
            C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7816(this, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3305 setRepeatedField(C3657 c3657, int i, Object obj) {
            C3619.m7825(internalGetFieldAccessorTable(), c3657).mo7830(this, i, obj);
            return this;
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534
        public void setUnknownFieldSetBuilder(C3712 c3712) {
            this.unknownFieldsOrBuilder = c3712;
            onChanged();
        }

        public AbstractC3305 setUnknownFieldsProto3(C3704 c3704) {
            return setUnknownFieldsInternal(c3704);
        }

        @Override // com.google.protobuf.AbstractC3533.AbstractC3534, com.google.protobuf.InterfaceC3454
        public AbstractC3305 setUnknownFields(C3704 c3704) {
            return setUnknownFieldsInternal(c3704);
        }

        public AbstractC3305() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static abstract class ExtendableMessage<MessageT extends ExtendableMessage<MessageT>> extends GeneratedMessage implements InterfaceC3627 {
        private static final long serialVersionUID = 1;
        private final C3680 extensions;

        public ExtendableMessage() {
            this.extensions = new C3680();
        }

        private void verifyContainingType(C3657 c3657) {
            if (c3657.f11346 == getDescriptorForType()) {
                return;
            }
            C5925.m11310("FieldDescriptor does not match message type.");
        }

        private void verifyExtensionContainingType(C3657 c3657) {
            if (c3657.f11346 == getDescriptorForType()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Extension is for type \"");
            sb.append(c3657.f11346.f11373);
            sb.append("\" which does not match message type \"");
            C5925.m11310(AbstractC0053.m151(sb, getDescriptorForType().f11373, "\"."));
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m7918();
        }

        public final Iterator<C3631> extensionsIterator() {
            return new C3630(this.extensions);
        }

        public int extensionsSerializedSize() {
            return this.extensions.m7919();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.m7921();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
        public Map<C3657, Object> getAllFields() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage
        public Map<C3657, Object> getAllFieldsRaw() {
            Map allFieldsMutable = getAllFieldsMutable(false);
            allFieldsMutable.putAll(getExtensionFields());
            return Collections.unmodifiableMap(allFieldsMutable);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public /* bridge */ /* synthetic */ InterfaceC3441 getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442, com.google.protobuf.InterfaceC3552
        public abstract /* synthetic */ InterfaceC3453 getDefaultInstanceForType();

        @Override // com.google.protobuf.InterfaceC3627
        public final <T> T getExtension(AbstractC3582 abstractC3582) {
            AbstractC3579 abstractC3579CheckNotLite = GeneratedMessage.checkNotLite(abstractC3582);
            C3657 c3657Mo7791 = abstractC3579CheckNotLite.mo7791();
            verifyExtensionContainingType(c3657Mo7791);
            Object objM7923 = this.extensions.m7923(c3657Mo7791);
            return objM7923 == null ? c3657Mo7791.mo7806() ? (T) C3380.f11027 : c3657Mo7791.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? (T) ((C3616) abstractC3579CheckNotLite).f11260 : (T) abstractC3579CheckNotLite.mo7792(c3657Mo7791.m7864()) : (T) abstractC3579CheckNotLite.mo7792(objM7923);
        }

        @Override // com.google.protobuf.InterfaceC3627
        public final <T> int getExtensionCount(AbstractC3582 abstractC3582) {
            C3657 c3657Mo7791 = GeneratedMessage.checkNotLite(abstractC3582).mo7791();
            verifyExtensionContainingType(c3657Mo7791);
            return this.extensions.m7916(c3657Mo7791);
        }

        public Map<C3657, Object> getExtensionFields() {
            return this.extensions.m7922();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
        public Object getField(C3657 c3657) {
            if (!c3657.f11355.hasExtendee()) {
                return super.getField(c3657);
            }
            verifyContainingType(c3657);
            Object objM7923 = this.extensions.m7923(c3657);
            return objM7923 == null ? c3657.mo7806() ? Collections.EMPTY_LIST : c3657.m7863() == Descriptors$FieldDescriptor$JavaType.MESSAGE ? C3595.getDefaultInstance(c3657.m7858()) : c3657.m7864() : objM7923;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public Object getRepeatedField(C3657 c3657, int i) {
            if (!c3657.f11355.hasExtendee()) {
                return super.getRepeatedField(c3657, i);
            }
            verifyContainingType(c3657);
            return this.extensions.m7917(c3657, i);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453
        public int getRepeatedFieldCount(C3657 c3657) {
            if (!c3657.f11355.hasExtendee()) {
                return super.getRepeatedFieldCount(c3657);
            }
            verifyContainingType(c3657);
            return this.extensions.m7916(c3657);
        }

        @Override // com.google.protobuf.InterfaceC3627
        public final <T> boolean hasExtension(AbstractC3582 abstractC3582) {
            C3657 c3657Mo7791 = GeneratedMessage.checkNotLite(abstractC3582).mo7791();
            verifyExtensionContainingType(c3657Mo7791);
            return this.extensions.m7920(c3657Mo7791);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3442
        public boolean hasField(C3657 c3657) {
            if (!c3657.f11355.hasExtendee()) {
                return super.hasField(c3657);
            }
            verifyContainingType(c3657);
            return this.extensions.m7920(c3657);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3440, com.google.protobuf.InterfaceC3453, com.google.protobuf.InterfaceC3552
        public boolean isInitialized() {
            return super.isInitialized() && extensionsAreInitialized();
        }

        @Override // com.google.protobuf.GeneratedMessage
        public void makeExtensionsImmutable() {
            GeneratedMessage.warnPre22Gencode(getClass());
            this.extensions.m7914();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3450 newBuilderForType() {
            return super.newBuilderForType();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3454 newBuilderForType();

        public InterfaceC3629 newExtensionSerializer() {
            return this.extensions.f11480.isEmpty() ? C3626.f11270 : new C3628(this, false);
        }

        @Deprecated
        public C3628 newExtensionWriter() {
            return new C3628(this, false);
        }

        public InterfaceC3629 newMessageSetExtensionSerializer() {
            return this.extensions.f11480.isEmpty() ? C3626.f11270 : new C3628(this, true);
        }

        public C3628 newMessageSetExtensionWriter() {
            return new C3628(this, true);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public /* bridge */ /* synthetic */ InterfaceC3450 toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractC3533, com.google.protobuf.AbstractC3529, com.google.protobuf.InterfaceC3441, com.google.protobuf.InterfaceC3453
        public abstract /* synthetic */ InterfaceC3454 toBuilder();

        public ExtendableMessage(AbstractC3304 abstractC3304) {
            super(abstractC3304);
            this.extensions = abstractC3304.buildExtensions();
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(C3616 c3616) {
            return super.getExtensionCount(c3616);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(C3616 c3616) {
            return super.hasExtension(c3616);
        }

        public /* bridge */ /* synthetic */ int getExtensionCount(AbstractC3579 abstractC3579) {
            return super.getExtensionCount(abstractC3579);
        }

        public /* bridge */ /* synthetic */ boolean hasExtension(AbstractC3579 abstractC3579) {
            return super.hasExtension(abstractC3579);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579, int i) {
            return super.getExtension(abstractC3579, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616) {
            return super.getExtension(c3616);
        }

        public /* bridge */ /* synthetic */ Object getExtension(C3616 c3616, int i) {
            return super.getExtension(c3616, i);
        }

        public /* bridge */ /* synthetic */ Object getExtension(AbstractC3579 abstractC3579) {
            return super.getExtension(abstractC3579);
        }

        @Override // com.google.protobuf.InterfaceC3627
        public final <T> T getExtension(AbstractC3582 abstractC3582, int i) {
            AbstractC3579 abstractC3579CheckNotLite = GeneratedMessage.checkNotLite(abstractC3582);
            C3657 c3657Mo7791 = abstractC3579CheckNotLite.mo7791();
            verifyExtensionContainingType(c3657Mo7791);
            return (T) abstractC3579CheckNotLite.mo7790(this.extensions.m7917(c3657Mo7791, i));
        }
    }

    public GeneratedMessage(AbstractC3305 abstractC3305) {
        this.unknownFields = abstractC3305.getUnknownFields();
    }

    public static <ListT extends InterfaceC3403> ListT makeMutableCopy(ListT listt) {
        return (ListT) makeMutableCopy(listt, 0);
    }

    public static <M extends InterfaceC3453> M parseDelimitedWithIOException(InterfaceC3375 interfaceC3375, InputStream inputStream, C3697 c3697) throws IOException {
        try {
            return (M) ((AbstractC3528) interfaceC3375).m7755(inputStream, c3697);
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends InterfaceC3453> M parseWithIOException(InterfaceC3375 interfaceC3375, InputStream inputStream, C3697 c3697) throws IOException {
        try {
            AbstractC3528 abstractC3528 = (AbstractC3528) interfaceC3375;
            abstractC3528.getClass();
            AbstractC3474 abstractC3474M7695 = AbstractC3474.m7695(inputStream);
            InterfaceC3441 interfaceC3441 = (InterfaceC3441) abstractC3528.mo7345(abstractC3474M7695, c3697);
            try {
                abstractC3474M7695.mo7712(0);
                AbstractC3528.m7751(interfaceC3441);
                return (M) interfaceC3441;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(interfaceC3441);
            }
        } catch (InvalidProtocolBufferException e2) {
            throw e2.unwrapIOException();
        }
    }

    public static <M extends InterfaceC3453> M parseWithIOException(InterfaceC3375 interfaceC3375, AbstractC3474 abstractC3474) throws IOException {
        try {
            InterfaceC3441 interfaceC3441 = (InterfaceC3441) ((AbstractC3528) interfaceC3375).mo7345(abstractC3474, AbstractC3528.f11174);
            AbstractC3528.m7751(interfaceC3441);
            return (M) interfaceC3441;
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }

    public static <M extends InterfaceC3453> M parseWithIOException(InterfaceC3375 interfaceC3375, AbstractC3474 abstractC3474, C3697 c3697) throws IOException {
        try {
            InterfaceC3441 interfaceC3441 = (InterfaceC3441) ((AbstractC3528) interfaceC3375).mo7345(abstractC3474, c3697);
            AbstractC3528.m7751(interfaceC3441);
            return (M) interfaceC3441;
        } catch (InvalidProtocolBufferException e) {
            throw e.unwrapIOException();
        }
    }
}
