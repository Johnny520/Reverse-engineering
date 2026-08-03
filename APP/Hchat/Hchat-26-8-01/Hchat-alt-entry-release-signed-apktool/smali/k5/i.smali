.class public final Lk5/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lo5/e;

.field public final synthetic i:I

.field public final synthetic j:Ljava/util/Iterator;

.field public final synthetic k:Z

.field public final synthetic l:Lk5/o;


# direct methods
.method public synthetic constructor <init>(Lk5/o;Lo5/e;ILo5/s;ZI)V
    .locals 0

    .line 1
    iput p6, p0, Lk5/i;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lk5/i;->l:Lk5/o;

    .line 4
    .line 5
    iput-object p2, p0, Lk5/i;->h:Lo5/e;

    .line 6
    .line 7
    iput p3, p0, Lk5/i;->i:I

    .line 8
    .line 9
    iput-object p4, p0, Lk5/i;->j:Ljava/util/Iterator;

    .line 10
    .line 11
    iput-boolean p5, p0, Lk5/i;->k:Z

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 7

    .line 1
    iget v0, p0, Lk5/i;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/i;->h:Lo5/e;

    .line 7
    .line 8
    invoke-virtual {v0}, Lo5/e;->d()Lo5/c;

    .line 9
    .line 10
    .line 11
    move-result-object v5

    .line 12
    invoke-virtual {v0}, Lo5/e;->e()Lo5/c;

    .line 13
    .line 14
    .line 15
    move-result-object v6

    .line 16
    new-instance v1, Lk5/f;

    .line 17
    .line 18
    iget-object v0, p0, Lk5/i;->l:Lk5/o;

    .line 19
    .line 20
    iget-object v0, v0, Lk5/o;->j:Lk5/u;

    .line 21
    .line 22
    iget-object v3, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 23
    .line 24
    iget v4, p0, Lk5/i;->i:I

    .line 25
    .line 26
    move-object v2, p0

    .line 27
    invoke-direct/range {v1 .. v6}, Lk5/f;-><init>(Lk5/i;Landroidx/lifecycle/x;ILo5/c;Lo5/c;)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_0
    move-object v2, p0

    .line 32
    iget-object v0, v2, Lk5/i;->h:Lo5/e;

    .line 33
    .line 34
    invoke-virtual {v0}, Lo5/e;->c()Lo5/c;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Lk5/h;

    .line 39
    .line 40
    iget-object v3, v2, Lk5/i;->l:Lk5/o;

    .line 41
    .line 42
    iget-object v3, v3, Lk5/o;->j:Lk5/u;

    .line 43
    .line 44
    iget-object v3, v3, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 45
    .line 46
    iget v4, v2, Lk5/i;->i:I

    .line 47
    .line 48
    invoke-direct {v1, p0, v3, v4, v0}, Lk5/h;-><init>(Lk5/i;Landroidx/lifecycle/x;ILo5/c;)V

    .line 49
    .line 50
    .line 51
    return-object v1

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
