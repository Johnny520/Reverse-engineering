.class public final synthetic Lh0/h1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lu2/c;

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lu2/c;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lh0/h1;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lh0/h1;->h:Lu2/c;

    .line 4
    .line 5
    iput-object p2, p0, Lh0/h1;->i:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lh0/h1;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lfg/a;

    .line 7
    .line 8
    new-instance v0, Lh0/g1;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p1, v1}, Lh0/g1;-><init>(Lfg/a;I)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Lh0/h1;

    .line 15
    .line 16
    iget-object v2, p0, Lh0/h1;->h:Lu2/c;

    .line 17
    .line 18
    iget-object v3, p0, Lh0/h1;->i:Li0/a1;

    .line 19
    .line 20
    invoke-direct {p1, v2, v3, v1}, Lh0/h1;-><init>(Lu2/c;Li0/a1;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lk/c1;->a()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 30
    .line 31
    const/16 v2, 0x1c

    .line 32
    .line 33
    if-ne v1, v2, :cond_0

    .line 34
    .line 35
    sget-object v1, Lk/q1;->b:Lk/q1;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    sget-object v1, Lk/q1;->c:Lk/q1;

    .line 39
    .line 40
    :goto_0
    invoke-static {}, Lk/c1;->a()Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    new-instance v2, Lk/z0;

    .line 47
    .line 48
    invoke-direct {v2, v0, p1, v1}, Lk/z0;-><init>(Lh0/g1;Lh0/h1;Lk/o1;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    sget-object v2, Ly0/l;->a:Ly0/l;

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    const-string p1, "Magnifier is only supported on API level 28 and higher."

    .line 56
    .line 57
    invoke-static {p1}, Lj8/o;->w(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    :goto_1
    return-object v2

    .line 62
    :pswitch_0
    check-cast p1, Lu2/h;

    .line 63
    .line 64
    iget-wide v0, p1, Lu2/h;->a:J

    .line 65
    .line 66
    invoke-static {v0, v1}, Lu2/h;->b(J)F

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v1, p0, Lh0/h1;->h:Lu2/c;

    .line 71
    .line 72
    invoke-interface {v1, v0}, Lu2/c;->G0(F)I

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    iget-wide v2, p1, Lu2/h;->a:J

    .line 77
    .line 78
    invoke-static {v2, v3}, Lu2/h;->a(J)F

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-interface {v1, p1}, Lu2/c;->G0(F)I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    int-to-long v0, v0

    .line 87
    const/16 v2, 0x20

    .line 88
    .line 89
    shl-long/2addr v0, v2

    .line 90
    int-to-long v2, p1

    .line 91
    const-wide v4, 0xffffffffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr v2, v4

    .line 97
    or-long/2addr v0, v2

    .line 98
    new-instance p1, Lu2/l;

    .line 99
    .line 100
    invoke-direct {p1, v0, v1}, Lu2/l;-><init>(J)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p0, Lh0/h1;->i:Li0/a1;

    .line 104
    .line 105
    invoke-interface {v0, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 109
    .line 110
    return-object p1

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
