.class public final L۟/fa$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/fa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final ۥ:L۟/fa;


# direct methods
.method public constructor <init>(Landroid/os/Looper;L۟/fa;)V
    .locals 0

    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p2, p0, L۟/fa$a;->ۥ:L۟/fa;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eq v0, v3, :cond_3

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    if-eq v0, v1, :cond_2

    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    if-eq v0, v1, :cond_0

    .line 18
    .line 19
    sget-object v0, L۟/z7;->ۥ۠:L۟/z7$a;

    .line 20
    .line 21
    new-instance v1, L۟/fa$a$a;

    .line 22
    .line 23
    invoke-direct {v1, p1}, L۟/fa$a$a;-><init>(Landroid/os/Message;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, L۟/fa$a;->ۥ:L۟/fa;

    .line 31
    .line 32
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p1, Ljava/lang/Long;

    .line 35
    .line 36
    iget v1, v0, L۟/fa;->ۥ۟ۧ:I

    .line 37
    .line 38
    add-int/2addr v1, v3

    .line 39
    iput v1, v0, L۟/fa;->ۥ۟ۧ:I

    .line 40
    .line 41
    iget-wide v1, v0, L۟/fa;->ۥ۟ۡ:J

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    add-long/2addr v3, v1

    .line 48
    iput-wide v3, v0, L۟/fa;->ۥ۟ۡ:J

    .line 49
    .line 50
    iget p1, v0, L۟/fa;->ۥ۟ۧ:I

    .line 51
    .line 52
    int-to-long v1, p1

    .line 53
    div-long/2addr v3, v1

    .line 54
    iput-wide v3, v0, L۟/fa;->ۥ۟ۤ:J

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object v0, p0, L۟/fa$a;->ۥ:L۟/fa;

    .line 58
    .line 59
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 60
    .line 61
    int-to-long v1, p1

    .line 62
    iget p1, v0, L۟/fa;->ۥ۠:I

    .line 63
    .line 64
    add-int/2addr p1, v3

    .line 65
    iput p1, v0, L۟/fa;->ۥ۠:I

    .line 66
    .line 67
    iget-wide v3, v0, L۟/fa;->ۥۣ۟:J

    .line 68
    .line 69
    add-long/2addr v3, v1

    .line 70
    iput-wide v3, v0, L۟/fa;->ۥۣ۟:J

    .line 71
    .line 72
    iget p1, v0, L۟/fa;->ۥ۟ۨ:I

    .line 73
    .line 74
    int-to-long v1, p1

    .line 75
    div-long/2addr v3, v1

    .line 76
    iput-wide v3, v0, L۟/fa;->ۥ۟ۦ:J

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    iget-object v0, p0, L۟/fa$a;->ۥ:L۟/fa;

    .line 80
    .line 81
    iget p1, p1, Landroid/os/Message;->arg1:I

    .line 82
    .line 83
    int-to-long v1, p1

    .line 84
    iget p1, v0, L۟/fa;->ۥ۟ۨ:I

    .line 85
    .line 86
    add-int/2addr p1, v3

    .line 87
    iput p1, v0, L۟/fa;->ۥ۟ۨ:I

    .line 88
    .line 89
    iget-wide v3, v0, L۟/fa;->ۥ۟ۢ:J

    .line 90
    .line 91
    add-long/2addr v3, v1

    .line 92
    iput-wide v3, v0, L۟/fa;->ۥ۟ۢ:J

    .line 93
    .line 94
    int-to-long v1, p1

    .line 95
    div-long/2addr v3, v1

    .line 96
    iput-wide v3, v0, L۟/fa;->ۥ۟ۥ:J

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    iget-object p1, p0, L۟/fa$a;->ۥ:L۟/fa;

    .line 100
    .line 101
    iget-wide v3, p1, L۟/fa;->ۥ۟۠:J

    .line 102
    .line 103
    add-long/2addr v3, v1

    .line 104
    iput-wide v3, p1, L۟/fa;->ۥ۟۠:J

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_4
    iget-object p1, p0, L۟/fa$a;->ۥ:L۟/fa;

    .line 108
    .line 109
    iget-wide v3, p1, L۟/fa;->ۥ۟۟:J

    .line 110
    .line 111
    add-long/2addr v3, v1

    .line 112
    iput-wide v3, p1, L۟/fa;->ۥ۟۟:J

    .line 113
    .line 114
    :goto_0
    return-void
.end method
