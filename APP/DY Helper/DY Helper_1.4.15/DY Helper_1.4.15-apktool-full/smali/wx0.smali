.class public final synthetic Lwx0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Ln5;

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Z

.field public final synthetic θ:Z

.field public final synthetic ι:Landroid/app/Activity;

.field public final synthetic κ:I

.field public final synthetic λ:Z

.field public final synthetic μ:Ln;


# direct methods
.method public synthetic constructor <init>(Ln5;Ljava/lang/String;ZZLandroid/app/Activity;IZLn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwx0;->ε:Ln5;

    .line 5
    .line 6
    iput-object p2, p0, Lwx0;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwx0;->η:Z

    .line 9
    .line 10
    iput-boolean p4, p0, Lwx0;->θ:Z

    .line 11
    .line 12
    iput-object p5, p0, Lwx0;->ι:Landroid/app/Activity;

    .line 13
    .line 14
    iput p6, p0, Lwx0;->κ:I

    .line 15
    .line 16
    iput-boolean p7, p0, Lwx0;->λ:Z

    .line 17
    .line 18
    iput-object p8, p0, Lwx0;->μ:Ln;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 12

    .line 1
    iget-object v0, p0, Lwx0;->ε:Ln5;

    .line 2
    .line 3
    iget-object v1, p0, Lwx0;->ζ:Ljava/lang/String;

    .line 4
    .line 5
    iget-boolean v2, p0, Lwx0;->η:Z

    .line 6
    .line 7
    iget-boolean v3, p0, Lwx0;->θ:Z

    .line 8
    .line 9
    iget-object v5, p0, Lwx0;->ι:Landroid/app/Activity;

    .line 10
    .line 11
    iget v9, p0, Lwx0;->κ:I

    .line 12
    .line 13
    iget-boolean v10, p0, Lwx0;->λ:Z

    .line 14
    .line 15
    iget-object v11, p0, Lwx0;->μ:Ln;

    .line 16
    .line 17
    const-string p0, "."

    .line 18
    .line 19
    sget-object v4, Lqy0;->α:Lqy0;

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v0, v1}, Ln5;->Ι(Ljava/lang/String;)Ldy;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-static {v6, v2, v3}, Lqy0;->ф(Ldy;ZZ)Lwy;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    iget-object v0, v7, Lwy;->β:Ljava/lang/String;

    .line 30
    .line 31
    invoke-static {v0}, Lqy0;->ν(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Lq02;->ю(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    sget-object v2, Ljy0;->ε:Ljy0;

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {v4, v5, v3, v2, v1}, Lqy0;->х(Lqy0;Landroid/content/Context;Ljava/lang/Object;Ljy0;Ljava/lang/String;)Lfv;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "\u8bc4\u8bba\u533a\u8868\u60c5\u5305"

    .line 47
    .line 48
    invoke-static {v1, v2}, Lpd2;->γ(Lfv;Ljava/lang/String;)Lfv;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    iget-object v1, v8, Lfv;->β:Ljava/lang/String;

    .line 53
    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance v4, Lsx0;

    .line 73
    .line 74
    invoke-direct/range {v4 .. v11}, Lsx0;-><init>(Landroid/app/Activity;Ldy;Lwy;Lfv;IZLn;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v5, p0, v4}, Lqy0;->τ(Landroid/app/Activity;Ljava/lang/String;La80;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    .line 80
    goto :goto_0

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    move-object p0, v0

    .line 83
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v1, "\u4e0b\u8f7d\u8868\u60c5"

    .line 88
    .line 89
    invoke-static {v5, v0, v1}, Lqy0;->Ж(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    new-instance v1, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v2, "DYHelper: [COMMENT-EMOJI-DL-FAIL] "

    .line 99
    .line 100
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {v0}, Lux;->ζ(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    new-instance v0, Ltx0;

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    invoke-direct {v0, v5, p0, v1}, Ltx0;-><init>(Landroid/app/Activity;Ljava/lang/Throwable;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 120
    .line 121
    .line 122
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 123
    .line 124
    return-object p0
.end method
