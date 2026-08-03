.class public L۟/o0;
.super L۟/n0;
.source "SourceFile"


# direct methods
.method public static final ۥ۠ۤ(Ljava/util/List;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "+TT;>;)TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string v0, "List is empty."

    invoke-direct {p0, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۠ۥ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L۟/c$a;I)Ljava/lang/String;
    .locals 4

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    const-string p1, ", "

    :cond_0
    and-int/lit8 v0, p5, 0x2

    const-string v1, ""

    if-eqz v0, :cond_1

    move-object p2, v1

    :cond_1
    and-int/lit8 v0, p5, 0x4

    if-eqz v0, :cond_2

    move-object p3, v1

    :cond_2
    and-int/lit8 v0, p5, 0x8

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v0, -0x1

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    and-int/lit8 v2, p5, 0x10

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    const-string v2, "..."

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    and-int/lit8 p5, p5, 0x20

    if-eqz p5, :cond_5

    move-object p4, v3

    :cond_5
    const-string p5, "<this>"

    .line 1
    invoke-static {p5, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p5, "prefix"

    invoke-static {p5, p2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p5, "postfix"

    invoke-static {p5, p3}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    const-string p5, "truncated"

    invoke-static {p5, v2}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance p5, Ljava/lang/StringBuilder;

    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 2
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_c

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    add-int/lit8 v1, v1, 0x1

    const/4 v3, 0x1

    if-le v1, v3, :cond_6

    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_6
    if-ltz v0, :cond_7

    if-gt v1, v0, :cond_c

    :cond_7
    if-eqz p4, :cond_8

    .line 3
    invoke-virtual {p4, p2}, L۟/c$a;->ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    goto :goto_4

    :cond_8
    if-nez p2, :cond_9

    goto :goto_3

    :cond_9
    instance-of v3, p2, Ljava/lang/CharSequence;

    :goto_3
    if-eqz v3, :cond_a

    :goto_4
    check-cast p2, Ljava/lang/CharSequence;

    goto :goto_5

    :cond_a
    instance-of v3, p2, Ljava/lang/Character;

    if-eqz v3, :cond_b

    check-cast p2, Ljava/lang/Character;

    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    move-result p2

    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    goto :goto_2

    :cond_b
    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    :goto_5
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    goto :goto_2

    :cond_c
    if-ltz v0, :cond_d

    if-le v1, v0, :cond_d

    .line 4
    invoke-virtual {p5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    :cond_d
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 5
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "toString(...)"

    invoke-static {p1, p0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method
