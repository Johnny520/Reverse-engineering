.class public final synthetic Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/util/Locale;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Z

.field public final synthetic 飘花落叶言子楪哲兰苏世:I

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/TimeZone;


# direct methods
.method public synthetic constructor <init>(Ljava/util/TimeZone;ZILjava/util/Locale;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/TimeZone;

    .line 5
    .line 6
    iput-boolean p2, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Z

    .line 7
    .line 8
    iput p3, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    iput-object p4, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世苏哲:Ljava/util/Locale;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪兰世苏哲:Ljava/util/Locale;

    .line 2
    .line 3
    check-cast p1, Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;

    .line 4
    .line 5
    iget-object v1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲苏兰世:Ljava/util/TimeZone;

    .line 6
    .line 7
    iget-boolean v2, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰世苏:Z

    .line 8
    .line 9
    iget p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪哲兰苏世:I

    .line 10
    .line 11
    invoke-static {v1, v2, p0, v0, p1}, Lorg/apache/commons/lang3/time/FastDatePrinter;->飘花落叶言子楪世苏哲兰(Ljava/util/TimeZone;ZILjava/util/Locale;Lorg/apache/commons/lang3/time/飘花落叶言子世楪兰苏哲;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
