.class public final Lyyds/ᛷᛴᛱᛸ;
.super Lyyds/ᛵᲀᛵᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛵᛸᛸᛷ:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lyyds/ᛳᛷᲀᛴ;Ljava/lang/Class;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lyyds/ᛵᲀᛵᲁ;-><init>(Lyyds/ᛳᛷᲀᛴ;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lyyds/ᛷᛴᛱᛸ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᛴᛳᛲ(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/String;)Lyyds/ᛵᲀᛵᲁ;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object p0, p0, Lyyds/ᛷᛴᛱᛸ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    return-object v0
.end method

.method public final ᲇᲇᲇᛱ(Ljava/lang/String;)Lyyds/ᛵᲀᛵᲁ;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object p0, p0, Lyyds/ᛷᛴᛱᛸ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 3
    .line 4
    invoke-virtual {p0, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    return-object p0

    .line 13
    :catch_0
    return-object v0
.end method
