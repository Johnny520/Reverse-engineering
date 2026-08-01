package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import androidx.collection.C0276;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4711;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4728;
import kotlin.reflect.jvm.internal.impl.protobuf.C4707;
import kotlin.reflect.jvm.internal.impl.protobuf.C4708;
import kotlin.reflect.jvm.internal.impl.protobuf.C4710;
import kotlin.reflect.jvm.internal.impl.protobuf.C4715;
import kotlin.reflect.jvm.internal.impl.protobuf.C4725;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4698;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p071.C6916;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class JvmProtoBuf$StringTableTypes extends GeneratedMessageLite implements InterfaceC4699 {
    public static InterfaceC4698 PARSER = new C6916(3);
    private static final JvmProtoBuf$StringTableTypes defaultInstance;
    private int localNameMemoizedSerializedSize;
    private List<Integer> localName_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private List<Record> record_;
    private final AbstractC4709 unknownFields;

    static {
        JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes = new JvmProtoBuf$StringTableTypes(true);
        defaultInstance = jvmProtoBuf$StringTableTypes;
        jvmProtoBuf$StringTableTypes.initFields();
    }

    private JvmProtoBuf$StringTableTypes(C4708 c4708, C4725 c4725) {
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        initFields();
        C4710 c4710 = new C4710();
        C4707 c4707M9375 = C4707.m9375(c4710, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM9397 = c4708.m9397();
                    if (iM9397 != 0) {
                        if (iM9397 == 10) {
                            if ((i & 1) != 1) {
                                this.record_ = new ArrayList();
                                i |= 1;
                            }
                            this.record_.add((Record) c4708.m9390(Record.PARSER, c4725));
                        } else if (iM9397 == 40) {
                            if ((i & 2) != 2) {
                                this.localName_ = new ArrayList();
                                i |= 2;
                            }
                            this.localName_.add(Integer.valueOf(c4708.m9407()));
                        } else if (iM9397 == 42) {
                            int iM9393 = c4708.m9393(c4708.m9407());
                            if ((i & 2) != 2 && c4708.m9395() > 0) {
                                this.localName_ = new ArrayList();
                                i |= 2;
                            }
                            while (c4708.m9395() > 0) {
                                this.localName_.add(Integer.valueOf(c4708.m9407()));
                            }
                            c4708.m9394(iM9393);
                        } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
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
                    c4707M9375.m9386();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = c4710.m9413();
                    throw th2;
                }
                this.unknownFields = c4710.m9413();
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
            c4707M9375.m9386();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = c4710.m9413();
            throw th3;
        }
        this.unknownFields = c4710.m9413();
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

    public static C4655 newBuilder() {
        C4655 c4655 = new C4655();
        List list = Collections.EMPTY_LIST;
        c4655.f13601 = list;
        c4655.f13599 = list;
        return c4655;
    }

    public static JvmProtoBuf$StringTableTypes parseDelimitedFrom(InputStream inputStream, C4725 c4725) {
        return (JvmProtoBuf$StringTableTypes) ((AbstractC4711) PARSER).m9417(inputStream, c4725);
    }

    public List<Integer> getLocalNameList() {
        return this.localName_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public InterfaceC4698 getParserForType() {
        return PARSER;
    }

    public List<Record> getRecordList() {
        return this.record_;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int iM9370 = 0;
        for (int i2 = 0; i2 < this.record_.size(); i2++) {
            iM9370 += C4707.m9370(1, this.record_.get(i2));
        }
        int iM9371 = 0;
        for (int i3 = 0; i3 < this.localName_.size(); i3++) {
            iM9371 += C4707.m9371(this.localName_.get(i3).intValue());
        }
        int iM93712 = iM9370 + iM9371;
        if (!getLocalNameList().isEmpty()) {
            iM93712 = iM93712 + 1 + C4707.m9371(iM9371);
        }
        this.localNameMemoizedSerializedSize = iM9371;
        int size = this.unknownFields.size() + iM93712;
        this.memoizedSerializedSize = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public void writeTo(C4707 c4707) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.record_.size(); i++) {
            c4707.m9380(1, this.record_.get(i));
        }
        if (getLocalNameList().size() > 0) {
            c4707.m9376(42);
            c4707.m9376(this.localNameMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.localName_.size(); i2++) {
            c4707.m9381(this.localName_.get(i2).intValue());
        }
        c4707.m9385(this.unknownFields);
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static final class Record extends GeneratedMessageLite implements InterfaceC4699 {
        public static InterfaceC4698 PARSER = new C4654();
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
        private final AbstractC4709 unknownFields;

        /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
        public enum Operation implements InterfaceC4721 {
            NONE(0, 0),
            INTERNAL_TO_CLASS_ID(1, 1),
            DESC_TO_CLASS_ID(2, 2);

            private static InterfaceC4722 internalValueMap = new C4652();
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

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721
            public final int getNumber() {
                return this.value;
            }
        }

        static {
            Record record = new Record(true);
            defaultInstance = record;
            record.initFields();
        }

        private Record(C4708 c4708, C4725 c4725) {
            this.substringIndexMemoizedSerializedSize = -1;
            this.replaceCharMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            initFields();
            C4710 c4710 = new C4710();
            C4707 c4707M9375 = C4707.m9375(c4710, 1);
            boolean z = false;
            int i = 0;
            while (!z) {
                try {
                    try {
                        int iM9397 = c4708.m9397();
                        if (iM9397 != 0) {
                            if (iM9397 == 8) {
                                this.bitField0_ |= 1;
                                this.range_ = c4708.m9407();
                            } else if (iM9397 == 16) {
                                this.bitField0_ |= 2;
                                this.predefinedIndex_ = c4708.m9407();
                            } else if (iM9397 == 24) {
                                int iM9407 = c4708.m9407();
                                Operation operationValueOf = Operation.valueOf(iM9407);
                                if (operationValueOf == null) {
                                    c4707M9375.m9376(iM9397);
                                    c4707M9375.m9376(iM9407);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.operation_ = operationValueOf;
                                }
                            } else if (iM9397 == 32) {
                                if ((i & 16) != 16) {
                                    this.substringIndex_ = new ArrayList();
                                    i |= 16;
                                }
                                this.substringIndex_.add(Integer.valueOf(c4708.m9407()));
                            } else if (iM9397 == 34) {
                                int iM9393 = c4708.m9393(c4708.m9407());
                                if ((i & 16) != 16 && c4708.m9395() > 0) {
                                    this.substringIndex_ = new ArrayList();
                                    i |= 16;
                                }
                                while (c4708.m9395() > 0) {
                                    this.substringIndex_.add(Integer.valueOf(c4708.m9407()));
                                }
                                c4708.m9394(iM9393);
                            } else if (iM9397 == 40) {
                                if ((i & 32) != 32) {
                                    this.replaceChar_ = new ArrayList();
                                    i |= 32;
                                }
                                this.replaceChar_.add(Integer.valueOf(c4708.m9407()));
                            } else if (iM9397 == 42) {
                                int iM93932 = c4708.m9393(c4708.m9407());
                                if ((i & 32) != 32 && c4708.m9395() > 0) {
                                    this.replaceChar_ = new ArrayList();
                                    i |= 32;
                                }
                                while (c4708.m9395() > 0) {
                                    this.replaceChar_.add(Integer.valueOf(c4708.m9407()));
                                }
                                c4708.m9394(iM93932);
                            } else if (iM9397 == 50) {
                                C4715 c4715M9392 = c4708.m9392();
                                this.bitField0_ |= 4;
                                this.string_ = c4715M9392;
                            } else if (!parseUnknownField(c4708, c4707M9375, c4725, iM9397)) {
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
                        c4707M9375.m9386();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.unknownFields = c4710.m9413();
                        throw th2;
                    }
                    this.unknownFields = c4710.m9413();
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
                c4707M9375.m9386();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.unknownFields = c4710.m9413();
                throw th3;
            }
            this.unknownFields = c4710.m9413();
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

        public static C4653 newBuilder() {
            C4653 c4653 = new C4653();
            c4653.f13598 = 1;
            c4653.f13592 = "";
            c4653.f13595 = Operation.NONE;
            List list = Collections.EMPTY_LIST;
            c4653.f13596 = list;
            c4653.f13594 = list;
            return c4653;
        }

        public Operation getOperation() {
            return this.operation_;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public InterfaceC4698 getParserForType() {
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int iM9372 = (this.bitField0_ & 1) == 1 ? C4707.m9372(1, this.range_) : 0;
            if ((this.bitField0_ & 2) == 2) {
                iM9372 += C4707.m9372(2, this.predefinedIndex_);
            }
            if ((this.bitField0_ & 8) == 8) {
                iM9372 += C4707.m9373(3, this.operation_.getNumber());
            }
            int iM9371 = 0;
            for (int i2 = 0; i2 < this.substringIndex_.size(); i2++) {
                iM9371 += C4707.m9371(this.substringIndex_.get(i2).intValue());
            }
            int iM93712 = iM9372 + iM9371;
            if (!getSubstringIndexList().isEmpty()) {
                iM93712 = iM93712 + 1 + C4707.m9371(iM9371);
            }
            this.substringIndexMemoizedSerializedSize = iM9371;
            int iM93713 = 0;
            for (int i3 = 0; i3 < this.replaceChar_.size(); i3++) {
                iM93713 += C4707.m9371(this.replaceChar_.get(i3).intValue());
            }
            int size = iM93712 + iM93713;
            if (!getReplaceCharList().isEmpty()) {
                size = size + 1 + C4707.m9371(iM93713);
            }
            this.replaceCharMemoizedSerializedSize = iM93713;
            if ((this.bitField0_ & 4) == 4) {
                AbstractC4709 stringBytes = getStringBytes();
                size += stringBytes.size() + C4707.m9369(stringBytes.size()) + C4707.m9374(6);
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
            AbstractC4709 abstractC4709 = (AbstractC4709) obj;
            String strM9412 = abstractC4709.m9412();
            if (abstractC4709.mo9364()) {
                this.string_ = strM9412;
            }
            return strM9412;
        }

        public AbstractC4709 getStringBytes() {
            Object obj = this.string_;
            if (!(obj instanceof String)) {
                return (AbstractC4709) obj;
            }
            try {
                C4715 c4715 = new C4715(((String) obj).getBytes("UTF-8"));
                this.string_ = c4715;
                return c4715;
            } catch (UnsupportedEncodingException e) {
                C0276.m847("UTF-8 not supported?", e);
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4699
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

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public void writeTo(C4707 c4707) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                c4707.m9388(1, this.range_);
            }
            if ((this.bitField0_ & 2) == 2) {
                c4707.m9388(2, this.predefinedIndex_);
            }
            if ((this.bitField0_ & 8) == 8) {
                c4707.m9387(3, this.operation_.getNumber());
            }
            if (getSubstringIndexList().size() > 0) {
                c4707.m9376(34);
                c4707.m9376(this.substringIndexMemoizedSerializedSize);
            }
            for (int i = 0; i < this.substringIndex_.size(); i++) {
                c4707.m9381(this.substringIndex_.get(i).intValue());
            }
            if (getReplaceCharList().size() > 0) {
                c4707.m9376(42);
                c4707.m9376(this.replaceCharMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                c4707.m9381(this.replaceChar_.get(i2).intValue());
            }
            if ((this.bitField0_ & 4) == 4) {
                AbstractC4709 stringBytes = getStringBytes();
                c4707.m9379(6, 2);
                c4707.m9376(stringBytes.size());
                c4707.m9385(stringBytes);
            }
            c4707.m9385(this.unknownFields);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public Record getDefaultInstanceForType() {
            return defaultInstance;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public C4653 newBuilderForType() {
            return newBuilder();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
        public C4653 toBuilder() {
            return newBuilder(this);
        }

        public static C4653 newBuilder(Record record) {
            C4653 c4653NewBuilder = newBuilder();
            c4653NewBuilder.m9278(record);
            return c4653NewBuilder;
        }

        private Record(AbstractC4728 abstractC4728) {
            super(abstractC4728);
            this.substringIndexMemoizedSerializedSize = -1;
            this.replaceCharMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = abstractC4728.f13804;
        }

        private Record(boolean z) {
            this.substringIndexMemoizedSerializedSize = -1;
            this.replaceCharMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = AbstractC4709.f13770;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
    public JvmProtoBuf$StringTableTypes getDefaultInstanceForType() {
        return defaultInstance;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4655 newBuilderForType() {
        return newBuilder();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4700
    public C4655 toBuilder() {
        return newBuilder(this);
    }

    public static C4655 newBuilder(JvmProtoBuf$StringTableTypes jvmProtoBuf$StringTableTypes) {
        C4655 c4655NewBuilder = newBuilder();
        c4655NewBuilder.m9283(jvmProtoBuf$StringTableTypes);
        return c4655NewBuilder;
    }

    private JvmProtoBuf$StringTableTypes(AbstractC4728 abstractC4728) {
        super(abstractC4728);
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = abstractC4728.f13804;
    }

    private JvmProtoBuf$StringTableTypes(boolean z) {
        this.localNameMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = (byte) -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = AbstractC4709.f13770;
    }
}
