.class public final synthetic Lwb/hc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Lfg/l;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;


# direct methods
.method public synthetic constructor <init>(ZLfg/l;Li0/a1;Lfg/l;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwb/hc;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lwb/hc;->h:Lfg/l;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/hc;->i:Li0/a1;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/hc;->j:Lfg/l;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/hc;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/hc;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/hc;->m:Li0/a1;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

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
    const/4 v1, 0x1

    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    move p1, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p1, 0x0

    .line 24
    :goto_0
    and-int/2addr p3, v1

    .line 25
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    new-instance v2, Lwb/ef;

    .line 32
    .line 33
    iget-boolean v3, p0, Lwb/hc;->g:Z

    .line 34
    .line 35
    iget-object v4, p0, Lwb/hc;->h:Lfg/l;

    .line 36
    .line 37
    iget-object v5, p0, Lwb/hc;->i:Li0/a1;

    .line 38
    .line 39
    iget-object v6, p0, Lwb/hc;->j:Lfg/l;

    .line 40
    .line 41
    iget-object v7, p0, Lwb/hc;->k:Li0/a1;

    .line 42
    .line 43
    iget-object v8, p0, Lwb/hc;->l:Li0/a1;

    .line 44
    .line 45
    iget-object v9, p0, Lwb/hc;->m:Li0/a1;

    .line 46
    .line 47
    invoke-direct/range {v2 .. v9}, Lwb/ef;-><init>(ZLfg/l;Li0/a1;Lfg/l;Li0/a1;Li0/a1;Li0/a1;)V

    .line 48
    .line 49
    .line 50
    const p1, -0x3ef0220

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/16 p3, 0x30

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 65
    .line 66
    .line 67
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    return-object p1
.end method
