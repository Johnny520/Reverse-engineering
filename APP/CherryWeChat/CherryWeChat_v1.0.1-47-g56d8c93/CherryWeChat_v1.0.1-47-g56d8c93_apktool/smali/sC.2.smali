.class public final LsC;
.super Lku;
.source ""


# static fields
.field public static final c:LsC;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LsC;

    sget-object v1, LtC;->a:LtC;

    invoke-direct {v0, v1}, Lku;-><init>(LQm;)V

    sput-object v0, LsC;->c:LsC;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LqC;

    iget-object p1, p1, LqC;->a:[S

    array-length p1, p1

    return p1
.end method

.method public final e(LVa;ILjava/lang/Object;)V
    .locals 2

    check-cast p3, LrC;

    iget-object v0, p0, Lku;->b:Lju;

    invoke-interface {p1, v0, p2}, LVa;->b(Lju;I)LJc;

    move-result-object p1

    invoke-interface {p1}, LJc;->x()S

    move-result p1

    invoke-static {p3}, Liu;->c(Liu;)V

    iget-object p2, p3, LrC;->a:[S

    iget v0, p3, LrC;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p3, LrC;->b:I

    aput-short p1, p2, v0

    return-void
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, LqC;

    iget-object p1, p1, LqC;->a:[S

    new-instance v0, LrC;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, LrC;->a:[S

    array-length p1, p1

    iput p1, v0, LrC;->b:I

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, LrC;->b(I)V

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [S

    new-instance v1, LqC;

    invoke-direct {v1, v0}, LqC;-><init>([S)V

    return-object v1
.end method
