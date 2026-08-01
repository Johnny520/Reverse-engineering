package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import androidx.collection.C1123;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5544;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5561;
import kotlin.reflect.jvm.internal.impl.protobuf.C5540;
import kotlin.reflect.jvm.internal.impl.protobuf.C5541;
import kotlin.reflect.jvm.internal.impl.protobuf.C5543;
import kotlin.reflect.jvm.internal.impl.protobuf.C5548;
import kotlin.reflect.jvm.internal.impl.protobuf.C5558;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5531;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5555;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p087.C7746;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBuf$StringTableTypes extends GeneratedMessageLite implements InterfaceC5532 {
    public static InterfaceC5531 PARSER = new C7746(3);
    private static final JvmProtoBuf$StringTableTypes defaultInstance;
    private int localNameMemoizedSerializedSize;
    private List<Integer> localName_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<Record> record_;
    private final AbstractC5542 unknownFields;

    static {
        JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes = new JvmProtoBuf$StringTableTypes(true);
        defaultInstance = jvmProtoBuf$StringTableTypes;
        jvmProtoBuf$StringTableTypes.initFields();
    }

    private JvmProtoBuf$StringTableTypes(C5541 c5541, C5558 c5558) {
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C5543 c5543 = new C5543();
        C5540 c5540M9924 = C5540.m9924(c5543, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM9946 = c5541.m9946();
                    if (iM9946 != 0) {
                        if (iM9946 == 10) {
                            if ((i & 1) != 1) {
                                this.record_ = new ArrayList();
                                i |= 1;
                            }
                            this.record_.add((Record) c5541.m9939(Record.PARSER, c5558));
                        } else if (iM9946 == 40) {
                            if ((i & 2) != 2) {
                                this.localName_ = new ArrayList();
                                i |= 2;
                            }
                            this.localName_.add(Integer.valueOf(c5541.m9956()));
                        } else if (iM9946 == 42) {
                            int iM9942 = c5541.m9942(c5541.m9956());
                            if ((i & 2) != 2 && c5541.m9944() > 0) {
                                this.localName_ = new ArrayList();
                                i |= 2;
                            }
                            while (c5541.m9944() > 0) {
                                this.localName_.add(Integer.valueOf(c5541.m9956()));
                            }
                            c5541.m9943(iM9942);
                        } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(this);
                } catch (IOException e2) {
                    throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.record_ = Collections.unmodifiableList(this.record_);
                }
                if ((i & 2) == 2) {
                    this.localName_ = Collections.unmodifiableList(this.localName_);
                }
                try {
                    c5540M9924.m9935();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = c5543.m9962();
                    throw th2;
                }
                this.unknownFields = c5543.m9962();
                makeExtensionsImmutable();
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.record_ = Collections.unmodifiableList(this.record_);
        }
        if ((i & 2) == 2) {
            this.localName_ = Collections.unmodifiableList(this.localName_);
        }
        try {
            c5540M9924.m9935();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c5543.m9962();
            throw th3;
        }
        this.unknownFields = c5543.m9962();
        makeExtensionsImmutable();
    }

    public static JvmProtoBuf$StringTableTypes getDefaultInstance() {
        return defaultInstance;
    }

    private void initFields() {
        List list = Collections.EMPTY_LIST;
        this.record_ = list;
        this.localName_ = list;
    }

    public static C5488 newBuilder() {
        C5488 c5488 = new C5488();
        List list = Collections.EMPTY_LIST;
        c5488.f13950 = list;
        c5488.f13948 = list;
        return c5488;
    }

    public static JvmProtoBuf$StringTableTypes parseDelimitedFrom(InputStream inputStream, C5558 c5558) {
        return (JvmProtoBuf$StringTableTypes) ((AbstractC5544) PARSER).m9966(inputStream, c5558);
    }

    public List<Integer> getLocalNameList() {
        return this.localName_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC5531 getParserForType() {
        return PARSER;
    }

    public List<Record> getRecordList() {
        return this.record_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9919 = 0;
        for (int i2 = 0; i2 < this.record_.size(); i2++) {
            iM9919 += C5540.m9919(1, this.record_.get(i2));
        }
        int iM9920 = 0;
        for (int i3 = 0; i3 < this.localName_.size(); i3++) {
            iM9920 += C5540.m9920(this.localName_.get(i3).intValue());
        }
        int iM99202 = iM9919 + iM9920;
        if (!getLocalNameList().isEmpty()) {
            iM99202 = iM99202 + 1 + C5540.m9920(iM9920);
        }
        this.localNameMemoizedSerializedSize = iM9920;
        int size = this.unknownFields.size() + iM99202;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public void writeTo(C5540 c5540) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.record_.size(); i++) {
            c5540.m9929(1, this.record_.get(i));
        }
        if (getLocalNameList().size() > 0) {
            c5540.m9925(42);
            c5540.m9925(this.localNameMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.localName_.size(); i2++) {
            c5540.m9930(this.localName_.get(i2).intValue());
        }
        c5540.m9934(this.unknownFields);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Record extends GeneratedMessageLite implements InterfaceC5532 {
        public static InterfaceC5531 PARSER = new C5487();
        private static final Record defaultInstance;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        private Operation operation_;
        private int predefinedIndex_;
        private int range_;
        private int replaceCharMemoizedSerializedSize;
        private List<Integer> replaceChar_;
        private Object string_;
        private int substringIndexMemoizedSerializedSize;
        private List<Integer> substringIndex_;
        private final AbstractC5542 unknownFields;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Operation implements InterfaceC5554 {
            NONE(0, 0),
            INTERNAL_TO_CLASS_ID(1, 1),
            DESC_TO_CLASS_ID(2, 2);

            private static InterfaceC5555 internalValueMap = new C5485();
            private final int value;

            Operation(int i, int i2) {
                this.value = i2;
            }

            public static Operation valueOf(int i) {
                if (i == 0) {
                    return NONE;
                }
                if (i == 1) {
                    return INTERNAL_TO_CLASS_ID;
                }
                if (i != 2) {
                    return null;
                }
                return DESC_TO_CLASS_ID;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Record record = new Record(true);
            defaultInstance = record;
            record.initFields();
        }

        private Record(C5541 c5541, C5558 c5558) {
            this.substringIndexMemoizedSerializedSize = -1;
            this.replaceCharMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            C5543 c5543 = new C5543();
            C5540 c5540M9924 = C5540.m9924(c5543, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iM9946 = c5541.m9946();
                        if (iM9946 != 0) {
                            if (iM9946 == 8) {
                                this.bitField0_ |= 1;
                                this.range_ = c5541.m9956();
                            } else if (iM9946 == 16) {
                                this.bitField0_ |= 2;
                                this.predefinedIndex_ = c5541.m9956();
                            } else if (iM9946 == 24) {
                                int iM9956 = c5541.m9956();
                                Operation operationValueOf = Operation.valueOf(iM9956);
                                if (operationValueOf == null) {
                                    c5540M9924.m9925(iM9946);
                                    c5540M9924.m9925(iM9956);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.operation_ = operationValueOf;
                                }
                            } else if (iM9946 == 32) {
                                if ((i & 16) != 16) {
                                    this.substringIndex_ = new ArrayList();
                                    i |= 16;
                                }
                                this.substringIndex_.add(Integer.valueOf(c5541.m9956()));
                            } else if (iM9946 == 34) {
                                int iM9942 = c5541.m9942(c5541.m9956());
                                if ((i & 16) != 16 && c5541.m9944() > 0) {
                                    this.substringIndex_ = new ArrayList();
                                    i |= 16;
                                }
                                while (c5541.m9944() > 0) {
                                    this.substringIndex_.add(Integer.valueOf(c5541.m9956()));
                                }
                                c5541.m9943(iM9942);
                            } else if (iM9946 == 40) {
                                if ((i & 32) != 32) {
                                    this.replaceChar_ = new ArrayList();
                                    i |= 32;
                                }
                                this.replaceChar_.add(Integer.valueOf(c5541.m9956()));
                            } else if (iM9946 == 42) {
                                int iM99422 = c5541.m9942(c5541.m9956());
                                if ((i & 32) != 32 && c5541.m9944() > 0) {
                                    this.replaceChar_ = new ArrayList();
                                    i |= 32;
                                }
                                while (c5541.m9944() > 0) {
                                    this.replaceChar_.add(Integer.valueOf(c5541.m9956()));
                                }
                                c5541.m9943(iM99422);
                            } else if (iM9946 == 50) {
                                C5548 c5548M9941 = c5541.m9941();
                                this.bitField0_ |= 4;
                                this.string_ = c5548M9941;
                            } else if (!parseUnknownField(c5541, c5540M9924, c5558, iM9946)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                    }
                    if ((i & 32) == 32) {
                        this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
                    }
                    try {
                        c5540M9924.m9935();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = c5543.m9962();
                        throw th2;
                    }
                    this.unknownFields = c5543.m9962();
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if ((i & 16) == 16) {
                this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
            }
            if ((i & 32) == 32) {
                this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
            }
            try {
                c5540M9924.m9935();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = c5543.m9962();
                throw th3;
            }
            this.unknownFields = c5543.m9962();
            makeExtensionsImmutable();
        }

        public static Record getDefaultInstance() {
            return defaultInstance;
        }

        private void initFields() {
            this.range_ = 1;
            this.predefinedIndex_ = 0;
            this.string_ = "";
            this.operation_ = Operation.NONE;
            List<Integer> list = Collections.EMPTY_LIST;
            this.substringIndex_ = list;
            this.replaceChar_ = list;
        }

        public static C5486 newBuilder() {
            C5486 c5486 = new C5486();
            c5486.f13947 = 1;
            c5486.f13941 = "";
            c5486.f13944 = Operation.NONE;
            List list = Collections.EMPTY_LIST;
            c5486.f13945 = list;
            c5486.f13943 = list;
            return c5486;
        }

        public Operation getOperation() {
            return this.operation_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public InterfaceC5531 getParserForType() {
            return PARSER;
        }

        public int getPredefinedIndex() {
            return this.predefinedIndex_;
        }

        public int getRange() {
            return this.range_;
        }

        public int getReplaceCharCount() {
            return this.replaceChar_.size();
        }

        public List<Integer> getReplaceCharList() {
            return this.replaceChar_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM9921 = (this.bitField0_ & 1) == 1 ? C5540.m9921(1, this.range_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM9921 += C5540.m9921(2, this.predefinedIndex_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM9921 += C5540.m9922(3, this.operation_.getNumber());
            }
            int iM9920 = 0;
            for (int i2 = 0; i2 < this.substringIndex_.size(); i2++) {
                iM9920 += C5540.m9920(this.substringIndex_.get(i2).intValue());
            }
            int iM99202 = iM9921 + iM9920;
            if (!getSubstringIndexList().isEmpty()) {
                iM99202 = iM99202 + 1 + C5540.m9920(iM9920);
            }
            this.substringIndexMemoizedSerializedSize = iM9920;
            int iM99203 = 0;
            for (int i3 = 0; i3 < this.replaceChar_.size(); i3++) {
                iM99203 += C5540.m9920(this.replaceChar_.get(i3).intValue());
            }
            int size = iM99202 + iM99203;
            if (!getReplaceCharList().isEmpty()) {
                size = size + 1 + C5540.m9920(iM99203);
            }
            this.replaceCharMemoizedSerializedSize = iM99203;
            if ((this.bitField0_ & 4) == 4) {
                AbstractC5542 stringBytes = getStringBytes();
                size += stringBytes.size() + C5540.m9918(stringBytes.size()) + C5540.m9923(6);
            }
            int size2 = this.unknownFields.size() + size;
            this.memoizedSerializedSize = size2;
            return size2;
        }

        public String getString() {
            Object obj = this.string_;
            if (obj instanceof String) {
                return (String) obj;
            }
            AbstractC5542 abstractC5542 = (AbstractC5542) obj;
            String strM9961 = abstractC5542.m9961();
            if (abstractC5542.mo9913()) {
                this.string_ = strM9961;
            }
            return strM9961;
        }

        public AbstractC5542 getStringBytes() {
            Object obj = this.string_;
            if (!(obj instanceof String)) {
                return (AbstractC5542) obj;
            }
            try {
                C5548 c5548 = new C5548(((String) obj).getBytes("UTF-8"));
                this.string_ = c5548;
                return c5548;
            } catch (UnsupportedEncodingException e) {
                C1123.m1408("UTF-8 not supported?", e);
                return null;
            }
        }

        public int getSubstringIndexCount() {
            return this.substringIndex_.size();
        }

        public List<Integer> getSubstringIndexList() {
            return this.substringIndex_;
        }

        public boolean hasOperation() {
            return (this.bitField0_ & 8) == 8;
        }

        public boolean hasPredefinedIndex() {
            return (this.bitField0_ & 2) == 2;
        }

        public boolean hasRange() {
            return (this.bitField0_ & 1) == 1;
        }

        public boolean hasString() {
            return (this.bitField0_ & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5532
        public final boolean isInitialized() {
            byte b = this.memoizedIsInitialized;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public void writeTo(C5540 c5540) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                c5540.m9937(1, this.range_);
            }
            if ((this.bitField0_ & 2) == 2) {
                c5540.m9937(2, this.predefinedIndex_);
            }
            if ((this.bitField0_ & 8) == 8) {
                c5540.m9936(3, this.operation_.getNumber());
            }
            if (getSubstringIndexList().size() > 0) {
                c5540.m9925(34);
                c5540.m9925(this.substringIndexMemoizedSerializedSize);
            }
            for (int i = 0; i < this.substringIndex_.size(); i++) {
                c5540.m9930(this.substringIndex_.get(i).intValue());
            }
            if (getReplaceCharList().size() > 0) {
                c5540.m9925(42);
                c5540.m9925(this.replaceCharMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                c5540.m9930(this.replaceChar_.get(i2).intValue());
            }
            if ((this.bitField0_ & 4) == 4) {
                AbstractC5542 stringBytes = getStringBytes();
                c5540.m9928(6, 2);
                c5540.m9925(stringBytes.size());
                c5540.m9934(stringBytes);
            }
            c5540.m9934(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Record getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public C5486 newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
        public C5486 toBuilder() {
            return newBuilder(this);
        }

        public static C5486 newBuilder(Record record) {
            C5486 c5486NewBuilder = newBuilder();
            c5486NewBuilder.m9827(record);
            return c5486NewBuilder;
        }

        private Record(AbstractC5561 abstractC5561) {
            super(abstractC5561);
            this.substringIndexMemoizedSerializedSize = -1;
            this.replaceCharMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = abstractC5561.f14153;
        }

        private Record(boolean z) {
            this.substringIndexMemoizedSerializedSize = -1;
            this.replaceCharMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = AbstractC5542.f14119;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public JvmProtoBuf$StringTableTypes getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5488 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5533
    public C5488 toBuilder() {
        return newBuilder(this);
    }

    public static C5488 newBuilder(JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes) {
        C5488 c5488NewBuilder = newBuilder();
        c5488NewBuilder.m9832(jvmProtoBuf$StringTableTypes);
        return c5488NewBuilder;
    }

    private JvmProtoBuf$StringTableTypes(AbstractC5561 abstractC5561) {
        super(abstractC5561);
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC5561.f14153;
    }

    private JvmProtoBuf$StringTableTypes(boolean z) {
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC5542.f14119;
    }
}
