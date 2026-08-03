.class public final La/a0;
.super La/Y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/Y<",
        "Landroid/content/Intent;",
        "La/W;",
        ">;"
    }
.end annotation


# virtual methods
.method public final a(Landroid/content/Context;Landroid/os/Parcelable;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Landroid/content/Intent;

    const-string p1, "input"

    invoke-static {p2, p1}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p2
.end method

.method public final c(Landroid/content/Intent;I)Ljava/lang/Object;
    .locals 1

    new-instance v0, La/W;

    invoke-direct {v0, p1, p2}, La/W;-><init>(Landroid/content/Intent;I)V

    return-object v0
.end method
