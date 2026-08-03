.class public final Lbo;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LWn;


# instance fields
.field public final synthetic a:LRn;

.field public final synthetic b:LP3;


# direct methods
.method public constructor <init>(LP3;LRn;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbo;->b:LP3;

    iput-object p2, p0, Lbo;->a:LRn;

    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, Lbo;->b:LP3;

    iget-object v0, v0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    iget-object v1, p0, Lbo;->a:LRn;

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final d()V
    .locals 0

    return-void
.end method

.method public final k()V
    .locals 0

    return-void
.end method
