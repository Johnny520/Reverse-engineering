.class public final enum Lio/ktor/network/tls/TLSRecordType;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/ktor/network/tls/TLSRecordType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/ktor/network/tls/TLSRecordType;",
        "",
        "",
        "code",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getCode",
        "()I",
        "Companion",
        "io/ktor/network/tls/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16",
        "ChangeCipherSpec",
        "Alert",
        "Handshake",
        "ApplicationData",
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

.field private static final synthetic $VALUES:[Lio/ktor/network/tls/TLSRecordType;

.field public static final enum Alert:Lio/ktor/network/tls/TLSRecordType;

.field public static final enum ApplicationData:Lio/ktor/network/tls/TLSRecordType;

.field public static final enum ChangeCipherSpec:Lio/ktor/network/tls/TLSRecordType;

.field public static final Companion:Lio/ktor/network/tls/飘花落叶言子楪苏兰哲世;

.field public static final enum Handshake:Lio/ktor/network/tls/TLSRecordType;

.field private static final byCode:[Lio/ktor/network/tls/TLSRecordType;


# instance fields
.field private final code:I


# direct methods
.method private static final synthetic $values()[Lio/ktor/network/tls/TLSRecordType;
    .locals 4

    .line 1
    sget-object v0, Lio/ktor/network/tls/TLSRecordType;->ChangeCipherSpec:Lio/ktor/network/tls/TLSRecordType;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/network/tls/TLSRecordType;->Alert:Lio/ktor/network/tls/TLSRecordType;

    .line 4
    .line 5
    sget-object v2, Lio/ktor/network/tls/TLSRecordType;->Handshake:Lio/ktor/network/tls/TLSRecordType;

    .line 6
    .line 7
    sget-object v3, Lio/ktor/network/tls/TLSRecordType;->ApplicationData:Lio/ktor/network/tls/TLSRecordType;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lio/ktor/network/tls/TLSRecordType;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lio/ktor/network/tls/TLSRecordType;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    const-string v2, "ChangeCipherSpec"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v0, v2, v3, v1}, Lio/ktor/network/tls/TLSRecordType;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lio/ktor/network/tls/TLSRecordType;->ChangeCipherSpec:Lio/ktor/network/tls/TLSRecordType;

    .line 12
    .line 13
    new-instance v0, Lio/ktor/network/tls/TLSRecordType;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/16 v2, 0x15

    .line 17
    .line 18
    const-string v4, "Alert"

    .line 19
    .line 20
    invoke-direct {v0, v4, v1, v2}, Lio/ktor/network/tls/TLSRecordType;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lio/ktor/network/tls/TLSRecordType;->Alert:Lio/ktor/network/tls/TLSRecordType;

    .line 24
    .line 25
    new-instance v0, Lio/ktor/network/tls/TLSRecordType;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const/16 v2, 0x16

    .line 29
    .line 30
    const-string v4, "Handshake"

    .line 31
    .line 32
    invoke-direct {v0, v4, v1, v2}, Lio/ktor/network/tls/TLSRecordType;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lio/ktor/network/tls/TLSRecordType;->Handshake:Lio/ktor/network/tls/TLSRecordType;

    .line 36
    .line 37
    new-instance v0, Lio/ktor/network/tls/TLSRecordType;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const/16 v2, 0x17

    .line 41
    .line 42
    const-string v4, "ApplicationData"

    .line 43
    .line 44
    invoke-direct {v0, v4, v1, v2}, Lio/ktor/network/tls/TLSRecordType;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lio/ktor/network/tls/TLSRecordType;->ApplicationData:Lio/ktor/network/tls/TLSRecordType;

    .line 48
    .line 49
    invoke-static {}, Lio/ktor/network/tls/TLSRecordType;->$values()[Lio/ktor/network/tls/TLSRecordType;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lio/ktor/network/tls/TLSRecordType;->$VALUES:[Lio/ktor/network/tls/TLSRecordType;

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lio/ktor/network/tls/TLSRecordType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 60
    .line 61
    new-instance v0, Lio/ktor/network/tls/飘花落叶言子楪苏兰哲世;

    .line 62
    .line 63
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lio/ktor/network/tls/TLSRecordType;->Companion:Lio/ktor/network/tls/飘花落叶言子楪苏兰哲世;

    .line 67
    .line 68
    const/16 v0, 0x100

    .line 69
    .line 70
    new-array v1, v0, [Lio/ktor/network/tls/TLSRecordType;

    .line 71
    .line 72
    :goto_0
    if-ge v3, v0, :cond_2

    .line 73
    .line 74
    invoke-static {}, Lio/ktor/network/tls/TLSRecordType;->getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_1

    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    move-object v5, v4

    .line 93
    check-cast v5, Lio/ktor/network/tls/TLSRecordType;

    .line 94
    .line 95
    iget v5, v5, Lio/ktor/network/tls/TLSRecordType;->code:I

    .line 96
    .line 97
    if-ne v5, v3, :cond_0

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    const/4 v4, 0x0

    .line 101
    :goto_1
    aput-object v4, v1, v3

    .line 102
    .line 103
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_2
    sput-object v1, Lio/ktor/network/tls/TLSRecordType;->byCode:[Lio/ktor/network/tls/TLSRecordType;

    .line 107
    .line 108
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
    iput p3, p0, Lio/ktor/network/tls/TLSRecordType;->code:I

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getByCode$cp()[Lio/ktor/network/tls/TLSRecordType;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/TLSRecordType;->byCode:[Lio/ktor/network/tls/TLSRecordType;

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
    sget-object v0, Lio/ktor/network/tls/TLSRecordType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/ktor/network/tls/TLSRecordType;
    .locals 1

    .line 1
    const-class v0, Lio/ktor/network/tls/TLSRecordType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/ktor/network/tls/TLSRecordType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/ktor/network/tls/TLSRecordType;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/TLSRecordType;->$VALUES:[Lio/ktor/network/tls/TLSRecordType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/ktor/network/tls/TLSRecordType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 0

    .line 1
    iget p0, p0, Lio/ktor/network/tls/TLSRecordType;->code:I

    .line 2
    .line 3
    return p0
.end method
