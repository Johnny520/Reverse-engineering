.class public final enum Lio/ktor/network/tls/TLSVersion;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/ktor/network/tls/TLSVersion;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/ktor/network/tls/TLSVersion;",
        "",
        "",
        "code",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getCode",
        "()I",
        "Companion",
        "io/ktor/network/tls/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u4e16\u5170",
        "SSL3",
        "TLS10",
        "TLS11",
        "TLS12",
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

.field private static final synthetic $VALUES:[Lio/ktor/network/tls/TLSVersion;

.field public static final Companion:Lio/ktor/network/tls/飘花落叶言子楪哲苏世兰;

.field public static final enum SSL3:Lio/ktor/network/tls/TLSVersion;

.field public static final enum TLS10:Lio/ktor/network/tls/TLSVersion;

.field public static final enum TLS11:Lio/ktor/network/tls/TLSVersion;

.field public static final enum TLS12:Lio/ktor/network/tls/TLSVersion;

.field private static final byOrdinal:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/ktor/network/tls/TLSVersion;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final code:I


# direct methods
.method private static final synthetic $values()[Lio/ktor/network/tls/TLSVersion;
    .locals 4

    .line 1
    sget-object v0, Lio/ktor/network/tls/TLSVersion;->SSL3:Lio/ktor/network/tls/TLSVersion;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/network/tls/TLSVersion;->TLS10:Lio/ktor/network/tls/TLSVersion;

    .line 4
    .line 5
    sget-object v2, Lio/ktor/network/tls/TLSVersion;->TLS11:Lio/ktor/network/tls/TLSVersion;

    .line 6
    .line 7
    sget-object v3, Lio/ktor/network/tls/TLSVersion;->TLS12:Lio/ktor/network/tls/TLSVersion;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lio/ktor/network/tls/TLSVersion;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lio/ktor/network/tls/TLSVersion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x300

    .line 5
    .line 6
    const-string v3, "SSL3"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lio/ktor/network/tls/TLSVersion;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lio/ktor/network/tls/TLSVersion;->SSL3:Lio/ktor/network/tls/TLSVersion;

    .line 12
    .line 13
    new-instance v0, Lio/ktor/network/tls/TLSVersion;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/16 v2, 0x301

    .line 17
    .line 18
    const-string v3, "TLS10"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lio/ktor/network/tls/TLSVersion;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lio/ktor/network/tls/TLSVersion;->TLS10:Lio/ktor/network/tls/TLSVersion;

    .line 24
    .line 25
    new-instance v0, Lio/ktor/network/tls/TLSVersion;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const/16 v2, 0x302

    .line 29
    .line 30
    const-string v3, "TLS11"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lio/ktor/network/tls/TLSVersion;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lio/ktor/network/tls/TLSVersion;->TLS11:Lio/ktor/network/tls/TLSVersion;

    .line 36
    .line 37
    new-instance v0, Lio/ktor/network/tls/TLSVersion;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const/16 v2, 0x303

    .line 41
    .line 42
    const-string v3, "TLS12"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lio/ktor/network/tls/TLSVersion;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lio/ktor/network/tls/TLSVersion;->TLS12:Lio/ktor/network/tls/TLSVersion;

    .line 48
    .line 49
    invoke-static {}, Lio/ktor/network/tls/TLSVersion;->$values()[Lio/ktor/network/tls/TLSVersion;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lio/ktor/network/tls/TLSVersion;->$VALUES:[Lio/ktor/network/tls/TLSVersion;

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lio/ktor/network/tls/TLSVersion;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 60
    .line 61
    new-instance v0, Lio/ktor/network/tls/飘花落叶言子楪哲苏世兰;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lio/ktor/network/tls/TLSVersion;->Companion:Lio/ktor/network/tls/飘花落叶言子楪哲苏世兰;

    .line 67
    .line 68
    invoke-static {}, Lio/ktor/network/tls/TLSVersion;->getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sput-object v0, Lio/ktor/network/tls/TLSVersion;->byOrdinal:Ljava/util/List;

    .line 73
    .line 74
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lio/ktor/network/tls/TLSVersion;->code:I

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getByOrdinal$cp()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/TLSVersion;->byOrdinal:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
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
    sget-object v0, Lio/ktor/network/tls/TLSVersion;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/ktor/network/tls/TLSVersion;
    .locals 1

    .line 1
    const-class v0, Lio/ktor/network/tls/TLSVersion;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/ktor/network/tls/TLSVersion;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/ktor/network/tls/TLSVersion;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/TLSVersion;->$VALUES:[Lio/ktor/network/tls/TLSVersion;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/ktor/network/tls/TLSVersion;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 0

    .line 1
    iget p0, p0, Lio/ktor/network/tls/TLSVersion;->code:I

    .line 2
    .line 3
    return p0
.end method
