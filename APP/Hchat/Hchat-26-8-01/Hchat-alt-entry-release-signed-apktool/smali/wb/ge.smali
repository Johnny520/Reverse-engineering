.class public final synthetic Lwb/ge;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Lfg/a;

.field public final synthetic l:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/ge;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/ge;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/ge;->i:Z

    .line 9
    .line 10
    iput-object p4, p0, Lwb/ge;->j:Lfg/a;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/ge;->k:Lfg/a;

    .line 13
    .line 14
    iput p6, p0, Lwb/ge;->l:I

    .line 15
    .line 16
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
    new-instance v2, Lwb/be;

    .line 32
    .line 33
    const/4 v9, 0x1

    .line 34
    iget-object v3, p0, Lwb/ge;->g:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v4, p0, Lwb/ge;->h:Ljava/lang/String;

    .line 37
    .line 38
    iget-boolean v5, p0, Lwb/ge;->i:Z

    .line 39
    .line 40
    iget-object v6, p0, Lwb/ge;->j:Lfg/a;

    .line 41
    .line 42
    iget-object v7, p0, Lwb/ge;->k:Lfg/a;

    .line 43
    .line 44
    iget v8, p0, Lwb/ge;->l:I

    .line 45
    .line 46
    invoke-direct/range {v2 .. v9}, Lwb/be;-><init>(Ljava/lang/String;Ljava/lang/String;ZLfg/a;Lsf/b;II)V

    .line 47
    .line 48
    .line 49
    const p1, 0x4aa59189    # 5425348.5f

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/16 p3, 0x30

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 64
    .line 65
    .line 66
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 67
    .line 68
    return-object p1
.end method
