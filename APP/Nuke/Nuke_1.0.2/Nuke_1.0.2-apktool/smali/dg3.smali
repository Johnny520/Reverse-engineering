.class public abstract Ldg3;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Landroid/view/ViewGroup$LayoutParams;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    const/4 v1, -0x2

    .line 4
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldg3;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(Lo2;Llx;Lkw;)Lbg3;
    .locals 7

    .line 1
    sget-object v0, Liq0;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v3, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x6

    .line 13
    invoke-static {v2, v0, v3}, Lfg1;->a(IILhn;)Ljn;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sget-object v4, Lvb;->t:Lhx2;

    .line 18
    .line 19
    invoke-virtual {v4}, Lhx2;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    check-cast v4, La20;

    .line 24
    .line 25
    invoke-static {v4}, Lte;->e(La20;)Ls00;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    new-instance v5, Lb2;

    .line 30
    .line 31
    const/16 v6, 0x9

    .line 32
    .line 33
    invoke-direct {v5, v0, v3, v6}, Lb2;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 34
    .line 35
    .line 36
    const/4 v6, 0x3

    .line 37
    invoke-static {v4, v3, v5, v6}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 38
    .line 39
    .line 40
    new-instance v4, Lv5;

    .line 41
    .line 42
    const/16 v5, 0xb

    .line 43
    .line 44
    invoke-direct {v4, v5, v0}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lds2;->c:Ljava/lang/Object;

    .line 48
    .line 49
    monitor-enter v0

    .line 50
    :try_start_0
    sget-object v5, Lds2;->i:Ljava/util/List;

    .line 51
    .line 52
    invoke-static {v5, v4}, Ldu;->y0(Ljava/util/List;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    sput-object v4, Lds2;->i:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    monitor-exit v0

    .line 59
    invoke-static {}, Lds2;->a()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p0

    .line 64
    monitor-exit v0

    .line 65
    throw p0

    .line 66
    :cond_0
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-lez v0, :cond_3

    .line 71
    .line 72
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    instance-of v1, v0, Lb7;

    .line 77
    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    check-cast v0, Lb7;

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_1
    move-object v0, v3

    .line 84
    :goto_1
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-virtual {v0, p1}, Lb7;->setComposeViewContext(Llx;)V

    .line 87
    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_2
    :goto_2
    move-object v0, v3

    .line 91
    goto :goto_3

    .line 92
    :cond_3
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :goto_3
    if-nez v0, :cond_4

    .line 97
    .line 98
    new-instance v0, Lb7;

    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {v0, v1, p1}, Lb7;-><init>(Landroid/content/Context;Llx;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Lb7;->getView()Landroid/view/View;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    sget-object v4, Ldg3;->a:Landroid/view/ViewGroup$LayoutParams;

    .line 112
    .line 113
    invoke-virtual {p0, v1, v4}, Lo2;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    .line 115
    .line 116
    :cond_4
    invoke-virtual {v0, p1}, Lb7;->setComposeViewContext(Llx;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Lo2;->getComposeViewContext$ui()Llx;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    if-eqz p0, :cond_5

    .line 124
    .line 125
    invoke-virtual {p1}, Llx;->c()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2}, Lb7;->setComposeViewContextIncrementedDuringInit$ui(Z)V

    .line 129
    .line 130
    .line 131
    :cond_5
    const p0, 0x79080086

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, p0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    instance-of v2, v1, Lbg3;

    .line 139
    .line 140
    if-eqz v2, :cond_6

    .line 141
    .line 142
    move-object v3, v1

    .line 143
    check-cast v3, Lbg3;

    .line 144
    .line 145
    :cond_6
    if-nez v3, :cond_7

    .line 146
    .line 147
    new-instance v3, Lbg3;

    .line 148
    .line 149
    new-instance v1, Ls73;

    .line 150
    .line 151
    invoke-virtual {v0}, Lb7;->getRoot()Lr61;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-direct {v1, v2}, Ls73;-><init>(Lr61;)V

    .line 156
    .line 157
    .line 158
    iget-object v2, p1, Llx;->b:Lyx;

    .line 159
    .line 160
    new-instance v4, Lfy;

    .line 161
    .line 162
    invoke-direct {v4, v2, v1}, Lfy;-><init>(Lyx;Ls73;)V

    .line 163
    .line 164
    .line 165
    invoke-direct {v3, v0, v4}, Lbg3;-><init>(Lb7;Lfy;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, p0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    :cond_7
    invoke-virtual {v3, p2}, Lbg3;->d(Lmn0;)V

    .line 172
    .line 173
    .line 174
    iget-object p0, p1, Llx;->b:Lyx;

    .line 175
    .line 176
    new-instance p1, Lcg3;

    .line 177
    .line 178
    invoke-direct {p1, p0}, Lcg3;-><init>(Lyx;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0, p1}, Lb7;->setFrameEndScheduler$ui(Lma1;)V

    .line 182
    .line 183
    .line 184
    return-object v3
.end method
