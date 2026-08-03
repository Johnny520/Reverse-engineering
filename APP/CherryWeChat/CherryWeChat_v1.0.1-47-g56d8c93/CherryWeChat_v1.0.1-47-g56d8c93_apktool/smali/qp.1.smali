.class public final Lqp;
.super Lku;
.source ""


# static fields
.field public static final c:Lqp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqp;

    sget-object v1, Lup;->a:Lup;

    invoke-direct {v0, v1}, Lku;-><init>(LQm;)V

    sput-object v0, Lqp;->c:Lqp;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [J

    array-length p1, p1

    return p1
.end method

.method public final e(LVa;ILjava/lang/Object;)V
    .locals 3

    check-cast p3, Lop;

    iget-object v0, p0, Lku;->b:Lju;

    invoke-interface {p1, v0, p2}, LVa;->A(LCx;I)J

    move-result-wide p1

    invoke-static {p3}, Liu;->c(Liu;)V

    iget-object v0, p3, Lop;->a:[J

    iget v1, p3, Lop;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p3, Lop;->b:I

    aput-wide p1, v0, v1

    return-void
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [J

    new-instance v0, Lop;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Lop;->a:[J

    array-length p1, p1

    iput p1, v0, Lop;->b:I

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Lop;->b(I)V

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [J

    return-object v0
.end method
