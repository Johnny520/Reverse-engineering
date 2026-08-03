.class public final LiC;
.super Lku;
.source ""


# static fields
.field public static final c:LiC;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LiC;

    sget-object v1, LjC;->a:LjC;

    invoke-direct {v0, v1}, Lku;-><init>(LQm;)V

    sput-object v0, LiC;->c:LiC;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LgC;

    iget-object p1, p1, LgC;->a:[I

    array-length p1, p1

    return p1
.end method

.method public final e(LVa;ILjava/lang/Object;)V
    .locals 2

    check-cast p3, LhC;

    iget-object v0, p0, Lku;->b:Lju;

    invoke-interface {p1, v0, p2}, LVa;->b(Lju;I)LJc;

    move-result-object p1

    invoke-interface {p1}, LJc;->p()I

    move-result p1

    invoke-static {p3}, Liu;->c(Liu;)V

    iget-object p2, p3, LhC;->a:[I

    iget v0, p3, LhC;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p3, LhC;->b:I

    aput p1, p2, v0

    return-void
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, LgC;

    iget-object p1, p1, LgC;->a:[I

    new-instance v0, LhC;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, LhC;->a:[I

    array-length p1, p1

    iput p1, v0, LhC;->b:I

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, LhC;->b(I)V

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [I

    new-instance v1, LgC;

    invoke-direct {v1, v0}, LgC;-><init>([I)V

    return-object v1
.end method
