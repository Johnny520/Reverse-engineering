.class public final synthetic Lnt1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:Z

.field public final synthetic ζ:Landroid/content/Context;

.field public final synthetic η:Lys1;


# direct methods
.method public synthetic constructor <init>(ZLandroid/content/Context;Lys1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lnt1;->ε:Z

    .line 5
    .line 6
    iput-object p2, p0, Lnt1;->ζ:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lnt1;->η:Lys1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    check-cast p2, Landroid/widget/Switch;

    .line 8
    .line 9
    sget-object v0, Lbv1;->α:Lbv1;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lnt1;->η:Lys1;

    .line 15
    .line 16
    iget-object v1, v0, Lys1;->α:Ljava/lang/String;

    .line 17
    .line 18
    iget-boolean v2, p0, Lnt1;->ε:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    iget-boolean v0, v0, Lys1;->δ:Z

    .line 23
    .line 24
    iget-object p0, p0, Lnt1;->ζ:Landroid/content/Context;

    .line 25
    .line 26
    invoke-static {p0, v1, p1, p2, v0}, Lbv1;->Θ(Landroid/content/Context;Ljava/lang/String;ZLandroid/widget/Switch;Z)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v1, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 34
    .line 35
    return-object p0
.end method
