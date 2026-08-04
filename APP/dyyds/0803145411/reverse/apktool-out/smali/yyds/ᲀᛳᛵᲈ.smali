.class public final Lyyds/ᲀᛳᛵᲈ;
.super Lyyds/ᛵᛷᛲᲀ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lyyds/ᛵᛷᛲᲀ;-><init>(I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lyyds/ᲀᛳᛵᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛱᲈᲁ()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛳᛵᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-super {p0}, Lyyds/ᛵᛷᛲᲀ;->ᛱᲈᲁ()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit v0

    .line 9
    return-object p0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    monitor-exit v0

    .line 12
    throw p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᲀᛳᛵᲈ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-super {p0, p1}, Lyyds/ᛵᛷᛲᲀ;->ᛵᛸᛸᛷ(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit v0

    .line 9
    return p0

    .line 10
    :catchall_0
    move-exception p0

    .line 11
    monitor-exit v0

    .line 12
    throw p0
.end method
