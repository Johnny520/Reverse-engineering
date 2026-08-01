.class public final synthetic Lv2;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lg80;


# instance fields
.field public final synthetic ε:Lw2;


# direct methods
.method public synthetic constructor <init>(Lw2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv2;->ε:Lw2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ε(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lbr;

    .line 2
    .line 3
    check-cast p2, Ld60;

    .line 4
    .line 5
    check-cast p3, Lb60;

    .line 6
    .line 7
    check-cast p4, Lc60;

    .line 8
    .line 9
    iget-object p0, p0, Lv2;->ε:Lw2;

    .line 10
    .line 11
    iget-object v0, p0, Lw2;->ε:Lf50;

    .line 12
    .line 13
    iget p3, p3, Lb60;->α:I

    .line 14
    .line 15
    iget p4, p4, Lc60;->α:I

    .line 16
    .line 17
    check-cast v0, Lg50;

    .line 18
    .line 19
    invoke-virtual {v0, p1, p2, p3, p4}, Lg50;->β(Lbr;Ld60;II)Ln62;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    instance-of p2, p1, Ln62;

    .line 24
    .line 25
    if-nez p2, :cond_0

    .line 26
    .line 27
    new-instance p2, Lm6;

    .line 28
    .line 29
    iget-object p3, p0, Lw2;->κ:Lm6;

    .line 30
    .line 31
    invoke-direct {p2, p1, p3}, Lm6;-><init>(Ln62;Lm6;)V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Lw2;->κ:Lm6;

    .line 35
    .line 36
    iget-object p0, p2, Lm6;->θ:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    check-cast p0, Landroid/graphics/Typeface;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    iget-object p0, p1, Ln62;->ε:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    check-cast p0, Landroid/graphics/Typeface;

    .line 50
    .line 51
    return-object p0
.end method
