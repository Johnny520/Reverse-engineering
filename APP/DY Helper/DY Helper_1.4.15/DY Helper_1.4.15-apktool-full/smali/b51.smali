.class public final Lb51;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lfr0;
.implements Lxd;


# instance fields
.field public final ε:Ljr0;

.field public final ζ:Lu60;

.field public η:Lc51;

.field public final synthetic θ:Ld51;


# direct methods
.method public constructor <init>(Ld51;Ljr0;Lu60;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lb51;->θ:Ld51;

    .line 8
    .line 9
    iput-object p2, p0, Lb51;->ε:Ljr0;

    .line 10
    .line 11
    iput-object p3, p0, Lb51;->ζ:Lu60;

    .line 12
    .line 13
    invoke-virtual {p2, p0}, Ljr0;->α(Lgr0;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Lb51;->ε:Ljr0;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljr0;->ζ(Lgr0;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb51;->ζ:Lu60;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, Lu60;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lb51;->η:Lc51;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {v0}, Lc51;->cancel()V

    .line 21
    .line 22
    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    iput-object v0, p0, Lb51;->η:Lc51;

    .line 25
    .line 26
    return-void
.end method

.method public final κ(Lhr0;Lbr0;)V
    .locals 8

    .line 1
    sget-object p1, Lbr0;->ON_START:Lbr0;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lb51;->ζ:Lu60;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, Lb51;->θ:Ld51;

    .line 11
    .line 12
    iget-object p2, v2, Ld51;->β:Lw6;

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Lw6;->addLast(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lc51;

    .line 18
    .line 19
    invoke-direct {p2, v2, p1}, Lc51;-><init>(Ld51;Lu60;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p1, Lu60;->β:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ld51;->γ()V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lw0;

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    const/16 v7, 0x8

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    const-class v3, Ld51;

    .line 37
    .line 38
    const-string v4, "updateEnabledCallbacks"

    .line 39
    .line 40
    const-string v5, "updateEnabledCallbacks()V"

    .line 41
    .line 42
    invoke-direct/range {v0 .. v7}, Lw0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 43
    .line 44
    .line 45
    iput-object v0, p1, Lu60;->γ:Lp80;

    .line 46
    .line 47
    iput-object p2, p0, Lb51;->η:Lc51;

    .line 48
    .line 49
    return-void

    .line 50
    :cond_0
    sget-object p1, Lbr0;->ON_STOP:Lbr0;

    .line 51
    .line 52
    if-ne p2, p1, :cond_1

    .line 53
    .line 54
    iget-object p0, p0, Lb51;->η:Lc51;

    .line 55
    .line 56
    if-eqz p0, :cond_2

    .line 57
    .line 58
    invoke-virtual {p0}, Lc51;->cancel()V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_1
    sget-object p1, Lbr0;->ON_DESTROY:Lbr0;

    .line 63
    .line 64
    if-ne p2, p1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0}, Lb51;->cancel()V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void
.end method
