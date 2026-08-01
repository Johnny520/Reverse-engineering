.class public abstract Ls11;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final a:Lrt;

.field public static final b:Lrt;

.field public static final c:Lre1;

.field public static final d:Lre1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lrt;

    .line 2
    .line 3
    sget-object v1, Lbo;->e:Lbo;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lrt;-><init>(Lbo;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ls11;->a:Lrt;

    .line 9
    .line 10
    new-instance v0, Lrt;

    .line 11
    .line 12
    sget-object v1, Lbo;->f:Lbo;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lrt;-><init>(Lbo;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Ls11;->b:Lrt;

    .line 18
    .line 19
    sget-object v0, Ln2;->i:Lha;

    .line 20
    .line 21
    new-instance v2, Lre1;

    .line 22
    .line 23
    new-instance v3, Lya;

    .line 24
    .line 25
    const/16 v4, 0xc

    .line 26
    .line 27
    invoke-direct {v3, v4, v0}, Lya;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {v2, v1, v3, v0}, Lre1;-><init>(Lbo;Lww;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sput-object v2, Ls11;->c:Lre1;

    .line 34
    .line 35
    sget-object v0, Ln2;->e:Lha;

    .line 36
    .line 37
    new-instance v2, Lre1;

    .line 38
    .line 39
    new-instance v3, Lya;

    .line 40
    .line 41
    invoke-direct {v3, v4, v0}, Lya;-><init>(ILjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v1, v3, v0}, Lre1;-><init>(Lbo;Lww;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sput-object v2, Ls11;->d:Lre1;

    .line 48
    .line 49
    return-void
.end method

.method public static final a(Lpe0;FF)Lpe0;
    .locals 1

    .line 1
    new-instance v0, Lsa1;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lsa1;-><init>(FF)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0, v0}, Lpe0;->c(Lpe0;)Lpe0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static final b(Lpe0;F)Lpe0;
    .locals 6

    .line 1
    new-instance v0, Lr11;

    .line 2
    .line 3
    const/4 v3, 0x0

    .line 4
    const/4 v5, 0x5

    .line 5
    const/4 v1, 0x0

    .line 6
    move v4, p1

    .line 7
    move v2, p1

    .line 8
    invoke-direct/range {v0 .. v5}, Lr11;-><init>(FFFFI)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Lpe0;->c(Lpe0;)Lpe0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final c(Lpe0;F)Lpe0;
    .locals 6

    .line 1
    new-instance v0, Lr11;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    move v2, p1

    .line 5
    move v3, p1

    .line 6
    move v4, p1

    .line 7
    move v1, p1

    .line 8
    invoke-direct/range {v0 .. v5}, Lr11;-><init>(FFFFZ)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p0, v0}, Lpe0;->c(Lpe0;)Lpe0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static d(Lpe0;)Lpe0;
    .locals 6

    .line 1
    new-instance v0, Lr11;

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const/high16 v1, 0x438c0000    # 280.0f

    .line 5
    .line 6
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 7
    .line 8
    const/high16 v3, 0x440c0000    # 560.0f

    .line 9
    .line 10
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lr11;-><init>(FFFFZ)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0, v0}, Lpe0;->c(Lpe0;)Lpe0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static final e(F)Lpe0;
    .locals 6

    .line 1
    new-instance v0, Lr11;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/16 v5, 0xa

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    move v3, p0

    .line 8
    move v1, p0

    .line 9
    invoke-direct/range {v0 .. v5}, Lr11;-><init>(FFFFI)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static f(Lpe0;)Lpe0;
    .locals 4

    .line 1
    sget-object v0, Ln2;->i:Lha;

    .line 2
    .line 3
    invoke-virtual {v0, v0}, Lha;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    sget-object v0, Ls11;->c:Lre1;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    sget-object v1, Ln2;->e:Lha;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lha;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    sget-object v0, Ls11;->d:Lre1;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v1, Lre1;

    .line 24
    .line 25
    new-instance v2, Lya;

    .line 26
    .line 27
    const/16 v3, 0xc

    .line 28
    .line 29
    invoke-direct {v2, v3, v0}, Lya;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sget-object v3, Lbo;->f:Lbo;

    .line 33
    .line 34
    invoke-direct {v1, v3, v2, v0}, Lre1;-><init>(Lbo;Lww;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    move-object v0, v1

    .line 38
    :goto_0
    invoke-interface {p0, v0}, Lpe0;->c(Lpe0;)Lpe0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0
.end method
