.class public final synthetic Lorg/apache/commons/io/monitor/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lorg/apache/commons/io/monitor/FileEntry;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Lorg/apache/commons/io/monitor/FileEntry;I)V
    .locals 0

    .line 1
    iput p2, p0, Lorg/apache/commons/io/monitor/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Lorg/apache/commons/io/monitor/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/io/monitor/FileEntry;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/io/monitor/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Lorg/apache/commons/io/monitor/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lorg/apache/commons/io/monitor/FileEntry;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    invoke-static {p0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->飘花落叶言子楪世兰哲苏(Lorg/apache/commons/io/monitor/FileEntry;)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 15
    .line 16
    .line 17
    :goto_0
    return-void

    .line 18
    :pswitch_0
    if-nez p1, :cond_1

    .line 19
    .line 20
    invoke-static {p0}, Lorg/apache/commons/io/monitor/FileAlterationObserver;->飘花落叶言子楪苏世兰哲(Lorg/apache/commons/io/monitor/FileEntry;)V

    .line 21
    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪世苏哲兰()V

    .line 25
    .line 26
    .line 27
    :goto_1
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
