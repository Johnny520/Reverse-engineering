.class public final enum Lio/ktor/network/tls/extensions/PointFormat;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/ktor/network/tls/extensions/PointFormat;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lio/ktor/network/tls/extensions/PointFormat;",
        "",
        "",
        "code",
        "<init>",
        "(Ljava/lang/String;IB)V",
        "B",
        "getCode",
        "()B",
        "UNCOMPRESSED",
        "ANSIX962_COMPRESSED_PRIME",
        "ANSIX962_COMPRESSED_CHAR2",
        "ktor-network-tls"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Lio/ktor/network/tls/extensions/PointFormat;

.field public static final enum ANSIX962_COMPRESSED_CHAR2:Lio/ktor/network/tls/extensions/PointFormat;

.field public static final enum ANSIX962_COMPRESSED_PRIME:Lio/ktor/network/tls/extensions/PointFormat;

.field public static final enum UNCOMPRESSED:Lio/ktor/network/tls/extensions/PointFormat;


# instance fields
.field private final code:B


# direct methods
.method private static final synthetic $values()[Lio/ktor/network/tls/extensions/PointFormat;
    .locals 3

    .line 1
    sget-object v0, Lio/ktor/network/tls/extensions/PointFormat;->UNCOMPRESSED:Lio/ktor/network/tls/extensions/PointFormat;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/network/tls/extensions/PointFormat;->ANSIX962_COMPRESSED_PRIME:Lio/ktor/network/tls/extensions/PointFormat;

    .line 4
    .line 5
    sget-object v2, Lio/ktor/network/tls/extensions/PointFormat;->ANSIX962_COMPRESSED_CHAR2:Lio/ktor/network/tls/extensions/PointFormat;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lio/ktor/network/tls/extensions/PointFormat;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lio/ktor/network/tls/extensions/PointFormat;

    .line 2
    .line 3
    const-string v1, "UNCOMPRESSED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lio/ktor/network/tls/extensions/PointFormat;-><init>(Ljava/lang/String;IB)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/ktor/network/tls/extensions/PointFormat;->UNCOMPRESSED:Lio/ktor/network/tls/extensions/PointFormat;

    .line 10
    .line 11
    new-instance v0, Lio/ktor/network/tls/extensions/PointFormat;

    .line 12
    .line 13
    const-string v1, "ANSIX962_COMPRESSED_PRIME"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lio/ktor/network/tls/extensions/PointFormat;-><init>(Ljava/lang/String;IB)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/ktor/network/tls/extensions/PointFormat;->ANSIX962_COMPRESSED_PRIME:Lio/ktor/network/tls/extensions/PointFormat;

    .line 20
    .line 21
    new-instance v0, Lio/ktor/network/tls/extensions/PointFormat;

    .line 22
    .line 23
    const-string v1, "ANSIX962_COMPRESSED_CHAR2"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lio/ktor/network/tls/extensions/PointFormat;-><init>(Ljava/lang/String;IB)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lio/ktor/network/tls/extensions/PointFormat;->ANSIX962_COMPRESSED_CHAR2:Lio/ktor/network/tls/extensions/PointFormat;

    .line 30
    .line 31
    invoke-static {}, Lio/ktor/network/tls/extensions/PointFormat;->$values()[Lio/ktor/network/tls/extensions/PointFormat;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lio/ktor/network/tls/extensions/PointFormat;->$VALUES:[Lio/ktor/network/tls/extensions/PointFormat;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lio/ktor/network/tls/extensions/PointFormat;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, Lio/ktor/network/tls/extensions/PointFormat;->code:B

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    sget-object v0, Lio/ktor/network/tls/extensions/PointFormat;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/ktor/network/tls/extensions/PointFormat;
    .locals 1

    .line 1
    const-class v0, Lio/ktor/network/tls/extensions/PointFormat;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/ktor/network/tls/extensions/PointFormat;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/ktor/network/tls/extensions/PointFormat;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/extensions/PointFormat;->$VALUES:[Lio/ktor/network/tls/extensions/PointFormat;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/ktor/network/tls/extensions/PointFormat;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getCode()B
    .locals 0

    .line 1
    iget-byte p0, p0, Lio/ktor/network/tls/extensions/PointFormat;->code:B

    .line 2
    .line 3
    return p0
.end method
