.class public final Lyyds/ᛲᲀᛸᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛸᛶᲀᲈ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᛲᛴᛴᛱ;

.field public ᛵᛸᛸᛷ:Z

.field public ᲀᛲᛳᲀ:Landroid/os/Bundle;

.field public final ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᛱ;


# direct methods
.method public constructor <init>(Lyyds/ᛲᛴᛴᛱ;Lyyds/ᛳᛲᛷᛷ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᲀᛸᛳ;->ᛲᲈᲁ:Lyyds/ᛲᛴᛴᛱ;

    .line 5
    .line 6
    new-instance p1, Lyyds/ᲁᛵᲀᛵ;

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    invoke-direct {p1, v0, p2}, Lyyds/ᲁᛵᲀᛵ;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p2, Lyyds/ᛱᛲᛶᛱ;

    .line 13
    .line 14
    invoke-direct {p2, p1}, Lyyds/ᛱᛲᛶᛱ;-><init>(Lyyds/ᲁᛶᲁᲀ;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Lyyds/ᛲᲀᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Landroid/os/Bundle;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lyyds/ᛲᲀᛸᛳ;->ᲀᛲᛳᲀ:Landroid/os/Bundle;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lyyds/ᛲᲀᛸᛳ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛲᛶᛱ;

    .line 14
    .line 15
    invoke-virtual {v1}, Lyyds/ᛱᛲᛶᛱ;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lyyds/ᛲᛸᛶᲁ;

    .line 20
    .line 21
    iget-object v1, v1, Lyyds/ᛲᛸᛶᲁ;->ᛵᛸᛸᛷ:Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_1

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    iput-boolean v1, p0, Lyyds/ᛲᲀᛸᛳ;->ᛵᛸᛸᛷ:Z

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/util/Map$Entry;

    .line 46
    .line 47
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/lang/String;

    .line 52
    .line 53
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method
