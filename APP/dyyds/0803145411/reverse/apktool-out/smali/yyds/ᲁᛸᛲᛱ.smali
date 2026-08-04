.class public final Lyyds/ᲁᛸᛲᛱ;
.super Ljava/util/ArrayList;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᲈ;
.implements Lyyds/ᛴᲁᛶᛴ;


# direct methods
.method public static ᛲᛴᛳᛲ(Ljava/util/List;Lyyds/ᛵᛴᲇᛷ;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {p0, v0, p1}, Lyyds/ᲁᛸᛲᛱ;->ᲇᲇᲇᛱ(Ljava/util/List;Ljava/lang/StringBuilder;Lyyds/ᛵᛴᲇᛷ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    .line 8
    .line 9
    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public static ᲇᲇᲇᛱ(Ljava/util/List;Ljava/lang/StringBuilder;Lyyds/ᛵᛴᲇᛷ;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x5b

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 7
    .line 8
    .line 9
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 v0, 0x1

    .line 14
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    const/16 v2, 0x2c

    .line 29
    .line 30
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 31
    .line 32
    .line 33
    :goto_1
    if-nez v1, :cond_1

    .line 34
    .line 35
    const-string v1, "null"

    .line 36
    .line 37
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    invoke-static {v1, p1, p2}, Lyyds/ᲀᲁᛲᲈ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/StringBuilder;Lyyds/ᛵᛴᲇᛷ;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const/16 p0, 0x5d

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 48
    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᲀᲁᛲᲈ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇᛷ;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lyyds/ᲁᛸᛲᛱ;->ᛲᛴᛳᛲ(Ljava/util/List;Lyyds/ᛵᛴᲇᛷ;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛵᛴᲇᛷ;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lyyds/ᲁᛸᛲᛱ;->ᛲᛴᛳᛲ(Ljava/util/List;Lyyds/ᛵᛴᲇᛷ;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/StringBuilder;Lyyds/ᛵᛴᲇᛷ;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lyyds/ᲁᛸᛲᛱ;->ᲇᲇᲇᛱ(Ljava/util/List;Ljava/lang/StringBuilder;Lyyds/ᛵᛴᲇᛷ;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final ᲀᛲᛳᲀ()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᲀᲁᛲᲈ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇᛷ;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lyyds/ᲁᛸᛲᛱ;->ᛲᛴᛳᛲ(Ljava/util/List;Lyyds/ᛵᛴᲇᛷ;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᲀᲁᛲᲈ;->ᛲᲈᲁ:Lyyds/ᛵᛴᲇᛷ;

    .line 2
    .line 3
    invoke-static {p0, p1, v0}, Lyyds/ᲁᛸᛲᛱ;->ᲇᲇᲇᛱ(Ljava/util/List;Ljava/lang/StringBuilder;Lyyds/ᛵᛴᲇᛷ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
