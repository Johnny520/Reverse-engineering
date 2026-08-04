.class public final Lyyds/ᲈᛵᛱᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛵᛱᛸᲁ;


# instance fields
.field public final ᲀᛲᛳᲀ:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lyyds/ᲈᛵᛱᛲ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final ᛷᛲᲈᛱ()V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛵᛱᛲ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p0}, Lyyds/ᛱᛷᲈᛲ;->ᛱᲈᲁ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lyyds/ᲁᛱᛶᛲ;

    .line 22
    .line 23
    invoke-interface {v0}, Lyyds/ᛵᛱᛸᲁ;->ᛷᛲᲈᛱ()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final ᛷᲈᲈᲁ()V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛵᛱᛲ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p0}, Lyyds/ᛱᛷᲈᛲ;->ᛱᲈᲁ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lyyds/ᲁᛱᛶᛲ;

    .line 22
    .line 23
    invoke-interface {v0}, Lyyds/ᛵᛱᛸᲁ;->ᛷᲈᲈᲁ()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method

.method public final ᲀᛲᛳᲀ()V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲈᛵᛱᛲ;->ᲀᛲᛳᲀ:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p0}, Lyyds/ᛱᛷᲈᛲ;->ᛱᲈᲁ(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lyyds/ᲁᛱᛶᛲ;

    .line 22
    .line 23
    invoke-interface {v0}, Lyyds/ᛵᛱᛸᲁ;->ᲀᛲᛳᲀ()V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
.end method
