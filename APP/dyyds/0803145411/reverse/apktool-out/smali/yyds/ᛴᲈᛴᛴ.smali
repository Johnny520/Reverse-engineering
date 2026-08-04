.class public abstract Lyyds/ᛴᲈᛴᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᲈᲁ:Lyyds/ᛲᲈᲁᛴ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    sget-object v0, Lyyds/ᛷᛱᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛱᛵᛱ;

    .line 2
    .line 3
    iget-object v1, v0, Lyyds/ᛷᛱᛵᛱ;->ᛲᲈᲁ:Lyyds/ᛲᲈᲁᛴ;

    .line 4
    .line 5
    if-nez v1, :cond_2

    .line 6
    .line 7
    new-instance v2, Lyyds/ᛳᛷᲀᛴ;

    .line 8
    .line 9
    const/16 v1, 0x16

    .line 10
    .line 11
    invoke-direct {v2, v1}, Lyyds/ᛳᛷᲀᛴ;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sget-object v3, Lyyds/ᛷᛱᛵᛱ;->ᛵᛸᛸᛷ:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v3, v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    move-object v1, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_0

    .line 30
    .line 31
    sget-object v0, Lyyds/ᛷᛱᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛷᛱᛵᛱ;

    .line 32
    .line 33
    iget-object v1, v0, Lyyds/ᛷᛱᛵᛱ;->ᛲᲈᲁ:Lyyds/ᛲᲈᲁᛴ;

    .line 34
    .line 35
    :cond_2
    :goto_0
    sput-object v1, Lyyds/ᛴᲈᛴᛴ;->ᛲᲈᲁ:Lyyds/ᛲᲈᲁᛴ;

    .line 36
    .line 37
    return-void
.end method
