.class public final Lyyds/ᛴᲇᛱᛵ;
.super Lyyds/ᛶᲀᲈᲇ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/util/Iterator;

.field public final ᛶᛷᛲᲁ:Ljava/util/HashSet;

.field public final ᲇᲇᲇᛱ:Lyyds/ᛷᛴᲈᲀ;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lyyds/ᛷᛴᲈᲀ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛴᲇᛱᛵ;->ᛲᛴᛳᛲ:Ljava/util/Iterator;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛴᲇᛱᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛴᲈᲀ;

    .line 7
    .line 8
    new-instance p1, Ljava/util/HashSet;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lyyds/ᛴᲇᛱᛵ;->ᛶᛷᛲᲁ:Ljava/util/HashSet;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 3

    .line 1
    :cond_0
    iget-object v0, p0, Lyyds/ᛴᲇᛱᛵ;->ᛲᛴᛳᛲ:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, Lyyds/ᛴᲇᛱᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛴᲈᲀ;

    .line 14
    .line 15
    invoke-interface {v1, v0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iget-object v2, p0, Lyyds/ᛴᲇᛱᛵ;->ᛶᛷᛲᲁ:Ljava/util/HashSet;

    .line 20
    .line 21
    invoke-virtual {v2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    iput-object v0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    iput v0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    const/4 v0, 0x2

    .line 34
    iput v0, p0, Lyyds/ᛶᲀᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 35
    .line 36
    return-void
.end method
