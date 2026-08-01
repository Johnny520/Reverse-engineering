.class public final synthetic Lzi0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lcj0;

.field public final synthetic η:Ldj0;


# direct methods
.method public synthetic constructor <init>(Lcj0;Ldj0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lzi0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lzi0;->ζ:Lcj0;

    .line 8
    .line 9
    iput-object p2, p0, Lzi0;->η:Ldj0;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ldj0;Lcj0;)V
    .locals 1

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lzi0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzi0;->η:Ldj0;

    iput-object p2, p0, Lzi0;->ζ:Lcj0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lzi0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iget-object v1, p0, Lzi0;->ζ:Lcj0;

    .line 8
    .line 9
    iput-boolean v0, v1, Lcj0;->ε:Z

    .line 10
    .line 11
    iget-object v0, v1, Lcj0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lzi0;->η:Ldj0;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ldj0;->γ(Lcj0;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, Lzi0;->η:Ldj0;

    .line 22
    .line 23
    iget-object p0, p0, Lzi0;->ζ:Lcj0;

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ldj0;->γ(Lcj0;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
