.class public final Lwb/bu;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Lsf/b;


# direct methods
.method public synthetic constructor <init>(ILsf/b;Z)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/bu;->a:I

    .line 2
    .line 3
    iput-boolean p3, p0, Lwb/bu;->b:Z

    .line 4
    .line 5
    iput-object p2, p0, Lwb/bu;->c:Lsf/b;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ls1/x;Lwf/c;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/bu;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lwb/bu;->b:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p0, Lwb/bu;->c:Lsf/b;

    .line 14
    .line 15
    check-cast v0, Lfg/l;

    .line 16
    .line 17
    new-instance v1, Lwb/l7;

    .line 18
    .line 19
    invoke-direct {v1, v0, p1}, Lwb/l7;-><init>(Lfg/l;Ls1/x;)V

    .line 20
    .line 21
    .line 22
    const/4 v0, 0x7

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {p1, v2, v1, p2, v0}, Lm/y2;->d(Ls1/x;Lwb/l7;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    return-object p1

    .line 29
    :pswitch_0
    iget-boolean v0, p0, Lwb/bu;->b:Z

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    new-instance v0, Ld9/k;

    .line 37
    .line 38
    iget-object v1, p0, Lwb/bu;->c:Lsf/b;

    .line 39
    .line 40
    check-cast v1, Lfg/a;

    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const/4 v3, 0x6

    .line 44
    invoke-direct {v0, v1, v2, v3}, Ld9/k;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {p1, v0, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :goto_1
    return-object p1

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
