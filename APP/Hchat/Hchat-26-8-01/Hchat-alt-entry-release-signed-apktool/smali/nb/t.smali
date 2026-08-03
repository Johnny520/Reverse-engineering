.class public final synthetic Lnb/t;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lnb/w;

.field public final synthetic h:I

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(IILnb/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnb/t;->g:Lnb/w;

    .line 5
    .line 6
    iput p1, p0, Lnb/t;->h:I

    .line 7
    .line 8
    iput p2, p0, Lnb/t;->i:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lnb/t;->g:Lnb/w;

    .line 2
    .line 3
    iget-object v1, v0, Lnb/w;->o:Lnb/l;

    .line 4
    .line 5
    if-eqz v1, :cond_9

    .line 6
    .line 7
    invoke-virtual {v0}, Lnb/w;->y()Lnb/z;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "text_speech_enable"

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_9

    .line 18
    .line 19
    invoke-virtual {v0}, Lnb/w;->y()Lnb/z;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "text_speech_volume_control"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Lnb/z;->b(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_0
    iget-object v1, v0, Lnb/w;->v:Lnb/q;

    .line 33
    .line 34
    iget v2, p0, Lnb/t;->h:I

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Landroid/media/VolumeProvider;->setCurrentVolume(I)V

    .line 39
    .line 40
    .line 41
    :cond_1
    iget v1, p0, Lnb/t;->i:I

    .line 42
    .line 43
    if-le v2, v1, :cond_2

    .line 44
    .line 45
    iget-boolean v3, v0, Lnb/w;->r:Z

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-object v3, v0, Lnb/w;->a:Landroid/content/Context;

    .line 51
    .line 52
    const-string v4, "audio"

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    instance-of v4, v3, Landroid/media/AudioManager;

    .line 59
    .line 60
    if-eqz v4, :cond_3

    .line 61
    .line 62
    check-cast v3, Landroid/media/AudioManager;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    const/4 v3, 0x0

    .line 66
    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    iput-object v4, v0, Lnb/w;->x:Ljava/lang/Integer;

    .line 71
    .line 72
    if-eqz v3, :cond_4

    .line 73
    .line 74
    const/4 v4, 0x3

    .line 75
    const/4 v5, 0x0

    .line 76
    :try_start_0
    invoke-virtual {v3, v4, v1, v5}, Landroid/media/AudioManager;->setStreamVolume(III)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    .line 78
    .line 79
    :catchall_0
    :cond_4
    iget-object v3, v0, Lnb/w;->v:Lnb/q;

    .line 80
    .line 81
    if-eqz v3, :cond_5

    .line 82
    .line 83
    invoke-virtual {v3, v1}, Landroid/media/VolumeProvider;->setCurrentVolume(I)V

    .line 84
    .line 85
    .line 86
    :cond_5
    if-ge v2, v1, :cond_6

    .line 87
    .line 88
    iget-boolean v3, v0, Lnb/w;->r:Z

    .line 89
    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    invoke-virtual {v0}, Lnb/w;->z()V

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_6
    if-ge v2, v1, :cond_7

    .line 97
    .line 98
    invoke-virtual {v0}, Lnb/w;->m()V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_7
    if-le v2, v1, :cond_8

    .line 103
    .line 104
    iget-boolean v1, v0, Lnb/w;->r:Z

    .line 105
    .line 106
    if-eqz v1, :cond_8

    .line 107
    .line 108
    invoke-virtual {v0}, Lnb/w;->u()V

    .line 109
    .line 110
    .line 111
    :cond_8
    :goto_1
    return-void

    .line 112
    :cond_9
    :goto_2
    invoke-virtual {v0}, Lnb/w;->o()V

    .line 113
    .line 114
    .line 115
    return-void
.end method
