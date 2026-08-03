.class public final synthetic Lwb/lk;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/r;


# instance fields
.field public final synthetic g:Ls0/d;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Ls0/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/lk;->g:Ls0/d;

    .line 5
    .line 6
    iput p2, p0, Lwb/lk;->h:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lh/n;

    .line 2
    .line 3
    check-cast p3, Li0/h0;

    .line 4
    .line 5
    check-cast p4, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    and-int/lit8 p1, p4, 0x30

    .line 15
    .line 16
    if-nez p1, :cond_2

    .line 17
    .line 18
    and-int/lit8 p1, p4, 0x40

    .line 19
    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    invoke-virtual {p3, p2}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p3, p2}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    :goto_0
    if-eqz p1, :cond_1

    .line 32
    .line 33
    const/16 p1, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 p1, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr p4, p1

    .line 39
    :cond_2
    and-int/lit16 p1, p4, 0x91

    .line 40
    .line 41
    const/16 v0, 0x90

    .line 42
    .line 43
    if-eq p1, v0, :cond_3

    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    const/4 p1, 0x0

    .line 48
    :goto_2
    and-int/lit8 v0, p4, 0x1

    .line 49
    .line 50
    invoke-virtual {p3, v0, p1}, Li0/h0;->S(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-eqz p1, :cond_4

    .line 55
    .line 56
    iget p1, p0, Lwb/lk;->h:I

    .line 57
    .line 58
    and-int/lit8 p1, p1, 0x8

    .line 59
    .line 60
    shr-int/lit8 p4, p4, 0x3

    .line 61
    .line 62
    and-int/lit8 p4, p4, 0xe

    .line 63
    .line 64
    or-int/2addr p1, p4

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object p4, p0, Lwb/lk;->g:Ls0/d;

    .line 70
    .line 71
    invoke-virtual {p4, p2, p3, p1}, Ls0/d;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 76
    .line 77
    .line 78
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 79
    .line 80
    return-object p1
.end method
