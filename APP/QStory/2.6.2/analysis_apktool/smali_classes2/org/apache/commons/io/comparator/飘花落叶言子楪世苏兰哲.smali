.class public final synthetic Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/io/Serializable;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/io/Serializable;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/io/Serializable;I)V
    .locals 0

    .line 1
    iput p3, p0, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/io/Serializable;

    .line 4
    .line 5
    iput-object p2, p0, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/io/Serializable;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/io/Serializable;

    .line 4
    .line 5
    iget-object p0, p0, Lorg/apache/commons/io/comparator/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/io/Serializable;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lorg/apache/commons/io/monitor/FileAlterationObserver;

    .line 11
    .line 12
    check-cast v1, Lorg/apache/commons/io/monitor/FileEntry;

    .line 13
    .line 14
    check-cast p1, Ljava/io/File;

    .line 15
    .line 16
    invoke-static {p0, v1, p1}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->飘花落叶言子楪世兰苏哲(Lorg/apache/commons/io/monitor/FileAlterationObserver;Lorg/apache/commons/io/monitor/FileEntry;Ljava/io/File;)Lorg/apache/commons/io/monitor/FileEntry;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p0, Ljava/io/File;

    .line 22
    .line 23
    check-cast v1, Ljava/io/File;

    .line 24
    .line 25
    check-cast p1, Ljava/util/Comparator;

    .line 26
    .line 27
    invoke-static {p0, v1, p1}, Lorg/apache/commons/io/comparator/CompositeFileComparator;->飘花落叶言子楪世哲苏兰(Ljava/io/File;Ljava/io/File;Ljava/util/Comparator;)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
