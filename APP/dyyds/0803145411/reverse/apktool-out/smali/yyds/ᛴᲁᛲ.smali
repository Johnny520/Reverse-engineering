.class public final Lyyds/ᛴᲁᛲ;
.super Lyyds/ᛸᛴᛵᛶ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲈᲇᲈᲇ;


# static fields
.field public static final ᲇᲈᛵᛷ:Lyyds/ᛴᲁᛲ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛴᲁᛲ;

    .line 2
    .line 3
    sget-object v1, Lyyds/ᛷᛶᲇᲁ;->ᲇᲇᲇᛱ:Lyyds/ᛷᛶᲇᲁ;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛸᛴᛵᛶ;-><init>(Lyyds/ᲁᛸᛲᲁ;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyyds/ᛴᲁᛲ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲁᛲ;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final start()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "NonCancellable"

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᛲᲈᲁ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᛵᛶᛲᲀ()Ljava/util/concurrent/CancellationException;
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string v0, "This job is always active"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public final ᛵᲀᲈᛴ(Ljava/util/concurrent/CancellationException;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final native ᛷᲈᲈᲁ(ZZLyyds/ᲈᛳᲀᲈ;)Lyyds/ᛴᲇᛲᛱ;
.end method

.method public final ᲇᛱᛲ(Lyyds/ᛴᲈᛱᛷ;)Lyyds/ᲁᲁᛴᛷ;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᲁᲀᲈᲇ;->ᲀᛲᛳᲀ:Lyyds/ᲁᲀᲈᲇ;

    .line 2
    .line 3
    return-object p0
.end method
