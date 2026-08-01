.class public final Log;
.super Lm01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:Ljava/lang/Integer;

.field public final synthetic β:Ltg;

.field public final synthetic γ:Ljava/lang/String;

.field public final synthetic δ:Ljava/lang/String;

.field public final synthetic ε:Z


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ltg;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Log;->α:Ljava/lang/Integer;

    .line 2
    .line 3
    iput-object p2, p0, Log;->β:Ltg;

    .line 4
    .line 5
    iput-object p3, p0, Log;->γ:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Log;->δ:Ljava/lang/String;

    .line 8
    .line 9
    iput-boolean p5, p0, Log;->ε:Z

    .line 10
    .line 11
    invoke-direct {p0}, Lm01;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lk01;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p1, Lk01;->β:Ljava/lang/Object;

    .line 5
    .line 6
    instance-of v0, p1, Landroid/view/View;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p1, Landroid/view/View;

    .line 11
    .line 12
    :goto_0
    move-object v1, p1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    goto :goto_0

    .line 16
    :goto_1
    if-nez v1, :cond_1

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_1
    iget-object p1, p0, Log;->α:Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object p1, p0, Log;->γ:Ljava/lang/String;

    .line 26
    .line 27
    const-string v0, " recovery"

    .line 28
    .line 29
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p0, Log;->δ:Ljava/lang/String;

    .line 34
    .line 35
    const/16 v5, 0x10

    .line 36
    .line 37
    iget-object v0, p0, Log;->β:Ltg;

    .line 38
    .line 39
    invoke-static/range {v0 .. v5}, Ltg;->г(Ltg;Landroid/view/View;ILjava/lang/String;Ljava/lang/String;I)V

    .line 40
    .line 41
    .line 42
    iget-boolean p0, p0, Log;->ε:Z

    .line 43
    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ltg;->о(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_2
    return-void
.end method
