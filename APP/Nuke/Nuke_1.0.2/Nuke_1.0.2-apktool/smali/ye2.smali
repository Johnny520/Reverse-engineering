.class public final Lye2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lug;


# static fields
.field public static final a:Lye2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lye2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lye2;->a:Lye2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;Lt00;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, Lxe2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lxe2;

    .line 7
    .line 8
    iget v1, v0, Lxe2;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lxe2;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lxe2;

    .line 21
    .line 22
    check-cast p2, Lu00;

    .line 23
    .line 24
    invoke-direct {v0, p0, p2}, Lxe2;-><init>(Lye2;Lu00;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p0, v0, Lxe2;->k:Ljava/lang/Object;

    .line 28
    .line 29
    iget p2, v0, Lxe2;->m:I

    .line 30
    .line 31
    const/4 v1, 0x1

    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    if-ne p2, v1, :cond_1

    .line 35
    .line 36
    :try_start_0
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p0}, Lfg1;->T(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    invoke-static {v1, p1}, Lsp0;->a0(I[Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const/4 p0, 0x0

    .line 54
    aget-object v2, p1, p0

    .line 55
    .line 56
    const-string v3, "delayMs"

    .line 57
    .line 58
    const-wide/16 v4, 0x0

    .line 59
    .line 60
    const-wide v6, 0x7fffffffffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    invoke-static/range {v2 .. v7}, Lsp0;->d0(Ljava/lang/Object;Ljava/lang/String;JJ)J

    .line 66
    .line 67
    .line 68
    move-result-wide p0

    .line 69
    iput v1, v0, Lxe2;->m:I

    .line 70
    .line 71
    invoke-static {p0, p1, v0}, Leu;->F(JLu00;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    sget-object p1, Lk20;->h:Lk20;

    .line 76
    .line 77
    if-ne p0, p1, :cond_3

    .line 78
    .line 79
    return-object p1

    .line 80
    :cond_3
    :goto_1
    :try_start_2
    sget-object p0, La83;->a:La83;

    .line 81
    .line 82
    invoke-static {p0}, Leu;->v(Ljava/lang/Object;)Lcom/dokar/quickjs/binding/JsObject;

    .line 83
    .line 84
    .line 85
    move-result-object p0
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    return-object p0

    .line 87
    :catchall_0
    move-exception v0

    .line 88
    move-object p0, v0

    .line 89
    invoke-static {p0}, Leu;->u(Ljava/lang/Throwable;)Lcom/dokar/quickjs/binding/JsObject;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    return-object p0

    .line 94
    :catch_0
    move-exception v0

    .line 95
    move-object p0, v0

    .line 96
    throw p0
.end method
