.class public final Lyyds/ᛸᛶᛶᛲ;
.super Lyyds/ᛷᛸ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static volatile ᛷᛲᲈᛱ:Lyyds/ᛸᛶᛶᛲ;

.field public static final ᛷᛵᲇᲀ:Lyyds/ᛳᛱᛳᲈ;


# instance fields
.field public final ᛷᲈᲈᲁ:Lyyds/ᛶᲇᛴᛸ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᛳᛱᛳᲈ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᛳᛱᛳᲈ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛸᛶᛶᛲ;->ᛷᛵᲇᲀ:Lyyds/ᛳᛱᛳᲈ;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛶᲇᛴᛸ;

    .line 5
    .line 6
    invoke-direct {v0}, Lyyds/ᛶᲇᛴᛸ;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛸᛶᛶᛲ;->ᛷᲈᲈᲁ:Lyyds/ᛶᲇᛴᛸ;

    .line 10
    .line 11
    return-void
.end method

.method public static ᛱᛳᲇ()Lyyds/ᛸᛶᛶᛲ;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛸᛶᛶᛲ;->ᛷᛲᲈᛱ:Lyyds/ᛸᛶᛶᛲ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lyyds/ᛸᛶᛶᛲ;->ᛷᛲᲈᛱ:Lyyds/ᛸᛶᛶᛲ;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-class v0, Lyyds/ᛸᛶᛶᛲ;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    :try_start_0
    sget-object v1, Lyyds/ᛸᛶᛶᛲ;->ᛷᛲᲈᛱ:Lyyds/ᛸᛶᛶᛲ;

    .line 12
    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    new-instance v1, Lyyds/ᛸᛶᛶᛲ;

    .line 16
    .line 17
    invoke-direct {v1}, Lyyds/ᛸᛶᛶᛲ;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lyyds/ᛸᛶᛶᛲ;->ᛷᛲᲈᛱ:Lyyds/ᛸᛶᛶᛲ;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    sget-object v0, Lyyds/ᛸᛶᛶᛲ;->ᛷᛲᲈᛱ:Lyyds/ᛸᛶᛶᛲ;

    .line 27
    .line 28
    return-object v0

    .line 29
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    throw v1
.end method
