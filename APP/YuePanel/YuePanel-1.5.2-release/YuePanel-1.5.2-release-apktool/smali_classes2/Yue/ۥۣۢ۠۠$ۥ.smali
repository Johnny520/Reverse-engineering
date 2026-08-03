.class public LYue/ۥۣۢ۠۠$ۥ;
.super LYue/ۥۣۢ۠۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢ۠۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "LYue/\u06e5\u06e1\u06e2\u06e3\u06e6<",
            "LYue/\u06e5\u06e0\u06e0\u06e5\u06e5;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LYue/ۥۣۢ۠۟;

    invoke-direct {v0}, LYue/ۥۣۢ۠۟;-><init>()V

    invoke-static {v0}, Ljava/lang/ThreadLocal;->withInitial(Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;

    move-result-object v0

    sput-object v0, LYue/ۥۣۢ۠۠$ۥ;->ۥ۟۟:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۠ۡ۠ۤ;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥۣۢ۠۠;-><init>(LYue/ۥ۠ۡ۠ۤ;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۢ()LYue/ۥۣۡۢۦ;
    .locals 1

    invoke-static {}, LYue/ۥۣۢ۠۠$ۥ;->ۥۣ۟۟۟()LYue/ۥۣۡۢۦ;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic ۥۣ۟۟۟()LYue/ۥۣۡۢۦ;
    .locals 3

    new-instance v0, LYue/ۥۣۡۢۦ;

    new-instance v1, LYue/ۥ۠۠ۥۥ;

    const-string v2, "html"

    invoke-direct {v1, v2}, LYue/ۥ۠۠ۥۥ;-><init>(Ljava/lang/String;)V

    const-class v2, LYue/ۥ۠۠ۥۥ;

    invoke-direct {v0, v1, v2}, LYue/ۥۣۡۢۦ;-><init>(LYue/ۥۣۡۢۤ;Ljava/lang/Class;)V

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, LYue/ۥۣۢ۠۠;->ۥ:LYue/ۥ۠ۡ۠ۤ;

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, ":has(%s)"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣۢ۠۠;->ۥ:LYue/ۥ۠ۡ۠ۤ;

    invoke-virtual {v0}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟۟()I

    move-result v0

    mul-int/lit8 v0, v0, 0xa

    return v0
.end method

.method public ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z
    .locals 2

    sget-object p1, LYue/ۥۣۢ۠۠$ۥ;->ۥ۟۟:Ljava/lang/ThreadLocal;

    invoke-virtual {p1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥۣۡۢۦ;

    invoke-virtual {p1, p2}, LYue/ۥۣۡۢۦ;->ۥ۟۟۟ۡ(LYue/ۥۣۡۢۤ;)V

    :cond_0
    :goto_0
    invoke-virtual {p1}, LYue/ۥۣۡۢۦ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, LYue/ۥۣۡۢۦ;->ۥ۟۟۟()LYue/ۥۣۡۢۤ;

    move-result-object v0

    check-cast v0, LYue/ۥ۠۠ۥۥ;

    if-ne v0, p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, LYue/ۥۣۢ۠۠;->ۥ:LYue/ۥ۠ۡ۠ۤ;

    invoke-virtual {v1, p2, v0}, LYue/ۥ۠ۡ۠ۤ;->ۥ۟۟۟۟(LYue/ۥ۠۠ۥۥ;LYue/ۥ۠۠ۥۥ;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
