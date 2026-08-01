.class public final synthetic Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/String;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p2, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

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
    iget v0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, Lorg/apache/commons/compress/archivers/zip/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Ljava/lang/String;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lorg/apache/commons/io/filefilter/WildcardFilter;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast p1, Lorg/apache/commons/lang3/tuple/Pair;

    .line 16
    .line 17
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    :pswitch_1
    check-cast p1, Lorg/apache/commons/lang3/tuple/Pair;

    .line 23
    .line 24
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    return p0

    .line 29
    :pswitch_2
    check-cast p1, Lorg/apache/commons/lang3/tuple/Pair;

    .line 30
    .line 31
    invoke-static {p0, p1}, Lorg/apache/commons/lang3/exception/DefaultExceptionContext;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lorg/apache/commons/lang3/tuple/Pair;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :pswitch_3
    check-cast p1, Lorg/apache/commons/io/IOCase;

    .line 37
    .line 38
    invoke-static {p0, p1}, Lorg/apache/commons/io/IOCase;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;Lorg/apache/commons/io/IOCase;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :pswitch_4
    check-cast p1, Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
