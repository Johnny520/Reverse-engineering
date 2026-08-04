.class public final Lyyds/ᛲᛲᛶᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛷᛷ;


# static fields
.field public static final ᛵᛸᛸᛷ:Lyyds/ᲀᲇᲇᛲ;


# instance fields
.field public final ᛲᲈᲁ:Lyyds/ᲀᛵᲁᛴ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x9c4

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lyyds/ᲀᲇᲇᛲ;->ᛲᲈᲁ(Ljava/lang/Object;Ljava/lang/String;)Lyyds/ᲀᲇᲇᛲ;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lyyds/ᛲᛲᛶᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲇᲇᛲ;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lyyds/ᲀᛵᲁᛴ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛲᛲᛶᛵ;->ᛲᲈᲁ:Lyyds/ᲀᛵᲁᛴ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Ljava/lang/Object;IILyyds/ᛴᛳᲀᲈ;)Lyyds/ᛵᲁᛴᛱ;
    .locals 1

    .line 1
    check-cast p1, Lyyds/ᛳᲁᲈᛵ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛲᛲᛶᛵ;->ᛲᲈᲁ:Lyyds/ᲀᛵᲁᛴ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲀᛵᲁᛴ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lyyds/ᲇᛸᛵᛶ;

    .line 8
    .line 9
    invoke-static {p1}, Lyyds/ᛳᲈᛶᛲ;->ᛲᲈᲁ(Ljava/lang/Object;)Lyyds/ᛳᲈᛶᛲ;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p0, p2}, Lyyds/ᲁᛱᲈᛳ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p3

    .line 17
    sget-object v0, Lyyds/ᛳᲈᛶᛲ;->ᛵᛸᛸᛷ:Ljava/util/ArrayDeque;

    .line 18
    .line 19
    monitor-enter v0

    .line 20
    :try_start_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    check-cast p3, Lyyds/ᛳᲁᲈᛵ;

    .line 25
    .line 26
    if-nez p3, :cond_0

    .line 27
    .line 28
    invoke-static {p1}, Lyyds/ᛳᲈᛶᛲ;->ᛲᲈᲁ(Ljava/lang/Object;)Lyyds/ᛳᲈᛶᛲ;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p0, p2, p1}, Lyyds/ᲁᛱᲈᛳ;->ᲇᲈᛵᛷ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move-object p1, p3

    .line 37
    :goto_0
    sget-object p0, Lyyds/ᛲᛲᛶᛵ;->ᛵᛸᛸᛷ:Lyyds/ᲀᲇᲇᛲ;

    .line 38
    .line 39
    invoke-virtual {p4, p0}, Lyyds/ᛴᛳᲀᲈ;->ᲀᛲᛳᲀ(Lyyds/ᲀᲇᲇᛲ;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    new-instance p2, Lyyds/ᛵᲁᛴᛱ;

    .line 50
    .line 51
    new-instance p3, Lyyds/ᛸᲀᛳᛴ;

    .line 52
    .line 53
    invoke-direct {p3, p1, p0}, Lyyds/ᛸᲀᛳᛴ;-><init>(Lyyds/ᛳᲁᲈᛵ;I)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p2, p1, p3}, Lyyds/ᛵᲁᛴᛱ;-><init>(Lyyds/ᛶᲀᛶᲀ;Lyyds/ᛳᲇᛶᲀ;)V

    .line 57
    .line 58
    .line 59
    return-object p2

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw p0
.end method

.method public final ᛵᛸᛸᛷ(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lyyds/ᛳᲁᲈᛵ;

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0
.end method
