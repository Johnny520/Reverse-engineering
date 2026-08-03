.class public final La/k7$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/k7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# virtual methods
.method public final a(Ljava/lang/Class;)La/Dg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "La/Dg;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    new-instance p1, La/k7;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, La/k7;-><init>(Z)V

    return-object p1
.end method
