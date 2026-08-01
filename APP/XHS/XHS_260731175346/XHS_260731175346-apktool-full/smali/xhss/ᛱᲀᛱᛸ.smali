.class public abstract Lxhss/ᛱᲀᛱᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# static fields
.field public static final ᛷᛵᛵᲈ:Lxhss/ᲇᛱᲈᛱ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lxhss/ᲈᛴᲈᛱ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛴᲈᛱ;

    .line 2
    .line 3
    iget-object v1, v0, Lxhss/ᲈᛴᲈᛱ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛱᲈᛱ;

    .line 4
    .line 5
    if-nez v1, :cond_2

    .line 6
    .line 7
    new-instance v2, Lxhss/ᛷᛱᛳᲁ;

    .line 8
    .line 9
    const/4 v1, 0x7

    .line 10
    invoke-direct {v2, v1}, Lxhss/ᛷᛱᛳᲁ;-><init>(I)V

    .line 11
    .line 12
    .line 13
    sget-object v3, Lxhss/ᲈᛴᲈᛱ;->ᛱᛱᛲᲇ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 14
    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v3, v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    move-object v1, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    sget-object v0, Lxhss/ᲈᛴᲈᛱ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛴᲈᛱ;

    .line 31
    .line 32
    iget-object v1, v0, Lxhss/ᲈᛴᲈᛱ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛱᲈᛱ;

    .line 33
    .line 34
    :cond_2
    :goto_0
    sput-object v1, Lxhss/ᛱᲀᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛱᲈᛱ;

    .line 35
    .line 36
    return-void
.end method
