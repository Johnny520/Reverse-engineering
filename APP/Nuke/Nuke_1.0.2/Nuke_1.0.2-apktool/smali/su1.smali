.class public final Lsu1;
.super Liv1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final c:Lsu1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lsu1;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    invoke-direct {v0, v3, v1, v2}, Liv1;-><init>(III)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lsu1;->c:Lsu1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lbo0;Lrf;Ltr2;Lz72;Ljv1;)V
    .locals 6

    .line 1
    const/4 p0, 0x1

    .line 2
    invoke-virtual {p1, p0}, Lbo0;->d(I)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    check-cast v0, Lqr2;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {p1, v1}, Lbo0;->d(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    check-cast v2, Lao0;

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    invoke-virtual {p1, v3}, Lbo0;->d(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Llj0;

    .line 21
    .line 22
    invoke-virtual {v0}, Lqr2;->d()Ltr2;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz p5, :cond_0

    .line 27
    .line 28
    :try_start_0
    new-instance v4, Ldq1;

    .line 29
    .line 30
    const/4 v5, 0x4

    .line 31
    invoke-direct {v4, v5, p5, p3}, Ldq1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception p0

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    const/4 v4, 0x0

    .line 38
    :goto_0
    iget-object p5, p1, Llj0;->n:Lkv1;

    .line 39
    .line 40
    invoke-virtual {p5}, Lkv1;->W()Z

    .line 41
    .line 42
    .line 43
    move-result p5

    .line 44
    if-nez p5, :cond_1

    .line 45
    .line 46
    const-string p5, "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"

    .line 47
    .line 48
    invoke-static {p5}, Ltx;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    iget-object p1, p1, Llj0;->m:Lkv1;

    .line 52
    .line 53
    invoke-virtual {p1, p2, v3, p4, v4}, Lkv1;->V(Lrf;Ltr2;Lz72;Ljv1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, p0}, Ltr2;->e(Z)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p3}, Ltr2;->d()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Lqr2;->a(Lao0;)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    invoke-virtual {p3, v0, p0}, Ltr2;->A(Lqr2;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p3}, Ltr2;->k()V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :goto_1
    invoke-virtual {v3, v1}, Ltr2;->e(Z)V

    .line 77
    .line 78
    .line 79
    throw p0
.end method
