.class public final enum Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

.field public static final Companion:L飘花落叶言世楪兰子哲苏/飘花落叶言子楪哲苏世兰;

.field public static final enum ExplicitlyIgnorable:Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

.field public static final enum MustUse:Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

.field public static final enum Unspecified:Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;


# direct methods
.method private static final synthetic $values()[Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;
    .locals 3

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->MustUse:Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 2
    .line 3
    sget-object v1, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->ExplicitlyIgnorable:Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 4
    .line 5
    sget-object v2, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->Unspecified:Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

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
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 2
    .line 3
    const-string v1, "MustUse"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->MustUse:Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 10
    .line 11
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 12
    .line 13
    const-string v1, "ExplicitlyIgnorable"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->ExplicitlyIgnorable:Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 20
    .line 21
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 22
    .line 23
    const-string v1, "Unspecified"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->Unspecified:Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 30
    .line 31
    invoke-static {}, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->$values()[Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
    new-instance v0, L飘花落叶言世楪兰子哲苏/飘花落叶言子楪哲苏世兰;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->Companion:L飘花落叶言世楪兰子哲苏/飘花落叶言子楪哲苏世兰;

    .line 49
    .line 50
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

.method public static valueOf(Ljava/lang/String;)Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;
    .locals 1

    .line 1
    const-class v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;->$VALUES:[Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lkotlin/reflect/jvm/internal/impl/resolve/ReturnValueStatus;

    .line 8
    .line 9
    return-object v0
.end method
