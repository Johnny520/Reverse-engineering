.class public final synthetic Lbb/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lbb/b;

.field public final synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lbb/b;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p3, p0, Lbb/a;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lbb/a;->h:Lbb/b;

    .line 4
    .line 5
    iput-object p2, p0, Lbb/a;->i:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lbb/a;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lbb/a;->h:Lbb/b;

    .line 7
    .line 8
    iget-object v0, v0, Lbb/b;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lbb/c;

    .line 11
    .line 12
    iget-object v1, p0, Lbb/a;->i:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lbb/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lbb/a;->h:Lbb/b;

    .line 19
    .line 20
    iget-object v1, p0, Lbb/a;->i:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lbb/b;->k(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lbb/a;->h:Lbb/b;

    .line 27
    .line 28
    iget-object v1, p0, Lbb/a;->i:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lbb/b;->k(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
