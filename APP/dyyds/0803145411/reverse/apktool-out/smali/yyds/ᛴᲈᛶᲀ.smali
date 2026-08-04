.class public final synthetic Lyyds/ᛴᲈᛶᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/String;

.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛱᛶᛱᛷ;

.field public final synthetic ᲇᲇᲇᛱ:Ljava/lang/Object;

.field public final synthetic ᲇᲈᛵᛷ:F


# direct methods
.method public synthetic constructor <init>(FLjava/lang/Object;Ljava/lang/String;Lyyds/ᛱᛶᛱᛷ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lyyds/ᛴᲈᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛶᛱᛷ;

    .line 5
    .line 6
    iput p1, p0, Lyyds/ᛴᲈᛶᲀ;->ᲇᲈᛵᛷ:F

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛴᲈᛶᲀ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p2, p0, Lyyds/ᛴᲈᛶᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lyyds/ᛴᲈᛶᲀ;->ᲀᛲᛳᲀ:Lyyds/ᛱᛶᛱᛷ;

    .line 2
    .line 3
    iget v1, p0, Lyyds/ᛴᲈᛶᲀ;->ᲇᲈᛵᛷ:F

    .line 4
    .line 5
    iget-object v2, p0, Lyyds/ᛴᲈᛶᲀ;->ᛲᛴᛳᛲ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object p0, p0, Lyyds/ᛴᲈᛶᲀ;->ᲇᲇᲇᛱ:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v3, Lyyds/ᛴᛳᛴᛲ;->ᛲᲈᲁ:Lyyds/ᛴᛳᛴᛲ;

    .line 10
    .line 11
    :try_start_0
    iget-object v4, v0, Lyyds/ᛱᛶᛱᛷ;->ᲀᛲᛳᲀ:Ljava/lang/reflect/Constructor;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v4, v1, v2}, Lyyds/ᛴᛳᛴᛲ;->ᛵᛸᛸᛷ(Ljava/lang/reflect/Constructor;FLjava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v0, v0, Lyyds/ᛱᛶᛱᛷ;->ᛵᛸᛸᛷ:Ljava/lang/reflect/Method;

    .line 21
    .line 22
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    new-instance v0, Lyyds/ᲈᛵᛵᛴ;

    .line 33
    .line 34
    invoke-direct {v0, p0}, Lyyds/ᲈᛵᛵᛴ;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object p0, v0

    .line 38
    :goto_0
    invoke-static {p0}, Lyyds/ᲁᛶᛱᛵ;->ᛲᲈᲁ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    sget-object v0, Lyyds/ᲁᲁᲁᛳ;->ᛲᲈᲁ:Lyyds/ᲁᲁᲁᛳ;

    .line 45
    .line 46
    new-instance v2, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-wide v3, -0x2bec7e68a836eL

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-wide v3, -0x2bedbe68a836eL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v3, v4}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v0, v1, p0}, Lyyds/ᲁᲁᲁᛳ;->ᛵᛸᛸᛷ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :cond_0
    return-void
.end method
