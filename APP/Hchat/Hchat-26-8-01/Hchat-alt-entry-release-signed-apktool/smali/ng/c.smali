.class public final Lng/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lng/j;


# instance fields
.field public final synthetic a:I

.field public final b:Lfg/l;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lfg/a;Lfg/l;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lng/c;->a:I

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lng/c;->c:Ljava/lang/Object;

    iput-object p2, p0, Lng/c;->b:Lfg/l;

    return-void
.end method

.method public constructor <init>(Lng/j;Lfg/l;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lng/c;->a:I

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lng/c;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p2, p0, Lng/c;->b:Lfg/l;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    iget v0, p0, Lng/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lf/i0;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lf/i0;-><init>(Lng/c;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lng/b;

    .line 13
    .line 14
    iget-object v1, p0, Lng/c;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v1, Lng/j;

    .line 17
    .line 18
    invoke-interface {v1}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lng/c;->b:Lfg/l;

    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lng/b;-><init>(Ljava/util/Iterator;Lfg/l;)V

    .line 25
    .line 26
    .line 27
    return-object v0

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
