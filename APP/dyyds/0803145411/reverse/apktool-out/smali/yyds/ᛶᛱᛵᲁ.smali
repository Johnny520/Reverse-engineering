.class public final Lyyds/ᛶᛱᛵᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛱᛸᛵ;
.implements Lyyds/ᲀᛸᛶᲀ;


# static fields
.field public static final ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;


# instance fields
.field public ᛲᛴᛳᛲ:Z

.field public final ᲀᛲᛳᲀ:Lyyds/ᛵᲁᛵᲁ;

.field public ᲇᲇᲇᛱ:Z

.field public ᲇᲈᛵᛷ:Lyyds/ᲁᛱᛸᛵ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛱᛵᲈᲁ;

    .line 2
    .line 3
    const/16 v1, 0x14

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lyyds/ᛱᛵᲈᲁ;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v0}, Lyyds/ᲁᛴᛵᛱ;->ᛷᲈᲈᲁ(ILyyds/ᛶᲁᛸᛷ;)Lyyds/ᛳᛷᲀᛴ;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lyyds/ᛶᛱᛵᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛵᲁᛵᲁ;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲁᛵᲁ;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛱᛸᛵ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲁᛱᛸᛵ;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final declared-synchronized ᛲᛴᛳᛲ()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲁᛵᲁ;

    .line 3
    .line 4
    invoke-virtual {v0}, Lyyds/ᛵᲁᛵᲁ;->ᛲᲈᲁ()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲇᲇᲇᛱ:Z

    .line 9
    .line 10
    iget-boolean v0, p0, Lyyds/ᛶᛱᛵᲁ;->ᛲᛴᛳᛲ:Z

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛱᛸᛵ;

    .line 15
    .line 16
    invoke-interface {v0}, Lyyds/ᲁᛱᛸᛵ;->ᛲᛴᛳᛲ()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-object v0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛱᛸᛵ;

    .line 21
    .line 22
    sget-object v0, Lyyds/ᛶᛱᛵᲁ;->ᛶᛷᛲᲁ:Lyyds/ᛳᛷᲀᛴ;

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lyyds/ᛳᛷᲀᛴ;->ᛵᛸᛸᛷ(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    :goto_0
    monitor-exit p0

    .line 31
    return-void

    .line 32
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    throw v0
.end method

.method public final declared-synchronized ᛲᲈᲁ()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲁᛵᲁ;

    .line 3
    .line 4
    invoke-virtual {v0}, Lyyds/ᛵᲁᛵᲁ;->ᛲᲈᲁ()V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Lyyds/ᛶᛱᛵᲁ;->ᛲᛴᛳᛲ:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lyyds/ᛶᛱᛵᲁ;->ᛲᛴᛳᛲ:Z

    .line 13
    .line 14
    iget-boolean v0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲇᲇᲇᛱ:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Lyyds/ᛶᛱᛵᲁ;->ᛲᛴᛳᛲ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_0
    move-exception v0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    :goto_0
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :cond_1
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 27
    .line 28
    const-string v1, "Already unlocked"

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0

    .line 34
    :goto_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw v0
.end method

.method public final ᛵᛸᛸᛷ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛱᛸᛵ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲁᛱᛸᛵ;->ᛵᛸᛸᛷ()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final ᲀᛲᛳᲀ()Lyyds/ᛵᲁᛵᲁ;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲁᛵᲁ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲇᲈᛵᛷ()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛶᛱᛵᲁ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛱᛸᛵ;

    .line 2
    .line 3
    invoke-interface {p0}, Lyyds/ᲁᛱᛸᛵ;->ᲇᲈᛵᛷ()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
