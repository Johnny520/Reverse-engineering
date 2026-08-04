.class public final Lyyds/ᲇᛷᛶᛲ;
.super Lyyds/ᛲᲀᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᛴᲇᛴᛲ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᲇᛷᛶᛲ;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lyyds/ᲇᛷᛶᛲ;

    .line 2
    .line 3
    invoke-direct {v0}, Lyyds/ᛴᲇᛴᛲ;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyyds/ᲇᛷᛶᛲ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛷᛶᛲ;

    .line 7
    .line 8
    sget-object v0, Lyyds/ᲀᲇᲁᲈ;->ᲇᲈᛵᛷ:Lyyds/ᲀᲇᲁᲈ;

    .line 9
    .line 10
    sget v1, Lyyds/ᛶᲇᛴᛲ;->ᛲᲈᲁ:I

    .line 11
    .line 12
    const/16 v2, 0x40

    .line 13
    .line 14
    if-ge v2, v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move v1, v2

    .line 18
    :goto_0
    const/16 v2, 0xc

    .line 19
    .line 20
    const-string v3, "kotlinx.coroutines.io.parallelism"

    .line 21
    .line 22
    invoke-static {v3, v1, v2}, Lyyds/ᛷᛴᲇᛲ;->ᛱᛳᲇ(Ljava/lang/String;II)I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-virtual {v0, v1}, Lyyds/ᲀᲇᲁᲈ;->ᛲᛱᲁᛳ(I)Lyyds/ᛴᲇᛴᛲ;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lyyds/ᲇᛷᛶᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲇᛴᛲ;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "Cannot be invoked on Dispatchers.IO"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᲈᛱᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛲ;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lyyds/ᲇᛷᛶᛲ;->ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "Dispatchers.IO"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᲇᛷᛶᛲ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲇᛴᛲ;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lyyds/ᛴᲇᛴᛲ;->ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
