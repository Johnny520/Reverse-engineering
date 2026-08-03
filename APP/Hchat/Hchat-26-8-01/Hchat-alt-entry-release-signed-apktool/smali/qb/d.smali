.class public final synthetic Lqb/d;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/app/Activity;

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lqb/k;Lgg/s;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lqb/d;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqb/d;->h:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lqb/d;->j:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lqb/d;->k:Ljava/lang/Object;

    .line 12
    .line 13
    iput p4, p0, Lqb/d;->i:I

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Landroid/view/ViewGroup;Landroid/app/Activity;I)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lqb/d;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqb/d;->j:Ljava/lang/Object;

    iput-object p2, p0, Lqb/d;->k:Ljava/lang/Object;

    iput-object p3, p0, Lqb/d;->h:Landroid/app/Activity;

    iput p4, p0, Lqb/d;->i:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lqb/d;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqb/d;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lqb/d;->k:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    const-string v2, "ID: "

    .line 15
    .line 16
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    new-instance v3, Lca/s;

    .line 21
    .line 22
    const/16 v4, 0x12

    .line 23
    .line 24
    invoke-direct {v3, v2, v4}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v3}, Luf/d;->p(Landroid/view/ViewGroup;Lfg/l;)Landroid/widget/TextView;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v2, Lca/s;

    .line 35
    .line 36
    const/16 v3, 0x13

    .line 37
    .line 38
    invoke-direct {v2, v0, v3}, Lca/s;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v1, v2}, Luf/d;->p(Landroid/view/ViewGroup;Lfg/l;)Landroid/widget/TextView;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    :goto_0
    iget-object v1, p0, Lqb/d;->h:Landroid/app/Activity;

    .line 46
    .line 47
    const/4 v3, 0x1

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    new-instance v4, Lva/a;

    .line 51
    .line 52
    const/4 v5, 0x0

    .line 53
    invoke-direct {v4, v1, v0, v5}, Lva/a;-><init>(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v3}, Landroid/view/View;->setClickable(Z)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    invoke-virtual {v2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 64
    .line 65
    .line 66
    move v1, v0

    .line 67
    :goto_1
    if-eqz v2, :cond_3

    .line 68
    .line 69
    const/4 v5, 0x5

    .line 70
    if-ge v1, v5, :cond_3

    .line 71
    .line 72
    invoke-virtual {v2, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v3}, Landroid/view/View;->setClickable(Z)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    instance-of v5, v2, Landroid/view/View;

    .line 86
    .line 87
    if-eqz v5, :cond_1

    .line 88
    .line 89
    check-cast v2, Landroid/view/View;

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_1
    const/4 v2, 0x0

    .line 93
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    iget v2, p0, Lqb/d;->i:I

    .line 97
    .line 98
    add-int/2addr v2, v3

    .line 99
    const/16 v3, 0x8

    .line 100
    .line 101
    if-ge v2, v3, :cond_3

    .line 102
    .line 103
    invoke-static {v1, v0, v2}, Luf/d;->h(Landroid/app/Activity;Ljava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    :cond_3
    return-void

    .line 107
    :pswitch_0
    iget-object v0, p0, Lqb/d;->j:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v0, Lqb/k;

    .line 110
    .line 111
    iget-object v1, p0, Lqb/d;->k:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Lgg/s;

    .line 114
    .line 115
    iget-object v2, p0, Lqb/d;->h:Landroid/app/Activity;

    .line 116
    .line 117
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    if-nez v3, :cond_4

    .line 122
    .line 123
    iget v1, v1, Lgg/s;->g:I

    .line 124
    .line 125
    new-instance v3, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v4, "\u8bed\u97f3\u8f6c\u53d1\u5b8c\u6210: "

    .line 128
    .line 129
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    const-string v1, "/"

    .line 136
    .line 137
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    iget v1, p0, Lqb/d;->i:I

    .line 141
    .line 142
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    invoke-static {v2, v1}, Lqb/k;->N(Landroid/app/Activity;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    :cond_4
    return-void

    .line 156
    nop

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
