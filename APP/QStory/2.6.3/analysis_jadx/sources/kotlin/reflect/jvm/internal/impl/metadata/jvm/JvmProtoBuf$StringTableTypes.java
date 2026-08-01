package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import androidx.collection.C0276;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4712;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4729;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4709;
import kotlin.reflect.jvm.internal.impl.protobuf.C4711;
import kotlin.reflect.jvm.internal.impl.protobuf.C4716;
import kotlin.reflect.jvm.internal.impl.protobuf.C4726;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4723;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6917;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBuf$StringTableTypes extends GeneratedMessageLite implements InterfaceC4700 {
    public static InterfaceC4699 PARSER = new C6917(3);
    private static final JvmProtoBuf$StringTableTypes defaultInstance;
    private int localNameMemoizedSerializedSize;
    private List<Integer> localName_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<Record> record_;
    private final AbstractC4710 unknownFields;

    static {
        JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes = new JvmProtoBuf$StringTableTypes(true);
        defaultInstance = jvmProtoBuf$StringTableTypes;
        jvmProtoBuf$StringTableTypes.initFields();
    }

    private JvmProtoBuf$StringTableTypes(C4709 c4709, C4726 c4726) {
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4711 c4711 = new C4711();
        C4708 c4708M9365 = C4708.m9365(c4711, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM9387 = c4709.m9387();
                    if (iM9387 != 0) {
                        if (iM9387 == 10) {
                            if ((i & 1) != 1) {
                                this.record_ = new ArrayList();
                                i |= 1;
                            }
                            this.record_.add((Record) c4709.m9380(Record.PARSER, c4726));
                        } else if (iM9387 == 40) {
                            if ((i & 2) != 2) {
                                this.localName_ = new ArrayList();
                                i |= 2;
                            }
                            this.localName_.add(Integer.valueOf(c4709.m9397()));
                        } else if (iM9387 == 42) {
                            int iM9383 = c4709.m9383(c4709.m9397());
                            if ((i & 2) != 2 && c4709.m9385() > 0) {
                                this.localName_ = new ArrayList();
                                i |= 2;
                            }
                            while (c4709.m9385() > 0) {
                                this.localName_.add(Integer.valueOf(c4709.m9397()));
                            }
                            c4709.m9384(iM9383);
                        } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
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
                    c4708M9365.m9376();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = c4711.m9403();
                    throw th2;
                }
                this.unknownFields = c4711.m9403();
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
            c4708M9365.m9376();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4711.m9403();
            throw th3;
        }
        this.unknownFields = c4711.m9403();
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

    public static C4656 newBuilder() {
        C4656 c4656 = new C4656();
        List list = Collections.EMPTY_LIST;
        c4656.f13605 = list;
        c4656.f13603 = list;
        return c4656;
    }

    public static JvmProtoBuf$StringTableTypes parseDelimitedFrom(InputStream inputStream, C4726 c4726) {
        return (JvmProtoBuf$StringTableTypes) ((AbstractC4712) PARSER).m9407(inputStream, c4726);
    }

    public List<Integer> getLocalNameList() {
        return this.localName_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4699 getParserForType() {
        return PARSER;
    }

    public List<Record> getRecordList() {
        return this.record_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9360 = 0;
        for (int i2 = 0; i2 < this.record_.size(); i2++) {
            iM9360 += C4708.m9360(1, this.record_.get(i2));
        }
        int iM9361 = 0;
        for (int i3 = 0; i3 < this.localName_.size(); i3++) {
            iM9361 += C4708.m9361(this.localName_.get(i3).intValue());
        }
        int iM93612 = iM9360 + iM9361;
        if (!getLocalNameList().isEmpty()) {
            iM93612 = iM93612 + 1 + C4708.m9361(iM9361);
        }
        this.localNameMemoizedSerializedSize = iM9361;
        int size = this.unknownFields.size() + iM93612;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public void writeTo(C4708 c4708) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.record_.size(); i++) {
            c4708.m9370(1, this.record_.get(i));
        }
        if (getLocalNameList().size() > 0) {
            c4708.m9366(42);
            c4708.m9366(this.localNameMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.localName_.size(); i2++) {
            c4708.m9371(this.localName_.get(i2).intValue());
        }
        c4708.m9375(this.unknownFields);
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class Record extends GeneratedMessageLite implements InterfaceC4700 {
        public static InterfaceC4699 PARSER = new C4655();
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
        private final AbstractC4710 unknownFields;

        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        public enum Operation implements InterfaceC4722 {
            NONE(0, 0),
            INTERNAL_TO_CLASS_ID(1, 1),
            DESC_TO_CLASS_ID(2, 2);

            private static InterfaceC4723 internalValueMap = new C4653();
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

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Record record = new Record(true);
            defaultInstance = record;
            record.initFields();
        }

        private Record(C4709 c4709, C4726 c4726) {
            this.substringIndexMemoizedSerializedSize = -1;
            this.replaceCharMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            C4711 c4711 = new C4711();
            C4708 c4708M9365 = C4708.m9365(c4711, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iM9387 = c4709.m9387();
                        if (iM9387 != 0) {
                            if (iM9387 == 8) {
                                this.bitField0_ |= 1;
                                this.range_ = c4709.m9397();
                            } else if (iM9387 == 16) {
                                this.bitField0_ |= 2;
                                this.predefinedIndex_ = c4709.m9397();
                            } else if (iM9387 == 24) {
                                int iM9397 = c4709.m9397();
                                Operation operationValueOf = Operation.valueOf(iM9397);
                                if (operationValueOf == null) {
                                    c4708M9365.m9366(iM9387);
                                    c4708M9365.m9366(iM9397);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.operation_ = operationValueOf;
                                }
                            } else if (iM9387 == 32) {
                                if ((i & 16) != 16) {
                                    this.substringIndex_ = new ArrayList();
                                    i |= 16;
                                }
                                this.substringIndex_.add(Integer.valueOf(c4709.m9397()));
                            } else if (iM9387 == 34) {
                                int iM9383 = c4709.m9383(c4709.m9397());
                                if ((i & 16) != 16 && c4709.m9385() > 0) {
                                    this.substringIndex_ = new ArrayList();
                                    i |= 16;
                                }
                                while (c4709.m9385() > 0) {
                                    this.substringIndex_.add(Integer.valueOf(c4709.m9397()));
                                }
                                c4709.m9384(iM9383);
                            } else if (iM9387 == 40) {
                                if ((i & 32) != 32) {
                                    this.replaceChar_ = new ArrayList();
                                    i |= 32;
                                }
                                this.replaceChar_.add(Integer.valueOf(c4709.m9397()));
                            } else if (iM9387 == 42) {
                                int iM93832 = c4709.m9383(c4709.m9397());
                                if ((i & 32) != 32 && c4709.m9385() > 0) {
                                    this.replaceChar_ = new ArrayList();
                                    i |= 32;
                                }
                                while (c4709.m9385() > 0) {
                                    this.replaceChar_.add(Integer.valueOf(c4709.m9397()));
                                }
                                c4709.m9384(iM93832);
                            } else if (iM9387 == 50) {
                                C4716 c4716M9382 = c4709.m9382();
                                this.bitField0_ |= 4;
                                this.string_ = c4716M9382;
                            } else if (!parseUnknownField(c4709, c4708M9365, c4726, iM9387)) {
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
                        c4708M9365.m9376();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = c4711.m9403();
                        throw th2;
                    }
                    this.unknownFields = c4711.m9403();
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
                c4708M9365.m9376();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = c4711.m9403();
                throw th3;
            }
            this.unknownFields = c4711.m9403();
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

        public static C4654 newBuilder() {
            C4654 c4654 = new C4654();
            c4654.f13602 = 1;
            c4654.f13596 = "";
            c4654.f13599 = Operation.NONE;
            List list = Collections.EMPTY_LIST;
            c4654.f13600 = list;
            c4654.f13598 = list;
            return c4654;
        }

        public Operation getOperation() {
            return this.operation_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public InterfaceC4699 getParserForType() {
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM9362 = (this.bitField0_ & 1) == 1 ? C4708.m9362(1, this.range_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM9362 += C4708.m9362(2, this.predefinedIndex_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM9362 += C4708.m9363(3, this.operation_.getNumber());
            }
            int iM9361 = 0;
            for (int i2 = 0; i2 < this.substringIndex_.size(); i2++) {
                iM9361 += C4708.m9361(this.substringIndex_.get(i2).intValue());
            }
            int iM93612 = iM9362 + iM9361;
            if (!getSubstringIndexList().isEmpty()) {
                iM93612 = iM93612 + 1 + C4708.m9361(iM9361);
            }
            this.substringIndexMemoizedSerializedSize = iM9361;
            int iM93613 = 0;
            for (int i3 = 0; i3 < this.replaceChar_.size(); i3++) {
                iM93613 += C4708.m9361(this.replaceChar_.get(i3).intValue());
            }
            int size = iM93612 + iM93613;
            if (!getReplaceCharList().isEmpty()) {
                size = size + 1 + C4708.m9361(iM93613);
            }
            this.replaceCharMemoizedSerializedSize = iM93613;
            if ((this.bitField0_ & 4) == 4) {
                AbstractC4710 stringBytes = getStringBytes();
                size += stringBytes.size() + C4708.m9359(stringBytes.size()) + C4708.m9364(6);
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
            AbstractC4710 abstractC4710 = (AbstractC4710) obj;
            String strM9402 = abstractC4710.m9402();
            if (abstractC4710.mo9354()) {
                this.string_ = strM9402;
            }
            return strM9402;
        }

        public AbstractC4710 getStringBytes() {
            Object obj = this.string_;
            if (!(obj instanceof String)) {
                return (AbstractC4710) obj;
            }
            try {
                C4716 c4716 = new C4716(((String) obj).getBytes("UTF-8"));
                this.string_ = c4716;
                return c4716;
            } catch (UnsupportedEncodingException e) {
                C0276.m848("UTF-8 not supported?", e);
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public void writeTo(C4708 c4708) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                c4708.m9378(1, this.range_);
            }
            if ((this.bitField0_ & 2) == 2) {
                c4708.m9378(2, this.predefinedIndex_);
            }
            if ((this.bitField0_ & 8) == 8) {
                c4708.m9377(3, this.operation_.getNumber());
            }
            if (getSubstringIndexList().size() > 0) {
                c4708.m9366(34);
                c4708.m9366(this.substringIndexMemoizedSerializedSize);
            }
            for (int i = 0; i < this.substringIndex_.size(); i++) {
                c4708.m9371(this.substringIndex_.get(i).intValue());
            }
            if (getReplaceCharList().size() > 0) {
                c4708.m9366(42);
                c4708.m9366(this.replaceCharMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                c4708.m9371(this.replaceChar_.get(i2).intValue());
            }
            if ((this.bitField0_ & 4) == 4) {
                AbstractC4710 stringBytes = getStringBytes();
                c4708.m9369(6, 2);
                c4708.m9366(stringBytes.size());
                c4708.m9375(stringBytes);
            }
            c4708.m9375(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Record getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public C4654 newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
        public C4654 toBuilder() {
            return newBuilder(this);
        }

        public static C4654 newBuilder(Record record) {
            C4654 c4654NewBuilder = newBuilder();
            c4654NewBuilder.m9268(record);
            return c4654NewBuilder;
        }

        private Record(AbstractC4729 abstractC4729) {
            super(abstractC4729);
            this.substringIndexMemoizedSerializedSize = -1;
            this.replaceCharMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = abstractC4729.f13808;
        }

        private Record(boolean z) {
            this.substringIndexMemoizedSerializedSize = -1;
            this.replaceCharMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = AbstractC4710.f13774;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public JvmProtoBuf$StringTableTypes getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4656 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4701
    public C4656 toBuilder() {
        return newBuilder(this);
    }

    public static C4656 newBuilder(JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes) {
        C4656 c4656NewBuilder = newBuilder();
        c4656NewBuilder.m9273(jvmProtoBuf$StringTableTypes);
        return c4656NewBuilder;
    }

    private JvmProtoBuf$StringTableTypes(AbstractC4729 abstractC4729) {
        super(abstractC4729);
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4729.f13808;
    }

    private JvmProtoBuf$StringTableTypes(boolean z) {
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4710.f13774;
    }
}
