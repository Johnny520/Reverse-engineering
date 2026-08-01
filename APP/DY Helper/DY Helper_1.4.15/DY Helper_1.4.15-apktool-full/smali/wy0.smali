.class public final synthetic Lwy0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ldz0;

.field public final synthetic η:Landroid/widget/ImageView;

.field public final synthetic θ:Ljava/lang/String;

.field public final synthetic ι:Landroid/widget/ProgressBar;

.field public final synthetic κ:Z

.field public final synthetic λ:Laz0;

.field public final synthetic μ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ldz0;Landroid/widget/ImageView;Ljava/lang/String;Landroid/widget/ProgressBar;Landroid/graphics/Bitmap;ZLaz0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwy0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwy0;->ζ:Ldz0;

    .line 8
    .line 9
    iput-object p2, p0, Lwy0;->η:Landroid/widget/ImageView;

    .line 10
    .line 11
    iput-object p3, p0, Lwy0;->θ:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lwy0;->ι:Landroid/widget/ProgressBar;

    .line 14
    .line 15
    iput-object p5, p0, Lwy0;->μ:Ljava/lang/Object;

    .line 16
    .line 17
    iput-boolean p6, p0, Lwy0;->κ:Z

    .line 18
    .line 19
    iput-object p7, p0, Lwy0;->λ:Laz0;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ldz0;Ljava/lang/String;ZLjava/lang/String;Landroid/widget/ImageView;Landroid/widget/ProgressBar;Laz0;)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lwy0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwy0;->ζ:Ldz0;

    iput-object p2, p0, Lwy0;->θ:Ljava/lang/String;

    iput-boolean p3, p0, Lwy0;->κ:Z

    iput-object p4, p0, Lwy0;->μ:Ljava/lang/Object;

    iput-object p5, p0, Lwy0;->η:Landroid/widget/ImageView;

    iput-object p6, p0, Lwy0;->ι:Landroid/widget/ProgressBar;

    iput-object p7, p0, Lwy0;->λ:Laz0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    .line 1
    iget v0, p0, Lwy0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwy0;->ζ:Ldz0;

    .line 7
    .line 8
    iget-object v1, p0, Lwy0;->η:Landroid/widget/ImageView;

    .line 9
    .line 10
    iget-object v2, p0, Lwy0;->θ:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v3, p0, Lwy0;->ι:Landroid/widget/ProgressBar;

    .line 13
    .line 14
    iget-object v4, p0, Lwy0;->μ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v4, Landroid/graphics/Bitmap;

    .line 17
    .line 18
    iget-boolean v5, p0, Lwy0;->κ:Z

    .line 19
    .line 20
    iget-object p0, p0, Lwy0;->λ:Laz0;

    .line 21
    .line 22
    iget-object v6, v0, Ldz0;->α:Landroid/app/Activity;

    .line 23
    .line 24
    invoke-virtual {v6}, Landroid/app/Activity;->isFinishing()Z

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    if-nez v7, :cond_3

    .line 29
    .line 30
    invoke-virtual {v6}, Landroid/app/Activity;->isDestroyed()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-nez v6, :cond_3

    .line 35
    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-static {v6, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    if-eqz v3, :cond_1

    .line 48
    .line 49
    const/16 v2, 0x8

    .line 50
    .line 51
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    :cond_1
    if-eqz v4, :cond_2

    .line 55
    .line 56
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    if-nez v2, :cond_2

    .line 61
    .line 62
    invoke-virtual {v0, v1, v4, v5}, Ldz0;->ε(Landroid/widget/ImageView;Landroid/graphics/Bitmap;Z)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    invoke-virtual {v0, v1, p0, v5}, Ldz0;->η(Landroid/widget/ImageView;Laz0;Z)V

    .line 67
    .line 68
    .line 69
    :cond_3
    :goto_0
    return-void

    .line 70
    :pswitch_0
    iget-object v7, p0, Lwy0;->ζ:Ldz0;

    .line 71
    .line 72
    iget-object v0, p0, Lwy0;->θ:Ljava/lang/String;

    .line 73
    .line 74
    iget-boolean v12, p0, Lwy0;->κ:Z

    .line 75
    .line 76
    iget-object v1, p0, Lwy0;->μ:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v9, v1

    .line 79
    check-cast v9, Ljava/lang/String;

    .line 80
    .line 81
    iget-object v8, p0, Lwy0;->η:Landroid/widget/ImageView;

    .line 82
    .line 83
    iget-object v10, p0, Lwy0;->ι:Landroid/widget/ProgressBar;

    .line 84
    .line 85
    iget-object v13, p0, Lwy0;->λ:Laz0;

    .line 86
    .line 87
    :try_start_0
    sget-object p0, Lwx;->α:Lt41;

    .line 88
    .line 89
    const-string p0, "User-Agent"

    .line 90
    .line 91
    const-string v1, "Mozilla/5.0 (Linux; Android 13) AppleWebKit/537.36 Chrome/120 Mobile Safari/537.36"

    .line 92
    .line 93
    new-instance v2, Ll91;

    .line 94
    .line 95
    invoke-direct {v2, p0, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2}, Lex0;->Λ(Ll91;)Ljava/util/Map;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    const-string v1, "image/avif,image/webp,image/apng,image/*,*/*;q=0.8"

    .line 103
    .line 104
    const/high16 v2, 0xc00000

    .line 105
    .line 106
    invoke-static {v0, p0, v1, v2}, Lwx;->α(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;I)[B

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    const/16 v0, 0xdc

    .line 111
    .line 112
    const/16 v1, 0x3c0

    .line 113
    .line 114
    if-eqz v12, :cond_4

    .line 115
    .line 116
    move v2, v1

    .line 117
    goto :goto_1

    .line 118
    :cond_4
    move v2, v0

    .line 119
    :goto_1
    if-eqz v12, :cond_5

    .line 120
    .line 121
    move v0, v1

    .line 122
    :cond_5
    invoke-static {p0, v2, v0}, Ldz0;->α([BII)Landroid/graphics/Bitmap;

    .line 123
    .line 124
    .line 125
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    goto :goto_2

    .line 127
    :catchall_0
    move-exception v0

    .line 128
    move-object p0, v0

    .line 129
    new-instance v0, Leo1;

    .line 130
    .line 131
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 132
    .line 133
    .line 134
    move-object p0, v0

    .line 135
    :goto_2
    instance-of v0, p0, Leo1;

    .line 136
    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    const/4 p0, 0x0

    .line 140
    :cond_6
    move-object v11, p0

    .line 141
    check-cast v11, Landroid/graphics/Bitmap;

    .line 142
    .line 143
    if-eqz v11, :cond_7

    .line 144
    .line 145
    invoke-virtual {v11}, Landroid/graphics/Bitmap;->isRecycled()Z

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    if-nez p0, :cond_7

    .line 150
    .line 151
    sget-object p0, Ldz0;->ν:Lnq;

    .line 152
    .line 153
    monitor-enter p0

    .line 154
    :try_start_1
    invoke-virtual {p0, v9, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 155
    .line 156
    .line 157
    monitor-exit p0

    .line 158
    goto :goto_3

    .line 159
    :catchall_1
    move-exception v0

    .line 160
    monitor-exit p0

    .line 161
    throw v0

    .line 162
    :cond_7
    :goto_3
    iget-object p0, v7, Ldz0;->α:Landroid/app/Activity;

    .line 163
    .line 164
    new-instance v6, Lwy0;

    .line 165
    .line 166
    invoke-direct/range {v6 .. v13}, Lwy0;-><init>(Ldz0;Landroid/widget/ImageView;Ljava/lang/String;Landroid/widget/ProgressBar;Landroid/graphics/Bitmap;ZLaz0;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v6}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
