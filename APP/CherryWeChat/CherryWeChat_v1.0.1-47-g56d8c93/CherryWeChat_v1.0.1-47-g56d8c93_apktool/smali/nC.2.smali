.class public final LnC;
.super Lku;
.source ""


# static fields
.field public static final c:LnC;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LnC;

    sget-object v1, LoC;->a:LoC;

    invoke-direct {v0, v1}, Lku;-><init>(LQm;)V

    sput-object v0, LnC;->c:LnC;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, LlC;

    iget-object p1, p1, LlC;->a:[J

    array-length p1, p1

    return p1
.end method

.method public final e(LVa;ILjava/lang/Object;)V
    .locals 3

    check-cast p3, LmC;

    iget-object v0, p0, Lku;->b:Lju;

    invoke-interface {p1, v0, p2}, LVa;->b(Lju;I)LJc;

    move-result-object p1

    invoke-interface {p1}, LJc;->a()J

    move-result-wide p1

    invoke-static {p3}, Liu;->c(Liu;)V

    iget-object v0, p3, LmC;->a:[J

    iget v1, p3, LmC;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p3, LmC;->b:I

    aput-wide p1, v0, v1

    return-void
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, LlC;

    iget-object p1, p1, LlC;->a:[J

    new-instance v0, LmC;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, LmC;->a:[J

    array-length p1, p1

    iput p1, v0, LmC;->b:I

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, LmC;->b(I)V

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [J

    new-instance v1, LlC;

    invoke-direct {v1, v0}, LlC;-><init>([J)V

    return-object v1
.end method
