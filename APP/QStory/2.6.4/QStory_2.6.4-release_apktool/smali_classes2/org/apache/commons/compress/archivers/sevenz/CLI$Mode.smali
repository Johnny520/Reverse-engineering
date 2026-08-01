.class abstract enum Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;

.field public static final enum LIST:Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;


# instance fields
.field private final message:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;->LIST:Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;

    .line 2
    .line 3
    filled-new-array {v0}, [Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode$1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "Analysing"

    .line 5
    .line 6
    const-string v3, "LIST"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode$1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;->LIST:Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;

    .line 12
    .line 13
    invoke-static {}, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;->$values()[Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;->$VALUES:[Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;

    .line 18
    .line 19
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;->message:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILjava/lang/String;Lorg/apache/commons/compress/archivers/sevenz/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;
    .locals 1

    .line 1
    const-class v0, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;->$VALUES:[Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/sevenz/CLI$Mode;->message:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract takeAction(Lorg/apache/commons/compress/archivers/sevenz/飘花落叶言子楪世兰哲苏;Lorg/apache/commons/compress/archivers/sevenz/飘花落叶言子楪世兰苏哲;)V
.end method
