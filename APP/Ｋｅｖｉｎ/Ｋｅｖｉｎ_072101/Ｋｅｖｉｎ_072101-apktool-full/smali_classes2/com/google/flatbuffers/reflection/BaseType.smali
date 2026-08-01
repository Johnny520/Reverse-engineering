.class public final Lcom/google/flatbuffers/reflection/BaseType;
.super Ljava/lang/Object;
.source "BaseType.java"


# static fields
.field public static final Array:B = 0x11t

.field public static final Bool:B = 0x2t

.field public static final Byte:B = 0x3t

.field public static final Double:B = 0xct

.field public static final Float:B = 0xbt

.field public static final Int:B = 0x7t

.field public static final Long:B = 0x9t

.field public static final MaxBaseType:B = 0x13t

.field public static final None:B = 0x0t

.field public static final Obj:B = 0xft

.field public static final Short:B = 0x5t

.field public static final String:B = 0xdt

.field public static final UByte:B = 0x4t

.field public static final UInt:B = 0x8t

.field public static final ULong:B = 0xat

.field public static final UShort:B = 0x6t

.field public static final UType:B = 0x1t

.field public static final Union:B = 0x10t

.field public static final Vector:B = 0xet

.field public static final Vector64:B = 0x12t

.field public static final names:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 29
    const-string v18, "Vector64"

    const-string v19, "MaxBaseType"

    const-string v0, "None"

    const-string v1, "UType"

    const-string v2, "Bool"

    const-string v3, "Byte"

    const-string v4, "UByte"

    const-string v5, "Short"

    const-string v6, "UShort"

    const-string v7, "Int"

    const-string v8, "UInt"

    const-string v9, "Long"

    const-string v10, "ULong"

    const-string v11, "Float"

    const-string v12, "Double"

    const-string v13, "String"

    const-string v14, "Vector"

    const-string v15, "Obj"

    const-string v16, "Union"

    const-string v17, "Array"

    filled-new-array/range {v0 .. v19}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/flatbuffers/reflection/BaseType;->names:[Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static name(I)Ljava/lang/String;
    .locals 1
    .param p0, "e"    # I

    .line 31
    sget-object v0, Lcom/google/flatbuffers/reflection/BaseType;->names:[Ljava/lang/String;

    aget-object v0, v0, p0

    return-object v0
.end method
