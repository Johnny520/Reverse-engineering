.class public abstract Lh;
.super Ljava/lang/Object;

# interfaces
.implements Lfe;


# instance fields
.field public final a:Lge;


# direct methods
.method public constructor <init>(Lge;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh;->a:Lge;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(Lge;)Lfe;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lh;->getKey()Lge;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0, p1}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return-object p1
.end method

.method public g(Lge;)Lhe;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg80;->z(Lfe;Lge;)Lhe;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getKey()Lge;
    .locals 1

    .line 1
    iget-object v0, p0, Lh;->a:Lge;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h(Ljava/lang/Object;Lym;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p2, p1, p0}, Lym;->e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final i(Lhe;)Lhe;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg80;->C(Lfe;Lhe;)Lhe;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
