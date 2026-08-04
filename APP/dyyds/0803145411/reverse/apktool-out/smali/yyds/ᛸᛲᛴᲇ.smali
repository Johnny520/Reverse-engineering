.class public final synthetic Lyyds/ᛸᛲᛴᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᲁᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛵᲁᲀᲈ;

.field public final synthetic ᲇᲈᛵᛷ:Z


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛵᲁᲀᲈ;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᛲᛴᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲁᲀᲈ;

    .line 5
    .line 6
    iput-boolean p2, p0, Lyyds/ᛸᛲᛴᲇ;->ᲇᲈᛵᛷ:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛸᛲᛴᲇ;->ᲇᲈᛵᛷ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "reader"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "writer"

    .line 9
    .line 10
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v3, "Timed out attempting to acquire a "

    .line 18
    .line 19
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, " connection."

    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, "\n\nWriter pool:\n"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, Lyyds/ᛸᛲᛴᲇ;->ᲀᛲᛳᲀ:Lyyds/ᛵᲁᲀᲈ;

    .line 43
    .line 44
    iget-object v0, p0, Lyyds/ᛵᲁᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲈᲁᛴ;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lyyds/ᛴᲈᲁᛴ;->ᲇᲈᛵᛷ(Ljava/lang/StringBuilder;)V

    .line 47
    .line 48
    .line 49
    const-string v0, "Reader pool:"

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const/16 v0, 0xa

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, Lyyds/ᛵᲁᲀᲈ;->ᲀᛲᛳᲀ:Lyyds/ᛴᲈᲁᛴ;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, Lyyds/ᛴᲈᲁᛴ;->ᲇᲈᛵᛷ(Ljava/lang/StringBuilder;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const/4 v0, 0x5

    .line 69
    :try_start_0
    invoke-static {v0, p0}, Lyyds/ᲁᲀᲈᛸ;->ᲀᛲᛲᲇ(ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x0

    .line 73
    throw p0
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    :catch_0
    move-exception p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 76
    .line 77
    .line 78
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 79
    .line 80
    return-object p0
.end method
