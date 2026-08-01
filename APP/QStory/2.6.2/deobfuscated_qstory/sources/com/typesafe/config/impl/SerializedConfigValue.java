package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import com.alibaba.fastjson2.C2941;
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
import p007.AbstractC6136;
import p144.C7546;
import p250.InterfaceC8160;
import p250.InterfaceC8161;
import p250.InterfaceC8164;
import p250.InterfaceC8165;
import p250.InterfaceC8166;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
class SerializedConfigValue extends AbstractC3842 implements Externalizable {
    private static final long serialVersionUID = 1;
    private InterfaceC8166 value;
    private boolean wasConfig;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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

        public static SerializedValueType forValue(InterfaceC8166 interfaceC8166) {
            ConfigValueType configValueTypeValueType = interfaceC8166.valueType();
            if (configValueTypeValueType != ConfigValueType.NUMBER) {
                for (SerializedValueType serializedValueType : values()) {
                    if (serializedValueType.configType == configValueTypeValueType) {
                        return serializedValueType;
                    }
                }
            } else {
                if (interfaceC8166 instanceof ConfigInt) {
                    return INT;
                }
                if (interfaceC8166 instanceof ConfigLong) {
                    return LONG;
                }
                if (interfaceC8166 instanceof ConfigDouble) {
                    return DOUBLE;
                }
            }
            C2941.m6337(interfaceC8166, "don't know how to serialize ");
            return null;
        }

        public static SerializedValueType valueOf(String str) {
            return (SerializedValueType) Enum.valueOf(SerializedValueType.class, str);
        }

