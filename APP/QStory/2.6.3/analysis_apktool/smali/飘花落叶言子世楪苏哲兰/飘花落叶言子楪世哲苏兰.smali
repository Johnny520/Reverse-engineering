.class public final L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;

    .line 2
    .line 3
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 4
    .line 5
    invoke-direct {v0, v1}, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;-><init>(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/16 v1, 0x38

    .line 3
    .line 4
    iget-object p0, p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 5
    .line 6
    const-string v2, "\n\t"

    .line 7
    .line 8
    invoke-static {p0, v2, v0, v1}, L飘花落叶言子苏哲兰楪世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/util/List;Ljava/lang/String;Landroidx/compose/ui/text/飘花落叶言子楪兰哲世苏;I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "TextContextMenuData(components="

    .line 13
    .line 14
    const/16 v1, 0x29

    .line 15
    .line 16
    invoke-static {v1, v0, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲世兰(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
