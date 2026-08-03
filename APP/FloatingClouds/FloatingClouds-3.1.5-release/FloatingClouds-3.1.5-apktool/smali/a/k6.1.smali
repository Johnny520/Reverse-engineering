.class public final La/k6;
.super La/y;
.source "SourceFile"


# instance fields
.field public final c:La/k6$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, La/Nc;-><init>()V

    new-instance v0, La/k6$a;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, La/k6;->c:La/k6$a;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, La/k6;->c:La/k6$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
