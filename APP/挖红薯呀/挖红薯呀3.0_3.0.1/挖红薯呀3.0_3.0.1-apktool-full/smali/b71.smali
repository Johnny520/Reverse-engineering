.class public final Lb71;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# static fields
.field public static final e:Lb71;


# instance fields
.field public final synthetic d:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lb71;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lb71;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lb71;->e:Lb71;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    const/4 p1, 0x4

    .line 2
    iput p1, p0, Lb71;->d:I

    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 9
    iput p2, p0, Lb71;->d:I

    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lus;)V
    .locals 0

    const/4 p1, 0x3

    iput p1, p0, Lb71;->d:I

    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget p0, p0, Lb71;->d:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-wide v1, 0xffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    const/16 v3, 0x20

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ldv;

    .line 15
    .line 16
    invoke-virtual {p1}, Ldv;->w0()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0

    .line 25
    :pswitch_0
    check-cast p1, Lx81;

    .line 26
    .line 27
    sget-object p0, Lms;->d:Lms;

    .line 28
    .line 29
    sget-object v0, Lms;->e:Lms;

    .line 30
    .line 31
    invoke-virtual {p1, p0, v0}, Lx81;->a(Lms;Lms;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_0

    .line 36
    .line 37
    sget-object p0, Lrs;->b:Lo31;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object p0, Lms;->f:Lms;

    .line 41
    .line 42
    invoke-virtual {p1, v0, p0}, Lx81;->a(Lms;Lms;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_1

    .line 47
    .line 48
    sget-object p0, Lrs;->b:Lo31;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    sget-object p0, Lrs;->b:Lo31;

    .line 52
    .line 53
    :goto_0
    return-object p0

    .line 54
    :pswitch_1
    check-cast p1, Ld30;

    .line 55
    .line 56
    iget-wide p0, p1, Ld30;->a:J

    .line 57
    .line 58
    shr-long/2addr p0, v3

    .line 59
    long-to-int p0, p0

    .line 60
    int-to-long p0, p0

    .line 61
    shl-long/2addr p0, v3

    .line 62
    int-to-long v3, v0

    .line 63
    and-long v0, v3, v1

    .line 64
    .line 65
    or-long/2addr p0, v0

    .line 66
    new-instance v0, Ld30;

    .line 67
    .line 68
    invoke-direct {v0, p0, p1}, Ld30;-><init>(J)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_2
    check-cast p1, Ld30;

    .line 73
    .line 74
    iget-wide p0, p1, Ld30;->a:J

    .line 75
    .line 76
    shr-long/2addr p0, v3

    .line 77
    long-to-int p0, p0

    .line 78
    int-to-long p0, p0

    .line 79
    shl-long/2addr p0, v3

    .line 80
    int-to-long v3, v0

    .line 81
    and-long v0, v3, v1

    .line 82
    .line 83
    or-long/2addr p0, v0

    .line 84
    new-instance v0, Ld30;

    .line 85
    .line 86
    invoke-direct {v0, p0, p1}, Ld30;-><init>(J)V

    .line 87
    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_3
    check-cast p1, Lt00;

    .line 91
    .line 92
    const/4 p0, 0x0

    .line 93
    throw p0

    .line 94
    nop

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
