.class public final Lpy0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lez0;


# static fields
.field public static final j:Ld;


# instance fields
.field public final a:Ldp0;

.field public final b:Ldp0;

.field public final c:Ldp0;

.field public final d:Lxg0;

.field public final e:Ldp0;

.field public f:F

.field public final g:Lnm;

.field public final h:Ldn;

.field public final i:Ldn;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lrx0;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lrx0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lsx0;

    .line 9
    .line 10
    const/16 v2, 0xc

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lsx0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Ld;

    .line 16
    .line 17
    const/16 v3, 0x13

    .line 18
    .line 19
    invoke-direct {v2, v3, v0, v1}, Ld;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sput-object v2, Lpy0;->j:Ld;

    .line 23
    .line 24
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldp0;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ldp0;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lpy0;->a:Ldp0;

    .line 10
    .line 11
    new-instance p1, Ldp0;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Ldp0;-><init>(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lpy0;->b:Ldp0;

    .line 18
    .line 19
    new-instance p1, Ldp0;

    .line 20
    .line 21
    invoke-direct {p1, v0}, Ldp0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lpy0;->c:Ldp0;

    .line 25
    .line 26
    new-instance p1, Lxg0;

    .line 27
    .line 28
    invoke-direct {p1}, Lxg0;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lpy0;->d:Lxg0;

    .line 32
    .line 33
    new-instance p1, Ldp0;

    .line 34
    .line 35
    const v1, 0x7fffffff

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, v1}, Ldp0;-><init>(I)V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lpy0;->e:Ldp0;

    .line 42
    .line 43
    new-instance p1, Lo;

    .line 44
    .line 45
    const/16 v1, 0x13

    .line 46
    .line 47
    invoke-direct {p1, v1, p0}, Lo;-><init>(ILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Lnm;

    .line 51
    .line 52
    invoke-direct {v1, p1}, Lnm;-><init>(Lsw;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lpy0;->g:Lnm;

    .line 56
    .line 57
    new-instance p1, Loy0;

    .line 58
    .line 59
    invoke-direct {p1, p0, v0}, Loy0;-><init>(Lpy0;I)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lr60;->m(Lhw;)Ldn;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iput-object p1, p0, Lpy0;->h:Ldn;

    .line 67
    .line 68
    new-instance p1, Loy0;

    .line 69
    .line 70
    const/4 v0, 0x1

    .line 71
    invoke-direct {p1, p0, v0}, Loy0;-><init>(Lpy0;I)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1}, Lr60;->m(Lhw;)Ldn;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iput-object p1, p0, Lpy0;->i:Ldn;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lpy0;->i:Ldn;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldn;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final b()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lpy0;->g:Lnm;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnm;->b()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final c()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lpy0;->h:Ldn;

    .line 2
    .line 3
    invoke-virtual {p0}, Ldn;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final d(Lvh0;Lww;Ljk;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lpy0;->g:Lnm;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lnm;->d(Lvh0;Lww;Ljk;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lzk;->d:Lzk;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 13
    .line 14
    return-object p0
.end method

.method public final e(F)F
    .locals 0

    .line 1
    iget-object p0, p0, Lpy0;->g:Lnm;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnm;->e(F)F

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
