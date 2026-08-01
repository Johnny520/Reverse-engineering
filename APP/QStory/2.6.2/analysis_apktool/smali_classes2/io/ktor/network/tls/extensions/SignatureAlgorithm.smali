.class public final enum Lio/ktor/network/tls/extensions/SignatureAlgorithm;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/ktor/network/tls/extensions/SignatureAlgorithm;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lio/ktor/network/tls/extensions/SignatureAlgorithm;",
        "",
        "",
        "code",
        "<init>",
        "(Ljava/lang/String;IB)V",
        "B",
        "getCode",
        "()B",
        "Companion",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u82cf\u5b50\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170",
        "ANON",
        "RSA",
        "DSA",
        "ECDSA",
        "ED25519",
        "ED448",
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

.field private static final synthetic $VALUES:[Lio/ktor/network/tls/extensions/SignatureAlgorithm;

.field public static final enum ANON:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

.field public static final Companion:L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世哲苏兰;

.field public static final enum DSA:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

.field public static final enum ECDSA:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

.field public static final enum ED25519:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

.field public static final enum ED448:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

.field public static final enum RSA:Lio/ktor/network/tls/extensions/SignatureAlgorithm;


# instance fields
.field private final code:B


# direct methods
.method private static final synthetic $values()[Lio/ktor/network/tls/extensions/SignatureAlgorithm;
    .locals 6

    .line 1
    sget-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->ANON:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->RSA:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 4
    .line 5
    sget-object v2, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->DSA:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 6
    .line 7
    sget-object v3, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->ECDSA:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 8
    .line 9
    sget-object v4, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->ED25519:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 10
    .line 11
    sget-object v5, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->ED448:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 2
    .line 3
    const-string v1, "ANON"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lio/ktor/network/tls/extensions/SignatureAlgorithm;-><init>(Ljava/lang/String;IB)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->ANON:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 10
    .line 11
    new-instance v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 12
    .line 13
    const-string v1, "RSA"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lio/ktor/network/tls/extensions/SignatureAlgorithm;-><init>(Ljava/lang/String;IB)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->RSA:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 20
    .line 21
    new-instance v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 22
    .line 23
    const-string v1, "DSA"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lio/ktor/network/tls/extensions/SignatureAlgorithm;-><init>(Ljava/lang/String;IB)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->DSA:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 30
    .line 31
    new-instance v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 32
    .line 33
    const-string v1, "ECDSA"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, Lio/ktor/network/tls/extensions/SignatureAlgorithm;-><init>(Ljava/lang/String;IB)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->ECDSA:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 40
    .line 41
    new-instance v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    const/4 v2, 0x7

    .line 45
    const-string v3, "ED25519"

    .line 46
    .line 47
    invoke-direct {v0, v3, v1, v2}, Lio/ktor/network/tls/extensions/SignatureAlgorithm;-><init>(Ljava/lang/String;IB)V

    .line 48
    .line 49
    .line 50
    sput-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->ED25519:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 51
    .line 52
    new-instance v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 53
    .line 54
    const/4 v1, 0x5

    .line 55
    const/16 v2, 0x8

    .line 56
    .line 57
    const-string v3, "ED448"

    .line 58
    .line 59
    invoke-direct {v0, v3, v1, v2}, Lio/ktor/network/tls/extensions/SignatureAlgorithm;-><init>(Ljava/lang/String;IB)V

    .line 60
    .line 61
    .line 62
    sput-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->ED448:Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 63
    .line 64
    invoke-static {}, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->$values()[Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->$VALUES:[Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 69
    .line 70
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 75
    .line 76
    new-instance v0, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世哲苏兰;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->Companion:L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世哲苏兰;

    .line 82
    .line 83
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
    iput-byte p3, p0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->code:B

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
    sget-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/ktor/network/tls/extensions/SignatureAlgorithm;
    .locals 1

    .line 1
    const-class v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/ktor/network/tls/extensions/SignatureAlgorithm;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->$VALUES:[Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/ktor/network/tls/extensions/SignatureAlgorithm;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getCode()B
    .locals 0

    .line 1
    iget-byte p0, p0, Lio/ktor/network/tls/extensions/SignatureAlgorithm;->code:B

    .line 2
    .line 3
    return p0
.end method
