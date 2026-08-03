.class public final synthetic Lia/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Lia/q;

.field public final synthetic i:Landroid/app/Activity;

.field public final synthetic j:Lp8/l;

.field public final synthetic k:I

.field public final synthetic l:Lia/b;


# direct methods
.method public synthetic constructor <init>(Luf/c;Lia/q;Landroid/app/Activity;Lp8/l;ILia/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lia/o;->g:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Lia/o;->h:Lia/q;

    .line 7
    .line 8
    iput-object p3, p0, Lia/o;->i:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p4, p0, Lia/o;->j:Lp8/l;

    .line 11
    .line 12
    iput p5, p0, Lia/o;->k:I

    .line 13
    .line 14
    iput-object p6, p0, Lia/o;->l:Lia/b;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lia/o;->g:Ljava/util/List;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Lsf/e;

    .line 14
    .line 15
    iget-object p1, p1, Lsf/e;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iget-object v2, p0, Lia/o;->h:Lia/q;

    .line 24
    .line 25
    iget-object v3, p0, Lia/o;->i:Landroid/app/Activity;

    .line 26
    .line 27
    iget-object v4, p0, Lia/o;->j:Lp8/l;

    .line 28
    .line 29
    iget v5, p0, Lia/o;->k:I

    .line 30
    .line 31
    iget-object v1, p0, Lia/o;->l:Lia/b;

    .line 32
    .line 33
    sparse-switch v0, :sswitch_data_0

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :sswitch_0
    const-string v0, "\u4fee\u6539\u8bc4\u8bba\u65f6\u95f4"

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-nez p1, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    iget-wide v7, v1, Lia/b;->e:J

    .line 47
    .line 48
    new-instance v1, Lia/i;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    invoke-direct/range {v1 .. v6}, Lia/i;-><init>(Lia/q;Landroid/app/Activity;Lp8/l;II)V

    .line 52
    .line 53
    .line 54
    move-wide v5, v7

    .line 55
    new-instance v8, Lk/s1;

    .line 56
    .line 57
    const/4 p1, 0x7

    .line 58
    invoke-direct {v8, p1}, Lk/s1;-><init>(I)V

    .line 59
    .line 60
    .line 61
    const-string v4, "\u4fee\u6539\u8bc4\u8bba\u65f6\u95f4"

    .line 62
    .line 63
    move-object v7, v1

    .line 64
    invoke-static/range {v3 .. v8}, Lwb/y2;->V1(Landroid/app/Activity;Ljava/lang/String;JLfg/l;Lfg/a;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :sswitch_1
    const-string v0, "\u4fee\u6539\u8bc4\u8bba\u5185\u5bb9"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-nez p1, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {v2, v1}, Lia/q;->a(Lia/b;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    iget-object v0, v1, Lia/b;->d:Ljava/lang/String;

    .line 82
    .line 83
    new-instance v1, Lia/i;

    .line 84
    .line 85
    const/4 v6, 0x2

    .line 86
    invoke-direct/range {v1 .. v6}, Lia/i;-><init>(Lia/q;Landroid/app/Activity;Lp8/l;II)V

    .line 87
    .line 88
    .line 89
    new-instance v11, Lk/s1;

    .line 90
    .line 91
    const/4 v2, 0x7

    .line 92
    invoke-direct {v11, v2}, Lk/s1;-><init>(I)V

    .line 93
    .line 94
    .line 95
    const/16 v12, 0x250

    .line 96
    .line 97
    const-string v4, "\u4fee\u6539\u8bc4\u8bba\u5185\u5bb9"

    .line 98
    .line 99
    const/4 v7, 0x0

    .line 100
    const/16 v8, 0x3e8

    .line 101
    .line 102
    const/4 v9, 0x0

    .line 103
    move-object v5, p1

    .line 104
    move-object v6, v0

    .line 105
    move-object v10, v1

    .line 106
    invoke-static/range {v3 .. v12}, Lwb/y2;->c2(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLfg/l;Lfg/a;I)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :sswitch_2
    const-string v0, "\u4e0b\u79fb"

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-nez p1, :cond_2

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_2
    add-int/lit8 p1, v5, 0x1

    .line 120
    .line 121
    invoke-virtual {v2, v3, v4, v5, p1}, Lia/q;->e(Landroid/app/Activity;Lp8/l;II)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :sswitch_3
    const-string v0, "\u4e0a\u79fb"

    .line 126
    .line 127
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    if-nez p1, :cond_3

    .line 132
    .line 133
    :goto_0
    new-instance p1, Lia/i;

    .line 134
    .line 135
    invoke-direct {p1, v5, v3, v2, v4}, Lia/i;-><init>(ILandroid/app/Activity;Lia/q;Lp8/l;)V

    .line 136
    .line 137
    .line 138
    new-instance v0, Lk/s1;

    .line 139
    .line 140
    const/4 v1, 0x7

    .line 141
    invoke-direct {v0, v1}, Lk/s1;-><init>(I)V

    .line 142
    .line 143
    .line 144
    const-string v1, "\u5220\u9664\u4f2a\u8bc4\u8bba"

    .line 145
    .line 146
    const-string v2, "\u53ea\u4f1a\u5220\u9664\u8fd9\u6761\u672c\u5730\u4f2a\u8bc4\u8bba\u3002"

    .line 147
    .line 148
    invoke-static {v3, v1, v2, p1, v0}, Lwb/y2;->T1(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lfg/l;Lfg/a;)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_3
    add-int/lit8 p1, v5, -0x1

    .line 153
    .line 154
    invoke-virtual {v2, v3, v4, v5, p1}, Lia/q;->e(Landroid/app/Activity;Lp8/l;II)V

    .line 155
    .line 156
    .line 157
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 158
    .line 159
    return-object p1

    .line 160
    nop

    .line 161
    :sswitch_data_0
    .sparse-switch
        0x9ed31 -> :sswitch_3
        0x9ed50 -> :sswitch_2
        0x39030355 -> :sswitch_1
        0x3905b73f -> :sswitch_0
    .end sparse-switch
.end method
