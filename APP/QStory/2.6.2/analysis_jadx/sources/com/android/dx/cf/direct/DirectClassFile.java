package com.android.dx.cf.direct;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.profileinstaller.AbstractC2442;
import bsh.C2632;
import com.android.dx.cf.attrib.AttBootstrapMethods;
import com.android.dx.cf.attrib.AttSourceFile;
import com.android.dx.cf.code.BootstrapMethodsList;
import com.android.dx.cf.cst.ConstantPoolParser;
import com.android.dx.cf.iface.Attribute;
import com.android.dx.cf.iface.AttributeList;
import com.android.dx.cf.iface.ClassFile;
import com.android.dx.cf.iface.FieldList;
import com.android.dx.cf.iface.MethodList;
import com.android.dx.cf.iface.ParseException;
import com.android.dx.cf.iface.ParseObserver;
import com.android.dx.cf.iface.StdAttributeList;
import com.android.dx.rop.code.AccessFlags;
import com.android.dx.rop.cst.ConstantPool;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.cst.StdConstantPool;
import com.android.dx.rop.type.StdTypeList;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import com.android.dx.util.ByteArray;
import com.android.dx.util.Hex;
import net.bytebuddy.dynamic.ClassFileLocator;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class DirectClassFile implements ClassFile {
    private static final int CLASS_FILE_MAGIC = -889275714;
    private static final int CLASS_FILE_MAX_MAJOR_VERSION = 53;
    private static final int CLASS_FILE_MAX_MINOR_VERSION = 0;
    private static final int CLASS_FILE_MIN_MAJOR_VERSION = 45;
    private int accessFlags;
    private AttributeFactory attributeFactory;
    private StdAttributeList attributes;
    private final ByteArray bytes;
    private FieldList fields;
    private final String filePath;
    private TypeList interfaces;
    private MethodList methods;
    private ParseObserver observer;
    private StdConstantPool pool;
    private final boolean strictParse;
    private CstType superClass;
    private CstType thisClass;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public static class DcfTypeList implements TypeList {
        private final ByteArray bytes;
        private final StdConstantPool pool;
        private final int size;

        public DcfTypeList(ByteArray byteArray, int i, int i2, StdConstantPool stdConstantPool, ParseObserver parseObserver) {
            if (i2 < 0) {
                C5919.m11249("size < 0");
                throw null;
            }
            ByteArray byteArraySlice = byteArray.slice(i, (i2 * 2) + i);
            this.bytes = byteArraySlice;
            this.size = i2;
            this.pool = stdConstantPool;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i3 * 2;
                try {
                    CstType cstType = (CstType) stdConstantPool.get(byteArraySlice.getUnsignedShort(i4));
                    if (parseObserver != null) {
                        parseObserver.parsed(byteArraySlice, i4, 2, "  " + cstType);
                    }
                } catch (ClassCastException e) {
                    C0276.m847("bogus class cpi", e);
                    throw null;
                }
            }
        }

        @Override // com.android.dx.rop.type.TypeList
        public Type getType(int i) {
            return ((CstType) this.pool.get(this.bytes.getUnsignedShort(i * 2))).getClassType();
        }

        @Override // com.android.dx.rop.type.TypeList
        public int getWordCount() {
            return this.size;
        }

        @Override // com.android.dx.rop.type.TypeList
        public boolean isMutable() {
            return false;
        }

        @Override // com.android.dx.rop.type.TypeList
        public int size() {
            return this.size;
        }

        @Override // com.android.dx.rop.type.TypeList
        public TypeList withAddedType(Type type) {
            throw new UnsupportedOperationException("unsupported");
        }
    }

    public DirectClassFile(ByteArray byteArray, String str, boolean z) {
        if (byteArray == null) {
            C2632.m5298("bytes == null");
            throw null;
        }
        if (str == null) {
            C2632.m5298("filePath == null");
            throw null;
        }
        this.filePath = str;
        this.bytes = byteArray;
        this.strictParse = z;
        this.accessFlags = -1;
    }

    private boolean isGoodMagic(int i) {
        return i == CLASS_FILE_MAGIC;
    }

    private boolean isGoodVersion(int i, int i2) {
        if (i >= 0) {
            return i2 == 53 ? i <= 0 : i2 < 53 && i2 >= 45;
        }
        return false;
    }

    private void parse() {
        try {
            parse0();
        } catch (ParseException e) {
            e.addContext("...while parsing " + this.filePath);
            throw e;
        } catch (RuntimeException e2) {
            ParseException parseException = new ParseException(e2);
            parseException.addContext("...while parsing " + this.filePath);
            throw parseException;
        }
    }

    private void parse0() {
        if (this.bytes.size() < 10) {
            throw new ParseException("severely truncated class file");
        }
        ParseObserver parseObserver = this.observer;
        if (parseObserver != null) {
            parseObserver.parsed(this.bytes, 0, 0, "begin classfile");
            this.observer.parsed(this.bytes, 0, 4, "magic: " + Hex.u4(getMagic0()));
            this.observer.parsed(this.bytes, 4, 2, "minor_version: " + Hex.u2(getMinorVersion0()));
            this.observer.parsed(this.bytes, 6, 2, "major_version: " + Hex.u2(getMajorVersion0()));
        }
        if (this.strictParse) {
            if (!isGoodMagic(getMagic0())) {
                throw new ParseException("bad class file magic (" + Hex.u4(getMagic0()) + ")");
            }
            if (!isGoodVersion(getMinorVersion0(), getMajorVersion0())) {
                throw new ParseException("unsupported class file version " + getMajorVersion0() + "." + getMinorVersion0());
            }
        }
        ConstantPoolParser constantPoolParser = new ConstantPoolParser(this.bytes);
        constantPoolParser.setObserver(this.observer);
        StdConstantPool pool = constantPoolParser.getPool();
        this.pool = pool;
        pool.setImmutable();
        int endOffset = constantPoolParser.getEndOffset();
        int unsignedShort = this.bytes.getUnsignedShort(endOffset);
        int i = endOffset + 2;
        this.thisClass = (CstType) this.pool.get(this.bytes.getUnsignedShort(i));
        int i2 = endOffset + 4;
        this.superClass = (CstType) this.pool.get0Ok(this.bytes.getUnsignedShort(i2));
        int i3 = endOffset + 6;
        int unsignedShort2 = this.bytes.getUnsignedShort(i3);
        ParseObserver parseObserver2 = this.observer;
        if (parseObserver2 != null) {
            parseObserver2.parsed(this.bytes, endOffset, 2, "access_flags: " + AccessFlags.classString(unsignedShort));
            this.observer.parsed(this.bytes, i, 2, "this_class: " + this.thisClass);
            this.observer.parsed(this.bytes, i2, 2, "super_class: " + stringOrNone(this.superClass));
            this.observer.parsed(this.bytes, i3, 2, AbstractC2442.m4550(new StringBuilder("interfaces_count: "), unsignedShort2));
            if (unsignedShort2 != 0) {
                this.observer.parsed(this.bytes, endOffset + 8, 0, "interfaces:");
            }
        }
        int i4 = endOffset + 8;
        this.interfaces = makeTypeList(i4, unsignedShort2);
        int i5 = (unsignedShort2 * 2) + i4;
        if (this.strictParse) {
            String className = this.thisClass.getClassType().getClassName();
            if (!this.filePath.endsWith(ClassFileLocator.CLASS_FILE_EXTENSION) || !this.filePath.startsWith(className) || this.filePath.length() != className.length() + 6) {
                throw new ParseException(AbstractC0053.m146(AbstractC6136.m11550("class name (", className, ") does not match path ("), this.filePath, ")"));
            }
        }
        this.accessFlags = unsignedShort;
        FieldListParser fieldListParser = new FieldListParser(this, this.thisClass, i5, this.attributeFactory);
        fieldListParser.setObserver(this.observer);
        this.fields = fieldListParser.getList();
        MethodListParser methodListParser = new MethodListParser(this, this.thisClass, fieldListParser.getEndOffset(), this.attributeFactory);
        methodListParser.setObserver(this.observer);
        this.methods = methodListParser.getList();
        AttributeListParser attributeListParser = new AttributeListParser(this, 0, methodListParser.getEndOffset(), this.attributeFactory);
        attributeListParser.setObserver(this.observer);
        StdAttributeList list = attributeListParser.getList();
        this.attributes = list;
        list.setImmutable();
        int endOffset2 = attributeListParser.getEndOffset();
        if (endOffset2 != this.bytes.size()) {
            throw new ParseException("extra bytes at end of class file, at offset " + Hex.u4(endOffset2));
        }
        ParseObserver parseObserver3 = this.observer;
        if (parseObserver3 != null) {
            parseObserver3.parsed(this.bytes, endOffset2, 0, "end classfile");
        }
    }

    private void parseToEndIfNecessary() {
        if (this.attributes == null) {
            parse();
        }
    }

    private void parseToInterfacesIfNecessary() {
        if (this.accessFlags == -1) {
            parse();
        }
    }

    public static String stringOrNone(Object obj) {
        return obj == null ? "(none)" : obj.toString();
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public int getAccessFlags() {
        parseToInterfacesIfNecessary();
        return this.accessFlags;
    }

    @Override // com.android.dx.cf.iface.ClassFile, com.android.dx.cf.iface.HasAttribute
    public AttributeList getAttributes() {
        parseToEndIfNecessary();
        return this.attributes;
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public BootstrapMethodsList getBootstrapMethods() {
        AttBootstrapMethods attBootstrapMethods = (AttBootstrapMethods) getAttributes().findFirst(AttBootstrapMethods.ATTRIBUTE_NAME);
        return attBootstrapMethods != null ? attBootstrapMethods.getBootstrapMethods() : BootstrapMethodsList.EMPTY;
    }

    public ByteArray getBytes() {
        return this.bytes;
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public ConstantPool getConstantPool() {
        parseToInterfacesIfNecessary();
        return this.pool;
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public FieldList getFields() {
        parseToEndIfNecessary();
        return this.fields;
    }

    public String getFilePath() {
        return this.filePath;
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public TypeList getInterfaces() {
        parseToInterfacesIfNecessary();
        return this.interfaces;
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public int getMagic() {
        parseToInterfacesIfNecessary();
        return getMagic0();
    }

    public int getMagic0() {
        return this.bytes.getInt(0);
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public int getMajorVersion() {
        parseToInterfacesIfNecessary();
        return getMajorVersion0();
    }

    public int getMajorVersion0() {
        return this.bytes.getUnsignedShort(6);
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public MethodList getMethods() {
        parseToEndIfNecessary();
        return this.methods;
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public int getMinorVersion() {
        parseToInterfacesIfNecessary();
        return getMinorVersion0();
    }

    public int getMinorVersion0() {
        return this.bytes.getUnsignedShort(4);
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public CstString getSourceFile() {
        Attribute attributeFindFirst = getAttributes().findFirst(AttSourceFile.ATTRIBUTE_NAME);
        if (attributeFindFirst instanceof AttSourceFile) {
            return ((AttSourceFile) attributeFindFirst).getSourceFile();
        }
        return null;
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public CstType getSuperclass() {
        parseToInterfacesIfNecessary();
        return this.superClass;
    }

    @Override // com.android.dx.cf.iface.ClassFile
    public CstType getThisClass() {
        parseToInterfacesIfNecessary();
        return this.thisClass;
    }

    public TypeList makeTypeList(int i, int i2) {
        if (i2 == 0) {
            return StdTypeList.EMPTY;
        }
        StdConstantPool stdConstantPool = this.pool;
        if (stdConstantPool != null) {
            return new DcfTypeList(this.bytes, i, i2, stdConstantPool, this.observer);
        }
        C5919.m11250("pool not yet initialized");
        return null;
    }

    public void setAttributeFactory(AttributeFactory attributeFactory) {
        if (attributeFactory != null) {
            this.attributeFactory = attributeFactory;
        } else {
            C2632.m5298("attributeFactory == null");
        }
    }

    public void setObserver(ParseObserver parseObserver) {
        this.observer = parseObserver;
    }

    public DirectClassFile(byte[] bArr, String str, boolean z) {
        this(new ByteArray(bArr), str, z);
    }
}
