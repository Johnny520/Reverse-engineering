.class public final enum Lcom/sonsation/library/model/StrokeType;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/sonsation/library/model/StrokeType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/sonsation/library/model/StrokeType;",
        "",
        "type",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getType",
        "()I",
        "INSIDE",
        "CENTER",
        "OUTSIDE",
        "library_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

.field private static final synthetic $VALUES:[Lcom/sonsation/library/model/StrokeType;

.field public static final enum CENTER:Lcom/sonsation/library/model/StrokeType;

.field public static final enum INSIDE:Lcom/sonsation/library/model/StrokeType;

.field public static final enum OUTSIDE:Lcom/sonsation/library/model/StrokeType;


# instance fields
.field private final type:I


# direct methods
.method private static final synthetic $values()[Lcom/sonsation/library/model/StrokeType;
    .locals 3

    .line 1
    sget-object v0, Lcom/sonsation/library/model/StrokeType;->INSIDE:Lcom/sonsation/library/model/StrokeType;

    .line 2
    .line 3
    sget-object v1, Lcom/sonsation/library/model/StrokeType;->CENTER:Lcom/sonsation/library/model/StrokeType;

    .line 4
    .line 5
    sget-object v2, Lcom/sonsation/library/model/StrokeType;->OUTSIDE:Lcom/sonsation/library/model/StrokeType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lcom/sonsation/library/model/StrokeType;

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
    new-instance v0, Lcom/sonsation/library/model/StrokeType;

    .line 2
    .line 3
    const-string v1, "INSIDE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/sonsation/library/model/StrokeType;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/sonsation/library/model/StrokeType;->INSIDE:Lcom/sonsation/library/model/StrokeType;

    .line 10
    .line 11
    new-instance v0, Lcom/sonsation/library/model/StrokeType;

    .line 12
    .line 13
    const-string v1, "CENTER"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lcom/sonsation/library/model/StrokeType;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/sonsation/library/model/StrokeType;->CENTER:Lcom/sonsation/library/model/StrokeType;

    .line 20
    .line 21
    new-instance v0, Lcom/sonsation/library/model/StrokeType;

    .line 22
    .line 23
    const-string v1, "OUTSIDE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lcom/sonsation/library/model/StrokeType;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/sonsation/library/model/StrokeType;->OUTSIDE:Lcom/sonsation/library/model/StrokeType;

    .line 30
    .line 31
    invoke-static {}, Lcom/sonsation/library/model/StrokeType;->$values()[Lcom/sonsation/library/model/StrokeType;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lcom/sonsation/library/model/StrokeType;->$VALUES:[Lcom/sonsation/library/model/StrokeType;

    .line 36
    .line 37
    invoke-static {v0}, Lkotlin/enums/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰([Ljava/lang/Enum;)Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lcom/sonsation/library/model/StrokeType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 42
    .line 43
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
    iput p3, p0, Lcom/sonsation/library/model/StrokeType;->type:I

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
    sget-object v0, Lcom/sonsation/library/model/StrokeType;->$ENTRIES:Lkotlin/enums/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/sonsation/library/model/StrokeType;
    .locals 1

    .line 1
    const-class v0, Lcom/sonsation/library/model/StrokeType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/sonsation/library/model/StrokeType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/sonsation/library/model/StrokeType;
    .locals 1

    .line 1
    sget-object v0, Lcom/sonsation/library/model/StrokeType;->$VALUES:[Lcom/sonsation/library/model/StrokeType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/sonsation/library/model/StrokeType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getType()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/sonsation/library/model/StrokeType;->type:I

    .line 2
    .line 3
    return p0
.end method
