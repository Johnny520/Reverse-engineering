.class public final synthetic Lxk;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lfk;


# direct methods
.method public synthetic constructor <init>(Lfk;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxk;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lxk;->ζ:Lfk;

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
    .locals 4

    .line 1
    iget v0, p0, Lxk;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    sget-object v2, Lgl;->η:Lgl;

    .line 6
    .line 7
    sget-object v3, Lcl;->μ:Lcl;

    .line 8
    .line 9
    iget-object p0, p0, Lxk;->ζ:Lfk;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object v0, Lll;->α:Lll;

    .line 15
    .line 16
    sget-object v0, Lkk;->α:Lkk;

    .line 17
    .line 18
    iget-object p0, p0, Lfk;->γ:Ljava/lang/reflect/Field;

    .line 19
    .line 20
    invoke-static {p1, p0}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0, v3, v2}, Lll;->ο(Ljava/lang/Object;Lcl;Lgl;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0}, Lll;->δ(Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    return-object v1

    .line 32
    :pswitch_0
    sget-object v0, Lll;->α:Lll;

    .line 33
    .line 34
    sget-object v0, Lkk;->α:Lkk;

    .line 35
    .line 36
    iget-object p0, p0, Lfk;->γ:Ljava/lang/reflect/Field;

    .line 37
    .line 38
    invoke-static {p1, p0}, Lkk;->μ(Ljava/lang/Object;Ljava/lang/reflect/Field;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {p0, v3, v2}, Lll;->ο(Ljava/lang/Object;Lcl;Lgl;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Lll;->λ(Ljava/util/List;)V

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
