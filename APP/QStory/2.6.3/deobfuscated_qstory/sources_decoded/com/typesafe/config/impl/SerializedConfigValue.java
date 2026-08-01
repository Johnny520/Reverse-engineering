package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2942;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import com.typesafe.config.impl.ConfigString;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p009.AbstractC6183;
import p144.C7547;
import p250.InterfaceC8161;
import p250.InterfaceC8162;
import p250.InterfaceC8165;
import p250.InterfaceC8166;
import p250.InterfaceC8167;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class SerializedConfigValue extends AbstractC3843 implements Externalizable {
    private static final long serialVersionUID = 1;
    private InterfaceC8167 value;
    private boolean wasConfig;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum SerializedField {
        UNKNOWN,
        END_MARKER,
        ROOT_VALUE,
        ROOT_WAS_CONFIG,
        VALUE_DATA,
        VALUE_ORIGIN,
        ORIGIN_DESCRIPTION,
        ORIGIN_LINE_NUMBER,
        ORIGIN_END_LINE_NUMBER,
        ORIGIN_TYPE,
        ORIGIN_URL,
        ORIGIN_COMMENTS,
        ORIGIN_NULL_URL,
        ORIGIN_NULL_COMMENTS,
        ORIGIN_RESOURCE,
        ORIGIN_NULL_RESOURCE;

        public static SerializedField forInt(int i) {
            return i < values().length ? values()[i] : UNKNOWN;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static final class SerializedValueType {
        private static final /* synthetic */ SerializedValueType[] $VALUES;
        public static final SerializedValueType BOOLEAN;
        public static final SerializedValueType DOUBLE;
        public static final SerializedValueType INT;
        public static final SerializedValueType LIST;
        public static final SerializedValueType LONG;
        public static final SerializedValueType NULL;
        public static final SerializedValueType OBJECT;
        public static final SerializedValueType STRING;
        ConfigValueType configType;

        static {
            SerializedValueType serializedValueType = new SerializedValueType("NULL", 0, ConfigValueType.NULL);
            NULL = serializedValueType;
            SerializedValueType serializedValueType2 = new SerializedValueType("BOOLEAN", 1, ConfigValueType.BOOLEAN);
            BOOLEAN = serializedValueType2;
            ConfigValueType configValueType = ConfigValueType.NUMBER;
            SerializedValueType serializedValueType3 = new SerializedValueType("INT", 2, configValueType);
            INT = serializedValueType3;
            SerializedValueType serializedValueType4 = new SerializedValueType("LONG", 3, configValueType);
            LONG = serializedValueType4;
            SerializedValueType serializedValueType5 = new SerializedValueType("DOUBLE", 4, configValueType);
            DOUBLE = serializedValueType5;
            SerializedValueType serializedValueType6 = new SerializedValueType("STRING", 5, ConfigValueType.STRING);
            STRING = serializedValueType6;
            SerializedValueType serializedValueType7 = new SerializedValueType("LIST", 6, ConfigValueType.LIST);
            LIST = serializedValueType7;
            SerializedValueType serializedValueType8 = new SerializedValueType("OBJECT", 7, ConfigValueType.OBJECT);
            OBJECT = serializedValueType8;
            $VALUES = new SerializedValueType[]{serializedValueType, serializedValueType2, serializedValueType3, serializedValueType4, serializedValueType5, serializedValueType6, serializedValueType7, serializedValueType8};
        }

        private SerializedValueType(String str, int i, ConfigValueType configValueType) {
            this.configType = configValueType;
        }

        public static SerializedValueType forInt(int i) {
            if (i < values().length) {
                return values()[i];
            }
            return null;
        }

        public static SerializedValueType forValue(InterfaceC8167 interfaceC8167) {
            ConfigValueType configValueTypeValueType = interfaceC8167.valueType();
            if (configValueTypeValueType != ConfigValueType.NUMBER) {
                for (SerializedValueType serializedValueType : values()) {
                    if (serializedValueType.configType == configValueTypeValueType) {
                        return serializedValueType;
                    }
                }
            } else {
                if (interfaceC8167 instanceof ConfigInt) {
                    return INT;
                }
                if (interfaceC8167 instanceof ConfigLong) {
                    return LONG;
                }
                if (interfaceC8167 instanceof ConfigDouble) {
                    return DOUBLE;
                }
            }
            C2942.m6395(interfaceC8167, "don't know how to serialize ");
            return null;
        }

        public static SerializedValueType valueOf(String str) {
            return (SerializedValueType) Enum.valueOf(SerializedValueType.class, str);
        }

        public static SerializedValueType[] values() {
            return (SerializedValueType[]) $VALUES.clone();
        }
    }

    public SerializedConfigValue(InterfaceC8166 interfaceC8166) {
        this(interfaceC8166.root());
        this.wasConfig = true;
    }

    private DataInput fieldIn(ObjectInput objectInput) throws IOException {
        byte[] bArr = new byte[objectInput.readInt()];
        objectInput.readFully(bArr);
        return new DataInputStream(new ByteArrayInputStream(bArr));
    }

    private static SerializedField readCode(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != SerializedField.UNKNOWN.ordinal()) {
            return SerializedField.forInt(unsignedByte);
        }
        C5925.m11307(AbstractC0053.m162(unsignedByte, "field code ", " is not supposed to be on the wire"));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.String] */
    public static C3838 readOrigin(DataInput dataInput, C3838 c3838) throws IOException {
        EnumMap enumMap = new EnumMap(SerializedField.class);
        while (true) {
            SerializedField code = readCode(dataInput);
            ?? utf = 0;
            utf = 0;
            switch (AbstractC3850.f12076[code.ordinal()]) {
                case 1:
                    dataInput.readInt();
                    utf = dataInput.readUTF();
                    break;
                case 2:
                    dataInput.readInt();
                    utf = Integer.valueOf(dataInput.readInt());
                    break;
                case 3:
                    dataInput.readInt();
                    utf = Integer.valueOf(dataInput.readInt());
                    break;
                case 4:
                    dataInput.readInt();
                    utf = Integer.valueOf(dataInput.readUnsignedByte());
                    break;
                case 5:
                    dataInput.readInt();
                    utf = dataInput.readUTF();
                    break;
                case 6:
                    dataInput.readInt();
                    utf = dataInput.readUTF();
                    break;
                case 7:
                    dataInput.readInt();
                    int i = dataInput.readInt();
                    utf = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        utf.add(dataInput.readUTF());
                    }
                    break;
                case 8:
                case 9:
                case 10:
                    dataInput.readInt();
                    utf = "";
                    break;
                case 11:
                    Map mapM8209 = c3838 != null ? c3838.m8209() : Collections.EMPTY_MAP;
                    EnumMap enumMap2 = new EnumMap((Map) enumMap);
                    Iterator it = mapM8209.entrySet().iterator();
                    while (it.hasNext()) {
                        SerializedField serializedField = (SerializedField) ((Map.Entry) it.next()).getKey();
                        if (!enumMap.containsKey(serializedField)) {
                            switch (AbstractC3839.f12061[serializedField.ordinal()]) {
                                case 1:
                                    enumMap2.put(serializedField, mapM8209.get(serializedField));
                                    break;
                                case 2:
                                case 3:
                                case 4:
                                    enumMap2.put(serializedField, mapM8209.get(serializedField));
                                    break;
                                case 5:
                                    SerializedField serializedField2 = SerializedField.ORIGIN_NULL_URL;
                                    if (enumMap.containsKey(serializedField2)) {
                                        enumMap2.remove(serializedField2);
                                    } else {
                                        enumMap2.put(serializedField, mapM8209.get(serializedField));
                                    }
                                    break;
                                case 6:
                                    SerializedField serializedField3 = SerializedField.ORIGIN_NULL_RESOURCE;
                                    if (enumMap.containsKey(serializedField3)) {
                                        enumMap2.remove(serializedField3);
                                    } else {
                                        enumMap2.put(serializedField, mapM8209.get(serializedField));
                                    }
                                    break;
                                case 7:
                                    SerializedField serializedField4 = SerializedField.ORIGIN_NULL_COMMENTS;
                                    if (enumMap.containsKey(serializedField4)) {
                                        enumMap2.remove(serializedField4);
                                    } else {
                                        enumMap2.put(serializedField, mapM8209.get(serializedField));
                                    }
                                    break;
                                case 8:
                                case 9:
                                case 10:
                                    C2942.m6399("applying fields, base object should not contain ", serializedField, " ", mapM8209);
                                    return null;
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                    C2942.m6395(serializedField, "should not appear here: ");
                                    return null;
                            }
                        }
                    }
                    if (enumMap2.isEmpty()) {
                        return null;
                    }
                    String str = (String) enumMap2.get(SerializedField.ORIGIN_DESCRIPTION);
                    Integer num = (Integer) enumMap2.get(SerializedField.ORIGIN_LINE_NUMBER);
                    Integer num2 = (Integer) enumMap2.get(SerializedField.ORIGIN_END_LINE_NUMBER);
                    Number number = (Number) enumMap2.get(SerializedField.ORIGIN_TYPE);
                    if (number == null) {
                        C5925.m11307("Missing ORIGIN_TYPE field");
                        return null;
                    }
                    OriginType originType = number.byteValue() < OriginType.values().length ? OriginType.values()[number.byteValue()] : OriginType.GENERIC;
                    String str2 = (String) enumMap2.get(SerializedField.ORIGIN_URL);
                    String str3 = (String) enumMap2.get(SerializedField.ORIGIN_RESOURCE);
                    List list = (List) enumMap2.get(SerializedField.ORIGIN_COMMENTS);
                    return new C3838(str, num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1, originType, str2, (originType == OriginType.RESOURCE && str3 == null) ? str : str3, list);
                case 12:
                case 13:
                case 14:
                case 15:
                    C7547.m12769(code, "Not expecting this field here: ");
                    return null;
                case 16:
                    skipField(dataInput);
                    break;
            }
            if (utf != 0) {
                enumMap.put(code, utf);
            }
        }
    }

    private Object readResolve() {
        boolean z = this.wasConfig;
        InterfaceC8167 interfaceC8167 = this.value;
        return z ? ((InterfaceC8162) interfaceC8167).toConfig() : interfaceC8167;
    }

    private static AbstractC3843 readValue(DataInput dataInput, C3838 c3838) throws IOException {
        AbstractC3843 valueData = null;
        C3838 origin = null;
        while (true) {
            SerializedField code = readCode(dataInput);
            if (code == SerializedField.END_MARKER) {
                if (valueData != null) {
                    return valueData;
                }
                C5925.m11307("No value data found in serialization of value");
                return null;
            }
            if (code == SerializedField.VALUE_DATA) {
                if (origin == null) {
                    C5925.m11307("Origin must be stored before value data");
                    return null;
                }
                dataInput.readInt();
                valueData = readValueData(dataInput, origin);
            } else if (code == SerializedField.VALUE_ORIGIN) {
                dataInput.readInt();
                origin = readOrigin(dataInput, c3838);
            } else {
                skipField(dataInput);
            }
        }
    }

    private static AbstractC3843 readValueData(DataInput dataInput, C3838 c3838) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        SerializedValueType serializedValueTypeForInt = SerializedValueType.forInt(unsignedByte);
        if (serializedValueTypeForInt == null) {
            C5925.m11307(AbstractC6183.m11588(unsignedByte, "Unknown serialized value type: "));
            return null;
        }
        int i = 0;
        switch (AbstractC3850.f12075[serializedValueTypeForInt.ordinal()]) {
            case 1:
                return new ConfigBoolean(c3838, dataInput.readBoolean());
            case 2:
                return new ConfigNull(c3838);
            case 3:
                return new ConfigInt(c3838, dataInput.readInt(), dataInput.readUTF());
            case 4:
                return new ConfigLong(c3838, dataInput.readLong(), dataInput.readUTF());
            case 5:
                return new ConfigDouble(c3838, dataInput.readDouble(), dataInput.readUTF());
            case 6:
                return new ConfigString.Quoted(c3838, dataInput.readUTF());
            case 7:
                int i2 = dataInput.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (i < i2) {
                    arrayList.add(readValue(dataInput, c3838));
                    i++;
                }
                return new SimpleConfigList(c3838, arrayList);
            case 8:
                int i3 = dataInput.readInt();
                HashMap map = new HashMap(i3);
                while (i < i3) {
                    map.put(dataInput.readUTF(), readValue(dataInput, c3838));
                    i++;
                }
                return new SimpleConfigObject(c3838, map);
            default:
                C7547.m12769(serializedValueTypeForInt, "Unhandled serialized value type: ");
                return null;
        }
    }

    private static ConfigException shouldNotBeUsed() {
        return new ConfigException.BugOrBroken(SerializedConfigValue.class.getName().concat(" should not exist outside of serialization"));
    }

    private static void skipField(DataInput dataInput) throws IOException {
        int i = dataInput.readInt();
        int iSkipBytes = dataInput.skipBytes(i);
        if (iSkipBytes < i) {
            dataInput.readFully(new byte[i - iSkipBytes]);
        }
    }

    private static void writeEndMarker(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(SerializedField.END_MARKER.ordinal());
    }

    private static void writeField(DataOutput dataOutput, C3834 c3834) throws IOException {
        byte[] byteArray = c3834.f12040.toByteArray();
        dataOutput.writeByte(c3834.f12041.ordinal());
        dataOutput.writeInt(byteArray.length);
        dataOutput.write(byteArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.EnumMap] */
    public static void writeOrigin(DataOutput dataOutput, C3838 c3838, C3838 c38382) throws IOException {
        ?? enumMap;
        if (c3838 != null) {
            Map mapM8209 = c38382 != null ? c38382.m8209() : Collections.EMPTY_MAP;
            EnumMap enumMapM8209 = c3838.m8209();
            enumMap = new EnumMap((Map) enumMapM8209);
            for (Map.Entry entry : mapM8209.entrySet()) {
                SerializedField serializedField = (SerializedField) entry.getKey();
                if (enumMap.containsKey(serializedField) && AbstractC3864.m8249(entry.getValue(), enumMap.get(serializedField))) {
                    enumMap.remove(serializedField);
                } else if (enumMap.containsKey(serializedField)) {
                    continue;
                } else {
                    switch (AbstractC3839.f12061[serializedField.ordinal()]) {
                        case 1:
                            C2942.m6395(enumMapM8209, "origin missing description field? ");
                            return;
                        case 2:
                            enumMap.put(SerializedField.ORIGIN_LINE_NUMBER, -1);
                            break;
                        case 3:
                            enumMap.put(SerializedField.ORIGIN_END_LINE_NUMBER, -1);
                            break;
                        case 4:
                            C2942.m6408("should always be an ORIGIN_TYPE field");
                            return;
                        case 5:
                            enumMap.put(SerializedField.ORIGIN_NULL_URL, "");
                            break;
                        case 6:
                            enumMap.put(SerializedField.ORIGIN_NULL_RESOURCE, "");
                            break;
                        case 7:
                            enumMap.put(SerializedField.ORIGIN_NULL_COMMENTS, "");
                            break;
                        case 8:
                        case 9:
                        case 10:
                            C2942.m6399("computing delta, base object should not contain ", serializedField, " ", mapM8209);
                            return;
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            C2942.m6395(serializedField, "should not appear here: ");
                            return;
                    }
                }
            }
        } else {
            enumMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry2 : enumMap.entrySet()) {
            SerializedField serializedField2 = (SerializedField) entry2.getKey();
            C3834 c3834 = new C3834(serializedField2);
            writeOriginField(c3834.f12039, serializedField2, entry2.getValue());
            writeField(dataOutput, c3834);
        }
        writeEndMarker(dataOutput);
    }

    private static void writeOriginField(DataOutput dataOutput, SerializedField serializedField, Object obj) throws IOException {
        switch (AbstractC3850.f12076[serializedField.ordinal()]) {
            case 1:
                dataOutput.writeUTF((String) obj);
                break;
            case 2:
                dataOutput.writeInt(((Integer) obj).intValue());
                break;
            case 3:
                dataOutput.writeInt(((Integer) obj).intValue());
                break;
            case 4:
                dataOutput.writeByte(((Integer) obj).intValue());
                break;
            case 5:
                dataOutput.writeUTF((String) obj);
                break;
            case 6:
                dataOutput.writeUTF((String) obj);
                break;
            case 7:
                List list = (List) obj;
                dataOutput.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dataOutput.writeUTF((String) it.next());
                }
                break;
            case 8:
            case 9:
            case 10:
                break;
            default:
                C7547.m12769(serializedField, "Unhandled field from origin: ");
                break;
        }
    }

    private static void writeValue(DataOutput dataOutput, InterfaceC8167 interfaceC8167, C3838 c3838) throws IOException {
        C3834 c3834 = new C3834(SerializedField.VALUE_ORIGIN);
        writeOrigin(c3834.f12039, (C3838) interfaceC8167.origin(), c3838);
        writeField(dataOutput, c3834);
        C3834 c38342 = new C3834(SerializedField.VALUE_DATA);
        writeValueData(c38342.f12039, interfaceC8167);
        writeField(dataOutput, c38342);
        writeEndMarker(dataOutput);
    }

    private static void writeValueData(DataOutput dataOutput, InterfaceC8167 interfaceC8167) throws IOException {
        SerializedValueType serializedValueTypeForValue = SerializedValueType.forValue(interfaceC8167);
        dataOutput.writeByte(serializedValueTypeForValue.ordinal());
        switch (AbstractC3850.f12075[serializedValueTypeForValue.ordinal()]) {
            case 1:
                dataOutput.writeBoolean(((ConfigBoolean) interfaceC8167).unwrapped().booleanValue());
                break;
            case 3:
                dataOutput.writeInt(((ConfigInt) interfaceC8167).unwrapped().intValue());
                dataOutput.writeUTF(((ConfigNumber) interfaceC8167).transformToString());
                break;
            case 4:
                dataOutput.writeLong(((ConfigLong) interfaceC8167).unwrapped().longValue());
                dataOutput.writeUTF(((ConfigNumber) interfaceC8167).transformToString());
                break;
            case 5:
                dataOutput.writeDouble(((ConfigDouble) interfaceC8167).unwrapped().doubleValue());
                dataOutput.writeUTF(((ConfigNumber) interfaceC8167).transformToString());
                break;
            case 6:
                dataOutput.writeUTF(((ConfigString) interfaceC8167).unwrapped());
                break;
            case 7:
                InterfaceC8165 interfaceC8165 = (InterfaceC8165) interfaceC8167;
                dataOutput.writeInt(interfaceC8165.size());
                Iterator it = interfaceC8165.iterator();
                while (it.hasNext()) {
                    writeValue(dataOutput, (InterfaceC8167) it.next(), (C3838) interfaceC8165.origin());
                }
                break;
            case 8:
                InterfaceC8162 interfaceC8162 = (InterfaceC8162) interfaceC8167;
                dataOutput.writeInt(interfaceC8162.size());
                for (Map.Entry entry : interfaceC8162.entrySet()) {
                    dataOutput.writeUTF((String) entry.getKey());
                    writeValue(dataOutput, (InterfaceC8167) entry.getValue(), (C3838) interfaceC8162.origin());
                }
                break;
        }
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public boolean equals(Object obj) {
        if ((obj instanceof SerializedConfigValue) && canEqual(obj)) {
            SerializedConfigValue serializedConfigValue = (SerializedConfigValue) obj;
            if (this.wasConfig == serializedConfigValue.wasConfig && this.value.equals(serializedConfigValue.value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public int hashCode() {
        return (((this.value.hashCode() + 41) * 41) + (this.wasConfig ? 1 : 0)) * 41;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        while (true) {
            SerializedField code = readCode(objectInput);
            if (code == SerializedField.END_MARKER) {
                return;
            }
            DataInput dataInputFieldIn = fieldIn(objectInput);
            if (code == SerializedField.ROOT_VALUE) {
                this.value = readValue(dataInputFieldIn, null);
            } else if (code == SerializedField.ROOT_WAS_CONFIG) {
                this.wasConfig = dataInputFieldIn.readBoolean();
            }
        }
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public final String toString() {
        return getClass().getSimpleName() + "(value=" + this.value + ",wasConfig=" + this.wasConfig + ")";
    }

    @Override // p250.InterfaceC8167
    public Object unwrapped() {
        throw shouldNotBeUsed();
    }

    @Override // p250.InterfaceC8167
    public ConfigValueType valueType() {
        throw shouldNotBeUsed();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        if (((AbstractC3843) this.value).resolveStatus() != ResolveStatus.RESOLVED) {
            throw new NotSerializableException("tried to serialize a value with unresolved substitutions, need to Config#resolve() first, see API docs");
        }
        C3834 c3834 = new C3834(SerializedField.ROOT_VALUE);
        writeValue(c3834.f12039, this.value, null);
        writeField(objectOutput, c3834);
        C3834 c38342 = new C3834(SerializedField.ROOT_WAS_CONFIG);
        c38342.f12039.writeBoolean(this.wasConfig);
        writeField(objectOutput, c38342);
        writeEndMarker(objectOutput);
    }

    @Override // com.typesafe.config.impl.AbstractC3843
    public SerializedConfigValue newCopy(InterfaceC8161 interfaceC8161) {
        throw shouldNotBeUsed();
    }

    public SerializedConfigValue(InterfaceC8167 interfaceC8167) {
        this();
        this.value = interfaceC8167;
        this.wasConfig = false;
    }

    public SerializedConfigValue() {
        super(null);
    }
}
