.class public final Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lorg/apache/commons/lang3/time/飘花落叶言子世楪苏兰哲;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

.field public final 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>([Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 5
    .line 6
    iput-object p1, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/util/Calendar;Ljava/lang/Appendable;)V
    .locals 1

    .line 1
    iget v0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

    .line 8
    .line 9
    aget-object p0, p0, p1

    .line 10
    .line 11
    invoke-interface {p2, p0}, Ljava/lang/Appendable;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()I
    .locals 3

    .line 1
    iget-object p0, p0, Lorg/apache/commons/lang3/time/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:[Ljava/lang/String;

    .line 2
    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x0

    .line 5
    :cond_0
    :goto_0
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    if-ltz v0, :cond_1

    .line 8
    .line 9
    aget-object v2, p0, v0

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-le v2, v1, :cond_0

    .line 16
    .line 17
    move v1, v2

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    return v1
.end method
