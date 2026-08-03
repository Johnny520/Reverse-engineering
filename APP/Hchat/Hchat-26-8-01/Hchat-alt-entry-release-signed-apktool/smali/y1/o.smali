.class public final Ly1/o;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# static fields
.field public static final h:Ly1/o;

.field public static final i:Ly1/o;

.field public static final j:Ly1/o;

.field public static final k:Ly1/o;


# instance fields
.field public final synthetic g:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly1/o;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Ly1/o;-><init>(II)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ly1/o;->h:Ly1/o;

    .line 9
    .line 10
    new-instance v0, Ly1/o;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, Ly1/o;-><init>(II)V

    .line 14
    .line 15
    .line 16
    sput-object v0, Ly1/o;->i:Ly1/o;

    .line 17
    .line 18
    new-instance v0, Ly1/o;

    .line 19
    .line 20
    const/4 v2, 0x2

    .line 21
    invoke-direct {v0, v1, v2}, Ly1/o;-><init>(II)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Ly1/o;->j:Ly1/o;

    .line 25
    .line 26
    new-instance v0, Ly1/o;

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    invoke-direct {v0, v1, v2}, Ly1/o;-><init>(II)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Ly1/o;->k:Ly1/o;

    .line 33
    .line 34
    return-void
.end method

.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Ly1/o;->g:I

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ly1/o;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ly1/g0;->f(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    check-cast p1, Ls0/h;

    .line 16
    .line 17
    sget-object v0, Ly1/i0;->a:Li0/u;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v0}, Li0/r;->v(Ls0/h;Li0/p1;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    sget-object v0, Ly1/i0;->b:Li0/m2;

    .line 26
    .line 27
    invoke-static {p1, v0}, Li0/r;->v(Ls0/h;Li0/p1;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    check-cast p1, Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    :pswitch_1
    check-cast p1, Lf2/q;

    .line 39
    .line 40
    invoke-virtual {p1}, Lf2/q;->k()Lf2/m;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    sget-object v0, Lf2/u;->A:Lf2/x;

    .line 45
    .line 46
    iget-object p1, p1, Lf2/m;->g:Lf/k0;

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Lf/k0;->c(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1

    .line 57
    :pswitch_2
    check-cast p1, Ld1/b0;

    .line 58
    .line 59
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 60
    .line 61
    return-object p1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
