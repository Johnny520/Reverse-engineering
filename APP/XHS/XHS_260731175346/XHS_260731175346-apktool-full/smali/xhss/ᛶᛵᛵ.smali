.class public abstract Lxhss/ᛶᛵᛵ;
.super Lxhss/ᛲᛱᛶᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛵᛵᲈ:Lxhss/ᛲᛸᲈᲇ;


# direct methods
.method public constructor <init>(Lxhss/ᛲᛸᲈᲇ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛶᛵᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛸᲈᲇ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛴᛷᛸᛷ;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲁᲁᛴᲁ()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲀᛷᲁᲀ()V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛶᛵᛵ;->ᲇᛴᲇᛵ()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, Lxhss/ᛶᛵᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛸᲈᲇ;

    .line 19
    .line 20
    iget-object v1, v1, Lxhss/ᛲᛸᲈᲇ;->ᛷᛵᛵᲈ:Ljava/util/Map;

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛳᲁᲇᛸ()V

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛳᲈᲈᛲ()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᲈᛲᛵᲁ()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Lxhss/ᲁᲀᛸᛲ;

    .line 40
    .line 41
    if-nez v2, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛸᛴᛸᛲ()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-virtual {p0, v0, p1, v2}, Lxhss/ᛶᛵᛵ;->ᲇᛶᛴᲀ(Ljava/lang/Object;Lxhss/ᛴᛷᛸᛷ;Lxhss/ᲁᲀᛸᛲ;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p1}, Lxhss/ᛴᛷᛸᛷ;->ᛷᲁᲁ()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lxhss/ᛶᛵᛵ;->ᛷᛴᛷᛱ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :catch_0
    move-exception p0

    .line 60
    sget-object p1, Lxhss/ᲇᛴᛷᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲀᲀᛱ;

    .line 61
    .line 62
    new-instance p1, Ljava/lang/RuntimeException;

    .line 63
    .line 64
    const-string v0, "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 65
    .line 66
    invoke-direct {p1, v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw p1

    .line 70
    :catch_1
    move-exception p0

    .line 71
    new-instance p1, Lxhss/ᛱᲈᛲᛷ;

    .line 72
    .line 73
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    throw p1
.end method

.method public final ᛳᲁᲇᛸ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛳᲈᲈᛲ()Lxhss/ᛸᲈᲈᛶ;

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᲇᛴᲇᛵ()V

    .line 8
    .line 9
    .line 10
    :try_start_0
    iget-object p0, p0, Lxhss/ᛶᛵᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛸᲈᲇ;

    .line 11
    .line 12
    iget-object p0, p0, Lxhss/ᛲᛸᲈᲇ;->ᛱᛱᛲᲇ:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lxhss/ᲁᲀᛸᛲ;

    .line 29
    .line 30
    invoke-virtual {v0, p1, p2}, Lxhss/ᲁᲀᛸᛲ;->ᛷᛵᛵᲈ(Lxhss/ᛸᲈᲈᛶ;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p1}, Lxhss/ᛸᲈᲈᛶ;->ᛷᲁᲁ()V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    move-exception p0

    .line 39
    sget-object p1, Lxhss/ᲇᛴᛷᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲀᲀᛱ;

    .line 40
    .line 41
    new-instance p1, Ljava/lang/RuntimeException;

    .line 42
    .line 43
    const-string p2, "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."

    .line 44
    .line 45
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    throw p1
.end method

.method public abstract ᛷᛴᛷᛱ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ᲇᛴᲇᛵ()Ljava/lang/Object;
.end method

.method public abstract ᲇᛶᛴᲀ(Ljava/lang/Object;Lxhss/ᛴᛷᛸᛷ;Lxhss/ᲁᲀᛸᛲ;)V
.end method
