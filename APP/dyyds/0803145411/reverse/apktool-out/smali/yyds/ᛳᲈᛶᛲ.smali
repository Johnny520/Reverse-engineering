.class public final Lyyds/ᛳᲈᛶᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛵᛸᛸᛷ:Ljava/util/ArrayDeque;


# instance fields
.field public ᛲᲈᲁ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayDeque;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛳᲈᛶᛲ;->ᛵᛸᛸᛷ:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    return-void
.end method

.method public static ᛲᲈᲁ(Ljava/lang/Object;)Lyyds/ᛳᲈᛶᛲ;
    .locals 2

    .line 1
    sget-object v0, Lyyds/ᛳᲈᛶᛲ;->ᛵᛸᛸᛷ:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    check-cast v1, Lyyds/ᛳᲈᛶᛲ;

    .line 9
    .line 10
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lyyds/ᛳᲈᛶᛲ;

    .line 14
    .line 15
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iput-object p0, v1, Lyyds/ᛳᲈᛶᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 19
    .line 20
    return-object v1

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    throw p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᛳᲈᛶᛲ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛳᲈᛶᛲ;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛳᲈᛶᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p1, p1, Lyyds/ᛳᲈᛶᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᛳᲈᛶᛲ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
