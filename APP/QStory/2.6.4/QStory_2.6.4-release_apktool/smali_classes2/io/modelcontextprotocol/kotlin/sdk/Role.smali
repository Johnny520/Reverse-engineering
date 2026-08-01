.class public final enum Lio/modelcontextprotocol/kotlin/sdk/Role;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/modelcontextprotocol/kotlin/sdk/Role;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0007\u0008\u0087\u0081\u0002\u0018\u0000 \u00042\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lio/modelcontextprotocol/kotlin/sdk/Role;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "Companion",
        "\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u82cf\u54f2\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u54f2\u5170\u82cf\u4e16\u5b50",
        "user",
        "assistant",
        "kotlin-sdk"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世哲兰苏;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Lio/modelcontextprotocol/kotlin/sdk/Role;

.field private static final $cachedSerializer$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;"
        }
    .end annotation
.end field

.field public static final Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰苏世子;

.field public static final enum assistant:Lio/modelcontextprotocol/kotlin/sdk/Role;

.field public static final enum user:Lio/modelcontextprotocol/kotlin/sdk/Role;


# direct methods
.method private static final synthetic $values()[Lio/modelcontextprotocol/kotlin/sdk/Role;
    .locals 2

    .line 1
    sget-object v0, Lio/modelcontextprotocol/kotlin/sdk/Role;->user:Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 2
    .line 3
    sget-object v1, Lio/modelcontextprotocol/kotlin/sdk/Role;->assistant:Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lio/modelcontextprotocol/kotlin/sdk/Role;

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
    new-instance v0, Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 2
    .line 3
    const-string v1, "user"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lio/modelcontextprotocol/kotlin/sdk/Role;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lio/modelcontextprotocol/kotlin/sdk/Role;->user:Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 10
    .line 11
    new-instance v0, Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 12
    .line 13
    const-string v1, "assistant"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lio/modelcontextprotocol/kotlin/sdk/Role;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lio/modelcontextprotocol/kotlin/sdk/Role;->assistant:Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 20
    .line 21
    invoke-static {}, Lio/modelcontextprotocol/kotlin/sdk/Role;->$values()[Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lio/modelcontextprotocol/kotlin/sdk/Role;->$VALUES:[Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lio/modelcontextprotocol/kotlin/sdk/Role;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
    new-instance v0, L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰苏世子;

    .line 34
    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lio/modelcontextprotocol/kotlin/sdk/Role;->Companion:L飘花落叶言世子苏哲楪兰/飘花落叶言楪哲兰苏世子;

    .line 39
    .line 40
    sget-object v0, Lkotlin/LazyThreadSafetyMode;->PUBLICATION:Lkotlin/LazyThreadSafetyMode;

    .line 41
    .line 42
    new-instance v1, L飘花落叶言世子苏哲楪兰/飘花落叶言楪世苏子哲兰;

    .line 43
    .line 44
    const/4 v2, 0x3

    .line 45
    invoke-direct {v1, v2}, L飘花落叶言世子苏哲楪兰/飘花落叶言楪世苏子哲兰;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Lkotlin/LazyThreadSafetyMode;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lio/modelcontextprotocol/kotlin/sdk/Role;->$cachedSerializer$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 53
    .line 54
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

.method private static final _init_$_anonymous_()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;
    .locals 3

    .line 1
    invoke-static {}, Lio/modelcontextprotocol/kotlin/sdk/Role;->values()[Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪兰哲苏世;

    .line 9
    .line 10
    const-string v2, "io.modelcontextprotocol.kotlin.sdk.Role"

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪兰哲苏世;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 13
    .line 14
    .line 15
    return-object v1
.end method

.method public static final synthetic access$get$cachedSerializer$delegate$cp()Lkotlin/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    sget-object v0, Lio/modelcontextprotocol/kotlin/sdk/Role;->$cachedSerializer$delegate:Lkotlin/飘花落叶言子楪苏世哲兰;

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
    sget-object v0, Lio/modelcontextprotocol/kotlin/sdk/Role;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/modelcontextprotocol/kotlin/sdk/Role;
    .locals 1

    .line 1
    const-class v0, Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lio/modelcontextprotocol/kotlin/sdk/Role;
    .locals 1

    .line 1
    sget-object v0, Lio/modelcontextprotocol/kotlin/sdk/Role;->$VALUES:[Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lio/modelcontextprotocol/kotlin/sdk/Role;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;
    .locals 1

    .line 1
    invoke-static {}, Lio/modelcontextprotocol/kotlin/sdk/Role;->_init_$_anonymous_()L飘花落叶言世苏兰哲子楪/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
