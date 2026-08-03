.class public final synthetic Lwb/ft;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/io/Serializable;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Lfb/y;

.field public final synthetic o:I

.field public final synthetic p:I

.field public final synthetic q:Landroid/content/Context;

.field public final synthetic r:Li0/a1;

.field public final synthetic s:Li0/a1;

.field public final synthetic t:Li0/a1;

.field public final synthetic u:Li0/a1;

.field public final synthetic v:Li0/a1;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Lwb/yt;

.field public final synthetic y:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/io/Serializable;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lfb/y;IILandroid/content/Context;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Ljava/lang/String;Lwb/yt;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ft;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ft;->h:Ljava/io/Serializable;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/ft;->i:Li0/a1;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/ft;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/ft;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/ft;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/ft;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/ft;->n:Lfb/y;

    .line 19
    .line 20
    iput p9, p0, Lwb/ft;->o:I

    .line 21
    .line 22
    iput p10, p0, Lwb/ft;->p:I

    .line 23
    .line 24
    iput-object p11, p0, Lwb/ft;->q:Landroid/content/Context;

    .line 25
    .line 26
    iput-object p12, p0, Lwb/ft;->r:Li0/a1;

    .line 27
    .line 28
    iput-object p13, p0, Lwb/ft;->s:Li0/a1;

    .line 29
    .line 30
    iput-object p14, p0, Lwb/ft;->t:Li0/a1;

    .line 31
    .line 32
    iput-object p15, p0, Lwb/ft;->u:Li0/a1;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lwb/ft;->v:Li0/a1;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lwb/ft;->w:Ljava/lang/String;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lwb/ft;->x:Lwb/yt;

    .line 45
    .line 46
    move-object/from16 p1, p19

    .line 47
    .line 48
    iput-object p1, p0, Lwb/ft;->y:Li0/a1;

    .line 49
    .line 50
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    iget-object v0, p0, Lwb/ft;->i:Li0/a1;

    .line 2
    .line 3
    invoke-interface {v0}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    iget-object v2, p0, Lwb/ft;->g:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v1, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_3

    .line 18
    .line 19
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    iget-object v2, p0, Lwb/ft;->j:Li0/a1;

    .line 22
    .line 23
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const-wide/16 v1, 0x0

    .line 27
    .line 28
    iget-object v3, p0, Lwb/ft;->k:Li0/a1;

    .line 29
    .line 30
    invoke-static {v3, v1, v2}, Lwb/y2;->L0(Li0/a1;J)V

    .line 31
    .line 32
    .line 33
    const-string v1, ""

    .line 34
    .line 35
    invoke-interface {v0, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    iget-object v2, p0, Lwb/ft;->l:Li0/a1;

    .line 40
    .line 41
    invoke-static {v2, v0}, Lwb/y2;->T0(Li0/a1;I)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    iget-object v2, p0, Lwb/ft;->m:Li0/a1;

    .line 46
    .line 47
    invoke-interface {v2, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lwb/ft;->h:Ljava/io/Serializable;

    .line 51
    .line 52
    instance-of v2, v0, Lsf/f;

    .line 53
    .line 54
    iget-object v3, p0, Lwb/ft;->q:Landroid/content/Context;

    .line 55
    .line 56
    const/4 v4, 0x1

    .line 57
    if-nez v2, :cond_3

    .line 58
    .line 59
    move-object v2, v0

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 63
    .line 64
    iget-object v6, p0, Lwb/ft;->n:Lfb/y;

    .line 65
    .line 66
    invoke-static {v2, v5, v6, v1, v1}, Lfb/w;->j(Ljava/lang/String;Ljava/util/List;Lfb/y;Ljava/lang/String;Ljava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v5

    .line 70
    iget v6, p0, Lwb/ft;->o:I

    .line 71
    .line 72
    if-ge v5, v6, :cond_2

    .line 73
    .line 74
    iget-object v7, p0, Lwb/ft;->r:Li0/a1;

    .line 75
    .line 76
    invoke-interface {v7, v2}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v2, p0, Lwb/ft;->s:Li0/a1;

    .line 80
    .line 81
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    iget-object v2, p0, Lwb/ft;->t:Li0/a1;

    .line 85
    .line 86
    invoke-interface {v2, v1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    iget-object v1, p0, Lwb/ft;->u:Li0/a1;

    .line 90
    .line 91
    invoke-interface {v1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    iget v7, p0, Lwb/ft;->p:I

    .line 102
    .line 103
    if-le v7, v2, :cond_1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_1
    move v2, v7

    .line 107
    :goto_0
    iget-object v7, p0, Lwb/ft;->v:Li0/a1;

    .line 108
    .line 109
    invoke-static {v7, v2}, Lwb/y2;->X0(Li0/a1;I)V

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, Lwb/ft;->w:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v7, p0, Lwb/ft;->x:Lwb/yt;

    .line 115
    .line 116
    iget-object v8, p0, Lwb/ft;->y:Li0/a1;

    .line 117
    .line 118
    invoke-static {v2, v3, v7, v1, v8}, Lwb/y2;->q1(Ljava/lang/String;Landroid/content/Context;Lwb/yt;Li0/a1;Li0/a1;)V

    .line 119
    .line 120
    .line 121
    const-string v1, " \u2192 "

    .line 122
    .line 123
    const-string v2, " Token"

    .line 124
    .line 125
    const-string v7, "\u4e0a\u4e0b\u6587\u5df2\u538b\u7f29\uff1a"

    .line 126
    .line 127
    invoke-static {v6, v5, v7, v1, v2}, Leh/a;->k(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    invoke-static {v3, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_2
    const-string v1, "\u538b\u7f29\u7ed3\u679c\u672a\u51cf\u5c11\u4e0a\u4e0b\u6587\uff0c\u5df2\u4fdd\u7559\u539f\u4e0a\u4e0b\u6587"

    .line 140
    .line 141
    invoke-static {v3, v1, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v1}, Landroid/widget/Toast;->show()V

    .line 146
    .line 147
    .line 148
    :cond_3
    :goto_1
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    if-eqz v0, :cond_5

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    if-eqz v0, :cond_4

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_4
    const-string v0, "\u4e0a\u4e0b\u6587\u538b\u7f29\u5931\u8d25"

    .line 162
    .line 163
    :goto_2
    invoke-static {v3, v0, v4}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 168
    .line 169
    .line 170
    :cond_5
    :goto_3
    return-void
.end method
