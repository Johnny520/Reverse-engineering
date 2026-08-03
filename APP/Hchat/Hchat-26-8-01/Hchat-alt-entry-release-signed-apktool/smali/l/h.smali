.class public final synthetic Ll/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Z

.field public final synthetic j:Ly0/o;

.field public final synthetic k:Lfg/a;

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILfg/a;Ljava/lang/String;Ljava/lang/String;Lwb/y2;Ly0/o;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ll/h;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p5, p0, Ll/h;->m:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p3, p0, Ll/h;->h:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p4, p0, Ll/h;->n:Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean p7, p0, Ll/h;->i:Z

    .line 14
    .line 15
    iput-object p6, p0, Ll/h;->j:Ly0/o;

    .line 16
    .line 17
    iput-object p2, p0, Ll/h;->k:Lfg/a;

    .line 18
    .line 19
    iput p1, p0, Ll/h;->l:I

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ZLl/d;Ly0/o;Lfg/q;Lfg/a;I)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Ll/h;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/h;->h:Ljava/lang/String;

    iput-boolean p2, p0, Ll/h;->i:Z

    iput-object p3, p0, Ll/h;->m:Ljava/lang/Object;

    iput-object p4, p0, Ll/h;->j:Ly0/o;

    iput-object p5, p0, Ll/h;->n:Ljava/lang/Object;

    iput-object p6, p0, Ll/h;->k:Lfg/a;

    iput p7, p0, Ll/h;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ll/h;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ll/h;->m:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lwb/y2;

    .line 10
    .line 11
    iget-object v0, p0, Ll/h;->n:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v6, v0

    .line 14
    check-cast v6, Ljava/lang/String;

    .line 15
    .line 16
    move-object v4, p1

    .line 17
    check-cast v4, Li0/h0;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p1, p0, Ll/h;->l:I

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, Li0/r;->C(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    iget-object v3, p0, Ll/h;->k:Lfg/a;

    .line 33
    .line 34
    iget-object v5, p0, Ll/h;->h:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v7, p0, Ll/h;->j:Ly0/o;

    .line 37
    .line 38
    iget-boolean v8, p0, Ll/h;->i:Z

    .line 39
    .line 40
    invoke-virtual/range {v1 .. v8}, Lwb/y2;->j0(ILfg/a;Li0/h0;Ljava/lang/String;Ljava/lang/String;Ly0/o;Z)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_0
    iget-object v0, p0, Ll/h;->m:Ljava/lang/Object;

    .line 47
    .line 48
    move-object v3, v0

    .line 49
    check-cast v3, Ll/d;

    .line 50
    .line 51
    iget-object v0, p0, Ll/h;->n:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v5, v0

    .line 54
    check-cast v5, Lfg/q;

    .line 55
    .line 56
    move-object v7, p1

    .line 57
    check-cast v7, Li0/h0;

    .line 58
    .line 59
    check-cast p2, Ljava/lang/Integer;

    .line 60
    .line 61
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    iget p1, p0, Ll/h;->l:I

    .line 65
    .line 66
    or-int/lit8 p1, p1, 0x1

    .line 67
    .line 68
    invoke-static {p1}, Li0/r;->C(I)I

    .line 69
    .line 70
    .line 71
    move-result v8

    .line 72
    iget-object v1, p0, Ll/h;->h:Ljava/lang/String;

    .line 73
    .line 74
    iget-boolean v2, p0, Ll/h;->i:Z

    .line 75
    .line 76
    iget-object v4, p0, Ll/h;->j:Ly0/o;

    .line 77
    .line 78
    iget-object v6, p0, Ll/h;->k:Lfg/a;

    .line 79
    .line 80
    invoke-static/range {v1 .. v8}, Ll/i;->c(Ljava/lang/String;ZLl/d;Ly0/o;Lfg/q;Lfg/a;Li0/h0;I)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
