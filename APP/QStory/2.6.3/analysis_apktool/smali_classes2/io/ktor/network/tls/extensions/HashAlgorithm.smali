.class public final enum Lio/ktor/network/tls/extensions/HashAlgorithm;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/ktor/network/tls/extensions/HashAlgorithm;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0016\u0008\u0086\u0081\u0002\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B!\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u000c\u001a\u0004\u0008\u000f\u0010\u000ej\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017j\u0002\u0008\u0018j\u0002\u0008\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/ktor/network/tls/extensions/HashAlgorithm;",
        "",
        "",
        "code",
        "",
        "openSSLName",
        "macName",
        "<init>",
        "(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V",
        "B",
        "getCode",
        "()B",
        "Ljava/lang/String;",
        "getOpenSSLName",
        "()Ljava/lang/String;",
        "getMacName",
        "Companion",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u82cf\u5b50\u4e16\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170",
        "NONE",
        "MD5",
        "SHA1",
        "SHA224",
        "SHA256",
        "SHA384",
        "SHA512",
        "INTRINSIC",
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

.field private static final synthetic $VALUES:[Lio/ktor/network/tls/extensions/HashAlgorithm;

.field public static final Companion:L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏哲兰;

.field public static final enum INTRINSIC:Lio/ktor/network/tls/extensions/HashAlgorithm;

.field public static final enum MD5:Lio/ktor/network/tls/extensions/HashAlgorithm;

.field public static final enum NONE:Lio/ktor/network/tls/extensions/HashAlgorithm;

.field public static final enum SHA1:Lio/ktor/network/tls/extensions/HashAlgorithm;

.field public static final enum SHA224:Lio/ktor/network/tls/extensions/HashAlgorithm;

.field public static final enum SHA256:Lio/ktor/network/tls/extensions/HashAlgorithm;

.field public static final enum SHA384:Lio/ktor/network/tls/extensions/HashAlgorithm;

.field public static final enum SHA512:Lio/ktor/network/tls/extensions/HashAlgorithm;


# instance fields
.field private final code:B

.field private final macName:Ljava/lang/String;

.field private final openSSLName:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lio/ktor/network/tls/extensions/HashAlgorithm;
    .locals 8

    .line 1
    sget-object v0, Lio/ktor/network/tls/extensions/HashAlgorithm;->NONE:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/network/tls/extensions/HashAlgorithm;->MD5:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 4
    .line 5
    sget-object v2, Lio/ktor/network/tls/extensions/HashAlgorithm;->SHA1:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 6
    .line 7
    sget-object v3, Lio/ktor/network/tls/extensions/HashAlgorithm;->SHA224:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 8
    .line 9
    sget-object v4, Lio/ktor/network/tls/extensions/HashAlgorithm;->SHA256:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 10
    .line 11
    sget-object v5, Lio/ktor/network/tls/extensions/HashAlgorithm;->SHA384:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 12
    .line 13
    sget-object v6, Lio/ktor/network/tls/extensions/HashAlgorithm;->SHA512:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 14
    .line 15
    sget-object v7, Lio/ktor/network/tls/extensions/HashAlgorithm;->INTRINSIC:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 2
    .line 3
    const-string v4, ""

    .line 4
    .line 5
    const-string v5, ""

    .line 6
    .line 7
    const-string v1, "NONE"

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct/range {v0 .. v5}, Lio/ktor/network/tls/extensions/HashAlgorithm;-><init>(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lio/ktor/network/tls/extensions/HashAlgorithm;->NONE:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 15
    .line 16
    new-instance v1, Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 17
    .line 18
    const-string v5, "MD5"

    .line 19
    .line 20
    const-string v6, "HmacMD5"

    .line 21
    .line 22
    const-string v2, "MD5"

    .line 23
    .line 24
    const/4 v3, 0x1

    .line 25
    const/4 v4, 0x1

    .line 26
    invoke-direct/range {v1 .. v6}, Lio/ktor/network/tls/extensions/HashAlgorithm;-><init>(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Lio/ktor/network/tls/extensions/HashAlgorithm;->MD5:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 30
    .line 31
    new-instance v2, Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 32
    .line 33
    const-string v6, "SHA-1"

    .line 34
    .line 35
    const-string v7, "HmacSHA1"

    .line 36
    .line 37
    const-string v3, "SHA1"

    .line 38
    .line 39
    const/4 v4, 0x2

    .line 40
    const/4 v5, 0x2

    .line 41
    invoke-direct/range {v2 .. v7}, Lio/ktor/network/tls/extensions/HashAlgorithm;-><init>(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v2, Lio/ktor/network/tls/extensions/HashAlgorithm;->SHA1:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 45
    .line 46
    new-instance v3, Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 47
    .line 48
    const-string v7, "SHA-224"

    .line 49
    .line 50
    const-string v8, "HmacSHA224"

    .line 51
    .line 52
    const-string v4, "SHA224"

    .line 53
    .line 54
    const/4 v5, 0x3

    .line 55
    const/4 v6, 0x3

    .line 56
    invoke-direct/range {v3 .. v8}, Lio/ktor/network/tls/extensions/HashAlgorithm;-><init>(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v3, Lio/ktor/network/tls/extensions/HashAlgorithm;->SHA224:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 60
    .line 61
    new-instance v4, Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 62
    .line 63
    const-string v8, "SHA-256"

    .line 64
    .line 65
    const-string v9, "HmacSHA256"

    .line 66
    .line 67
    const-string v5, "SHA256"

    .line 68
    .line 69
    const/4 v6, 0x4

    .line 70
    const/4 v7, 0x4

    .line 71
    invoke-direct/range {v4 .. v9}, Lio/ktor/network/tls/extensions/HashAlgorithm;-><init>(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    sput-object v4, Lio/ktor/network/tls/extensions/HashAlgorithm;->SHA256:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 75
    .line 76
    new-instance v5, Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 77
    .line 78
    const-string v9, "SHA-384"

    .line 79
    .line 80
    const-string v10, "HmacSHA384"

    .line 81
    .line 82
    const-string v6, "SHA384"

    .line 83
    .line 84
    const/4 v7, 0x5

    .line 85
    const/4 v8, 0x5

    .line 86
    invoke-direct/range {v5 .. v10}, Lio/ktor/network/tls/extensions/HashAlgorithm;-><init>(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    sput-object v5, Lio/ktor/network/tls/extensions/HashAlgorithm;->SHA384:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 90
    .line 91
    new-instance v6, Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 92
    .line 93
    const-string v10, "SHA-512"

    .line 94
    .line 95
    const-string v11, "HmacSHA512"

    .line 96
    .line 97
    const-string v7, "SHA512"

    .line 98
    .line 99
    const/4 v8, 0x6

    .line 100
    const/4 v9, 0x6

    .line 101
    invoke-direct/range {v6 .. v11}, Lio/ktor/network/tls/extensions/HashAlgorithm;-><init>(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sput-object v6, Lio/ktor/network/tls/extensions/HashAlgorithm;->SHA512:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 105
    .line 106
    new-instance v0, Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 107
    .line 108
    const-string v4, "INTRINSIC"

    .line 109
    .line 110
    const-string v5, "Intrinsic"

    .line 111
    .line 112
    const-string v1, "INTRINSIC"

    .line 113
    .line 114
    const/4 v2, 0x7

    .line 115
    const/16 v3, 0x8

    .line 116
    .line 117
    invoke-direct/range {v0 .. v5}, Lio/ktor/network/tls/extensions/HashAlgorithm;-><init>(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    sput-object v0, Lio/ktor/network/tls/extensions/HashAlgorithm;->INTRINSIC:Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 121
    .line 122
    invoke-static {}, Lio/ktor/network/tls/extensions/HashAlgorithm;->$values()[Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    sput-object v0, Lio/ktor/network/tls/extensions/HashAlgorithm;->$VALUES:[Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 127
    .line 128
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sput-object v0, Lio/ktor/network/tls/extensions/HashAlgorithm;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 133
    .line 134
    new-instance v0, L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏哲兰;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 137
    .line 138
    .line 139
    sput-object v0, Lio/ktor/network/tls/extensions/HashAlgorithm;->Companion:L飘花落叶言楪兰苏子世哲/飘花落叶言子楪世苏哲兰;

    .line 140
    .line 141
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IBLjava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, Lio/ktor/network/tls/extensions/HashAlgorithm;->code:B

    .line 5
    .line 6
    iput-object p4, p0, Lio/ktor/network/tls/extensions/HashAlgorithm;->openSSLName:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p5, p0, Lio/ktor/network/tls/extensions/HashAlgorithm;->macName:Ljava/lang/String;

    .line 9
    .line 10
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
    sget-object v0, Lio/ktor/network/tls/extensions/HashAlgorithm;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/ktor/network/tls/extensions/HashAlgorithm;
    .locals 1

    .line 1
    const-class v0, Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/ktor/network/tls/extensions/HashAlgorithm;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/tls/extensions/HashAlgorithm;->$VALUES:[Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/ktor/network/tls/extensions/HashAlgorithm;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getCode()B
    .locals 0

    .line 1
    iget-byte p0, p0, Lio/ktor/network/tls/extensions/HashAlgorithm;->code:B

    .line 2
    .line 3
    return p0
.end method

.method public final getMacName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/tls/extensions/HashAlgorithm;->macName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getOpenSSLName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/network/tls/extensions/HashAlgorithm;->openSSLName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
