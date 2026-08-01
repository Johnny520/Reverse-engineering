package com.android.p002dx.p003cf.direct;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import androidx.profileinstaller.AbstractC3275;
import bsh.C3466;
import com.android.p002dx.p003cf.iface.ParseException;
import com.android.p002dx.p003cf.iface.ParseObserver;
import com.android.p002dx.rop.annotation.Annotation;
import com.android.p002dx.rop.annotation.AnnotationVisibility;
import com.android.p002dx.rop.annotation.Annotations;
import com.android.p002dx.rop.annotation.AnnotationsList;
import com.android.p002dx.rop.annotation.NameValuePair;
import com.android.p002dx.rop.cst.Constant;
import com.android.p002dx.rop.cst.ConstantPool;
import com.android.p002dx.rop.cst.CstAnnotation;
import com.android.p002dx.rop.cst.CstArray;
import com.android.p002dx.rop.cst.CstBoolean;
import com.android.p002dx.rop.cst.CstByte;
import com.android.p002dx.rop.cst.CstChar;
import com.android.p002dx.rop.cst.CstDouble;
import com.android.p002dx.rop.cst.CstEnumRef;
import com.android.p002dx.rop.cst.CstFloat;
import com.android.p002dx.rop.cst.CstInteger;
import com.android.p002dx.rop.cst.CstLong;
import com.android.p002dx.rop.cst.CstNat;
import com.android.p002dx.rop.cst.CstShort;
import com.android.p002dx.rop.cst.CstString;
import com.android.p002dx.rop.cst.CstType;
import com.android.p002dx.rop.type.Type;
import com.android.p002dx.util.ByteArray;
import com.android.p002dx.util.Hex;
import java.io.IOException;
import p025.AbstractC7012;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class AnnotationParser {
    private final ByteArray bytes;

    /* JADX INFO: renamed from: cf */
    private final DirectClassFile f29cf;
    private final ByteArray.MyDataInputStream input;
    private final ParseObserver observer;
    private int parseCursor;
    private final ConstantPool pool;

    public AnnotationParser(DirectClassFile directClassFile, int i, int i2, ParseObserver parseObserver) {
        if (directClassFile == null) {
            C3466.m5903("cf == null");
            throw null;
        }
        this.f29cf = directClassFile;
        this.pool = directClassFile.getConstantPool();
        this.observer = parseObserver;
        ByteArray byteArraySlice = directClassFile.getBytes().slice(i, i2 + i);
        this.bytes = byteArraySlice;
        this.input = byteArraySlice.makeDataInputStream();
        this.parseCursor = 0;
    }

    private void changeIndent(int i) {
        this.observer.changeIndent(i);
    }

    private Annotation parseAnnotation(AnnotationVisibility annotationVisibility) throws IOException {
        requireLength(4);
        int unsignedShort = this.input.readUnsignedShort();
        int unsignedShort2 = this.input.readUnsignedShort();
        CstType cstType = new CstType(Type.intern(((CstString) this.pool.get(unsignedShort)).getString()));
        if (this.observer != null) {
            parsed(2, "type: " + cstType.toHuman());
            parsed(2, AbstractC7012.m12147(unsignedShort2, "num_elements: "));
        }
        Annotation annotation = new Annotation(cstType, annotationVisibility);
        for (int i = 0; i < unsignedShort2; i++) {
            if (this.observer != null) {
                parsed(0, AbstractC0900.m722(i, "elements[", "]:"));
                changeIndent(1);
            }
            annotation.add(parseElement());
            if (this.observer != null) {
                changeIndent(-1);
            }
        }
        annotation.setImmutable();
        return annotation;
    }

    private Annotations parseAnnotations(AnnotationVisibility annotationVisibility) throws IOException {
        int unsignedShort = this.input.readUnsignedShort();
        if (this.observer != null) {
            parsed(2, AbstractC3275.m5120(new StringBuilder("num_annotations: "), unsignedShort));
        }
        Annotations annotations = new Annotations();
        for (int i = 0; i < unsignedShort; i++) {
            if (this.observer != null) {
                parsed(0, AbstractC0900.m722(i, "annotations[", "]:"));
                changeIndent(1);
            }
            annotations.add(parseAnnotation(annotationVisibility));
            ParseObserver parseObserver = this.observer;
            if (parseObserver != null) {
                parseObserver.changeIndent(-1);
            }
        }
        annotations.setImmutable();
        return annotations;
    }

    private AnnotationsList parseAnnotationsList(AnnotationVisibility annotationVisibility) throws IOException {
        int unsignedByte = this.input.readUnsignedByte();
        if (this.observer != null) {
            parsed(1, "num_parameters: " + Hex.m27u1(unsignedByte));
        }
        AnnotationsList annotationsList = new AnnotationsList(unsignedByte);
        for (int i = 0; i < unsignedByte; i++) {
            if (this.observer != null) {
                parsed(0, AbstractC0900.m722(i, "parameter_annotations[", "]:"));
                changeIndent(1);
            }
            annotationsList.set(i, parseAnnotations(annotationVisibility));
            ParseObserver parseObserver = this.observer;
            if (parseObserver != null) {
                parseObserver.changeIndent(-1);
            }
        }
        annotationsList.setImmutable();
        return annotationsList;
    }

    private Constant parseConstant() {
        Constant constant = this.pool.get(this.input.readUnsignedShort());
        if (this.observer != null) {
            parsed(2, AbstractC0900.m717("constant_value: ", constant instanceof CstString ? ((CstString) constant).toQuoted() : constant.toHuman()));
        }
        return constant;
    }

    private NameValuePair parseElement() throws IOException {
        requireLength(5);
        CstString cstString = (CstString) this.pool.get(this.input.readUnsignedShort());
        if (this.observer != null) {
            parsed(2, "element_name: " + cstString.toHuman());
            parsed(0, "value: ");
            changeIndent(1);
        }
        Constant value = parseValue();
        if (this.observer != null) {
            changeIndent(-1);
        }
        return new NameValuePair(cstString, value);
    }

    private Constant parseValue() throws IOException {
        ParseObserver parseObserver;
        int unsignedByte = this.input.readUnsignedByte();
        if (this.observer != null) {
            parsed(1, "tag: " + new CstString(Character.toString((char) unsignedByte)).toQuoted());
        }
        if (unsignedByte == 64) {
            return new CstAnnotation(parseAnnotation(AnnotationVisibility.EMBEDDED));
        }
        if (unsignedByte == 70) {
            return (CstFloat) parseConstant();
        }
        if (unsignedByte == 83) {
            return CstShort.make(((CstInteger) parseConstant()).getValue());
        }
        if (unsignedByte == 99) {
            Type typeInternReturnType = Type.internReturnType(((CstString) this.pool.get(this.input.readUnsignedShort())).getString());
            if (this.observer != null) {
                parsed(2, "class_info: " + typeInternReturnType.toHuman());
            }
            return new CstType(typeInternReturnType);
        }
        if (unsignedByte == 101) {
            requireLength(4);
            int unsignedShort = this.input.readUnsignedShort();
            int unsignedShort2 = this.input.readUnsignedShort();
            CstString cstString = (CstString) this.pool.get(unsignedShort);
            CstString cstString2 = (CstString) this.pool.get(unsignedShort2);
            if (this.observer != null) {
                parsed(2, "type_name: " + cstString.toHuman());
                parsed(2, "const_name: " + cstString2.toHuman());
            }
            return new CstEnumRef(new CstNat(cstString2, cstString));
        }
        if (unsignedByte == 115) {
            return parseConstant();
        }
        if (unsignedByte == 73) {
            return (CstInteger) parseConstant();
        }
        if (unsignedByte == 74) {
            return (CstLong) parseConstant();
        }
        if (unsignedByte == 90) {
            return CstBoolean.make(((CstInteger) parseConstant()).getValue());
        }
        if (unsignedByte != 91) {
            switch (unsignedByte) {
                case 66:
                    return CstByte.make(((CstInteger) parseConstant()).getValue());
                case 67:
                    CstInteger cstInteger = (CstInteger) parseConstant();
                    cstInteger.getValue();
                    return CstChar.make(cstInteger.getValue());
                case 68:
                    return (CstDouble) parseConstant();
                default:
                    throw new ParseException("unknown annotation tag: " + Hex.m27u1(unsignedByte));
            }
        }
        requireLength(2);
        int unsignedShort3 = this.input.readUnsignedShort();
        CstArray.List list = new CstArray.List(unsignedShort3);
        if (this.observer != null) {
            parsed(2, AbstractC7012.m12147(unsignedShort3, "num_values: "));
            changeIndent(1);
        }
        int i = 0;
        while (true) {
            parseObserver = this.observer;
            if (i >= unsignedShort3) {
                break;
            }
            if (parseObserver != null) {
                changeIndent(-1);
                parsed(0, AbstractC0900.m722(i, "element_value[", "]:"));
                changeIndent(1);
            }
            list.set(i, parseValue());
            i++;
        }
        if (parseObserver != null) {
            changeIndent(-1);
        }
        list.setImmutable();
        return new CstArray(list);
    }

    private void parsed(int i, String str) {
        this.observer.parsed(this.bytes, this.parseCursor, i, str);
        this.parseCursor += i;
    }

    private void requireLength(int i) {
        if (this.input.available() < i) {
            throw new ParseException("truncated annotation attribute");
        }
    }

    public Annotations parseAnnotationAttribute(AnnotationVisibility annotationVisibility) {
        try {
            Annotations annotations = parseAnnotations(annotationVisibility);
            if (this.input.available() == 0) {
                return annotations;
            }
            throw new ParseException("extra data in attribute");
        } catch (IOException e) {
            C1123.m1408("shouldn't happen", e);
            return null;
        }
    }

    public AnnotationsList parseParameterAttribute(AnnotationVisibility annotationVisibility) {
        try {
            AnnotationsList annotationsList = parseAnnotationsList(annotationVisibility);
            if (this.input.available() == 0) {
                return annotationsList;
            }
            throw new ParseException("extra data in attribute");
        } catch (IOException e) {
            C1123.m1408("shouldn't happen", e);
            return null;
        }
    }

    public Constant parseValueAttribute() {
        try {
            Constant value = parseValue();
            if (this.input.available() == 0) {
                return value;
            }
            throw new ParseException("extra data in attribute");
        } catch (IOException e) {
            C1123.m1408("shouldn't happen", e);
            return null;
        }
    }
}
