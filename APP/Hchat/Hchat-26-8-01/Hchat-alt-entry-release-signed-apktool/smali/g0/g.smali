.class public final synthetic Lg0/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lv1/b1;


# direct methods
.method public synthetic constructor <init>(Lv1/b1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lg0/g;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lg0/g;->h:Lv1/b1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lg0/g;->g:I

    .line 2
    .line 3
    check-cast p1, Lv1/a1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iget-object v1, p0, Lg0/g;->h:Lv1/b1;

    .line 10
    .line 11
    invoke-static {p1, v1, v0, v0}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 12
    .line 13
    .line 14
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    const/4 v0, 0x0

    .line 18
    iget-object v1, p0, Lg0/g;->h:Lv1/b1;

    .line 19
    .line 20
    invoke-static {p1, v1, v0, v0}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_1
    const/4 v0, 0x0

    .line 25
    iget-object v1, p0, Lg0/g;->h:Lv1/b1;

    .line 26
    .line 27
    invoke-static {p1, v1, v0, v0}, Lv1/a1;->B(Lv1/a1;Lv1/b1;II)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_2
    const/4 v0, 0x0

    .line 32
    iget-object v1, p0, Lg0/g;->h:Lv1/b1;

    .line 33
    .line 34
    invoke-static {p1, v1, v0, v0}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_3
    const/4 v0, 0x0

    .line 39
    iget-object v1, p0, Lg0/g;->h:Lv1/b1;

    .line 40
    .line 41
    invoke-static {p1, v1, v0, v0}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :pswitch_4
    invoke-virtual {p1}, Lv1/a1;->m()Lu2/m;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Lu2/m;->g:Lu2/m;

    .line 50
    .line 51
    iget-object v2, p0, Lg0/g;->h:Lv1/b1;

    .line 52
    .line 53
    const-wide/16 v3, 0x0

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    const/4 v6, 0x0

    .line 57
    if-eq v0, v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {p1}, Lv1/a1;->w()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    invoke-virtual {p1}, Lv1/a1;->w()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget v1, v2, Lv1/b1;->g:I

    .line 71
    .line 72
    sub-int/2addr v0, v1

    .line 73
    long-to-int v1, v3

    .line 74
    sub-int/2addr v0, v1

    .line 75
    int-to-long v3, v0

    .line 76
    const/16 v0, 0x20

    .line 77
    .line 78
    shl-long/2addr v3, v0

    .line 79
    int-to-long v0, v1

    .line 80
    const-wide v7, 0xffffffffL

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    and-long/2addr v0, v7

    .line 86
    or-long/2addr v0, v3

    .line 87
    invoke-static {p1, v2}, Lv1/a1;->e(Lv1/a1;Lv1/b1;)V

    .line 88
    .line 89
    .line 90
    iget-wide v3, v2, Lv1/b1;->k:J

    .line 91
    .line 92
    invoke-static {v0, v1, v3, v4}, Lu2/j;->d(JJ)J

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    invoke-virtual {v2, v0, v1, v5, v6}, Lv1/b1;->A0(JFLfg/l;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_1
    :goto_1
    invoke-static {p1, v2}, Lv1/a1;->e(Lv1/a1;Lv1/b1;)V

    .line 101
    .line 102
    .line 103
    iget-wide v0, v2, Lv1/b1;->k:J

    .line 104
    .line 105
    invoke-static {v3, v4, v0, v1}, Lu2/j;->d(JJ)J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    invoke-virtual {v2, v0, v1, v5, v6}, Lv1/b1;->A0(JFLfg/l;)V

    .line 110
    .line 111
    .line 112
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 113
    .line 114
    return-object p1

    .line 115
    :pswitch_5
    const/4 v0, 0x0

    .line 116
    iget-object v1, p0, Lg0/g;->h:Lv1/b1;

    .line 117
    .line 118
    invoke-static {p1, v1, v0, v0}, Lv1/a1;->E(Lv1/a1;Lv1/b1;II)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :pswitch_6
    const/4 v0, 0x0

    .line 123
    iget-object v1, p0, Lg0/g;->h:Lv1/b1;

    .line 124
    .line 125
    invoke-static {p1, v1, v0, v0}, Lv1/a1;->B(Lv1/a1;Lv1/b1;II)V

    .line 126
    .line 127
    .line 128
    goto :goto_0

    .line 129
    :pswitch_7
    const/4 v0, 0x0

    .line 130
    iget-object v1, p0, Lg0/g;->h:Lv1/b1;

    .line 131
    .line 132
    invoke-static {p1, v1, v0, v0}, Lv1/a1;->B(Lv1/a1;Lv1/b1;II)V

    .line 133
    .line 134
    .line 135
    goto :goto_0

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
