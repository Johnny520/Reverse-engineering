.class public final Lra/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Landroid/app/Activity;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z

.field public final synthetic j:[I

.field public final synthetic k:I

.field public final synthetic l:Landroid/os/Handler;

.field public final synthetic m:Lra/h;


# direct methods
.method public constructor <init>(Lra/h;Landroid/app/Activity;Ljava/lang/String;Z[IILandroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lra/g;->m:Lra/h;

    .line 5
    .line 6
    iput-object p2, p0, Lra/g;->g:Landroid/app/Activity;

    .line 7
    .line 8
    iput-object p3, p0, Lra/g;->h:Ljava/lang/String;

    .line 9
    .line 10
    iput-boolean p4, p0, Lra/g;->i:Z

    .line 11
    .line 12
    iput-object p5, p0, Lra/g;->j:[I

    .line 13
    .line 14
    iput p6, p0, Lra/g;->k:I

    .line 15
    .line 16
    iput-object p7, p0, Lra/g;->l:Landroid/os/Handler;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-object v0, p0, Lra/g;->g:Landroid/app/Activity;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_8

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    goto/16 :goto_8

    .line 16
    .line 17
    :cond_0
    iget-object v1, p0, Lra/g;->m:Lra/h;

    .line 18
    .line 19
    iget-object v2, p0, Lra/g;->h:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v3, p0, Lra/g;->i:Z

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    :try_start_0
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    invoke-virtual {v5}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-static {v5}, Lra/h;->d(Landroid/view/View;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_1

    .line 37
    .line 38
    goto/16 :goto_7

    .line 39
    .line 40
    :cond_1
    invoke-static {v5}, Lra/h;->h(Landroid/view/View;)Landroid/widget/TextView;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    const/4 v6, 0x0

    .line 45
    if-nez v5, :cond_2

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_2
    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    :goto_0
    instance-of v8, v7, Landroid/view/ViewGroup;

    .line 53
    .line 54
    if-eqz v8, :cond_6

    .line 55
    .line 56
    check-cast v7, Landroid/view/ViewGroup;

    .line 57
    .line 58
    move v8, v4

    .line 59
    :goto_1
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    .line 60
    .line 61
    .line 62
    move-result v9

    .line 63
    if-ge v8, v9, :cond_5

    .line 64
    .line 65
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    if-ne v9, v5, :cond_3

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_3
    invoke-static {v9}, Lra/h;->f(Landroid/view/View;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v9

    .line 76
    if-eqz v9, :cond_4

    .line 77
    .line 78
    move-object v6, v9

    .line 79
    goto :goto_3

    .line 80
    :cond_4
    :goto_2
    add-int/lit8 v8, v8, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_5
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    goto :goto_0

    .line 88
    :cond_6
    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    const-string v7, "\u68c0\u6d4b\u5230\u7ea2\u5305\u9886\u53d6\u6210\u529f: amount="

    .line 94
    .line 95
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    invoke-virtual {v1, v5}, Lra/h;->o(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    iget-object v5, v1, Lra/h;->d:Lna/b;

    .line 109
    .line 110
    if-eqz v5, :cond_7

    .line 111
    .line 112
    invoke-virtual {v5, v2, v6, v3}, Lna/b;->d(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    goto :goto_4

    .line 116
    :catchall_0
    move-exception v0

    .line 117
    goto :goto_6

    .line 118
    :cond_7
    :goto_4
    iget-object v2, v1, Lra/h;->b:Ll3/l;

    .line 119
    .line 120
    const-string v3, "hb_auto_close"

    .line 121
    .line 122
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    .line 124
    .line 125
    :try_start_1
    invoke-virtual {v2}, Ll3/l;->b()Landroid/content/SharedPreferences;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 130
    .line 131
    .line 132
    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 133
    goto :goto_5

    .line 134
    :catchall_1
    move v2, v4

    .line 135
    :goto_5
    if-eqz v2, :cond_8

    .line 136
    .line 137
    :try_start_2
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 138
    .line 139
    .line 140
    goto :goto_8

    .line 141
    :goto_6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v3, "\u68c0\u6d4b\u7ea2\u5305\u6210\u529f\u72b6\u6001\u5f02\u5e38: "

    .line 144
    .line 145
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v1, v0}, Lra/h;->o(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    :goto_7
    iget-object v0, p0, Lra/g;->j:[I

    .line 163
    .line 164
    aget v1, v0, v4

    .line 165
    .line 166
    add-int/lit8 v2, v1, 0x1

    .line 167
    .line 168
    aput v2, v0, v4

    .line 169
    .line 170
    iget v0, p0, Lra/g;->k:I

    .line 171
    .line 172
    if-ge v1, v0, :cond_8

    .line 173
    .line 174
    iget-object v0, p0, Lra/g;->l:Landroid/os/Handler;

    .line 175
    .line 176
    const-wide/16 v1, 0x12c

    .line 177
    .line 178
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 179
    .line 180
    .line 181
    :cond_8
    :goto_8
    return-void
.end method
