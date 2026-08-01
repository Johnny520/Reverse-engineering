.class public final synthetic L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    iput-object p2, p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲苏兰:L飘花落叶言苏子世哲楪兰/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lorg/apache/commons/io/filefilter/WildcardFileFilter;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p0, v1, p1}, Lorg/apache/commons/io/filefilter/WildcardFileFilter;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/WildcardFileFilter;Ljava/lang/String;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :pswitch_0
    check-cast p0, Lorg/apache/commons/io/filefilter/SuffixFileFilter;

    .line 20
    .line 21
    check-cast p1, Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {p0, v1, p1}, Lorg/apache/commons/io/filefilter/SuffixFileFilter;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/SuffixFileFilter;Ljava/lang/String;Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :pswitch_1
    check-cast p0, Lorg/apache/commons/io/filefilter/PrefixFileFilter;

    .line 29
    .line 30
    check-cast p1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {p0, v1, p1}, Lorg/apache/commons/io/filefilter/PrefixFileFilter;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/PrefixFileFilter;Ljava/lang/String;Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    return p0

    .line 37
    :pswitch_2
    check-cast p0, Lorg/apache/commons/io/filefilter/NameFileFilter;

    .line 38
    .line 39
    check-cast p1, Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p0, v1, p1}, Lorg/apache/commons/io/filefilter/NameFileFilter;->飘花落叶言子楪世苏哲兰(Lorg/apache/commons/io/filefilter/NameFileFilter;Ljava/lang/String;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