        public static SerializedValueType[] values() {
            return (SerializedValueType[]) $VALUES.clone();
        }
    }

    public SerializedConfigValue(InterfaceC8165 interfaceC8165) {
        this(interfaceC8165.root());
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
        C5919.m11246(AbstractC0053.m161(unsignedByte, "field code ", " is not supposed to be on the wire"));
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
    public static C3837 readOrigin(DataInput dataInput, C3837 c3837) throws IOException {
        EnumMap enumMap = new EnumMap(SerializedField.class);
        while (true) {
            SerializedField code = readCode(dataInput);
            ?? utf = 0;
            utf = 0;
            switch (AbstractC3849.f12071[code.ordinal()]) {
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
                    Map mapM8222 = c3837 != null ? c3837.m8222() : Collections.EMPTY_MAP;
                    EnumMap enumMap2 = new EnumMap((Map) enumMap);
                    Iterator it = mapM8222.entrySet().iterator();
                    while (it.hasNext()) {
                        SerializedField serializedField = (SerializedField) ((Map.Entry) it.next()).getKey();
                        if (!enumMap.containsKey(serializedField)) {
                            switch (AbstractC3838.f12056[serializedField.ordinal()]) {
                                case 1:
                                    enumMap2.put(serializedField, mapM8222.get(serializedField));
                                    break;
                                case 2:
                                case 3:
                                case 4:
                                    enumMap2.put(serializedField, mapM8222.get(serializedField));
                                    break;
                                case 5:
                                    SerializedField serializedField2 = SerializedField.ORIGIN_NULL_URL;
                                    if (enumMap.containsKey(serializedField2)) {
                                        enumMap2.remove(serializedField2);
                                    } else {
                                        enumMap2.put(serializedField, mapM8222.get(serializedField));
                                    }
                                    break;
                                case 6:
                                    SerializedField serializedField3 = SerializedField.ORIGIN_NULL_RESOURCE;
                                    if (enumMap.containsKey(serializedField3)) {
                                        enumMap2.remove(serializedField3);
                                    } else {
                                        enumMap2.put(serializedField, mapM8222.get(serializedField));
                                    }
                                    break;
                                case 7:
                                    SerializedField serializedField4 = SerializedField.ORIGIN_NULL_COMMENTS;
                                    if (enumMap.containsKey(serializedField4)) {
                                        enumMap2.remove(serializedField4);
                                    } else {
                                        enumMap2.put(serializedField, mapM8222.get(serializedField));
                                    }
                                    break;
                                case 8:
                                case 9:
                                case 10:
                                    C2941.m6341("applying fields, base object should not contain ", serializedField, " ", mapM8222);
                                    return null;
                                case 11:
                                case 12:
                                case 13:
                                case 14:
                                case 15:
                                case 16:
                                    C2941.m6337(serializedField, "should not appear here: ");
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
                        C5919.m11246("Missing ORIGIN_TYPE field");
                        return null;
                    }
                    OriginType originType = number.byteValue() < OriginType.values().length ? OriginType.values()[number.byteValue()] : OriginType.GENERIC;
                    String str2 = (String) enumMap2.get(SerializedField.ORIGIN_URL);
                    String str3 = (String) enumMap2.get(SerializedField.ORIGIN_RESOURCE);
                    List list = (List) enumMap2.get(SerializedField.ORIGIN_COMMENTS);
                    return new C3837(str, num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1, originType, str2, (originType == OriginType.RESOURCE && str3 == null) ? str : str3, list);
                case 12:
                case 13:
                case 14:
                case 15:
                    C7546.m12740(code, "Not expecting this field here: ");
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
        InterfaceC8166 interfaceC8166 = this.value;
        return z ? ((InterfaceC8161) interfaceC8166).toConfig() : interfaceC8166;
    }

    private static AbstractC3842 readValue(DataInput dataInput, C3837 c3837) throws IOException {
        AbstractC3842 valueData = null;
        C3837 origin = null;
        while (true) {
            SerializedField code = readCode(dataInput);
            if (code == SerializedField.END_MARKER) {
                if (valueData != null) {
                    return valueData;
                }
                C5919.m11246("No value data found in serialization of value");
                return null;
            }
            if (code == SerializedField.VALUE_DATA) {
                if (origin == null) {
                    C5919.m11246("Origin must be stored before value data");
                    return null;
                }
                dataInput.readInt();
                valueData = readValueData(dataInput, origin);
            } else if (code == SerializedField.VALUE_ORIGIN) {
                dataInput.readInt();
                origin = readOrigin(dataInput, c3837);
            } else {
                skipField(dataInput);
            }
        }
    }

    private static AbstractC3842 readValueData(DataInput dataInput, C3837 c3837) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        SerializedValueType serializedValueTypeForInt = SerializedValueType.forInt(unsignedByte);
        if (serializedValueTypeForInt == null) {
            C5919.m11246(AbstractC6136.m11556(unsignedByte, "Unknown serialized value type: "));
            return null;
        }
        int i = 0;
        switch (AbstractC3849.f12070[serializedValueTypeForInt.ordinal()]) {
            case 1:
                return new ConfigBoolean(c3837, dataInput.readBoolean());
            case 2:
                return new ConfigNull(c3837);
            case 3:
                return new ConfigInt(c3837, dataInput.readInt(), dataInput.readUTF());
            case 4:
                return new ConfigLong(c3837, dataInput.readLong(), dataInput.readUTF());
            case 5:
                return new ConfigDouble(c3837, dataInput.readDouble(), dataInput.readUTF());
            case 6:
                return new ConfigString.Quoted(c3837, dataInput.readUTF());
            case 7:
                int i2 = dataInput.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (i < i2) {
                    arrayList.add(readValue(dataInput, c3837));
                    i++;
                }
                return new SimpleConfigList(c3837, arrayList);
            case 8:
                int i3 = dataInput.readInt();
                HashMap map = new HashMap(i3);
                while (i < i3) {
                    map.put(dataInput.readUTF(), readValue(dataInput, c3837));
                    i++;
                }
                return new SimpleConfigObject(c3837, map);
            default:
                C7546.m12740(serializedValueTypeForInt, "Unhandled serialized value type: ");
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

    private static void writeField(DataOutput dataOutput, C3833 c3833) throws IOException {
        byte[] byteArray = c3833.f12035.toByteArray();
        dataOutput.writeByte(c3833.f12036.ordinal());
        dataOutput.writeInt(byteArray.length);
        dataOutput.write(byteArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.EnumMap] */
    public static void writeOrigin(DataOutput dataOutput, C3837 c3837, C3837 c38372) throws IOException {
        ?? enumMap;
        if (c3837 != null) {
            Map mapM8222 = c38372 != null ? c38372.m8222() : Collections.EMPTY_MAP;
            EnumMap enumMapM8222 = c3837.m8222();
            enumMap = new EnumMap((Map) enumMapM8222);
            for (Map.Entry entry : mapM8222.entrySet()) {
                SerializedField serializedField = (SerializedField) entry.getKey();
                if (enumMap.containsKey(serializedField) && AbstractC3863.m8262(entry.getValue(), enumMap.get(serializedField))) {
                    enumMap.remove(serializedField);
                } else if (enumMap.containsKey(serializedField)) {
                    continue;
                } else {
                    switch (AbstractC3838.f12056[serializedField.ordinal()]) {
                        case 1:
                            C2941.m6337(enumMapM8222, "origin missing description field? ");
                            return;
                        case 2:
                            enumMap.put(SerializedField.ORIGIN_LINE_NUMBER, -1);
                            break;
                        case 3:
                            enumMap.put(SerializedField.ORIGIN_END_LINE_NUMBER, -1);
                            break;
                        case 4:
                            C2941.m6350("should always be an ORIGIN_TYPE field");
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
                            C2941.m6341("computing delta, base object should not contain ", serializedField, " ", mapM8222);
                            return;
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            C2941.m6337(serializedField, "should not appear here: ");
                            return;
                    }
                }
            }
        } else {
            enumMap = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry2 : enumMap.entrySet()) {
            SerializedField serializedField2 = (SerializedField) entry2.getKey();
            C3833 c3833 = new C3833(serializedField2);
            writeOriginField(c3833.f12034, serializedField2, entry2.getValue());
            writeField(dataOutput, c3833);
        }
        writeEndMarker(dataOutput);
    }

    private static void writeOriginField(DataOutput dataOutput, SerializedField serializedField, Object obj) throws IOException {
        switch (AbstractC3849.f12071[serializedField.ordinal()]) {
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
                C7546.m12740(serializedField, "Unhandled field from origin: ");
                break;
        }
    }

    private static void writeValue(DataOutput dataOutput, InterfaceC8166 interfaceC8166, C3837 c3837) throws IOException {
        C3833 c3833 = new C3833(SerializedField.VALUE_ORIGIN);
        writeOrigin(c3833.f12034, (C3837) interfaceC8166.origin(), c3837);
        writeField(dataOutput, c3833);
        C3833 c38332 = new C3833(SerializedField.VALUE_DATA);
        writeValueData(c38332.f12034, interfaceC8166);
        writeField(dataOutput, c38332);
        writeEndMarker(dataOutput);
    }

    private static void writeValueData(DataOutput dataOutput, InterfaceC8166 interfaceC8166) throws IOException {
        SerializedValueType serializedValueTypeForValue = SerializedValueType.forValue(interfaceC8166);
        dataOutput.writeByte(serializedValueTypeForValue.ordinal());
        switch (AbstractC3849.f12070[serializedValueTypeForValue.ordinal()]) {
            case 1:
                dataOutput.writeBoolean(((ConfigBoolean) interfaceC8166).unwrapped().booleanValue());
                break;
            case 3:
                dataOutput.writeInt(((ConfigInt) interfaceC8166).unwrapped().intValue());
                dataOutput.writeUTF(((ConfigNumber) interfaceC8166).transformToString());
                break;
            case 4:
                dataOutput.writeLong(((ConfigLong) interfaceC8166).unwrapped().longValue());
                dataOutput.writeUTF(((ConfigNumber) interfaceC8166).transformToString());
                break;
            case 5:
                dataOutput.writeDouble(((ConfigDouble) interfaceC8166).unwrapped().doubleValue());
                dataOutput.writeUTF(((ConfigNumber) interfaceC8166).transformToString());
                break;
            case 6:
                dataOutput.writeUTF(((ConfigString) interfaceC8166).unwrapped());
                break;
            case 7:
                InterfaceC8164 interfaceC8164 = (InterfaceC8164) interfaceC8166;
                dataOutput.writeInt(interfaceC8164.size());
                Iterator it = interfaceC8164.iterator();
                while (it.hasNext()) {
                    writeValue(dataOutput, (InterfaceC8166) it.next(), (C3837) interfaceC8164.origin());
                }
                break;
            case 8:
                InterfaceC8161 interfaceC8161 = (InterfaceC8161) interfaceC8166;
                dataOutput.writeInt(interfaceC8161.size());
                for (Map.Entry entry : interfaceC8161.entrySet()) {
                    dataOutput.writeUTF((String) entry.getKey());
                    writeValue(dataOutput, (InterfaceC8166) entry.getValue(), (C3837) interfaceC8161.origin());
                }
                break;
        }
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public boolean equals(Object obj) {
        if ((obj instanceof SerializedConfigValue) && canEqual(obj)) {
            SerializedConfigValue serializedConfigValue = (SerializedConfigValue) obj;
            if (this.wasConfig == serializedConfigValue.wasConfig && this.value.equals(serializedConfigValue.value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.typesafe.config.impl.AbstractC3842
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

    @Override // com.typesafe.config.impl.AbstractC3842
    public final String toString() {
        return getClass().getSimpleName() + "(value=" + this.value + ",wasConfig=" + this.wasConfig + ")";
    }

    @Override // p250.InterfaceC8166
    public Object unwrapped() {
        throw shouldNotBeUsed();
    }

    @Override // p250.InterfaceC8166
    public ConfigValueType valueType() {
        throw shouldNotBeUsed();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        if (((AbstractC3842) this.value).resolveStatus() != ResolveStatus.RESOLVED) {
            throw new NotSerializableException("tried to serialize a value with unresolved substitutions, need to Config#resolve() first, see API docs");
        }
        C3833 c3833 = new C3833(SerializedField.ROOT_VALUE);
        writeValue(c3833.f12034, this.value, null);
        writeField(objectOutput, c3833);
        C3833 c38332 = new C3833(SerializedField.ROOT_WAS_CONFIG);
        c38332.f12034.writeBoolean(this.wasConfig);
        writeField(objectOutput, c38332);
        writeEndMarker(objectOutput);
    }

    @Override // com.typesafe.config.impl.AbstractC3842
    public SerializedConfigValue newCopy(InterfaceC8160 interfaceC8160) {
        throw shouldNotBeUsed();
    }

    public SerializedConfigValue(InterfaceC8166 interfaceC8166) {
        this();
        this.value = interfaceC8166;
        this.wasConfig = false;
    }

    public SerializedConfigValue() {
        super(null);
    }
}
