.class public final Lf/y;
.super Le/p;
.source "SourceFile"


# static fields
.field public static final a:Lf/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf/y;

    invoke-direct {v0}, Lf/y;-><init>()V

    sput-object v0, Lf/y;->a:Lf/y;

    return-void
.end method


# virtual methods
.method public final d()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final g(Le/j;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Le/j;->m()Lj/o;

    move-result-object v1

    invoke-static {v1}, Le/p;->o(Lj/o;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Le/j;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final h(Le/j;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p1}, Le/j;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final i(Le/j;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final u(Ln/d;Le/j;)V
    .locals 0

    invoke-static {p2}, Lc/d;->a(Ljava/lang/Object;)V

    const/4 p1, 0x0

    throw p1
.end method
