.class public final enum Lio/ktor/network/tls/TLSHandshakeType;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/ktor/network/tls/TLSHandshakeType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/ktor/network/tls/TLSHandshakeType;",
        "",
        "",
        "code",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getCode",
        "()I",
        "Companion",
        "io/ktor/network/tls/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u5170\u4e16",
        "HelloRequest",
        "ClientHello",
        "ServerHello",
        "Certificate",
        "ServerKeyExchange",
        "CertificateRequest",
        "ServerDone",
        "CertificateVerify",
        "ClientKeyExchange",
        "Finished",
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

.field private static final synthetic $VALUES:[Lio/ktor/network/tls/TLSHandshakeType;

.field public static final enum Certificate:Lio/ktor/network/tls/TLSHandshakeType;

.field public static final enum CertificateRequest:Lio/ktor/network/tls/TLSHandshakeType;

.field public static final enum CertificateVerify:Lio/ktor/network/tls/TLSHandshakeType;

.field public static final enum ClientHello:Lio/ktor/network/tls/TLSHandshakeType;

.field public static final enum ClientKeyExchange:Lio/ktor/network/tls/TLSHandshakeType;

.field public static final Companion:Lio/ktor/network/tls/飘花落叶言子楪苏哲兰世;

.field public static final enum Finished:Lio/ktor/network/tls/TLSHandshakeType;

.field public static final enum HelloRequest:Lio/ktor/network/tls/TLSHandshakeType;

.field public static final enum ServerDone:Lio/ktor/network/tls/TLSHandshakeType;

.field public static final enum ServerHello:Lio/ktor/network/tls/TLSHandshakeType;

.field public static final enum ServerKeyExchange:Lio/ktor/network/tls/TLSHandshakeType;

.field private static final byCode:[Lio/ktor/network/tls/TLSHandshakeType;


# instance fields
.field private final code:I


# direct methods
.method private static final synthetic $values()[Lio/ktor/network/tls/TLSHandshakeType;
    .locals 10

    .line 1
    sget-object v0, Lio/ktor/network/tls/TLSHandshakeType;->HelloRequest:Lio/ktor/network/tls/TLSHandshakeType;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/network/tls/TLSHandshakeType;->ClientHello:Lio/ktor/network/tls/TLSHandshakeType;

    .line 4
    .line 5
    sget-object v2, Lio/ktor/network/tls/TLSHandshakeType;->ServerHello:Lio/ktor/network/tls/TLSHandshakeType;

    .line 6
    .line 7
    sget-object v3, Lio/ktor/network/tls/TLSHandshakeType;->Certificate:Lio/ktor/network/tls/TLSHandshakeType;

    .line 8
    .line 9
    sget-object v4, Lio/ktor/network/tls/TLSHandshakeType;->ServerKeyExchange:Lio/ktor/network/tls/TLSHandshakeType;

    .line 10
    .line 11
    sget-object v5, Lio/ktor/network/tls/TLSHandshakeType;->CertificateRequest:Lio/ktor/network/tls/TLSHandshakeType;

    .line 12
    .line 13
    sget-object v6, Lio/ktor/network/tls/TLSHandshakeType;->ServerDone:Lio/ktor/network/tls/TLSHandshakeType;

    .line 14
    .line 15
    sget-object v7, Lio/ktor/network/tls/TLSHandshakeType;->CertificateVerify:Lio/ktor/network/tls/TLSHandshakeType;

    .line 16
    .line 17
    sget-object v8, Lio/ktor/network/tls/TLSHandshakeType;->ClientKeyExchange:Lio/ktor/network/tls/TLSHandshakeType;

    .line 18
    .line 19
    sget-object v9, Lio/ktor/network/tls/TLSHandshakeType;->Finished:Lio/ktor/network/tls/TLSHandshakeType;

    .line 20
    .line 21
    filled-new-array/range {v0 .. v9}, [Lio/ktor/network/tls/TLSHandshakeType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 2
    .line 3
    const-string v1, "HelloRequest"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lio/ktor/network/tls/TLSHandshakeType;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->HelloRequest:Lio/ktor/network/tls/TLSHandshakeType;

    .line 10
    .line 11
    new-instance v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 12
    .line 13
    const-string v1, "ClientHello"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v0, v1, v3, v3}, Lio/ktor/network/tls/TLSHandshakeType;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->ClientHello:Lio/ktor/network/tls/TLSHandshakeType;

    .line 20
    .line 21
    new-instance v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 22
    .line 23
    const-string v1, "ServerHello"

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-direct {v0, v1, v3, v3}, Lio/ktor/network/tls/TLSHandshakeType;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->ServerHello:Lio/ktor/network/tls/TLSHandshakeType;

    .line 30
    .line 31
    new-instance v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    const/16 v3, 0xb

    .line 35
    .line 36
    const-string v4, "Certificate"

    .line 37
    .line 38
    invoke-direct {v0, v4, v1, v3}, Lio/ktor/network/tls/TLSHandshakeType;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->Certificate:Lio/ktor/network/tls/TLSHandshakeType;

    .line 42
    .line 43
    new-instance v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    const/16 v3, 0xc

    .line 47
    .line 48
    const-string v4, "ServerKeyExchange"

    .line 49
    .line 50
    invoke-direct {v0, v4, v1, v3}, Lio/ktor/network/tls/TLSHandshakeType;-><init>(Ljava/lang/String;II)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->ServerKeyExchange:Lio/ktor/network/tls/TLSHandshakeType;

    .line 54
    .line 55
    new-instance v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 56
    .line 57
    const/4 v1, 0x5

    .line 58
    const/16 v3, 0xd

    .line 59
    .line 60
    const-string v4, "CertificateRequest"

    .line 61
    .line 62
    invoke-direct {v0, v4, v1, v3}, Lio/ktor/network/tls/TLSHandshakeType;-><init>(Ljava/lang/String;II)V

    .line 63
    .line 64
    .line 65
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->CertificateRequest:Lio/ktor/network/tls/TLSHandshakeType;

    .line 66
    .line 67
    new-instance v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 68
    .line 69
    const/4 v1, 0x6

    .line 70
    const/16 v3, 0xe

    .line 71
    .line 72
    const-string v4, "ServerDone"

    .line 73
    .line 74
    invoke-direct {v0, v4, v1, v3}, Lio/ktor/network/tls/TLSHandshakeType;-><init>(Ljava/lang/String;II)V

    .line 75
    .line 76
    .line 77
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->ServerDone:Lio/ktor/network/tls/TLSHandshakeType;

    .line 78
    .line 79
    new-instance v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 80
    .line 81
    const/4 v1, 0x7

    .line 82
    const/16 v3, 0xf

    .line 83
    .line 84
    const-string v4, "CertificateVerify"

    .line 85
    .line 86
    invoke-direct {v0, v4, v1, v3}, Lio/ktor/network/tls/TLSHandshakeType;-><init>(Ljava/lang/String;II)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->CertificateVerify:Lio/ktor/network/tls/TLSHandshakeType;

    .line 90
    .line 91
    new-instance v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 92
    .line 93
    const/16 v1, 0x8

    .line 94
    .line 95
    const/16 v3, 0x10

    .line 96
    .line 97
    const-string v4, "ClientKeyExchange"

    .line 98
    .line 99
    invoke-direct {v0, v4, v1, v3}, Lio/ktor/network/tls/TLSHandshakeType;-><init>(Ljava/lang/String;II)V

    .line 100
    .line 101
    .line 102
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->ClientKeyExchange:Lio/ktor/network/tls/TLSHandshakeType;

    .line 103
    .line 104
    new-instance v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 105
    .line 106
    const/16 v1, 0x9

    .line 107
    .line 108
    const/16 v3, 0x14

    .line 109
    .line 110
    const-string v4, "Finished"

    .line 111
    .line 112
    invoke-direct {v0, v4, v1, v3}, Lio/ktor/network/tls/TLSHandshakeType;-><init>(Ljava/lang/String;II)V

    .line 113
    .line 114
    .line 115
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->Finished:Lio/ktor/network/tls/TLSHandshakeType;

    .line 116
    .line 117
    invoke-static {}, Lio/ktor/network/tls/TLSHandshakeType;->$values()[Lio/ktor/network/tls/TLSHandshakeType;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->$VALUES:[Lio/ktor/network/tls/TLSHandshakeType;

    .line 122
    .line 123
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 128
    .line 129
    new-instance v0, Lio/ktor/network/tls/飘花落叶言子楪苏哲兰世;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 132
    .line 133
    .line 134
    sput-object v0, Lio/ktor/network/tls/TLSHandshakeType;->Companion:Lio/ktor/network/tls/飘花落叶言子楪苏哲兰世;

    .line 135
    .line 136
    const/16 v0, 0x100

    .line 137
    .line 138
    new-array v1, v0, [Lio/ktor/network/tls/TLSHandshakeType;

    .line 139
    .line 140
    :goto_0
    if-ge v2, v0, :cond_2

    .line 141
    .line 142
    invoke-static {}, Lio/ktor/network/tls/TLSHandshakeType;->getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-eqz v4, :cond_1

    .line 155
    .line 156
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    move-object v5, v4

    .line 161
    check-cast v5, Lio/ktor/network/tls/TLSHandshakeType;

    .line 162
    .line 163
    iget v5, v5, Lio/ktor/network/tls/TLSHandshakeType;->code:I

    .line 164
    .line 165
    if-ne v5, v2, :cond_0

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_1
    const/4 v4, 0x0

    .line 169
    :goto_1
    aput-object v4, v1, v2

    .line 170
    .line 171
    add-int/lit8 v2, v2, 0x1

    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_2
    sput-object v1, Lio/ktor/network/tls/TLSHandshakeType;->byCode:[Lio/ktor/network/tls/TLSHandshakeType;

    .line 175
    .line 176
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
    iput p3, p0, Lio/ktor/network/tls/TLSHandshakeType;->code:I

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getByCode$cp()[Lio/ktor/network/tls/TLSHandshakeType;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/TLSHandshakeType;->byCode:[Lio/ktor/network/tls/TLSHandshakeType;

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
    sget-object v0, Lio/ktor/network/tls/TLSHandshakeType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/ktor/network/tls/TLSHandshakeType;
    .locals 1

    .line 1
    const-class v0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/ktor/network/tls/TLSHandshakeType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/ktor/network/tls/TLSHandshakeType;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/TLSHandshakeType;->$VALUES:[Lio/ktor/network/tls/TLSHandshakeType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/ktor/network/tls/TLSHandshakeType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 0

    .line 1
    iget p0, p0, Lio/ktor/network/tls/TLSHandshakeType;->code:I

    .line 2
    .line 3
    return p0
.end method
