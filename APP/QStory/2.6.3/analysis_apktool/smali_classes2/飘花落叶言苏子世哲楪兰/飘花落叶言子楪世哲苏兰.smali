.class public final synthetic L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/io/File;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ljava/io/File;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lorg/apache/commons/io/filefilter/WildcardFilter;->飘花落叶言子楪世哲苏兰(Ljava/io/File;Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast p1, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lorg/apache/commons/io/filefilter/OrFileFilter;->飘花落叶言子楪世苏兰哲(Ljava/io/File;L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :pswitch_1
    check-cast p1, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;

    .line 23
    .line 24
    invoke-static {p0, p1}, Lorg/apache/commons/io/filefilter/AndFileFilter;->飘花落叶言子楪世哲苏兰(Ljava/io/File;L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰苏哲;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
