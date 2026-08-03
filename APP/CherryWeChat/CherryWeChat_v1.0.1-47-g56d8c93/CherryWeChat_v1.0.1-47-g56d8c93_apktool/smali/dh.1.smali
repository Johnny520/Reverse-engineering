.class public final Ldh;
.super LC;
.source ""


# instance fields
.field public final c:LE1;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LE1;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, LE1;-><init>(I)V

    iput-object v0, p0, Ldh;->c:LE1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Random;
    .locals 1

    iget-object v0, p0, Ldh;->c:LE1;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
