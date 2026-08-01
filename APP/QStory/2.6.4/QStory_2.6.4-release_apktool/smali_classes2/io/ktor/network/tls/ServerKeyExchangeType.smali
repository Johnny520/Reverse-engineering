.class public final enum Lio/ktor/network/tls/ServerKeyExchangeType;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/ktor/network/tls/ServerKeyExchangeType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/ktor/network/tls/ServerKeyExchangeType;",
        "",
        "",
        "code",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getCode",
        "()I",
        "Companion",
        "io/ktor/network/tls/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u5170\u82cf",
        "ExplicitPrime",
        "ExplicitChar",
        "NamedCurve",
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

.field private static final synthetic $VALUES:[Lio/ktor/network/tls/ServerKeyExchangeType;

.field public static final Companion:Lio/ktor/network/tls/飘花落叶言子楪世哲兰苏;

.field public static final enum ExplicitChar:Lio/ktor/network/tls/ServerKeyExchangeType;

.field public static final enum ExplicitPrime:Lio/ktor/network/tls/ServerKeyExchangeType;

.field public static final enum NamedCurve:Lio/ktor/network/tls/ServerKeyExchangeType;

.field private static final byCode:[Lio/ktor/network/tls/ServerKeyExchangeType;


# instance fields
.field private final code:I


# direct methods
.method private static final synthetic $values()[Lio/ktor/network/tls/ServerKeyExchangeType;
    .locals 3

    .line 1
    sget-object v0, Lio/ktor/network/tls/ServerKeyExchangeType;->ExplicitPrime:Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/network/tls/ServerKeyExchangeType;->ExplicitChar:Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 4
    .line 5
    sget-object v2, Lio/ktor/network/tls/ServerKeyExchangeType;->NamedCurve:Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 2
    .line 3
    const-string v1, "ExplicitPrime"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lio/ktor/network/tls/ServerKeyExchangeType;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lio/ktor/network/tls/ServerKeyExchangeType;->ExplicitPrime:Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 11
    .line 12
    new-instance v0, Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 13
    .line 14
    const-string v1, "ExplicitChar"

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v0, v1, v3, v4}, Lio/ktor/network/tls/ServerKeyExchangeType;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lio/ktor/network/tls/ServerKeyExchangeType;->ExplicitChar:Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 21
    .line 22
    new-instance v0, Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 23
    .line 24
    const-string v1, "NamedCurve"

    .line 25
    .line 26
    const/4 v3, 0x3

    .line 27
    invoke-direct {v0, v1, v4, v3}, Lio/ktor/network/tls/ServerKeyExchangeType;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lio/ktor/network/tls/ServerKeyExchangeType;->NamedCurve:Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 31
    .line 32
    invoke-static {}, Lio/ktor/network/tls/ServerKeyExchangeType;->$values()[Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, Lio/ktor/network/tls/ServerKeyExchangeType;->$VALUES:[Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 37
    .line 38
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    sput-object v0, Lio/ktor/network/tls/ServerKeyExchangeType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 43
    .line 44
    new-instance v0, Lio/ktor/network/tls/飘花落叶言子楪世哲兰苏;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lio/ktor/network/tls/ServerKeyExchangeType;->Companion:Lio/ktor/network/tls/飘花落叶言子楪世哲兰苏;

    .line 50
    .line 51
    const/16 v0, 0x100

    .line 52
    .line 53
    new-array v1, v0, [Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 54
    .line 55
    :goto_0
    if-ge v2, v0, :cond_2

    .line 56
    .line 57
    invoke-static {}, Lio/ktor/network/tls/ServerKeyExchangeType;->getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_1

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    move-object v5, v4

    .line 76
    check-cast v5, Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 77
    .line 78
    iget v5, v5, Lio/ktor/network/tls/ServerKeyExchangeType;->code:I

    .line 79
    .line 80
    if-ne v5, v2, :cond_0

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    const/4 v4, 0x0

    .line 84
    :goto_1
    aput-object v4, v1, v2

    .line 85
    .line 86
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    sput-object v1, Lio/ktor/network/tls/ServerKeyExchangeType;->byCode:[Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 90
    .line 91
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
    iput p3, p0, Lio/ktor/network/tls/ServerKeyExchangeType;->code:I

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getByCode$cp()[Lio/ktor/network/tls/ServerKeyExchangeType;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/ServerKeyExchangeType;->byCode:[Lio/ktor/network/tls/ServerKeyExchangeType;

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
    sget-object v0, Lio/ktor/network/tls/ServerKeyExchangeType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/ktor/network/tls/ServerKeyExchangeType;
    .locals 1

    .line 1
    const-class v0, Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/ktor/network/tls/ServerKeyExchangeType;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/ServerKeyExchangeType;->$VALUES:[Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/ktor/network/tls/ServerKeyExchangeType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 0

    .line 1
    iget p0, p0, Lio/ktor/network/tls/ServerKeyExchangeType;->code:I

    .line 2
    .line 3
    return p0
.end method
