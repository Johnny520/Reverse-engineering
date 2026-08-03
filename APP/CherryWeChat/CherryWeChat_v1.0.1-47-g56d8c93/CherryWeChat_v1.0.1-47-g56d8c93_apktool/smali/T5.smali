.class public final LT5;
.super Lku;
.source ""


# static fields
.field public static final c:LT5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LT5;

    sget-object v1, LU5;->a:LU5;

    invoke-direct {v0, v1}, Lku;-><init>(LQm;)V

    sput-object v0, LT5;->c:LT5;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [Z

    array-length p1, p1

    return p1
.end method

.method public final e(LVa;ILjava/lang/Object;)V
    .locals 2

    check-cast p3, LR5;

    iget-object v0, p0, Lku;->b:Lju;

    invoke-interface {p1, v0, p2}, LVa;->s(LCx;I)Z

    move-result p1

    invoke-static {p3}, Liu;->c(Liu;)V

    iget-object p2, p3, LR5;->a:[Z

    iget v0, p3, LR5;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p3, LR5;->b:I

    aput-boolean p1, p2, v0

    return-void
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [Z

    new-instance v0, LR5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, LR5;->a:[Z

    array-length p1, p1

    iput p1, v0, LR5;->b:I

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, LR5;->b(I)V

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Z

    return-object v0
.end method
