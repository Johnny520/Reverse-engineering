package org.luckypray.dexkit.query.enums;

/* JADX INFO: loaded from: classes.dex */
public enum TargetElementType extends Enum<TargetElementType> {
    private static final /* synthetic */ TargetElementType[] $VALUES = null;
    public static final TargetElementType AnnotationType = null;
    public static final TargetElementType Constructor = null;
    public static final TargetElementType Field = null;
    public static final TargetElementType LocalVariable = null;
    public static final TargetElementType Method = null;
    public static final TargetElementType Package = null;
    public static final TargetElementType Parameter = null;
    public static final TargetElementType Type = null;
    public static final TargetElementType TypeParameter = null;
    public static final TargetElementType TypeUse = null;
    private final byte value;

    private static final /* synthetic */ TargetElementType[] $values() {
        return new TargetElementType[]{Type, Field, Method, Parameter, Constructor, LocalVariable, AnnotationType, Package, TypeParameter, TypeUse};
    }

    static {
        Type = new TargetElementType("Type", 0, (byte) 0);
        Field = new TargetElementType("Field", 1, (byte) 1);
        Method = new TargetElementType("Method", 2, (byte) 2);
        Parameter = new TargetElementType("Parameter", 3, (byte) 3);
        Constructor = new TargetElementType("Constructor", 4, (byte) 4);
        LocalVariable = new TargetElementType("LocalVariable", 5, (byte) 5);
        AnnotationType = new TargetElementType("AnnotationType", 6, (byte) 6);
        Package = new TargetElementType("Package", 7, (byte) 7);
        TypeParameter = new TargetElementType("TypeParameter", 8, (byte) 8);
        TypeUse = new TargetElementType("TypeUse", 9, (byte) 9);
        $VALUES = $values();
    }

    TargetElementType(String r1, int r2, byte r3) {
        this.value = r3;
    }

    public static TargetElementType valueOf(String r1) {
        return (TargetElementType) Enum.valueOf(TargetElementType.class, r1);
    }

    public static TargetElementType[] values() {
        return (TargetElementType[]) $VALUES.clone();
    }

    public final byte getValue() {
        return this.value;
    }
}
