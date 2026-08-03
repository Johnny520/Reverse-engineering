.class public final synthetic Lhb/z;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lfg/l;IIIIII)V
    .locals 0

    .line 1
    iput p7, p0, Lhb/z;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lhb/z;->m:Lfg/l;

    .line 4
    .line 5
    iput p2, p0, Lhb/z;->h:I

    .line 6
    .line 7
    iput p3, p0, Lhb/z;->i:I

    .line 8
    .line 9
    iput p4, p0, Lhb/z;->j:I

    .line 10
    .line 11
    iput p5, p0, Lhb/z;->k:I

    .line 12
    .line 13
    iput p6, p0, Lhb/z;->l:I

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lhb/z;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x1

    .line 17
    iget v2, p0, Lhb/z;->h:I

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    iget v2, p0, Lhb/z;->i:I

    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x5

    .line 29
    iget v2, p0, Lhb/z;->j:I

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 32
    .line 33
    .line 34
    const/16 v1, 0xb

    .line 35
    .line 36
    iget v2, p0, Lhb/z;->k:I

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 39
    .line 40
    .line 41
    const/16 v1, 0xc

    .line 42
    .line 43
    iget v2, p0, Lhb/z;->l:I

    .line 44
    .line 45
    invoke-virtual {v0, v1, v2}, Ljava/util/Calendar;->set(II)V

    .line 46
    .line 47
    .line 48
    const/16 v1, 0xd

    .line 49
    .line 50
    invoke-virtual {v0, v1, p1}, Ljava/util/Calendar;->set(II)V

    .line 51
    .line 52
    .line 53
    const/16 p1, 0xe

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    invoke-virtual {v0, p1, v1}, Ljava/util/Calendar;->set(II)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iget-object v0, p0, Lhb/z;->m:Lfg/l;

    .line 68
    .line 69
    invoke-interface {v0, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_0
    iget-object v0, p0, Lhb/z;->m:Lfg/l;

    .line 76
    .line 77
    check-cast v0, Lhb/a0;

    .line 78
    .line 79
    check-cast p1, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget v2, p0, Lhb/z;->h:I

    .line 90
    .line 91
    iget v3, p0, Lhb/z;->i:I

    .line 92
    .line 93
    iget v4, p0, Lhb/z;->j:I

    .line 94
    .line 95
    iget v5, p0, Lhb/z;->k:I

    .line 96
    .line 97
    iget v6, p0, Lhb/z;->l:I

    .line 98
    .line 99
    invoke-virtual/range {v1 .. v7}, Ljava/util/Calendar;->set(IIIIII)V

    .line 100
    .line 101
    .line 102
    const/16 p1, 0xe

    .line 103
    .line 104
    const/4 v2, 0x0

    .line 105
    invoke-virtual {v1, p1, v2}, Ljava/util/Calendar;->set(II)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 109
    .line 110
    .line 111
    move-result-wide v1

    .line 112
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {v0, p1}, Lhb/a0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
