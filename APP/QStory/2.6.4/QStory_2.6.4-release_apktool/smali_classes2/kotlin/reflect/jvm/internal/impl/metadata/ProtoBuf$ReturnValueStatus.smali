.class public final enum Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰世苏;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;",
        ">;",
        "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

.field public static final enum EXPLICITLY_IGNORABLE:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

.field public static final enum MUST_USE:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

.field public static final enum UNSPECIFIED:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

.field private static internalValueMap:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰苏世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/reflect/jvm/internal/impl/protobuf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u82cf\u4e16;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 2
    .line 3
    const-string v1, "UNSPECIFIED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2, v2}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;-><init>(Ljava/lang/String;III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->UNSPECIFIED:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 10
    .line 11
    new-instance v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 12
    .line 13
    const-string v2, "MUST_USE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3, v3}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;-><init>(Ljava/lang/String;III)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->MUST_USE:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 20
    .line 21
    new-instance v2, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 22
    .line 23
    const-string v3, "EXPLICITLY_IGNORABLE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4, v4}, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;-><init>(Ljava/lang/String;III)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->EXPLICITLY_IGNORABLE:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 36
    .line 37
    new-instance v0, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 38
    .line 39
    const/4 v1, 0x2

    .line 40
    invoke-direct {v0, v1}, L飘花落叶言世子楪哲苏兰/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->internalValueMap:Lkotlin/reflect/jvm/internal/impl/protobuf/飘花落叶言子楪哲兰苏世;

    .line 44
    .line 45
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(I)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;
    .locals 1

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p0, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p0, v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->EXPLICITLY_IGNORABLE:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->MUST_USE:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_2
    sget-object p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->UNSPECIFIED:Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 18
    .line 19
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;
    .locals 1

    .line 20
    const-class v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 0

    .line 1
    iget p0, p0, Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$ReturnValueStatus;->value:I

    .line 2
    .line 3
    return p0
.end method
