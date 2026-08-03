.class public final enum Lorg/luckypray/dexkit/query/enums/TargetElementType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/luckypray/dexkit/query/enums/TargetElementType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/luckypray/dexkit/query/enums/TargetElementType;

.field public static final enum AnnotationType:Lorg/luckypray/dexkit/query/enums/TargetElementType;

.field public static final enum Constructor:Lorg/luckypray/dexkit/query/enums/TargetElementType;

.field public static final enum Field:Lorg/luckypray/dexkit/query/enums/TargetElementType;

.field public static final enum LocalVariable:Lorg/luckypray/dexkit/query/enums/TargetElementType;

.field public static final enum Method:Lorg/luckypray/dexkit/query/enums/TargetElementType;

.field public static final enum Package:Lorg/luckypray/dexkit/query/enums/TargetElementType;

.field public static final enum Parameter:Lorg/luckypray/dexkit/query/enums/TargetElementType;

.field public static final enum Type:Lorg/luckypray/dexkit/query/enums/TargetElementType;

.field public static final enum TypeParameter:Lorg/luckypray/dexkit/query/enums/TargetElementType;

.field public static final enum TypeUse:Lorg/luckypray/dexkit/query/enums/TargetElementType;


# instance fields
.field private final value:B


# direct methods
.method private static final synthetic $values()[Lorg/luckypray/dexkit/query/enums/TargetElementType;
    .locals 10

    sget-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Type:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    sget-object v1, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Field:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    sget-object v2, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Method:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    sget-object v3, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Parameter:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    sget-object v4, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Constructor:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    sget-object v5, Lorg/luckypray/dexkit/query/enums/TargetElementType;->LocalVariable:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    sget-object v6, Lorg/luckypray/dexkit/query/enums/TargetElementType;->AnnotationType:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    sget-object v7, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Package:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    sget-object v8, Lorg/luckypray/dexkit/query/enums/TargetElementType;->TypeParameter:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    sget-object v9, Lorg/luckypray/dexkit/query/enums/TargetElementType;->TypeUse:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    filled-new-array/range {v0 .. v9}, [Lorg/luckypray/dexkit/query/enums/TargetElementType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v1, "Type"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/TargetElementType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Type:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v1, "Field"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/TargetElementType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Field:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v1, "Method"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/TargetElementType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Method:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v1, "Parameter"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/TargetElementType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Parameter:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v1, "Constructor"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/TargetElementType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Constructor:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v1, "LocalVariable"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/TargetElementType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->LocalVariable:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v1, "AnnotationType"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/TargetElementType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->AnnotationType:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v1, "Package"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/TargetElementType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->Package:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v1, "TypeParameter"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/TargetElementType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->TypeParameter:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    new-instance v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    const-string v1, "TypeUse"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2, v2}, Lorg/luckypray/dexkit/query/enums/TargetElementType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->TypeUse:Lorg/luckypray/dexkit/query/enums/TargetElementType;

    invoke-static {}, Lorg/luckypray/dexkit/query/enums/TargetElementType;->$values()[Lorg/luckypray/dexkit/query/enums/TargetElementType;

    move-result-object v0

    sput-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/TargetElementType;

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

    iput-byte p3, p0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->value:B

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/luckypray/dexkit/query/enums/TargetElementType;
    .locals 1

    const-class v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/luckypray/dexkit/query/enums/TargetElementType;

    return-object p0
.end method

.method public static values()[Lorg/luckypray/dexkit/query/enums/TargetElementType;
    .locals 1

    sget-object v0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->$VALUES:[Lorg/luckypray/dexkit/query/enums/TargetElementType;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/luckypray/dexkit/query/enums/TargetElementType;

    return-object v0
.end method


# virtual methods
.method public final getValue()B
    .locals 1

    iget-byte v0, p0, Lorg/luckypray/dexkit/query/enums/TargetElementType;->value:B

    return v0
.end method
