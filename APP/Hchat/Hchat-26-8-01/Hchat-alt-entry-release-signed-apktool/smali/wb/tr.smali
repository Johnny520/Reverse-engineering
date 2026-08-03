.class public final synthetic Lwb/tr;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Lfb/r0;

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:I


# direct methods
.method public synthetic constructor <init>(ILfb/r0;Lfg/l;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lwb/tr;->g:Lfb/r0;

    .line 5
    .line 6
    iput-object p3, p0, Lwb/tr;->h:Lfg/l;

    .line 7
    .line 8
    iput-object p4, p0, Lwb/tr;->i:Ljava/util/List;

    .line 9
    .line 10
    iput p1, p0, Lwb/tr;->j:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Lr/d;

    .line 2
    .line 3
    check-cast p2, Li0/h0;

    .line 4
    .line 5
    check-cast p3, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    and-int/lit8 p1, p3, 0x11

    .line 15
    .line 16
    const/16 v0, 0x10

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-eq p1, v0, :cond_0

    .line 21
    .line 22
    move p1, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move p1, v1

    .line 25
    :goto_0
    and-int/2addr p3, v2

    .line 26
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    const/16 p1, 0x8

    .line 33
    .line 34
    int-to-float v4, p1

    .line 35
    const/4 v6, 0x0

    .line 36
    const/16 v7, 0xd

    .line 37
    .line 38
    sget-object v2, Ly0/l;->a:Ly0/l;

    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-static/range {v2 .. v7}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    new-instance v2, Lb0/r;

    .line 47
    .line 48
    const/16 v7, 0xf

    .line 49
    .line 50
    iget-object v3, p0, Lwb/tr;->g:Lfb/r0;

    .line 51
    .line 52
    iget-object v4, p0, Lwb/tr;->h:Lfg/l;

    .line 53
    .line 54
    iget-object v5, p0, Lwb/tr;->i:Ljava/util/List;

    .line 55
    .line 56
    iget v6, p0, Lwb/tr;->j:I

    .line 57
    .line 58
    invoke-direct/range {v2 .. v7}, Lb0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    const p3, 0x53babd36

    .line 62
    .line 63
    .line 64
    invoke-static {p3, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    const/16 v0, 0x36

    .line 69
    .line 70
    invoke-static {p1, p3, p2, v0, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 75
    .line 76
    .line 77
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 78
    .line 79
    return-object p1
.end method
