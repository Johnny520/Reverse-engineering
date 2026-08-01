.class public final L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪苏世哲兰:I


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子楪世兰苏哲:Ljava/lang/String;

.field public 飘花落叶言子楪世哲兰苏:Ljava/lang/String;

.field public 飘花落叶言子楪世哲苏兰:Ljava/lang/String;

.field public 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/Random;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/Random;->nextInt()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    rem-int/lit8 v0, v0, 0x10

    .line 15
    .line 16
    sput v0, L飘花落叶言苏世哲楪兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世哲兰:I

    .line 17
    .line 18
    return-void
.end method
