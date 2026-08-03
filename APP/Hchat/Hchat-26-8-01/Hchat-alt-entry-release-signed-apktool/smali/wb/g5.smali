.class public final Lwb/g5;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lfg/l;

.field public final synthetic c:Lwb/e5;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Lwb/e5;I)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/g5;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/g5;->b:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/g5;->c:Lwb/e5;

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
    .locals 5

    .line 1
    iget v0, p0, Lwb/g5;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lwb/f5;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x1

    .line 10
    iget-object v3, p0, Lwb/g5;->b:Lfg/l;

    .line 11
    .line 12
    iget-object v4, p0, Lwb/g5;->c:Lwb/e5;

    .line 13
    .line 14
    invoke-direct {v0, v3, v4, v1, v2}, Lwb/f5;-><init>(Lfg/l;Lwb/e5;Lwf/c;I)V

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :pswitch_0
    new-instance v0, Lwb/f5;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    const/4 v2, 0x0

    .line 26
    iget-object v3, p0, Lwb/g5;->b:Lfg/l;

    .line 27
    .line 28
    iget-object v4, p0, Lwb/g5;->c:Lwb/e5;

    .line 29
    .line 30
    invoke-direct {v0, v3, v4, v1, v2}, Lwb/f5;-><init>(Lfg/l;Lwb/e5;Lwf/c;I)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v0, p2}, La/a;->n(Ls1/x;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
