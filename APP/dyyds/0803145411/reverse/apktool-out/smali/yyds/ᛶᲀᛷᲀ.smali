.class public abstract Lyyds/ᛶᲀᛷᲀ;
.super Ljava/lang/Object;


# static fields
.field public static final ᛲᲈᲁ:Ljava/util/concurrent/atomic/AtomicLong;

.field public static final ᛵᛸᛸᛷ:Lyyds/ᲇᛵᲁᛳ;

.field public static volatile ᲀᛲᛳᲀ:Lyyds/ᛲᛲᛵᛸ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x117

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    .line 1
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lyyds/ᛶᲀᛷᲀ;->ᛲᲈᲁ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 11
    .line 12
    invoke-static {}, Lyyds/ᛸᛳᛷᛳ;->ᛲᲈᲁ()Lyyds/ᲁᲀᲇᲀ;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lyyds/ᛱᲁᛵᛵ;->ᛲᲈᲁ:Lyyds/ᛵᲁᛸᛴ;

    .line 17
    .line 18
    sget-object v1, Lyyds/ᛶᛶᛳᛶ;->ᛲᲈᲁ:Lyyds/ᛵᛸᛵᛱ;

    .line 19
    .line 20
    iget-object v1, v1, Lyyds/ᛵᛸᛵᛱ;->ᲇᲇᲇᛱ:Lyyds/ᛵᛸᛵᛱ;

    .line 21
    .line 22
    invoke-static {v0, v1}, Lyyds/ᛴᛶᲀᛲ;->ᛲᛲᲈᲈ(Lyyds/ᲁᛴᛲ;Lyyds/ᲁᛴᛲ;)Lyyds/ᲁᛴᛲ;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, Lyyds/ᲀᛱᛳᲈ;->ᛲᲈᲁ(Lyyds/ᲁᛴᛲ;)Lyyds/ᲇᛵᲁᛳ;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lyyds/ᛶᲀᛷᲀ;->ᛵᛸᛸᛷ:Lyyds/ᲇᛵᲁᛳ;

    .line 31
    .line 32
    return-void
.end method

.method public static native ᛲᲈᲁ()V
.end method
