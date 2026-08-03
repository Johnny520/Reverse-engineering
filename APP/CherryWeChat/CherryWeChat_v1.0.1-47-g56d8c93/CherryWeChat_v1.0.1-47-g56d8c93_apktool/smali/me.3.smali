.class public final Lme;
.super Lku;
.source ""


# static fields
.field public static final c:Lme;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lme;

    sget-object v1, Lne;->a:Lne;

    invoke-direct {v0, v1}, Lku;-><init>(LQm;)V

    sput-object v0, Lme;->c:Lme;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [D

    array-length p1, p1

    return p1
.end method

.method public final e(LVa;ILjava/lang/Object;)V
    .locals 3

    check-cast p3, Lke;

    iget-object v0, p0, Lku;->b:Lju;

    invoke-interface {p1, v0, p2}, LVa;->k(Lju;I)D

    move-result-wide p1

    invoke-static {p3}, Liu;->c(Liu;)V

    iget-object v0, p3, Lke;->a:[D

    iget v1, p3, Lke;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p3, Lke;->b:I

    aput-wide p1, v0, v1

    return-void
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [D

    new-instance v0, Lke;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lke;->a:[D

    array-length p1, p1

    iput p1, v0, Lke;->b:I

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Lke;->b(I)V

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [D

    return-object v0
.end method
