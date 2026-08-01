.class public final Lu80;
.super Ljava/lang/Object;

# interfaces
.implements Lfe;
.implements Lge;


# static fields
.field public static final a:Lu80;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu80;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu80;->a:Lu80;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Lge;)Lfe;
    .locals 1

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {v0, p1}, Lmp;->g(Ljava/lang/String;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, p1}, Lmp;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return-object p1
.end method

.method public final g(Lge;)Lhe;
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
    .locals 0

    .line 1
    return-object p0
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
