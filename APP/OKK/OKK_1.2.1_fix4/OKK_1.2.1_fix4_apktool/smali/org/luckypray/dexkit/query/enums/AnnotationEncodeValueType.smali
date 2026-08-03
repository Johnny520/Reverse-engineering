.class public final enum Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum AnnotationValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum ArrayValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum BoolValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum ByteValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum CharValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final Companion:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;

.field public static final enum DoubleValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum EnumValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum FloatValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum IntValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum LongValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum MethodValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum NullValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum ShortValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

.field public static final enum TypeValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    .locals 15

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v2, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->CharValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v3, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v4, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v5, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v6, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v7, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v8, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->TypeValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v9, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->MethodValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v10, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->EnumValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v11, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ArrayValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v12, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->AnnotationValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v13, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->NullValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    sget-object v14, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->BoolValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    filled-new-array/range {v0 .. v14}, [Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "ByteValue"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ByteValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "ShortValue"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ShortValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "CharValue"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->CharValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "IntValue"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->IntValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "LongValue"

    const/4 v3, 0x5

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->LongValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "FloatValue"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->FloatValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "DoubleValue"

    const/4 v3, 0x7

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->DoubleValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "StringValue"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->StringValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "TypeValue"

    const/16 v3, 0x9

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->TypeValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "MethodValue"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->MethodValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "EnumValue"

    const/16 v3, 0xb

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->EnumValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "ArrayValue"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->ArrayValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "AnnotationValue"

    const/16 v3, 0xd

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->AnnotationValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "NullValue"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v3, v2}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->NullValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    const-string v1, "BoolValue"

    const/16 v3, 0xf

    invoke-direct {v0, v1, v2, v3}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->BoolValue:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    invoke-static {}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->$values()[Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    move-result-object v0

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;-><init>(LQ0/d;)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->Companion:Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->value:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    .locals 1

    const-class v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;

    return-object v0
.end method


# virtual methods
.method public final getValue-w2LRezQ()B
    .locals 1

    iget-byte v0, p0, Lorg/luckypray/dexkit/query/enums/AnnotationEncodeValueType;->value:B

    return v0
.end method
