.class public final synthetic Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/util/function/BiConsumer;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/util/TreeSet;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/util/Locale;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Locale;Ljava/util/TreeSet;Ljava/util/HashMap;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Locale;

    .line 5
    .line 6
    iput-object p2, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/TreeSet;

    .line 7
    .line 8
    iput-object p3, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Locale;

    .line 6
    .line 7
    iget-object v1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/util/TreeSet;

    .line 8
    .line 9
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-static {v0, v1, p0, p1, p2}, Lorg/apache/commons/lang3/time/FastDateParser;->飘花落叶言子楪世苏兰哲(Ljava/util/Locale;Ljava/util/TreeSet;Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Integer;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
