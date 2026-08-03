.class public final synthetic Lwb/pc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p4, p0, Lwb/pc;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/pc;->h:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/pc;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/pc;->j:Li0/a1;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/pc;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lwb/pc;->j:Li0/a1;

    .line 7
    .line 8
    iget-object v4, p0, Lwb/pc;->i:Li0/a1;

    .line 9
    .line 10
    iget-object v5, p0, Lwb/pc;->h:Landroid/content/Context;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v0, Lwb/ho;->u:Ljava/util/List;

    .line 16
    .line 17
    sget-object v6, Ljg/d;->g:Ljg/a;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    sget-object v7, Ljg/d;->g:Ljg/a;

    .line 24
    .line 25
    invoke-virtual {v7, v6}, Ljg/a;->g(I)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    invoke-interface {v4, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lwb/ho;->v:Ljava/util/List;

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    invoke-virtual {v7, v4}, Ljg/a;->g(I)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, Ljava/lang/String;

    .line 53
    .line 54
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    const-string v0, "\u5df2\u968f\u673a\u586b\u5145\u672c\u7fa4\u6587\u672c"

    .line 58
    .line 59
    invoke-static {v5, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :pswitch_0
    instance-of v0, v5, Landroid/app/Activity;

    .line 68
    .line 69
    if-eqz v0, :cond_0

    .line 70
    .line 71
    move-object v0, v5

    .line 72
    check-cast v0, Landroid/app/Activity;

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    const/4 v0, 0x0

    .line 76
    :goto_0
    if-nez v0, :cond_1

    .line 77
    .line 78
    const-string v0, "\u5f53\u524d\u9875\u9762\u65e0\u6cd5\u6253\u5f00\u94c3\u58f0\u9009\u62e9\u5668"

    .line 79
    .line 80
    invoke-static {v5, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_1
    new-instance v2, Lwb/oc;

    .line 89
    .line 90
    invoke-direct {v2, v5, v4, v3}, Lwb/oc;-><init>(Landroid/content/Context;Li0/a1;Li0/a1;)V

    .line 91
    .line 92
    .line 93
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Ljava/lang/Number;

    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    const/4 v5, 0x1

    .line 104
    if-ne v4, v5, :cond_2

    .line 105
    .line 106
    sget-object v3, Lwb/vq;->a:Lwb/vq;

    .line 107
    .line 108
    invoke-virtual {v3, v0, v2}, Lwb/vq;->c(Landroid/app/Activity;Lfg/l;)V

    .line 109
    .line 110
    .line 111
    goto :goto_1

    .line 112
    :cond_2
    sget-object v4, Lwb/vq;->a:Lwb/vq;

    .line 113
    .line 114
    invoke-interface {v3}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    check-cast v3, Ljava/lang/String;

    .line 119
    .line 120
    invoke-virtual {v4, v0, v3, v2}, Lwb/vq;->d(Landroid/app/Activity;Ljava/lang/String;Lfg/l;)V

    .line 121
    .line 122
    .line 123
    :goto_1
    return-object v1

    .line 124
    :pswitch_1
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, Ljava/lang/String;

    .line 129
    .line 130
    invoke-interface {v3, v0}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, Ljava/lang/String;

    .line 138
    .line 139
    new-instance v3, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v4, "\u5df2\u9009\u62e9\u6a21\u578b: "

    .line 142
    .line 143
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-static {v5, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 158
    .line 159
    .line 160
    return-object v1

    .line 161
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
