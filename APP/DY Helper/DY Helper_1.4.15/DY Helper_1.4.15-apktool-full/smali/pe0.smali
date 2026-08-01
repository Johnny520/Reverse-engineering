.class public final synthetic Lpe0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:[Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lpe0;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lpe0;->ζ:[Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lpe0;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lpe0;->ζ:[Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-static {v0, p0}, Lqe0;->γ([Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance v0, Ll91;

    .line 34
    .line 35
    invoke-direct {v0, p1, p0}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const/4 v0, 0x0

    .line 40
    :goto_0
    return-object v0

    .line 41
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    array-length p1, p1

    .line 46
    array-length p0, p0

    .line 47
    if-ne p1, p0, :cond_1

    .line 48
    .line 49
    const/4 p0, 0x1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 p0, 0x0

    .line 52
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
