.class public abstract enum Landroidx/compose/foundation/text/selection/SelectionMode;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/foundation/text/selection/SelectionMode$Horizontal;,
        Landroidx/compose/foundation/text/selection/SelectionMode$Vertical;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/compose/foundation/text/selection/SelectionMode;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001b\u0010\n\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u0004H \u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\'\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Landroidx/compose/foundation/text/selection/SelectionMode;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "offset",
        "",
        "containsInclusive-Uv8p0NA",
        "(L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;J)Z",
        "containsInclusive",
        "position",
        "bounds",
        "",
        "compare-3MmeM6k$foundation",
        "(JL\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;)I",
        "compare",
        "start",
        "end",
        "isSelected-2x9bVx0$foundation",
        "(L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u54f2\u5170\u696a\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;JJ)Z",
        "isSelected",
        "Vertical",
        "Horizontal",
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

.field private static final synthetic $VALUES:[Landroidx/compose/foundation/text/selection/SelectionMode;

.field public static final enum Horizontal:Landroidx/compose/foundation/text/selection/SelectionMode;

.field public static final enum Vertical:Landroidx/compose/foundation/text/selection/SelectionMode;


# direct methods
.method private static final synthetic $values()[Landroidx/compose/foundation/text/selection/SelectionMode;
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/selection/SelectionMode;->Vertical:Landroidx/compose/foundation/text/selection/SelectionMode;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/foundation/text/selection/SelectionMode;->Horizontal:Landroidx/compose/foundation/text/selection/SelectionMode;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Landroidx/compose/foundation/text/selection/SelectionMode;

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
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionMode$Vertical;

    .line 2
    .line 3
    const-string v1, "Vertical"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/text/selection/SelectionMode$Vertical;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Landroidx/compose/foundation/text/selection/SelectionMode;->Vertical:Landroidx/compose/foundation/text/selection/SelectionMode;

    .line 10
    .line 11
    new-instance v0, Landroidx/compose/foundation/text/selection/SelectionMode$Horizontal;

    .line 12
    .line 13
    const-string v1, "Horizontal"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Landroidx/compose/foundation/text/selection/SelectionMode$Horizontal;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Landroidx/compose/foundation/text/selection/SelectionMode;->Horizontal:Landroidx/compose/foundation/text/selection/SelectionMode;

    .line 20
    .line 21
    invoke-static {}, Landroidx/compose/foundation/text/selection/SelectionMode;->$values()[Landroidx/compose/foundation/text/selection/SelectionMode;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Landroidx/compose/foundation/text/selection/SelectionMode;->$VALUES:[Landroidx/compose/foundation/text/selection/SelectionMode;

    .line 26
    .line 27
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Landroidx/compose/foundation/text/selection/SelectionMode;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

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

    .line 5
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/飘花落叶言子楪世哲苏兰;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Landroidx/compose/foundation/text/selection/SelectionMode;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final containsInclusive-Uv8p0NA(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;J)Z
    .locals 3

    .line 1
    iget p0, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:F

    .line 2
    .line 3
    iget v0, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:F

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v1, p2, v1

    .line 8
    .line 9
    long-to-int v1, v1

    .line 10
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    cmpg-float p0, p0, v1

    .line 15
    .line 16
    if-gtz p0, :cond_0

    .line 17
    .line 18
    cmpg-float p0, v1, v0

    .line 19
    .line 20
    if-gtz p0, :cond_0

    .line 21
    .line 22
    iget p0, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:F

    .line 23
    .line 24
    iget p1, p1, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:F

    .line 25
    .line 26
    const-wide v0, 0xffffffffL

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr p2, v0

    .line 32
    long-to-int p2, p2

    .line 33
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    cmpg-float p0, p0, p2

    .line 38
    .line 39
    if-gtz p0, :cond_0

    .line 40
    .line 41
    cmpg-float p0, p2, p1

    .line 42
    .line 43
    if-gtz p0, :cond_0

    .line 44
    .line 45
    const/4 p0, 0x1

    .line 46
    return p0

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return p0
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
    sget-object v0, Landroidx/compose/foundation/text/selection/SelectionMode;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/compose/foundation/text/selection/SelectionMode;
    .locals 1

    .line 1
    const-class v0, Landroidx/compose/foundation/text/selection/SelectionMode;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/compose/foundation/text/selection/SelectionMode;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Landroidx/compose/foundation/text/selection/SelectionMode;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/foundation/text/selection/SelectionMode;->$VALUES:[Landroidx/compose/foundation/text/selection/SelectionMode;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Landroidx/compose/foundation/text/selection/SelectionMode;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract compare-3MmeM6k$foundation(JL飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;)I
.end method

.method public final isSelected-2x9bVx0$foundation(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;JJ)Z
    .locals 2

    .line 1
    invoke-direct {p0, p1, p2, p3}, Landroidx/compose/foundation/text/selection/SelectionMode;->containsInclusive-Uv8p0NA(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-nez v0, :cond_3

    .line 7
    .line 8
    invoke-direct {p0, p1, p4, p5}, Landroidx/compose/foundation/text/selection/SelectionMode;->containsInclusive-Uv8p0NA(L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;J)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    invoke-virtual {p0, p2, p3, p1}, Landroidx/compose/foundation/text/selection/SelectionMode;->compare-3MmeM6k$foundation(JL飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;)I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p0, p4, p5, p1}, Landroidx/compose/foundation/text/selection/SelectionMode;->compare-3MmeM6k$foundation(JL飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    const/4 p1, 0x0

    .line 24
    if-lez p2, :cond_1

    .line 25
    .line 26
    move p2, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    move p2, p1

    .line 29
    :goto_0
    if-lez p0, :cond_2

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move v1, p1

    .line 33
    :goto_1
    xor-int p0, p2, v1

    .line 34
    .line 35
    return p0

    .line 36
    :cond_3
    :goto_2
    return v1
.end method
