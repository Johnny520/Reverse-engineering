.class public abstract enum Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

.field public static final enum IN_MEMORY:Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

.field public static final enum TEMP_FILE:Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;


# direct methods
.method private static synthetic $values()[Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;
    .locals 2

    .line 1
    sget-object v0, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;->IN_MEMORY:Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;->TEMP_FILE:Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy$1;

    .line 2
    .line 3
    const-string v1, "IN_MEMORY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;->IN_MEMORY:Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 10
    .line 11
    new-instance v0, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy$2;

    .line 12
    .line 13
    const-string v1, "TEMP_FILE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;->TEMP_FILE:Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 20
    .line 21
    invoke-static {}, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;->$values()[Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;->$VALUES:[Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILorg/apache/commons/compress/compressors/pack200/Pack200Strategy$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;->$VALUES:[Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/commons/compress/compressors/pack200/Pack200Strategy;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract newStreamBridge()Lorg/apache/commons/compress/compressors/pack200/飘花落叶言子楪世苏哲兰;
.end method
