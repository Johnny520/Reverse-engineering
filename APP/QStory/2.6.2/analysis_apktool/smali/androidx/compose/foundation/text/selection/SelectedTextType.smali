.class public final enum Landroidx/compose/foundation/text/selection/SelectedTextType;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/compose/foundation/text/selection/SelectedTextType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Landroidx/compose/foundation/text/selection/SelectedTextType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "EditableText",
        "StaticText",
        "foundation"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Landroidx/compose/foundation/text/selection/SelectedTextType;

.field public static final enum EditableText:Landroidx/compose/foundation/text/selection/SelectedTextType;

.field public static final enum StaticText:Landroidx/compose/foundation/text/selection/SelectedTextType;


# direct methods
.method private static final synthetic $values()[Landroidx/compose/foundation/text/selection/SelectedTextType;
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/selection/SelectedTextType;->EditableText:Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/text/selection/SelectedTextType;->StaticText:Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Landroidx/compose/foundation/text/selection/SelectedTextType;

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
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 2
    .line 3
    const-string v1, "EditableText"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/text/selection/SelectedTextType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroidx/compose/foundation/text/selection/SelectedTextType;->EditableText:Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 10
    .line 11
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 12
    .line 13
    const-string v1, "StaticText"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/text/selection/SelectedTextType;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Landroidx/compose/foundation/text/selection/SelectedTextType;->StaticText:Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 20
    .line 21
    invoke-static {}, Landroidx/compose/foundation/text/selection/SelectedTextType;->$values()[Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Landroidx/compose/foundation/text/selection/SelectedTextType;->$VALUES:[Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Landroidx/compose/foundation/text/selection/SelectedTextType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
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

.method public static getEntries()Lkotlin/enums/飘花落叶言子楪世苏哲兰;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/selection/SelectedTextType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/compose/foundation/text/selection/SelectedTextType;
    .locals 1

    .line 1
    const-class v0, Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Landroidx/compose/foundation/text/selection/SelectedTextType;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/selection/SelectedTextType;->$VALUES:[Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Landroidx/compose/foundation/text/selection/SelectedTextType;

    .line 8
    .line 9
    return-object v0
.end method
