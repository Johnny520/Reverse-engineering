.class public final synthetic Ld52;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:Ljava/lang/String;

.field public final synthetic ζ:Ljava/lang/String;

.field public final synthetic η:Ljava/lang/String;

.field public final synthetic θ:I

.field public final synthetic ι:Lf52;

.field public final synthetic κ:Landroid/app/Activity;

.field public final synthetic λ:J


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;Landroid/app/Activity;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld52;->ε:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Ld52;->ζ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Ld52;->η:Ljava/lang/String;

    .line 9
    .line 10
    iput p4, p0, Ld52;->θ:I

    .line 11
    .line 12
    iput-object p5, p0, Ld52;->ι:Lf52;

    .line 13
    .line 14
    iput-object p6, p0, Ld52;->κ:Landroid/app/Activity;

    .line 15
    .line 16
    iput-wide p7, p0, Ld52;->λ:J

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 2
    .line 3
    iget-object v0, p0, Ld52;->ε:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Ld52;->ζ:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v2, p0, Ld52;->η:Ljava/lang/String;

    .line 8
    .line 9
    iget v3, p0, Ld52;->θ:I

    .line 10
    .line 11
    iget-object v4, p0, Ld52;->ι:Lf52;

    .line 12
    .line 13
    invoke-static {v0, v1, v2, v3, v4}, Lcom/example/dyhelper/ui/а;->ξ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILf52;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iget-object v2, p0, Ld52;->κ:Landroid/app/Activity;

    .line 18
    .line 19
    invoke-static {v2, v1}, Lcom/example/dyhelper/ui/а;->ι(Landroid/app/Activity;Z)V

    .line 20
    .line 21
    .line 22
    sget-object v1, Lcom/example/dyhelper/ui/а;->ε:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/Runnable;

    .line 29
    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    sget-object v4, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 33
    .line 34
    invoke-virtual {v4, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    new-instance v3, Lxx0;

    .line 38
    .line 39
    const/16 v4, 0xf

    .line 40
    .line 41
    invoke-direct {v3, v0, v2, v4}, Lxx0;-><init>(Ljava/lang/String;Landroid/app/Activity;I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object v0, Lcom/example/dyhelper/ui/а;->α:Landroid/os/Handler;

    .line 48
    .line 49
    iget-wide v1, p0, Ld52;->λ:J

    .line 50
    .line 51
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 52
    .line 53
    .line 54
    sget-object p0, Ls62;->α:Ls62;

    .line 55
    .line 56
    return-object p0
.end method
