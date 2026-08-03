.class public final Lt7;
.super Lku;
.source ""


# static fields
.field public static final c:Lt7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt7;

    sget-object v1, Lv7;->a:Lv7;

    invoke-direct {v0, v1}, Lku;-><init>(LQm;)V

    sput-object v0, Lt7;->c:Lt7;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [C

    array-length p1, p1

    return p1
.end method

.method public final e(LVa;ILjava/lang/Object;)V
    .locals 2

    check-cast p3, Ls7;

    iget-object v0, p0, Lku;->b:Lju;

    invoke-interface {p1, v0, p2}, LVa;->l(Lju;I)C

    move-result p1

    invoke-static {p3}, Liu;->c(Liu;)V

    iget-object p2, p3, Ls7;->a:[C

    iget v0, p3, Ls7;->b:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p3, Ls7;->b:I

    aput-char p1, p2, v0

    return-void
.end method

.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, [C

    new-instance v0, Ls7;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, Ls7;->a:[C

    array-length p1, p1

    iput p1, v0, Ls7;->b:I

    const/16 p1, 0xa

    invoke-virtual {v0, p1}, Ls7;->b(I)V

    return-object v0
.end method

.method public final i()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [C

    return-object v0
.end method
