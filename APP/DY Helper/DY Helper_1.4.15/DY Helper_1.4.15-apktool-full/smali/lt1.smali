.class public final synthetic Llt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Lum1;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Lum1;)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Llt1;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llt1;->ζ:Landroid/app/Activity;

    iput-object p2, p0, Llt1;->η:Lum1;

    return-void
.end method

.method public synthetic constructor <init>(Lum1;Landroid/app/Activity;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Llt1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Llt1;->η:Lum1;

    .line 8
    .line 9
    iput-object p2, p0, Llt1;->ζ:Landroid/app/Activity;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Llt1;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget-object v2, p0, Llt1;->η:Lum1;

    .line 6
    .line 7
    iget-object p0, p0, Llt1;->ζ:Landroid/app/Activity;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Landroid/net/Uri;

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/Thread;

    .line 18
    .line 19
    new-instance v3, Ljg1;

    .line 20
    .line 21
    const/4 v4, 0x4

    .line 22
    invoke-direct {v3, p0, p1, v2, v4}, Ljg1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 29
    .line 30
    .line 31
    :goto_0
    return-object v1

    .line 32
    :pswitch_0
    check-cast p1, La80;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iput-object p1, v2, Lum1;->ε:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object p1, Lbv1;->α:Lbv1;

    .line 40
    .line 41
    new-instance p1, Llt1;

    .line 42
    .line 43
    invoke-direct {p1, p0, v2}, Llt1;-><init>(Landroid/app/Activity;Lum1;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p0, p1}, Lbv1;->Η(Landroid/app/Activity;La80;)V

    .line 47
    .line 48
    .line 49
    return-object v1

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
