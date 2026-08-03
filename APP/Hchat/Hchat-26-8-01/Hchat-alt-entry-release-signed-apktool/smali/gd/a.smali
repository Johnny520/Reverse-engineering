.class public final synthetic Lgd/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lgd/b;

.field public final synthetic c:Lfd/a;


# direct methods
.method public synthetic constructor <init>(Lgd/b;Lfd/a;I)V
    .locals 0

    .line 1
    iput p3, p0, Lgd/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lgd/a;->b:Lgd/b;

    .line 4
    .line 5
    iput-object p2, p0, Lgd/a;->c:Lfd/a;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lgd/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lgd/a;->c:Lfd/a;

    .line 7
    .line 8
    check-cast p1, Lqd/j;

    .line 9
    .line 10
    iget-object v1, p0, Lgd/a;->b:Lgd/b;

    .line 11
    .line 12
    invoke-virtual {v1, v0, p1}, Lgd/b;->a(Lfd/a;Lqd/j;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :pswitch_0
    iget-object v0, p0, Lgd/a;->c:Lfd/a;

    .line 18
    .line 19
    check-cast p1, Lqd/j;

    .line 20
    .line 21
    iget-object v1, p0, Lgd/a;->b:Lgd/b;

    .line 22
    .line 23
    invoke-virtual {v1, v0, p1}, Lgd/b;->a(Lfd/a;Lqd/j;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
