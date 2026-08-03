.class public final synthetic Lwb/tu;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lsf/e;

.field public final synthetic h:I

.field public final synthetic i:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Lsf/e;ILi0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/tu;->g:Lsf/e;

    .line 5
    .line 6
    iput p2, p0, Lwb/tu;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lwb/tu;->i:Li0/a1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lr/d;

    .line 2
    .line 3
    move-object v5, p2

    .line 4
    check-cast v5, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p1, p2, 0x11

    .line 16
    .line 17
    const/16 p3, 0x10

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    if-eq p1, p3, :cond_0

    .line 21
    .line 22
    move p1, v0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    and-int/2addr p2, v0

    .line 26
    invoke-virtual {v5, p2, p1}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_3

    .line 31
    .line 32
    sget-object v0, Lwb/y2;->p:Lwb/y2;

    .line 33
    .line 34
    iget-object p1, p0, Lwb/tu;->g:Lsf/e;

    .line 35
    .line 36
    iget-object p2, p1, Lsf/e;->g:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v1, p2

    .line 39
    check-cast v1, Ljava/lang/String;

    .line 40
    .line 41
    iget-object p1, p1, Lsf/e;->h:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v2, p1

    .line 44
    check-cast v2, Ljava/lang/String;

    .line 45
    .line 46
    iget-object p1, p0, Lwb/tu;->i:Li0/a1;

    .line 47
    .line 48
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    check-cast p2, Ljava/util/Set;

    .line 53
    .line 54
    iget p3, p0, Lwb/tu;->h:I

    .line 55
    .line 56
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-interface {p2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    invoke-virtual {v5, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    invoke-virtual {v5, p3}, Li0/h0;->d(I)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    or-int/2addr p2, v4

    .line 73
    invoke-virtual {v5}, Li0/h0;->P()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    if-nez p2, :cond_1

    .line 78
    .line 79
    sget-object p2, Li0/l;->a:Li0/e;

    .line 80
    .line 81
    if-ne v4, p2, :cond_2

    .line 82
    .line 83
    :cond_1
    new-instance v4, Lsh/v;

    .line 84
    .line 85
    const/4 p2, 0x4

    .line 86
    invoke-direct {v4, p3, p1, p2}, Lsh/v;-><init>(ILi0/a1;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5, v4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    check-cast v4, Lfg/a;

    .line 93
    .line 94
    const/16 v6, 0x6000

    .line 95
    .line 96
    invoke-virtual/range {v0 .. v6}, Lwb/y2;->A(Ljava/lang/String;Ljava/lang/String;ZLfg/a;Li0/h0;I)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 101
    .line 102
    .line 103
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 104
    .line 105
    return-object p1
.end method
