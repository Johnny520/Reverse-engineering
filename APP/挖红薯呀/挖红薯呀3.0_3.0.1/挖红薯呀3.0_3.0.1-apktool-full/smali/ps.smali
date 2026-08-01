.class public final Lps;
.super Lc50;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lvs;

.field public final synthetic f:Ljt;


# direct methods
.method public synthetic constructor <init>(Lvs;Ljt;I)V
    .locals 0

    .line 1
    iput p3, p0, Lps;->d:I

    .line 2
    .line 3
    iput-object p1, p0, Lps;->e:Lvs;

    .line 4
    .line 5
    iput-object p2, p0, Lps;->f:Ljt;

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lc50;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Lps;->d:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lms;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eqz p0, :cond_1

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    if-eq p0, p1, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x2

    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {}, Lxc;->j()V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 27
    .line 28
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_1
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, Lx81;

    .line 34
    .line 35
    sget-object p0, Lms;->d:Lms;

    .line 36
    .line 37
    sget-object v0, Lms;->e:Lms;

    .line 38
    .line 39
    invoke-virtual {p1, p0, v0}, Lx81;->a(Lms;Lms;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    sget-object p0, Lrs;->a:Lo31;

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    sget-object p0, Lms;->f:Lms;

    .line 49
    .line 50
    invoke-virtual {p1, v0, p0}, Lx81;->a(Lms;Lms;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_3

    .line 55
    .line 56
    sget-object p0, Lrs;->a:Lo31;

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_3
    sget-object p0, Lrs;->a:Lo31;

    .line 60
    .line 61
    :goto_2
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
