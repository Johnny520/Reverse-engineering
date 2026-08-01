.class public Lp11;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final κ:Ljava/lang/Object;


# instance fields
.field public final α:Ljava/lang/Object;

.field public final β:Lup1;

.field public γ:I

.field public δ:Z

.field public volatile ε:Ljava/lang/Object;

.field public volatile ζ:Ljava/lang/Object;

.field public η:I

.field public θ:Z

.field public ι:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lp11;->κ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lp11;->α:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Lup1;

    .line 12
    .line 13
    invoke-direct {v0}, Lup1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lp11;->β:Lup1;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lp11;->γ:I

    .line 20
    .line 21
    sget-object v0, Lp11;->κ:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object v0, p0, Lp11;->ζ:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v0, p0, Lp11;->ε:Ljava/lang/Object;

    .line 26
    .line 27
    const/4 v0, -0x1

    .line 28
    iput v0, p0, Lp11;->η:I

    .line 29
    .line 30
    return-void
.end method

.method public static α(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Lq6;->π()Lq6;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Lq6;->α:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lq6;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string v0, "Cannot invoke "

    .line 28
    .line 29
    const-string v1, " on a background thread"

    .line 30
    .line 31
    invoke-static {v0, p0, v1}, Llz1;->Δ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final β(Lju0;)V
    .locals 2

    .line 1
    iget-boolean v0, p1, Lju0;->β:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget v0, p1, Lju0;->γ:I

    .line 7
    .line 8
    iget v1, p0, Lp11;->η:I

    .line 9
    .line 10
    if-lt v0, v1, :cond_1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_1
    iput v1, p1, Lju0;->γ:I

    .line 14
    .line 15
    iget-object p1, p1, Lju0;->α:Ln;

    .line 16
    .line 17
    iget-object p0, p0, Lp11;->ε:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    check-cast p0, Lhr0;

    .line 23
    .line 24
    iget-object p1, p1, Ln;->ζ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lws;

    .line 27
    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    iget-boolean p0, p1, Lws;->д:Z

    .line 31
    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 39
    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    const-string v1, "Fragment "

    .line 43
    .line 44
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p1, " did not return a View from onCreateView() or this was called before onCreateView()."

    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0

    .line 63
    :cond_3
    :goto_0
    return-void
.end method

.method public final γ(Lju0;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lp11;->θ:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Lp11;->ι:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-boolean v1, p0, Lp11;->θ:Z

    .line 10
    .line 11
    :cond_1
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lp11;->ι:Z

    .line 13
    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lp11;->β(Lju0;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-object v1, p0, Lp11;->β:Lup1;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v2, Lsp1;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Lsp1;-><init>(Lup1;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v1, Lup1;->η:Ljava/util/WeakHashMap;

    .line 32
    .line 33
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    :cond_3
    invoke-virtual {v2}, Lsp1;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    invoke-virtual {v2}, Lsp1;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/util/Map$Entry;

    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Lju0;

    .line 55
    .line 56
    invoke-virtual {p0, v1}, Lp11;->β(Lju0;)V

    .line 57
    .line 58
    .line 59
    iget-boolean v1, p0, Lp11;->ι:Z

    .line 60
    .line 61
    if-eqz v1, :cond_3

    .line 62
    .line 63
    :cond_4
    :goto_0
    iget-boolean v1, p0, Lp11;->ι:Z

    .line 64
    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    iput-boolean v0, p0, Lp11;->θ:Z

    .line 68
    .line 69
    return-void
.end method
