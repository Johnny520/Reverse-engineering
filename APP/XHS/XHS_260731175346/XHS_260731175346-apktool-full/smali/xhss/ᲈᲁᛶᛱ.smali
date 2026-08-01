.class public final Lxhss/ᲈᲁᛶᛱ;
.super Lxhss/ᲈᲀᲇᛶ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᲇᛸᛳᲁ:Lxhss/ᛸᲇᲇᛶ;


# direct methods
.method public constructor <init>(Lxhss/ᛸᲇᲇᛶ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᲈᲁᛶᛱ;->ᲇᛸᛳᲁ:Lxhss/ᛸᲇᲇᛶ;

    .line 2
    .line 3
    invoke-direct {p0}, Lxhss/ᲈᲀᲇᛶ;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛸᛷᲈᲈ()V
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᲈᲁᛶᛱ;->ᲇᛸᛳᲁ:Lxhss/ᛸᲇᲇᛶ;

    .line 2
    .line 3
    iget-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛲᛷᛱ:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛸᛲᛷᛱ:Z

    .line 10
    .line 11
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛴᲈᛱᛴ:Lxhss/ᲇᛸᛵᛴ;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lxhss/ᲇᛸᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛶᛷᛲ;

    .line 16
    .line 17
    invoke-interface {v0}, Lxhss/ᛷᛶᛷᛲ;->cancel()V

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛳᛶᛷᲀ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lxhss/ᛱᛸᲁᛶ;

    .line 37
    .line 38
    invoke-interface {v1}, Lxhss/ᛱᛸᲁᛶ;->cancel()V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    iget-object p0, p0, Lxhss/ᛸᲇᲇᛶ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲀᛱᲇ;

    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    return-void
.end method
