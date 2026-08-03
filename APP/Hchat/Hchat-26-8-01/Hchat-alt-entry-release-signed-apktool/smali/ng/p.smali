.class public final Lng/p;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lhg/a;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lng/p;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lng/p;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lng/p;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lng/d;

    .line 7
    .line 8
    iget-object v1, p0, Lng/p;->h:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Li/e0;

    .line 11
    .line 12
    iget-object v1, v1, Li/e0;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v1, Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Lng/d;-><init>(Ljava/util/Iterator;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    iget-object v0, p0, Lng/p;->h:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, [Ljava/lang/Object;

    .line 27
    .line 28
    new-instance v1, Lgg/b;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Lgg/b;-><init>([Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v1

    .line 34
    :pswitch_1
    iget-object v0, p0, Lng/p;->h:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Log/c;

    .line 37
    .line 38
    new-instance v1, Log/b;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Log/b;-><init>(Log/c;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
