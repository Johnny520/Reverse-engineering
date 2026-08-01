.class public final enum Lio/ktor/network/selector/SelectInterest;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/ktor/network/selector/SelectInterest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/ktor/network/selector/SelectInterest;",
        "",
        "",
        "flag",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getFlag",
        "()I",
        "Companion",
        "io/ktor/network/selector/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u5170\u54f2",
        "READ",
        "WRITE",
        "ACCEPT",
        "CONNECT",
        "ktor-network"
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

.field private static final synthetic $VALUES:[Lio/ktor/network/selector/SelectInterest;

.field public static final enum ACCEPT:Lio/ktor/network/selector/SelectInterest;

.field private static final AllInterests:[Lio/ktor/network/selector/SelectInterest;

.field public static final enum CONNECT:Lio/ktor/network/selector/SelectInterest;

.field public static final Companion:Lio/ktor/network/selector/飘花落叶言子楪苏世兰哲;

.field public static final enum READ:Lio/ktor/network/selector/SelectInterest;

.field public static final enum WRITE:Lio/ktor/network/selector/SelectInterest;

.field private static final flags:[I

.field private static final size:I


# instance fields
.field private final flag:I


# direct methods
.method private static final synthetic $values()[Lio/ktor/network/selector/SelectInterest;
    .locals 4

    .line 1
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->READ:Lio/ktor/network/selector/SelectInterest;

    .line 2
    .line 3
    sget-object v1, Lio/ktor/network/selector/SelectInterest;->WRITE:Lio/ktor/network/selector/SelectInterest;

    .line 4
    .line 5
    sget-object v2, Lio/ktor/network/selector/SelectInterest;->ACCEPT:Lio/ktor/network/selector/SelectInterest;

    .line 6
    .line 7
    sget-object v3, Lio/ktor/network/selector/SelectInterest;->CONNECT:Lio/ktor/network/selector/SelectInterest;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lio/ktor/network/selector/SelectInterest;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lio/ktor/network/selector/SelectInterest;

    .line 2
    .line 3
    const-string v1, "READ"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lio/ktor/network/selector/SelectInterest;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lio/ktor/network/selector/SelectInterest;->READ:Lio/ktor/network/selector/SelectInterest;

    .line 11
    .line 12
    new-instance v0, Lio/ktor/network/selector/SelectInterest;

    .line 13
    .line 14
    const-string v1, "WRITE"

    .line 15
    .line 16
    const/4 v4, 0x4

    .line 17
    invoke-direct {v0, v1, v3, v4}, Lio/ktor/network/selector/SelectInterest;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lio/ktor/network/selector/SelectInterest;->WRITE:Lio/ktor/network/selector/SelectInterest;

    .line 21
    .line 22
    new-instance v0, Lio/ktor/network/selector/SelectInterest;

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    const/16 v3, 0x10

    .line 26
    .line 27
    const-string v4, "ACCEPT"

    .line 28
    .line 29
    invoke-direct {v0, v4, v1, v3}, Lio/ktor/network/selector/SelectInterest;-><init>(Ljava/lang/String;II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lio/ktor/network/selector/SelectInterest;->ACCEPT:Lio/ktor/network/selector/SelectInterest;

    .line 33
    .line 34
    new-instance v0, Lio/ktor/network/selector/SelectInterest;

    .line 35
    .line 36
    const/4 v1, 0x3

    .line 37
    const/16 v3, 0x8

    .line 38
    .line 39
    const-string v4, "CONNECT"

    .line 40
    .line 41
    invoke-direct {v0, v4, v1, v3}, Lio/ktor/network/selector/SelectInterest;-><init>(Ljava/lang/String;II)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lio/ktor/network/selector/SelectInterest;->CONNECT:Lio/ktor/network/selector/SelectInterest;

    .line 45
    .line 46
    invoke-static {}, Lio/ktor/network/selector/SelectInterest;->$values()[Lio/ktor/network/selector/SelectInterest;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lio/ktor/network/selector/SelectInterest;->$VALUES:[Lio/ktor/network/selector/SelectInterest;

    .line 51
    .line 52
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Lio/ktor/network/selector/SelectInterest;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 57
    .line 58
    new-instance v0, Lio/ktor/network/selector/飘花落叶言子楪苏世兰哲;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lio/ktor/network/selector/SelectInterest;->Companion:Lio/ktor/network/selector/飘花落叶言子楪苏世兰哲;

    .line 64
    .line 65
    invoke-static {}, Lio/ktor/network/selector/SelectInterest;->getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    new-array v1, v2, [Lio/ktor/network/selector/SelectInterest;

    .line 70
    .line 71
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, [Lio/ktor/network/selector/SelectInterest;

    .line 76
    .line 77
    sput-object v0, Lio/ktor/network/selector/SelectInterest;->AllInterests:[Lio/ktor/network/selector/SelectInterest;

    .line 78
    .line 79
    invoke-static {}, Lio/ktor/network/selector/SelectInterest;->getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    new-instance v1, Ljava/util/ArrayList;

    .line 84
    .line 85
    const/16 v2, 0xa

    .line 86
    .line 87
    invoke-static {v0, v2}, Lkotlin/collections/飘花落叶言子楪哲兰苏世;->飘花落叶言子哲楪苏世兰(Ljava/lang/Iterable;I)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_0

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Lio/ktor/network/selector/SelectInterest;

    .line 109
    .line 110
    iget v2, v2, Lio/ktor/network/selector/SelectInterest;->flag:I

    .line 111
    .line 112
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_0
    invoke-static {v1}, Lkotlin/collections/飘花落叶言子楪哲兰世苏;->飘花落叶言子兰苏哲楪世(Ljava/util/ArrayList;)[I

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sput-object v0, Lio/ktor/network/selector/SelectInterest;->flags:[I

    .line 125
    .line 126
    invoke-static {}, Lio/ktor/network/selector/SelectInterest;->getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    sput v0, Lio/ktor/network/selector/SelectInterest;->size:I

    .line 135
    .line 136
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
    iput p3, p0, Lio/ktor/network/selector/SelectInterest;->flag:I

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getAllInterests$cp()[Lio/ktor/network/selector/SelectInterest;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->AllInterests:[Lio/ktor/network/selector/SelectInterest;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getFlags$cp()[I
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->flags:[I

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getSize$cp()I
    .locals 1

    .line 1
    sget v0, Lio/ktor/network/selector/SelectInterest;->size:I

    .line 2
    .line 3
    return v0
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
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/ktor/network/selector/SelectInterest;
    .locals 1

    .line 1
    const-class v0, Lio/ktor/network/selector/SelectInterest;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/ktor/network/selector/SelectInterest;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/ktor/network/selector/SelectInterest;
    .locals 1

    .line 1
    sget-object v0, Lio/ktor/network/selector/SelectInterest;->$VALUES:[Lio/ktor/network/selector/SelectInterest;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/ktor/network/selector/SelectInterest;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getFlag()I
    .locals 0

    .line 1
    iget p0, p0, Lio/ktor/network/selector/SelectInterest;->flag:I

    .line 2
    .line 3
    return p0
.end method
