.class public final synthetic Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/util/Calendar;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lorg/apache/commons/lang3/time/FastDateParser;


# direct methods
.method public synthetic constructor <init>(Lorg/apache/commons/lang3/time/FastDateParser;ILjava/util/Calendar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/lang3/time/FastDateParser;

    .line 5
    .line 6
    iput p2, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    iput-object p3, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/util/Calendar;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰苏世:Ljava/util/Calendar;

    .line 2
    .line 3
    check-cast p1, Ljava/util/Locale;

    .line 4
    .line 5
    iget-object v1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲苏兰世:Lorg/apache/commons/lang3/time/FastDateParser;

    .line 6
    .line 7
    iget p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    invoke-static {v1, p0, v0, p1}, Lorg/apache/commons/lang3/time/FastDateParser;->飘花落叶言子楪世哲苏兰(Lorg/apache/commons/lang3/time/FastDateParser;ILjava/util/Calendar;Ljava/util/Locale;)Lorg/apache/commons/lang3/time/飘花落叶言子楪哲苏兰世;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
