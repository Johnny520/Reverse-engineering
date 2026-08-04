.class public abstract Lyyds/ᛲᛴᲈᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᛴᛳᛲ:Lyyds/ᛷᲈᲈᲀ;

.field public final ᛲᲈᲁ:Ljava/lang/Object;

.field public ᛵᛸᛸᛷ:Z

.field public ᲀᛲᛳᲀ:Z

.field public ᲇᲇᲇᛱ:Lyyds/ᛱᛵᛱᛱ;

.field public ᲇᲈᛵᛷ:Z


# direct methods
.method public constructor <init>(Lyyds/ᛷᲈᲈᲀ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p1, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᲈᲀ;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 4

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᛷᲈᲈᲀ;

    .line 2
    .line 3
    invoke-interface {v0}, Lyyds/ᛱᛸᲇᛵ;->getActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v1}, Lyyds/ᛴᛶᲀᛲ;->ᛷᲈᲈᲁ(Landroid/app/Activity;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    new-instance v1, Lyyds/ᛲᛳᛵᛱ;

    .line 15
    .line 16
    const/16 v2, 0xd

    .line 17
    .line 18
    invoke-direct {v1, v2, p0}, Lyyds/ᛲᛳᛵᛱ;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v0}, Lyyds/ᛱᛸᲇᛵ;->getArguments()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    const/16 v3, 0x21

    .line 32
    .line 33
    if-lt v2, v3, :cond_2

    .line 34
    .line 35
    invoke-static {v0}, Lyyds/ᛴᛵᛷᛳ;->ᛷᲈᲈᲁ(Landroid/os/Bundle;)Ljava/util/ArrayList;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    :cond_2
    const-string v2, "request_permissions"

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    if-nez v0, :cond_3

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_4

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lyyds/ᛲᛴᛷᲁ;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    :goto_2
    sget-object v0, Lyyds/ᛵᛷᛶᲁ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 70
    .line 71
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    sget-object v0, Lyyds/ᛵᛷᛶᲁ;->ᛲᲈᲁ:Landroid/os/Handler;

    .line 76
    .line 77
    iget-object p0, p0, Lyyds/ᛲᛴᲈᲈ;->ᛲᲈᲁ:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {v0, v1, p0, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public ᛵᛸᛸᛷ(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public ᲀᛲᛳᲀ(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract ᲇᲈᛵᛷ(Landroid/app/Activity;Ljava/util/ArrayList;I)V
.end method
