.class public final LGc;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Z

.field public b:Z

.field public c:Z


# virtual methods
.method public final a()Z
    .locals 1

    iget-boolean v0, p0, LGc;->c:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, LGc;->b:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-boolean v0, p0, LGc;->a:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
