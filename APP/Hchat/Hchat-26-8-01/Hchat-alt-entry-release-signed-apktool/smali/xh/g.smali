.class public final Lxh/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxh/g;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lxh/g;->b:Li0/a1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ls1/x;Lwf/c;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lxh/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lxh/n;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iget-object v2, p0, Lxh/g;->b:Li0/a1;

    .line 10
    .line 11
    invoke-direct {v0, v2, v1}, Lxh/n;-><init>(Li0/a1;I)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x7

    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {p1, v2, v0, p2, v1}, Lm/y2;->d(Ls1/x;Lwb/l7;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 21
    .line 22
    if-ne p1, p2, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 26
    .line 27
    :goto_0
    return-object p1

    .line 28
    :pswitch_0
    new-instance v0, Lwb/lp;

    .line 29
    .line 30
    const/16 v1, 0x1b

    .line 31
    .line 32
    iget-object v2, p0, Lxh/g;->b:Li0/a1;

    .line 33
    .line 34
    invoke-direct {v0, v2, v1}, Lwb/lp;-><init>(Li0/a1;I)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x7

    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-static {p1, v2, v0, p2, v1}, Lm/y2;->d(Ls1/x;Lwb/l7;Lfg/l;Lwf/c;I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 44
    .line 45
    if-ne p1, p2, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    :goto_1
    return-object p1

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
