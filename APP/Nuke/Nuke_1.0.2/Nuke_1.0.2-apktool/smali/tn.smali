.class public final Ltn;
.super Lw00;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Ltn;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;)Lx00;
    .locals 1

    .line 1
    iget v0, p0, Ltn;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lw00;->a(Ljava/lang/reflect/Type;)Lx00;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    const-class p0, Lo82;

    .line 12
    .line 13
    invoke-static {p1}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    sget-object p0, Lsn;->y:Lsn;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    :goto_0
    return-object p0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lcj;)Lx00;
    .locals 3

    .line 1
    iget p0, p0, Ltn;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lxe1;->D(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-class v2, Ljava/util/Optional;

    .line 13
    .line 14
    if-eq p0, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Ljava/lang/reflect/ParameterizedType;

    .line 18
    .line 19
    invoke-static {v0, p1}, Lxe1;->C(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p3, p0, p2}, Lcj;->p(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Lx00;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    new-instance v1, Lhh1;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    invoke-direct {v1, p1, p0}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-object v1

    .line 34
    :pswitch_0
    const-class p0, Lu92;

    .line 35
    .line 36
    if-ne p1, p0, :cond_2

    .line 37
    .line 38
    const-class p0, Lbv2;

    .line 39
    .line 40
    invoke-static {p2, p0}, Lxe1;->J([Ljava/lang/annotation/Annotation;Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    sget-object v1, Lgd3;->m:Lgd3;

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_1
    sget-object v1, Lgd3;->l:Lgd3;

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    const-class p0, Ljava/lang/Void;

    .line 53
    .line 54
    if-ne p1, p0, :cond_3

    .line 55
    .line 56
    sget-object v1, Lgd3;->n:Lgd3;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    sget-boolean p0, Lxe1;->h:Z

    .line 60
    .line 61
    if-eqz p0, :cond_4

    .line 62
    .line 63
    :try_start_0
    const-class p0, La83;
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    if-ne p1, p0, :cond_4

    .line 66
    .line 67
    sget-object v1, Lsn;->z:Lsn;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catch_0
    sput-boolean v0, Lxe1;->h:Z

    .line 71
    .line 72
    :cond_4
    :goto_1
    return-object v1

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
